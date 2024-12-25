package com.blueberrysoda.oreinamillion.init;

import com.blueberrysoda.oreinamillion.config.OreInAMillionConfig;
import com.blueberrysoda.oreinamillion.items.materials.MaterialTool;
import com.blueberrysoda.oreinamillion.items.tools.*;
import com.blueberrysoda.oreinamillion.items.tools.coaltools.*;
import com.blueberrysoda.oreinamillion.items.tools.foodtools.*;
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
public class ModTools {

//    public static ItemToolSword sword;
//    public static ItemToolPickaxe pickaxe;
//    public static ItemToolAxe axe;
//    public static ItemToolShovel shovel;
//    public static ItemToolHoe hoe;

    //aluminum
    public static ItemToolSword swordAluminum;
    public static ItemToolPickaxe pickaxeAluminum;
    public static ItemToolAxe axeAluminum;
    public static ItemToolShovel shovelAluminum;
    public static ItemToolHoe hoeAluminum;
    //ardite
    public static ItemToolSword swordArdite;
    public static ItemToolPickaxe pickaxeArdite;
    public static ItemToolAxe axeArdite;
    public static ItemToolShovel shovelArdite;
    public static ItemToolHoe hoeArdite;
    //chrome
    public static ItemToolSword swordChrome;
    public static ItemToolPickaxe pickaxeChrome;
    public static ItemToolAxe axeChrome;
    public static ItemToolShovel shovelChrome;
    public static ItemToolHoe hoeChrome;
    //cobalt
    public static ItemToolSword swordCobalt;
    public static ItemToolPickaxe pickaxeCobalt;
    public static ItemToolAxe axeCobalt;
    public static ItemToolShovel shovelCobalt;
    public static ItemToolHoe hoeCobalt;
    //copper
    public static ItemToolSword swordCopper;
    public static ItemToolPickaxe pickaxeCopper;
    public static ItemToolAxe axeCopper;
    public static ItemToolShovel shovelCopper;
    public static ItemToolHoe hoeCopper;
    //ender
    public static ItemToolSword swordEnder;
    public static ItemToolPickaxe pickaxeEnder;
    public static ItemToolAxe axeEnder;
    public static ItemToolShovel shovelEnder;
    public static ItemToolHoe hoeEnder;
    //iridium
    public static ItemToolSword swordIridium;
    public static ItemToolPickaxe pickaxeIridium;
    public static ItemToolAxe axeIridium;
    public static ItemToolShovel shovelIridium;
    public static ItemToolHoe hoeIridium;
    //lead
    public static ItemToolSword swordLead;
    public static ItemToolPickaxe pickaxeLead;
    public static ItemToolAxe axeLead;
    public static ItemToolShovel shovelLead;
    public static ItemToolHoe hoeLead;
    //mithril
    public static ItemToolSword swordMithril;
    public static ItemToolPickaxe pickaxeMithril;
    public static ItemToolAxe axeMithril;
    public static ItemToolShovel shovelMithril;
    public static ItemToolHoe hoeMithril;
    //nickel
    public static ItemToolSword swordNickel;
    public static ItemToolPickaxe pickaxeNickel;
    public static ItemToolAxe axeNickel;
    public static ItemToolShovel shovelNickel;
    public static ItemToolHoe hoeNickel;
    //osmium
    public static ItemToolSword swordOsmium;
    public static ItemToolPickaxe pickaxeOsmium;
    public static ItemToolAxe axeOsmium;
    public static ItemToolShovel shovelOsmium;
    public static ItemToolHoe hoeOsmium;
    //platinum
    public static ItemToolSword swordPlatinum;
    public static ItemToolPickaxe pickaxePlatinum;
    public static ItemToolAxe axePlatinum;
    public static ItemToolShovel shovelPlatinum;
    public static ItemToolHoe hoePlatinum;
    //silver
    public static ItemToolSword swordSilver;
    public static ItemToolPickaxe pickaxeSilver;
    public static ItemToolAxe axeSilver;
    public static ItemToolShovel shovelSilver;
    public static ItemToolHoe hoeSilver;
    //tin
    public static ItemToolSword swordTin;
    public static ItemToolPickaxe pickaxeTin;
    public static ItemToolAxe axeTin;
    public static ItemToolShovel shovelTin;
    public static ItemToolHoe hoeTin;
    //titanium
    public static ItemToolSword swordTitanium;
    public static ItemToolPickaxe pickaxeTitanium;
    public static ItemToolAxe axeTitanium;
    public static ItemToolShovel shovelTitanium;
    public static ItemToolHoe hoeTitanium;
    //tungsten
    public static ItemToolSword swordTungsten;
    public static ItemToolPickaxe pickaxeTungsten;
    public static ItemToolAxe axeTungsten;
    public static ItemToolShovel shovelTungsten;
    public static ItemToolHoe hoeTungsten;
    //uranium
    public static ItemToolSword swordUranium;
    public static ItemToolPickaxe pickaxeUranium;
    public static ItemToolAxe axeUranium;
    public static ItemToolShovel shovelUranium;
    public static ItemToolHoe hoeUranium;
    //zinc
    public static ItemToolSword swordZinc;
    public static ItemToolPickaxe pickaxeZinc;
    public static ItemToolAxe axeZinc;
    public static ItemToolShovel shovelZinc;
    public static ItemToolHoe hoeZinc;
    //brass
    public static ItemToolSword swordBrass;
    public static ItemToolPickaxe pickaxeBrass;
    public static ItemToolAxe axeBrass;
    public static ItemToolShovel shovelBrass;
    public static ItemToolHoe hoeBrass;
    //bronze
    public static ItemToolSword swordBronze;
    public static ItemToolPickaxe pickaxeBronze;
    public static ItemToolAxe axeBronze;
    public static ItemToolShovel shovelBronze;
    public static ItemToolHoe hoeBronze;
    //constantan
    public static ItemToolSword swordConstantan;
    public static ItemToolPickaxe pickaxeConstantan;
    public static ItemToolAxe axeConstantan;
    public static ItemToolShovel shovelConstantan;
    public static ItemToolHoe hoeConstantan;
    //electrum
    public static ItemToolSword swordElectrum;
    public static ItemToolPickaxe pickaxeElectrum;
    public static ItemToolAxe axeElectrum;
    public static ItemToolShovel shovelElectrum;
    public static ItemToolHoe hoeElectrum;
    //enderium
    public static ItemToolSword swordEnderium;
    public static ItemToolPickaxe pickaxeEnderium;
    public static ItemToolAxe axeEnderium;
    public static ItemToolShovel shovelEnderium;
    public static ItemToolHoe hoeEnderium;
    //fairy
    public static ItemToolSword swordFairy;
    public static ItemToolPickaxe pickaxeFairy;
    public static ItemToolAxe axeFairy;
    public static ItemToolShovel shovelFairy;
    public static ItemToolHoe hoeFairy;
    //invar
    public static ItemToolSword swordInvar;
    public static ItemToolPickaxe pickaxeInvar;
    public static ItemToolAxe axeInvar;
    public static ItemToolShovel shovelInvar;
    public static ItemToolHoe hoeInvar;
    //knightslime
    public static ItemToolSword swordKnightSlime;
    public static ItemToolPickaxe pickaxeKnightSlime;
    public static ItemToolAxe axeKnightSlime;
    public static ItemToolShovel shovelKnightSlime;
    public static ItemToolHoe hoeKnightSlime;
    //lumium
    public static ItemToolSword swordLumium;
    public static ItemToolPickaxe pickaxeLumium;
    public static ItemToolAxe axeLumium;
    public static ItemToolShovel shovelLumium;
    public static ItemToolHoe hoeLumium;
    //manyullyn
    public static ItemToolSword swordManyullyn;
    public static ItemToolPickaxe pickaxeManyullyn;
    public static ItemToolAxe axeManyullyn;
    public static ItemToolShovel shovelManyullyn;
    public static ItemToolHoe hoeManyullyn;
    //pigiron
    public static ItemToolFoodSword swordPigIron;
    public static ItemToolFoodPickaxe pickaxePigIron;
    public static ItemToolFoodAxe axePigIron;
    public static ItemToolFoodShovel shovelPigIron;
    public static ItemToolFoodHoe hoePigIron;
    //signalum
    public static ItemToolSword swordSignalum;
    public static ItemToolPickaxe pickaxeSignalum;
    public static ItemToolAxe axeSignalum;
    public static ItemToolShovel shovelSignalum;
    public static ItemToolHoe hoeSignalum;
    //steel
    public static ItemToolSword swordSteel;
    public static ItemToolPickaxe pickaxeSteel;
    public static ItemToolAxe axeSteel;
    public static ItemToolShovel shovelSteel;
    public static ItemToolHoe hoeSteel;
    //amethyst
    public static ItemToolSword swordAmethyst;
    public static ItemToolPickaxe pickaxeAmethyst;
    public static ItemToolAxe axeAmethyst;
    public static ItemToolShovel shovelAmethyst;
    public static ItemToolHoe hoeAmethyst;
    //peridot
    public static ItemToolSword swordPeridot;
    public static ItemToolPickaxe pickaxePeridot;
    public static ItemToolAxe axePeridot;
    public static ItemToolShovel shovelPeridot;
    public static ItemToolHoe hoePeridot;
    //ruby
    public static ItemToolSword swordRuby;
    public static ItemToolPickaxe pickaxeRuby;
    public static ItemToolAxe axeRuby;
    public static ItemToolShovel shovelRuby;
    public static ItemToolHoe hoeRuby;
    //sapphire
    public static ItemToolSword swordSapphire;
    public static ItemToolPickaxe pickaxeSapphire;
    public static ItemToolAxe axeSapphire;
    public static ItemToolShovel shovelSapphire;
    public static ItemToolHoe hoeSapphire;
    //charcoal
    public static ItemToolCoalSword swordCharcoal;
    public static ItemToolCoalPickaxe pickaxeCharcoal;
    public static ItemToolCoalAxe axeCharcoal;
    public static ItemToolCoalShovel shovelCharcoal;
    public static ItemToolCoalHoe hoeCharcoal;
    //coal
    public static ItemToolCoalSword swordCoal;
    public static ItemToolCoalPickaxe pickaxeCoal;
    public static ItemToolCoalAxe axeCoal;
    public static ItemToolCoalShovel shovelCoal;
    public static ItemToolCoalHoe hoeCoal;
    //emerald
    public static ItemToolSword swordEmerald;
    public static ItemToolPickaxe pickaxeEmerald;
    public static ItemToolAxe axeEmerald;
    public static ItemToolShovel shovelEmerald;
    public static ItemToolHoe hoeEmerald;
    //quartz
    public static ItemToolSword swordQuartz;
    public static ItemToolPickaxe pickaxeQuartz;
    public static ItemToolAxe axeQuartz;
    public static ItemToolShovel shovelQuartz;
    public static ItemToolHoe hoeQuartz;

