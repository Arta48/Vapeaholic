package com.arta.vapeaholic.item.itemgroups;

import com.arta.vapeaholic.Vapeaholic;
import com.arta.vapeaholic.item.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class Vapes extends CreativeTabs {
    public Vapes(String name) {
        super(Vapeaholic.MOD_ID + "." + name);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ModItems.RED_VAPE);
    }
}
