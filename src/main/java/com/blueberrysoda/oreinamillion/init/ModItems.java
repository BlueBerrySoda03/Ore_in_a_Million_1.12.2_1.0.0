package com.blueberrysoda.oreinamillion.init;

import com.blueberrysoda.oreinamillion.config.OreInAMillionConfig;
import com.blueberrysoda.oreinamillion.items.crafting.*;
import com.blueberrysoda.oreinamillion.items.food.ItemFoodCrafting;
import com.blueberrysoda.oreinamillion.items.food.ItemFoodMineral;
import com.blueberrysoda.oreinamillion.items.misc.ItemIcon;
import com.blueberrysoda.oreinamillion.items.misc.ItemWeezer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.oredict.OreDictionary;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Mod.EventBusSubscriber
public class ModItems {

    public static final List<Item> ITEMS = new ArrayList<>();
    //=========
    //minerals
    //=========
    //public static Item ingot = new ItemMineral("_ingot");
    public static Item ingotAdamantine = new ItemMineral("adamantine_ingot");
    public static Item ingotAluminum = new ItemMineral("aluminum_ingot");
    public static Item ingotArdite = new ItemMineral("ardite_ingot");
    public static Item ingotChrome = new ItemMineral("chrome_ingot");
    public static Item ingotCobalt = new ItemMineral("cobalt_ingot");
    public static Item ingotCopper = new ItemMineral("copper_ingot");
    public static Item ingotEnder = new ItemMineral("ender_ingot");
    public static Item ingotIridium = new ItemMineral("iridium_ingot");
    public static Item ingotLead = new ItemMineral("lead_ingot");
    public static Item ingotMercury = new ItemMineral("mercury_ingot");
    public static Item ingotMithril = new ItemMineral("mithril_ingot");
    public static Item ingotNickel = new ItemMineral("nickel_ingot");
    public static Item ingotOsmium = new ItemMineral("osmium_ingot");
    public static Item ingotPlatinum = new ItemMineral("platinum_ingot");
    public static Item ingotSilver = new ItemMineral("silver_ingot");
    public static Item ingotTin = new ItemMineral("tin_ingot");
    public static Item ingotTitanium = new ItemMineral("titanium_ingot");
    public static Item ingotTungsten = new ItemMineral("tungsten_ingot");
    public static Item ingotUranium = new ItemMineral("uranium_ingot");
    public static Item ingotZinc = new ItemMineral("zinc_ingot");

    public static Item ingotBrass = new ItemMineral("brass_ingot");
    public static Item ingotBronze = new ItemMineral("bronze_ingot");
    public static Item ingotConstantan = new ItemMineral("constantan_ingot");
    public static Item ingotElectrum = new ItemMineral("electrum_ingot");
    public static Item ingotEnderium = new ItemMineral("enderium_ingot");
    public static Item ingotFairy = new ItemMineral("fairy_ingot");
    public static Item ingotInvar = new ItemMineral("invar_ingot");
    public static Item ingotKnightSlime = new ItemMineral("knightslime_ingot");
    public static Item ingotLumium = new ItemMineral("lumium_ingot");
    public static Item ingotManyullyn = new ItemMineral("manyullyn_ingot");
    public static Item ingotPigIron = new ItemMineral("pigiron_ingot");
    public static Item ingotSignalum = new ItemMineral("signalum_ingot");
    public static Item ingotSteel = new ItemMineral("steel_ingot");
    public static Item ingotVoidBorn = new ItemMineral("voidborn_ingot");

    public static Item gemAmethyst = new ItemMineral("amethyst_gem");
    public static Item gemPeridot = new ItemMineral("peridot_gem");
    public static Item gemRuby = new ItemMineral("ruby_gem");
    public static Item gemSapphire = new ItemMineral("sapphire_gem");

    public static Item elementCarbon = new ItemMineral("carbon_element");
    public static Item elementCinnabar = new ItemMineral("cinnabar_element");
    public static Item elementSilicon = new ItemMineral("silicon_element");
    public static Item elementSulfur = new ItemMineral("sulfur_element");

    public static Item ingotCharcoalium = new ItemCoalMineral("charcoalium_ingot", 1600);
    public static Item ingotCoalium = new ItemCoalMineral("coalium_ingot", 1600);
    public static Item ingotLapite = new ItemMineral("lapite_ingot");
    public static Item ingotQuartzium = new ItemMineral("quartzium_ingot");

    //=========
    //nuggets
    //=========
    //public static Item nugget = new ItemMineral("_nugget");
    public static Item nuggetAdamantine = new ItemMineral("adamantine_nugget");
    public static Item nuggetAluminum = new ItemMineral("aluminum_nugget");
    public static Item nuggetArdite = new ItemMineral("ardite_nugget");
    public static Item nuggetChrome = new ItemMineral("chrome_nugget");
    public static Item nuggetCobalt = new ItemMineral("cobalt_nugget");
    public static Item nuggetCopper = new ItemMineral("copper_nugget");
    public static Item nuggetEnder = new ItemMineral("ender_nugget");
    public static Item nuggetIridium = new ItemMineral("iridium_nugget");
    public static Item nuggetLead = new ItemMineral("lead_nugget");
    public static Item nuggetMithril = new ItemMineral("mithril_nugget");
    public static Item nuggetMercury = new ItemMineral("mercury_nugget");
    public static Item nuggetNickel = new ItemMineral("nickel_nugget");
    public static Item nuggetOsmium = new ItemMineral("osmium_nugget");
    public static Item nuggetPlatinum = new ItemMineral("platinum_nugget");
    public static Item nuggetSilver = new ItemMineral("silver_nugget");
    public static Item nuggetTin = new ItemMineral("tin_nugget");
    public static Item nuggetTitanium = new ItemMineral("titanium_nugget");
    public static Item nuggetTungsten = new ItemMineral("tungsten_nugget");
    public static Item nuggetUranium = new ItemMineral("uranium_nugget");
    public static Item nuggetZinc = new ItemMineral("zinc_nugget");

    public static Item nuggetBrass = new ItemMineral("brass_nugget");
    public static Item nuggetBronze = new ItemMineral("bronze_nugget");
    public static Item nuggetConstantan = new ItemMineral("constantan_nugget");
    public static Item nuggetElectrum = new ItemMineral("electrum_nugget");
    public static Item nuggetEnderium = new ItemMineral("enderium_nugget");
    public static Item nuggetFairy = new ItemMineral("fairy_nugget");
    public static Item nuggetInvar = new ItemMineral("invar_nugget");
    public static Item nuggetKnightSlime = new ItemMineral("knightslime_nugget");
    public static Item nuggetLumium = new ItemMineral("lumium_nugget");
    public static Item nuggetManyullyn = new ItemMineral("manyullyn_nugget");
    public static Item nuggetPigIron = new ItemFoodMineral("pigiron_nugget", 1, 0, false);
    public static Item nuggetSignalum = new ItemMineral("signalum_nugget");
    public static Item nuggetSteel = new ItemMineral("steel_nugget");
    public static Item nuggetVoidBorn = new ItemMineral("voidborn_nugget");

    public static Item nuggetAmethyst = new ItemMineral("amethyst_nugget");
    public static Item nuggetPeridot = new ItemMineral("peridot_nugget");
    public static Item nuggetRuby = new ItemMineral("ruby_nugget");
    public static Item nuggetSapphire = new ItemMineral("sapphire_nugget");

    public static Item nuggetCarbon = new ItemMineral("carbon_nugget");
    public static Item nuggetCinnabar = new ItemMineral("cinnabar_nugget");
    public static Item nuggetSilicon = new ItemMineral("silicon_nugget");
    public static Item nuggetSulfur = new ItemMineral("sulfur_nugget");

