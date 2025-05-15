package com.blueberrysoda.oreinamillion.blocks.base;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.SoundType;

public class BlockBaseFalling extends BlockFalling {

    public BlockBaseFalling(String name, String tool, int harvestLevel, SoundType soundType){
        setRegistryName(name);
        setUnlocalizedName(OreInAMillion.MODID + "." + name);
        setHarvestLevel(tool, harvestLevel);
        setSoundType(soundType);
        setHardness(0.5F);
        setResistance(10.0F);
    }

}
