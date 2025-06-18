package com.arta.vapeaholic.item.items.vapes.empty;

import com.arta.vapeaholic.variable.ModVariables;
import com.arta.vapeaholic.Vapeaholic;
import com.arta.vapeaholic.procedure.RightClickProcedure;
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

public class YellowVape extends Item {

    public YellowVape() {
        super(ModVariables.VapeSettings.registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Vapeaholic.MOD_ID,"yellow_vape"))));
    }

    @Override
    public UseAction getUseAction(ItemStack itemstack) {
        return UseAction.DRINK;
    }

    @Override
    public int getMaxUseTime(ItemStack itemstack, LivingEntity livingEntity) {
        return -2;
    }

    @Override
    public float getMiningSpeed(ItemStack itemstack, BlockState state) {
        return 1.5f;
    }

    @Override
    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("item.vapeoholic.vape.tooltip"));
    }

    @Override
    public ActionResult use(World world, PlayerEntity playerEntity, Hand hand) {
        ItemStack itemStack = playerEntity.getStackInHand(hand);
        RightClickProcedure.execute(world, playerEntity.getX(), playerEntity.getY(), playerEntity.getZ(), playerEntity, itemStack, null, null);
        return ActionResult.PASS; // PASS instead of SUCCESS for hand animation

    }
}
