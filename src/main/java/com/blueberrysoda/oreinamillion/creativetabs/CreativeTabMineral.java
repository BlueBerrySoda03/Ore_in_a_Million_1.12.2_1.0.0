package com.blueberrysoda.oreinamillion.creativetabs;

import com.blueberrysoda.oreinamillion.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Arrays;
import java.util.List;

public class CreativeTabMineral extends CreativeTabs {
    private int tab;

    public CreativeTabMineral(int par1, String CreativeTabMineral, int par3) {
        super(par1, CreativeTabMineral);
        tab = par3;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ItemStack getTabIconItem(){
        return new ItemStack(ModItems.creativeIcon2);
    }

//    @Override
//    public void displayAllRelevantItems(NonNullList<ItemStack> itemStack){
//        List<Item> getItem = Arrays.asList(
//                ModItems.ingotAluminum,
//                ModItems.ingotArdite,
//                ModItems.ingotChrome,
//                ModItems.ingotCobalt,
//                ModItems.ingotCopper,
//                ModItems.ingotConstantan
//        );
//    }
}
