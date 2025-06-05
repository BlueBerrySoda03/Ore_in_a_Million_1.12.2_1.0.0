package com.blueberrysoda.oreinamillion.util.enumerations;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public enum BlockType {

    Block(OreInAMillion.CREATIVE_TAB_BLOCK, Material.IRON, "pickaxe", SoundType.METAL, Categories.Storage),
    Ore(OreInAMillion.CREATIVE_TAB_BLOCK, Material.ROCK, "pickaxe", SoundType.STONE, Categories.Ore),
    Cluster(OreInAMillion.CREATIVE_TAB_BLOCK, Material.ROCK, "pickaxe", SoundType.STONE, Categories.Ore),
    Dirty_Dust_Block(OreInAMillion.CREATIVE_TAB_BLOCK, Material.SAND, "shovel", SoundType.GROUND, Categories.Falling),
    Dust_Block(OreInAMillion.CREATIVE_TAB_BLOCK, Material.SAND, "shovel", SoundType.SAND, Categories.Falling)
    ;


    private final CreativeTabs creativeTab;
    private final Material material;
    private final String tool;
    private final SoundType soundType;
    private final Categories category;

    BlockType( CreativeTabs creativeTab, Material material, String tool, SoundType soundType, Categories category) {
        this.creativeTab = creativeTab;
        this.material = material;
        this.tool = tool;
        this.soundType = soundType;
        this.category = category;
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

    public Categories getCategory() {
        return category;
    }
}
