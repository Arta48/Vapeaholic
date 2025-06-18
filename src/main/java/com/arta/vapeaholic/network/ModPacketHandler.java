package com.arta.vapeaholic.network;

import com.arta.vapeaholic.Vapeaholic;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

public class ModPacketHandler {

    public static final SimpleNetworkWrapper CHANNEL = NetworkRegistry.INSTANCE.newSimpleChannel(Vapeaholic.MOD_ID);

    @SuppressWarnings("UnusedAssignment")
    public static void init() {
        int id = 0;

        CHANNEL.registerMessage(PacketSpawnParticles.Handler.class, PacketSpawnParticles.class, id++, Side.CLIENT);
    }
}
