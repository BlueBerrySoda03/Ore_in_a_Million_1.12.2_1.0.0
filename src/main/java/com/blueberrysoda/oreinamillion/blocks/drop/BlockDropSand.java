package com.blueberrysoda.oreinamillion.blocks.drop;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import com.blueberrysoda.oreinamillion.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class BlockDropSand extends BlockFalling {

    private final Item itemDrop;
    private final Block transBlock;
    private final boolean addTooltip;

    public BlockDropSand(String name, CreativeTabs creativeTab, ItemStack itemDrop, Block transBlock, boolean addTooltip) {
        super();
        setRegistryName(name);
        setUnlocalizedName(OreInAMillion.MODID + "." + name);
        setHardness(0.5F);
        setResistance(10.0F);
        setSoundType(SoundType.SAND);
        setCreativeTab(creativeTab);
        this.itemDrop = itemDrop.getItem();
        this.transBlock = transBlock;
        this.addTooltip = addTooltip;

        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(Objects.requireNonNull(this.getRegistryName())));
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, net.minecraft.util.EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (!worldIn.isRemote) {
            ItemStack dropItem = new ItemStack(itemDrop);

            double spawnX = pos.getX() + 0.5;
            double spawnY = pos.getY() + 1.2;
            double spawnZ = pos.getZ() + 0.5;

            Block.spawnAsEntity(worldIn, new BlockPos(spawnX, spawnY, spawnZ), dropItem);

            worldIn.setBlockState(pos, transBlock.getDefaultState(), 3);

            return true;
        }
        return false;
    }

    @Override
    @Nonnull
    public Item getItemDropped(IBlockState state, Random random, int fortune) {
        return itemDrop;
    }

    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
        super.addInformation(stack,worldIn,tooltip,flagIn);
        if (this.addTooltip) {
            String s = stack.getItem().getUnlocalizedName() + ".tooltip";
            String result = I18n.format(s);
            tooltip.add(result);
        }
    }
}
