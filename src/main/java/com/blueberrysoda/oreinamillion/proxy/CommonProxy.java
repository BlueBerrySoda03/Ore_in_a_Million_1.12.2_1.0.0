package com.blueberrysoda.oreinamillion.proxy;

import com.blueberrysoda.oreinamillion.config.*;
import com.blueberrysoda.oreinamillion.init.*;
//import com.blueberrysoda.oreinamillion.util.EventUtil;
import com.blueberrysoda.oreinamillion.recipes.SmeltingRecipes;
import com.blueberrysoda.oreinamillion.recipes.WaterDustCleanRecipe;
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
//        ModItems.init();
        ModItemsExp.init();
        System.out.println("Ore In A Million: Item Init Complete!");

//        ModBlocks.init();
        ModBlocksExp.init();
        System.out.println("Ore In A Million: Block Init Complete!");

        ModSounds.init();
        System.out.println("Ore In A Million: Sound Init Complete!");
//        ModEvents.init();
        EventUtil.init();
    }

    public static void initCommon(FMLInitializationEvent event){
//        ModItems.initOreDict();
        ModItemsExp.initOreDict();
        System.out.println("Ore In A Million: Item Ore Dict Complete!");

//        ModBlocks.initOreDict();
        SmeltingRecipes.init();
    }

    public static void postInitCommon(FMLPostInitializationEvent event){

    }
}