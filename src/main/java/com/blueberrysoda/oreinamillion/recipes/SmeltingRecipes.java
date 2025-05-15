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
        GameRegistry.addSmelting(new ItemStack(MaterialType.Adamantine.getItem("dust")), new ItemStack(MaterialType.Adamantine.getItem("ingot")), 0.7F);
        GameRegistry.addSmelting(new ItemStack(MaterialType.Aluminum.getItem("dust")), new ItemStack(MaterialType.Aluminum.getItem("ingot")), 0.7F);
//        for (MaterialType material : MaterialType.values()) {
//            Item ingot = material.getItem("ingot");
//            Item cleanDust = material.getItem("dust");
//            Block oreBlock = material.getBlock("ore");
//
//            if (ingot != null && cleanDust != null) {
//                GameRegistry.addSmelting(new ItemStack(cleanDust), new ItemStack(ingot), 0.7F);
//            }
//
//            if (oreBlock != null && ingot != null) {
//                GameRegistry.addSmelting(new ItemStack(Item.getItemFromBlock(oreBlock)), new ItemStack(ingot), 0.7F);
//            }
//        }
//        for (MaterialType material : MaterialType.values()) {
//            String ingotOreName = "ingot" + material.getRegistryName("");
//            String dustOreName = "dust" + material.getRegistryName("");
//
//            List<ItemStack> dustEntries = OreDictionary.getOres(dustOreName);
//            List<ItemStack> ingotEntries = OreDictionary.getOres(ingotOreName);
//
//            if (!dustEntries.isEmpty() && !ingotEntries.isEmpty()) {
//                ItemStack output = ingotEntries.get(0);
//
//                for (ItemStack input : dustEntries) {
//                    GameRegistry.addSmelting(input, output, 0.7F);
//                }
//            }
//        }
    }
}
