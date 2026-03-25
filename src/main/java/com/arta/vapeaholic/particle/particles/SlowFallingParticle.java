package com.arta.vapeaholic.particle.particles;

import com.arta.vapeaholic.variable.ModClientVariables;
import com.arta.vapeaholic.variable.ModVariables;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.particle.v1.FabricSpriteSet;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.*;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.util.RandomSource;

@Environment(EnvType.CLIENT)
public class SlowFallingParticle extends SimpleAnimatedParticle {
    private SlowFallingParticle(final ClientLevel level, final double x, final double y, final double z, final double xa, final double ya, final double za, final SpriteSet sprites) {
        super(level, x, y, z, sprites, 0f);
        this.xd = xa * ModVariables.ParticleSpeed;
        this.yd = ya * ModVariables.ParticleSpeed;
        this.zd = za * ModVariables.ParticleSpeed;
        this.quadSize = ModVariables.ParticleQuadSize;
        this.setSize(ModVariables.ParticleSize, ModVariables.ParticleSize);
        this.lifetime = ModVariables.ParticleLifeTime;
        this.gravity = ModVariables.ParticleGravity;
        this.hasPhysics = ModVariables.HasPhysics;
        this.setSpriteFromAge(sprites);
    }

    public static SlowFallingProvider Provider(FabricSpriteSet fabricSpriteSet) {
        return new SlowFallingProvider(fabricSpriteSet);
    }

    @Environment(EnvType.CLIENT)
    public static class SlowFallingProvider implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet sprites;

        public SlowFallingProvider(final SpriteSet sprites) {
            this.sprites = sprites;
        }

        public Particle createParticle(final SimpleParticleType options, final ClientLevel level, final double x, final double y, final double z, final double xAux, final double yAux, final double zAux, final RandomSource random) {
            return new SlowFallingParticle(level, x, y, z, xAux, yAux, zAux, this.sprites);
        }
    }

    @Override
    public SingleQuadParticle.Layer getLayer() {
        return ModClientVariables.ParticleLayer;
    }

    @Override
    public void tick() {
        super.tick();
        if (this.isAlive()) {
            this.setSprite(this.sprites.get((this.age / 15) % 7 + 1, (this.lifetime / 15) % 7 + 1));
        }
    }
}
