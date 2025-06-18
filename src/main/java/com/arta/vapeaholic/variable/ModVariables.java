package com.arta.vapeaholic.variable;

import com.arta.vapeaholic.Vapeaholic;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Settings;
import net.minecraft.util.Rarity;

public class ModVariables {
    public static final int EffectStrength = 1;
    public static final int EffectDuration = 8 * 20;
    public static final double PuffAmount = 15;

    public static final float ParticleScale = 0.25f;
    public static final float ParticleBoundingBoxSpacing = 0.2f;
    public static final int ParticleMaxAge = 60;
    public static final float ParticleGravityStrength = -0.03f;
    public static final boolean CollideWithWorld = true;
    public static final float ParticleSpeed = 2;
    public static final double ParticleRotationSpeed = 0.1;
    public static final double ParticleRotationSpread = 0.02;

    public static final int VapeDurability = 20;
    public static final int VapeCooldown = 40;
    public static final int VapeMaxCount = 1;
    public static final Rarity VapeRarity = Rarity.COMMON;
    public static final Settings VapeSettings = new Item.Settings().maxDamage(VapeDurability).rarity(VapeRarity).maxCount(VapeMaxCount);


    public static void registerModVariables() {
        Vapeaholic.LOGGER.info("Registering Mod Variables for " + Vapeaholic.MOD_ID);
    }
}
