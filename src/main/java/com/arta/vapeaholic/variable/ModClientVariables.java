package com.arta.vapeaholic.variable;

import com.arta.vapeaholic.Vapeaholic;
import net.minecraft.client.particle.BillboardParticle.RenderType;

public class ModClientVariables {
    public static final RenderType ParticleAtlas = RenderType.PARTICLE_ATLAS_OPAQUE;


    public static void registerModClientVariables() {
        Vapeaholic.LOGGER.info("Registering Mod Client's Variables for " + Vapeaholic.MOD_ID);
    }
}
