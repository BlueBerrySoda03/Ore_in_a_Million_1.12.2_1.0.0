package com.blueberrysoda.oreinamillion.items.crafting;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import com.blueberrysoda.oreinamillion.items.base.ItemBase;
import net.minecraft.item.ItemStack;

public class ItemCoalCrafting extends ItemBase {

    public final int burnTime;

    public ItemCoalCrafting(String name, int burnTimeIn){
        super(name);
        this.burnTime = burnTimeIn;
        setCreativeTab(OreInAMillion.CREATIVE_TAB_CRAFTING);
    }

    @Override
    public int getItemBurnTime(ItemStack itemStackIn){
        return this.burnTime;
    }
}
