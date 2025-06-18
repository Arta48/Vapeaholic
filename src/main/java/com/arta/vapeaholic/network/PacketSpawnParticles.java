package com.arta.vapeaholic.network;

import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.util.EnumParticleTypes;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class PacketSpawnParticles implements IMessage {

    private EnumParticleTypes particleType;
    private double x, y, z, motionX, motionY, motionZ;
    private int params;

    public PacketSpawnParticles() {}

    public PacketSpawnParticles(EnumParticleTypes particleType, double posX, double posY, double posZ, double motionX, double motionY, double motionZ, int params) {
        this.particleType = particleType;
        this.x = posX;
        this.y = posY;
        this.z = posZ;
        this.motionX = motionX;
        this.motionY = motionY;
        this.motionZ = motionZ;
        this.params = params;
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        particleType = EnumParticleTypes.values()[buf.readInt()];
        x = buf.readDouble();
        y = buf.readDouble();
        z = buf.readDouble();
        motionX = buf.readDouble();
        motionY = buf.readDouble();
        motionZ = buf.readDouble();
        params = buf.readInt();
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(particleType.ordinal());
        buf.writeDouble(x);
        buf.writeDouble(y);
        buf.writeDouble(z);
        buf.writeDouble(motionX);
        buf.writeDouble(motionY);
        buf.writeDouble(motionZ);
        buf.writeInt(params);
    }

    public static class Handler implements IMessageHandler<PacketSpawnParticles, IMessage> {

        @Override
        public IMessage onMessage(PacketSpawnParticles message, MessageContext ctx) {
            Minecraft.getMinecraft().addScheduledTask(() -> {
                Minecraft.getMinecraft().world.spawnParticle(message.particleType, message.x, message.y, message.z, message.motionX, message.motionY, message.motionZ, message.params);
            });
            return null;
        }
    }

}
