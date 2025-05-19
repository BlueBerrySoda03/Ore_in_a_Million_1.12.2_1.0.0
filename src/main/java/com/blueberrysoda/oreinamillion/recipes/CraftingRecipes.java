package com.blueberrysoda.oreinamillion.recipes;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import com.blueberrysoda.oreinamillion.util.CustomOreIngredient;
import com.blueberrysoda.oreinamillion.util.enumerations.MaterialType;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingRecipes {

    private static void registerRecipes(MaterialType material) {
        Item ingot = material.getItem("ingot");
        Item gem = material.getItem("gem");
        Item element = material.getItem("element");
        Item dust = material.getItem("dust");
        Item tinyDust = material.getItem("tiny_dust");
        Item dirtyDust = material.getItem("dirty_dust");
        Item dirtyTinyDust = material.getItem("tiny_dirty_dust");
        Item nugget = material.getItem("nugget");
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

        //======================
        //materials to nuggets
        //======================
        if (ingot != null && nugget !=null) {
            GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, material.getMaterialName() + "_nugget_to_ingot"), null,
                    new ItemStack(ingot),
                    "AAA", "AAA", "AAA", 'A',
                    new CustomOreIngredient("nugget" + material.getMaterialNameUppercase(), material.getMaterialName() + "Nugget"));
            GameRegistry.addShapelessRecipe(new ResourceLocation(OreInAMillion.MODID, material.getMaterialName() + "_ingot_to_nugget"), null,
                    new ItemStack(nugget, 9),
                    new CustomOreIngredient("ingot" + material.getMaterialNameUppercase(), material.getMaterialName().toLowerCase() + "Ingot"));
        }
        if (gem != null && nugget != null) {
            GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, material.getMaterialName() + "_nugget_to_gem"), null,
                    new ItemStack(gem),
                    "AAA", "AAA", "AAA", 'A',
                    new CustomOreIngredient("nugget" + material.getMaterialNameUppercase(), material.getMaterialName() + "Nugget"));
            GameRegistry.addShapelessRecipe(new ResourceLocation(OreInAMillion.MODID, material.getMaterialName() + "_gem_to_nugget"), null,
                    new ItemStack(nugget, 9),
                    new CustomOreIngredient("gem" + material.getMaterialNameUppercase(), material.getMaterialName().toLowerCase() + "Gem"));
        }
        if (element != null && nugget != null) {
            GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, material.getMaterialName() + "_nugget_to_element"), null,
                    new ItemStack(element),
                    "AAA", "AAA", "AAA", 'A',
                    new CustomOreIngredient("nugget" + material.getMaterialNameUppercase(), material.getMaterialName() + "Nugget"));
            GameRegistry.addShapelessRecipe(new ResourceLocation(OreInAMillion.MODID, material.getMaterialName() + "_element_to_nugget"), null,
                    new ItemStack(nugget, 9),
                    new CustomOreIngredient("element" + material.getMaterialNameUppercase(), material.getMaterialName().toLowerCase() + "Ingot"));
        }

        //======================
        //materials to blocks
        //======================
        if (ingot != null && storageBlock !=null) {
            GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, material.getMaterialName() + "_ingot_to_block"), null,
                    new ItemStack(storageBlock),
                    "AAA", "AAA", "AAA", 'A',
                    new CustomOreIngredient("ingot" + material.getMaterialNameUppercase(), material.getMaterialName() + "Ingot"));
            GameRegistry.addShapelessRecipe(new ResourceLocation(OreInAMillion.MODID, material.getMaterialName() + "_block_to_ingot"), null,
                    new ItemStack(ingot, 9),
                    new CustomOreIngredient("block" + material.getMaterialNameUppercase(), material.getMaterialName().toLowerCase() + "Block"));
        }
        if (gem != null && storageBlock !=null) {
            GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, material.getMaterialName() + "_ingot_to_block"), null,
                    new ItemStack(storageBlock),
                    "AAA", "AAA", "AAA", 'A',
                    new CustomOreIngredient("gem" + material.getMaterialNameUppercase(), material.getMaterialName() + "Gem"));
            GameRegistry.addShapelessRecipe(new ResourceLocation(OreInAMillion.MODID, material.getMaterialName() + "_block_to_ingot"), null,
                    new ItemStack(ingot, 9),
                    new CustomOreIngredient("block" + material.getMaterialNameUppercase(), material.getMaterialName().toLowerCase() + "Block"));
        }
        if (element != null && storageBlock !=null) {
            GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, material.getMaterialName() + "_ingot_to_block"), null,
                    new ItemStack(storageBlock),
                    "AAA", "AAA", "AAA", 'A',
                    new CustomOreIngredient("element" + material.getMaterialNameUppercase(), material.getMaterialName() + "Element"));
            GameRegistry.addShapelessRecipe(new ResourceLocation(OreInAMillion.MODID, material.getMaterialName() + "_block_to_ingot"), null,
                    new ItemStack(ingot, 9),
                    new CustomOreIngredient("block" + material.getMaterialNameUppercase(), material.getMaterialName().toLowerCase() + "Block"));
        }

        //======================
        //dusts to tiny dusts
        //======================
        if (dust != null && tinyDust != null) {
            GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, material.getMaterialName() + "_tiny_dust_to_dust"), null,
                    new ItemStack(dust),
                    "AAA", "AAA", "AAA", 'A',
                    new CustomOreIngredient("tinyDust" + material.getMaterialNameUppercase(), material.getMaterialName() + "TinyDust"));
            GameRegistry.addShapelessRecipe(new ResourceLocation(OreInAMillion.MODID, material.getMaterialName() + "_dust_to_tiny_dust"), null,
                    new ItemStack(tinyDust, 9),
                    new CustomOreIngredient("dust" + material.getMaterialNameUppercase(), material.getMaterialName().toLowerCase() + "Dust"));
        }

        //======================
        //dusts to dust blocks
        //======================
        if (dust != null && dustBlock != null) {
            GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, material.getMaterialName() + "_dust_to_dust_block"), null,
                    new ItemStack(dustBlock),
                    "AAA", "AAA", "AAA", 'A',
                    new CustomOreIngredient("dust" + material.getMaterialNameUppercase(), material.getMaterialName() + "Dust"));
            GameRegistry.addShapelessRecipe(new ResourceLocation(OreInAMillion.MODID, material.getMaterialName() + "_dust_block_to_dust"), null,
                    new ItemStack(dust, 9),
                    new CustomOreIngredient("dustBlock" + material.getMaterialNameUppercase(), material.getMaterialName().toLowerCase() + "DustBlock"));
        }

        //======================
        //dirty dusts to tiny dirty dusts
        //======================
        if (dirtyDust != null && dirtyTinyDust != null) {
            GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, material.getMaterialName() + "_tiny_dirty_dust_to_dirty_dust"), null,
                    new ItemStack(dirtyDust),
                    "AAA", "AAA", "AAA", 'A',
                    new CustomOreIngredient("dirtyDustTiny" + material.getMaterialNameUppercase(), material.getMaterialName() + "DirtyDustTiny"));
            GameRegistry.addShapelessRecipe(new ResourceLocation(OreInAMillion.MODID, material.getMaterialName() + "_dirty_dust_to_tiny_dirty_dust"), null,
                    new ItemStack(dirtyTinyDust, 9),
                    new CustomOreIngredient("dirtyDust" + material.getMaterialNameUppercase(), material.getMaterialName().toLowerCase() + "DirtyDust"));
        }

        //======================
        //dirty dusts to dirty dust blocks
        //======================
        if (dirtyDust != null && dirtyDustBlock != null) {
            GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, material.getMaterialName() + "_dirty_dust_to_dirty_dust_block"), null,
                    new ItemStack(dirtyDustBlock),
                    "AAA", "AAA", "AAA", 'A',
                    new CustomOreIngredient("dirtyDust" + material.getMaterialNameUppercase(), material.getMaterialName() + "DirtyDust"));
            GameRegistry.addShapelessRecipe(new ResourceLocation(OreInAMillion.MODID, material.getMaterialName() + "_dirty_dust_block_to_dirty_dust"), null,
                    new ItemStack(dirtyDust, 9),
                    new CustomOreIngredient("dirtyDustBlock" + material.getMaterialNameUppercase(), material.getMaterialName().toLowerCase() + "DirtyDustBlock"));
        }

        //======================
        //swords
        //======================
        if (ingot != null) {
            GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, material.getMaterialName() + "_sword_recipe"), null,
                    new ItemStack(sword),
                    " A ", " A ", " B ",
                    'A', new CustomOreIngredient("ingot" + material.getMaterialNameUppercase(), material.getMaterialName() + "Ingot"),
                    'B', new CustomOreIngredient("stickWood", "woodStick", "oreRod", "rodOre"));
        }
        if (gem != null) {
            GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, material.getMaterialName() + "_sword_recipe"), null,
                    new ItemStack(sword),
                    " A ", " A ", " B ",
                    'A', new CustomOreIngredient("gem" + material.getMaterialNameUppercase(), material.getMaterialName() + "Gem"),
                    'B', new CustomOreIngredient("stickWood", "woodStick", "oreRod", "rodOre"));
        }

        //======================
        //pickaxes
        //======================
        if (ingot != null) {
            GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, material.getMaterialName() + "_pickaxe_recipe"), null,
                    new ItemStack(pickaxe),
                    "AAA", " B ", " B ",
                    'A', new CustomOreIngredient("ingot" + material.getMaterialNameUppercase(), material.getMaterialName() + "Ingot"),
                    'B', new CustomOreIngredient("stickWood", "woodStick", "oreRod", "rodOre"));
        }
        if (gem != null) {
            GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, material.getMaterialName() + "_pickaxe_recipe"), null,
                    new ItemStack(pickaxe),
                    "AAA", " B ", " B ",
                    'A', new CustomOreIngredient("gem" + material.getMaterialNameUppercase(), material.getMaterialName() + "Gem"),
                    'B', new CustomOreIngredient("stickWood", "woodStick", "oreRod", "rodOre"));
        }

        //======================
        //axes
        //======================
        if (ingot != null) {
            GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, material.getMaterialName() + "_axe_recipe"), null,
                    new ItemStack(axe),
                    " AA", " BA", " B ",
                    'A', new CustomOreIngredient("ingot" + material.getMaterialNameUppercase(), material.getMaterialName() + "Ingot"),
                    'B', new CustomOreIngredient("stickWood", "woodStick", "oreRod", "rodOre"));
        }
        if (gem != null) {
            GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, material.getMaterialName() + "_axe_recipe"), null,
                    new ItemStack(axe),
                    " AA", " BA", " B ",
                    'A', new CustomOreIngredient("gem" + material.getMaterialNameUppercase(), material.getMaterialName() + "Gem"),
                    'B', new CustomOreIngredient("stickWood", "woodStick", "oreRod", "rodOre"));
        }

        //======================
        //shovels
        //======================
        if (ingot != null) {
            GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, material.getMaterialName() + "_shovel_recipe"), null,
                    new ItemStack(shovel),
                    " A ", " B ", " B ",
                    'A', new CustomOreIngredient("ingot" + material.getMaterialNameUppercase(), material.getMaterialName() + "Ingot"),
                    'B', new CustomOreIngredient("stickWood", "woodStick", "oreRod", "rodOre"));
        }
        if (gem != null) {
            GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, material.getMaterialName() + "_shovel_recipe"), null,
                    new ItemStack(shovel),
                    " A ", " B ", " B ",
                    'A', new CustomOreIngredient("gem" + material.getMaterialNameUppercase(), material.getMaterialName() + "Gem"),
                    'B', new CustomOreIngredient("stickWood", "woodStick", "oreRod", "rodOre"));
        }

        //======================
        //hoes
        //======================
        if (ingot != null) {
            GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, material.getMaterialName() + "_hoe_recipe"), null,
                    new ItemStack(hoe),
                    " AA", " B ", " B ",
                    'A', new CustomOreIngredient("ingot" + material.getMaterialNameUppercase(), material.getMaterialName() + "Ingot"),
                    'B', new CustomOreIngredient("stickWood", "woodStick", "oreRod", "rodOre"));
        }
        if (gem != null) {
            GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, material.getMaterialName() + "_hoe_recipe"), null,
                    new ItemStack(hoe),
                    " AA", " B ", " B ",
                    'A', new CustomOreIngredient("gem" + material.getMaterialNameUppercase(), material.getMaterialName() + "Gem"),
                    'B', new CustomOreIngredient("stickWood", "woodStick", "oreRod", "rodOre"));
        }

        //======================
        //hammers
        //======================
        if (ingot != null) {
            GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, material.getMaterialName() + "_hammer_recipe"), null,
                    new ItemStack(hammer),
                    "CAC", " B ", " B ",
                    'A', new CustomOreIngredient("ingot" + material.getMaterialNameUppercase(), material.getMaterialName() + "Ingot"),
                    'B', new CustomOreIngredient("stickWood", "woodStick", "oreRod", "rodOre"),
                    'C', new CustomOreIngredient("block" + material.getMaterialNameUppercase(), material.getMaterialName() + "Block"));
        }
        if (gem != null) {
            GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, material.getMaterialName() + "_hammer_recipe"), null,
                    new ItemStack(hammer),
                    "CAC", " B ", " B ",
                    'A', new CustomOreIngredient("gem" + material.getMaterialNameUppercase(), material.getMaterialName() + "Gem"),
                    'B', new CustomOreIngredient("stickWood", "woodStick", "oreRod", "rodOre"),
                    'C', new CustomOreIngredient("block" + material.getMaterialNameUppercase(), material.getMaterialName() + "Block"));
        }

        //======================
        //helmets
        //======================
        if (ingot != null) {
            GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, material.getMaterialName() + "_helmet_recipe_top"), null,
                    new ItemStack(helmet),
                    "AAA", "A A", "   ",
                    'A', new CustomOreIngredient("ingot" + material.getMaterialNameUppercase(), material.getMaterialName() + "Ingot"));
            GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, material.getMaterialName() + "_helmet_recipe_bottom"), null,
                    new ItemStack(helmet),
                    "   ", "AAA", "A A",
                    'A', new CustomOreIngredient("ingot" + material.getMaterialNameUppercase(), material.getMaterialName() + "Ingot"));
        }
        if (gem != null) {
            GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, material.getMaterialName() + "_helmet_recipe_top"), null,
                    new ItemStack(helmet),
                    "AAA", "A A", "   ",
                    'A', new CustomOreIngredient("gem" + material.getMaterialNameUppercase(), material.getMaterialName() + "Gem"));
            GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, material.getMaterialName() + "_helmet_recipe_bottom"), null,
                    new ItemStack(helmet),
                    "   ", "AAA", "A A",
                    'A', new CustomOreIngredient("gem" + material.getMaterialNameUppercase(), material.getMaterialName() + "Gem"));
        }

        //======================
        //chestplates
        //======================
        if (ingot != null) {
            GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, material.getMaterialName() + "_chestplate_recipe"), null,
                    new ItemStack(chestplate),
                    "A A", "AAA", "AAA",
                    'A', new CustomOreIngredient("ingot" + material.getMaterialNameUppercase(), material.getMaterialName() + "Ingot"));
        }
        if (gem != null) {
            GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, material.getMaterialName() + "_chestplate_recipe"), null,
                    new ItemStack(chestplate),
                    "A A", "AAA", "AAA",
                    'A', new CustomOreIngredient("gem" + material.getMaterialNameUppercase(), material.getMaterialName() + "Gem"));
        }

        //======================
        //leggings
        //======================
        if (ingot != null) {
            GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, material.getMaterialName() + "_leggings_recipe"), null,
                    new ItemStack(leggings),
                    "AAA", "A A", "A A",
                    'A', new CustomOreIngredient("ingot" + material.getMaterialNameUppercase(), material.getMaterialName() + "Ingot"));
        }
        if (gem != null) {
            GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, material.getMaterialName() + "_leggings_recipe"), null,
                    new ItemStack(leggings),
                    "AAA", "A A", "A A",
                    'A', new CustomOreIngredient("gem" + material.getMaterialNameUppercase(), material.getMaterialName() + "Gem"));
        }

        //======================
        //boots
        //======================
        if (ingot != null) {
            GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, material.getMaterialName() + "_boots_recipe_top"), null,
                    new ItemStack(boots),
                    "A A", "A A", "   ",
                    'A', new CustomOreIngredient("ingot" + material.getMaterialNameUppercase(), material.getMaterialName() + "Ingot"));
            GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, material.getMaterialName() + "_boots_recipe_bottom"), null,
                    new ItemStack(boots),
                    "   ", "A A", "A A",
                    'A', new CustomOreIngredient("ingot" + material.getMaterialNameUppercase(), material.getMaterialName() + "Ingot"));
        }
        if (gem != null) {
            GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, material.getMaterialName() + "_boots_recipe_top"), null,
                    new ItemStack(boots),
                    "A A", "A A", "   ",
                    'A', new CustomOreIngredient("gem" + material.getMaterialNameUppercase(), material.getMaterialName() + "Gem"));
            GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, material.getMaterialName() + "_boots_recipe_bottom"), null,
                    new ItemStack(boots),
                    "   ", "A A", "A A",
                    'A', new CustomOreIngredient("gem" + material.getMaterialNameUppercase(), material.getMaterialName() + "Gem"));
        }
