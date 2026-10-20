package com.arta.vapeaholic;

import com.arta.vapeaholic.item.ModItemGroups;
import com.arta.vapeaholic.network.ModPacketHandler;
import com.arta.vapeaholic.particle.ModParticleTypes;
import com.arta.vapeaholic.particle.ModParticles;
import com.arta.vapeaholic.sound.ModSounds;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = Vapeaholic.MOD_ID, name = Vapeaholic.MOD_NAME, version = Vapeaholic.MOD_VERSION)
public class Vapeaholic {
    public static final String MOD_ID = "vapeaholic";
    public static final String MOD_NAME = "Vapeaholic";
    public static final String MOD_VERSION = "1.0.3";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModItemGroups.registerModItemGroups();
        ModSounds.registerModSounds();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        ModParticleTypes.registerModParticleTypes();
        ModPacketHandler.init();

        if (event.getSide().isClient()) {
            ModParticles.registerModParticles();
        }
    }
}
