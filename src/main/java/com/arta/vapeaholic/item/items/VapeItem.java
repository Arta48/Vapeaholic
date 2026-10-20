package com.arta.vapeaholic.item.items;

import com.arta.vapeaholic.Vapeaholic;
import com.arta.vapeaholic.sound.ModSounds;
import com.arta.vapeaholic.variable.ModVariables;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.Holder;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectUtil;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.level.Level;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class VapeItem extends Item {
    private final @Nullable Supplier<SimpleParticleType> particleSupplier;
    private final @Nullable List<Holder<MobEffect>> effects;

    public VapeItem(Item.Properties properties, String baseColor, @Nullable Supplier<SimpleParticleType> particleSupplier, @Nullable List<Holder<MobEffect>> effects) {
        super(properties
            .modelId(Identifier.fromNamespaceAndPath(Vapeaholic.MOD_ID, baseColor + "_vape"))
            .overrideDescription("item.vapeaholic." + baseColor + "_vape")
        );
        this.particleSupplier = particleSupplier;
        this.effects = effects;
    }

    @Override
    public @NonNull ItemUseAnimation getUseAnimation(final @NonNull ItemStack itemStack) {
        return ItemUseAnimation.NONE;
    }

    @Override
    @Environment(EnvType.CLIENT)
    public void appendHoverText(final @NonNull ItemStack itemStack, final @NonNull TooltipContext context, final @NonNull TooltipDisplay display, final Consumer<Component> builder, final @NonNull TooltipFlag tooltipFlag) {
        if (this.particleSupplier == null) {
            builder.accept(Component.translatable("item.vapeaholic.vape.tooltip"));
            return;
        }
        if (this.effects == null || this.effects.isEmpty()) {
            builder.accept(Component.translatable("item.vapeaholic.water_vape.tooltip"));
            return;
        }
        for (Holder<MobEffect> effect : this.effects) {
            MobEffectInstance inst = new MobEffectInstance(effect, ModVariables.EFFECT_DURATION, ModVariables.EFFECT_STRENGTH);
            builder.accept(Component.translatable("potion.withDuration",
                effect.value().getDisplayName(),
                MobEffectUtil.formatDuration(inst, 1.0F, 20.0F)
            ).withStyle(effect.value().getCategory().getTooltipFormatting()));
        }
    }

    @Override
    public @NonNull InteractionResult use(final @NonNull Level level, final Player player, final @NonNull InteractionHand hand) {
        ItemStack itemStack = player.getItemInHand(hand);

        if (this.particleSupplier == null) {
            if (!level.isClientSide()) {
                player.sendOverlayMessage(Component.translatable("message.vapeaholic.no_vape_pod"));
            }
            return InteractionResult.FAIL;
        }

        if (itemStack.getDamageValue() >= ModVariables.VAPE_DURABILITY - 1) {
            if (!level.isClientSide()) {
                player.sendOverlayMessage(Component.translatable("message.vapeaholic.need_replace"));
            }
            return InteractionResult.FAIL;
        }

        if (!level.isClientSide() && this.effects != null) {
            for (Holder<MobEffect> effect : this.effects) {
                player.addEffect(new MobEffectInstance(effect, ModVariables.EFFECT_DURATION, ModVariables.EFFECT_STRENGTH, false, true));
            }
        }

        SimpleParticleType particleType = this.particleSupplier.get();
        if (level instanceof ServerLevel serverLevel && particleType != null) {
            for (int i = 0; i < ModVariables.PUFF_AMOUNT; i++) {
                serverLevel.sendParticles(particleType,
                    player.getX(),
                    player.getY() + player.getEyeHeight(player.getPose()),
                    player.getZ(),
                    0,
                    player.getLookAngle().x * ModVariables.PARTICLE_ROTATION_SPEED + Mth.nextDouble(RandomSource.create(), -ModVariables.PARTICLE_ROTATION_SPREAD, ModVariables.PARTICLE_ROTATION_SPREAD),
                    player.getLookAngle().y * ModVariables.PARTICLE_ROTATION_SPEED + Mth.nextDouble(RandomSource.create(), -ModVariables.PARTICLE_ROTATION_SPREAD, ModVariables.PARTICLE_ROTATION_SPREAD),
                    player.getLookAngle().z * ModVariables.PARTICLE_ROTATION_SPEED + Mth.nextDouble(RandomSource.create(), -ModVariables.PARTICLE_ROTATION_SPREAD, ModVariables.PARTICLE_ROTATION_SPREAD),
                    1
                );
            }
        }

        level.playSound(null, player.getX(), player.getY(), player.getZ(), ModSounds.BREATHING, SoundSource.PLAYERS, 1.0F, 1.0F);

        if (!player.getAbilities().instabuild && level instanceof ServerLevel serverLevel) {
            ServerPlayer serverPlayer = player instanceof ServerPlayer sp ? sp : null;
            itemStack.hurtAndBreak(1, serverLevel, serverPlayer, item -> {});
        }

        player.getCooldowns().addCooldown(itemStack, ModVariables.VAPE_COOLDOWN);

        return InteractionResult.CONSUME;
    }
}
