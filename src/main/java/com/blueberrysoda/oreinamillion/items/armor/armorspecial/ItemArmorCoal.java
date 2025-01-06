package com.blueberrysoda.oreinamillion.items.armor.armorspecial;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public class ItemArmorCoal extends ItemArmor {

    private static boolean addTooltip;
    public static int burnTime;

    public ItemArmorCoal(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, int burnTime, boolean addTooltip) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        setRegistryName(name);
        setUnlocalizedName(OreInAMillion.MODID + "." + name);
        setMaxStackSize(1);
        setCreativeTab(OreInAMillion.CREATIVE_TAB_ARMOR);
        ItemArmorCoal.burnTime = burnTime;
        ItemArmorCoal.addTooltip = addTooltip;
    }

    @Override
    public int getItemBurnTime(ItemStack itemStackIn){
        return ItemArmorCoal.burnTime;
    }

    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
        super.addInformation(stack,worldIn,tooltip,flagIn);
        if (ItemArmorCoal.addTooltip) {
            String s = stack.getItem().getUnlocalizedName() + ".tooltip";
            String result = I18n.format(s);
            tooltip.add(result);
        }
    }
}
