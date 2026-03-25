package com.arta.vapeaholic.particle;

import com.arta.vapeaholic.Vapeaholic;
import com.arta.vapeaholic.particle.particles.*;
import com.arta.vapeaholic.particle.ModParticleTypes;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.particle.v1.ParticleProviderRegistry;
import net.minecraft.core.particles.ParticleType;

@Environment(EnvType.CLIENT)
public class ModParticles {


    public static void registerModParticles() {
        Vapeaholic.LOGGER.info("Registering Mod Particles for " + Vapeaholic.MOD_ID);

        ParticleProviderRegistry.getInstance().register(ModParticleTypes.WATER_PARTICLE, WaterParticle::Provider);
        ParticleProviderRegistry.getInstance().register(ModParticleTypes.FIRE_RESISTANCE_PARTICLE, FireResistanceParticle::Provider);
        ParticleProviderRegistry.getInstance().register(ModParticleTypes.INSTANT_DAMAGE_PARTICLE, InstantDamageParticle::Provider);
        ParticleProviderRegistry.getInstance().register(ModParticleTypes.INSTANT_HEALTH_PARTICLE, InstantHealthParticle::Provider);
        ParticleProviderRegistry.getInstance().register(ModParticleTypes.JUMP_BOOST_PARTICLE, JumpBoostParticle::Provider);
        ParticleProviderRegistry.getInstance().register(ModParticleTypes.LUCK_PARTICLE, LuckParticle::Provider);
        ParticleProviderRegistry.getInstance().register(ModParticleTypes.NIGHT_VISION_PARTICLE, NightVisionParticle::Provider);
        ParticleProviderRegistry.getInstance().register(ModParticleTypes.POISON_PARTICLE, PoisonParticle::Provider);
        ParticleProviderRegistry.getInstance().register(ModParticleTypes.REGENERATION_PARTICLE, RegenerationParticle::Provider);
        ParticleProviderRegistry.getInstance().register(ModParticleTypes.SLOW_FALLING_PARTICLE, SlowFallingParticle::Provider);
        ParticleProviderRegistry.getInstance().register(ModParticleTypes.SLOWNESS_PARTICLE, SlownessParticle::Provider);
        ParticleProviderRegistry.getInstance().register(ModParticleTypes.STRENGTH_PARTICLE, StrengthParticle::Provider);
        ParticleProviderRegistry.getInstance().register(ModParticleTypes.TURTLE_MASTER_PARTICLE, TurtleMasterParticle::Provider);
        ParticleProviderRegistry.getInstance().register(ModParticleTypes.SWIFTNESS_PARTICLE, SwiftnessParticle::Provider);
        ParticleProviderRegistry.getInstance().register(ModParticleTypes.WATER_BREATHING_PARTICLE, WaterBreathingParticle::Provider);
        ParticleProviderRegistry.getInstance().register(ModParticleTypes.WEAKNESS_PARTICLE, WeaknessParticle::Provider);
        ParticleProviderRegistry.getInstance().register(ModParticleTypes.WITHER_PARTICLE, WitherParticle::Provider);
    }
}
