package com.arta.vapeaholic.variable;

import com.arta.vapeaholic.Vapeaholic;
import net.minecraft.item.EnumRarity;

public class ModVariables {
    public static final int EFFECT_STRENGTH = 1;
    public static final int EFFECT_DURATION = 8 * 20;
    public static final double PUFF_AMOUNT = 15;

    public static final float PARTICLE_SCALE = 2.0f;
    public static final float PARTICLE_SIZE = 0.25f;
    public static final int PARTICLE_MAX_AGE = 60;
    public static final float Y_ACCEL = 0.0006f;
    public static final boolean CAN_COLLIDE = true;
    public static final float PARTICLE_MOTION = 1.33f;
    public static final double PARTICLE_ROTATION_SPEED = 0.1;
    public static final double PARTICLE_ROTATION_SPREAD = 0.02;
    public static final double PARTICLE_RENDER_DISTANCE = 32;

    public static final int VAPE_DURABILITY = 20;
    public static final int VAPE_COOLDOWN = 40;
    public static final int VAPE_MAX_COUNT = 1;
    public static final EnumRarity VAPE_RARITY = EnumRarity.COMMON;

    public static void registerModVariables() {
        Vapeaholic.LOGGER.info("Registering Mod Variables for " + Vapeaholic.MOD_ID);
    }
}
