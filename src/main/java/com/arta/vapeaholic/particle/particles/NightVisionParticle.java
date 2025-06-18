package com.arta.vapeaholic.particle.particles;

import com.arta.vapeaholic.variable.ModVariables;
import net.minecraft.client.particle.IParticleFactory;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleSimpleAnimated;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class NightVisionParticle extends ParticleSimpleAnimated {

    @SideOnly(Side.CLIENT)
    public static class Factory implements IParticleFactory {
        public Particle createParticle(int particleID, World world, double x, double y, double z, double motionX, double motionY, double motionZ, int... params) {
            return new NightVisionParticle(world, x, y, z, motionX, motionY, motionZ);
        }
    }

    public NightVisionParticle(World world, double x, double y, double z, double motionX, double motionY, double motionZ) {
        super(world, x, y, z, 0, 8, ModVariables.YAccel);
        this.motionX = motionX * ModVariables.ParticleMotion;
        this.motionY = motionY * ModVariables.ParticleMotion;
        this.motionZ = motionZ * ModVariables.ParticleMotion;
        this.particleScale = ModVariables.ParticleScale;
        this.setSize(ModVariables.ParticleSize, ModVariables.ParticleSize);
        this.particleMaxAge = ModVariables.ParticleMaxAge;
        this.canCollide = ModVariables.CanCollide;
        this.particleRed = 162 / 255f;
        this.particleGreen = 243 / 255f;
        this.particleBlue = 87 / 255f;
//        this.particleTexture = Minecraft.getMinecraft().getTextureMapBlocks().getAtlasSprite(new ResourceLocation(Vapeaholic.MOD_ID, "particle/night_vision_particle_1").toString());
    }

//    public int getFXLayer() {
//        return 1;
//    }

    @Override
    public void renderParticle(BufferBuilder buffer, Entity entityIn, float partialTicks, float rotationX, float rotationZ, float rotationYZ, float rotationXY, float rotationXZ) {
        super.renderParticle(buffer, entityIn, partialTicks, rotationX, rotationZ, rotationYZ, rotationXY, rotationXZ);
    }
}
