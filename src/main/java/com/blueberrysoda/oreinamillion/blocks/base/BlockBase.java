package com.blueberrysoda.oreinamillion.blocks.base;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nonnull;


public class BlockBase extends Block{

    public BlockBase(String name, Material material, String tool, int harvestLevel, SoundType soundType){
        super(material);
        setRegistryName(name);
        setUnlocalizedName(OreInAMillion.MODID + "." + name);
        setHarvestLevel(tool, harvestLevel);
        setSoundType(soundType);
        setHardness(3.0F);
        setResistance(15.0F);
    }

    @SideOnly(Side.CLIENT)
    @Nonnull
    @Override
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.CUTOUT;
    }
}
