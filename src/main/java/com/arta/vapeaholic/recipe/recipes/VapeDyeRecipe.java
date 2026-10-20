package com.arta.vapeaholic.recipe.recipes;

import com.arta.vapeaholic.Vapeaholic;
import com.arta.vapeaholic.item.items.VapeItem;
import net.minecraft.init.Items;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistryEntry;

public class VapeDyeRecipe extends IForgeRegistryEntry.Impl<IRecipe> implements IRecipe {

    private static final String[] DYE_COLORS = {
        "black", "red", "green", "brown", "blue", "purple", "cyan", "light_gray",
        "gray", "pink", "lime", "yellow", "light_blue", "magenta", "orange", "white"
    };

    @Override
    public boolean matches(InventoryCrafting inv, World worldIn) {
        ItemStack vape = ItemStack.EMPTY;
        ItemStack dye = ItemStack.EMPTY;

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

            if (stack.getItem() instanceof VapeItem && color != null && path.equals(color + "_vape")) {
                if (!vape.isEmpty()) {
                    return false;
                }
                vape = stack;
            } else if (stack.getItem() == Items.DYE) {
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
    public ItemStack getCraftingResult(InventoryCrafting inv) {
        ItemStack vape = ItemStack.EMPTY;
        String dyeColor = null;

        for (int i = 0; i < inv.getSizeInventory(); i++) {
            ItemStack stack = inv.getStackInSlot(i);
            if (stack.isEmpty()) {
                continue;
            }

            if (stack.getItem() instanceof VapeItem) {
                vape = stack;
            } else if (stack.getItem() == Items.DYE) {
                int meta = stack.getItemDamage();
                if (meta >= 0 && meta < DYE_COLORS.length) {
                    dyeColor = DYE_COLORS[meta];
                }
            }
        }

        if (vape.isEmpty() || dyeColor == null) {
            return ItemStack.EMPTY;
        }

        Item result = ForgeRegistries.ITEMS.getValue(new ResourceLocation(Vapeaholic.MOD_ID, dyeColor + "_vape"));
        if (result == null) {
            return ItemStack.EMPTY;
        }

        ItemStack resultStack = new ItemStack(result, 1);
        if (vape.hasTagCompound()) {
            resultStack.setTagCompound(vape.getTagCompound().copy());
        }
        resultStack.setItemDamage(vape.getItemDamage());

        return resultStack;
    }

    @Override
    public boolean canFit(int width, int height) {
        return width * height >= 2;
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
