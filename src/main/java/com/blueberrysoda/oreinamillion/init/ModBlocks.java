package com.blueberrysoda.oreinamillion.init;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import com.blueberrysoda.oreinamillion.blocks.base.BlockBaseExp;
import com.blueberrysoda.oreinamillion.blocks.base.BlockDropBase;
import com.blueberrysoda.oreinamillion.blocks.combined.BlockCombined;
import com.blueberrysoda.oreinamillion.blocks.drop.BlockDropSand;
import com.blueberrysoda.oreinamillion.blocks.ores.*;
import com.blueberrysoda.oreinamillion.config.GeneralConfig;
import com.blueberrysoda.oreinamillion.config.MineralsConfig;
import com.blueberrysoda.oreinamillion.config.ModCompatConfig;
import com.blueberrysoda.oreinamillion.creativetabs.CreativeTabBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Mod.EventBusSubscriber
public class ModBlocks {

    private static final CreativeTabs Block = OreInAMillion.CREATIVE_TAB_BLOCK;
    private static final CreativeTabs None = null;

    public static final List<Block> BLOCKS = new ArrayList<>();

    //=========
    //ores
    //=========
    public static Block oreAdamantine = new BlockOre("adamantine_ore", 3);
    public static Block oreAluminum = new BlockOre("aluminum_ore", 1);
    public static Block oreArdite = new BlockOre("ardite_ore", 1);
    public static Block oreChrome = new BlockOre("chrome_ore", 1);
    public static Block oreCobalt = new BlockOre("cobalt_ore", 2);
    public static Block oreCopper = new BlockOre("copper_ore", 1);
    public static Block oreEnder = new BlockOre("ender_ore", 3);
    public static Block oreIridium = new BlockOre("iridium_ore", 2);
    public static Block oreLead = new BlockOre("lead_ore", 1);
    public static Block oreMithril = new BlockOre("mithril_ore", 2);
    public static Block oreNickel = new BlockOre("nickel_ore", 1);
    public static Block oreOsmium = new BlockOre("osmium_ore", 1);
    public static Block orePlatinum = new BlockOre("platinum_ore", 2);
    public static Block oreSilver = new BlockOre("silver_ore", 2);
    public static Block oreTin = new BlockOre("tin_ore", 1);
    public static Block oreTitanium = new BlockOre("titanium_ore", 3);
    public static Block oreTungsten = new BlockOre("tungsten_ore", 2);
    public static Block oreUranium = new BlockOre("uranium_ore", 3);
    public static Block oreZinc = new BlockOre("zinc_ore", 1);

    public static Block oreAmethyst = new BlockOre("amethyst_ore", 2);
    public static Block orePearl = new BlockDropSand("pearl_ore", Block, ModItems.gemPearl.getDefaultInstance(), Blocks.SAND, false);
    public static Block orePeridot = new BlockOre("peridot_ore", 2);
    public static Block oreRuby = new BlockOre("ruby_ore", 2);
    public static Block oreSapphire = new BlockOre("sapphire_ore", 2);

    public static Block oreCinnabar = new BlockOre("cinnabar_ore", 0);
    public static Block oreSulfur = new BlockOreDrop("sulfur_ore",  ModItems.elementSulfur, 2, 1);

    //=========
    //combined
    //=========
    //base ingots

    //alloy ingots

    //gems

    //other

    //vanilla
    public static Block blockCharcoal = new BlockCombined("charcoal_block", 0);

    //=========
    //dust blocks
    //=========
    //base

    //alloy

    //gems

    //other

    //vanilla

    //=========
    //tile entities
    //=========


    //=========
    //other
    //=========
    public static Block oreWeezer = new BlockOreDrop("weezer_ore", ModItems.weezerWeezer, 1, 0);

