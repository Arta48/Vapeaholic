package com.arta.vapeaholic.item.items.vapes.instanthealth;

import com.arta.vapeaholic.Vapeaholic;
import com.arta.vapeaholic.item.ModItemGroups;
import com.arta.vapeaholic.particle.ModParticleTypes;
import com.arta.vapeaholic.procedure.RightClickProcedure;
import com.arta.vapeaholic.variable.ModVariables;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import static net.minecraft.util.text.translation.I18n.translateToLocal;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.List;

public class InstantHealthBlueVape extends Item {

    public InstantHealthBlueVape(String name) {
        super();

        this.setRegistryName(name);
		this.setTranslationKey(Vapeaholic.MOD_ID + "." + "blue_vape");
		this.setCreativeTab(ModItemGroups.VAPES_TAB);
		this.setMaxDamage(ModVariables.VapeDurability);
		this.maxStackSize = ModVariables.VapeMaxCount;
    }

    @Override
	public EnumRarity getRarity(ItemStack itemstack) {
		return ModVariables.VapeRarity;
	}

	@Override
	public EnumAction getItemUseAction(ItemStack itemstack) {
		return EnumAction.DRINK;
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
	public void addInformation(ItemStack stack, World world, List<String> tooltip, ITooltipFlag advanced) {
		tooltip.add(translateToLocal("item.vapeoholic.instant_health_vape.tooltip"));
	}

    @Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer entityPlayer, EnumHand hand) {
		ItemStack itemStack = entityPlayer.getHeldItem(hand);
		ArrayList<Potion> effectList = new ArrayList<Potion>();
		effectList.add(MobEffects.INSTANT_HEALTH);
		RightClickProcedure.execute(world, entityPlayer.posX, entityPlayer.posY, entityPlayer.posZ, entityPlayer, itemStack, ModParticleTypes.INSTANT_HEALTH_PARTICLE, effectList);
		return new ActionResult(EnumActionResult.PASS, itemStack); // PASS instead of SUCCESS for hand animation
	}
}
