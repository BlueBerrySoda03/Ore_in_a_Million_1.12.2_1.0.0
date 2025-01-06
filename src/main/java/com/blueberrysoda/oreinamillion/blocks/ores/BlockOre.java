package com.blueberrysoda.oreinamillion.blocks.ores;

import com.blueberrysoda.oreinamillion.blocks.base.BlockBase;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockOre extends BlockBase {

    private final int harvestLevel;

    public BlockOre(String name, int harvestLevel) {
        super(name, Material.ROCK);
        setSoundType(SoundType.STONE);
        setHardness(3.0F);
        setResistance(15.0f);
        setHarvestLevel("pickaxe", harvestLevel);
        this.harvestLevel = harvestLevel;
    }
}
