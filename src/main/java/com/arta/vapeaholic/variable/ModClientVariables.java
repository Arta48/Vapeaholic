package com.arta.vapeaholic.variable;

import com.arta.vapeaholic.Vapeaholic;
import net.minecraft.client.particle.SingleQuadParticle.Layer;

public class ModClientVariables {
    public static final Layer ParticleLayer = Layer.OPAQUE;


    public static void registerModClientVariables() {
        Vapeaholic.LOGGER.info("Registering Mod Client's Variables for " + Vapeaholic.MOD_ID);
    }
}