package com.blueberrysoda.oreinamillion.config;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.File;

public class ToolsConfig {
    public static boolean isAdamantineToolsEnabled;
    public static boolean isAluminumToolsEnabled;
    public static boolean isArditeToolsEnabled;
    public static boolean isChromeToolsEnabled;
    public static boolean isCobaltToolsEnabled;
    public static boolean isCopperToolsEnabled;
    public static boolean isEnderToolsEnabled;
    public static boolean isIridiumToolsEnabled;
    public static boolean isLeadToolsEnabled;
    public static boolean isMithrilToolsEnabled;
    public static boolean isNickelToolsEnabled;
    public static boolean isOsmiumToolsEnabled;
    public static boolean isPlatinumToolsEnabled;
    public static boolean isSilverToolsEnabled;
    public static boolean isTinToolsEnabled;
    public static boolean isTitaniumToolsEnabled;
    public static boolean isTungstenToolsEnabled;
    public static boolean isUraniumToolsEnabled;
    public static boolean isZincToolsEnabled;

    public static boolean isBrassToolsEnabled;
    public static boolean isBronzeToolsEnabled;
    public static boolean isConstantanToolsEnabled;
    public static boolean isElectrumToolsEnabled;
    public static boolean isEnderiumToolsEnabled;
    public static boolean isFairyToolsEnabled;
    public static boolean isInvarToolsEnabled;
    public static boolean isKnightSlimeToolsEnabled;
    public static boolean isLumiumToolsEnabled;
    public static boolean isManyullynToolsEnabled;
    public static boolean isPigIronToolsEnabled;
    public static boolean isSignalumToolsEnabled;
    public static boolean isSteelToolsEnabled;
    public static boolean isVoidBornToolsEnabled;

    public static boolean isAmethystToolsEnabled;
    public static boolean isGarnetToolsEnabled;
    public static boolean isOpalToolsEnabled;
    public static boolean isPearlToolsEnabled;
    public static boolean isPeridotToolsEnabled;
    public static boolean isRubyToolsEnabled;
    public static boolean isSapphireToolsEnabled;

    public static boolean isCharcoalToolsEnabled;
    public static boolean isCharcoaliumToolsEnabled;
    public static boolean isCoaliumToolsEnabled;
    public static boolean isCoalToolsEnabled;
    public static boolean isGlowizeToolsEnabled;
    public static boolean isLapisToolsEnabled;
    public static boolean isLapiteToolsEnabled;
    public static boolean isQuartziumToolsEnabled;
    public static boolean isQuartzToolsEnabled;

    public static boolean theNothingSwitch;

