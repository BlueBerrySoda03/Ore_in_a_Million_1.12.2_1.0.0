package com.blueberrysoda.oreinamillion.proxy;

import com.blueberrysoda.oreinamillion.init.*;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
    public static void preInitCommon(FMLPreInitializationEvent event){
        ModItems.init();
        ModBlocks.init();
        ModTools.init();
        ModArmor.init();
        ModSounds.init();
        ModArmorEvents.init();
    }

    public static void initCommon(FMLInitializationEvent event){
        ModItems.initOreDict();
        ModBlocks.initOreDict();
        ModTools.initOreDict();
        ModArmor.initOreDict();
    }

    public static void postInitCommon(FMLPostInitializationEvent event){

    }
}