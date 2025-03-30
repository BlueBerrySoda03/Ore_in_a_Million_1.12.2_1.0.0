package com.blueberrysoda.oreinamillion.config;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.File;

public class MineralsConfig {
    public static boolean isAdamantineEnabled;
    public static boolean isAluminumEnabled;
    public static boolean isArditeEnabled;
    public static boolean isChromeEnabled;
    public static boolean isCobaltEnabled;
    public static boolean isCopperEnabled;
    public static boolean isEnderEnabled;
    public static boolean isIridiumEnabled;
    public static boolean isLeadEnabled;
    public static boolean isMercuryEnabled;
    public static boolean isMithrilEnabled;
    public static boolean isNickelEnabled;
    public static boolean isOsmiumEnabled;
    public static boolean isPlatinumEnabled;
    public static boolean isSilverEnabled;
    public static boolean isTinEnabled;
    public static boolean isTitaniumEnabled;
    public static boolean isTungstenEnabled;
    public static boolean isUraniumEnabled;
    public static boolean isZincEnabled;

    public static boolean isBrassEnabled;
    public static boolean isBronzeEnabled;
    public static boolean isConstantanEnabled;
    public static boolean isElectrumEnabled;
    public static boolean isEnderiumEnabled;
    public static boolean isFairyEnabled;
    public static boolean isInvarEnabled;
    public static boolean isKnightSlimeEnabled;
    public static boolean isLumiumEnabled;
    public static boolean isManyullynEnabled;
    public static boolean isPigIronEnabled;
    public static boolean isSignalumEnabled;
    public static boolean isSteelEnabled;
    public static boolean isVoidBornEnabled;

    public static boolean isAmethystEnabled;
    public static boolean isPeridotEnabled;
    public static boolean isRubyEnabled;
    public static boolean isSapphireEnabled;

    public static boolean isCarbonEnabled;
    public static boolean isCinnabarEnabled;
    public static boolean isSiliconEnabled;
    public static boolean isSulfurEnabled;

    public static boolean isCharcoalEnabled;
    public static boolean isCharcoaliumEnabled;
    public static boolean isCoalEnabled;
    public static boolean isCoaliumEnabled;
    public static boolean isDiamondEnabled;
    public static boolean isEmeraldEnabled;
    public static boolean isGlowizeEnabled;
    public static boolean isGoldEnabled;
    public static boolean isIronEnabled;
    public static boolean isLapisEnabled;
    public static boolean isLapiteEnabled;
    public static boolean isQuartzEnabled;
    public static boolean isQuartziumEnabled;

    public static boolean theNothingSwitch;

