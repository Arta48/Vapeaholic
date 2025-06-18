package com.arta.vapeaholic.variable;

import com.arta.vapeaholic.Vapeaholic;
import net.minecraft.item.EnumRarity;

public class ModVariables {
    public static final int EffectStrength = 1;
    public static final int EffectDuration = 8 * 20;
    public static final double PuffAmount = 15;

    public static final float ParticleScale = 2f;
    public static final float ParticleSize = 0.25f;
    public static final int ParticleMaxAge = 60;
    public static final float YAccel = 0.0006f;
    public static final boolean CanCollide = true;
    public static final float ParticleMotion = 1.33f;
    public static final double ParticleRotationSpeed = 0.1;
    public static final double ParticleRotationSpread = 0.02;
    public static final double ParticleRenderDistance = 32; // Max - 32


    public static final int VapeDurability = 20;
    public static final int VapeCooldown = 40;
    public static final int VapeMaxCount = 1;
    public static final EnumRarity VapeRarity = EnumRarity.COMMON;;


    public static void registerModVariables() {
        Vapeaholic.LOGGER.info("Registering Mod Variables for " + Vapeaholic.MOD_ID);
    }
}
