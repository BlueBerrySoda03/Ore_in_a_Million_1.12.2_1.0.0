package com.blueberrysoda.oreinamillion.items.armor.armorevents;

import com.blueberrysoda.oreinamillion.init.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ArmorCopperEvent {
    @SubscribeEvent
    public void onLivingHurt(LivingHurtEvent event) {
        //copper armor lighting vulnerability
        if (event.getEntityLiving() instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) event.getEntityLiving();

            ItemStack helmet = player.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
            ItemStack chestplate = player.getItemStackFromSlot(EntityEquipmentSlot.CHEST);
            ItemStack leggings = player.getItemStackFromSlot(EntityEquipmentSlot.LEGS);
            ItemStack boots = player.getItemStackFromSlot(EntityEquipmentSlot.FEET);

            int armorPiecesWorn = 0;

            if (helmet.getItem() == ModItems.helmetCopper) {
                armorPiecesWorn++;
            }
            if (chestplate.getItem() == ModItems.chestplateCopper) {
                armorPiecesWorn++;
            }
            if (leggings.getItem() == ModItems.leggingsCopper) {
                armorPiecesWorn++;
            }
            if (boots.getItem() == ModItems.bootsCopper) {
                armorPiecesWorn++;
            }

            float damageReduction = 1.0F;

            if (event.getSource() == DamageSource.LIGHTNING_BOLT) {
                switch (armorPiecesWorn) {
                    case 1:
                        damageReduction = 1.2F;
                        break;
                    case 2:
                        damageReduction = 1.5F;
                        break;
                    case 3:
                        damageReduction = 2.0F;
                        break;
                    case 4:
                        damageReduction = 3.0F;
                        break;
                    default:
                        damageReduction = 1.0F;
                }
            }
            event.setAmount(event.getAmount() * damageReduction);
        }
    }
}
