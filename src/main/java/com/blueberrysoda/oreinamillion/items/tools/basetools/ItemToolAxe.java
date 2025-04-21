package com.blueberrysoda.oreinamillion.items.tools.basetools;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public class ItemToolAxe extends ItemAxe {

    private final boolean addTooltip;

    public ItemToolAxe(String name, ToolMaterial material, CreativeTabs creativeTab, boolean addTooltip) {
        ///the code to make the axes flexible in damage and attack speed came from Metallurgy 4 Reforged
        ///I thought I was gonna go crazy figuring this out. Thank you Metallurgy devs :D
        //-2.5F - (material.getAttackDamage() / 5)
        super(material, (material.getAttackDamage() * 1.8F) + 3.0F, -3.0F);
        setRegistryName(name);
        setUnlocalizedName(OreInAMillion.MODID + "." + name);
        setCreativeTab(creativeTab);
        this.addTooltip = addTooltip;
    }

    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
        super.addInformation(stack,worldIn,tooltip,flagIn);
        if (this.addTooltip) {
            if (GuiScreen.isShiftKeyDown()) {
                String s = stack.getItem().getUnlocalizedName() + ".tooltip";
                String result = I18n.format(s);
                tooltip.add(result);
            } else {
                String s = "hold.shift.tooltip";
                String result = I18n.format(s);
                tooltip.add(result);
            }
        }
    }
}
