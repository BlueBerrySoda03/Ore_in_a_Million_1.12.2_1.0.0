package com.blueberrysoda.oreinamillion.items.tools.foodtools;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

import javax.annotation.Nonnull;

public class ItemToolFoodAxe extends ItemAxe {

    public static int addHunger;
    public static int addSaturation;

    public ItemToolFoodAxe(String name, ToolMaterial material, int addHunger, int addSaturation) {
        ///the code to make the axes flexible in damage and attack speed came from Metallurgy 4 Reforged
        ///I thought I was gonna go crazy figuring this out. Thank you Metallurgy dev :D
        //-2.5F - (material.getAttackDamage() / 5)
        super(material, (material.getAttackDamage() * 1.25F) + 3.0F, -3.0F);
        setRegistryName(name);
        setUnlocalizedName(OreInAMillion.MODID + "." + name);
        setCreativeTab(OreInAMillion.CREATIVE_TAB_TOOL);
        ItemToolFoodAxe.addHunger = addHunger;
        ItemToolFoodAxe.addSaturation = addSaturation;
    }

    @Override
    @Nonnull
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
