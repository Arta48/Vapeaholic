package com.arta.vapeaholic.item.items.vapes.poison;

import com.arta.vapeaholic.variable.ModVariables;
import com.arta.vapeaholic.Vapeaholic;
import com.arta.vapeaholic.particle.ModParticleTypes;
import com.arta.vapeaholic.procedure.RightClickProcedure;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

import java.util.ArrayList;
import java.util.function.Consumer;
import org.jspecify.annotations.NonNull;

public class PoisonGrayVape extends Item {

    public PoisonGrayVape() {
        super(ModVariables.VapeSettings
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Vapeaholic.MOD_ID,"poison_gray_vape")))
            .modelId(Identifier.fromNamespaceAndPath(Vapeaholic.MOD_ID,"gray_vape"))
            .overrideDescription("item.vapeaholic.gray_vape")
        );
    }

    @Override
    public @NonNull ItemUseAnimation getUseAnimation(final @NonNull ItemStack itemStack) {
        return ItemUseAnimation.DRINK;
    }

    @Override
    public int getUseDuration(final @NonNull ItemStack itemStack, final @NonNull LivingEntity user) {
        return -2;
    }

    @Override
    public float getDestroySpeed(final @NonNull ItemStack itemStack, final @NonNull BlockState state) {
        return 1.5f;
    }

    @Override
    @Environment(EnvType.CLIENT)
    public void appendHoverText(final @NonNull ItemStack itemStack, final @NonNull TooltipContext context, final @NonNull TooltipDisplay display, final Consumer<Component> builder, final @NonNull TooltipFlag tooltipFlag) {
        builder.accept(Component.translatable("item.vapeaholic.poison_vape.tooltip"));
    }

    @Override
    public @NonNull InteractionResult use(final @NonNull Level level, final Player player, final @NonNull InteractionHand hand) {
        ItemStack itemStack = player.getItemInHand(hand);
        ArrayList<Holder<MobEffect>> effectList = new ArrayList<Holder<MobEffect>>();
        effectList.add(MobEffects.POISON);
        RightClickProcedure.execute(level, player.getX(), player.getY(), player.getZ(), player, itemStack, ModParticleTypes.POISON_PARTICLE, effectList);
        return InteractionResult.PASS; // PASS instead of SUCCESS for hand animation

    }
}
