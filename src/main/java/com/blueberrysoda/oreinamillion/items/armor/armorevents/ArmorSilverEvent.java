package com.blueberrysoda.oreinamillion.items.armor.armorevents;

import com.blueberrysoda.oreinamillion.init.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ArmorSilverEvent {
    @SubscribeEvent
    public void onLivingHurt(LivingHurtEvent event) {
        if (event.getEntityLiving() instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) event.getEntityLiving();

            ItemStack helmet = player.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
            ItemStack chestplate = player.getItemStackFromSlot(EntityEquipmentSlot.CHEST);
            ItemStack leggings = player.getItemStackFromSlot(EntityEquipmentSlot.LEGS);
            ItemStack boots = player.getItemStackFromSlot(EntityEquipmentSlot.FEET);

            int armorPiecesWorn = 0;

            if (helmet != null && helmet.getItem() == ModItems.helmetSilver) {
                armorPiecesWorn++;
            }
            if (chestplate != null && chestplate.getItem() == ModItems.chestplateSilver) {
                armorPiecesWorn++;
            }
            if (leggings != null && leggings.getItem() == ModItems.leggingsSilver) {
                armorPiecesWorn++;
            }
            if (boots != null && boots.getItem() == ModItems.bootsSilver) {
                armorPiecesWorn++;
            }

            Entity source = event.getSource().getTrueSource();

            if (source instanceof EntityLivingBase && ((EntityLivingBase) source).getCreatureAttribute() == EnumCreatureAttribute.UNDEAD) {
                float damageReduction = 1.0F;

                switch (armorPiecesWorn) {
                    case 1:
                        damageReduction = 0.9F;
                        break;
                    case 2:
                        damageReduction = 0.8F;
                        break;
                    case 3:
                        damageReduction = 0.65F;
                        break;
                    case 4:
                        damageReduction = 0.5F;
                        break;
                    default:
                        damageReduction = 1.0F;
                }
                event.setAmount(event.getAmount() * damageReduction);
            }
        }
    }
}
