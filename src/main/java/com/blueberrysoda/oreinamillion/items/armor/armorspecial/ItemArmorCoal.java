package com.blueberrysoda.oreinamillion.items.armor.armorspecial;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemArmorCoal extends ItemArmor {

    public static int burnTime;

    public ItemArmorCoal(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, int burnTime) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        setRegistryName(name);
        setUnlocalizedName(OreInAMillion.MODID + "." + name);
        setMaxStackSize(1);
        setCreativeTab(OreInAMillion.CREATIVE_TAB_ARMOR);
        ItemArmorCoal.burnTime = burnTime;
    }

    @Override
    public int getItemBurnTime(ItemStack itemStackIn){
        return ItemArmorCoal.burnTime;
    }
}