    public static Item nuggetCharcoal = new ItemCoalMineral("charcoal_nugget", 200);
    public static Item nuggetCharcoalium = new ItemCoalMineral("charcoalium_nugget", 200);
    public static Item nuggetCoal = new ItemCoalMineral("coal_nugget", 200);
    public static Item nuggetCoalium = new ItemCoalMineral("coalium_nugget", 200);
    public static Item nuggetDiamond = new ItemMineral("diamond_nugget");
    public static Item nuggetEmerald = new ItemMineral("emerald_nugget");
    public static Item nuggetLapis = new ItemMineral("lapis_lazuli_nugget");
    public static Item nuggetLapite = new ItemMineral("lapite_nugget");
    public static Item nuggetQuartz = new ItemMineral("quartz_nugget");
    public static Item nuggetQuartzium = new ItemMineral("quartzium_nugget");

    //========
    //dusts
    //========
    public static Item dustAdamantine = new ItemMineral("adamantine_dust");
    public static Item dustAluminum = new ItemMineral("aluminum_dust");
    public static Item dustArdite = new ItemMineral("ardite_dust");
    public static Item dustChrome = new ItemMineral("chrome_dust");
    public static Item dustCobalt = new ItemMineral("cobalt_dust");
    public static Item dustCopper = new ItemMineral("copper_dust");
    public static Item dustEnder = new ItemMineral("ender_dust");
    public static Item dustIridium = new ItemMineral("iridium_dust");
    public static Item dustLead = new ItemMineral("lead_dust");
    public static Item dustMithril = new ItemMineral("mithril_dust");
    public static Item dustMercury = new ItemMineral("mercury_dust");
    public static Item dustNickel = new ItemMineral("nickel_dust");
    public static Item dustOsmium = new ItemMineral("osmium_dust");
    public static Item dustPlatinum = new ItemMineral("platinum_dust");
    public static Item dustSilver = new ItemMineral("silver_dust");
    public static Item dustTin = new ItemMineral("tin_dust");
    public static Item dustTitanium = new ItemMineral("titanium_dust");
    public static Item dustTungsten = new ItemMineral("tungsten_dust");
    public static Item dustUranium = new ItemMineral("uranium_dust");
    public static Item dustZinc = new ItemMineral("zinc_dust");

    public static Item dustBrass = new ItemMineral("brass_dust");
    public static Item dustBronze = new ItemMineral("bronze_dust");
    public static Item dustConstantan = new ItemMineral("constantan_dust");
    public static Item dustElectrum = new ItemMineral("electrum_dust");
    public static Item dustEnderium = new ItemMineral("enderium_dust");
    public static Item dustFairy = new ItemMineral("fairy_dust");
    public static Item dustInvar = new ItemMineral("invar_dust");
    public static Item dustKnightSlime = new ItemMineral("knightslime_dust");
    public static Item dustLumium = new ItemMineral("lumium_dust");
    public static Item dustManyullyn = new ItemMineral("manyullyn_dust");
    public static Item dustPigIron = new ItemFoodMineral("pigiron_dust", 2, 2.0F, false);
    public static Item dustSignalum = new ItemMineral("signalum_dust");
    public static Item dustSteel = new ItemMineral("steel_dust");
    public static Item dustVoidBorn = new ItemMineral("voidborn_dust");

    public static Item dustAmethyst = new ItemMineral("amethyst_dust");
    public static Item dustPeridot = new ItemMineral("peridot_dust");
    public static Item dustRuby = new ItemMineral("ruby_dust");
    public static Item dustSapphire = new ItemMineral("sapphire_dust");

    public static Item dustCarbon = new ItemMineral("carbon_dust");
    public static Item dustCinnabar = new ItemMineral("cinnabar_dust");
    public static Item dustSilicon = new ItemMineral("silicon_dust");
    public static Item dustSulfur = new ItemMineral("sulfur_dust");

    public static Item dustCharcoal = new ItemCoalMineral("charcoal_dust", 1600);
    public static Item dustCharcoalium = new ItemCoalMineral("charcoalium_dust", 1600);
    public static Item dustCoal = new ItemCoalMineral("coal_dust", 1600);
    public static Item dustCoalium = new ItemCoalMineral("coalium_dust", 1600);
    public static Item dustDiamond = new ItemMineral("diamond_dust");
    public static Item dustEmerald = new ItemMineral("emerald_dust");
    public static Item dustGold = new ItemMineral("gold_dust");
    public static Item dustIron = new ItemMineral("iron_dust");
    public static Item dustLapis = new ItemMineral("lapis_lazuli_dust");
    public static Item dustLapite = new ItemMineral("lapite_dust");
    public static Item dustQuartz = new ItemMineral("quartz_dust");
    public static Item dustQuartzium = new ItemMineral("quartzium_dust");

    //========
    //gears
    //========
    public static Item gearAdamantine = new ItemCrafting("adamantine_gear");
    public static Item gearAluminum = new ItemCrafting("aluminum_gear");
    public static Item gearArdite = new ItemCrafting("ardite_gear");
    public static Item gearChrome = new ItemCrafting("chrome_gear");
    public static Item gearCobalt = new ItemCrafting("cobalt_gear");
    public static Item gearCopper = new ItemCrafting("copper_gear");
    public static Item gearEnder = new ItemCrafting("ender_gear");
    public static Item gearIridium = new ItemCrafting("iridium_gear");
    public static Item gearLead = new ItemCrafting("lead_gear");
    public static Item gearMithril = new ItemCrafting("mithril_gear");
    public static Item gearMercury = new ItemCrafting("mercury_gear");
    public static Item gearNickel = new ItemCrafting("nickel_gear");
    public static Item gearOsmium = new ItemCrafting("osmium_gear");
    public static Item gearPlatinum = new ItemCrafting("platinum_gear");
    public static Item gearSilver = new ItemCrafting("silver_gear");
    public static Item gearTin = new ItemCrafting("tin_gear");
    public static Item gearTitanium = new ItemCrafting("titanium_gear");
    public static Item gearTungsten = new ItemCrafting("tungsten_gear");
    public static Item gearUranium = new ItemCrafting("uranium_gear");
    public static Item gearZinc = new ItemCrafting("zinc_gear");

    public static Item gearBrass = new ItemCrafting("brass_gear");
    public static Item gearBronze = new ItemCrafting("bronze_gear");
    public static Item gearConstantan = new ItemCrafting("constantan_gear");
    public static Item gearElectrum = new ItemCrafting("electrum_gear");
    public static Item gearEnderium = new ItemCrafting("enderium_gear");
    public static Item gearFairy = new ItemCrafting("fairy_gear");
    public static Item gearInvar = new ItemCrafting("invar_gear");
    public static Item gearKnightSlime = new ItemCrafting("knightslime_gear");
    public static Item gearLumium = new ItemCrafting("lumium_gear");
    public static Item gearManyullyn = new ItemCrafting("manyullyn_gear");
    public static Item gearPigIron = new ItemFoodCrafting("pigiron_gear", 16, 0.5F, false);
    public static Item gearSignalum = new ItemCrafting("signalum_gear");
    public static Item gearSteel = new ItemCrafting("steel_gear");
    public static Item gearVoidBorn = new ItemCrafting("voidborn_gear");

    public static Item gearAmethyst = new ItemCrafting("amethyst_gear");
    public static Item gearPeridot = new ItemCrafting("peridot_gear");
    public static Item gearRuby = new ItemCrafting("ruby_gear");
    public static Item gearSapphire = new ItemCrafting("sapphire_gear");

    public static Item gearCarbon = new ItemCrafting("carbon_gear");
    public static Item gearCinnabar = new ItemCrafting("cinnabar_gear");
    public static Item gearSilicon = new ItemCrafting("silicon_gear");
    public static Item gearSulfur = new ItemCrafting("sulfur_gear");

    public static Item gearCharcoal = new ItemCoalCrafting("charcoal_gear", 6400);
    public static Item gearCharcoalium = new ItemCoalCrafting("charcoalium_gear", 6400);
    public static Item gearCoal = new ItemCoalCrafting("coal_gear", 6400);
    public static Item gearCoalium = new ItemCoalCrafting("coalium_gear", 6400);
    public static Item gearDiamond = new ItemCrafting("diamond_gear");
    public static Item gearEmerald = new ItemCrafting("emerald_gear");
    public static Item gearGold = new ItemCrafting("gold_gear");
    public static Item gearIron = new ItemCrafting("iron_gear");
    public static Item gearLapis = new ItemCrafting("lapis_lazuli_gear");
    public static Item gearLapite = new ItemCrafting("lapite_gear");
    public static Item gearQuartz = new ItemCrafting("quartz_gear");
    public static Item gearQuartzium = new ItemCrafting("quartzium_gear");

