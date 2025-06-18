package com.arta.vapeaholic.item.items.vapecomponents;

import com.arta.vapeaholic.Vapeaholic;
import com.arta.vapeaholic.item.ModItemGroups;
import net.minecraft.item.Item;

public class Coil extends Item {

	public Coil(String name) {
		super();

		this.setRegistryName(name);
		this.setTranslationKey(Vapeaholic.MOD_ID + "." + name);
		this.setCreativeTab(ModItemGroups.VAPE_COMPONENTS_TAB);
	}
}

