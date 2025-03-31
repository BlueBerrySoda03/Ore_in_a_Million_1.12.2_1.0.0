package com.blueberrysoda.oreinamillion.recipes;

import com.blueberrysoda.oreinamillion.config.GeneralConfig;
import com.blueberrysoda.oreinamillion.config.MineralsConfig;
import com.blueberrysoda.oreinamillion.config.ModCompatConfig;
import com.blueberrysoda.oreinamillion.init.ModBlocks;
import com.blueberrysoda.oreinamillion.init.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;


public class SmeltingRecipes {
    public static void init(){
        if (!OreDictionary.getOres("ingotAdamantine").isEmpty()) {
            ItemStack adamantineIngot = OreDictionary.getOres("ingotAdamantine").get(0);
            FurnaceRecipes.instance().addSmeltingRecipe(adamantineIngot, new ItemStack(ModItems.weezerWeezer), 0.7F);
        } else {
            System.err.println("No OreDictionary entries found for 'ingotAdamantine'");
        }
        if (GeneralConfig.isMineralsEnabled) {
            if (GeneralConfig.isIngotsEnabled) {
                //aluminum
                if (MineralsConfig.isAluminumEnabled) {
                    GameRegistry.addSmelting(ModBlocks.oreAluminum, new ItemStack(ModItems.ingotAluminum), 0.7F);
                    GameRegistry.addSmelting(ModItems.dustAluminum, new ItemStack(ModItems.ingotAluminum), 0.7F);
                }
                //chrome
                if (MineralsConfig.isChromeEnabled) {
                    GameRegistry.addSmelting(ModBlocks.oreChrome, new ItemStack(ModItems.ingotChrome), 0.7F);
                    GameRegistry.addSmelting(ModItems.dustChrome, new ItemStack(ModItems.ingotChrome), 0.7F);
                }
                //cobalt
                if (MineralsConfig.isCobaltEnabled) {
                    GameRegistry.addSmelting(ModBlocks.oreCobalt, new ItemStack(ModItems.ingotCobalt), 0.7F);
                    GameRegistry.addSmelting(ModItems.dustCobalt, new ItemStack(ModItems.ingotCobalt), 0.7F);
                }
                //copper
                if (MineralsConfig.isCopperEnabled) {
                    GameRegistry.addSmelting(ModBlocks.oreCopper, new ItemStack(ModItems.ingotCopper), 0.7F);
                    GameRegistry.addSmelting(ModItems.dustCopper, new ItemStack(ModItems.ingotCopper), 0.7F);
                    GameRegistry.addSmelting(ModItems.tinydustCopper, new ItemStack(ModItems.nuggetCopper), 0.1F);
                }
                //ender
                if (MineralsConfig.isEnderEnabled) {
                    GameRegistry.addSmelting(ModBlocks.oreEnder, new ItemStack(ModItems.ingotEnder), 0.7F);
                    GameRegistry.addSmelting(ModItems.dustEnder, new ItemStack(ModItems.ingotEnder), 0.7F);
                    GameRegistry.addSmelting(Items.ENDER_PEARL, new ItemStack(ModItems.ingotEnder), 0.7F);
                }
                //iridium
                if (MineralsConfig.isIridiumEnabled) {
                    GameRegistry.addSmelting(ModBlocks.oreIridium, new ItemStack(ModItems.ingotIridium), 0.7F);
                    GameRegistry.addSmelting(ModItems.dustIridium, new ItemStack(ModItems.ingotIridium), 0.7F);
                }
                //lead
                if (MineralsConfig.isLeadEnabled) {
                    GameRegistry.addSmelting(ModBlocks.oreLead, new ItemStack(ModItems.ingotLead), 0.7F);
                    GameRegistry.addSmelting(ModItems.dustLead, new ItemStack(ModItems.ingotLead), 0.7F);
                }
                //mithril
                if (MineralsConfig.isMithrilEnabled) {
                    GameRegistry.addSmelting(ModBlocks.oreMithril, new ItemStack(ModItems.ingotMithril), 0.7F);
                    GameRegistry.addSmelting(ModItems.dustMithril, new ItemStack(ModItems.ingotMithril), 0.7F);
                }
                //nickel
                if (MineralsConfig.isNickelEnabled) {
                    GameRegistry.addSmelting(ModBlocks.oreNickel, new ItemStack(ModItems.ingotNickel), 0.7F);
                    GameRegistry.addSmelting(ModItems.dustNickel, new ItemStack(ModItems.ingotNickel), 0.7F);
                }
                //osmium
                if (MineralsConfig.isOsmiumEnabled) {
                    GameRegistry.addSmelting(ModBlocks.oreOsmium, new ItemStack(ModItems.ingotOsmium), 0.7F);
                    GameRegistry.addSmelting(ModItems.dustOsmium, new ItemStack(ModItems.ingotOsmium), 0.7F);
                }
                //platinum
                if (MineralsConfig.isPlatinumEnabled) {
                    GameRegistry.addSmelting(ModBlocks.orePlatinum, new ItemStack(ModItems.ingotPlatinum), 0.7F);
                    GameRegistry.addSmelting(ModItems.dustPlatinum, new ItemStack(ModItems.ingotPlatinum), 0.7F);
                }
                //silver
                if (MineralsConfig.isSilverEnabled) {
                    GameRegistry.addSmelting(ModBlocks.oreSilver, new ItemStack(ModItems.ingotSilver), 0.7F);
                    GameRegistry.addSmelting(ModItems.dustSilver, new ItemStack(ModItems.ingotSilver), 0.7F);
                }
                //tin
                if (MineralsConfig.isTinEnabled) {
                    GameRegistry.addSmelting(ModBlocks.oreTin, new ItemStack(ModItems.ingotTin), 0.7F);
                    GameRegistry.addSmelting(ModItems.dustTin, new ItemStack(ModItems.ingotTin), 0.7F);
                }
                //titanium
                if (MineralsConfig.isTitaniumEnabled) {
                    GameRegistry.addSmelting(ModBlocks.oreTitanium, new ItemStack(ModItems.ingotTitanium), 0.7F);
                    GameRegistry.addSmelting(ModItems.dustTitanium, new ItemStack(ModItems.ingotTitanium), 0.7F);
                }
                //tungsten
                if (MineralsConfig.isTungstenEnabled) {
                    GameRegistry.addSmelting(ModBlocks.oreTungsten, new ItemStack(ModItems.ingotTungsten), 0.7F);
                    GameRegistry.addSmelting(ModItems.dustTungsten, new ItemStack(ModItems.ingotTungsten), 0.7F);
                }
                //uranium
                if (MineralsConfig.isUraniumEnabled) {
                    GameRegistry.addSmelting(ModBlocks.oreUranium, new ItemStack(ModItems.ingotUranium), 0.7F);
                    GameRegistry.addSmelting(ModItems.dustUranium, new ItemStack(ModItems.ingotUranium), 0.7F);
                }
                //zinc
                if (MineralsConfig.isZincEnabled) {
                    GameRegistry.addSmelting(ModBlocks.oreZinc, new ItemStack(ModItems.ingotZinc), 0.7F);
                    GameRegistry.addSmelting(ModItems.dustZinc, new ItemStack(ModItems.ingotZinc), 0.7F);
                }
                //brass
                if (MineralsConfig.isBrassEnabled) {
                    GameRegistry.addSmelting(ModItems.dustBrass, new ItemStack(ModItems.ingotBrass), 0.7F);
                }
                //bronze
                if (MineralsConfig.isBronzeEnabled) {
                    GameRegistry.addSmelting(ModItems.dustBronze, new ItemStack(ModItems.ingotBronze), 0.7F);
                }
                //electrum
                if (MineralsConfig.isElectrumEnabled) {
                    GameRegistry.addSmelting(ModItems.dustElectrum, new ItemStack(ModItems.ingotElectrum), 0.7F);
                }
                //fairy
                if (MineralsConfig.isFairyEnabled) {
                    GameRegistry.addSmelting(ModItems.dustFairy, new ItemStack(ModItems.ingotFairy), 0.7F);
                }
                //invar
                if (MineralsConfig.isInvarEnabled) {
                    GameRegistry.addSmelting(ModItems.dustInvar, new ItemStack(ModItems.ingotInvar), 0.7F);
                }
                //steel
                if (MineralsConfig.isSteelEnabled) {
                    GameRegistry.addSmelting(ModItems.dustSteel, new ItemStack(ModItems.ingotSteel), 0.7F);
                }
                //thermal series
                if (ModCompatConfig.isThermalEnabled) {
                    //constantan
                    if (MineralsConfig.isConstantanEnabled) {
                        GameRegistry.addSmelting(ModItems.dustConstantan, new ItemStack(ModItems.ingotConstantan), 0.7F);
                    }
                    //enderium
                    if (MineralsConfig.isEnderiumEnabled) {
                        GameRegistry.addSmelting(ModItems.dustEnderium, new ItemStack(ModItems.ingotEnderium), 0.7F);
                    }
                    //lumium
                    if (MineralsConfig.isLumiumEnabled) {
                        GameRegistry.addSmelting(ModItems.dustLumium, new ItemStack(ModItems.ingotLumium), 0.7F);
                    }
                    //signalum
                    if (MineralsConfig.isSignalumEnabled) {
                        GameRegistry.addSmelting(ModItems.dustSignalum, new ItemStack(ModItems.ingotSignalum), 0.7F);
                    }
                }
                //tinkers construct
                if (ModCompatConfig.isTinkersEnabled) {
                    //ardite
                    if (MineralsConfig.isArditeEnabled) {
                        GameRegistry.addSmelting(ModBlocks.oreArdite, new ItemStack(ModItems.ingotArdite), 0.7F);
                        GameRegistry.addSmelting(ModItems.dustArdite, new ItemStack(ModItems.ingotArdite), 0.7F);
                    }
                    //knightslime
                    if (MineralsConfig.isKnightSlimeEnabled) {
                        GameRegistry.addSmelting(ModItems.dustKnightSlime, new ItemStack(ModItems.ingotKnightSlime), 0.7F);
                    }
                    //pigiron
                    if (MineralsConfig.isPigIronEnabled) {
                        GameRegistry.addSmelting(ModItems.dustPigIron, new ItemStack(ModItems.ingotPigIron), 0.7F);
                    }
                    //manyullyn
                    if (MineralsConfig.isManyullynEnabled) {
                        GameRegistry.addSmelting(ModItems.dustManyullyn, new ItemStack(ModItems.ingotManyullyn), 0.7F);
                    }
                }
            }
            //gems
            if (GeneralConfig.isGemsEnabled) {
                //amethyst
                if (MineralsConfig.isAmethystEnabled) {
                    GameRegistry.addSmelting(ModBlocks.oreAmethyst, new ItemStack(ModItems.gemAmethyst), 0.7F);
                    GameRegistry.addSmelting(ModItems.dustAmethyst, new ItemStack(ModItems.gemAmethyst), 0.7F);
                }
                //peridot
                if (MineralsConfig.isPeridotEnabled) {
                    GameRegistry.addSmelting(ModBlocks.orePeridot, new ItemStack(ModItems.gemPeridot), 0.7F);
                    GameRegistry.addSmelting(ModItems.dustPeridot, new ItemStack(ModItems.gemPeridot), 0.7F);
                }
                //ruby
                if (MineralsConfig.isRubyEnabled) {
                    GameRegistry.addSmelting(ModBlocks.oreRuby, new ItemStack(ModItems.gemRuby), 0.7F);
                    GameRegistry.addSmelting(ModItems.dustRuby, new ItemStack(ModItems.gemRuby), 0.7F);
                }
                //sapphire
                if (MineralsConfig.isSapphireEnabled) {
                    GameRegistry.addSmelting(ModBlocks.oreSapphire, new ItemStack(ModItems.gemSapphire), 0.7F);
                    GameRegistry.addSmelting(ModItems.dustSapphire, new ItemStack(ModItems.gemSapphire), 0.7F);
                }
            }
            //elements
            if (GeneralConfig.isElementsEnabled) {
                //carbon
                if (MineralsConfig.isCarbonEnabled) {

                }
                //cinnabar
                if (MineralsConfig.isCinnabarEnabled) {
                    GameRegistry.addSmelting(ModBlocks.oreCinnabar, new ItemStack(ModItems.elementCinnabar), 0.7F);
                    GameRegistry.addSmelting(ModItems.dustCinnabar, new ItemStack(ModItems.elementCinnabar), 0.7F);
                }
                //silicon
                if (MineralsConfig.isSiliconEnabled) {
                    GameRegistry.addSmelting(ModItems.dustSilicon, new ItemStack(ModItems.elementSilicon), 0.7F);
                }
                //sulphur
                if (MineralsConfig.isSulfurEnabled) {
                    GameRegistry.addSmelting(ModBlocks.oreSulfur, new ItemStack(ModItems.elementSulfur), 0.7F);
                    GameRegistry.addSmelting(ModItems.dustSulfur, new ItemStack(ModItems.elementSulfur), 0.7F);
                }
            }
            //vanilla additions
            if (GeneralConfig.isVanillaEnabled) {
                //charcoal
                if (MineralsConfig.isCharcoalEnabled) {

                }
                //coal
                if (MineralsConfig.isCoalEnabled) {

                }
                //diamond
                if (MineralsConfig.isDiamondEnabled) {
                    GameRegistry.addSmelting(ModItems.dustDiamond, new ItemStack(Items.DIAMOND), 0.7F);
                }
                //emerald
                if (MineralsConfig.isEmeraldEnabled) {
                    GameRegistry.addSmelting(ModItems.dustEmerald, new ItemStack(Items.EMERALD), 0.7F);
                }
                //quartz
                if (MineralsConfig.isQuartzEnabled) {
                    GameRegistry.addSmelting(ModItems.dustQuartz, new ItemStack(Items.QUARTZ), 0.7F);
                }
            }
            if (GeneralConfig.isSillyStuffEnabled) {

            }
        }
    }
}