    //========
    //plate
    //========
    public static Item plateAdamantine = new ItemCrafting("adamantine_plate");
    public static Item plateAluminum = new ItemCrafting("aluminum_plate");
    public static Item plateArdite = new ItemCrafting("ardite_plate");
    public static Item plateChrome = new ItemCrafting("chrome_plate");
    public static Item plateCobalt = new ItemCrafting("cobalt_plate");
    public static Item plateCopper = new ItemCrafting("copper_plate");
    public static Item plateEnder = new ItemCrafting("ender_plate");
    public static Item plateIridium = new ItemCrafting("iridium_plate");
    public static Item plateLead = new ItemCrafting("lead_plate");
    public static Item plateMithril = new ItemCrafting("mithril_plate");
    public static Item plateMercury = new ItemCrafting("mercury_plate");
    public static Item plateNickel = new ItemCrafting("nickel_plate");
    public static Item plateOsmium = new ItemCrafting("osmium_plate");
    public static Item platePlatinum = new ItemCrafting("platinum_plate");
    public static Item plateSilver = new ItemCrafting("silver_plate");
    public static Item plateTin = new ItemCrafting("tin_plate");
    public static Item plateTitanium = new ItemCrafting("titanium_plate");
    public static Item plateTungsten = new ItemCrafting("tungsten_plate");
    public static Item plateUranium = new ItemCrafting("uranium_plate");
    public static Item plateZinc = new ItemCrafting("zinc_plate");

    public static Item plateBrass = new ItemCrafting("brass_plate");
    public static Item plateBronze = new ItemCrafting("bronze_plate");
    public static Item plateConstantan = new ItemCrafting("constantan_plate");
    public static Item plateElectrum = new ItemCrafting("electrum_plate");
    public static Item plateEnderium = new ItemCrafting("enderium_plate");
    public static Item plateFairy = new ItemCrafting("fairy_plate");
    public static Item plateInvar = new ItemCrafting("invar_plate");
    public static Item plateKnightSlime = new ItemCrafting("knightslime_plate");
    public static Item plateLumium = new ItemCrafting("lumium_plate");
    public static Item plateManyullyn = new ItemCrafting("manyullyn_plate");
    public static Item platePigIron = new ItemFoodCrafting("pigiron_plate", 3, 0.3F, false);
    public static Item plateSignalum = new ItemCrafting("signalum_plate");
    public static Item plateSteel = new ItemCrafting("steel_plate");
    public static Item plateVoidBorn = new ItemCrafting("voidborn_plate");

    public static Item plateAmethyst = new ItemCrafting("amethyst_plate");
    public static Item platePeridot = new ItemCrafting("peridot_plate");
    public static Item plateRuby = new ItemCrafting("ruby_plate");
    public static Item plateSapphire = new ItemCrafting("sapphire_plate");

    public static Item plateCarbon = new ItemCrafting("carbon_plate");
    public static Item plateCinnabar = new ItemCrafting("cinnabar_plate");
    public static Item plateSilicon = new ItemCrafting("silicon_plate");
    public static Item plateSulfur = new ItemCrafting("sulfur_plate");

    public static Item plateCharcoal = new ItemCoalCrafting("charcoal_plate", 1600);
    public static Item plateCharcoalium = new ItemCoalCrafting("charcoalium_plate", 1600);
    public static Item plateCoal = new ItemCoalCrafting("coal_plate", 1600);
    public static Item plateCoalium = new ItemCoalCrafting("coalium_plate", 1600);
    public static Item plateDiamond = new ItemCrafting("diamond_plate");
    public static Item plateEmerald = new ItemCrafting("emerald_plate");
    public static Item plateGold = new ItemCrafting("gold_plate");
    public static Item plateIron = new ItemCrafting("iron_plate");
    public static Item plateLapis = new ItemCrafting("lapis_lazuli_plate");
    public static Item plateLapite = new ItemCrafting("lapite_plate");
    public static Item plateQuartz = new ItemCrafting("quartz_plate");
    public static Item plateQuartzium = new ItemCrafting("quartzium_plate");

    //========
    //rod
    //========
    public static Item rodAdamantine = new ItemCrafting("adamantine_rod");
    public static Item rodAluminum = new ItemCrafting("aluminum_rod");
    public static Item rodArdite = new ItemCrafting("ardite_rod");
    public static Item rodChrome = new ItemCrafting("chrome_rod");
    public static Item rodCobalt = new ItemCrafting("cobalt_rod");
    public static Item rodCopper = new ItemCrafting("copper_rod");
    public static Item rodEnder = new ItemCrafting("ender_rod");
    public static Item rodIridium = new ItemCrafting("iridium_rod");
    public static Item rodLead = new ItemCrafting("lead_rod");
    public static Item rodMithril = new ItemCrafting("mithril_rod");
    public static Item rodMercury = new ItemCrafting("mercury_rod");
    public static Item rodNickel = new ItemCrafting("nickel_rod");
    public static Item rodOsmium = new ItemCrafting("osmium_rod");
    public static Item rodPlatinum = new ItemCrafting("platinum_rod");
    public static Item rodSilver = new ItemCrafting("silver_rod");
    public static Item rodTin = new ItemCrafting("tin_rod");
    public static Item rodTitanium = new ItemCrafting("titanium_rod");
    public static Item rodTungsten = new ItemCrafting("tungsten_rod");
    public static Item rodUranium = new ItemCrafting("uranium_rod");
    public static Item rodZinc = new ItemCrafting("zinc_rod");

    public static Item rodBrass = new ItemCrafting("brass_rod");
    public static Item rodBronze = new ItemCrafting("bronze_rod");
    public static Item rodConstantan = new ItemCrafting("constantan_rod");
    public static Item rodElectrum = new ItemCrafting("electrum_rod");
    public static Item rodEnderium = new ItemCrafting("enderium_rod");
    public static Item rodFairy = new ItemCrafting("fairy_rod");
    public static Item rodInvar = new ItemCrafting("invar_rod");
    public static Item rodKnightSlime = new ItemCrafting("knightslime_rod");
    public static Item rodLumium = new ItemCrafting("lumium_rod");
    public static Item rodManyullyn = new ItemCrafting("manyullyn_rod");
    public static Item rodPigIron = new ItemFoodCrafting("pigiron_rod", 8, 0.5F, false);
    public static Item rodSignalum = new ItemCrafting("signalum_rod");
    public static Item rodSteel = new ItemCrafting("steel_rod");
    public static Item rodVoidBorn = new ItemCrafting("voidborn_rod");

    public static Item rodAmethyst = new ItemCrafting("amethyst_rod");
    public static Item rodPeridot = new ItemCrafting("peridot_rod");
    public static Item rodRuby = new ItemCrafting("ruby_rod");
    public static Item rodSapphire = new ItemCrafting("sapphire_rod");

    public static Item rodCarbon = new ItemCrafting("carbon_rod");
    public static Item rodCinnabar = new ItemCrafting("cinnabar_rod");
    public static Item rodSilicon = new ItemCrafting("silicon_rod");
    public static Item rodSulfur = new ItemCrafting("sulfur_rod");

    public static Item rodCharcoal = new ItemCoalCrafting("charcoal_rod", 3200);
    public static Item rodCharcoalium = new ItemCoalCrafting("charcoalium_rod", 3200);
    public static Item rodCoal = new ItemCoalCrafting("coal_rod", 3200);
    public static Item rodCoalium = new ItemCoalCrafting("coalium_rod", 3200);
    public static Item rodDiamond = new ItemCrafting("diamond_rod");
    public static Item rodEmerald = new ItemCrafting("emerald_rod");
    public static Item rodGold = new ItemCrafting("gold_rod");
    public static Item rodIron = new ItemCrafting("iron_rod");
    public static Item rodLapis = new ItemCrafting("lapis_lazuli_rod");
    public static Item rodLapite = new ItemCrafting("lapite_rod");
    public static Item rodQuartz = new ItemCrafting("quartz_rod");
    public static Item rodQuartzium = new ItemCrafting("quartzium_rod");

