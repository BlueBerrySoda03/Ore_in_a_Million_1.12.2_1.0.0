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

import javax.annotation.Nonnull;

public class ItemToolFoodSword extends ItemSword {

    public static int addHunger;
    public static int addSaturation;

    public ItemToolFoodSword(String name, ToolMaterial material, int addHunger, int addSaturation) {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(OreInAMillion.MODID + "." + name);
        setCreativeTab(OreInAMillion.CREATIVE_TAB_TOOL);
        ItemToolFoodSword.addHunger = addHunger;
        ItemToolFoodSword.addSaturation = addSaturation;
    }


    @Override
    public EnumAction getItemUseAction(ItemStack stack) {
        return EnumAction.EAT;
    }


    @Override
    public int getMaxItemUseDuration (ItemStack stack) {
        return 32;
    }

    @Nonnull
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving) {
        if (entityLiving instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) entityLiving;
            player.getFoodStats().addStats(addHunger, addSaturation);
            stack.shrink(1);

            ItemStack dropStack = new ItemStack(Items.STICK, 1);
            player.dropItem(dropStack, false);
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
