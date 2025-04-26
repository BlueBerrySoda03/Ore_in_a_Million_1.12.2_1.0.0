//package com.blueberrysoda.oreinamillion.util;
//
//import com.blueberrysoda.oreinamillion.util.enumerations.ItemType;
//import com.blueberrysoda.oreinamillion.util.enumerations.MaterialType;
//import net.minecraft.client.renderer.block.model.ModelResourceLocation;
//import net.minecraft.item.Item;
//import net.minecraft.util.ResourceLocation;
//import net.minecraftforge.client.event.ColorHandlerEvent;
//import net.minecraftforge.client.event.ModelRegistryEvent;
//import net.minecraftforge.client.model.ModelLoader;
//import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Objects;
//
//public class ItemModelHandler {
//
//    private static final Map<Item, ItemType> ItemTypeMap = new HashMap<>();
//    private static final Map<Item, MaterialType> MaterialTypeMap = new HashMap<>();
//
////    public static String extractKeywordFromRegistryName(String registryName) {
////        // Ensure it parses both "iron" and "gear" correctly
////        String[] parts = registryName.split("[_:]");
////        for (String part : parts) {
////            // Materials
////            if (part.equalsIgnoreCase("gold") || part.equalsIgnoreCase("iron") || part.equalsIgnoreCase("copper")) {
////                return part.toLowerCase();
////            }
////            // Types
////            if (part.equalsIgnoreCase("ingot") || part.equalsIgnoreCase("gear") || part.equalsIgnoreCase("dust")) {
////                return part.toLowerCase();
////            }
////        }
////        return "unknown"; // Default case
////    }
//
//    public static String extractKeywordFromRegistryName(String registryName) {
//        String[] parts = registryName.split("[_:]");
//        for (String part : parts) {
//            switch (part.toLowerCase()) {
//                // Materials
//                case "adamantine":
//                case "gold":
//                case "iron":
//                case "copper":
//                    return part;
//                // Types
//                case "ingot":
//                case "nugget":
//                case "dust":
//                case "gear":
//                case "plate":
//                case "rod":
//                case "tiny":
//                case "helmet":
//                case "chestplate":
//                case "leggings":
//                case "boots":
//                case "sword":
//                case "pickaxe":
//                case "axe":
//                case "shovel":
//                case "hoe":
//                case "crusher":
//                    return part;
//            }
//        }
//        return "unknown";
//    }
//
//    public static void assignMaterial(Item item) {
//        ResourceLocation registryName = item.getRegistryName();
//        if (registryName != null) {
//            System.out.println("Assigning material for: " + registryName);
//            String name = registryName.toString();
//
//
//            MaterialType material = null;
//            switch (extractKeywordFromRegistryName(name)) {
////                case "adamantine":
////                    material = MaterialType.Adamantine;
////                    break;
//                case "copper":
//                    material = MaterialType.Copper;
//                    break;
//                case "gold":
//                    material = MaterialType.Gold;
//                    break;
//                case "iron":
//                    material = MaterialType.Iron;
//                    break;
//                default:
//                    material = null;
//                    System.out.println("Error assigning material for:" + item.getRegistryName());
//                    break;
//            }
//
//            if (material != null) MaterialTypeMap.put(item, material);
//            System.out.println("Assigned material: '" + material + "' to item '" + name + "'");
//        }
//    }
//
//    public static void assignCategory(Item item) {
//        ResourceLocation registryName = item.getRegistryName();
//        if (registryName != null) {
//            System.out.println("Assigning category for: " + registryName);
//            String name = registryName.toString();
//
//            ItemType type = null;
//            switch (extractKeywordFromRegistryName(name)) {
////            switch (Objects.requireNonNull(extractKeywordFromRegistryName(String.valueOf(registryName)))) {
//                case "ingot":
//                    type = ItemType.Ingot;
//                    break;
//                case "nugget":
//                    type = ItemType.Nugget;
//                    break;
//                case "dust":
//                    type = ItemType.Dust;
//                    break;
//                case "gear":
//                    type = ItemType.Gear;
//                    break;
//                case "plate":
//                    type = ItemType.Plate;
//                    break;
//                case "rod":
//                    type = ItemType.Rod;
//                    break;
//                case "tiny":
//                    type = ItemType.TinyDust;
//                    break;
//                case "helmet":
//                    type = ItemType.Helmet;
//                    break;
//                case "chestplate":
//                    type = ItemType.Chestplate;
//                    break;
//                case "leggings":
//                    type = ItemType.Leggings;
//                    break;
//                case "boots":
//                    type = ItemType.Boots;
//                    break;
//                case "sword":
//                    type = ItemType.Sword;
//                    break;
//                case "pickaxe":
//                    type = ItemType.Pickaxe;
//                    break;
//                case "axe":
//                    type = ItemType.Axe;
//                    break;
//                case "shovel":
//                    type = ItemType.Shovel;
//                    break;
//                case "hoe":
//                    type = ItemType.Hoe;
//                    break;
//                case "crusher":
//                    type = ItemType.Crusher;
//                    break;
//                default:
//                    type = null;
//                    System.out.println("Error assigning category for:" + item.getRegistryName());
//                    break;
//            }
//
//            if (type != null) ItemTypeMap.put(item, type);
//            System.out.println("Assigned category: '" + type + "' to item '" + name + "'");
//        }
//    }
//
//    @SubscribeEvent
//    public static void onModelRegister(ModelRegistryEvent event) {
//        for (Item item : ItemTypeMap.keySet()) {
//            ItemType type = ItemTypeMap.get(item);
//            if (type != null) {
//                String texturePath = type.getTexturePath();
//                System.out.println("Registering model for: " + item.getRegistryName() + " -> Texture Path: " + texturePath);
//                ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(texturePath, "inventory"));
//            }
//        }
//    }
//
//    @SubscribeEvent
//    public static void registerItemColors(ColorHandlerEvent.Item event) {
//        event.getItemColors().registerItemColorHandler((stack, tintIndex) -> {
//            MaterialType material = MaterialTypeMap.get(stack.getItem());
//            return material != null ? material.getColor() : 0xFFFFFF;
//        }, MaterialTypeMap.keySet().toArray(new Item[0]));
//    }
//
//    public static void registerItemModel(Item item)
//    {
//        ResourceLocation registryName = item.getRegistryName();
//        ItemType type = ItemTypeMap.get(item);
//        MaterialType material = MaterialTypeMap.get(item);
//        if (type != null && material != null) {
//            System.out.println("Item type found: " + type + ", " + registryName + " -> Texture Path: " + type.getTexturePath());
//            ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Objects.requireNonNull(type.getTexturePath()), "inventory"));
//        } else {
//            System.out.println("Item type missing. Defaulting to registry name for: " + item.getRegistryName());
//            ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Objects.requireNonNull(item.getRegistryName()), "inventory"));
//        }
//    }
//}
