package com.arta.vapeaholic.particle.particles;

import com.arta.vapeaholic.variable.ModClientVariables;
import com.arta.vapeaholic.variable.ModVariables;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.particle.*;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.SimpleParticleType;

@Environment(EnvType.CLIENT)
public class WeaknessParticle extends AnimatedParticle {
    public static WeaknessProvider provider(SpriteProvider spriteProvider) {
        return new WeaknessProvider(spriteProvider);
    }

    public static class WeaknessProvider implements ParticleFactory<SimpleParticleType> {
        private final SpriteProvider spriteProvider;

        public WeaknessProvider(SpriteProvider spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        public Particle createParticle(SimpleParticleType simpleParticleType, ClientWorld clientWorld, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
            return new WeaknessParticle(clientWorld, x, y, z, velocityX, velocityY, velocityZ, this.spriteProvider);
        }
    }

    public WeaknessParticle(ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ, SpriteProvider spriteProvider) {
        super(world, x, y, z, spriteProvider, 0f);
        this.velocityX = velocityX * ModVariables.ParticleSpeed;
        this.velocityY = velocityY * ModVariables.ParticleSpeed;
        this.velocityZ = velocityZ * ModVariables.ParticleSpeed;
        this.scale = ModVariables.ParticleScale;
        this.setBoundingBoxSpacing(ModVariables.ParticleBoundingBoxSpacing, ModVariables.ParticleBoundingBoxSpacing);
        this.maxAge = ModVariables.ParticleMaxAge;
        this.gravityStrength = ModVariables.ParticleGravityStrength;
        this.collidesWithWorld = ModVariables.CollideWithWorld;
        this.setSpriteForAge(spriteProvider);
    }

    @Override
    public ParticleTextureSheet getType() {
        return ModClientVariables.ParticleSheet;
    }

    @Override
    public void tick() {
        super.tick();
        if (!this.dead) {
            this.setSprite(this.spriteProvider.getSprite((this.age / 15) % 7 + 1, (this.maxAge / 15) % 7 + 1));
        }
    }
}
