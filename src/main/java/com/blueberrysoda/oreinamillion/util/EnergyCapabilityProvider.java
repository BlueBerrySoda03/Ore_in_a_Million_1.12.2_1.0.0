package com.blueberrysoda.oreinamillion.util;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.energy.EnergyStorage;
import net.minecraftforge.energy.IEnergyStorage;

import javax.annotation.Nullable;

public class EnergyCapabilityProvider implements ICapabilityProvider, IEnergyStorage, ICapabilitySerializable<NBTTagCompound> {

    private final ItemStack stack;
    private EnergyStorage energyStorage;

    private final int capacity;
    private final int maxReceive;
    private final int maxExtract;

    public EnergyCapabilityProvider(ItemStack stack, int capacity, int maxTransfer) {
        this.stack = stack;
        this.capacity = capacity;
        this.maxReceive = maxTransfer;
        this.maxExtract = maxTransfer;

        this.energyStorage = new EnergyStorage(capacity, maxReceive, maxExtract, 0);
        readFromNBT(stack.getTagCompound() != null ? stack.getTagCompound() : new NBTTagCompound());
    }

    @Override
    public boolean hasCapability(Capability<?> capability, @Nullable EnumFacing facing) {
        return capability == CapabilityEnergy.ENERGY;
    }

    @Nullable
    @Override
    public <T> T getCapability(Capability<T> capability, @Nullable EnumFacing facing) {
        if (capability == CapabilityEnergy.ENERGY) {
            return (T) this;
        }
        return null;
    }

    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        compound.setInteger("Energy", energyStorage.getEnergyStored());
        return compound;
    }

    public void readFromNBT(NBTTagCompound compound) {
        if (compound.hasKey("Energy")) {
            int stored = compound.getInteger("Energy");
            this.energyStorage = new EnergyStorage(capacity, maxReceive, maxExtract, stored);
        }
    }

    @Override
    public NBTTagCompound serializeNBT() {
        NBTTagCompound tag = new NBTTagCompound();
        writeToNBT(tag);
        return tag;
    }

    @Override
    public void deserializeNBT(NBTTagCompound nbt) {
        readFromNBT(nbt);
    }

    @Override
    public int extractEnergy(int maxExtract, boolean simulate) {
        int extracted = energyStorage.extractEnergy(maxExtract, simulate);
        if (extracted > 0 && !simulate) {
            saveToStack();
        }
        return extracted;
    }

    @Override
    public int receiveEnergy(int maxReceive, boolean simulate) {
        int received = energyStorage.receiveEnergy(maxReceive, simulate);
        if (received > 0 && !simulate) {
            saveToStack();
        }
        return received;
    }

    @Override
    public int getEnergyStored() {
        return energyStorage.getEnergyStored();
    }

    @Override
    public int getMaxEnergyStored() {
        return energyStorage.getMaxEnergyStored();
    }

    @Override
    public boolean canExtract() {
        return energyStorage.canExtract();
    }

    @Override
    public boolean canReceive() {
        return energyStorage.canReceive();
    }

    public int getMaxReceive() {
        return maxReceive;
    }

    public int getMaxExtract() {
        return maxExtract;
    }

    public void saveToStack() {
        NBTTagCompound tag = stack.getTagCompound();
        if (tag == null) tag = new NBTTagCompound();
        writeToNBT(tag);
        stack.setTagCompound(tag);
    }
}