    //=========
    //tiny dust
    //=========
    public static Item tinydustAdamantine = new ItemCrafting("adamantine_tiny");
    public static Item tinydustAluminum = new ItemCrafting("aluminum_tiny");
    public static Item tinydustArdite = new ItemCrafting("ardite_tiny");
    public static Item tinydustChrome = new ItemCrafting("chrome_tiny");
    public static Item tinydustCobalt = new ItemCrafting("cobalt_tiny");
    public static Item tinydustCopper = new ItemCrafting("copper_tiny");
    public static Item tinydustEnder = new ItemCrafting("ender_tiny");
    public static Item tinydustIridium = new ItemCrafting("iridium_tiny");
    public static Item tinydustLead = new ItemCrafting("lead_tiny");
    public static Item tinydustMithril = new ItemCrafting("mithril_tiny");
    public static Item tinydustMercury = new ItemCrafting("mercury_tiny");
    public static Item tinydustNickel = new ItemCrafting("nickel_tiny");
    public static Item tinydustOsmium = new ItemCrafting("osmium_tiny");
    public static Item tinydustPlatinum = new ItemCrafting("platinum_tiny");
    public static Item tinydustSilver = new ItemCrafting("silver_tiny");
    public static Item tinydustTin = new ItemCrafting("tin_tiny");
    public static Item tinydustTitanium = new ItemCrafting("titanium_tiny");
    public static Item tinydustTungsten = new ItemCrafting("tungsten_tiny");
    public static Item tinydustUranium = new ItemCrafting("uranium_tiny");
    public static Item tinydustZinc = new ItemCrafting("zinc_tiny");

    public static Item tinydustBrass = new ItemCrafting("brass_tiny");
    public static Item tinydustBronze = new ItemCrafting("bronze_tiny");
    public static Item tinydustConstantan = new ItemCrafting("constantan_tiny");
    public static Item tinydustElectrum = new ItemCrafting("electrum_tiny");
    public static Item tinydustEnderium = new ItemCrafting("enderium_tiny");
    public static Item tinydustFairy = new ItemCrafting("fairy_tiny");
    public static Item tinydustInvar = new ItemCrafting("invar_tiny");
    public static Item tinydustKnightSlime = new ItemCrafting("knightslime_tiny");
    public static Item tinydustLumium = new ItemCrafting("lumium_tiny");
    public static Item tinydustManyullyn = new ItemCrafting("manyullyn_tiny");
    public static Item tinydustPigIron = new ItemFoodCrafting("pigiron_tiny", 1, 0.0F, false);
    public static Item tinydustSignalum = new ItemCrafting("signalum_tiny");
    public static Item tinydustSteel = new ItemCrafting("steel_tiny");
    public static Item tinydustVoidBorn = new ItemCrafting("voidborn_tiny");

    public static Item tinydustAmethyst = new ItemCrafting("amethyst_tiny");
    public static Item tinydustPeridot = new ItemCrafting("peridot_tiny");
    public static Item tinydustRuby = new ItemCrafting("ruby_tiny");
    public static Item tinydustSapphire = new ItemCrafting("sapphire_tiny");

    public static Item tinydustCarbon = new ItemCrafting("carbon_tiny");
    public static Item tinydustCinnabar = new ItemCrafting("cinnabar_tiny");
    public static Item tinydustSilicon = new ItemCrafting("silicon_tiny");
    public static Item tinydustSulfur = new ItemCrafting("sulfur_tiny");

    public static Item tinydustCharcoal = new ItemCoalCrafting("charcoal_tiny", 200);
    public static Item tinydustCharcoalium = new ItemCoalCrafting("charcoalium_tiny", 200);
    public static Item tinydustCoal = new ItemCoalCrafting("coal_tiny", 200);
    public static Item tinydustCoalium = new ItemCoalCrafting("coalium_tiny", 200);
    public static Item tinydustDiamond = new ItemCrafting("diamond_tiny");
    public static Item tinydustEmerald = new ItemCrafting("emerald_tiny");
    public static Item tinydustGold = new ItemCrafting("gold_tiny");
    public static Item tinydustIron = new ItemCrafting("iron_tiny");
    public static Item tinydustLapis = new ItemCrafting("lapis_lazuli_tiny");
    public static Item tinydustLapite = new ItemCrafting("lapite_tiny");
    public static Item tinydustQuartz = new ItemCrafting("quartz_tiny");
    public static Item tinydustQuartzium = new ItemCrafting("quartzium_tiny");

    //========
    //other
    //========
    public static Item weezerWeezer = new ItemWeezer("weezer");

    public static Item creativeIcon1 = new ItemIcon("creative_icon1");
    public static Item creativeIcon2 = new ItemIcon("creative_icon2");
    public static Item creativeIcon3 = new ItemIcon("creative_icon3");
    public static Item creativeIcon4 = new ItemIcon("creative_icon4");
    public static Item creativeIcon5 = new ItemIcon("creative_icon5");
    public static Item creativeIcon6 = new ItemIcon("creative_icon6");

