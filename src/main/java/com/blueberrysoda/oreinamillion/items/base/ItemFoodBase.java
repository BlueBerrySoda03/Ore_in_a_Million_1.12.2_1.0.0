package com.blueberrysoda.oreinamillion.items.base;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import com.blueberrysoda.oreinamillion.recipes.CraftingRecipes;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public class ItemFoodBase extends ItemFood {

    private static CreativeTabs creativeTab;
    private static boolean addTooltip;

    public ItemFoodBase(String name, int amount, float saturation, boolean isWolfFood, CreativeTabs creativeTab, boolean addTooltip) {
        super(amount, saturation, isWolfFood);
        setRegistryName(name);
        setUnlocalizedName(OreInAMillion.MODID + "." + name);
        setMaxStackSize(64);
        setCreativeTab(creativeTab);
        ItemFoodBase.creativeTab = creativeTab;
        ItemFoodBase.addTooltip = addTooltip;
    }

    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
        super.addInformation(stack,worldIn,tooltip,flagIn);
        if (ItemFoodBase.addTooltip) {
            String s = stack.getItem().getUnlocalizedName() + ".tooltip";
            String result = I18n.format(s);
            tooltip.add(result);
        }
    }
}
