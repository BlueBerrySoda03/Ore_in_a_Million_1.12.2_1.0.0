package com.blueberrysoda.oreinamillion.init;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import com.blueberrysoda.oreinamillion.config.*;
import com.blueberrysoda.oreinamillion.items.armor.ItemArmorBase;
import com.blueberrysoda.oreinamillion.items.base.ItemBase;
import com.blueberrysoda.oreinamillion.items.materials.MaterialArmor;
import com.blueberrysoda.oreinamillion.items.materials.MaterialTool;
import com.blueberrysoda.oreinamillion.items.misc.ItemWeezer;
import com.blueberrysoda.oreinamillion.items.tools.basetools.*;
import com.blueberrysoda.oreinamillion.items.tools.customtools.ItemPickaxeModular;
import com.blueberrysoda.oreinamillion.util.enumerations.ToolMaterials;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.oredict.OreDictionary;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Mod.EventBusSubscriber
public class ModItems {

    private static final CreativeTabs Main = OreInAMillion.CREATIVE_TAB_MAIN;
    private static final CreativeTabs Mineral = OreInAMillion.CREATIVE_TAB_MINERAL;
    private static final CreativeTabs Crafting = OreInAMillion.CREATIVE_TAB_CRAFTING;
    private static final CreativeTabs Tool = OreInAMillion.CREATIVE_TAB_TOOL;
    private static final CreativeTabs Armor = OreInAMillion.CREATIVE_TAB_ARMOR;
    private static final CreativeTabs None = null;

    public static final List<Item> ITEMS = new ArrayList<>();

    //public static Item name = new ItemBase("reg_name", c-tab, tooltip);

    //=========
    //minerals
    //=========

    //---------
    //ingots
    //---------

    //adamantine
    //base
    public static Item ingotAdamantine = new ItemBase("adamantine_ingot", Mineral, false);
    public static Item nuggetAdamantine = new ItemBase("adamantine_nugget", Mineral, false);
    public static Item dustAdamantine = new ItemBase("adamantine_dust", Mineral, false);
    //crafting
    public static Item gearAdamantine = new ItemBase("adamantine_gear", Crafting, false);
    public static Item plateAdamantine = new ItemBase("adamantine_plate", Crafting, false);
    public static Item rodAdamantine = new ItemBase("adamantine_rod", Crafting, false);
    public static Item tinydustAdamantine = new ItemBase("adamantine_tiny", Crafting, false);
    //tools
    public static Item swordAdamantine = new ItemToolSword("adamantine_sword", MaterialTool.toolAdamantine, Tool, false);
    public static Item pickaxeAdamantine = new ItemToolPickaxe("adamantine_pickaxe", MaterialTool.toolAdamantine, Tool, false);
    public static Item axeAdamantine = new ItemToolAxe("adamantine_axe", MaterialTool.toolAdamantine, Tool, false);
    public static Item shovelAdamantine = new ItemToolShovel("adamantine_shovel", MaterialTool.toolAdamantine, Tool, false);
    public static Item hoeAdamantine = new ItemToolHoe("adamantine_hoe", MaterialTool.toolAdamantine, Tool, false);
    public static Item crusherAdamantine = new ItemToolCrusher("adamantine_crusher", MaterialTool.toolAdamantine, Tool, false);
    //armor
    public static Item helmetAdamantine = new ItemArmorBase("adamantine_helmet", MaterialArmor.armorAdamantine, 1, EntityEquipmentSlot.HEAD, Armor, false);
    public static Item chestplateAdamantine = new ItemArmorBase("adamantine_chestplate", MaterialArmor.armorAdamantine, 1, EntityEquipmentSlot.CHEST, Armor, false);
    public static Item leggingsAdamantine = new ItemArmorBase("adamantine_leggings", MaterialArmor.armorAdamantine, 2, EntityEquipmentSlot.LEGS, Armor, false);
    public static Item bootsAdamantine = new ItemArmorBase("adamantine_boots", MaterialArmor.armorAdamantine, 1, EntityEquipmentSlot.FEET, Armor, false);

    //aluminum
    //base
    public static Item ingotAluminum = new ItemBase("aluminum_ingot", Mineral, false);
    public static Item nuggetAluminum = new ItemBase("aluminum_nugget", Mineral, false);
    public static Item dustAluminum = new ItemBase("aluminum_dust", Mineral, false);
    //crafting
    public static Item gearAluminum = new ItemBase("aluminum_gear", Crafting, false);
    public static Item plateAluminum = new ItemBase("aluminum_plate", Crafting, false);
    public static Item rodAluminum = new ItemBase("aluminum_rod", Crafting, false);
    public static Item tinydustAluminum = new ItemBase("aluminum_tiny", Crafting, false);
    //tools
    public static Item swordAluminum = new ItemToolSword("aluminum_sword", MaterialTool.toolAluminum, Tool, false);
    public static Item pickaxeAluminum = new ItemToolPickaxe("aluminum_pickaxe", MaterialTool.toolAluminum, Tool, false);
    public static Item axeAluminum = new ItemToolAxe("aluminum_axe", MaterialTool.toolAluminum, Tool, false);
    public static Item shovelAluminum = new ItemToolShovel("aluminum_shovel", MaterialTool.toolAluminum, Tool, false);
    public static Item hoeAluminum = new ItemToolHoe("aluminum_hoe", MaterialTool.toolAluminum, Tool, false);
    public static Item crusherAluminum = new ItemToolCrusher("aluminum_crusher", MaterialTool.toolAluminum, Tool, false);
    //armor
    public static Item helmetAluminum = new ItemArmorBase("aluminum_helmet", MaterialArmor.armorAluminum, 1, EntityEquipmentSlot.HEAD, Armor, false);
    public static Item chestplateAluminum = new ItemArmorBase("aluminum_chestplate", MaterialArmor.armorAluminum, 1, EntityEquipmentSlot.CHEST, Armor, false);
    public static Item leggingsAluminum = new ItemArmorBase("aluminum_leggings", MaterialArmor.armorAluminum, 2, EntityEquipmentSlot.LEGS, Armor, false);
    public static Item bootsAluminum = new ItemArmorBase("aluminum_boots", MaterialArmor.armorAluminum, 1, EntityEquipmentSlot.FEET, Armor, false);

    //ardite
    //base
    public static Item ingotArdite = new ItemBase("ardite_ingot", Mineral, false);
    public static Item nuggetArdite = new ItemBase("ardite_nugget", Mineral, false);
    public static Item dustArdite = new ItemBase("ardite_dust", Mineral, false);
    //crafting
    public static Item gearArdite = new ItemBase("ardite_gear", Crafting, false);
    public static Item plateArdite = new ItemBase("ardite_plate", Crafting, false);
    public static Item rodArdite = new ItemBase("ardite_rod", Crafting, false);
    public static Item tinydustArdite = new ItemBase("ardite_tiny", Crafting, false);
    //tools
    public static Item swordArdite = new ItemToolSword("ardite_sword", MaterialTool.toolArdite, Tool, false);
    public static Item pickaxeArdite = new ItemToolPickaxe("ardite_pickaxe", MaterialTool.toolArdite, Tool, false);
    public static Item axeArdite = new ItemToolAxe("ardite_axe", MaterialTool.toolArdite, Tool, false);
    public static Item shovelArdite = new ItemToolShovel("ardite_shovel", MaterialTool.toolArdite, Tool, false);
    public static Item hoeArdite = new ItemToolHoe("ardite_hoe", MaterialTool.toolArdite, Tool, false);
    public static Item crusherArdite = new ItemToolCrusher("ardite_crusher", MaterialTool.toolArdite, Tool, false);
    //armor
    public static Item helmetArdite = new ItemArmorBase("ardite_helmet", MaterialArmor.armorArdite, 1, EntityEquipmentSlot.HEAD, Armor, false);
    public static Item chestplateArdite = new ItemArmorBase("ardite_chestplate", MaterialArmor.armorArdite, 1, EntityEquipmentSlot.CHEST, Armor, false);
    public static Item leggingsArdite = new ItemArmorBase("ardite_leggings", MaterialArmor.armorArdite, 2, EntityEquipmentSlot.LEGS, Armor, false);
    public static Item bootsArdite = new ItemArmorBase("ardite_boots", MaterialArmor.armorArdite, 1, EntityEquipmentSlot.FEET, Armor, false);

    //chrome
    //base
    public static Item ingotChrome = new ItemBase("chrome_ingot", Mineral, false);
    public static Item nuggetChrome = new ItemBase("chrome_nugget", Mineral, false);
    public static Item dustChrome = new ItemBase("chrome_dust", Mineral, false);
    //crafting
    public static Item gearChrome = new ItemBase("chrome_gear", Crafting, false);
    public static Item plateChrome = new ItemBase("chrome_plate", Crafting, false);
    public static Item rodChrome = new ItemBase("chrome_rod", Crafting, false);
    public static Item tinydustChrome = new ItemBase("chrome_tiny", Crafting, false);
    //tools
    public static Item swordChrome = new ItemToolSword("chrome_sword", MaterialTool.toolChrome, Tool, false);
    public static Item pickaxeChrome = new ItemToolPickaxe("chrome_pickaxe", MaterialTool.toolChrome, Tool, false);
    public static Item axeChrome = new ItemToolAxe("chrome_axe", MaterialTool.toolChrome, Tool, false);
    public static Item shovelChrome = new ItemToolShovel("chrome_shovel", MaterialTool.toolChrome, Tool, false);
    public static Item hoeChrome = new ItemToolHoe("chrome_hoe", MaterialTool.toolChrome, Tool, false);
    public static Item crusherChrome = new ItemToolCrusher("chrome_crusher", MaterialTool.toolChrome, Tool, false);
    //armor
    public static Item helmetChrome = new ItemArmorBase("chrome_helmet", MaterialArmor.armorChrome, 1, EntityEquipmentSlot.HEAD, Armor, false);
    public static Item chestplateChrome = new ItemArmorBase("chrome_chestplate", MaterialArmor.armorChrome, 1, EntityEquipmentSlot.CHEST, Armor, false);
    public static Item leggingsChrome = new ItemArmorBase("chrome_leggings", MaterialArmor.armorChrome, 2, EntityEquipmentSlot.LEGS, Armor, false);
    public static Item bootsChrome = new ItemArmorBase("chrome_boots", MaterialArmor.armorChrome, 1, EntityEquipmentSlot.FEET, Armor, false);

    //cobalt
    //base
    public static Item ingotCobalt = new ItemBase("cobalt_ingot", Mineral, false);
    public static Item nuggetCobalt = new ItemBase("cobalt_nugget", Mineral, false);
    public static Item dustCobalt = new ItemBase("cobalt_dust", Mineral, false);
    //crafting
    public static Item gearCobalt = new ItemBase("cobalt_gear", Crafting, false);
    public static Item plateCobalt = new ItemBase("cobalt_plate", Crafting, false);
    public static Item rodCobalt = new ItemBase("cobalt_rod", Crafting, false);
    public static Item tinydustCobalt = new ItemBase("cobalt_tiny", Crafting, false);
    //tools
    public static Item swordCobalt = new ItemToolSword("cobalt_sword", MaterialTool.toolCobalt, Tool, false);
    public static Item pickaxeCobalt = new ItemToolPickaxe("cobalt_pickaxe", MaterialTool.toolCobalt, Tool, false);
    public static Item axeCobalt = new ItemToolAxe("cobalt_axe", MaterialTool.toolCobalt, Tool, false);
    public static Item shovelCobalt = new ItemToolShovel("cobalt_shovel", MaterialTool.toolCobalt, Tool, false);
    public static Item hoeCobalt = new ItemToolHoe("cobalt_hoe", MaterialTool.toolCobalt, Tool, false);
    public static Item crusherCobalt = new ItemToolCrusher("cobalt_crusher", MaterialTool.toolCobalt, Tool, false);
    //armor
    public static Item helmetCobalt = new ItemArmorBase("cobalt_helmet", MaterialArmor.armorCobalt, 1, EntityEquipmentSlot.HEAD, Armor, false);
    public static Item chestplateCobalt = new ItemArmorBase("cobalt_chestplate", MaterialArmor.armorCobalt, 1, EntityEquipmentSlot.CHEST, Armor, false);
    public static Item leggingsCobalt = new ItemArmorBase("cobalt_leggings", MaterialArmor.armorCobalt, 2, EntityEquipmentSlot.LEGS, Armor, false);
    public static Item bootsCobalt = new ItemArmorBase("cobalt_boots", MaterialArmor.armorCobalt, 1, EntityEquipmentSlot.FEET, Armor, false);

    //copper
    //base
    public static Item ingotCopper = new ItemBase("copper_ingot", Mineral, false);
    public static Item nuggetCopper = new ItemBase("copper_nugget", Mineral, false);
    public static Item dustCopper = new ItemBase("copper_dust", Mineral, false);
    //crafting
    public static Item gearCopper = new ItemBase("copper_gear", Crafting, false);
    public static Item plateCopper = new ItemBase("copper_plate", Crafting, false);
    public static Item rodCopper = new ItemBase("copper_rod", Crafting, false);
    public static Item tinydustCopper = new ItemBase("copper_tiny", Crafting, false);
    //tools
    public static Item swordCopper = new ItemToolSword("copper_sword", MaterialTool.toolCopper, Tool, false);
    public static Item pickaxeCopper = new ItemToolPickaxe("copper_pickaxe", MaterialTool.toolCopper, Tool, false);
    public static Item axeCopper = new ItemToolAxe("copper_axe", MaterialTool.toolCopper, Tool, false);
    public static Item shovelCopper = new ItemToolShovel("copper_shovel", MaterialTool.toolCopper, Tool, false);
    public static Item hoeCopper = new ItemToolHoe("copper_hoe", MaterialTool.toolCopper, Tool, false);
    public static Item crusherCopper = new ItemToolCrusher("copper_crusher", MaterialTool.toolCopper, Tool, false);
    //armor
    public static Item helmetCopper = new ItemArmorBase("copper_helmet", MaterialArmor.armorCopper, 1, EntityEquipmentSlot.HEAD, Armor, true);
    public static Item chestplateCopper = new ItemArmorBase("copper_chestplate", MaterialArmor.armorCopper, 1, EntityEquipmentSlot.CHEST, Armor, true);
    public static Item leggingsCopper = new ItemArmorBase("copper_leggings", MaterialArmor.armorCopper, 2, EntityEquipmentSlot.LEGS, Armor, true);
    public static Item bootsCopper = new ItemArmorBase("copper_boots", MaterialArmor.armorCopper, 1, EntityEquipmentSlot.FEET, Armor, true);

    //ender
    //base
    public static Item ingotEnder = new ItemBase("ender_ingot", Mineral, false);
    public static Item nuggetEnder = new ItemBase("ender_nugget", Mineral, false);
    public static Item dustEnder = new ItemBase("ender_dust", Mineral, false);
    //crafting
    public static Item gearEnder = new ItemBase("ender_gear", Crafting, false);
    public static Item plateEnder = new ItemBase("ender_plate", Crafting, false);
    public static Item rodEnder = new ItemBase("ender_rod", Crafting, false);
    public static Item tinydustEnder = new ItemBase("ender_tiny", Crafting, false);
    //tools
    public static Item swordEnder = new ItemToolSword("ender_sword", MaterialTool.toolEnder, Tool, false);
    public static Item pickaxeEnder = new ItemToolPickaxe("ender_pickaxe", MaterialTool.toolEnder, Tool, false);
    public static Item axeEnder = new ItemToolAxe("ender_axe", MaterialTool.toolEnder, Tool, false);
    public static Item shovelEnder = new ItemToolShovel("ender_shovel", MaterialTool.toolEnder, Tool, false);
    public static Item hoeEnder = new ItemToolHoe("ender_hoe", MaterialTool.toolEnder, Tool, false);
    public static Item crusherEnder = new ItemToolCrusher("ender_crusher", MaterialTool.toolEnder, Tool, false);
    //armor
    public static Item helmetEnder = new ItemArmorBase("ender_helmet", MaterialArmor.armorEnder, 1, EntityEquipmentSlot.HEAD, Armor, false);
    public static Item chestplateEnder = new ItemArmorBase("ender_chestplate", MaterialArmor.armorEnder, 1, EntityEquipmentSlot.CHEST, Armor, false);
    public static Item leggingsEnder = new ItemArmorBase("ender_leggings", MaterialArmor.armorEnder, 2, EntityEquipmentSlot.LEGS, Armor, false);
    public static Item bootsEnder = new ItemArmorBase("ender_boots", MaterialArmor.armorEnder, 1, EntityEquipmentSlot.FEET, Armor, false);

    //iridium
    //base
    public static Item ingotIridium = new ItemBase("iridium_ingot", Mineral, false);
    public static Item nuggetIridium = new ItemBase("iridium_nugget", Mineral, false);
    public static Item dustIridium = new ItemBase("iridium_dust", Mineral, false);
    //crafting
    public static Item gearIridium = new ItemBase("iridium_gear", Crafting, false);
    public static Item plateIridium = new ItemBase("iridium_plate", Crafting, false);
    public static Item rodIridium = new ItemBase("iridium_rod", Crafting, false);
    public static Item tinydustIridium = new ItemBase("iridium_tiny", Crafting, false);
    //tools
    public static Item swordIridium = new ItemToolSword("iridium_sword", MaterialTool.toolIridium, Tool, false);
    public static Item pickaxeIridium = new ItemToolPickaxe("iridium_pickaxe", MaterialTool.toolIridium, Tool, false);
    public static Item axeIridium = new ItemToolAxe("iridium_axe", MaterialTool.toolIridium, Tool, false);
    public static Item shovelIridium = new ItemToolShovel("iridium_shovel", MaterialTool.toolIridium, Tool, false);
    public static Item hoeIridium = new ItemToolHoe("iridium_hoe", MaterialTool.toolIridium, Tool, false);
    public static Item crusherIridium = new ItemToolCrusher("iridium_crusher", MaterialTool.toolIridium, Tool, false);
    //armor
    public static Item helmetIridium = new ItemArmorBase("iridium_helmet", MaterialArmor.armorIridium, 1, EntityEquipmentSlot.HEAD, Armor, false);
    public static Item chestplateIridium = new ItemArmorBase("iridium_chestplate", MaterialArmor.armorIridium, 1, EntityEquipmentSlot.CHEST, Armor, false);
    public static Item leggingsIridium = new ItemArmorBase("iridium_leggings", MaterialArmor.armorIridium, 2, EntityEquipmentSlot.LEGS, Armor, false);
    public static Item bootsIridium = new ItemArmorBase("iridium_boots", MaterialArmor.armorIridium, 1, EntityEquipmentSlot.FEET, Armor, false);

    //lead
    //base
    public static Item ingotLead = new ItemBase("lead_ingot", Mineral, false);
    public static Item nuggetLead = new ItemBase("lead_nugget", Mineral, false);
    public static Item dustLead = new ItemBase("lead_dust", Mineral, false);
    //crafting
    public static Item gearLead = new ItemBase("lead_gear", Crafting, false);
    public static Item plateLead = new ItemBase("lead_plate", Crafting, false);
    public static Item rodLead = new ItemBase("lead_rod", Crafting, false);
    public static Item tinydustLead = new ItemBase("lead_tiny", Crafting, false);
    //tools
    public static Item swordLead = new ItemToolSword("lead_sword", MaterialTool.toolLead, Tool, false);
    public static Item pickaxeLead = new ItemToolPickaxe("lead_pickaxe", MaterialTool.toolLead, Tool, false);
    public static Item axeLead = new ItemToolAxe("lead_axe", MaterialTool.toolLead, Tool, false);
    public static Item shovelLead = new ItemToolShovel("lead_shovel", MaterialTool.toolLead, Tool, false);
    public static Item hoeLead = new ItemToolHoe("lead_hoe", MaterialTool.toolLead, Tool, false);
    public static Item crusherLead = new ItemToolCrusher("lead_crusher", MaterialTool.toolLead, Tool, false);
    //armor
    public static Item helmetLead = new ItemArmorBase("lead_helmet", MaterialArmor.armorLead, 1, EntityEquipmentSlot.HEAD, Armor, false);
    public static Item chestplateLead = new ItemArmorBase("lead_chestplate", MaterialArmor.armorLead, 1, EntityEquipmentSlot.CHEST, Armor, false);
    public static Item leggingsLead = new ItemArmorBase("lead_leggings", MaterialArmor.armorLead, 2, EntityEquipmentSlot.LEGS, Armor, false);
    public static Item bootsLead = new ItemArmorBase("lead_boots", MaterialArmor.armorLead, 1, EntityEquipmentSlot.FEET, Armor, false);

    //mithril
    //base
    public static Item ingotMithril = new ItemBase("mithril_ingot", Mineral, false);
    public static Item nuggetMithril = new ItemBase("mithril_nugget", Mineral, false);
    public static Item dustMithril = new ItemBase("mithril_dust", Mineral, false);
    //crafting
    public static Item gearMithril = new ItemBase("mithril_gear", Crafting, false);
    public static Item plateMithril = new ItemBase("mithril_plate", Crafting, false);
    public static Item rodMithril = new ItemBase("mithril_rod", Crafting, false);
    public static Item tinydustMithril = new ItemBase("mithril_tiny", Crafting, false);
    //tools
    public static Item swordMithril = new ItemToolSword("mithril_sword", MaterialTool.toolMithril, Tool, false);
    public static Item pickaxeMithril = new ItemToolPickaxe("mithril_pickaxe", MaterialTool.toolMithril, Tool, false);
    public static Item axeMithril = new ItemToolAxe("mithril_axe", MaterialTool.toolMithril, Tool, false);
    public static Item shovelMithril = new ItemToolShovel("mithril_shovel", MaterialTool.toolMithril, Tool, false);
    public static Item hoeMithril = new ItemToolHoe("mithril_hoe", MaterialTool.toolMithril, Tool, false);
    public static Item crusherMithril = new ItemToolCrusher("mithril_crusher", MaterialTool.toolMithril, Tool, false);
    //armor
    public static Item helmetMithril = new ItemArmorBase("mithril_helmet", MaterialArmor.armorMithril, 1, EntityEquipmentSlot.HEAD, Armor, false);
    public static Item chestplateMithril = new ItemArmorBase("mithril_chestplate", MaterialArmor.armorMithril, 1, EntityEquipmentSlot.CHEST, Armor, false);
    public static Item leggingsMithril = new ItemArmorBase("mithril_leggings", MaterialArmor.armorMithril, 2, EntityEquipmentSlot.LEGS, Armor, false);
    public static Item bootsMithril = new ItemArmorBase("mithril_boots", MaterialArmor.armorMithril, 1, EntityEquipmentSlot.FEET, Armor, false);

