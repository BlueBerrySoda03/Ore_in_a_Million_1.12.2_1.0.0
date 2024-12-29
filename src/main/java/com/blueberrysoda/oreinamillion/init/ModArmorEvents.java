package com.blueberrysoda.oreinamillion.init;

import com.blueberrysoda.oreinamillion.items.armor.armorevents.ItemCopperArmor;
import com.blueberrysoda.oreinamillion.items.armor.armorevents.ItemLeadArmor;
import com.blueberrysoda.oreinamillion.items.armor.armorevents.ItemSilverArmor;
import net.minecraftforge.common.MinecraftForge;

public class ModArmorEvents {
    public static void init() {
        MinecraftForge.EVENT_BUS.register(new ItemCopperArmor());
        MinecraftForge.EVENT_BUS.register(new ItemLeadArmor());
        MinecraftForge.EVENT_BUS.register(new ItemSilverArmor());
    }
}