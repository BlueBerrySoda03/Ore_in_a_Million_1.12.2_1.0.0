package com.blueberrysoda.oreinamillion.items.base;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import net.minecraft.item.Item;

public class ItemBase extends Item {

    public ItemBase(String name){
        setRegistryName(name);
        setUnlocalizedName(OreInAMillion.MODID + "." + name);
        setMaxStackSize(64);
    }
}
