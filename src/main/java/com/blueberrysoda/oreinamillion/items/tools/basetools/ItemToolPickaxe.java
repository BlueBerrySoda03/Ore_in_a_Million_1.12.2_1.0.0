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
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);

        String tooltipKey = stack.getItem().getUnlocalizedName() + ".tooltip";
        String shiftKeyMessage = "hold.shift.tooltip";

        if (GuiScreen.isShiftKeyDown()) {
//            tooltip.add(I18n.format(tooltipKey));
            if (this.toolMaterial != null) {
                tooltip.add(I18n.format("tooltip.harvest_level") + ": " + toolMaterial.getHarvestLevel());
                tooltip.add(I18n.format("tooltip.enchantability") + ": " + toolMaterial.getEnchantability());
                tooltip.add(I18n.format("tooltip.mining_speed") + ": " + toolMaterial.getEfficiency());
            }
        } else {
            tooltip.add(I18n.format(shiftKeyMessage));
        }
    }
}
