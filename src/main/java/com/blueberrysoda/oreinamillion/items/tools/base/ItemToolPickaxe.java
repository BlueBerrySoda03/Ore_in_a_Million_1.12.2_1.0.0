package com.blueberrysoda.oreinamillion.items.tools.base;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class ItemToolPickaxe extends ItemPickaxe {

    public ItemToolPickaxe(String name, Item.ToolMaterial material) {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(OreInAMillion.MODID + "." + name);
        setCreativeTab(OreInAMillion.CREATIVE_TAB_TOOL);
    }
}