    //nickel
    //base
    public static Item ingotNickel = new ItemBase("nickel_ingot", Mineral, false);
    public static Item nuggetNickel = new ItemBase("nickel_nugget", Mineral, false);
    public static Item dustNickel = new ItemBase("nickel_dust", Mineral, false);
    //crafting
    public static Item gearNickel = new ItemBase("nickel_gear", Crafting, false);
    public static Item plateNickel = new ItemBase("nickel_plate", Crafting, false);
    public static Item rodNickel = new ItemBase("nickel_rod", Crafting, false);
    public static Item tinydustNickel = new ItemBase("nickel_tiny", Crafting, false);
    //tools
    public static Item swordNickel = new ItemToolSword("nickel_sword", MaterialTool.toolNickel, Tool, false);
    public static Item pickaxeNickel = new ItemToolPickaxe("nickel_pickaxe", MaterialTool.toolNickel, Tool, false);
    public static Item axeNickel = new ItemToolAxe("nickel_axe", MaterialTool.toolNickel, Tool, false);
    public static Item shovelNickel = new ItemToolShovel("nickel_shovel", MaterialTool.toolNickel, Tool, false);
    public static Item hoeNickel = new ItemToolHoe("nickel_hoe", MaterialTool.toolNickel, Tool, false);
    public static Item crusherNickel = new ItemToolCrusher("nickel_crusher", MaterialTool.toolNickel, Tool, false);
    //armor
    public static Item helmetNickel = new ItemArmorBase("nickel_helmet", MaterialArmor.armorNickel, 1, EntityEquipmentSlot.HEAD, Armor, false);
    public static Item chestplateNickel = new ItemArmorBase("nickel_chestplate", MaterialArmor.armorNickel, 1, EntityEquipmentSlot.CHEST, Armor, false);
    public static Item leggingsNickel = new ItemArmorBase("nickel_leggings", MaterialArmor.armorNickel, 2, EntityEquipmentSlot.LEGS, Armor, false);
    public static Item bootsNickel = new ItemArmorBase("nickel_boots", MaterialArmor.armorNickel, 1, EntityEquipmentSlot.FEET, Armor, false);

    //osmium
    //base
    public static Item ingotOsmium = new ItemBase("osmium_ingot", Mineral, false);
    public static Item nuggetOsmium = new ItemBase("osmium_nugget", Mineral, false);
    public static Item dustOsmium = new ItemBase("osmium_dust", Mineral, false);
    //crafting
    public static Item gearOsmium = new ItemBase("osmium_gear", Crafting, false);
    public static Item plateOsmium = new ItemBase("osmium_plate", Crafting, false);
    public static Item rodOsmium = new ItemBase("osmium_rod", Crafting, false);
    public static Item tinydustOsmium = new ItemBase("osmium_tiny", Crafting, false);
    //tools
    public static Item swordOsmium = new ItemToolSword("osmium_sword", MaterialTool.toolOsmium, Tool, false);
    public static Item pickaxeOsmium = new ItemToolPickaxe("osmium_pickaxe", MaterialTool.toolOsmium, Tool, false);
    public static Item axeOsmium = new ItemToolAxe("osmium_axe", MaterialTool.toolOsmium, Tool, false);
    public static Item shovelOsmium = new ItemToolShovel("osmium_shovel", MaterialTool.toolOsmium, Tool, false);
    public static Item hoeOsmium = new ItemToolHoe("osmium_hoe", MaterialTool.toolOsmium, Tool, false);
    public static Item crusherOsmium = new ItemToolCrusher("osmium_crusher", MaterialTool.toolOsmium, Tool, false);
    //armor
    public static Item helmetOsmium = new ItemArmorBase("osmium_helmet", MaterialArmor.armorOsmium, 1, EntityEquipmentSlot.HEAD, Armor, false);
    public static Item chestplateOsmium = new ItemArmorBase("osmium_chestplate", MaterialArmor.armorOsmium, 1, EntityEquipmentSlot.CHEST, Armor, false);
    public static Item leggingsOsmium = new ItemArmorBase("osmium_leggings", MaterialArmor.armorOsmium, 2, EntityEquipmentSlot.LEGS, Armor, false);
    public static Item bootsOsmium = new ItemArmorBase("osmium_boots", MaterialArmor.armorOsmium, 1, EntityEquipmentSlot.FEET, Armor, false);

    //platinum
    //base
    public static Item ingotPlatinum = new ItemBase("platinum_ingot", Mineral, false);
    public static Item nuggetPlatinum = new ItemBase("platinum_nugget", Mineral, false);
    public static Item dustPlatinum = new ItemBase("platinum_dust", Mineral, false);
    //crafting
    public static Item gearPlatinum = new ItemBase("platinum_gear", Crafting, false);
    public static Item platePlatinum = new ItemBase("platinum_plate", Crafting, false);
    public static Item rodPlatinum = new ItemBase("platinum_rod", Crafting, false);
    public static Item tinydustPlatinum = new ItemBase("platinum_tiny", Crafting, false);
    //tools
    public static Item swordPlatinum = new ItemToolSword("platinum_sword", MaterialTool.toolPlatinum, Tool, false);
    public static Item pickaxePlatinum = new ItemToolPickaxe("platinum_pickaxe", MaterialTool.toolPlatinum, Tool, false);
    public static Item axePlatinum = new ItemToolAxe("platinum_axe", MaterialTool.toolPlatinum, Tool, false);
    public static Item shovelPlatinum = new ItemToolShovel("platinum_shovel", MaterialTool.toolPlatinum, Tool, false);
    public static Item hoePlatinum = new ItemToolHoe("platinum_hoe", MaterialTool.toolPlatinum, Tool, false);
    public static Item crusherPlatinum = new ItemToolCrusher("platinum_crusher", MaterialTool.toolPlatinum, Tool, false);
    //armor
    public static Item helmetPlatinum = new ItemArmorBase("platinum_helmet", MaterialArmor.armorPlatinum, 1, EntityEquipmentSlot.HEAD, Armor, false);
    public static Item chestplatePlatinum = new ItemArmorBase("platinum_chestplate", MaterialArmor.armorPlatinum, 1, EntityEquipmentSlot.CHEST, Armor, false);
    public static Item leggingsPlatinum = new ItemArmorBase("platinum_leggings", MaterialArmor.armorPlatinum, 2, EntityEquipmentSlot.LEGS, Armor, false);
    public static Item bootsPlatinum = new ItemArmorBase("platinum_boots", MaterialArmor.armorPlatinum, 1, EntityEquipmentSlot.FEET, Armor, false);

    //silver
    //base
    public static Item ingotSilver = new ItemBase("silver_ingot", Mineral, false);
    public static Item nuggetSilver = new ItemBase("silver_nugget", Mineral, false);
    public static Item dustSilver = new ItemBase("silver_dust", Mineral, false);
    //crafting
    public static Item gearSilver = new ItemBase("silver_gear", Crafting, false);
    public static Item plateSilver = new ItemBase("silver_plate", Crafting, false);
    public static Item rodSilver = new ItemBase("silver_rod", Crafting, false);
    public static Item tinydustSilver = new ItemBase("silver_tiny", Crafting, false);
    //tools
    public static Item swordSilver = new ItemToolSword("silver_sword", MaterialTool.toolSilver, Tool, false);
    public static Item pickaxeSilver = new ItemToolPickaxe("silver_pickaxe", MaterialTool.toolSilver, Tool, false);
    public static Item axeSilver = new ItemToolAxe("silver_axe", MaterialTool.toolSilver, Tool, false);
    public static Item shovelSilver = new ItemToolShovel("silver_shovel", MaterialTool.toolSilver, Tool, false);
    public static Item hoeSilver = new ItemToolHoe("silver_hoe", MaterialTool.toolSilver, Tool, false);
    public static Item crusherSilver = new ItemToolCrusher("silver_crusher", MaterialTool.toolSilver, Tool, false);
    //armor
    public static Item helmetSilver = new ItemArmorBase("silver_helmet", MaterialArmor.armorSilver, 1, EntityEquipmentSlot.HEAD, Armor, true);
    public static Item chestplateSilver = new ItemArmorBase("silver_chestplate", MaterialArmor.armorSilver, 1, EntityEquipmentSlot.CHEST, Armor, true);
    public static Item leggingsSilver = new ItemArmorBase("silver_leggings", MaterialArmor.armorSilver, 2, EntityEquipmentSlot.LEGS, Armor, true);
    public static Item bootsSilver = new ItemArmorBase("silver_boots", MaterialArmor.armorSilver, 1, EntityEquipmentSlot.FEET, Armor, true);

    //tin
    //base
    public static Item ingotTin = new ItemBase("tin_ingot", Mineral, false);
    public static Item nuggetTin = new ItemBase("tin_nugget", Mineral, false);
    public static Item dustTin = new ItemBase("tin_dust", Mineral, false);
    //crafting
    public static Item gearTin = new ItemBase("tin_gear", Crafting, false);
    public static Item plateTin = new ItemBase("tin_plate", Crafting, false);
    public static Item rodTin = new ItemBase("tin_rod", Crafting, false);
    public static Item tinydustTin = new ItemBase("tin_tiny", Crafting, false);
    //tools
    public static Item swordTin = new ItemToolSword("tin_sword", MaterialTool.toolTin, Tool, false);
    public static Item pickaxeTin = new ItemToolPickaxe("tin_pickaxe", MaterialTool.toolTin, Tool, false);
    public static Item axeTin = new ItemToolAxe("tin_axe", MaterialTool.toolTin, Tool, false);
    public static Item shovelTin = new ItemToolShovel("tin_shovel", MaterialTool.toolTin, Tool, false);
    public static Item hoeTin = new ItemToolHoe("tin_hoe", MaterialTool.toolTin, Tool, false);
    public static Item crusherTin = new ItemToolCrusher("tin_crusher", MaterialTool.toolTin, Tool, false);
    //armor
    public static Item helmetTin = new ItemArmorBase("tin_helmet", MaterialArmor.armorTin, 1, EntityEquipmentSlot.HEAD, Armor, false);
    public static Item chestplateTin = new ItemArmorBase("tin_chestplate", MaterialArmor.armorTin, 1, EntityEquipmentSlot.CHEST, Armor, false);
    public static Item leggingsTin = new ItemArmorBase("tin_leggings", MaterialArmor.armorTin, 2, EntityEquipmentSlot.LEGS, Armor, false);
    public static Item bootsTin = new ItemArmorBase("tin_boots", MaterialArmor.armorTin, 1, EntityEquipmentSlot.FEET, Armor, false);

    //titanium
    //base
    public static Item ingotTitanium = new ItemBase("titanium_ingot", Mineral, false);
    public static Item nuggetTitanium = new ItemBase("titanium_nugget", Mineral, false);
    public static Item dustTitanium = new ItemBase("titanium_dust", Mineral, false);
    //crafting
    public static Item gearTitanium = new ItemBase("titanium_gear", Crafting, false);
    public static Item plateTitanium = new ItemBase("titanium_plate", Crafting, false);
    public static Item rodTitanium = new ItemBase("titanium_rod", Crafting, false);
    public static Item tinydustTitanium = new ItemBase("titanium_tiny", Crafting, false);
    //tools
    public static Item swordTitanium = new ItemToolSword("titanium_sword", MaterialTool.toolTitanium, Tool, false);
    public static Item pickaxeTitanium = new ItemToolPickaxe("titanium_pickaxe", MaterialTool.toolTitanium, Tool, false);
    public static Item axeTitanium = new ItemToolAxe("titanium_axe", MaterialTool.toolTitanium, Tool, false);
    public static Item shovelTitanium = new ItemToolShovel("titanium_shovel", MaterialTool.toolTitanium, Tool, false);
    public static Item hoeTitanium = new ItemToolHoe("titanium_hoe", MaterialTool.toolTitanium, Tool, false);
    public static Item crusherTitanium = new ItemToolCrusher("titanium_crusher", MaterialTool.toolTitanium, Tool, false);
    //armor
    public static Item helmetTitanium = new ItemArmorBase("titanium_helmet", MaterialArmor.armorTitanium, 1, EntityEquipmentSlot.HEAD, Armor, false);
    public static Item chestplateTitanium = new ItemArmorBase("titanium_chestplate", MaterialArmor.armorTitanium, 1, EntityEquipmentSlot.CHEST, Armor, false);
    public static Item leggingsTitanium = new ItemArmorBase("titanium_leggings", MaterialArmor.armorTitanium, 2, EntityEquipmentSlot.LEGS, Armor, false);
    public static Item bootsTitanium = new ItemArmorBase("titanium_boots", MaterialArmor.armorTitanium, 1, EntityEquipmentSlot.FEET, Armor, false);

    //tungsten
    //base
    public static Item ingotTungsten = new ItemBase("tungsten_ingot", Mineral, false);
    public static Item nuggetTungsten = new ItemBase("tungsten_nugget", Mineral, false);
    public static Item dustTungsten = new ItemBase("tungsten_dust", Mineral, false);
    //crafting
    public static Item gearTungsten = new ItemBase("tungsten_gear", Crafting, false);
    public static Item plateTungsten = new ItemBase("tungsten_plate", Crafting, false);
    public static Item rodTungsten = new ItemBase("tungsten_rod", Crafting, false);
    public static Item tinydustTungsten = new ItemBase("tungsten_tiny", Crafting, false);
    //tools
    public static Item swordTungsten = new ItemToolSword("tungsten_sword", MaterialTool.toolTungsten, Tool, false);
    public static Item pickaxeTungsten = new ItemToolPickaxe("tungsten_pickaxe", MaterialTool.toolTungsten, Tool, false);
    public static Item axeTungsten = new ItemToolAxe("tungsten_axe", MaterialTool.toolTungsten, Tool, false);
    public static Item shovelTungsten = new ItemToolShovel("tungsten_shovel", MaterialTool.toolTungsten, Tool, false);
    public static Item hoeTungsten = new ItemToolHoe("tungsten_hoe", MaterialTool.toolTungsten, Tool, false);
    public static Item crusherTungsten = new ItemToolCrusher("tungsten_crusher", MaterialTool.toolTungsten, Tool, false);
    //armor
    public static Item helmetTungsten = new ItemArmorBase("tungsten_helmet", MaterialArmor.armorTungsten, 1, EntityEquipmentSlot.HEAD, Armor, false);
    public static Item chestplateTungsten = new ItemArmorBase("tungsten_chestplate", MaterialArmor.armorTungsten, 1, EntityEquipmentSlot.CHEST, Armor, false);
    public static Item leggingsTungsten = new ItemArmorBase("tungsten_leggings", MaterialArmor.armorTungsten, 2, EntityEquipmentSlot.LEGS, Armor, false);
    public static Item bootsTungsten = new ItemArmorBase("tungsten_boots", MaterialArmor.armorTungsten, 1, EntityEquipmentSlot.FEET, Armor, false);

    //uranium
    //base
    public static Item ingotUranium = new ItemBase("uranium_ingot", Mineral, false);
    public static Item nuggetUranium = new ItemBase("uranium_nugget", Mineral, false);
    public static Item dustUranium = new ItemBase("uranium_dust", Mineral, false);
    //crafting
    public static Item gearUranium = new ItemBase("uranium_gear", Crafting, false);
    public static Item plateUranium = new ItemBase("uranium_plate", Crafting, false);
    public static Item rodUranium = new ItemBase("uranium_rod", Crafting, false);
    public static Item tinydustUranium = new ItemBase("uranium_tiny", Crafting, false);
    //tools
    public static Item swordUranium = new ItemToolSword("uranium_sword", MaterialTool.toolUranium, Tool, false);
    public static Item pickaxeUranium = new ItemToolPickaxe("uranium_pickaxe", MaterialTool.toolUranium, Tool, false);
    public static Item axeUranium = new ItemToolAxe("uranium_axe", MaterialTool.toolUranium, Tool, false);
    public static Item shovelUranium = new ItemToolShovel("uranium_shovel", MaterialTool.toolUranium, Tool, false);
    public static Item hoeUranium = new ItemToolHoe("uranium_hoe", MaterialTool.toolUranium, Tool, false);
    public static Item crusherUranium = new ItemToolCrusher("uranium_crusher", MaterialTool.toolUranium, Tool, false);
    //armor
    public static Item helmetUranium = new ItemArmorBase("uranium_helmet", MaterialArmor.armorUranium, 1, EntityEquipmentSlot.HEAD, Armor, false);
    public static Item chestplateUranium = new ItemArmorBase("uranium_chestplate", MaterialArmor.armorUranium, 1, EntityEquipmentSlot.CHEST, Armor, false);
    public static Item leggingsUranium = new ItemArmorBase("uranium_leggings", MaterialArmor.armorUranium, 2, EntityEquipmentSlot.LEGS, Armor, false);
    public static Item bootsUranium = new ItemArmorBase("uranium_boots", MaterialArmor.armorUranium, 1, EntityEquipmentSlot.FEET, Armor, false);

    //zinc
    //base
    public static Item ingotZinc = new ItemBase("zinc_ingot", Mineral, false);
    public static Item nuggetZinc = new ItemBase("zinc_nugget", Mineral, false);
    public static Item dustZinc = new ItemBase("zinc_dust", Mineral, false);
    //crafting
    public static Item gearZinc = new ItemBase("zinc_gear", Crafting, false);
    public static Item plateZinc = new ItemBase("zinc_plate", Crafting, false);
    public static Item rodZinc = new ItemBase("zinc_rod", Crafting, false);
    public static Item tinydustZinc = new ItemBase("zinc_tiny", Crafting, false);
    //tools
    public static Item swordZinc = new ItemToolSword("zinc_sword", MaterialTool.toolZinc, Tool, false);
    public static Item pickaxeZinc = new ItemToolPickaxe("zinc_pickaxe", MaterialTool.toolZinc, Tool, false);
    public static Item axeZinc = new ItemToolAxe("zinc_axe", MaterialTool.toolZinc, Tool, false);
    public static Item shovelZinc = new ItemToolShovel("zinc_shovel", MaterialTool.toolZinc, Tool, false);
    public static Item hoeZinc = new ItemToolHoe("zinc_hoe", MaterialTool.toolZinc, Tool, false);
    public static Item crusherZinc = new ItemToolCrusher("zinc_crusher", MaterialTool.toolZinc, Tool, false);
    //armor
    public static Item helmetZinc = new ItemArmorBase("zinc_helmet", MaterialArmor.armorZinc, 1, EntityEquipmentSlot.HEAD, Armor, false);
    public static Item chestplateZinc = new ItemArmorBase("zinc_chestplate", MaterialArmor.armorZinc, 1, EntityEquipmentSlot.CHEST, Armor, false);
    public static Item leggingsZinc = new ItemArmorBase("zinc_leggings", MaterialArmor.armorZinc, 2, EntityEquipmentSlot.LEGS, Armor, false);
    public static Item bootsZinc = new ItemArmorBase("zinc_boots", MaterialArmor.armorZinc, 1, EntityEquipmentSlot.FEET, Armor, false);

    //----------
    //alloys
    //----------

    //brass
    //base
    public static Item ingotBrass = new ItemBase("brass_ingot", Mineral, false);
    public static Item nuggetBrass = new ItemBase("brass_nugget", Mineral, false);
    public static Item dustBrass = new ItemBase("brass_dust", Mineral, false);
    //crafting
    public static Item gearBrass = new ItemBase("brass_gear", Crafting, false);
    public static Item plateBrass = new ItemBase("brass_plate", Crafting, false);
    public static Item rodBrass = new ItemBase("brass_rod", Crafting, false);
    public static Item tinydustBrass = new ItemBase("brass_tiny", Crafting, false);
    //tools
    public static Item swordBrass = new ItemToolSword("brass_sword", MaterialTool.toolBrass, Tool, false);
    public static Item pickaxeBrass = new ItemToolPickaxe("brass_pickaxe", MaterialTool.toolBrass, Tool, false);
    public static Item axeBrass = new ItemToolAxe("brass_axe", MaterialTool.toolBrass, Tool, false);
    public static Item shovelBrass = new ItemToolShovel("brass_shovel", MaterialTool.toolBrass, Tool, false);
    public static Item hoeBrass = new ItemToolHoe("brass_hoe", MaterialTool.toolBrass, Tool, false);
    public static Item crusherBrass = new ItemToolCrusher("brass_crusher", MaterialTool.toolBrass, Tool, false);
    //armor
    public static Item helmetBrass = new ItemArmorBase("brass_helmet", MaterialArmor.armorBrass, 1, EntityEquipmentSlot.HEAD, Armor, false);
    public static Item chestplateBrass = new ItemArmorBase("brass_chestplate", MaterialArmor.armorBrass, 1, EntityEquipmentSlot.CHEST, Armor, false);
    public static Item leggingsBrass = new ItemArmorBase("brass_leggings", MaterialArmor.armorBrass, 2, EntityEquipmentSlot.LEGS, Armor, false);
    public static Item bootsBrass = new ItemArmorBase("brass_boots", MaterialArmor.armorBrass, 1, EntityEquipmentSlot.FEET, Armor, false);

