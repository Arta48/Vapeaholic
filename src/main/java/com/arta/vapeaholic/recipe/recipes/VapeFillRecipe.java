package com.arta.vapeaholic.recipe.recipes;

import com.arta.vapeaholic.Vapeaholic;
import com.arta.vapeaholic.item.items.VapeItem;
import com.arta.vapeaholic.recipe.ModRecipes;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.CraftingInput;
import net.minecraft.world.item.crafting.CustomRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.Level;

public class VapeFillRecipe extends CustomRecipe {
    public static final String[] COLORS = {
        "white", "orange", "magenta", "light_blue", "yellow", "lime",
        "pink", "light_gray", "gray", "cyan", "purple", "blue",
        "brown", "green", "red", "black"
    };

    public VapeFillRecipe() {
        super();
    }

    public static String extractColor(String path) {
        if (!path.endsWith("_vape")) {
            return null;
        }
        String withoutSuffix = path.substring(0, path.length() - "_vape".length());

        for (String c : COLORS) {
            if (withoutSuffix.equals(c) || withoutSuffix.endsWith("_" + c)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public boolean matches(CraftingInput input, Level level) {
        ItemStack vape = ItemStack.EMPTY;
        ItemStack pod = ItemStack.EMPTY;

        for (int i = 0; i < input.size(); i++) {
            ItemStack stack = input.getItem(i);
            if (stack.isEmpty()) {
                continue;
            }

            String path = BuiltInRegistries.ITEM.getKey(stack.getItem()).getPath();
            if (stack.getItem() instanceof VapeItem && extractColor(path) != null) {
                if (!vape.isEmpty()) {
                    return false;
                }
                vape = stack;
            } else if (path.endsWith("_vape_pod") && !path.equals("vape_pod")) {
                if (!pod.isEmpty()) {
                    return false;
                }
                pod = stack;
            } else {
                return false;
            }
        }
        return !vape.isEmpty() && !pod.isEmpty();
    }

    @Override
    public ItemStack assemble(CraftingInput input) {
        ItemStack vape = ItemStack.EMPTY;
        ItemStack pod = ItemStack.EMPTY;

        for (int i = 0; i < input.size(); i++) {
            ItemStack stack = input.getItem(i);
            if (stack.isEmpty()) continue;

            String path = BuiltInRegistries.ITEM.getKey(stack.getItem()).getPath();
            if (stack.getItem() instanceof VapeItem) {
                vape = stack;
            } else if (path.endsWith("_vape_pod")) {
                pod = stack;
            }
        }

        if (vape.isEmpty() || pod.isEmpty()) return ItemStack.EMPTY;

        String vapePath = BuiltInRegistries.ITEM.getKey(vape.getItem()).getPath();
        String color = extractColor(vapePath);

        String podPath = BuiltInRegistries.ITEM.getKey(pod.getItem()).getPath();
        String effect = podPath.substring(0, podPath.length() - "_vape_pod".length());

        if (effect.equals("mundane") || effect.equals("thick") || effect.equals("awkward")) {
            effect = "water";
        }

        Item result = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath(Vapeaholic.MOD_ID, effect + "_" + color + "_vape"));
        if (result == null) return ItemStack.EMPTY;

        ItemStack resultStack = vape.transmuteCopy(result, 1);
        resultStack.setDamageValue(0);

        return resultStack;
    }

    @Override
    public RecipeSerializer<VapeFillRecipe> getSerializer() {
        return ModRecipes.VAPE_FILL;
    }
}
