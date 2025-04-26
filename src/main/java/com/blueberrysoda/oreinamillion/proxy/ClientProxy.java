package com.blueberrysoda.oreinamillion.proxy;

import com.blueberrysoda.oreinamillion.init.ModItems;
import com.blueberrysoda.oreinamillion.util.handlers.ModularColorHandler;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

    public static void preInitClient(FMLPreInitializationEvent event) {

    }

    public static void initClient(FMLInitializationEvent event) {
        Minecraft.getMinecraft().getItemColors().registerItemColorHandler(new ModularColorHandler(), ModItems.modularPickaxe);
    }

    public static void postInitClient(FMLPostInitializationEvent event) {

    }
}