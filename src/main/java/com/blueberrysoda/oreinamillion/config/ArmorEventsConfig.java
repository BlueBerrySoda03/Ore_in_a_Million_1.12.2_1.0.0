package com.blueberrysoda.oreinamillion.config;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.File;

public class ArmorEventsConfig {

    public static boolean copperLightningWeakness;

    public static void init(FMLPreInitializationEvent event) {
        Configuration config = new Configuration(new File(event.getModConfigurationDirectory().getPath() + "/oreinamillion/armor_events.cfg"));



    }
}
