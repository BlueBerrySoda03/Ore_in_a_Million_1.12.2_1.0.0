package com.blueberrysoda.oreinamillion.items.armor.customarmor;

import com.blueberrysoda.oreinamillion.init.ModArmor;
import com.blueberrysoda.oreinamillion.items.armor.ItemArmorBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class ItemCopperArmor extends ItemArmorBase {
    public ItemCopperArmor(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(name, materialIn, renderIndexIn, equipmentSlotIn);
    }

    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent event) {
        EntityPlayer player = event.player;

        ItemStack helmet = player.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
        ItemStack chestplate = player.getItemStackFromSlot(EntityEquipmentSlot.CHEST);
        ItemStack leggings = player.getItemStackFromSlot(EntityEquipmentSlot.LEGS);
        ItemStack boots = player.getItemStackFromSlot(EntityEquipmentSlot.FEET);

//        if (player.world.isDaytime()) {
//            player.removePotionEffect(MobEffects.NIGHT_VISION);
//        } else if (helmet != null && helmet.getItem() == ModArmor.helmetCopper) {
//            player.addPotionEffect(MobEffects.NIGHT_VISION, (999999*20), 0, false, false);
//        }
//        if (helmet != null && helmet.getItem() == ModArmor.helmetCopper) {
//
//        }
//        if (chestplate != null && chestplate.getItem() == ModArmor.chestplateCopper) {
//
//        }
//        if (leggings != null && leggings.getItem() == ModArmor.leggingsCopper) {
//
//        }
//        if (boots != null && boots.getItem() == ModArmor.bootsCopper) {
//
//        }
    }
}
