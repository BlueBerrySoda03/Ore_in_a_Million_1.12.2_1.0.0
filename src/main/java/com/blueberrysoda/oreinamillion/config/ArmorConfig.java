package com.blueberrysoda.oreinamillion.config;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.File;

public class ArmorConfig {
    public static boolean isAdamantineArmorEnabled;
    public static boolean isAluminumArmorEnabled;
    public static boolean isArditeArmorEnabled;
    public static boolean isChromeArmorEnabled;
    public static boolean isCobaltArmorEnabled;
    public static boolean isCopperArmorEnabled;
    public static boolean isEnderArmorEnabled;
    public static boolean isIridiumArmorEnabled;
    public static boolean isLeadArmorEnabled;
    public static boolean isMithrilArmorEnabled;
    public static boolean isNickelArmorEnabled;
    public static boolean isOsmiumArmorEnabled;
    public static boolean isPlatinumArmorEnabled;
    public static boolean isSilverArmorEnabled;
    public static boolean isTinArmorEnabled;
    public static boolean isTitaniumArmorEnabled;
    public static boolean isTungstenArmorEnabled;
    public static boolean isUraniumArmorEnabled;
    public static boolean isZincArmorEnabled;

    public static boolean isBrassArmorEnabled;
    public static boolean isBronzeArmorEnabled;
    public static boolean isConstantanArmorEnabled;
    public static boolean isElectrumArmorEnabled;
    public static boolean isEnderiumArmorEnabled;
    public static boolean isFairyArmorEnabled;
    public static boolean isInvarArmorEnabled;
    public static boolean isKnightSlimeArmorEnabled;
    public static boolean isLumiumArmorEnabled;
    public static boolean isManyullynArmorEnabled;
    public static boolean isPigIronArmorEnabled;
    public static boolean isSignalumArmorEnabled;
    public static boolean isSteelArmorEnabled;
    public static boolean isVoidBornArmorEnabled;

    public static boolean isAmethystArmorEnabled;
    public static boolean isGarnetArmorEnabled;
    public static boolean isOpalArmorEnabled;
    public static boolean isPearlArmorEnabled;
    public static boolean isPeridotArmorEnabled;
    public static boolean isRubyArmorEnabled;
    public static boolean isSapphireArmorEnabled;

    public static boolean isCharcoaliumArmorEnabled;
    public static boolean isCoaliumArmorEnabled;
    public static boolean isGlowizeArmorEnabled;
    public static boolean isLapiteArmorEnabled;
    public static boolean isQuartziumArmorEnabled;

    public static boolean theNothingSwitch;

