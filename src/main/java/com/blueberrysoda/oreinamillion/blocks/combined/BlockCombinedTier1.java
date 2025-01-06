package com.blueberrysoda.oreinamillion.blocks.combined;

import com.blueberrysoda.oreinamillion.blocks.base.BlockBase;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockCombinedTier1 extends BlockBase {

    public BlockCombinedTier1(String name) {
        super(name, Material.IRON);

        setSoundType(SoundType.METAL);
        setHardness(5.0F);
        setResistance(15.0f);
        setHarvestLevel("pickaxe", 1);
    }
}