    public static void init(){
        if (OreInAMillionConfig.isMineralsEnabled) {
            if (OreInAMillionConfig.isIngotsEnabled) {
                if (OreInAMillionConfig.isAdamantineEnabled) {
                    ITEMS.add(ingotAdamantine);
                    ITEMS.add(nuggetAdamantine);
                    ITEMS.add(dustAdamantine);

                    if (OreInAMillionConfig.isCraftingEnabled) {
                        if (OreInAMillionConfig.isAdamantineCraftingEnabled) {
                            ITEMS.add(gearAdamantine);
                            ITEMS.add(plateAdamantine);
                            ITEMS.add(rodAdamantine);
                            ITEMS.add(tinydustAdamantine);
                        }
                    }
                }
                //aluminum
                if (OreInAMillionConfig.isAluminumEnabled) {
                    ITEMS.add(ingotAluminum);
                    ITEMS.add(nuggetAluminum);
                    ITEMS.add(dustAluminum);

                    if (OreInAMillionConfig.isCraftingEnabled) {
                        if (OreInAMillionConfig.isAluminumCraftingEnabled) {
                            ITEMS.add(gearAluminum);
                            ITEMS.add(plateAluminum);
                            ITEMS.add(rodAluminum);
                            ITEMS.add(tinydustAluminum);
                        }
                    }
                }
                //chrome
                if (OreInAMillionConfig.isChromeEnabled) {
                    ITEMS.add(ingotChrome);
                    ITEMS.add(nuggetChrome);
                    ITEMS.add(dustChrome);

                    if (OreInAMillionConfig.isCraftingEnabled) {
                        if (OreInAMillionConfig.isChromeCraftingEnabled) {
                            ITEMS.add(gearChrome);
                            ITEMS.add(plateChrome);
                            ITEMS.add(rodChrome);
                            ITEMS.add(tinydustChrome);
                        }
                    }
                }
                //cobalt
                if (OreInAMillionConfig.isCobaltEnabled) {
                    ITEMS.add(ingotCobalt);
                    ITEMS.add(nuggetCobalt);
                    ITEMS.add(dustCobalt);

                    if (OreInAMillionConfig.isCraftingEnabled) {
                        if (OreInAMillionConfig.isCobaltCraftingEnabled) {
                            ITEMS.add(gearCobalt);
                            ITEMS.add(plateCobalt);
                            ITEMS.add(rodCobalt);
                            ITEMS.add(tinydustCobalt);
                        }
                    }
                }
                //copper
                if (OreInAMillionConfig.isCopperEnabled) {
                    ITEMS.add(ingotCopper);
                    ITEMS.add(nuggetCopper);
                    ITEMS.add(dustCopper);

                    if (OreInAMillionConfig.isCraftingEnabled) {
                        if (OreInAMillionConfig.isCopperCraftingEnabled) {
                            ITEMS.add(gearCopper);
                            ITEMS.add(plateCopper);
                            ITEMS.add(rodCopper);
                            ITEMS.add(tinydustCopper);
                        }
                    }
                }
                //ender
                if (OreInAMillionConfig.isEnderEnabled) {
                    ITEMS.add(ingotEnder);
                    ITEMS.add(nuggetEnder);
                    ITEMS.add(dustEnder);

                    if (OreInAMillionConfig.isCraftingEnabled) {
                        if (OreInAMillionConfig.isEnderCraftingEnabled) {
                            ITEMS.add(gearEnder);
                            ITEMS.add(plateEnder);
                            ITEMS.add(rodEnder);
                            ITEMS.add(tinydustEnder);
                        }
                    }
                }
                //iridium
                if (OreInAMillionConfig.isIridiumEnabled) {
                    ITEMS.add(ingotIridium);
                    ITEMS.add(nuggetIridium);
                    ITEMS.add(dustIridium);

                    if (OreInAMillionConfig.isCraftingEnabled) {
                        if (OreInAMillionConfig.isIridiumCraftingEnabled) {
                            ITEMS.add(gearIridium);
                            ITEMS.add(plateIridium);
                            ITEMS.add(rodIridium);
                            ITEMS.add(tinydustIridium);
                        }
                    }
                }
                //lead
                if (OreInAMillionConfig.isLeadEnabled) {
                    ITEMS.add(ingotLead);
                    ITEMS.add(nuggetLead);
                    ITEMS.add(dustLead);

                    if (OreInAMillionConfig.isCraftingEnabled) {
                        if (OreInAMillionConfig.isLeadCraftingEnabled) {
                            ITEMS.add(gearLead);
                            ITEMS.add(plateLead);
                            ITEMS.add(rodLead);
                            ITEMS.add(tinydustLead);
                        }
                    }
                }
                //mithril
                if (OreInAMillionConfig.isMithrilEnabled) {
                    ITEMS.add(ingotMithril);
                    ITEMS.add(nuggetMithril);
                    ITEMS.add(dustMithril);

                    if (OreInAMillionConfig.isCraftingEnabled) {
                        if (OreInAMillionConfig.isMithrilCraftingEnabled) {
                            ITEMS.add(gearMithril);
                            ITEMS.add(plateMithril);
                            ITEMS.add(rodMithril);
                            ITEMS.add(tinydustMithril);
                        }
                    }
                }
                //mercury
                if (OreInAMillionConfig.isMercuryEnabled) {
                    ITEMS.add(ingotMercury);
                    ITEMS.add(nuggetMercury);
                    ITEMS.add(dustMercury);

                    if (OreInAMillionConfig.isCraftingEnabled) {
                        if (OreInAMillionConfig.isMercuryCraftingEnabled) {
                            ITEMS.add(gearMercury);
                            ITEMS.add(plateMercury);
                            ITEMS.add(rodMercury);
                            ITEMS.add(tinydustMercury);
                        }
                    }
                }
                //nickel
                if (OreInAMillionConfig.isNickelEnabled) {
                    ITEMS.add(ingotNickel);
                    ITEMS.add(nuggetNickel);
                    ITEMS.add(dustNickel);

                    if (OreInAMillionConfig.isCraftingEnabled) {
                        if (OreInAMillionConfig.isNickelCraftingEnabled) {
                            ITEMS.add(gearNickel);
                            ITEMS.add(plateNickel);
                            ITEMS.add(rodNickel);
                            ITEMS.add(tinydustNickel);
                        }
                    }
                }
                //osmium
                if (OreInAMillionConfig.isOsmiumEnabled) {
                    ITEMS.add(ingotOsmium);
                    ITEMS.add(nuggetOsmium);
                    ITEMS.add(dustOsmium);

                    if (OreInAMillionConfig.isCraftingEnabled) {
                        if (OreInAMillionConfig.isOsmiumCraftingEnabled) {
                            ITEMS.add(gearOsmium);
                            ITEMS.add(plateOsmium);
                            ITEMS.add(rodOsmium);
                            ITEMS.add(tinydustOsmium);
                        }
                    }
                }
                //platinum
                if (OreInAMillionConfig.isPlatinumEnabled) {
                    ITEMS.add(ingotPlatinum);
                    ITEMS.add(nuggetPlatinum);
                    ITEMS.add(dustPlatinum);

                    if (OreInAMillionConfig.isCraftingEnabled) {
                        if (OreInAMillionConfig.isPlatinumCraftingEnabled) {
                            ITEMS.add(gearPlatinum);
                            ITEMS.add(platePlatinum);
                            ITEMS.add(rodPlatinum);
                            ITEMS.add(tinydustPlatinum);
                        }
                    }
                }
                //silver
                if (OreInAMillionConfig.isSilverEnabled) {
                    ITEMS.add(ingotSilver);
                    ITEMS.add(nuggetSilver);
                    ITEMS.add(dustSilver);

                    if (OreInAMillionConfig.isCraftingEnabled) {
                        if (OreInAMillionConfig.isSilverCraftingEnabled) {
                            ITEMS.add(gearSilver);
                            ITEMS.add(plateSilver);
                            ITEMS.add(rodSilver);
                            ITEMS.add(tinydustSilver);
                        }
                    }
                }
                //tin
                if (OreInAMillionConfig.isTinEnabled) {
                    ITEMS.add(ingotTin);
                    ITEMS.add(nuggetTin);
                    ITEMS.add(dustTin);

                    if (OreInAMillionConfig.isCraftingEnabled) {
                        if (OreInAMillionConfig.isTinCraftingEnabled) {
                            ITEMS.add(gearTin);
                            ITEMS.add(plateTin);
                            ITEMS.add(rodTin);
                            ITEMS.add(tinydustTin);
                        }
                    }
                }
                //titanium
                if (OreInAMillionConfig.isTitaniumEnabled) {
                    ITEMS.add(ingotTitanium);
                    ITEMS.add(nuggetTitanium);
                    ITEMS.add(dustTitanium);

                    if (OreInAMillionConfig.isCraftingEnabled) {
                        if (OreInAMillionConfig.isTitaniumCraftingEnabled) {
                            ITEMS.add(gearTitanium);
                            ITEMS.add(plateTitanium);
                            ITEMS.add(rodTitanium);
                            ITEMS.add(tinydustTitanium);
                        }
                    }
                }
                //tungsten
                if (OreInAMillionConfig.isTungstenEnabled) {
                    ITEMS.add(ingotTungsten);
                    ITEMS.add(nuggetTungsten);
                    ITEMS.add(dustTungsten);

                    if (OreInAMillionConfig.isCraftingEnabled) {
                        if (OreInAMillionConfig.isTungstenCraftingEnabled) {
                            ITEMS.add(gearTungsten);
                            ITEMS.add(plateTungsten);
                            ITEMS.add(rodTungsten);
                            ITEMS.add(tinydustTungsten);
                        }
                    }
                }
                //uranium
                if (OreInAMillionConfig.isUraniumEnabled) {
                    ITEMS.add(ingotUranium);
                    ITEMS.add(nuggetUranium);
                    ITEMS.add(dustUranium);

                    if (OreInAMillionConfig.isCraftingEnabled) {
                        if (OreInAMillionConfig.isUraniumCraftingEnabled) {
                            ITEMS.add(gearUranium);
                            ITEMS.add(plateUranium);
                            ITEMS.add(rodUranium);
                            ITEMS.add(tinydustUranium);
                        }
                    }
                }
                //zinc
                if (OreInAMillionConfig.isZincEnabled) {
                    ITEMS.add(ingotZinc);
                    ITEMS.add(nuggetZinc);
                    ITEMS.add(dustZinc);

                    if (OreInAMillionConfig.isCraftingEnabled) {
                        if (OreInAMillionConfig.isZincCraftingEnabled) {
                            ITEMS.add(gearZinc);
                            ITEMS.add(plateZinc);
                            ITEMS.add(rodZinc);
                            ITEMS.add(tinydustZinc);
                        }
                    }
                }
                //brass
                if (OreInAMillionConfig.isBrassEnabled) {
                    ITEMS.add(ingotBrass);
                    ITEMS.add(nuggetBrass);
                    ITEMS.add(dustBrass);

                    if (OreInAMillionConfig.isCraftingEnabled) {
                        if (OreInAMillionConfig.isBrassCraftingEnabled) {
                            ITEMS.add(gearBrass);
                            ITEMS.add(plateBrass);
                            ITEMS.add(rodBrass);
                            ITEMS.add(tinydustBrass);
                        }
                    }
                }
                //bronze
                if (OreInAMillionConfig.isBronzeEnabled) {
                    ITEMS.add(ingotBronze);
                    ITEMS.add(nuggetBronze);
                    ITEMS.add(dustBronze);

                    if (OreInAMillionConfig.isCraftingEnabled) {
                        if (OreInAMillionConfig.isBronzeCraftingEnabled) {
                            ITEMS.add(gearBronze);
                            ITEMS.add(plateBronze);
                            ITEMS.add(rodBronze);
                            ITEMS.add(tinydustBronze);
                        }
                    }
                }
                //electrum
                if (OreInAMillionConfig.isElectrumEnabled) {
                    ITEMS.add(ingotElectrum);
                    ITEMS.add(nuggetElectrum);
                    ITEMS.add(dustElectrum);

                    if (OreInAMillionConfig.isCraftingEnabled) {
                        if (OreInAMillionConfig.isElectrumCraftingEnabled) {
                            ITEMS.add(gearElectrum);
                            ITEMS.add(plateElectrum);
                            ITEMS.add(rodElectrum);
                            ITEMS.add(tinydustElectrum);
                        }
                    }
                }
                //fairy
                if (OreInAMillionConfig.isFairyEnabled) {
                    ITEMS.add(ingotFairy);
                    ITEMS.add(nuggetFairy);
                    ITEMS.add(dustFairy);

                    if (OreInAMillionConfig.isCraftingEnabled) {
                        if (OreInAMillionConfig.isFairyCraftingEnabled) {
                            ITEMS.add(gearFairy);
                            ITEMS.add(plateFairy);
                            ITEMS.add(rodFairy);
                            ITEMS.add(tinydustFairy);
                        }
                    }
                }
                //invar
                if (OreInAMillionConfig.isInvarEnabled) {
                    ITEMS.add(ingotInvar);
                    ITEMS.add(nuggetInvar);
                    ITEMS.add(dustInvar);

                    if (OreInAMillionConfig.isCraftingEnabled) {
                        if (OreInAMillionConfig.isInvarCraftingEnabled) {
                            ITEMS.add(gearInvar);
                            ITEMS.add(plateInvar);
                            ITEMS.add(rodInvar);
                            ITEMS.add(tinydustInvar);
                        }
                    }
                }
                //steel
                if (OreInAMillionConfig.isSteelEnabled) {
                    ITEMS.add(ingotSteel);
                    ITEMS.add(nuggetSteel);
                    ITEMS.add(dustSteel);

                    if (OreInAMillionConfig.isCraftingEnabled) {
                        if (OreInAMillionConfig.isSteelCraftingEnabled) {
                            ITEMS.add(gearSteel);
                            ITEMS.add(plateSteel);
                            ITEMS.add(rodSteel);
                            ITEMS.add(tinydustSteel);
                        }
                    }
                }
                //voidborn
                if (OreInAMillionConfig.isVoidBornEnabled) {
                    ITEMS.add(ingotVoidBorn);
                    ITEMS.add(nuggetVoidBorn);
                    ITEMS.add(dustVoidBorn);

                    if (OreInAMillionConfig.isCraftingEnabled) {
                        if (OreInAMillionConfig.isVoidBornCraftingEnabled) {
                            ITEMS.add(gearVoidBorn);
                            ITEMS.add(plateVoidBorn);
                            ITEMS.add(rodVoidBorn);
                            ITEMS.add(tinydustVoidBorn);
                        }
                    }
                }
                //thermal series
                if (OreInAMillionConfig.isThermalEnabled){
                    //constantan
                    if (OreInAMillionConfig.isConstantanEnabled) {
                        ITEMS.add(ingotConstantan);
                        ITEMS.add(nuggetConstantan);
                        ITEMS.add(dustConstantan);

                        if (OreInAMillionConfig.isCraftingEnabled) {
                            if (OreInAMillionConfig.isConstantanCraftingEnabled) {
                                ITEMS.add(gearConstantan);
                                ITEMS.add(plateConstantan);
                                ITEMS.add(rodConstantan);
                                ITEMS.add(tinydustConstantan);
                            }
                        }
                    }
                    //enderium
                    if (OreInAMillionConfig.isEnderiumEnabled) {
                        ITEMS.add(ingotEnderium);
                        ITEMS.add(nuggetEnderium);
                        ITEMS.add(dustEnderium);

                        if (OreInAMillionConfig.isCraftingEnabled) {
                            if (OreInAMillionConfig.isEnderiumCraftingEnabled) {
                                ITEMS.add(gearEnderium);
                                ITEMS.add(plateEnderium);
                                ITEMS.add(rodEnderium);
                                ITEMS.add(tinydustEnderium);
                            }
                        }
                    }
                    //lumium
                    if (OreInAMillionConfig.isLumiumEnabled) {
                        ITEMS.add(ingotLumium);
                        ITEMS.add(nuggetLumium);
                        ITEMS.add(dustLumium);

                        if (OreInAMillionConfig.isCraftingEnabled) {
                            if (OreInAMillionConfig.isLumiumCraftingEnabled) {
                                ITEMS.add(gearLumium);
                                ITEMS.add(plateLumium);
                                ITEMS.add(rodLumium);
                                ITEMS.add(tinydustLumium);
                            }
                        }
                    }
                    //signalum
                    if (OreInAMillionConfig.isSignalumEnabled) {
                        ITEMS.add(ingotSignalum);
                        ITEMS.add(nuggetSignalum);
                        ITEMS.add(dustSignalum);

                        if (OreInAMillionConfig.isCraftingEnabled) {
                            if (OreInAMillionConfig.isSignalumCraftingEnabled) {
                                ITEMS.add(gearSignalum);
                                ITEMS.add(plateSignalum);
                                ITEMS.add(rodSignalum);
                                ITEMS.add(tinydustSignalum);
                            }
                        }
                    }
                }
                //tinkers construct
                if (OreInAMillionConfig.isTinkersEnabled){
                    //ardite
                    if (OreInAMillionConfig.isArditeEnabled) {
                        ITEMS.add(ingotArdite);
                        ITEMS.add(nuggetArdite);
                        ITEMS.add(dustArdite);

                        if (OreInAMillionConfig.isCraftingEnabled) {
                            if (OreInAMillionConfig.isArditeCraftingEnabled) {
                                ITEMS.add(gearArdite);
                                ITEMS.add(plateArdite);
                                ITEMS.add(rodArdite);
                                ITEMS.add(tinydustArdite);
                            }
                        }
                    }
                    //knightslime
                    if (OreInAMillionConfig.isKnightSlimeEnabled) {
                        ITEMS.add(ingotKnightSlime);
                        ITEMS.add(nuggetKnightSlime);
                        ITEMS.add(dustKnightSlime);

                        if (OreInAMillionConfig.isCraftingEnabled) {
                            if (OreInAMillionConfig.isKnightSlimeCraftingEnabled) {
                                ITEMS.add(gearKnightSlime);
                                ITEMS.add(plateKnightSlime);
                                ITEMS.add(rodKnightSlime);
                                ITEMS.add(tinydustKnightSlime);
                            }
                        }
                    }
                    //pigiron
                    if (OreInAMillionConfig.isPigIronEnabled) {
                        ITEMS.add(ingotPigIron);
                        ITEMS.add(nuggetPigIron);
                        ITEMS.add(dustPigIron);

                        if (OreInAMillionConfig.isCraftingEnabled) {
                            if (OreInAMillionConfig.isPigIronCraftingEnabled) {
                                ITEMS.add(gearPigIron);
                                ITEMS.add(platePigIron);
                                ITEMS.add(rodPigIron);
                                ITEMS.add(tinydustPigIron);
                            }
                        }
                    }
                    //manyullyn
                    if (OreInAMillionConfig.isManyullynEnabled) {
                        ITEMS.add(ingotManyullyn);
                        ITEMS.add(nuggetManyullyn);
                        ITEMS.add(dustManyullyn);

                        if (OreInAMillionConfig.isCraftingEnabled) {
                            if (OreInAMillionConfig.isManyullynCraftingEnabled) {
                                ITEMS.add(gearManyullyn);
                                ITEMS.add(plateManyullyn);
                                ITEMS.add(rodManyullyn);
                                ITEMS.add(tinydustManyullyn);
                            }
                        }
                    }
                }
            }
            //gems
            if (OreInAMillionConfig.isGemsEnabled){
                //amethyst
                if (OreInAMillionConfig.isAmethystEnabled) {
                    ITEMS.add(gemAmethyst);
                    ITEMS.add(nuggetAmethyst);
                    ITEMS.add(dustAmethyst);

                    if (OreInAMillionConfig.isCraftingEnabled) {
                        if (OreInAMillionConfig.isAmethystCraftingEnabled) {
                            ITEMS.add(gearAmethyst);
                            ITEMS.add(plateAmethyst);
                            ITEMS.add(rodAmethyst);
                            ITEMS.add(tinydustAmethyst);
                        }
                    }
                }
                //peridot
                if (OreInAMillionConfig.isPeridotEnabled) {
                    ITEMS.add(gemPeridot);
                    ITEMS.add(nuggetPeridot);
                    ITEMS.add(dustPeridot);

                    if (OreInAMillionConfig.isCraftingEnabled) {
                        if (OreInAMillionConfig.isPeridotCraftingEnabled) {
                            ITEMS.add(gearPeridot);
                            ITEMS.add(platePeridot);
                            ITEMS.add(rodPeridot);
                            ITEMS.add(tinydustPeridot);
                        }
                    }
                }
                //ruby
                if (OreInAMillionConfig.isRubyEnabled) {
                    ITEMS.add(gemRuby);
                    ITEMS.add(nuggetRuby);
                    ITEMS.add(dustRuby);

                    if (OreInAMillionConfig.isCraftingEnabled) {
                        if (OreInAMillionConfig.isRubyCraftingEnabled) {
                            ITEMS.add(gearRuby);
                            ITEMS.add(plateRuby);
                            ITEMS.add(rodRuby);
                            ITEMS.add(tinydustRuby);
                        }
                    }
                }
                //sapphire
                if (OreInAMillionConfig.isSapphireEnabled) {
                    ITEMS.add(gemSapphire);
                    ITEMS.add(nuggetSapphire);
                    ITEMS.add(dustSapphire);

                    if (OreInAMillionConfig.isCraftingEnabled) {
                        if (OreInAMillionConfig.isSapphireCraftingEnabled) {
                            ITEMS.add(gearSapphire);
                            ITEMS.add(plateSapphire);
                            ITEMS.add(rodSapphire);
                            ITEMS.add(tinydustSapphire);
                        }
                    }
                }
            }
            //elements
            if (OreInAMillionConfig.isElementsEnabled){
                //carbon
                if (OreInAMillionConfig.isCarbonEnabled) {
                    ITEMS.add(elementCarbon);
                    ITEMS.add(nuggetCarbon);
                    ITEMS.add(dustCarbon);

                    if (OreInAMillionConfig.isCraftingEnabled) {
                        if (OreInAMillionConfig.isCarbonCraftingEnabled) {
                            ITEMS.add(gearCarbon);
                            ITEMS.add(plateCarbon);
                            ITEMS.add(rodCarbon);
                            ITEMS.add(tinydustCarbon);
                        }
                    }
                }
                //cinnabar
                if (OreInAMillionConfig.isCinnabarEnabled) {
                    ITEMS.add(elementCinnabar);
                    ITEMS.add(nuggetCinnabar);
                    ITEMS.add(dustCinnabar);

                    if (OreInAMillionConfig.isCraftingEnabled) {
                        if (OreInAMillionConfig.isCinnabarCraftingEnabled) {
                            ITEMS.add(gearCinnabar);
                            ITEMS.add(plateCinnabar);
                            ITEMS.add(rodCinnabar);
                            ITEMS.add(tinydustCinnabar);
                        }
                    }
                }
                //silicon
                if (OreInAMillionConfig.isSiliconEnabled) {
                    ITEMS.add(elementSilicon);
                    ITEMS.add(nuggetSilicon);
                    ITEMS.add(dustSilicon);

                    if (OreInAMillionConfig.isCraftingEnabled) {
                        if (OreInAMillionConfig.isSiliconCraftingEnabled) {
                            ITEMS.add(gearSilicon);
                            ITEMS.add(plateSilicon);
                            ITEMS.add(rodSilicon);
                            ITEMS.add(tinydustSilicon);
                        }
                    }
                }
                //sulphur
                if (OreInAMillionConfig.isSulfurEnabled) {
                    ITEMS.add(elementSulfur);
                    ITEMS.add(nuggetSulfur);
                    ITEMS.add(dustSulfur);

                    if (OreInAMillionConfig.isCraftingEnabled) {
                        if (OreInAMillionConfig.isSulfurCraftingEnabled) {
                            ITEMS.add(gearSulfur);
                            ITEMS.add(plateSulfur);
                            ITEMS.add(rodSulfur);
                            ITEMS.add(tinydustSulfur);
                        }
                    }
                }
            }
            //vanilla additions
            if (OreInAMillionConfig.isVanillaEnabled){
                //charcoal
                if (OreInAMillionConfig.isCharcoalEnabled) {
                    ITEMS.add(nuggetCharcoal);
                    ITEMS.add(dustCharcoal);

                    if (OreInAMillionConfig.isCraftingEnabled) {
                        if (OreInAMillionConfig.isCharcoalCraftingEnabled) {
                            ITEMS.add(gearCharcoal);
                            ITEMS.add(plateCharcoal);
                            ITEMS.add(rodCharcoal);
                            ITEMS.add(tinydustCharcoal);
                        }
                    }
                    if (OreInAMillionConfig.isCharcoaliumEnabled) {
                        ITEMS.add(ingotCharcoalium);
                        ITEMS.add(nuggetCharcoalium);
                        ITEMS.add(dustCharcoalium);

                        if (OreInAMillionConfig.isCraftingEnabled) {
                            if (OreInAMillionConfig.isCharcoaliumCraftingEnabled) {
                                ITEMS.add(gearCharcoalium);
                                ITEMS.add(plateCharcoalium);
                                ITEMS.add(rodCharcoalium);
                                ITEMS.add(tinydustCharcoalium);
                            }
                        }
                    }
                }
                //coal
                if (OreInAMillionConfig.isCoalEnabled) {
                    ITEMS.add(nuggetCoal);
                    ITEMS.add(dustCoal);

                    if (OreInAMillionConfig.isCraftingEnabled) {
                        if (OreInAMillionConfig.isCoalCraftingEnabled) {
                            ITEMS.add(gearCoal);
                            ITEMS.add(plateCoal);
                            ITEMS.add(rodCoal);
                            ITEMS.add(tinydustCoal);
                        }
                    }
                    if (OreInAMillionConfig.isCoaliumEnabled) {
                        ITEMS.add(ingotCoalium);
                        ITEMS.add(nuggetCoalium);
                        ITEMS.add(dustCoalium);

                        if (OreInAMillionConfig.isCraftingEnabled) {
                            if (OreInAMillionConfig.isCoaliumCraftingEnabled) {
                                ITEMS.add(gearCoalium);
                                ITEMS.add(plateCoalium);
                                ITEMS.add(rodCoalium);
                                ITEMS.add(tinydustCoalium);
                            }
                        }
                    }
                }
                //diamond
                if (OreInAMillionConfig.isDiamondEnabled) {
                    ITEMS.add(nuggetDiamond);
                    ITEMS.add(dustDiamond);

                    if (OreInAMillionConfig.isCraftingEnabled) {
                        if (OreInAMillionConfig.isDiamondCraftingEnabled) {
                            ITEMS.add(gearDiamond);
                            ITEMS.add(plateDiamond);
                            ITEMS.add(rodDiamond);
                            ITEMS.add(tinydustDiamond);
                        }
                    }
                }
                //emerald
                if (OreInAMillionConfig.isEmeraldEnabled) {
                    ITEMS.add(nuggetEmerald);
                    ITEMS.add(dustEmerald);

                    if (OreInAMillionConfig.isCraftingEnabled) {
                        if (OreInAMillionConfig.isEmeraldCraftingEnabled) {
                            ITEMS.add(gearEmerald);
                            ITEMS.add(plateEmerald);
                            ITEMS.add(rodEmerald);
                            ITEMS.add(tinydustEmerald);
                        }
                    }
                }
                //gold
                if (OreInAMillionConfig.isGoldEnabled) {
                    ITEMS.add(dustGold);

                    if (OreInAMillionConfig.isCraftingEnabled) {
                        if (OreInAMillionConfig.isGoldCraftingEnabled) {
                            ITEMS.add(gearGold);
                            ITEMS.add(plateGold);
                            ITEMS.add(rodGold);
                            ITEMS.add(tinydustGold);
                        }
                    }
                }
                //iron
                if (OreInAMillionConfig.isIronEnabled) {
                    ITEMS.add(dustIron);

                    if (OreInAMillionConfig.isCraftingEnabled) {
                        if (OreInAMillionConfig.isIronCraftingEnabled) {
                            ITEMS.add(gearIron);
                            ITEMS.add(plateIron);
                            ITEMS.add(rodIron);
                            ITEMS.add(tinydustIron);
                        }
                    }
                }
                //lapis
                if (OreInAMillionConfig.isLapisEnabled) {
                    ITEMS.add(nuggetLapis);
                    ITEMS.add(dustLapis);

                    if (OreInAMillionConfig.isCraftingEnabled) {
                        if (OreInAMillionConfig.isLapisCraftingEnabled) {
                            ITEMS.add(gearLapis);
                            ITEMS.add(plateLapis);
                            ITEMS.add(rodLapis);
                            ITEMS.add(tinydustLapis);
                        }
                    }
                    if (OreInAMillionConfig.isLapiteEnabled) {
                        ITEMS.add(ingotLapite);
                        ITEMS.add(nuggetLapite);
                        ITEMS.add(dustLapite);

                        if (OreInAMillionConfig.isCraftingEnabled) {
                            if (OreInAMillionConfig.isLapiteCraftingEnabled) {
                                ITEMS.add(gearLapite);
                                ITEMS.add(plateLapite);
                                ITEMS.add(rodLapite);
                                ITEMS.add(tinydustLapite);
                            }
                        }
                    }
                }
                //quartz
                if (OreInAMillionConfig.isQuartzEnabled) {
                    ITEMS.add(nuggetQuartz);
                    ITEMS.add(dustQuartz);

                    if (OreInAMillionConfig.isCraftingEnabled) {
                        if (OreInAMillionConfig.isQuartzCraftingEnabled) {
                            ITEMS.add(gearQuartz);
                            ITEMS.add(plateQuartz);
                            ITEMS.add(rodQuartz);
                            ITEMS.add(tinydustQuartz);
                        }
                    }
                    if (OreInAMillionConfig.isQuartziumEnabled) {
                        ITEMS.add(ingotQuartzium);
                        ITEMS.add(nuggetQuartzium);
                        ITEMS.add(dustQuartzium);

                        if (OreInAMillionConfig.isCraftingEnabled) {
                            if (OreInAMillionConfig.isQuartziumCraftingEnabled) {
                                ITEMS.add(gearQuartzium);
                                ITEMS.add(plateQuartzium);
                                ITEMS.add(rodQuartzium);
                                ITEMS.add(tinydustQuartzium);
                            }
                        }
                    }
                }
            }
            if (OreInAMillionConfig.isSillyStuffEnabled){
                ITEMS.add(weezerWeezer);
            }
        }

        ITEMS.add(creativeIcon1);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){
        ModItems.init();
        for (Item item : ITEMS) {
            event.getRegistry().register(item);
        }
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event){
        ModItems.init();
        for (Item item : ITEMS) {
            registerRender(item);
        }
    }

