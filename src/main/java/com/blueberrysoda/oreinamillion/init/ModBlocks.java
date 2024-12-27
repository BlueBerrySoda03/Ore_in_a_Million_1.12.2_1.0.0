package com.blueberrysoda.oreinamillion.init;

import com.blueberrysoda.oreinamillion.blocks.ores.BlockOreTier1;
import com.blueberrysoda.oreinamillion.blocks.ores.BlockOreTier2;
import com.blueberrysoda.oreinamillion.blocks.ores.BlockOreTier3;
import com.blueberrysoda.oreinamillion.blocks.ores.subores.*;
import com.blueberrysoda.oreinamillion.config.OreInAMillionConfig;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import java.util.Objects;

@Mod.EventBusSubscriber
public class ModBlocks {
    //=========
    //ores
    //=========
    //ingots
    public static BlockOreTier1 oreAluminum;
    public static BlockOreTier3 oreArdite;
    public static BlockOreTier1 oreChrome;
    public static BlockOreTier2 oreCobalt;
    public static BlockOreTier1 oreCopper;
    public static BlockOreTier2 oreEnder;
    public static BlockOreTier2 oreIridium;
    public static BlockOreTier1 oreLead;
    public static BlockOreTier3 oreMithril;
    public static BlockOreTier2 oreNickel;
    public static BlockOreTier1 oreOsmium;
    public static BlockOreTier3 orePlatinum;
    public static BlockOreTier2 oreSilver;
    public static BlockOreTier1 oreTin;
    public static BlockOreTier3 oreTitanium;
    public static BlockOreTier2 oreTungsten;
    public static BlockOreTier3 oreUranium;
    public static BlockOreTier1 oreZinc;
    //gems
    public static BlockAmethystOre oreAmethyst;
    public static BlockPeridotOre orePeridot;
    public static BlockRubyOre oreRuby;
    public static BlockSapphireOre oreSapphire;
    //other
    public static BlockCinnabarOre oreCinnabar;
    public static BlockSulfurOre oreSulfur;

    //=========
    //combined
    //=========
    //base ingots

    //alloy ingots

    //gems

    //other

    //vanilla

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


