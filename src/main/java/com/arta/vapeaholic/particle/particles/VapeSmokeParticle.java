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
public class VapeSmokeParticle extends ParticleSimpleAnimated {

    public VapeSmokeParticle(World world, double x, double y, double z, double motionX, double motionY, double motionZ, float r, float g, float b) {
        super(world, x, y, z, 0, 8, ModVariables.Y_ACCEL);
        this.motionX = motionX * ModVariables.PARTICLE_MOTION;
        this.motionY = motionY * ModVariables.PARTICLE_MOTION;
        this.motionZ = motionZ * ModVariables.PARTICLE_MOTION;
        this.particleScale = ModVariables.PARTICLE_SCALE;
        this.setSize(ModVariables.PARTICLE_SIZE, ModVariables.PARTICLE_SIZE);
        this.particleMaxAge = ModVariables.PARTICLE_MAX_AGE;
        this.canCollide = ModVariables.CAN_COLLIDE;
        this.particleRed = r;
        this.particleGreen = g;
        this.particleBlue = b;
    }

    @Override
    public void renderParticle(BufferBuilder buffer, Entity entityIn, float partialTicks, float rotationX, float rotationZ, float rotationYZ, float rotationXY, float rotationXZ) {
        super.renderParticle(buffer, entityIn, partialTicks, rotationX, rotationZ, rotationYZ, rotationXY, rotationXZ);
    }

    @SideOnly(Side.CLIENT)
    public static class Factory implements IParticleFactory {
        private final float r, g, b;

        public Factory(float r, float g, float b) {
            this.r = r;
            this.g = g;
            this.b = b;
        }

        @Override
        public Particle createParticle(int particleID, World world, double x, double y, double z, double motionX, double motionY, double motionZ, int... params) {
            return new VapeSmokeParticle(world, x, y, z, motionX, motionY, motionZ, this.r, this.g, this.b);
        }
    }
}
