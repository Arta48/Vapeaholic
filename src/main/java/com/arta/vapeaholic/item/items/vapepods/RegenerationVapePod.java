package com.arta.vapeaholic.item.items.vapepods;

import com.arta.vapeaholic.Vapeaholic;
import com.arta.vapeaholic.item.ModItemGroups;
import net.minecraft.item.Item;

public class RegenerationVapePod extends Item {

    public RegenerationVapePod(String name) {
        super();

        this.setRegistryName(name);
        this.setTranslationKey(Vapeaholic.MOD_ID + "." + name);
        this.setCreativeTab(ModItemGroups.VAPE_PODS_TAB);
    }
}