    public static void init(FMLPreInitializationEvent event) {
        Configuration config = new Configuration(new File(event.getModConfigurationDirectory().getPath() + "/oreinamillion/tools.cfg"));
        try {
            String categoryInfo;
            String categoryBase;
            String categoryAlloy;
            String categoryGem;
            String categoryVanilla;

            categoryInfo = "1 - Info";
            categoryBase = "2 - Base";
            categoryAlloy = "3 - Alloys";
            categoryGem = "4 - Gems";
            categoryVanilla = "5 - Vanilla";

            config.addCustomCategoryComment(categoryInfo, "This config file decides if you want to disable specific tools based on the mineral. If you want to disabled specific tools, such as the Aluminum Pickaxe, please just use crafttweaker. [Nothing or Nothing]");

            theNothingSwitch = config.getBoolean("The Nothing Switch", categoryInfo, false, "It does nothing :D");

            config.addCustomCategoryComment(categoryBase, "Base Ingots. AKA: Ingots you can get from an ore. [True or False]");

            isAdamantineToolsEnabled = config.getBoolean("Is Adamantine Tools Enabled?", categoryBase, true, "Do you want Adamantine Tools to be enabled?");
            isAluminumToolsEnabled = config.getBoolean("Is Aluminum Tools Enabled?", categoryBase, true, "Do you want Aluminum Tools to be enabled?");
            isArditeToolsEnabled = config.getBoolean("Is Ardite Tools Enabled?", categoryBase, true, "Do you want Ardite Tools to be enabled?");
            isChromeToolsEnabled = config.getBoolean("Is Chrome Tools Enabled?", categoryBase, true, "Do you want Chrome Tools to be enabled?");
            isCobaltToolsEnabled = config.getBoolean("Is Cobalt Tools Enabled?", categoryBase, true, "Do you want Cobalt Tools to be enabled?");
            isCopperToolsEnabled = config.getBoolean("Is Copper Tools Enabled?", categoryBase, true, "Do you want Copper Tools to be enabled?");
            isEnderToolsEnabled = config.getBoolean("Is Ender Tools Enabled?", categoryBase, true, "Do you want Ender Tools to be enabled?");
            isIridiumToolsEnabled = config.getBoolean("Is Iridium Tools Enabled?", categoryBase, true, "Do you want Iridium Tools to be enabled?");
            isLeadToolsEnabled = config.getBoolean("Is Lead Tools Enabled?", categoryBase, true, "Do you want Lead Tools to be enabled?");
            isMithrilToolsEnabled = config.getBoolean("Is Mithril Tools Enabled?", categoryBase, true, "Do you want Mithril Tools to be enabled?");
            isNickelToolsEnabled = config.getBoolean("Is Nickel Tools Enabled?", categoryBase, true, "Do you want Nickel Tools to be enabled?");
            isOsmiumToolsEnabled = config.getBoolean("Is Osmium Tools Enabled?", categoryBase, true, "Do you want Osmium Tools to be enabled?");
            isPlatinumToolsEnabled = config.getBoolean("Is Platinum Tools Enabled?", categoryBase, true, "Do you want Platinum Tools to be enabled?");
            isSilverToolsEnabled = config.getBoolean("Is Silver Tools Enabled?", categoryBase, true, "Do you want Silver Tools to be enabled?");
            isTinToolsEnabled = config.getBoolean("Is Tin Tools Enabled?", categoryBase, true, "Do you want Tin Tools to be enabled?");
            isTitaniumToolsEnabled = config.getBoolean("Is Titanium Tools Enabled?", categoryBase, true, "Do you want Titanium Tools to be enabled?");
            isTungstenToolsEnabled = config.getBoolean("Is Tungsten Tools Enabled?", categoryBase, true, "Do you want Tungsten Tools to be enabled?");
            isUraniumToolsEnabled = config.getBoolean("Is Uranium Tools Enabled?", categoryBase, true, "Do you want Uranium Tools to be enabled?");
            isZincToolsEnabled = config.getBoolean("Is Zinc Tools Enabled?", categoryBase, true, "Do you want Zinc Tools to be enabled?");

            config.addCustomCategoryComment(categoryAlloy, "Alloy Ingots. AKA: Ingots that are made from other ingots and/or elements. [True or False]");

            isBrassToolsEnabled = config.getBoolean("Is Brass Tools Enabled?", categoryAlloy, true, "Do you want Brass Tools to be enabled?");
            isBronzeToolsEnabled = config.getBoolean("Is Bronze Tools Enabled?", categoryAlloy, true, "Do you want Bronze Tools to be enabled?");
            isConstantanToolsEnabled = config.getBoolean("Is Constantan Tools Enabled?", categoryAlloy, true, "Do you want Constantan Tools to be enabled?");
            isElectrumToolsEnabled = config.getBoolean("Is Electrum Tools Enabled?", categoryAlloy, true, "Do you want Electrum Tools to be enabled?");
            isEnderiumToolsEnabled = config.getBoolean("Is Enderium Tools Enabled?", categoryAlloy, true, "Do you want Enderium Tools to be enabled?");
            isFairyToolsEnabled = config.getBoolean("Is Fairy Tools Enabled?", categoryAlloy, true, "Do you want Fairy Tools to be enabled?");
            isInvarToolsEnabled = config.getBoolean("Is Invar Tools Enabled?", categoryAlloy, true, "Do you want Invar Tools to be enabled?");
            isKnightSlimeToolsEnabled = config.getBoolean("Is KnightSlime Tools Enabled?", categoryAlloy, true, "Do you want KnightSlime Tools to be enabled?");
            isLumiumToolsEnabled = config.getBoolean("Is Lumium Tools Enabled?", categoryAlloy, true, "Do you want Lumium Tools to be enabled?");
            isManyullynToolsEnabled = config.getBoolean("Is Manyullyn Tools Enabled?", categoryAlloy, true, "Do you want Manyullyn Tools to be enabled?");
            isPigIronToolsEnabled = config.getBoolean("Is PigIron Tools Enabled?", categoryAlloy, true, "Do you want PigIron Tools to be enabled?");
            isSignalumToolsEnabled = config.getBoolean("Is Signalum Tools Enabled?", categoryAlloy, true, "Do you want Signalum Tools to be enabled?");
            isSteelToolsEnabled = config.getBoolean("Is Steel Tools Enabled?", categoryAlloy, true, "Do you want Steel Tools to be enabled?");
            isVoidBornToolsEnabled = config.getBoolean("Is VoidBorn Tools Enabled?", categoryAlloy, true, "Do you want VoidBorn Tools to be enabled?");

            config.addCustomCategoryComment(categoryGem, "Gems. AKA: Shiny things, like diamonds and emeralds. [True or False]");

            isAmethystToolsEnabled = config.getBoolean("Is Amethyst Tools Enabled?", categoryGem, true, "Do you want Amethyst Tools to be enabled?");
            isGarnetToolsEnabled = config.getBoolean("Is Garnet Tools Enabled?", categoryGem, true, "Do you want Garnet Tools to be enabled?");
            isOpalToolsEnabled = config.getBoolean("Is Opal Tools Enabled?", categoryGem, true, "Do you want Opal Tools to be enabled?");
            isPearlToolsEnabled = config.getBoolean("Is Pearl Tools Enabled?", categoryGem, true, "Do you want Pearl Tools to be enabled?");
            isPeridotToolsEnabled = config.getBoolean("Is Peridot Tools Enabled?", categoryGem, true, "Do you want Peridot Tools to be enabled?");
            isRubyToolsEnabled = config.getBoolean("Is Ruby Tools Enabled?", categoryGem, true, "Do you want Ruby Tools to be enabled?");
            isSapphireToolsEnabled = config.getBoolean("Is Sapphire Tools Enabled?", categoryGem, true, "Do you want Sapphire Tools to be enabled?");

            config.addCustomCategoryComment(categoryVanilla, "Vanilla Additions. AKA: Things that I added that expand on the already available vanilla elements. [True or False]");

            isCharcoalToolsEnabled = config.getBoolean("Is Charcoal Tools Enabled?", categoryVanilla, true, "Do you want Charcoal Tools to be enabled?");
            isCharcoaliumToolsEnabled = config.getBoolean("Is Charcoalium Tools Enabled?", categoryVanilla, true, "Do you want Charcoalium Tools to be enabled?");
            isCoalToolsEnabled = config.getBoolean("Is Coal Tools Enabled?", categoryVanilla, true, "Do you want Coal Tools to be enabled?");
            isCoaliumToolsEnabled = config.getBoolean("Is Coalium Tools Enabled?", categoryVanilla, true, "Do you want Coalium Tools to be enabled?");
            isGlowizeToolsEnabled = config.getBoolean("Is Glowize Tools Enabled?", categoryVanilla, true, "Do you want Glowize Tools to be enabled?");
            isLapisToolsEnabled = config.getBoolean("Is Lapis Tools Enabled?", categoryVanilla, true, "Do you want Lapis Tools to be enabled?");
            isLapiteToolsEnabled = config.getBoolean("Is Lapite Tools Enabled?", categoryVanilla, true, "Do you want Lapite Tools to be enabled?");
            isQuartzToolsEnabled = config.getBoolean("Is Quartz Tools Enabled?", categoryVanilla, true, "Do you want Quartz Tools to be enabled?");
            isQuartziumToolsEnabled = config.getBoolean("Is Quartzium Tools Enabled?", categoryVanilla, true, "Do you want Quartzium Tools to be enabled?");

        } catch (Exception e) {
            System.out.println("error in config/oreinamillion/tools.cfg... setting default values...");
        } finally {
            config.save();
        }
    }
}