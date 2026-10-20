package com.arta.vapeaholic.particle;

import com.arta.vapeaholic.Vapeaholic;
import com.arta.vapeaholic.particle.particles.VapeSmokeParticle;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.particle.v1.ParticleProviderRegistry;

@Environment(EnvType.CLIENT)
public class ModParticles {
    public static void registerModParticles() {
        Vapeaholic.LOGGER.info("Registering Mod Particles for " + Vapeaholic.MOD_ID);

        ParticleProviderRegistry registry = ParticleProviderRegistry.getInstance();

        registry.register(ModParticleTypes.WATER_PARTICLE, VapeSmokeParticle::provider);
        registry.register(ModParticleTypes.FIRE_RESISTANCE_PARTICLE, VapeSmokeParticle::provider);
        registry.register(ModParticleTypes.INSTANT_DAMAGE_PARTICLE, VapeSmokeParticle::provider);
        registry.register(ModParticleTypes.INSTANT_HEALTH_PARTICLE, VapeSmokeParticle::provider);
        registry.register(ModParticleTypes.JUMP_BOOST_PARTICLE, VapeSmokeParticle::provider);
        registry.register(ModParticleTypes.LUCK_PARTICLE, VapeSmokeParticle::provider);
        registry.register(ModParticleTypes.NIGHT_VISION_PARTICLE, VapeSmokeParticle::provider);
        registry.register(ModParticleTypes.POISON_PARTICLE, VapeSmokeParticle::provider);
        registry.register(ModParticleTypes.REGENERATION_PARTICLE, VapeSmokeParticle::provider);
        registry.register(ModParticleTypes.SLOW_FALLING_PARTICLE, VapeSmokeParticle::provider);
        registry.register(ModParticleTypes.SLOWNESS_PARTICLE, VapeSmokeParticle::provider);
        registry.register(ModParticleTypes.STRENGTH_PARTICLE, VapeSmokeParticle::provider);
        registry.register(ModParticleTypes.TURTLE_MASTER_PARTICLE, VapeSmokeParticle::provider);
        registry.register(ModParticleTypes.SWIFTNESS_PARTICLE, VapeSmokeParticle::provider);
        registry.register(ModParticleTypes.WATER_BREATHING_PARTICLE, VapeSmokeParticle::provider);
        registry.register(ModParticleTypes.WEAKNESS_PARTICLE, VapeSmokeParticle::provider);
        registry.register(ModParticleTypes.WITHER_PARTICLE, VapeSmokeParticle::provider);
    }
}
