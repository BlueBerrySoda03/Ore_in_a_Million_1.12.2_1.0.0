package com.blueberrysoda.oreinamillion.proxy;

import com.blueberrysoda.oreinamillion.compat.mekanism.MekanismRecipes;
import com.blueberrysoda.oreinamillion.config.*;
import com.blueberrysoda.oreinamillion.init.*;
import com.blueberrysoda.oreinamillion.recipes.CraftingRecipes;
import com.blueberrysoda.oreinamillion.recipes.SmeltingRecipes;
import com.blueberrysoda.oreinamillion.util.EventUtil;
import net.minecraftforge.common.MinecraftForge;
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
        System.out.println("Ore In A Million: Item Init Complete!");

        ModBlocks.init();
        System.out.println("Ore In A Million: Block Init Complete!");

        ModFluids.init();
        System.out.println("Ore In A Million: Fluid Init Complete!");

        ModEnchantments.init();
        System.out.println("Ore In A Million: Enchantment Init Complete!");

        ModSounds.init();
        System.out.println("Ore In A Million: Sound Init Complete!");

        EventUtil.init();
        System.out.println("Ore In A Million: Events Init Complete!");

        ModGases.init();
        System.out.println("Ore In A Million: Mekanism Gas Init Complete!");
    }

    public static void initCommon(FMLInitializationEvent event){
        ModItems.initOreDict();
        System.out.println("Ore In A Million: Item Ore Dict Complete!");

        ModBlocks.initOreDict();
        System.out.println("Ore In A Million: Block Ore Dict Complete!");

        SmeltingRecipes.init();
        System.out.println("Ore In A Million: Smelting Recipes Complete!");

        CraftingRecipes.init();
        System.out.println("Ore In A Million: Crafting Recipes Complete!");

        MekanismRecipes.init();
        System.out.println("Ore In A Million: Mekanism Recipes Complete!");
    }

    public static void postInitCommon(FMLPostInitializationEvent event){

    }
}