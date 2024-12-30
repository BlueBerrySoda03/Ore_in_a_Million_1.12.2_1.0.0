package com.blueberrysoda.oreinamillion.init;

import com.blueberrysoda.oreinamillion.config.OreInAMillionConfig;
import com.blueberrysoda.oreinamillion.items.crafting.*;
import com.blueberrysoda.oreinamillion.items.food.ItemFoodCrafting;
import com.blueberrysoda.oreinamillion.items.food.ItemFoodMineral;
import com.blueberrysoda.oreinamillion.items.food.ItemFoodSoupcan;
import com.blueberrysoda.oreinamillion.items.misc.ItemIcon;
import com.blueberrysoda.oreinamillion.items.misc.ItemWeezer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.oredict.OreDictionary;

import java.util.Objects;

@Mod.EventBusSubscriber
public class ModItems {
    //=========
    //minerals
    //=========
    //base ingots
    public static ItemMineral ingotAluminum;
    public static ItemMineral ingotArdite;
    public static ItemMineral ingotChrome;
    public static ItemMineral ingotCobalt;
    public static ItemMineral ingotCopper;
    public static ItemMineral ingotEnder;
    public static ItemMineral ingotIridium;
    public static ItemMineral ingotLead;
    public static ItemMineral ingotMithril;
    public static ItemMineral ingotNickel;
    public static ItemMineral ingotOsmium;
    public static ItemMineral ingotPlatinum;
    public static ItemMineral ingotSilver;
    public static ItemMineral ingotTin;
    public static ItemMineral ingotTitanium;
    public static ItemMineral ingotTungsten;
    public static ItemMineral ingotUranium;
    public static ItemMineral ingotZinc;
    //alloy ingots
    public static ItemMineral ingotBrass;
    public static ItemMineral ingotBronze;
    public static ItemMineral ingotConstantan;
    public static ItemMineral ingotElectrum;
    public static ItemMineral ingotEnderium;
    public static ItemMineral ingotFairy;
    public static ItemMineral ingotInvar;
    public static ItemMineral ingotKnightSlime;
    public static ItemMineral ingotLumium;
    public static ItemMineral ingotManyullyn;
    public static ItemFoodMineral ingotPigIron;
    public static ItemMineral ingotSignalum;
    public static ItemMineral ingotSteel;
    //gems
    public static ItemMineral gemAmethyst;
    public static ItemMineral gemPeridot;
    public static ItemMineral gemRuby;
    public static ItemMineral gemSapphire;
    //other
    public static ItemMineral elementCarbon;
    public static ItemMineral elementCinnabar;
    public static ItemMineral elementSilicon;
    public static ItemMineral elementSulfur;

    //=========
    //nuggets
    //=========
    //base nuggets
    public static ItemMineral nuggetAluminum;
    public static ItemMineral nuggetArdite;
    public static ItemMineral nuggetChrome;
    public static ItemMineral nuggetCobalt;
    public static ItemMineral nuggetCopper;
    public static ItemMineral nuggetEnder;
    public static ItemMineral nuggetIridium;
    public static ItemMineral nuggetLead;
    public static ItemMineral nuggetMithril;
    public static ItemMineral nuggetNickel;
    public static ItemMineral nuggetOsmium;
    public static ItemMineral nuggetPlatinum;
    public static ItemMineral nuggetSilver;
    public static ItemMineral nuggetTin;
    public static ItemMineral nuggetTitanium;
    public static ItemMineral nuggetTungsten;
    public static ItemMineral nuggetUranium;
    public static ItemMineral nuggetZinc;
    //alloy nuggets
    public static ItemMineral nuggetBrass;
    public static ItemMineral nuggetBronze;
    public static ItemMineral nuggetConstantan;
    public static ItemMineral nuggetElectrum;
    public static ItemMineral nuggetEnderium;
    public static ItemMineral nuggetFairy;
    public static ItemMineral nuggetInvar;
    public static ItemMineral nuggetKnightSlime;
    public static ItemMineral nuggetLumium;
    public static ItemMineral nuggetManyullyn;
    public static ItemFoodMineral nuggetPigIron;
    public static ItemMineral nuggetSignalum;
    public static ItemMineral nuggetSteel;
    //gem nuggets
    public static ItemMineral nuggetAmethyst;
    public static ItemMineral nuggetPeridot;
    public static ItemMineral nuggetRuby;
    public static ItemMineral nuggetSapphire;
    //element nuggets
    public static ItemMineral nuggetCarbon;
    public static ItemMineral nuggetCinnabar;
    public static ItemMineral nuggetSilicon;
    public static ItemMineral nuggetSulfur;
    //vanilla nuggets
    public static ItemCoalMineral nuggetCharcoal;
    public static ItemCoalMineral nuggetCoal;
    public static ItemMineral nuggetDiamond;
    public static ItemMineral nuggetEmerald;
    public static ItemMineral nuggetQuartz;

    //========
    //dusts
    //========
    //base ingots
    public static ItemMineral dustAluminum;
    public static ItemMineral dustArdite;
    public static ItemMineral dustChrome;
    public static ItemMineral dustCobalt;
    public static ItemMineral dustCopper;
    public static ItemMineral dustEnder;
    public static ItemMineral dustIridium;
    public static ItemMineral dustLead;
    public static ItemMineral dustMithril;
    public static ItemMineral dustNickel;
    public static ItemMineral dustOsmium;
    public static ItemMineral dustPlatinum;
    public static ItemMineral dustSilver;
    public static ItemMineral dustTin;
    public static ItemMineral dustTitanium;
    public static ItemMineral dustTungsten;
    public static ItemMineral dustUranium;
    public static ItemMineral dustZinc;
    //alloy ingots
    public static ItemMineral dustBrass;
    public static ItemMineral dustBronze;
    public static ItemMineral dustConstantan;
    public static ItemMineral dustElectrum;
    public static ItemMineral dustEnderium;
    public static ItemMineral dustFairy;
    public static ItemMineral dustInvar;
    public static ItemMineral dustKnightSlime;
    public static ItemMineral dustLumium;
    public static ItemMineral dustManyullyn;
    public static ItemFoodMineral dustPigIron;
    public static ItemMineral dustSignalum;
    public static ItemMineral dustSteel;
    //gems
    public static ItemMineral dustAmethyst;
    public static ItemMineral dustPeridot;
    public static ItemMineral dustRuby;
    public static ItemMineral dustSapphire;
    //other
    public static ItemMineral dustCarbon;
    public static ItemMineral dustCinnabar;
    public static ItemMineral dustSulfur;
    public static ItemMineral dustSilicon;
    //vanilla
    public static ItemCoalMineral dustCharcoal;
    public static ItemCoalMineral dustCoal;
    public static ItemMineral dustDiamond;
    public static ItemMineral dustEmerald;
    public static ItemMineral dustGold;
    public static ItemMineral dustIron;
    public static ItemMineral dustQuartz;

    //==========
    //gears
    //==========
    //base ingots
    public static ItemCrafting gearAluminum;
    public static ItemCrafting gearArdite;
    public static ItemCrafting gearChrome;
    public static ItemCrafting gearCobalt;
    public static ItemCrafting gearCopper;
    public static ItemCrafting gearEnder;
    public static ItemCrafting gearIridium;
    public static ItemCrafting gearLead;
    public static ItemCrafting gearMithril;
    public static ItemCrafting gearNickel;
    public static ItemCrafting gearOsmium;
    public static ItemCrafting gearPlatinum;
    public static ItemCrafting gearSilver;
    public static ItemCrafting gearTin;
    public static ItemCrafting gearTitanium;
    public static ItemCrafting gearTungsten;
    public static ItemCrafting gearUranium;
    public static ItemCrafting gearZinc;
    //alloy ingots
    public static ItemCrafting gearBrass;
    public static ItemCrafting gearBronze;
    public static ItemCrafting gearConstantan;
    public static ItemCrafting gearElectrum;
    public static ItemCrafting gearEnderium;
    public static ItemCrafting gearFairy;
    public static ItemCrafting gearInvar;
    public static ItemCrafting gearKnightSlime;
    public static ItemCrafting gearLumium;
    public static ItemCrafting gearManyullyn;
    public static ItemFoodCrafting gearPigIron;
    public static ItemCrafting gearSignalum;
    public static ItemCrafting gearSteel;
    //gems
    public static ItemCrafting gearAmethyst;
    public static ItemCrafting gearPeridot;
    public static ItemCrafting gearRuby;
    public static ItemCrafting gearSapphire;
    //other
//    public static ItemCrafting gearSilicon;
    //vanilla
    public static ItemCoalCrafting gearCharcoal;
    public static ItemCoalCrafting gearCoal;
    public static ItemCrafting gearDiamond;
    public static ItemCrafting gearEmerald;
    public static ItemCrafting gearGold;
    public static ItemCrafting gearIron;
    public static ItemCrafting gearQuartz;

    //========
    //plates
    //========
    //base ingots
    public static ItemCrafting plateAluminum;
    public static ItemCrafting plateArdite;
    public static ItemCrafting plateChrome;
    public static ItemCrafting plateCobalt;
    public static ItemCrafting plateCopper;
    public static ItemCrafting plateEnder;
    public static ItemCrafting plateIridium;
    public static ItemCrafting plateLead;
    public static ItemCrafting plateMithril;
    public static ItemCrafting plateNickel;
    public static ItemCrafting plateOsmium;
    public static ItemCrafting platePlatinum;
    public static ItemCrafting plateSilver;
    public static ItemCrafting plateTin;
    public static ItemCrafting plateTitanium;
    public static ItemCrafting plateTungsten;
    public static ItemCrafting plateUranium;
    public static ItemCrafting plateZinc;
    //alloy ingots
    public static ItemCrafting plateBrass;
    public static ItemCrafting plateBronze;
    public static ItemCrafting plateConstantan;
    public static ItemCrafting plateElectrum;
    public static ItemCrafting plateEnderium;
    public static ItemCrafting plateFairy;
    public static ItemCrafting plateInvar;
    public static ItemCrafting plateKnightSlime;
    public static ItemCrafting plateLumium;
    public static ItemCrafting plateManyullyn;
    public static ItemFoodCrafting platePigIron;
    public static ItemCrafting plateSignalum;
    public static ItemCrafting plateSteel;
    //gems
    public static ItemCrafting plateAmethyst;
    public static ItemCrafting platePeridot;
    public static ItemCrafting plateRuby;
    public static ItemCrafting plateSapphire;
    //other
//    public static ItemCrafting plateSilicon;
    //vanilla
    public static ItemCoalCrafting plateCharcoal;
    public static ItemCoalCrafting plateCoal;
    public static ItemCrafting plateDiamond;
    public static ItemCrafting plateEmerald;
    public static ItemCrafting plateGold;
    public static ItemCrafting plateIron;
    public static ItemCrafting plateQuartz;

    //========
    //rods
    //========
    //base ingots
    public static ItemCrafting rodAluminum;
    public static ItemCrafting rodArdite;
    public static ItemCrafting rodChrome;
    public static ItemCrafting rodCobalt;
    public static ItemCrafting rodCopper;
    public static ItemCrafting rodEnder;
    public static ItemCrafting rodIridium;
    public static ItemCrafting rodLead;
    public static ItemCrafting rodMithril;
    public static ItemCrafting rodNickel;
    public static ItemCrafting rodOsmium;
    public static ItemCrafting rodPlatinum;
    public static ItemCrafting rodSilver;
    public static ItemCrafting rodTin;
    public static ItemCrafting rodTitanium;
    public static ItemCrafting rodTungsten;
    public static ItemCrafting rodUranium;
    public static ItemCrafting rodZinc;
    //alloy ingots
    public static ItemCrafting rodBrass;
    public static ItemCrafting rodBronze;
    public static ItemCrafting rodConstantan;
    public static ItemCrafting rodElectrum;
    public static ItemCrafting rodEnderium;
    public static ItemCrafting rodFairy;
    public static ItemCrafting rodInvar;
    public static ItemCrafting rodKnightSlime;
    public static ItemCrafting rodLumium;
    public static ItemCrafting rodManyullyn;
    public static ItemFoodCrafting rodPigIron;
    public static ItemCrafting rodSignalum;
    public static ItemCrafting rodSteel;
    //gems
    public static ItemCrafting rodAmethyst;
    public static ItemCrafting rodPeridot;
    public static ItemCrafting rodRuby;
    public static ItemCrafting rodSapphire;
    //other
//    public static ItemCrafting rodSilicon;
    //vanilla
    public static ItemCoalCrafting rodCharcoal;
    public static ItemCoalCrafting rodCoal;
    public static ItemCrafting rodDiamond;
    public static ItemCrafting rodEmerald;
    public static ItemCrafting rodGold;
    public static ItemCrafting rodIron;
    public static ItemCrafting rodQuartz;

    //========
    //silly stuff
    //========
    public static ItemMain tinCan;
    public static ItemFoodSoupcan foodSoupcan;
    public static ItemWeezer weezerWeezer;

    //========
    //icons
    //========
    public static ItemIcon creativeIcon1;
    public static ItemIcon creativeIcon2;
    public static ItemIcon creativeIcon3;
    public static ItemIcon creativeIcon4;
    public static ItemIcon creativeIcon5;
    public static ItemIcon creativeIcon6;

