package com.arta.vapeaholic.sound;

import com.arta.vapeaholic.Vapeaholic;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;

public class ModSounds {
    public static final SoundEvent BREATHING = registerSound("breathing");

    private static SoundEvent registerSound(String name) {
        Identifier id = Identifier.fromNamespaceAndPath(Vapeaholic.MOD_ID, name);
        return Registry.register(BuiltInRegistries.SOUND_EVENT, id, SoundEvent.createVariableRangeEvent(id));
    }

    public static void registerModSounds() {
        Vapeaholic.LOGGER.info("Registering Mod Sounds for " + Vapeaholic.MOD_ID);
    }
}
