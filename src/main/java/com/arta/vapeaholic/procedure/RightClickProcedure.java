package com.arta.vapeaholic.procedure;

import com.arta.vapeaholic.sound.ModSounds;
import com.arta.vapeaholic.variable.ModVariables;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.GameType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

import java.util.ArrayList;

public class RightClickProcedure {

    public static void execute(LevelAccessor level, double x, double y, double z, Entity entity, ItemStack itemstack, SimpleParticleType particleType, ArrayList<Holder<MobEffect>> effectList) {
        if (entity == null)
            return;

        if (particleType != null) {
            if (itemstack.getDamageValue() != ModVariables.VapeDurability - 1) {
                if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide() && effectList != null)
                    for (int index0 = 0; index0 < effectList.size(); index0++) {
                        _entity.addEffect(new MobEffectInstance(effectList.get(index0), ModVariables.EffectDuration, ModVariables.EffectStrength, false, true));
                    }

                for (int index0 = 0; index0 < ModVariables.PuffAmount; index0++) {
                    if (level instanceof ServerLevel _level)
                        _level.sendParticles(particleType, (entity.getX()), (entity.getY() + entity.getEyeHeight(entity.getPose())), (entity.getZ()), 0,
                                (entity.getLookAngle().x * ModVariables.ParticleRotationSpeed + Mth.nextDouble(RandomSource.create(), ModVariables.ParticleRotationSpread * (-1), ModVariables.ParticleRotationSpread * 1)),
                                (entity.getLookAngle().y * ModVariables.ParticleRotationSpeed + Mth.nextDouble(RandomSource.create(), ModVariables.ParticleRotationSpread * (-1), ModVariables.ParticleRotationSpread * 1)),
                                (entity.getLookAngle().z * ModVariables.ParticleRotationSpeed + Mth.nextDouble(RandomSource.create(), ModVariables.ParticleRotationSpread * (-1), ModVariables.ParticleRotationSpread * 1)),
                                1);
                }

                if (level instanceof Level _level) {
                    if (!_level.isClientSide()) {
                        _level.playSound(null, BlockPos.containing(x, y, z), ModSounds.BREATHING, SoundSource.PLAYERS, 1, 1);
                    } else {
                        _level.playLocalSound(x, y, z, ModSounds.BREATHING, SoundSource.PLAYERS, 1, 1, false);
                    }
                }

                if (!(new Object() {
                    public boolean checkGameType(Entity _ent) {
                        if (_ent instanceof ServerPlayer _serverPlayer) {
                            return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
                        } else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
                            return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().id()) != null
                                    && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().id()).getGameMode() == GameType.CREATIVE;
                        }
                        return false;
                    }
                }.checkGameType(entity))) {
                    if (level instanceof ServerLevel _level) {
                        itemstack.hurtAndBreak(1, _level, null, _stkprov -> {
                        });
                    }
                }

                if (entity instanceof Player _player)
                    _player.getCooldowns().addCooldown(itemstack, ModVariables.VapeCooldown);

            } else {
                if (entity instanceof Player _player && !_player.level().isClientSide())
                    _player.sendOverlayMessage(Component.translatable("message.vapeaholic.need_replace"));
            }
        } else {
            if (entity instanceof Player _player && !_player.level().isClientSide())
                _player.sendOverlayMessage(Component.translatable("message.vapeaholic.no_vape_pod"));
        }
    }
}
