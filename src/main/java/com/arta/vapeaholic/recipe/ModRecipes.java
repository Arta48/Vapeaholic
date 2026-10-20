package com.arta.vapeaholic.recipe;

import com.arta.vapeaholic.Vapeaholic;
import com.arta.vapeaholic.recipe.recipes.VapeCleanRecipe;
import com.arta.vapeaholic.recipe.recipes.VapeDyeRecipe;
import com.arta.vapeaholic.recipe.recipes.VapeFillRecipe;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Vapeaholic.MOD_ID)
public class ModRecipes {

    @SubscribeEvent
    public static void onRegisterRecipes(RegistryEvent.Register<IRecipe> event) {
        Vapeaholic.LOGGER.info("Registering Mod Recipes for " + Vapeaholic.MOD_ID);

        event.getRegistry().register(new VapeFillRecipe().setRegistryName(new ResourceLocation(Vapeaholic.MOD_ID, "vape_fill")));
        event.getRegistry().register(new VapeCleanRecipe().setRegistryName(new ResourceLocation(Vapeaholic.MOD_ID, "vape_clean")));
        event.getRegistry().register(new VapeDyeRecipe().setRegistryName(new ResourceLocation(Vapeaholic.MOD_ID, "vape_dye")));
    }
}
