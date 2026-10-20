package com.arta.vapeaholic.item;

import com.arta.vapeaholic.Vapeaholic;
import com.arta.vapeaholic.item.items.VapeItem;
import com.arta.vapeaholic.particle.ModParticleTypes;
import com.arta.vapeaholic.variable.ModVariables;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class ModItems {

    private static Item registerItem(String name, Function<Item.Properties, Item> itemFactory, Item.Properties properties) {
        ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Vapeaholic.MOD_ID, name));
        Item item = itemFactory.apply(properties.setId(key));
        return Registry.register(BuiltInRegistries.ITEM, key, item);
    }

    private static Item registerSimple(String name) {
        return registerItem(name, Item::new, new Item.Properties());
    }

    private static Item v(String name, String color, Supplier<SimpleParticleType> particle, List<Holder<MobEffect>> effects) {
        return registerItem(
            name,
            props -> new VapeItem(props, color, particle, effects),
            ModVariables.createVapeSettings()
        );
    }

    // Компоненты
    public static final Item BATTERY = registerSimple("battery");
    public static final Item COIL = registerSimple("coil");
    public static final Item MOUTHPIECE = registerSimple("mouthpiece");

    // Картриджи
    public static final Item VAPE_POD = registerSimple("vape_pod");
    public static final Item WATER_VAPE_POD = registerSimple("water_vape_pod");
    public static final Item MUNDANE_VAPE_POD = registerSimple("mundane_vape_pod");
    public static final Item THICK_VAPE_POD = registerSimple("thick_vape_pod");
    public static final Item AWKWARD_VAPE_POD = registerSimple("awkward_vape_pod");
    public static final Item FIRE_RESISTANCE_VAPE_POD = registerSimple("fire_resistance_vape_pod");
    public static final Item INSTANT_DAMAGE_VAPE_POD = registerSimple("instant_damage_vape_pod");
    public static final Item INSTANT_HEALTH_VAPE_POD = registerSimple("instant_health_vape_pod");
    public static final Item INVISIBILITY_VAPE_POD = registerSimple("invisibility_vape_pod");
    public static final Item JUMP_BOOST_VAPE_POD = registerSimple("jump_boost_vape_pod");
    public static final Item LUCK_VAPE_POD = registerSimple("luck_vape_pod");
    public static final Item NIGHT_VISION_VAPE_POD = registerSimple("night_vision_vape_pod");
    public static final Item POISON_VAPE_POD = registerSimple("poison_vape_pod");
    public static final Item REGENERATION_VAPE_POD = registerSimple("regeneration_vape_pod");
    public static final Item SLOW_FALLING_VAPE_POD = registerSimple("slow_falling_vape_pod");
    public static final Item SLOWNESS_VAPE_POD = registerSimple("slowness_vape_pod");
    public static final Item STRENGTH_VAPE_POD = registerSimple("strength_vape_pod");
    public static final Item SWIFTNESS_VAPE_POD = registerSimple("swiftness_vape_pod");
    public static final Item TURTLE_MASTER_VAPE_POD = registerSimple("turtle_master_vape_pod");
    public static final Item WATER_BREATHING_VAPE_POD = registerSimple("water_breathing_vape_pod");
    public static final Item WEAKNESS_VAPE_POD = registerSimple("weakness_vape_pod");
    public static final Item WITHER_VAPE_POD = registerSimple("wither_vape_pod");

    // Пустые вейпы
    public static final Item RED_VAPE = v("red_vape", "red", null, null);
    public static final Item ORANGE_VAPE = v("orange_vape", "orange", null, null);
    public static final Item YELLOW_VAPE = v("yellow_vape", "yellow", null, null);
    public static final Item LIME_VAPE = v("lime_vape", "lime", null, null);
    public static final Item GREEN_VAPE = v("green_vape", "green", null, null);
    public static final Item CYAN_VAPE = v("cyan_vape", "cyan", null, null);
    public static final Item LIGHT_BLUE_VAPE = v("light_blue_vape", "light_blue", null, null);
    public static final Item BLUE_VAPE = v("blue_vape", "blue", null, null);
    public static final Item PURPLE_VAPE = v("purple_vape", "purple", null, null);
    public static final Item MAGENTA_VAPE = v("magenta_vape", "magenta", null, null);
    public static final Item PINK_VAPE = v("pink_vape", "pink", null, null);
    public static final Item BROWN_VAPE = v("brown_vape", "brown", null, null);
    public static final Item WHITE_VAPE = v("white_vape", "white", null, null);
    public static final Item LIGHT_GRAY_VAPE = v("light_gray_vape", "light_gray", null, null);
    public static final Item GRAY_VAPE = v("gray_vape", "gray", null, null);
    public static final Item BLACK_VAPE = v("black_vape", "black", null, null);

    // Вода
    public static final Item WATER_RED_VAPE = v("water_red_vape", "red", () -> ModParticleTypes.WATER_PARTICLE, List.of());
    public static final Item WATER_ORANGE_VAPE = v("water_orange_vape", "orange", () -> ModParticleTypes.WATER_PARTICLE, List.of());
    public static final Item WATER_YELLOW_VAPE = v("water_yellow_vape", "yellow", () -> ModParticleTypes.WATER_PARTICLE, List.of());
    public static final Item WATER_LIME_VAPE = v("water_lime_vape", "lime", () -> ModParticleTypes.WATER_PARTICLE, List.of());
    public static final Item WATER_GREEN_VAPE = v("water_green_vape", "green", () -> ModParticleTypes.WATER_PARTICLE, List.of());
    public static final Item WATER_CYAN_VAPE = v("water_cyan_vape", "cyan", () -> ModParticleTypes.WATER_PARTICLE, List.of());
    public static final Item WATER_LIGHT_BLUE_VAPE = v("water_light_blue_vape", "light_blue", () -> ModParticleTypes.WATER_PARTICLE, List.of());
    public static final Item WATER_BLUE_VAPE = v("water_blue_vape", "blue", () -> ModParticleTypes.WATER_PARTICLE, List.of());
    public static final Item WATER_PURPLE_VAPE = v("water_purple_vape", "purple", () -> ModParticleTypes.WATER_PARTICLE, List.of());
    public static final Item WATER_MAGENTA_VAPE = v("water_magenta_vape", "magenta", () -> ModParticleTypes.WATER_PARTICLE, List.of());
    public static final Item WATER_PINK_VAPE = v("water_pink_vape", "pink", () -> ModParticleTypes.WATER_PARTICLE, List.of());
    public static final Item WATER_BROWN_VAPE = v("water_brown_vape", "brown", () -> ModParticleTypes.WATER_PARTICLE, List.of());
    public static final Item WATER_WHITE_VAPE = v("water_white_vape", "white", () -> ModParticleTypes.WATER_PARTICLE, List.of());
    public static final Item WATER_LIGHT_GRAY_VAPE = v("water_light_gray_vape", "light_gray", () -> ModParticleTypes.WATER_PARTICLE, List.of());
    public static final Item WATER_GRAY_VAPE = v("water_gray_vape", "gray", () -> ModParticleTypes.WATER_PARTICLE, List.of());
    public static final Item WATER_BLACK_VAPE = v("water_black_vape", "black", () -> ModParticleTypes.WATER_PARTICLE, List.of());

    // Регенерация
    public static final Item REGENERATION_RED_VAPE = v("regeneration_red_vape", "red", () -> ModParticleTypes.REGENERATION_PARTICLE, List.of(MobEffects.REGENERATION));
    public static final Item REGENERATION_ORANGE_VAPE = v("regeneration_orange_vape", "orange", () -> ModParticleTypes.REGENERATION_PARTICLE, List.of(MobEffects.REGENERATION));
    public static final Item REGENERATION_YELLOW_VAPE = v("regeneration_yellow_vape", "yellow", () -> ModParticleTypes.REGENERATION_PARTICLE, List.of(MobEffects.REGENERATION));
    public static final Item REGENERATION_LIME_VAPE = v("regeneration_lime_vape", "lime", () -> ModParticleTypes.REGENERATION_PARTICLE, List.of(MobEffects.REGENERATION));
    public static final Item REGENERATION_GREEN_VAPE = v("regeneration_green_vape", "green", () -> ModParticleTypes.REGENERATION_PARTICLE, List.of(MobEffects.REGENERATION));
    public static final Item REGENERATION_CYAN_VAPE = v("regeneration_cyan_vape", "cyan", () -> ModParticleTypes.REGENERATION_PARTICLE, List.of(MobEffects.REGENERATION));
    public static final Item REGENERATION_LIGHT_BLUE_VAPE = v("regeneration_light_blue_vape", "light_blue", () -> ModParticleTypes.REGENERATION_PARTICLE, List.of(MobEffects.REGENERATION));
    public static final Item REGENERATION_BLUE_VAPE = v("regeneration_blue_vape", "blue", () -> ModParticleTypes.REGENERATION_PARTICLE, List.of(MobEffects.REGENERATION));
    public static final Item REGENERATION_PURPLE_VAPE = v("regeneration_purple_vape", "purple", () -> ModParticleTypes.REGENERATION_PARTICLE, List.of(MobEffects.REGENERATION));
    public static final Item REGENERATION_MAGENTA_VAPE = v("regeneration_magenta_vape", "magenta", () -> ModParticleTypes.REGENERATION_PARTICLE, List.of(MobEffects.REGENERATION));
    public static final Item REGENERATION_PINK_VAPE = v("regeneration_pink_vape", "pink", () -> ModParticleTypes.REGENERATION_PARTICLE, List.of(MobEffects.REGENERATION));
    public static final Item REGENERATION_BROWN_VAPE = v("regeneration_brown_vape", "brown", () -> ModParticleTypes.REGENERATION_PARTICLE, List.of(MobEffects.REGENERATION));
    public static final Item REGENERATION_WHITE_VAPE = v("regeneration_white_vape", "white", () -> ModParticleTypes.REGENERATION_PARTICLE, List.of(MobEffects.REGENERATION));
    public static final Item REGENERATION_LIGHT_GRAY_VAPE = v("regeneration_light_gray_vape", "light_gray", () -> ModParticleTypes.REGENERATION_PARTICLE, List.of(MobEffects.REGENERATION));
    public static final Item REGENERATION_GRAY_VAPE = v("regeneration_gray_vape", "gray", () -> ModParticleTypes.REGENERATION_PARTICLE, List.of(MobEffects.REGENERATION));
    public static final Item REGENERATION_BLACK_VAPE = v("regeneration_black_vape", "black", () -> ModParticleTypes.REGENERATION_PARTICLE, List.of(MobEffects.REGENERATION));

    // Огнестойкость
    public static final Item FIRE_RESISTANCE_RED_VAPE = v("fire_resistance_red_vape", "red", () -> ModParticleTypes.FIRE_RESISTANCE_PARTICLE, List.of(MobEffects.FIRE_RESISTANCE));
    public static final Item FIRE_RESISTANCE_ORANGE_VAPE = v("fire_resistance_orange_vape", "orange", () -> ModParticleTypes.FIRE_RESISTANCE_PARTICLE, List.of(MobEffects.FIRE_RESISTANCE));
    public static final Item FIRE_RESISTANCE_YELLOW_VAPE = v("fire_resistance_yellow_vape", "yellow", () -> ModParticleTypes.FIRE_RESISTANCE_PARTICLE, List.of(MobEffects.FIRE_RESISTANCE));
    public static final Item FIRE_RESISTANCE_LIME_VAPE = v("fire_resistance_lime_vape", "lime", () -> ModParticleTypes.FIRE_RESISTANCE_PARTICLE, List.of(MobEffects.FIRE_RESISTANCE));
    public static final Item FIRE_RESISTANCE_GREEN_VAPE = v("fire_resistance_green_vape", "green", () -> ModParticleTypes.FIRE_RESISTANCE_PARTICLE, List.of(MobEffects.FIRE_RESISTANCE));
    public static final Item FIRE_RESISTANCE_CYAN_VAPE = v("fire_resistance_cyan_vape", "cyan", () -> ModParticleTypes.FIRE_RESISTANCE_PARTICLE, List.of(MobEffects.FIRE_RESISTANCE));
    public static final Item FIRE_RESISTANCE_LIGHT_BLUE_VAPE = v("fire_resistance_light_blue_vape", "light_blue", () -> ModParticleTypes.FIRE_RESISTANCE_PARTICLE, List.of(MobEffects.FIRE_RESISTANCE));
    public static final Item FIRE_RESISTANCE_BLUE_VAPE = v("fire_resistance_blue_vape", "blue", () -> ModParticleTypes.FIRE_RESISTANCE_PARTICLE, List.of(MobEffects.FIRE_RESISTANCE));
    public static final Item FIRE_RESISTANCE_PURPLE_VAPE = v("fire_resistance_purple_vape", "purple", () -> ModParticleTypes.FIRE_RESISTANCE_PARTICLE, List.of(MobEffects.FIRE_RESISTANCE));
    public static final Item FIRE_RESISTANCE_MAGENTA_VAPE = v("fire_resistance_magenta_vape", "magenta", () -> ModParticleTypes.FIRE_RESISTANCE_PARTICLE, List.of(MobEffects.FIRE_RESISTANCE));
    public static final Item FIRE_RESISTANCE_PINK_VAPE = v("fire_resistance_pink_vape", "pink", () -> ModParticleTypes.FIRE_RESISTANCE_PARTICLE, List.of(MobEffects.FIRE_RESISTANCE));
    public static final Item FIRE_RESISTANCE_BROWN_VAPE = v("fire_resistance_brown_vape", "brown", () -> ModParticleTypes.FIRE_RESISTANCE_PARTICLE, List.of(MobEffects.FIRE_RESISTANCE));
    public static final Item FIRE_RESISTANCE_WHITE_VAPE = v("fire_resistance_white_vape", "white", () -> ModParticleTypes.FIRE_RESISTANCE_PARTICLE, List.of(MobEffects.FIRE_RESISTANCE));
    public static final Item FIRE_RESISTANCE_LIGHT_GRAY_VAPE = v("fire_resistance_light_gray_vape", "light_gray", () -> ModParticleTypes.FIRE_RESISTANCE_PARTICLE, List.of(MobEffects.FIRE_RESISTANCE));
    public static final Item FIRE_RESISTANCE_GRAY_VAPE = v("fire_resistance_gray_vape", "gray", () -> ModParticleTypes.FIRE_RESISTANCE_PARTICLE, List.of(MobEffects.FIRE_RESISTANCE));
    public static final Item FIRE_RESISTANCE_BLACK_VAPE = v("fire_resistance_black_vape", "black", () -> ModParticleTypes.FIRE_RESISTANCE_PARTICLE, List.of(MobEffects.FIRE_RESISTANCE));

    // Мгновенный урон
    public static final Item INSTANT_DAMAGE_RED_VAPE = v("instant_damage_red_vape", "red", () -> ModParticleTypes.INSTANT_DAMAGE_PARTICLE, List.of(MobEffects.INSTANT_DAMAGE));
    public static final Item INSTANT_DAMAGE_ORANGE_VAPE = v("instant_damage_orange_vape", "orange", () -> ModParticleTypes.INSTANT_DAMAGE_PARTICLE, List.of(MobEffects.INSTANT_DAMAGE));
    public static final Item INSTANT_DAMAGE_YELLOW_VAPE = v("instant_damage_yellow_vape", "yellow", () -> ModParticleTypes.INSTANT_DAMAGE_PARTICLE, List.of(MobEffects.INSTANT_DAMAGE));
    public static final Item INSTANT_DAMAGE_LIME_VAPE = v("instant_damage_lime_vape", "lime", () -> ModParticleTypes.INSTANT_DAMAGE_PARTICLE, List.of(MobEffects.INSTANT_DAMAGE));
    public static final Item INSTANT_DAMAGE_GREEN_VAPE = v("instant_damage_green_vape", "green", () -> ModParticleTypes.INSTANT_DAMAGE_PARTICLE, List.of(MobEffects.INSTANT_DAMAGE));
    public static final Item INSTANT_DAMAGE_CYAN_VAPE = v("instant_damage_cyan_vape", "cyan", () -> ModParticleTypes.INSTANT_DAMAGE_PARTICLE, List.of(MobEffects.INSTANT_DAMAGE));
    public static final Item INSTANT_DAMAGE_LIGHT_BLUE_VAPE = v("instant_damage_light_blue_vape", "light_blue", () -> ModParticleTypes.INSTANT_DAMAGE_PARTICLE, List.of(MobEffects.INSTANT_DAMAGE));
    public static final Item INSTANT_DAMAGE_BLUE_VAPE = v("instant_damage_blue_vape", "blue", () -> ModParticleTypes.INSTANT_DAMAGE_PARTICLE, List.of(MobEffects.INSTANT_DAMAGE));
    public static final Item INSTANT_DAMAGE_PURPLE_VAPE = v("instant_damage_purple_vape", "purple", () -> ModParticleTypes.INSTANT_DAMAGE_PARTICLE, List.of(MobEffects.INSTANT_DAMAGE));
    public static final Item INSTANT_DAMAGE_MAGENTA_VAPE = v("instant_damage_magenta_vape", "magenta", () -> ModParticleTypes.INSTANT_DAMAGE_PARTICLE, List.of(MobEffects.INSTANT_DAMAGE));
    public static final Item INSTANT_DAMAGE_PINK_VAPE = v("instant_damage_pink_vape", "pink", () -> ModParticleTypes.INSTANT_DAMAGE_PARTICLE, List.of(MobEffects.INSTANT_DAMAGE));
    public static final Item INSTANT_DAMAGE_BROWN_VAPE = v("instant_damage_brown_vape", "brown", () -> ModParticleTypes.INSTANT_DAMAGE_PARTICLE, List.of(MobEffects.INSTANT_DAMAGE));
    public static final Item INSTANT_DAMAGE_WHITE_VAPE = v("instant_damage_white_vape", "white", () -> ModParticleTypes.INSTANT_DAMAGE_PARTICLE, List.of(MobEffects.INSTANT_DAMAGE));
    public static final Item INSTANT_DAMAGE_LIGHT_GRAY_VAPE = v("instant_damage_light_gray_vape", "light_gray", () -> ModParticleTypes.INSTANT_DAMAGE_PARTICLE, List.of(MobEffects.INSTANT_DAMAGE));
    public static final Item INSTANT_DAMAGE_GRAY_VAPE = v("instant_damage_gray_vape", "gray", () -> ModParticleTypes.INSTANT_DAMAGE_PARTICLE, List.of(MobEffects.INSTANT_DAMAGE));
    public static final Item INSTANT_DAMAGE_BLACK_VAPE = v("instant_damage_black_vape", "black", () -> ModParticleTypes.INSTANT_DAMAGE_PARTICLE, List.of(MobEffects.INSTANT_DAMAGE));

    // Мгновенное лечение
    public static final Item INSTANT_HEALTH_RED_VAPE = v("instant_health_red_vape", "red", () -> ModParticleTypes.INSTANT_HEALTH_PARTICLE, List.of(MobEffects.INSTANT_HEALTH));
    public static final Item INSTANT_HEALTH_ORANGE_VAPE = v("instant_health_orange_vape", "orange", () -> ModParticleTypes.INSTANT_HEALTH_PARTICLE, List.of(MobEffects.INSTANT_HEALTH));
    public static final Item INSTANT_HEALTH_YELLOW_VAPE = v("instant_health_yellow_vape", "yellow", () -> ModParticleTypes.INSTANT_HEALTH_PARTICLE, List.of(MobEffects.INSTANT_HEALTH));
    public static final Item INSTANT_HEALTH_LIME_VAPE = v("instant_health_lime_vape", "lime", () -> ModParticleTypes.INSTANT_HEALTH_PARTICLE, List.of(MobEffects.INSTANT_HEALTH));
    public static final Item INSTANT_HEALTH_GREEN_VAPE = v("instant_health_green_vape", "green", () -> ModParticleTypes.INSTANT_HEALTH_PARTICLE, List.of(MobEffects.INSTANT_HEALTH));
    public static final Item INSTANT_HEALTH_CYAN_VAPE = v("instant_health_cyan_vape", "cyan", () -> ModParticleTypes.INSTANT_HEALTH_PARTICLE, List.of(MobEffects.INSTANT_HEALTH));
    public static final Item INSTANT_HEALTH_LIGHT_BLUE_VAPE = v("instant_health_light_blue_vape", "light_blue", () -> ModParticleTypes.INSTANT_HEALTH_PARTICLE, List.of(MobEffects.INSTANT_HEALTH));
    public static final Item INSTANT_HEALTH_BLUE_VAPE = v("instant_health_blue_vape", "blue", () -> ModParticleTypes.INSTANT_HEALTH_PARTICLE, List.of(MobEffects.INSTANT_HEALTH));
    public static final Item INSTANT_HEALTH_PURPLE_VAPE = v("instant_health_purple_vape", "purple", () -> ModParticleTypes.INSTANT_HEALTH_PARTICLE, List.of(MobEffects.INSTANT_HEALTH));
    public static final Item INSTANT_HEALTH_MAGENTA_VAPE = v("instant_health_magenta_vape", "magenta", () -> ModParticleTypes.INSTANT_HEALTH_PARTICLE, List.of(MobEffects.INSTANT_HEALTH));
    public static final Item INSTANT_HEALTH_PINK_VAPE = v("instant_health_pink_vape", "pink", () -> ModParticleTypes.INSTANT_HEALTH_PARTICLE, List.of(MobEffects.INSTANT_HEALTH));
    public static final Item INSTANT_HEALTH_BROWN_VAPE = v("instant_health_brown_vape", "brown", () -> ModParticleTypes.INSTANT_HEALTH_PARTICLE, List.of(MobEffects.INSTANT_HEALTH));
    public static final Item INSTANT_HEALTH_WHITE_VAPE = v("instant_health_white_vape", "white", () -> ModParticleTypes.INSTANT_HEALTH_PARTICLE, List.of(MobEffects.INSTANT_HEALTH));
    public static final Item INSTANT_HEALTH_LIGHT_GRAY_VAPE = v("instant_health_light_gray_vape", "light_gray", () -> ModParticleTypes.INSTANT_HEALTH_PARTICLE, List.of(MobEffects.INSTANT_HEALTH));
    public static final Item INSTANT_HEALTH_GRAY_VAPE = v("instant_health_gray_vape", "gray", () -> ModParticleTypes.INSTANT_HEALTH_PARTICLE, List.of(MobEffects.INSTANT_HEALTH));
    public static final Item INSTANT_HEALTH_BLACK_VAPE = v("instant_health_black_vape", "black", () -> ModParticleTypes.INSTANT_HEALTH_PARTICLE, List.of(MobEffects.INSTANT_HEALTH));

    // Невидимость
    public static final Item INVISIBILITY_RED_VAPE = v("invisibility_red_vape", "red", () -> ModParticleTypes.WATER_PARTICLE, List.of(MobEffects.INVISIBILITY));
    public static final Item INVISIBILITY_ORANGE_VAPE = v("invisibility_orange_vape", "orange", () -> ModParticleTypes.WATER_PARTICLE, List.of(MobEffects.INVISIBILITY));
    public static final Item INVISIBILITY_YELLOW_VAPE = v("invisibility_yellow_vape", "yellow", () -> ModParticleTypes.WATER_PARTICLE, List.of(MobEffects.INVISIBILITY));
    public static final Item INVISIBILITY_LIME_VAPE = v("invisibility_lime_vape", "lime", () -> ModParticleTypes.WATER_PARTICLE, List.of(MobEffects.INVISIBILITY));
    public static final Item INVISIBILITY_GREEN_VAPE = v("invisibility_green_vape", "green", () -> ModParticleTypes.WATER_PARTICLE, List.of(MobEffects.INVISIBILITY));
    public static final Item INVISIBILITY_CYAN_VAPE = v("invisibility_cyan_vape", "cyan", () -> ModParticleTypes.WATER_PARTICLE, List.of(MobEffects.INVISIBILITY));
    public static final Item INVISIBILITY_LIGHT_BLUE_VAPE = v("invisibility_light_blue_vape", "light_blue", () -> ModParticleTypes.WATER_PARTICLE, List.of(MobEffects.INVISIBILITY));
    public static final Item INVISIBILITY_BLUE_VAPE = v("invisibility_blue_vape", "blue", () -> ModParticleTypes.WATER_PARTICLE, List.of(MobEffects.INVISIBILITY));
    public static final Item INVISIBILITY_PURPLE_VAPE = v("invisibility_purple_vape", "purple", () -> ModParticleTypes.WATER_PARTICLE, List.of(MobEffects.INVISIBILITY));
    public static final Item INVISIBILITY_MAGENTA_VAPE = v("invisibility_magenta_vape", "magenta", () -> ModParticleTypes.WATER_PARTICLE, List.of(MobEffects.INVISIBILITY));
    public static final Item INVISIBILITY_PINK_VAPE = v("invisibility_pink_vape", "pink", () -> ModParticleTypes.WATER_PARTICLE, List.of(MobEffects.INVISIBILITY));
    public static final Item INVISIBILITY_BROWN_VAPE = v("invisibility_brown_vape", "brown", () -> ModParticleTypes.WATER_PARTICLE, List.of(MobEffects.INVISIBILITY));
    public static final Item INVISIBILITY_WHITE_VAPE = v("invisibility_white_vape", "white", () -> ModParticleTypes.WATER_PARTICLE, List.of(MobEffects.INVISIBILITY));
    public static final Item INVISIBILITY_LIGHT_GRAY_VAPE = v("invisibility_light_gray_vape", "light_gray", () -> ModParticleTypes.WATER_PARTICLE, List.of(MobEffects.INVISIBILITY));
    public static final Item INVISIBILITY_GRAY_VAPE = v("invisibility_gray_vape", "gray", () -> ModParticleTypes.WATER_PARTICLE, List.of(MobEffects.INVISIBILITY));
    public static final Item INVISIBILITY_BLACK_VAPE = v("invisibility_black_vape", "black", () -> ModParticleTypes.WATER_PARTICLE, List.of(MobEffects.INVISIBILITY));

    // Прыгучесть
    public static final Item JUMP_BOOST_RED_VAPE = v("jump_boost_red_vape", "red", () -> ModParticleTypes.JUMP_BOOST_PARTICLE, List.of(MobEffects.JUMP_BOOST));
    public static final Item JUMP_BOOST_ORANGE_VAPE = v("jump_boost_orange_vape", "orange", () -> ModParticleTypes.JUMP_BOOST_PARTICLE, List.of(MobEffects.JUMP_BOOST));
    public static final Item JUMP_BOOST_YELLOW_VAPE = v("jump_boost_yellow_vape", "yellow", () -> ModParticleTypes.JUMP_BOOST_PARTICLE, List.of(MobEffects.JUMP_BOOST));
    public static final Item JUMP_BOOST_LIME_VAPE = v("jump_boost_lime_vape", "lime", () -> ModParticleTypes.JUMP_BOOST_PARTICLE, List.of(MobEffects.JUMP_BOOST));
    public static final Item JUMP_BOOST_GREEN_VAPE = v("jump_boost_green_vape", "green", () -> ModParticleTypes.JUMP_BOOST_PARTICLE, List.of(MobEffects.JUMP_BOOST));
    public static final Item JUMP_BOOST_CYAN_VAPE = v("jump_boost_cyan_vape", "cyan", () -> ModParticleTypes.JUMP_BOOST_PARTICLE, List.of(MobEffects.JUMP_BOOST));
    public static final Item JUMP_BOOST_LIGHT_BLUE_VAPE = v("jump_boost_light_blue_vape", "light_blue", () -> ModParticleTypes.JUMP_BOOST_PARTICLE, List.of(MobEffects.JUMP_BOOST));
    public static final Item JUMP_BOOST_BLUE_VAPE = v("jump_boost_blue_vape", "blue", () -> ModParticleTypes.JUMP_BOOST_PARTICLE, List.of(MobEffects.JUMP_BOOST));
    public static final Item JUMP_BOOST_PURPLE_VAPE = v("jump_boost_purple_vape", "purple", () -> ModParticleTypes.JUMP_BOOST_PARTICLE, List.of(MobEffects.JUMP_BOOST));
    public static final Item JUMP_BOOST_MAGENTA_VAPE = v("jump_boost_magenta_vape", "magenta", () -> ModParticleTypes.JUMP_BOOST_PARTICLE, List.of(MobEffects.JUMP_BOOST));
    public static final Item JUMP_BOOST_PINK_VAPE = v("jump_boost_pink_vape", "pink", () -> ModParticleTypes.JUMP_BOOST_PARTICLE, List.of(MobEffects.JUMP_BOOST));
    public static final Item JUMP_BOOST_BROWN_VAPE = v("jump_boost_brown_vape", "brown", () -> ModParticleTypes.JUMP_BOOST_PARTICLE, List.of(MobEffects.JUMP_BOOST));
    public static final Item JUMP_BOOST_WHITE_VAPE = v("jump_boost_white_vape", "white", () -> ModParticleTypes.JUMP_BOOST_PARTICLE, List.of(MobEffects.JUMP_BOOST));
    public static final Item JUMP_BOOST_LIGHT_GRAY_VAPE = v("jump_boost_light_gray_vape", "light_gray", () -> ModParticleTypes.JUMP_BOOST_PARTICLE, List.of(MobEffects.JUMP_BOOST));
    public static final Item JUMP_BOOST_GRAY_VAPE = v("jump_boost_gray_vape", "gray", () -> ModParticleTypes.JUMP_BOOST_PARTICLE, List.of(MobEffects.JUMP_BOOST));
    public static final Item JUMP_BOOST_BLACK_VAPE = v("jump_boost_black_vape", "black", () -> ModParticleTypes.JUMP_BOOST_PARTICLE, List.of(MobEffects.JUMP_BOOST));

    // Удача
    public static final Item LUCK_RED_VAPE = v("luck_red_vape", "red", () -> ModParticleTypes.LUCK_PARTICLE, List.of(MobEffects.LUCK));
    public static final Item LUCK_ORANGE_VAPE = v("luck_orange_vape", "orange", () -> ModParticleTypes.LUCK_PARTICLE, List.of(MobEffects.LUCK));
    public static final Item LUCK_YELLOW_VAPE = v("luck_yellow_vape", "yellow", () -> ModParticleTypes.LUCK_PARTICLE, List.of(MobEffects.LUCK));
    public static final Item LUCK_LIME_VAPE = v("luck_lime_vape", "lime", () -> ModParticleTypes.LUCK_PARTICLE, List.of(MobEffects.LUCK));
    public static final Item LUCK_GREEN_VAPE = v("luck_green_vape", "green", () -> ModParticleTypes.LUCK_PARTICLE, List.of(MobEffects.LUCK));
    public static final Item LUCK_CYAN_VAPE = v("luck_cyan_vape", "cyan", () -> ModParticleTypes.LUCK_PARTICLE, List.of(MobEffects.LUCK));
    public static final Item LUCK_LIGHT_BLUE_VAPE = v("luck_light_blue_vape", "light_blue", () -> ModParticleTypes.LUCK_PARTICLE, List.of(MobEffects.LUCK));
    public static final Item LUCK_BLUE_VAPE = v("luck_blue_vape", "blue", () -> ModParticleTypes.LUCK_PARTICLE, List.of(MobEffects.LUCK));
    public static final Item LUCK_PURPLE_VAPE = v("luck_purple_vape", "purple", () -> ModParticleTypes.LUCK_PARTICLE, List.of(MobEffects.LUCK));
    public static final Item LUCK_MAGENTA_VAPE = v("luck_magenta_vape", "magenta", () -> ModParticleTypes.LUCK_PARTICLE, List.of(MobEffects.LUCK));
    public static final Item LUCK_PINK_VAPE = v("luck_pink_vape", "pink", () -> ModParticleTypes.LUCK_PARTICLE, List.of(MobEffects.LUCK));
    public static final Item LUCK_BROWN_VAPE = v("luck_brown_vape", "brown", () -> ModParticleTypes.LUCK_PARTICLE, List.of(MobEffects.LUCK));
    public static final Item LUCK_WHITE_VAPE = v("luck_white_vape", "white", () -> ModParticleTypes.LUCK_PARTICLE, List.of(MobEffects.LUCK));
    public static final Item LUCK_LIGHT_GRAY_VAPE = v("luck_light_gray_vape", "light_gray", () -> ModParticleTypes.LUCK_PARTICLE, List.of(MobEffects.LUCK));
    public static final Item LUCK_GRAY_VAPE = v("luck_gray_vape", "gray", () -> ModParticleTypes.LUCK_PARTICLE, List.of(MobEffects.LUCK));
    public static final Item LUCK_BLACK_VAPE = v("luck_black_vape", "black", () -> ModParticleTypes.LUCK_PARTICLE, List.of(MobEffects.LUCK));

    // Ночное зрение
    public static final Item NIGHT_VISION_RED_VAPE = v("night_vision_red_vape", "red", () -> ModParticleTypes.NIGHT_VISION_PARTICLE, List.of(MobEffects.NIGHT_VISION));
    public static final Item NIGHT_VISION_ORANGE_VAPE = v("night_vision_orange_vape", "orange", () -> ModParticleTypes.NIGHT_VISION_PARTICLE, List.of(MobEffects.NIGHT_VISION));
    public static final Item NIGHT_VISION_YELLOW_VAPE = v("night_vision_yellow_vape", "yellow", () -> ModParticleTypes.NIGHT_VISION_PARTICLE, List.of(MobEffects.NIGHT_VISION));
    public static final Item NIGHT_VISION_LIME_VAPE = v("night_vision_lime_vape", "lime", () -> ModParticleTypes.NIGHT_VISION_PARTICLE, List.of(MobEffects.NIGHT_VISION));
    public static final Item NIGHT_VISION_GREEN_VAPE = v("night_vision_green_vape", "green", () -> ModParticleTypes.NIGHT_VISION_PARTICLE, List.of(MobEffects.NIGHT_VISION));
    public static final Item NIGHT_VISION_CYAN_VAPE = v("night_vision_cyan_vape", "cyan", () -> ModParticleTypes.NIGHT_VISION_PARTICLE, List.of(MobEffects.NIGHT_VISION));
    public static final Item NIGHT_VISION_LIGHT_BLUE_VAPE = v("night_vision_light_blue_vape", "light_blue", () -> ModParticleTypes.NIGHT_VISION_PARTICLE, List.of(MobEffects.NIGHT_VISION));
    public static final Item NIGHT_VISION_BLUE_VAPE = v("night_vision_blue_vape", "blue", () -> ModParticleTypes.NIGHT_VISION_PARTICLE, List.of(MobEffects.NIGHT_VISION));
    public static final Item NIGHT_VISION_PURPLE_VAPE = v("night_vision_purple_vape", "purple", () -> ModParticleTypes.NIGHT_VISION_PARTICLE, List.of(MobEffects.NIGHT_VISION));
    public static final Item NIGHT_VISION_MAGENTA_VAPE = v("night_vision_magenta_vape", "magenta", () -> ModParticleTypes.NIGHT_VISION_PARTICLE, List.of(MobEffects.NIGHT_VISION));
    public static final Item NIGHT_VISION_PINK_VAPE = v("night_vision_pink_vape", "pink", () -> ModParticleTypes.NIGHT_VISION_PARTICLE, List.of(MobEffects.NIGHT_VISION));
    public static final Item NIGHT_VISION_BROWN_VAPE = v("night_vision_brown_vape", "brown", () -> ModParticleTypes.NIGHT_VISION_PARTICLE, List.of(MobEffects.NIGHT_VISION));
    public static final Item NIGHT_VISION_WHITE_VAPE = v("night_vision_white_vape", "white", () -> ModParticleTypes.NIGHT_VISION_PARTICLE, List.of(MobEffects.NIGHT_VISION));
    public static final Item NIGHT_VISION_LIGHT_GRAY_VAPE = v("night_vision_light_gray_vape", "light_gray", () -> ModParticleTypes.NIGHT_VISION_PARTICLE, List.of(MobEffects.NIGHT_VISION));
    public static final Item NIGHT_VISION_GRAY_VAPE = v("night_vision_gray_vape", "gray", () -> ModParticleTypes.NIGHT_VISION_PARTICLE, List.of(MobEffects.NIGHT_VISION));
    public static final Item NIGHT_VISION_BLACK_VAPE = v("night_vision_black_vape", "black", () -> ModParticleTypes.NIGHT_VISION_PARTICLE, List.of(MobEffects.NIGHT_VISION));

    // Отрава
    public static final Item POISON_RED_VAPE = v("poison_red_vape", "red", () -> ModParticleTypes.POISON_PARTICLE, List.of(MobEffects.POISON));
    public static final Item POISON_ORANGE_VAPE = v("poison_orange_vape", "orange", () -> ModParticleTypes.POISON_PARTICLE, List.of(MobEffects.POISON));
    public static final Item POISON_YELLOW_VAPE = v("poison_yellow_vape", "yellow", () -> ModParticleTypes.POISON_PARTICLE, List.of(MobEffects.POISON));
    public static final Item POISON_LIME_VAPE = v("poison_lime_vape", "lime", () -> ModParticleTypes.POISON_PARTICLE, List.of(MobEffects.POISON));
    public static final Item POISON_GREEN_VAPE = v("poison_green_vape", "green", () -> ModParticleTypes.POISON_PARTICLE, List.of(MobEffects.POISON));
    public static final Item POISON_CYAN_VAPE = v("poison_cyan_vape", "cyan", () -> ModParticleTypes.POISON_PARTICLE, List.of(MobEffects.POISON));
    public static final Item POISON_LIGHT_BLUE_VAPE = v("poison_light_blue_vape", "light_blue", () -> ModParticleTypes.POISON_PARTICLE, List.of(MobEffects.POISON));
    public static final Item POISON_BLUE_VAPE = v("poison_blue_vape", "blue", () -> ModParticleTypes.POISON_PARTICLE, List.of(MobEffects.POISON));
    public static final Item POISON_PURPLE_VAPE = v("poison_purple_vape", "purple", () -> ModParticleTypes.POISON_PARTICLE, List.of(MobEffects.POISON));
    public static final Item POISON_MAGENTA_VAPE = v("poison_magenta_vape", "magenta", () -> ModParticleTypes.POISON_PARTICLE, List.of(MobEffects.POISON));
    public static final Item POISON_PINK_VAPE = v("poison_pink_vape", "pink", () -> ModParticleTypes.POISON_PARTICLE, List.of(MobEffects.POISON));
    public static final Item POISON_BROWN_VAPE = v("poison_brown_vape", "brown", () -> ModParticleTypes.POISON_PARTICLE, List.of(MobEffects.POISON));
    public static final Item POISON_WHITE_VAPE = v("poison_white_vape", "white", () -> ModParticleTypes.POISON_PARTICLE, List.of(MobEffects.POISON));
    public static final Item POISON_LIGHT_GRAY_VAPE = v("poison_light_gray_vape", "light_gray", () -> ModParticleTypes.POISON_PARTICLE, List.of(MobEffects.POISON));
    public static final Item POISON_GRAY_VAPE = v("poison_gray_vape", "gray", () -> ModParticleTypes.POISON_PARTICLE, List.of(MobEffects.POISON));
    public static final Item POISON_BLACK_VAPE = v("poison_black_vape", "black", () -> ModParticleTypes.POISON_PARTICLE, List.of(MobEffects.POISON));

    // Плавное падение
    public static final Item SLOW_FALLING_RED_VAPE = v("slow_falling_red_vape", "red", () -> ModParticleTypes.SLOW_FALLING_PARTICLE, List.of(MobEffects.SLOW_FALLING));
    public static final Item SLOW_FALLING_ORANGE_VAPE = v("slow_falling_orange_vape", "orange", () -> ModParticleTypes.SLOW_FALLING_PARTICLE, List.of(MobEffects.SLOW_FALLING));
    public static final Item SLOW_FALLING_YELLOW_VAPE = v("slow_falling_yellow_vape", "yellow", () -> ModParticleTypes.SLOW_FALLING_PARTICLE, List.of(MobEffects.SLOW_FALLING));
    public static final Item SLOW_FALLING_LIME_VAPE = v("slow_falling_lime_vape", "lime", () -> ModParticleTypes.SLOW_FALLING_PARTICLE, List.of(MobEffects.SLOW_FALLING));
    public static final Item SLOW_FALLING_GREEN_VAPE = v("slow_falling_green_vape", "green", () -> ModParticleTypes.SLOW_FALLING_PARTICLE, List.of(MobEffects.SLOW_FALLING));
    public static final Item SLOW_FALLING_CYAN_VAPE = v("slow_falling_cyan_vape", "cyan", () -> ModParticleTypes.SLOW_FALLING_PARTICLE, List.of(MobEffects.SLOW_FALLING));
    public static final Item SLOW_FALLING_LIGHT_BLUE_VAPE = v("slow_falling_light_blue_vape", "light_blue", () -> ModParticleTypes.SLOW_FALLING_PARTICLE, List.of(MobEffects.SLOW_FALLING));
    public static final Item SLOW_FALLING_BLUE_VAPE = v("slow_falling_blue_vape", "blue", () -> ModParticleTypes.SLOW_FALLING_PARTICLE, List.of(MobEffects.SLOW_FALLING));
    public static final Item SLOW_FALLING_PURPLE_VAPE = v("slow_falling_purple_vape", "purple", () -> ModParticleTypes.SLOW_FALLING_PARTICLE, List.of(MobEffects.SLOW_FALLING));
    public static final Item SLOW_FALLING_MAGENTA_VAPE = v("slow_falling_magenta_vape", "magenta", () -> ModParticleTypes.SLOW_FALLING_PARTICLE, List.of(MobEffects.SLOW_FALLING));
    public static final Item SLOW_FALLING_PINK_VAPE = v("slow_falling_pink_vape", "pink", () -> ModParticleTypes.SLOW_FALLING_PARTICLE, List.of(MobEffects.SLOW_FALLING));
    public static final Item SLOW_FALLING_BROWN_VAPE = v("slow_falling_brown_vape", "brown", () -> ModParticleTypes.SLOW_FALLING_PARTICLE, List.of(MobEffects.SLOW_FALLING));
    public static final Item SLOW_FALLING_WHITE_VAPE = v("slow_falling_white_vape", "white", () -> ModParticleTypes.SLOW_FALLING_PARTICLE, List.of(MobEffects.SLOW_FALLING));
    public static final Item SLOW_FALLING_LIGHT_GRAY_VAPE = v("slow_falling_light_gray_vape", "light_gray", () -> ModParticleTypes.SLOW_FALLING_PARTICLE, List.of(MobEffects.SLOW_FALLING));
    public static final Item SLOW_FALLING_GRAY_VAPE = v("slow_falling_gray_vape", "gray", () -> ModParticleTypes.SLOW_FALLING_PARTICLE, List.of(MobEffects.SLOW_FALLING));
    public static final Item SLOW_FALLING_BLACK_VAPE = v("slow_falling_black_vape", "black", () -> ModParticleTypes.SLOW_FALLING_PARTICLE, List.of(MobEffects.SLOW_FALLING));

    // Замедление
    public static final Item SLOWNESS_RED_VAPE = v("slowness_red_vape", "red", () -> ModParticleTypes.SLOWNESS_PARTICLE, List.of(MobEffects.SLOWNESS));
    public static final Item SLOWNESS_ORANGE_VAPE = v("slowness_orange_vape", "orange", () -> ModParticleTypes.SLOWNESS_PARTICLE, List.of(MobEffects.SLOWNESS));
    public static final Item SLOWNESS_YELLOW_VAPE = v("slowness_yellow_vape", "yellow", () -> ModParticleTypes.SLOWNESS_PARTICLE, List.of(MobEffects.SLOWNESS));
    public static final Item SLOWNESS_LIME_VAPE = v("slowness_lime_vape", "lime", () -> ModParticleTypes.SLOWNESS_PARTICLE, List.of(MobEffects.SLOWNESS));
    public static final Item SLOWNESS_GREEN_VAPE = v("slowness_green_vape", "green", () -> ModParticleTypes.SLOWNESS_PARTICLE, List.of(MobEffects.SLOWNESS));
    public static final Item SLOWNESS_CYAN_VAPE = v("slowness_cyan_vape", "cyan", () -> ModParticleTypes.SLOWNESS_PARTICLE, List.of(MobEffects.SLOWNESS));
    public static final Item SLOWNESS_LIGHT_BLUE_VAPE = v("slowness_light_blue_vape", "light_blue", () -> ModParticleTypes.SLOWNESS_PARTICLE, List.of(MobEffects.SLOWNESS));
    public static final Item SLOWNESS_BLUE_VAPE = v("slowness_blue_vape", "blue", () -> ModParticleTypes.SLOWNESS_PARTICLE, List.of(MobEffects.SLOWNESS));
    public static final Item SLOWNESS_PURPLE_VAPE = v("slowness_purple_vape", "purple", () -> ModParticleTypes.SLOWNESS_PARTICLE, List.of(MobEffects.SLOWNESS));
    public static final Item SLOWNESS_MAGENTA_VAPE = v("slowness_magenta_vape", "magenta", () -> ModParticleTypes.SLOWNESS_PARTICLE, List.of(MobEffects.SLOWNESS));
    public static final Item SLOWNESS_PINK_VAPE = v("slowness_pink_vape", "pink", () -> ModParticleTypes.SLOWNESS_PARTICLE, List.of(MobEffects.SLOWNESS));
    public static final Item SLOWNESS_BROWN_VAPE = v("slowness_brown_vape", "brown", () -> ModParticleTypes.SLOWNESS_PARTICLE, List.of(MobEffects.SLOWNESS));
    public static final Item SLOWNESS_WHITE_VAPE = v("slowness_white_vape", "white", () -> ModParticleTypes.SLOWNESS_PARTICLE, List.of(MobEffects.SLOWNESS));
    public static final Item SLOWNESS_LIGHT_GRAY_VAPE = v("slowness_light_gray_vape", "light_gray", () -> ModParticleTypes.SLOWNESS_PARTICLE, List.of(MobEffects.SLOWNESS));
    public static final Item SLOWNESS_GRAY_VAPE = v("slowness_gray_vape", "gray", () -> ModParticleTypes.SLOWNESS_PARTICLE, List.of(MobEffects.SLOWNESS));
    public static final Item SLOWNESS_BLACK_VAPE = v("slowness_black_vape", "black", () -> ModParticleTypes.SLOWNESS_PARTICLE, List.of(MobEffects.SLOWNESS));

    // Сила
    public static final Item STRENGTH_RED_VAPE = v("strength_red_vape", "red", () -> ModParticleTypes.STRENGTH_PARTICLE, List.of(MobEffects.STRENGTH));
    public static final Item STRENGTH_ORANGE_VAPE = v("strength_orange_vape", "orange", () -> ModParticleTypes.STRENGTH_PARTICLE, List.of(MobEffects.STRENGTH));
    public static final Item STRENGTH_YELLOW_VAPE = v("strength_yellow_vape", "yellow", () -> ModParticleTypes.STRENGTH_PARTICLE, List.of(MobEffects.STRENGTH));
    public static final Item STRENGTH_LIME_VAPE = v("strength_lime_vape", "lime", () -> ModParticleTypes.STRENGTH_PARTICLE, List.of(MobEffects.STRENGTH));
    public static final Item STRENGTH_GREEN_VAPE = v("strength_green_vape", "green", () -> ModParticleTypes.STRENGTH_PARTICLE, List.of(MobEffects.STRENGTH));
    public static final Item STRENGTH_CYAN_VAPE = v("strength_cyan_vape", "cyan", () -> ModParticleTypes.STRENGTH_PARTICLE, List.of(MobEffects.STRENGTH));
    public static final Item STRENGTH_LIGHT_BLUE_VAPE = v("strength_light_blue_vape", "light_blue", () -> ModParticleTypes.STRENGTH_PARTICLE, List.of(MobEffects.STRENGTH));
    public static final Item STRENGTH_BLUE_VAPE = v("strength_blue_vape", "blue", () -> ModParticleTypes.STRENGTH_PARTICLE, List.of(MobEffects.STRENGTH));
    public static final Item STRENGTH_PURPLE_VAPE = v("strength_purple_vape", "purple", () -> ModParticleTypes.STRENGTH_PARTICLE, List.of(MobEffects.STRENGTH));
    public static final Item STRENGTH_MAGENTA_VAPE = v("strength_magenta_vape", "magenta", () -> ModParticleTypes.STRENGTH_PARTICLE, List.of(MobEffects.STRENGTH));
    public static final Item STRENGTH_PINK_VAPE = v("strength_pink_vape", "pink", () -> ModParticleTypes.STRENGTH_PARTICLE, List.of(MobEffects.STRENGTH));
    public static final Item STRENGTH_BROWN_VAPE = v("strength_brown_vape", "brown", () -> ModParticleTypes.STRENGTH_PARTICLE, List.of(MobEffects.STRENGTH));
    public static final Item STRENGTH_WHITE_VAPE = v("strength_white_vape", "white", () -> ModParticleTypes.STRENGTH_PARTICLE, List.of(MobEffects.STRENGTH));
    public static final Item STRENGTH_LIGHT_GRAY_VAPE = v("strength_light_gray_vape", "light_gray", () -> ModParticleTypes.STRENGTH_PARTICLE, List.of(MobEffects.STRENGTH));
    public static final Item STRENGTH_GRAY_VAPE = v("strength_gray_vape", "gray", () -> ModParticleTypes.STRENGTH_PARTICLE, List.of(MobEffects.STRENGTH));
    public static final Item STRENGTH_BLACK_VAPE = v("strength_black_vape", "black", () -> ModParticleTypes.STRENGTH_PARTICLE, List.of(MobEffects.STRENGTH));

    // Скорость
    public static final Item SWIFTNESS_RED_VAPE = v("swiftness_red_vape", "red", () -> ModParticleTypes.SWIFTNESS_PARTICLE, List.of(MobEffects.SPEED));
    public static final Item SWIFTNESS_ORANGE_VAPE = v("swiftness_orange_vape", "orange", () -> ModParticleTypes.SWIFTNESS_PARTICLE, List.of(MobEffects.SPEED));
    public static final Item SWIFTNESS_YELLOW_VAPE = v("swiftness_yellow_vape", "yellow", () -> ModParticleTypes.SWIFTNESS_PARTICLE, List.of(MobEffects.SPEED));
    public static final Item SWIFTNESS_LIME_VAPE = v("swiftness_lime_vape", "lime", () -> ModParticleTypes.SWIFTNESS_PARTICLE, List.of(MobEffects.SPEED));
    public static final Item SWIFTNESS_GREEN_VAPE = v("swiftness_green_vape", "green", () -> ModParticleTypes.SWIFTNESS_PARTICLE, List.of(MobEffects.SPEED));
    public static final Item SWIFTNESS_CYAN_VAPE = v("swiftness_cyan_vape", "cyan", () -> ModParticleTypes.SWIFTNESS_PARTICLE, List.of(MobEffects.SPEED));
    public static final Item SWIFTNESS_LIGHT_BLUE_VAPE = v("swiftness_light_blue_vape", "light_blue", () -> ModParticleTypes.SWIFTNESS_PARTICLE, List.of(MobEffects.SPEED));
    public static final Item SWIFTNESS_BLUE_VAPE = v("swiftness_blue_vape", "blue", () -> ModParticleTypes.SWIFTNESS_PARTICLE, List.of(MobEffects.SPEED));
    public static final Item SWIFTNESS_PURPLE_VAPE = v("swiftness_purple_vape", "purple", () -> ModParticleTypes.SWIFTNESS_PARTICLE, List.of(MobEffects.SPEED));
    public static final Item SWIFTNESS_MAGENTA_VAPE = v("swiftness_magenta_vape", "magenta", () -> ModParticleTypes.SWIFTNESS_PARTICLE, List.of(MobEffects.SPEED));
    public static final Item SWIFTNESS_PINK_VAPE = v("swiftness_pink_vape", "pink", () -> ModParticleTypes.SWIFTNESS_PARTICLE, List.of(MobEffects.SPEED));
    public static final Item SWIFTNESS_BROWN_VAPE = v("swiftness_brown_vape", "brown", () -> ModParticleTypes.SWIFTNESS_PARTICLE, List.of(MobEffects.SPEED));
    public static final Item SWIFTNESS_WHITE_VAPE = v("swiftness_white_vape", "white", () -> ModParticleTypes.SWIFTNESS_PARTICLE, List.of(MobEffects.SPEED));
    public static final Item SWIFTNESS_LIGHT_GRAY_VAPE = v("swiftness_light_gray_vape", "light_gray", () -> ModParticleTypes.SWIFTNESS_PARTICLE, List.of(MobEffects.SPEED));
    public static final Item SWIFTNESS_GRAY_VAPE = v("swiftness_gray_vape", "gray", () -> ModParticleTypes.SWIFTNESS_PARTICLE, List.of(MobEffects.SPEED));
    public static final Item SWIFTNESS_BLACK_VAPE = v("swiftness_black_vape", "black", () -> ModParticleTypes.SWIFTNESS_PARTICLE, List.of(MobEffects.SPEED));

    // Черепашья мощь
    public static final Item TURTLE_MASTER_RED_VAPE = v("turtle_master_red_vape", "red", () -> ModParticleTypes.TURTLE_MASTER_PARTICLE, List.of(MobEffects.SLOWNESS, MobEffects.RESISTANCE));
    public static final Item TURTLE_MASTER_ORANGE_VAPE = v("turtle_master_orange_vape", "orange", () -> ModParticleTypes.TURTLE_MASTER_PARTICLE, List.of(MobEffects.SLOWNESS, MobEffects.RESISTANCE));
    public static final Item TURTLE_MASTER_YELLOW_VAPE = v("turtle_master_yellow_vape", "yellow", () -> ModParticleTypes.TURTLE_MASTER_PARTICLE, List.of(MobEffects.SLOWNESS, MobEffects.RESISTANCE));
    public static final Item TURTLE_MASTER_LIME_VAPE = v("turtle_master_lime_vape", "lime", () -> ModParticleTypes.TURTLE_MASTER_PARTICLE, List.of(MobEffects.SLOWNESS, MobEffects.RESISTANCE));
    public static final Item TURTLE_MASTER_GREEN_VAPE = v("turtle_master_green_vape", "green", () -> ModParticleTypes.TURTLE_MASTER_PARTICLE, List.of(MobEffects.SLOWNESS, MobEffects.RESISTANCE));
    public static final Item TURTLE_MASTER_CYAN_VAPE = v("turtle_master_cyan_vape", "cyan", () -> ModParticleTypes.TURTLE_MASTER_PARTICLE, List.of(MobEffects.SLOWNESS, MobEffects.RESISTANCE));
    public static final Item TURTLE_MASTER_LIGHT_BLUE_VAPE = v("turtle_master_light_blue_vape", "light_blue", () -> ModParticleTypes.TURTLE_MASTER_PARTICLE, List.of(MobEffects.SLOWNESS, MobEffects.RESISTANCE));
    public static final Item TURTLE_MASTER_BLUE_VAPE = v("turtle_master_blue_vape", "blue", () -> ModParticleTypes.TURTLE_MASTER_PARTICLE, List.of(MobEffects.SLOWNESS, MobEffects.RESISTANCE));
    public static final Item TURTLE_MASTER_PURPLE_VAPE = v("turtle_master_purple_vape", "purple", () -> ModParticleTypes.TURTLE_MASTER_PARTICLE, List.of(MobEffects.SLOWNESS, MobEffects.RESISTANCE));
    public static final Item TURTLE_MASTER_MAGENTA_VAPE = v("turtle_master_magenta_vape", "magenta", () -> ModParticleTypes.TURTLE_MASTER_PARTICLE, List.of(MobEffects.SLOWNESS, MobEffects.RESISTANCE));
    public static final Item TURTLE_MASTER_PINK_VAPE = v("turtle_master_pink_vape", "pink", () -> ModParticleTypes.TURTLE_MASTER_PARTICLE, List.of(MobEffects.SLOWNESS, MobEffects.RESISTANCE));
    public static final Item TURTLE_MASTER_BROWN_VAPE = v("turtle_master_brown_vape", "brown", () -> ModParticleTypes.TURTLE_MASTER_PARTICLE, List.of(MobEffects.SLOWNESS, MobEffects.RESISTANCE));
    public static final Item TURTLE_MASTER_WHITE_VAPE = v("turtle_master_white_vape", "white", () -> ModParticleTypes.TURTLE_MASTER_PARTICLE, List.of(MobEffects.SLOWNESS, MobEffects.RESISTANCE));
    public static final Item TURTLE_MASTER_LIGHT_GRAY_VAPE = v("turtle_master_light_gray_vape", "light_gray", () -> ModParticleTypes.TURTLE_MASTER_PARTICLE, List.of(MobEffects.SLOWNESS, MobEffects.RESISTANCE));
    public static final Item TURTLE_MASTER_GRAY_VAPE = v("turtle_master_gray_vape", "gray", () -> ModParticleTypes.TURTLE_MASTER_PARTICLE, List.of(MobEffects.SLOWNESS, MobEffects.RESISTANCE));
    public static final Item TURTLE_MASTER_BLACK_VAPE = v("turtle_master_black_vape", "black", () -> ModParticleTypes.TURTLE_MASTER_PARTICLE, List.of(MobEffects.SLOWNESS, MobEffects.RESISTANCE));

    // Подводное дыхание
    public static final Item WATER_BREATHING_RED_VAPE = v("water_breathing_red_vape", "red", () -> ModParticleTypes.WATER_BREATHING_PARTICLE, List.of(MobEffects.WATER_BREATHING));
    public static final Item WATER_BREATHING_ORANGE_VAPE = v("water_breathing_orange_vape", "orange", () -> ModParticleTypes.WATER_BREATHING_PARTICLE, List.of(MobEffects.WATER_BREATHING));
    public static final Item WATER_BREATHING_YELLOW_VAPE = v("water_breathing_yellow_vape", "yellow", () -> ModParticleTypes.WATER_BREATHING_PARTICLE, List.of(MobEffects.WATER_BREATHING));
    public static final Item WATER_BREATHING_LIME_VAPE = v("water_breathing_lime_vape", "lime", () -> ModParticleTypes.WATER_BREATHING_PARTICLE, List.of(MobEffects.WATER_BREATHING));
    public static final Item WATER_BREATHING_GREEN_VAPE = v("water_breathing_green_vape", "green", () -> ModParticleTypes.WATER_BREATHING_PARTICLE, List.of(MobEffects.WATER_BREATHING));
    public static final Item WATER_BREATHING_CYAN_VAPE = v("water_breathing_cyan_vape", "cyan", () -> ModParticleTypes.WATER_BREATHING_PARTICLE, List.of(MobEffects.WATER_BREATHING));
    public static final Item WATER_BREATHING_LIGHT_BLUE_VAPE = v("water_breathing_light_blue_vape", "light_blue", () -> ModParticleTypes.WATER_BREATHING_PARTICLE, List.of(MobEffects.WATER_BREATHING));
    public static final Item WATER_BREATHING_BLUE_VAPE = v("water_breathing_blue_vape", "blue", () -> ModParticleTypes.WATER_BREATHING_PARTICLE, List.of(MobEffects.WATER_BREATHING));
    public static final Item WATER_BREATHING_PURPLE_VAPE = v("water_breathing_purple_vape", "purple", () -> ModParticleTypes.WATER_BREATHING_PARTICLE, List.of(MobEffects.WATER_BREATHING));
    public static final Item WATER_BREATHING_MAGENTA_VAPE = v("water_breathing_magenta_vape", "magenta", () -> ModParticleTypes.WATER_BREATHING_PARTICLE, List.of(MobEffects.WATER_BREATHING));
    public static final Item WATER_BREATHING_PINK_VAPE = v("water_breathing_pink_vape", "pink", () -> ModParticleTypes.WATER_BREATHING_PARTICLE, List.of(MobEffects.WATER_BREATHING));
    public static final Item WATER_BREATHING_BROWN_VAPE = v("water_breathing_brown_vape", "brown", () -> ModParticleTypes.WATER_BREATHING_PARTICLE, List.of(MobEffects.WATER_BREATHING));
    public static final Item WATER_BREATHING_WHITE_VAPE = v("water_breathing_white_vape", "white", () -> ModParticleTypes.WATER_BREATHING_PARTICLE, List.of(MobEffects.WATER_BREATHING));
    public static final Item WATER_BREATHING_LIGHT_GRAY_VAPE = v("water_breathing_light_gray_vape", "light_gray", () -> ModParticleTypes.WATER_BREATHING_PARTICLE, List.of(MobEffects.WATER_BREATHING));
    public static final Item WATER_BREATHING_GRAY_VAPE = v("water_breathing_gray_vape", "gray", () -> ModParticleTypes.WATER_BREATHING_PARTICLE, List.of(MobEffects.WATER_BREATHING));
    public static final Item WATER_BREATHING_BLACK_VAPE = v("water_breathing_black_vape", "black", () -> ModParticleTypes.WATER_BREATHING_PARTICLE, List.of(MobEffects.WATER_BREATHING));

    // Слабость
    public static final Item WEAKNESS_RED_VAPE = v("weakness_red_vape", "red", () -> ModParticleTypes.WEAKNESS_PARTICLE, List.of(MobEffects.WEAKNESS));
    public static final Item WEAKNESS_ORANGE_VAPE = v("weakness_orange_vape", "orange", () -> ModParticleTypes.WEAKNESS_PARTICLE, List.of(MobEffects.WEAKNESS));
    public static final Item WEAKNESS_YELLOW_VAPE = v("weakness_yellow_vape", "yellow", () -> ModParticleTypes.WEAKNESS_PARTICLE, List.of(MobEffects.WEAKNESS));
    public static final Item WEAKNESS_LIME_VAPE = v("weakness_lime_vape", "lime", () -> ModParticleTypes.WEAKNESS_PARTICLE, List.of(MobEffects.WEAKNESS));
    public static final Item WEAKNESS_GREEN_VAPE = v("weakness_green_vape", "green", () -> ModParticleTypes.WEAKNESS_PARTICLE, List.of(MobEffects.WEAKNESS));
    public static final Item WEAKNESS_CYAN_VAPE = v("weakness_cyan_vape", "cyan", () -> ModParticleTypes.WEAKNESS_PARTICLE, List.of(MobEffects.WEAKNESS));
    public static final Item WEAKNESS_LIGHT_BLUE_VAPE = v("weakness_light_blue_vape", "light_blue", () -> ModParticleTypes.WEAKNESS_PARTICLE, List.of(MobEffects.WEAKNESS));
    public static final Item WEAKNESS_BLUE_VAPE = v("weakness_blue_vape", "blue", () -> ModParticleTypes.WEAKNESS_PARTICLE, List.of(MobEffects.WEAKNESS));
    public static final Item WEAKNESS_PURPLE_VAPE = v("weakness_purple_vape", "purple", () -> ModParticleTypes.WEAKNESS_PARTICLE, List.of(MobEffects.WEAKNESS));
    public static final Item WEAKNESS_MAGENTA_VAPE = v("weakness_magenta_vape", "magenta", () -> ModParticleTypes.WEAKNESS_PARTICLE, List.of(MobEffects.WEAKNESS));
    public static final Item WEAKNESS_PINK_VAPE = v("weakness_pink_vape", "pink", () -> ModParticleTypes.WEAKNESS_PARTICLE, List.of(MobEffects.WEAKNESS));
    public static final Item WEAKNESS_BROWN_VAPE = v("weakness_brown_vape", "brown", () -> ModParticleTypes.WEAKNESS_PARTICLE, List.of(MobEffects.WEAKNESS));
    public static final Item WEAKNESS_WHITE_VAPE = v("weakness_white_vape", "white", () -> ModParticleTypes.WEAKNESS_PARTICLE, List.of(MobEffects.WEAKNESS));
    public static final Item WEAKNESS_LIGHT_GRAY_VAPE = v("weakness_light_gray_vape", "light_gray", () -> ModParticleTypes.WEAKNESS_PARTICLE, List.of(MobEffects.WEAKNESS));
    public static final Item WEAKNESS_GRAY_VAPE = v("weakness_gray_vape", "gray", () -> ModParticleTypes.WEAKNESS_PARTICLE, List.of(MobEffects.WEAKNESS));
    public static final Item WEAKNESS_BLACK_VAPE = v("weakness_black_vape", "black", () -> ModParticleTypes.WEAKNESS_PARTICLE, List.of(MobEffects.WEAKNESS));

    // Иссушение
    public static final Item WITHER_RED_VAPE = v("wither_red_vape", "red", () -> ModParticleTypes.WITHER_PARTICLE, List.of(MobEffects.WITHER));
    public static final Item WITHER_ORANGE_VAPE = v("wither_orange_vape", "orange", () -> ModParticleTypes.WITHER_PARTICLE, List.of(MobEffects.WITHER));
    public static final Item WITHER_YELLOW_VAPE = v("wither_yellow_vape", "yellow", () -> ModParticleTypes.WITHER_PARTICLE, List.of(MobEffects.WITHER));
    public static final Item WITHER_LIME_VAPE = v("wither_lime_vape", "lime", () -> ModParticleTypes.WITHER_PARTICLE, List.of(MobEffects.WITHER));
    public static final Item WITHER_GREEN_VAPE = v("wither_green_vape", "green", () -> ModParticleTypes.WITHER_PARTICLE, List.of(MobEffects.WITHER));
    public static final Item WITHER_CYAN_VAPE = v("wither_cyan_vape", "cyan", () -> ModParticleTypes.WITHER_PARTICLE, List.of(MobEffects.WITHER));
    public static final Item WITHER_LIGHT_BLUE_VAPE = v("wither_light_blue_vape", "light_blue", () -> ModParticleTypes.WITHER_PARTICLE, List.of(MobEffects.WITHER));
    public static final Item WITHER_BLUE_VAPE = v("wither_blue_vape", "blue", () -> ModParticleTypes.WITHER_PARTICLE, List.of(MobEffects.WITHER));
    public static final Item WITHER_PURPLE_VAPE = v("wither_purple_vape", "purple", () -> ModParticleTypes.WITHER_PARTICLE, List.of(MobEffects.WITHER));
    public static final Item WITHER_MAGENTA_VAPE = v("wither_magenta_vape", "magenta", () -> ModParticleTypes.WITHER_PARTICLE, List.of(MobEffects.WITHER));
    public static final Item WITHER_PINK_VAPE = v("wither_pink_vape", "pink", () -> ModParticleTypes.WITHER_PARTICLE, List.of(MobEffects.WITHER));
    public static final Item WITHER_BROWN_VAPE = v("wither_brown_vape", "brown", () -> ModParticleTypes.WITHER_PARTICLE, List.of(MobEffects.WITHER));
    public static final Item WITHER_WHITE_VAPE = v("wither_white_vape", "white", () -> ModParticleTypes.WITHER_PARTICLE, List.of(MobEffects.WITHER));
    public static final Item WITHER_LIGHT_GRAY_VAPE = v("wither_light_gray_vape", "light_gray", () -> ModParticleTypes.WITHER_PARTICLE, List.of(MobEffects.WITHER));
    public static final Item WITHER_GRAY_VAPE = v("wither_gray_vape", "gray", () -> ModParticleTypes.WITHER_PARTICLE, List.of(MobEffects.WITHER));
    public static final Item WITHER_BLACK_VAPE = v("wither_black_vape", "black", () -> ModParticleTypes.WITHER_PARTICLE, List.of(MobEffects.WITHER));

    private static Item registerItem(String name, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Vapeaholic.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Vapeaholic.LOGGER.info("Registering Mod Items for " + Vapeaholic.MOD_ID);
    }
}
