package com.blueberrysoda.oreinamillion.recipes;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import com.blueberrysoda.oreinamillion.config.*;
import com.blueberrysoda.oreinamillion.init.ModItems;
import com.blueberrysoda.oreinamillion.util.CustomOreIngredient;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingRecipes {
    public static void init() {
        if (GeneralConfig.isMineralsEnabled) {
            if (GeneralConfig.isIngotsEnabled) {
                //copper
                if (MineralsConfig.isCopperEnabled) {
                    GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, "copper_ingot"), null, new ItemStack(ModItems.ingotCopper),
                            "AAA", "AAA", "AAA", 'A', new CustomOreIngredient("nuggetCopper", "copperNugget"));
                    GameRegistry.addShapelessRecipe(new ResourceLocation(OreInAMillion.MODID, "copper_nugget"), null, new ItemStack(ModItems.nuggetCopper, 9),
                            new CustomOreIngredient("ingotCopper", "copperIngot"));
                    if (CraftingConfig.isCopperCraftingEnabled) {
                        GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, "copper_gear"), null, new ItemStack(ModItems.gearCopper),
                                " A ", "A A", " A ", 'A', new CustomOreIngredient("ingotCopper", "copperIngot"));
                        GameRegistry.addShapelessRecipe(new ResourceLocation(OreInAMillion.MODID, "copper_dust"), null, new ItemStack(ModItems.tinydustCopper, 9),
                                new CustomOreIngredient("dustCopper", "copperDust"));
                        GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, "copper_tiny"), null, new ItemStack(ModItems.dustCopper),
                                "AAA", "AAA", "AAA", 'A', new CustomOreIngredient("dustTinyCopper", "oreDustTinyCopper", "tinyDustCopper", "oreTinyDustCopper", "dustSmallCopper", "oreDustSmallCopper", "smallDustCopper", "oreSmallDustCopper"));
                    }
                    if (ToolsConfig.isCopperToolsEnabled) {
                        GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, "copper_sword"), null, new ItemStack(ModItems.swordCopper),
                                " A ", " A ", " B ", 'A', new CustomOreIngredient("ingotCopper", "copperIngot"), 'B', new CustomOreIngredient("stickWood", "oreRod"));
                        GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, "copper_pickaxe"), null, new ItemStack(ModItems.pickaxeCopper),
                                "AAA", " B ", " B ", 'A', new CustomOreIngredient("ingotCopper", "copperIngot"), 'B', new CustomOreIngredient("stickWood", "oreRod"));
                        GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, "copper_axe"), null, new ItemStack(ModItems.axeCopper),
                                " AA", " BA", " B ", 'A', new CustomOreIngredient("ingotCopper", "copperIngot"), 'B', new CustomOreIngredient("stickWood", "oreRod"));
                        GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, "copper_shovel"), null, new ItemStack(ModItems.shovelCopper),
                                " A ", " B ", " B ", 'A', new CustomOreIngredient("ingotCopper", "copperIngot"), 'B', new CustomOreIngredient("stickWood", "oreRod"));
                        GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, "copper_hoe"), null, new ItemStack(ModItems.hoeCopper),
                                " AA", " B ", " B ", 'A', new CustomOreIngredient("ingotCopper", "copperIngot"), 'B', new CustomOreIngredient("stickWood", "oreRod"));
                    }
                    if (ArmorConfig.isCopperArmorEnabled) {
                        GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, "copper_helmet_top"), null, new ItemStack(ModItems.helmetCopper),
                                "AAA", "A A", "   ", 'A', new CustomOreIngredient("ingotCopper", "copperIngot"));
                        GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, "copper_helmet_bottom"), null, new ItemStack(ModItems.helmetCopper),
                                "   ", "AAA", "A A", 'A', new CustomOreIngredient("ingotCopper", "copperIngot"));
                        GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, "copper_chestplate"), null, new ItemStack(ModItems.chestplateCopper),
                                "A A", "AAA", "AAA", 'A', new CustomOreIngredient("ingotCopper", "copperIngot"));
                        GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, "copper_leggings"), null, new ItemStack(ModItems.leggingsCopper),
                                "AAA", "A A", "A A", 'A', new CustomOreIngredient("ingotCopper", "copperIngot"));
                        GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, "copper_boots_top"), null, new ItemStack(ModItems.bootsCopper),
                                "A A", "A A", "   ", 'A', new CustomOreIngredient("ingotCopper", "copperIngot"));
                        GameRegistry.addShapedRecipe(new ResourceLocation(OreInAMillion.MODID, "copper_boots_bottom"), null, new ItemStack(ModItems.bootsCopper),
                                "   ", "A A", "A A", 'A', new CustomOreIngredient("ingotCopper", "copperIngot"));
                    }
                }
                if (GeneralConfig.isSillyStuffEnabled) {

                }
            }
        }
    }
}
