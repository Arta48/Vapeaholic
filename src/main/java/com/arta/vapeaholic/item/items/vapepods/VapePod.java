package com.arta.vapeaholic.item.items.vapepods;

import com.arta.vapeaholic.Vapeaholic;
import com.arta.vapeaholic.procedure.RightClickProcedure;
import com.arta.vapeaholic.variable.ModVariables;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.consume.UseAction;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

import java.util.List;

public class VapePod extends Item {

    public VapePod() {
        super(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Vapeaholic.MOD_ID,"vape_pod"))));
    }
}
