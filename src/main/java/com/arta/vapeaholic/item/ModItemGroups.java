package com.arta.vapeaholic.item;

import com.arta.vapeaholic.Vapeaholic;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItemGroups {
    public static final CreativeTabs VAPEAHOLIC_TAB = new CreativeTabs(Vapeaholic.MOD_ID + ".vapes_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.RED_VAPE);
        }

        @Override
        @SideOnly(Side.CLIENT)
        public void displayAllRelevantItems(NonNullList<ItemStack> list) {
            for (Item item : ModItems.ITEMS) {
                item.getSubItems(this, list);
            }
        }
    };

    public static void registerModItemGroups() {
        Vapeaholic.LOGGER.info("Registering Mod Items Groups for " + Vapeaholic.MOD_ID);
    }
}