//
//            GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, "copper_gear"), null, new ItemStack(ModItems.gearCopper),
//                    " A ", "A A", " A ", 'A', new CustomOreIngredient("ingotCopper", "copperIngot"));
//            GameRegistry.addShapelessRecipe(new ResourceLocation(OreInAMillion.MODID, "copper_dust"), null, new ItemStack(ModItems.tinydustCopper, 9),
//                    new CustomOreIngredient("dustCopper", "copperDust"));
//            GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, "copper_tiny"), null, new ItemStack(ModItems.dustCopper),
//                    "AAA", "AAA", "AAA", 'A', new CustomOreIngredient("dustTinyCopper", "oreDustTinyCopper", "tinyDustCopper", "oreTinyDustCopper", "dustSmallCopper", "oreDustSmallCopper", "smallDustCopper", "oreSmallDustCopper"));
//
//            GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, "copper_sword"), null, new ItemStack(ModItems.swordCopper),
//                    " A ", " A ", " B ", 'A', new CustomOreIngredient("ingotCopper", "copperIngot"), 'B', new CustomOreIngredient("stickWood", "oreRod"));
//            GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, "copper_pickaxe"), null, new ItemStack(ModItems.pickaxeCopper),
//                    "AAA", " B ", " B ", 'A', new CustomOreIngredient("ingotCopper", "copperIngot"), 'B', new CustomOreIngredient("stickWood", "oreRod"));
//            GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, "copper_axe"), null, new ItemStack(ModItems.axeCopper),
//                    " AA", " BA", " B ", 'A', new CustomOreIngredient("ingotCopper", "copperIngot"), 'B', new CustomOreIngredient("stickWood", "oreRod"));
//            GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, "copper_shovel"), null, new ItemStack(ModItems.shovelCopper),
//                    " A ", " B ", " B ", 'A', new CustomOreIngredient("ingotCopper", "copperIngot"), 'B', new CustomOreIngredient("stickWood", "oreRod"));
//            GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, "copper_hoe"), null, new ItemStack(ModItems.hoeCopper),
//                    " AA", " B ", " B ", 'A', new CustomOreIngredient("ingotCopper", "copperIngot"), 'B', new CustomOreIngredient("stickWood", "oreRod"));
//
//            GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, "copper_helmet_top"), null, new ItemStack(ModItems.helmetCopper),
//                    "AAA", "A A", "   ", 'A', new CustomOreIngredient("ingotCopper", "copperIngot"));
//            GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, "copper_helmet_bottom"), null, new ItemStack(ModItems.helmetCopper),
//                    "   ", "AAA", "A A", 'A', new CustomOreIngredient("ingotCopper", "copperIngot"));
//            GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, "copper_chestplate"), null, new ItemStack(ModItems.chestplateCopper),
//                    "A A", "AAA", "AAA", 'A', new CustomOreIngredient("ingotCopper", "copperIngot"));
//            GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, "copper_leggings"), null, new ItemStack(ModItems.leggingsCopper),
//                    "AAA", "A A", "A A", 'A', new CustomOreIngredient("ingotCopper", "copperIngot"));
//            GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, "copper_boots_top"), null, new ItemStack(ModItems.bootsCopper),
//                    "A A", "A A", "   ", 'A', new CustomOreIngredient("ingotCopper", "copperIngot"));
//            GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, "copper_boots_bottom"), null, new ItemStack(ModItems.bootsCopper),
//                    "   ", "A A", "A A", 'A', new CustomOreIngredient("ingotCopper", "copperIngot"));

    }

    public static void init() {
        for (MaterialType material : MaterialType.values()) {
            registerRecipes(material);
        }
    }
}
