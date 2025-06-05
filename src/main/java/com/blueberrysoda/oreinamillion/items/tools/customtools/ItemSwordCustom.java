//package com.blueberrysoda.oreinamillion.items.tools.customtools;
//
//import com.blueberrysoda.oreinamillion.OreInAMillion;
//import com.blueberrysoda.oreinamillion.util.enumerations.ToolMaterials;
//import net.minecraft.block.Block;
//import net.minecraft.block.material.Material;
//import net.minecraft.block.state.IBlockState;
//import net.minecraft.client.gui.GuiScreen;
//import net.minecraft.client.resources.I18n;
//import net.minecraft.client.util.ITooltipFlag;
//import net.minecraft.entity.EntityLivingBase;
//import net.minecraft.init.Blocks;
//import net.minecraft.item.*;
//import net.minecraft.util.math.BlockPos;
//import net.minecraft.world.World;
//import net.minecraftforge.fml.relauncher.Side;
//import net.minecraftforge.fml.relauncher.SideOnly;
//
//import javax.annotation.Nullable;
//import java.util.List;
//
//public class ItemSwordCustom extends Item {
//
//    private final float attackDamage;
//
//    private final boolean addTooltip = true;
//    private ToolMaterials material;
//
//    public ItemSwordCustom(String name, ToolMaterials material) {
//        setRegistryName(name);
//        setUnlocalizedName(OreInAMillion.MODID + "." + name);
//        setCreativeTab(OreInAMillion.CREATIVE_TAB_TOOL);
//        setMaxDamage(material.getDurability());
//        this.attackDamage = 2.0F * material.getDamage();
//        this.material = material;
//    }
//
//    public float getAttackDamage() {
//        return this.attackDamage;
//    }
//
//    public float getDestroySpeed(ItemStack stack, IBlockState state)
//    {
//        Block block = state.getBlock();
//
//        if (block == Blocks.WEB)
//        {
//            return 15.0F;
//        }
//        else
//        {
//            Material material = state.getMaterial();
//            return material != Material.PLANTS && material != Material.VINE && material != Material.CORAL && material != Material.LEAVES && material != Material.GOURD ? 1.0F : 1.5F;
//        }
//    }
//
//    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
//    {
//        stack.damageItem(1, attacker);
//        return true;
//    }
//
//    public boolean onBlockDestroyed(ItemStack stack, World worldIn, IBlockState state, BlockPos pos, EntityLivingBase entityLiving)
//    {
//        if (!worldIn.isRemote && (double)state.getBlockHardness(worldIn, pos) != 0.0D)
//        {
//            stack.damageItem(2, entityLiving);
//        }
//
//        return true;
//    }
//
//    public boolean canHarvestBlock(IBlockState blockIn)
//    {
//        return blockIn.getBlock() == Blocks.WEB;
//    }
//
//    @SideOnly(Side.CLIENT)
//    public boolean isFull3D()
//    {
//        return true;
//    }
//
//    public ToolNBT
//
//    public static int getColorForMaterial(String material) {
//        try {
//            return ToolMaterials.valueOf(material.toUpperCase()).getColor();
//        } catch (IllegalArgumentException e) {
//            return 0xFFFFFF; // Default to white if material is invalid
//        }
//    }
//
//
//
//    @SideOnly(Side.CLIENT)
//    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
//        super.addInformation(stack, worldIn, tooltip, flagIn);
//
//        if (this.addTooltip) {
//            boolean shift = GuiScreen.isShiftKeyDown();
//            boolean ctrl = GuiScreen.isCtrlKeyDown();
//
//            tooltip.add(I18n.format(shift ? stack.getItem().getUnlocalizedName() + ".tooltip.shift" : "hold.shift.tooltip"));
//            tooltip.add(I18n.format(ctrl ? stack.getItem().getUnlocalizedName() + ".tooltip.ctrl" : "hold.ctrl.tooltip"));
//        }
//    }
//}
