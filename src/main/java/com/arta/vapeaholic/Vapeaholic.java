package com.arta.vapeaholic;

import com.arta.vapeaholic.item.ModItemModels;
import com.arta.vapeaholic.item.ModItems;
import com.arta.vapeaholic.item.ModItemGroups;
import com.arta.vapeaholic.network.ModPacketHandler;
import com.arta.vapeaholic.particle.ModParticles;
import com.arta.vapeaholic.particle.ModParticleTypes;
import com.arta.vapeaholic.sound.ModSounds;
import com.arta.vapeaholic.variable.ModVariables;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

@Mod(modid = Vapeaholic.MOD_ID, name = Vapeaholic.MOD_NAME, version = Vapeaholic.MOD_VERSION)
public class Vapeaholic {
	public static final String MOD_ID = "vapeaholic";
	public static final String MOD_NAME = "Vapeaholic";
	public static final String MOD_VERSION = "1.0.0";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Mod.EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		ModVariables.registerModVariables();

		ModItemGroups.registerModItemGroups();
		ModItems.registerModItems();

		ModSounds.registerModSounds();
	}

	@SideOnly(Side.CLIENT)
	@Mod.EventHandler
	public static void ClientPreInit(FMLPreInitializationEvent event) {
		ModItemModels.registerModItemModels();
	}

	@Mod.EventHandler
	public static void Init(FMLInitializationEvent event) {
		ModParticleTypes.registerModParticleTypes();

		ModPacketHandler.init();
	}

	@SideOnly(Side.CLIENT)
	@Mod.EventHandler
	public static void ClientInit(FMLInitializationEvent event) {
		ModParticles.registerModParticles();
	}
}
