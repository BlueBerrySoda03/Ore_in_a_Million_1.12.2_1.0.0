package com.blueberrysoda.oreinamillion.items.food;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import com.blueberrysoda.oreinamillion.init.ModItems;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemFoodSoupcan extends ItemFood {

    public ItemFoodSoupcan(String name, int amount, float saturation, boolean isAnimalFood) {
        super(amount, saturation, isAnimalFood);
        setRegistryName(name);
        setUnlocalizedName(OreInAMillion.MODID + "." + name);
        setMaxStackSize(1);
        setCreativeTab(OreInAMillion.CREATIVE_TAB_MAIN);
    }

    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving) {
        if (entityLiving instanceof EntityPlayer) {
            //EntityPlayer player = (EntityPlayer) entityLiving;
            //player.getFoodStats().addStats(7, 5F);
            return new ItemStack(ModItems.tinCan);
        }
        return super.onItemUseFinish(stack, worldIn, entityLiving);
    }
}
