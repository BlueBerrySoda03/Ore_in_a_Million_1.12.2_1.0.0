package com.blueberrysoda.oreinamillion.util.handlers;

import com.blueberrysoda.oreinamillion.util.enumerations.ToolMaterials;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModularColorHandler implements IItemColor {
    @Override
    public int colorMultiplier(ItemStack stack, int tintIndex) {
        if (!stack.hasTagCompound()) return 0xFFFFFF;

        NBTTagCompound tag = stack.getTagCompound();

        switch (tintIndex) {
            case 0: return ToolMaterials.valueOf(tag.getString("HandleMaterial").toUpperCase()).getColor();
            case 1: return ToolMaterials.valueOf(tag.getString("HeadMaterial").toUpperCase()).getColor();
            case 2: return ToolMaterials.valueOf(tag.getString("TipsMaterial").toUpperCase()).getColor();
            case 3: return ToolMaterials.valueOf(tag.getString("ExtraMaterial").toUpperCase()).getColor();
            default: return 0xFF00DD;
        }
    }
}