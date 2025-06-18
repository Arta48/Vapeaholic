package com.arta.vapeaholic.item;

import com.arta.vapeaholic.Vapeaholic;
import com.arta.vapeaholic.item.itemgroups.*;
import net.minecraft.creativetab.CreativeTabs;

public class ModItemGroups {
	public static final CreativeTabs VAPES_TAB = new Vapes("vapes_tab");
	public static final CreativeTabs VAPE_PODS_TAB = new VapePods("vape_pods_tab");
	public static final CreativeTabs VAPE_COMPONENTS_TAB = new VapeComponents("vape_components_tab");


	public static void registerModItemGroups() {
		Vapeaholic.LOGGER.info("Registering Mod Items Groups for " + Vapeaholic.MOD_ID);
	}
}