    public static void init(){
        // = new ("", Material.);
        if (GeneralConfig.isMineralsEnabled) {
            if(GeneralConfig.isIngotsEnabled) {
                //adamantine
                if (MineralsConfig.isAdamantineEnabled) {
                    BLOCKS.add(oreAluminum);
                }
                //aluminum
                if (MineralsConfig.isAluminumEnabled) {
                    BLOCKS.add(oreAluminum);
                }
                //chrome
                if (MineralsConfig.isChromeEnabled) {
                    BLOCKS.add(oreChrome);
                }
                //cobalt
                if (MineralsConfig.isCobaltEnabled) {
                    BLOCKS.add(oreCobalt);
                }
                //copper
                if (MineralsConfig.isCopperEnabled) {
                    BLOCKS.add(oreCopper);
                }
                //ender
                if (MineralsConfig.isEnderEnabled){
                    BLOCKS.add(oreEnder);
                }
                //iridium
                if (MineralsConfig.isIridiumEnabled) {
                    BLOCKS.add(oreIridium);
                }
                //lead
                if (MineralsConfig.isLeadEnabled) {
                    BLOCKS.add(oreLead);
                }
                //mithril
                if (MineralsConfig.isMithrilEnabled) {
                    BLOCKS.add(oreMithril);
                }
                //nickel
                if (MineralsConfig.isNickelEnabled) {
                    BLOCKS.add(oreNickel);
                }
                //osmium
                if (MineralsConfig.isOsmiumEnabled) {
                    BLOCKS.add(oreOsmium);
                }
                //platinum
                if (MineralsConfig.isPlatinumEnabled) {
                    BLOCKS.add(orePlatinum);
                }
                //silver
                if (MineralsConfig.isSilverEnabled) {
                    BLOCKS.add(oreSilver);
                }
                //tin
                if (MineralsConfig.isTinEnabled) {
                    BLOCKS.add(oreTin);
                }
                //titanium
                if (MineralsConfig.isTitaniumEnabled) {
                    BLOCKS.add(oreTitanium);
                }
                //tungsten
                if (MineralsConfig.isTungstenEnabled) {
                    BLOCKS.add(oreTungsten);
                }
                //uranium
                if (MineralsConfig.isUraniumEnabled) {
                    BLOCKS.add(oreUranium);
                }
                //zinc
                if (MineralsConfig.isZincEnabled) {
                    BLOCKS.add(oreZinc);
                }
                //brass
                if (MineralsConfig.isBrassEnabled) {

                }
                //bronze
                if (MineralsConfig.isBronzeEnabled) {

                }
                //electrum
                if (MineralsConfig.isElectrumEnabled) {

                }
                //invar
                if (MineralsConfig.isInvarEnabled) {

                }
                //steel
                if (MineralsConfig.isSteelEnabled) {

                }
                //thermal series
                if (ModCompatConfig.isThermalEnabled){
                    //constantan
                    if (MineralsConfig.isConstantanEnabled){

                    }
                    //enderium
                    if (MineralsConfig.isEnderiumEnabled){

                    }
                    //lumium
                    if (MineralsConfig.isLumiumEnabled){

                    }
                    //signalum
                    if (MineralsConfig.isSignalumEnabled){

                    }
                }
                //tinkers construct
                if (ModCompatConfig.isTinkersEnabled){
                    //ardite
                    if (MineralsConfig.isArditeEnabled){
                        BLOCKS.add(oreArdite);
                    }
                    //knightslime
                    if (MineralsConfig.isKnightSlimeEnabled){

                    }
                    //pigiron
                    if (MineralsConfig.isPigIronEnabled) {

                    }
                    //manyullyn
                    if (MineralsConfig.isManyullynEnabled){

                    }
                }
            }
            if (GeneralConfig.isGemsEnabled){
                //amethyst
                if (MineralsConfig.isAmethystEnabled){
                    BLOCKS.add(oreAmethyst);
                }
                //pearl
                if (MineralsConfig.isPearlEnabled) {
                    BLOCKS.add(orePearl);
                }
                //peridot
                if (MineralsConfig.isPeridotEnabled){
                    BLOCKS.add(orePeridot);
                }
                //ruby
                if (MineralsConfig.isRubyEnabled){
                    BLOCKS.add(oreRuby);
                }
                //sapphire
                if (MineralsConfig.isSapphireEnabled){
                    BLOCKS.add(oreSapphire);
                }
            }
            //elements
            if (GeneralConfig.isElementsEnabled){
                //carbon
                if (MineralsConfig.isCarbonEnabled){

                }
                //cinnabar
                if (MineralsConfig.isCinnabarEnabled){
                    BLOCKS.add(oreCinnabar);
                }
                //sulphur
                if (MineralsConfig.isSulfurEnabled){
                    BLOCKS.add(oreSulfur);
                }
            }
            if (GeneralConfig.isVanillaEnabled) {
                //diamond
                if (MineralsConfig.isDiamondEnabled) {

                }
                //emerald
                if (MineralsConfig.isEmeraldEnabled) {

                }
                //coal
                if (MineralsConfig.isCoalEnabled) {

                }
                //charcoal
                if (MineralsConfig.isCharcoalEnabled) {
                    BLOCKS.add(blockCharcoal);
                }
            }
            if (GeneralConfig.isSillyStuffEnabled) {
                BLOCKS.add(oreWeezer);
            }
        }
    }

    @SubscribeEvent
    public static void registerBlock(RegistryEvent.Register<Block> event){
        ModBlocks.init();
        for (Block block : BLOCKS) {
            event.getRegistry().register(block);
        }
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void registerRenders(ModelRegistryEvent event){
        ModBlocks.init();
        for (Block block : BLOCKS) {
            registerRender(Item.getItemFromBlock(block));
        }
    }

    public static void registerRender(Item item)
    {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Objects.requireNonNull(item.getRegistryName()), "inventory"));
    }

    public static void initOreDict() {
        for (Block block : BLOCKS) {
            registerOreDictNames(Item.getItemFromBlock(block));
        }
    }

    public static void registerOreDictNames(Item item) {
        ResourceLocation registryName = item.getRegistryName();
        if (registryName != null) {
            List<String> oreDictNames = getOreDictNames(registryName);
            for (String oreDictName : oreDictNames) {
                OreDictionary.registerOre(oreDictName, item);
            }
        } else {
            System.err.println("Item " + item + " does not have a valid registry name!");
        }
    }

    private static List<String> getOreDictNames(ResourceLocation registryName) {
        List<String> oreDictAdd = new ArrayList<>();

        if (registryName == null) {
            return oreDictAdd;
        }

        String path = registryName.getResourcePath();
        String[] parts = path.split("_");
        if (parts.length < 2) {
            return oreDictAdd;
        }

        String itemName = capitalize(parts[0]);
        String itemNameLower = parts[0];
        String itemType = parts[1];

        switch (itemType) {
            case "ore":
                oreDictAdd.add("ore" + itemName);
                oreDictAdd.add(itemNameLower + "Ore");
                oreDictAdd.add("oreBlock");
                oreDictAdd.add("blockOre");
                break;
            case "gem":
                oreDictAdd.add("block" + itemName);
                oreDictAdd.add(itemNameLower + "Block");
                oreDictAdd.add("blockCombined");
                oreDictAdd.add("combinedBlock");
                break;
            case "block":
                break;
            default:
                System.err.println("Unknown item type: " + itemType);
        }
        return oreDictAdd;
    }

    private static String capitalize(String string) {
        if (string == null || string.isEmpty()) {
            return string;
        }
        return string.substring(0, 1).toUpperCase() + string.substring(1);
    }
}
