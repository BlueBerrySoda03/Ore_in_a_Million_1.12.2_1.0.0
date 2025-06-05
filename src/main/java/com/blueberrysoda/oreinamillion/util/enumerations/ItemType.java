package com.blueberrysoda.oreinamillion.util.enumerations;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import net.minecraft.creativetab.CreativeTabs;

public enum ItemType {
    //basic items
    Ingot(OreInAMillion.CREATIVE_TAB_MINERAL, Categories.BaseCategory),
    Gem(OreInAMillion.CREATIVE_TAB_MINERAL, Categories.BaseCategory),
    Element(OreInAMillion.CREATIVE_TAB_MINERAL, Categories.BaseCategory),
    Nugget(OreInAMillion.CREATIVE_TAB_MINERAL, Categories.BaseCategory),
    Dust(OreInAMillion.CREATIVE_TAB_MINERAL, Categories.BaseCategory),
    //crafting items
    Gear(OreInAMillion.CREATIVE_TAB_CRAFTING, Categories.Crafting),
    Plate(OreInAMillion.CREATIVE_TAB_CRAFTING, Categories.Crafting),
    Rod(OreInAMillion.CREATIVE_TAB_CRAFTING, Categories.Crafting),
    Tiny_Dust(OreInAMillion.CREATIVE_TAB_CRAFTING, Categories.Crafting),
    Dirty_Dust(OreInAMillion.CREATIVE_TAB_CRAFTING, Categories.Crafting),
    Tiny_Dirty_Dust(OreInAMillion.CREATIVE_TAB_CRAFTING, Categories.Crafting),
    //mekanism stuffs
    Clump(OreInAMillion.CREATIVE_TAB_MEKANISM, Categories.Crafting),
    Crystal(OreInAMillion.CREATIVE_TAB_MEKANISM, Categories.Crafting),
    Shard(OreInAMillion.CREATIVE_TAB_MEKANISM, Categories.Crafting),
    //tools
    Sword(OreInAMillion.CREATIVE_TAB_TOOL, Categories.Sword),
    Pickaxe(OreInAMillion.CREATIVE_TAB_TOOL, Categories.Pickaxe),
    Axe(OreInAMillion.CREATIVE_TAB_TOOL, Categories.Axe),
    Shovel(OreInAMillion.CREATIVE_TAB_TOOL, Categories.Shovel),
    Hoe(OreInAMillion.CREATIVE_TAB_TOOL, Categories.Hoe),
    Hammer(OreInAMillion.CREATIVE_TAB_TOOL, Categories.Hammer),
    Bow(OreInAMillion.CREATIVE_TAB_TOOL, Categories.Bow),
    //armor
    Helmet(OreInAMillion.CREATIVE_TAB_ARMOR, Categories.Helmet),
    Chestplate(OreInAMillion.CREATIVE_TAB_ARMOR, Categories.Chestplate),
    Leggings(OreInAMillion.CREATIVE_TAB_ARMOR, Categories.Leggings),
    Boots(OreInAMillion.CREATIVE_TAB_ARMOR, Categories.Boots),
    //other
    Jetpack(OreInAMillion.CREATIVE_TAB_MAIN, Categories.Jetpack),
    ;

    private final CreativeTabs creativeTab;
    private final Categories category;

    ItemType(CreativeTabs creativeTab, Categories category) {
        this.creativeTab = creativeTab;
        this.category = category;
    }

    public CreativeTabs getCreativeTab() {
        return creativeTab;
    }

    public Categories getCategory() {
        return category;
    }
}
