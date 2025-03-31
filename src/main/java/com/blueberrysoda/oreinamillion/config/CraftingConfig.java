package com.blueberrysoda.oreinamillion.config;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.File;

public class CraftingConfig {
    public static boolean isAdamantineCraftingEnabled;
    public static boolean isAluminumCraftingEnabled;
    public static boolean isArditeCraftingEnabled;
    public static boolean isChromeCraftingEnabled;
    public static boolean isCobaltCraftingEnabled;
    public static boolean isCopperCraftingEnabled;
    public static boolean isEnderCraftingEnabled;
    public static boolean isIridiumCraftingEnabled;
    public static boolean isLeadCraftingEnabled;
    public static boolean isMercuryCraftingEnabled;
    public static boolean isMithrilCraftingEnabled;
    public static boolean isNickelCraftingEnabled;
    public static boolean isOsmiumCraftingEnabled;
    public static boolean isPlatinumCraftingEnabled;
    public static boolean isSilverCraftingEnabled;
    public static boolean isTinCraftingEnabled;
    public static boolean isTitaniumCraftingEnabled;
    public static boolean isTungstenCraftingEnabled;
    public static boolean isUraniumCraftingEnabled;
    public static boolean isZincCraftingEnabled;

    public static boolean isBrassCraftingEnabled;
    public static boolean isBronzeCraftingEnabled;
    public static boolean isConstantanCraftingEnabled;
    public static boolean isElectrumCraftingEnabled;
    public static boolean isEnderiumCraftingEnabled;
    public static boolean isFairyCraftingEnabled;
    public static boolean isInvarCraftingEnabled;
    public static boolean isKnightSlimeCraftingEnabled;
    public static boolean isLumiumCraftingEnabled;
    public static boolean isManyullynCraftingEnabled;
    public static boolean isPigIronCraftingEnabled;
    public static boolean isSignalumCraftingEnabled;
    public static boolean isSteelCraftingEnabled;
    public static boolean isVoidBornCraftingEnabled;

    public static boolean isAmethystCraftingEnabled;
    public static boolean isPeridotCraftingEnabled;
    public static boolean isRubyCraftingEnabled;
    public static boolean isSapphireCraftingEnabled;

    public static boolean isCarbonCraftingEnabled;
    public static boolean isCinnabarCraftingEnabled;
    public static boolean isSiliconCraftingEnabled;
    public static boolean isSulfurCraftingEnabled;

    public static boolean isCharcoalCraftingEnabled;
    public static boolean isCharcoaliumCraftingEnabled;
    public static boolean isCoalCraftingEnabled;
    public static boolean isCoaliumCraftingEnabled;
    public static boolean isDiamondCraftingEnabled;
    public static boolean isEmeraldCraftingEnabled;
    public static boolean isGlowizeCraftingEnabled;
    public static boolean isGoldCraftingEnabled;
    public static boolean isIronCraftingEnabled;
    public static boolean isLapisCraftingEnabled;
    public static boolean isLapiteCraftingEnabled;
    public static boolean isQuartzCraftingEnabled;
    public static boolean isQuartziumCraftingEnabled;

    public static boolean theNothingSwitch;

