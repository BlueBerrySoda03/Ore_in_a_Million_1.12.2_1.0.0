package com.blueberrysoda.oreinamillion.items.armor;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public class ItemArmorBase extends ItemArmor {

    private static CreativeTabs creativeTab;
    private final boolean addTooltip;

    public ItemArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, CreativeTabs creativeTabs, boolean addTooltip) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        setRegistryName(name);
        setUnlocalizedName(OreInAMillion.MODID + "." + name);
        setCreativeTab(OreInAMillion.CREATIVE_TAB_ARMOR);
        this.addTooltip = addTooltip;
        ItemArmorBase.creativeTab = creativeTab;
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
