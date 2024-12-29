package com.blueberrysoda.oreinamillion;

import com.blueberrysoda.oreinamillion.creativetabs.*;
import com.blueberrysoda.oreinamillion.proxy.ClientProxy;
import com.blueberrysoda.oreinamillion.proxy.CommonProxy;
import com.blueberrysoda.oreinamillion.recipes.SmeltingRecipes;
import com.blueberrysoda.oreinamillion.world.OreWorldGen;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = OreInAMillion.MODID, name = OreInAMillion.NAME, version = OreInAMillion.VERSION, dependencies = OreInAMillion.DEPENDENCIES)
public class OreInAMillion {

    public static final String MODID = "oreinamillion";
    public static final String NAME = "Ore in a Million";
    public static final String VERSION = "1.0.0";
    public static final String DEPENDENCIES = "";
    public static final String CLIENT_PROXY = "com.blueberrysoda.oreinamillion.proxy.ClientProxy";
    public static final String COMMON_PROXY = "com.blueberrysoda.oreinamillion.proxy.CommonProxy";
    public static final int GUI_ALLOYER = 0;
    public static final CreativeTabs CREATIVE_TAB_MAIN = new CreativeTabMain(CreativeTabs.getNextID(), "CreativeTabMain", 1);
    public static final CreativeTabs CREATIVE_TAB_MINERAL = new CreativeTabMineral(CreativeTabs.getNextID(), "CreativeTabMineral", 2);
    public static final CreativeTabs CREATIVE_TAB_CRAFTING = new CreativeTabCrafting(CreativeTabs.getNextID(), "CreativeTabCrafting", 3);
    public static final CreativeTabs CREATIVE_TAB_BLOCK = new CreativeTabBlock(CreativeTabs.getNextID(), "CreativeTabBlock", 4);
    public static final CreativeTabs CREATIVE_TAB_TOOL = new CreativeTabTool(CreativeTabs.getNextID(), "CreativeTabTool", 5);
    public static final CreativeTabs CREATIVE_TAB_ARMOR = new CreativeTabArmor(CreativeTabs.getNextID(), "CreativeTabArmor", 6);

    @Mod.Instance
    public static OreInAMillion instance;

    @SidedProxy(
            clientSide = CLIENT_PROXY,
            serverSide = COMMON_PROXY)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event){
        ClientProxy.preInitClient(event);
        CommonProxy.preInitCommon(event);
        GameRegistry.registerWorldGenerator(new OreWorldGen(), 1);
    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event){
        ClientProxy.initClient(event);
        CommonProxy.initCommon(event);
        SmeltingRecipes.init();
    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event){
        ClientProxy.postInitClient(event);
        CommonProxy.postInitCommon(event);
    }
}
