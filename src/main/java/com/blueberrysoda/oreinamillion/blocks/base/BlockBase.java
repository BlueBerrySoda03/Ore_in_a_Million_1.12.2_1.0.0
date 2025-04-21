package com.blueberrysoda.oreinamillion.blocks.base;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import com.blueberrysoda.oreinamillion.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

import java.util.Objects;

public class BlockBase extends Block{

//    private static SoundType soundType;
//    private static float hardness;
//    private static float resistance;
//    private static int harvestLevel;
//    private static String toolClass;
//    private static boolean addTooltip;
//
//    , String toolClass, SoundType soundType, float hardness, float resistance, int harvestLevel

    public BlockBase(String name, Material material){
        super(material);
        setRegistryName(name);
        setUnlocalizedName(OreInAMillion.MODID + "." + name);
        setCreativeTab(OreInAMillion.CREATIVE_TAB_BLOCK);

        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(Objects.requireNonNull(this.getRegistryName())));
    }
}
