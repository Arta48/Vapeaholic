package com.arta.vapeaholic.item;

import com.arta.vapeaholic.Vapeaholic;
import com.arta.vapeaholic.item.items.VapeItem;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModItemGroups {
    public static final CreativeModeTab VAPEAHOLIC_TAB = Registry.register(
            BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Vapeaholic.MOD_ID, "vapeaholic_tab"),
            FabricCreativeModeTab.builder()
                    .title(Component.translatable("itemgroup.vapeaholic.vapes_tab"))
                    .icon(() -> new ItemStack(ModItems.RED_VAPE))
                    .displayItems((displayContext, displayItems) -> {
                        // 1. Компоненты
                        displayItems.accept(ModItems.BATTERY);
                        displayItems.accept(ModItems.COIL);
                        displayItems.accept(ModItems.MOUTHPIECE);

                        // 2. Картриджи
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

                        // 3. Все вейпы регистрируются автоматически по порядку!
                        BuiltInRegistries.ITEM.stream()
                                .filter(item -> BuiltInRegistries.ITEM.getKey(item).getNamespace().equals(Vapeaholic.MOD_ID))
                                .filter(item -> item instanceof VapeItem)
                                .forEach(displayItems::accept);
                    })
                    .build()
    );

    public static void registerModItemGroups() {
        Vapeaholic.LOGGER.info("Registering Mod Items Groups for " + Vapeaholic.MOD_ID);
    }
}
