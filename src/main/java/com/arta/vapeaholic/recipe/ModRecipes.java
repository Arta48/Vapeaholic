package com.arta.vapeaholic.recipe;

import com.arta.vapeaholic.Vapeaholic;
import com.arta.vapeaholic.recipe.recipes.VapeCleanRecipe;
import com.arta.vapeaholic.recipe.recipes.VapeDyeRecipe;
import com.arta.vapeaholic.recipe.recipes.VapeFillRecipe;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.crafting.CustomRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;

import java.util.function.Supplier;

public class ModRecipes {
    private static <T extends CustomRecipe> RecipeSerializer<T> registerCustom(String name, Supplier<T> factory) {
        T instance = factory.get();
        return Registry.register(
                BuiltInRegistries.RECIPE_SERIALIZER,
                Identifier.fromNamespaceAndPath(Vapeaholic.MOD_ID, name),
                new RecipeSerializer<>(MapCodec.unit(instance), StreamCodec.unit(instance))
        );
    }

    public static final RecipeSerializer<VapeFillRecipe> VAPE_FILL = registerCustom("vape_fill", VapeFillRecipe::new);
    public static final RecipeSerializer<VapeCleanRecipe> VAPE_CLEAN = registerCustom("vape_clean", VapeCleanRecipe::new);
    public static final RecipeSerializer<VapeDyeRecipe> VAPE_DYE = registerCustom("vape_dye", VapeDyeRecipe::new);

    public static void registerModRecipes() {
        Vapeaholic.LOGGER.info("Registering Mod Recipes for " + Vapeaholic.MOD_ID);
    }
}
