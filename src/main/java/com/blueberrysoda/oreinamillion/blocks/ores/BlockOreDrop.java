package com.blueberrysoda.oreinamillion.blocks.ores;

import com.blueberrysoda.oreinamillion.blocks.base.BlockBase;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import javax.annotation.Nonnull;
import java.util.Random;

public class BlockOreDrop extends BlockBase {

    private final Item itemDrop;
    private final int harvestLevel;
    private final int dropAmount;

    public BlockOreDrop(String name, Item itemDrop, int dropAmount, int harvestLevel) {
        super(name, Material.ROCK);
        setHardness(3.0F);
        setResistance(15.0f);
        setHarvestLevel("pickaxe", harvestLevel);
        this.itemDrop = itemDrop;
        this.harvestLevel = harvestLevel;
        this.dropAmount = dropAmount;
    }

    @Override
    @Nonnull
    public Item getItemDropped(IBlockState state, Random random, int fortune) {
        return itemDrop;
    }

    @Override
    public int quantityDropped(Random random) {
        return dropAmount;
    }
}
