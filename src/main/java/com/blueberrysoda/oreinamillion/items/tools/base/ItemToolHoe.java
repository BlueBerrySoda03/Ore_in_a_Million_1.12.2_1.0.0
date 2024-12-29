package com.blueberrysoda.oreinamillion.items.tools.base;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import net.minecraft.item.ItemHoe;

public class ItemToolHoe extends ItemHoe {

    public ItemToolHoe(String name, ToolMaterial material) {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(OreInAMillion.MODID + "." + name);
        setCreativeTab(OreInAMillion.CREATIVE_TAB_TOOL);
    }
}
