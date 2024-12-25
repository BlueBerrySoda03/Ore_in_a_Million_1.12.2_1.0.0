package com.blueberrysoda.oreinamillion.items.tools.foodtools;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class ItemToolFoodSword extends ItemSword {

    public ItemToolFoodSword(String name, ToolMaterial material) {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(OreInAMillion.MODID + "." + name);
        setCreativeTab(OreInAMillion.CREATIVE_TAB_TOOL);
    }


    @Override
    public EnumAction getItemUseAction(ItemStack stack) {
        return EnumAction.EAT;
    }


    @Override
    public int getMaxItemUseDuration (ItemStack stack) {
        return 32;
    }

    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving) {
        if (entityLiving instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) entityLiving;
            player.getFoodStats().addStats(8, 4F);
            return new ItemStack(Items.STICK);
        }
        return super.onItemUseFinish(stack, worldIn, entityLiving);
    }

    @Override
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
