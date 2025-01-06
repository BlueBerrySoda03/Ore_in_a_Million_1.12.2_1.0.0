package com.blueberrysoda.oreinamillion.blocks.combined;

import com.blueberrysoda.oreinamillion.blocks.base.BlockBase;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockCombined extends BlockBase {

    private final int harvestLevel;

    public BlockCombined(String name, int harvestLevel) {
        super(name, Material.IRON);
        setSoundType(SoundType.METAL);
        setHardness(5.0F);
        setResistance(15.0f);
        setHarvestLevel("pickaxe", harvestLevel);
        this.harvestLevel = harvestLevel;
    }
}
