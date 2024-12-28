package com.blueberrysoda.oreinamillion.blocks.ores.subores;

import com.blueberrysoda.oreinamillion.blocks.base.BlockBase;
import com.blueberrysoda.oreinamillion.init.ModItems;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockWeezerOre extends BlockBase {

    public BlockWeezerOre(String name, Material material) {
        super(name, material);

        setSoundType(SoundType.STONE);
        setHardness(3.0F);
        setResistance(15.0f);
        setHarvestLevel("pickaxe", 3);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random random, int fortune){
        return ModItems.weezerWeezer;
    }
}
