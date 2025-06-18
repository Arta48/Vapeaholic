package com.arta.vapeaholic.particle;

import com.arta.vapeaholic.Vapeaholic;
import com.arta.vapeaholic.particle.particles.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.IParticleFactory;
import net.minecraft.util.EnumParticleTypes;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModParticles {

    private static void registerParticle(int id, IParticleFactory factory) {
        Minecraft.getMinecraft().effectRenderer.registerParticle(id, factory);
    }

    public static void registerModParticles() {
        Vapeaholic.LOGGER.info("Registering Mod Particles for " + Vapeaholic.MOD_ID);

        int id = EnumParticleTypes.values().length;

        registerParticle(id++, new WaterParticle.Factory());
        registerParticle(id++, new FireResistanceParticle.Factory());
        registerParticle(id++, new InstantDamageParticle.Factory());
        registerParticle(id++, new InstantHealthParticle.Factory());
        registerParticle(id++, new JumpBoostParticle.Factory());
        registerParticle(id++, new LuckParticle.Factory());
        registerParticle(id++, new NightVisionParticle.Factory());
        registerParticle(id++, new PoisonParticle.Factory());
        registerParticle(id++, new RegenerationParticle.Factory());
        registerParticle(id++, new SlownessParticle.Factory());
        registerParticle(id++, new StrengthParticle.Factory());
        registerParticle(id++, new SwiftnessParticle.Factory());
        registerParticle(id++, new WaterBreathingParticle.Factory());
        registerParticle(id++, new WeaknessParticle.Factory());
        registerParticle(id++, new WitherParticle.Factory());

    }
}
