package com.blueberrysoda.oreinamillion.creativetabs;

import com.blueberrysoda.oreinamillion.util.enumerations.MaterialType;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CreativeTabMineral extends CreativeTabs {
    private int tab;

    public CreativeTabMineral(int par1, String CreativeTabMineral, int par3) {
        super(par1, CreativeTabMineral);
        tab = par3;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ItemStack getTabIconItem(){
        return new ItemStack(MaterialType.Adamantine.getItem("ingot"));
    }
}