    //bronze
    //base
    public static Item ingotBronze = new ItemBase("bronze_ingot", Mineral, false);
    public static Item nuggetBronze = new ItemBase("bronze_nugget", Mineral, false);
    public static Item dustBronze = new ItemBase("bronze_dust", Mineral, false);
    //crafting
    public static Item gearBronze = new ItemBase("bronze_gear", Crafting, false);
    public static Item plateBronze = new ItemBase("bronze_plate", Crafting, false);
    public static Item rodBronze = new ItemBase("bronze_rod", Crafting, false);
    public static Item tinydustBronze = new ItemBase("bronze_tiny", Crafting, false);
    //tools
    public static Item swordBronze = new ItemToolSword("bronze_sword", MaterialTool.toolBronze, Tool, false);
    public static Item pickaxeBronze = new ItemToolPickaxe("bronze_pickaxe", MaterialTool.toolBronze, Tool, false);
    public static Item axeBronze = new ItemToolAxe("bronze_axe", MaterialTool.toolBronze, Tool, false);
    public static Item shovelBronze = new ItemToolShovel("bronze_shovel", MaterialTool.toolBronze, Tool, false);
    public static Item hoeBronze = new ItemToolHoe("bronze_hoe", MaterialTool.toolBronze, Tool, false);
    public static Item crusherBronze = new ItemToolCrusher("bronze_crusher", MaterialTool.toolBronze, Tool, false);
    //armor
    public static Item helmetBronze = new ItemArmorBase("bronze_helmet", MaterialArmor.armorBronze, 1, EntityEquipmentSlot.HEAD, Armor, false);
    public static Item chestplateBronze = new ItemArmorBase("bronze_chestplate", MaterialArmor.armorBronze, 1, EntityEquipmentSlot.CHEST, Armor, false);
    public static Item leggingsBronze = new ItemArmorBase("bronze_leggings", MaterialArmor.armorBronze, 2, EntityEquipmentSlot.LEGS, Armor, false);
    public static Item bootsBronze = new ItemArmorBase("bronze_boots", MaterialArmor.armorBronze, 1, EntityEquipmentSlot.FEET, Armor, false);

    //constantan
    //base
    public static Item ingotConstantan = new ItemBase("constantan_ingot", Mineral, false);
    public static Item nuggetConstantan = new ItemBase("constantan_nugget", Mineral, false);
    public static Item dustConstantan = new ItemBase("constantan_dust", Mineral, false);
    //crafting
    public static Item gearConstantan = new ItemBase("constantan_gear", Crafting, false);
    public static Item plateConstantan = new ItemBase("constantan_plate", Crafting, false);
    public static Item rodConstantan = new ItemBase("constantan_rod", Crafting, false);
    public static Item tinydustConstantan = new ItemBase("constantan_tiny", Crafting, false);
    //tools
    public static Item swordConstantan = new ItemToolSword("constantan_sword", MaterialTool.toolConstantan, Tool, false);
    public static Item pickaxeConstantan = new ItemToolPickaxe("constantan_pickaxe", MaterialTool.toolConstantan, Tool, false);
    public static Item axeConstantan = new ItemToolAxe("constantan_axe", MaterialTool.toolConstantan, Tool, false);
    public static Item shovelConstantan = new ItemToolShovel("constantan_shovel", MaterialTool.toolConstantan, Tool, false);
    public static Item hoeConstantan = new ItemToolHoe("constantan_hoe", MaterialTool.toolConstantan, Tool, false);
    public static Item crusherConstantan = new ItemToolCrusher("constantan_crusher", MaterialTool.toolConstantan, Tool, false);
    //armor
    public static Item helmetConstantan = new ItemArmorBase("constantan_helmet", MaterialArmor.armorConstantan, 1, EntityEquipmentSlot.HEAD, Armor, false);
    public static Item chestplateConstantan = new ItemArmorBase("constantan_chestplate", MaterialArmor.armorConstantan, 1, EntityEquipmentSlot.CHEST, Armor, false);
    public static Item leggingsConstantan = new ItemArmorBase("constantan_leggings", MaterialArmor.armorConstantan, 2, EntityEquipmentSlot.LEGS, Armor, false);
    public static Item bootsConstantan = new ItemArmorBase("constantan_boots", MaterialArmor.armorConstantan, 1, EntityEquipmentSlot.FEET, Armor, false);

    //electrum
    //base
    public static Item ingotElectrum = new ItemBase("electrum_ingot", Mineral, false);
    public static Item nuggetElectrum = new ItemBase("electrum_nugget", Mineral, false);
    public static Item dustElectrum = new ItemBase("electrum_dust", Mineral, false);
    //crafting
    public static Item gearElectrum = new ItemBase("electrum_gear", Crafting, false);
    public static Item plateElectrum = new ItemBase("electrum_plate", Crafting, false);
    public static Item rodElectrum = new ItemBase("electrum_rod", Crafting, false);
    public static Item tinydustElectrum = new ItemBase("electrum_tiny", Crafting, false);
    //tools
    public static Item swordElectrum = new ItemToolSword("electrum_sword", MaterialTool.toolElectrum, Tool, false);
    public static Item pickaxeElectrum = new ItemToolPickaxe("electrum_pickaxe", MaterialTool.toolElectrum, Tool, false);
    public static Item axeElectrum = new ItemToolAxe("electrum_axe", MaterialTool.toolElectrum, Tool, false);
    public static Item shovelElectrum = new ItemToolShovel("electrum_shovel", MaterialTool.toolElectrum, Tool, false);
    public static Item hoeElectrum = new ItemToolHoe("electrum_hoe", MaterialTool.toolElectrum, Tool, false);
    public static Item crusherElectrum = new ItemToolCrusher("electrum_crusher", MaterialTool.toolElectrum, Tool, false);
    //armor
    public static Item helmetElectrum = new ItemArmorBase("electrum_helmet", MaterialArmor.armorElectrum, 1, EntityEquipmentSlot.HEAD, Armor, false);
    public static Item chestplateElectrum = new ItemArmorBase("electrum_chestplate", MaterialArmor.armorElectrum, 1, EntityEquipmentSlot.CHEST, Armor, false);
    public static Item leggingsElectrum = new ItemArmorBase("electrum_leggings", MaterialArmor.armorElectrum, 2, EntityEquipmentSlot.LEGS, Armor, false);
    public static Item bootsElectrum = new ItemArmorBase("electrum_boots", MaterialArmor.armorElectrum, 1, EntityEquipmentSlot.FEET, Armor, false);

    //enderium
    //base
    public static Item ingotEnderium = new ItemBase("enderium_ingot", Mineral, false);
    public static Item nuggetEnderium = new ItemBase("enderium_nugget", Mineral, false);
    public static Item dustEnderium = new ItemBase("enderium_dust", Mineral, false);
    //crafting
    public static Item gearEnderium = new ItemBase("enderium_gear", Crafting, false);
    public static Item plateEnderium = new ItemBase("enderium_plate", Crafting, false);
    public static Item rodEnderium = new ItemBase("enderium_rod", Crafting, false);
    public static Item tinydustEnderium = new ItemBase("enderium_tiny", Crafting, false);
    //tools
    public static Item swordEnderium = new ItemToolSword("enderium_sword", MaterialTool.toolEnderium, Tool, false);
    public static Item pickaxeEnderium = new ItemToolPickaxe("enderium_pickaxe", MaterialTool.toolEnderium, Tool, false);
    public static Item axeEnderium = new ItemToolAxe("enderium_axe", MaterialTool.toolEnderium, Tool, false);
    public static Item shovelEnderium = new ItemToolShovel("enderium_shovel", MaterialTool.toolEnderium, Tool, false);
    public static Item hoeEnderium = new ItemToolHoe("enderium_hoe", MaterialTool.toolEnderium, Tool, false);
    public static Item crusherEnderium = new ItemToolCrusher("enderium_crusher", MaterialTool.toolEnderium, Tool, false);
    //armor
    public static Item helmetEnderium = new ItemArmorBase("enderium_helmet", MaterialArmor.armorEnderium, 1, EntityEquipmentSlot.HEAD, Armor, false);
    public static Item chestplateEnderium = new ItemArmorBase("enderium_chestplate", MaterialArmor.armorEnderium, 1, EntityEquipmentSlot.CHEST, Armor, false);
    public static Item leggingsEnderium = new ItemArmorBase("enderium_leggings", MaterialArmor.armorEnderium, 2, EntityEquipmentSlot.LEGS, Armor, false);
    public static Item bootsEnderium = new ItemArmorBase("enderium_boots", MaterialArmor.armorEnderium, 1, EntityEquipmentSlot.FEET, Armor, false);

    //fairy
    //base
    public static Item ingotFairy = new ItemBase("fairy_ingot", Mineral, false);
    public static Item nuggetFairy = new ItemBase("fairy_nugget", Mineral, false);
    public static Item dustFairy = new ItemBase("fairy_dust", Mineral, false);
    //crafting
    public static Item gearFairy = new ItemBase("fairy_gear", Crafting, false);
    public static Item plateFairy = new ItemBase("fairy_plate", Crafting, false);
    public static Item rodFairy = new ItemBase("fairy_rod", Crafting, false);
    public static Item tinydustFairy = new ItemBase("fairy_tiny", Crafting, false);
    //tools
    public static Item swordFairy = new ItemToolSword("fairy_sword", MaterialTool.toolFairy, Tool, false);
    public static Item pickaxeFairy = new ItemToolPickaxe("fairy_pickaxe", MaterialTool.toolFairy, Tool, false);
    public static Item axeFairy = new ItemToolAxe("fairy_axe", MaterialTool.toolFairy, Tool, false);
    public static Item shovelFairy = new ItemToolShovel("fairy_shovel", MaterialTool.toolFairy, Tool, false);
    public static Item hoeFairy = new ItemToolHoe("fairy_hoe", MaterialTool.toolFairy, Tool, false);
    public static Item crusherFairy = new ItemToolCrusher("fairy_crusher", MaterialTool.toolFairy, Tool, false);
    //armor
    public static Item helmetFairy = new ItemArmorBase("fairy_helmet", MaterialArmor.armorFairy, 1, EntityEquipmentSlot.HEAD, Armor, false);
    public static Item chestplateFairy = new ItemArmorBase("fairy_chestplate", MaterialArmor.armorFairy, 1, EntityEquipmentSlot.CHEST, Armor, false);
    public static Item leggingsFairy = new ItemArmorBase("fairy_leggings", MaterialArmor.armorFairy, 2, EntityEquipmentSlot.LEGS, Armor, false);
    public static Item bootsFairy = new ItemArmorBase("fairy_boots", MaterialArmor.armorFairy, 1, EntityEquipmentSlot.FEET, Armor, false);

    //invar
    //base
    public static Item ingotInvar = new ItemBase("invar_ingot", Mineral, false);
    public static Item nuggetInvar = new ItemBase("invar_nugget", Mineral, false);
    public static Item dustInvar = new ItemBase("invar_dust", Mineral, false);
    //crafting
    public static Item gearInvar = new ItemBase("invar_gear", Crafting, false);
    public static Item plateInvar = new ItemBase("invar_plate", Crafting, false);
    public static Item rodInvar = new ItemBase("invar_rod", Crafting, false);
    public static Item tinydustInvar = new ItemBase("invar_tiny", Crafting, false);
    //tools
    public static Item swordInvar = new ItemToolSword("invar_sword", MaterialTool.toolInvar, Tool, false);
    public static Item pickaxeInvar = new ItemToolPickaxe("invar_pickaxe", MaterialTool.toolInvar, Tool, false);
    public static Item axeInvar = new ItemToolAxe("invar_axe", MaterialTool.toolInvar, Tool, false);
    public static Item shovelInvar = new ItemToolShovel("invar_shovel", MaterialTool.toolInvar, Tool, false);
    public static Item hoeInvar = new ItemToolHoe("invar_hoe", MaterialTool.toolInvar, Tool, false);
    public static Item crusherInvar = new ItemToolCrusher("invar_crusher", MaterialTool.toolInvar, Tool, false);
    //armor
    public static Item helmetInvar = new ItemArmorBase("invar_helmet", MaterialArmor.armorInvar, 1, EntityEquipmentSlot.HEAD, Armor, false);
    public static Item chestplateInvar = new ItemArmorBase("invar_chestplate", MaterialArmor.armorInvar, 1, EntityEquipmentSlot.CHEST, Armor, false);
    public static Item leggingsInvar = new ItemArmorBase("invar_leggings", MaterialArmor.armorInvar, 2, EntityEquipmentSlot.LEGS, Armor, false);
    public static Item bootsInvar = new ItemArmorBase("invar_boots", MaterialArmor.armorInvar, 1, EntityEquipmentSlot.FEET, Armor, false);

    //knightslime
    //base
    public static Item ingotKnightSlime = new ItemBase("knightslime_ingot", Mineral, true);
    public static Item nuggetKnightSlime = new ItemBase("knightslime_nugget", Mineral, false);
    public static Item dustKnightSlime = new ItemBase("knightslime_dust", Mineral, false);
    //crafting
    public static Item gearKnightSlime = new ItemBase("knightslime_gear", Crafting, false);
    public static Item plateKnightSlime = new ItemBase("knightslime_plate", Crafting, false);
    public static Item rodKnightSlime = new ItemBase("knightslime_rod", Crafting, false);
    public static Item tinydustKnightSlime = new ItemBase("knightslime_tiny", Crafting, false);
    //tools
    public static Item swordKnightSlime = new ItemToolSword("knightslime_sword", MaterialTool.toolKnightSlime, Tool, true);
    public static Item pickaxeKnightSlime = new ItemToolPickaxe("knightslime_pickaxe", MaterialTool.toolKnightSlime, Tool, true);
    public static Item axeKnightSlime = new ItemToolAxe("knightslime_axe", MaterialTool.toolKnightSlime, Tool, true);
    public static Item shovelKnightSlime = new ItemToolShovel("knightslime_shovel", MaterialTool.toolKnightSlime, Tool, true);
    public static Item hoeKnightSlime = new ItemToolHoe("knightslime_hoe", MaterialTool.toolKnightSlime, Tool, true);
    public static Item crusherKnightSlime = new ItemToolCrusher("knightslime_crusher", MaterialTool.toolKnightSlime, Tool, true);
    //armor
    public static Item helmetKnightSlime = new ItemArmorBase("knightslime_helmet", MaterialArmor.armorKnightSlime, 1, EntityEquipmentSlot.HEAD, Armor, false);
    public static Item chestplateKnightSlime = new ItemArmorBase("knightslime_chestplate", MaterialArmor.armorKnightSlime, 1, EntityEquipmentSlot.CHEST, Armor, false);
    public static Item leggingsKnightSlime = new ItemArmorBase("knightslime_leggings", MaterialArmor.armorKnightSlime, 2, EntityEquipmentSlot.LEGS, Armor, false);
    public static Item bootsKnightSlime = new ItemArmorBase("knightslime_boots", MaterialArmor.armorKnightSlime, 1, EntityEquipmentSlot.FEET, Armor, false);

    //lumium
    //base
    public static Item ingotLumium = new ItemBase("lumium_ingot", Mineral, false);
    public static Item nuggetLumium = new ItemBase("lumium_nugget", Mineral, false);
    public static Item dustLumium = new ItemBase("lumium_dust", Mineral, false);
    //crafting
    public static Item gearLumium = new ItemBase("lumium_gear", Crafting, false);
    public static Item plateLumium = new ItemBase("lumium_plate", Crafting, false);
    public static Item rodLumium = new ItemBase("lumium_rod", Crafting, false);
    public static Item tinydustLumium = new ItemBase("lumium_tiny", Crafting, false);
    //tools
    public static Item swordLumium = new ItemToolSword("lumium_sword", MaterialTool.toolLumium, Tool, false);
    public static Item pickaxeLumium = new ItemToolPickaxe("lumium_pickaxe", MaterialTool.toolLumium, Tool, false);
    public static Item axeLumium = new ItemToolAxe("lumium_axe", MaterialTool.toolLumium, Tool, false);
    public static Item shovelLumium = new ItemToolShovel("lumium_shovel", MaterialTool.toolLumium, Tool, false);
    public static Item hoeLumium = new ItemToolHoe("lumium_hoe", MaterialTool.toolLumium, Tool, false);
    public static Item crusherLumium = new ItemToolCrusher("lumium_crusher", MaterialTool.toolLumium, Tool, false);
    //armor
    public static Item helmetLumium = new ItemArmorBase("lumium_helmet", MaterialArmor.armorLumium, 1, EntityEquipmentSlot.HEAD, Armor, false);
    public static Item chestplateLumium = new ItemArmorBase("lumium_chestplate", MaterialArmor.armorLumium, 1, EntityEquipmentSlot.CHEST, Armor, false);
    public static Item leggingsLumium = new ItemArmorBase("lumium_leggings", MaterialArmor.armorLumium, 2, EntityEquipmentSlot.LEGS, Armor, false);
    public static Item bootsLumium = new ItemArmorBase("lumium_boots", MaterialArmor.armorLumium, 1, EntityEquipmentSlot.FEET, Armor, false);

    //manyullyn
    //base
    public static Item ingotManyullyn = new ItemBase("manyullyn_ingot", Mineral, false);
    public static Item nuggetManyullyn = new ItemBase("manyullyn_nugget", Mineral, false);
    public static Item dustManyullyn = new ItemBase("manyullyn_dust", Mineral, false);
    //crafting
    public static Item gearManyullyn = new ItemBase("manyullyn_gear", Crafting, false);
    public static Item plateManyullyn = new ItemBase("manyullyn_plate", Crafting, false);
    public static Item rodManyullyn = new ItemBase("manyullyn_rod", Crafting, false);
    public static Item tinydustManyullyn = new ItemBase("manyullyn_tiny", Crafting, false);
    //tools
    public static Item swordManyullyn = new ItemToolSword("manyullyn_sword", MaterialTool.toolManyullyn, Tool, false);
    public static Item pickaxeManyullyn = new ItemToolPickaxe("manyullyn_pickaxe", MaterialTool.toolManyullyn, Tool, false);
    public static Item axeManyullyn = new ItemToolAxe("manyullyn_axe", MaterialTool.toolManyullyn, Tool, false);
    public static Item shovelManyullyn = new ItemToolShovel("manyullyn_shovel", MaterialTool.toolManyullyn, Tool, false);
    public static Item hoeManyullyn = new ItemToolHoe("manyullyn_hoe", MaterialTool.toolManyullyn, Tool, false);
    public static Item crusherManyullyn = new ItemToolCrusher("manyullyn_crusher", MaterialTool.toolManyullyn, Tool, false);
    //armor
    public static Item helmetManyullyn = new ItemArmorBase("manyullyn_helmet", MaterialArmor.armorManyullyn, 1, EntityEquipmentSlot.HEAD, Armor, false);
    public static Item chestplateManyullyn = new ItemArmorBase("manyullyn_chestplate", MaterialArmor.armorManyullyn, 1, EntityEquipmentSlot.CHEST, Armor, false);
    public static Item leggingsManyullyn = new ItemArmorBase("manyullyn_leggings", MaterialArmor.armorManyullyn, 2, EntityEquipmentSlot.LEGS, Armor, false);
    public static Item bootsManyullyn = new ItemArmorBase("manyullyn_boots", MaterialArmor.armorManyullyn, 1, EntityEquipmentSlot.FEET, Armor, false);

    //pigiron
    //base
    public static Item ingotPigIron = new ItemBase("pigiron_ingot", Mineral, false);
    public static Item nuggetPigIron = new ItemBase("pigiron_nugget", Mineral, false);
    public static Item dustPigIron = new ItemBase("pigiron_dust", Mineral, false);
    //crafting
    public static Item gearPigIron = new ItemBase("pigiron_gear", Crafting, false);
    public static Item platePigIron = new ItemBase("pigiron_plate", Crafting, false);
    public static Item rodPigIron = new ItemBase("pigiron_rod", Crafting, false);
    public static Item tinydustPigIron = new ItemBase("pigiron_tiny", Crafting, false);
    //tools
    public static Item swordPigIron = new ItemToolSword("pigiron_sword", MaterialTool.toolPigIron, Tool, true);
    public static Item pickaxePigIron = new ItemToolPickaxe("pigiron_pickaxe", MaterialTool.toolPigIron, Tool, true);
    public static Item axePigIron = new ItemToolAxe("pigiron_axe", MaterialTool.toolPigIron, Tool, true);
    public static Item shovelPigIron = new ItemToolShovel("pigiron_shovel", MaterialTool.toolPigIron, Tool, true);
    public static Item hoePigIron = new ItemToolHoe("pigiron_hoe", MaterialTool.toolPigIron, Tool, true);
    public static Item crusherPigIron = new ItemToolCrusher("pigiron_crusher", MaterialTool.toolPigIron, Tool, true);
    //armor
    public static Item helmetPigIron = new ItemArmorBase("pigiron_helmet", MaterialArmor.armorPigIron, 1, EntityEquipmentSlot.HEAD, Armor, false);
    public static Item chestplatePigIron = new ItemArmorBase("pigiron_chestplate", MaterialArmor.armorPigIron, 1, EntityEquipmentSlot.CHEST, Armor, false);
    public static Item leggingsPigIron = new ItemArmorBase("pigiron_leggings", MaterialArmor.armorPigIron, 2, EntityEquipmentSlot.LEGS, Armor, false);
    public static Item bootsPigIron = new ItemArmorBase("pigiron_boots", MaterialArmor.armorPigIron, 1, EntityEquipmentSlot.FEET, Armor, false);