    public static void init(FMLPreInitializationEvent event) {
        Configuration config = new Configuration(new File(event.getModConfigurationDirectory().getPath() + "/oreinamillion/minerals.cfg"));
        try {
            String categoryInfo;
            String categoryBase;
            String categoryAlloy;
            String categoryGem;
            String categoryElement;
            String categoryVanilla;

            categoryInfo = "1 - Info";
            categoryBase = "2 - Base";
            categoryAlloy = "3 - Alloys";
            categoryGem = "4 - Gems";
            categoryElement = "5 - Elements";
            categoryVanilla = "6 - Vanilla";

            config.addCustomCategoryComment(categoryInfo, "This config file decides if you want to completely disable a certain mineral. This includes: Items, Blocks, Tools, Armor, Armor Events, and Ore Generation. [Nothing or Nothing]");

            theNothingSwitch = config.getBoolean("The Nothing Switch", categoryInfo, false, "It does nothing :D");

            config.addCustomCategoryComment(categoryBase, "Base Ingots. AKA: Ingots you can get from an ore. [True or False]");

            isAdamantineEnabled = config.getBoolean("Is Adamantine Enabled?", categoryBase, true, "Do you want Adamantine to be enabled?");
            isAluminumEnabled = config.getBoolean("Is Aluminum Enabled?", categoryBase, true, "Do you want Aluminum to be enabled?");
            isArditeEnabled = config.getBoolean("Is Ardite Enabled?", categoryBase, true, "Do you want Ardite to be enabled?");
            isChromeEnabled = config.getBoolean("Is Chrome Enabled?", categoryBase, true, "Do you want Chrome to be enabled?");
            isCobaltEnabled = config.getBoolean("Is Cobalt Enabled?", categoryBase, true, "Do you want Cobalt to be enabled?");
            isCopperEnabled = config.getBoolean("Is Copper Enabled?", categoryBase, true, "Do you want Copper to be enabled?");
            isEnderEnabled = config.getBoolean("Is Ender Enabled?", categoryBase, true, "Do you want Ender to be enabled?");
            isIridiumEnabled = config.getBoolean("Is Iridium Enabled?", categoryBase, true, "Do you want Iridium to be enabled?");
            isLeadEnabled = config.getBoolean("Is Lead Enabled?", categoryBase, true, "Do you want Lead to be enabled?");
            isMercuryEnabled = config.getBoolean("Is Mercury Enabled?", categoryBase, true, "Do you want Mercury to be enabled?");
            isMithrilEnabled = config.getBoolean("Is Mithril Enabled?", categoryBase, true, "Do you want Mithril to be enabled?");
            isNickelEnabled = config.getBoolean("Is Nickel Enabled?", categoryBase, true, "Do you want Nickel to be enabled?");
            isOsmiumEnabled = config.getBoolean("Is Osmium Enabled?", categoryBase, true, "Do you want Osmium to be enabled?");
            isPlatinumEnabled = config.getBoolean("Is Platinum Enabled?", categoryBase, true, "Do you want Platinum to be enabled?");
            isSilverEnabled = config.getBoolean("Is Silver Enabled?", categoryBase, true, "Do you want Silver to be enabled?");
            isTinEnabled = config.getBoolean("Is Tin Enabled?", categoryBase, true, "Do you want Tin to be enabled?");
            isTitaniumEnabled = config.getBoolean("Is Titanium Enabled?", categoryBase, true, "Do you want Titanium to be enabled?");
            isTungstenEnabled = config.getBoolean("Is Tungsten Enabled?", categoryBase, true, "Do you want Tungsten to be enabled?");
            isUraniumEnabled = config.getBoolean("Is Uranium Enabled?", categoryBase, true, "Do you want Uranium to be enabled?");
            isZincEnabled = config.getBoolean("Is Zinc Enabled?", categoryBase, true, "Do you want Zinc to be enabled?");

            config.addCustomCategoryComment(categoryAlloy, "Alloy Ingots. AKA: Ingots that are made from other ingots and/or elements. [True or False]");

            isBrassEnabled = config.getBoolean("Is Brass Enabled?", categoryAlloy, true, "Do you want Brass to be enabled?");
            isBronzeEnabled = config.getBoolean("Is Bronze Enabled?", categoryAlloy, true, "Do you want Bronze to be enabled?");
            isConstantanEnabled = config.getBoolean("Is Constantan Enabled?", categoryAlloy, true, "Do you want Constantan to be enabled?");
            isElectrumEnabled = config.getBoolean("Is Electrum Enabled?", categoryAlloy, true, "Do you want Electrum to be enabled?");
            isEnderiumEnabled = config.getBoolean("Is Enderium Enabled?", categoryAlloy, true, "Do you want Enderium to be enabled?");
            isFairyEnabled = config.getBoolean("Is Fairy Enabled?", categoryAlloy, true, "Do you want Fairy to be enabled?");
            isInvarEnabled = config.getBoolean("Is Invar Enabled?", categoryAlloy, true, "Do you want Invar to be enabled?");
            isKnightSlimeEnabled = config.getBoolean("Is KnightSlime Enabled?", categoryAlloy, true, "Do you want KnightSlime to be enabled?");
            isLumiumEnabled = config.getBoolean("Is Lumium Enabled?", categoryAlloy, true, "Do you want Lumium to be enabled?");
            isManyullynEnabled = config.getBoolean("Is Manyullyn Enabled?", categoryAlloy, true, "Do you want Manyullyn to be enabled?");
            isPigIronEnabled = config.getBoolean("Is PigIron Enabled?", categoryAlloy, true, "Do you want PigIron to be enabled?");
            isSignalumEnabled = config.getBoolean("Is Signalum Enabled?", categoryAlloy, true, "Do you want Signalum to be enabled?");
            isSteelEnabled = config.getBoolean("Is Steel Enabled?", categoryAlloy, true, "Do you want Steel to be enabled?");
            isVoidBornEnabled = config.getBoolean("Is VoidBorn Enabled?", categoryAlloy, true, "Do you want VoidBorn to be enabled?");

            config.addCustomCategoryComment(categoryGem, "Gems. AKA: Shiny things, like diamonds and emeralds. [True or False]");

            isAmethystEnabled = config.getBoolean("Is Amethyst Enabled?", categoryGem, true, "Do you want Amethyst to be enabled?");
            isPeridotEnabled = config.getBoolean("Is Peridot Enabled?", categoryGem, true, "Do you want Peridot to be enabled?");
            isRubyEnabled = config.getBoolean("Is Ruby Enabled?", categoryGem, true, "Do you want Ruby to be enabled?");
            isSapphireEnabled = config.getBoolean("Is Sapphire Enabled?", categoryGem, true, "Do you want Sapphire to be enabled?");

            config.addCustomCategoryComment(categoryElement, "Elements. AKA: Things that make different things. [True or False]");

            isCarbonEnabled = config.getBoolean("Is Carbon Enabled?", categoryElement, true, "Do you want Carbon to be enabled?");
            isCinnabarEnabled = config.getBoolean("Is Cinnabar Enabled?", categoryElement, true, "Do you want Cinnabar to be enabled?");
            isSiliconEnabled = config.getBoolean("Is Silicon Enabled?", categoryElement, true, "Do you want Silicon to be enabled?");
            isSulfurEnabled = config.getBoolean("Is Sulfur Enabled?", categoryElement, true, "Do you want Sulfur to be enabled?");

            config.addCustomCategoryComment(categoryVanilla, "Vanilla Additions. AKA: Things that I added that expand on the already available vanilla elements. [True or False]");

            isCharcoalEnabled = config.getBoolean("Is Charcoal Enabled?", categoryVanilla, true, "Do you want Charcoal to be enabled?");
            isCharcoaliumEnabled = config.getBoolean("Is Charcoalium Enabled?", categoryVanilla, true, "Do you want Charcoalium to be enabled?");
            isCoalEnabled = config.getBoolean("Is Coal Enabled?", categoryVanilla, true, "Do you want Coal to be enabled?");
            isCoaliumEnabled = config.getBoolean("Is Coalium Enabled?", categoryVanilla, true, "Do you want Coalium to be enabled?");
            isDiamondEnabled = config.getBoolean("Is Diamond Enabled?", categoryVanilla, true, "Do you want Diamond to be enabled?");
            isEmeraldEnabled = config.getBoolean("Is Emerald Enabled?", categoryVanilla, true, "Do you want Emerald to be enabled?");
            isGlowizeEnabled = config.getBoolean("Is Glowize Enabled?", categoryVanilla, true, "Do you want Glowize to be enabled?");
            isGoldEnabled = config.getBoolean("Is Gold Enabled?", categoryVanilla, true, "Do you want Gold to be enabled?");
            isIronEnabled = config.getBoolean("Is Iron Enabled?", categoryVanilla, true, "Do you want Iron to be enabled?");
            isLapisEnabled = config.getBoolean("Is Lapis Enabled?", categoryVanilla, true, "Do you want Lapis to be enabled?");
            isLapiteEnabled = config.getBoolean("Is Lapite Enabled?", categoryVanilla, true, "Do you want Lapite to be enabled?");
            isQuartzEnabled = config.getBoolean("Is Quartz Enabled?", categoryVanilla, true, "Do you want Quartz to be enabled?");
            isQuartziumEnabled = config.getBoolean("Is Quartzium Enabled?", categoryVanilla, true, "Do you want Quartzium to be enabled?");

        } catch (Exception e) {
            System.out.println("error in config/oreinamillion/minerals.cfg... setting default values...");
        } finally {
            config.save();
        }
    }
}
