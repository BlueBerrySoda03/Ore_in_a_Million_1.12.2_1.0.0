package com.blueberrysoda.oreinamillion.init;

import com.blueberrysoda.oreinamillion.config.OreInAMillionConfig;
import com.blueberrysoda.oreinamillion.items.food.ItemFoodBase;
import com.blueberrysoda.oreinamillion.items.crafting.*;
import com.blueberrysoda.oreinamillion.items.food.ItemFoodMetal;
import com.blueberrysoda.oreinamillion.items.food.ItemFoodSoupcan;
import com.blueberrysoda.oreinamillion.items.misc.ItemIcon;
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
    public static ItemIngot ingotAluminum;
    public static ItemIngot ingotArdite;
    public static ItemIngot ingotChrome;
    public static ItemIngot ingotCobalt;
    public static ItemIngot ingotCopper;
    public static ItemIngot ingotEnder;
    public static ItemIngot ingotIridium;
    public static ItemIngot ingotLead;
    public static ItemIngot ingotMithril;
    public static ItemIngot ingotNickel;
    public static ItemIngot ingotOsmium;
    public static ItemIngot ingotPlatinum;
    public static ItemIngot ingotSilver;
    public static ItemIngot ingotTin;
    public static ItemIngot ingotTitanium;
    public static ItemIngot ingotTungsten;
    public static ItemIngot ingotUranium;
    public static ItemIngot ingotZinc;
    //alloy ingots
    public static ItemIngot ingotBrass;
    public static ItemIngot ingotBronze;
    public static ItemIngot ingotConstantan;
    public static ItemIngot ingotElectrum;
    public static ItemIngot ingotEnderium;
    public static ItemIngot ingotFairy;
    public static ItemIngot ingotInvar;
    public static ItemIngot ingotKnightSlime;
    public static ItemIngot ingotLumium;
    public static ItemIngot ingotManyullyn;
    public static ItemFoodMetal ingotPigIron;
    public static ItemIngot ingotSignalum;
    public static ItemIngot ingotSteel;
    //gems
    public static ItemGem gemAmethyst;
    public static ItemGem gemPeridot;
    public static ItemGem gemRuby;
    public static ItemGem gemSapphire;
    //other
    public static ItemElement elementCarbon;
    public static ItemElement elementCinnabar;
    public static ItemElement elementSilicon;
    public static ItemElement elementSulfur;

    //=========
    //nuggets
    //=========
    //base nuggets
    public static ItemNugget nuggetAluminum;
    public static ItemNugget nuggetArdite;
    public static ItemNugget nuggetChrome;
    public static ItemNugget nuggetCobalt;
    public static ItemNugget nuggetCopper;
    public static ItemNugget nuggetEnder;
    public static ItemNugget nuggetIridium;
    public static ItemNugget nuggetLead;
    public static ItemNugget nuggetMithril;
    public static ItemNugget nuggetNickel;
    public static ItemNugget nuggetOsmium;
    public static ItemNugget nuggetPlatinum;
    public static ItemNugget nuggetSilver;
    public static ItemNugget nuggetTin;
    public static ItemNugget nuggetTitanium;
    public static ItemNugget nuggetTungsten;
    public static ItemNugget nuggetUranium;
    public static ItemNugget nuggetZinc;
    //alloy nuggets
    public static ItemNugget nuggetBrass;
    public static ItemNugget nuggetBronze;
    public static ItemNugget nuggetConstantan;
    public static ItemNugget nuggetElectrum;
    public static ItemNugget nuggetEnderium;
    public static ItemNugget nuggetFairy;
    public static ItemNugget nuggetInvar;
    public static ItemNugget nuggetKnightSlime;
    public static ItemNugget nuggetLumium;
    public static ItemNugget nuggetManyullyn;
    public static ItemFoodMetal nuggetPigIron;
    public static ItemNugget nuggetSignalum;
    public static ItemNugget nuggetSteel;
    //gem nuggets
    public static ItemNugget nuggetAmethyst;
    public static ItemNugget nuggetPeridot;
    public static ItemNugget nuggetRuby;
    public static ItemNugget nuggetSapphire;
    //element nuggets
    public static ItemNugget nuggetCarbon;
    public static ItemNugget nuggetCinnabar;
    public static ItemNugget nuggetSilicon;
    public static ItemNugget nuggetSulfur;
    //vanilla nuggets
    public static ItemCoal nuggetCharcoal;
    public static ItemCoal nuggetCoal;
    public static ItemNugget nuggetDiamond;
    public static ItemNugget nuggetEmerald;
    public static ItemNugget nuggetQuartz;

    //========
    //dusts
    //========
    //base ingots
    public static ItemDust dustAluminum;
    public static ItemDust dustArdite;
    public static ItemDust dustChrome;
    public static ItemDust dustCobalt;
    public static ItemDust dustCopper;
    public static ItemDust dustEnder;
    public static ItemDust dustIridium;
    public static ItemDust dustLead;
    public static ItemDust dustMithril;
    public static ItemDust dustNickel;
    public static ItemDust dustOsmium;
    public static ItemDust dustPlatinum;
    public static ItemDust dustSilver;
    public static ItemDust dustTin;
    public static ItemDust dustTitanium;
    public static ItemDust dustTungsten;
    public static ItemDust dustUranium;
    public static ItemDust dustZinc;
    //alloy ingots
    public static ItemDust dustBrass;
    public static ItemDust dustBronze;
    public static ItemDust dustConstantan;
    public static ItemDust dustElectrum;
    public static ItemDust dustEnderium;
    public static ItemDust dustFairy;
    public static ItemDust dustInvar;
    public static ItemDust dustKnightSlime;
    public static ItemDust dustLumium;
    public static ItemDust dustManyullyn;
    public static ItemFoodMetal dustPigIron;
    public static ItemDust dustSignalum;
    public static ItemDust dustSteel;
    //gems
    public static ItemDust dustAmethyst;
    public static ItemDust dustPeridot;
    public static ItemDust dustRuby;
    public static ItemDust dustSapphire;
    //other
    public static ItemDust dustCarbon;
    public static ItemDust dustCinnabar;
    public static ItemDust dustSulfur;
    public static ItemDust dustSilicon;
    //vanilla
    public static ItemCoal dustCharcoal;
    public static ItemCoal dustCoal;
    public static ItemDust dustDiamond;
    public static ItemDust dustEmerald;
    public static ItemDust dustQuartz;

    //========
    //icons
    //========
    public static ItemIcon creativeIcon1;
    public static ItemIcon creativeIcon2;
    public static ItemIcon creativeIcon3;
    public static ItemIcon creativeIcon4;
    public static ItemIcon creativeIcon5;
    public static ItemIcon creativeIcon6;

    //other stuffs
    public static ItemMain tinCan;
    public static ItemFoodSoupcan foodSoupcan;

    public static void init(){
        // = new ("");
        if (OreInAMillionConfig.isMineralsEnabled) {
            if (OreInAMillionConfig.isIngotsEnabled) {
                //aluminum
                if (OreInAMillionConfig.isAluminumEnabled) {
                    ingotAluminum = new ItemIngot("aluminum_ingot");
                    nuggetAluminum = new ItemNugget("aluminum_nugget");
                    dustAluminum = new ItemDust("aluminum_dust");
                }
                //chrome
                if (OreInAMillionConfig.isChromeEnabled) {
                    ingotChrome = new ItemIngot("chrome_ingot");
                    nuggetChrome = new ItemNugget("chrome_nugget");
                    dustChrome = new ItemDust("chrome_dust");
                }
                //cobalt
                if (OreInAMillionConfig.isCobaltEnabled) {
                    ingotCobalt = new ItemIngot("cobalt_ingot");
                    nuggetCobalt = new ItemNugget("cobalt_nugget");
                    dustCobalt = new ItemDust("cobalt_dust");
                }
                //copper
                if (OreInAMillionConfig.isCopperEnabled) {
                    ingotCopper = new ItemIngot("copper_ingot");
                    nuggetCopper = new ItemNugget("copper_nugget");
                    dustCopper = new ItemDust("copper_dust");
                }
                //ender
                if (OreInAMillionConfig.isEnderEnabled){
                    ingotEnder = new ItemIngot("ender_ingot");
                    nuggetEnder = new ItemNugget("ender_nugget");
                    dustEnder = new ItemDust("ender_dust");
                }
                //iridium
                if (OreInAMillionConfig.isIridiumEnabled) {
                    ingotIridium = new ItemIngot("iridium_ingot");
                    nuggetIridium = new ItemNugget("iridium_nugget");
                    dustIridium = new ItemDust("iridium_dust");
                }
                //lead
                if (OreInAMillionConfig.isLeadEnabled) {
                    ingotLead = new ItemIngot("lead_ingot");
                    nuggetLead = new ItemNugget("lead_nugget");
                    dustLead = new ItemDust("lead_dust");
                }
                //mithril
                if (OreInAMillionConfig.isMithrilEnabled) {
                    ingotMithril = new ItemIngot("mithril_ingot");
                    nuggetMithril = new ItemNugget("mithril_nugget");
                    dustMithril = new ItemDust("mithril_dust");
                }
                //nickel
                if (OreInAMillionConfig.isNickelEnabled) {
                    ingotNickel = new ItemIngot("nickel_ingot");
                    nuggetNickel = new ItemNugget("nickel_nugget");
                    dustNickel = new ItemDust("nickel_dust");
                }
                //osmium
                if (OreInAMillionConfig.isOsmiumEnabled) {
                    ingotOsmium = new ItemIngot("osmium_ingot");
                    nuggetOsmium = new ItemNugget("osmium_nugget");
                    dustOsmium = new ItemDust("osmium_dust");
                }
                //platinum
                if (OreInAMillionConfig.isPlatinumEnabled) {
                    ingotPlatinum = new ItemIngot("platinum_ingot");
                    nuggetPlatinum = new ItemNugget("platinum_nugget");
                    dustPlatinum = new ItemDust("platinum_dust");
                }
                //silver
                if (OreInAMillionConfig.isSilverEnabled) {
                    ingotSilver = new ItemIngot("silver_ingot");
                    nuggetSilver = new ItemNugget("silver_nugget");
                    dustSilver = new ItemDust("silver_dust");
                }
                //tin
                if (OreInAMillionConfig.isTinEnabled) {
                    ingotTin = new ItemIngot("tin_ingot");
                    nuggetTin = new ItemNugget("tin_nugget");
                    dustTin = new ItemDust("tin_dust");
                }
                //titanium
                if (OreInAMillionConfig.isTitaniumEnabled) {
                    ingotTitanium = new ItemIngot("titanium_ingot");
                    nuggetTitanium = new ItemNugget("titanium_nugget");
                    dustTitanium = new ItemDust("titanium_dust");
                }
                //tungsten
                if (OreInAMillionConfig.isTungstenEnabled) {
                    ingotTungsten = new ItemIngot("tungsten_ingot");
                    nuggetTungsten = new ItemNugget("tungsten_nugget");
                    dustTungsten = new ItemDust("tungsten_dust");
                }
                //uranium
                if (OreInAMillionConfig.isUraniumEnabled) {
                    ingotUranium = new ItemIngot("uranium_ingot");
                    nuggetUranium = new ItemNugget("uranium_nugget");
                    dustUranium = new ItemDust("uranium_dust");
                }
                //zinc
                if (OreInAMillionConfig.isZincEnabled) {
                    ingotZinc = new ItemIngot("zinc_ingot");
                    nuggetZinc = new ItemNugget("zinc_nugget");
                    dustZinc = new ItemDust("zinc_dust");
                }
                //brass
                if (OreInAMillionConfig.isBrassEnabled) {
                    ingotBrass = new ItemIngot("brass_ingot");
                    nuggetBrass = new ItemNugget("brass_nugget");
                    dustBrass = new ItemDust("brass_dust");
                }
                //bronze
                if (OreInAMillionConfig.isBronzeEnabled) {
                    ingotBronze = new ItemIngot("bronze_ingot");
                    nuggetBronze = new ItemNugget("bronze_nugget");
                    dustBronze = new ItemDust("bronze_dust");
                }
                //electrum
                if (OreInAMillionConfig.isElectrumEnabled) {
                    ingotElectrum = new ItemIngot("electrum_ingot");
                    nuggetElectrum = new ItemNugget("electrum_nugget");
                    dustElectrum = new ItemDust("electrum_dust");
                }
                //fairy
                if (OreInAMillionConfig.isFairyEnabled){
                    ingotFairy = new ItemIngot("fairy_ingot");
                    nuggetFairy = new ItemNugget("fairy_nugget");
                    dustFairy = new ItemDust("fairy_dust");
                }
                //invar
                if (OreInAMillionConfig.isInvarEnabled) {
                    ingotInvar = new ItemIngot("invar_ingot");
                    nuggetInvar = new ItemNugget("invar_nugget");
                    dustInvar = new ItemDust("invar_dust");
                }
                //steel
                if (OreInAMillionConfig.isSteelEnabled) {
                    ingotSteel = new ItemIngot("steel_ingot");
                    nuggetSteel = new ItemNugget("steel_nugget");
                    dustSteel = new ItemDust("steel_dust");
                }
                //thermal series
                if (OreInAMillionConfig.isThermalIngotsEnabled){
                    //constantan
                    if (OreInAMillionConfig.isConstantanEnabled){
                        ingotConstantan = new ItemIngot("constantan_ingot");
                        nuggetConstantan = new ItemNugget("constantan_nugget");
                        dustConstantan = new ItemDust("constantan_dust");
                    }
                    //enderium
                    if (OreInAMillionConfig.isEnderiumEnabled){
                        ingotEnderium = new ItemIngot("enderium_ingot");
                        nuggetEnderium = new ItemNugget("enderium_nugget");
                        dustEnderium = new ItemDust("enderium_dust");
                    }
                    //lumium
                    if (OreInAMillionConfig.isLumiumEnabled){
                        ingotLumium = new ItemIngot("lumium_ingot");
                        nuggetLumium = new ItemNugget("lumium_nugget");
                        dustLumium = new ItemDust("lumium_dust");
                    }
                    //signalum
                    if (OreInAMillionConfig.isSignalumEnabled){
                        ingotSignalum = new ItemIngot("signalum_ingot");
                        nuggetSignalum = new ItemNugget("signalum_nugget");
                        dustSignalum = new ItemDust("signalum_dust");
                    }
                }
                //tinkers construct
                if (OreInAMillionConfig.isTinkersIngotsEnabled){
                    //ardite
                    if (OreInAMillionConfig.isArditeEnabled){
                        ingotArdite = new ItemIngot("ardite_ingot");
                        nuggetArdite = new ItemNugget("ardite_nugget");
                        dustArdite = new ItemDust("ardite_dust");
                    }
                    //knightslime
                    if (OreInAMillionConfig.isKnightSlimeEnabled){
                        ingotKnightSlime = new ItemIngot("knightslime_ingot");
                        nuggetKnightSlime = new ItemNugget("knightslime_nugget");
                        dustKnightSlime = new ItemDust("knightslime_dust");
                    }
                    //pigiron
                    if (OreInAMillionConfig.isPigIronEnabled) {
                        ingotPigIron = new ItemFoodMetal("pigiron_ingot", 4, 2, false);
                        nuggetPigIron = new ItemFoodMetal("pigiron_nugget", 1, 0, false);
                        dustPigIron = new ItemFoodMetal("pigiron_dust", 2, 4, false);
                    }
                    //manyullyn
                    if (OreInAMillionConfig.isManyullynEnabled){
                        ingotManyullyn = new ItemIngot("manyullyn_ingot");
                        nuggetManyullyn = new ItemNugget("manyullyn_nugget");
                        dustManyullyn = new ItemDust("manyullyn_dust");
                    }
                }
            }
            //gems
            if (OreInAMillionConfig.isGemsEnabled){
                //amethyst
                if (OreInAMillionConfig.isAmethystEnabled){
                    gemAmethyst = new ItemGem("amethyst");
                    nuggetAmethyst = new ItemNugget("amethyst_nugget");
                    dustAmethyst = new ItemDust("amethyst_dust");
                }
                //peridot
                if (OreInAMillionConfig.isPeridotEnabled){
                    gemPeridot = new ItemGem("peridot");
                    nuggetPeridot = new ItemNugget("peridot_nugget");
                    dustPeridot = new ItemDust("peridot_dust");
                }
                //ruby
                if (OreInAMillionConfig.isRubyEnabled){
                    gemRuby = new ItemGem("ruby");
                    nuggetRuby = new ItemNugget("ruby_nugget");
                    dustRuby = new ItemDust("ruby_dust");
                }
                //sapphire
                if (OreInAMillionConfig.isSapphireEnabled){
                    gemSapphire = new ItemGem("sapphire");
                    nuggetSapphire = new ItemNugget("sapphire_nugget");
                    dustSapphire = new ItemDust("sapphire_dust");
                }
            }
            //elements
            if (OreInAMillionConfig.isElementsEnabled){
                //carbon
                if (OreInAMillionConfig.isCarbonEnabled){
                    elementCarbon = new ItemElement("carbon");
                    nuggetCarbon = new ItemNugget("carbon_nugget");
                    dustCarbon = new ItemDust("carbon_dust");
                }
                //cinnabar
                if (OreInAMillionConfig.isCinnabarEnabled){
                    elementCinnabar = new ItemElement("cinnabar");
                    nuggetCinnabar = new ItemNugget("cinnabar_nugget");
                    dustCinnabar = new ItemDust("cinnabar_dust");
                }
                //silicon
                if (OreInAMillionConfig.isSiliconEnabled){
                    elementSilicon = new ItemElement("silicon");
                    nuggetSilicon = new ItemNugget("silicon_nugget");
                    dustSilicon = new ItemDust("silicon_dust");
                }
                //sulphur
                if (OreInAMillionConfig.isSulphurEnabled){
                    elementSulfur = new ItemElement("sulfur");
                    nuggetSulfur = new ItemNugget("sulfur_nugget");
                    dustSulfur = new ItemDust("sulfur_dust");
                }
            }
            //vanilla additions
            if (OreInAMillionConfig.isVanillaEnabled){
                //charcoal
                if (OreInAMillionConfig.isCharcoalEnabled) {
                    nuggetCharcoal = new ItemCoal("charcoal_nugget", 200);
                    dustCharcoal = new ItemCoal("charcoal_dust", 1600);
                }
                //coal
                if (OreInAMillionConfig.isCoalEnabled) {
                    nuggetCoal = new ItemCoal("coal_nugget", 200);
                    dustCoal = new ItemCoal("coal_dust", 1600);
                }
                //diamond
                if (OreInAMillionConfig.isDiamondEnabled) {
                    nuggetDiamond = new ItemNugget("diamond_nugget");
                    dustDiamond = new ItemDust("diamond_dust");
                }
                //emerald
                if (OreInAMillionConfig.isEmeraldEnabled) {
                    nuggetEmerald = new ItemNugget("emerald_nugget");
                    dustEmerald = new ItemDust("emerald_dust");
                }
                //quartz
                if (OreInAMillionConfig.isQuartzEnabled){
                    nuggetQuartz = new ItemNugget("quartz_nugget");
                    dustQuartz = new ItemDust("quartz_dust");
                }
            }
            if (OreInAMillionConfig.isSillyStuffEnabled){
                tinCan = new ItemMain("tin_can");
                foodSoupcan = new ItemFoodSoupcan("soupcan", 7, 4, false);
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
        //event.getRegistry().register();
        if (OreInAMillionConfig.isMineralsEnabled) {
            if (OreInAMillionConfig.isIngotsEnabled) {
                //aluminum
                if (OreInAMillionConfig.isAluminumEnabled) {
                    event.getRegistry().register(ingotAluminum);
                    event.getRegistry().register(nuggetAluminum);
                    event.getRegistry().register(dustAluminum);
                }
                //chrome
                if (OreInAMillionConfig.isChromeEnabled) {
                    event.getRegistry().register(ingotChrome);
                    event.getRegistry().register(nuggetChrome);
                    event.getRegistry().register(dustChrome);
                }
                //cobalt
                if (OreInAMillionConfig.isCobaltEnabled) {
                    event.getRegistry().register(ingotCobalt);
                    event.getRegistry().register(nuggetCobalt);
                    event.getRegistry().register(dustCobalt);
                }
                //copper
                if (OreInAMillionConfig.isCopperEnabled) {
                    event.getRegistry().register(ingotCopper);
                    event.getRegistry().register(nuggetCopper);
                    event.getRegistry().register(dustCopper);
                }
                //ender
                if (OreInAMillionConfig.isEnderEnabled) {
                    event.getRegistry().register(ingotEnder);
                    event.getRegistry().register(nuggetEnder);
                    event.getRegistry().register(dustEnder);
                }
                //iridium
                if (OreInAMillionConfig.isIridiumEnabled) {
                    event.getRegistry().register(ingotIridium);
                    event.getRegistry().register(nuggetIridium);
                    event.getRegistry().register(dustIridium);
                }
                //lead
                if (OreInAMillionConfig.isLeadEnabled) {
                    event.getRegistry().register(ingotLead);
                    event.getRegistry().register(nuggetLead);
                    event.getRegistry().register(dustLead);
                }
                //mithril
                if (OreInAMillionConfig.isMithrilEnabled) {
                    event.getRegistry().register(ingotMithril);
                    event.getRegistry().register(nuggetMithril);
                    event.getRegistry().register(dustMithril);
                }
                //nickel
                if (OreInAMillionConfig.isNickelEnabled) {
                    event.getRegistry().register(ingotNickel);
                    event.getRegistry().register(nuggetNickel);
                    event.getRegistry().register(dustNickel);
                }
                //osmium
                if (OreInAMillionConfig.isOsmiumEnabled) {
                    event.getRegistry().register(ingotOsmium);
                    event.getRegistry().register(nuggetOsmium);
                    event.getRegistry().register(dustOsmium);
                }
                //platinum
                if (OreInAMillionConfig.isPlatinumEnabled) {
                    event.getRegistry().register(ingotPlatinum);
                    event.getRegistry().register(nuggetPlatinum);
                    event.getRegistry().register(dustPlatinum);
                }
                //silver
                if (OreInAMillionConfig.isSilverEnabled) {
                    event.getRegistry().register(ingotSilver);
                    event.getRegistry().register(nuggetSilver);
                    event.getRegistry().register(dustSilver);
                }
                //tin
                if (OreInAMillionConfig.isTinEnabled) {
                    event.getRegistry().register(ingotTin);
                    event.getRegistry().register(nuggetTin);
                    event.getRegistry().register(dustTin);
                }
                //titanium
                if (OreInAMillionConfig.isTitaniumEnabled) {
                    event.getRegistry().register(ingotTitanium);
                    event.getRegistry().register(nuggetTitanium);
                    event.getRegistry().register(dustTitanium);
                }
                //tungsten
                if (OreInAMillionConfig.isTungstenEnabled) {
                    event.getRegistry().register(ingotTungsten);
                    event.getRegistry().register(nuggetTungsten);
                    event.getRegistry().register(dustTungsten);
                }
                //uranium
                if (OreInAMillionConfig.isUraniumEnabled) {
                    event.getRegistry().register(ingotUranium);
                    event.getRegistry().register(nuggetUranium);
                    event.getRegistry().register(dustUranium);
                }
                //zinc
                if (OreInAMillionConfig.isZincEnabled) {
                    event.getRegistry().register(ingotZinc);
                    event.getRegistry().register(nuggetZinc);
                    event.getRegistry().register(dustZinc);
                }
                //brass
                if (OreInAMillionConfig.isBrassEnabled) {
                    event.getRegistry().register(ingotBrass);
                    event.getRegistry().register(nuggetBrass);
                    event.getRegistry().register(dustBrass);
                }
                //bronze
                if (OreInAMillionConfig.isBronzeEnabled) {
                    event.getRegistry().register(ingotBronze);
                    event.getRegistry().register(nuggetBronze);
                    event.getRegistry().register(dustBronze);
                }
                //electrum
                if (OreInAMillionConfig.isElectrumEnabled) {
                    event.getRegistry().register(ingotElectrum);
                    event.getRegistry().register(nuggetElectrum);
                    event.getRegistry().register(dustElectrum);
                }
                //fairy
                if (OreInAMillionConfig.isFairyEnabled) {
                    event.getRegistry().register(ingotFairy);
                    event.getRegistry().register(nuggetFairy);
                    event.getRegistry().register(dustFairy);
                }
                //invar
                if (OreInAMillionConfig.isInvarEnabled) {
                    event.getRegistry().register(ingotInvar);
                    event.getRegistry().register(nuggetInvar);
                    event.getRegistry().register(dustInvar);
                }
                //steel
                if (OreInAMillionConfig.isSteelEnabled) {
                    event.getRegistry().register(ingotSteel);
                    event.getRegistry().register(nuggetSteel);
                    event.getRegistry().register(dustSteel);
                }
                //thermal series
                if (OreInAMillionConfig.isThermalIngotsEnabled) {
                    //constantan
                    if (OreInAMillionConfig.isConstantanEnabled) {
                        event.getRegistry().register(ingotConstantan);
                        event.getRegistry().register(nuggetConstantan);
                        event.getRegistry().register(dustConstantan);
                    }
                    //enderium
                    if (OreInAMillionConfig.isEnderiumEnabled) {
                        event.getRegistry().register(ingotEnderium);
                        event.getRegistry().register(nuggetEnderium);
                        event.getRegistry().register(dustEnderium);
                    }
                    //lumium
                    if (OreInAMillionConfig.isLumiumEnabled) {
                        event.getRegistry().register(ingotLumium);
                        event.getRegistry().register(nuggetLumium);
                        event.getRegistry().register(dustLumium);
                    }
                    //signalum
                    if (OreInAMillionConfig.isSignalumEnabled) {
                        event.getRegistry().register(ingotSignalum);
                        event.getRegistry().register(nuggetSignalum);
                        event.getRegistry().register(dustSignalum);
                    }
                }
                //tinkers construct
                if (OreInAMillionConfig.isTinkersIngotsEnabled) {
                    //ardite
                    if (OreInAMillionConfig.isArditeEnabled) {
                        event.getRegistry().register(ingotArdite);
                        event.getRegistry().register(nuggetArdite);
                        event.getRegistry().register(dustArdite);
                    }
                    //knightslime
                    if (OreInAMillionConfig.isKnightSlimeEnabled) {
                        event.getRegistry().register(ingotKnightSlime);
                        event.getRegistry().register(nuggetKnightSlime);
                        event.getRegistry().register(dustKnightSlime);
                    }
                    //pigiron
                    if (OreInAMillionConfig.isPigIronEnabled) {
                        event.getRegistry().register(ingotPigIron);
                        event.getRegistry().register(nuggetPigIron);
                        event.getRegistry().register(dustPigIron);
                    }
                    //manyullyn
                    if (OreInAMillionConfig.isManyullynEnabled) {
                        event.getRegistry().register(ingotManyullyn);
                        event.getRegistry().register(nuggetManyullyn);
                        event.getRegistry().register(dustManyullyn);
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
                }
                //peridot
                if (OreInAMillionConfig.isPeridotEnabled) {
                    event.getRegistry().register(gemPeridot);
                    event.getRegistry().register(nuggetPeridot);
                    event.getRegistry().register(dustPeridot);
                }
                //ruby
                if (OreInAMillionConfig.isRubyEnabled) {
                    event.getRegistry().register(gemRuby);
                    event.getRegistry().register(nuggetRuby);
                    event.getRegistry().register(dustRuby);
                }
                //sapphire
                if (OreInAMillionConfig.isSapphireEnabled) {
                    event.getRegistry().register(gemSapphire);
                    event.getRegistry().register(nuggetSapphire);
                    event.getRegistry().register(dustSapphire);
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
                }
                //coal
                if (OreInAMillionConfig.isCoalEnabled) {
                    event.getRegistry().register(nuggetCoal);
                    event.getRegistry().register(dustCoal);
                }
                //diamond
                if (OreInAMillionConfig.isDiamondEnabled) {
                    event.getRegistry().register(nuggetDiamond);
                    event.getRegistry().register(dustDiamond);
                }
                //emerald
                if (OreInAMillionConfig.isEmeraldEnabled) {
                    event.getRegistry().register(nuggetEmerald);
                    event.getRegistry().register(dustEmerald);
                }
                //quartz
                if (OreInAMillionConfig.isQuartzEnabled) {
                    event.getRegistry().register(nuggetQuartz);
                    event.getRegistry().register(dustQuartz);
                }
            }
            if (OreInAMillionConfig.isSillyStuffEnabled) {
                event.getRegistry().register(tinCan);
                event.getRegistry().register(foodSoupcan);
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
                }
                //chrome
                if (OreInAMillionConfig.isChromeEnabled) {
                    registerRender(ingotChrome);
                    registerRender(nuggetChrome);
                    registerRender(dustChrome);
                }
                //cobalt
                if (OreInAMillionConfig.isCobaltEnabled) {
                    registerRender(ingotCobalt);
                    registerRender(nuggetCobalt);
                    registerRender(dustCobalt);
                }
                //copper
                if (OreInAMillionConfig.isCopperEnabled) {
                    registerRender(ingotCopper);
                    registerRender(nuggetCopper);
                    registerRender(dustCopper);
                }
                //ender
                if (OreInAMillionConfig.isEnderEnabled){
                    registerRender(ingotEnder);
                    registerRender(nuggetEnder);
                    registerRender(dustEnder);
                }
                //iridium
                if (OreInAMillionConfig.isIridiumEnabled) {
                    registerRender(ingotIridium);
                    registerRender(nuggetIridium);
                    registerRender(dustIridium);
                }
                //lead
                if (OreInAMillionConfig.isLeadEnabled) {
                    registerRender(ingotLead);
                    registerRender(nuggetLead);
                    registerRender(dustLead);
                }
                //mithril
                if (OreInAMillionConfig.isMithrilEnabled) {
                    registerRender(ingotMithril);
                    registerRender(nuggetMithril);
                    registerRender(dustMithril);
                }
                //nickel
                if (OreInAMillionConfig.isNickelEnabled) {
                    registerRender(ingotNickel);
                    registerRender(nuggetNickel);
                    registerRender(dustNickel);
                }
                //osmium
                if (OreInAMillionConfig.isOsmiumEnabled) {
                    registerRender(ingotOsmium);
                    registerRender(nuggetOsmium);
                    registerRender(dustOsmium);
                }
                //platinum
                if (OreInAMillionConfig.isPlatinumEnabled) {
                    registerRender(ingotPlatinum);
                    registerRender(nuggetPlatinum);
                    registerRender(dustPlatinum);
                }
                //silver
                if (OreInAMillionConfig.isSilverEnabled) {
                    registerRender(ingotSilver);
                    registerRender(nuggetSilver);
                    registerRender(dustSilver);
                }
                //tin
                if (OreInAMillionConfig.isTinEnabled) {
                    registerRender(ingotTin);
                    registerRender(nuggetTin);
                    registerRender(dustTin);
                }
                //titanium
                if (OreInAMillionConfig.isTitaniumEnabled) {
                    registerRender(ingotTitanium);
                    registerRender(nuggetTitanium);
                    registerRender(dustTitanium);
                }
                //tungsten
                if (OreInAMillionConfig.isTungstenEnabled) {
                    registerRender(ingotTungsten);
                    registerRender(nuggetTungsten);
                    registerRender(dustTungsten);
                }
                //uranium
                if (OreInAMillionConfig.isUraniumEnabled) {
                    registerRender(ingotUranium);
                    registerRender(nuggetUranium);
                    registerRender(dustUranium);
                }
                //zinc
                if (OreInAMillionConfig.isZincEnabled) {
                    registerRender(ingotZinc);
                    registerRender(nuggetZinc);
                    registerRender(dustZinc);
                }
                //brass
                if (OreInAMillionConfig.isBrassEnabled) {
                    registerRender(ingotBrass);
                    registerRender(nuggetBrass);
                    registerRender(dustBrass);
                }
                //bronze
                if (OreInAMillionConfig.isBronzeEnabled) {
                    registerRender(ingotBronze);
                    registerRender(nuggetBronze);
                    registerRender(dustBronze);
                }
                //electrum
                if (OreInAMillionConfig.isElectrumEnabled) {
                    registerRender(ingotElectrum);
                    registerRender(nuggetElectrum);
                    registerRender(dustElectrum);
                }
                //fairy
                if (OreInAMillionConfig.isFairyEnabled){
                    registerRender(ingotFairy);
                    registerRender(nuggetFairy);
                    registerRender(dustFairy);
                }
                //invar
                if (OreInAMillionConfig.isInvarEnabled) {
                    registerRender(ingotInvar);
                    registerRender(nuggetInvar);
                    registerRender(dustInvar);
                }
                //steel
                if (OreInAMillionConfig.isSteelEnabled) {
                    registerRender(ingotSteel);
                    registerRender(nuggetSteel);
                    registerRender(dustSteel);
                }
                //thermal series
                if (OreInAMillionConfig.isThermalIngotsEnabled){
                    //constantan
                    if (OreInAMillionConfig.isConstantanEnabled){
                        registerRender(ingotConstantan);
                        registerRender(nuggetConstantan);
                        registerRender(dustConstantan);
                    }
                    //enderium
                    if (OreInAMillionConfig.isEnderiumEnabled){
                        registerRender(ingotEnderium);
                        registerRender(nuggetEnderium);
                        registerRender(dustEnderium);
                    }
                    //lumium
                    if (OreInAMillionConfig.isLumiumEnabled){
                        registerRender(ingotLumium);
                        registerRender(nuggetLumium);
                        registerRender(dustLumium);
                    }
                    //signalum
                    if (OreInAMillionConfig.isSignalumEnabled){
                        registerRender(ingotSignalum);
                        registerRender(nuggetSignalum);
                        registerRender(dustSignalum);
                    }
                }
                //tinkers construct
                if (OreInAMillionConfig.isTinkersIngotsEnabled){
                    //ardite
                    if (OreInAMillionConfig.isArditeEnabled){
                        registerRender(ingotArdite);
                        registerRender(nuggetArdite);
                        registerRender(dustArdite);
                    }
                    //knightslime
                    if (OreInAMillionConfig.isKnightSlimeEnabled){
                        registerRender(ingotKnightSlime);
                        registerRender(nuggetKnightSlime);
                        registerRender(dustKnightSlime);
                    }
                    //pigiron
                    if (OreInAMillionConfig.isPigIronEnabled) {
                        registerRender(ingotPigIron);
                        registerRender(nuggetPigIron);
                        registerRender(dustPigIron);
                    }
                    //manyullyn
                    if (OreInAMillionConfig.isManyullynEnabled){
                        registerRender(ingotManyullyn);
                        registerRender(nuggetManyullyn);
                        registerRender(dustManyullyn);
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
                }
                //peridot
                if (OreInAMillionConfig.isPeridotEnabled){
                    registerRender(gemPeridot);
                    registerRender(nuggetPeridot);
                    registerRender(dustPeridot);
                }
                //ruby
                if (OreInAMillionConfig.isRubyEnabled){
                    registerRender(gemRuby);
                    registerRender(nuggetRuby);
                    registerRender(dustRuby);
                }
                //sapphire
                if (OreInAMillionConfig.isSapphireEnabled){
                    registerRender(gemSapphire);
                    registerRender(nuggetSapphire);
                    registerRender(dustSapphire);
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
                }
                //sulphur
                if (OreInAMillionConfig.isSulphurEnabled){
                    registerRender(elementSulfur);
                    registerRender(nuggetSulfur);
                    registerRender(dustSulfur);
                }
            }
            if (OreInAMillionConfig.isVanillaEnabled) {
                //diamond
                if (OreInAMillionConfig.isDiamondEnabled) {
                    registerRender(nuggetDiamond);
                    registerRender(dustDiamond);
                }
                //emerald
                if (OreInAMillionConfig.isEmeraldEnabled) {
                    registerRender(nuggetEmerald);
                    registerRender(dustEmerald);
                }
                //coal
                if (OreInAMillionConfig.isCoalEnabled) {
                    registerRender(nuggetCoal);
                    registerRender(dustCoal);
                }
                //charcoal
                if (OreInAMillionConfig.isCharcoalEnabled) {
                    registerRender(nuggetCharcoal);
                    registerRender(dustCharcoal);
                }
            }
            if (OreInAMillionConfig.isSillyStuffEnabled) {
                registerRender(tinCan);
                registerRender(foodSoupcan);
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
        if (OreInAMillionConfig.isMineralsEnabled) {
            if (OreInAMillionConfig.isIngotsEnabled) {
                //aluminum
                if (OreInAMillionConfig.isAluminumEnabled) {
                    OreDictionary.registerOre("ingotAluminum", ModItems.ingotAluminum);
                    OreDictionary.registerOre("nuggetAluminum", ModItems.nuggetAluminum);
                    OreDictionary.registerOre("dustAluminum", ModItems.dustAluminum);
                }
                //chrome
                if (OreInAMillionConfig.isChromeEnabled) {
                    OreDictionary.registerOre("ingotChrome", ModItems.ingotChrome);
                    OreDictionary.registerOre("nuggetChrome", ModItems.nuggetChrome);
                    OreDictionary.registerOre("dustChrome", ModItems.dustChrome);
                }
                //cobalt
                if (OreInAMillionConfig.isCobaltEnabled) {
                    OreDictionary.registerOre("ingotCobalt", ModItems.ingotCobalt);
                    OreDictionary.registerOre("nuggetCobalt", ModItems.nuggetCobalt);
                    OreDictionary.registerOre("dustCobalt", ModItems.dustCobalt);
                }
                //copper
                if (OreInAMillionConfig.isCopperEnabled) {
                    OreDictionary.registerOre("ingotCopper", ModItems.ingotCopper);
                    OreDictionary.registerOre("nuggetCopper", ModItems.nuggetCopper);
                    OreDictionary.registerOre("dustCopper", ModItems.dustCopper);
                }
                //ender
                if (OreInAMillionConfig.isEnderEnabled){
                    OreDictionary.registerOre("ingotEnder", ModItems.ingotEnder);
                    OreDictionary.registerOre("nuggetEnder", ModItems.nuggetEnder);
                    OreDictionary.registerOre("dustEnder", ModItems.dustEnder);
                }
                //iridium
                if (OreInAMillionConfig.isIridiumEnabled) {
                    OreDictionary.registerOre("ingotIridium", ModItems.ingotIridium);
                    OreDictionary.registerOre("nuggetIridium", ModItems.nuggetIridium);
                    OreDictionary.registerOre("dustIridium", ModItems.dustIridium);
                }
                //lead
                if (OreInAMillionConfig.isLeadEnabled) {
                    OreDictionary.registerOre("ingotLead", ModItems.ingotLead);
                    OreDictionary.registerOre("nuggetLead", ModItems.nuggetLead);
                    OreDictionary.registerOre("dustLead", ModItems.dustLead);
                }
                //mithril
                if (OreInAMillionConfig.isMithrilEnabled) {
                    OreDictionary.registerOre("ingotMithril", ModItems.ingotMithril);
                    OreDictionary.registerOre("nuggetMithril", ModItems.nuggetMithril);
                    OreDictionary.registerOre("dustMithril", ModItems.dustMithril);
                }
                //nickel
                if (OreInAMillionConfig.isNickelEnabled) {
                    OreDictionary.registerOre("ingotNickel", ModItems.ingotNickel);
                    OreDictionary.registerOre("nuggetNickel", ModItems.nuggetNickel);
                    OreDictionary.registerOre("dustNickel", ModItems.dustNickel);
                }
                //osmium
                if (OreInAMillionConfig.isOsmiumEnabled) {
                    OreDictionary.registerOre("ingotOsmium", ModItems.ingotOsmium);
                    OreDictionary.registerOre("nuggetOsmium", ModItems.nuggetOsmium);
                    OreDictionary.registerOre("dustOsmium", ModItems.dustOsmium);
                }
                //platinum
                if (OreInAMillionConfig.isPlatinumEnabled) {
                    OreDictionary.registerOre("ingotPlatinum", ModItems.ingotPlatinum);
                    OreDictionary.registerOre("nuggetPlatinum", ModItems.nuggetPlatinum);
                    OreDictionary.registerOre("dustPlatinum", ModItems.dustPlatinum);
                }
                //silver
                if (OreInAMillionConfig.isSilverEnabled) {
                    OreDictionary.registerOre("ingotSilver", ModItems.ingotSilver);
                    OreDictionary.registerOre("nuggetSilver", ModItems.nuggetSilver);
                    OreDictionary.registerOre("dustSilver", ModItems.dustSilver);
                }
                //tin
                if (OreInAMillionConfig.isTinEnabled) {
                    OreDictionary.registerOre("ingotTin", ModItems.ingotTin);
                    OreDictionary.registerOre("nuggetTin", ModItems.nuggetTin);
                    OreDictionary.registerOre("dustTin", ModItems.dustTin);
                }
                //titanium
                if (OreInAMillionConfig.isTitaniumEnabled) {
                    OreDictionary.registerOre("ingotTitanium", ModItems.ingotTitanium);
                    OreDictionary.registerOre("nuggetTitanium", ModItems.nuggetTitanium);
                    OreDictionary.registerOre("dustTitanium", ModItems.dustTitanium);
                }
                //tungsten
                if (OreInAMillionConfig.isTungstenEnabled) {
                    OreDictionary.registerOre("ingotTungsten", ModItems.ingotTungsten);
                    OreDictionary.registerOre("nuggetTungsten", ModItems.nuggetTungsten);
                    OreDictionary.registerOre("dustTungsten", ModItems.dustTungsten);
                }
                //uranium
                if (OreInAMillionConfig.isUraniumEnabled) {
                    OreDictionary.registerOre("ingotUranium", ModItems.ingotUranium);
                    OreDictionary.registerOre("nuggetUranium", ModItems.nuggetUranium);
                    OreDictionary.registerOre("dustUranium", ModItems.dustUranium);
                }
                //zinc
                if (OreInAMillionConfig.isZincEnabled) {
                    OreDictionary.registerOre("ingotZinc", ModItems.ingotZinc);
                    OreDictionary.registerOre("nuggetZinc", ModItems.nuggetZinc);
                    OreDictionary.registerOre("dustZinc", ModItems.dustZinc);
                }
                //brass
                if (OreInAMillionConfig.isBrassEnabled) {
                    OreDictionary.registerOre("ingotBrass", ModItems.ingotBrass);
                    OreDictionary.registerOre("nuggetBrass", ModItems.nuggetBrass);
                    OreDictionary.registerOre("dustBrass", ModItems.dustBrass);
                }
                //bronze
                if (OreInAMillionConfig.isBronzeEnabled) {
                    OreDictionary.registerOre("ingotBronze", ModItems.ingotBronze);
                    OreDictionary.registerOre("nuggetBronze", ModItems.nuggetBronze);
                    OreDictionary.registerOre("dustBronze", ModItems.dustBronze);
                }
                //electrum
                if (OreInAMillionConfig.isElectrumEnabled) {
                    OreDictionary.registerOre("ingotElectrum", ModItems.ingotElectrum);
                    OreDictionary.registerOre("nuggetElectrum", ModItems.nuggetElectrum);
                    OreDictionary.registerOre("dustElectrum", ModItems.dustElectrum);
                }
                //fairy
                if (OreInAMillionConfig.isFairyEnabled){
                    OreDictionary.registerOre("ingotFairy", ModItems.ingotFairy);
                    OreDictionary.registerOre("nuggetFairy", ModItems.nuggetFairy);
                    OreDictionary.registerOre("dustFairy", ModItems.dustFairy);
                }
                //invar
                if (OreInAMillionConfig.isInvarEnabled) {
                    OreDictionary.registerOre("ingotInvar", ModItems.ingotInvar);
                    OreDictionary.registerOre("nuggetInvar", ModItems.nuggetInvar);
                    OreDictionary.registerOre("dustInvar", ModItems.dustInvar);
                }
                //steel
                if (OreInAMillionConfig.isSteelEnabled) {
                    OreDictionary.registerOre("ingotSteel", ModItems.ingotSteel);
                    OreDictionary.registerOre("nuggetSteel", ModItems.nuggetSteel);
                    OreDictionary.registerOre("dustSteel", ModItems.dustSteel);
                }
                //thermal series
                if (OreInAMillionConfig.isThermalIngotsEnabled){
                    //constantan
                    if (OreInAMillionConfig.isConstantanEnabled){
                        OreDictionary.registerOre("ingotConstantan", ModItems.ingotConstantan);
                        OreDictionary.registerOre("nuggetConstantan", ModItems.nuggetConstantan);
                        OreDictionary.registerOre("dustConstantan", ModItems.dustConstantan);
                    }
                    //enderium
                    if (OreInAMillionConfig.isEnderiumEnabled){
                        OreDictionary.registerOre("ingotEnderium", ModItems.ingotEnderium);
                        OreDictionary.registerOre("nuggetEnderium", ModItems.nuggetEnderium);
                        OreDictionary.registerOre("dustEnderium", ModItems.dustEnderium);
                    }
                    //lumium
                    if (OreInAMillionConfig.isLumiumEnabled){
                        OreDictionary.registerOre("ingotLumium", ModItems.ingotLumium);
                        OreDictionary.registerOre("nuggetLumium", ModItems.nuggetLumium);
                        OreDictionary.registerOre("dustLumium", ModItems.dustLumium);
                    }
                    //signalum
                    if (OreInAMillionConfig.isSignalumEnabled){
                        OreDictionary.registerOre("ingotSignalum", ModItems.ingotSignalum);
                        OreDictionary.registerOre("nuggetSignalum", ModItems.nuggetSignalum);
                        OreDictionary.registerOre("dustSignalum", ModItems.dustSignalum);
                    }
                }
                //tinkers construct
                if (OreInAMillionConfig.isTinkersIngotsEnabled){
                    //ardite
                    if (OreInAMillionConfig.isArditeEnabled){
                        OreDictionary.registerOre("ingotArdite", ModItems.ingotArdite);
                        OreDictionary.registerOre("nuggetArdite", ModItems.nuggetArdite);
                        OreDictionary.registerOre("dustArdite", ModItems.dustArdite);
                    }
                    //knightslime
                    if (OreInAMillionConfig.isKnightSlimeEnabled){
                        OreDictionary.registerOre("ingotKnightslime", ModItems.ingotKnightSlime);
                        OreDictionary.registerOre("nuggetKnightslime", ModItems.nuggetKnightSlime);
                        OreDictionary.registerOre("dustKnightslime", ModItems.dustKnightSlime);
                    }
                    //pigiron
                    if (OreInAMillionConfig.isPigIronEnabled) {
                        OreDictionary.registerOre("ingotPigiron", ModItems.ingotPigIron);
                        OreDictionary.registerOre("nuggetEnder", ModItems.nuggetPigIron);
                        OreDictionary.registerOre("dustPigiron", ModItems.dustPigIron);
                    }
                    //manyullyn
                    if (OreInAMillionConfig.isManyullynEnabled){
                        OreDictionary.registerOre("ingotManyullyn", ModItems.ingotManyullyn);
                        OreDictionary.registerOre("nuggetManyullyn", ModItems.nuggetManyullyn);
                        OreDictionary.registerOre("dustManyullyn", ModItems.dustManyullyn);
                    }
                }
            }
            //gems
            if (OreInAMillionConfig.isGemsEnabled){
                //amethyst
                if (OreInAMillionConfig.isAmethystEnabled){
                    OreDictionary.registerOre("gemAmethyst", ModItems.gemAmethyst);
                    OreDictionary.registerOre("nuggetAmethyst", ModItems.nuggetAmethyst);
                    OreDictionary.registerOre("dustAmethyst", ModItems.dustAmethyst);
                }
                //peridot
                if (OreInAMillionConfig.isPeridotEnabled){
                    OreDictionary.registerOre("gemPeridot", ModItems.gemPeridot);
                    OreDictionary.registerOre("nuggetPeridot", ModItems.nuggetPeridot);
                    OreDictionary.registerOre("dustPeridot", ModItems.dustPeridot);
                }
                //ruby
                if (OreInAMillionConfig.isRubyEnabled){
                    OreDictionary.registerOre("gemRuby", ModItems.gemRuby);
                    OreDictionary.registerOre("nuggetRuby", ModItems.nuggetRuby);
                    OreDictionary.registerOre("dustRuby", ModItems.dustRuby);
                }
                //sapphire
                if (OreInAMillionConfig.isSapphireEnabled){
                    OreDictionary.registerOre("gemSapphire", ModItems.gemSapphire);
                    OreDictionary.registerOre("nuggetSapphire", ModItems.nuggetSapphire);
                    OreDictionary.registerOre("dustSapphire", ModItems.dustSapphire);
                }
            }
            //elements
            if (OreInAMillionConfig.isElementsEnabled){
                //carbon
                if (OreInAMillionConfig.isCarbonEnabled){
                    OreDictionary.registerOre("carbon", ModItems.elementCarbon);
                    OreDictionary.registerOre("nuggetCarbon", ModItems.nuggetCarbon);
                    OreDictionary.registerOre("dustCarbon", ModItems.dustCarbon);
                }
                //cinnabar
                if (OreInAMillionConfig.isCinnabarEnabled){
                    OreDictionary.registerOre("cinnabar", ModItems.elementCinnabar);
                    OreDictionary.registerOre("nuggetCinnabar", ModItems.nuggetCinnabar);
                    OreDictionary.registerOre("dustCinnabar", ModItems.dustCinnabar);
                }
                //silicon
                if (OreInAMillionConfig.isSiliconEnabled) {
                    OreDictionary.registerOre("silicon", ModItems.elementSilicon);
                    OreDictionary.registerOre("nuggetSilicon", ModItems.nuggetSilicon);
                    OreDictionary.registerOre("dustSilicon", ModItems.dustSilicon);
                }
                //sulphur
                if (OreInAMillionConfig.isSulphurEnabled){
                    OreDictionary.registerOre("sulfur", ModItems.elementSulfur);
                    OreDictionary.registerOre("nuggetSulfur", ModItems.nuggetSulfur);
                    OreDictionary.registerOre("dustSulfur", ModItems.dustSulfur);
                }
            }
            //vanilla additions
            if (OreInAMillionConfig.isVanillaEnabled){
                //charcoal
                if (OreInAMillionConfig.isCharcoalEnabled) {
                    OreDictionary.registerOre("nuggetCharcoal", ModItems.nuggetCharcoal);
                    OreDictionary.registerOre("dustCharcoal", ModItems.dustCharcoal);
                }
                //coal
                if (OreInAMillionConfig.isCoalEnabled) {
                    OreDictionary.registerOre("nuggetCoal", ModItems.nuggetCoal);
                    OreDictionary.registerOre("dustCoal", ModItems.dustCoal);
                }
                //diamond
                if (OreInAMillionConfig.isDiamondEnabled) {
                    OreDictionary.registerOre("nuggetDiamond", ModItems.nuggetDiamond);
                    OreDictionary.registerOre("dustDiamond", ModItems.dustDiamond);
                }
                //emerald
                if (OreInAMillionConfig.isEmeraldEnabled) {
                    OreDictionary.registerOre("nuggetEmerald", ModItems.nuggetEmerald);
                    OreDictionary.registerOre("dustEmerald", ModItems.dustEmerald);
                }
                //quartz
                if (OreInAMillionConfig.isQuartzEnabled){
                    OreDictionary.registerOre("nuggetQuartz", ModItems.nuggetQuartz);
                    OreDictionary.registerOre("dustQuartz", ModItems.dustQuartz);
                }
            }
            if (OreInAMillionConfig.isSillyStuffEnabled){
                OreDictionary.registerOre("tinCan", ModItems.tinCan);
                OreDictionary.registerOre("foodSoupcan", ModItems.foodSoupcan);
            }
        }
    }
}