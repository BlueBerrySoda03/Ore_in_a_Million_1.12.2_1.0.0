package com.blueberrysoda.oreinamillion.items.tools.coaltools;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class ItemToolCoalShovel extends ItemSpade {

    public final int burnTime;

    public ItemToolCoalShovel(String name, ToolMaterial material, int burnTimeIn) {
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
