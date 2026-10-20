package com.arta.vapeaholic.recipe.recipes;

import com.arta.vapeaholic.Vapeaholic;
import com.arta.vapeaholic.item.items.VapeItem;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistryEntry;

public class VapeFillRecipe extends IForgeRegistryEntry.Impl<IRecipe> implements IRecipe {
    public static final String[] COLORS = {
        "white", "orange", "magenta", "light_blue", "yellow", "lime",
        "pink", "light_gray", "gray", "cyan", "purple", "blue",
        "brown", "green", "red", "black"
    };

    public static String extractColor(String path) {
        if (!path.endsWith("_vape")) {
            return null;
        }
        String prefix = path.substring(0, path.length() - "_vape".length());
        for (String c : COLORS) {
            if (prefix.equals(c) || prefix.endsWith("_" + c)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public boolean matches(InventoryCrafting inv, World worldIn) {
        ItemStack vape = ItemStack.EMPTY;
        ItemStack pod = ItemStack.EMPTY;

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
    public ItemStack getCraftingResult(InventoryCrafting inv) {
        ItemStack vape = ItemStack.EMPTY;
        ItemStack pod = ItemStack.EMPTY;

        for (int i = 0; i < inv.getSizeInventory(); i++) {
            ItemStack stack = inv.getStackInSlot(i);
            if (stack.isEmpty()) {
                continue;
            }

            ResourceLocation loc = stack.getItem().getRegistryName();
            if (loc == null) {
                continue;
            }
            String path = loc.getPath();

            if (stack.getItem() instanceof VapeItem) {
                vape = stack;
            } else if (path.endsWith("_vape_pod")) {
                pod = stack;
            }
        }

        if (vape.isEmpty() || pod.isEmpty()) {
            return ItemStack.EMPTY;
        }

        String vapePath = vape.getItem().getRegistryName().getPath();
        String color = extractColor(vapePath);

        String podPath = pod.getItem().getRegistryName().getPath();
        String effect = podPath.substring(0, podPath.length() - "_vape_pod".length());

        if (effect.equals("mundane") || effect.equals("thick") || effect.equals("awkward")) {
            effect = "water";
        }

        Item result = ForgeRegistries.ITEMS.getValue(new ResourceLocation(Vapeaholic.MOD_ID, effect + "_" + color + "_vape"));
        if (result == null) {
            return ItemStack.EMPTY;
        }

        ItemStack resultStack = new ItemStack(result, 1);
        if (vape.hasTagCompound()) {
            resultStack.setTagCompound(vape.getTagCompound().copy());
        }
        resultStack.setItemDamage(0);

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
