package com.blueberrysoda.oreinamillion.init;

import com.blueberrysoda.oreinamillion.items.armor.ItemArmorBase;
import com.blueberrysoda.oreinamillion.items.armor.armorspecial.ItemArmorCoal;
import com.blueberrysoda.oreinamillion.items.armor.armorspecial.ItemArmorFood;
import net.minecraftforge.fml.common.Mod;

import com.blueberrysoda.oreinamillion.config.OreInAMillionConfig;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Objects;

@Mod.EventBusSubscriber
public class ModArmor {

//    public static ItemArmorBase helmet;
//    public static ItemArmorBase chestplate;
//    public static ItemArmorBase leggings;
//    public static ItemArmorBase boots;

    //aluminum
    public static ItemArmorBase helmetAluminum;
    public static ItemArmorBase chestplateAluminum;
    public static ItemArmorBase leggingsAluminum;
    public static ItemArmorBase bootsAluminum;
    //ardite
    public static ItemArmorBase helmetArdite;
    public static ItemArmorBase chestplateArdite;
    public static ItemArmorBase leggingsArdite;
    public static ItemArmorBase bootsArdite;
    //chrome
    public static ItemArmorBase helmetChrome;
    public static ItemArmorBase chestplateChrome;
    public static ItemArmorBase leggingsChrome;
    public static ItemArmorBase bootsChrome;
    //cobalt
    public static ItemArmorBase helmetCobalt;
    public static ItemArmorBase chestplateCobalt;
    public static ItemArmorBase leggingsCobalt;
    public static ItemArmorBase bootsCobalt;
    //copper
    public static ItemArmorBase helmetCopper;
    public static ItemArmorBase chestplateCopper;
    public static ItemArmorBase leggingsCopper;
    public static ItemArmorBase bootsCopper;
    //ender
    public static ItemArmorBase helmetEnder;
    public static ItemArmorBase chestplateEnder;
    public static ItemArmorBase leggingsEnder;
    public static ItemArmorBase bootsEnder;
    //iridium
    public static ItemArmorBase helmetIridium;
    public static ItemArmorBase chestplateIridium;
    public static ItemArmorBase leggingsIridium;
    public static ItemArmorBase bootsIridium;
    //lead
    public static ItemArmorBase helmetLead;
    public static ItemArmorBase chestplateLead;
    public static ItemArmorBase leggingsLead;
    public static ItemArmorBase bootsLead;
    //mithril
    public static ItemArmorBase helmetMithril;
    public static ItemArmorBase chestplateMithril;
    public static ItemArmorBase leggingsMithril;
    public static ItemArmorBase bootsMithril;
    //nickel
    public static ItemArmorBase helmetNickel;
    public static ItemArmorBase chestplateNickel;
    public static ItemArmorBase leggingsNickel;
    public static ItemArmorBase bootsNickel;
    //osmium
    public static ItemArmorBase helmetOsmium;
    public static ItemArmorBase chestplateOsmium;
    public static ItemArmorBase leggingsOsmium;
    public static ItemArmorBase bootsOsmium;
    //platinum
    public static ItemArmorBase helmetPlatinum;
    public static ItemArmorBase chestplatePlatinum;
    public static ItemArmorBase leggingsPlatinum;
    public static ItemArmorBase bootsPlatinum;
    //silver
    public static ItemArmorBase helmetSilver;
    public static ItemArmorBase chestplateSilver;
    public static ItemArmorBase leggingsSilver;
    public static ItemArmorBase bootsSilver;
    //tin
    public static ItemArmorBase helmetTin;
    public static ItemArmorBase chestplateTin;
    public static ItemArmorBase leggingsTin;
    public static ItemArmorBase bootsTin;
    //titanium
    public static ItemArmorBase helmetTitanium;
    public static ItemArmorBase chestplateTitanium;
    public static ItemArmorBase leggingsTitanium;
    public static ItemArmorBase bootsTitanium;
    //tungsten
    public static ItemArmorBase helmetTungsten;
    public static ItemArmorBase chestplateTungsten;
    public static ItemArmorBase leggingsTungsten;
    public static ItemArmorBase bootsTungsten;
    //uranium
    public static ItemArmorBase helmetUranium;
    public static ItemArmorBase chestplateUranium;
    public static ItemArmorBase leggingsUranium;
    public static ItemArmorBase bootsUranium;
    //zinc
    public static ItemArmorBase helmetZinc;
    public static ItemArmorBase chestplateZinc;
    public static ItemArmorBase leggingsZinc;
    public static ItemArmorBase bootsZinc;
    //brass
    public static ItemArmorBase helmetBrass;
    public static ItemArmorBase chestplateBrass;
    public static ItemArmorBase leggingsBrass;
    public static ItemArmorBase bootsBrass;
    //bronze
    public static ItemArmorBase helmetBronze;
    public static ItemArmorBase chestplateBronze;
    public static ItemArmorBase leggingsBronze;
    public static ItemArmorBase bootsBronze;
    //constantan
    public static ItemArmorBase helmetConstantan;
    public static ItemArmorBase chestplateConstantan;
    public static ItemArmorBase leggingsConstantan;
    public static ItemArmorBase bootsConstantan;
    //electrum
    public static ItemArmorBase helmetElectrum;
    public static ItemArmorBase chestplateElectrum;
    public static ItemArmorBase leggingsElectrum;
    public static ItemArmorBase bootsElectrum;
    //enderium
    public static ItemArmorBase helmetEnderium;
    public static ItemArmorBase chestplateEnderium;
    public static ItemArmorBase leggingsEnderium;
    public static ItemArmorBase bootsEnderium;
    //fairy
    public static ItemArmorBase helmetFairy;
    public static ItemArmorBase chestplateFairy;
    public static ItemArmorBase leggingsFairy;
    public static ItemArmorBase bootsFairy;
    //invar
    public static ItemArmorBase helmetInvar;
    public static ItemArmorBase chestplateInvar;
    public static ItemArmorBase leggingsInvar;
    public static ItemArmorBase bootsInvar;
    //knightslime
    public static ItemArmorBase helmetKnightSlime;
    public static ItemArmorBase chestplateKnightSlime;
    public static ItemArmorBase leggingsKnightSlime;
    public static ItemArmorBase bootsKnightSlime;
    //lumium
    public static ItemArmorBase helmetLumium;
    public static ItemArmorBase chestplateLumium;
    public static ItemArmorBase leggingsLumium;
    public static ItemArmorBase bootsLumium;
    //manyullyn
    public static ItemArmorBase helmetManyullyn;
    public static ItemArmorBase chestplateManyullyn;
    public static ItemArmorBase leggingsManyullyn;
    public static ItemArmorBase bootsManyullyn;
    //pigiron
    public static ItemArmorFood helmetPigIron;
    public static ItemArmorFood chestplatePigIron;
    public static ItemArmorFood leggingsPigIron;
    public static ItemArmorFood bootsPigIron;
    //signalum
    public static ItemArmorBase helmetSignalum;
    public static ItemArmorBase chestplateSignalum;
    public static ItemArmorBase leggingsSignalum;
    public static ItemArmorBase bootsSignalum;
    //steel
    public static ItemArmorBase helmetSteel;
    public static ItemArmorBase chestplateSteel;
    public static ItemArmorBase leggingsSteel;
    public static ItemArmorBase bootsSteel;
    //amethyst
    public static ItemArmorBase helmetAmethyst;
    public static ItemArmorBase chestplateAmethyst;
    public static ItemArmorBase leggingsAmethyst;
    public static ItemArmorBase bootsAmethyst;
    //peridot
    public static ItemArmorBase helmetPeridot;
    public static ItemArmorBase chestplatePeridot;
    public static ItemArmorBase leggingsPeridot;
    public static ItemArmorBase bootsPeridot;
    //ruby
    public static ItemArmorBase helmetRuby;
    public static ItemArmorBase chestplateRuby;
    public static ItemArmorBase leggingsRuby;
    public static ItemArmorBase bootsRuby;
    //sapphire
    public static ItemArmorBase helmetSapphire;
    public static ItemArmorBase chestplateSapphire;
    public static ItemArmorBase leggingsSapphire;
    public static ItemArmorBase bootsSapphire;
    //charcoal
    public static ItemArmorCoal helmetCharcoal;
    public static ItemArmorCoal chestplateCharcoal;
    public static ItemArmorCoal leggingsCharcoal;
    public static ItemArmorCoal bootsCharcoal;
    //coal
    public static ItemArmorCoal helmetCoal;
    public static ItemArmorCoal chestplateCoal;
    public static ItemArmorCoal leggingsCoal;
    public static ItemArmorCoal bootsCoal;
    //emerald
    public static ItemArmorBase helmetEmerald;
    public static ItemArmorBase chestplateEmerald;
    public static ItemArmorBase leggingsEmerald;
    public static ItemArmorBase bootsEmerald;
    //quartz
    public static ItemArmorBase helmetQuartz;
    public static ItemArmorBase chestplateQuartz;
    public static ItemArmorBase leggingsQuartz;
    public static ItemArmorBase bootsQuartz;



