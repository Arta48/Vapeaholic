package com.arta.vapeaholic.particle;

import com.arta.vapeaholic.Vapeaholic;
import net.minecraft.util.EnumParticleTypes;
import net.minecraftforge.common.util.EnumHelper;

public class ModParticleTypes {
    static int id = EnumParticleTypes.values().length;

    public static final EnumParticleTypes WATER_PARTICLE = registerParticleType("water_particle", id++, false, 0);
    public static final EnumParticleTypes FIRE_RESISTANCE_PARTICLE = registerParticleType("fire_resistance_particle", id++, false, 0);
    public static final EnumParticleTypes INSTANT_DAMAGE_PARTICLE = registerParticleType("instant_damage_particle", id++, false, 0);
    public static final EnumParticleTypes INSTANT_HEALTH_PARTICLE = registerParticleType("instant_health_particle", id++, false, 0);
    public static final EnumParticleTypes JUMP_BOOST_PARTICLE = registerParticleType("jump_boost_particle", id++, false, 0);
    public static final EnumParticleTypes LUCK_PARTICLE = registerParticleType("luck_particle", id++, false, 0);
    public static final EnumParticleTypes NIGHT_VISION_PARTICLE = registerParticleType("night_vision_particle", id++, false, 0);
    public static final EnumParticleTypes POISON_PARTICLE = registerParticleType("poison_particle", id++, false, 0);
    public static final EnumParticleTypes REGENERATION_PARTICLE = registerParticleType("regeneration_particle", id++, false, 0);
    public static final EnumParticleTypes SLOWNESS_PARTICLE = registerParticleType("slowness_particle", id++, false, 0);
    public static final EnumParticleTypes STRENGTH_PARTICLE = registerParticleType("strength_particle", id++, false, 0);
    public static final EnumParticleTypes SWIFTNESS_PARTICLE = registerParticleType("swiftness_particle", id++, false, 0);
    public static final EnumParticleTypes WATER_BREATHING_PARTICLE = registerParticleType("water_breathing_particle", id++, false, 0);
    public static final EnumParticleTypes WEAKNESS_PARTICLE = registerParticleType("weakness_particle", id++, false, 0);
    public static final EnumParticleTypes WITHER_PARTICLE = registerParticleType("wither_particle", id++, false, 0);

    private static EnumParticleTypes registerParticleType(String name, int id, boolean ignoreRange, int argumentCount) {
        for (EnumParticleTypes existingParticle : EnumParticleTypes.values()) {
            if (existingParticle.getParticleID() == id) {
                throw new RuntimeException("Attempted to register a particle with the same integer ID as " + existingParticle.getParticleName() + " (" + existingParticle + ").");
            }
        }

        EnumParticleTypes particle = EnumHelper.addEnum(EnumParticleTypes.class, name, new Class[] {String.class, int.class, boolean.class, int.class}, name, id, ignoreRange, argumentCount);

        return particle;
    }

    public static void registerModParticleTypes() {
        Vapeaholic.LOGGER.info("Registering Mod Particle Types for " + Vapeaholic.MOD_ID);
    }
}
