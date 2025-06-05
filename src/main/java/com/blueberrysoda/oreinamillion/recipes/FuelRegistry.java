package com.blueberrysoda.oreinamillion.recipes;

import com.blueberrysoda.oreinamillion.util.enumerations.MaterialType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class FuelRegistry {
//
    @SubscribeEvent
    public static void registerFuel(FurnaceFuelBurnTimeEvent event) {
        ItemStack item = event.getItemStack();
        //if(item.getItem().equals(ModItems.))event.setBurnTime();

        //charcoal
        if(item.getItem().equals(MaterialType.Charcoal.getItem("nugget")))event.setBurnTime(200);
        if(item.getItem().equals(MaterialType.Charcoal.getItem("dust")))event.setBurnTime(1600);
        if(item.getItem().equals(MaterialType.Charcoal.getItem("gear")))event.setBurnTime(6400);
        if(item.getItem().equals(MaterialType.Charcoal.getItem("plate")))event.setBurnTime(1600);
        if(item.getItem().equals(MaterialType.Charcoal.getItem("rod")))event.setBurnTime(3200);
        if(item.getItem().equals(MaterialType.Charcoal.getItem("tiny_dust")))event.setBurnTime(200);
        if(item.getItem().equals(MaterialType.Charcoal.getItem("dirty_dust")))event.setBurnTime(800);
        if(item.getItem().equals(MaterialType.Charcoal.getItem("tiny_dirty_dust")))event.setBurnTime(100);
        if(item.getItem().equals(Item.getItemFromBlock(MaterialType.Charcoal.getBlock("block"))))event.setBurnTime(16000);
        if(item.getItem().equals(Item.getItemFromBlock(MaterialType.Charcoal.getBlock("dust_block"))))event.setBurnTime(16000);
        if(item.getItem().equals(Item.getItemFromBlock(MaterialType.Charcoal.getBlock("dirty_dust_block"))))event.setBurnTime(8000);

        //coal
        if(item.getItem().equals(MaterialType.Coal.getItem("nugget")))event.setBurnTime(200);
        if(item.getItem().equals(MaterialType.Coal.getItem("dust")))event.setBurnTime(1600);
        if(item.getItem().equals(MaterialType.Coal.getItem("gear")))event.setBurnTime(6400);
        if(item.getItem().equals(MaterialType.Coal.getItem("plate")))event.setBurnTime(1600);
        if(item.getItem().equals(MaterialType.Coal.getItem("rod")))event.setBurnTime(3200);
        if(item.getItem().equals(MaterialType.Coal.getItem("tiny_dust")))event.setBurnTime(200);
        if(item.getItem().equals(MaterialType.Coal.getItem("dirty_dust")))event.setBurnTime(800);
        if(item.getItem().equals(MaterialType.Coal.getItem("tiny_dirty_dust")))event.setBurnTime(100);
        if(item.getItem().equals(Item.getItemFromBlock(MaterialType.Coal.getBlock("block"))))event.setBurnTime(16000);
        if(item.getItem().equals(Item.getItemFromBlock(MaterialType.Coal.getBlock("dust_block"))))event.setBurnTime(16000);
        if(item.getItem().equals(Item.getItemFromBlock(MaterialType.Coal.getBlock("dirty_dust_block"))))event.setBurnTime(8000);
    }
}
