package com.blueberrysoda.oreinamillion.items.tools.base;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import net.minecraft.item.ItemAxe;

public class ItemToolAxe extends ItemAxe {
    public ItemToolAxe(String name, ToolMaterial material) {
        ///the code to make the axes flexible in damage and attack speed came from Metallurgy 4 Reforged
        ///I thought I was gonna go crazy figuring this out. Thank you Metallurgy dev :D
        //-2.5F - (material.getAttackDamage() / 5)
        super(material, (material.getAttackDamage() * 1.25F) + 3.0F, -3.0F);
        setRegistryName(name);
        setUnlocalizedName(OreInAMillion.MODID + "." + name);
        setCreativeTab(OreInAMillion.CREATIVE_TAB_TOOL);
    }
}
