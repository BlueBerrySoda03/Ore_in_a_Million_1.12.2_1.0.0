package com.blueberrysoda.oreinamillion.util;

import com.blueberrysoda.oreinamillion.recipes.FuelRegistry;
import com.blueberrysoda.oreinamillion.recipes.WaterDustCleanRecipe;
import net.minecraftforge.common.MinecraftForge;


public class EventUtil {

    public static void init() {
        MinecraftForge.EVENT_BUS.register(FuelRegistry.class);
        MinecraftForge.EVENT_BUS.register(WaterDustCleanRecipe.class);
    }
}
