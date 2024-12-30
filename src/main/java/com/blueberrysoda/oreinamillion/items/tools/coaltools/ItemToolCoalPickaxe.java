package com.blueberrysoda.oreinamillion.items.tools.coaltools;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import com.blueberrysoda.oreinamillion.items.armor.ItemArmorBase;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public class ItemToolCoalPickaxe extends ItemPickaxe {

    public final int burnTime;
    public static boolean addTooltip;

    public ItemToolCoalPickaxe(String name, ToolMaterial material, int burnTimeIn, boolean addTooltip) {
        super(material);
        this.burnTime = burnTimeIn;
        setRegistryName(name);
        setUnlocalizedName(OreInAMillion.MODID + "." + name);
        setCreativeTab(OreInAMillion.CREATIVE_TAB_TOOL);
        ItemToolCoalPickaxe.addTooltip = addTooltip;
    }

    @Override
    public int getItemBurnTime(ItemStack itemStackIn){
        return this.burnTime;
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