    public static void init(){
        // = new ("", Material.);
        if (OreInAMillionConfig.isMineralsEnabled) {
            if(OreInAMillionConfig.isIngotsEnabled) {
                //aluminum
                if (OreInAMillionConfig.isAluminumEnabled) {
                    oreAluminum = new BlockOreTier1("aluminum_ore", Material.ROCK);
                }
                //chrome
                if (OreInAMillionConfig.isChromeEnabled) {
                    oreChrome = new BlockOreTier1("chrome_ore", Material.ROCK);
                }
                //cobalt
                if (OreInAMillionConfig.isCobaltEnabled) {
                    oreCobalt = new BlockOreTier2("cobalt_ore", Material.ROCK);
                }
                //copper
                if (OreInAMillionConfig.isCopperEnabled) {
                    oreCopper = new BlockOreTier1("copper_ore", Material.ROCK);
                }
                //ender
                if (OreInAMillionConfig.isEnderEnabled){
                    oreEnder = new BlockOreTier2("ender_ore", Material.ROCK);
                }
                //iridium
                if (OreInAMillionConfig.isIridiumEnabled) {
                    oreIridium = new BlockOreTier2("iridium_ore", Material.ROCK);
                }
                //lead
                if (OreInAMillionConfig.isLeadEnabled) {
                    oreLead = new BlockOreTier1("lead_ore", Material.ROCK);
                }
                //mithril
                if (OreInAMillionConfig.isMithrilEnabled) {
                    oreMithril = new BlockOreTier3("mithril_ore", Material.ROCK);
                }
                //nickel
                if (OreInAMillionConfig.isNickelEnabled) {
                    oreNickel = new BlockOreTier2("nickel_ore", Material.ROCK);
                }
                //osmium
                if (OreInAMillionConfig.isOsmiumEnabled) {
                    oreOsmium = new BlockOreTier1("osmium_ore", Material.ROCK);
                }
                //platinum
                if (OreInAMillionConfig.isPlatinumEnabled) {
                    orePlatinum = new BlockOreTier3("platinum_ore", Material.ROCK);
                }
                //silver
                if (OreInAMillionConfig.isSilverEnabled) {
                    oreSilver = new BlockOreTier2("silver_ore", Material.ROCK);
                }
                //tin
                if (OreInAMillionConfig.isTinEnabled) {
                    oreTin = new BlockOreTier1("tin_ore", Material.ROCK);
                }
                //titanium
                if (OreInAMillionConfig.isTitaniumEnabled) {
                    oreTitanium = new BlockOreTier3("titanium_ore", Material.ROCK);
                }
                //tungsten
                if (OreInAMillionConfig.isTungstenEnabled) {
                    oreTungsten = new BlockOreTier2("tungsten_ore", Material.ROCK);
                }
                //uranium
                if (OreInAMillionConfig.isUraniumEnabled) {
                    oreUranium = new BlockOreTier3("uranium_ore", Material.ROCK);
                }
                //zinc
                if (OreInAMillionConfig.isZincEnabled) {
                    oreZinc = new BlockOreTier1("zinc_ore", Material.ROCK);
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
                if (OreInAMillionConfig.isThermalIngotsEnabled){
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
                if (OreInAMillionConfig.isTinkersIngotsEnabled){
                    //ardite
                    if (OreInAMillionConfig.isArditeEnabled){
                        oreArdite = new BlockOreTier3("ardite_ore", Material.ROCK);
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
                    oreAmethyst = new BlockAmethystOre("amethyst_ore", Material.ROCK);
                }
                //peridot
                if (OreInAMillionConfig.isPeridotEnabled){
                    orePeridot = new BlockPeridotOre("peridot_ore", Material.ROCK);
                }
                //ruby
                if (OreInAMillionConfig.isRubyEnabled){
                    oreRuby = new BlockRubyOre("ruby_ore", Material.ROCK);
                }
                //sapphire
                if (OreInAMillionConfig.isSapphireEnabled){
                    oreSapphire = new BlockSapphireOre("sapphire_ore", Material.ROCK);
                }
            }
            //elements
            if (OreInAMillionConfig.isElementsEnabled){
                //carbon
                if (OreInAMillionConfig.isCarbonEnabled){

                }
                //cinnabar
                if (OreInAMillionConfig.isCinnabarEnabled){
                    oreCinnabar = new BlockCinnabarOre("cinnabar_ore", Material.ROCK);
                }
                //sulphur
                if (OreInAMillionConfig.isSulphurEnabled){
                    oreSulfur = new BlockSulfurOre("sulfur_ore", Material.ROCK);
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

                }
            }
        }
    }

    @SubscribeEvent
    public static void registerBlock(RegistryEvent.Register<Block> event){
        if (OreInAMillionConfig.isMineralsEnabled) {
            if (OreInAMillionConfig.isIngotsEnabled) {
                //aluminum
                if (OreInAMillionConfig.isAluminumEnabled) {
                    event.getRegistry().register(oreAluminum);
                }
                //chrome
                if (OreInAMillionConfig.isChromeEnabled) {
                    event.getRegistry().register(oreChrome);
                }
                //cobalt
                if (OreInAMillionConfig.isCobaltEnabled) {
                    event.getRegistry().register(oreCobalt);
                }
                //copper
                if (OreInAMillionConfig.isCopperEnabled) {
                    event.getRegistry().register(oreCopper);
                }
                //ender
                if (OreInAMillionConfig.isEnderEnabled) {
                    event.getRegistry().register(oreEnder);
                }
                //iridium
                if (OreInAMillionConfig.isIridiumEnabled) {
                    event.getRegistry().register(oreIridium);
                }
                //lead
                if (OreInAMillionConfig.isLeadEnabled) {
                    event.getRegistry().register(oreLead);
                }
                //mithril
                if (OreInAMillionConfig.isMithrilEnabled) {
                    event.getRegistry().register(oreMithril);
                }
                //nickel
                if (OreInAMillionConfig.isNickelEnabled) {
                    event.getRegistry().register(oreNickel);
                }
                //osmium
                if (OreInAMillionConfig.isOsmiumEnabled) {
                    event.getRegistry().register(oreOsmium);
                }
                //platinum
                if (OreInAMillionConfig.isPlatinumEnabled) {
                    event.getRegistry().register(orePlatinum);
                }
                //silver
                if (OreInAMillionConfig.isSilverEnabled) {
                    event.getRegistry().register(oreSilver);
                }
                //tin
                if (OreInAMillionConfig.isTinEnabled) {
                    event.getRegistry().register(oreTin);
                }
                //titanium
                if (OreInAMillionConfig.isTitaniumEnabled) {
                    event.getRegistry().register(oreTitanium);
                }
                //tungsten
                if (OreInAMillionConfig.isTungstenEnabled) {
                    event.getRegistry().register(oreTungsten);
                }
                //uranium
                if (OreInAMillionConfig.isUraniumEnabled) {
                    event.getRegistry().register(oreUranium);
                }
                //zinc
                if (OreInAMillionConfig.isZincEnabled) {
                    event.getRegistry().register(oreZinc);
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
                if (OreInAMillionConfig.isThermalIngotsEnabled){
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
                if (OreInAMillionConfig.isTinkersIngotsEnabled){
                    //ardite
                    if (OreInAMillionConfig.isArditeEnabled){
                        event.getRegistry().register(oreArdite);
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
            //gems
            if (OreInAMillionConfig.isGemsEnabled){
                //amethyst
                if (OreInAMillionConfig.isAmethystEnabled){
                    event.getRegistry().register(oreAmethyst);
                }
                //peridot
                if (OreInAMillionConfig.isPeridotEnabled){
                    event.getRegistry().register(orePeridot);
                }
                //ruby
                if (OreInAMillionConfig.isRubyEnabled){
                    event.getRegistry().register(oreRuby);
                }
                //sapphire
                if (OreInAMillionConfig.isSapphireEnabled){
                    event.getRegistry().register(oreSapphire);
                }
            }
            //elements
            if (OreInAMillionConfig.isElementsEnabled){
                //carbon
                if (OreInAMillionConfig.isCarbonEnabled){

                }
                //cinnabar
                if (OreInAMillionConfig.isCinnabarEnabled){
                    event.getRegistry().register(oreCinnabar);
                }
                //sulphur
                if (OreInAMillionConfig.isSulphurEnabled){
                    event.getRegistry().register(oreSulfur);
                }
            }
            //vanilla
            if (OreInAMillionConfig.isVanillaEnabled) {
                //charcoal
                if (OreInAMillionConfig.isCharcoalEnabled) {

                }
                //coal
                if (OreInAMillionConfig.isCoalEnabled) {

                }
                //diamond
                if (OreInAMillionConfig.isDiamondEnabled) {

                }
                //emerald
                if (OreInAMillionConfig.isEmeraldEnabled) {

                }
                //quartz
                if (OreInAMillionConfig.isQuartzEnabled) {

                }
            }
        }
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){
        //event.getRegistry().register(new ItemBlock().setRegistryName(Objects.requireNonNull(.getRegistryName())));
        if (OreInAMillionConfig.isMineralsEnabled) {
            if (OreInAMillionConfig.isIngotsEnabled) {
                //aluminum
                if (OreInAMillionConfig.isAluminumEnabled) {
                    event.getRegistry().register(new ItemBlock(oreAluminum).setRegistryName(Objects.requireNonNull(oreAluminum.getRegistryName())));
                }
                //chrome
                if (OreInAMillionConfig.isChromeEnabled) {
                    event.getRegistry().register(new ItemBlock(oreChrome).setRegistryName(Objects.requireNonNull(oreChrome.getRegistryName())));
                }
                //cobalt
                if (OreInAMillionConfig.isCobaltEnabled) {
                    event.getRegistry().register(new ItemBlock(oreCobalt).setRegistryName(Objects.requireNonNull(oreCobalt.getRegistryName())));
                }
                //copper
                if (OreInAMillionConfig.isCopperEnabled) {
                    event.getRegistry().register(new ItemBlock(oreCopper).setRegistryName(Objects.requireNonNull(oreCopper.getRegistryName())));
                }
                //ender
                if (OreInAMillionConfig.isEnderEnabled){
                    event.getRegistry().register(new ItemBlock(oreEnder).setRegistryName(Objects.requireNonNull(oreEnder.getRegistryName())));
                }
                //iridium
                if (OreInAMillionConfig.isIridiumEnabled) {
                    event.getRegistry().register(new ItemBlock(oreIridium).setRegistryName(Objects.requireNonNull(oreIridium.getRegistryName())));
                }
                //lead
                if (OreInAMillionConfig.isLeadEnabled) {
                    event.getRegistry().register(new ItemBlock(oreLead).setRegistryName(Objects.requireNonNull(oreLead.getRegistryName())));
                }
                //mithril
                if (OreInAMillionConfig.isMithrilEnabled) {
                    event.getRegistry().register(new ItemBlock(oreMithril).setRegistryName(Objects.requireNonNull(oreMithril.getRegistryName())));
                }
                //nickel
                if (OreInAMillionConfig.isNickelEnabled) {
                    event.getRegistry().register(new ItemBlock(oreNickel).setRegistryName(Objects.requireNonNull(oreNickel.getRegistryName())));
                }
                //osmium
                if (OreInAMillionConfig.isOsmiumEnabled) {
                    event.getRegistry().register(new ItemBlock(oreOsmium).setRegistryName(Objects.requireNonNull(oreOsmium.getRegistryName())));
                }
                //platinum
                if (OreInAMillionConfig.isPlatinumEnabled) {
                    event.getRegistry().register(new ItemBlock(orePlatinum).setRegistryName(Objects.requireNonNull(orePlatinum.getRegistryName())));
                }
                //silver
                if (OreInAMillionConfig.isSilverEnabled) {
                    event.getRegistry().register(new ItemBlock(oreSilver).setRegistryName(Objects.requireNonNull(oreSilver.getRegistryName())));
                }
                //tin
                if (OreInAMillionConfig.isTinEnabled) {
                    event.getRegistry().register(new ItemBlock(oreTin).setRegistryName(Objects.requireNonNull(oreTin.getRegistryName())));
                }
                //titanium
                if (OreInAMillionConfig.isTitaniumEnabled) {
                    event.getRegistry().register(new ItemBlock(oreTitanium).setRegistryName(Objects.requireNonNull(oreTitanium.getRegistryName())));
                }
                //tungsten
                if (OreInAMillionConfig.isTungstenEnabled) {
                    event.getRegistry().register(new ItemBlock(oreTungsten).setRegistryName(Objects.requireNonNull(oreTungsten.getRegistryName())));
                }
                //uranium
                if (OreInAMillionConfig.isUraniumEnabled) {
                    event.getRegistry().register(new ItemBlock(oreUranium).setRegistryName(Objects.requireNonNull(oreUranium.getRegistryName())));
                }
                //zinc
                if (OreInAMillionConfig.isZincEnabled) {
                    event.getRegistry().register(new ItemBlock(oreZinc).setRegistryName(Objects.requireNonNull(oreZinc.getRegistryName())));
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
                if (OreInAMillionConfig.isThermalIngotsEnabled){
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
                if (OreInAMillionConfig.isTinkersIngotsEnabled){
                    //ardite
                    if (OreInAMillionConfig.isArditeEnabled){
                        event.getRegistry().register(new ItemBlock(oreArdite).setRegistryName(Objects.requireNonNull(oreArdite.getRegistryName())));
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
            //gems
            if (OreInAMillionConfig.isGemsEnabled){
                //amethyst
                if (OreInAMillionConfig.isAmethystEnabled){
                    event.getRegistry().register(new ItemBlock(oreAmethyst).setRegistryName(Objects.requireNonNull(oreAmethyst.getRegistryName())));
                }
                //peridot
                if (OreInAMillionConfig.isPeridotEnabled){
                    event.getRegistry().register(new ItemBlock(orePeridot).setRegistryName(Objects.requireNonNull(orePeridot.getRegistryName())));
                }
                //ruby
                if (OreInAMillionConfig.isRubyEnabled){
                    event.getRegistry().register(new ItemBlock(oreRuby).setRegistryName(Objects.requireNonNull(oreRuby.getRegistryName())));
                }
                //sapphire
                if (OreInAMillionConfig.isSapphireEnabled){
                    event.getRegistry().register(new ItemBlock(oreSapphire).setRegistryName(Objects.requireNonNull(oreSapphire.getRegistryName())));
                }
            }
            //other
            if (OreInAMillionConfig.isElementsEnabled){
                //carbon
                if (OreInAMillionConfig.isCarbonEnabled){

                }
                //cinnabar
                if (OreInAMillionConfig.isCinnabarEnabled){
                    event.getRegistry().register(new ItemBlock(oreCinnabar).setRegistryName(Objects.requireNonNull(oreCinnabar.getRegistryName())));
                }
                //sulphur
                if (OreInAMillionConfig.isSulphurEnabled){
                    event.getRegistry().register(new ItemBlock(oreSulfur).setRegistryName(Objects.requireNonNull(oreSulfur.getRegistryName())));
                }
            }
            if (OreInAMillionConfig.isVanillaEnabled) {
                //charcoal
                if (OreInAMillionConfig.isCharcoalEnabled) {

                }
                //coal
                if (OreInAMillionConfig.isCoalEnabled) {

                }
                //diamond
                if (OreInAMillionConfig.isDiamondEnabled) {

                }
                //emerald
                if (OreInAMillionConfig.isEmeraldEnabled) {

                }
                //quartz
                if (OreInAMillionConfig.isQuartzEnabled){

                }
            }
        }
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void registerRenders(ModelRegistryEvent event){
        //registerRender(Item.getItemFromBlock());
        if (OreInAMillionConfig.isMineralsEnabled) {
            if (OreInAMillionConfig.isIngotsEnabled) {
                //aluminum
                if (OreInAMillionConfig.isAluminumEnabled) {
                    registerRender(Item.getItemFromBlock(oreAluminum));
                }
                //chrome
                if (OreInAMillionConfig.isChromeEnabled) {
                    registerRender(Item.getItemFromBlock(oreChrome));
                }
                //cobalt
                if (OreInAMillionConfig.isCobaltEnabled) {
                    registerRender(Item.getItemFromBlock(oreCobalt));
                }
                //copper
                if (OreInAMillionConfig.isCopperEnabled) {
                    registerRender(Item.getItemFromBlock(oreCopper));
                }
                //ender
                if (OreInAMillionConfig.isEnderEnabled) {
                    registerRender(Item.getItemFromBlock(oreEnder));
                }
                //iridium
                if (OreInAMillionConfig.isIridiumEnabled) {
                    registerRender(Item.getItemFromBlock(oreIridium));
                }
                //lead
                if (OreInAMillionConfig.isLeadEnabled) {
                    registerRender(Item.getItemFromBlock(oreLead));
                }
                //mithril
                if (OreInAMillionConfig.isMithrilEnabled) {
                    registerRender(Item.getItemFromBlock(oreMithril));
                }
                //nickel
                if (OreInAMillionConfig.isNickelEnabled) {
                    registerRender(Item.getItemFromBlock(oreNickel));
                }
                //osmium
                if (OreInAMillionConfig.isOsmiumEnabled) {
                    registerRender(Item.getItemFromBlock(oreOsmium));
                }
                //platinum
                if (OreInAMillionConfig.isPlatinumEnabled) {
                    registerRender(Item.getItemFromBlock(orePlatinum));
                }
                //silver
                if (OreInAMillionConfig.isSilverEnabled) {
                    registerRender(Item.getItemFromBlock(oreSilver));
                }
                //tin
                if (OreInAMillionConfig.isTinEnabled) {
                    registerRender(Item.getItemFromBlock(oreTin));
                }
                //titanium
                if (OreInAMillionConfig.isTitaniumEnabled) {
                    registerRender(Item.getItemFromBlock(oreTitanium));
                }
                //tungsten
                if (OreInAMillionConfig.isTungstenEnabled) {
                    registerRender(Item.getItemFromBlock(oreTungsten));
                }
                //uranium
                if (OreInAMillionConfig.isUraniumEnabled) {
                    registerRender(Item.getItemFromBlock(oreUranium));
                }
                //zinc
                if (OreInAMillionConfig.isZincEnabled) {
                    registerRender(Item.getItemFromBlock(oreZinc));
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
                if (OreInAMillionConfig.isThermalIngotsEnabled){
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
                if (OreInAMillionConfig.isTinkersIngotsEnabled) {
                    //ardite
                    if (OreInAMillionConfig.isArditeEnabled) {
                        registerRender(Item.getItemFromBlock(oreArdite));
                    }
                    //knightslime
                    if (OreInAMillionConfig.isKnightSlimeEnabled) {

                    }
                    //pigiron
                    if (OreInAMillionConfig.isPigIronEnabled) {

                    }
                    //manyullyn
                    if (OreInAMillionConfig.isManyullynEnabled) {

                    }
                }
            }
            //gems
            if (OreInAMillionConfig.isGemsEnabled){
                //amethyst
                if (OreInAMillionConfig.isAmethystEnabled){
                    registerRender(Item.getItemFromBlock(oreAmethyst));
                }
                //peridot
                if (OreInAMillionConfig.isPeridotEnabled){
                    registerRender(Item.getItemFromBlock(orePeridot));
                }
                //ruby
                if (OreInAMillionConfig.isRubyEnabled){
                    registerRender(Item.getItemFromBlock(oreRuby));
                }
                //sapphire
                if (OreInAMillionConfig.isSapphireEnabled){
                    registerRender(Item.getItemFromBlock(oreSapphire));
                }
            }
            //elements
            if (OreInAMillionConfig.isElementsEnabled){
                //carbon
                if (OreInAMillionConfig.isCarbonEnabled){

                }
                //cinnabar
                if (OreInAMillionConfig.isCinnabarEnabled){
                    registerRender(Item.getItemFromBlock(oreCinnabar));
                }
                //sulphur
                if (OreInAMillionConfig.isSulphurEnabled){
                    registerRender(Item.getItemFromBlock(oreSulfur));
                }
            }
            //vanilla additions
            if (OreInAMillionConfig.isVanillaEnabled) {
                //charcoal
                if (OreInAMillionConfig.isCharcoalEnabled) {

                }
                //coal
                if (OreInAMillionConfig.isCoalEnabled) {

                }
                //diamond
                if (OreInAMillionConfig.isDiamondEnabled) {

                }
                //emerald
                if (OreInAMillionConfig.isEmeraldEnabled) {

                }
                //quartz
                if (OreInAMillionConfig.isQuartzEnabled){

                }
            }
        }
    }

    public static void registerRender(Item item)
    {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Objects.requireNonNull(item.getRegistryName()), "inventory"));
    }

    public static void initOreDict(){
        if (OreInAMillionConfig.isMineralsEnabled) {
            if (OreInAMillionConfig.isIngotsEnabled) {
                //aluminum
                if (OreInAMillionConfig.isAluminumEnabled) {
                    OreDictionary.registerOre("oreAluminum", ModBlocks.oreAluminum);
                }
                //chrome
                if (OreInAMillionConfig.isChromeEnabled) {
                    OreDictionary.registerOre("oreChrome", ModBlocks.oreChrome);
                }
                //cobalt
                if (OreInAMillionConfig.isCobaltEnabled) {
                    OreDictionary.registerOre("oreCobalt", ModBlocks.oreCobalt);
                }
                //copper
                if (OreInAMillionConfig.isCopperEnabled) {
                    OreDictionary.registerOre("oreCopper", ModBlocks.oreCopper);
                }
                //ender
                if (OreInAMillionConfig.isEnderEnabled){
                    OreDictionary.registerOre("oreEnder", ModBlocks.oreEnder);
                }
                //iridium
                if (OreInAMillionConfig.isIridiumEnabled) {
                    OreDictionary.registerOre("oreIridium", ModBlocks.oreIridium);
                }
                //lead
                if (OreInAMillionConfig.isLeadEnabled) {
                    OreDictionary.registerOre("oreLead", ModBlocks.oreLead);
                }
                //mithril
                if (OreInAMillionConfig.isMithrilEnabled) {
                    OreDictionary.registerOre("oreMithril", ModBlocks.oreMithril);
                }
                //nickel
                if (OreInAMillionConfig.isNickelEnabled) {
                    OreDictionary.registerOre("oreNickel", ModBlocks.oreNickel);
                }
                //osmium
                if (OreInAMillionConfig.isOsmiumEnabled) {
                    OreDictionary.registerOre("oreOsmium", ModBlocks.oreOsmium);
                }
                //platinum
                if (OreInAMillionConfig.isPlatinumEnabled) {
                    OreDictionary.registerOre("orePlatinum", ModBlocks.orePlatinum);
                }
                //silver
                if (OreInAMillionConfig.isSilverEnabled) {
                    OreDictionary.registerOre("oreSilver", ModBlocks.oreSilver);
                }
                //tin
                if (OreInAMillionConfig.isTinEnabled) {
                    OreDictionary.registerOre("oreTin", ModBlocks.oreTin);
                }
                //titanium
                if (OreInAMillionConfig.isTitaniumEnabled) {
                    OreDictionary.registerOre("oreTitanium", ModBlocks.oreTitanium);
                }
                //tungsten
                if (OreInAMillionConfig.isTungstenEnabled) {
                    OreDictionary.registerOre("oreTungsten", ModBlocks.oreTungsten);
                }
                //uranium
                if (OreInAMillionConfig.isUraniumEnabled) {
                    OreDictionary.registerOre("oreUranium", ModBlocks.oreUranium);
                }
                //zinc
                if (OreInAMillionConfig.isZincEnabled) {
                    OreDictionary.registerOre("oreZinc", ModBlocks.oreZinc);
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
                //fairy
                if (OreInAMillionConfig.isFairyEnabled){

                }
                //invar
                if (OreInAMillionConfig.isInvarEnabled) {

                }
                //steel
                if (OreInAMillionConfig.isSteelEnabled) {

                }
                //thermal series
                if (OreInAMillionConfig.isThermalIngotsEnabled){
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
                if (OreInAMillionConfig.isTinkersIngotsEnabled){
                    //ardite
                    if (OreInAMillionConfig.isArditeEnabled){
                        OreDictionary.registerOre("oreArdite", ModBlocks.oreArdite);
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
            //gems
            if (OreInAMillionConfig.isGemsEnabled){
                //amethyst
                if (OreInAMillionConfig.isAmethystEnabled){
                    OreDictionary.registerOre("oreAmethyst", ModBlocks.oreAmethyst);
                }
                //peridot
                if (OreInAMillionConfig.isPeridotEnabled){
                    OreDictionary.registerOre("orePeridot", ModBlocks.orePeridot);
                }
                //ruby
                if (OreInAMillionConfig.isRubyEnabled){
                    OreDictionary.registerOre("oreRuby", ModBlocks.oreRuby);
                }
                //sapphire
                if (OreInAMillionConfig.isSapphireEnabled){
                    OreDictionary.registerOre("oreSapphire", ModBlocks.oreSapphire);
                }
            }
            //elements
            if (OreInAMillionConfig.isElementsEnabled){
                //carbon
                if (OreInAMillionConfig.isCarbonEnabled){

                }
                //cinnabar
                if (OreInAMillionConfig.isCinnabarEnabled){
                    OreDictionary.registerOre("oreCinnabar", ModBlocks.oreCinnabar);
                }
                //sulphur
                if (OreInAMillionConfig.isSulphurEnabled){
                    OreDictionary.registerOre("oreSulfur", ModBlocks.oreSulfur);
                }
            }
            //vanilla additions
            if (OreInAMillionConfig.isVanillaEnabled){
                //charcoal
                if (OreInAMillionConfig.isCharcoalEnabled) {

                }
                //coal
                if (OreInAMillionConfig.isCoalEnabled) {

                }
                //diamond
                if (OreInAMillionConfig.isDiamondEnabled) {

                }
                //emerald
                if (OreInAMillionConfig.isEmeraldEnabled) {

                }
                //quartz
                if (OreInAMillionConfig.isQuartzEnabled){

                }
            }
            if (OreInAMillionConfig.isSillyStuffEnabled){

            }
        }
        //OreDictionary.registerOre("blockAluminium", ModBlocks.blockAluminium);
        //OreDictionary.registerOre("blockChrome", ModBlocks.blockChrome);
        //OreDictionary.registerOre("blockCobalt", ModBlocks.blockCobalt);
        //OreDictionary.registerOre("blockCopper", ModBlocks.blockCopper);
    }
}
