package com.blueberrysoda.oreinamillion.items.tools.basetools;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import com.blueberrysoda.oreinamillion.items.base.ItemBase;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public class ItemToolSword extends ItemSword {

    private final ToolMaterial material;
    private final boolean addTooltip;

    public ItemToolSword(String name, ToolMaterial material, CreativeTabs creativeTab, boolean addTooltip) {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(OreInAMillion.MODID + "." + name);
        setCreativeTab(creativeTab);
        this.addTooltip = addTooltip;
        this.material = material;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);

        String tooltipKey = stack.getItem().getUnlocalizedName() + ".tooltip";
        String shiftKeyMessage = "hold.shift.tooltip";

        if (GuiScreen.isShiftKeyDown()) {
//            tooltip.add(I18n.format(tooltipKey));
            if (this.material != null) {
                tooltip.add(I18n.format("tooltip.harvest_level") + ": " + material.getHarvestLevel());
                tooltip.add(I18n.format("tooltip.enchantability") + ": " + material.getEnchantability());
                tooltip.add(I18n.format("tooltip.mining_speed") + ": " + material.getEfficiency());
            }
        } else {
            tooltip.add(I18n.format(shiftKeyMessage));
        }
    }
}