    public static void init(FMLPreInitializationEvent event) {
        Configuration config = new Configuration(new File(event.getModConfigurationDirectory().getPath() + "/oreinamillion/armor.cfg"));
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
            categoryVanilla = "6 - Vanilla";

            config.addCustomCategoryComment(categoryInfo, "This config file decides if you want to disable armors based on material. If you want to disabled something specific, such as Aluminum Chestplate, please just use crafttweaker. [Nothing or Nothing]");

            theNothingSwitch = config.getBoolean("The Nothing Switch", categoryInfo, false, "It does nothing :D");

            config.addCustomCategoryComment(categoryBase, "Base Ingots. AKA: Ingots you can get from an ore. [True or False]");

            isAdamantineArmorEnabled = config.getBoolean("Is Adamantine Armor Enabled?", categoryBase, true, "Do you want Adamantine Armor to be enabled?");
            isAluminumArmorEnabled = config.getBoolean("Is Aluminum Armor Enabled?", categoryBase, true, "Do you want Aluminum Armor to be enabled?");
            isArditeArmorEnabled = config.getBoolean("Is Ardite Armor Enabled?", categoryBase, true, "Do you want Ardite Armor to be enabled?");
            isChromeArmorEnabled = config.getBoolean("Is Chrome Armor Enabled?", categoryBase, true, "Do you want Chrome Armor to be enabled?");
            isCobaltArmorEnabled = config.getBoolean("Is Cobalt Armor Enabled?", categoryBase, true, "Do you want Cobalt Armor to be enabled?");
            isCopperArmorEnabled = config.getBoolean("Is Copper Armor Enabled?", categoryBase, true, "Do you want Copper Armor to be enabled?");
            isEnderArmorEnabled = config.getBoolean("Is Ender Armor Enabled?", categoryBase, true, "Do you want Ender Armor to be enabled?");
            isIridiumArmorEnabled = config.getBoolean("Is Iridium Armor Enabled?", categoryBase, true, "Do you want Iridium Armor to be enabled?");
            isLeadArmorEnabled = config.getBoolean("Is Lead Armor Enabled?", categoryBase, true, "Do you want Lead Armor to be enabled?");
            isMithrilArmorEnabled = config.getBoolean("Is Mithril Armor Enabled?", categoryBase, true, "Do you want Mithril Armor to be enabled?");
            isNickelArmorEnabled = config.getBoolean("Is Nickel Armor Enabled?", categoryBase, true, "Do you want Nickel Armor to be enabled?");
            isOsmiumArmorEnabled = config.getBoolean("Is Osmium Armor Enabled?", categoryBase, true, "Do you want Osmium Armor to be enabled?");
            isPlatinumArmorEnabled = config.getBoolean("Is Platinum Armor Enabled?", categoryBase, true, "Do you want Platinum Armor to be enabled?");
            isSilverArmorEnabled = config.getBoolean("Is Silver Armor Enabled?", categoryBase, true, "Do you want Silver Armor to be enabled?");
            isTinArmorEnabled = config.getBoolean("Is Tin Armor Enabled?", categoryBase, true, "Do you want Tin Armor to be enabled?");
            isTitaniumArmorEnabled = config.getBoolean("Is Titanium Armor Enabled?", categoryBase, true, "Do you want Titanium Armor to be enabled?");
            isTungstenArmorEnabled = config.getBoolean("Is Tungsten Armor Enabled?", categoryBase, true, "Do you want Tungsten Armor to be enabled?");
            isUraniumArmorEnabled = config.getBoolean("Is Uranium Armor Enabled?", categoryBase, true, "Do you want Uranium Armor to be enabled?");
            isZincArmorEnabled = config.getBoolean("Is Zinc Armor Enabled?", categoryBase, true, "Do you want Zinc Armor to be enabled?");

            config.addCustomCategoryComment(categoryAlloy, "Alloy Ingots. AKA: Ingots that are made from other ingots and/or elements. [True or False]");

            isBrassArmorEnabled = config.getBoolean("Is Brass Armor Enabled?", categoryAlloy, true, "Do you want Brass Armor to be enabled?");
            isBronzeArmorEnabled = config.getBoolean("Is Bronze Armor Enabled?", categoryAlloy, true, "Do you want Bronze Armor to be enabled?");
            isConstantanArmorEnabled = config.getBoolean("Is Constantan Armor Enabled?", categoryAlloy, true, "Do you want Constantan Armor to be enabled?");
            isElectrumArmorEnabled = config.getBoolean("Is Electrum Armor Enabled?", categoryAlloy, true, "Do you want Electrum Armor to be enabled?");
            isEnderiumArmorEnabled = config.getBoolean("Is Enderium Armor Enabled?", categoryAlloy, true, "Do you want Enderium Armor to be enabled?");
            isFairyArmorEnabled = config.getBoolean("Is Fairy Armor Enabled?", categoryAlloy, true, "Do you want Fairy Armor to be enabled?");
            isInvarArmorEnabled = config.getBoolean("Is Invar Armor Enabled?", categoryAlloy, true, "Do you want Invar Armor to be enabled?");
            isKnightSlimeArmorEnabled = config.getBoolean("Is KnightSlime Armor Enabled?", categoryAlloy, true, "Do you want KnightSlime Armor to be enabled?");
            isLumiumArmorEnabled = config.getBoolean("Is Lumium Armor Enabled?", categoryAlloy, true, "Do you want Lumium Armor to be enabled?");
            isManyullynArmorEnabled = config.getBoolean("Is Manyullyn Armor Enabled?", categoryAlloy, true, "Do you want Manyullyn Armor to be enabled?");
            isPigIronArmorEnabled = config.getBoolean("Is PigIron Armor Enabled?", categoryAlloy, true, "Do you want PigIron Armor to be enabled?");
            isSignalumArmorEnabled = config.getBoolean("Is Signalum Armor Enabled?", categoryAlloy, true, "Do you want Signalum Armor to be enabled?");
            isSteelArmorEnabled = config.getBoolean("Is Steel Armor Enabled?", categoryAlloy, true, "Do you want Steel Armor to be enabled?");
            isVoidBornArmorEnabled = config.getBoolean("Is VoidBorn Armor Enabled?", categoryAlloy, true, "Do you want VoidBorn Armor to be enabled?");

            config.addCustomCategoryComment(categoryGem, "Gems. AKA: Shiny things, like diamonds and emeralds. [True or False]");

            isAmethystArmorEnabled = config.getBoolean("Is Amethyst Armor Enabled?", categoryGem, true, "Do you want Amethyst Armor to be enabled?");
            isGarnetArmorEnabled = config.getBoolean("Is Garnet Armor Enabled?", categoryGem, true, "Do you want Garnet Armor to be enabled?");
            isOpalArmorEnabled = config.getBoolean("Is Opal Armor Enabled?", categoryGem, true, "Do you want Opal Armor to be enabled?");
            isPearlArmorEnabled = config.getBoolean("Is Pearl Armor Enabled?", categoryGem, true, "Do you want Pearl Armor to be enabled?");
            isPeridotArmorEnabled = config.getBoolean("Is Peridot Armor Enabled?", categoryGem, true, "Do you want Peridot Armor to be enabled?");
            isRubyArmorEnabled = config.getBoolean("Is Ruby Armor Enabled?", categoryGem, true, "Do you want Ruby Armor to be enabled?");
            isSapphireArmorEnabled = config.getBoolean("Is Sapphire Armor Enabled?", categoryGem, true, "Do you want Sapphire Armor to be enabled?");

            config.addCustomCategoryComment(categoryVanilla, "Vanilla Additions. AKA: Things that I added that expand on the already available vanilla elements. [True or False]");

            isCharcoaliumArmorEnabled = config.getBoolean("Is Charcoalium Armor Enabled?", categoryVanilla, true, "Do you want Charcoalium Armor to be enabled?");
            isCoaliumArmorEnabled = config.getBoolean("Is Coalium Armor Enabled?", categoryVanilla, true, "Do you want Coalium Armor to be enabled?");
            isGlowizeArmorEnabled = config.getBoolean("Is Glowize Armor Enabled?", categoryVanilla, true, "Do you want Glowize Armor to be enabled?");
            isLapiteArmorEnabled = config.getBoolean("Is Lapite Armor Enabled?", categoryVanilla, true, "Do you want Lapite Armor to be enabled?");
            isQuartziumArmorEnabled = config.getBoolean("Is Quartzium Armor Enabled?", categoryVanilla, true, "Do you want Quartzium Armor to be enabled?");

        } catch (Exception e) {
            System.out.println("error in config/oreinamillion/armor.cfg... setting default values...");
        } finally {
            config.save();
        }
    }
}