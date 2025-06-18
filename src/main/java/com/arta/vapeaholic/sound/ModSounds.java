package com.arta.vapeaholic.sound;

import com.arta.vapeaholic.Vapeaholic;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModSounds {
    public static final SoundEvent BREATHING = registerSound("breathing");

    private static SoundEvent registerSound(String name) {
        ResourceLocation resource = new ResourceLocation(Vapeaholic.MOD_ID, name);
        SoundEvent event = new SoundEvent(resource).setRegistryName(name);
        ForgeRegistries.SOUND_EVENTS.register(event);
        return event;
    }

    public static void registerModSounds() {
        Vapeaholic.LOGGER.info("Registering Mod Sounds for " + Vapeaholic.MOD_ID);
    }
}
