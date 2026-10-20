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

public class VapeCleanRecipe extends CustomRecipe {
    public VapeCleanRecipe() {
        super();
    }

    @Override
    public boolean matches(CraftingInput input, Level level) {
        ItemStack vape = ItemStack.EMPTY;
        for (int i = 0; i < input.size(); i++) {
            ItemStack stack = input.getItem(i);
            if (stack.isEmpty()) {
                continue;
            }

            String path = BuiltInRegistries.ITEM.getKey(stack.getItem()).getPath();
            String color = VapeFillRecipe.extractColor(path);

            if (stack.getItem() instanceof VapeItem && color != null && !path.equals(color + "_vape")) {
                if (!vape.isEmpty()) {
                    return false;
                }
                vape = stack;
            } else {
                return false;
            }
        }
        return !vape.isEmpty();
    }

    @Override
    public ItemStack assemble(CraftingInput input) {
        for (int i = 0; i < input.size(); i++) {
            ItemStack stack = input.getItem(i);
            if (stack.isEmpty()) continue;

            String path = BuiltInRegistries.ITEM.getKey(stack.getItem()).getPath();
            String color = VapeFillRecipe.extractColor(path);
            if (color != null) {
                Item emptyVape = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath(Vapeaholic.MOD_ID, color + "_vape"));
                if (emptyVape != null) {
                    ItemStack result = stack.transmuteCopy(emptyVape, 1);
                    result.setDamageValue(0);
                    return result;
                }
            }
        }
        return ItemStack.EMPTY;
    }

    @Override
    public RecipeSerializer<VapeCleanRecipe> getSerializer() {
        return ModRecipes.VAPE_CLEAN;
    }
}
