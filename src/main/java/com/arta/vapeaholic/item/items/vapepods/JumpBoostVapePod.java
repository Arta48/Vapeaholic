package com.arta.vapeaholic.item.items.vapepods;

import com.arta.vapeaholic.Vapeaholic;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class JumpBoostVapePod extends Item {

    public JumpBoostVapePod() {
        super(new Properties()
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Vapeaholic.MOD_ID, "jump_boost_vape_pod")))
        );
    }
}
