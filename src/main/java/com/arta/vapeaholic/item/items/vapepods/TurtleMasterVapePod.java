package com.arta.vapeaholic.item.items.vapepods;

import com.arta.vapeaholic.Vapeaholic;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class TurtleMasterVapePod extends Item {

    public TurtleMasterVapePod() {
        super(new Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Vapeaholic.MOD_ID,"turtle_master_vape_pod"))));
    }
}
