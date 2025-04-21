package com.blueberrysoda.oreinamillion.config;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.File;

public class ModCompatConfig {
    public static boolean isThermalEnabled;
    public static boolean isTinkersEnabled;
    public static boolean isThermalEnabledPlusAdditions;
    public static boolean isTinkersEnabledPlusAdditions;

    public static void init(FMLPreInitializationEvent event) {
        Configuration config = new Configuration(new File(event.getModConfigurationDirectory().getPath() + "/oreinamillion/modcompat.cfg"));
        try {
            String mods;

            mods = "Mod Compatibility";

            config.addCustomCategoryComment(mods, "This is what disabled the adding of minerals from other mods.");

            isThermalEnabled = config.getBoolean("Is Thermal Series Enabled?", mods, true, "Do you want Thermal Series minerals enabled?");
            isThermalEnabledPlusAdditions = config.getBoolean("Is Thermal Series Additions Enabled?", mods, true, "Do you want to disable Thermal Series minerals but keep the tools and armor?");
            isTinkersEnabled = config.getBoolean("Is Tinkers Construct Enabled?", mods, true, "Do you want Tinkers Construct minerals enabled?");
            isTinkersEnabledPlusAdditions = config.getBoolean("Is Tinkers Construct Additions Enabled?", mods, true, "Do you want to disable Tinkers Construct minerals but keep the tools and armor?");

        } catch (Exception e) {
            System.out.println("error in config/oreinamillion/modcompat.cfg... setting default values...");
        } finally {
            config.save();
        }
    }
}
