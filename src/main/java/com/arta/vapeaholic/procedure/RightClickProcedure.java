package com.arta.vapeaholic.procedure;

import com.arta.vapeaholic.network.ModPacketHandler;
import com.arta.vapeaholic.network.PacketSpawnParticles;
import com.arta.vapeaholic.sound.ModSounds;
import com.arta.vapeaholic.variable.ModVariables;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.SoundCategory;
import static net.minecraft.util.text.translation.I18n.translateToLocal;

import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.GameType;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.NetworkRegistry;

import java.util.ArrayList;
import java.util.Random;

public class RightClickProcedure {

    public static void execute(World world, double x, double y, double z, Entity entity, ItemStack itemstack, EnumParticleTypes particleType, ArrayList<Potion> effectList) {
        if (entity == null)
            return;

        if (particleType != null) {
            if (itemstack.getItemDamage() != ModVariables.VapeDurability - 1) {
                if (entity instanceof EntityPlayer && !((EntityPlayer) entity).getEntityWorld().isRemote && effectList != null)
                    for (int index0 = 0; index0 < effectList.size(); index0++) {
                        ((EntityPlayer) entity).addPotionEffect(new PotionEffect(effectList.get(index0), ModVariables.EffectDuration, ModVariables.EffectStrength, false, true));
                    }

                for (int index0 = 0; index0 < ModVariables.PuffAmount; index0++) {
                    if (world instanceof World && (!((World) world).isRemote)) {
                        ModPacketHandler.CHANNEL.sendToAllAround(
                                new PacketSpawnParticles(
                                    particleType, (entity.posX), (entity.posY + entity.getEyeHeight()), (entity.posZ),
                                    (entity.getLookVec().x * ModVariables.ParticleRotationSpeed + MathHelper.nextDouble(new Random(), ModVariables.ParticleRotationSpread * (-1), ModVariables.ParticleRotationSpread * 1)),
                                    (entity.getLookVec().y * ModVariables.ParticleRotationSpeed + MathHelper.nextDouble(new Random(), ModVariables.ParticleRotationSpread * (-1), ModVariables.ParticleRotationSpread * 1)),
                                    (entity.getLookVec().z * ModVariables.ParticleRotationSpeed + MathHelper.nextDouble(new Random(), ModVariables.ParticleRotationSpread * (-1), ModVariables.ParticleRotationSpread * 1)),
                            1),
                                new NetworkRegistry.TargetPoint(world.provider.getDimension(), entity.posX, entity.posY, entity.posZ, ModVariables.ParticleRenderDistance)
                        );
                    }
                }

                if (world instanceof World) {
                    if (!world.isRemote) {
                        world.playSound(null, new BlockPos(x, y, z), ModSounds.BREATHING, SoundCategory.PLAYERS, 1, 1);
                    } else {
                        world.playSound(x, y, z, ModSounds.BREATHING, SoundCategory.PLAYERS, 1, 1, false);
                    }
                }

                if (!(new Object() {
                    public boolean checkGamemode(Entity _ent) {
                        if (_ent instanceof EntityPlayerMP) {
                            return ((EntityPlayerMP) _ent).interactionManager.getGameType() == GameType.CREATIVE;
                        } else if (!_ent.getEntityWorld().isRemote && _ent instanceof EntityPlayer) {
                            return ((EntityPlayer) _ent).getGameProfile().getId() != null
                                    && ((EntityPlayer) _ent).isCreative();
                        }
                        return false;
                    }
                }.checkGamemode(entity))) {
                    if (entity instanceof EntityPlayer) {
                        itemstack.damageItem(1, (EntityPlayer) entity);
                    }
                }

                if (entity instanceof EntityPlayer)
                    ((EntityPlayer) entity).getCooldownTracker().setCooldown(itemstack.getItem(), ModVariables.VapeCooldown);

            } else {
                if (entity instanceof EntityPlayer && ((EntityPlayer) entity).getEntityWorld().isRemote)
                    ((EntityPlayer) entity).sendStatusMessage(new TextComponentString(translateToLocal("message.vapeoholic.need_replace")), true);
            }
        } else {
            if (entity instanceof EntityPlayer && ((EntityPlayer) entity).getEntityWorld().isRemote)
                ((EntityPlayer) entity).sendStatusMessage(new TextComponentString(translateToLocal("message.vapeoholic.no_vape_pod")), true);
        }
    }
}
