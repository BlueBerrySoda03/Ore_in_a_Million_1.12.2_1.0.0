package com.blueberrysoda.oreinamillion.items.armor.armorevents;

import com.blueberrysoda.oreinamillion.init.ModArmor;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ItemLeadArmor {
    @SubscribeEvent
    public void onLivingHurt(LivingHurtEvent event) {
        //decreasing magic damage
        if (event.getEntityLiving() instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) event.getEntityLiving();

            ItemStack helmet = player.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
            ItemStack chestplate = player.getItemStackFromSlot(EntityEquipmentSlot.CHEST);
            ItemStack leggings = player.getItemStackFromSlot(EntityEquipmentSlot.LEGS);
            ItemStack boots = player.getItemStackFromSlot(EntityEquipmentSlot.FEET);

            int armorPiecesWorn = 0;

            if (helmet != null && helmet.getItem() == ModArmor.helmetLead) {
                armorPiecesWorn++;
            }
            if (chestplate != null && chestplate.getItem() == ModArmor.chestplateLead) {
                armorPiecesWorn++;
            }
            if (leggings != null && leggings.getItem() == ModArmor.leggingsLead) {
                armorPiecesWorn++;
            }
            if (boots != null && boots.getItem() == ModArmor.bootsLead) {
                armorPiecesWorn++;
            }

            float damageReduction = 1.0F;

            if (event.getSource() == DamageSource.MAGIC) {
                switch (armorPiecesWorn) {
                    case 1:
                        damageReduction = 0.8F;
                        break;
                    case 2:
                        damageReduction = 0.6F;
                        break;
                    case 3:
                        damageReduction = 0.4F;
                        break;
                    case 4:
                        damageReduction = 0.2F;
                        break;
                    default:
                        damageReduction = 1.0F;
                }
            }
            event.setAmount(event.getAmount() * damageReduction);
        }
    }

    //slowing down players based on how many pieces are worn
    @SubscribeEvent
    public void onLivingUpdate(LivingEvent.LivingUpdateEvent event) {
        if (event.getEntityLiving() instanceof EntityPlayer) {
        EntityPlayer player = (EntityPlayer) event.getEntityLiving();

        ItemStack helmet = player.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
        ItemStack chestplate = player.getItemStackFromSlot(EntityEquipmentSlot.CHEST);
        ItemStack leggings = player.getItemStackFromSlot(EntityEquipmentSlot.LEGS);
        ItemStack boots = player.getItemStackFromSlot(EntityEquipmentSlot.FEET);

        int armorPiecesWorn = 0;

        if (helmet != null && helmet.getItem() == ModArmor.helmetLead) {
            armorPiecesWorn++;
        }
        if (chestplate != null && helmet.getItem() == ModArmor.helmetLead) {
            armorPiecesWorn++;
        }
        if (leggings != null && helmet.getItem() == ModArmor.helmetLead) {
            armorPiecesWorn++;
        }
        if (boots != null && helmet.getItem() == ModArmor.helmetLead) {
            armorPiecesWorn++;
        }

        float speedReduction = 0.1F;
        switch (armorPiecesWorn) {
            case 1:
                speedReduction = 0.09F;
                break;
            case 2:
                speedReduction = 0.08F;
                break;
            case 3:
                speedReduction = 0.07F;
                break;
            case 4:
                speedReduction = 0.06F;
                break;
            default:
                speedReduction = 0.1F;
        }
        player.capabilities.setPlayerWalkSpeed(speedReduction);
        player.sendPlayerAbilities();
        }
    }
}
