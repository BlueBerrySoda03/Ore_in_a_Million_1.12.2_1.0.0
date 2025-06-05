package com.blueberrysoda.oreinamillion.util.keybinds;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

public class NetworkHandler {
    public static final SimpleNetworkWrapper INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(OreInAMillion.MODID);

    public static void registerMessages() {
        int id = 0;
        INSTANCE.registerMessage(PacketKeybindInput.Handler.class, PacketKeybindInput.class, id++, Side.SERVER);
    }
}

