package com.arta.vapeaholic.item.items.vapepods;

import com.arta.vapeaholic.Vapeaholic;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class InstantHealthVapePod extends Item {

    public InstantHealthVapePod() {
        super(new Properties()
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Vapeaholic.MOD_ID, "instant_health_vape_pod")))
        );
    }
}
