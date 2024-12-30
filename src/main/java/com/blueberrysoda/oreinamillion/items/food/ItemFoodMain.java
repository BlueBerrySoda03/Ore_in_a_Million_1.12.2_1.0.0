package com.blueberrysoda.oreinamillion.items.food;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import net.minecraft.item.ItemFood;

public class ItemFoodMain extends ItemFood {
    public ItemFoodMain(String name, int amount, float saturation, boolean isAnimalFood) {
        super(amount, saturation, isAnimalFood);
        setRegistryName(name);
        setUnlocalizedName(OreInAMillion.MODID + "." + name);
        setMaxStackSize(64);
        setCreativeTab(OreInAMillion.CREATIVE_TAB_MAIN);
    }
}