    //signalum
    //base
    public static Item ingotSignalum = new ItemBase("signalum_ingot", Mineral, false);
    public static Item nuggetSignalum = new ItemBase("signalum_nugget", Mineral, false);
    public static Item dustSignalum = new ItemBase("signalum_dust", Mineral, false);
    //crafting
    public static Item gearSignalum = new ItemBase("signalum_gear", Crafting, false);
    public static Item plateSignalum = new ItemBase("signalum_plate", Crafting, false);
    public static Item rodSignalum = new ItemBase("signalum_rod", Crafting, false);
    public static Item tinydustSignalum = new ItemBase("signalum_tiny", Crafting, false);
    //tools
    public static Item swordSignalum = new ItemToolSword("signalum_sword", MaterialTool.toolSignalum, Tool, false);
    public static Item pickaxeSignalum = new ItemToolPickaxe("signalum_pickaxe", MaterialTool.toolSignalum, Tool, false);
    public static Item axeSignalum = new ItemToolAxe("signalum_axe", MaterialTool.toolSignalum, Tool, false);
    public static Item shovelSignalum = new ItemToolShovel("signalum_shovel", MaterialTool.toolSignalum, Tool, false);
    public static Item hoeSignalum = new ItemToolHoe("signalum_hoe", MaterialTool.toolSignalum, Tool, false);
    public static Item crusherSignalum = new ItemToolCrusher("signalum_crusher", MaterialTool.toolSignalum, Tool, false);
    //armor
    public static Item helmetSignalum = new ItemArmorBase("signalum_helmet", MaterialArmor.armorSignalum, 1, EntityEquipmentSlot.HEAD, Armor, false);
    public static Item chestplateSignalum = new ItemArmorBase("signalum_chestplate", MaterialArmor.armorSignalum, 1, EntityEquipmentSlot.CHEST, Armor, false);
    public static Item leggingsSignalum = new ItemArmorBase("signalum_leggings", MaterialArmor.armorSignalum, 2, EntityEquipmentSlot.LEGS, Armor, false);
    public static Item bootsSignalum = new ItemArmorBase("signalum_boots", MaterialArmor.armorSignalum, 1, EntityEquipmentSlot.FEET, Armor, false);

    //steel
    //base
    public static Item ingotSteel = new ItemBase("steel_ingot", Mineral, false);
    public static Item nuggetSteel = new ItemBase("steel_nugget", Mineral, false);
    public static Item dustSteel = new ItemBase("steel_dust", Mineral, false);
    //crafting
    public static Item gearSteel = new ItemBase("steel_gear", Crafting, false);
    public static Item plateSteel = new ItemBase("steel_plate", Crafting, false);
    public static Item rodSteel = new ItemBase("steel_rod", Crafting, false);
    public static Item tinydustSteel = new ItemBase("steel_tiny", Crafting, false);
    //tools
    public static Item swordSteel = new ItemToolSword("steel_sword", MaterialTool.toolSteel, Tool, false);
    public static Item pickaxeSteel = new ItemToolPickaxe("steel_pickaxe", MaterialTool.toolSteel, Tool, false);
    public static Item axeSteel = new ItemToolAxe("steel_axe", MaterialTool.toolSteel, Tool, false);
    public static Item shovelSteel = new ItemToolShovel("steel_shovel", MaterialTool.toolSteel, Tool, false);
    public static Item hoeSteel = new ItemToolHoe("steel_hoe", MaterialTool.toolSteel, Tool, false);
    public static Item crusherSteel = new ItemToolCrusher("steel_crusher", MaterialTool.toolSteel, Tool, false);
    //armor
    public static Item helmetSteel = new ItemArmorBase("steel_helmet", MaterialArmor.armorSteel, 1, EntityEquipmentSlot.HEAD, Armor, false);
    public static Item chestplateSteel = new ItemArmorBase("steel_chestplate", MaterialArmor.armorSteel, 1, EntityEquipmentSlot.CHEST, Armor, false);
    public static Item leggingsSteel = new ItemArmorBase("steel_leggings", MaterialArmor.armorSteel, 2, EntityEquipmentSlot.LEGS, Armor, false);
    public static Item bootsSteel = new ItemArmorBase("steel_boots", MaterialArmor.armorSteel, 1, EntityEquipmentSlot.FEET, Armor, false);

    //voidborn
    //base
    public static Item ingotVoidBorn = new ItemBase("voidborn_ingot", Mineral, false);
    public static Item nuggetVoidBorn = new ItemBase("voidborn_nugget", Mineral, false);
    public static Item dustVoidBorn = new ItemBase("voidborn_dust", Mineral, false);
    //crafting
    public static Item gearVoidBorn = new ItemBase("voidborn_gear", Crafting, false);
    public static Item plateVoidBorn = new ItemBase("voidborn_plate", Crafting, false);
    public static Item rodVoidBorn = new ItemBase("voidborn_rod", Crafting, false);
    public static Item tinydustVoidBorn = new ItemBase("voidborn_tiny", Crafting, false);
    //tools
    public static Item swordVoidBorn = new ItemToolSword("voidborn_sword", MaterialTool.toolVoidBorn, Tool, false);
    public static Item pickaxeVoidBorn = new ItemToolPickaxe("voidborn_pickaxe", MaterialTool.toolVoidBorn, Tool, false);
    public static Item axeVoidBorn = new ItemToolAxe("voidborn_axe", MaterialTool.toolVoidBorn, Tool, false);
    public static Item shovelVoidBorn = new ItemToolShovel("voidborn_shovel", MaterialTool.toolVoidBorn, Tool, false);
    public static Item hoeVoidBorn = new ItemToolHoe("voidborn_hoe", MaterialTool.toolVoidBorn, Tool, false);
    public static Item crusherVoidBorn = new ItemToolCrusher("voidborn_crusher", MaterialTool.toolVoidBorn, Tool, false);
    //armor
    public static Item helmetVoidBorn = new ItemArmorBase("voidborn_helmet", MaterialArmor.armorVoidBorn, 1, EntityEquipmentSlot.HEAD, Armor, false);
    public static Item chestplateVoidBorn = new ItemArmorBase("voidborn_chestplate", MaterialArmor.armorVoidBorn, 1, EntityEquipmentSlot.CHEST, Armor, false);
    public static Item leggingsVoidBorn = new ItemArmorBase("voidborn_leggings", MaterialArmor.armorVoidBorn, 2, EntityEquipmentSlot.LEGS, Armor, false);
    public static Item bootsVoidBorn = new ItemArmorBase("voidborn_boots", MaterialArmor.armorVoidBorn, 1, EntityEquipmentSlot.FEET, Armor, false);

    //----------
    //gems
    //----------

    //amethyst
    //base
    public static Item gemAmethyst = new ItemBase("amethyst_gem", Mineral, false);
    public static Item nuggetAmethyst = new ItemBase("amethyst_nugget", Mineral, false);
    public static Item dustAmethyst = new ItemBase("amethyst_dust", Mineral, false);
    //crafting
    public static Item gearAmethyst = new ItemBase("amethyst_gear", Crafting, false);
    public static Item plateAmethyst = new ItemBase("amethyst_plate", Crafting, false);
    public static Item rodAmethyst = new ItemBase("amethyst_rod", Crafting, false);
    public static Item tinydustAmethyst = new ItemBase("amethyst_tiny", Crafting, false);
    //tools
    public static Item swordAmethyst = new ItemToolSword("amethyst_sword", MaterialTool.toolAmethyst, Tool, false);
    public static Item pickaxeAmethyst = new ItemToolPickaxe("amethyst_pickaxe", MaterialTool.toolAmethyst, Tool, false);
    public static Item axeAmethyst = new ItemToolAxe("amethyst_axe", MaterialTool.toolAmethyst, Tool, false);
    public static Item shovelAmethyst = new ItemToolShovel("amethyst_shovel", MaterialTool.toolAmethyst, Tool, false);
    public static Item hoeAmethyst = new ItemToolHoe("amethyst_hoe", MaterialTool.toolAmethyst, Tool, false);
    public static Item crusherAmethyst = new ItemToolCrusher("amethyst_crusher", MaterialTool.toolAmethyst, Tool, false);
    //armor
    public static Item helmetAmethyst = new ItemArmorBase("amethyst_helmet", MaterialArmor.armorAmethyst, 1, EntityEquipmentSlot.HEAD, Armor, false);
    public static Item chestplateAmethyst = new ItemArmorBase("amethyst_chestplate", MaterialArmor.armorAmethyst, 1, EntityEquipmentSlot.CHEST, Armor, false);
    public static Item leggingsAmethyst = new ItemArmorBase("amethyst_leggings", MaterialArmor.armorAmethyst, 2, EntityEquipmentSlot.LEGS, Armor, false);
    public static Item bootsAmethyst = new ItemArmorBase("amethyst_boots", MaterialArmor.armorAmethyst, 1, EntityEquipmentSlot.FEET, Armor, false);

    //garnet
    //base
    public static Item gemGarnet = new ItemBase("garnet_gem", Mineral, false);
    public static Item nuggetGarnet = new ItemBase("garnet_nugget", Mineral, false);
    public static Item dustGarnet = new ItemBase("garnet_dust", Mineral, false);
    //crafting
    public static Item gearGarnet = new ItemBase("garnet_gear", Crafting, false);
    public static Item plateGarnet = new ItemBase("garnet_plate", Crafting, false);
    public static Item rodGarnet = new ItemBase("garnet_rod", Crafting, false);
    public static Item tinydustGarnet = new ItemBase("garnet_tiny", Crafting, false);
    //tools
    public static Item swordGarnet = new ItemToolSword("garnet_sword", MaterialTool.toolGarnet, Tool, false);
    public static Item pickaxeGarnet = new ItemToolPickaxe("garnet_pickaxe", MaterialTool.toolGarnet, Tool, false);
    public static Item axeGarnet = new ItemToolAxe("garnet_axe", MaterialTool.toolGarnet, Tool, false);
    public static Item shovelGarnet = new ItemToolShovel("garnet_shovel", MaterialTool.toolGarnet, Tool, false);
    public static Item hoeGarnet = new ItemToolHoe("garnet_hoe", MaterialTool.toolGarnet, Tool, false);
    public static Item crusherGarnet = new ItemToolCrusher("garnet_crusher", MaterialTool.toolGarnet, Tool, false);
    //armor
    public static Item helmetGarnet = new ItemArmorBase("garnet_helmet", MaterialArmor.armorGarnet, 1, EntityEquipmentSlot.HEAD, Armor, false);
    public static Item chestplateGarnet = new ItemArmorBase("garnet_chestplate", MaterialArmor.armorGarnet, 1, EntityEquipmentSlot.CHEST, Armor, false);
    public static Item leggingsGarnet = new ItemArmorBase("garnet_leggings", MaterialArmor.armorGarnet, 2, EntityEquipmentSlot.LEGS, Armor, false);
    public static Item bootsGarnet = new ItemArmorBase("garnet_boots", MaterialArmor.armorGarnet, 1, EntityEquipmentSlot.FEET, Armor, false);

    //opal
    //base
    public static Item gemOpal = new ItemBase("opal_gem", Mineral, false);
    public static Item nuggetOpal = new ItemBase("opal_nugget", Mineral, false);
    public static Item dustOpal = new ItemBase("opal_dust", Mineral, false);
    //crafting
    public static Item gearOpal = new ItemBase("opal_gear", Crafting, false);
    public static Item plateOpal = new ItemBase("opal_plate", Crafting, false);
    public static Item rodOpal = new ItemBase("opal_rod", Crafting, false);
    public static Item tinydustOpal = new ItemBase("opal_tiny", Crafting, false);
    //tools
    public static Item swordOpal = new ItemToolSword("opal_sword", MaterialTool.toolOpal, Tool, false);
    public static Item pickaxeOpal = new ItemToolPickaxe("opal_pickaxe", MaterialTool.toolOpal, Tool, false);
    public static Item axeOpal = new ItemToolAxe("opal_axe", MaterialTool.toolOpal, Tool, false);
    public static Item shovelOpal = new ItemToolShovel("opal_shovel", MaterialTool.toolOpal, Tool, false);
    public static Item hoeOpal = new ItemToolHoe("opal_hoe", MaterialTool.toolOpal, Tool, false);
    public static Item crusherOpal = new ItemToolCrusher("opal_crusher", MaterialTool.toolOpal, Tool, false);
    //armor
    public static Item helmetOpal = new ItemArmorBase("opal_helmet", MaterialArmor.armorOpal, 1, EntityEquipmentSlot.HEAD, Armor, false);
    public static Item chestplateOpal = new ItemArmorBase("opal_chestplate", MaterialArmor.armorOpal, 1, EntityEquipmentSlot.CHEST, Armor, false);
    public static Item leggingsOpal = new ItemArmorBase("opal_leggings", MaterialArmor.armorOpal, 2, EntityEquipmentSlot.LEGS, Armor, false);
    public static Item bootsOpal = new ItemArmorBase("opal_boots", MaterialArmor.armorOpal, 1, EntityEquipmentSlot.FEET, Armor, false);

    //pearl
    //base
    public static Item gemPearl = new ItemBase("pearl_gem", Mineral, false);
    public static Item nuggetPearl = new ItemBase("pearl_nugget", Mineral, false);
    public static Item dustPearl = new ItemBase("pearl_dust", Mineral, false);
    //crafting
    public static Item gearPearl = new ItemBase("pearl_gear", Crafting, false);
    public static Item platePearl = new ItemBase("pearl_plate", Crafting, false);
    public static Item rodPearl = new ItemBase("pearl_rod", Crafting, false);
    public static Item tinydustPearl = new ItemBase("pearl_tiny", Crafting, false);
    //tools
    public static Item swordPearl = new ItemToolSword("pearl_sword", MaterialTool.toolPearl, Tool, false);
    public static Item pickaxePearl = new ItemToolPickaxe("pearl_pickaxe", MaterialTool.toolPearl, Tool, false);
    public static Item axePearl = new ItemToolAxe("pearl_axe", MaterialTool.toolPearl, Tool, false);
    public static Item shovelPearl = new ItemToolShovel("pearl_shovel", MaterialTool.toolPearl, Tool, false);
    public static Item hoePearl = new ItemToolHoe("pearl_hoe", MaterialTool.toolPearl, Tool, false);
    public static Item crusherPearl = new ItemToolCrusher("pearl_crusher", MaterialTool.toolPearl, Tool, false);
    //armor
    public static Item helmetPearl = new ItemArmorBase("pearl_helmet", MaterialArmor.armorPearl, 1, EntityEquipmentSlot.HEAD, Armor, false);
    public static Item chestplatePearl = new ItemArmorBase("pearl_chestplate", MaterialArmor.armorPearl, 1, EntityEquipmentSlot.CHEST, Armor, false);
    public static Item leggingsPearl = new ItemArmorBase("pearl_leggings", MaterialArmor.armorPearl, 2, EntityEquipmentSlot.LEGS, Armor, false);
    public static Item bootsPearl = new ItemArmorBase("pearl_boots", MaterialArmor.armorPearl, 1, EntityEquipmentSlot.FEET, Armor, false);

    //peridot
    //base
    public static Item gemPeridot = new ItemBase("peridot_gem", Mineral, false);
    public static Item nuggetPeridot = new ItemBase("peridot_nugget", Mineral, false);
    public static Item dustPeridot = new ItemBase("peridot_dust", Mineral, false);
    //crafting
    public static Item gearPeridot = new ItemBase("peridot_gear", Crafting, false);
    public static Item platePeridot = new ItemBase("peridot_plate", Crafting, false);
    public static Item rodPeridot = new ItemBase("peridot_rod", Crafting, false);
    public static Item tinydustPeridot = new ItemBase("peridot_tiny", Crafting, false);
    //tools
    public static Item swordPeridot = new ItemToolSword("peridot_sword", MaterialTool.toolPeridot, Tool, false);
    public static Item pickaxePeridot = new ItemToolPickaxe("peridot_pickaxe", MaterialTool.toolPeridot, Tool, false);
    public static Item axePeridot = new ItemToolAxe("peridot_axe", MaterialTool.toolPeridot, Tool, false);
    public static Item shovelPeridot = new ItemToolShovel("peridot_shovel", MaterialTool.toolPeridot, Tool, false);
    public static Item hoePeridot = new ItemToolHoe("peridot_hoe", MaterialTool.toolPeridot, Tool, false);
    public static Item crusherPeridot = new ItemToolCrusher("peridot_crusher", MaterialTool.toolPeridot, Tool, false);
    //armor
    public static Item helmetPeridot = new ItemArmorBase("peridot_helmet", MaterialArmor.armorPeridot, 1, EntityEquipmentSlot.HEAD, Armor, false);
    public static Item chestplatePeridot = new ItemArmorBase("peridot_chestplate", MaterialArmor.armorPeridot, 1, EntityEquipmentSlot.CHEST, Armor, false);
    public static Item leggingsPeridot = new ItemArmorBase("peridot_leggings", MaterialArmor.armorPeridot, 2, EntityEquipmentSlot.LEGS, Armor, false);
    public static Item bootsPeridot = new ItemArmorBase("peridot_boots", MaterialArmor.armorPeridot, 1, EntityEquipmentSlot.FEET, Armor, false);

    //ruby
    //base
    public static Item gemRuby = new ItemBase("ruby_gem", Mineral, false);
    public static Item nuggetRuby = new ItemBase("ruby_nugget", Mineral, false);
    public static Item dustRuby = new ItemBase("ruby_dust", Mineral, false);
    //crafting
    public static Item gearRuby = new ItemBase("ruby_gear", Crafting, false);
    public static Item plateRuby = new ItemBase("ruby_plate", Crafting, false);
    public static Item rodRuby = new ItemBase("ruby_rod", Crafting, false);
    public static Item tinydustRuby = new ItemBase("ruby_tiny", Crafting, false);
    //tools
    public static Item swordRuby = new ItemToolSword("ruby_sword", MaterialTool.toolRuby, Tool, false);
    public static Item pickaxeRuby = new ItemToolPickaxe("ruby_pickaxe", MaterialTool.toolRuby, Tool, false);
    public static Item axeRuby = new ItemToolAxe("ruby_axe", MaterialTool.toolRuby, Tool, false);
    public static Item shovelRuby = new ItemToolShovel("ruby_shovel", MaterialTool.toolRuby, Tool, false);
    public static Item hoeRuby = new ItemToolHoe("ruby_hoe", MaterialTool.toolRuby, Tool, false);
    public static Item crusherRuby = new ItemToolCrusher("ruby_crusher", MaterialTool.toolRuby, Tool, false);
    //armor
    public static Item helmetRuby = new ItemArmorBase("ruby_helmet", MaterialArmor.armorRuby, 1, EntityEquipmentSlot.HEAD, Armor, false);
    public static Item chestplateRuby = new ItemArmorBase("ruby_chestplate", MaterialArmor.armorRuby, 1, EntityEquipmentSlot.CHEST, Armor, false);
    public static Item leggingsRuby = new ItemArmorBase("ruby_leggings", MaterialArmor.armorRuby, 2, EntityEquipmentSlot.LEGS, Armor, false);
    public static Item bootsRuby = new ItemArmorBase("ruby_boots", MaterialArmor.armorRuby, 1, EntityEquipmentSlot.FEET, Armor, false);

    //sapphire
    //base
    public static Item gemSapphire = new ItemBase("sapphire_gem", Mineral, false);
    public static Item nuggetSapphire = new ItemBase("sapphire_nugget", Mineral, false);
    public static Item dustSapphire = new ItemBase("sapphire_dust", Mineral, false);
    //crafting
    public static Item gearSapphire = new ItemBase("sapphire_gear", Crafting, false);
    public static Item plateSapphire = new ItemBase("sapphire_plate", Crafting, false);
    public static Item rodSapphire = new ItemBase("sapphire_rod", Crafting, false);
    public static Item tinydustSapphire = new ItemBase("sapphire_tiny", Crafting, false);
    //tools
    public static Item swordSapphire = new ItemToolSword("sapphire_sword", MaterialTool.toolSapphire, Tool, false);
    public static Item pickaxeSapphire = new ItemToolPickaxe("sapphire_pickaxe", MaterialTool.toolSapphire, Tool, false);
    public static Item axeSapphire = new ItemToolAxe("sapphire_axe", MaterialTool.toolSapphire, Tool, false);
    public static Item shovelSapphire = new ItemToolShovel("sapphire_shovel", MaterialTool.toolSapphire, Tool, false);
    public static Item hoeSapphire = new ItemToolHoe("sapphire_hoe", MaterialTool.toolSapphire, Tool, false);
    public static Item crusherSapphire = new ItemToolCrusher("sapphire_crusher", MaterialTool.toolSapphire, Tool, false);
    //armor
    public static Item helmetSapphire = new ItemArmorBase("sapphire_helmet", MaterialArmor.armorSapphire, 1, EntityEquipmentSlot.HEAD, Armor, false);
    public static Item chestplateSapphire = new ItemArmorBase("sapphire_chestplate", MaterialArmor.armorSapphire, 1, EntityEquipmentSlot.CHEST, Armor, false);
    public static Item leggingsSapphire = new ItemArmorBase("sapphire_leggings", MaterialArmor.armorSapphire, 2, EntityEquipmentSlot.LEGS, Armor, false);
    public static Item bootsSapphire = new ItemArmorBase("sapphire_boots", MaterialArmor.armorSapphire, 1, EntityEquipmentSlot.FEET, Armor, false);

    //----------
    //elements
    //----------

    //carbon
    //base
    public static Item elementCarbon = new ItemBase("carbon_element", Mineral, false);
    public static Item nuggetCarbon = new ItemBase("carbon_nugget", Mineral, false);
    public static Item dustCarbon = new ItemBase("carbon_dust", Mineral, false);
    //crafting
    public static Item gearCarbon = new ItemBase("carbon_gear", Crafting, false);
    public static Item plateCarbon = new ItemBase("carbon_plate", Crafting, false);
    public static Item rodCarbon = new ItemBase("carbon_rod", Crafting, false);
    public static Item tinydustCarbon = new ItemBase("carbon_tiny", Crafting, false);

    //cinnabar
    //base
    public static Item elementCinnabar = new ItemBase("cinnabar_element", Mineral, false);
    public static Item nuggetCinnabar = new ItemBase("cinnabar_nugget", Mineral, false);
    public static Item dustCinnabar = new ItemBase("cinnabar_dust", Mineral, false);
    //crafting
    public static Item gearCinnabar = new ItemBase("cinnabar_gear", Crafting, false);
    public static Item plateCinnabar = new ItemBase("cinnabar_plate", Crafting, false);
    public static Item rodCinnabar = new ItemBase("cinnabar_rod", Crafting, false);
    public static Item tinydustCinnabar = new ItemBase("cinnabar_tiny", Crafting, false);

