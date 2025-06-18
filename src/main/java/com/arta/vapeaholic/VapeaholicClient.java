package com.arta.vapeaholic;

import com.arta.vapeaholic.particle.ModParticles;
import com.arta.vapeaholic.variable.ModClientVariables;
import net.fabricmc.api.ClientModInitializer;

public class VapeaholicClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModClientVariables.registerModClientVariables();

        ModParticles.registerModParticles();
    }
}
