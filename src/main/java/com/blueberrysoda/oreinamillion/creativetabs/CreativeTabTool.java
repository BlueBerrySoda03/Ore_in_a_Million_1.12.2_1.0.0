package com.blueberrysoda.oreinamillion.creativetabs;

import com.blueberrysoda.oreinamillion.util.enumerations.MaterialType;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CreativeTabTool extends CreativeTabs {    private int tab;

    public CreativeTabTool(int par1, String CreativeTabTool, int par3) {
        super(par1, CreativeTabTool);
        tab = par3;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ItemStack getTabIconItem(){
        return new ItemStack(MaterialType.Cobalt.getItem("pickaxe"));
    }
}
