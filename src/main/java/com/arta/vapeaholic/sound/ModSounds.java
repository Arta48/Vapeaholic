package com.arta.vapeaholic.sound;

import com.arta.vapeaholic.Vapeaholic;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final SoundEvent BREATHING = registerSound("breathing");

    private static SoundEvent registerSound(String name) {
        Identifier id = Identifier.of(Vapeaholic.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerModSounds() {
        Vapeaholic.LOGGER.info("Registering Mod Sounds for " + Vapeaholic.MOD_ID);
    }
}
