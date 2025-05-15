package com.blueberrysoda.oreinamillion.util.enumerations;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public enum MaterialType {
    Adamantine(0xd3456a, 3, "adamantine", CategoryItem.Base),
    Aluminum(0xe9e9e9, 1, "aluminum", CategoryItem.Base),
    Amethyst(0x9e5ad7, 2, "amethyst", CategoryItem.Gem),
    Brass(0xB5a642, 1, "brass", CategoryItem.Alloy),
    Bronze(0xCd7f32, 1, "bronze", CategoryItem.Alloy),
    Charcoal(0x1e1b15, 0, "charcoal", CategoryItem.Vanilla),
    Chrome(0xDBE2E9, 2, "chrome", CategoryItem.Base),
    Coal(0x161616, 0, "coal", CategoryItem.Vanilla),
    Cobalt(0x0047ab, 2, "cobalt", CategoryItem.Base),
    Constantan(0xECE2A5, 1, "constantan", CategoryItem.Alloy),
    Copper(0xaa6f55, 1, "copper", CategoryItem.Base),
    Diamond(0x8cf4e2, 2, "diamond", CategoryItem.Vanilla),
    Electrum(0xDBCC78, 1, "electrum", CategoryItem.Alloy),
    Ender(0x258474, 3, "ender", CategoryItem.Base),
    Fairy(0xE0A8DA, 2, "fairy", CategoryItem.Alloy),
    Garnet(0xFFFFFF, 2, "garnet", CategoryItem.Gem),
    Glowstone(0xd2d200, 0, "glowstone", CategoryItem.Vanilla),
    Gold(0xFFD700, 1, "gold", CategoryItem.Vanilla),
    Invar(0x6B6766, 1, "invar", CategoryItem.Alloy),
    Iridium(0xC0B38F, 1, "iridium", CategoryItem.Base),
    Iron(0xD8D8D8, 1, "iron", CategoryItem.Vanilla),
    Lapis(0x5a82e2, 1, "lapis", CategoryItem.Base),
    Lithium(0xFFFFFF, 0, "lithium", CategoryItem.Element),
    Lead(0x434343, 1, "lead", CategoryItem.Base),
    Mithril(0x2093cb, 3, "mithril", CategoryItem.Base),
    Nickel(0x838383, 1, "nickel", CategoryItem.Base),
    Obsidian(0x72357B, 3, "obsidian", CategoryItem.Base),
    Osmium(0x9496A2, 1, "osmium", CategoryItem.Base),
    Peridot(0xFFFFFF, 2, "peridot", CategoryItem.Gem),
    Platinum(0x95B1C1, 3, "platinum", CategoryItem.Base),
    Silicon(0xFFFFFF, 0, "silicon", CategoryItem.Element),
    Sulfur(0xFFFFFF, 0, "sulfur", CategoryItem.Element),
    Redstone(0x720000, 2, "redstone", CategoryItem.Vanilla),
    Ruby(0xFFFFFF, 2, "ruby", CategoryItem.Gem),
    Sapphire(0xFFFFFFF, 2, "sapphire", CategoryItem.Gem),
    Silver(0xA4B2B6, 2, "silver", CategoryItem.Base),
    Steel(0x6F7070, 2, "steel", CategoryItem.Alloy),
    Stone(0x6E6E6E, 0, "stone", CategoryItem.Vanilla),
    Tin(0xE5E6E6, 1, "tin", CategoryItem.Base),
    Titanium(0xC6D1D5, 3, "titanium", CategoryItem.Base),
    Tungsten(0x9496A2, 2, "tungsten", CategoryItem.Base),
    Uranium(0x48da52, 3, "uranium", CategoryItem.Base),
    Voidborn(0xcc00fa, 4, "voidborn", CategoryItem.Alloy),
    Wood(0x8B5A2B, 0, "wood", CategoryItem.Vanilla),
    Zinc(0x3E3E43, 1, "zinc", CategoryItem.Base)
    ;

    private final int color;
    private final int harvestLevel;
    private final String materialName;
    private final CategoryItem category;

    MaterialType(int color, int harvestLevel, String materialName, CategoryItem category) {
        this.color = color;
        this.harvestLevel = harvestLevel;
        this.materialName = materialName;
        this.category = category;
    }

    public int getColor() {
        return color;
    }

    public int getHarvestLevel() {
        return harvestLevel;
    }

    public CategoryItem getCategory() {
        return category;
    }

    public String getMaterialName() {
        return materialName;
    }

    public String getRegistryName(String type) {
        return materialName + "_" + type;
    }

    public Block getBlock(String type) {
        return ForgeRegistries.BLOCKS.getValue(new ResourceLocation(OreInAMillion.MODID, getRegistryName(type)));
    }

    public Item getItem(String type) {
        return ForgeRegistries.ITEMS.getValue(new ResourceLocation(OreInAMillion.MODID, getRegistryName(type)));
    }
}