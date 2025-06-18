package com.arta.vapeaholic.variable;

import com.arta.vapeaholic.Vapeaholic;
import net.minecraft.client.particle.ParticleTextureSheet;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Settings;
import net.minecraft.util.Rarity;

public class ModClientVariables {
    public static final ParticleTextureSheet ParticleSheet = ParticleTextureSheet.PARTICLE_SHEET_OPAQUE;


    public static void registerModClientVariables() {
        Vapeaholic.LOGGER.info("Registering Mod Client's Variables for " + Vapeaholic.MOD_ID);
    }
}
