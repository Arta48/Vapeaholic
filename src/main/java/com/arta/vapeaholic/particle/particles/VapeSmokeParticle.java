package com.arta.vapeaholic.particle.particles;

import com.arta.vapeaholic.variable.ModVariables;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.particle.v1.FabricSpriteSet;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.*;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.util.RandomSource;

@Environment(EnvType.CLIENT)
public class VapeSmokeParticle extends SimpleAnimatedParticle {
    private VapeSmokeParticle(ClientLevel level, double x, double y, double z, double xa, double ya, double za, SpriteSet sprites) {
        super(level, x, y, z, sprites, 0f);
        this.xd = xa * ModVariables.PARTICLE_SPEED;
        this.yd = ya * ModVariables.PARTICLE_SPEED;
        this.zd = za * ModVariables.PARTICLE_SPEED;
        this.quadSize = ModVariables.PARTICLE_QUAD_SIZE;
        this.setSize(ModVariables.PARTICLE_SIZE, ModVariables.PARTICLE_SIZE);
        this.lifetime = ModVariables.PARTICLE_LIFETIME;
        this.gravity = ModVariables.PARTICLE_GRAVITY;
        this.hasPhysics = ModVariables.HAS_PHYSICS;
        this.setSpriteFromAge(sprites);
    }

    public static VapeSmokeProvider provider(FabricSpriteSet spriteSet) {
        return new VapeSmokeProvider(spriteSet);
    }

    @Environment(EnvType.CLIENT)
    public static class VapeSmokeProvider implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet sprites;

        public VapeSmokeProvider(SpriteSet sprites) {
            this.sprites = sprites;
        }

        @Override
        public Particle createParticle(SimpleParticleType options, ClientLevel level, double x, double y, double z, double xAux, double yAux, double zAux, RandomSource random) {
            return new VapeSmokeParticle(level, x, y, z, xAux, yAux, zAux, this.sprites);
        }
    }

    @Override
    public SingleQuadParticle.Layer getLayer() {
        return SingleQuadParticle.Layer.OPAQUE;
    }

    @Override
    public void tick() {
        super.tick();
        if (this.isAlive()) {
            this.setSprite(this.sprites.get((this.age / 15) % 7 + 1, (this.lifetime / 15) % 7 + 1));
        }
    }
}
