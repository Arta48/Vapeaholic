package com.arta.vapeaholic.procedure;

import com.arta.vapeaholic.sound.ModSounds;
import com.arta.vapeaholic.variable.ModVariables;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.GameMode;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RightClickProcedure {

    public static void execute(WorldAccess world, double x, double y, double z, Entity entity, ItemStack itemstack, SimpleParticleType particleType, ArrayList<RegistryEntry<StatusEffect>> effectList) {
        if (entity == null)
            return;

        if (particleType != null) {
            if (itemstack.getDamage() != ModVariables.VapeDurability - 1) {
                if (entity instanceof LivingEntity _entity && !_entity.getEntityWorld().isClient() && effectList != null)
                    for (int index0 = 0; index0 < effectList.size(); index0++) {
                        _entity.addStatusEffect(new StatusEffectInstance(effectList.get(index0), ModVariables.EffectDuration, ModVariables.EffectStrength, false, true));
                    }

                for (int index0 = 0; index0 < ModVariables.PuffAmount; index0++) {
                    if (world instanceof ServerWorld _level)
                        _level.spawnParticles(particleType, (entity.getX()), (entity.getY() + entity.getEyeHeight(entity.getPose())), (entity.getZ()), 0,
                                (entity.getRotationVector().x * ModVariables.ParticleRotationSpeed + MathHelper.nextDouble(Random.create(), ModVariables.ParticleRotationSpread * (-1), ModVariables.ParticleRotationSpread * 1)),
                                (entity.getRotationVector().y * ModVariables.ParticleRotationSpeed + MathHelper.nextDouble(Random.create(), ModVariables.ParticleRotationSpread * (-1), ModVariables.ParticleRotationSpread * 1)),
                                (entity.getRotationVector().z * ModVariables.ParticleRotationSpeed + MathHelper.nextDouble(Random.create(), ModVariables.ParticleRotationSpread * (-1), ModVariables.ParticleRotationSpread * 1)),
                                1);
                }

                if (world instanceof World _level) {
                    if (!_level.isClient()) {
                        _level.playSound(null, BlockPos.ofFloored(x, y, z), ModSounds.BREATHING, SoundCategory.PLAYERS, 1, 1);
                    } else {
                        _level.playSound(x, y, z, ModSounds.BREATHING, SoundCategory.PLAYERS, 1, 1, false);
                    }
                }

                if (!(new Object() {
                    public boolean checkGamemode(Entity _ent) {
                        if (_ent instanceof ServerPlayerEntity _serverPlayer) {
                            return _serverPlayer.interactionManager.getGameMode() == GameMode.CREATIVE;
                        } else if (_ent.getEntityWorld().isClient() && _ent instanceof PlayerEntity _player) {
                            return MinecraftClient.getInstance().getNetworkHandler().getPlayerListEntry(_player.getGameProfile().getId()) != null
                                    && MinecraftClient.getInstance().getNetworkHandler().getPlayerListEntry(_player.getGameProfile().getId()).getGameMode() == GameMode.CREATIVE;
                        }
                        return false;
                    }
                }.checkGamemode(entity))) {
                    if (world instanceof ServerWorld _level) {
                        itemstack.damage(1, _level, null, _stkprov -> {
                        });
                    }
                }

                if (entity instanceof PlayerEntity _player)
                    _player.getItemCooldownManager().set(itemstack, ModVariables.VapeCooldown);

            } else {
                if (entity instanceof PlayerEntity _player && !_player.getEntityWorld().isClient())
                    _player.sendMessage(Text.translatable("message.vapeoholic.need_replace"), true);
            }
        } else {
            if (entity instanceof PlayerEntity _player && !_player.getEntityWorld().isClient())
                _player.sendMessage(Text.translatable("message.vapeoholic.no_vape_pod"), true);
        }
    }
}
