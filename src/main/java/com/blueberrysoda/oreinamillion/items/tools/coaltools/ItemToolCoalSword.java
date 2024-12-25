package com.blueberrysoda.oreinamillion.items.tools.coaltools;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemToolCoalSword extends ItemSword {

    public final int burnTime;

    public ItemToolCoalSword(String name, Item.ToolMaterial material, int burnTimeIn) {
        super(material);
        this.burnTime = burnTimeIn;
        setRegistryName(name);
        setUnlocalizedName(OreInAMillion.MODID + "." + name);
        setCreativeTab(OreInAMillion.CREATIVE_TAB_TOOL);
    }

    @Override
    public int getItemBurnTime(ItemStack itemStackIn){
        return this.burnTime;
    }
}
