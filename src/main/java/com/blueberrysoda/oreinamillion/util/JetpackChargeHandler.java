package com.blueberrysoda.oreinamillion.util;

import baubles.api.BaublesApi;
import baubles.api.cap.IBaublesItemHandler;
import com.blueberrysoda.oreinamillion.items.baubles.ItemJetpackBauble;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.energy.IEnergyStorage;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class JetpackChargeHandler {

    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase != TickEvent.Phase.END) return;
        EntityPlayer player = event.player;

        if (player.world.isRemote) return;

        for (int i = 0; i < player.inventory.getSizeInventory(); i++) {
            ItemStack stack = player.inventory.getStackInSlot(i);
            tryChargeJetpack(stack, player);
        }

        IBaublesItemHandler baubles = BaublesApi.getBaublesHandler(player);
        if (baubles != null) {
            for (int i = 0; i < baubles.getSlots(); i++) {
                ItemStack baubleStack = baubles.getStackInSlot(i);
                tryChargeJetpack(baubleStack, player);
            }
        }
    }

    private static final Set<String> chargeableBatteries = new HashSet<>(Arrays.asList(
            "actuallyadditions:item_battery",
            "actuallyadditions:item_battery_double",
            "actuallyadditions:item_battery_triple",
            "actuallyadditions:item_battery_quadruple",
            "actuallyadditions:item_battery_quintuple",
            "actuallyadditions:item_battery_bauble",
            "actuallyadditions:item_battery_double_bauble",
            "actuallyadditions:item_battery_triple_bauble",
            "actuallyadditions:item_battery_quadruple_bauble",
            "actuallyadditions:item_battery_quintuple_bauble"
    ));

    private void tryChargeJetpack(ItemStack stack, EntityPlayer player) {
        if (stack == null) return;
        if (!(stack.getItem() instanceof ItemJetpackBauble)) return;

        EnergyCapabilityProvider jetpackProvider = (EnergyCapabilityProvider) stack.getCapability(CapabilityEnergy.ENERGY, null);
        if (jetpackProvider == null) return;

        for (int i = 0; i < player.inventory.getSizeInventory(); i++) {
            ItemStack invStack = player.inventory.getStackInSlot(i);
            if (invStack == null || invStack == stack) continue;

            String regName = invStack.getItem().getRegistryName().toString();
            if (!chargeableBatteries.contains(regName)) {
                continue;
            }

            if (!invStack.hasTagCompound()) continue;
            NBTTagCompound tag = invStack.getTagCompound();
            if (!tag.hasKey("IsEnabled")) continue;

            String isEnabledStr = tag.getTag("IsEnabled").toString();
            if ("0b".equals(isEnabledStr)) continue;

            if (invStack.hasCapability(CapabilityEnergy.ENERGY, null)) {
                IEnergyStorage sourceEnergy = invStack.getCapability(CapabilityEnergy.ENERGY, null);
                if (sourceEnergy != null && sourceEnergy.canExtract()) {
                    int maxReceive = jetpackProvider.getMaxReceive();
                    int energyAvailable = sourceEnergy.extractEnergy(maxReceive, true);
                    if (energyAvailable > 0) {
                        int energyAccepted = jetpackProvider.receiveEnergy(energyAvailable, false);
                        sourceEnergy.extractEnergy(energyAccepted, false);
                        jetpackProvider.saveToStack();
                        return;
                    }
                }
            }
        }
    }

}
