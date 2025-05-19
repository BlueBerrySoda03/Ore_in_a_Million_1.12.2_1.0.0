package com.blueberrysoda.oreinamillion.init;

import com.blueberrysoda.oreinamillion.items.armor.ItemArmorBase;
import com.blueberrysoda.oreinamillion.items.base.ItemBaseExp;
import com.blueberrysoda.oreinamillion.items.materials.MaterialArmor;
import com.blueberrysoda.oreinamillion.items.materials.MaterialTool;
import com.blueberrysoda.oreinamillion.items.tools.basetools.*;
import com.blueberrysoda.oreinamillion.util.enumerations.Categories;
import com.blueberrysoda.oreinamillion.util.enumerations.ItemType;
import com.blueberrysoda.oreinamillion.util.enumerations.MaterialType;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.oredict.OreDictionary;

import java.util.*;

@Mod.EventBusSubscriber
public class ModItemsExp {

    public static final Map<String, Item> ITEMS = new LinkedHashMap<>();

    private static final Map<Categories, Set<ItemType>> exclusionMap = new HashMap<>();

    static {
        exclusionMap.put(Categories.Base, EnumSet.of(ItemType.Gem, ItemType.Element));
        exclusionMap.put(Categories.Gem, EnumSet.of(ItemType.Element, ItemType.Ingot));
        exclusionMap.put(Categories.Element, EnumSet.of(ItemType.Gem, ItemType.Ingot));
        exclusionMap.put(Categories.Alloy, EnumSet.of(ItemType.Gem, ItemType.Element));
        exclusionMap.put(Categories.VanillaTooless, EnumSet.of(ItemType.Ingot, ItemType.Gem, ItemType.Element,
        ItemType.Sword, ItemType.Pickaxe, ItemType.Axe, ItemType.Hoe, ItemType.Shovel, ItemType.Helmet, ItemType.Chestplate,
                ItemType.Leggings, ItemType.Boots));
        exclusionMap.put(Categories.VanillaTool, EnumSet.of(ItemType.Gem, ItemType.Element));
    }

    private static final Set<String> exclusionList = new HashSet<>(Arrays.asList(
            "iron_ingot", "gold_ingot", "iron_nugget", "gold_nugget", "wood_ingot",
            "stone_ingot", "diamond_ingot", "iron_gem", "iron_element", "redstone_dust",
            "glowstone_dust"
    ));

    public static void init() {
        for (MaterialType material : MaterialType.values()) {
            for (ItemType type : ItemType.values()) {
                String itemName = material.name().toLowerCase() + "_" + type.name().toLowerCase();


                if (exclusionMap.containsKey(material.getCategory()) && exclusionMap.get(material.getCategory()).contains(type)) {
                    System.err.println("Skipping item registration: " + itemName);
                    continue;
                }

                if (exclusionList.contains(itemName)) {
                    System.err.println("Skipping item registration: " + itemName);
                    continue;
                }

                Item item = null;

                switch (type.getCategory()) {
                    case Sword:
                        item = new ItemToolSword(itemName, material.getToolMaterial(), type.getCreativeTab(), false);
                        item.setCreativeTab(type.getCreativeTab());
                        ITEMS.put(itemName, item);
                        break;
                    case Pickaxe:
                        item = new ItemToolPickaxe(itemName, material.getToolMaterial(), type.getCreativeTab(), false);
                        item.setCreativeTab(type.getCreativeTab());
                        ITEMS.put(itemName, item);
                        break;
                    case Axe:
                        item = new ItemToolAxe(itemName, material.getToolMaterial(), type.getCreativeTab(), false);
                        item.setCreativeTab(type.getCreativeTab());
                        ITEMS.put(itemName, item);
                        break;
                    case Shovel:
                        item = new ItemToolShovel(itemName, material.getToolMaterial(), type.getCreativeTab(), false);
                        item.setCreativeTab(type.getCreativeTab());
                        ITEMS.put(itemName, item);
                        break;
                    case Hoe:
                        item = new ItemToolHoe(itemName, material.getToolMaterial(), type.getCreativeTab(), false);
                        item.setCreativeTab(type.getCreativeTab());
                        ITEMS.put(itemName, item);
                        break;
                    case Hammer:
                        item = new ItemToolHammer(itemName, material.getToolMaterial(), type.getCreativeTab(), false);
                        item.setCreativeTab(type.getCreativeTab());
                        ITEMS.put(itemName, item);
                        break;
                    case Helmet:
                        item = new ItemArmorBase(itemName, MaterialArmor.armorEnder, 1, EntityEquipmentSlot.HEAD, type.getCreativeTab(), false);
                        item.setCreativeTab(type.getCreativeTab());
                        ITEMS.put(itemName, item);
                        break;
                    case Chestplate:
                        item = new ItemArmorBase(itemName, MaterialArmor.armorEnder, 1, EntityEquipmentSlot.CHEST, type.getCreativeTab(), false);
                        item.setCreativeTab(type.getCreativeTab());
                        ITEMS.put(itemName, item);
                        break;
                    case Leggings:
                        item = new ItemArmorBase(itemName, MaterialArmor.armorEnder, 2, EntityEquipmentSlot.LEGS, type.getCreativeTab(), false);
                        item.setCreativeTab(type.getCreativeTab());
                        ITEMS.put(itemName, item);
                        break;
                    case Boots:
                        item = new ItemArmorBase(itemName, MaterialArmor.armorEnder, 1, EntityEquipmentSlot.FEET, type.getCreativeTab(), false);
                        item.setCreativeTab(type.getCreativeTab());
                        ITEMS.put(itemName, item);
                        break;
                    default:
                        item = new ItemBaseExp(itemName);
                        item.setCreativeTab(type.getCreativeTab());
                        ITEMS.put(itemName, item);
                        break;
                }

                ITEMS.put(itemName, item);
            }
        }
    }

