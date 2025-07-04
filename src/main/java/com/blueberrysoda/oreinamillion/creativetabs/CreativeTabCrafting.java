package com.blueberrysoda.oreinamillion.creativetabs;

import com.blueberrysoda.oreinamillion.util.enumerations.MaterialType;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CreativeTabCrafting extends CreativeTabs {
    private int tab;

    public CreativeTabCrafting(int par1, String CreativeTabMain, int par3) {
        super(par1, CreativeTabMain);
        tab = par3;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ItemStack getTabIconItem(){
        return new ItemStack(MaterialType.Copper.getItem("gear"));
    }
}
