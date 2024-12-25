package com.blueberrysoda.oreinamillion.items.tools;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import net.minecraft.item.ItemSpade;

public class ItemToolShovel extends ItemSpade {

    public ItemToolShovel(String name, ToolMaterial material) {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(OreInAMillion.MODID + "." + name);
        setCreativeTab(OreInAMillion.CREATIVE_TAB_TOOL);
    }
}
