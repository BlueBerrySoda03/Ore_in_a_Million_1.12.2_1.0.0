package com.blueberrysoda.oreinamillion.items.tools.foodtools;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nonnull;

public class ItemToolFoodHoe extends ItemHoe {

    public static int addHunger;
    public static int addSaturation;

    public ItemToolFoodHoe(String name, ToolMaterial material, int addHunger, int addSaturation) {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(OreInAMillion.MODID + "." + name);
        setCreativeTab(OreInAMillion.CREATIVE_TAB_TOOL);
        ItemToolFoodHoe.addHunger = addHunger;
        ItemToolFoodHoe.addSaturation = addSaturation;
    }

//    @Nonnull
//    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
//        if (player.isSneaking()) {
//            player.setActiveHand(hand);
//            return EnumActionResult.SUCCESS;
//        }
//        return EnumActionResult.PASS;
//    }

    @Override
    @Nonnull
    public EnumAction getItemUseAction(ItemStack stack) {
        return EnumAction.EAT;
    }

    @Override
    public int getMaxItemUseDuration (ItemStack stack) {
        return 32;
    }

    @Override
    @Nonnull
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving) {
        if (entityLiving instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) entityLiving;
            player.getFoodStats().addStats(addHunger, addSaturation);
            stack.shrink(1);

            ItemStack dropStack = new ItemStack(Items.STICK, 2);
            player.dropItem(dropStack, false);
        }
        return super.onItemUseFinish(stack, worldIn, entityLiving);
    }

    @Override
    @Nonnull
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        ItemStack itemStack = playerIn.getHeldItem(handIn);

        if (playerIn.getFoodStats().getFoodLevel() < 20) {
            playerIn.setActiveHand(handIn);
            worldIn.playSound(null, playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.ENTITY_GENERIC_EAT, SoundCategory.PLAYERS, 1.0F, 1.0F);
            return new ActionResult<>(EnumActionResult.SUCCESS, itemStack);
        }
        else {
            return new ActionResult<>(EnumActionResult.FAIL, itemStack);
        }
    }
}
