package com.blueberrysoda.oreinamillion.blocks.base;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBase extends Block{

    public BlockBase(String name, Material material){
        super(material);
        setRegistryName(name);
        setUnlocalizedName(OreInAMillion.MODID + "." + name);
        setCreativeTab(OreInAMillion.CREATIVE_TAB_BLOCK);
    }
}