    public static void init(FMLPreInitializationEvent event) {
        Configuration config = new Configuration(new File(event.getModConfigurationDirectory().getPath() + "/oreinamillion/crafting.cfg"));
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

            config.addCustomCategoryComment(categoryInfo, "This config file decides if you want to disable crafting materials. This would include gears, plates, rods, and tiny dusts (as of now). [Nothing or Nothing]");

            theNothingSwitch = config.getBoolean("The Nothing Switch", categoryInfo, false, "It does nothing :D");

            config.addCustomCategoryComment(categoryBase, "Base Ingots. AKA: Ingots you can get from an ore. [True or False]");

            isAdamantineCraftingEnabled = config.getBoolean("Is Adamantine Crafting Enabled?", categoryBase, true, "Do you want Adamantine Crafting to be enabled?");
            isAluminumCraftingEnabled = config.getBoolean("Is Aluminum Crafting Enabled?", categoryBase, true, "Do you want Aluminum Crafting to be enabled?");
            isArditeCraftingEnabled = config.getBoolean("Is Ardite Crafting Enabled?", categoryBase, true, "Do you want Ardite Crafting to be enabled?");
            isChromeCraftingEnabled = config.getBoolean("Is Chrome Crafting Enabled?", categoryBase, true, "Do you want Chrome Crafting to be enabled?");
            isCobaltCraftingEnabled = config.getBoolean("Is Cobalt Crafting Enabled?", categoryBase, true, "Do you want Cobalt Crafting to be enabled?");
            isCopperCraftingEnabled = config.getBoolean("Is Copper Crafting Enabled?", categoryBase, true, "Do you want Copper Crafting to be enabled?");
            isEnderCraftingEnabled = config.getBoolean("Is Ender Crafting Enabled?", categoryBase, true, "Do you want Ender Crafting to be enabled?");
            isIridiumCraftingEnabled = config.getBoolean("Is Iridium Crafting Enabled?", categoryBase, true, "Do you want Iridium Crafting to be enabled?");
            isLeadCraftingEnabled = config.getBoolean("Is Lead Crafting Enabled?", categoryBase, true, "Do you want Lead Crafting to be enabled?");
            isMercuryCraftingEnabled = config.getBoolean("Is Mercury Crafting Enabled?", categoryBase, true, "Do you want Mercury Crafting to be enabled?");
            isMithrilCraftingEnabled = config.getBoolean("Is Mithril Crafting Enabled?", categoryBase, true, "Do you want Mithril Crafting to be enabled?");
            isNickelCraftingEnabled = config.getBoolean("Is Nickel Crafting Enabled?", categoryBase, true, "Do you want Nickel Crafting to be enabled?");
            isOsmiumCraftingEnabled = config.getBoolean("Is Osmium Crafting Enabled?", categoryBase, true, "Do you want Osmium Crafting to be enabled?");
            isPlatinumCraftingEnabled = config.getBoolean("Is Platinum Crafting Enabled?", categoryBase, true, "Do you want Platinum Crafting to be enabled?");
            isSilverCraftingEnabled = config.getBoolean("Is Silver Crafting Enabled?", categoryBase, true, "Do you want Silver Crafting to be enabled?");
            isTinCraftingEnabled = config.getBoolean("Is Tin Crafting Enabled?", categoryBase, true, "Do you want Tin Crafting to be enabled?");
            isTitaniumCraftingEnabled = config.getBoolean("Is Titanium Crafting Enabled?", categoryBase, true, "Do you want Titanium Crafting to be enabled?");
            isTungstenCraftingEnabled = config.getBoolean("Is Tungsten Crafting Enabled?", categoryBase, true, "Do you want Tungsten Crafting to be enabled?");
            isUraniumCraftingEnabled = config.getBoolean("Is Uranium Crafting Enabled?", categoryBase, true, "Do you want Uranium Crafting to be enabled?");
            isZincCraftingEnabled = config.getBoolean("Is Zinc Crafting Enabled?", categoryBase, true, "Do you want Zinc Crafting to be enabled?");

            config.addCustomCategoryComment(categoryAlloy, "Alloy Ingots. AKA: Ingots that are made from other ingots and/or elements. [True or False]");

            isBrassCraftingEnabled = config.getBoolean("Is Brass Crafting Enabled?", categoryAlloy, true, "Do you want Brass Crafting to be enabled?");
            isBronzeCraftingEnabled = config.getBoolean("Is Bronze Crafting Enabled?", categoryAlloy, true, "Do you want Bronze Crafting to be enabled?");
            isConstantanCraftingEnabled = config.getBoolean("Is Constantan Crafting Enabled?", categoryAlloy, true, "Do you want Constantan Crafting to be enabled?");
            isElectrumCraftingEnabled = config.getBoolean("Is Electrum Crafting Enabled?", categoryAlloy, true, "Do you want Electrum Crafting to be enabled?");
            isEnderiumCraftingEnabled = config.getBoolean("Is Enderium Crafting Enabled?", categoryAlloy, true, "Do you want Enderium Crafting to be enabled?");
            isFairyCraftingEnabled = config.getBoolean("Is Fairy Crafting Enabled?", categoryAlloy, true, "Do you want Fairy Crafting to be enabled?");
            isInvarCraftingEnabled = config.getBoolean("Is Invar Crafting Enabled?", categoryAlloy, true, "Do you want Invar Crafting to be enabled?");
            isKnightSlimeCraftingEnabled = config.getBoolean("Is KnightSlime Crafting Enabled?", categoryAlloy, true, "Do you want KnightSlime Crafting to be enabled?");
            isLumiumCraftingEnabled = config.getBoolean("Is Lumium Crafting Enabled?", categoryAlloy, true, "Do you want Lumium Crafting to be enabled?");
            isManyullynCraftingEnabled = config.getBoolean("Is Manyullyn Crafting Enabled?", categoryAlloy, true, "Do you want Manyullyn Crafting to be enabled?");
            isPigIronCraftingEnabled = config.getBoolean("Is PigIron Crafting Enabled?", categoryAlloy, true, "Do you want PigIron Crafting to be enabled?");
            isSignalumCraftingEnabled = config.getBoolean("Is Signalum Crafting Enabled?", categoryAlloy, true, "Do you want Signalum Crafting to be enabled?");
            isSteelCraftingEnabled = config.getBoolean("Is Steel Crafting Enabled?", categoryAlloy, true, "Do you want Steel Crafting to be enabled?");
            isVoidBornCraftingEnabled = config.getBoolean("Is VoidBorn Crafting Enabled?", categoryAlloy, true, "Do you want VoidBorn Crafting to be enabled?");

            config.addCustomCategoryComment(categoryGem, "Gems. AKA: Shiny things, like diamonds and emeralds. [True or False]");

            isAmethystCraftingEnabled = config.getBoolean("Is Amethyst Crafting Enabled?", categoryGem, true, "Do you want Amethyst Crafting to be enabled?");
            isPeridotCraftingEnabled = config.getBoolean("Is Peridot Crafting Enabled?", categoryGem, true, "Do you want Peridot Crafting to be enabled?");
            isRubyCraftingEnabled = config.getBoolean("Is Ruby Crafting Enabled?", categoryGem, true, "Do you want Ruby Crafting to be enabled?");
            isSapphireCraftingEnabled = config.getBoolean("Is Sapphire Crafting Enabled?", categoryGem, true, "Do you want Sapphire Crafting to be enabled?");

            config.addCustomCategoryComment(categoryElement, "Elements. AKA: Things that make different things. [True or False]");

            isCarbonCraftingEnabled = config.getBoolean("Is Carbon Crafting Enabled?", categoryElement, true, "Do you want Carbon Crafting to be enabled?");
            isCinnabarCraftingEnabled = config.getBoolean("Is Cinnabar Crafting Enabled?", categoryElement, true, "Do you want Cinnabar Crafting to be enabled?");
            isSiliconCraftingEnabled = config.getBoolean("Is Silicon Crafting Enabled?", categoryElement, true, "Do you want Silicon Crafting to be enabled?");
            isSulfurCraftingEnabled = config.getBoolean("Is Sulfur Crafting Enabled?", categoryElement, true, "Do you want Sulfur Crafting to be enabled?");

            config.addCustomCategoryComment(categoryVanilla, "Vanilla Additions. AKA: Things that I added that expand on the already available vanilla elements. [True or False]");

            isCharcoalCraftingEnabled = config.getBoolean("Is Charcoal Crafting Enabled?", categoryVanilla, true, "Do you want Charcoal Crafting to be enabled?");
            isCharcoaliumCraftingEnabled = config.getBoolean("Is Charcoalium Crafting Enabled?", categoryVanilla, true, "Do you want Charcoalium Crafting to be enabled?");
            isCoalCraftingEnabled = config.getBoolean("Is Coal Crafting Enabled?", categoryVanilla, true, "Do you want Coal Crafting to be enabled?");
            isCoaliumCraftingEnabled = config.getBoolean("Is Coalium Crafting Enabled?", categoryVanilla, true, "Do you want Coalium Crafting to be enabled?");
            isDiamondCraftingEnabled = config.getBoolean("Is Diamond Crafting Enabled?", categoryVanilla, true, "Do you want Diamond Crafting to be enabled?");
            isEmeraldCraftingEnabled = config.getBoolean("Is Charcoalium Emerald Enabled?", categoryVanilla, true, "Do you want Emerald Crafting to be enabled?");
            isGlowizeCraftingEnabled = config.getBoolean("Is Glowize Crafting Enabled?", categoryVanilla, true, "Do you want Glowize Crafting to be enabled?");
            isGoldCraftingEnabled = config.getBoolean("Is Gold Crafting Enabled?", categoryVanilla, true, "Do you want Gold Crafting to be enabled?");
            isIronCraftingEnabled = config.getBoolean("Is Iron Crafting Enabled?", categoryVanilla, true, "Do you want Iron Crafting to be enabled?");
            isLapisCraftingEnabled = config.getBoolean("Is Lapis Crafting Enabled?", categoryVanilla, true, "Do you want Lapis Crafting to be enabled?");
            isLapiteCraftingEnabled = config.getBoolean("Is Lapite Crafting Enabled?", categoryVanilla, true, "Do you want Lapite Crafting to be enabled?");
            isQuartzCraftingEnabled = config.getBoolean("Is Quartz Crafting Enabled?", categoryVanilla, true, "Do you want Quartz Crafting to be enabled?");
            isQuartziumCraftingEnabled = config.getBoolean("Is Quartzium Crafting Enabled?", categoryVanilla, true, "Do you want Quartzium Crafting to be enabled?");

        } catch (Exception e) {
            System.out.println("error in config/oreinamillion/crafting.cfg... setting default values...");
        } finally {
            config.save();
        }
    }
}