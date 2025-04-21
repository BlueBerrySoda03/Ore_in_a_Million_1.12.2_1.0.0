package com.blueberrysoda.oreinamillion.proxy;

import com.blueberrysoda.oreinamillion.config.*;
import com.blueberrysoda.oreinamillion.init.*;
import com.blueberrysoda.oreinamillion.util.EventUtil;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
    public static void preInitCommon(FMLPreInitializationEvent event){
        GeneralConfig.init(event);
        MineralsConfig.init(event);
        CraftingConfig.init(event);
        ArmorConfig.init(event);
        ArmorEventsConfig.init(event);
        ToolsConfig.init(event);
        ModCompatConfig.init(event);
        ModItems.init();
        ModBlocks.init();
        ModSounds.init();
        ModEvents.init();
        EventUtil.init();
    }

    public static void initCommon(FMLInitializationEvent event){
        ModItems.initOreDict();
        ModBlocks.initOreDict();
    }

    public static void postInitCommon(FMLPostInitializationEvent event){

    }
}