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

public class VapeDyeRecipe extends CustomRecipe {
    public VapeDyeRecipe() {
        super();
    }

    @Override
    public boolean matches(CraftingInput input, Level level) {
        ItemStack vape = ItemStack.EMPTY;
        ItemStack dye = ItemStack.EMPTY;

        for (int i = 0; i < input.size(); i++) {
            ItemStack stack = input.getItem(i);
            if (stack.isEmpty()) {
                continue;
            }

            String path = BuiltInRegistries.ITEM.getKey(stack.getItem()).getPath();
            String color = VapeFillRecipe.extractColor(path);

            if (stack.getItem() instanceof VapeItem && color != null && path.equals(color + "_vape")) {
                if (!vape.isEmpty()) {
                    return false;
                }
                vape = stack;
            } else if (path.endsWith("_dye")) {
                if (!dye.isEmpty()) {
                    return false;
                }
                dye = stack;
            } else {
                return false;
            }
        }
        return !vape.isEmpty() && !dye.isEmpty();
    }

    @Override
    public ItemStack assemble(CraftingInput input) {
        ItemStack vape = ItemStack.EMPTY;
        String dyeColor = null;

        for (int i = 0; i < input.size(); i++) {
            ItemStack stack = input.getItem(i);
            if (stack.isEmpty()) continue;

            String path = BuiltInRegistries.ITEM.getKey(stack.getItem()).getPath();
            if (stack.getItem() instanceof VapeItem) {
                vape = stack;
            } else if (path.endsWith("_dye")) {
                dyeColor = path.substring(0, path.length() - "_dye".length());
            }
        }

        if (vape.isEmpty() || dyeColor == null) return ItemStack.EMPTY;

        Item resultItem = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath(Vapeaholic.MOD_ID, dyeColor + "_vape"));
        if (resultItem == null) return ItemStack.EMPTY;

        return vape.transmuteCopy(resultItem, 1);
    }

    @Override
    public RecipeSerializer<VapeDyeRecipe> getSerializer() {
        return ModRecipes.VAPE_DYE;
    }
}
