package com.blueberrysoda.oreinamillion.blocks.drop;

import com.blueberrysoda.oreinamillion.blocks.base.BlockDropBase;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class BlockDropStone extends BlockDropBase {
    public BlockDropStone(String name, Material materialIn, String toolClass, int harvestLevel, CreativeTabs creativeTab, ItemStack itemDrop, Block transBlock, boolean addTooltip) {
        super(name, materialIn, toolClass, harvestLevel, creativeTab, itemDrop, transBlock, addTooltip);
        setHardness(3.0F);
        setResistance(15.0F);
        setSoundType(SoundType.STONE);
    }
}