    public static void init(){
        // = new ("");

//        ingot = new ItemMineral("_ingot");
//        nugget = new ItemMineral("_nugget");
//        dust = new ItemMineral("_dust");
//        gear = new ItemCrafting("_gear");
//        plate = new ItemCrafting("_plate");
//        rod = new ItemCrafting("_rod");

        if (OreInAMillionConfig.isMineralsEnabled) {
            if (OreInAMillionConfig.isIngotsEnabled) {
                //aluminum
                if (OreInAMillionConfig.isAluminumEnabled) {
                    ingotAluminum = new ItemMineral("aluminum_ingot");
                    nuggetAluminum = new ItemMineral("aluminum_nugget");
                    dustAluminum = new ItemMineral("aluminum_dust");
                    gearAluminum = new ItemCrafting("aluminum_gear");
                    plateAluminum = new ItemCrafting("aluminum_plate");
                    rodAluminum = new ItemCrafting("aluminum_rod");
                }
                //chrome
                if (OreInAMillionConfig.isChromeEnabled) {
                    ingotChrome = new ItemMineral("chrome_ingot");
                    nuggetChrome = new ItemMineral("chrome_nugget");
                    dustChrome = new ItemMineral("chrome_dust");
                    gearChrome = new ItemCrafting("chrome_gear");
                    plateChrome = new ItemCrafting("chrome_plate");
                    rodChrome = new ItemCrafting("chrome_rod");
                }
                //cobalt
                if (OreInAMillionConfig.isCobaltEnabled) {
                    ingotCobalt = new ItemMineral("cobalt_ingot");
                    nuggetCobalt = new ItemMineral("cobalt_nugget");
                    dustCobalt = new ItemMineral("cobalt_dust");
                    gearCobalt = new ItemCrafting("cobalt_gear");
                    plateCobalt = new ItemCrafting("cobalt_plate");
                    rodCobalt = new ItemCrafting("cobalt_rod");
                }
                //copper
                if (OreInAMillionConfig.isCopperEnabled) {
                    ingotCopper = new ItemMineral("copper_ingot");
                    nuggetCopper = new ItemMineral("copper_nugget");
                    dustCopper = new ItemMineral("copper_dust");
                    gearCopper = new ItemCrafting("copper_gear");
                    plateCopper = new ItemCrafting("copper_plate");
                    rodCopper = new ItemCrafting("copper_rod");
                }
                //ender
                if (OreInAMillionConfig.isEnderEnabled){
                    ingotEnder = new ItemMineral("ender_ingot");
                    nuggetEnder = new ItemMineral("ender_nugget");
                    dustEnder = new ItemMineral("ender_dust");
                    gearEnder = new ItemCrafting("ender_gear");
                    plateEnder = new ItemCrafting("ender_plate");
                    rodEnder = new ItemCrafting("ender_rod");
                }
                //iridium
                if (OreInAMillionConfig.isIridiumEnabled) {
                    ingotIridium = new ItemMineral("iridium_ingot");
                    nuggetIridium = new ItemMineral("iridium_nugget");
                    dustIridium = new ItemMineral("iridium_dust");
                    gearIridium = new ItemCrafting("iridium_gear");
                    plateIridium = new ItemCrafting("iridium_plate");
                    rodIridium = new ItemCrafting("iridium_rod");
                }
                //lead
                if (OreInAMillionConfig.isLeadEnabled) {
                    ingotLead = new ItemMineral("lead_ingot");
                    nuggetLead = new ItemMineral("lead_nugget");
                    dustLead = new ItemMineral("lead_dust");
                    gearLead = new ItemCrafting("lead_gear");
                    plateLead = new ItemCrafting("lead_plate");
                    rodLead = new ItemCrafting("lead_rod");
                }
                //mithril
                if (OreInAMillionConfig.isMithrilEnabled) {
                    ingotMithril = new ItemMineral("mithril_ingot");
                    nuggetMithril = new ItemMineral("mithril_nugget");
                    dustMithril = new ItemMineral("mithril_dust");
                    gearMithril = new ItemCrafting("mithril_gear");
                    plateMithril = new ItemCrafting("mithril_plate");
                    rodMithril = new ItemCrafting("mithril_rod");
                }
                //nickel
                if (OreInAMillionConfig.isNickelEnabled) {
                    ingotNickel = new ItemMineral("nickel_ingot");
                    nuggetNickel = new ItemMineral("nickel_nugget");
                    dustNickel = new ItemMineral("nickel_dust");
                    gearNickel = new ItemCrafting("nickel_gear");
                    plateNickel = new ItemCrafting("nickel_plate");
                    rodNickel = new ItemCrafting("nickel_rod");
                }
                //osmium
                if (OreInAMillionConfig.isOsmiumEnabled) {
                    ingotOsmium = new ItemMineral("osmium_ingot");
                    nuggetOsmium = new ItemMineral("osmium_nugget");
                    dustOsmium = new ItemMineral("osmium_dust");
                    gearOsmium = new ItemCrafting("osmium_gear");
                    plateOsmium = new ItemCrafting("osmium_plate");
                    rodOsmium = new ItemCrafting("osmium_rod");
                }
                //platinum
                if (OreInAMillionConfig.isPlatinumEnabled) {
                    ingotPlatinum = new ItemMineral("platinum_ingot");
                    nuggetPlatinum = new ItemMineral("platinum_nugget");
                    dustPlatinum = new ItemMineral("platinum_dust");
                    gearPlatinum = new ItemCrafting("platinum_gear");
                    platePlatinum = new ItemCrafting("platinum_plate");
                    rodPlatinum = new ItemCrafting("platinum_rod");
                }
                //silver
                if (OreInAMillionConfig.isSilverEnabled) {
                    ingotSilver = new ItemMineral("silver_ingot");
                    nuggetSilver = new ItemMineral("silver_nugget");
                    dustSilver = new ItemMineral("silver_dust");
                    gearSilver = new ItemCrafting("silver_gear");
                    plateSilver = new ItemCrafting("silver_plate");
                    rodSilver = new ItemCrafting("silver_rod");
                }
                //tin
                if (OreInAMillionConfig.isTinEnabled) {
                    ingotTin = new ItemMineral("tin_ingot");
                    nuggetTin = new ItemMineral("tin_nugget");
                    dustTin = new ItemMineral("tin_dust");
                    gearTin = new ItemCrafting("tin_gear");
                    plateTin = new ItemCrafting("tin_plate");
                    rodTin = new ItemCrafting("tin_rod");
                }
                //titanium
                if (OreInAMillionConfig.isTitaniumEnabled) {
                    ingotTitanium = new ItemMineral("titanium_ingot");
                    nuggetTitanium = new ItemMineral("titanium_nugget");
                    dustTitanium = new ItemMineral("titanium_dust");
                    gearTitanium = new ItemCrafting("titanium_gear");
                    plateTitanium = new ItemCrafting("titanium_plate");
                    rodTitanium = new ItemCrafting("titanium_rod");
                }
                //tungsten
                if (OreInAMillionConfig.isTungstenEnabled) {
                    ingotTungsten = new ItemMineral("tungsten_ingot");
                    nuggetTungsten = new ItemMineral("tungsten_nugget");
                    dustTungsten = new ItemMineral("tungsten_dust");
                    gearTungsten = new ItemCrafting("tungsten_gear");
                    plateTungsten = new ItemCrafting("tungsten_plate");
                    rodTungsten = new ItemCrafting("tungsten_rod");
                }
                //uranium
                if (OreInAMillionConfig.isUraniumEnabled) {
                    ingotUranium = new ItemMineral("uranium_ingot");
                    nuggetUranium = new ItemMineral("uranium_nugget");
                    dustUranium = new ItemMineral("uranium_dust");
                    gearUranium = new ItemCrafting("uranium_gear");
                    plateUranium = new ItemCrafting("uranium_plate");
                    rodUranium = new ItemCrafting("uranium_rod");
                }
                //zinc
                if (OreInAMillionConfig.isZincEnabled) {
                    ingotZinc = new ItemMineral("zinc_ingot");
                    nuggetZinc = new ItemMineral("zinc_nugget");
                    dustZinc = new ItemMineral("zinc_dust");
                    gearZinc = new ItemCrafting("zinc_gear");
                    plateZinc = new ItemCrafting("zinc_plate");
                    rodZinc = new ItemCrafting("zinc_rod");
                }
                //brass
                if (OreInAMillionConfig.isBrassEnabled) {
                    ingotBrass = new ItemMineral("brass_ingot");
                    nuggetBrass = new ItemMineral("brass_nugget");
                    dustBrass = new ItemMineral("brass_dust");
                    gearBrass = new ItemCrafting("brass_gear");
                    plateBrass = new ItemCrafting("brass_plate");
                    rodBrass = new ItemCrafting("brass_rod");
                }
                //bronze
                if (OreInAMillionConfig.isBronzeEnabled) {
                    ingotBronze = new ItemMineral("bronze_ingot");
                    nuggetBronze = new ItemMineral("bronze_nugget");
                    dustBronze = new ItemMineral("bronze_dust");
                    gearBronze = new ItemCrafting("bronze_gear");
                    plateBronze = new ItemCrafting("bronze_plate");
                    rodBronze = new ItemCrafting("bronze_rod");
                }
                //electrum
                if (OreInAMillionConfig.isElectrumEnabled) {
                    ingotElectrum = new ItemMineral("electrum_ingot");
                    nuggetElectrum = new ItemMineral("electrum_nugget");
                    dustElectrum = new ItemMineral("electrum_dust");
                    gearElectrum = new ItemCrafting("electrum_gear");
                    plateElectrum = new ItemCrafting("electrum_plate");
                    rodElectrum = new ItemCrafting("electrum_rod");
                }
                //fairy
                if (OreInAMillionConfig.isFairyEnabled){
                    ingotFairy = new ItemMineral("fairy_ingot");
                    nuggetFairy = new ItemMineral("fairy_nugget");
                    dustFairy = new ItemMineral("fairy_dust");
                    gearFairy = new ItemCrafting("fairy_gear");
                    plateFairy = new ItemCrafting("fairy_plate");
                    rodFairy = new ItemCrafting("fairy_rod");
                }
                //invar
                if (OreInAMillionConfig.isInvarEnabled) {
                    ingotInvar = new ItemMineral("invar_ingot");
                    nuggetInvar = new ItemMineral("invar_nugget");
                    dustInvar = new ItemMineral("invar_dust");
                    gearInvar = new ItemCrafting("invar_gear");
                    plateInvar = new ItemCrafting("invar_plate");
                    rodInvar = new ItemCrafting("invar_rod");
                }
                //steel
                if (OreInAMillionConfig.isSteelEnabled) {
                    ingotSteel = new ItemMineral("steel_ingot");
                    nuggetSteel = new ItemMineral("steel_nugget");
                    dustSteel = new ItemMineral("steel_dust");
                    gearSteel = new ItemCrafting("steel_gear");
                    plateSteel = new ItemCrafting("steel_plate");
                    rodSteel = new ItemCrafting("steel_rod");
                }
                //thermal series
                if (OreInAMillionConfig.isThermalIngotsEnabled){
                    //constantan
                    if (OreInAMillionConfig.isConstantanEnabled){
                        ingotConstantan = new ItemMineral("constantan_ingot");
                        nuggetConstantan = new ItemMineral("constantan_nugget");
                        dustConstantan = new ItemMineral("constantan_dust");
                        gearConstantan = new ItemCrafting("constantan_gear");
                        plateConstantan = new ItemCrafting("constantan_plate");
                        rodConstantan = new ItemCrafting("constantan_rod");
                    }
                    //enderium
                    if (OreInAMillionConfig.isEnderiumEnabled){
                        ingotEnderium = new ItemMineral("enderium_ingot");
                        nuggetEnderium = new ItemMineral("enderium_nugget");
                        dustEnderium = new ItemMineral("enderium_dust");
                        gearEnderium = new ItemCrafting("enderium_gear");
                        plateEnderium = new ItemCrafting("enderium_plate");
                        rodEnderium = new ItemCrafting("enderium_rod");
                    }
                    //lumium
                    if (OreInAMillionConfig.isLumiumEnabled){
                        ingotLumium = new ItemMineral("lumium_ingot");
                        nuggetLumium = new ItemMineral("lumium_nugget");
                        dustLumium = new ItemMineral("lumium_dust");
                        gearLumium = new ItemCrafting("lumium_gear");
                        plateLumium = new ItemCrafting("lumium_plate");
                        rodLumium = new ItemCrafting("lumium_rod");
                    }
                    //signalum
                    if (OreInAMillionConfig.isSignalumEnabled){
                        ingotSignalum = new ItemMineral("signalum_ingot");
                        nuggetSignalum = new ItemMineral("signalum_nugget");
                        dustSignalum = new ItemMineral("signalum_dust");
                        gearSignalum = new ItemCrafting("signalum_gear");
                        plateSignalum = new ItemCrafting("signalum_plate");
                        rodSignalum = new ItemCrafting("signalum_rod");
                    }
                }
                //tinkers construct
                if (OreInAMillionConfig.isTinkersIngotsEnabled){
                    //ardite
                    if (OreInAMillionConfig.isArditeEnabled){
                        ingotArdite = new ItemMineral("ardite_ingot");
                        nuggetArdite = new ItemMineral("ardite_nugget");
                        dustArdite = new ItemMineral("ardite_dust");
                        gearArdite = new ItemCrafting("ardite_gear");
                        plateArdite = new ItemCrafting("ardite_plate");
                        rodArdite = new ItemCrafting("ardite_rod");
                    }
                    //knightslime
                    if (OreInAMillionConfig.isKnightSlimeEnabled){
                        ingotKnightSlime = new ItemMineral("knightslime_ingot");
                        nuggetKnightSlime = new ItemMineral("knightslime_nugget");
                        dustKnightSlime = new ItemMineral("knightslime_dust");
                        gearKnightSlime = new ItemCrafting("knightslime_gear");
                        plateKnightSlime = new ItemCrafting("knightslime_plate");
                        rodKnightSlime = new ItemCrafting("knightslime_rod");
                    }
                    //pigiron
                    if (OreInAMillionConfig.isPigIronEnabled) {
                        ingotPigIron = new ItemFoodMineral("pigiron_ingot", 4, 0.25F, false);
                        nuggetPigIron = new ItemFoodMineral("pigiron_nugget", 1, 0, false);
                        dustPigIron = new ItemFoodMineral("pigiron_dust", 2, 2.0F, false);
                        gearPigIron = new ItemFoodCrafting("pigiron_gear", 16, 0.5F, false);
                        platePigIron = new ItemFoodCrafting("pigiron_plate", 3, 0.3F, false);
                        rodPigIron = new ItemFoodCrafting("pigiron_rod", 8, 0.5F, false);
                    }
                    //manyullyn
                    if (OreInAMillionConfig.isManyullynEnabled){
                        ingotManyullyn = new ItemMineral("manyullyn_ingot");
                        nuggetManyullyn = new ItemMineral("manyullyn_nugget");
                        dustManyullyn = new ItemMineral("manyullyn_dust");
                        gearManyullyn = new ItemCrafting("manyullyn_gear");
                        plateManyullyn = new ItemCrafting("manyullyn_plate");
                        rodManyullyn = new ItemCrafting("manyullyn_rod");
                    }
                }
            }
            //gems
            if (OreInAMillionConfig.isGemsEnabled){
                //amethyst
                if (OreInAMillionConfig.isAmethystEnabled){
                    gemAmethyst = new ItemMineral("amethyst");
                    nuggetAmethyst = new ItemMineral("amethyst_nugget");
                    dustAmethyst = new ItemMineral("amethyst_dust");
                    gearAmethyst= new ItemCrafting("amethyst_gear");
                    plateAmethyst = new ItemCrafting("amethyst_plate");
                    rodAmethyst = new ItemCrafting("amethyst_rod");
                }
                //peridot
                if (OreInAMillionConfig.isPeridotEnabled){
                    gemPeridot = new ItemMineral("peridot");
                    nuggetPeridot = new ItemMineral("peridot_nugget");
                    dustPeridot = new ItemMineral("peridot_dust");
                    gearPeridot = new ItemCrafting("peridot_gear");
                    platePeridot = new ItemCrafting("peridot_plate");
                    rodPeridot = new ItemCrafting("peridot_rod");
                }
                //ruby
                if (OreInAMillionConfig.isRubyEnabled){
                    gemRuby = new ItemMineral("ruby");
                    nuggetRuby = new ItemMineral("ruby_nugget");
                    dustRuby = new ItemMineral("ruby_dust");
                    gearRuby = new ItemCrafting("ruby_gear");
                    plateRuby = new ItemCrafting("ruby_plate");
                    rodRuby = new ItemCrafting("ruby_rod");
                }
                //sapphire
                if (OreInAMillionConfig.isSapphireEnabled){
                    gemSapphire = new ItemMineral("sapphire");
                    nuggetSapphire = new ItemMineral("sapphire_nugget");
                    dustSapphire = new ItemMineral("sapphire_dust");
                    gearSapphire = new ItemCrafting("sapphire_gear");
                    plateSapphire = new ItemCrafting("sapphire_plate");
                    rodSapphire = new ItemCrafting("sapphire_rod");
                }
            }
            //elements
            if (OreInAMillionConfig.isElementsEnabled){
                //carbon
                if (OreInAMillionConfig.isCarbonEnabled){
                    elementCarbon = new ItemMineral("carbon");
                    nuggetCarbon = new ItemMineral("carbon_nugget");
                    dustCarbon = new ItemMineral("carbon_dust");
                }
                //cinnabar
                if (OreInAMillionConfig.isCinnabarEnabled){
                    elementCinnabar = new ItemMineral("cinnabar");
                    nuggetCinnabar = new ItemMineral("cinnabar_nugget");
                    dustCinnabar = new ItemMineral("cinnabar_dust");
                }
                //silicon
                if (OreInAMillionConfig.isSiliconEnabled){
                    elementSilicon = new ItemMineral("silicon");
                    nuggetSilicon = new ItemMineral("silicon_nugget");
                    dustSilicon = new ItemMineral("silicon_dust");
//                    gearSilicon = new ItemCrafting("silicon_gear");
//                    plateSilicon = new ItemCrafting("silicon_plate");
//                    rodSilicon = new ItemCrafting("silicon_rod");
                }
                //sulphur
                if (OreInAMillionConfig.isSulphurEnabled){
                    elementSulfur = new ItemMineral("sulfur");
                    nuggetSulfur = new ItemMineral("sulfur_nugget");
                    dustSulfur = new ItemMineral("sulfur_dust");
                }
            }
            //vanilla additions
            if (OreInAMillionConfig.isVanillaEnabled){
                //charcoal
                if (OreInAMillionConfig.isCharcoalEnabled) {
                    nuggetCharcoal = new ItemCoalMineral("charcoal_nugget", 200);
                    dustCharcoal = new ItemCoalMineral("charcoal_dust", 1600);
                    gearCharcoal = new ItemCoalCrafting("charcoal_gear", 6400);
                    plateCharcoal = new ItemCoalCrafting("charcoal_plate", 1600);
                    rodCharcoal = new ItemCoalCrafting("charcoal_rod", 3200);
                }
                //coal
                if (OreInAMillionConfig.isCoalEnabled) {
                    nuggetCoal = new ItemCoalMineral("coal_nugget", 200);
                    dustCoal = new ItemCoalMineral("coal_dust", 1600);
                    gearCoal = new ItemCoalCrafting("coal_gear", 6400);
                    plateCoal = new ItemCoalCrafting("coal_plate", 1600);
                    rodCoal = new ItemCoalCrafting("coal_rod", 3200);
                }
                //diamond
                if (OreInAMillionConfig.isDiamondEnabled) {
                    nuggetDiamond = new ItemMineral("diamond_nugget");
                    dustDiamond = new ItemMineral("diamond_dust");
                    gearDiamond = new ItemCrafting("diamond_gear");
                    plateDiamond = new ItemCrafting("diamond_plate");
                    rodDiamond = new ItemCrafting("diamond_rod");

                }
                //emerald
                if (OreInAMillionConfig.isEmeraldEnabled) {
                    nuggetEmerald = new ItemMineral("emerald_nugget");
                    dustEmerald = new ItemMineral("emerald_dust");
                    gearEmerald = new ItemCrafting("silicon_gear");
                    plateEmerald = new ItemCrafting("silicon_plate");
                    rodEmerald = new ItemCrafting("silicon_rod");
                }
                //gold
                if (OreInAMillionConfig.isGoldEnabled){
                    dustGold = new ItemMineral("gold_dust");
                    gearGold = new ItemCrafting("gold_gear");
                    plateGold = new ItemCrafting("gold_plate");
                    rodGold = new ItemCrafting("gold_rod");
                }
                //iron
                if (OreInAMillionConfig.isIronEnabled){
                    dustIron = new ItemMineral("iron_dust");
                    gearIron = new ItemCrafting("iron_gear");
                    plateIron = new ItemCrafting("iron_plate");
                    rodIron = new ItemCrafting("iron_rod");
                }
                //quartz
                if (OreInAMillionConfig.isQuartzEnabled){
                    nuggetQuartz = new ItemMineral("quartz_nugget");
                    dustQuartz = new ItemMineral("quartz_dust");
                    gearQuartz = new ItemCrafting("quartz_gear");
                    plateQuartz = new ItemCrafting("quartz_plate");
                    rodQuartz = new ItemCrafting("quartz_rod");
                }
            }
            if (OreInAMillionConfig.isSillyStuffEnabled){
                tinCan = new ItemMain("tin_can");
                foodSoupcan = new ItemFoodSoupcan("soupcan", 7, 0.5F, false);
                weezerWeezer = new ItemWeezer("weezer");
            }
        }

        creativeIcon1 = new ItemIcon("creative_icon1");
        creativeIcon2 = new ItemIcon("creative_icon2");
        creativeIcon3 = new ItemIcon("creative_icon3");
        creativeIcon4 = new ItemIcon("creative_icon4");
        creativeIcon5 = new ItemIcon("creative_icon5");
        creativeIcon6 = new ItemIcon("creative_icon6");
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){
//        event.getRegistry().register();

//        event.getRegistry().register(ingot);
//        event.getRegistry().register(nugget);
//        event.getRegistry().register(dust);
//        event.getRegistry().register(gear);
//        event.getRegistry().register(plate);
//        event.getRegistry().register(rod);

        if (OreInAMillionConfig.isMineralsEnabled) {
            if (OreInAMillionConfig.isIngotsEnabled) {
                //aluminum
                if (OreInAMillionConfig.isAluminumEnabled) {
                    event.getRegistry().register(ingotAluminum);
                    event.getRegistry().register(nuggetAluminum);
                    event.getRegistry().register(dustAluminum);
                    event.getRegistry().register(gearAluminum);
                    event.getRegistry().register(plateAluminum);
                    event.getRegistry().register(rodAluminum);
                }
                //chrome
                if (OreInAMillionConfig.isChromeEnabled) {
                    event.getRegistry().register(ingotChrome);
                    event.getRegistry().register(nuggetChrome);
                    event.getRegistry().register(dustChrome);
                    event.getRegistry().register(gearChrome);
                    event.getRegistry().register(plateChrome);
                    event.getRegistry().register(rodChrome);
                }
                //cobalt
                if (OreInAMillionConfig.isCobaltEnabled) {
                    event.getRegistry().register(ingotCobalt);
                    event.getRegistry().register(nuggetCobalt);
                    event.getRegistry().register(dustCobalt);
                    event.getRegistry().register(gearCobalt);
                    event.getRegistry().register(plateCobalt);
                    event.getRegistry().register(rodCobalt);
                }
                //copper
                if (OreInAMillionConfig.isCopperEnabled) {
                    event.getRegistry().register(ingotCopper);
                    event.getRegistry().register(nuggetCopper);
                    event.getRegistry().register(dustCopper);
                    event.getRegistry().register(gearCopper);
                    event.getRegistry().register(plateCopper);
                    event.getRegistry().register(rodCopper);
                }
                //ender
                if (OreInAMillionConfig.isEnderEnabled) {
                    event.getRegistry().register(ingotEnder);
                    event.getRegistry().register(nuggetEnder);
                    event.getRegistry().register(dustEnder);
                    event.getRegistry().register(gearEnder);
                    event.getRegistry().register(plateEnder);
                    event.getRegistry().register(rodEnder);
                }
                //iridium
                if (OreInAMillionConfig.isIridiumEnabled) {
                    event.getRegistry().register(ingotIridium);
                    event.getRegistry().register(nuggetIridium);
                    event.getRegistry().register(dustIridium);
                    event.getRegistry().register(gearIridium);
                    event.getRegistry().register(plateIridium);
                    event.getRegistry().register(rodIridium);
                }
                //lead
                if (OreInAMillionConfig.isLeadEnabled) {
                    event.getRegistry().register(ingotLead);
                    event.getRegistry().register(nuggetLead);
                    event.getRegistry().register(dustLead);
                    event.getRegistry().register(gearLead);
                    event.getRegistry().register(plateLead);
                    event.getRegistry().register(rodLead);
                }
                //mithril
                if (OreInAMillionConfig.isMithrilEnabled) {
                    event.getRegistry().register(ingotMithril);
                    event.getRegistry().register(nuggetMithril);
                    event.getRegistry().register(dustMithril);
                    event.getRegistry().register(gearMithril);
                    event.getRegistry().register(plateMithril);
                    event.getRegistry().register(rodMithril);
                }
                //nickel
                if (OreInAMillionConfig.isNickelEnabled) {
                    event.getRegistry().register(ingotNickel);
                    event.getRegistry().register(nuggetNickel);
                    event.getRegistry().register(dustNickel);
                    event.getRegistry().register(gearNickel);
                    event.getRegistry().register(plateNickel);
                    event.getRegistry().register(rodNickel);
                }
                //osmium
                if (OreInAMillionConfig.isOsmiumEnabled) {
                    event.getRegistry().register(ingotOsmium);
                    event.getRegistry().register(nuggetOsmium);
                    event.getRegistry().register(dustOsmium);
                    event.getRegistry().register(gearOsmium);
                    event.getRegistry().register(plateOsmium);
                    event.getRegistry().register(rodOsmium);
                }
                //platinum
                if (OreInAMillionConfig.isPlatinumEnabled) {
                    event.getRegistry().register(ingotPlatinum);
                    event.getRegistry().register(nuggetPlatinum);
                    event.getRegistry().register(dustPlatinum);
                    event.getRegistry().register(gearPlatinum);
                    event.getRegistry().register(platePlatinum);
                    event.getRegistry().register(rodPlatinum);
                }
                //silver
                if (OreInAMillionConfig.isSilverEnabled) {
                    event.getRegistry().register(ingotSilver);
                    event.getRegistry().register(nuggetSilver);
                    event.getRegistry().register(dustSilver);
                    event.getRegistry().register(gearSilver);
                    event.getRegistry().register(plateSilver);
                    event.getRegistry().register(rodSilver);
                }
                //tin
                if (OreInAMillionConfig.isTinEnabled) {
                    event.getRegistry().register(ingotTin);
                    event.getRegistry().register(nuggetTin);
                    event.getRegistry().register(dustTin);
                    event.getRegistry().register(gearTin);
                    event.getRegistry().register(plateTin);
                    event.getRegistry().register(rodTin);
                }
                //titanium
                if (OreInAMillionConfig.isTitaniumEnabled) {
                    event.getRegistry().register(ingotTitanium);
                    event.getRegistry().register(nuggetTitanium);
                    event.getRegistry().register(dustTitanium);
                    event.getRegistry().register(gearTitanium);
                    event.getRegistry().register(plateTitanium);
                    event.getRegistry().register(rodTitanium);
                }
                //tungsten
                if (OreInAMillionConfig.isTungstenEnabled) {
                    event.getRegistry().register(ingotTungsten);
                    event.getRegistry().register(nuggetTungsten);
                    event.getRegistry().register(dustTungsten);
                    event.getRegistry().register(gearTungsten);
                    event.getRegistry().register(plateTungsten);
                    event.getRegistry().register(rodTungsten);
                }
                //uranium
                if (OreInAMillionConfig.isUraniumEnabled) {
                    event.getRegistry().register(ingotUranium);
                    event.getRegistry().register(nuggetUranium);
                    event.getRegistry().register(dustUranium);
                    event.getRegistry().register(gearUranium);
                    event.getRegistry().register(plateUranium);
                    event.getRegistry().register(rodUranium);
                }
                //zinc
                if (OreInAMillionConfig.isZincEnabled) {
                    event.getRegistry().register(ingotZinc);
                    event.getRegistry().register(nuggetZinc);
                    event.getRegistry().register(dustZinc);
                    event.getRegistry().register(gearZinc);
                    event.getRegistry().register(plateZinc);
                    event.getRegistry().register(rodZinc);
                }
                //brass
                if (OreInAMillionConfig.isBrassEnabled) {
                    event.getRegistry().register(ingotBrass);
                    event.getRegistry().register(nuggetBrass);
                    event.getRegistry().register(dustBrass);
                    event.getRegistry().register(gearBrass);
                    event.getRegistry().register(plateBrass);
                    event.getRegistry().register(rodBrass);
                }
                //bronze
                if (OreInAMillionConfig.isBronzeEnabled) {
                    event.getRegistry().register(ingotBronze);
                    event.getRegistry().register(nuggetBronze);
                    event.getRegistry().register(dustBronze);
                    event.getRegistry().register(gearBronze);
                    event.getRegistry().register(plateBronze);
                    event.getRegistry().register(rodBronze);
                }
                //electrum
                if (OreInAMillionConfig.isElectrumEnabled) {
                    event.getRegistry().register(ingotElectrum);
                    event.getRegistry().register(nuggetElectrum);
                    event.getRegistry().register(dustElectrum);
                    event.getRegistry().register(gearElectrum);
                    event.getRegistry().register(plateElectrum);
                    event.getRegistry().register(rodElectrum);
                }
                //fairy
                if (OreInAMillionConfig.isFairyEnabled) {
                    event.getRegistry().register(ingotFairy);
                    event.getRegistry().register(nuggetFairy);
                    event.getRegistry().register(dustFairy);
                    event.getRegistry().register(gearFairy);
                    event.getRegistry().register(plateFairy);
                    event.getRegistry().register(rodFairy);
                }
                //invar
                if (OreInAMillionConfig.isInvarEnabled) {
                    event.getRegistry().register(ingotInvar);
                    event.getRegistry().register(nuggetInvar);
                    event.getRegistry().register(dustInvar);
                    event.getRegistry().register(gearInvar);
                    event.getRegistry().register(plateInvar);
                    event.getRegistry().register(rodInvar);
                }
                //steel
                if (OreInAMillionConfig.isSteelEnabled) {
                    event.getRegistry().register(ingotSteel);
                    event.getRegistry().register(nuggetSteel);
                    event.getRegistry().register(dustSteel);
                    event.getRegistry().register(gearSteel);
                    event.getRegistry().register(plateSteel);
                    event.getRegistry().register(rodSteel);
                }
                //thermal series
                if (OreInAMillionConfig.isThermalIngotsEnabled) {
                    //constantan
                    if (OreInAMillionConfig.isConstantanEnabled) {
                        event.getRegistry().register(ingotConstantan);
                        event.getRegistry().register(nuggetConstantan);
                        event.getRegistry().register(dustConstantan);
                        event.getRegistry().register(gearConstantan);
                        event.getRegistry().register(plateConstantan);
                        event.getRegistry().register(rodConstantan);
                    }
                    //enderium
                    if (OreInAMillionConfig.isEnderiumEnabled) {
                        event.getRegistry().register(ingotEnderium);
                        event.getRegistry().register(nuggetEnderium);
                        event.getRegistry().register(dustEnderium);
                        event.getRegistry().register(gearEnderium);
                        event.getRegistry().register(plateEnderium);
                        event.getRegistry().register(rodEnderium);
                    }
                    //lumium
                    if (OreInAMillionConfig.isLumiumEnabled) {
                        event.getRegistry().register(ingotLumium);
                        event.getRegistry().register(nuggetLumium);
                        event.getRegistry().register(dustLumium);
                        event.getRegistry().register(gearLumium);
                        event.getRegistry().register(plateLumium);
                        event.getRegistry().register(rodLumium);
                    }
                    //signalum
                    if (OreInAMillionConfig.isSignalumEnabled) {
                        event.getRegistry().register(ingotSignalum);
                        event.getRegistry().register(nuggetSignalum);
                        event.getRegistry().register(dustSignalum);
                        event.getRegistry().register(gearSignalum);
                        event.getRegistry().register(plateSignalum);
                        event.getRegistry().register(rodSignalum);
                    }
                }
                //tinkers construct
                if (OreInAMillionConfig.isTinkersIngotsEnabled) {
                    //ardite
                    if (OreInAMillionConfig.isArditeEnabled) {
                        event.getRegistry().register(ingotArdite);
                        event.getRegistry().register(nuggetArdite);
                        event.getRegistry().register(dustArdite);
                        event.getRegistry().register(gearArdite);
                        event.getRegistry().register(plateArdite);
                        event.getRegistry().register(rodArdite);
                    }
                    //knightslime
                    if (OreInAMillionConfig.isKnightSlimeEnabled) {
                        event.getRegistry().register(ingotKnightSlime);
                        event.getRegistry().register(nuggetKnightSlime);
                        event.getRegistry().register(dustKnightSlime);
                        event.getRegistry().register(gearKnightSlime);
                        event.getRegistry().register(plateKnightSlime);
                        event.getRegistry().register(rodKnightSlime);
                    }
                    //pigiron
                    if (OreInAMillionConfig.isPigIronEnabled) {
                        event.getRegistry().register(ingotPigIron);
                        event.getRegistry().register(nuggetPigIron);
                        event.getRegistry().register(dustPigIron);
                        event.getRegistry().register(gearPigIron);
                        event.getRegistry().register(platePigIron);
                        event.getRegistry().register(rodPigIron);
                    }
                    //manyullyn
                    if (OreInAMillionConfig.isManyullynEnabled) {
                        event.getRegistry().register(ingotManyullyn);
                        event.getRegistry().register(nuggetManyullyn);
                        event.getRegistry().register(dustManyullyn);
                        event.getRegistry().register(gearManyullyn);
                        event.getRegistry().register(plateManyullyn);
                        event.getRegistry().register(rodManyullyn);
                    }
                }
            }
            //gems
            if (OreInAMillionConfig.isGemsEnabled) {
                //amethyst
                if (OreInAMillionConfig.isAmethystEnabled) {
                    event.getRegistry().register(gemAmethyst);
                    event.getRegistry().register(nuggetAmethyst);
                    event.getRegistry().register(dustAmethyst);
                    event.getRegistry().register(gearAmethyst);
                    event.getRegistry().register(plateAmethyst);
                    event.getRegistry().register(rodAmethyst);
                }
                //peridot
                if (OreInAMillionConfig.isPeridotEnabled) {
                    event.getRegistry().register(gemPeridot);
                    event.getRegistry().register(nuggetPeridot);
                    event.getRegistry().register(dustPeridot);
                    event.getRegistry().register(gearPeridot);
                    event.getRegistry().register(platePeridot);
                    event.getRegistry().register(rodPeridot);
                }
                //ruby
                if (OreInAMillionConfig.isRubyEnabled) {
                    event.getRegistry().register(gemRuby);
                    event.getRegistry().register(nuggetRuby);
                    event.getRegistry().register(dustRuby);
                    event.getRegistry().register(gearRuby);
                    event.getRegistry().register(plateRuby);
                    event.getRegistry().register(rodRuby);
                }
                //sapphire
                if (OreInAMillionConfig.isSapphireEnabled) {
                    event.getRegistry().register(gemSapphire);
                    event.getRegistry().register(nuggetSapphire);
                    event.getRegistry().register(dustSapphire);
                    event.getRegistry().register(gearSapphire);
                    event.getRegistry().register(plateSapphire);
                    event.getRegistry().register(rodSapphire);
                }
            }
            //elements
            if (OreInAMillionConfig.isElementsEnabled) {
                if (OreInAMillionConfig.isCarbonEnabled) {
                    event.getRegistry().register(elementCarbon);
                    event.getRegistry().register(nuggetCarbon);
                    event.getRegistry().register(dustCarbon);
                }
                //cinnabar
                if (OreInAMillionConfig.isCinnabarEnabled) {
                    event.getRegistry().register(elementCinnabar);
                    event.getRegistry().register(nuggetCinnabar);
                    event.getRegistry().register(dustCinnabar);
                }
                //silicon
                if (OreInAMillionConfig.isSiliconEnabled) {
                    event.getRegistry().register(elementSilicon);
                    event.getRegistry().register(nuggetSilicon);
                    event.getRegistry().register(dustSilicon);
//                    event.getRegistry().register(gearSilicon);
//                    event.getRegistry().register(plateSilicon);
//                    event.getRegistry().register(rodSilicon);
                }
                //sulphur
                if (OreInAMillionConfig.isSulphurEnabled) {
                    event.getRegistry().register(elementSulfur);
                    event.getRegistry().register(nuggetSulfur);
                    event.getRegistry().register(dustSulfur);
                }
            }
            if (OreInAMillionConfig.isVanillaEnabled) {
                //charcoal
                if (OreInAMillionConfig.isCharcoalEnabled) {
                    event.getRegistry().register(nuggetCharcoal);
                    event.getRegistry().register(dustCharcoal);
                    event.getRegistry().register(gearCharcoal);
                    event.getRegistry().register(plateCharcoal);
                    event.getRegistry().register(rodCharcoal);
                }
                //coal
                if (OreInAMillionConfig.isCoalEnabled) {
                    event.getRegistry().register(nuggetCoal);
                    event.getRegistry().register(dustCoal);
                    event.getRegistry().register(gearCoal);
                    event.getRegistry().register(plateCoal);
                    event.getRegistry().register(rodCoal);
                }
                //diamond
                if (OreInAMillionConfig.isDiamondEnabled) {
                    event.getRegistry().register(nuggetDiamond);
                    event.getRegistry().register(dustDiamond);
                    event.getRegistry().register(gearDiamond);
                    event.getRegistry().register(plateDiamond);
                    event.getRegistry().register(rodDiamond);
                }
                //emerald
                if (OreInAMillionConfig.isEmeraldEnabled) {
                    event.getRegistry().register(nuggetEmerald);
                    event.getRegistry().register(dustEmerald);
                    event.getRegistry().register(gearEmerald);
                    event.getRegistry().register(plateEmerald);
                    event.getRegistry().register(rodEmerald);
                }
                //gold
                if (OreInAMillionConfig.isGoldEnabled){
                    event.getRegistry().register(dustGold);
                    event.getRegistry().register(gearGold);
                    event.getRegistry().register(plateGold);
                    event.getRegistry().register(rodGold);
                }
                //iron
                if (OreInAMillionConfig.isIronEnabled){
                    event.getRegistry().register(dustIron);
                    event.getRegistry().register(gearIron);
                    event.getRegistry().register(plateIron);
                    event.getRegistry().register(rodIron);
                }
                //quartz
                if (OreInAMillionConfig.isQuartzEnabled) {
                    event.getRegistry().register(nuggetQuartz);
                    event.getRegistry().register(dustQuartz);
                    event.getRegistry().register(gearQuartz);
                    event.getRegistry().register(plateQuartz);
                    event.getRegistry().register(rodQuartz);
                }
            }
            if (OreInAMillionConfig.isSillyStuffEnabled) {
                event.getRegistry().register(tinCan);
                event.getRegistry().register(foodSoupcan);
                event.getRegistry().register(weezerWeezer);
            }
        }

        event.getRegistry().register(creativeIcon1);
        event.getRegistry().register(creativeIcon2);
        event.getRegistry().register(creativeIcon3);
        event.getRegistry().register(creativeIcon4);
        event.getRegistry().register(creativeIcon5);
        event.getRegistry().register(creativeIcon6);
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event){
        //registerRender();
        if (OreInAMillionConfig.isMineralsEnabled) {
            if (OreInAMillionConfig.isIngotsEnabled) {
                //aluminum
                if (OreInAMillionConfig.isAluminumEnabled) {
                    registerRender(ingotAluminum);
                    registerRender(nuggetAluminum);
                    registerRender(dustAluminum);
                    registerRender(gearAluminum);
                    registerRender(plateAluminum);
                    registerRender(rodAluminum);
                }
                //chrome
                if (OreInAMillionConfig.isChromeEnabled) {
                    registerRender(ingotChrome);
                    registerRender(nuggetChrome);
                    registerRender(dustChrome);
                    registerRender(gearChrome);
                    registerRender(plateChrome);
                    registerRender(rodChrome);
                }
                //cobalt
                if (OreInAMillionConfig.isCobaltEnabled) {
                    registerRender(ingotCobalt);
                    registerRender(nuggetCobalt);
                    registerRender(dustCobalt);
                    registerRender(gearCobalt);
                    registerRender(plateCobalt);
                    registerRender(rodCobalt);
                }
                //copper
                if (OreInAMillionConfig.isCopperEnabled) {
                    registerRender(ingotCopper);
                    registerRender(nuggetCopper);
                    registerRender(dustCopper);
                    registerRender(gearCopper);
                    registerRender(plateCopper);
                    registerRender(rodCopper);
                }
                //ender
                if (OreInAMillionConfig.isEnderEnabled){
                    registerRender(ingotEnder);
                    registerRender(nuggetEnder);
                    registerRender(dustEnder);
                    registerRender(gearEnder);
                    registerRender(plateEnder);
                    registerRender(rodEnder);
                }
                //iridium
                if (OreInAMillionConfig.isIridiumEnabled) {
                    registerRender(ingotIridium);
                    registerRender(nuggetIridium);
                    registerRender(dustIridium);
                    registerRender(gearIridium);
                    registerRender(plateIridium);
                    registerRender(rodIridium);
                }
                //lead
                if (OreInAMillionConfig.isLeadEnabled) {
                    registerRender(ingotLead);
                    registerRender(nuggetLead);
                    registerRender(dustLead);
                    registerRender(gearLead);
                    registerRender(plateLead);
                    registerRender(rodLead);
                }
                //mithril
                if (OreInAMillionConfig.isMithrilEnabled) {
                    registerRender(ingotMithril);
                    registerRender(nuggetMithril);
                    registerRender(dustMithril);
                    registerRender(gearMithril);
                    registerRender(plateMithril);
                    registerRender(rodMithril);
                }
                //nickel
                if (OreInAMillionConfig.isNickelEnabled) {
                    registerRender(ingotNickel);
                    registerRender(nuggetNickel);
                    registerRender(dustNickel);
                    registerRender(gearNickel);
                    registerRender(plateNickel);
                    registerRender(rodNickel);
                }
                //osmium
                if (OreInAMillionConfig.isOsmiumEnabled) {
                    registerRender(ingotOsmium);
                    registerRender(nuggetOsmium);
                    registerRender(dustOsmium);
                    registerRender(gearOsmium);
                    registerRender(plateOsmium);
                    registerRender(rodOsmium);
                }
                //platinum
                if (OreInAMillionConfig.isPlatinumEnabled) {
                    registerRender(ingotPlatinum);
                    registerRender(nuggetPlatinum);
                    registerRender(dustPlatinum);
                    registerRender(gearPlatinum);
                    registerRender(platePlatinum);
                    registerRender(rodPlatinum);
                }
                //silver
                if (OreInAMillionConfig.isSilverEnabled) {
                    registerRender(ingotSilver);
                    registerRender(nuggetSilver);
                    registerRender(dustSilver);
                    registerRender(gearSilver);
                    registerRender(plateSilver);
                    registerRender(rodSilver);
                }
                //tin
                if (OreInAMillionConfig.isTinEnabled) {
                    registerRender(ingotTin);
                    registerRender(nuggetTin);
                    registerRender(dustTin);
                    registerRender(gearTin);
                    registerRender(plateTin);
                    registerRender(rodTin);
                }
                //titanium
                if (OreInAMillionConfig.isTitaniumEnabled) {
                    registerRender(ingotTitanium);
                    registerRender(nuggetTitanium);
                    registerRender(dustTitanium);
                    registerRender(gearTitanium);
                    registerRender(plateTitanium);
                    registerRender(rodTitanium);
                }
                //tungsten
                if (OreInAMillionConfig.isTungstenEnabled) {
                    registerRender(ingotTungsten);
                    registerRender(nuggetTungsten);
                    registerRender(dustTungsten);
                    registerRender(gearTungsten);
                    registerRender(plateTungsten);
                    registerRender(rodTungsten);
                }
                //uranium
                if (OreInAMillionConfig.isUraniumEnabled) {
                    registerRender(ingotUranium);
                    registerRender(nuggetUranium);
                    registerRender(dustUranium);
                    registerRender(gearUranium);
                    registerRender(plateUranium);
                    registerRender(rodUranium);
                }
                //zinc
                if (OreInAMillionConfig.isZincEnabled) {
                    registerRender(ingotZinc);
                    registerRender(nuggetZinc);
                    registerRender(dustZinc);
                    registerRender(gearZinc);
                    registerRender(plateZinc);
                    registerRender(rodZinc);
                }
                //brass
                if (OreInAMillionConfig.isBrassEnabled) {
                    registerRender(ingotBrass);
                    registerRender(nuggetBrass);
                    registerRender(dustBrass);
                    registerRender(gearBrass);
                    registerRender(plateBrass);
                    registerRender(rodBrass);
                }
                //bronze
                if (OreInAMillionConfig.isBronzeEnabled) {
                    registerRender(ingotBronze);
                    registerRender(nuggetBronze);
                    registerRender(dustBronze);
                    registerRender(gearBronze);
                    registerRender(plateBronze);
                    registerRender(rodBronze);
                }
                //electrum
                if (OreInAMillionConfig.isElectrumEnabled) {
                    registerRender(ingotElectrum);
                    registerRender(nuggetElectrum);
                    registerRender(dustElectrum);
                    registerRender(gearElectrum);
                    registerRender(plateElectrum);
                    registerRender(rodElectrum);
                }
                //fairy
                if (OreInAMillionConfig.isFairyEnabled){
                    registerRender(ingotFairy);
                    registerRender(nuggetFairy);
                    registerRender(dustFairy);
                    registerRender(gearFairy);
                    registerRender(plateFairy);
                    registerRender(rodFairy);
                }
                //invar
                if (OreInAMillionConfig.isInvarEnabled) {
                    registerRender(ingotInvar);
                    registerRender(nuggetInvar);
                    registerRender(dustInvar);
                    registerRender(gearInvar);
                    registerRender(plateInvar);
                    registerRender(rodInvar);
                }
                //steel
                if (OreInAMillionConfig.isSteelEnabled) {
                    registerRender(ingotSteel);
                    registerRender(nuggetSteel);
                    registerRender(dustSteel);
                    registerRender(gearSteel);
                    registerRender(plateSteel);
                    registerRender(rodSteel);
                }
                //thermal series
                if (OreInAMillionConfig.isThermalIngotsEnabled){
                    //constantan
                    if (OreInAMillionConfig.isConstantanEnabled){
                        registerRender(ingotConstantan);
                        registerRender(nuggetConstantan);
                        registerRender(dustConstantan);
                        registerRender(gearConstantan);
                        registerRender(plateConstantan);
                        registerRender(rodConstantan);
                    }
                    //enderium
                    if (OreInAMillionConfig.isEnderiumEnabled){
                        registerRender(ingotEnderium);
                        registerRender(nuggetEnderium);
                        registerRender(dustEnderium);
                        registerRender(gearConstantan);
                        registerRender(plateConstantan);
                        registerRender(rodConstantan);
                    }
                    //lumium
                    if (OreInAMillionConfig.isLumiumEnabled){
                        registerRender(ingotLumium);
                        registerRender(nuggetLumium);
                        registerRender(dustLumium);
                        registerRender(gearConstantan);
                        registerRender(plateConstantan);
                        registerRender(rodConstantan);
                    }
                    //signalum
                    if (OreInAMillionConfig.isSignalumEnabled){
                        registerRender(ingotSignalum);
                        registerRender(nuggetSignalum);
                        registerRender(dustSignalum);
                        registerRender(gearConstantan);
                        registerRender(plateConstantan);
                        registerRender(rodConstantan);
                    }
                }
                //tinkers construct
                if (OreInAMillionConfig.isTinkersIngotsEnabled){
                    //ardite
                    if (OreInAMillionConfig.isArditeEnabled){
                        registerRender(ingotArdite);
                        registerRender(nuggetArdite);
                        registerRender(dustArdite);
                        registerRender(gearArdite);
                        registerRender(plateArdite);
                        registerRender(rodArdite);
                    }
                    //knightslime
                    if (OreInAMillionConfig.isKnightSlimeEnabled){
                        registerRender(ingotKnightSlime);
                        registerRender(nuggetKnightSlime);
                        registerRender(dustKnightSlime);
                        registerRender(gearKnightSlime);
                        registerRender(plateKnightSlime);
                        registerRender(rodKnightSlime);
                    }
                    //pigiron
                    if (OreInAMillionConfig.isPigIronEnabled) {
                        registerRender(ingotPigIron);
                        registerRender(nuggetPigIron);
                        registerRender(dustPigIron);
                        registerRender(gearPigIron);
                        registerRender(platePigIron);
                        registerRender(rodPigIron);
                    }
                    //manyullyn
                    if (OreInAMillionConfig.isManyullynEnabled){
                        registerRender(ingotManyullyn);
                        registerRender(nuggetManyullyn);
                        registerRender(dustManyullyn);
                        registerRender(gearManyullyn);
                        registerRender(plateManyullyn);
                        registerRender(rodManyullyn);
                    }
                }
            }
            //gems
            if (OreInAMillionConfig.isGemsEnabled){
                //amethyst
                if (OreInAMillionConfig.isAmethystEnabled){
                    registerRender(gemAmethyst);
                    registerRender(nuggetAmethyst);
                    registerRender(dustAmethyst);
                    registerRender(gearAmethyst);
                    registerRender(plateAmethyst);
                    registerRender(rodAmethyst);
                }
                //peridot
                if (OreInAMillionConfig.isPeridotEnabled){
                    registerRender(gemPeridot);
                    registerRender(nuggetPeridot);
                    registerRender(dustPeridot);
                    registerRender(gearPeridot);
                    registerRender(platePeridot);
                    registerRender(rodPeridot);
                }
                //ruby
                if (OreInAMillionConfig.isRubyEnabled){
                    registerRender(gemRuby);
                    registerRender(nuggetRuby);
                    registerRender(dustRuby);
                    registerRender(gearRuby);
                    registerRender(plateRuby);
                    registerRender(rodRuby);
                }
                //sapphire
                if (OreInAMillionConfig.isSapphireEnabled){
                    registerRender(gemSapphire);
                    registerRender(nuggetSapphire);
                    registerRender(dustSapphire);
                    registerRender(gearSapphire);
                    registerRender(plateSapphire);
                    registerRender(rodSapphire);
                }
            }
            //elements
            if (OreInAMillionConfig.isElementsEnabled){
                //carbon
                if (OreInAMillionConfig.isCarbonEnabled){
                    registerRender(elementCarbon);
                    registerRender(nuggetCarbon);
                    registerRender(dustCarbon);
                }
                //cinnabar
                if (OreInAMillionConfig.isCinnabarEnabled){
                    registerRender(elementCinnabar);
                    registerRender(nuggetCinnabar);
                    registerRender(dustCinnabar);
                }
                //silicon
                if (OreInAMillionConfig.isSiliconEnabled) {
                    registerRender(elementSilicon);
                    registerRender(nuggetSilicon);
                    registerRender(dustSilicon);
//                    registerRender(gearSilicon);
//                    registerRender(plateSilicon);
//                    registerRender(rodSilicon);
                }
                //sulphur
                if (OreInAMillionConfig.isSulphurEnabled){
                    registerRender(elementSulfur);
                    registerRender(nuggetSulfur);
                    registerRender(dustSulfur);
                }
            }
            if (OreInAMillionConfig.isVanillaEnabled) {
                //charcoal
                if (OreInAMillionConfig.isCharcoalEnabled) {
                    registerRender(nuggetCharcoal);
                    registerRender(dustCharcoal);
                    registerRender(gearCharcoal);
                    registerRender(plateCharcoal);
                    registerRender(rodCharcoal);
                }
                //coal
                if (OreInAMillionConfig.isCoalEnabled) {
                    registerRender(nuggetCoal);
                    registerRender(dustCoal);
                    registerRender(gearCoal);
                    registerRender(plateCoal);
                    registerRender(rodCoal);
                }
                //diamond
                if (OreInAMillionConfig.isDiamondEnabled) {
                    registerRender(nuggetDiamond);
                    registerRender(dustDiamond);
                    registerRender(gearDiamond);
                    registerRender(plateDiamond);
                    registerRender(rodDiamond);
                }
                //emerald
                if (OreInAMillionConfig.isEmeraldEnabled) {
                    registerRender(nuggetEmerald);
                    registerRender(dustEmerald);
                    registerRender(gearEmerald);
                    registerRender(plateEmerald);
                    registerRender(rodEmerald);
                }
                //gold
                if (OreInAMillionConfig.isGoldEnabled){
                    registerRender(dustGold);
                    registerRender(gearGold);
                    registerRender(plateGold);
                    registerRender(rodGold);
                }
                //iron
                if (OreInAMillionConfig.isIronEnabled){
                    registerRender(dustIron);
                    registerRender(gearIron);
                    registerRender(plateIron);
                    registerRender(rodIron);
                }
                //quartz
                if (OreInAMillionConfig.isQuartzEnabled){
                    registerRender(nuggetQuartz);
                    registerRender(dustQuartz);
                    registerRender(gearQuartz);
                    registerRender(plateQuartz);
                    registerRender(rodQuartz);
                }
            }
            if (OreInAMillionConfig.isSillyStuffEnabled) {
                registerRender(tinCan);
                registerRender(foodSoupcan);
                registerRender(weezerWeezer);
            }
        }

        registerRender(creativeIcon1);
        registerRender(creativeIcon2);
        registerRender(creativeIcon3);
        registerRender(creativeIcon4);
        registerRender(creativeIcon5);
        registerRender(creativeIcon6);
    }

