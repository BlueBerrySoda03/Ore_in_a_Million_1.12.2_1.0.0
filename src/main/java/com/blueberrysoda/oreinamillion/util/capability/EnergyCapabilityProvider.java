package com.blueberrysoda.oreinamillion.util.capability;

import com.blueberrysoda.oreinamillion.items.base.ItemBase;
import com.blueberrysoda.oreinamillion.items.tools.ItemToolSwordEnergy;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.energy.CapabilityEnergy;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class EnergyCapabilityProvider implements ICapabilityProvider {
    public final CustomEnergyStorage storage;

    public EnergyCapabilityProvider(final ItemStack stack, ItemToolSwordEnergy item) {
        this.storage = new CustomEnergyStorage(item.maxEnergy, item.maxExtract, item.maxReceive) {
            @Override
            public int getEnergyStored() {
                if (stack.hasTagCompound()) {
                    return stack.getTagCompound().getInteger("Energy");
                } else {
                    return 0;
                }
            }

            public void setEnergyStored (int energy){
                if (!stack.hasTagCompound()) {
                    stack.setTagCompound(new NBTTagCompound());
                }
                stack.getTagCompound().setInteger("Energy", energy);
            }
        };
    }

    @Override
    public boolean hasCapability(@Nonnull Capability<?> capability, @Nullable EnumFacing facing) {
        return this.getCapability(capability, facing) != null;
    }

    @Nullable
    @Override
    public <T> T getCapability(@Nonnull Capability<T> capability, @Nullable EnumFacing facing) {
        if (capability == CapabilityEnergy.ENERGY) { return CapabilityEnergy.ENERGY.cast(this.storage); }
        return null;
    }
}
