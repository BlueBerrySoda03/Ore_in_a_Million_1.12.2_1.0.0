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
                //aluminum
                if (OreInAMillionConfig.isAluminumEnabled) {

                    if (OreInAMillionConfig.isAluminumCraftingEnabled) {

                    }
                    if (OreInAMillionConfig.isAluminumToolsEnabled) {

                    }
                    if (OreInAMillionConfig.isAluminumArmorEnabled) {

                    }
                }
                //chrome
                if (OreInAMillionConfig.isChromeEnabled) {

                }
                //cobalt
                if (OreInAMillionConfig.isCobaltEnabled) {

                }
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
                                "AAA", "AAA", "AAA", 'A', new CustomOreIngredient("dustTinyCopper", "oreDustTinyCopper", "tinyDustCopper", "oreTinyDustCopper",  "dustSmallCopper", "oreDustSmallCopper", "smallDustCopper", "oreSmallDustCopper"));
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
                //ender
                if (OreInAMillionConfig.isEnderEnabled){

                }
                //iridium
                if (OreInAMillionConfig.isIridiumEnabled) {

                }
                //lead
                if (OreInAMillionConfig.isLeadEnabled) {

                }
                //mithril
                if (OreInAMillionConfig.isMithrilEnabled) {

                }
                //nickel
                if (OreInAMillionConfig.isNickelEnabled) {

                }
                //osmium
                if (OreInAMillionConfig.isOsmiumEnabled) {

                }
                //platinum
                if (OreInAMillionConfig.isPlatinumEnabled) {

                }
                //silver
                if (OreInAMillionConfig.isSilverEnabled) {

                }
                //tin
                if (OreInAMillionConfig.isTinEnabled) {

                }
                //titanium
                if (OreInAMillionConfig.isTitaniumEnabled) {

                }
                //tungsten
                if (OreInAMillionConfig.isTungstenEnabled) {

                }
                //uranium
                if (OreInAMillionConfig.isUraniumEnabled) {

                }
                //zinc
                if (OreInAMillionConfig.isZincEnabled) {

                }
                //brass
                if (OreInAMillionConfig.isBrassEnabled) {

                }
                //bronze
                if (OreInAMillionConfig.isBronzeEnabled) {

                }
                //electrum
                if (OreInAMillionConfig.isElectrumEnabled) {

                }
                //fairy
                if (OreInAMillionConfig.isFairyEnabled){

                }
                //invar
                if (OreInAMillionConfig.isInvarEnabled) {

                }
                //steel
                if (OreInAMillionConfig.isSteelEnabled) {

                }
                //thermal series
                if (ModCompatConfig.isThermalEnabled){
                    //constantan
                    if (OreInAMillionConfig.isConstantanEnabled){

                    }
                    //enderium
                    if (OreInAMillionConfig.isEnderiumEnabled){

                    }
                    //lumium
                    if (OreInAMillionConfig.isLumiumEnabled){

                    }
                    //signalum
                    if (OreInAMillionConfig.isSignalumEnabled){

                    }
                }
                //tinkers construct
                if (ModCompatConfig.isTinkersEnabled){
                    //ardite
                    if (OreInAMillionConfig.isArditeEnabled){

                    }
                    //knightslime
                    if (OreInAMillionConfig.isKnightSlimeEnabled){

                    }
                    //pigiron
                    if (OreInAMillionConfig.isPigIronEnabled) {

                    }
                    //manyullyn
                    if (OreInAMillionConfig.isManyullynEnabled){

                    }
                }
            }
            //gems
            if (GeneralConfig.isGemsEnabled){
                //amethyst
                if (OreInAMillionConfig.isAmethystEnabled){

                }
                //peridot
                if (OreInAMillionConfig.isPeridotEnabled){

                }
                //ruby
                if (OreInAMillionConfig.isRubyEnabled){

                }
                //sapphire
                if (OreInAMillionConfig.isSapphireEnabled){

                }
            }
            //elements
            if (GeneralConfig.isElementsEnabled){
                //carbon
                if (OreInAMillionConfig.isCarbonEnabled){

                }
                //cinnabar
                if (OreInAMillionConfig.isCinnabarEnabled){

                }
                //silicon
                if (OreInAMillionConfig.isSiliconEnabled){

                }
                //sulphur
                if (OreInAMillionConfig.isSulfurEnabled){

                }
            }
            //vanilla additions
            if (GeneralConfig.isVanillaEnabled){
                //charcoal
                if (OreInAMillionConfig.isCharcoalEnabled) {

                }
                //coal
                if (OreInAMillionConfig.isCoalEnabled) {

                }
                //diamond
                if (OreInAMillionConfig.isDiamondEnabled) {

                }
                //emerald
                if (OreInAMillionConfig.isEmeraldEnabled) {

                }
                //gold
                if (OreInAMillionConfig.isGoldEnabled){

                }
                //iron
                if (OreInAMillionConfig.isIronEnabled){

                }
                //quartz
                if (OreInAMillionConfig.isQuartzEnabled){

                }
            }
            if (GeneralConfig.isSillyStuffEnabled){

            }
        }
    }
}
