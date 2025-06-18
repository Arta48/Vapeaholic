package com.arta.vapeaholic.particle;

import com.arta.vapeaholic.Vapeaholic;
import com.arta.vapeaholic.particle.particles.*;
import com.arta.vapeaholic.particle.ModParticleTypes;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;

@Environment(EnvType.CLIENT)
public class ModParticles {


    public static void registerModParticles() {
        Vapeaholic.LOGGER.info("Registering Mod Particles for " + Vapeaholic.MOD_ID);

        ParticleFactoryRegistry.getInstance().register(ModParticleTypes.WATER_PARTICLE, WaterParticle::provider);
        ParticleFactoryRegistry.getInstance().register(ModParticleTypes.FIRE_RESISTANCE_PARTICLE, FireResistanceParticle::provider);
        ParticleFactoryRegistry.getInstance().register(ModParticleTypes.INSTANT_DAMAGE_PARTICLE, InstantDamageParticle::provider);
        ParticleFactoryRegistry.getInstance().register(ModParticleTypes.INSTANT_HEALTH_PARTICLE, InstantHealthParticle::provider);
        ParticleFactoryRegistry.getInstance().register(ModParticleTypes.JUMP_BOOST_PARTICLE, JumpBoostParticle::provider);
        ParticleFactoryRegistry.getInstance().register(ModParticleTypes.LUCK_PARTICLE, LuckParticle::provider);
        ParticleFactoryRegistry.getInstance().register(ModParticleTypes.NIGHT_VISION_PARTICLE, NightVisionParticle::provider);
        ParticleFactoryRegistry.getInstance().register(ModParticleTypes.POISON_PARTICLE, PoisonParticle::provider);
        ParticleFactoryRegistry.getInstance().register(ModParticleTypes.REGENERATION_PARTICLE, RegenerationParticle::provider);
        ParticleFactoryRegistry.getInstance().register(ModParticleTypes.SLOW_FALLING_PARTICLE, SlowFallingParticle::provider);
        ParticleFactoryRegistry.getInstance().register(ModParticleTypes.SLOWNESS_PARTICLE, SlownessParticle::provider);
        ParticleFactoryRegistry.getInstance().register(ModParticleTypes.STRENGTH_PARTICLE, StrengthParticle::provider);
        ParticleFactoryRegistry.getInstance().register(ModParticleTypes.SWIFTNESS_PARTICLE, SwiftnessParticle::provider);
        ParticleFactoryRegistry.getInstance().register(ModParticleTypes.TURTLE_MASTER_PARTICLE, TurtleMasterParticle::provider);
        ParticleFactoryRegistry.getInstance().register(ModParticleTypes.WATER_BREATHING_PARTICLE, WaterBreathingParticle::provider);
        ParticleFactoryRegistry.getInstance().register(ModParticleTypes.WEAKNESS_PARTICLE, WeaknessParticle::provider);
        ParticleFactoryRegistry.getInstance().register(ModParticleTypes.WITHER_PARTICLE, WitherParticle::provider);
    }
}
