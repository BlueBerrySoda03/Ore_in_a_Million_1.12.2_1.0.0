package com.blueberrysoda.oreinamillion.util.enumerations;

import com.blueberrysoda.oreinamillion.OreInAMillion;

public enum ItemType {
    Ingot(OreInAMillion.MODID + ":item/ingot_base"),
    Nugget(OreInAMillion.MODID + ":item/nugget_base"),
    Dust(OreInAMillion.MODID + ":item/dust_base"),
    Gear(OreInAMillion.MODID + ":gear_base"),
    Plate(OreInAMillion.MODID + "item/plate_base"),
    Rod(OreInAMillion.MODID + "item/rod_base"),
    TinyDust(OreInAMillion.MODID + "item/tiny_dust_base"),
    Helmet(OreInAMillion.MODID + "item/helmet_base"),
    Chestplate(OreInAMillion.MODID + "item/chestplate_base"),
    Leggings(OreInAMillion.MODID + "item/leggings_base"),
    Boots(OreInAMillion.MODID + "item/boots_base"),
    Sword(OreInAMillion.MODID + "item/sword_base"),
    Pickaxe(OreInAMillion.MODID + "item/pickaxe_base"),
    Axe(OreInAMillion.MODID + "item/axe_base"),
    Shovel(OreInAMillion.MODID + "item/shovel_base"),
    Hoe(OreInAMillion.MODID + "item/hoe_base"),
    Crusher(OreInAMillion.MODID + "item/crusher_base");


    private final String texturePath;

    ItemType(String texturePath) {
        this.texturePath = texturePath;
    }

    public String getTexturePath() {
        return texturePath;
    }
}
