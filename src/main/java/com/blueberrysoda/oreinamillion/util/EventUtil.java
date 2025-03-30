package com.blueberrysoda.oreinamillion.util;

import com.blueberrysoda.oreinamillion.recipes.FuelRegistry;
import net.minecraftforge.common.MinecraftForge;

public class EventUtil {

    public static void init() {
        MinecraftForge.EVENT_BUS.register(FuelRegistry.class);
    }
}
