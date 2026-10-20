package com.arta.vapeaholic.item;

import com.arta.vapeaholic.Vapeaholic;
import com.arta.vapeaholic.item.items.VapeItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
@Mod.EventBusSubscriber(value = Side.CLIENT, modid = Vapeaholic.MOD_ID)
public class ModItemModels {

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        Vapeaholic.LOGGER.info("Registering Mod Item Models for " + Vapeaholic.MOD_ID);

        for (Item item : ModItems.ITEMS) {
            String modelName;
            if (item instanceof VapeItem) {
                modelName = ((VapeItem) item).getBaseColor() + "_vape";
            } else {
                modelName = item.getRegistryName().getPath();
            }
            ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Vapeaholic.MOD_ID, modelName), "inventory"));
        }
    }
}