    private static void registerRender(Item item)
    {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Objects.requireNonNull(item.getRegistryName()), "inventory"));
    }

    public static void initOreDict() {
        ModItems.init();
        for (Item item : ITEMS) {
            registerOreDictNames(item);
        }
    }

    public static void registerOreDictNames(Item item) {
        ResourceLocation registryName = item.getRegistryName();
        if (registryName != null) {
            List<String> oreDictNames = getOreDictNames(registryName);
            for (String oreDictName : oreDictNames) {
                OreDictionary.registerOre(oreDictName, item);
            }
        } else {
            System.err.println("Item " + item + " does not have a valid registry name!");
        }
    }

    private static List<String> getOreDictNames(ResourceLocation registryName) {
        List<String> oreDictAdd = new ArrayList<>();

        if (registryName == null) {
            return oreDictAdd;
        }

        String path = registryName.getResourcePath();
        String[] parts = path.split("_");
        if (parts.length < 2) {
            return oreDictAdd;
        }

        String itemName = capitalize(parts[0]);
        String itemType = parts[1];

        switch (itemType) {
            case "ingot":
                oreDictAdd.add("ingot" + itemName);
                oreDictAdd.add(itemName);
                oreDictAdd.add("ingot");
                oreDictAdd.add("oreIngot");
                break;
            case "gem":
                oreDictAdd.add("gem" + itemName);
                oreDictAdd.add(itemName);
                oreDictAdd.add("gem");
                oreDictAdd.add("oreGem");
                break;
            case "element":
                oreDictAdd.add("element" + itemName);
                oreDictAdd.add(itemName);
                oreDictAdd.add("element");
                oreDictAdd.add("oreElement");
                break;
            case "nugget":
                oreDictAdd.add("nugget" + itemName);
                oreDictAdd.add("nugget");
                oreDictAdd.add("oreNugget");
                break;
            case "dust":
                oreDictAdd.add("dust" + itemName);
                oreDictAdd.add("dust");
                oreDictAdd.add("oreDust");
                break;
            case "gear":
                oreDictAdd.add("gear" + itemName);
                oreDictAdd.add("gear");
                oreDictAdd.add("oreGear");
                break;
            case "plate":
                oreDictAdd.add("plate" + itemName);
                oreDictAdd.add("plate");
                oreDictAdd.add("orePlate");
                break;
            case "rod":
                oreDictAdd.add("rod" + itemName);
                oreDictAdd.add("rod");
                oreDictAdd.add("oreRod");
                break;
            case "tiny":
                oreDictAdd.add("dustTiny" + itemName);
                oreDictAdd.add("dustTiny");
                oreDictAdd.add("oreDustTiny");
                oreDictAdd.add("tinyDust" + itemName);
                oreDictAdd.add("tinyDust");
                oreDictAdd.add("oreTinyDust");
                oreDictAdd.add("dustSmall" + itemName);
                oreDictAdd.add("dustSmall");
                oreDictAdd.add("oreDustSmall");
                oreDictAdd.add("smallDust" + itemName);
                oreDictAdd.add("smallDust");
                oreDictAdd.add("oreSmallDust");
                break;
            default:
                System.err.println("Unknown item type: " + itemType);
        }
        return oreDictAdd;
    }

    private static String capitalize(String string) {
        if (string == null || string.isEmpty()) {
            return string;
        }
        return string.substring(0, 1).toUpperCase() + string.substring(1);
    }

}