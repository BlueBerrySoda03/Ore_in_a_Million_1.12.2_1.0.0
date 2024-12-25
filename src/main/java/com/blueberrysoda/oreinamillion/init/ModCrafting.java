package com.blueberrysoda.oreinamillion.init;

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
public class ModCrafting {
    //aluminum


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