    private static void registerRender(Item item)
    {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Objects.requireNonNull(item.getRegistryName()), "inventory"));
    }

    public static void initOreDict(){
        //OreDictionary.registerOre("", );

//        OreDictionary.registerOre("ingot", ModItems.ingot);
//        OreDictionary.registerOre("ingot", ModItems.ingot);
//        OreDictionary.registerOre("oreIngot", ModItems.ingot);
//        OreDictionary.registerOre("nugget", ModItems.nugget);
//        OreDictionary.registerOre("nugget", ModItems.nugget);
//        OreDictionary.registerOre("oreNugget", ModItems.nugget);
//        OreDictionary.registerOre("dust", ModItems.dust);
//        OreDictionary.registerOre("dust", ModItems.dust);
//        OreDictionary.registerOre("oreDust", ModItems.dust);
//        OreDictionary.registerOre("gear", ModItems.gear);
//        OreDictionary.registerOre("gear", ModItems.gear);
//        OreDictionary.registerOre("oreGear", ModItems.gear);
//        OreDictionary.registerOre("plate", ModItems.dust);
//        OreDictionary.registerOre("plate", ModItems.dust);
//        OreDictionary.registerOre("orePlate", ModItems.dust);
//        OreDictionary.registerOre("rod", ModItems.rod);
//        OreDictionary.registerOre("rod", ModItems.rod);
//        OreDictionary.registerOre("oreRod", ModItems.rod);
        if (OreInAMillionConfig.isMineralsEnabled) {
            if (OreInAMillionConfig.isIngotsEnabled) {
                //aluminum
                if (OreInAMillionConfig.isAluminumEnabled) {
                    OreDictionary.registerOre("ingotAluminum", ModItems.ingotAluminum);
                    OreDictionary.registerOre("ingot", ModItems.ingotAluminum);
                    OreDictionary.registerOre("oreIngot", ModItems.ingotAluminum);
                    OreDictionary.registerOre("nuggetAluminum", ModItems.nuggetAluminum);
                    OreDictionary.registerOre("nugget", ModItems.nuggetAluminum);
                    OreDictionary.registerOre("oreNugget", ModItems.nuggetAluminum);
                    OreDictionary.registerOre("dustAluminum", ModItems.dustAluminum);
                    OreDictionary.registerOre("dust", ModItems.dustAluminum);
                    OreDictionary.registerOre("oreDust", ModItems.dustAluminum);
                    OreDictionary.registerOre("gearAluminum", ModItems.gearAluminum);
                    OreDictionary.registerOre("gear", ModItems.gearAluminum);
                    OreDictionary.registerOre("oreGear", ModItems.gearAluminum);
                    OreDictionary.registerOre("plateAluminum", ModItems.dustAluminum);
                    OreDictionary.registerOre("plate", ModItems.dustAluminum);
                    OreDictionary.registerOre("orePlate", ModItems.dustAluminum);
                    OreDictionary.registerOre("rodAluminum", ModItems.rodAluminum);
                    OreDictionary.registerOre("rod", ModItems.rodAluminum);
                    OreDictionary.registerOre("oreRod", ModItems.rodAluminum);
                }
                //chrome
                if (OreInAMillionConfig.isChromeEnabled) {
                    OreDictionary.registerOre("ingotChrome", ModItems.ingotChrome);
                    OreDictionary.registerOre("ingot", ModItems.ingotChrome);
                    OreDictionary.registerOre("oreIngot", ModItems.ingotChrome);
                    OreDictionary.registerOre("nuggetChrome", ModItems.nuggetChrome);
                    OreDictionary.registerOre("nugget", ModItems.nuggetChrome);
                    OreDictionary.registerOre("oreNugget", ModItems.nuggetChrome);
                    OreDictionary.registerOre("dustChrome", ModItems.dustChrome);
                    OreDictionary.registerOre("dust", ModItems.dustChrome);
                    OreDictionary.registerOre("oreDust", ModItems.dustChrome);
                    OreDictionary.registerOre("gearChrome", ModItems.gearChrome);
                    OreDictionary.registerOre("gear", ModItems.gearChrome);
                    OreDictionary.registerOre("oreGear", ModItems.gearChrome);
                    OreDictionary.registerOre("plateChrome", ModItems.dustChrome);
                    OreDictionary.registerOre("plate", ModItems.dustChrome);
                    OreDictionary.registerOre("orePlate", ModItems.dustChrome);
                    OreDictionary.registerOre("rodChrome", ModItems.rodChrome);
                    OreDictionary.registerOre("rod", ModItems.rodChrome);
                    OreDictionary.registerOre("oreRod", ModItems.rodChrome);
                }
                //cobalt
                if (OreInAMillionConfig.isCobaltEnabled) {
                    OreDictionary.registerOre("ingotCobalt", ModItems.ingotCobalt);
                    OreDictionary.registerOre("ingot", ModItems.ingotCobalt);
                    OreDictionary.registerOre("oreIngot", ModItems.ingotCobalt);
                    OreDictionary.registerOre("nuggetCobalt", ModItems.nuggetCobalt);
                    OreDictionary.registerOre("nugget", ModItems.nuggetCobalt);
                    OreDictionary.registerOre("oreNugget", ModItems.nuggetCobalt);
                    OreDictionary.registerOre("dustCobalt", ModItems.dustCobalt);
                    OreDictionary.registerOre("dust", ModItems.dustCobalt);
                    OreDictionary.registerOre("oreDust", ModItems.dustCobalt);
                    OreDictionary.registerOre("gearCobalt", ModItems.gearCobalt);
                    OreDictionary.registerOre("gear", ModItems.gearCobalt);
                    OreDictionary.registerOre("oreGear", ModItems.gearCobalt);
                    OreDictionary.registerOre("plateCobalt", ModItems.dustCobalt);
                    OreDictionary.registerOre("plate", ModItems.dustCobalt);
                    OreDictionary.registerOre("orePlate", ModItems.dustCobalt);
                    OreDictionary.registerOre("rodCobalt", ModItems.rodCobalt);
                    OreDictionary.registerOre("rod", ModItems.rodCobalt);
                    OreDictionary.registerOre("oreRod", ModItems.rodCobalt);
                }
                //copper
                if (OreInAMillionConfig.isCopperEnabled) {
                    OreDictionary.registerOre("ingotCopper", ModItems.ingotCopper);
                    OreDictionary.registerOre("ingot", ModItems.ingotCopper);
                    OreDictionary.registerOre("oreIngot", ModItems.ingotCopper);
                    OreDictionary.registerOre("nuggetCopper", ModItems.nuggetCopper);
                    OreDictionary.registerOre("nugget", ModItems.nuggetCopper);
                    OreDictionary.registerOre("oreNugget", ModItems.nuggetCopper);
                    OreDictionary.registerOre("dustCopper", ModItems.dustCopper);
                    OreDictionary.registerOre("dust", ModItems.dustCopper);
                    OreDictionary.registerOre("oreDust", ModItems.dustCopper);
                    OreDictionary.registerOre("gearCopper", ModItems.gearCopper);
                    OreDictionary.registerOre("gear", ModItems.gearCopper);
                    OreDictionary.registerOre("oreGear", ModItems.gearCopper);
                    OreDictionary.registerOre("plateCopper", ModItems.dustCopper);
                    OreDictionary.registerOre("plate", ModItems.dustCopper);
                    OreDictionary.registerOre("orePlate", ModItems.dustCopper);
                    OreDictionary.registerOre("rodCopper", ModItems.rodCopper);
                    OreDictionary.registerOre("rod", ModItems.rodCopper);
                    OreDictionary.registerOre("oreRod", ModItems.rodCopper);
                }
                //ender
                if (OreInAMillionConfig.isEnderEnabled){
                    OreDictionary.registerOre("ingotEnder", ModItems.ingotEnder);
                    OreDictionary.registerOre("ingot", ModItems.ingotEnder);
                    OreDictionary.registerOre("oreIngot", ModItems.ingotEnder);
                    OreDictionary.registerOre("nuggetEnder", ModItems.nuggetEnder);
                    OreDictionary.registerOre("nugget", ModItems.nuggetEnder);
                    OreDictionary.registerOre("oreNugget", ModItems.nuggetEnder);
                    OreDictionary.registerOre("dustEnder", ModItems.dustEnder);
                    OreDictionary.registerOre("dust", ModItems.dustEnder);
                    OreDictionary.registerOre("oreDust", ModItems.dustEnder);
                    OreDictionary.registerOre("gearEnder", ModItems.gearEnder);
                    OreDictionary.registerOre("gear", ModItems.gearEnder);
                    OreDictionary.registerOre("oreGear", ModItems.gearEnder);
                    OreDictionary.registerOre("plateEnder", ModItems.dustEnder);
                    OreDictionary.registerOre("plate", ModItems.dustEnder);
                    OreDictionary.registerOre("orePlate", ModItems.dustEnder);
                    OreDictionary.registerOre("rodEnder", ModItems.rodEnder);
                    OreDictionary.registerOre("rod", ModItems.rodEnder);
                    OreDictionary.registerOre("oreRod", ModItems.rodEnder);
                }
                //iridium
                if (OreInAMillionConfig.isIridiumEnabled) {
                    OreDictionary.registerOre("ingotIridium", ModItems.ingotIridium);
                    OreDictionary.registerOre("ingot", ModItems.ingotIridium);
                    OreDictionary.registerOre("oreIngot", ModItems.ingotIridium);
                    OreDictionary.registerOre("nuggetIridium", ModItems.nuggetIridium);
                    OreDictionary.registerOre("nugget", ModItems.nuggetIridium);
                    OreDictionary.registerOre("oreNugget", ModItems.nuggetIridium);
                    OreDictionary.registerOre("dustIridium", ModItems.dustIridium);
                    OreDictionary.registerOre("dust", ModItems.dustIridium);
                    OreDictionary.registerOre("oreDust", ModItems.dustIridium);
                    OreDictionary.registerOre("gearIridium", ModItems.gearIridium);
                    OreDictionary.registerOre("gear", ModItems.gearIridium);
                    OreDictionary.registerOre("oreGear", ModItems.gearIridium);
                    OreDictionary.registerOre("plateIridium", ModItems.dustIridium);
                    OreDictionary.registerOre("plate", ModItems.dustIridium);
                    OreDictionary.registerOre("orePlate", ModItems.dustIridium);
                    OreDictionary.registerOre("rodIridium", ModItems.rodIridium);
                    OreDictionary.registerOre("rod", ModItems.rodIridium);
                    OreDictionary.registerOre("oreRod", ModItems.rodIridium);
                }
                //lead
                if (OreInAMillionConfig.isLeadEnabled) {
                    OreDictionary.registerOre("ingotLead", ModItems.ingotLead);
                    OreDictionary.registerOre("ingot", ModItems.ingotLead);
                    OreDictionary.registerOre("oreIngot", ModItems.ingotLead);
                    OreDictionary.registerOre("nuggetLead", ModItems.nuggetLead);
                    OreDictionary.registerOre("nugget", ModItems.nuggetLead);
                    OreDictionary.registerOre("oreNugget", ModItems.nuggetLead);
                    OreDictionary.registerOre("dustLead", ModItems.dustLead);
                    OreDictionary.registerOre("dust", ModItems.dustLead);
                    OreDictionary.registerOre("oreDust", ModItems.dustLead);
                    OreDictionary.registerOre("gearLead", ModItems.gearLead);
                    OreDictionary.registerOre("gear", ModItems.gearLead);
                    OreDictionary.registerOre("oreGear", ModItems.gearLead);
                    OreDictionary.registerOre("plateLead", ModItems.dustLead);
                    OreDictionary.registerOre("plate", ModItems.dustLead);
                    OreDictionary.registerOre("orePlate", ModItems.dustLead);
                    OreDictionary.registerOre("rodLead", ModItems.rodLead);
                    OreDictionary.registerOre("rod", ModItems.rodLead);
                    OreDictionary.registerOre("oreRod", ModItems.rodLead);
                }
                //mithril
                if (OreInAMillionConfig.isMithrilEnabled) {
                    OreDictionary.registerOre("ingotMithril", ModItems.ingotMithril);
                    OreDictionary.registerOre("ingot", ModItems.ingotMithril);
                    OreDictionary.registerOre("oreIngot", ModItems.ingotMithril);
                    OreDictionary.registerOre("nuggetMithril", ModItems.nuggetMithril);
                    OreDictionary.registerOre("nugget", ModItems.nuggetMithril);
                    OreDictionary.registerOre("oreNugget", ModItems.nuggetMithril);
                    OreDictionary.registerOre("dustMithril", ModItems.dustMithril);
                    OreDictionary.registerOre("dust", ModItems.dustMithril);
                    OreDictionary.registerOre("oreDust", ModItems.dustMithril);
                    OreDictionary.registerOre("gearMithril", ModItems.gearMithril);
                    OreDictionary.registerOre("gear", ModItems.gearMithril);
                    OreDictionary.registerOre("oreGear", ModItems.gearMithril);
                    OreDictionary.registerOre("plateMithril", ModItems.dustMithril);
                    OreDictionary.registerOre("plate", ModItems.dustMithril);
                    OreDictionary.registerOre("orePlate", ModItems.dustMithril);
                    OreDictionary.registerOre("rodMithril", ModItems.rodMithril);
                    OreDictionary.registerOre("rod", ModItems.rodMithril);
                    OreDictionary.registerOre("oreRod", ModItems.rodMithril);
                }
                //nickel
                if (OreInAMillionConfig.isNickelEnabled) {
                    OreDictionary.registerOre("ingotNickel", ModItems.ingotNickel);
                    OreDictionary.registerOre("ingot", ModItems.ingotNickel);
                    OreDictionary.registerOre("oreIngot", ModItems.ingotNickel);
                    OreDictionary.registerOre("nuggetNickel", ModItems.nuggetNickel);
                    OreDictionary.registerOre("nugget", ModItems.nuggetNickel);
                    OreDictionary.registerOre("oreNugget", ModItems.nuggetNickel);
                    OreDictionary.registerOre("dustNickel", ModItems.dustNickel);
                    OreDictionary.registerOre("dust", ModItems.dustNickel);
                    OreDictionary.registerOre("oreDust", ModItems.dustNickel);
                    OreDictionary.registerOre("gearNickel", ModItems.gearNickel);
                    OreDictionary.registerOre("gear", ModItems.gearNickel);
                    OreDictionary.registerOre("oreGear", ModItems.gearNickel);
                    OreDictionary.registerOre("plateNickel", ModItems.dustNickel);
                    OreDictionary.registerOre("plate", ModItems.dustNickel);
                    OreDictionary.registerOre("orePlate", ModItems.dustNickel);
                    OreDictionary.registerOre("rodNickel", ModItems.rodNickel);
                    OreDictionary.registerOre("rod", ModItems.rodNickel);
                    OreDictionary.registerOre("oreRod", ModItems.rodNickel);
                }
                //osmium
                if (OreInAMillionConfig.isOsmiumEnabled) {
                    OreDictionary.registerOre("ingotOsmium", ModItems.ingotOsmium);
                    OreDictionary.registerOre("ingot", ModItems.ingotOsmium);
                    OreDictionary.registerOre("oreIngot", ModItems.ingotOsmium);
                    OreDictionary.registerOre("nuggetOsmium", ModItems.nuggetOsmium);
                    OreDictionary.registerOre("nugget", ModItems.nuggetOsmium);
                    OreDictionary.registerOre("oreNugget", ModItems.nuggetOsmium);
                    OreDictionary.registerOre("dustOsmium", ModItems.dustOsmium);
                    OreDictionary.registerOre("dust", ModItems.dustOsmium);
                    OreDictionary.registerOre("oreDust", ModItems.dustOsmium);
                    OreDictionary.registerOre("gearOsmium", ModItems.gearOsmium);
                    OreDictionary.registerOre("gear", ModItems.gearOsmium);
                    OreDictionary.registerOre("oreGear", ModItems.gearOsmium);
                    OreDictionary.registerOre("plateOsmium", ModItems.dustOsmium);
                    OreDictionary.registerOre("plate", ModItems.dustOsmium);
                    OreDictionary.registerOre("orePlate", ModItems.dustOsmium);
                    OreDictionary.registerOre("rodOsmium", ModItems.rodOsmium);
                    OreDictionary.registerOre("rod", ModItems.rodOsmium);
                    OreDictionary.registerOre("oreRod", ModItems.rodOsmium);
                }
                //platinum
                if (OreInAMillionConfig.isPlatinumEnabled) {
                    OreDictionary.registerOre("ingotPlatinum", ModItems.ingotPlatinum);
                    OreDictionary.registerOre("ingot", ModItems.ingotPlatinum);
                    OreDictionary.registerOre("oreIngot", ModItems.ingotPlatinum);
                    OreDictionary.registerOre("nuggetPlatinum", ModItems.nuggetPlatinum);
                    OreDictionary.registerOre("nugget", ModItems.nuggetPlatinum);
                    OreDictionary.registerOre("oreNugget", ModItems.nuggetPlatinum);
                    OreDictionary.registerOre("dustPlatinum", ModItems.dustPlatinum);
                    OreDictionary.registerOre("dust", ModItems.dustPlatinum);
                    OreDictionary.registerOre("oreDust", ModItems.dustPlatinum);
                    OreDictionary.registerOre("gearPlatinum", ModItems.gearPlatinum);
                    OreDictionary.registerOre("gear", ModItems.gearPlatinum);
                    OreDictionary.registerOre("oreGear", ModItems.gearPlatinum);
                    OreDictionary.registerOre("platePlatinum", ModItems.dustPlatinum);
                    OreDictionary.registerOre("plate", ModItems.dustPlatinum);
                    OreDictionary.registerOre("orePlate", ModItems.dustPlatinum);
                    OreDictionary.registerOre("rodPlatinum", ModItems.rodPlatinum);
                    OreDictionary.registerOre("rod", ModItems.rodPlatinum);
                    OreDictionary.registerOre("oreRod", ModItems.rodPlatinum);
                }
                //silver
                if (OreInAMillionConfig.isSilverEnabled) {
                    OreDictionary.registerOre("ingotSilver", ModItems.ingotSilver);
                    OreDictionary.registerOre("ingot", ModItems.ingotSilver);
                    OreDictionary.registerOre("oreIngot", ModItems.ingotSilver);
                    OreDictionary.registerOre("nuggetSilver", ModItems.nuggetSilver);
                    OreDictionary.registerOre("nugget", ModItems.nuggetSilver);
                    OreDictionary.registerOre("oreNugget", ModItems.nuggetSilver);
                    OreDictionary.registerOre("dustSilver", ModItems.dustSilver);
                    OreDictionary.registerOre("dust", ModItems.dustSilver);
                    OreDictionary.registerOre("oreDust", ModItems.dustSilver);
                    OreDictionary.registerOre("gearSilver", ModItems.gearSilver);
                    OreDictionary.registerOre("gear", ModItems.gearSilver);
                    OreDictionary.registerOre("oreGear", ModItems.gearSilver);
                    OreDictionary.registerOre("plateSilver", ModItems.dustSilver);
                    OreDictionary.registerOre("plate", ModItems.dustSilver);
                    OreDictionary.registerOre("orePlate", ModItems.dustSilver);
                    OreDictionary.registerOre("rodSilver", ModItems.rodSilver);
                    OreDictionary.registerOre("rod", ModItems.rodSilver);
                    OreDictionary.registerOre("oreRod", ModItems.rodSilver);
                }
                //tin
                if (OreInAMillionConfig.isTinEnabled) {
                    OreDictionary.registerOre("ingotTin", ModItems.ingotTin);
                    OreDictionary.registerOre("ingot", ModItems.ingotTin);
                    OreDictionary.registerOre("oreIngot", ModItems.ingotTin);
                    OreDictionary.registerOre("nuggetTin", ModItems.nuggetTin);
                    OreDictionary.registerOre("nugget", ModItems.nuggetTin);
                    OreDictionary.registerOre("oreNugget", ModItems.nuggetTin);
                    OreDictionary.registerOre("dustTin", ModItems.dustTin);
                    OreDictionary.registerOre("dust", ModItems.dustTin);
                    OreDictionary.registerOre("oreDust", ModItems.dustTin);
                    OreDictionary.registerOre("gearTin", ModItems.gearTin);
                    OreDictionary.registerOre("gear", ModItems.gearTin);
                    OreDictionary.registerOre("oreGear", ModItems.gearTin);
                    OreDictionary.registerOre("plateTin", ModItems.dustTin);
                    OreDictionary.registerOre("plate", ModItems.dustTin);
                    OreDictionary.registerOre("orePlate", ModItems.dustTin);
                    OreDictionary.registerOre("rodTin", ModItems.rodTin);
                    OreDictionary.registerOre("rod", ModItems.rodTin);
                    OreDictionary.registerOre("oreRod", ModItems.rodTin);
                }
                //titanium
                if (OreInAMillionConfig.isTitaniumEnabled) {
                    OreDictionary.registerOre("ingotTitanium", ModItems.ingotTitanium);
                    OreDictionary.registerOre("ingot", ModItems.ingotTitanium);
                    OreDictionary.registerOre("oreIngot", ModItems.ingotTitanium);
                    OreDictionary.registerOre("nuggetTitanium", ModItems.nuggetTitanium);
                    OreDictionary.registerOre("nugget", ModItems.nuggetTitanium);
                    OreDictionary.registerOre("oreNugget", ModItems.nuggetTitanium);
                    OreDictionary.registerOre("dustTitanium", ModItems.dustTitanium);
                    OreDictionary.registerOre("dust", ModItems.dustTitanium);
                    OreDictionary.registerOre("oreDust", ModItems.dustTitanium);
                    OreDictionary.registerOre("gearTitanium", ModItems.gearTitanium);
                    OreDictionary.registerOre("gear", ModItems.gearTitanium);
                    OreDictionary.registerOre("oreGear", ModItems.gearTitanium);
                    OreDictionary.registerOre("plateTitanium", ModItems.dustTitanium);
                    OreDictionary.registerOre("plate", ModItems.dustTitanium);
                    OreDictionary.registerOre("orePlate", ModItems.dustTitanium);
                    OreDictionary.registerOre("rodTitanium", ModItems.rodTitanium);
                    OreDictionary.registerOre("rod", ModItems.rodTitanium);
                    OreDictionary.registerOre("oreRod", ModItems.rodTitanium);
                }
                //tungsten
                if (OreInAMillionConfig.isTungstenEnabled) {
                    OreDictionary.registerOre("ingotTungsten", ModItems.ingotTungsten);
                    OreDictionary.registerOre("ingot", ModItems.ingotTungsten);
                    OreDictionary.registerOre("oreIngot", ModItems.ingotTungsten);
                    OreDictionary.registerOre("nuggetTungsten", ModItems.nuggetTungsten);
                    OreDictionary.registerOre("nugget", ModItems.nuggetTungsten);
                    OreDictionary.registerOre("oreNugget", ModItems.nuggetTungsten);
                    OreDictionary.registerOre("dustTungsten", ModItems.dustTungsten);
                    OreDictionary.registerOre("dust", ModItems.dustTungsten);
                    OreDictionary.registerOre("oreDust", ModItems.dustTungsten);
                    OreDictionary.registerOre("gearTungsten", ModItems.gearTungsten);
                    OreDictionary.registerOre("gear", ModItems.gearTungsten);
                    OreDictionary.registerOre("oreGear", ModItems.gearTungsten);
                    OreDictionary.registerOre("plateTungsten", ModItems.dustTungsten);
                    OreDictionary.registerOre("plate", ModItems.dustTungsten);
                    OreDictionary.registerOre("orePlate", ModItems.dustTungsten);
                    OreDictionary.registerOre("rodTungsten", ModItems.rodTungsten);
                    OreDictionary.registerOre("rod", ModItems.rodTungsten);
                    OreDictionary.registerOre("oreRod", ModItems.rodTungsten);
                }
                //uranium
                if (OreInAMillionConfig.isUraniumEnabled) {
                    OreDictionary.registerOre("ingotUranium", ModItems.ingotUranium);
                    OreDictionary.registerOre("ingot", ModItems.ingotUranium);
                    OreDictionary.registerOre("oreIngot", ModItems.ingotUranium);
                    OreDictionary.registerOre("nuggetUranium", ModItems.nuggetUranium);
                    OreDictionary.registerOre("nugget", ModItems.nuggetUranium);
                    OreDictionary.registerOre("oreNugget", ModItems.nuggetUranium);
                    OreDictionary.registerOre("dustUranium", ModItems.dustUranium);
                    OreDictionary.registerOre("dust", ModItems.dustUranium);
                    OreDictionary.registerOre("oreDust", ModItems.dustUranium);
                    OreDictionary.registerOre("gearUranium", ModItems.gearUranium);
                    OreDictionary.registerOre("gear", ModItems.gearUranium);
                    OreDictionary.registerOre("oreGear", ModItems.gearUranium);
                    OreDictionary.registerOre("plateUranium", ModItems.dustUranium);
                    OreDictionary.registerOre("plate", ModItems.dustUranium);
                    OreDictionary.registerOre("orePlate", ModItems.dustUranium);
                    OreDictionary.registerOre("rodUranium", ModItems.rodUranium);
                    OreDictionary.registerOre("rod", ModItems.rodUranium);
                    OreDictionary.registerOre("oreRod", ModItems.rodUranium);
                }
                //zinc
                if (OreInAMillionConfig.isZincEnabled) {
                    OreDictionary.registerOre("ingotZinc", ModItems.ingotZinc);
                    OreDictionary.registerOre("ingot", ModItems.ingotZinc);
                    OreDictionary.registerOre("oreIngot", ModItems.ingotZinc);
                    OreDictionary.registerOre("nuggetZinc", ModItems.nuggetZinc);
                    OreDictionary.registerOre("nugget", ModItems.nuggetZinc);
                    OreDictionary.registerOre("oreNugget", ModItems.nuggetZinc);
                    OreDictionary.registerOre("dustZinc", ModItems.dustZinc);
                    OreDictionary.registerOre("dust", ModItems.dustZinc);
                    OreDictionary.registerOre("oreDust", ModItems.dustZinc);
                    OreDictionary.registerOre("gearZinc", ModItems.gearZinc);
                    OreDictionary.registerOre("gear", ModItems.gearZinc);
                    OreDictionary.registerOre("oreGear", ModItems.gearZinc);
                    OreDictionary.registerOre("plateZinc", ModItems.dustZinc);
                    OreDictionary.registerOre("plate", ModItems.dustZinc);
                    OreDictionary.registerOre("orePlate", ModItems.dustZinc);
                    OreDictionary.registerOre("rodZinc", ModItems.rodZinc);
                    OreDictionary.registerOre("rod", ModItems.rodZinc);
                    OreDictionary.registerOre("oreRod", ModItems.rodZinc);
                }
                //brass
                if (OreInAMillionConfig.isBrassEnabled) {
                    OreDictionary.registerOre("ingotBrass", ModItems.ingotBrass);
                    OreDictionary.registerOre("ingot", ModItems.ingotBrass);
                    OreDictionary.registerOre("oreIngot", ModItems.ingotBrass);
                    OreDictionary.registerOre("nuggetBrass", ModItems.nuggetBrass);
                    OreDictionary.registerOre("nugget", ModItems.nuggetBrass);
                    OreDictionary.registerOre("oreNugget", ModItems.nuggetBrass);
                    OreDictionary.registerOre("dustBrass", ModItems.dustBrass);
                    OreDictionary.registerOre("dust", ModItems.dustBrass);
                    OreDictionary.registerOre("oreDust", ModItems.dustBrass);
                    OreDictionary.registerOre("gearBrass", ModItems.gearBrass);
                    OreDictionary.registerOre("gear", ModItems.gearBrass);
                    OreDictionary.registerOre("oreGear", ModItems.gearBrass);
                    OreDictionary.registerOre("plateBrass", ModItems.dustBrass);
                    OreDictionary.registerOre("plate", ModItems.dustBrass);
                    OreDictionary.registerOre("orePlate", ModItems.dustBrass);
                    OreDictionary.registerOre("rodBrass", ModItems.rodBrass);
                    OreDictionary.registerOre("rod", ModItems.rodBrass);
                    OreDictionary.registerOre("oreRod", ModItems.rodBrass);
                }
                //bronze
                if (OreInAMillionConfig.isBronzeEnabled) {
                    OreDictionary.registerOre("ingotBronze", ModItems.ingotBronze);
                    OreDictionary.registerOre("ingot", ModItems.ingotBronze);
                    OreDictionary.registerOre("oreIngot", ModItems.ingotBronze);
                    OreDictionary.registerOre("nuggetBronze", ModItems.nuggetBronze);
                    OreDictionary.registerOre("nugget", ModItems.nuggetBronze);
                    OreDictionary.registerOre("oreNugget", ModItems.nuggetBronze);
                    OreDictionary.registerOre("dustBronze", ModItems.dustBronze);
                    OreDictionary.registerOre("dust", ModItems.dustBronze);
                    OreDictionary.registerOre("oreDust", ModItems.dustBronze);
                    OreDictionary.registerOre("gearBronze", ModItems.gearBronze);
                    OreDictionary.registerOre("gear", ModItems.gearBronze);
                    OreDictionary.registerOre("oreGear", ModItems.gearBronze);
                    OreDictionary.registerOre("plateBronze", ModItems.dustBronze);
                    OreDictionary.registerOre("plate", ModItems.dustBronze);
                    OreDictionary.registerOre("orePlate", ModItems.dustBronze);
                    OreDictionary.registerOre("rodBronze", ModItems.rodBronze);
                    OreDictionary.registerOre("rod", ModItems.rodBronze);
                    OreDictionary.registerOre("oreRod", ModItems.rodBronze);
                }
                //electrum
                if (OreInAMillionConfig.isElectrumEnabled) {
                    OreDictionary.registerOre("ingotElectrum", ModItems.ingotElectrum);
                    OreDictionary.registerOre("ingot", ModItems.ingotElectrum);
                    OreDictionary.registerOre("oreIngot", ModItems.ingotElectrum);
                    OreDictionary.registerOre("nuggetElectrum", ModItems.nuggetElectrum);
                    OreDictionary.registerOre("nugget", ModItems.nuggetElectrum);
                    OreDictionary.registerOre("oreNugget", ModItems.nuggetElectrum);
                    OreDictionary.registerOre("dustElectrum", ModItems.dustElectrum);
                    OreDictionary.registerOre("dust", ModItems.dustElectrum);
                    OreDictionary.registerOre("oreDust", ModItems.dustElectrum);
                    OreDictionary.registerOre("gearElectrum", ModItems.gearElectrum);
                    OreDictionary.registerOre("gear", ModItems.gearElectrum);
                    OreDictionary.registerOre("oreGear", ModItems.gearElectrum);
                    OreDictionary.registerOre("plateElectrum", ModItems.dustElectrum);
                    OreDictionary.registerOre("plate", ModItems.dustElectrum);
                    OreDictionary.registerOre("orePlate", ModItems.dustElectrum);
                    OreDictionary.registerOre("rodElectrum", ModItems.rodElectrum);
                    OreDictionary.registerOre("rod", ModItems.rodElectrum);
                    OreDictionary.registerOre("oreRod", ModItems.rodElectrum);
                }
                //fairy
                if (OreInAMillionConfig.isFairyEnabled){
                    OreDictionary.registerOre("ingotFairy", ModItems.ingotFairy);
                    OreDictionary.registerOre("ingot", ModItems.ingotFairy);
                    OreDictionary.registerOre("oreIngot", ModItems.ingotFairy);
                    OreDictionary.registerOre("nuggetFairy", ModItems.nuggetFairy);
                    OreDictionary.registerOre("nugget", ModItems.nuggetFairy);
                    OreDictionary.registerOre("oreNugget", ModItems.nuggetFairy);
                    OreDictionary.registerOre("dustFairy", ModItems.dustFairy);
                    OreDictionary.registerOre("dust", ModItems.dustFairy);
                    OreDictionary.registerOre("oreDust", ModItems.dustFairy);
                    OreDictionary.registerOre("gearFairy", ModItems.gearFairy);
                    OreDictionary.registerOre("gear", ModItems.gearFairy);
                    OreDictionary.registerOre("oreGear", ModItems.gearFairy);
                    OreDictionary.registerOre("plateFairy", ModItems.dustFairy);
                    OreDictionary.registerOre("plate", ModItems.dustFairy);
                    OreDictionary.registerOre("orePlate", ModItems.dustFairy);
                    OreDictionary.registerOre("rodFairy", ModItems.rodFairy);
                    OreDictionary.registerOre("rod", ModItems.rodFairy);
                    OreDictionary.registerOre("oreRod", ModItems.rodFairy);
                }
                //invar
                if (OreInAMillionConfig.isInvarEnabled) {
                    OreDictionary.registerOre("ingotInvar", ModItems.ingotInvar);
                    OreDictionary.registerOre("ingot", ModItems.ingotInvar);
                    OreDictionary.registerOre("oreIngot", ModItems.ingotInvar);
                    OreDictionary.registerOre("nuggetInvar", ModItems.nuggetInvar);
                    OreDictionary.registerOre("nugget", ModItems.nuggetInvar);
                    OreDictionary.registerOre("oreNugget", ModItems.nuggetInvar);
                    OreDictionary.registerOre("dustInvar", ModItems.dustInvar);
                    OreDictionary.registerOre("dust", ModItems.dustInvar);
                    OreDictionary.registerOre("oreDust", ModItems.dustInvar);
                    OreDictionary.registerOre("gearInvar", ModItems.gearInvar);
                    OreDictionary.registerOre("gear", ModItems.gearInvar);
                    OreDictionary.registerOre("oreGear", ModItems.gearInvar);
                    OreDictionary.registerOre("plateInvar", ModItems.dustInvar);
                    OreDictionary.registerOre("plate", ModItems.dustInvar);
                    OreDictionary.registerOre("orePlate", ModItems.dustInvar);
                    OreDictionary.registerOre("rodInvar", ModItems.rodInvar);
                    OreDictionary.registerOre("rod", ModItems.rodInvar);
                    OreDictionary.registerOre("oreRod", ModItems.rodInvar);
                }
                //steel
                if (OreInAMillionConfig.isSteelEnabled) {
                    OreDictionary.registerOre("ingotSteel", ModItems.ingotSteel);
                    OreDictionary.registerOre("ingot", ModItems.ingotSteel);
                    OreDictionary.registerOre("oreIngot", ModItems.ingotSteel);
                    OreDictionary.registerOre("nuggetSteel", ModItems.nuggetSteel);
                    OreDictionary.registerOre("nugget", ModItems.nuggetSteel);
                    OreDictionary.registerOre("oreNugget", ModItems.nuggetSteel);
                    OreDictionary.registerOre("dustSteel", ModItems.dustSteel);
                    OreDictionary.registerOre("dust", ModItems.dustSteel);
                    OreDictionary.registerOre("oreDust", ModItems.dustSteel);
                    OreDictionary.registerOre("gearSteel", ModItems.gearSteel);
                    OreDictionary.registerOre("gear", ModItems.gearSteel);
                    OreDictionary.registerOre("oreGear", ModItems.gearSteel);
                    OreDictionary.registerOre("plateSteel", ModItems.dustSteel);
                    OreDictionary.registerOre("plate", ModItems.dustSteel);
                    OreDictionary.registerOre("orePlate", ModItems.dustSteel);
                    OreDictionary.registerOre("rodSteel", ModItems.rodSteel);
                    OreDictionary.registerOre("rod", ModItems.rodSteel);
                    OreDictionary.registerOre("oreRod", ModItems.rodSteel);
                }
                //thermal series
                if (OreInAMillionConfig.isThermalIngotsEnabled){
                    //constantan
                    if (OreInAMillionConfig.isConstantanEnabled){
                        OreDictionary.registerOre("ingotConstantan", ModItems.ingotConstantan);
                        OreDictionary.registerOre("ingot", ModItems.ingotConstantan);
                        OreDictionary.registerOre("oreIngot", ModItems.ingotConstantan);
                        OreDictionary.registerOre("nuggetConstantan", ModItems.nuggetConstantan);
                        OreDictionary.registerOre("nugget", ModItems.nuggetConstantan);
                        OreDictionary.registerOre("oreNugget", ModItems.nuggetConstantan);
                        OreDictionary.registerOre("dustConstantan", ModItems.dustConstantan);
                        OreDictionary.registerOre("dust", ModItems.dustConstantan);
                        OreDictionary.registerOre("oreDust", ModItems.dustConstantan);
                        OreDictionary.registerOre("gearConstantan", ModItems.gearConstantan);
                        OreDictionary.registerOre("gear", ModItems.gearConstantan);
                        OreDictionary.registerOre("oreGear", ModItems.gearConstantan);
                        OreDictionary.registerOre("plateConstantan", ModItems.dustConstantan);
                        OreDictionary.registerOre("plate", ModItems.dustConstantan);
                        OreDictionary.registerOre("orePlate", ModItems.dustConstantan);
                        OreDictionary.registerOre("rodConstantan", ModItems.rodConstantan);
                        OreDictionary.registerOre("rod", ModItems.rodConstantan);
                        OreDictionary.registerOre("oreRod", ModItems.rodConstantan);
                    }
                    //enderium
                    if (OreInAMillionConfig.isEnderiumEnabled){
                        OreDictionary.registerOre("ingotEnderium", ModItems.ingotEnderium);
                        OreDictionary.registerOre("ingot", ModItems.ingotEnderium);
                        OreDictionary.registerOre("oreIngot", ModItems.ingotEnderium);
                        OreDictionary.registerOre("nuggetEnderium", ModItems.nuggetEnderium);
                        OreDictionary.registerOre("nugget", ModItems.nuggetEnderium);
                        OreDictionary.registerOre("oreNugget", ModItems.nuggetEnderium);
                        OreDictionary.registerOre("dustEnderium", ModItems.dustEnderium);
                        OreDictionary.registerOre("dust", ModItems.dustEnderium);
                        OreDictionary.registerOre("oreDust", ModItems.dustEnderium);
                        OreDictionary.registerOre("gearEnderium", ModItems.gearEnderium);
                        OreDictionary.registerOre("gear", ModItems.gearEnderium);
                        OreDictionary.registerOre("oreGear", ModItems.gearEnderium);
                        OreDictionary.registerOre("plateEnderium", ModItems.dustEnderium);
                        OreDictionary.registerOre("plate", ModItems.dustEnderium);
                        OreDictionary.registerOre("orePlate", ModItems.dustEnderium);
                        OreDictionary.registerOre("rodEnderium", ModItems.rodEnderium);
                        OreDictionary.registerOre("rod", ModItems.rodEnderium);
                        OreDictionary.registerOre("oreRod", ModItems.rodEnderium);
                    }
                    //lumium
                    if (OreInAMillionConfig.isLumiumEnabled){
                        OreDictionary.registerOre("ingotLumium", ModItems.ingotLumium);
                        OreDictionary.registerOre("ingot", ModItems.ingotLumium);
                        OreDictionary.registerOre("oreIngot", ModItems.ingotLumium);
                        OreDictionary.registerOre("nuggetLumium", ModItems.nuggetLumium);
                        OreDictionary.registerOre("nugget", ModItems.nuggetLumium);
                        OreDictionary.registerOre("oreNugget", ModItems.nuggetLumium);
                        OreDictionary.registerOre("dustLumium", ModItems.dustLumium);
                        OreDictionary.registerOre("dust", ModItems.dustLumium);
                        OreDictionary.registerOre("oreDust", ModItems.dustLumium);
                        OreDictionary.registerOre("gearLumium", ModItems.gearLumium);
                        OreDictionary.registerOre("gear", ModItems.gearLumium);
                        OreDictionary.registerOre("oreGear", ModItems.gearLumium);
                        OreDictionary.registerOre("plateLumium", ModItems.dustLumium);
                        OreDictionary.registerOre("plate", ModItems.dustLumium);
                        OreDictionary.registerOre("orePlate", ModItems.dustLumium);
                        OreDictionary.registerOre("rodLumium", ModItems.rodLumium);
                        OreDictionary.registerOre("rod", ModItems.rodLumium);
                        OreDictionary.registerOre("oreRod", ModItems.rodLumium);
                    }
                    //signalum
                    if (OreInAMillionConfig.isSignalumEnabled){
                        OreDictionary.registerOre("ingotSignalum", ModItems.ingotSignalum);
                        OreDictionary.registerOre("ingot", ModItems.ingotSignalum);
                        OreDictionary.registerOre("oreIngot", ModItems.ingotSignalum);
                        OreDictionary.registerOre("nuggetSignalum", ModItems.nuggetSignalum);
                        OreDictionary.registerOre("nugget", ModItems.nuggetSignalum);
                        OreDictionary.registerOre("oreNugget", ModItems.nuggetSignalum);
                        OreDictionary.registerOre("dustSignalum", ModItems.dustSignalum);
                        OreDictionary.registerOre("dust", ModItems.dustSignalum);
                        OreDictionary.registerOre("oreDust", ModItems.dustSignalum);
                        OreDictionary.registerOre("gearSignalum", ModItems.gearSignalum);
                        OreDictionary.registerOre("gear", ModItems.gearSignalum);
                        OreDictionary.registerOre("oreGear", ModItems.gearSignalum);
                        OreDictionary.registerOre("plateSignalum", ModItems.dustSignalum);
                        OreDictionary.registerOre("plate", ModItems.dustSignalum);
                        OreDictionary.registerOre("orePlate", ModItems.dustSignalum);
                        OreDictionary.registerOre("rodSignalum", ModItems.rodSignalum);
                        OreDictionary.registerOre("rod", ModItems.rodSignalum);
                        OreDictionary.registerOre("oreRod", ModItems.rodSignalum);
                    }
                }
                //tinkers construct
                if (OreInAMillionConfig.isTinkersIngotsEnabled){
                    //ardite
                    if (OreInAMillionConfig.isArditeEnabled){
                        OreDictionary.registerOre("ingotArdite", ModItems.ingotArdite);
                        OreDictionary.registerOre("ingot", ModItems.ingotArdite);
                        OreDictionary.registerOre("oreIngot", ModItems.ingotArdite);
                        OreDictionary.registerOre("nuggetArdite", ModItems.nuggetArdite);
                        OreDictionary.registerOre("nugget", ModItems.nuggetArdite);
                        OreDictionary.registerOre("oreNugget", ModItems.nuggetArdite);
                        OreDictionary.registerOre("dustArdite", ModItems.dustArdite);
                        OreDictionary.registerOre("dust", ModItems.dustArdite);
                        OreDictionary.registerOre("oreDust", ModItems.dustArdite);
                        OreDictionary.registerOre("gearArdite", ModItems.gearArdite);
                        OreDictionary.registerOre("gear", ModItems.gearArdite);
                        OreDictionary.registerOre("oreGear", ModItems.gearArdite);
                        OreDictionary.registerOre("plateArdite", ModItems.dustArdite);
                        OreDictionary.registerOre("plate", ModItems.dustArdite);
                        OreDictionary.registerOre("orePlate", ModItems.dustArdite);
                        OreDictionary.registerOre("rodArdite", ModItems.rodArdite);
                        OreDictionary.registerOre("rod", ModItems.rodArdite);
                        OreDictionary.registerOre("oreRod", ModItems.rodArdite);
                    }
                    //knightslime
                    if (OreInAMillionConfig.isKnightSlimeEnabled){
                        OreDictionary.registerOre("ingotKnightslime", ModItems.ingotKnightSlime);
                        OreDictionary.registerOre("ingot", ModItems.ingotKnightSlime);
                        OreDictionary.registerOre("oreIngot", ModItems.ingotKnightSlime);
                        OreDictionary.registerOre("nuggetKnightslime", ModItems.nuggetKnightSlime);
                        OreDictionary.registerOre("nugget", ModItems.nuggetKnightSlime);
                        OreDictionary.registerOre("oreNugget", ModItems.nuggetKnightSlime);
                        OreDictionary.registerOre("dustKnightslime", ModItems.dustKnightSlime);
                        OreDictionary.registerOre("dust", ModItems.dustKnightSlime);
                        OreDictionary.registerOre("oreDust", ModItems.dustKnightSlime);
                        OreDictionary.registerOre("gearKnightslime", ModItems.gearKnightSlime);
                        OreDictionary.registerOre("gear", ModItems.gearKnightSlime);
                        OreDictionary.registerOre("oreGear", ModItems.gearKnightSlime);
                        OreDictionary.registerOre("plateKnightslime", ModItems.dustKnightSlime);
                        OreDictionary.registerOre("plate", ModItems.dustKnightSlime);
                        OreDictionary.registerOre("orePlate", ModItems.dustKnightSlime);
                        OreDictionary.registerOre("rodKnightslime", ModItems.rodKnightSlime);
                        OreDictionary.registerOre("rod", ModItems.rodKnightSlime);
                        OreDictionary.registerOre("oreRod", ModItems.rodKnightSlime);
                    }
                    //pigiron
                    if (OreInAMillionConfig.isPigIronEnabled) {
                        OreDictionary.registerOre("ingotPigiron", ModItems.ingotPigIron);
                        OreDictionary.registerOre("ingot", ModItems.ingotPigIron);
                        OreDictionary.registerOre("oreIngot", ModItems.ingotPigIron);
                        OreDictionary.registerOre("nuggetPigiron", ModItems.nuggetPigIron);
                        OreDictionary.registerOre("nugget", ModItems.nuggetPigIron);
                        OreDictionary.registerOre("oreNugget", ModItems.nuggetPigIron);
                        OreDictionary.registerOre("dustPigiron", ModItems.dustPigIron);
                        OreDictionary.registerOre("dust", ModItems.dustPigIron);
                        OreDictionary.registerOre("oreDust", ModItems.dustPigIron);
                        OreDictionary.registerOre("gearPigiron", ModItems.gearPigIron);
                        OreDictionary.registerOre("gear", ModItems.gearPigIron);
                        OreDictionary.registerOre("oreGear", ModItems.gearPigIron);
                        OreDictionary.registerOre("platePigiron", ModItems.dustPigIron);
                        OreDictionary.registerOre("plate", ModItems.dustPigIron);
                        OreDictionary.registerOre("orePlate", ModItems.dustPigIron);
                        OreDictionary.registerOre("rodPigiron", ModItems.rodPigIron);
                        OreDictionary.registerOre("rod", ModItems.rodPigIron);
                        OreDictionary.registerOre("oreRod", ModItems.rodPigIron);
                    }
                    //manyullyn
                    if (OreInAMillionConfig.isManyullynEnabled){
                        OreDictionary.registerOre("ingotManyullyn", ModItems.ingotManyullyn);
                        OreDictionary.registerOre("ingot", ModItems.ingotManyullyn);
                        OreDictionary.registerOre("oreIngot", ModItems.ingotManyullyn);
                        OreDictionary.registerOre("nuggetManyullyn", ModItems.nuggetManyullyn);
                        OreDictionary.registerOre("nugget", ModItems.nuggetManyullyn);
                        OreDictionary.registerOre("oreNugget", ModItems.nuggetManyullyn);
                        OreDictionary.registerOre("dustManyullyn", ModItems.dustManyullyn);
                        OreDictionary.registerOre("dust", ModItems.dustManyullyn);
                        OreDictionary.registerOre("oreDust", ModItems.dustManyullyn);
                        OreDictionary.registerOre("gearManyullyn", ModItems.gearManyullyn);
                        OreDictionary.registerOre("gear", ModItems.gearManyullyn);
                        OreDictionary.registerOre("oreGear", ModItems.gearManyullyn);
                        OreDictionary.registerOre("plateManyullyn", ModItems.dustManyullyn);
                        OreDictionary.registerOre("plate", ModItems.dustManyullyn);
                        OreDictionary.registerOre("orePlate", ModItems.dustManyullyn);
                        OreDictionary.registerOre("rodManyullyn", ModItems.rodManyullyn);
                        OreDictionary.registerOre("rod", ModItems.rodManyullyn);
                        OreDictionary.registerOre("oreRod", ModItems.rodManyullyn);
                    }
                }
            }
            //gems
            if (OreInAMillionConfig.isGemsEnabled){
                //amethyst
                if (OreInAMillionConfig.isAmethystEnabled){
                    OreDictionary.registerOre("gemAmethyst", ModItems.gemAmethyst);
                    OreDictionary.registerOre("gem", ModItems.gemAmethyst);
                    OreDictionary.registerOre("oreGem", ModItems.gemAmethyst);
                    OreDictionary.registerOre("nuggetAmethyst", ModItems.nuggetAmethyst);
                    OreDictionary.registerOre("nugget", ModItems.nuggetAmethyst);
                    OreDictionary.registerOre("oreNugget", ModItems.nuggetAmethyst);
                    OreDictionary.registerOre("dustAmethyst", ModItems.dustAmethyst);
                    OreDictionary.registerOre("dust", ModItems.dustAmethyst);
                    OreDictionary.registerOre("oreDust", ModItems.dustAmethyst);
                    OreDictionary.registerOre("gearAmethyst", ModItems.gearAmethyst);
                    OreDictionary.registerOre("gear", ModItems.gearAmethyst);
                    OreDictionary.registerOre("oreGear", ModItems.gearAmethyst);
                    OreDictionary.registerOre("plateAmethyst", ModItems.dustAmethyst);
                    OreDictionary.registerOre("plate", ModItems.dustAmethyst);
                    OreDictionary.registerOre("orePlate", ModItems.dustAmethyst);
                    OreDictionary.registerOre("rodAmethyst", ModItems.rodAmethyst);
                    OreDictionary.registerOre("rod", ModItems.rodAmethyst);
                    OreDictionary.registerOre("oreRod", ModItems.rodAmethyst);
                }
                //peridot
                if (OreInAMillionConfig.isPeridotEnabled){
                    OreDictionary.registerOre("gemPeridot", ModItems.gemPeridot);
                    OreDictionary.registerOre("gem", ModItems.gemPeridot);
                    OreDictionary.registerOre("oreGem", ModItems.gemPeridot);
                    OreDictionary.registerOre("nuggetPeridot", ModItems.nuggetPeridot);
                    OreDictionary.registerOre("nugget", ModItems.nuggetPeridot);
                    OreDictionary.registerOre("oreNugget", ModItems.nuggetPeridot);
                    OreDictionary.registerOre("dustPeridot", ModItems.dustPeridot);
                    OreDictionary.registerOre("dust", ModItems.dustPeridot);
                    OreDictionary.registerOre("oreDust", ModItems.dustPeridot);
                    OreDictionary.registerOre("gearPeridot", ModItems.gearPeridot);
                    OreDictionary.registerOre("gear", ModItems.gearPeridot);
                    OreDictionary.registerOre("oreGear", ModItems.gearPeridot);
                    OreDictionary.registerOre("platePeridot", ModItems.dustPeridot);
                    OreDictionary.registerOre("plate", ModItems.dustPeridot);
                    OreDictionary.registerOre("orePlate", ModItems.dustPeridot);
                    OreDictionary.registerOre("rodPeridot", ModItems.rodPeridot);
                    OreDictionary.registerOre("rod", ModItems.rodPeridot);
                    OreDictionary.registerOre("oreRod", ModItems.rodPeridot);
                }
                //ruby
                if (OreInAMillionConfig.isRubyEnabled){
                    OreDictionary.registerOre("gemRuby", ModItems.gemRuby);
                    OreDictionary.registerOre("gem", ModItems.gemRuby);
                    OreDictionary.registerOre("oreGem", ModItems.gemRuby);
                    OreDictionary.registerOre("nuggetRuby", ModItems.nuggetRuby);
                    OreDictionary.registerOre("nugget", ModItems.nuggetRuby);
                    OreDictionary.registerOre("oreNugget", ModItems.nuggetRuby);
                    OreDictionary.registerOre("dustRuby", ModItems.dustRuby);
                    OreDictionary.registerOre("dust", ModItems.dustRuby);
                    OreDictionary.registerOre("oreDust", ModItems.dustRuby);
                    OreDictionary.registerOre("gearRuby", ModItems.gearRuby);
                    OreDictionary.registerOre("gear", ModItems.gearRuby);
                    OreDictionary.registerOre("oreGear", ModItems.gearRuby);
                    OreDictionary.registerOre("plateRuby", ModItems.dustRuby);
                    OreDictionary.registerOre("plate", ModItems.dustRuby);
                    OreDictionary.registerOre("orePlate", ModItems.dustRuby);
                    OreDictionary.registerOre("rodRuby", ModItems.rodRuby);
                    OreDictionary.registerOre("rod", ModItems.rodRuby);
                    OreDictionary.registerOre("oreRod", ModItems.rodRuby);
                }
                //sapphire
                if (OreInAMillionConfig.isSapphireEnabled){
                    OreDictionary.registerOre("gemSapphire", ModItems.gemSapphire);
                    OreDictionary.registerOre("gem", ModItems.gemSapphire);
                    OreDictionary.registerOre("oreGem", ModItems.gemSapphire);
                    OreDictionary.registerOre("nuggetSapphire", ModItems.nuggetSapphire);
                    OreDictionary.registerOre("nugget", ModItems.nuggetSapphire);
                    OreDictionary.registerOre("oreNugget", ModItems.nuggetSapphire);
                    OreDictionary.registerOre("dustSapphire", ModItems.dustSapphire);
                    OreDictionary.registerOre("dust", ModItems.dustSapphire);
                    OreDictionary.registerOre("oreDust", ModItems.dustSapphire);
                    OreDictionary.registerOre("gearSapphire", ModItems.gearSapphire);
                    OreDictionary.registerOre("gear", ModItems.gearSapphire);
                    OreDictionary.registerOre("oreGear", ModItems.gearSapphire);
                    OreDictionary.registerOre("plateSapphire", ModItems.dustSapphire);
                    OreDictionary.registerOre("plate", ModItems.dustSapphire);
                    OreDictionary.registerOre("orePlate", ModItems.dustSapphire);
                    OreDictionary.registerOre("rodSapphire", ModItems.rodSapphire);
                    OreDictionary.registerOre("rod", ModItems.rodSapphire);
                    OreDictionary.registerOre("oreRod", ModItems.rodSapphire);
                }
            }
            //elements
            if (OreInAMillionConfig.isElementsEnabled){
                //carbon
                if (OreInAMillionConfig.isCarbonEnabled){
                    OreDictionary.registerOre("carbon", ModItems.elementCarbon);
                    OreDictionary.registerOre("oreCarbon", ModItems.elementCarbon);
                    OreDictionary.registerOre("elementCarbon", ModItems.elementCarbon);
                    OreDictionary.registerOre("nuggetCarbon", ModItems.nuggetCarbon);
                    OreDictionary.registerOre("nugget", ModItems.nuggetCarbon);
                    OreDictionary.registerOre("oreNugget", ModItems.nuggetCarbon);
                    OreDictionary.registerOre("dustCarbon", ModItems.dustCarbon);
                    OreDictionary.registerOre("dust", ModItems.dustCarbon);
                    OreDictionary.registerOre("oreDust", ModItems.dustCarbon);
                }
                //cinnabar
                if (OreInAMillionConfig.isCinnabarEnabled){
                    OreDictionary.registerOre("cinnabar", ModItems.elementCinnabar);
                    OreDictionary.registerOre("oreCinnabar", ModItems.elementCinnabar);
                    OreDictionary.registerOre("elementCinnabar", ModItems.elementCinnabar);
                    OreDictionary.registerOre("nuggetCinnabar", ModItems.nuggetCinnabar);
                    OreDictionary.registerOre("nugget", ModItems.nuggetCinnabar);
                    OreDictionary.registerOre("oreNugget", ModItems.nuggetCinnabar);
                    OreDictionary.registerOre("dustCinnabar", ModItems.dustCinnabar);
                    OreDictionary.registerOre("dust", ModItems.dustCinnabar);
                    OreDictionary.registerOre("oreDust", ModItems.dustCinnabar);
                }
                //silicon
                if (OreInAMillionConfig.isSiliconEnabled) {
                    OreDictionary.registerOre("silicon", ModItems.elementSilicon);
                    OreDictionary.registerOre("oreSilicon", ModItems.elementSilicon);
                    OreDictionary.registerOre("elementSilicon", ModItems.elementSilicon);
                    OreDictionary.registerOre("nuggetSilicon", ModItems.nuggetSilicon);
                    OreDictionary.registerOre("nugget", ModItems.nuggetSilicon);
                    OreDictionary.registerOre("oreNugget", ModItems.nuggetSilicon);
                    OreDictionary.registerOre("dustSilicon", ModItems.dustSilicon);
                    OreDictionary.registerOre("dust", ModItems.dustSilicon);
                    OreDictionary.registerOre("oreDust", ModItems.dustSilicon);
//                    OreDictionary.registerOre("gearSilicon", ModItems.gearSilicon);
//                    OreDictionary.registerOre("gear", ModItems.gearSilicon);
//                    OreDictionary.registerOre("oreGear", ModItems.gearSilicon);
//                    OreDictionary.registerOre("plateSilicon", ModItems.dustSilicon);
//                    OreDictionary.registerOre("plate", ModItems.dustSilicon);
//                    OreDictionary.registerOre("orePlate", ModItems.dustSilicon);
//                    OreDictionary.registerOre("rodSilicon", ModItems.rodSilicon);
//                    OreDictionary.registerOre("rod", ModItems.rodSilicon);
//                    OreDictionary.registerOre("oreRod", ModItems.rodSilicon);
                }
                //sulphur
                if (OreInAMillionConfig.isSulphurEnabled){
                    OreDictionary.registerOre("sulfur", ModItems.elementSulfur);
                    OreDictionary.registerOre("oreSulfur", ModItems.elementSulfur);
                    OreDictionary.registerOre("elementSulfur", ModItems.elementSulfur);
                    OreDictionary.registerOre("nuggetSulfur", ModItems.nuggetSulfur);
                    OreDictionary.registerOre("nugget", ModItems.nuggetSulfur);
                    OreDictionary.registerOre("oreNugget", ModItems.nuggetSulfur);
                    OreDictionary.registerOre("dustSulfur", ModItems.dustSulfur);
                    OreDictionary.registerOre("dust", ModItems.dustSulfur);
                    OreDictionary.registerOre("oreDust", ModItems.dustSulfur);
                }
            }
            //vanilla additions
            if (OreInAMillionConfig.isVanillaEnabled){
                //charcoal
                if (OreInAMillionConfig.isCharcoalEnabled) {
                    OreDictionary.registerOre("nuggetCharcoal", ModItems.nuggetCharcoal);
                    OreDictionary.registerOre("nugget", ModItems.nuggetCharcoal);
                    OreDictionary.registerOre("oreNugget", ModItems.nuggetCharcoal);
                    OreDictionary.registerOre("dustCharcoal", ModItems.dustCharcoal);
                    OreDictionary.registerOre("dust", ModItems.dustCharcoal);
                    OreDictionary.registerOre("oreDust", ModItems.dustCharcoal);
                    OreDictionary.registerOre("gearCharcoal", ModItems.gearCharcoal);
                    OreDictionary.registerOre("gear", ModItems.gearCharcoal);
                    OreDictionary.registerOre("oreGear", ModItems.gearCharcoal);
                    OreDictionary.registerOre("plateCharcoal", ModItems.dustCharcoal);
                    OreDictionary.registerOre("plate", ModItems.dustCharcoal);
                    OreDictionary.registerOre("orePlate", ModItems.dustCharcoal);
                    OreDictionary.registerOre("rodCharcoal", ModItems.rodCharcoal);
                    OreDictionary.registerOre("rod", ModItems.rodCharcoal);
                    OreDictionary.registerOre("oreRod", ModItems.rodCharcoal);
                }
                //coal
                if (OreInAMillionConfig.isCoalEnabled) {
                    OreDictionary.registerOre("nuggetCoal", ModItems.nuggetCoal);
                    OreDictionary.registerOre("nugget", ModItems.nuggetCoal);
                    OreDictionary.registerOre("oreNugget", ModItems.nuggetCoal);
                    OreDictionary.registerOre("dustCoal", ModItems.dustCoal);
                    OreDictionary.registerOre("dust", ModItems.dustCoal);
                    OreDictionary.registerOre("oreDust", ModItems.dustCoal);
                    OreDictionary.registerOre("gearCoal", ModItems.gearCoal);
                    OreDictionary.registerOre("gear", ModItems.gearCoal);
                    OreDictionary.registerOre("oreGear", ModItems.gearCoal);
                    OreDictionary.registerOre("plateCoal", ModItems.dustCoal);
                    OreDictionary.registerOre("plate", ModItems.dustCoal);
                    OreDictionary.registerOre("orePlate", ModItems.dustCoal);
                    OreDictionary.registerOre("rodCoal", ModItems.rodCoal);
                    OreDictionary.registerOre("rod", ModItems.rodCoal);
                    OreDictionary.registerOre("oreRod", ModItems.rodCoal);
                }
                //diamond
                if (OreInAMillionConfig.isDiamondEnabled) {
                    OreDictionary.registerOre("nuggetDiamond", ModItems.nuggetDiamond);
                    OreDictionary.registerOre("nugget", ModItems.nuggetDiamond);
                    OreDictionary.registerOre("oreNugget", ModItems.nuggetDiamond);
                    OreDictionary.registerOre("dustDiamond", ModItems.dustDiamond);
                    OreDictionary.registerOre("dust", ModItems.dustDiamond);
                    OreDictionary.registerOre("oreDust", ModItems.dustDiamond);
                    OreDictionary.registerOre("gearDiamond", ModItems.gearDiamond);
                    OreDictionary.registerOre("gear", ModItems.gearDiamond);
                    OreDictionary.registerOre("oreGear", ModItems.gearDiamond);
                    OreDictionary.registerOre("plateDiamond", ModItems.dustDiamond);
                    OreDictionary.registerOre("plate", ModItems.dustDiamond);
                    OreDictionary.registerOre("orePlate", ModItems.dustDiamond);
                    OreDictionary.registerOre("rodDiamond", ModItems.rodDiamond);
                    OreDictionary.registerOre("rod", ModItems.rodDiamond);
                    OreDictionary.registerOre("oreRod", ModItems.rodDiamond);
                }
                //emerald
                if (OreInAMillionConfig.isEmeraldEnabled) {
                    OreDictionary.registerOre("nuggetEmerald", ModItems.nuggetEmerald);
                    OreDictionary.registerOre("nugget", ModItems.nuggetEmerald);
                    OreDictionary.registerOre("oreNugget", ModItems.nuggetEmerald);
                    OreDictionary.registerOre("dustEmerald", ModItems.dustEmerald);
                    OreDictionary.registerOre("dust", ModItems.dustEmerald);
                    OreDictionary.registerOre("oreDust", ModItems.dustEmerald);
                    OreDictionary.registerOre("gearEmerald", ModItems.gearEmerald);
                    OreDictionary.registerOre("gear", ModItems.gearEmerald);
                    OreDictionary.registerOre("oreGear", ModItems.gearEmerald);
                    OreDictionary.registerOre("plateEmerald", ModItems.dustEmerald);
                    OreDictionary.registerOre("plate", ModItems.dustEmerald);
                    OreDictionary.registerOre("orePlate", ModItems.dustEmerald);
                    OreDictionary.registerOre("rodEmerald", ModItems.rodEmerald);
                    OreDictionary.registerOre("rod", ModItems.rodEmerald);
                    OreDictionary.registerOre("oreRod", ModItems.rodEmerald);
                }
                //gold
                if (OreInAMillionConfig.isGoldEnabled){
                    OreDictionary.registerOre("dustGold", ModItems.dustGold);
                    OreDictionary.registerOre("dust", ModItems.dustGold);
                    OreDictionary.registerOre("oreDust", ModItems.dustGold);
                    OreDictionary.registerOre("gearGold", ModItems.gearGold);
                    OreDictionary.registerOre("gear", ModItems.gearGold);
                    OreDictionary.registerOre("oreGear", ModItems.gearGold);
                    OreDictionary.registerOre("plateGold", ModItems.dustGold);
                    OreDictionary.registerOre("plate", ModItems.dustGold);
                    OreDictionary.registerOre("orePlate", ModItems.dustGold);
                    OreDictionary.registerOre("rodGold", ModItems.rodGold);
                    OreDictionary.registerOre("rod", ModItems.rodGold);
                    OreDictionary.registerOre("oreRod", ModItems.rodGold);
                }
                //iron
                if (OreInAMillionConfig.isIronEnabled){
                    OreDictionary.registerOre("dustIron", ModItems.dustIron);
                    OreDictionary.registerOre("dust", ModItems.dustIron);
                    OreDictionary.registerOre("oreDust", ModItems.dustIron);
                    OreDictionary.registerOre("gearIron", ModItems.gearIron);
                    OreDictionary.registerOre("gear", ModItems.gearIron);
                    OreDictionary.registerOre("oreGear", ModItems.gearIron);
                    OreDictionary.registerOre("plateIron", ModItems.dustIron);
                    OreDictionary.registerOre("plate", ModItems.dustIron);
                    OreDictionary.registerOre("orePlate", ModItems.dustIron);
                    OreDictionary.registerOre("rodIron", ModItems.rodIron);
                    OreDictionary.registerOre("rod", ModItems.rodIron);
                    OreDictionary.registerOre("oreRod", ModItems.rodIron);
                }
                //quartz
                if (OreInAMillionConfig.isQuartzEnabled){
                    OreDictionary.registerOre("nuggetQuartz", ModItems.nuggetQuartz);
                    OreDictionary.registerOre("nugget", ModItems.nuggetQuartz);
                    OreDictionary.registerOre("oreNugget", ModItems.nuggetQuartz);
                    OreDictionary.registerOre("dustQuartz", ModItems.dustQuartz);
                    OreDictionary.registerOre("dust", ModItems.dustQuartz);
                    OreDictionary.registerOre("oreDust", ModItems.dustQuartz);
                    OreDictionary.registerOre("gearQuartz", ModItems.gearQuartz);
                    OreDictionary.registerOre("gear", ModItems.gearQuartz);
                    OreDictionary.registerOre("oreGear", ModItems.gearQuartz);
                    OreDictionary.registerOre("plateQuartz", ModItems.dustQuartz);
                    OreDictionary.registerOre("plate", ModItems.dustQuartz);
                    OreDictionary.registerOre("orePlate", ModItems.dustQuartz);
                    OreDictionary.registerOre("rodQuartz", ModItems.rodQuartz);
                    OreDictionary.registerOre("rod", ModItems.rodQuartz);
                    OreDictionary.registerOre("oreRod", ModItems.rodQuartz);
                }
            }
            if (OreInAMillionConfig.isSillyStuffEnabled){
                OreDictionary.registerOre("tinCan", ModItems.tinCan);
                OreDictionary.registerOre("foodSoupcan", ModItems.foodSoupcan);
                OreDictionary.registerOre("weezer", ModItems.weezerWeezer);
            }
        }
    }
}