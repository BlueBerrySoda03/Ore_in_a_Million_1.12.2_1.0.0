package com.blueberrysoda.oreinamillion.blocks.combined;

import com.blueberrysoda.oreinamillion.blocks.base.BlockBase;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockCombinedCoal extends BlockBase {

    private final int burnTime;
    private final int harvestLevel;

    public BlockCombinedCoal(String name, Material material, int burnTimeIn, int harvestLevel) {
        super(name, Material.ROCK);

        setSoundType(SoundType.STONE);
        setHardness(5.0F);
        setResistance(15.0f);
        setHarvestLevel("pickaxe", harvestLevel);
        this.burnTime = burnTimeIn;
        this.harvestLevel = harvestLevel;
    }

//    @Override
//    public int getBlockBurnTime(ItemStack itemStackIn){
//        return this.burnTime;
//    }


}
