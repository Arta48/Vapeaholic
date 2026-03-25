package com.arta.vapeaholic.variable;

import com.arta.vapeaholic.Vapeaholic;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.Rarity;

public class ModVariables {
    public static final int EffectStrength = 1;
    public static final int EffectDuration = 8 * 20;
    public static final double PuffAmount = 15;

    public static final float ParticleQuadSize = 0.25f;
    public static final float ParticleSize = 0.2f;
    public static final int ParticleLifeTime = 60;
    public static final float ParticleGravity = -0.03f;
    public static final boolean HasPhysics = true;
    public static final float ParticleSpeed = 2;
    public static final double ParticleRotationSpeed = 0.1;
    public static final double ParticleRotationSpread = 0.02;

    public static final int VapeDurability = 20;
    public static final int VapeCooldown = 40;
    public static final int VapeMaxCount = 1;
    public static final Rarity VapeRarity = Rarity.COMMON;
    public static final Properties VapeSettings = new Item.Properties().durability(VapeDurability).rarity(VapeRarity).stacksTo(VapeMaxCount);


    public static void registerModVariables() {
        Vapeaholic.LOGGER.info("Registering Mod Variables for " + Vapeaholic.MOD_ID);
    }
}
