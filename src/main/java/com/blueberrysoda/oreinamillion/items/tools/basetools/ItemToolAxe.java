package com.blueberrysoda.oreinamillion.items.tools.basetools;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import com.blueberrysoda.oreinamillion.items.armor.ItemArmorBase;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public class ItemToolAxe extends ItemAxe {

    public static boolean addTooltip;

    public ItemToolAxe(String name, ToolMaterial material, boolean addTooltip) {
        ///the code to make the axes flexible in damage and attack speed came from Metallurgy 4 Reforged
        ///I thought I was gonna go crazy figuring this out. Thank you Metallurgy dev :D
        //-2.5F - (material.getAttackDamage() / 5)
        super(material, (material.getAttackDamage() * 1.25F) + 3.0F, -3.0F);
        setRegistryName(name);
        setUnlocalizedName(OreInAMillion.MODID + "." + name);
        setCreativeTab(OreInAMillion.CREATIVE_TAB_TOOL);
        ItemToolAxe.addTooltip = addTooltip;
    }

    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
        super.addInformation(stack,worldIn,tooltip,flagIn);
        if (ItemArmorBase.addTooltip) {
            String s = stack.getItem().getUnlocalizedName() + ".tooltip";
            String result = I18n.format(s);
            tooltip.add(result);
        }
    }
}
