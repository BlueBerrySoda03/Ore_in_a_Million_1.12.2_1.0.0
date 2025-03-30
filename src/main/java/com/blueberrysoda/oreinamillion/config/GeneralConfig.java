package com.blueberrysoda.oreinamillion.config;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.File;

public class GeneralConfig {
    public static boolean isOreGenerationEnabled;
    public static boolean isMineralsEnabled;
    public static boolean isIngotsEnabled;
    public static boolean isGemsEnabled;
    public static boolean isElementsEnabled;
    public static boolean isCraftingEnabled;
    public static boolean isVanillaEnabled;
    public static boolean isToolsEnabled;
    public static boolean isToolEventsEnabled;
    public static boolean isArmorEnabled;
    public static boolean isArmorEventsEnabled;
    public static boolean isSillyStuffEnabled;

    public static void init(FMLPreInitializationEvent event) {
        Configuration config = new Configuration(new File(event.getModConfigurationDirectory().getPath() + "/oreinamillion/general.cfg"));
        try {
            String category;

            category = "General";
            config.addCustomCategoryComment(category, "Configure general things about the mod. [True or False]");

            isMineralsEnabled = config.getBoolean("Is Mod Enabled?", category, true, "Do you want to enable this mod?");
            isOreGenerationEnabled = config.getBoolean("Is Ore Generation Enabled?", category, true, "Do you want ores to generate?");
            isIngotsEnabled = config.getBoolean("Are Ingots Enabled?", category, true, "Do you want ingots to be enabled?");
            isGemsEnabled = config.getBoolean("Are Gems Enabled?", category, true, "Do you want gems to be enabled?");
            isElementsEnabled = config.getBoolean("Are Elements Enabled?", category, true, "Do you want elements, (carbon, sulfur, silicon, etc), to be enabled?");
            isVanillaEnabled = config.getBoolean("Are Vanilla Additions Enabled?", category, true, "Do you want vanilla additions into the game?");
            isCraftingEnabled = config.getBoolean("Are Crafting Items Enabled?", category, true, "Do you want crafting items, (gears, rods, plates, tiny dusts), enabled?");
            isToolsEnabled = config.getBoolean("Are Tools Enabled?", category, true, "Do you want tools to be enabled?");
            isToolEventsEnabled = config.getBoolean("Are Tool Events Enabled?", category, true, "Do you want tool events (special tool effects) to be enabled?");
            isArmorEnabled = config.getBoolean("Is Armor Enabled?", category, true, "Do you want armor to be enabled?");
            isArmorEventsEnabled = config.getBoolean("Is Armor Events Enabled?", category, true, "Do you want armor events (special armor effects) to be enabled?");
            isSillyStuffEnabled = config.getBoolean("Is Silly Stuff Enabled?", category, true, "you are so silly :D");

        } catch (Exception e) {
            System.out.println("error in config/oreinamillion/general.cfg... setting default values...");
        } finally {
            config.save();
        }
    }
}
