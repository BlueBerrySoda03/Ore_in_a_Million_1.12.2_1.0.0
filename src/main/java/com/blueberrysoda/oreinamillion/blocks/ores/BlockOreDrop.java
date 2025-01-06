package com.blueberrysoda.oreinamillion.blocks.ores;

import com.blueberrysoda.oreinamillion.blocks.base.BlockBase;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class BlockOreDrop extends BlockBase {

    private final Item dropItem;
    private final int baseDropCount;
    private final int harvestLevel;

    public BlockOreDrop(String name, Item dropItem, int baseDropCount, int harvestLevel) {
        super(name, Material.ROCK);
        setHardness(3.0F);
        setResistance(15.0f);
        setHarvestLevel("pickaxe", harvestLevel);
        this.dropItem = dropItem;
        this.baseDropCount = baseDropCount;
        this.harvestLevel = harvestLevel;
    }

    @Override
    public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
        super.breakBlock(worldIn, pos, state);
        if (!worldIn.isRemote) {
            EntityPlayer player = worldIn.getClosestPlayer(pos.getX(), pos.getY(), pos.getZ(), 2, false);
            if (player != null && !player.isCreative()) {
                ItemStack tool = player.getHeldItemMainhand();
                int fortuneLevel = EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, tool);
                int totalDrops = calculateTotalDrops(baseDropCount, fortuneLevel);

                for (int i = 0; i < totalDrops; i++) {
                    spawnAsEntity(worldIn, pos, new ItemStack(dropItem));
                }
            }
        }
    }

    private int calculateTotalDrops(int baseDropCount, int fortuneLevel) {
        Random random = new Random();
        int extraDrops = fortuneLevel > 0 ? random.nextInt(fortuneLevel + baseDropCount) : 0;
        return baseDropCount + extraDrops;
    }

    @Override
    public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, TileEntity tileEntity, ItemStack stack) {
        if (!worldIn.isRemote) {
            worldIn.setBlockToAir(pos);
        }
    }
}