    //mercury
    //base
    public static Item elementMercury = new ItemBase("mercury_element", Mineral, false);
    public static Item nuggetMercury = new ItemBase("mercury_nugget", Mineral, false);
    public static Item dustMercury = new ItemBase("mercury_dust", Mineral, false);
    //crafting
    public static Item gearMercury = new ItemBase("mercury_gear", Crafting, false);
    public static Item plateMercury = new ItemBase("mercury_plate", Crafting, false);
    public static Item rodMercury = new ItemBase("mercury_rod", Crafting, false);
    public static Item tinydustMercury = new ItemBase("mercury_tiny", Crafting, false);

    //silicon
    //base
    public static Item elementSilicon = new ItemBase("silicon_element", Mineral, false);
    public static Item nuggetSilicon = new ItemBase("silicon_nugget", Mineral, false);
    public static Item dustSilicon = new ItemBase("silicon_dust", Mineral, false);
    //crafting
    public static Item gearSilicon = new ItemBase("silicon_gear", Crafting, false);
    public static Item plateSilicon = new ItemBase("silicon_plate", Crafting, false);
    public static Item rodSilicon = new ItemBase("silicon_rod", Crafting, false);
    public static Item tinydustSilicon = new ItemBase("silicon_tiny", Crafting, false);

    //sulfur
    //base
    public static Item elementSulfur = new ItemBase("sulfur_element", Mineral, false);
    public static Item nuggetSulfur = new ItemBase("sulfur_nugget", Mineral, false);
    public static Item dustSulfur = new ItemBase("sulfur_dust", Mineral, false);
    //crafting
    public static Item gearSulfur = new ItemBase("sulfur_gear", Crafting, false);
    public static Item plateSulfur = new ItemBase("sulfur_plate", Crafting, false);
    public static Item rodSulfur = new ItemBase("sulfur_rod", Crafting, false);
    public static Item tinydustSulfur = new ItemBase("sulfur_tiny", Crafting, false);

    //----------
    //vanilla
    //----------

    //- - - - -
    //base game
    //- - - - -

    //charcoal
    public static Item nuggetCharcoal = new ItemBase("charcoal_nugget", Mineral, false);
    public static Item dustCharcoal = new ItemBase("charcoal_dust", Mineral, false);
    public static Item gearCharcoal = new ItemBase("charcoal_gear", Crafting, false);
    public static Item plateCharcoal = new ItemBase("charcoal_plate", Crafting, false);
    public static Item tinydustCharcoal = new ItemBase("charcoal_tiny", Crafting, false);
    public static Item rodCharcoal = new ItemBase("charcoal_rod", Crafting, false);

    //coal
    public static Item nuggetCoal = new ItemBase("coal_nugget", Mineral, false);
    public static Item dustCoal = new ItemBase("coal_dust", Mineral, false);
    public static Item gearCoal = new ItemBase("coal_gear", Crafting, false);
    public static Item plateCoal = new ItemBase("coal_plate", Crafting, false);
    public static Item tinydustCoal = new ItemBase("coal_tiny", Crafting, false);
    public static Item rodCoal = new ItemBase("coal_rod", Crafting, false);

    //diamond
    public static Item nuggetDiamond = new ItemBase("diamond_nugget", Mineral, false);
    public static Item dustDiamond = new ItemBase("diamond_dust", Mineral, false);
    public static Item gearDiamond = new ItemBase("diamond_gear", Crafting, false);
    public static Item plateDiamond = new ItemBase("diamond_plate", Crafting, false);
    public static Item tinydustDiamond = new ItemBase("diamond_tiny", Crafting, false);
    public static Item rodDiamond = new ItemBase("diamond_rod", Crafting, false);

    //emerald
    public static Item nuggetEmerald = new ItemBase("emerald_nugget", Mineral, false);
    public static Item dustEmerald = new ItemBase("emerald_dust", Mineral, false);
    public static Item gearEmerald = new ItemBase("emerald_gear", Crafting, false);
    public static Item plateEmerald = new ItemBase("emerald_plate", Crafting, false);
    public static Item tinydustEmerald = new ItemBase("emerald_tiny", Crafting, false);
    public static Item rodEmerald = new ItemBase("emerald_rod", Crafting, false);

    //gold
    public static Item dustGold = new ItemBase("gold_dust", Mineral, false);
    public static Item gearGold = new ItemBase("gold_gear", Crafting, false);
    public static Item plateGold = new ItemBase("gold_plate", Crafting, false);
    public static Item tinydustGold = new ItemBase("gold_tiny", Crafting, false);
    public static Item rodGold = new ItemBase("gold_rod", Crafting, false);

    //iron
    public static Item dustIron = new ItemBase("iron_dust", Mineral, false);
    public static Item gearIron = new ItemBase("iron_gear", Crafting, false);
    public static Item plateIron = new ItemBase("iron_plate", Crafting, false);
    public static Item tinydustIron = new ItemBase("iron_tiny", Crafting, false);
    public static Item rodIron = new ItemBase("iron_rod", Crafting, false);

    //lapis
    public static Item nuggetLapis = new ItemBase("lapis_nugget", Mineral, false);
    public static Item dustLapis = new ItemBase("lapis_dust", Mineral, false);
    public static Item gearLapis = new ItemBase("lapis_gear", Crafting, false);
    public static Item plateLapis = new ItemBase("lapis_plate", Crafting, false);
    public static Item tinydustLapis = new ItemBase("lapis_tiny", Crafting, false);
    public static Item rodLapis = new ItemBase("lapis_rod", Crafting, false);

    //quartz
    public static Item nuggetQuartz = new ItemBase("quartz_nugget", Mineral, false);
    public static Item dustQuartz = new ItemBase("quartz_dust", Mineral, false);
    public static Item gearQuartz = new ItemBase("quartz_gear", Crafting, false);
    public static Item plateQuartz = new ItemBase("quartz_plate", Crafting, false);
    public static Item tinydustQuartz = new ItemBase("quartz_tiny", Crafting, false);
    public static Item rodQuartz = new ItemBase("quartz_rod", Crafting, false);

    //- - - - -
    //additions
    //- - - - -

    //charcoalium
    //base
    public static Item ingotCharcoalium = new ItemBase("charcoalium_ingot", Mineral, false);
    public static Item nuggetCharcoalium = new ItemBase("charcoalium_nugget", Mineral, false);
    public static Item dustCharcoalium = new ItemBase("charcoalium_dust", Mineral, false);
    //crafting
    public static Item gearCharcoalium = new ItemBase("charcoalium_gear", Crafting, false);
    public static Item plateCharcoalium = new ItemBase("charcoalium_plate", Crafting, false);
    public static Item rodCharcoalium = new ItemBase("charcoalium_rod", Crafting, false);
    public static Item tinydustCharcoalium = new ItemBase("charcoalium_tiny", Crafting, false);
    //tools
    public static Item swordCharcoalium = new ItemToolSword("charcoalium_sword", MaterialTool.toolCharcoalium, Tool, false);
    public static Item pickaxeCharcoalium = new ItemToolPickaxe("charcoalium_pickaxe", MaterialTool.toolCharcoalium, Tool, false);
    public static Item axeCharcoalium = new ItemToolAxe("charcoalium_axe", MaterialTool.toolCharcoalium, Tool, false);
    public static Item shovelCharcoalium = new ItemToolShovel("charcoalium_shovel", MaterialTool.toolCharcoalium, Tool, false);
    public static Item hoeCharcoalium = new ItemToolHoe("charcoalium_hoe", MaterialTool.toolCharcoalium, Tool, false);
    public static Item crusherCharcoalium = new ItemToolCrusher("charcoalium_crusher", MaterialTool.toolCharcoalium, Tool, false);
    //armor
    public static Item helmetCharcoalium = new ItemArmorBase("charcoalium_helmet", MaterialArmor.armorCharcoalium, 1, EntityEquipmentSlot.HEAD, Armor, false);
    public static Item chestplateCharcoalium = new ItemArmorBase("charcoalium_chestplate", MaterialArmor.armorCharcoalium, 1, EntityEquipmentSlot.CHEST, Armor, false);
    public static Item leggingsCharcoalium = new ItemArmorBase("charcoalium_leggings", MaterialArmor.armorCharcoalium, 2, EntityEquipmentSlot.LEGS, Armor, false);
    public static Item bootsCharcoalium = new ItemArmorBase("charcoalium_boots", MaterialArmor.armorCharcoalium, 1, EntityEquipmentSlot.FEET, Armor, false);

    //coalium
    //base
    public static Item ingotCoalium = new ItemBase("coalium_ingot", Mineral, false);
    public static Item nuggetCoalium = new ItemBase("coalium_nugget", Mineral, false);
    public static Item dustCoalium = new ItemBase("coalium_dust", Mineral, false);
    //crafting
    public static Item gearCoalium = new ItemBase("coalium_gear", Crafting, false);
    public static Item plateCoalium = new ItemBase("coalium_plate", Crafting, false);
    public static Item rodCoalium = new ItemBase("coalium_rod", Crafting, false);
    public static Item tinydustCoalium = new ItemBase("coalium_tiny", Crafting, false);
    //tools
    public static Item swordCoalium = new ItemToolSword("coalium_sword", MaterialTool.toolCoalium, Tool, false);
    public static Item pickaxeCoalium = new ItemToolPickaxe("coalium_pickaxe", MaterialTool.toolCoalium, Tool, false);
    public static Item axeCoalium = new ItemToolAxe("coalium_axe", MaterialTool.toolCoalium, Tool, false);
    public static Item shovelCoalium = new ItemToolShovel("coalium_shovel", MaterialTool.toolCoalium, Tool, false);
    public static Item hoeCoalium = new ItemToolHoe("coalium_hoe", MaterialTool.toolCoalium, Tool, false);
    public static Item crusherCoalium = new ItemToolCrusher("coalium_crusher", MaterialTool.toolCoalium, Tool, false);
    //armor
    public static Item helmetCoalium = new ItemArmorBase("coalium_helmet", MaterialArmor.armorCoalium, 1, EntityEquipmentSlot.HEAD, Armor, false);
    public static Item chestplateCoalium = new ItemArmorBase("coalium_chestplate", MaterialArmor.armorCoalium, 1, EntityEquipmentSlot.CHEST, Armor, false);
    public static Item leggingsCoalium = new ItemArmorBase("coalium_leggings", MaterialArmor.armorCoalium, 2, EntityEquipmentSlot.LEGS, Armor, false);
    public static Item bootsCoalium = new ItemArmorBase("coalium_boots", MaterialArmor.armorCoalium, 1, EntityEquipmentSlot.FEET, Armor, false);

    //glowize
    //base
    public static Item ingotGlowize = new ItemBase("glowize_ingot", Mineral, false);
    public static Item nuggetGlowize = new ItemBase("glowize_nugget", Mineral, false);
    public static Item dustGlowize = new ItemBase("glowize_dust", Mineral, false);
    //crafting
    public static Item gearGlowize = new ItemBase("glowize_gear", Crafting, false);
    public static Item plateGlowize = new ItemBase("glowize_plate", Crafting, false);
    public static Item rodGlowize = new ItemBase("glowize_rod", Crafting, false);
    public static Item tinydustGlowize = new ItemBase("glowize_tiny", Crafting, false);
//    //tools
//    public static Item swordGlowize = new ItemToolSword("glowize_sword", MaterialTool.toolGlowize, Tool, false);
//    public static Item pickaxeGlowize = new ItemToolPickaxe("glowize_pickaxe", MaterialTool.toolGlowize, Tool, false);
//    public static Item axeGlowize = new ItemToolAxe("glowize_axe", MaterialTool.toolGlowize, Tool, false);
//    public static Item shovelGlowize = new ItemToolShovel("glowize_shovel", MaterialTool.toolGlowize, Tool, false);
//    public static Item hoeGlowize = new ItemToolHoe("glowize_hoe", MaterialTool.toolGlowize, Tool, false);
//    public static Item crusherGlowize = new ItemToolCrusher("glowize_crusher", MaterialTool.toolGlowize, Tool, false);
//    //armor
//    public static Item helmetGlowize = new ItemArmorBase("glowize_helmet", MaterialArmor.armorGlowize, 1, EntityEquipmentSlot.HEAD, Armor, false);
//    public static Item chestplateGlowize = new ItemArmorBase("glowize_chestplate", MaterialArmor.armorGlowize, 1, EntityEquipmentSlot.CHEST, Armor, false);
//    public static Item leggingsGlowize = new ItemArmorBase("glowize_leggings", MaterialArmor.armorGlowize, 2, EntityEquipmentSlot.LEGS, Armor, false);
//    public static Item bootsGlowize = new ItemArmorBase("glowize_boots", MaterialArmor.armorGlowize, 1, EntityEquipmentSlot.FEET, Armor, false);

    //lapite
    //base
    public static Item ingotLapite = new ItemBase("lapite_ingot", Mineral, false);
    public static Item nuggetLapite = new ItemBase("lapite_nugget", Mineral, false);
    public static Item dustLapite = new ItemBase("lapite_dust", Mineral, false);
    //crafting
    public static Item gearLapite = new ItemBase("lapite_gear", Crafting, false);
    public static Item plateLapite = new ItemBase("lapite_plate", Crafting, false);
    public static Item rodLapite = new ItemBase("lapite_rod", Crafting, false);
    public static Item tinydustLapite = new ItemBase("lapite_tiny", Crafting, false);
//    //tools
//    public static Item swordLapite = new ItemToolSword("lapite_sword", MaterialTool.toolLapite, Tool, false);
//    public static Item pickaxeLapite = new ItemToolPickaxe("lapite_pickaxe", MaterialTool.toolLapite, Tool, false);
//    public static Item axeLapite = new ItemToolAxe("lapite_axe", MaterialTool.toolLapite, Tool, false);
//    public static Item shovelLapite = new ItemToolShovel("lapite_shovel", MaterialTool.toolLapite, Tool, false);
//    public static Item hoeLapite = new ItemToolHoe("lapite_hoe", MaterialTool.toolLapite, Tool, false);
//    public static Item crusherLapite = new ItemToolCrusher("lapite_crusher", MaterialTool.toolLapite, Tool, false);
//    //armor
//    public static Item helmetLapite = new ItemArmorBase("lapite_helmet", MaterialArmor.armorLapite, 1, EntityEquipmentSlot.HEAD, Armor, false);
//    public static Item chestplateLapite = new ItemArmorBase("lapite_chestplate", MaterialArmor.armorLapite, 1, EntityEquipmentSlot.CHEST, Armor, false);
//    public static Item leggingsLapite = new ItemArmorBase("lapite_leggings", MaterialArmor.armorLapite, 2, EntityEquipmentSlot.LEGS, Armor, false);
//    public static Item bootsLapite = new ItemArmorBase("lapite_boots", MaterialArmor.armorLapite, 1, EntityEquipmentSlot.FEET, Armor, false);

    //quartzium
    //base
    public static Item ingotQuartzium = new ItemBase("quartzium_ingot", Mineral, false);
    public static Item nuggetQuartzium = new ItemBase("quartzium_nugget", Mineral, false);
    public static Item dustQuartzium = new ItemBase("quartzium_dust", Mineral, false);
    //crafting
    public static Item gearQuartzium = new ItemBase("quartzium_gear", Crafting, false);
    public static Item plateQuartzium = new ItemBase("quartzium_plate", Crafting, false);
    public static Item rodQuartzium = new ItemBase("quartzium_rod", Crafting, false);
    public static Item tinydustQuartzium = new ItemBase("quartzium_tiny", Crafting, false);
//    //tools
//    public static Item swordQuartzium = new ItemToolSword("quartzium_sword", MaterialTool.toolQuartzium, Tool, false);
//    public static Item pickaxeQuartzium = new ItemToolPickaxe("quartzium_pickaxe", MaterialTool.toolQuartzium, Tool, false);
//    public static Item axeQuartzium = new ItemToolAxe("quartzium_axe", MaterialTool.toolQuartzium, Tool, false);
//    public static Item shovelQuartzium = new ItemToolShovel("quartzium_shovel", MaterialTool.toolQuartzium, Tool, false);
//    public static Item hoeQuartzium = new ItemToolHoe("quartzium_hoe", MaterialTool.toolQuartzium, Tool, false);
//    public static Item crusherQuartzium = new ItemToolCrusher("quartzium_crusher", MaterialTool.toolQuartzium, Tool, false);
//    //armor
//    public static Item helmetQuartzium = new ItemArmorBase("quartzium_helmet", MaterialArmor.armorQuartzium, 1, EntityEquipmentSlot.HEAD, Armor, false);
//    public static Item chestplateQuartzium = new ItemArmorBase("quartzium_chestplate", MaterialArmor.armorQuartzium, 1, EntityEquipmentSlot.CHEST, Armor, false);
//    public static Item leggingsQuartzium = new ItemArmorBase("quartzium_leggings", MaterialArmor.armorQuartzium, 2, EntityEquipmentSlot.LEGS, Armor, false);
//    public static Item bootsQuartzium = new ItemArmorBase("quartzium_boots", MaterialArmor.armorQuartzium, 1, EntityEquipmentSlot.FEET, Armor, false);

    //========
    //other
    //========
    public static Item weezerWeezer = new ItemWeezer("weezer");

    public static Item creativeIcon1 = new ItemBase("creative_icon1", None, false);
    public static Item creativeIcon2 = new ItemBase("creative_icon2", None, false);
    public static Item creativeIcon3 = new ItemBase("creative_icon3", None, false);
    public static Item creativeIcon4 = new ItemBase("creative_icon4", None, false);
    public static Item creativeIcon5 = new ItemBase("creative_icon5", None, false);
    public static Item creativeIcon6 = new ItemBase("creative_icon6", None, false);

    public static Item modularPickaxe = new ItemPickaxeModular("pickaxe_modular", ToolMaterials.Diamond, ToolMaterials.Iron, ToolMaterials.Emerald, null);

