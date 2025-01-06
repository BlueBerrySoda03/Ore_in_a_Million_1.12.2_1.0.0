package com.blueberrysoda.oreinamillion.blocks.combined;

import com.blueberrysoda.oreinamillion.blocks.base.BlockBase;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;

public class BlockCombinedCoalTier1 extends BlockBase {

    private final int burnTime;

    public BlockCombinedCoalTier1(String name, Material material, int burnTimeIn) {
        super(name, Material.ROCK);
        setSoundType(SoundType.STONE);
        setHardness(5.0F);
        setResistance(15.0f);
        setHarvestLevel("pickaxe", 1);
        this.burnTime = burnTimeIn;
    }

//    @Override
//    public int getBlockBurnTime(ItemStack itemStackIn){
//        return this.burnTime;
//    }


}
