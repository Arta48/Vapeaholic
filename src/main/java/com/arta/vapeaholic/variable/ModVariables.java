package com.arta.vapeaholic.variable;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.Rarity;

public class ModVariables {
    public static final int EFFECT_STRENGTH = 1;
    public static final int EFFECT_DURATION = 8 * 20;
    public static final double PUFF_AMOUNT = 15;

    public static final float PARTICLE_QUAD_SIZE = 0.25f;
    public static final float PARTICLE_SIZE = 0.2f;
    public static final int PARTICLE_LIFETIME = 60;
    public static final float PARTICLE_GRAVITY = -0.03f;
    public static final boolean HAS_PHYSICS = true;
    public static final float PARTICLE_SPEED = 2.0f;
    public static final double PARTICLE_ROTATION_SPEED = 0.1;
    public static final double PARTICLE_ROTATION_SPREAD = 0.02;

    public static final int VAPE_DURABILITY = 20;
    public static final int VAPE_COOLDOWN = 40;
    public static final int VAPE_MAX_COUNT = 1;
    public static final Rarity VAPE_RARITY = Rarity.COMMON;

    public static Properties createVapeSettings() {
        return new Item.Properties()
            .durability(VAPE_DURABILITY)
            .rarity(VAPE_RARITY)
            .stacksTo(VAPE_MAX_COUNT);
    }
}
