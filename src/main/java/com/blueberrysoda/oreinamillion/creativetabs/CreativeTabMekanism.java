package com.blueberrysoda.oreinamillion.creativetabs;

import com.blueberrysoda.oreinamillion.util.enumerations.MaterialType;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CreativeTabMekanism extends CreativeTabs {
    private int tab;

    public CreativeTabMekanism(int par1, String CreativeTabMekanism, int par3) {
        super(par1, CreativeTabMekanism);
        tab = par3;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ItemStack getTabIconItem(){
        return new ItemStack(MaterialType.Cobalt.getItem("dust"));
    }
}
