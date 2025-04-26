//package com.blueberrysoda.oreinamillion.recipes;
//
//import com.blueberrysoda.oreinamillion.init.ModBlocks;
//import com.blueberrysoda.oreinamillion.init.ModItems;
//import net.minecraft.item.Item;
//import net.minecraft.item.ItemStack;
//import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
//import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
//
//public class FuelRegistry {
//
//    @SubscribeEvent
//    public static void registerFuel(FurnaceFuelBurnTimeEvent event) {
//        ItemStack item = event.getItemStack();
//        //if(item.getItem().equals(ModItems.))event.setBurnTime();
//
//        //charcoal
//        if(item.getItem().equals(ModItems.nuggetCharcoal))event.setBurnTime(200);
//        if(item.getItem().equals(ModItems.dustCharcoal))event.setBurnTime(1600);
//        if(item.getItem().equals(ModItems.gearCharcoal))event.setBurnTime(6400);
//        if(item.getItem().equals(ModItems.plateCharcoal))event.setBurnTime(1600);
//        if(item.getItem().equals(ModItems.rodCharcoal))event.setBurnTime(3200);
//        if(item.getItem().equals(ModItems.tinydustCharcoal))event.setBurnTime(200);
//        if(item.getItem().equals(Item.getItemFromBlock(ModBlocks.blockCharcoal)))event.setBurnTime(16000);
//
//        //charcoalium
//        if(item.getItem().equals(ModItems.ingotCharcoalium))event.setBurnTime(1600);
//        if(item.getItem().equals(ModItems.nuggetCharcoalium))event.setBurnTime(200);
//        if(item.getItem().equals(ModItems.dustCharcoalium))event.setBurnTime(1600);
//        if(item.getItem().equals(ModItems.gearCharcoalium))event.setBurnTime(6400);
//        if(item.getItem().equals(ModItems.plateCharcoalium))event.setBurnTime(1600);
//        if(item.getItem().equals(ModItems.rodCharcoalium))event.setBurnTime(3200);
//        if(item.getItem().equals(ModItems.tinydustCharcoalium))event.setBurnTime(200);
//
//        //coal
//        if(item.getItem().equals(ModItems.nuggetCoal))event.setBurnTime(200);
//        if(item.getItem().equals(ModItems.dustCoal))event.setBurnTime(1600);
//        if(item.getItem().equals(ModItems.gearCoal))event.setBurnTime(6400);
//        if(item.getItem().equals(ModItems.plateCoal))event.setBurnTime(1600);
//        if(item.getItem().equals(ModItems.rodCoal))event.setBurnTime(3200);
//        if(item.getItem().equals(ModItems.tinydustCoal))event.setBurnTime(200);
//
//        //coalium
//        if(item.getItem().equals(ModItems.ingotCoalium))event.setBurnTime(1600);
//        if(item.getItem().equals(ModItems.nuggetCoalium))event.setBurnTime(200);
//        if(item.getItem().equals(ModItems.dustCoalium))event.setBurnTime(1600);
//        if(item.getItem().equals(ModItems.gearCoalium))event.setBurnTime(6400);
//        if(item.getItem().equals(ModItems.plateCoalium))event.setBurnTime(1600);
//        if(item.getItem().equals(ModItems.rodCoalium))event.setBurnTime(3200);
//        if(item.getItem().equals(ModItems.tinydustCoalium))event.setBurnTime(200);
//
//    }
//}
