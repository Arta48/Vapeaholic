package com.arta.vapeaholic;

import com.arta.vapeaholic.item.ModItems;
import com.arta.vapeaholic.item.ModItemGroups;
import com.arta.vapeaholic.particle.ModParticleTypes;
import com.arta.vapeaholic.particle.ModParticles;
import com.arta.vapeaholic.sound.ModSounds;
import com.arta.vapeaholic.variable.ModVariables;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Vapeaholic implements ModInitializer {
	public static final String MOD_ID = "vapeaholic";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModVariables.registerModVariables();

		ModItems.registerModItems();
		ModItemGroups.registerModItemGroups();

		ModParticleTypes.registerModParticleTypes();

		ModSounds.registerModSounds();
	}
}