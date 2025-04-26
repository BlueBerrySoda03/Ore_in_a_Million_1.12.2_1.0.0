package com.blueberrysoda.oreinamillion.util.enumerations;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import net.minecraft.creativetab.CreativeTabs;

public enum ItemType {
    Ingot(OreInAMillion.MODID + ":items/base/ingot_base", OreInAMillion.CREATIVE_TAB_MINERAL),
    Nugget(OreInAMillion.MODID + ":items/base/nugget_base", OreInAMillion.CREATIVE_TAB_MINERAL),
    Dust(OreInAMillion.MODID + ":items/base/dust_base", OreInAMillion.CREATIVE_TAB_MINERAL),
    Gear(OreInAMillion.MODID + ":items/base/gear_base", OreInAMillion.CREATIVE_TAB_CRAFTING),
    Plate(OreInAMillion.MODID + ":items/base/plate_base", OreInAMillion.CREATIVE_TAB_CRAFTING),
    Rod(OreInAMillion.MODID + ":items/base/rod_base", OreInAMillion.CREATIVE_TAB_CRAFTING),
    TinyDust(OreInAMillion.MODID + "items/:tiny_dust_base", OreInAMillion.CREATIVE_TAB_CRAFTING);
//    Helmet(OreInAMillion.MODID + ":helmet_base", OreInAMillion.CREATIVE_TAB_ARMOR),
//    Chestplate(OreInAMillion.MODID + ":chestplate_base", OreInAMillion.CREATIVE_TAB_ARMOR),
//    Leggings(OreInAMillion.MODID + ":leggings_base", OreInAMillion.CREATIVE_TAB_ARMOR),
//    Boots(OreInAMillion.MODID + ":boots_base", OreInAMillion.CREATIVE_TAB_ARMOR),
//    Sword(OreInAMillion.MODID + ":sword_base", OreInAMillion.CREATIVE_TAB_TOOL),
//    Pickaxe(OreInAMillion.MODID + ":pickaxe_base", OreInAMillion.CREATIVE_TAB_TOOL),
//    Axe(OreInAMillion.MODID + ":axe_base", OreInAMillion.CREATIVE_TAB_TOOL),
//    Shovel(OreInAMillion.MODID + ":shovel_base", OreInAMillion.CREATIVE_TAB_TOOL),
//    Hoe(OreInAMillion.MODID + ":hoe_base", OreInAMillion.CREATIVE_TAB_TOOL),
//    Crusher(OreInAMillion.MODID + ":crusher_base", OreInAMillion.CREATIVE_TAB_TOOL);


    private final String texturePath;
    private final CreativeTabs creativeTab;

    ItemType(String texturePath, CreativeTabs creativeTab) {
        this.texturePath = texturePath;
        this.creativeTab = creativeTab;
    }

    public String getTexturePath() {
        return texturePath;
    }

    public CreativeTabs getCreativeTab() {
        return creativeTab;
    }
}
