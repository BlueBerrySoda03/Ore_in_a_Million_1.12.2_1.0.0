package com.blueberrysoda.oreinamillion.recipes;

import com.blueberrysoda.oreinamillion.config.OreInAMillionConfig;
import com.blueberrysoda.oreinamillion.init.ModBlocks;
import com.blueberrysoda.oreinamillion.init.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class SmeltingRecipes {
    public static void init(){
        if (OreInAMillionConfig.isMineralsEnabled) {
            if (OreInAMillionConfig.isIngotsEnabled) {
                //aluminum
                if (OreInAMillionConfig.isAluminumEnabled) {
                    GameRegistry.addSmelting(ModBlocks.oreAluminum, new ItemStack(ModItems.ingotAluminum), 0.7F);
                    GameRegistry.addSmelting(ModItems.dustAluminum, new ItemStack(ModItems.ingotAluminum), 0.7F);
                }
                //chrome
                if (OreInAMillionConfig.isChromeEnabled) {
                    GameRegistry.addSmelting(ModBlocks.oreChrome, new ItemStack(ModItems.ingotChrome), 0.7F);
                    GameRegistry.addSmelting(ModItems.dustChrome, new ItemStack(ModItems.ingotChrome), 0.7F);
                }
                //cobalt
                if (OreInAMillionConfig.isCobaltEnabled) {
                    GameRegistry.addSmelting(ModBlocks.oreCobalt, new ItemStack(ModItems.ingotCobalt), 0.7F);
                    GameRegistry.addSmelting(ModItems.dustCobalt, new ItemStack(ModItems.ingotCobalt), 0.7F);
                }
                //copper
                if (OreInAMillionConfig.isCopperEnabled) {
                    GameRegistry.addSmelting(ModBlocks.oreCopper, new ItemStack(ModItems.ingotCopper), 0.7F);
                    GameRegistry.addSmelting(ModItems.dustCopper, new ItemStack(ModItems.ingotCopper), 0.7F);
                }
                //ender
                if (OreInAMillionConfig.isEnderEnabled) {
                    GameRegistry.addSmelting(ModBlocks.oreEnder, new ItemStack(ModItems.ingotEnder), 0.7F);
                    GameRegistry.addSmelting(ModItems.dustEnder, new ItemStack(ModItems.ingotEnder), 0.7F);
                    GameRegistry.addSmelting(Items.ENDER_PEARL, new ItemStack(ModItems.ingotEnder), 0.7F);
                }
                //iridium
                if (OreInAMillionConfig.isIridiumEnabled) {
                    GameRegistry.addSmelting(ModBlocks.oreIridium, new ItemStack(ModItems.ingotIridium), 0.7F);
                    GameRegistry.addSmelting(ModItems.dustIridium, new ItemStack(ModItems.ingotIridium), 0.7F);
                }
                //lead
                if (OreInAMillionConfig.isLeadEnabled) {
                    GameRegistry.addSmelting(ModBlocks.oreLead, new ItemStack(ModItems.ingotLead), 0.7F);
                    GameRegistry.addSmelting(ModItems.dustLead, new ItemStack(ModItems.ingotLead), 0.7F);
                }
                //mithril
                if (OreInAMillionConfig.isMithrilEnabled) {
                    GameRegistry.addSmelting(ModBlocks.oreMithril, new ItemStack(ModItems.ingotMithril), 0.7F);
                    GameRegistry.addSmelting(ModItems.dustMithril, new ItemStack(ModItems.ingotMithril), 0.7F);
                }
                //nickel
                if (OreInAMillionConfig.isNickelEnabled) {
                    GameRegistry.addSmelting(ModBlocks.oreNickel, new ItemStack(ModItems.ingotNickel), 0.7F);
                    GameRegistry.addSmelting(ModItems.dustNickel, new ItemStack(ModItems.ingotNickel), 0.7F);
                }
                //osmium
                if (OreInAMillionConfig.isOsmiumEnabled) {
                    GameRegistry.addSmelting(ModBlocks.oreOsmium, new ItemStack(ModItems.ingotOsmium), 0.7F);
                    GameRegistry.addSmelting(ModItems.dustOsmium, new ItemStack(ModItems.ingotOsmium), 0.7F);
                }
                //platinum
                if (OreInAMillionConfig.isPlatinumEnabled) {
                    GameRegistry.addSmelting(ModBlocks.orePlatinum, new ItemStack(ModItems.ingotPlatinum), 0.7F);
                    GameRegistry.addSmelting(ModItems.dustPlatinum, new ItemStack(ModItems.ingotPlatinum), 0.7F);
                }
                //silver
                if (OreInAMillionConfig.isSilverEnabled) {
                    GameRegistry.addSmelting(ModBlocks.oreSilver, new ItemStack(ModItems.ingotSilver), 0.7F);
                    GameRegistry.addSmelting(ModItems.dustSilver, new ItemStack(ModItems.ingotSilver), 0.7F);
                }
                //tin
                if (OreInAMillionConfig.isTinEnabled) {
                    GameRegistry.addSmelting(ModBlocks.oreTin, new ItemStack(ModItems.ingotTin), 0.7F);
                    GameRegistry.addSmelting(ModItems.dustTin, new ItemStack(ModItems.ingotTin), 0.7F);
                }
                //titanium
                if (OreInAMillionConfig.isTitaniumEnabled) {
                    GameRegistry.addSmelting(ModBlocks.oreTitanium, new ItemStack(ModItems.ingotTitanium), 0.7F);
                    GameRegistry.addSmelting(ModItems.dustTitanium, new ItemStack(ModItems.ingotTitanium), 0.7F);
                }
                //tungsten
                if (OreInAMillionConfig.isTungstenEnabled) {
                    GameRegistry.addSmelting(ModBlocks.oreTungsten, new ItemStack(ModItems.ingotTungsten), 0.7F);
                    GameRegistry.addSmelting(ModItems.dustTungsten, new ItemStack(ModItems.ingotTungsten), 0.7F);
                }
                //uranium
                if (OreInAMillionConfig.isUraniumEnabled) {
                    GameRegistry.addSmelting(ModBlocks.oreUranium, new ItemStack(ModItems.ingotUranium), 0.7F);
                    GameRegistry.addSmelting(ModItems.dustUranium, new ItemStack(ModItems.ingotUranium), 0.7F);
                }
                //zinc
                if (OreInAMillionConfig.isZincEnabled) {
                    GameRegistry.addSmelting(ModBlocks.oreZinc, new ItemStack(ModItems.ingotZinc), 0.7F);
                    GameRegistry.addSmelting(ModItems.dustZinc, new ItemStack(ModItems.ingotZinc), 0.7F);
                }
                //brass
                if (OreInAMillionConfig.isBrassEnabled) {
                    GameRegistry.addSmelting(ModItems.dustBrass, new ItemStack(ModItems.ingotBrass), 0.7F);
                }
                //bronze
                if (OreInAMillionConfig.isBronzeEnabled) {
                    GameRegistry.addSmelting(ModItems.dustBronze, new ItemStack(ModItems.ingotBronze), 0.7F);
                }
                //electrum
                if (OreInAMillionConfig.isElectrumEnabled) {
                    GameRegistry.addSmelting(ModItems.dustElectrum, new ItemStack(ModItems.ingotElectrum), 0.7F);
                }
                //fairy
                if (OreInAMillionConfig.isFairyEnabled) {
                    GameRegistry.addSmelting(ModItems.dustFairy, new ItemStack(ModItems.ingotFairy), 0.7F);
                }
                //invar
                if (OreInAMillionConfig.isInvarEnabled) {
                    GameRegistry.addSmelting(ModItems.dustInvar, new ItemStack(ModItems.ingotInvar), 0.7F);
                }
                //steel
                if (OreInAMillionConfig.isSteelEnabled) {
                    GameRegistry.addSmelting(ModItems.dustSteel, new ItemStack(ModItems.ingotSteel), 0.7F);
                }
                //thermal series
                if (OreInAMillionConfig.isThermalIngotsEnabled) {
                    //constantan
                    if (OreInAMillionConfig.isConstantanEnabled) {
                        GameRegistry.addSmelting(ModItems.dustConstantan, new ItemStack(ModItems.ingotConstantan), 0.7F);
                    }
                    //enderium
                    if (OreInAMillionConfig.isEnderiumEnabled) {
                        GameRegistry.addSmelting(ModItems.dustEnderium, new ItemStack(ModItems.ingotEnderium), 0.7F);
                    }
                    //lumium
                    if (OreInAMillionConfig.isLumiumEnabled) {
                        GameRegistry.addSmelting(ModItems.dustLumium, new ItemStack(ModItems.ingotLumium), 0.7F);
                    }
                    //signalum
                    if (OreInAMillionConfig.isSignalumEnabled) {
                        GameRegistry.addSmelting(ModItems.dustSignalum, new ItemStack(ModItems.ingotSignalum), 0.7F);
                    }
                }
                //tinkers construct
                if (OreInAMillionConfig.isTinkersIngotsEnabled) {
                    //ardite
                    if (OreInAMillionConfig.isArditeEnabled) {
                        GameRegistry.addSmelting(ModBlocks.oreArdite, new ItemStack(ModItems.ingotArdite), 0.7F);
                        GameRegistry.addSmelting(ModItems.dustArdite, new ItemStack(ModItems.ingotArdite), 0.7F);
                    }
                    //knightslime
                    if (OreInAMillionConfig.isKnightSlimeEnabled) {
                        GameRegistry.addSmelting(ModItems.dustKnightSlime, new ItemStack(ModItems.ingotKnightSlime), 0.7F);
                    }
                    //pigiron
                    if (OreInAMillionConfig.isPigIronEnabled) {
                        GameRegistry.addSmelting(ModItems.dustPigIron, new ItemStack(ModItems.ingotPigIron), 0.7F);
                    }
                    //manyullyn
                    if (OreInAMillionConfig.isManyullynEnabled) {
                        GameRegistry.addSmelting(ModItems.dustManyullyn, new ItemStack(ModItems.ingotManyullyn), 0.7F);
                    }
                }
            }
            //gems
            if (OreInAMillionConfig.isGemsEnabled) {
                //amethyst
                if (OreInAMillionConfig.isAmethystEnabled) {
                    GameRegistry.addSmelting(ModBlocks.oreAmethyst, new ItemStack(ModItems.gemAmethyst), 0.7F);
                    GameRegistry.addSmelting(ModItems.dustAmethyst, new ItemStack(ModItems.gemAmethyst), 0.7F);
                }
                //peridot
                if (OreInAMillionConfig.isPeridotEnabled) {
                    GameRegistry.addSmelting(ModBlocks.orePeridot, new ItemStack(ModItems.gemPeridot), 0.7F);
                    GameRegistry.addSmelting(ModItems.dustPeridot, new ItemStack(ModItems.gemPeridot), 0.7F);
                }
                //ruby
                if (OreInAMillionConfig.isRubyEnabled) {
                    GameRegistry.addSmelting(ModBlocks.oreRuby, new ItemStack(ModItems.gemRuby), 0.7F);
                    GameRegistry.addSmelting(ModItems.dustRuby, new ItemStack(ModItems.gemRuby), 0.7F);
                }
                //sapphire
                if (OreInAMillionConfig.isSapphireEnabled) {
                    GameRegistry.addSmelting(ModBlocks.oreSapphire, new ItemStack(ModItems.gemSapphire), 0.7F);
                    GameRegistry.addSmelting(ModItems.dustSapphire, new ItemStack(ModItems.gemSapphire), 0.7F);
                }
            }
            //elements
            if (OreInAMillionConfig.isElementsEnabled) {
                //carbon
                if (OreInAMillionConfig.isCarbonEnabled) {

                }
                //cinnabar
                if (OreInAMillionConfig.isCinnabarEnabled) {
                    GameRegistry.addSmelting(ModBlocks.oreCinnabar, new ItemStack(ModItems.elementCinnabar), 0.7F);
                    GameRegistry.addSmelting(ModItems.dustCinnabar, new ItemStack(ModItems.elementCinnabar), 0.7F);
                }
                //silicon
                if (OreInAMillionConfig.isSiliconEnabled) {
                    GameRegistry.addSmelting(ModItems.dustSilicon, new ItemStack(ModItems.elementSilicon), 0.7F);
                }
                //sulphur
                if (OreInAMillionConfig.isSulphurEnabled) {
                    GameRegistry.addSmelting(ModBlocks.oreSulfur, new ItemStack(ModItems.elementSulfur), 0.7F);
                    GameRegistry.addSmelting(ModItems.dustSulfur, new ItemStack(ModItems.elementSulfur), 0.7F);
                }
            }
            //vanilla additions
            if (OreInAMillionConfig.isVanillaEnabled) {
                //charcoal
                if (OreInAMillionConfig.isCharcoalEnabled) {

                }
                //coal
                if (OreInAMillionConfig.isCoalEnabled) {

                }
                //diamond
                if (OreInAMillionConfig.isDiamondEnabled) {
                    GameRegistry.addSmelting(ModItems.dustDiamond, new ItemStack(Items.DIAMOND), 0.7F);
                }
                //emerald
                if (OreInAMillionConfig.isEmeraldEnabled) {
                    GameRegistry.addSmelting(ModItems.dustEmerald, new ItemStack(Items.EMERALD), 0.7F);
                }
                //quartz
                if (OreInAMillionConfig.isQuartzEnabled) {
                    GameRegistry.addSmelting(ModItems.dustQuartz, new ItemStack(Items.QUARTZ), 0.7F);
                }
            }
            if (OreInAMillionConfig.isSillyStuffEnabled) {

            }
        }
    }
}