    public static void init() {
        if (OreInAMillionConfig.isMineralsEnabled) {
            if (OreInAMillionConfig.isToolsEnabled) {
                if (OreInAMillionConfig.isIngotsEnabled) {
                    //aluminum
                    if (OreInAMillionConfig.isAluminumEnabled) {

                    }
                    //chrome
                    if (OreInAMillionConfig.isChromeEnabled) {

                    }
                    //cobalt
                    if (OreInAMillionConfig.isCobaltEnabled) {

                    }
                    //copper
                    if (OreInAMillionConfig.isCopperEnabled) {

                    }
                    //ender
                    if (OreInAMillionConfig.isEnderEnabled) {

                    }
                    //iridium
                    if (OreInAMillionConfig.isIridiumEnabled) {

                    }
                    //lead
                    if (OreInAMillionConfig.isLeadEnabled) {

                    }
                    //mithril
                    if (OreInAMillionConfig.isMithrilEnabled) {

                    }
                    //nickel
                    if (OreInAMillionConfig.isNickelEnabled) {

                    }
                    //osmium
                    if (OreInAMillionConfig.isOsmiumEnabled) {

                    }
                    //platinum
                    if (OreInAMillionConfig.isPlatinumEnabled) {

                    }
                    //silver
                    if (OreInAMillionConfig.isSilverEnabled) {

                    }
                    //tin
                    if (OreInAMillionConfig.isTinEnabled) {

                    }
                    //titanium
                    if (OreInAMillionConfig.isTitaniumEnabled) {

                    }
                    //tungsten
                    if (OreInAMillionConfig.isTungstenEnabled) {

                    }
                    //uranium
                    if (OreInAMillionConfig.isUraniumEnabled) {

                    }
                    //zinc
                    if (OreInAMillionConfig.isZincEnabled) {

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
                    if (OreInAMillionConfig.isFairyEnabled) {

                    }
                    //invar
                    if (OreInAMillionConfig.isInvarEnabled) {

                    }
                    //steel
                    if (OreInAMillionConfig.isSteelEnabled) {

                    }
                    //thermal series
                    if (OreInAMillionConfig.isThermalIngotsEnabled) {
                        //constantan
                        if (OreInAMillionConfig.isConstantanEnabled) {

                        }
                        //enderium
                        if (OreInAMillionConfig.isEnderiumEnabled) {

                        }
                        //lumium
                        if (OreInAMillionConfig.isLumiumEnabled) {

                        }
                        //signalum
                        if (OreInAMillionConfig.isSignalumEnabled) {

                        }
                    }
                    //tinkers construct
                    if (OreInAMillionConfig.isTinkersIngotsEnabled) {
                        //ardite
                        if (OreInAMillionConfig.isArditeEnabled) {

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
                if (OreInAMillionConfig.isGemsEnabled) {
                    //amethyst
                    if (OreInAMillionConfig.isAmethystEnabled) {

                    }
                    //peridot
                    if (OreInAMillionConfig.isPeridotEnabled) {

                    }
                    //ruby
                    if (OreInAMillionConfig.isRubyEnabled) {

                    }
                    //sapphire
                    if (OreInAMillionConfig.isSapphireEnabled) {

                    }
                }
                //elements
                if (OreInAMillionConfig.isElementsEnabled) {
                    //carbon
                    if (OreInAMillionConfig.isCarbonEnabled) {

                    }
                    //cinnabar
                    if (OreInAMillionConfig.isCinnabarEnabled) {

                    }
                    //silicon
                    if (OreInAMillionConfig.isSiliconEnabled) {

                    }
                    //sulphur
                    if (OreInAMillionConfig.isSulphurEnabled) {

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
                    if (OreInAMillionConfig.isQuartzEnabled) {

                    }
                }
                if (OreInAMillionConfig.isSillyStuffEnabled) {

                }
            }
        }
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){
        if (OreInAMillionConfig.isMineralsEnabled) {
            if (OreInAMillionConfig.isIngotsEnabled) {
                //aluminum
                if (OreInAMillionConfig.isAluminumEnabled) {

                }
                //chrome
                if (OreInAMillionConfig.isChromeEnabled) {

                }
                //cobalt
                if (OreInAMillionConfig.isCobaltEnabled) {

                }
                //copper
                if (OreInAMillionConfig.isCopperEnabled) {

                }
                //ender
                if (OreInAMillionConfig.isEnderEnabled){

                }
                //iridium
                if (OreInAMillionConfig.isIridiumEnabled) {

                }
                //lead
                if (OreInAMillionConfig.isLeadEnabled) {

                }
                //mithril
                if (OreInAMillionConfig.isMithrilEnabled) {

                }
                //nickel
                if (OreInAMillionConfig.isNickelEnabled) {

                }
                //osmium
                if (OreInAMillionConfig.isOsmiumEnabled) {

                }
                //platinum
                if (OreInAMillionConfig.isPlatinumEnabled) {

                }
                //silver
                if (OreInAMillionConfig.isSilverEnabled) {

                }
                //tin
                if (OreInAMillionConfig.isTinEnabled) {

                }
                //titanium
                if (OreInAMillionConfig.isTitaniumEnabled) {

                }
                //tungsten
                if (OreInAMillionConfig.isTungstenEnabled) {

                }
                //uranium
                if (OreInAMillionConfig.isUraniumEnabled) {

                }
                //zinc
                if (OreInAMillionConfig.isZincEnabled) {

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

                }
                //peridot
                if (OreInAMillionConfig.isPeridotEnabled){

                }
                //ruby
                if (OreInAMillionConfig.isRubyEnabled){

                }
                //sapphire
                if (OreInAMillionConfig.isSapphireEnabled){

                }
            }
            //elements
            if (OreInAMillionConfig.isElementsEnabled){
                //carbon
                if (OreInAMillionConfig.isCarbonEnabled){

                }
                //cinnabar
                if (OreInAMillionConfig.isCinnabarEnabled){

                }
                //silicon
                if (OreInAMillionConfig.isSiliconEnabled){

                }
                //sulphur
                if (OreInAMillionConfig.isSulphurEnabled){

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
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event){
        if (OreInAMillionConfig.isMineralsEnabled) {
            if (OreInAMillionConfig.isIngotsEnabled) {
                //aluminum
                if (OreInAMillionConfig.isAluminumEnabled) {

                }
                //chrome
                if (OreInAMillionConfig.isChromeEnabled) {

                }
                //cobalt
                if (OreInAMillionConfig.isCobaltEnabled) {

                }
                //copper
                if (OreInAMillionConfig.isCopperEnabled) {

                }
                //ender
                if (OreInAMillionConfig.isEnderEnabled){

                }
                //iridium
                if (OreInAMillionConfig.isIridiumEnabled) {

                }
                //lead
                if (OreInAMillionConfig.isLeadEnabled) {

                }
                //mithril
                if (OreInAMillionConfig.isMithrilEnabled) {

                }
                //nickel
                if (OreInAMillionConfig.isNickelEnabled) {

                }
                //osmium
                if (OreInAMillionConfig.isOsmiumEnabled) {

                }
                //platinum
                if (OreInAMillionConfig.isPlatinumEnabled) {

                }
                //silver
                if (OreInAMillionConfig.isSilverEnabled) {

                }
                //tin
                if (OreInAMillionConfig.isTinEnabled) {

                }
                //titanium
                if (OreInAMillionConfig.isTitaniumEnabled) {

                }
                //tungsten
                if (OreInAMillionConfig.isTungstenEnabled) {

                }
                //uranium
                if (OreInAMillionConfig.isUraniumEnabled) {

                }
                //zinc
                if (OreInAMillionConfig.isZincEnabled) {

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

                }
                //peridot
                if (OreInAMillionConfig.isPeridotEnabled){

                }
                //ruby
                if (OreInAMillionConfig.isRubyEnabled){

                }
                //sapphire
                if (OreInAMillionConfig.isSapphireEnabled){

                }
            }
            //elements
            if (OreInAMillionConfig.isElementsEnabled){
                //carbon
                if (OreInAMillionConfig.isCarbonEnabled){

                }
                //cinnabar
                if (OreInAMillionConfig.isCinnabarEnabled){

                }
                //silicon
                if (OreInAMillionConfig.isSiliconEnabled){

                }
                //sulphur
                if (OreInAMillionConfig.isSulphurEnabled){

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
    }

    private static void registerRender(Item item)
    {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Objects.requireNonNull(item.getRegistryName()), "inventory"));
    }

    public static void initOreDict(){
        if (OreInAMillionConfig.isMineralsEnabled) {
            if (OreInAMillionConfig.isIngotsEnabled) {
                //aluminum
                if (OreInAMillionConfig.isAluminumEnabled) {

                }
                //chrome
                if (OreInAMillionConfig.isChromeEnabled) {

                }
                //cobalt
                if (OreInAMillionConfig.isCobaltEnabled) {

                }
                //copper
                if (OreInAMillionConfig.isCopperEnabled) {

                }
                //ender
                if (OreInAMillionConfig.isEnderEnabled){

                }
                //iridium
                if (OreInAMillionConfig.isIridiumEnabled) {

                }
                //lead
                if (OreInAMillionConfig.isLeadEnabled) {

                }
                //mithril
                if (OreInAMillionConfig.isMithrilEnabled) {

                }
                //nickel
                if (OreInAMillionConfig.isNickelEnabled) {

                }
                //osmium
                if (OreInAMillionConfig.isOsmiumEnabled) {

                }
                //platinum
                if (OreInAMillionConfig.isPlatinumEnabled) {

                }
                //silver
                if (OreInAMillionConfig.isSilverEnabled) {

                }
                //tin
                if (OreInAMillionConfig.isTinEnabled) {

                }
                //titanium
                if (OreInAMillionConfig.isTitaniumEnabled) {

                }
                //tungsten
                if (OreInAMillionConfig.isTungstenEnabled) {

                }
                //uranium
                if (OreInAMillionConfig.isUraniumEnabled) {

                }
                //zinc
                if (OreInAMillionConfig.isZincEnabled) {

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

                }
                //peridot
                if (OreInAMillionConfig.isPeridotEnabled){

                }
                //ruby
                if (OreInAMillionConfig.isRubyEnabled){

                }
                //sapphire
                if (OreInAMillionConfig.isSapphireEnabled){

                }
            }
            //elements
            if (OreInAMillionConfig.isElementsEnabled){
                //carbon
                if (OreInAMillionConfig.isCarbonEnabled){

                }
                //cinnabar
                if (OreInAMillionConfig.isCinnabarEnabled){

                }
                //silicon
                if (OreInAMillionConfig.isSiliconEnabled){

                }
                //sulphur
                if (OreInAMillionConfig.isSulphurEnabled){

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
    }
}