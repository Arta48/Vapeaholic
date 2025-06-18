package com.arta.vapeaholic.item;

import com.arta.vapeaholic.Vapeaholic;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup VAPES_TAB = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(
                    Vapeaholic.MOD_ID,
                    "vapes_tab"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.vapeaholic.vapes_tab"))
                    .icon(() -> new ItemStack(ModItems.RED_VAPE))
                    .entries(((displayContext, entries) -> {
                        entries.add(ModItems.RED_VAPE);
                        entries.add(ModItems.ORANGE_VAPE);
                        entries.add(ModItems.YELLOW_VAPE);
                        entries.add(ModItems.LIME_VAPE);
                        entries.add(ModItems.GREEN_VAPE);
                        entries.add(ModItems.CYAN_VAPE);
                        entries.add(ModItems.LIGHT_BLUE_VAPE);
                        entries.add(ModItems.BLUE_VAPE);
                        entries.add(ModItems.PURPLE_VAPE);
                        entries.add(ModItems.MAGENTA_VAPE);
                        entries.add(ModItems.PINK_VAPE);
                        entries.add(ModItems.BROWN_VAPE);
                        entries.add(ModItems.WHITE_VAPE);
                        entries.add(ModItems.LIGHT_GRAY_VAPE);
                        entries.add(ModItems.GRAY_VAPE);
                        entries.add(ModItems.BLACK_VAPE);

                        entries.add(ModItems.WATER_RED_VAPE);
                        entries.add(ModItems.WATER_ORANGE_VAPE);
                        entries.add(ModItems.WATER_YELLOW_VAPE);
                        entries.add(ModItems.WATER_LIME_VAPE);
                        entries.add(ModItems.WATER_GREEN_VAPE);
                        entries.add(ModItems.WATER_CYAN_VAPE);
                        entries.add(ModItems.WATER_LIGHT_BLUE_VAPE);
                        entries.add(ModItems.WATER_BLUE_VAPE);
                        entries.add(ModItems.WATER_PURPLE_VAPE);
                        entries.add(ModItems.WATER_MAGENTA_VAPE);
                        entries.add(ModItems.WATER_PINK_VAPE);
                        entries.add(ModItems.WATER_BROWN_VAPE);
                        entries.add(ModItems.WATER_WHITE_VAPE);
                        entries.add(ModItems.WATER_LIGHT_GRAY_VAPE);
                        entries.add(ModItems.WATER_GRAY_VAPE);
                        entries.add(ModItems.WATER_BLACK_VAPE);

                        entries.add(ModItems.FIRE_RESISTANCE_RED_VAPE);
                        entries.add(ModItems.FIRE_RESISTANCE_ORANGE_VAPE);
                        entries.add(ModItems.FIRE_RESISTANCE_YELLOW_VAPE);
                        entries.add(ModItems.FIRE_RESISTANCE_LIME_VAPE);
                        entries.add(ModItems.FIRE_RESISTANCE_GREEN_VAPE);
                        entries.add(ModItems.FIRE_RESISTANCE_CYAN_VAPE);
                        entries.add(ModItems.FIRE_RESISTANCE_LIGHT_BLUE_VAPE);
                        entries.add(ModItems.FIRE_RESISTANCE_BLUE_VAPE);
                        entries.add(ModItems.FIRE_RESISTANCE_PURPLE_VAPE);
                        entries.add(ModItems.FIRE_RESISTANCE_MAGENTA_VAPE);
                        entries.add(ModItems.FIRE_RESISTANCE_PINK_VAPE);
                        entries.add(ModItems.FIRE_RESISTANCE_BROWN_VAPE);
                        entries.add(ModItems.FIRE_RESISTANCE_WHITE_VAPE);
                        entries.add(ModItems.FIRE_RESISTANCE_LIGHT_GRAY_VAPE);
                        entries.add(ModItems.FIRE_RESISTANCE_GRAY_VAPE);
                        entries.add(ModItems.FIRE_RESISTANCE_BLACK_VAPE);

                        entries.add(ModItems.INSTANT_DAMAGE_RED_VAPE);
                        entries.add(ModItems.INSTANT_DAMAGE_ORANGE_VAPE);
                        entries.add(ModItems.INSTANT_DAMAGE_YELLOW_VAPE);
                        entries.add(ModItems.INSTANT_DAMAGE_LIME_VAPE);
                        entries.add(ModItems.INSTANT_DAMAGE_GREEN_VAPE);
                        entries.add(ModItems.INSTANT_DAMAGE_CYAN_VAPE);
                        entries.add(ModItems.INSTANT_DAMAGE_LIGHT_BLUE_VAPE);
                        entries.add(ModItems.INSTANT_DAMAGE_BLUE_VAPE);
                        entries.add(ModItems.INSTANT_DAMAGE_PURPLE_VAPE);
                        entries.add(ModItems.INSTANT_DAMAGE_MAGENTA_VAPE);
                        entries.add(ModItems.INSTANT_DAMAGE_PINK_VAPE);
                        entries.add(ModItems.INSTANT_DAMAGE_BROWN_VAPE);
                        entries.add(ModItems.INSTANT_DAMAGE_WHITE_VAPE);
                        entries.add(ModItems.INSTANT_DAMAGE_LIGHT_GRAY_VAPE);
                        entries.add(ModItems.INSTANT_DAMAGE_GRAY_VAPE);
                        entries.add(ModItems.INSTANT_DAMAGE_BLACK_VAPE);

                        entries.add(ModItems.INSTANT_HEALTH_RED_VAPE);
                        entries.add(ModItems.INSTANT_HEALTH_ORANGE_VAPE);
                        entries.add(ModItems.INSTANT_HEALTH_YELLOW_VAPE);
                        entries.add(ModItems.INSTANT_HEALTH_LIME_VAPE);
                        entries.add(ModItems.INSTANT_HEALTH_GREEN_VAPE);
                        entries.add(ModItems.INSTANT_HEALTH_CYAN_VAPE);
                        entries.add(ModItems.INSTANT_HEALTH_LIGHT_BLUE_VAPE);
                        entries.add(ModItems.INSTANT_HEALTH_BLUE_VAPE);
                        entries.add(ModItems.INSTANT_HEALTH_PURPLE_VAPE);
                        entries.add(ModItems.INSTANT_HEALTH_MAGENTA_VAPE);
                        entries.add(ModItems.INSTANT_HEALTH_PINK_VAPE);
                        entries.add(ModItems.INSTANT_HEALTH_BROWN_VAPE);
                        entries.add(ModItems.INSTANT_HEALTH_WHITE_VAPE);
                        entries.add(ModItems.INSTANT_HEALTH_LIGHT_GRAY_VAPE);
                        entries.add(ModItems.INSTANT_HEALTH_GRAY_VAPE);
                        entries.add(ModItems.INSTANT_HEALTH_BLACK_VAPE);

                        entries.add(ModItems.INVISIBILITY_RED_VAPE);
                        entries.add(ModItems.INVISIBILITY_ORANGE_VAPE);
                        entries.add(ModItems.INVISIBILITY_YELLOW_VAPE);
                        entries.add(ModItems.INVISIBILITY_LIME_VAPE);
                        entries.add(ModItems.INVISIBILITY_GREEN_VAPE);
                        entries.add(ModItems.INVISIBILITY_CYAN_VAPE);
                        entries.add(ModItems.INVISIBILITY_LIGHT_BLUE_VAPE);
                        entries.add(ModItems.INVISIBILITY_BLUE_VAPE);
                        entries.add(ModItems.INVISIBILITY_PURPLE_VAPE);
                        entries.add(ModItems.INVISIBILITY_MAGENTA_VAPE);
                        entries.add(ModItems.INVISIBILITY_PINK_VAPE);
                        entries.add(ModItems.INVISIBILITY_BROWN_VAPE);
                        entries.add(ModItems.INVISIBILITY_WHITE_VAPE);
                        entries.add(ModItems.INVISIBILITY_LIGHT_GRAY_VAPE);
                        entries.add(ModItems.INVISIBILITY_GRAY_VAPE);
                        entries.add(ModItems.INVISIBILITY_BLACK_VAPE);

                        entries.add(ModItems.JUMP_BOOST_RED_VAPE);
                        entries.add(ModItems.JUMP_BOOST_ORANGE_VAPE);
                        entries.add(ModItems.JUMP_BOOST_YELLOW_VAPE);
                        entries.add(ModItems.JUMP_BOOST_LIME_VAPE);
                        entries.add(ModItems.JUMP_BOOST_GREEN_VAPE);
                        entries.add(ModItems.JUMP_BOOST_CYAN_VAPE);
                        entries.add(ModItems.JUMP_BOOST_LIGHT_BLUE_VAPE);
                        entries.add(ModItems.JUMP_BOOST_BLUE_VAPE);
                        entries.add(ModItems.JUMP_BOOST_PURPLE_VAPE);
                        entries.add(ModItems.JUMP_BOOST_MAGENTA_VAPE);
                        entries.add(ModItems.JUMP_BOOST_PINK_VAPE);
                        entries.add(ModItems.JUMP_BOOST_BROWN_VAPE);
                        entries.add(ModItems.JUMP_BOOST_WHITE_VAPE);
                        entries.add(ModItems.JUMP_BOOST_LIGHT_GRAY_VAPE);
                        entries.add(ModItems.JUMP_BOOST_GRAY_VAPE);
                        entries.add(ModItems.JUMP_BOOST_BLACK_VAPE);

                        entries.add(ModItems.LUCK_RED_VAPE);
                        entries.add(ModItems.LUCK_ORANGE_VAPE);
                        entries.add(ModItems.LUCK_YELLOW_VAPE);
                        entries.add(ModItems.LUCK_LIME_VAPE);
                        entries.add(ModItems.LUCK_GREEN_VAPE);
                        entries.add(ModItems.LUCK_CYAN_VAPE);
                        entries.add(ModItems.LUCK_LIGHT_BLUE_VAPE);
                        entries.add(ModItems.LUCK_BLUE_VAPE);
                        entries.add(ModItems.LUCK_PURPLE_VAPE);
                        entries.add(ModItems.LUCK_MAGENTA_VAPE);
                        entries.add(ModItems.LUCK_PINK_VAPE);
                        entries.add(ModItems.LUCK_BROWN_VAPE);
                        entries.add(ModItems.LUCK_WHITE_VAPE);
                        entries.add(ModItems.LUCK_LIGHT_GRAY_VAPE);
                        entries.add(ModItems.LUCK_GRAY_VAPE);
                        entries.add(ModItems.LUCK_BLACK_VAPE);

                        entries.add(ModItems.NIGHT_VISION_RED_VAPE);
                        entries.add(ModItems.NIGHT_VISION_ORANGE_VAPE);
                        entries.add(ModItems.NIGHT_VISION_YELLOW_VAPE);
                        entries.add(ModItems.NIGHT_VISION_LIME_VAPE);
                        entries.add(ModItems.NIGHT_VISION_GREEN_VAPE);
                        entries.add(ModItems.NIGHT_VISION_CYAN_VAPE);
                        entries.add(ModItems.NIGHT_VISION_LIGHT_BLUE_VAPE);
                        entries.add(ModItems.NIGHT_VISION_BLUE_VAPE);
                        entries.add(ModItems.NIGHT_VISION_PURPLE_VAPE);
                        entries.add(ModItems.NIGHT_VISION_MAGENTA_VAPE);
                        entries.add(ModItems.NIGHT_VISION_PINK_VAPE);
                        entries.add(ModItems.NIGHT_VISION_BROWN_VAPE);
                        entries.add(ModItems.NIGHT_VISION_WHITE_VAPE);
                        entries.add(ModItems.NIGHT_VISION_LIGHT_GRAY_VAPE);
                        entries.add(ModItems.NIGHT_VISION_GRAY_VAPE);
                        entries.add(ModItems.NIGHT_VISION_BLACK_VAPE);

                        entries.add(ModItems.POISON_RED_VAPE);
                        entries.add(ModItems.POISON_ORANGE_VAPE);
                        entries.add(ModItems.POISON_YELLOW_VAPE);
                        entries.add(ModItems.POISON_LIME_VAPE);
                        entries.add(ModItems.POISON_GREEN_VAPE);
                        entries.add(ModItems.POISON_CYAN_VAPE);
                        entries.add(ModItems.POISON_LIGHT_BLUE_VAPE);
                        entries.add(ModItems.POISON_BLUE_VAPE);
                        entries.add(ModItems.POISON_PURPLE_VAPE);
                        entries.add(ModItems.POISON_MAGENTA_VAPE);
                        entries.add(ModItems.POISON_PINK_VAPE);
                        entries.add(ModItems.POISON_BROWN_VAPE);
                        entries.add(ModItems.POISON_WHITE_VAPE);
                        entries.add(ModItems.POISON_LIGHT_GRAY_VAPE);
                        entries.add(ModItems.POISON_GRAY_VAPE);
                        entries.add(ModItems.POISON_BLACK_VAPE);

                        entries.add(ModItems.REGENERATION_RED_VAPE);
                        entries.add(ModItems.REGENERATION_ORANGE_VAPE);
                        entries.add(ModItems.REGENERATION_YELLOW_VAPE);
                        entries.add(ModItems.REGENERATION_LIME_VAPE);
                        entries.add(ModItems.REGENERATION_GREEN_VAPE);
                        entries.add(ModItems.REGENERATION_CYAN_VAPE);
                        entries.add(ModItems.REGENERATION_LIGHT_BLUE_VAPE);
                        entries.add(ModItems.REGENERATION_BLUE_VAPE);
                        entries.add(ModItems.REGENERATION_PURPLE_VAPE);
                        entries.add(ModItems.REGENERATION_MAGENTA_VAPE);
                        entries.add(ModItems.REGENERATION_PINK_VAPE);
                        entries.add(ModItems.REGENERATION_BROWN_VAPE);
                        entries.add(ModItems.REGENERATION_WHITE_VAPE);
                        entries.add(ModItems.REGENERATION_LIGHT_GRAY_VAPE);
                        entries.add(ModItems.REGENERATION_GRAY_VAPE);
                        entries.add(ModItems.REGENERATION_BLACK_VAPE);

                        entries.add(ModItems.SLOW_FALLING_RED_VAPE);
                        entries.add(ModItems.SLOW_FALLING_ORANGE_VAPE);
                        entries.add(ModItems.SLOW_FALLING_YELLOW_VAPE);
                        entries.add(ModItems.SLOW_FALLING_LIME_VAPE);
                        entries.add(ModItems.SLOW_FALLING_GREEN_VAPE);
                        entries.add(ModItems.SLOW_FALLING_CYAN_VAPE);
                        entries.add(ModItems.SLOW_FALLING_LIGHT_BLUE_VAPE);
                        entries.add(ModItems.SLOW_FALLING_BLUE_VAPE);
                        entries.add(ModItems.SLOW_FALLING_PURPLE_VAPE);
                        entries.add(ModItems.SLOW_FALLING_MAGENTA_VAPE);
                        entries.add(ModItems.SLOW_FALLING_PINK_VAPE);
                        entries.add(ModItems.SLOW_FALLING_BROWN_VAPE);
                        entries.add(ModItems.SLOW_FALLING_WHITE_VAPE);
                        entries.add(ModItems.SLOW_FALLING_LIGHT_GRAY_VAPE);
                        entries.add(ModItems.SLOW_FALLING_GRAY_VAPE);
                        entries.add(ModItems.SLOW_FALLING_BLACK_VAPE);

                        entries.add(ModItems.SLOWNESS_RED_VAPE);
                        entries.add(ModItems.SLOWNESS_ORANGE_VAPE);
                        entries.add(ModItems.SLOWNESS_YELLOW_VAPE);
                        entries.add(ModItems.SLOWNESS_LIME_VAPE);
                        entries.add(ModItems.SLOWNESS_GREEN_VAPE);
                        entries.add(ModItems.SLOWNESS_CYAN_VAPE);
                        entries.add(ModItems.SLOWNESS_LIGHT_BLUE_VAPE);
                        entries.add(ModItems.SLOWNESS_BLUE_VAPE);
                        entries.add(ModItems.SLOWNESS_PURPLE_VAPE);
                        entries.add(ModItems.SLOWNESS_MAGENTA_VAPE);
                        entries.add(ModItems.SLOWNESS_PINK_VAPE);
                        entries.add(ModItems.SLOWNESS_BROWN_VAPE);
                        entries.add(ModItems.SLOWNESS_WHITE_VAPE);
                        entries.add(ModItems.SLOWNESS_LIGHT_GRAY_VAPE);
                        entries.add(ModItems.SLOWNESS_GRAY_VAPE);
                        entries.add(ModItems.SLOWNESS_BLACK_VAPE);

                        entries.add(ModItems.STRENGTH_RED_VAPE);
                        entries.add(ModItems.STRENGTH_ORANGE_VAPE);
                        entries.add(ModItems.STRENGTH_YELLOW_VAPE);
                        entries.add(ModItems.STRENGTH_LIME_VAPE);
                        entries.add(ModItems.STRENGTH_GREEN_VAPE);
                        entries.add(ModItems.STRENGTH_CYAN_VAPE);
                        entries.add(ModItems.STRENGTH_LIGHT_BLUE_VAPE);
                        entries.add(ModItems.STRENGTH_BLUE_VAPE);
                        entries.add(ModItems.STRENGTH_PURPLE_VAPE);
                        entries.add(ModItems.STRENGTH_MAGENTA_VAPE);
                        entries.add(ModItems.STRENGTH_PINK_VAPE);
                        entries.add(ModItems.STRENGTH_BROWN_VAPE);
                        entries.add(ModItems.STRENGTH_WHITE_VAPE);
                        entries.add(ModItems.STRENGTH_LIGHT_GRAY_VAPE);
                        entries.add(ModItems.STRENGTH_GRAY_VAPE);
                        entries.add(ModItems.STRENGTH_BLACK_VAPE);

                        entries.add(ModItems.SWIFTNESS_RED_VAPE);
                        entries.add(ModItems.SWIFTNESS_ORANGE_VAPE);
                        entries.add(ModItems.SWIFTNESS_YELLOW_VAPE);
                        entries.add(ModItems.SWIFTNESS_LIME_VAPE);
                        entries.add(ModItems.SWIFTNESS_GREEN_VAPE);
                        entries.add(ModItems.SWIFTNESS_CYAN_VAPE);
                        entries.add(ModItems.SWIFTNESS_LIGHT_BLUE_VAPE);
                        entries.add(ModItems.SWIFTNESS_BLUE_VAPE);
                        entries.add(ModItems.SWIFTNESS_PURPLE_VAPE);
                        entries.add(ModItems.SWIFTNESS_MAGENTA_VAPE);
                        entries.add(ModItems.SWIFTNESS_PINK_VAPE);
                        entries.add(ModItems.SWIFTNESS_BROWN_VAPE);
                        entries.add(ModItems.SWIFTNESS_WHITE_VAPE);
                        entries.add(ModItems.SWIFTNESS_LIGHT_GRAY_VAPE);
                        entries.add(ModItems.SWIFTNESS_GRAY_VAPE);
                        entries.add(ModItems.SWIFTNESS_BLACK_VAPE);

                        entries.add(ModItems.TURTLE_MASTER_RED_VAPE);
                        entries.add(ModItems.TURTLE_MASTER_ORANGE_VAPE);
                        entries.add(ModItems.TURTLE_MASTER_YELLOW_VAPE);
                        entries.add(ModItems.TURTLE_MASTER_LIME_VAPE);
                        entries.add(ModItems.TURTLE_MASTER_GREEN_VAPE);
                        entries.add(ModItems.TURTLE_MASTER_CYAN_VAPE);
                        entries.add(ModItems.TURTLE_MASTER_LIGHT_BLUE_VAPE);
                        entries.add(ModItems.TURTLE_MASTER_BLUE_VAPE);
                        entries.add(ModItems.TURTLE_MASTER_PURPLE_VAPE);
                        entries.add(ModItems.TURTLE_MASTER_MAGENTA_VAPE);
                        entries.add(ModItems.TURTLE_MASTER_PINK_VAPE);
                        entries.add(ModItems.TURTLE_MASTER_BROWN_VAPE);
                        entries.add(ModItems.TURTLE_MASTER_WHITE_VAPE);
                        entries.add(ModItems.TURTLE_MASTER_LIGHT_GRAY_VAPE);
                        entries.add(ModItems.TURTLE_MASTER_GRAY_VAPE);
                        entries.add(ModItems.TURTLE_MASTER_BLACK_VAPE);

                        entries.add(ModItems.WATER_BREATHING_RED_VAPE);
                        entries.add(ModItems.WATER_BREATHING_ORANGE_VAPE);
                        entries.add(ModItems.WATER_BREATHING_YELLOW_VAPE);
                        entries.add(ModItems.WATER_BREATHING_LIME_VAPE);
                        entries.add(ModItems.WATER_BREATHING_GREEN_VAPE);
                        entries.add(ModItems.WATER_BREATHING_CYAN_VAPE);
                        entries.add(ModItems.WATER_BREATHING_LIGHT_BLUE_VAPE);
                        entries.add(ModItems.WATER_BREATHING_BLUE_VAPE);
                        entries.add(ModItems.WATER_BREATHING_PURPLE_VAPE);
                        entries.add(ModItems.WATER_BREATHING_MAGENTA_VAPE);
                        entries.add(ModItems.WATER_BREATHING_PINK_VAPE);
                        entries.add(ModItems.WATER_BREATHING_BROWN_VAPE);
                        entries.add(ModItems.WATER_BREATHING_WHITE_VAPE);
                        entries.add(ModItems.WATER_BREATHING_LIGHT_GRAY_VAPE);
                        entries.add(ModItems.WATER_BREATHING_GRAY_VAPE);
                        entries.add(ModItems.WATER_BREATHING_BLACK_VAPE);

                        entries.add(ModItems.WEAKNESS_RED_VAPE);
                        entries.add(ModItems.WEAKNESS_ORANGE_VAPE);
                        entries.add(ModItems.WEAKNESS_YELLOW_VAPE);
                        entries.add(ModItems.WEAKNESS_LIME_VAPE);
                        entries.add(ModItems.WEAKNESS_GREEN_VAPE);
                        entries.add(ModItems.WEAKNESS_CYAN_VAPE);
                        entries.add(ModItems.WEAKNESS_LIGHT_BLUE_VAPE);
                        entries.add(ModItems.WEAKNESS_BLUE_VAPE);
                        entries.add(ModItems.WEAKNESS_PURPLE_VAPE);
                        entries.add(ModItems.WEAKNESS_MAGENTA_VAPE);
                        entries.add(ModItems.WEAKNESS_PINK_VAPE);
                        entries.add(ModItems.WEAKNESS_BROWN_VAPE);
                        entries.add(ModItems.WEAKNESS_WHITE_VAPE);
                        entries.add(ModItems.WEAKNESS_LIGHT_GRAY_VAPE);
                        entries.add(ModItems.WEAKNESS_GRAY_VAPE);
                        entries.add(ModItems.WEAKNESS_BLACK_VAPE);

                        entries.add(ModItems.WITHER_RED_VAPE);
                        entries.add(ModItems.WITHER_ORANGE_VAPE);
                        entries.add(ModItems.WITHER_YELLOW_VAPE);
                        entries.add(ModItems.WITHER_LIME_VAPE);
                        entries.add(ModItems.WITHER_GREEN_VAPE);
                        entries.add(ModItems.WITHER_CYAN_VAPE);
                        entries.add(ModItems.WITHER_LIGHT_BLUE_VAPE);
                        entries.add(ModItems.WITHER_BLUE_VAPE);
                        entries.add(ModItems.WITHER_PURPLE_VAPE);
                        entries.add(ModItems.WITHER_MAGENTA_VAPE);
                        entries.add(ModItems.WITHER_PINK_VAPE);
                        entries.add(ModItems.WITHER_BROWN_VAPE);
                        entries.add(ModItems.WITHER_WHITE_VAPE);
                        entries.add(ModItems.WITHER_LIGHT_GRAY_VAPE);
                        entries.add(ModItems.WITHER_GRAY_VAPE);
                        entries.add(ModItems.WITHER_BLACK_VAPE);

                    }))
                    .build()
    );
    public static final ItemGroup VAPE_PODS_TAB = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(
                    Vapeaholic.MOD_ID,
                    "vape_pods_tab"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.vapeaholic.vape_pods_tab"))
                    .icon(() -> new ItemStack(ModItems.VAPE_POD))
                    .entries(((displayContext, entries) -> {
                        entries.add(ModItems.VAPE_POD);
                        entries.add(ModItems.WATER_VAPE_POD);
                        entries.add(ModItems.MUNDANE_VAPE_POD);
                        entries.add(ModItems.THICK_VAPE_POD);
                        entries.add(ModItems.AWKWARD_VAPE_POD);
                        entries.add(ModItems.FIRE_RESISTANCE_VAPE_POD);
                        entries.add(ModItems.INSTANT_DAMAGE_VAPE_POD);
                        entries.add(ModItems.INSTANT_HEALTH_VAPE_POD);
                        entries.add(ModItems.INVISIBILITY_VAPE_POD);
                        entries.add(ModItems.JUMP_BOOST_VAPE_POD);
                        entries.add(ModItems.LUCK_VAPE_POD);
                        entries.add(ModItems.NIGHT_VISION_VAPE_POD);
                        entries.add(ModItems.POISON_VAPE_POD);
                        entries.add(ModItems.REGENERATION_VAPE_POD);
                        entries.add(ModItems.SLOW_FALLING_VAPE_POD);
                        entries.add(ModItems.SLOWNESS_VAPE_POD);
                        entries.add(ModItems.STRENGTH_VAPE_POD);
                        entries.add(ModItems.SWIFTNESS_VAPE_POD);
                        entries.add(ModItems.TURTLE_MASTER_VAPE_POD);
                        entries.add(ModItems.WATER_BREATHING_VAPE_POD);
                        entries.add(ModItems.WEAKNESS_VAPE_POD);
                        entries.add(ModItems.WITHER_VAPE_POD);
                    }))
                    .build()
    );
    public static final ItemGroup VAPE_COMPONENTS_TAB = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(
                    Vapeaholic.MOD_ID,
                    "vape_components_tab"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.vapeaholic.vape_components_tab"))
                    .icon(() -> new ItemStack(ModItems.BATTERY))
                    .entries(((displayContext, entries) -> {
                        entries.add(ModItems.BATTERY);
                        entries.add(ModItems.COIL);
                        entries.add(ModItems.MOUTHPIECE);
                    }))
                    .build()
    );


    public static void registerModItemGroups() {
        Vapeaholic.LOGGER.info("Registering Mod Items Groups for " + Vapeaholic.MOD_ID);
    }
}
