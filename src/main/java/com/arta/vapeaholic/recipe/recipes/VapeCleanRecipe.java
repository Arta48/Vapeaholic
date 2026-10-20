package com.arta.vapeaholic.recipe.recipes;

import com.arta.vapeaholic.Vapeaholic;
import com.arta.vapeaholic.item.items.VapeItem;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistryEntry;

public class VapeCleanRecipe extends IForgeRegistryEntry.Impl<IRecipe> implements IRecipe {

    @Override
    public boolean matches(InventoryCrafting inv, World worldIn) {
        ItemStack vape = ItemStack.EMPTY;
        for (int i = 0; i < inv.getSizeInventory(); i++) {
            ItemStack stack = inv.getStackInSlot(i);
            if (stack.isEmpty()) {
                continue;
            }

            ResourceLocation loc = stack.getItem().getRegistryName();
            if (loc == null) {
                return false;
            }
            String path = loc.getPath();
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
    public ItemStack getCraftingResult(InventoryCrafting inv) {
        for (int i = 0; i < inv.getSizeInventory(); i++) {
            ItemStack stack = inv.getStackInSlot(i);
            if (stack.isEmpty()) {
                continue;
            }

            String path = stack.getItem().getRegistryName().getPath();
            String color = VapeFillRecipe.extractColor(path);
            if (color != null) {
                Item emptyVape = ForgeRegistries.ITEMS.getValue(new ResourceLocation(Vapeaholic.MOD_ID, color + "_vape"));
                if (emptyVape != null) {
                    ItemStack result = new ItemStack(emptyVape, 1);
                    if (stack.hasTagCompound()) {
                        result.setTagCompound(stack.getTagCompound().copy());
                    }
                    result.setItemDamage(0);
                    return result;
                }
            }
        }
        return ItemStack.EMPTY;
    }

    @Override
    public boolean canFit(int width, int height) {
        return width * height >= 1;
    }

    @Override
    public ItemStack getRecipeOutput() {
        return ItemStack.EMPTY;
    }

    @Override
    public boolean isDynamic() {
        return true;
    }
}
