package com.blueberrysoda.oreinamillion.util;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import com.blueberrysoda.oreinamillion.init.ModItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientEventHandler {
    @SubscribeEvent
    public static void registerModularModels(ModelRegistryEvent event) {
        if (ModItems.modularPickaxe != null) { // Check for null before registration
            ModelLoader.setCustomModelResourceLocation(ModItems.modularPickaxe, 0, new ModelResourceLocation(OreInAMillion.MODID + ":pickaxe_modular", "inventory"));
        } else {
            System.err.println("Error: modularPickaxe is null during model registration!");
        }
    }
}
