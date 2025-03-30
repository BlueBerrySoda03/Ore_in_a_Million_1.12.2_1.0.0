package com.blueberrysoda.oreinamillion.init;

import com.blueberrysoda.oreinamillion.config.GeneralConfig;
import com.blueberrysoda.oreinamillion.items.armor.armorevents.ArmorCopperEvent;
import com.blueberrysoda.oreinamillion.items.armor.armorevents.ArmorSilverEvent;
import com.blueberrysoda.oreinamillion.items.tools.toolevents.ToolPigIronEvent;
import net.minecraftforge.common.MinecraftForge;

public class ModArmorEvents {
    public static void init() {
        if (GeneralConfig.isArmorEnabled) {
            if (GeneralConfig.isArmorEventsEnabled) {
                MinecraftForge.EVENT_BUS.register(new ArmorCopperEvent());
//                MinecraftForge.EVENT_BUS.register(new ItemLeadArmor());
                MinecraftForge.EVENT_BUS.register(new ArmorSilverEvent());
            }
            if (GeneralConfig.isToolEventsEnabled) {
                MinecraftForge.EVENT_BUS.register(new ToolPigIronEvent());
            }
        }
    }
}
