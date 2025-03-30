package com.blueberrysoda.oreinamillion.init;

import com.blueberrysoda.oreinamillion.blocks.base.BlockBase;
import com.blueberrysoda.oreinamillion.blocks.combined.BlockCombined;
import com.blueberrysoda.oreinamillion.blocks.ores.*;
import com.blueberrysoda.oreinamillion.config.OreInAMillionConfig;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
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

    public static final List<Block> BLOCKS = new ArrayList<>();

    //=========
    //ores
    //=========
    //ingots
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
    public static Block orePeridot = new BlockOre("peridot_ore", 2);
    public static Block oreRuby = new BlockOre("ruby_ore", 2);
    public static Block oreSapphire = new BlockOre("sapphire_ore", 2);

    public static Block oreCinnabar = new BlockOre("cinnabar_ore", 0);
    public static Block oreSulfur = new BlockOre("sulfur_ore", 0);

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
//    public static Block blockEpic = new BlockBase("epic_block", Material.SAND, "axe", SoundType.METAL, 7.0F, 15.0F, 2);

    public static void init(){
//        BLOCKS.add(blockEpic);
        // = new ("", Material.);
        if (OreInAMillionConfig.isMineralsEnabled) {
            if(OreInAMillionConfig.isIngotsEnabled) {
                //adamantine
                if (OreInAMillionConfig.isAdamantineEnabled) {
                    BLOCKS.add(oreAluminum);
                }
                //aluminum
                if (OreInAMillionConfig.isAluminumEnabled) {
                    BLOCKS.add(oreAluminum);
                }
                //chrome
                if (OreInAMillionConfig.isChromeEnabled) {
                    BLOCKS.add(oreChrome);
                }
                //cobalt
                if (OreInAMillionConfig.isCobaltEnabled) {
                    BLOCKS.add(oreCobalt);
                }
                //copper
                if (OreInAMillionConfig.isCopperEnabled) {
                    BLOCKS.add(oreCopper);
                }
                //ender
                if (OreInAMillionConfig.isEnderEnabled){
                    BLOCKS.add(oreEnder);
                }
                //iridium
                if (OreInAMillionConfig.isIridiumEnabled) {
                    BLOCKS.add(oreIridium);
                }
                //lead
                if (OreInAMillionConfig.isLeadEnabled) {
                    BLOCKS.add(oreLead);
                }
                //mithril
                if (OreInAMillionConfig.isMithrilEnabled) {
                    BLOCKS.add(oreMithril);
                }
                //nickel
                if (OreInAMillionConfig.isNickelEnabled) {
                    BLOCKS.add(oreNickel);
                }
                //osmium
                if (OreInAMillionConfig.isOsmiumEnabled) {
                    BLOCKS.add(oreOsmium);
                }
                //platinum
                if (OreInAMillionConfig.isPlatinumEnabled) {
                    BLOCKS.add(orePlatinum);
                }
                //silver
                if (OreInAMillionConfig.isSilverEnabled) {
                    BLOCKS.add(oreSilver);
                }
                //tin
                if (OreInAMillionConfig.isTinEnabled) {
                    BLOCKS.add(oreTin);
                }
                //titanium
                if (OreInAMillionConfig.isTitaniumEnabled) {
                    BLOCKS.add(oreTitanium);
                }
                //tungsten
                if (OreInAMillionConfig.isTungstenEnabled) {
                    BLOCKS.add(oreTungsten);
                }
                //uranium
                if (OreInAMillionConfig.isUraniumEnabled) {
                    BLOCKS.add(oreUranium);
                }
                //zinc
                if (OreInAMillionConfig.isZincEnabled) {
                    BLOCKS.add(oreZinc);
                }
                //brass
                if (OreInAMillionConfig.isBrassEnabled) {

                }
                //bronze
                if (OreInAMillionConfig.isBronzeEnabled) {

                }
                //electrum
                if (OreInAMillionConfig.isElectrumEnabled) {

                }
                //invar
                if (OreInAMillionConfig.isInvarEnabled) {

                }
                //steel
                if (OreInAMillionConfig.isSteelEnabled) {

                }
                //thermal series
                if (OreInAMillionConfig.isThermalEnabled){
                    //constantan
                    if (OreInAMillionConfig.isConstantanEnabled){

                    }
                    //enderium
                    if (OreInAMillionConfig.isEnderiumEnabled){

                    }
                    //lumium
                    if (OreInAMillionConfig.isLumiumEnabled){

                    }
                    //signalum
                    if (OreInAMillionConfig.isSignalumEnabled){

                    }
                }
                //tinkers construct
                if (OreInAMillionConfig.isTinkersEnabled){
                    //ardite
                    if (OreInAMillionConfig.isArditeEnabled){
                        BLOCKS.add(oreArdite);
                    }
                    //knightslime
                    if (OreInAMillionConfig.isKnightSlimeEnabled){

                    }
                    //pigiron
                    if (OreInAMillionConfig.isPigIronEnabled) {

                    }
                    //manyullyn
                    if (OreInAMillionConfig.isManyullynEnabled){

                    }
                }
            }
            if (OreInAMillionConfig.isGemsEnabled){
                //amethyst
                if (OreInAMillionConfig.isAmethystEnabled){
                    BLOCKS.add(oreAmethyst);
                }
                //peridot
                if (OreInAMillionConfig.isPeridotEnabled){
                    BLOCKS.add(orePeridot);
                }
                //ruby
                if (OreInAMillionConfig.isRubyEnabled){
                    BLOCKS.add(oreRuby);
                }
                //sapphire
                if (OreInAMillionConfig.isSapphireEnabled){
                    BLOCKS.add(oreSapphire);
                }
            }
            //elements
            if (OreInAMillionConfig.isElementsEnabled){
                //carbon
                if (OreInAMillionConfig.isCarbonEnabled){

                }
                //cinnabar
                if (OreInAMillionConfig.isCinnabarEnabled){
                    BLOCKS.add(oreCinnabar);
                }
                //sulphur
                if (OreInAMillionConfig.isSulfurEnabled){
                    BLOCKS.add(oreSulfur);
                }
            }
            if (OreInAMillionConfig.isVanillaEnabled) {
                //diamond
                if (OreInAMillionConfig.isDiamondEnabled) {

                }
                //emerald
                if (OreInAMillionConfig.isEmeraldEnabled) {

                }
                //coal
                if (OreInAMillionConfig.isCoalEnabled) {

                }
                //charcoal
                if (OreInAMillionConfig.isCharcoalEnabled) {
                    BLOCKS.add(blockCharcoal);
                }
            }
            if (OreInAMillionConfig.isSillyStuffEnabled) {
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
