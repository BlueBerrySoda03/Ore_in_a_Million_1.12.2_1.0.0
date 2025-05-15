package com.blueberrysoda.oreinamillion.util.enumerations;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public enum BlockType {

    Block(OreInAMillion.MODID + ":blocks/base/storage_base", OreInAMillion.CREATIVE_TAB_BLOCK, Material.IRON, "pickaxe", SoundType.METAL, CategoryBlock.Storage),
    Ore(OreInAMillion.MODID + ":blocks/base/ore_base", OreInAMillion.CREATIVE_TAB_BLOCK, Material.ROCK, "pickaxe", SoundType.STONE, CategoryBlock.Ore),
    Cluster(OreInAMillion.MODID + ":blocks/base/cluster_base", OreInAMillion.CREATIVE_TAB_BLOCK, Material.ROCK, "pickaxe", SoundType.STONE, CategoryBlock.Ore),
    Dirty_Dust_Block(OreInAMillion.MODID + ":blocks/base/dirty_dust_block_base", OreInAMillion.CREATIVE_TAB_BLOCK, Material.SAND, "shovel", SoundType.GROUND, CategoryBlock.Falling),
    Dust_Block(OreInAMillion.MODID + ":blocks/base/dust_block_base", OreInAMillion.CREATIVE_TAB_BLOCK, Material.SAND, "shovel", SoundType.SAND, CategoryBlock.Falling)
    ;


    private final String texturePath;
    private final CreativeTabs creativeTab;
    private final Material material;
    private final String tool;
    private final SoundType soundType;
    private final CategoryBlock category;

    BlockType(String texturePath, CreativeTabs creativeTab, Material material, String tool, SoundType soundType, CategoryBlock category) {
        this.texturePath = texturePath;
        this.creativeTab = creativeTab;
        this.material = material;
        this.tool = tool;
        this.soundType = soundType;
        this.category = category;
    }

    public String getTexturePath() {
        return texturePath;
    }

    public CreativeTabs getCreativeTab() {
        return creativeTab;
    }

    public Material getMaterial() {
        return material;
    }

    public String getTool() {
        return tool;
    }

    public SoundType getSoundType() {
        return soundType;
    }

    public CategoryBlock getCategory() {
        return category;
    }
}
