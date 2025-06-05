package com.blueberrysoda.oreinamillion.compat.mekanism;

import com.blueberrysoda.oreinamillion.util.enumerations.MaterialType;
import mekanism.api.gas.Gas;
import mekanism.api.gas.GasRegistry;
import mekanism.common.recipe.RecipeHandler;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MekanismRecipes {

    public static void registerRecipes(MaterialType material) {
        Item ingot = material.getItem("ingot");
        Item gem = material.getItem("gem");
        Item element = material.getItem("element");
        Item nugget = material.getItem("nugget");
        Item dust = material.getItem("dust");
        Item tinyDust = material.getItem("tiny_dust");
        Item dirtyDust = material.getItem("dirty_dust");
        Item dirtyTinyDust = material.getItem("tiny_dirty_dust");
        Item clump = material.getItem("clump");
        Item crystal = material.getItem("crystal");
        Item shard = material.getItem("shard");
        Item sword = material.getItem("sword");
        Item pickaxe = material.getItem("pickaxe");
        Item axe = material.getItem("axe");
        Item shovel = material.getItem("shovel");
        Item hoe = material.getItem("hoe");
        Item hammer = material.getItem("hammer");
        Item helmet = material.getItem("helmet");
        Item chestplate = material.getItem("chestplate");
        Item leggings = material.getItem("leggings");
        Item boots = material.getItem("boots");
        Block oreBlock = material.getBlock("ore");
        Block dustBlock = material.getBlock("dust_block");
        Block dirtyDustBlock = material.getBlock("dirty_dust_block");
        Block storageBlock = material.getBlock("block");

        //mekanism only things
        Gas hydrogenChloride = GasRegistry.getGas("hydrogenChloride");

        //crusher recipes
        //I know how it is, you know how it is. ingot/gem/element to dust, nugget to tiny dust, and some other random stuffs
        if (ingot != null && dust != null) {
            RecipeHandler.addCrusherRecipe(new ItemStack(ingot), new ItemStack(dust));
        }
        if (gem != null && dust != null) {
            RecipeHandler.addCrusherRecipe(new ItemStack(gem), new ItemStack(dust));
        }
        if (element != null && dust != null) {
            RecipeHandler.addCrusherRecipe(new ItemStack(element), new ItemStack(dust));
        }
        if (nugget != null && tinyDust != null) {
            RecipeHandler.addCrusherRecipe(new ItemStack(nugget), new ItemStack(tinyDust));
        }
        if (storageBlock != null && dustBlock != null) {
            RecipeHandler.addCrusherRecipe(new ItemStack(storageBlock), new ItemStack(dustBlock));
        }

        //chemical injection chamber recipes
        //mostly just ore to shard x4
        if (oreBlock != null && shard != null) {
            RecipeHandler.addChemicalInjectionChamberRecipe(new ItemStack(oreBlock), new Gas(String.valueOf(hydrogenChloride), 100), new ItemStack(shard, 4));
        }
        if (crystal != null && shard != null) {
            RecipeHandler.addChemicalInjectionChamberRecipe(new ItemStack(crystal), new Gas(String.valueOf(hydrogenChloride), 100), new ItemStack(shard));
        }

        //purification chamber recipes
        //ore to clump x3, shard to clump
        if (oreBlock != null && clump != null) {
            RecipeHandler.addPurificationChamberRecipe(new ItemStack(oreBlock), new ItemStack(clump, 3));
        }
        if (clump != null && shard != null) {
            RecipeHandler.addPurificationChamberRecipe(new ItemStack(shard), new ItemStack(clump));
        }

        //chemical dissolution chamber recipes
        //sulfuric acid + ore gets 1000mb of said ore's fluid... gas? idk

        //combiner recipes
        //cobblestone + 8 dust = ore. will probably support everything

        //enrichment chamber recipes
        //gem dust to gem && gem ore to gem. maybe include elements, because I see some in mekanism. also, it's the 1:2 ore to dust thingy
        //just found out, its also dirty dust to dust, might as well do dirty dust block to dust block
        if (oreBlock != null && dust != null) {
            RecipeHandler.addEnrichmentChamberRecipe(new ItemStack(oreBlock), new ItemStack(dust, 2));
        }
        if (gem != null && dust != null) {
            RecipeHandler.addEnrichmentChamberRecipe(new ItemStack(dust), new ItemStack(gem));
        }
        if (element != null && dust != null) {
            RecipeHandler.addEnrichmentChamberRecipe(new ItemStack(dust), new ItemStack(element));
        }
        if (dust != null && dirtyDust != null) {
            RecipeHandler.addEnrichmentChamberRecipe(new ItemStack(dirtyDust), new ItemStack(dust));
        }
        if (dirtyDustBlock != null && dustBlock != null) {
            RecipeHandler.addEnrichmentChamberRecipe(new ItemStack(dirtyDustBlock), new ItemStack(dustBlock));
        }
        if (tinyDust != null && dirtyTinyDust != null) {
            RecipeHandler.addEnrichmentChamberRecipe(new ItemStack(dirtyTinyDust), new ItemStack(tinyDust));
        }
    }

    public static void init() {
        for (MaterialType material : MaterialType.values()) {
            registerRecipes(material);
        }
    }
}
