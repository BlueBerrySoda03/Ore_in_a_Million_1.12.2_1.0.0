package com.blueberrysoda.oreinamillion.items.tools.basetools;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public class ItemToolPickaxe extends ItemPickaxe {

    private final boolean addTooltip;

    public ItemToolPickaxe(String name, Item.ToolMaterial material, CreativeTabs creativeTab, boolean addTooltip) {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(OreInAMillion.MODID + "." + name);
        setCreativeTab(creativeTab);
        this.addTooltip = addTooltip;
    }

    @Override
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
