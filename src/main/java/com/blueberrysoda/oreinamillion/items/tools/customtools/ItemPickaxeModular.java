package com.blueberrysoda.oreinamillion.items.tools.customtools;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import com.blueberrysoda.oreinamillion.util.enumerations.EquipmentType;
import com.blueberrysoda.oreinamillion.util.enumerations.ToolMaterials;
import com.blueberrysoda.oreinamillion.util.modularity.ModularItemTool;
import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

import java.util.Set;

public class ItemPickaxeModular extends ModularItemTool {
    public ItemPickaxeModular(String name, ToolMaterials first, ToolMaterials second, ToolMaterials third, ToolMaterials fourth) {
        super(name, EquipmentType.Pickaxe, first != null ? first : ToolMaterials.Diamond, second != null ? second : ToolMaterials.Diamond, third != null ? third : ToolMaterials.Emerald, fourth);
        setCreativeTab(OreInAMillion.CREATIVE_TAB_MAIN);
    }

    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.ACTIVATOR_RAIL, Blocks.COAL_ORE, Blocks.COBBLESTONE, Blocks.DETECTOR_RAIL, Blocks.DIAMOND_BLOCK, Blocks.DIAMOND_ORE, Blocks.DOUBLE_STONE_SLAB, Blocks.GOLDEN_RAIL, Blocks.GOLD_BLOCK, Blocks.GOLD_ORE, Blocks.ICE, Blocks.IRON_BLOCK, Blocks.IRON_ORE, Blocks.LAPIS_BLOCK, Blocks.LAPIS_ORE, Blocks.LIT_REDSTONE_ORE, Blocks.MOSSY_COBBLESTONE, Blocks.NETHERRACK, Blocks.PACKED_ICE, Blocks.RAIL, Blocks.REDSTONE_ORE, Blocks.SANDSTONE, Blocks.RED_SANDSTONE, Blocks.STONE, Blocks.STONE_SLAB, Blocks.STONE_BUTTON, Blocks.STONE_PRESSURE_PLATE);

    public float getDestroySpeed(ItemStack stack, IBlockState state)
    {
        Material material = state.getMaterial();
        return material != Material.IRON && material != Material.ANVIL && material != Material.ROCK ? super.getDestroySpeed(stack, state) : this.miningSpeed;
    }
}

