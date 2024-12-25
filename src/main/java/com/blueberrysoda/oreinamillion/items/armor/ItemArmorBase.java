package com.blueberrysoda.oreinamillion.items.armor;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemArmorBase extends ItemArmor {

    public ItemArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        setRegistryName(name);
        setUnlocalizedName(OreInAMillion.MODID + "." + name);
        setMaxStackSize(1);
        setCreativeTab(OreInAMillion.CREATIVE_TAB_ARMOR);
    }
}