    public static void init(){
        ITEMS.add(modularPickaxe);
        if (GeneralConfig.isMineralsEnabled) {
            if (GeneralConfig.isIngotsEnabled) {
                //adamantine
                if (MineralsConfig.isAdamantineEnabled) {
                    ITEMS.add(ingotAdamantine);
                    ITEMS.add(nuggetAdamantine);
                    ITEMS.add(dustAdamantine);

                    if (GeneralConfig.isCraftingEnabled) {
                        if (CraftingConfig.isAdamantineCraftingEnabled) {
                            ITEMS.add(gearAdamantine);
                            ITEMS.add(plateAdamantine);
                            ITEMS.add(rodAdamantine);
                            ITEMS.add(tinydustAdamantine);
                        }
                    }
                    if (GeneralConfig.isArmorEnabled) {
                        if (ArmorConfig.isAdamantineArmorEnabled) {
                            ITEMS.add(helmetAdamantine);
                            ITEMS.add(chestplateAdamantine);
                            ITEMS.add(leggingsAdamantine);
                            ITEMS.add(bootsAdamantine);
                        }
                    }
                    if (GeneralConfig.isToolsEnabled) {
                        if (ToolsConfig.isAdamantineToolsEnabled) {
                            ITEMS.add(swordAdamantine);
                            ITEMS.add(pickaxeAdamantine);
                            ITEMS.add(axeAdamantine);
                            ITEMS.add(shovelAdamantine);
                            ITEMS.add(hoeAdamantine);
                            ITEMS.add(crusherAdamantine);
                        }
                    }
                }
                //aluminum
                if (MineralsConfig.isAluminumEnabled) {
                    ITEMS.add(ingotAluminum);
                    ITEMS.add(nuggetAluminum);
                    ITEMS.add(dustAluminum);

                    if (GeneralConfig.isCraftingEnabled) {
                        if (CraftingConfig.isAluminumCraftingEnabled) {
                            ITEMS.add(gearAluminum);
                            ITEMS.add(plateAluminum);
                            ITEMS.add(rodAluminum);
                            ITEMS.add(tinydustAluminum);
                        }
                    }
                    if (GeneralConfig.isArmorEnabled) {
                        if (ArmorConfig.isAluminumArmorEnabled) {
                            ITEMS.add(helmetAluminum);
                            ITEMS.add(chestplateAluminum);
                            ITEMS.add(leggingsAluminum);
                            ITEMS.add(bootsAluminum);
                        }
                    }
                    if (GeneralConfig.isToolsEnabled) {
                        if (ToolsConfig.isAluminumToolsEnabled) {
                            ITEMS.add(swordAluminum);
                            ITEMS.add(pickaxeAluminum);
                            ITEMS.add(axeAluminum);
                            ITEMS.add(shovelAluminum);
                            ITEMS.add(hoeAluminum);
                            ITEMS.add(crusherAluminum);
                        }
                    }
                }
                //chrome
                if (MineralsConfig.isChromeEnabled) {
                    ITEMS.add(ingotChrome);
                    ITEMS.add(nuggetChrome);
                    ITEMS.add(dustChrome);

                    if (GeneralConfig.isCraftingEnabled) {
                        if (CraftingConfig.isChromeCraftingEnabled) {
                            ITEMS.add(gearChrome);
                            ITEMS.add(plateChrome);
                            ITEMS.add(rodChrome);
                            ITEMS.add(tinydustChrome);
                        }
                    }
                    if (GeneralConfig.isArmorEnabled) {
                        if (ArmorConfig.isChromeArmorEnabled) {
                            ITEMS.add(helmetChrome);
                            ITEMS.add(chestplateChrome);
                            ITEMS.add(leggingsChrome);
                            ITEMS.add(bootsChrome);
                        }
                    }
                    if (GeneralConfig.isToolsEnabled) {
                        if (ToolsConfig.isChromeToolsEnabled) {
                            ITEMS.add(swordChrome);
                            ITEMS.add(pickaxeChrome);
                            ITEMS.add(axeChrome);
                            ITEMS.add(shovelChrome);
                            ITEMS.add(hoeChrome);
                            ITEMS.add(crusherChrome);
                        }
                    }
                }
                //cobalt
                if (MineralsConfig.isCobaltEnabled) {
                    ITEMS.add(ingotCobalt);
                    ITEMS.add(nuggetCobalt);
                    ITEMS.add(dustCobalt);

                    if (GeneralConfig.isCraftingEnabled) {
                        if (CraftingConfig.isCobaltCraftingEnabled) {
                            ITEMS.add(gearCobalt);
                            ITEMS.add(plateCobalt);
                            ITEMS.add(rodCobalt);
                            ITEMS.add(tinydustCobalt);
                        }
                    }
                    if (GeneralConfig.isArmorEnabled) {
                        if (ArmorConfig.isCobaltArmorEnabled) {
                            ITEMS.add(helmetCobalt);
                            ITEMS.add(chestplateCobalt);
                            ITEMS.add(leggingsCobalt);
                            ITEMS.add(bootsCobalt);
                        }
                    }
                    if (GeneralConfig.isToolsEnabled) {
                        if (ToolsConfig.isCobaltToolsEnabled) {
                            ITEMS.add(swordCobalt);
                            ITEMS.add(pickaxeCobalt);
                            ITEMS.add(axeCobalt);
                            ITEMS.add(shovelCobalt);
                            ITEMS.add(hoeCobalt);
                            ITEMS.add(crusherCobalt);
                        }
                    }
                }
                //copper
                if (MineralsConfig.isCopperEnabled) {
                    ITEMS.add(ingotCopper);
                    ITEMS.add(nuggetCopper);
                    ITEMS.add(dustCopper);

                    if (GeneralConfig.isCraftingEnabled) {
                        if (CraftingConfig.isCopperCraftingEnabled) {
                            ITEMS.add(gearCopper);
                            ITEMS.add(plateCopper);
                            ITEMS.add(rodCopper);
                            ITEMS.add(tinydustCopper);
                        }
                    }
                    if (GeneralConfig.isArmorEnabled) {
                        if (ArmorConfig.isCopperArmorEnabled) {
                            ITEMS.add(helmetCopper);
                            ITEMS.add(chestplateCopper);
                            ITEMS.add(leggingsCopper);
                            ITEMS.add(bootsCopper);
                        }
                    }
                    if (GeneralConfig.isToolsEnabled) {
                        if (ToolsConfig.isCopperToolsEnabled) {
                            ITEMS.add(swordCopper);
                            ITEMS.add(pickaxeCopper);
                            ITEMS.add(axeCopper);
                            ITEMS.add(shovelCopper);
                            ITEMS.add(hoeCopper);
                            ITEMS.add(crusherCopper);
                        }
                    }
                }
                //ender
                if (MineralsConfig.isEnderEnabled) {
                    ITEMS.add(ingotEnder);
                    ITEMS.add(nuggetEnder);
                    ITEMS.add(dustEnder);

                    if (GeneralConfig.isCraftingEnabled) {
                        if (CraftingConfig.isEnderCraftingEnabled) {
                            ITEMS.add(gearEnder);
                            ITEMS.add(plateEnder);
                            ITEMS.add(rodEnder);
                            ITEMS.add(tinydustEnder);
                        }
                    }
                    if (GeneralConfig.isArmorEnabled) {
                        if (ArmorConfig.isEnderArmorEnabled) {
                            ITEMS.add(helmetEnder);
                            ITEMS.add(chestplateEnder);
                            ITEMS.add(leggingsEnder);
                            ITEMS.add(bootsEnder);
                        }
                    }
                    if (GeneralConfig.isToolsEnabled) {
                        if (ToolsConfig.isEnderToolsEnabled) {
                            ITEMS.add(swordEnder);
                            ITEMS.add(pickaxeEnder);
                            ITEMS.add(axeEnder);
                            ITEMS.add(shovelEnder);
                            ITEMS.add(hoeEnder);
                            ITEMS.add(crusherEnder);
                        }
                    }
                }
                //iridium
                if (MineralsConfig.isIridiumEnabled) {
                    ITEMS.add(ingotIridium);
                    ITEMS.add(nuggetIridium);
                    ITEMS.add(dustIridium);

                    if (GeneralConfig.isCraftingEnabled) {
                        if (CraftingConfig.isIridiumCraftingEnabled) {
                            ITEMS.add(gearIridium);
                            ITEMS.add(plateIridium);
                            ITEMS.add(rodIridium);
                            ITEMS.add(tinydustIridium);
                        }
                    }
                    if (GeneralConfig.isArmorEnabled) {
                        if (ArmorConfig.isIridiumArmorEnabled) {
                            ITEMS.add(helmetIridium);
                            ITEMS.add(chestplateIridium);
                            ITEMS.add(leggingsIridium);
                            ITEMS.add(bootsIridium);
                        }
                    }
                    if (GeneralConfig.isToolsEnabled) {
                        if (ToolsConfig.isIridiumToolsEnabled) {
                            ITEMS.add(swordIridium);
                            ITEMS.add(pickaxeIridium);
                            ITEMS.add(axeIridium);
                            ITEMS.add(shovelIridium);
                            ITEMS.add(hoeIridium);
                            ITEMS.add(crusherIridium);
                        }
                    }
                }
                //lead
                if (MineralsConfig.isLeadEnabled) {
                    ITEMS.add(ingotLead);
                    ITEMS.add(nuggetLead);
                    ITEMS.add(dustLead);

                    if (GeneralConfig.isCraftingEnabled) {
                        if (CraftingConfig.isLeadCraftingEnabled) {
                            ITEMS.add(gearLead);
                            ITEMS.add(plateLead);
                            ITEMS.add(rodLead);
                            ITEMS.add(tinydustLead);
                        }
                    }
                    if (GeneralConfig.isArmorEnabled) {
                        if (ArmorConfig.isLeadArmorEnabled) {
                            ITEMS.add(helmetLead);
                            ITEMS.add(chestplateLead);
                            ITEMS.add(leggingsLead);
                            ITEMS.add(bootsLead);
                        }
                    }
                    if (GeneralConfig.isToolsEnabled) {
                        if (ToolsConfig.isLeadToolsEnabled) {
                            ITEMS.add(swordLead);
                            ITEMS.add(pickaxeLead);
                            ITEMS.add(axeLead);
                            ITEMS.add(shovelLead);
                            ITEMS.add(hoeLead);
                            ITEMS.add(crusherLead);
                        }
                    }
                }
                //mithril
                if (MineralsConfig.isMithrilEnabled) {
                    ITEMS.add(ingotMithril);
                    ITEMS.add(nuggetMithril);
                    ITEMS.add(dustMithril);

                    if (GeneralConfig.isCraftingEnabled) {
                        if (CraftingConfig.isMithrilCraftingEnabled) {
                            ITEMS.add(gearMithril);
                            ITEMS.add(plateMithril);
                            ITEMS.add(rodMithril);
                            ITEMS.add(tinydustMithril);
                        }
                    }
                    if (GeneralConfig.isArmorEnabled) {
                        if (ArmorConfig.isMithrilArmorEnabled) {
                            ITEMS.add(helmetMithril);
                            ITEMS.add(chestplateMithril);
                            ITEMS.add(leggingsMithril);
                            ITEMS.add(bootsMithril);
                        }
                    }
                    if (GeneralConfig.isToolsEnabled) {
                        if (ToolsConfig.isMithrilToolsEnabled) {
                            ITEMS.add(swordMithril);
                            ITEMS.add(pickaxeMithril);
                            ITEMS.add(axeMithril);
                            ITEMS.add(shovelMithril);
                            ITEMS.add(hoeMithril);
                            ITEMS.add(crusherMithril);
                        }
                    }
                }
                //nickel
                if (MineralsConfig.isNickelEnabled) {
                    ITEMS.add(ingotNickel);
                    ITEMS.add(nuggetNickel);
                    ITEMS.add(dustNickel);

                    if (GeneralConfig.isCraftingEnabled) {
                        if (CraftingConfig.isNickelCraftingEnabled) {
                            ITEMS.add(gearNickel);
                            ITEMS.add(plateNickel);
                            ITEMS.add(rodNickel);
                            ITEMS.add(tinydustNickel);
                        }
                    }
                    if (GeneralConfig.isArmorEnabled) {
                        if (ArmorConfig.isNickelArmorEnabled) {
                            ITEMS.add(helmetNickel);
                            ITEMS.add(chestplateNickel);
                            ITEMS.add(leggingsNickel);
                            ITEMS.add(bootsNickel);
                        }
                    }
                    if (GeneralConfig.isToolsEnabled) {
                        if (ToolsConfig.isNickelToolsEnabled) {
                            ITEMS.add(swordNickel);
                            ITEMS.add(pickaxeNickel);
                            ITEMS.add(axeNickel);
                            ITEMS.add(shovelNickel);
                            ITEMS.add(hoeNickel);
                            ITEMS.add(crusherNickel);
                        }
                    }
                }
                //osmium
                if (MineralsConfig.isOsmiumEnabled) {
                    ITEMS.add(ingotOsmium);
                    ITEMS.add(nuggetOsmium);
                    ITEMS.add(dustOsmium);

                    if (GeneralConfig.isCraftingEnabled) {
                        if (CraftingConfig.isOsmiumCraftingEnabled) {
                            ITEMS.add(gearOsmium);
                            ITEMS.add(plateOsmium);
                            ITEMS.add(rodOsmium);
                            ITEMS.add(tinydustOsmium);
                        }
                    }
                    if (GeneralConfig.isArmorEnabled) {
                        if (ArmorConfig.isOsmiumArmorEnabled) {
                            ITEMS.add(helmetOsmium);
                            ITEMS.add(chestplateOsmium);
                            ITEMS.add(leggingsOsmium);
                            ITEMS.add(bootsOsmium);
                        }
                    }
                    if (GeneralConfig.isToolsEnabled) {
                        if (ToolsConfig.isOsmiumToolsEnabled) {
                            ITEMS.add(swordOsmium);
                            ITEMS.add(pickaxeOsmium);
                            ITEMS.add(axeOsmium);
                            ITEMS.add(shovelOsmium);
                            ITEMS.add(hoeOsmium);
                            ITEMS.add(crusherOsmium);
                        }
                    }
                }
                //platinum
                if (MineralsConfig.isPlatinumEnabled) {
                    ITEMS.add(ingotPlatinum);
                    ITEMS.add(nuggetPlatinum);
                    ITEMS.add(dustPlatinum);

                    if (GeneralConfig.isCraftingEnabled) {
                        if (CraftingConfig.isPlatinumCraftingEnabled) {
                            ITEMS.add(gearPlatinum);
                            ITEMS.add(platePlatinum);
                            ITEMS.add(rodPlatinum);
                            ITEMS.add(tinydustPlatinum);
                        }
                    }
                    if (GeneralConfig.isArmorEnabled) {
                        if (ArmorConfig.isPlatinumArmorEnabled) {
                            ITEMS.add(helmetPlatinum);
                            ITEMS.add(chestplatePlatinum);
                            ITEMS.add(leggingsPlatinum);
                            ITEMS.add(bootsPlatinum);
                        }
                    }
                    if (GeneralConfig.isToolsEnabled) {
                        if (ToolsConfig.isPlatinumToolsEnabled) {
                            ITEMS.add(swordPlatinum);
                            ITEMS.add(pickaxePlatinum);
                            ITEMS.add(axePlatinum);
                            ITEMS.add(shovelPlatinum);
                            ITEMS.add(hoePlatinum);
                            ITEMS.add(crusherPlatinum);
                        }
                    }
                }
                //silver
                if (MineralsConfig.isSilverEnabled) {
                    ITEMS.add(ingotSilver);
                    ITEMS.add(nuggetSilver);
                    ITEMS.add(dustSilver);

                    if (GeneralConfig.isCraftingEnabled) {
                        if (CraftingConfig.isSilverCraftingEnabled) {
                            ITEMS.add(gearSilver);
                            ITEMS.add(plateSilver);
                            ITEMS.add(rodSilver);
                            ITEMS.add(tinydustSilver);
                        }
                    }
                    if (GeneralConfig.isArmorEnabled) {
                        if (ArmorConfig.isSilverArmorEnabled) {
                            ITEMS.add(helmetSilver);
                            ITEMS.add(chestplateSilver);
                            ITEMS.add(leggingsSilver);
                            ITEMS.add(bootsSilver);
                        }
                    }
                    if (GeneralConfig.isToolsEnabled) {
                        if (ToolsConfig.isSilverToolsEnabled) {
                            ITEMS.add(swordSilver);
                            ITEMS.add(pickaxeSilver);
                            ITEMS.add(axeSilver);
                            ITEMS.add(shovelSilver);
                            ITEMS.add(hoeSilver);
                            ITEMS.add(crusherSilver);
                        }
                    }
                }
                //tin
                if (MineralsConfig.isTinEnabled) {
                    ITEMS.add(ingotTin);
                    ITEMS.add(nuggetTin);
                    ITEMS.add(dustTin);

                    if (GeneralConfig.isCraftingEnabled) {
                        if (CraftingConfig.isTinCraftingEnabled) {
                            ITEMS.add(gearTin);
                            ITEMS.add(plateTin);
                            ITEMS.add(rodTin);
                            ITEMS.add(tinydustTin);
                        }
                    }
                    if (GeneralConfig.isArmorEnabled) {
                        if (ArmorConfig.isTinArmorEnabled) {
                            ITEMS.add(helmetTin);
                            ITEMS.add(chestplateTin);
                            ITEMS.add(leggingsTin);
                            ITEMS.add(bootsTin);
                        }
                    }
                    if (GeneralConfig.isToolsEnabled) {
                        if (ToolsConfig.isTinToolsEnabled) {
                            ITEMS.add(swordTin);
                            ITEMS.add(pickaxeTin);
                            ITEMS.add(axeTin);
                            ITEMS.add(shovelTin);
                            ITEMS.add(hoeTin);
                            ITEMS.add(crusherTin);
                        }
                    }
                }
                //titanium
                if (MineralsConfig.isTitaniumEnabled) {
                    ITEMS.add(ingotTitanium);
                    ITEMS.add(nuggetTitanium);
                    ITEMS.add(dustTitanium);

                    if (GeneralConfig.isCraftingEnabled) {
                        if (CraftingConfig.isTitaniumCraftingEnabled) {
                            ITEMS.add(gearTitanium);
                            ITEMS.add(plateTitanium);
                            ITEMS.add(rodTitanium);
                            ITEMS.add(tinydustTitanium);
                        }
                    }
                    if (GeneralConfig.isArmorEnabled) {
                        if (ArmorConfig.isTitaniumArmorEnabled) {
                            ITEMS.add(helmetTitanium);
                            ITEMS.add(chestplateTitanium);
                            ITEMS.add(leggingsTitanium);
                            ITEMS.add(bootsTitanium);
                        }
                    }
                    if (GeneralConfig.isToolsEnabled) {
                        if (ToolsConfig.isTitaniumToolsEnabled) {
                            ITEMS.add(swordTitanium);
                            ITEMS.add(pickaxeTitanium);
                            ITEMS.add(axeTitanium);
                            ITEMS.add(shovelTitanium);
                            ITEMS.add(hoeTitanium);
                            ITEMS.add(crusherTitanium);
                        }
                    }
                }
                //tungsten
                if (MineralsConfig.isTungstenEnabled) {
                    ITEMS.add(ingotTungsten);
                    ITEMS.add(nuggetTungsten);
                    ITEMS.add(dustTungsten);

                    if (GeneralConfig.isCraftingEnabled) {
                        if (CraftingConfig.isTungstenCraftingEnabled) {
                            ITEMS.add(gearTungsten);
                            ITEMS.add(plateTungsten);
                            ITEMS.add(rodTungsten);
                            ITEMS.add(tinydustTungsten);
                        }
                    }
                    if (GeneralConfig.isArmorEnabled) {
                        if (ArmorConfig.isTungstenArmorEnabled) {
                            ITEMS.add(helmetTungsten);
                            ITEMS.add(chestplateTungsten);
                            ITEMS.add(leggingsTungsten);
                            ITEMS.add(bootsTungsten);
                        }
                    }
                    if (GeneralConfig.isToolsEnabled) {
                        if (ToolsConfig.isTungstenToolsEnabled) {
                            ITEMS.add(swordTungsten);
                            ITEMS.add(pickaxeTungsten);
                            ITEMS.add(axeTungsten);
                            ITEMS.add(shovelTungsten);
                            ITEMS.add(hoeTungsten);
                            ITEMS.add(crusherTungsten);
                        }
                    }
                }
                //uranium
                if (MineralsConfig.isUraniumEnabled) {
                    ITEMS.add(ingotUranium);
                    ITEMS.add(nuggetUranium);
                    ITEMS.add(dustUranium);

                    if (GeneralConfig.isCraftingEnabled) {
                        if (CraftingConfig.isUraniumCraftingEnabled) {
                            ITEMS.add(gearUranium);
                            ITEMS.add(plateUranium);
                            ITEMS.add(rodUranium);
                            ITEMS.add(tinydustUranium);
                        }
                    }
                    if (GeneralConfig.isArmorEnabled) {
                        if (ArmorConfig.isUraniumArmorEnabled) {
                            ITEMS.add(helmetUranium);
                            ITEMS.add(chestplateUranium);
                            ITEMS.add(leggingsUranium);
                            ITEMS.add(bootsUranium);
                        }
                    }
                    if (GeneralConfig.isToolsEnabled) {
                        if (ToolsConfig.isUraniumToolsEnabled) {
                            ITEMS.add(swordUranium);
                            ITEMS.add(pickaxeUranium);
                            ITEMS.add(axeUranium);
                            ITEMS.add(shovelUranium);
                            ITEMS.add(hoeUranium);
                            ITEMS.add(crusherUranium);
                        }
                    }
                }
                //zinc
                if (MineralsConfig.isZincEnabled) {
                    ITEMS.add(ingotZinc);
                    ITEMS.add(nuggetZinc);
                    ITEMS.add(dustZinc);

                    if (GeneralConfig.isCraftingEnabled) {
                        if (CraftingConfig.isZincCraftingEnabled) {
                            ITEMS.add(gearZinc);
                            ITEMS.add(plateZinc);
                            ITEMS.add(rodZinc);
                            ITEMS.add(tinydustZinc);
                        }
                    }
                    if (GeneralConfig.isArmorEnabled) {
                        if (ArmorConfig.isZincArmorEnabled) {
                            ITEMS.add(helmetZinc);
                            ITEMS.add(chestplateZinc);
                            ITEMS.add(leggingsZinc);
                            ITEMS.add(bootsZinc);
                        }
                    }
                    if (GeneralConfig.isToolsEnabled) {
                        if (ToolsConfig.isZincToolsEnabled) {
                            ITEMS.add(swordZinc);
                            ITEMS.add(pickaxeZinc);
                            ITEMS.add(axeZinc);
                            ITEMS.add(shovelZinc);
                            ITEMS.add(hoeZinc);
                            ITEMS.add(crusherZinc);
                        }
                    }
                }
                //brass
                if (MineralsConfig.isBrassEnabled) {
                    ITEMS.add(ingotBrass);
                    ITEMS.add(nuggetBrass);
                    ITEMS.add(dustBrass);

                    if (GeneralConfig.isCraftingEnabled) {
                        if (CraftingConfig.isBrassCraftingEnabled) {
                            ITEMS.add(gearBrass);
                            ITEMS.add(plateBrass);
                            ITEMS.add(rodBrass);
                            ITEMS.add(tinydustBrass);
                        }
                    }
                    if (GeneralConfig.isArmorEnabled) {
                        if (ArmorConfig.isBrassArmorEnabled) {
                            ITEMS.add(helmetBrass);
                            ITEMS.add(chestplateBrass);
                            ITEMS.add(leggingsBrass);
                            ITEMS.add(bootsBrass);
                        }
                    }
                    if (GeneralConfig.isToolsEnabled) {
                        if (ToolsConfig.isBrassToolsEnabled) {
                            ITEMS.add(swordBrass);
                            ITEMS.add(pickaxeBrass);
                            ITEMS.add(axeBrass);
                            ITEMS.add(shovelBrass);
                            ITEMS.add(hoeBrass);
                            ITEMS.add(crusherBrass);
                        }
                    }
                }
                //bronze
                if (MineralsConfig.isBronzeEnabled) {
                    ITEMS.add(ingotBronze);
                    ITEMS.add(nuggetBronze);
                    ITEMS.add(dustBronze);

                    if (GeneralConfig.isCraftingEnabled) {
                        if (CraftingConfig.isBronzeCraftingEnabled) {
                            ITEMS.add(gearBronze);
                            ITEMS.add(plateBronze);
                            ITEMS.add(rodBronze);
                            ITEMS.add(tinydustBronze);
                        }
                    }
                    if (GeneralConfig.isArmorEnabled) {
                        if (ArmorConfig.isBronzeArmorEnabled) {
                            ITEMS.add(helmetBronze);
                            ITEMS.add(chestplateBronze);
                            ITEMS.add(leggingsBronze);
                            ITEMS.add(bootsBronze);
                        }
                    }
                    if (GeneralConfig.isToolsEnabled) {
                        if (ToolsConfig.isBronzeToolsEnabled) {
                            ITEMS.add(swordBronze);
                            ITEMS.add(pickaxeBronze);
                            ITEMS.add(axeBronze);
                            ITEMS.add(shovelBronze);
                            ITEMS.add(hoeBronze);
                            ITEMS.add(crusherBronze);
                        }
                    }
                }
                //electrum
                if (MineralsConfig.isElectrumEnabled) {
                    ITEMS.add(ingotElectrum);
                    ITEMS.add(nuggetElectrum);
                    ITEMS.add(dustElectrum);

                    if (GeneralConfig.isCraftingEnabled) {
                        if (CraftingConfig.isElectrumCraftingEnabled) {
                            ITEMS.add(gearElectrum);
                            ITEMS.add(plateElectrum);
                            ITEMS.add(rodElectrum);
                            ITEMS.add(tinydustElectrum);
                        }
                    }
                    if (GeneralConfig.isArmorEnabled) {
                        if (ArmorConfig.isElectrumArmorEnabled) {
                            ITEMS.add(helmetElectrum);
                            ITEMS.add(chestplateElectrum);
                            ITEMS.add(leggingsElectrum);
                            ITEMS.add(bootsElectrum);
                        }
                    }
                    if (GeneralConfig.isToolsEnabled) {
                        if (ToolsConfig.isElectrumToolsEnabled) {
                            ITEMS.add(swordElectrum);
                            ITEMS.add(pickaxeElectrum);
                            ITEMS.add(axeElectrum);
                            ITEMS.add(shovelElectrum);
                            ITEMS.add(hoeElectrum);
                            ITEMS.add(crusherElectrum);
                        }
                    }
                }
                //fairy
                if (MineralsConfig.isFairyEnabled) {
                    ITEMS.add(ingotFairy);
                    ITEMS.add(nuggetFairy);
                    ITEMS.add(dustFairy);

                    if (GeneralConfig.isCraftingEnabled) {
                        if (CraftingConfig.isFairyCraftingEnabled) {
                            ITEMS.add(gearFairy);
                            ITEMS.add(plateFairy);
                            ITEMS.add(rodFairy);
                            ITEMS.add(tinydustFairy);
                        }
                    }
                    if (GeneralConfig.isArmorEnabled) {
                        if (ArmorConfig.isFairyArmorEnabled) {
                            ITEMS.add(helmetFairy);
                            ITEMS.add(chestplateFairy);
                            ITEMS.add(leggingsFairy);
                            ITEMS.add(bootsFairy);
                        }
                    }
                    if (GeneralConfig.isToolsEnabled) {
                        if (ToolsConfig.isFairyToolsEnabled) {
                            ITEMS.add(swordFairy);
                            ITEMS.add(pickaxeFairy);
                            ITEMS.add(axeFairy);
                            ITEMS.add(shovelFairy);
                            ITEMS.add(hoeFairy);
                            ITEMS.add(crusherFairy);
                        }
                    }
                }
                //invar
                if (MineralsConfig.isInvarEnabled) {
                    ITEMS.add(ingotInvar);
                    ITEMS.add(nuggetInvar);
                    ITEMS.add(dustInvar);

                    if (GeneralConfig.isCraftingEnabled) {
                        if (CraftingConfig.isInvarCraftingEnabled) {
                            ITEMS.add(gearInvar);
                            ITEMS.add(plateInvar);
                            ITEMS.add(rodInvar);
                            ITEMS.add(tinydustInvar);
                        }
                    }
                    if (GeneralConfig.isArmorEnabled) {
                        if (ArmorConfig.isInvarArmorEnabled) {
                            ITEMS.add(helmetInvar);
                            ITEMS.add(chestplateInvar);
                            ITEMS.add(leggingsInvar);
                            ITEMS.add(bootsInvar);
                        }
                    }
                    if (GeneralConfig.isToolsEnabled) {
                        if (ToolsConfig.isInvarToolsEnabled) {
                            ITEMS.add(swordInvar);
                            ITEMS.add(pickaxeInvar);
                            ITEMS.add(axeInvar);
                            ITEMS.add(shovelInvar);
                            ITEMS.add(hoeInvar);
                            ITEMS.add(crusherInvar);
                        }
                    }
                }
                //steel
                if (MineralsConfig.isSteelEnabled) {
                    ITEMS.add(ingotSteel);
                    ITEMS.add(nuggetSteel);
                    ITEMS.add(dustSteel);

                    if (GeneralConfig.isCraftingEnabled) {
                        if (CraftingConfig.isSteelCraftingEnabled) {
                            ITEMS.add(gearSteel);
                            ITEMS.add(plateSteel);
                            ITEMS.add(rodSteel);
                            ITEMS.add(tinydustSteel);
                        }
                    }
                    if (GeneralConfig.isArmorEnabled) {
                        if (ArmorConfig.isSteelArmorEnabled) {
                            ITEMS.add(helmetSteel);
                            ITEMS.add(chestplateSteel);
                            ITEMS.add(leggingsSteel);
                            ITEMS.add(bootsSteel);
                        }
                    }
                    if (GeneralConfig.isToolsEnabled) {
                        if (ToolsConfig.isSteelToolsEnabled) {
                            ITEMS.add(swordSteel);
                            ITEMS.add(pickaxeSteel);
                            ITEMS.add(axeSteel);
                            ITEMS.add(shovelSteel);
                            ITEMS.add(hoeSteel);
                            ITEMS.add(crusherSteel);
                        }
                    }
                }
                //voidborn
                if (MineralsConfig.isVoidBornEnabled) {
                    ITEMS.add(ingotVoidBorn);
                    ITEMS.add(nuggetVoidBorn);
                    ITEMS.add(dustVoidBorn);

                    if (GeneralConfig.isCraftingEnabled) {
                        if (CraftingConfig.isVoidBornCraftingEnabled) {
                            ITEMS.add(gearVoidBorn);
                            ITEMS.add(plateVoidBorn);
                            ITEMS.add(rodVoidBorn);
                            ITEMS.add(tinydustVoidBorn);
                        }
                    }
                    if (GeneralConfig.isArmorEnabled) {
                        if (ArmorConfig.isVoidBornArmorEnabled) {
                            ITEMS.add(helmetVoidBorn);
                            ITEMS.add(chestplateVoidBorn);
                            ITEMS.add(leggingsVoidBorn);
                            ITEMS.add(bootsVoidBorn);
                        }
                    }
                    if (GeneralConfig.isToolsEnabled) {
                        if (ToolsConfig.isVoidBornToolsEnabled) {
                            ITEMS.add(swordVoidBorn);
                            ITEMS.add(pickaxeVoidBorn);
                            ITEMS.add(axeVoidBorn);
                            ITEMS.add(shovelVoidBorn);
                            ITEMS.add(hoeVoidBorn);
                            ITEMS.add(crusherVoidBorn);
                        }
                    }
                }
                //thermal series
                if (ModCompatConfig.isThermalEnabled){
                    //constantan
                    if (MineralsConfig.isConstantanEnabled) {
                        ITEMS.add(ingotConstantan);
                        ITEMS.add(nuggetConstantan);
                        ITEMS.add(dustConstantan);

                        if (GeneralConfig.isCraftingEnabled) {
                            if (CraftingConfig.isConstantanCraftingEnabled) {
                                ITEMS.add(gearConstantan);
                                ITEMS.add(plateConstantan);
                                ITEMS.add(rodConstantan);
                                ITEMS.add(tinydustConstantan);
                            }
                        }
                        if (GeneralConfig.isArmorEnabled) {
                            if (ArmorConfig.isConstantanArmorEnabled) {
                                ITEMS.add(helmetConstantan);
                                ITEMS.add(chestplateConstantan);
                                ITEMS.add(leggingsConstantan);
                                ITEMS.add(bootsConstantan);
                            }
                        }
                        if (GeneralConfig.isToolsEnabled) {
                            if (ToolsConfig.isConstantanToolsEnabled) {
                                ITEMS.add(swordConstantan);
                                ITEMS.add(pickaxeConstantan);
                                ITEMS.add(axeConstantan);
                                ITEMS.add(shovelConstantan);
                                ITEMS.add(hoeConstantan);
                                ITEMS.add(crusherConstantan);
                            }
                        }
                    }
                    //enderium
                    if (MineralsConfig.isEnderiumEnabled) {
                        ITEMS.add(ingotEnderium);
                        ITEMS.add(nuggetEnderium);
                        ITEMS.add(dustEnderium);

                        if (GeneralConfig.isCraftingEnabled) {
                            if (CraftingConfig.isEnderiumCraftingEnabled) {
                                ITEMS.add(gearEnderium);
                                ITEMS.add(plateEnderium);
                                ITEMS.add(rodEnderium);
                                ITEMS.add(tinydustEnderium);
                            }
                        }
                        if (GeneralConfig.isArmorEnabled) {
                            if (ArmorConfig.isEnderiumArmorEnabled) {
                                ITEMS.add(helmetEnderium);
                                ITEMS.add(chestplateEnderium);
                                ITEMS.add(leggingsEnderium);
                                ITEMS.add(bootsEnderium);
                            }
                        }
                        if (GeneralConfig.isToolsEnabled) {
                            if (ToolsConfig.isEnderiumToolsEnabled) {
                                ITEMS.add(swordEnderium);
                                ITEMS.add(pickaxeEnderium);
                                ITEMS.add(axeEnderium);
                                ITEMS.add(shovelEnderium);
                                ITEMS.add(hoeEnderium);
                                ITEMS.add(crusherEnderium);
                            }
                        }
                    }
                    //lumium
                    if (MineralsConfig.isLumiumEnabled) {
                        ITEMS.add(ingotLumium);
                        ITEMS.add(nuggetLumium);
                        ITEMS.add(dustLumium);

                        if (GeneralConfig.isCraftingEnabled) {
                            if (CraftingConfig.isLumiumCraftingEnabled) {
                                ITEMS.add(gearLumium);
                                ITEMS.add(plateLumium);
                                ITEMS.add(rodLumium);
                                ITEMS.add(tinydustLumium);
                            }
                        }
                        if (GeneralConfig.isArmorEnabled) {
                            if (ArmorConfig.isLumiumArmorEnabled) {
                                ITEMS.add(helmetLumium);
                                ITEMS.add(chestplateLumium);
                                ITEMS.add(leggingsLumium);
                                ITEMS.add(bootsLumium);
                            }
                        }
                        if (GeneralConfig.isToolsEnabled) {
                            if (ToolsConfig.isLumiumToolsEnabled) {
                                ITEMS.add(swordLumium);
                                ITEMS.add(pickaxeLumium);
                                ITEMS.add(axeLumium);
                                ITEMS.add(shovelLumium);
                                ITEMS.add(hoeLumium);
                                ITEMS.add(crusherLumium);
                            }
                        }
                    }
                    //signalum
                    if (MineralsConfig.isSignalumEnabled) {
                        ITEMS.add(ingotSignalum);
                        ITEMS.add(nuggetSignalum);
                        ITEMS.add(dustSignalum);

                        if (GeneralConfig.isCraftingEnabled) {
                            if (CraftingConfig.isSignalumCraftingEnabled) {
                                ITEMS.add(gearSignalum);
                                ITEMS.add(plateSignalum);
                                ITEMS.add(rodSignalum);
                                ITEMS.add(tinydustSignalum);
                            }
                        }
                        if (GeneralConfig.isArmorEnabled) {
                            if (ArmorConfig.isSignalumArmorEnabled) {
                                ITEMS.add(helmetSignalum);
                                ITEMS.add(chestplateSignalum);
                                ITEMS.add(leggingsSignalum);
                                ITEMS.add(bootsSignalum);
                            }
                        }
                        if (GeneralConfig.isToolsEnabled) {
                            if (ToolsConfig.isSignalumToolsEnabled) {
                                ITEMS.add(swordSignalum);
                                ITEMS.add(pickaxeSignalum);
                                ITEMS.add(axeSignalum);
                                ITEMS.add(shovelSignalum);
                                ITEMS.add(hoeSignalum);
                                ITEMS.add(crusherSignalum);
                            }
                        }
                    }
                }
                //tinkers construct
                if (ModCompatConfig.isTinkersEnabled){
                    //ardite
                    if (MineralsConfig.isArditeEnabled) {
                        ITEMS.add(ingotArdite);
                        ITEMS.add(nuggetArdite);
                        ITEMS.add(dustArdite);

                        if (GeneralConfig.isCraftingEnabled) {
                            if (CraftingConfig.isArditeCraftingEnabled) {
                                ITEMS.add(gearArdite);
                                ITEMS.add(plateArdite);
                                ITEMS.add(rodArdite);
                                ITEMS.add(tinydustArdite);
                            }
                        }
                        if (GeneralConfig.isArmorEnabled) {
                            if (ArmorConfig.isArditeArmorEnabled) {
                                ITEMS.add(helmetArdite);
                                ITEMS.add(chestplateArdite);
                                ITEMS.add(leggingsArdite);
                                ITEMS.add(bootsArdite);
                            }
                        }
                        if (GeneralConfig.isToolsEnabled) {
                            if (ToolsConfig.isArditeToolsEnabled) {
                                ITEMS.add(swordArdite);
                                ITEMS.add(pickaxeArdite);
                                ITEMS.add(axeArdite);
                                ITEMS.add(shovelArdite);
                                ITEMS.add(hoeArdite);
                                ITEMS.add(crusherArdite);
                            }
                        }
                    }
                    //knightslime
                    if (MineralsConfig.isKnightSlimeEnabled) {
                        ITEMS.add(ingotKnightSlime);
                        ITEMS.add(nuggetKnightSlime);
                        ITEMS.add(dustKnightSlime);

                        if (GeneralConfig.isCraftingEnabled) {
                            if (CraftingConfig.isKnightSlimeCraftingEnabled) {
                                ITEMS.add(gearKnightSlime);
                                ITEMS.add(plateKnightSlime);
                                ITEMS.add(rodKnightSlime);
                                ITEMS.add(tinydustKnightSlime);
                            }
                        }
                        if (GeneralConfig.isArmorEnabled) {
                            if (ArmorConfig.isKnightSlimeArmorEnabled) {
                                ITEMS.add(helmetKnightSlime);
                                ITEMS.add(chestplateKnightSlime);
                                ITEMS.add(leggingsKnightSlime);
                                ITEMS.add(bootsKnightSlime);
                            }
                        }
                        if (GeneralConfig.isToolsEnabled) {
                            if (ToolsConfig.isKnightSlimeToolsEnabled) {
                                ITEMS.add(swordKnightSlime);
                                ITEMS.add(pickaxeKnightSlime);
                                ITEMS.add(axeKnightSlime);
                                ITEMS.add(shovelKnightSlime);
                                ITEMS.add(hoeKnightSlime);
                                ITEMS.add(crusherKnightSlime);
                            }
                        }
                    }
                    //manyullyn
                    if (MineralsConfig.isManyullynEnabled) {
                        ITEMS.add(ingotManyullyn);
                        ITEMS.add(nuggetManyullyn);
                        ITEMS.add(dustManyullyn);

                        if (GeneralConfig.isCraftingEnabled) {
                            if (CraftingConfig.isManyullynCraftingEnabled) {
                                ITEMS.add(gearManyullyn);
                                ITEMS.add(plateManyullyn);
                                ITEMS.add(rodManyullyn);
                                ITEMS.add(tinydustManyullyn);
                            }
                        }
                        if (GeneralConfig.isArmorEnabled) {
                            if (ArmorConfig.isManyullynArmorEnabled) {
                                ITEMS.add(helmetManyullyn);
                                ITEMS.add(chestplateManyullyn);
                                ITEMS.add(leggingsManyullyn);
                                ITEMS.add(bootsManyullyn);
                            }
                        }
                        if (GeneralConfig.isToolsEnabled) {
                            if (ToolsConfig.isManyullynToolsEnabled) {
                                ITEMS.add(swordManyullyn);
                                ITEMS.add(pickaxeManyullyn);
                                ITEMS.add(axeManyullyn);
                                ITEMS.add(shovelManyullyn);
                                ITEMS.add(hoeManyullyn);
                                ITEMS.add(crusherManyullyn);
                            }
                        }
                    }
                    //pigiron
                    if (MineralsConfig.isPigIronEnabled) {
                        ITEMS.add(ingotPigIron);
                        ITEMS.add(nuggetPigIron);
                        ITEMS.add(dustPigIron);

                        if (GeneralConfig.isCraftingEnabled) {
                            if (CraftingConfig.isPigIronCraftingEnabled) {
                                ITEMS.add(gearPigIron);
                                ITEMS.add(platePigIron);
                                ITEMS.add(rodPigIron);
                                ITEMS.add(tinydustPigIron);
                            }
                        }
                        if (GeneralConfig.isArmorEnabled) {
                            if (ArmorConfig.isPigIronArmorEnabled) {
                                ITEMS.add(helmetPigIron);
                                ITEMS.add(chestplatePigIron);
                                ITEMS.add(leggingsPigIron);
                                ITEMS.add(bootsPigIron);
                            }
                        }
                        if (GeneralConfig.isToolsEnabled) {
                            if (ToolsConfig.isPigIronToolsEnabled) {
                                ITEMS.add(swordPigIron);
                                ITEMS.add(pickaxePigIron);
                                ITEMS.add(axePigIron);
                                ITEMS.add(shovelPigIron);
                                ITEMS.add(hoePigIron);
                                ITEMS.add(crusherPigIron);
                            }
                        }
                    }
                }
            }
            //gems
            if (GeneralConfig.isGemsEnabled){
                //amethyst
                if (MineralsConfig.isAmethystEnabled) {
                    ITEMS.add(gemAmethyst);
                    ITEMS.add(nuggetAmethyst);
                    ITEMS.add(dustAmethyst);

                    if (GeneralConfig.isCraftingEnabled) {
                        if (CraftingConfig.isAmethystCraftingEnabled) {
                            ITEMS.add(gearAmethyst);
                            ITEMS.add(plateAmethyst);
                            ITEMS.add(rodAmethyst);
                            ITEMS.add(tinydustAmethyst);
                        }
                    }
                    if (GeneralConfig.isArmorEnabled) {
                        if (ArmorConfig.isAmethystArmorEnabled) {
                            ITEMS.add(helmetAmethyst);
                            ITEMS.add(chestplateAmethyst);
                            ITEMS.add(leggingsAmethyst);
                            ITEMS.add(bootsAmethyst);
                        }
                    }
                    if (GeneralConfig.isToolsEnabled) {
                        if (ToolsConfig.isAmethystToolsEnabled) {
                            ITEMS.add(swordAmethyst);
                            ITEMS.add(pickaxeAmethyst);
                            ITEMS.add(axeAmethyst);
                            ITEMS.add(shovelAmethyst);
                            ITEMS.add(hoeAmethyst);
                            ITEMS.add(crusherAmethyst);
                        }
                    }
                }
                //garnet
                if (MineralsConfig.isGarnetEnabled) {
                    ITEMS.add(gemGarnet);
                    ITEMS.add(nuggetGarnet);
                    ITEMS.add(dustGarnet);

                    if (GeneralConfig.isCraftingEnabled) {
                        if (CraftingConfig.isGarnetCraftingEnabled) {
                            ITEMS.add(gearGarnet);
                            ITEMS.add(plateGarnet);
                            ITEMS.add(rodGarnet);
                            ITEMS.add(tinydustGarnet);
                        }
                    }
                    if (GeneralConfig.isArmorEnabled) {
                        if (ArmorConfig.isGarnetArmorEnabled) {
                            ITEMS.add(helmetGarnet);
                            ITEMS.add(chestplateGarnet);
                            ITEMS.add(leggingsGarnet);
                            ITEMS.add(bootsGarnet);
                        }
                    }
                    if (GeneralConfig.isToolsEnabled) {
                        if (ToolsConfig.isGarnetToolsEnabled) {
                            ITEMS.add(swordGarnet);
                            ITEMS.add(pickaxeGarnet);
                            ITEMS.add(axeGarnet);
                            ITEMS.add(shovelGarnet);
                            ITEMS.add(hoeGarnet);
                            ITEMS.add(crusherGarnet);
                        }
                    }
                }
//                //nephrite
//                if (MineralsConfig.isNephriteEnabled) {
//                    ITEMS.add(gemNephrite);
//                    ITEMS.add(nuggetNephrite);
//                    ITEMS.add(dustNephrite);
//
//                    if (GeneralConfig.isCraftingEnabled) {
//                        if (CraftingConfig.isNephriteCraftingEnabled) {
//                            ITEMS.add(gearNephrite);
//                            ITEMS.add(plateNephrite);
//                            ITEMS.add(rodNephrite);
//                            ITEMS.add(tinydustNephrite);
//                        }
//                    }
//                    if (GeneralConfig.isArmorEnabled) {
//                        if (ArmorConfig.isNephriteArmorEnabled) {
//                            ITEMS.add(helmetNephrite);
//                            ITEMS.add(chestplateNephrite);
//                            ITEMS.add(leggingsNephrite);
//                            ITEMS.add(bootsNephrite);
//                        }
//                    }
//                    if (GeneralConfig.isToolsEnabled) {
//                        if (ToolsConfig.isNephriteToolsEnabled) {
//                            ITEMS.add(swordNephrite);
//                            ITEMS.add(pickaxeNephrite);
//                            ITEMS.add(axeNephrite);
//                            ITEMS.add(shovelNephrite);
//                            ITEMS.add(hoeNephrite);
//                            ITEMS.add(crusherNephrite);
//                        }
//                    }
//                }
                //opal
                if (MineralsConfig.isOpalEnabled) {
                    ITEMS.add(gemOpal);
                    ITEMS.add(nuggetOpal);
                    ITEMS.add(dustOpal);

                    if (GeneralConfig.isCraftingEnabled) {
                        if (CraftingConfig.isOpalCraftingEnabled) {
                            ITEMS.add(gearOpal);
                            ITEMS.add(plateOpal);
                            ITEMS.add(rodOpal);
                            ITEMS.add(tinydustOpal);
                        }
                    }
                    if (GeneralConfig.isArmorEnabled) {
                        if (ArmorConfig.isOpalArmorEnabled) {
                            ITEMS.add(helmetOpal);
                            ITEMS.add(chestplateOpal);
                            ITEMS.add(leggingsOpal);
                            ITEMS.add(bootsOpal);
                        }
                    }
                    if (GeneralConfig.isToolsEnabled) {
                        if (ToolsConfig.isOpalToolsEnabled) {
                            ITEMS.add(swordOpal);
                            ITEMS.add(pickaxeOpal);
                            ITEMS.add(axeOpal);
                            ITEMS.add(shovelOpal);
                            ITEMS.add(hoeOpal);
                            ITEMS.add(crusherOpal);
                        }
                    }
                }
                //pearl
                if (MineralsConfig.isPearlEnabled) {
                    ITEMS.add(gemPearl);
                    ITEMS.add(nuggetPearl);
                    ITEMS.add(dustPearl);

                    if (GeneralConfig.isCraftingEnabled) {
                        if (CraftingConfig.isPearlCraftingEnabled) {
                            ITEMS.add(gearPearl);
                            ITEMS.add(platePearl);
                            ITEMS.add(rodPearl);
                            ITEMS.add(tinydustPearl);
                        }
                    }
                    if (GeneralConfig.isArmorEnabled) {
                        if (ArmorConfig.isPearlArmorEnabled) {
                            ITEMS.add(helmetPearl);
                            ITEMS.add(chestplatePearl);
                            ITEMS.add(leggingsPearl);
                            ITEMS.add(bootsPearl);
                        }
                    }
                    if (GeneralConfig.isToolsEnabled) {
                        if (ToolsConfig.isPearlToolsEnabled) {
                            ITEMS.add(swordPearl);
                            ITEMS.add(pickaxePearl);
                            ITEMS.add(axePearl);
                            ITEMS.add(shovelPearl);
                            ITEMS.add(hoePearl);
                            ITEMS.add(crusherPearl);
                        }
                    }
                }
                //peridot
                if (MineralsConfig.isPeridotEnabled) {
                    ITEMS.add(gemPeridot);
                    ITEMS.add(nuggetPeridot);
                    ITEMS.add(dustPeridot);

                    if (GeneralConfig.isCraftingEnabled) {
                        if (CraftingConfig.isPeridotCraftingEnabled) {
                            ITEMS.add(gearPeridot);
                            ITEMS.add(platePeridot);
                            ITEMS.add(rodPeridot);
                            ITEMS.add(tinydustPeridot);
                        }
                    }
                    if (GeneralConfig.isArmorEnabled) {
                        if (ArmorConfig.isPeridotArmorEnabled) {
                            ITEMS.add(helmetPeridot);
                            ITEMS.add(chestplatePeridot);
                            ITEMS.add(leggingsPeridot);
                            ITEMS.add(bootsPeridot);
                        }
                    }
                    if (GeneralConfig.isToolsEnabled) {
                        if (ToolsConfig.isPeridotToolsEnabled) {
                            ITEMS.add(swordPeridot);
                            ITEMS.add(pickaxePeridot);
                            ITEMS.add(axePeridot);
                            ITEMS.add(shovelPeridot);
                            ITEMS.add(hoePeridot);
                            ITEMS.add(crusherPeridot);
                        }
                    }
                }
                //ruby
                if (MineralsConfig.isRubyEnabled) {
                    ITEMS.add(gemRuby);
                    ITEMS.add(nuggetRuby);
                    ITEMS.add(dustRuby);

                    if (GeneralConfig.isCraftingEnabled) {
                        if (CraftingConfig.isRubyCraftingEnabled) {
                            ITEMS.add(gearRuby);
                            ITEMS.add(plateRuby);
                            ITEMS.add(rodRuby);
                            ITEMS.add(tinydustRuby);
                        }
                    }
                    if (GeneralConfig.isArmorEnabled) {
                        if (ArmorConfig.isRubyArmorEnabled) {
                            ITEMS.add(helmetRuby);
                            ITEMS.add(chestplateRuby);
                            ITEMS.add(leggingsRuby);
                            ITEMS.add(bootsRuby);
                        }
                    }
                    if (GeneralConfig.isToolsEnabled) {
                        if (ToolsConfig.isRubyToolsEnabled) {
                            ITEMS.add(swordRuby);
                            ITEMS.add(pickaxeRuby);
                            ITEMS.add(axeRuby);
                            ITEMS.add(shovelRuby);
                            ITEMS.add(hoeRuby);
                            ITEMS.add(crusherRuby);
                        }
                    }
                }
                //sapphire
                if (MineralsConfig.isSapphireEnabled) {
                    ITEMS.add(gemSapphire);
                    ITEMS.add(nuggetSapphire);
                    ITEMS.add(dustSapphire);

                    if (GeneralConfig.isCraftingEnabled) {
                        if (CraftingConfig.isSapphireCraftingEnabled) {
                            ITEMS.add(gearSapphire);
                            ITEMS.add(plateSapphire);
                            ITEMS.add(rodSapphire);
                            ITEMS.add(tinydustSapphire);
                        }
                    }
                    if (GeneralConfig.isArmorEnabled) {
                        if (ArmorConfig.isSapphireArmorEnabled) {
                            ITEMS.add(helmetSapphire);
                            ITEMS.add(chestplateSapphire);
                            ITEMS.add(leggingsSapphire);
                            ITEMS.add(bootsSapphire);
                        }
                    }
                    if (GeneralConfig.isToolsEnabled) {
                        if (ToolsConfig.isSapphireToolsEnabled) {
                            ITEMS.add(swordSapphire);
                            ITEMS.add(pickaxeSapphire);
                            ITEMS.add(axeSapphire);
                            ITEMS.add(shovelSapphire);
                            ITEMS.add(hoeSapphire);
                            ITEMS.add(crusherSapphire);
                        }
                    }
                }
            }
            //elements
            if (GeneralConfig.isElementsEnabled){
                //carbon
                if (MineralsConfig.isCarbonEnabled) {
                    ITEMS.add(elementCarbon);
                    ITEMS.add(nuggetCarbon);
                    ITEMS.add(dustCarbon);

                    if (GeneralConfig.isCraftingEnabled) {
                        if (CraftingConfig.isCarbonCraftingEnabled) {
                            ITEMS.add(gearCarbon);
                            ITEMS.add(plateCarbon);
                            ITEMS.add(rodCarbon);
                            ITEMS.add(tinydustCarbon);
                        }
                    }
                }
                //cinnabar
                if (MineralsConfig.isCinnabarEnabled) {
                    ITEMS.add(elementCinnabar);
                    ITEMS.add(nuggetCinnabar);
                    ITEMS.add(dustCinnabar);

                    if (GeneralConfig.isCraftingEnabled) {
                        if (CraftingConfig.isCinnabarCraftingEnabled) {
                            ITEMS.add(gearCinnabar);
                            ITEMS.add(plateCinnabar);
                            ITEMS.add(rodCinnabar);
                            ITEMS.add(tinydustCinnabar);
                        }
                    }
                }
                //mercury
                if (MineralsConfig.isMercuryEnabled) {
                    ITEMS.add(elementMercury);
                    ITEMS.add(nuggetMercury);
                    ITEMS.add(dustMercury);

                    if (GeneralConfig.isCraftingEnabled) {
                        if (CraftingConfig.isMercuryCraftingEnabled) {
                            ITEMS.add(gearMercury);
                            ITEMS.add(plateMercury);
                            ITEMS.add(rodMercury);
                            ITEMS.add(tinydustMercury);
                        }
                    }
                }
                //silicon
                if (MineralsConfig.isSiliconEnabled) {
                    ITEMS.add(elementSilicon);
                    ITEMS.add(nuggetSilicon);
                    ITEMS.add(dustSilicon);

                    if (GeneralConfig.isCraftingEnabled) {
                        if (CraftingConfig.isSiliconCraftingEnabled) {
                            ITEMS.add(gearSilicon);
                            ITEMS.add(plateSilicon);
                            ITEMS.add(rodSilicon);
                            ITEMS.add(tinydustSilicon);
                        }
                    }
                }
                //sulphur
                if (MineralsConfig.isSulfurEnabled) {
                    ITEMS.add(elementSulfur);
                    ITEMS.add(nuggetSulfur);
                    ITEMS.add(dustSulfur);

                    if (GeneralConfig.isCraftingEnabled) {
                        if (CraftingConfig.isSulfurCraftingEnabled) {
                            ITEMS.add(gearSulfur);
                            ITEMS.add(plateSulfur);
                            ITEMS.add(rodSulfur);
                            ITEMS.add(tinydustSulfur);
                        }
                    }
                }
            }
            //vanilla additions
            if (GeneralConfig.isVanillaEnabled){
                //charcoal
                if (MineralsConfig.isCharcoalEnabled) {
                    ITEMS.add(nuggetCharcoal);
                    ITEMS.add(dustCharcoal);

                    if (GeneralConfig.isCraftingEnabled) {
                        if (CraftingConfig.isCharcoalCraftingEnabled) {
                            ITEMS.add(gearCharcoal);
                            ITEMS.add(plateCharcoal);
                            ITEMS.add(rodCharcoal);
                            ITEMS.add(tinydustCharcoal);
                        }
                    }
                    //charcoalium
                    if (MineralsConfig.isCharcoaliumEnabled) {
                        ITEMS.add(ingotCharcoalium);
                        ITEMS.add(nuggetCharcoalium);
                        ITEMS.add(dustCharcoalium);

                        if (GeneralConfig.isCraftingEnabled) {
                            if (CraftingConfig.isCharcoaliumCraftingEnabled) {
                                ITEMS.add(gearCharcoalium);
                                ITEMS.add(plateCharcoalium);
                                ITEMS.add(rodCharcoalium);
                                ITEMS.add(tinydustCharcoalium);
                            }
                        }
                        if (GeneralConfig.isArmorEnabled) {
                            if (ArmorConfig.isCharcoaliumArmorEnabled) {
                                ITEMS.add(helmetCharcoalium);
                                ITEMS.add(chestplateCharcoalium);
                                ITEMS.add(leggingsCharcoalium);
                                ITEMS.add(bootsCharcoalium);
                            }
                        }
                        if (GeneralConfig.isToolsEnabled) {
                            if (ToolsConfig.isCharcoaliumToolsEnabled) {
                                ITEMS.add(swordCharcoalium);
                                ITEMS.add(pickaxeCharcoalium);
                                ITEMS.add(axeCharcoalium);
                                ITEMS.add(shovelCharcoalium);
                                ITEMS.add(hoeCharcoalium);
                                ITEMS.add(crusherCharcoalium);

                            }
                        }
                    }
                }
                //coal
                if (MineralsConfig.isCoalEnabled) {
                    ITEMS.add(nuggetCoal);
                    ITEMS.add(dustCoal);

                    if (GeneralConfig.isCraftingEnabled) {
                        if (CraftingConfig.isCoalCraftingEnabled) {
                            ITEMS.add(gearCoal);
                            ITEMS.add(plateCoal);
                            ITEMS.add(rodCoal);
                            ITEMS.add(tinydustCoal);
                        }
                    }
                    //coalium
                    if (MineralsConfig.isCoaliumEnabled) {
                        ITEMS.add(ingotCoalium);
                        ITEMS.add(nuggetCoalium);
                        ITEMS.add(dustCoalium);

                        if (GeneralConfig.isCraftingEnabled) {
                            if (CraftingConfig.isCoaliumCraftingEnabled) {
                                ITEMS.add(gearCoalium);
                                ITEMS.add(plateCoalium);
                                ITEMS.add(rodCoalium);
                                ITEMS.add(tinydustCoalium);
                            }
                        }
                        if (GeneralConfig.isArmorEnabled) {
                            if (ArmorConfig.isCoaliumArmorEnabled) {
                                ITEMS.add(helmetCoalium);
                                ITEMS.add(chestplateCoalium);
                                ITEMS.add(leggingsCoalium);
                                ITEMS.add(bootsCoalium);
                            }
                        }
                        if (GeneralConfig.isToolsEnabled) {
                            if (ToolsConfig.isCoaliumToolsEnabled) {
                                ITEMS.add(swordCoalium);
                                ITEMS.add(pickaxeCoalium);
                                ITEMS.add(axeCoalium);
                                ITEMS.add(shovelCoalium);
                                ITEMS.add(hoeCoalium);
                                ITEMS.add(crusherCoalium);
                            }
                        }
                    }
                }
                //diamond
                if (MineralsConfig.isDiamondEnabled) {
                    ITEMS.add(nuggetDiamond);
                    ITEMS.add(dustDiamond);

                    if (GeneralConfig.isCraftingEnabled) {
                        if (CraftingConfig.isDiamondCraftingEnabled) {
                            ITEMS.add(gearDiamond);
                            ITEMS.add(plateDiamond);
                            ITEMS.add(rodDiamond);
                            ITEMS.add(tinydustDiamond);
                        }
                    }
                }
                //emerald
                if (MineralsConfig.isEmeraldEnabled) {
                    ITEMS.add(nuggetEmerald);
                    ITEMS.add(dustEmerald);

                    if (GeneralConfig.isCraftingEnabled) {
                        if (CraftingConfig.isEmeraldCraftingEnabled) {
                            ITEMS.add(gearEmerald);
                            ITEMS.add(plateEmerald);
                            ITEMS.add(rodEmerald);
                            ITEMS.add(tinydustEmerald);
                        }
                    }
                }
                //glowize
                if (MineralsConfig.isGlowizeEnabled) {
                    ITEMS.add(ingotGlowize);
                    ITEMS.add(nuggetGlowize);
                    ITEMS.add(dustGlowize);

                    if (GeneralConfig.isCraftingEnabled) {
                        if (CraftingConfig.isGlowizeCraftingEnabled) {
                            ITEMS.add(gearGlowize);
                            ITEMS.add(plateGlowize);
                            ITEMS.add(rodGlowize);
                            ITEMS.add(tinydustGlowize);
                        }
                    }
//                    if (GeneralConfig.isArmorEnabled) {
//                        if (ArmorConfig.isGlowizeArmorEnabled) {
//                            ITEMS.add(helmetGlowize);
//                            ITEMS.add(chestplateGlowize);
//                            ITEMS.add(leggingsGlowize);
//                            ITEMS.add(bootsGlowize);
//                        }
//                    }
//                    if (GeneralConfig.isToolsEnabled) {
//                        if (ToolsConfig.isGlowizeToolsEnabled) {
//                            ITEMS.add(swordGlowize);
//                            ITEMS.add(pickaxeGlowize);
//                            ITEMS.add(axeGlowize);
//                            ITEMS.add(shovelGlowize);
//                            ITEMS.add(hoeGlowize);
//                            ITEMS.add(crusherGlowize);
//                        }
//                    }
                }
                //gold
                if (MineralsConfig.isGoldEnabled) {
                    ITEMS.add(dustGold);

                    if (GeneralConfig.isCraftingEnabled) {
                        if (CraftingConfig.isGoldCraftingEnabled) {
                            ITEMS.add(gearGold);
                            ITEMS.add(plateGold);
                            ITEMS.add(rodGold);
                            ITEMS.add(tinydustGold);
                        }
                    }
                }
                //iron
                if (MineralsConfig.isIronEnabled) {
                    ITEMS.add(dustIron);

                    if (GeneralConfig.isCraftingEnabled) {
                        if (CraftingConfig.isIronCraftingEnabled) {
                            ITEMS.add(gearIron);
                            ITEMS.add(plateIron);
                            ITEMS.add(rodIron);
                            ITEMS.add(tinydustIron);
                        }
                    }
                }
                //lapis
                if (MineralsConfig.isLapisEnabled) {
                    ITEMS.add(nuggetLapis);
                    ITEMS.add(dustLapis);

                    if (GeneralConfig.isCraftingEnabled) {
                        if (CraftingConfig.isLapisCraftingEnabled) {
                            ITEMS.add(gearLapis);
                            ITEMS.add(plateLapis);
                            ITEMS.add(rodLapis);
                            ITEMS.add(tinydustLapis);
                        }
                    }
                    //lapite
                    if (MineralsConfig.isLapiteEnabled) {
                        ITEMS.add(ingotLapite);
                        ITEMS.add(nuggetLapite);
                        ITEMS.add(dustLapite);

                        if (GeneralConfig.isCraftingEnabled) {
                            if (CraftingConfig.isLapiteCraftingEnabled) {
                                ITEMS.add(gearLapite);
                                ITEMS.add(plateLapite);
                                ITEMS.add(rodLapite);
                                ITEMS.add(tinydustLapite);
                            }
                        }
//                        if (GeneralConfig.isArmorEnabled) {
//                            if (ArmorConfig.isLapiteArmorEnabled) {
//                                ITEMS.add(helmetLapite);
//                                ITEMS.add(chestplateLapite);
//                                ITEMS.add(leggingsLapite);
//                                ITEMS.add(bootsLapite);
//                            }
//                        }
//                        if (GeneralConfig.isToolsEnabled) {
//                            if (ToolsConfig.isLapiteToolsEnabled) {
//                                ITEMS.add(swordLapite);
//                                ITEMS.add(pickaxeLapite);
//                                ITEMS.add(axeLapite);
//                                ITEMS.add(shovelLapite);
//                                ITEMS.add(hoeLapite);
//                                ITEMS.add(crusherLapite);
//                            }
//                        }
                    }
                }
                //quartz
                if (MineralsConfig.isQuartzEnabled) {
                    ITEMS.add(nuggetQuartz);
                    ITEMS.add(dustQuartz);

                    if (GeneralConfig.isCraftingEnabled) {
                        if (CraftingConfig.isQuartzCraftingEnabled) {
                            ITEMS.add(gearQuartz);
                            ITEMS.add(plateQuartz);
                            ITEMS.add(rodQuartz);
                            ITEMS.add(tinydustQuartz);
                        }
                    }
                    //quartzium
                    if (MineralsConfig.isQuartziumEnabled) {
                        ITEMS.add(ingotQuartzium);
                        ITEMS.add(nuggetQuartzium);
                        ITEMS.add(dustQuartzium);

                        if (GeneralConfig.isCraftingEnabled) {
                            if (CraftingConfig.isQuartziumCraftingEnabled) {
                                ITEMS.add(gearQuartzium);
                                ITEMS.add(plateQuartzium);
                                ITEMS.add(rodQuartzium);
                                ITEMS.add(tinydustQuartzium);
                            }
                        }
//                        if (GeneralConfig.isArmorEnabled) {
//                            if (ArmorConfig.isQuartziumArmorEnabled) {
//                                ITEMS.add(helmetQuartzium);
//                                ITEMS.add(chestplateQuartzium);
//                                ITEMS.add(leggingsQuartzium);
//                                ITEMS.add(bootsQuartzium);
//                            }
//                        }
//                        if (GeneralConfig.isToolsEnabled) {
//                            if (ToolsConfig.isQuartziumToolsEnabled) {
//                                ITEMS.add(swordQuartzium);
//                                ITEMS.add(pickaxeQuartzium);
//                                ITEMS.add(axeQuartzium);
//                                ITEMS.add(shovelQuartzium);
//                                ITEMS.add(hoeQuartzium);
//                                ITEMS.add(crusherQuartzium);
//                            }
//                        }
                    }
                }
            }
            if (GeneralConfig.isSillyStuffEnabled){
                ITEMS.add(weezerWeezer);
            }
        }

        ITEMS.add(creativeIcon1);
        ITEMS.add(creativeIcon2);
        ITEMS.add(creativeIcon3);
        ITEMS.add(creativeIcon4);
        ITEMS.add(creativeIcon5);
        ITEMS.add(creativeIcon6);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){
        for (Item item : ITEMS) {
            event.getRegistry().register(item);
//            ItemModelHandler.assignCategory(item);
//            ItemModelHandler.assignMaterial(item);
        }
    }

//    @SubscribeEvent
//    public static void registerRenders(ModelRegistryEvent event){
//        for (Item item : ITEMS) {
//            ItemModelHandler.onModelRegister(event);
////            registerRender(item);
//        }
//    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        for (Item item : ITEMS) {
//            ItemModelHandler.registerItemModel(item);
        }
    }

    public static void generateItemJsons() {
        for (Item item : ITEMS) {
            String jsonContent = String.format(
                    "{\n" +
                    " \"parent\": \"item/handheld\",\n" +
                    " \"textures\": {\n" +
                    "  \"layer0\": \"oreinamillion:items/%s\"\n" +
                    " }\n" +
                    "}",
                    item.getRegistryName()
            );

            File file = new File("resources/assets/oreinamillion/models/item/" + item.getRegistryName() + ".json");
            try (FileWriter writer = new FileWriter(file)) {
                writer.write(jsonContent);
            } catch (IOException e) {
                System.err.println("Error generating JSON model for " + item.getRegistryName());
            }
        }
    }

    public static void initOreDict() {
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
            System.err.println("Item '" + item + "' could not be added to the OreDict");
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
            case "ore":
                oreDictAdd.add("ore" + itemName);
                oreDictAdd.add("ore");
                oreDictAdd.add("Ore");
                break;
            case "sword":
                oreDictAdd.add("sword" + itemName);
                oreDictAdd.add("sword");
                oreDictAdd.add("oreSword");
                break;
            case "pickaxe":
                oreDictAdd.add("pickaxe" + itemName);
                oreDictAdd.add("pickaxe");
                oreDictAdd.add("orePickaxe");
                break;
            case "axe":
                oreDictAdd.add("axe" + itemName);
                oreDictAdd.add("axe");
                oreDictAdd.add("oreAxe");
                break;
            case "shovel":
                oreDictAdd.add("shovel" + itemName);
                oreDictAdd.add("shovel");
                oreDictAdd.add("oreShovel");
                break;
            case "hoe":
                oreDictAdd.add("hoe" + itemName);
                oreDictAdd.add("hoe");
                oreDictAdd.add("oreHoe");
                break;
            case "crusher":
                oreDictAdd.add("crusher" + itemName);
                oreDictAdd.add("crusher");
                oreDictAdd.add("oreCrusher");
                break;
            case "helmet":
                oreDictAdd.add("helmet" + itemName);
                oreDictAdd.add("helmet");
                oreDictAdd.add("oreHelmet");
                break;
            case "chestplate":
                oreDictAdd.add("chestplate" + itemName);
                oreDictAdd.add("chestplate");
                oreDictAdd.add("oreChestplate");
                break;
            case "leggings":
                oreDictAdd.add("leggings" + itemName);
                oreDictAdd.add("leggings");
                oreDictAdd.add("oreLeggings");
                break;
            case "boots":
                oreDictAdd.add("boots" + itemName);
                oreDictAdd.add("boots");
                oreDictAdd.add("oreBoots");
                break;
            default:
                System.err.println("Unknown item type: '" + itemType + "'");
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