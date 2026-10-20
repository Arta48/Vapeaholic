package com.arta.vapeaholic.item.items;

import com.arta.vapeaholic.Vapeaholic;
import com.arta.vapeaholic.item.ModItemGroups;
import com.arta.vapeaholic.network.ModPacketHandler;
import com.arta.vapeaholic.network.PacketSpawnParticles;
import com.arta.vapeaholic.sound.ModSounds;
import com.arta.vapeaholic.variable.ModVariables;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class VapeItem extends Item {
    private final String baseColor;
    private final @Nullable EnumParticleTypes particleType;
    private final List<Potion> effects;

    public VapeItem(String name, String baseColor, @Nullable EnumParticleTypes particleType, Potion... effects) {
        this(name, baseColor, particleType, (effects != null && effects.length > 0) ? Arrays.asList(effects) : Collections.emptyList());
    }

    public VapeItem(String name, String baseColor, @Nullable EnumParticleTypes particleType, List<Potion> effects) {
        super();
        this.baseColor = baseColor;
        this.particleType = particleType;
        this.effects = effects != null ? effects : Collections.emptyList();

        this.setRegistryName(new ResourceLocation(Vapeaholic.MOD_ID, name));
        this.setTranslationKey(Vapeaholic.MOD_ID + "." + baseColor + "_vape");
        this.setCreativeTab(ModItemGroups.VAPEAHOLIC_TAB);
        this.setMaxDamage(ModVariables.VAPE_DURABILITY);
        this.maxStackSize = ModVariables.VAPE_MAX_COUNT;
    }

    public String getBaseColor() {
        return this.baseColor;
    }

    @Override
    public EnumRarity getRarity(ItemStack itemstack) {
        return ModVariables.VAPE_RARITY;
    }

    @Override
    public EnumAction getItemUseAction(ItemStack itemstack) {
        return EnumAction.NONE;
    }

    @Override
    public int getMaxItemUseDuration(ItemStack itemstack) {
        return -2;
    }

    @Override
    public float getDestroySpeed(ItemStack itemstack, IBlockState state) {
        return 1.5f;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World world, List<String> tooltip, ITooltipFlag advanced) {
        if (this.particleType == null) {
            tooltip.add(I18n.format("item.vapeaholic.vape.tooltip"));
            return;
        }
        if (this.effects.isEmpty()) {
            tooltip.add(I18n.format("item.vapeaholic.water_vape.tooltip"));
            return;
        }
        for (Potion potion : this.effects) {
            String effectName = I18n.format(potion.getName());
            TextFormatting format = potion.isBadEffect() ? TextFormatting.RED : TextFormatting.BLUE;
            String duration = StringUtils.ticksToElapsedTime(ModVariables.EFFECT_DURATION);
            tooltip.add(format + effectName + " (" + duration + ")");
        }
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
        ItemStack itemStack = player.getHeldItem(hand);

        if (this.particleType == null) {
            if (world.isRemote) {
                player.sendStatusMessage(new TextComponentTranslation("message.vapeaholic.no_vape_pod"), true);
            }
            return new ActionResult<>(EnumActionResult.FAIL, itemStack);
        }

        if (itemStack.getItemDamage() >= ModVariables.VAPE_DURABILITY - 1) {
            if (world.isRemote) {
                player.sendStatusMessage(new TextComponentTranslation("message.vapeaholic.need_replace"), true);
            }
            return new ActionResult<>(EnumActionResult.FAIL, itemStack);
        }

        if (!world.isRemote) {
            for (Potion potion : this.effects) {
                player.addPotionEffect(new PotionEffect(potion, ModVariables.EFFECT_DURATION, ModVariables.EFFECT_STRENGTH, false, true));
            }

            Random rand = world.rand;
            for (int i = 0; i < ModVariables.PUFF_AMOUNT; i++) {
                double spread = ModVariables.PARTICLE_ROTATION_SPREAD;
                double motionX = player.getLookVec().x * ModVariables.PARTICLE_ROTATION_SPEED + MathHelper.nextDouble(rand, -spread, spread);
                double motionY = player.getLookVec().y * ModVariables.PARTICLE_ROTATION_SPEED + MathHelper.nextDouble(rand, -spread, spread);
                double motionZ = player.getLookVec().z * ModVariables.PARTICLE_ROTATION_SPEED + MathHelper.nextDouble(rand, -spread, spread);

                ModPacketHandler.CHANNEL.sendToAllAround(
                    new PacketSpawnParticles(
                        this.particleType, player.posX, player.posY + player.getEyeHeight(), player.posZ,
                        motionX, motionY, motionZ, 1
                    ),
                    new NetworkRegistry.TargetPoint(world.provider.getDimension(), player.posX, player.posY, player.posZ, ModVariables.PARTICLE_RENDER_DISTANCE)
                );
            }
        }

        world.playSound(null, new BlockPos(player.posX, player.posY, player.posZ), ModSounds.BREATHING, SoundCategory.PLAYERS, 1.0F, 1.0F);

        if (!player.capabilities.isCreativeMode) {
            itemStack.damageItem(1, player);
        }

        player.getCooldownTracker().setCooldown(this, ModVariables.VAPE_COOLDOWN);

        return new ActionResult<>(EnumActionResult.SUCCESS, itemStack);
    }
}