    public static MaterialType getMaterialType(String name) {
        for (MaterialType material : MaterialType.values()) {
            if (material.name().equalsIgnoreCase(name)) {
                return material;
            }
        }
        throw new IllegalArgumentException("Invalid material type: " + name);
    }

    @SubscribeEvent
    public static void registerItemColors(ColorHandlerEvent.Item event) {
        ItemColors itemColors = event.getItemColors();

        for (Map.Entry<String, Item> entry : ITEMS.entrySet()) {
            String itemName = entry.getKey();
            Item item = entry.getValue();

            String materialName = itemName.split("_")[0];
            MaterialType materialType;

            try {
                materialType = getMaterialType(materialName);
            } catch (IllegalArgumentException e) {
                System.err.println("Error: Unknown material type '" + materialName + "'");
                continue;
            }
            itemColors.registerItemColorHandler((stack, tintIndex) -> tintIndex == 0 ? materialType.getColor() : -1, item);
        }
//        for (Map.Entry<String, Item> entry : ITEMS.entrySet()) {
//            Item item = entry.getValue();
//
//            if (item instanceof ItemArmorBase) {
//                itemColors.registerItemColorHandler((stack, tintIndex) -> {
//                    MaterialType materialType = MaterialType.fromItemStack(stack);
//                    return materialType != null && tintIndex == 1 ? materialType.getColor() : -1;
//                }, item);
//
//            }
//        }
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        for (Item item : ITEMS.values()) {
            event.getRegistry().register(item);
        }
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
        for (Item item : ITEMS.values()) {
            registerRender(item);
        }
    }

    public static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Objects.requireNonNull(item.getRegistryName()), "inventory"));
    }

    public static void initOreDict() {
        for (Item item : ITEMS.values()) {
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
        String itemType = String.join("_", Arrays.copyOfRange(parts, 1, parts.length));

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
            case "tiny_dust":
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
            case "dirty_dust":
                oreDictAdd.add("dirtyDust" + itemName);
                oreDictAdd.add("dirtyDust");
                oreDictAdd.add("oreDirtyDust");
                break;
            case "tiny_dirty_dust":
                oreDictAdd.add("dirtyDustTiny" + itemName);
                oreDictAdd.add("dirtyDustTiny");
                oreDictAdd.add("oreDirtyDustTiny");
                oreDictAdd.add("dirtyTinyDust" + itemName);
                oreDictAdd.add("dirtyTinyDust");
                oreDictAdd.add("oreDirtyTinyDust");
                oreDictAdd.add("dirtyDustSmall" + itemName);
                oreDictAdd.add("dirtyDustSmall");
                oreDictAdd.add("oreDirtyDustSmall");
                oreDictAdd.add("dirtySmallDust" + itemName);
                oreDictAdd.add("dirtySmallDust");
                oreDictAdd.add("oreDirtySmallDust");
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