    public static void init() {
        if (OreInAMillionConfig.isMineralsEnabled) {
            if (OreInAMillionConfig.isToolsEnabled) {
                if (OreInAMillionConfig.isIngotsEnabled) {
                    //aluminum
                    if (OreInAMillionConfig.isAluminumEnabled) {
                        swordAluminum = new ItemToolSword("aluminum_sword", MaterialTool.toolAluminum);
                        pickaxeAluminum = new ItemToolPickaxe("aluminum_pickaxe", MaterialTool.toolAluminum);
                        axeAluminum = new ItemToolAxe("aluminum_axe", MaterialTool.toolAluminum);
                        shovelAluminum = new ItemToolShovel("aluminum_shovel", MaterialTool.toolAluminum);
                        hoeAluminum = new ItemToolHoe("aluminum_hoe", MaterialTool.toolAluminum);
                    }
                    //chrome
                    if (OreInAMillionConfig.isChromeEnabled) {
                        swordChrome = new ItemToolSword("chrome_sword", MaterialTool.toolChrome);
                        pickaxeChrome = new ItemToolPickaxe("chrome_pickaxe", MaterialTool.toolChrome);
                        axeChrome = new ItemToolAxe("chrome_axe", MaterialTool.toolChrome);
                        shovelChrome = new ItemToolShovel("chrome_shovel", MaterialTool.toolChrome);
                        hoeChrome = new ItemToolHoe("chrome_hoe", MaterialTool.toolChrome);
                    }
                    //cobalt
                    if (OreInAMillionConfig.isCobaltEnabled) {
                        swordCobalt= new ItemToolSword("cobalt_sword", MaterialTool.toolCobalt);
                        pickaxeCobalt = new ItemToolPickaxe("cobalt_pickaxe", MaterialTool.toolCobalt);
                        axeCobalt = new ItemToolAxe("cobalt_axe", MaterialTool.toolCobalt);
                        shovelCobalt = new ItemToolShovel("cobalt_shovel", MaterialTool.toolCobalt);
                        hoeCobalt = new ItemToolHoe("cobalt_hoe", MaterialTool.toolCobalt);
                    }
                    //copper
                    if (OreInAMillionConfig.isCopperEnabled) {
                        swordCopper = new ItemToolSword("copper_sword", MaterialTool.toolCopper);
                        pickaxeCopper = new ItemToolPickaxe("copper_pickaxe", MaterialTool.toolCopper);
                        axeCopper = new ItemToolAxe("copper_axe", MaterialTool.toolCopper);
                        shovelCopper = new ItemToolShovel("copper_shovel", MaterialTool.toolCopper);
                        hoeCopper = new ItemToolHoe("copper_hoe", MaterialTool.toolCopper);
                    }
                    //ender
                    if (OreInAMillionConfig.isEnderEnabled) {
                        swordEnder = new ItemToolSword("ender_sword", MaterialTool.toolEnder);
                        pickaxeEnder = new ItemToolPickaxe("ender_pickaxe", MaterialTool.toolEnder);
                        axeEnder = new ItemToolAxe("ender_axe", MaterialTool.toolEnder);
                        shovelEnder = new ItemToolShovel("ender_shovel", MaterialTool.toolEnder);
                        hoeEnder = new ItemToolHoe("ender_hoe", MaterialTool.toolEnder);
                    }
                    //iridium
                    if (OreInAMillionConfig.isIridiumEnabled) {
                        swordIridium = new ItemToolSword("iridium_sword", MaterialTool.toolIridium);
                        pickaxeIridium = new ItemToolPickaxe("iridium_pickaxe", MaterialTool.toolIridium);
                        axeIridium = new ItemToolAxe("iridium_axe", MaterialTool.toolIridium);
                        shovelIridium = new ItemToolShovel("iridium_shovel", MaterialTool.toolIridium);
                        hoeIridium = new ItemToolHoe("iridium_hoe", MaterialTool.toolIridium);
                    }
                    //lead
                    if (OreInAMillionConfig.isLeadEnabled) {
                        swordLead = new ItemToolSword("lead_sword", MaterialTool.toolLead);
                        pickaxeLead = new ItemToolPickaxe("lead_pickaxe", MaterialTool.toolLead);
                        axeLead = new ItemToolAxe("lead_axe", MaterialTool.toolLead);
                        shovelLead = new ItemToolShovel("lead_shovel", MaterialTool.toolLead);
                        hoeLead = new ItemToolHoe("lead_hoe", MaterialTool.toolLead);
                    }
                    //mithril
                    if (OreInAMillionConfig.isMithrilEnabled) {
                        swordMithril = new ItemToolSword("mithril_sword", MaterialTool.toolMithril);
                        pickaxeMithril = new ItemToolPickaxe("mithril_pickaxe", MaterialTool.toolMithril);
                        axeMithril = new ItemToolAxe("mithril_axe", MaterialTool.toolMithril);
                        shovelMithril = new ItemToolShovel("mithril_shovel", MaterialTool.toolMithril);
                        hoeMithril = new ItemToolHoe("mithril_hoe", MaterialTool.toolMithril);
                    }
                    //nickel
                    if (OreInAMillionConfig.isNickelEnabled) {
                        swordNickel = new ItemToolSword("nickel_sword", MaterialTool.toolNickel);
                        pickaxeNickel = new ItemToolPickaxe("nickel_pickaxe", MaterialTool.toolNickel);
                        axeNickel = new ItemToolAxe("nickel_axe", MaterialTool.toolNickel);
                        shovelNickel = new ItemToolShovel("nickel_shovel", MaterialTool.toolNickel);
                        hoeNickel= new ItemToolHoe("nickel_hoe", MaterialTool.toolNickel);
                    }
                    //osmium
                    if (OreInAMillionConfig.isOsmiumEnabled) {
                        swordOsmium = new ItemToolSword("osmium_sword", MaterialTool.toolOsmium);
                        pickaxeOsmium = new ItemToolPickaxe("osmium_pickaxe", MaterialTool.toolOsmium);
                        axeOsmium = new ItemToolAxe("osmium_axe", MaterialTool.toolOsmium);
                        shovelOsmium = new ItemToolShovel("osmium_shovel", MaterialTool.toolOsmium);
                        hoeOsmium = new ItemToolHoe("osmium_hoe", MaterialTool.toolOsmium);
                    }
                    //platinum
                    if (OreInAMillionConfig.isPlatinumEnabled) {
                        swordPlatinum = new ItemToolSword("platinum_sword", MaterialTool.toolPlatinum);
                        pickaxePlatinum = new ItemToolPickaxe("platinum_pickaxe", MaterialTool.toolPlatinum);
                        axePlatinum = new ItemToolAxe("platinum_axe", MaterialTool.toolPlatinum);
                        shovelPlatinum = new ItemToolShovel("platinum_shovel", MaterialTool.toolPlatinum);
                        hoePlatinum = new ItemToolHoe("platinum_hoe", MaterialTool.toolPlatinum);
                    }
                    //silver
                    if (OreInAMillionConfig.isSilverEnabled) {
                        swordSilver = new ItemToolSword("silver_sword", MaterialTool.toolSilver);
                        pickaxeSilver = new ItemToolPickaxe("silver_pickaxe", MaterialTool.toolSilver);
                        axeSilver = new ItemToolAxe("silver_axe", MaterialTool.toolSilver);
                        shovelSilver = new ItemToolShovel("silver_shovel", MaterialTool.toolSilver);
                        hoeSilver = new ItemToolHoe("silver_hoe", MaterialTool.toolSilver);
                    }
                    //tin
                    if (OreInAMillionConfig.isTinEnabled) {
                        swordTin = new ItemToolSword("tin_sword", MaterialTool.toolTin);
                        pickaxeTin = new ItemToolPickaxe("tin_pickaxe", MaterialTool.toolTin);
                        axeTin = new ItemToolAxe("tin_axe", MaterialTool.toolTin);
                        shovelTin = new ItemToolShovel("tin_shovel", MaterialTool.toolTin);
                        hoeTin = new ItemToolHoe("tin_hoe", MaterialTool.toolTin);
                    }
                    //titanium
                    if (OreInAMillionConfig.isTitaniumEnabled) {
                        swordTitanium = new ItemToolSword("titanium_sword", MaterialTool.toolTitanium);
                        pickaxeTitanium = new ItemToolPickaxe("titanium_pickaxe", MaterialTool.toolTitanium);
                        axeTitanium = new ItemToolAxe("titanium_axe", MaterialTool.toolTitanium);
                        shovelTitanium = new ItemToolShovel("titanium_shovel", MaterialTool.toolTitanium);
                        hoeTitanium = new ItemToolHoe("titanium_hoe", MaterialTool.toolTitanium);
                    }
                    //tungsten
                    if (OreInAMillionConfig.isTungstenEnabled) {
                        swordTungsten = new ItemToolSword("tungsten_sword", MaterialTool.toolTungsten);
                        pickaxeTungsten = new ItemToolPickaxe("tungsten_pickaxe", MaterialTool.toolTungsten);
                        axeTungsten = new ItemToolAxe("tungsten_axe", MaterialTool.toolTungsten);
                        shovelTungsten = new ItemToolShovel("tungsten_shovel", MaterialTool.toolTungsten);
                        hoeTungsten = new ItemToolHoe("tungsten_hoe", MaterialTool.toolTungsten);
                    }
                    //uranium
                    if (OreInAMillionConfig.isUraniumEnabled) {
                        swordUranium = new ItemToolSword("uranium_sword", MaterialTool.toolUranium);
                        pickaxeUranium = new ItemToolPickaxe("uranium_pickaxe", MaterialTool.toolUranium);
                        axeUranium = new ItemToolAxe("uranium_axe", MaterialTool.toolUranium);
                        shovelUranium = new ItemToolShovel("uranium_shovel", MaterialTool.toolUranium);
                        hoeUranium = new ItemToolHoe("uranium_hoe", MaterialTool.toolUranium);
                    }
                    //zinc
                    if (OreInAMillionConfig.isZincEnabled) {
                        swordZinc = new ItemToolSword("zinc_sword", MaterialTool.toolZinc);
                        pickaxeZinc = new ItemToolPickaxe("zinc_pickaxe", MaterialTool.toolZinc);
                        axeZinc = new ItemToolAxe("zinc_axe", MaterialTool.toolZinc);
                        shovelZinc = new ItemToolShovel("zinc_shovel", MaterialTool.toolZinc);
                        hoeZinc = new ItemToolHoe("zinc_hoe", MaterialTool.toolZinc);
                    }
                    //brass
                    if (OreInAMillionConfig.isBrassEnabled) {
                        swordBrass = new ItemToolSword("brass_sword", MaterialTool.toolBrass);
                        pickaxeBrass = new ItemToolPickaxe("brass_pickaxe", MaterialTool.toolBrass);
                        axeBrass = new ItemToolAxe("brass_axe", MaterialTool.toolBrass);
                        shovelBrass = new ItemToolShovel("brass_shovel", MaterialTool.toolBrass);
                        hoeBrass = new ItemToolHoe("brass_hoe", MaterialTool.toolBrass);
                    }
                    //bronze
                    if (OreInAMillionConfig.isBronzeEnabled) {
                        swordBronze = new ItemToolSword("bronze_sword", MaterialTool.toolBronze);
                        pickaxeBronze = new ItemToolPickaxe("bronze_pickaxe", MaterialTool.toolBronze);
                        axeBronze= new ItemToolAxe("bronze_axe", MaterialTool.toolBronze);
                        shovelBronze = new ItemToolShovel("bronze_shovel", MaterialTool.toolBronze);
                        hoeBronze = new ItemToolHoe("bronze_hoe", MaterialTool.toolBronze);
                    }
                    //electrum
                    if (OreInAMillionConfig.isElectrumEnabled) {
                        swordElectrum = new ItemToolSword("electrum_sword", MaterialTool.toolElectrum);
                        pickaxeElectrum = new ItemToolPickaxe("electrum_pickaxe", MaterialTool.toolElectrum);
                        axeElectrum = new ItemToolAxe("electrum_axe", MaterialTool.toolElectrum);
                        shovelElectrum = new ItemToolShovel("electrum_shovel", MaterialTool.toolElectrum);
                        hoeElectrum = new ItemToolHoe("electrum_hoe", MaterialTool.toolElectrum);
                    }
                    //fairy
                    if (OreInAMillionConfig.isFairyEnabled) {
                        swordFairy = new ItemToolSword("fairy_sword", MaterialTool.toolFairy);
                        pickaxeFairy = new ItemToolPickaxe("fairy_pickaxe", MaterialTool.toolFairy);
                        axeFairy = new ItemToolAxe("fairy_axe", MaterialTool.toolFairy);
                        shovelFairy = new ItemToolShovel("fairy_shovel", MaterialTool.toolFairy);
                        hoeFairy = new ItemToolHoe("fairy_hoe", MaterialTool.toolFairy);
                    }
                    //invar
                    if (OreInAMillionConfig.isInvarEnabled) {
                        swordInvar = new ItemToolSword("invar_sword", MaterialTool.toolInvar);
                        pickaxeInvar = new ItemToolPickaxe("invar_pickaxe", MaterialTool.toolInvar);
                        axeInvar = new ItemToolAxe("invar_axe", MaterialTool.toolInvar);
                        shovelInvar = new ItemToolShovel("invar_shovel", MaterialTool.toolInvar);
                        hoeInvar = new ItemToolHoe("invar_hoe", MaterialTool.toolInvar);
                    }
                    //steel
                    if (OreInAMillionConfig.isSteelEnabled) {
                        swordSteel = new ItemToolSword("steel_sword", MaterialTool.toolSteel);
                        pickaxeSteel = new ItemToolPickaxe("steel_pickaxe", MaterialTool.toolSteel);
                        axeSteel = new ItemToolAxe("steel_axe", MaterialTool.toolSteel);
                        shovelSteel = new ItemToolShovel("steel_shovel", MaterialTool.toolSteel);
                        hoeSteel = new ItemToolHoe("steel_hoe", MaterialTool.toolSteel);
                    }
                    //thermal series
                    if (OreInAMillionConfig.isThermalIngotsEnabled) {
                        //constantan
                        if (OreInAMillionConfig.isConstantanEnabled) {
                            swordConstantan = new ItemToolSword("constantan_sword", MaterialTool.toolConstantan);
                            pickaxeConstantan = new ItemToolPickaxe("constantan_pickaxe", MaterialTool.toolConstantan);
                            axeConstantan = new ItemToolAxe("constantan_axe", MaterialTool.toolConstantan);
                            shovelConstantan = new ItemToolShovel("constantan_shovel", MaterialTool.toolConstantan);
                            hoeConstantan = new ItemToolHoe("constantan_hoe", MaterialTool.toolConstantan);
                        }
                        //enderium
                        if (OreInAMillionConfig.isEnderiumEnabled) {
                            swordEnderium = new ItemToolSword("enderium_sword", MaterialTool.toolEnderium);
                            pickaxeEnderium = new ItemToolPickaxe("enderium_pickaxe", MaterialTool.toolEnderium);
                            axeEnderium = new ItemToolAxe("enderium_axe", MaterialTool.toolEnderium);
                            shovelEnderium = new ItemToolShovel("enderium_shovel", MaterialTool.toolEnderium);
                            hoeEnderium = new ItemToolHoe("enderium_hoe", MaterialTool.toolEnderium);
                        }
                        //lumium
                        if (OreInAMillionConfig.isLumiumEnabled) {
                            swordLumium = new ItemToolSword("lumium_sword", MaterialTool.toolLumium);
                            pickaxeLumium = new ItemToolPickaxe("lumium_pickaxe", MaterialTool.toolLumium);
                            axeLumium = new ItemToolAxe("lumium_axe", MaterialTool.toolLumium);
                            shovelLumium = new ItemToolShovel("lumium_shovel", MaterialTool.toolLumium);
                            hoeLumium = new ItemToolHoe("lumium_hoe", MaterialTool.toolLumium);
                        }
                        //signalum
                        if (OreInAMillionConfig.isSignalumEnabled) {
                            swordSignalum = new ItemToolSword("signalum_sword", MaterialTool.toolSignalum);
                            pickaxeSignalum = new ItemToolPickaxe("signalum_pickaxe", MaterialTool.toolSignalum);
                            axeSignalum = new ItemToolAxe("signalum_axe", MaterialTool.toolSignalum);
                            shovelSignalum = new ItemToolShovel("signalum_shovel", MaterialTool.toolSignalum);
                            hoeSignalum = new ItemToolHoe("signalum_hoe", MaterialTool.toolSignalum);
                        }
                    }
                    //tinkers construct
                    if (OreInAMillionConfig.isTinkersIngotsEnabled) {
                        //ardite
                        if (OreInAMillionConfig.isArditeEnabled) {
                            swordArdite = new ItemToolSword("ardite_sword", MaterialTool.toolArdite);
                            pickaxeArdite = new ItemToolPickaxe("ardite_pickaxe", MaterialTool.toolArdite);
                            axeArdite = new ItemToolAxe("ardite_axe", MaterialTool.toolArdite);
                            shovelArdite = new ItemToolShovel("ardite_shovel", MaterialTool.toolArdite);
                            hoeArdite = new ItemToolHoe("ardite_hoe", MaterialTool.toolArdite);
                        }
                        //knightslime
                        if (OreInAMillionConfig.isKnightSlimeEnabled) {
                            swordKnightSlime = new ItemToolSword("knightslime_sword", MaterialTool.toolKnightSlime);
                            pickaxeKnightSlime = new ItemToolPickaxe("knightslime_pickaxe", MaterialTool.toolKnightSlime);
                            axeKnightSlime = new ItemToolAxe("knightslime_axe", MaterialTool.toolKnightSlime);
                            shovelKnightSlime = new ItemToolShovel("knightslime_shovel", MaterialTool.toolKnightSlime);
                            hoeKnightSlime = new ItemToolHoe("knightslime_hoe", MaterialTool.toolKnightSlime);
                        }
                        //pigiron
                        if (OreInAMillionConfig.isPigIronEnabled) {
                            swordPigIron = new ItemToolFoodSword("pigiron_sword", MaterialTool.toolPigIron);
                            pickaxePigIron = new ItemToolFoodPickaxe("pigiron_pickaxe", MaterialTool.toolPigIron);
                            axePigIron = new ItemToolFoodAxe("pigiron_axe", MaterialTool.toolPigIron);
                            shovelPigIron = new ItemToolFoodShovel("pigiron_shovel", MaterialTool.toolPigIron);
                            hoePigIron = new ItemToolFoodHoe("pigiron_hoe", MaterialTool.toolPigIron);
                        }
                        //manyullyn
                        if (OreInAMillionConfig.isManyullynEnabled) {
                            swordManyullyn = new ItemToolSword("manyullyn_sword", MaterialTool.toolManyullyn);
                            pickaxeManyullyn = new ItemToolPickaxe("manyullyn_pickaxe", MaterialTool.toolManyullyn);
                            axeManyullyn = new ItemToolAxe("manyullyn_axe", MaterialTool.toolManyullyn);
                            shovelManyullyn = new ItemToolShovel("manyullyn_shovel", MaterialTool.toolManyullyn);
                            hoeManyullyn = new ItemToolHoe("manyullyn_hoe", MaterialTool.toolManyullyn);
                        }
                    }
                }
                //gems
                if (OreInAMillionConfig.isGemsEnabled) {
                    //amethyst
                    if (OreInAMillionConfig.isAmethystEnabled) {
                        swordAmethyst = new ItemToolSword("amethyst_sword", MaterialTool.toolAmethyst);
                        pickaxeAmethyst = new ItemToolPickaxe("amethyst_pickaxe", MaterialTool.toolAmethyst);
                        axeAmethyst = new ItemToolAxe("amethyst_axe", MaterialTool.toolAmethyst);
                        shovelAmethyst = new ItemToolShovel("amethyst_shovel", MaterialTool.toolAmethyst);
                        hoeAmethyst = new ItemToolHoe("amethyst_hoe", MaterialTool.toolAmethyst);
                    }
                    //peridot
                    if (OreInAMillionConfig.isPeridotEnabled) {
                        swordPeridot = new ItemToolSword("peridot_sword", MaterialTool.toolPeridot);
                        pickaxePeridot = new ItemToolPickaxe("peridot_pickaxe", MaterialTool.toolPeridot);
                        axePeridot = new ItemToolAxe("peridot_axe", MaterialTool.toolPeridot);
                        shovelPeridot = new ItemToolShovel("peridot_shovel", MaterialTool.toolPeridot);
                        hoePeridot = new ItemToolHoe("peridot_hoe", MaterialTool.toolPeridot);
                    }
                    //ruby
                    if (OreInAMillionConfig.isRubyEnabled) {
                        swordRuby = new ItemToolSword("ruby_sword", MaterialTool.toolRuby);
                        pickaxeRuby = new ItemToolPickaxe("ruby_pickaxe", MaterialTool.toolRuby);
                        axeRuby = new ItemToolAxe("ruby_axe", MaterialTool.toolRuby);
                        shovelRuby = new ItemToolShovel("ruby_shovel", MaterialTool.toolRuby);
                        hoeRuby = new ItemToolHoe("ruby_hoe", MaterialTool.toolRuby);
                    }
                    //sapphire
                    if (OreInAMillionConfig.isSapphireEnabled) {
                        swordSapphire = new ItemToolSword("sapphire_sword", MaterialTool.toolSapphire);
                        pickaxeSapphire= new ItemToolPickaxe("sapphire_pickaxe", MaterialTool.toolSapphire);
                        axeSapphire = new ItemToolAxe("sapphire_axe", MaterialTool.toolSapphire);
                        shovelSapphire = new ItemToolShovel("sapphire_shovel", MaterialTool.toolSapphire);
                        hoeSapphire = new ItemToolHoe("sapphire_hoe", MaterialTool.toolSapphire);
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
                        swordCharcoal = new ItemToolCoalSword("charcoal_sword", MaterialTool.toolCharcoal, 1700);
                        pickaxeCharcoal = new ItemToolCoalPickaxe("charcoal_pickaxe", MaterialTool.toolCharcoal, 2600);
                        axeCharcoal = new ItemToolCoalAxe("charcoal_axe", MaterialTool.toolCharcoal, 2600);
                        shovelCharcoal = new ItemToolCoalShovel("charcoal_shovel", MaterialTool.toolCharcoal, 1800);
                        hoeCharcoal = new ItemToolCoalHoe("charcoal_hoe", MaterialTool.toolCharcoal, 1000);
                    }
                    //coal
                    if (OreInAMillionConfig.isCoalEnabled) {
                        swordCoal = new ItemToolCoalSword("coal_sword", MaterialTool.toolCoal, 1700);
                        pickaxeCoal = new ItemToolCoalPickaxe("coal_pickaxe", MaterialTool.toolCoal, 2600);
                        axeCoal = new ItemToolCoalAxe("coal_axe", MaterialTool.toolCoal, 2600);
                        shovelCoal = new ItemToolCoalShovel("coal_shovel", MaterialTool.toolCoal, 1800);
                        hoeCoal = new ItemToolCoalHoe("coal_hoe", MaterialTool.toolCoal, 1000);
                    }
                    //diamond
                    if (OreInAMillionConfig.isDiamondEnabled) {

                    }
                    //emerald
                    if (OreInAMillionConfig.isEmeraldEnabled) {
                        swordEmerald = new ItemToolSword("emerald_sword", MaterialTool.toolEmerald);
                        pickaxeEmerald = new ItemToolPickaxe("emerald_pickaxe", MaterialTool.toolEmerald);
                        axeEmerald = new ItemToolAxe("emerald_axe", MaterialTool.toolEmerald);
                        shovelEmerald = new ItemToolShovel("emerald_shovel", MaterialTool.toolEmerald);
                        hoeEmerald = new ItemToolHoe("emerald_hoe", MaterialTool.toolEmerald);
                    }
                    //quartz
                    if (OreInAMillionConfig.isQuartzEnabled) {
                        swordQuartz = new ItemToolSword("quartz_sword", MaterialTool.toolQuartz);
                        pickaxeQuartz = new ItemToolPickaxe("quartz_pickaxe", MaterialTool.toolQuartz);
                        axeQuartz = new ItemToolAxe("quartz_axe", MaterialTool.toolQuartz);
                        shovelQuartz = new ItemToolShovel("quartz_shovel", MaterialTool.toolQuartz);
                        hoeQuartz = new ItemToolHoe("quartz_hoe", MaterialTool.toolQuartz);
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
                    event.getRegistry().register(swordAluminum);
                    event.getRegistry().register(pickaxeAluminum);
                    event.getRegistry().register(axeAluminum);
                    event.getRegistry().register(shovelAluminum);
                    event.getRegistry().register(hoeAluminum);
                }
                //chrome
                if (OreInAMillionConfig.isChromeEnabled) {
                    event.getRegistry().register(swordChrome);
                    event.getRegistry().register(pickaxeChrome);
                    event.getRegistry().register(axeChrome);
                    event.getRegistry().register(shovelChrome);
                    event.getRegistry().register(hoeChrome);
                }
                //cobalt
                if (OreInAMillionConfig.isCobaltEnabled) {
                    event.getRegistry().register(swordCobalt);
                    event.getRegistry().register(pickaxeCobalt);
                    event.getRegistry().register(axeCobalt);
                    event.getRegistry().register(shovelCobalt);
                    event.getRegistry().register(hoeCobalt);
                }
                //copper
                if (OreInAMillionConfig.isCopperEnabled) {
                    event.getRegistry().register(swordCopper);
                    event.getRegistry().register(pickaxeCopper);
                    event.getRegistry().register(axeCopper);
                    event.getRegistry().register(shovelCopper);
                    event.getRegistry().register(hoeCopper);
                }
                //ender
                if (OreInAMillionConfig.isEnderEnabled){
                    event.getRegistry().register(swordEnder);
                    event.getRegistry().register(pickaxeEnder);
                    event.getRegistry().register(axeEnder);
                    event.getRegistry().register(shovelEnder);
                    event.getRegistry().register(hoeEnder);
                }
                //iridium
                if (OreInAMillionConfig.isIridiumEnabled) {
                    event.getRegistry().register(swordIridium);
                    event.getRegistry().register(pickaxeIridium);
                    event.getRegistry().register(axeIridium);
                    event.getRegistry().register(shovelIridium);
                    event.getRegistry().register(hoeIridium);
                }
                //lead
                if (OreInAMillionConfig.isLeadEnabled) {
                    event.getRegistry().register(swordLead);
                    event.getRegistry().register(pickaxeLead);
                    event.getRegistry().register(axeLead);
                    event.getRegistry().register(shovelLead);
                    event.getRegistry().register(hoeLead);
                }
                //mithril
                if (OreInAMillionConfig.isMithrilEnabled) {
                    event.getRegistry().register(swordMithril);
                    event.getRegistry().register(pickaxeMithril);
                    event.getRegistry().register(axeMithril);
                    event.getRegistry().register(shovelMithril);
                    event.getRegistry().register(hoeMithril);
                }
                //nickel
                if (OreInAMillionConfig.isNickelEnabled) {
                    event.getRegistry().register(swordNickel);
                    event.getRegistry().register(pickaxeNickel);
                    event.getRegistry().register(axeNickel);
                    event.getRegistry().register(shovelNickel);
                    event.getRegistry().register(hoeNickel);
                }
                //osmium
                if (OreInAMillionConfig.isOsmiumEnabled) {
                    event.getRegistry().register(swordOsmium);
                    event.getRegistry().register(pickaxeOsmium);
                    event.getRegistry().register(axeOsmium);
                    event.getRegistry().register(shovelOsmium);
                    event.getRegistry().register(hoeOsmium);
                }
                //platinum
                if (OreInAMillionConfig.isPlatinumEnabled) {
                    event.getRegistry().register(swordPlatinum);
                    event.getRegistry().register(pickaxePlatinum);
                    event.getRegistry().register(axePlatinum);
                    event.getRegistry().register(shovelPlatinum);
                    event.getRegistry().register(hoePlatinum);
                }
                //silver
                if (OreInAMillionConfig.isSilverEnabled) {
                    event.getRegistry().register(swordSilver);
                    event.getRegistry().register(pickaxeSilver);
                    event.getRegistry().register(axeSilver);
                    event.getRegistry().register(shovelSilver);
                    event.getRegistry().register(hoeSilver);
                }
                //tin
                if (OreInAMillionConfig.isTinEnabled) {
                    event.getRegistry().register(swordTin);
                    event.getRegistry().register(pickaxeTin);
                    event.getRegistry().register(axeTin);
                    event.getRegistry().register(shovelTin);
                    event.getRegistry().register(hoeTin);
                }
                //titanium
                if (OreInAMillionConfig.isTitaniumEnabled) {
                    event.getRegistry().register(swordTitanium);
                    event.getRegistry().register(pickaxeTitanium);
                    event.getRegistry().register(axeTitanium);
                    event.getRegistry().register(shovelTitanium);
                    event.getRegistry().register(hoeTitanium);
                }
                //tungsten
                if (OreInAMillionConfig.isTungstenEnabled) {
                    event.getRegistry().register(swordTungsten);
                    event.getRegistry().register(pickaxeTungsten);
                    event.getRegistry().register(axeTungsten);
                    event.getRegistry().register(shovelTungsten);
                    event.getRegistry().register(hoeTungsten);
                }
                //uranium
                if (OreInAMillionConfig.isUraniumEnabled) {
                    event.getRegistry().register(swordUranium);
                    event.getRegistry().register(pickaxeUranium);
                    event.getRegistry().register(axeUranium);
                    event.getRegistry().register(shovelUranium);
                    event.getRegistry().register(hoeUranium);
                }
                //zinc
                if (OreInAMillionConfig.isZincEnabled) {
                    event.getRegistry().register(swordZinc);
                    event.getRegistry().register(pickaxeZinc);
                    event.getRegistry().register(axeZinc);
                    event.getRegistry().register(shovelZinc);
                    event.getRegistry().register(hoeZinc);
                }
                //brass
                if (OreInAMillionConfig.isBrassEnabled) {
                    event.getRegistry().register(swordBrass);
                    event.getRegistry().register(pickaxeBrass);
                    event.getRegistry().register(axeBrass);
                    event.getRegistry().register(shovelBrass);
                    event.getRegistry().register(hoeBrass);
                }
                //bronze
                if (OreInAMillionConfig.isBronzeEnabled) {
                    event.getRegistry().register(swordBronze);
                    event.getRegistry().register(pickaxeBronze);
                    event.getRegistry().register(axeBronze);
                    event.getRegistry().register(shovelBronze);
                    event.getRegistry().register(hoeBronze);
                }
                //electrum
                if (OreInAMillionConfig.isElectrumEnabled) {
                    event.getRegistry().register(swordElectrum);
                    event.getRegistry().register(pickaxeElectrum);
                    event.getRegistry().register(axeElectrum);
                    event.getRegistry().register(shovelElectrum);
                    event.getRegistry().register(hoeElectrum);
                }
                //fairy
                if (OreInAMillionConfig.isFairyEnabled){
                    event.getRegistry().register(swordFairy);
                    event.getRegistry().register(pickaxeFairy);
                    event.getRegistry().register(axeFairy);
                    event.getRegistry().register(shovelFairy);
                    event.getRegistry().register(hoeFairy);
                }
                //invar
                if (OreInAMillionConfig.isInvarEnabled) {
                    event.getRegistry().register(swordInvar);
                    event.getRegistry().register(pickaxeInvar);
                    event.getRegistry().register(axeInvar);
                    event.getRegistry().register(shovelInvar);
                    event.getRegistry().register(hoeInvar);
                }
                //steel
                if (OreInAMillionConfig.isSteelEnabled) {
                    event.getRegistry().register(swordSteel);
                    event.getRegistry().register(pickaxeSteel);
                    event.getRegistry().register(axeSteel);
                    event.getRegistry().register(shovelSteel);
                    event.getRegistry().register(hoeSteel);
                }
                //thermal series
                if (OreInAMillionConfig.isThermalIngotsEnabled){
                    //constantan
                    if (OreInAMillionConfig.isConstantanEnabled){
                        event.getRegistry().register(swordConstantan);
                        event.getRegistry().register(pickaxeConstantan);
                        event.getRegistry().register(axeConstantan);
                        event.getRegistry().register(shovelConstantan);
                        event.getRegistry().register(hoeConstantan);
                    }
                    //enderium
                    if (OreInAMillionConfig.isEnderiumEnabled){
                        event.getRegistry().register(swordEnderium);
                        event.getRegistry().register(pickaxeEnderium);
                        event.getRegistry().register(axeEnderium);
                        event.getRegistry().register(shovelEnderium);
                        event.getRegistry().register(hoeEnderium);
                    }
                    //lumium
                    if (OreInAMillionConfig.isLumiumEnabled){
                        event.getRegistry().register(swordLumium);
                        event.getRegistry().register(pickaxeLumium);
                        event.getRegistry().register(axeLumium);
                        event.getRegistry().register(shovelLumium);
                        event.getRegistry().register(hoeLumium);
                    }
                    //signalum
                    if (OreInAMillionConfig.isSignalumEnabled){
                        event.getRegistry().register(swordSignalum);
                        event.getRegistry().register(pickaxeSignalum);
                        event.getRegistry().register(axeSignalum);
                        event.getRegistry().register(shovelSignalum);
                        event.getRegistry().register(hoeSignalum);
                    }
                }
                //tinkers construct
                if (OreInAMillionConfig.isTinkersIngotsEnabled){
                    //ardite
                    if (OreInAMillionConfig.isArditeEnabled){
                        event.getRegistry().register(swordArdite);
                        event.getRegistry().register(pickaxeArdite);
                        event.getRegistry().register(axeArdite);
                        event.getRegistry().register(shovelArdite);
                        event.getRegistry().register(hoeArdite);
                    }
                    //knightslime
                    if (OreInAMillionConfig.isKnightSlimeEnabled){
                        event.getRegistry().register(swordKnightSlime);
                        event.getRegistry().register(pickaxeKnightSlime);
                        event.getRegistry().register(axeKnightSlime);
                        event.getRegistry().register(shovelKnightSlime);
                        event.getRegistry().register(hoeKnightSlime);
                    }
                    //pigiron
                    if (OreInAMillionConfig.isPigIronEnabled) {
                        event.getRegistry().register(swordPigIron);
                        event.getRegistry().register(pickaxePigIron);
                        event.getRegistry().register(axePigIron);
                        event.getRegistry().register(shovelPigIron);
                        event.getRegistry().register(hoePigIron);
                    }
                    //manyullyn
                    if (OreInAMillionConfig.isManyullynEnabled){
                        event.getRegistry().register(swordManyullyn);
                        event.getRegistry().register(pickaxeManyullyn);
                        event.getRegistry().register(axeManyullyn);
                        event.getRegistry().register(shovelManyullyn);
                        event.getRegistry().register(hoeManyullyn);
                    }
                }
            }
            //gems
            if (OreInAMillionConfig.isGemsEnabled){
                //amethyst
                if (OreInAMillionConfig.isAmethystEnabled){
                    event.getRegistry().register(swordAmethyst);
                    event.getRegistry().register(pickaxeAmethyst);
                    event.getRegistry().register(axeAmethyst);
                    event.getRegistry().register(shovelAmethyst);
                    event.getRegistry().register(hoeAmethyst);
                }
                //peridot
                if (OreInAMillionConfig.isPeridotEnabled){
                    event.getRegistry().register(swordPeridot);
                    event.getRegistry().register(pickaxePeridot);
                    event.getRegistry().register(axePeridot);
                    event.getRegistry().register(shovelPeridot);
                    event.getRegistry().register(hoePeridot);
                }
                //ruby
                if (OreInAMillionConfig.isRubyEnabled){
                    event.getRegistry().register(swordRuby);
                    event.getRegistry().register(pickaxeRuby);
                    event.getRegistry().register(axeRuby);
                    event.getRegistry().register(shovelRuby);
                    event.getRegistry().register(hoeRuby);
                }
                //sapphire
                if (OreInAMillionConfig.isSapphireEnabled){
                    event.getRegistry().register(swordSapphire);
                    event.getRegistry().register(pickaxeSapphire);
                    event.getRegistry().register(axeSapphire);
                    event.getRegistry().register(shovelSapphire);
                    event.getRegistry().register(hoeSapphire);
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
                    event.getRegistry().register(swordCharcoal);
                    event.getRegistry().register(pickaxeCharcoal);
                    event.getRegistry().register(axeCharcoal);
                    event.getRegistry().register(shovelCharcoal);
                    event.getRegistry().register(hoeCharcoal);
                }
                //coal
                if (OreInAMillionConfig.isCoalEnabled) {
                    event.getRegistry().register(swordCoal);
                    event.getRegistry().register(pickaxeCoal);
                    event.getRegistry().register(axeCoal);
                    event.getRegistry().register(shovelCoal);
                    event.getRegistry().register(hoeCoal);
                }
                //diamond
                if (OreInAMillionConfig.isDiamondEnabled) {

                }
                //emerald
                if (OreInAMillionConfig.isEmeraldEnabled) {
                    event.getRegistry().register(swordEmerald);
                    event.getRegistry().register(pickaxeEmerald);
                    event.getRegistry().register(axeEmerald);
                    event.getRegistry().register(shovelEmerald);
                    event.getRegistry().register(hoeEmerald);
                }
                //quartz
                if (OreInAMillionConfig.isQuartzEnabled){
                    event.getRegistry().register(swordQuartz);
                    event.getRegistry().register(pickaxeQuartz);
                    event.getRegistry().register(axeQuartz);
                    event.getRegistry().register(shovelQuartz);
                    event.getRegistry().register(hoeQuartz);
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
                    registerRender(swordAluminum);
                    registerRender(pickaxeAluminum);
                    registerRender(axeAluminum);
                    registerRender(shovelAluminum);
                    registerRender(hoeAluminum);
                }
                //chrome
                if (OreInAMillionConfig.isChromeEnabled) {
                    registerRender(swordChrome);
                    registerRender(pickaxeChrome);
                    registerRender(axeChrome);
                    registerRender(shovelChrome);
                    registerRender(hoeChrome);
                }
                //cobalt
                if (OreInAMillionConfig.isCobaltEnabled) {
                    registerRender(swordCobalt);
                    registerRender(pickaxeCobalt);
                    registerRender(axeCobalt);
                    registerRender(shovelCobalt);
                    registerRender(hoeCobalt);
                }
                //copper
                if (OreInAMillionConfig.isCopperEnabled) {
                    registerRender(swordCopper);
                    registerRender(pickaxeCopper);
                    registerRender(axeCopper);
                    registerRender(shovelCopper);
                    registerRender(hoeCopper);
                }
                //ender
                if (OreInAMillionConfig.isEnderEnabled){
                    registerRender(swordEnder);
                    registerRender(pickaxeEnder);
                    registerRender(axeEnder);
                    registerRender(shovelEnder);
                    registerRender(hoeEnder);
                }
                //iridium
                if (OreInAMillionConfig.isIridiumEnabled) {
                    registerRender(swordIridium);
                    registerRender(pickaxeIridium);
                    registerRender(axeIridium);
                    registerRender(shovelIridium);
                    registerRender(hoeIridium);
                }
                //lead
                if (OreInAMillionConfig.isLeadEnabled) {
                    registerRender(swordLead);
                    registerRender(pickaxeLead);
                    registerRender(axeLead);
                    registerRender(shovelLead);
                    registerRender(hoeLead);
                }
                //mithril
                if (OreInAMillionConfig.isMithrilEnabled) {
                    registerRender(swordMithril);
                    registerRender(pickaxeMithril);
                    registerRender(axeMithril);
                    registerRender(shovelMithril);
                    registerRender(hoeMithril);
                }
                //nickel
                if (OreInAMillionConfig.isNickelEnabled) {
                    registerRender(swordNickel);
                    registerRender(pickaxeNickel);
                    registerRender(axeNickel);
                    registerRender(shovelNickel);
                    registerRender(hoeNickel);
                }
                //osmium
                if (OreInAMillionConfig.isOsmiumEnabled) {
                    registerRender(swordOsmium);
                    registerRender(pickaxeOsmium);
                    registerRender(axeOsmium);
                    registerRender(shovelOsmium);
                    registerRender(hoeOsmium);
                }
                //platinum
                if (OreInAMillionConfig.isPlatinumEnabled) {
                    registerRender(swordPlatinum);
                    registerRender(pickaxePlatinum);
                    registerRender(axePlatinum);
                    registerRender(shovelPlatinum);
                    registerRender(hoePlatinum);
                }
                //silver
                if (OreInAMillionConfig.isSilverEnabled) {
                    registerRender(swordSilver);
                    registerRender(pickaxeSilver);
                    registerRender(axeSilver);
                    registerRender(shovelSilver);
                    registerRender(hoeSilver);
                }
                //tin
                if (OreInAMillionConfig.isTinEnabled) {
                    registerRender(swordTin);
                    registerRender(pickaxeTin);
                    registerRender(axeTin);
                    registerRender(shovelTin);
                    registerRender(hoeTin);
                }
                //titanium
                if (OreInAMillionConfig.isTitaniumEnabled) {
                    registerRender(swordTitanium);
                    registerRender(pickaxeTitanium);
                    registerRender(axeTitanium);
                    registerRender(shovelTitanium);
                    registerRender(hoeTitanium);
                }
                //tungsten
                if (OreInAMillionConfig.isTungstenEnabled) {
                    registerRender(swordTungsten);
                    registerRender(pickaxeTungsten);
                    registerRender(axeTungsten);
                    registerRender(shovelTungsten);
                    registerRender(hoeTungsten);
                }
                //uranium
                if (OreInAMillionConfig.isUraniumEnabled) {
                    registerRender(swordUranium);
                    registerRender(pickaxeUranium);
                    registerRender(axeUranium);
                    registerRender(shovelUranium);
                    registerRender(hoeUranium);
                }
                //zinc
                if (OreInAMillionConfig.isZincEnabled) {
                    registerRender(swordZinc);
                    registerRender(pickaxeZinc);
                    registerRender(axeZinc);
                    registerRender(shovelZinc);
                    registerRender(hoeZinc);
                }
                //brass
                if (OreInAMillionConfig.isBrassEnabled) {
                    registerRender(swordBrass);
                    registerRender(pickaxeBrass);
                    registerRender(axeBrass);
                    registerRender(shovelBrass);
                    registerRender(hoeBrass);
                }
                //bronze
                if (OreInAMillionConfig.isBronzeEnabled) {
                    registerRender(swordBronze);
                    registerRender(pickaxeBronze);
                    registerRender(axeBronze);
                    registerRender(shovelBronze);
                    registerRender(hoeBronze);
                }
                //electrum
                if (OreInAMillionConfig.isElectrumEnabled) {
                    registerRender(swordElectrum);
                    registerRender(pickaxeElectrum);
                    registerRender(axeElectrum);
                    registerRender(shovelElectrum);
                    registerRender(hoeElectrum);
                }
                //fairy
                if (OreInAMillionConfig.isFairyEnabled){
                    registerRender(swordFairy);
                    registerRender(pickaxeFairy);
                    registerRender(axeFairy);
                    registerRender(shovelFairy);
                    registerRender(hoeFairy);
                }
                //invar
                if (OreInAMillionConfig.isInvarEnabled) {
                    registerRender(swordInvar);
                    registerRender(pickaxeInvar);
                    registerRender(axeInvar);
                    registerRender(shovelInvar);
                    registerRender(hoeInvar);
                }
                //steel
                if (OreInAMillionConfig.isSteelEnabled) {
                    registerRender(swordSteel);
                    registerRender(pickaxeSteel);
                    registerRender(axeSteel);
                    registerRender(shovelSteel);
                    registerRender(hoeSteel);
                }
                //thermal series
                if (OreInAMillionConfig.isThermalIngotsEnabled){
                    //constantan
                    if (OreInAMillionConfig.isConstantanEnabled){
                        registerRender(swordConstantan);
                        registerRender(pickaxeConstantan);
                        registerRender(axeConstantan);
                        registerRender(shovelConstantan);
                        registerRender(hoeConstantan);
                    }
                    //enderium
                    if (OreInAMillionConfig.isEnderiumEnabled){
                        registerRender(swordEnderium);
                        registerRender(pickaxeEnderium);
                        registerRender(axeEnderium);
                        registerRender(shovelEnderium);
                        registerRender(hoeEnderium);
                    }
                    //lumium
                    if (OreInAMillionConfig.isLumiumEnabled){
                        registerRender(swordLumium);
                        registerRender(pickaxeLumium);
                        registerRender(axeLumium);
                        registerRender(shovelLumium);
                        registerRender(hoeLumium);
                    }
                    //signalum
                    if (OreInAMillionConfig.isSignalumEnabled){
                        registerRender(swordSignalum);
                        registerRender(pickaxeSignalum);
                        registerRender(axeSignalum);
                        registerRender(shovelSignalum);
                        registerRender(hoeSignalum);
                    }
                }
                //tinkers construct
                if (OreInAMillionConfig.isTinkersIngotsEnabled){
                    //ardite
                    if (OreInAMillionConfig.isArditeEnabled){
                        registerRender(swordArdite);
                        registerRender(pickaxeArdite);
                        registerRender(axeArdite);
                        registerRender(shovelArdite);
                        registerRender(hoeArdite);
                    }
                    //knightslime
                    if (OreInAMillionConfig.isKnightSlimeEnabled){
                        registerRender(swordKnightSlime);
                        registerRender(pickaxeKnightSlime);
                        registerRender(axeKnightSlime);
                        registerRender(shovelKnightSlime);
                        registerRender(hoeKnightSlime);
                    }
                    //pigiron
                    if (OreInAMillionConfig.isPigIronEnabled) {
                        registerRender(swordPigIron);
                        registerRender(pickaxePigIron);
                        registerRender(axePigIron);
                        registerRender(shovelPigIron);
                        registerRender(hoePigIron);
                    }
                    //manyullyn
                    if (OreInAMillionConfig.isManyullynEnabled){
                        registerRender(swordManyullyn);
                        registerRender(pickaxeManyullyn);
                        registerRender(axeManyullyn);
                        registerRender(shovelManyullyn);
                        registerRender(hoeManyullyn);
                    }
                }
            }
            //gems
            if (OreInAMillionConfig.isGemsEnabled){
                //amethyst
                if (OreInAMillionConfig.isAmethystEnabled){
                    registerRender(swordAmethyst);
                    registerRender(pickaxeAmethyst);
                    registerRender(axeAmethyst);
                    registerRender(shovelAmethyst);
                    registerRender(hoeAmethyst);
                }
                //peridot
                if (OreInAMillionConfig.isPeridotEnabled){
                    registerRender(swordPeridot);
                    registerRender(pickaxePeridot);
                    registerRender(axePeridot);
                    registerRender(shovelPeridot);
                    registerRender(hoePeridot);
                }
                //ruby
                if (OreInAMillionConfig.isRubyEnabled){
                    registerRender(swordRuby);
                    registerRender(pickaxeRuby);
                    registerRender(axeRuby);
                    registerRender(shovelRuby);
                    registerRender(hoeRuby);
                }
                //sapphire
                if (OreInAMillionConfig.isSapphireEnabled){
                    registerRender(swordSapphire);
                    registerRender(pickaxeSapphire);
                    registerRender(axeSapphire);
                    registerRender(shovelSapphire);
                    registerRender(hoeSapphire);
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
                    registerRender(swordCharcoal);
                    registerRender(pickaxeCharcoal);
                    registerRender(axeCharcoal);
                    registerRender(shovelCharcoal);
                    registerRender(hoeCharcoal);
                }
                //coal
                if (OreInAMillionConfig.isCoalEnabled) {
                    registerRender(swordCoal);
                    registerRender(pickaxeCoal);
                    registerRender(axeCoal);
                    registerRender(shovelCoal);
                    registerRender(hoeCoal);
                }
                //diamond
                if (OreInAMillionConfig.isDiamondEnabled) {

                }
                //emerald
                if (OreInAMillionConfig.isEmeraldEnabled) {
                    registerRender(swordEmerald);
                    registerRender(pickaxeEmerald);
                    registerRender(axeEmerald);
                    registerRender(shovelEmerald);
                    registerRender(hoeEmerald);
                }
                //quartz
                if (OreInAMillionConfig.isQuartzEnabled){
                    registerRender(swordQuartz);
                    registerRender(pickaxeQuartz);
                    registerRender(axeQuartz);
                    registerRender(shovelQuartz);
                    registerRender(hoeQuartz);
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
                    OreDictionary.registerOre("swordAluminum", ModTools.swordAluminum);
                    OreDictionary.registerOre("pickaxeAluminum", ModTools.pickaxeAluminum);
                    OreDictionary.registerOre("axeAluminum", ModTools.axeAluminum);
                    OreDictionary.registerOre("shovelAluminum", ModTools.shovelAluminum);
                    OreDictionary.registerOre("hoeAluminum", ModTools.hoeAluminum);
                }
                //chrome
                if (OreInAMillionConfig.isChromeEnabled) {
                    OreDictionary.registerOre("swordChrome", ModTools.swordChrome);
                    OreDictionary.registerOre("pickaxeChrome", ModTools.pickaxeChrome);
                    OreDictionary.registerOre("axeChrome", ModTools.axeChrome);
                    OreDictionary.registerOre("shovelChrome", ModTools.shovelChrome);
                    OreDictionary.registerOre("hoeChrome", ModTools.hoeChrome);
                }
                //cobalt
                if (OreInAMillionConfig.isCobaltEnabled) {
                    OreDictionary.registerOre("swordCobalt", ModTools.swordCobalt);
                    OreDictionary.registerOre("pickaxeCobalt", ModTools.pickaxeCobalt);
                    OreDictionary.registerOre("axeCobalt", ModTools.axeCobalt);
                    OreDictionary.registerOre("shovelCobalt", ModTools.shovelCobalt);
                    OreDictionary.registerOre("hoeCobalt", ModTools.hoeCobalt);
                }
                //copper
                if (OreInAMillionConfig.isCopperEnabled) {
                    OreDictionary.registerOre("swordCopper", ModTools.swordCopper);
                    OreDictionary.registerOre("pickaxeCopper", ModTools.pickaxeCopper);
                    OreDictionary.registerOre("axeCopper", ModTools.axeCopper);
                    OreDictionary.registerOre("shovelCopper", ModTools.shovelCopper);
                    OreDictionary.registerOre("hoeCopper", ModTools.hoeCopper);
                }
                //ender
                if (OreInAMillionConfig.isEnderEnabled){
                    OreDictionary.registerOre("swordEnder", ModTools.swordEnder);
                    OreDictionary.registerOre("pickaxeEnder", ModTools.pickaxeEnder);
                    OreDictionary.registerOre("axeEnder", ModTools.axeEnder);
                    OreDictionary.registerOre("shovelEnder", ModTools.shovelEnder);
                    OreDictionary.registerOre("hoeEnder", ModTools.hoeEnder);
                }
                //iridium
                if (OreInAMillionConfig.isIridiumEnabled) {
                    OreDictionary.registerOre("swordIridium", ModTools.swordIridium);
                    OreDictionary.registerOre("pickaxeIridium", ModTools.pickaxeIridium);
                    OreDictionary.registerOre("axeIridium", ModTools.axeIridium);
                    OreDictionary.registerOre("shovelIridium", ModTools.shovelIridium);
                    OreDictionary.registerOre("hoeIridium", ModTools.hoeIridium);
                }
                //lead
                if (OreInAMillionConfig.isLeadEnabled) {
                    OreDictionary.registerOre("swordLead", ModTools.swordLead);
                    OreDictionary.registerOre("pickaxeLead", ModTools.pickaxeLead);
                    OreDictionary.registerOre("axeLead", ModTools.axeLead);
                    OreDictionary.registerOre("shovelLead", ModTools.shovelLead);
                    OreDictionary.registerOre("hoeLead", ModTools.hoeLead);
                }
                //mithril
                if (OreInAMillionConfig.isMithrilEnabled) {
                    OreDictionary.registerOre("swordMithril", ModTools.swordMithril);
                    OreDictionary.registerOre("pickaxeMithril", ModTools.pickaxeMithril);
                    OreDictionary.registerOre("axeMithril", ModTools.axeMithril);
                    OreDictionary.registerOre("shovelMithril", ModTools.shovelMithril);
                    OreDictionary.registerOre("hoeMithril", ModTools.hoeMithril);
                }
                //nickel
                if (OreInAMillionConfig.isNickelEnabled) {
                    OreDictionary.registerOre("swordNickel", ModTools.swordNickel);
                    OreDictionary.registerOre("pickaxeNickel", ModTools.pickaxeNickel);
                    OreDictionary.registerOre("axeNickel", ModTools.axeNickel);
                    OreDictionary.registerOre("shovelNickle", ModTools.shovelNickel);
                    OreDictionary.registerOre("hoeNickel", ModTools.hoeNickel);
                }
                //osmium
                if (OreInAMillionConfig.isOsmiumEnabled) {
                    OreDictionary.registerOre("swordOsmium", ModTools.swordOsmium);
                    OreDictionary.registerOre("pickaxeOsmium", ModTools.pickaxeOsmium);
                    OreDictionary.registerOre("axeOsmium", ModTools.axeOsmium);
                    OreDictionary.registerOre("shovelOsmium", ModTools.shovelOsmium);
                    OreDictionary.registerOre("hoeOsmium", ModTools.hoeOsmium);
                }
                //platinum
                if (OreInAMillionConfig.isPlatinumEnabled) {
                    OreDictionary.registerOre("swordPlatinum", ModTools.swordPlatinum);
                    OreDictionary.registerOre("pickaxePlatinum", ModTools.pickaxePlatinum);
                    OreDictionary.registerOre("axePlatinum", ModTools.axePlatinum);
                    OreDictionary.registerOre("shovelPlatinum", ModTools.shovelPlatinum);
                    OreDictionary.registerOre("hoePlatinum", ModTools.hoePlatinum);
                }
                //silver
                if (OreInAMillionConfig.isSilverEnabled) {
                    OreDictionary.registerOre("swordSilver", ModTools.swordSilver);
                    OreDictionary.registerOre("pickaxeSilver", ModTools.pickaxeSilver);
                    OreDictionary.registerOre("axeSilver", ModTools.axeSilver);
                    OreDictionary.registerOre("shovelSilver", ModTools.shovelSilver);
                    OreDictionary.registerOre("hoeSilver", ModTools.hoeSilver);
                }
                //tin
                if (OreInAMillionConfig.isTinEnabled) {
                    OreDictionary.registerOre("swordTin", ModTools.swordTin);
                    OreDictionary.registerOre("pickaxeTin", ModTools.pickaxeTin);
                    OreDictionary.registerOre("axeTin", ModTools.axeTin);
                    OreDictionary.registerOre("shovelTin", ModTools.shovelTin);
                    OreDictionary.registerOre("hoeTin", ModTools.hoeTin);
                }
                //titanium
                if (OreInAMillionConfig.isTitaniumEnabled) {
                    OreDictionary.registerOre("swordTitanium", ModTools.swordTitanium);
                    OreDictionary.registerOre("pickaxeTitanium", ModTools.pickaxeTitanium);
                    OreDictionary.registerOre("axeTitanium", ModTools.axeTitanium);
                    OreDictionary.registerOre("shovelTitanium", ModTools.shovelTitanium);
                    OreDictionary.registerOre("hoeTitanium", ModTools.hoeTitanium);
                }
                //tungsten
                if (OreInAMillionConfig.isTungstenEnabled) {
                    OreDictionary.registerOre("swordTungsten", ModTools.swordTungsten);
                    OreDictionary.registerOre("pickaxeTungsten", ModTools.pickaxeTungsten);
                    OreDictionary.registerOre("axeTungsten", ModTools.axeTungsten);
                    OreDictionary.registerOre("shovelTungsten", ModTools.shovelTungsten);
                    OreDictionary.registerOre("hoeTungsten", ModTools.hoeTungsten);
                }
                //uranium
                if (OreInAMillionConfig.isUraniumEnabled) {
                    OreDictionary.registerOre("swordUranium", ModTools.swordUranium);
                    OreDictionary.registerOre("pickaxeUranium", ModTools.pickaxeUranium);
                    OreDictionary.registerOre("axeUranium", ModTools.axeUranium);
                    OreDictionary.registerOre("shovelUranium", ModTools.shovelUranium);
                    OreDictionary.registerOre("hoeUranium", ModTools.hoeUranium);
                }
                //zinc
                if (OreInAMillionConfig.isZincEnabled) {
                    OreDictionary.registerOre("swordZinc", ModTools.swordZinc);
                    OreDictionary.registerOre("pickaxeZinc", ModTools.pickaxeZinc);
                    OreDictionary.registerOre("axeZinc", ModTools.axeZinc);
                    OreDictionary.registerOre("shovelZinc", ModTools.shovelZinc);
                    OreDictionary.registerOre("hoeZinc", ModTools.hoeZinc);
                }
                //brass
                if (OreInAMillionConfig.isBrassEnabled) {
                    OreDictionary.registerOre("swordBrass", ModTools.swordBrass);
                    OreDictionary.registerOre("pickaxeBrass", ModTools.pickaxeBrass);
                    OreDictionary.registerOre("axeBrass", ModTools.axeBrass);
                    OreDictionary.registerOre("shovelBrass", ModTools.shovelBrass);
                    OreDictionary.registerOre("hoeBrass", ModTools.hoeBrass);
                }
                //bronze
                if (OreInAMillionConfig.isBronzeEnabled) {
                    OreDictionary.registerOre("swordBronze", ModTools.swordBronze);
                    OreDictionary.registerOre("pickaxeBronze", ModTools.pickaxeBronze);
                    OreDictionary.registerOre("axeBronze", ModTools.axeBronze);
                    OreDictionary.registerOre("shovelBronze", ModTools.shovelBronze);
                    OreDictionary.registerOre("hoeBronze", ModTools.hoeBronze);
                }
                //electrum
                if (OreInAMillionConfig.isElectrumEnabled) {
                    OreDictionary.registerOre("swordElectrum", ModTools.swordElectrum);
                    OreDictionary.registerOre("pickaxElectrum", ModTools.pickaxeElectrum);
                    OreDictionary.registerOre("axeElectrum", ModTools.axeElectrum);
                    OreDictionary.registerOre("shovelElectrum", ModTools.shovelElectrum);
                    OreDictionary.registerOre("hoeElectrum", ModTools.hoeElectrum);
                }
                //fairy
                if (OreInAMillionConfig.isFairyEnabled){
                    OreDictionary.registerOre("swordFairy", ModTools.swordFairy);
                    OreDictionary.registerOre("pickaxeFairy", ModTools.pickaxeFairy);
                    OreDictionary.registerOre("axeFairy", ModTools.axeFairy);
                    OreDictionary.registerOre("shovelFairy", ModTools.shovelFairy);
                    OreDictionary.registerOre("hoeFairy", ModTools.hoeFairy);
                }
                //invar
                if (OreInAMillionConfig.isInvarEnabled) {
                    OreDictionary.registerOre("swordInvar", ModTools.swordInvar);
                    OreDictionary.registerOre("pickaxeInvar", ModTools.pickaxeInvar);
                    OreDictionary.registerOre("axeInvar", ModTools.axeInvar);
                    OreDictionary.registerOre("shovelInvar", ModTools.shovelInvar);
                    OreDictionary.registerOre("hoeInvar", ModTools.hoeInvar);
                }
                //steel
                if (OreInAMillionConfig.isSteelEnabled) {
                    OreDictionary.registerOre("swordSteel", ModTools.swordSteel);
                    OreDictionary.registerOre("pickaxeSteel", ModTools.pickaxeSteel);
                    OreDictionary.registerOre("axeSteel", ModTools.axeSteel);
                    OreDictionary.registerOre("shovelSteel", ModTools.shovelSteel);
                    OreDictionary.registerOre("hoeSteel", ModTools.hoeSteel);
                }
                //thermal series
                if (OreInAMillionConfig.isThermalIngotsEnabled){
                    //constantan
                    if (OreInAMillionConfig.isConstantanEnabled){
                        OreDictionary.registerOre("swordConstantan", ModTools.swordConstantan);
                        OreDictionary.registerOre("pickaxeConstantan", ModTools.pickaxeConstantan);
                        OreDictionary.registerOre("axeConstantan", ModTools.axeConstantan);
                        OreDictionary.registerOre("shovelConstantan", ModTools.shovelConstantan);
                        OreDictionary.registerOre("hoeConstantan", ModTools.hoeConstantan);
                    }
                    //enderium
                    if (OreInAMillionConfig.isEnderiumEnabled){
                        OreDictionary.registerOre("swordEnderium", ModTools.swordEnderium);
                        OreDictionary.registerOre("pickaxeEnderium", ModTools.pickaxeEnderium);
                        OreDictionary.registerOre("axeEnderium", ModTools.axeEnderium);
                        OreDictionary.registerOre("shovelEnderium", ModTools.shovelEnderium);
                        OreDictionary.registerOre("hoeEnderium", ModTools.hoeEnderium);
                    }
                    //lumium
                    if (OreInAMillionConfig.isLumiumEnabled){
                        OreDictionary.registerOre("swordLumium", ModTools.swordLumium);
                        OreDictionary.registerOre("pickaxeLumium", ModTools.pickaxeLumium);
                        OreDictionary.registerOre("axeLumium", ModTools.axeLumium);
                        OreDictionary.registerOre("shovelLumium", ModTools.shovelLumium);
                        OreDictionary.registerOre("hoeLumium", ModTools.hoeLumium);
                    }
                    //signalum
                    if (OreInAMillionConfig.isSignalumEnabled){
                        OreDictionary.registerOre("swordSignalum", ModTools.swordSignalum);
                        OreDictionary.registerOre("pickaxeSignalum", ModTools.pickaxeSignalum);
                        OreDictionary.registerOre("axeSignalum", ModTools.axeSignalum);
                        OreDictionary.registerOre("shovelSignalum", ModTools.shovelSignalum);
                        OreDictionary.registerOre("hoeSignalum", ModTools.hoeSignalum);
                    }
                }
                //tinkers construct
                if (OreInAMillionConfig.isTinkersIngotsEnabled){
                    //ardite
                    if (OreInAMillionConfig.isArditeEnabled){
                        OreDictionary.registerOre("swordArdite", ModTools.swordArdite);
                        OreDictionary.registerOre("pickaxeArdite", ModTools.pickaxeArdite);
                        OreDictionary.registerOre("axeArdite", ModTools.axeArdite);
                        OreDictionary.registerOre("shovelArdite", ModTools.shovelArdite);
                        OreDictionary.registerOre("hoeArdite", ModTools.hoeArdite);
                    }
                    //knightslime
                    if (OreInAMillionConfig.isKnightSlimeEnabled){
                        OreDictionary.registerOre("swordKnightslime", ModTools.swordKnightSlime);
                        OreDictionary.registerOre("pickaxeKnightslime", ModTools.pickaxeKnightSlime);
                        OreDictionary.registerOre("axeKnightslime", ModTools.axeKnightSlime);
                        OreDictionary.registerOre("shovelKnightslime", ModTools.shovelKnightSlime);
                        OreDictionary.registerOre("hoeKnightslime", ModTools.hoeKnightSlime);
                    }
                    //pigiron
                    if (OreInAMillionConfig.isPigIronEnabled) {
                        OreDictionary.registerOre("swordPigiron", ModTools.swordPigIron);
                        OreDictionary.registerOre("pickaxePigiron", ModTools.pickaxePigIron);
                        OreDictionary.registerOre("axePigiron", ModTools.axePigIron);
                        OreDictionary.registerOre("shovelPigiron", ModTools.shovelPigIron);
                        OreDictionary.registerOre("hoePigiron", ModTools.hoePigIron);
                    }
                    //manyullyn
                    if (OreInAMillionConfig.isManyullynEnabled){
                        OreDictionary.registerOre("swordManyullyn", ModTools.swordManyullyn);
                        OreDictionary.registerOre("pickaxeManyullyn", ModTools.pickaxeManyullyn);
                        OreDictionary.registerOre("axeManyullyn", ModTools.axeManyullyn);
                        OreDictionary.registerOre("shovelManyullyn", ModTools.shovelManyullyn);
                        OreDictionary.registerOre("hoeManyullyn", ModTools.hoeManyullyn);
                    }
                }
            }
            //gems
            if (OreInAMillionConfig.isGemsEnabled){
                //amethyst
                if (OreInAMillionConfig.isAmethystEnabled){
                    OreDictionary.registerOre("swordAmethyst", ModTools.swordAmethyst);
                    OreDictionary.registerOre("pickaxeAmethyst", ModTools.pickaxeAmethyst);
                    OreDictionary.registerOre("axeAmethyst", ModTools.axeAmethyst);
                    OreDictionary.registerOre("shovelAmethyst", ModTools.shovelAmethyst);
                    OreDictionary.registerOre("hoeAmethyst", ModTools.hoeAmethyst);
                }
                //peridot
                if (OreInAMillionConfig.isPeridotEnabled){
                    OreDictionary.registerOre("swordPeridot", ModTools.swordPeridot);
                    OreDictionary.registerOre("pickaxePeridot", ModTools.pickaxePeridot);
                    OreDictionary.registerOre("axePeridot", ModTools.axePeridot);
                    OreDictionary.registerOre("shovelPeridot", ModTools.shovelPeridot);
                    OreDictionary.registerOre("hoePeridot", ModTools.hoePeridot);
                }
                //ruby
                if (OreInAMillionConfig.isRubyEnabled){
                    OreDictionary.registerOre("swordRuby", ModTools.swordRuby);
                    OreDictionary.registerOre("pickaxeRuby", ModTools.pickaxeRuby);
                    OreDictionary.registerOre("axeRuby", ModTools.axeRuby);
                    OreDictionary.registerOre("shovelRuby", ModTools.shovelRuby);
                    OreDictionary.registerOre("hoeRuby", ModTools.hoeRuby);
                }
                //sapphire
                if (OreInAMillionConfig.isSapphireEnabled){
                    OreDictionary.registerOre("swordSapphire", ModTools.swordSapphire);
                    OreDictionary.registerOre("pickaxeSapphire", ModTools.pickaxeSapphire);
                    OreDictionary.registerOre("axeSapphire", ModTools.axeSapphire);
                    OreDictionary.registerOre("shovelSapphire", ModTools.shovelSapphire);
                    OreDictionary.registerOre("hoeSapphire", ModTools.hoeSapphire);
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
                    OreDictionary.registerOre("swordCharcoal", ModTools.swordCharcoal);
                    OreDictionary.registerOre("pickaxeCharcoal", ModTools.pickaxeCharcoal);
                    OreDictionary.registerOre("axeCharcoal", ModTools.axeCharcoal);
                    OreDictionary.registerOre("shovelCharcoal", ModTools.shovelCharcoal);
                    OreDictionary.registerOre("hoeCharcoal", ModTools.hoeCharcoal);
                }
                //coal
                if (OreInAMillionConfig.isCoalEnabled) {
                    OreDictionary.registerOre("swordCoal", ModTools.swordCoal);
                    OreDictionary.registerOre("pickaxeCoal", ModTools.pickaxeCoal);
                    OreDictionary.registerOre("axeCoal", ModTools.axeCoal);
                    OreDictionary.registerOre("shovelCoal", ModTools.shovelCoal);
                    OreDictionary.registerOre("hoeCoal", ModTools.hoeCoal);
                }
                //diamond
                if (OreInAMillionConfig.isDiamondEnabled) {

                }
                //emerald
                if (OreInAMillionConfig.isEmeraldEnabled) {
                    OreDictionary.registerOre("swordEmerald", ModTools.swordEmerald);
                    OreDictionary.registerOre("pickaxeEmerald", ModTools.pickaxeEmerald);
                    OreDictionary.registerOre("axeEmerald", ModTools.axeEmerald);
                    OreDictionary.registerOre("shovelEmerald", ModTools.shovelEmerald);
                    OreDictionary.registerOre("hoeEmerald", ModTools.hoeEmerald);
                }
                //quartz
                if (OreInAMillionConfig.isQuartzEnabled){
                    OreDictionary.registerOre("swordQuartz", ModTools.swordQuartz);
                    OreDictionary.registerOre("pickaxeQuartz", ModTools.pickaxeQuartz);
                    OreDictionary.registerOre("axeQuartz", ModTools.axeQuartz);
                    OreDictionary.registerOre("shovelQuartz", ModTools.shovelQuartz);
                    OreDictionary.registerOre("hoeQuartz", ModTools.hoeQuartz);
                }
            }
            if (OreInAMillionConfig.isSillyStuffEnabled){

            }
        }
    }
}
