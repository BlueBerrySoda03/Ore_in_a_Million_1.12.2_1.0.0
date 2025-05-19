package com.blueberrysoda.oreinamillion.recipes;

import com.blueberrysoda.oreinamillion.util.enumerations.MaterialType;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

import java.util.List;


public class SmeltingRecipes {
    public static void init() {
//        GameRegistry.addSmelting(new ItemStack(MaterialType.Adamantine.getItem("dust")), new ItemStack(MaterialType.Adamantine.getItem("ingot")), 0.7F);
//        GameRegistry.addSmelting(new ItemStack(MaterialType.Aluminum.getItem("dust")), new ItemStack(MaterialType.Aluminum.getItem("ingot")), 0.7F);
        for (MaterialType material : MaterialType.values()) {
            Item ingot = material.getItem("ingot");
            Item cleanDust = material.getItem("dust");
            Item tinyDust = material.getItem("tiny_dust");
            Item nugget = material.getItem("nugget");
            Block oreBlock = material.getBlock("ore");
            Block dustBlock = material.getBlock("dust_block");
            Block storageBlock = material.getBlock("block");

            if (ingot != null && cleanDust != null) {
                GameRegistry.addSmelting(new ItemStack(cleanDust), new ItemStack(ingot), 0.7F);
            }

            if (tinyDust != null && nugget != null) {
                GameRegistry.addSmelting(new ItemStack(tinyDust), new ItemStack(nugget), 0.7F);
            }

            if (oreBlock != null && ingot != null) {
                GameRegistry.addSmelting(new ItemStack(Item.getItemFromBlock(oreBlock)), new ItemStack(ingot), 0.7F);
            }

            if (dustBlock != null && ingot != null) {
                GameRegistry.addSmelting(new ItemStack(Item.getItemFromBlock(dustBlock)), new ItemStack(Item.getItemFromBlock(storageBlock)), 0.7F);
            }
        }
    }
}
