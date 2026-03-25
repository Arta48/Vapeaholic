package com.arta.vapeaholic.particle;

import com.arta.vapeaholic.Vapeaholic;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;

public class ModParticleTypes {
    public static final SimpleParticleType WATER_PARTICLE = registerParticleType("water_particle", FabricParticleTypes.simple(true));
    public static final SimpleParticleType FIRE_RESISTANCE_PARTICLE = registerParticleType("fire_resistance_particle", FabricParticleTypes.simple(true));
    public static final SimpleParticleType INSTANT_DAMAGE_PARTICLE = registerParticleType("instant_damage_particle", FabricParticleTypes.simple(true));
    public static final SimpleParticleType INSTANT_HEALTH_PARTICLE = registerParticleType("instant_health_particle", FabricParticleTypes.simple(true));
    public static final SimpleParticleType JUMP_BOOST_PARTICLE = registerParticleType("jump_boost_particle", FabricParticleTypes.simple(true));
    public static final SimpleParticleType LUCK_PARTICLE = registerParticleType("luck_particle", FabricParticleTypes.simple(true));
    public static final SimpleParticleType NIGHT_VISION_PARTICLE = registerParticleType("night_vision_particle", FabricParticleTypes.simple(true));
    public static final SimpleParticleType POISON_PARTICLE = registerParticleType("poison_particle", FabricParticleTypes.simple(true));
    public static final SimpleParticleType REGENERATION_PARTICLE = registerParticleType("regeneration_particle", FabricParticleTypes.simple(true));
    public static final SimpleParticleType SLOW_FALLING_PARTICLE = registerParticleType("slow_falling_particle", FabricParticleTypes.simple(true));
    public static final SimpleParticleType SLOWNESS_PARTICLE = registerParticleType("slowness_particle", FabricParticleTypes.simple(true));
    public static final SimpleParticleType STRENGTH_PARTICLE = registerParticleType("strength_particle", FabricParticleTypes.simple(true));
    public static final SimpleParticleType SWIFTNESS_PARTICLE = registerParticleType("swiftness_particle", FabricParticleTypes.simple(true));
    public static final SimpleParticleType TURTLE_MASTER_PARTICLE = registerParticleType("turtle_master_particle", FabricParticleTypes.simple(true));
    public static final SimpleParticleType WATER_BREATHING_PARTICLE = registerParticleType("water_breathing_particle", FabricParticleTypes.simple(true));
    public static final SimpleParticleType WEAKNESS_PARTICLE = registerParticleType("weakness_particle", FabricParticleTypes.simple(true));
    public static final SimpleParticleType WITHER_PARTICLE = registerParticleType("wither_particle", FabricParticleTypes.simple(true));


    private static SimpleParticleType registerParticleType(String name, SimpleParticleType particleType) {
        return Registry.register(BuiltInRegistries.PARTICLE_TYPE, Identifier.fromNamespaceAndPath(Vapeaholic.MOD_ID, name), particleType);
    }

    public static void registerModParticleTypes() {
        Vapeaholic.LOGGER.info("Registering Mod Particle Types for " + Vapeaholic.MOD_ID);
    }
}
