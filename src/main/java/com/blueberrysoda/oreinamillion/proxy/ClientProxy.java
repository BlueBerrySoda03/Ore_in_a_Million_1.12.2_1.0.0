package com.blueberrysoda.oreinamillion.proxy;

import com.blueberrysoda.oreinamillion.util.LayerArmorChestplateCustom;
import com.blueberrysoda.oreinamillion.util.keybinds.KeyInputHandler;
import com.blueberrysoda.oreinamillion.util.keybinds.ModKeyBindings;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

    public static void preInitClient(FMLPreInitializationEvent event) {
        ModKeyBindings.init();
    }

    public static void initClient(FMLInitializationEvent event) {
        initCommon(event);
        MinecraftForge.EVENT_BUS.register(new KeyInputHandler());
        for (String skin : Minecraft.getMinecraft().getRenderManager().getSkinMap().keySet()) {
            RenderPlayer renderPlayer = Minecraft.getMinecraft().getRenderManager().getSkinMap().get(skin);
            renderPlayer.addLayer(new LayerArmorChestplateCustom());
        }
    }

    public static void postInitClient(FMLPostInitializationEvent event) {

    }
}