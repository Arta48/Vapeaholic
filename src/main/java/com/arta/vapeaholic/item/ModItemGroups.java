package com.arta.vapeaholic.item;

import com.arta.vapeaholic.Vapeaholic;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModItemGroups {
    public static final CreativeModeTab VAPES_TAB = Registry.register(
            BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(
                    Vapeaholic.MOD_ID,
                    "vapes_tab"),
            FabricCreativeModeTab.builder()
                    .title(Component.translatable("itemgroup.vapeaholic.vapes_tab"))
                    .icon(() -> new ItemStack(ModItems.RED_VAPE))
                    .displayItems(((displayContext, displayItems) -> {
                        displayItems.accept(ModItems.RED_VAPE);
                        displayItems.accept(ModItems.ORANGE_VAPE);
                        displayItems.accept(ModItems.YELLOW_VAPE);
                        displayItems.accept(ModItems.LIME_VAPE);
                        displayItems.accept(ModItems.GREEN_VAPE);
                        displayItems.accept(ModItems.CYAN_VAPE);
                        displayItems.accept(ModItems.LIGHT_BLUE_VAPE);
                        displayItems.accept(ModItems.BLUE_VAPE);
                        displayItems.accept(ModItems.PURPLE_VAPE);
                        displayItems.accept(ModItems.MAGENTA_VAPE);
                        displayItems.accept(ModItems.PINK_VAPE);
                        displayItems.accept(ModItems.BROWN_VAPE);
                        displayItems.accept(ModItems.WHITE_VAPE);
                        displayItems.accept(ModItems.LIGHT_GRAY_VAPE);
                        displayItems.accept(ModItems.GRAY_VAPE);
                        displayItems.accept(ModItems.BLACK_VAPE);

                        displayItems.accept(ModItems.WATER_RED_VAPE);
                        displayItems.accept(ModItems.WATER_ORANGE_VAPE);
                        displayItems.accept(ModItems.WATER_YELLOW_VAPE);
                        displayItems.accept(ModItems.WATER_LIME_VAPE);
                        displayItems.accept(ModItems.WATER_GREEN_VAPE);
                        displayItems.accept(ModItems.WATER_CYAN_VAPE);
                        displayItems.accept(ModItems.WATER_LIGHT_BLUE_VAPE);
                        displayItems.accept(ModItems.WATER_BLUE_VAPE);
                        displayItems.accept(ModItems.WATER_PURPLE_VAPE);
                        displayItems.accept(ModItems.WATER_MAGENTA_VAPE);
                        displayItems.accept(ModItems.WATER_PINK_VAPE);
                        displayItems.accept(ModItems.WATER_BROWN_VAPE);
                        displayItems.accept(ModItems.WATER_WHITE_VAPE);
                        displayItems.accept(ModItems.WATER_LIGHT_GRAY_VAPE);
                        displayItems.accept(ModItems.WATER_GRAY_VAPE);
                        displayItems.accept(ModItems.WATER_BLACK_VAPE);

                        displayItems.accept(ModItems.FIRE_RESISTANCE_RED_VAPE);
                        displayItems.accept(ModItems.FIRE_RESISTANCE_ORANGE_VAPE);
                        displayItems.accept(ModItems.FIRE_RESISTANCE_YELLOW_VAPE);
                        displayItems.accept(ModItems.FIRE_RESISTANCE_LIME_VAPE);
                        displayItems.accept(ModItems.FIRE_RESISTANCE_GREEN_VAPE);
                        displayItems.accept(ModItems.FIRE_RESISTANCE_CYAN_VAPE);
                        displayItems.accept(ModItems.FIRE_RESISTANCE_LIGHT_BLUE_VAPE);
                        displayItems.accept(ModItems.FIRE_RESISTANCE_BLUE_VAPE);
                        displayItems.accept(ModItems.FIRE_RESISTANCE_PURPLE_VAPE);
                        displayItems.accept(ModItems.FIRE_RESISTANCE_MAGENTA_VAPE);
                        displayItems.accept(ModItems.FIRE_RESISTANCE_PINK_VAPE);
                        displayItems.accept(ModItems.FIRE_RESISTANCE_BROWN_VAPE);
                        displayItems.accept(ModItems.FIRE_RESISTANCE_WHITE_VAPE);
                        displayItems.accept(ModItems.FIRE_RESISTANCE_LIGHT_GRAY_VAPE);
                        displayItems.accept(ModItems.FIRE_RESISTANCE_GRAY_VAPE);
                        displayItems.accept(ModItems.FIRE_RESISTANCE_BLACK_VAPE);

                        displayItems.accept(ModItems.INSTANT_DAMAGE_RED_VAPE);
                        displayItems.accept(ModItems.INSTANT_DAMAGE_ORANGE_VAPE);
                        displayItems.accept(ModItems.INSTANT_DAMAGE_YELLOW_VAPE);
                        displayItems.accept(ModItems.INSTANT_DAMAGE_LIME_VAPE);
                        displayItems.accept(ModItems.INSTANT_DAMAGE_GREEN_VAPE);
                        displayItems.accept(ModItems.INSTANT_DAMAGE_CYAN_VAPE);
                        displayItems.accept(ModItems.INSTANT_DAMAGE_LIGHT_BLUE_VAPE);
                        displayItems.accept(ModItems.INSTANT_DAMAGE_BLUE_VAPE);
                        displayItems.accept(ModItems.INSTANT_DAMAGE_PURPLE_VAPE);
                        displayItems.accept(ModItems.INSTANT_DAMAGE_MAGENTA_VAPE);
                        displayItems.accept(ModItems.INSTANT_DAMAGE_PINK_VAPE);
                        displayItems.accept(ModItems.INSTANT_DAMAGE_BROWN_VAPE);
                        displayItems.accept(ModItems.INSTANT_DAMAGE_WHITE_VAPE);
                        displayItems.accept(ModItems.INSTANT_DAMAGE_LIGHT_GRAY_VAPE);
                        displayItems.accept(ModItems.INSTANT_DAMAGE_GRAY_VAPE);
                        displayItems.accept(ModItems.INSTANT_DAMAGE_BLACK_VAPE);

                        displayItems.accept(ModItems.INSTANT_HEALTH_RED_VAPE);
                        displayItems.accept(ModItems.INSTANT_HEALTH_ORANGE_VAPE);
                        displayItems.accept(ModItems.INSTANT_HEALTH_YELLOW_VAPE);
                        displayItems.accept(ModItems.INSTANT_HEALTH_LIME_VAPE);
                        displayItems.accept(ModItems.INSTANT_HEALTH_GREEN_VAPE);
                        displayItems.accept(ModItems.INSTANT_HEALTH_CYAN_VAPE);
                        displayItems.accept(ModItems.INSTANT_HEALTH_LIGHT_BLUE_VAPE);
                        displayItems.accept(ModItems.INSTANT_HEALTH_BLUE_VAPE);
                        displayItems.accept(ModItems.INSTANT_HEALTH_PURPLE_VAPE);
                        displayItems.accept(ModItems.INSTANT_HEALTH_MAGENTA_VAPE);
                        displayItems.accept(ModItems.INSTANT_HEALTH_PINK_VAPE);
                        displayItems.accept(ModItems.INSTANT_HEALTH_BROWN_VAPE);
                        displayItems.accept(ModItems.INSTANT_HEALTH_WHITE_VAPE);
                        displayItems.accept(ModItems.INSTANT_HEALTH_LIGHT_GRAY_VAPE);
                        displayItems.accept(ModItems.INSTANT_HEALTH_GRAY_VAPE);
                        displayItems.accept(ModItems.INSTANT_HEALTH_BLACK_VAPE);

                        displayItems.accept(ModItems.INVISIBILITY_RED_VAPE);
                        displayItems.accept(ModItems.INVISIBILITY_ORANGE_VAPE);
                        displayItems.accept(ModItems.INVISIBILITY_YELLOW_VAPE);
                        displayItems.accept(ModItems.INVISIBILITY_LIME_VAPE);
                        displayItems.accept(ModItems.INVISIBILITY_GREEN_VAPE);
                        displayItems.accept(ModItems.INVISIBILITY_CYAN_VAPE);
                        displayItems.accept(ModItems.INVISIBILITY_LIGHT_BLUE_VAPE);
                        displayItems.accept(ModItems.INVISIBILITY_BLUE_VAPE);
                        displayItems.accept(ModItems.INVISIBILITY_PURPLE_VAPE);
                        displayItems.accept(ModItems.INVISIBILITY_MAGENTA_VAPE);
                        displayItems.accept(ModItems.INVISIBILITY_PINK_VAPE);
                        displayItems.accept(ModItems.INVISIBILITY_BROWN_VAPE);
                        displayItems.accept(ModItems.INVISIBILITY_WHITE_VAPE);
                        displayItems.accept(ModItems.INVISIBILITY_LIGHT_GRAY_VAPE);
                        displayItems.accept(ModItems.INVISIBILITY_GRAY_VAPE);
                        displayItems.accept(ModItems.INVISIBILITY_BLACK_VAPE);

                        displayItems.accept(ModItems.JUMP_BOOST_RED_VAPE);
                        displayItems.accept(ModItems.JUMP_BOOST_ORANGE_VAPE);
                        displayItems.accept(ModItems.JUMP_BOOST_YELLOW_VAPE);
                        displayItems.accept(ModItems.JUMP_BOOST_LIME_VAPE);
                        displayItems.accept(ModItems.JUMP_BOOST_GREEN_VAPE);
                        displayItems.accept(ModItems.JUMP_BOOST_CYAN_VAPE);
                        displayItems.accept(ModItems.JUMP_BOOST_LIGHT_BLUE_VAPE);
                        displayItems.accept(ModItems.JUMP_BOOST_BLUE_VAPE);
                        displayItems.accept(ModItems.JUMP_BOOST_PURPLE_VAPE);
                        displayItems.accept(ModItems.JUMP_BOOST_MAGENTA_VAPE);
                        displayItems.accept(ModItems.JUMP_BOOST_PINK_VAPE);
                        displayItems.accept(ModItems.JUMP_BOOST_BROWN_VAPE);
                        displayItems.accept(ModItems.JUMP_BOOST_WHITE_VAPE);
                        displayItems.accept(ModItems.JUMP_BOOST_LIGHT_GRAY_VAPE);
                        displayItems.accept(ModItems.JUMP_BOOST_GRAY_VAPE);
                        displayItems.accept(ModItems.JUMP_BOOST_BLACK_VAPE);

                        displayItems.accept(ModItems.LUCK_RED_VAPE);
                        displayItems.accept(ModItems.LUCK_ORANGE_VAPE);
                        displayItems.accept(ModItems.LUCK_YELLOW_VAPE);
                        displayItems.accept(ModItems.LUCK_LIME_VAPE);
                        displayItems.accept(ModItems.LUCK_GREEN_VAPE);
                        displayItems.accept(ModItems.LUCK_CYAN_VAPE);
                        displayItems.accept(ModItems.LUCK_LIGHT_BLUE_VAPE);
                        displayItems.accept(ModItems.LUCK_BLUE_VAPE);
                        displayItems.accept(ModItems.LUCK_PURPLE_VAPE);
                        displayItems.accept(ModItems.LUCK_MAGENTA_VAPE);
                        displayItems.accept(ModItems.LUCK_PINK_VAPE);
                        displayItems.accept(ModItems.LUCK_BROWN_VAPE);
                        displayItems.accept(ModItems.LUCK_WHITE_VAPE);
                        displayItems.accept(ModItems.LUCK_LIGHT_GRAY_VAPE);
                        displayItems.accept(ModItems.LUCK_GRAY_VAPE);
                        displayItems.accept(ModItems.LUCK_BLACK_VAPE);

                        displayItems.accept(ModItems.NIGHT_VISION_RED_VAPE);
                        displayItems.accept(ModItems.NIGHT_VISION_ORANGE_VAPE);
                        displayItems.accept(ModItems.NIGHT_VISION_YELLOW_VAPE);
                        displayItems.accept(ModItems.NIGHT_VISION_LIME_VAPE);
                        displayItems.accept(ModItems.NIGHT_VISION_GREEN_VAPE);
                        displayItems.accept(ModItems.NIGHT_VISION_CYAN_VAPE);
                        displayItems.accept(ModItems.NIGHT_VISION_LIGHT_BLUE_VAPE);
                        displayItems.accept(ModItems.NIGHT_VISION_BLUE_VAPE);
                        displayItems.accept(ModItems.NIGHT_VISION_PURPLE_VAPE);
                        displayItems.accept(ModItems.NIGHT_VISION_MAGENTA_VAPE);
                        displayItems.accept(ModItems.NIGHT_VISION_PINK_VAPE);
                        displayItems.accept(ModItems.NIGHT_VISION_BROWN_VAPE);
                        displayItems.accept(ModItems.NIGHT_VISION_WHITE_VAPE);
                        displayItems.accept(ModItems.NIGHT_VISION_LIGHT_GRAY_VAPE);
                        displayItems.accept(ModItems.NIGHT_VISION_GRAY_VAPE);
                        displayItems.accept(ModItems.NIGHT_VISION_BLACK_VAPE);

                        displayItems.accept(ModItems.POISON_RED_VAPE);
                        displayItems.accept(ModItems.POISON_ORANGE_VAPE);
                        displayItems.accept(ModItems.POISON_YELLOW_VAPE);
                        displayItems.accept(ModItems.POISON_LIME_VAPE);
                        displayItems.accept(ModItems.POISON_GREEN_VAPE);
                        displayItems.accept(ModItems.POISON_CYAN_VAPE);
                        displayItems.accept(ModItems.POISON_LIGHT_BLUE_VAPE);
                        displayItems.accept(ModItems.POISON_BLUE_VAPE);
                        displayItems.accept(ModItems.POISON_PURPLE_VAPE);
                        displayItems.accept(ModItems.POISON_MAGENTA_VAPE);
                        displayItems.accept(ModItems.POISON_PINK_VAPE);
                        displayItems.accept(ModItems.POISON_BROWN_VAPE);
                        displayItems.accept(ModItems.POISON_WHITE_VAPE);
                        displayItems.accept(ModItems.POISON_LIGHT_GRAY_VAPE);
                        displayItems.accept(ModItems.POISON_GRAY_VAPE);
                        displayItems.accept(ModItems.POISON_BLACK_VAPE);

                        displayItems.accept(ModItems.REGENERATION_RED_VAPE);
                        displayItems.accept(ModItems.REGENERATION_ORANGE_VAPE);
                        displayItems.accept(ModItems.REGENERATION_YELLOW_VAPE);
                        displayItems.accept(ModItems.REGENERATION_LIME_VAPE);
                        displayItems.accept(ModItems.REGENERATION_GREEN_VAPE);
                        displayItems.accept(ModItems.REGENERATION_CYAN_VAPE);
                        displayItems.accept(ModItems.REGENERATION_LIGHT_BLUE_VAPE);
                        displayItems.accept(ModItems.REGENERATION_BLUE_VAPE);
                        displayItems.accept(ModItems.REGENERATION_PURPLE_VAPE);
                        displayItems.accept(ModItems.REGENERATION_MAGENTA_VAPE);
                        displayItems.accept(ModItems.REGENERATION_PINK_VAPE);
                        displayItems.accept(ModItems.REGENERATION_BROWN_VAPE);
                        displayItems.accept(ModItems.REGENERATION_WHITE_VAPE);
                        displayItems.accept(ModItems.REGENERATION_LIGHT_GRAY_VAPE);
                        displayItems.accept(ModItems.REGENERATION_GRAY_VAPE);
                        displayItems.accept(ModItems.REGENERATION_BLACK_VAPE);

                        displayItems.accept(ModItems.SLOW_FALLING_RED_VAPE);
                        displayItems.accept(ModItems.SLOW_FALLING_ORANGE_VAPE);
                        displayItems.accept(ModItems.SLOW_FALLING_YELLOW_VAPE);
                        displayItems.accept(ModItems.SLOW_FALLING_LIME_VAPE);
                        displayItems.accept(ModItems.SLOW_FALLING_GREEN_VAPE);
                        displayItems.accept(ModItems.SLOW_FALLING_CYAN_VAPE);
                        displayItems.accept(ModItems.SLOW_FALLING_LIGHT_BLUE_VAPE);
                        displayItems.accept(ModItems.SLOW_FALLING_BLUE_VAPE);
                        displayItems.accept(ModItems.SLOW_FALLING_PURPLE_VAPE);
                        displayItems.accept(ModItems.SLOW_FALLING_MAGENTA_VAPE);
                        displayItems.accept(ModItems.SLOW_FALLING_PINK_VAPE);
                        displayItems.accept(ModItems.SLOW_FALLING_BROWN_VAPE);
                        displayItems.accept(ModItems.SLOW_FALLING_WHITE_VAPE);
                        displayItems.accept(ModItems.SLOW_FALLING_LIGHT_GRAY_VAPE);
                        displayItems.accept(ModItems.SLOW_FALLING_GRAY_VAPE);
                        displayItems.accept(ModItems.SLOW_FALLING_BLACK_VAPE);

                        displayItems.accept(ModItems.SLOWNESS_RED_VAPE);
                        displayItems.accept(ModItems.SLOWNESS_ORANGE_VAPE);
                        displayItems.accept(ModItems.SLOWNESS_YELLOW_VAPE);
                        displayItems.accept(ModItems.SLOWNESS_LIME_VAPE);
                        displayItems.accept(ModItems.SLOWNESS_GREEN_VAPE);
                        displayItems.accept(ModItems.SLOWNESS_CYAN_VAPE);
                        displayItems.accept(ModItems.SLOWNESS_LIGHT_BLUE_VAPE);
                        displayItems.accept(ModItems.SLOWNESS_BLUE_VAPE);
                        displayItems.accept(ModItems.SLOWNESS_PURPLE_VAPE);
                        displayItems.accept(ModItems.SLOWNESS_MAGENTA_VAPE);
                        displayItems.accept(ModItems.SLOWNESS_PINK_VAPE);
                        displayItems.accept(ModItems.SLOWNESS_BROWN_VAPE);
                        displayItems.accept(ModItems.SLOWNESS_WHITE_VAPE);
                        displayItems.accept(ModItems.SLOWNESS_LIGHT_GRAY_VAPE);
                        displayItems.accept(ModItems.SLOWNESS_GRAY_VAPE);
                        displayItems.accept(ModItems.SLOWNESS_BLACK_VAPE);

                        displayItems.accept(ModItems.STRENGTH_RED_VAPE);
                        displayItems.accept(ModItems.STRENGTH_ORANGE_VAPE);
                        displayItems.accept(ModItems.STRENGTH_YELLOW_VAPE);
                        displayItems.accept(ModItems.STRENGTH_LIME_VAPE);
                        displayItems.accept(ModItems.STRENGTH_GREEN_VAPE);
                        displayItems.accept(ModItems.STRENGTH_CYAN_VAPE);
                        displayItems.accept(ModItems.STRENGTH_LIGHT_BLUE_VAPE);
                        displayItems.accept(ModItems.STRENGTH_BLUE_VAPE);
                        displayItems.accept(ModItems.STRENGTH_PURPLE_VAPE);
                        displayItems.accept(ModItems.STRENGTH_MAGENTA_VAPE);
                        displayItems.accept(ModItems.STRENGTH_PINK_VAPE);
                        displayItems.accept(ModItems.STRENGTH_BROWN_VAPE);
                        displayItems.accept(ModItems.STRENGTH_WHITE_VAPE);
                        displayItems.accept(ModItems.STRENGTH_LIGHT_GRAY_VAPE);
                        displayItems.accept(ModItems.STRENGTH_GRAY_VAPE);
                        displayItems.accept(ModItems.STRENGTH_BLACK_VAPE);

                        displayItems.accept(ModItems.SWIFTNESS_RED_VAPE);
                        displayItems.accept(ModItems.SWIFTNESS_ORANGE_VAPE);
                        displayItems.accept(ModItems.SWIFTNESS_YELLOW_VAPE);
                        displayItems.accept(ModItems.SWIFTNESS_LIME_VAPE);
                        displayItems.accept(ModItems.SWIFTNESS_GREEN_VAPE);
                        displayItems.accept(ModItems.SWIFTNESS_CYAN_VAPE);
                        displayItems.accept(ModItems.SWIFTNESS_LIGHT_BLUE_VAPE);
                        displayItems.accept(ModItems.SWIFTNESS_BLUE_VAPE);
                        displayItems.accept(ModItems.SWIFTNESS_PURPLE_VAPE);
                        displayItems.accept(ModItems.SWIFTNESS_MAGENTA_VAPE);
                        displayItems.accept(ModItems.SWIFTNESS_PINK_VAPE);
                        displayItems.accept(ModItems.SWIFTNESS_BROWN_VAPE);
                        displayItems.accept(ModItems.SWIFTNESS_WHITE_VAPE);
                        displayItems.accept(ModItems.SWIFTNESS_LIGHT_GRAY_VAPE);
                        displayItems.accept(ModItems.SWIFTNESS_GRAY_VAPE);
                        displayItems.accept(ModItems.SWIFTNESS_BLACK_VAPE);

                        displayItems.accept(ModItems.TURTLE_MASTER_RED_VAPE);
                        displayItems.accept(ModItems.TURTLE_MASTER_ORANGE_VAPE);
                        displayItems.accept(ModItems.TURTLE_MASTER_YELLOW_VAPE);
                        displayItems.accept(ModItems.TURTLE_MASTER_LIME_VAPE);
                        displayItems.accept(ModItems.TURTLE_MASTER_GREEN_VAPE);
                        displayItems.accept(ModItems.TURTLE_MASTER_CYAN_VAPE);
                        displayItems.accept(ModItems.TURTLE_MASTER_LIGHT_BLUE_VAPE);
                        displayItems.accept(ModItems.TURTLE_MASTER_BLUE_VAPE);
                        displayItems.accept(ModItems.TURTLE_MASTER_PURPLE_VAPE);
                        displayItems.accept(ModItems.TURTLE_MASTER_MAGENTA_VAPE);
                        displayItems.accept(ModItems.TURTLE_MASTER_PINK_VAPE);
                        displayItems.accept(ModItems.TURTLE_MASTER_BROWN_VAPE);
                        displayItems.accept(ModItems.TURTLE_MASTER_WHITE_VAPE);
                        displayItems.accept(ModItems.TURTLE_MASTER_LIGHT_GRAY_VAPE);
                        displayItems.accept(ModItems.TURTLE_MASTER_GRAY_VAPE);
                        displayItems.accept(ModItems.TURTLE_MASTER_BLACK_VAPE);

                        displayItems.accept(ModItems.WATER_BREATHING_RED_VAPE);
                        displayItems.accept(ModItems.WATER_BREATHING_ORANGE_VAPE);
                        displayItems.accept(ModItems.WATER_BREATHING_YELLOW_VAPE);
                        displayItems.accept(ModItems.WATER_BREATHING_LIME_VAPE);
                        displayItems.accept(ModItems.WATER_BREATHING_GREEN_VAPE);
                        displayItems.accept(ModItems.WATER_BREATHING_CYAN_VAPE);
                        displayItems.accept(ModItems.WATER_BREATHING_LIGHT_BLUE_VAPE);
                        displayItems.accept(ModItems.WATER_BREATHING_BLUE_VAPE);
                        displayItems.accept(ModItems.WATER_BREATHING_PURPLE_VAPE);
                        displayItems.accept(ModItems.WATER_BREATHING_MAGENTA_VAPE);
                        displayItems.accept(ModItems.WATER_BREATHING_PINK_VAPE);
                        displayItems.accept(ModItems.WATER_BREATHING_BROWN_VAPE);
                        displayItems.accept(ModItems.WATER_BREATHING_WHITE_VAPE);
                        displayItems.accept(ModItems.WATER_BREATHING_LIGHT_GRAY_VAPE);
                        displayItems.accept(ModItems.WATER_BREATHING_GRAY_VAPE);
                        displayItems.accept(ModItems.WATER_BREATHING_BLACK_VAPE);

                        displayItems.accept(ModItems.WEAKNESS_RED_VAPE);
                        displayItems.accept(ModItems.WEAKNESS_ORANGE_VAPE);
                        displayItems.accept(ModItems.WEAKNESS_YELLOW_VAPE);
                        displayItems.accept(ModItems.WEAKNESS_LIME_VAPE);
                        displayItems.accept(ModItems.WEAKNESS_GREEN_VAPE);
                        displayItems.accept(ModItems.WEAKNESS_CYAN_VAPE);
                        displayItems.accept(ModItems.WEAKNESS_LIGHT_BLUE_VAPE);
                        displayItems.accept(ModItems.WEAKNESS_BLUE_VAPE);
                        displayItems.accept(ModItems.WEAKNESS_PURPLE_VAPE);
                        displayItems.accept(ModItems.WEAKNESS_MAGENTA_VAPE);
                        displayItems.accept(ModItems.WEAKNESS_PINK_VAPE);
                        displayItems.accept(ModItems.WEAKNESS_BROWN_VAPE);
                        displayItems.accept(ModItems.WEAKNESS_WHITE_VAPE);
                        displayItems.accept(ModItems.WEAKNESS_LIGHT_GRAY_VAPE);
                        displayItems.accept(ModItems.WEAKNESS_GRAY_VAPE);
                        displayItems.accept(ModItems.WEAKNESS_BLACK_VAPE);

                        displayItems.accept(ModItems.WITHER_RED_VAPE);
                        displayItems.accept(ModItems.WITHER_ORANGE_VAPE);
                        displayItems.accept(ModItems.WITHER_YELLOW_VAPE);
                        displayItems.accept(ModItems.WITHER_LIME_VAPE);
                        displayItems.accept(ModItems.WITHER_GREEN_VAPE);
                        displayItems.accept(ModItems.WITHER_CYAN_VAPE);
                        displayItems.accept(ModItems.WITHER_LIGHT_BLUE_VAPE);
                        displayItems.accept(ModItems.WITHER_BLUE_VAPE);
                        displayItems.accept(ModItems.WITHER_PURPLE_VAPE);
                        displayItems.accept(ModItems.WITHER_MAGENTA_VAPE);
                        displayItems.accept(ModItems.WITHER_PINK_VAPE);
                        displayItems.accept(ModItems.WITHER_BROWN_VAPE);
                        displayItems.accept(ModItems.WITHER_WHITE_VAPE);
                        displayItems.accept(ModItems.WITHER_LIGHT_GRAY_VAPE);
                        displayItems.accept(ModItems.WITHER_GRAY_VAPE);
                        displayItems.accept(ModItems.WITHER_BLACK_VAPE);

                    }))
                    .build()
    );
    public static final CreativeModeTab VAPE_PODS_TAB = Registry.register(
            BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(
                    Vapeaholic.MOD_ID,
                    "vape_pods_tab"),
            FabricCreativeModeTab.builder()
                    .title(Component.translatable("itemgroup.vapeaholic.vape_pods_tab"))
                    .icon(() -> new ItemStack(ModItems.VAPE_POD))
                    .displayItems(((displayContext, displayItems) -> {
                        displayItems.accept(ModItems.VAPE_POD);
                        displayItems.accept(ModItems.WATER_VAPE_POD);
                        displayItems.accept(ModItems.MUNDANE_VAPE_POD);
                        displayItems.accept(ModItems.THICK_VAPE_POD);
                        displayItems.accept(ModItems.AWKWARD_VAPE_POD);
                        displayItems.accept(ModItems.FIRE_RESISTANCE_VAPE_POD);
                        displayItems.accept(ModItems.INSTANT_DAMAGE_VAPE_POD);
                        displayItems.accept(ModItems.INSTANT_HEALTH_VAPE_POD);
                        displayItems.accept(ModItems.INVISIBILITY_VAPE_POD);
                        displayItems.accept(ModItems.JUMP_BOOST_VAPE_POD);
                        displayItems.accept(ModItems.LUCK_VAPE_POD);
                        displayItems.accept(ModItems.NIGHT_VISION_VAPE_POD);
                        displayItems.accept(ModItems.POISON_VAPE_POD);
                        displayItems.accept(ModItems.REGENERATION_VAPE_POD);
                        displayItems.accept(ModItems.SLOW_FALLING_VAPE_POD);
                        displayItems.accept(ModItems.SLOWNESS_VAPE_POD);
                        displayItems.accept(ModItems.STRENGTH_VAPE_POD);
                        displayItems.accept(ModItems.SWIFTNESS_VAPE_POD);
                        displayItems.accept(ModItems.TURTLE_MASTER_VAPE_POD);
                        displayItems.accept(ModItems.WATER_BREATHING_VAPE_POD);
                        displayItems.accept(ModItems.WEAKNESS_VAPE_POD);
                        displayItems.accept(ModItems.WITHER_VAPE_POD);
                    }))
                    .build()
    );
    public static final CreativeModeTab VAPE_COMPONENTS_TAB = Registry.register(
            BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(
                    Vapeaholic.MOD_ID,
                    "vape_components_tab"),
            FabricCreativeModeTab.builder()
                    .title(Component.translatable("itemgroup.vapeaholic.vape_components_tab"))
                    .icon(() -> new ItemStack(ModItems.BATTERY))
                    .displayItems(((displayContext, displayItems) -> {
                        displayItems.accept(ModItems.BATTERY);
                        displayItems.accept(ModItems.COIL);
                        displayItems.accept(ModItems.MOUTHPIECE);
                    }))
                    .build()
    );


    public static void registerModItemGroups() {
        Vapeaholic.LOGGER.info("Registering Mod Items Groups for " + Vapeaholic.MOD_ID);
    }
}
