package com.arta.vapeaholic.particle;

import com.arta.vapeaholic.Vapeaholic;
import com.arta.vapeaholic.particle.particles.VapeSmokeParticle;
import net.minecraft.client.Minecraft;
import net.minecraft.util.EnumParticleTypes;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModParticles {

    private static void register(EnumParticleTypes type, float r, float g, float b) {
        Minecraft.getMinecraft().effectRenderer.registerParticle(type.getParticleID(), new VapeSmokeParticle.Factory(r, g, b));
    }

    public static void registerModParticles() {
        Vapeaholic.LOGGER.info("Registering Mod Particles for " + Vapeaholic.MOD_ID);

        register(ModParticleTypes.WATER_PARTICLE, 1.0F, 1.0F, 1.0F);
        register(ModParticleTypes.FIRE_RESISTANCE_PARTICLE, 1.0F, 153 / 255F, 0.0F);
        register(ModParticleTypes.INSTANT_DAMAGE_PARTICLE, 169 / 255F, 101 / 255F, 106 / 255F);
        register(ModParticleTypes.INSTANT_HEALTH_PARTICLE, 248 / 255F, 36 / 255F, 35 / 255F);
        register(ModParticleTypes.JUMP_BOOST_PARTICLE, 253 / 255F, 1.0F, 132 / 255F);
        register(ModParticleTypes.LUCK_PARTICLE, 89 / 255F, 193 / 255F, 6 / 255F);
        register(ModParticleTypes.NIGHT_VISION_PARTICLE, 162 / 255F, 243 / 255F, 87 / 255F);
        register(ModParticleTypes.POISON_PARTICLE, 135 / 255F, 163 / 255F, 99 / 255F);
        register(ModParticleTypes.REGENERATION_PARTICLE, 205 / 255F, 92 / 255F, 171 / 255F);
        register(ModParticleTypes.SLOW_FALLING_PARTICLE, 207 / 255F, 204 / 255F, 248 / 255F);
        register(ModParticleTypes.SLOWNESS_PARTICLE, 139 / 255F, 175 / 255F, 224 / 255F);
        register(ModParticleTypes.STRENGTH_PARTICLE, 1.0F, 199 / 255F, 0.0F);
        register(ModParticleTypes.SWIFTNESS_PARTICLE, 51 / 255F, 235 / 255F, 1.0F);
        register(ModParticleTypes.TURTLE_MASTER_PARTICLE, 138 / 255F, 58 / 255F, 218 / 255F);
        register(ModParticleTypes.WATER_BREATHING_PARTICLE, 152 / 255F, 218 / 255F, 192 / 255F);
        register(ModParticleTypes.WEAKNESS_PARTICLE, 72 / 255F, 77 / 255F, 72 / 255F);
        register(ModParticleTypes.WITHER_PARTICLE, 115 / 255F, 97 / 255F, 86 / 255F);
    }
}
