package com.arta.vapeaholic.item.items.vapes.luck;

import com.arta.vapeaholic.variable.ModVariables;
import com.arta.vapeaholic.Vapeaholic;
import com.arta.vapeaholic.particle.ModParticleTypes;
import com.arta.vapeaholic.procedure.RightClickProcedure;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.BlockState;
import net.minecraft.component.type.TooltipDisplayComponent;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.consume.UseAction;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LuckGreenVape extends Item {

    public LuckGreenVape() {
        super(ModVariables.VapeSettings.registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Vapeaholic.MOD_ID,"green_vape"))));
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
    public void appendTooltip(ItemStack stack, TooltipContext context, TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
        textConsumer.accept(Text.translatable("item.vapeoholic.luck_vape.tooltip"));
    }

    @Override
    public ActionResult use(World world, PlayerEntity playerEntity, Hand hand) {
        ItemStack itemStack = playerEntity.getStackInHand(hand);
        ArrayList<RegistryEntry<StatusEffect>> effectList = new ArrayList<RegistryEntry<StatusEffect>>();
        effectList.add(StatusEffects.LUCK);
        RightClickProcedure.execute(world, playerEntity.getX(), playerEntity.getY(), playerEntity.getZ(), playerEntity, itemStack, ModParticleTypes.LUCK_PARTICLE, effectList);
        return ActionResult.PASS; // PASS instead of SUCCESS for hand animation

    }
}
