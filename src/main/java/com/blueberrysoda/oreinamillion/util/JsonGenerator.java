package com.blueberrysoda.oreinamillion.util;

import com.blueberrysoda.oreinamillion.util.enumerations.BlockType;
import com.blueberrysoda.oreinamillion.util.enumerations.ItemType;
import com.blueberrysoda.oreinamillion.util.enumerations.MaterialType;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JsonGenerator {
    private static final String basePathItemModels = new File("z-assets").getAbsolutePath() + "/models/item/";
    private static final String basePathBlockModels = new File("z-assets").getAbsolutePath() + "/models/block/";
    private static final String basePathBlockStates = new File("z-assets").getAbsolutePath() + "/blockstates/";

    public static void main(String[] args) {
        for (MaterialType material : MaterialType.values()) {
            for (ItemType type : ItemType.values()) {
                switch (material.getTextureTint()) {
                    case TextureLighter:
                        generateBaseItemLighterJsonFile(material, type);
                        break;
                    case TextureDarker:
                        generateBaseItemDarkerJsonFile(material, type);
                        break;
                    default:
                        generateBaseItemJsonFile(material, type);
                        break;
                }
            }
        }
        for (MaterialType material : MaterialType.values()) {
            for (BlockType type : BlockType.values()) {
                switch (material.getTextureTint()) {
                    case TextureLighter:
                        generateBaseBlockModelLighterJsonFile(material, type);
                        generateBaseBlockItemModelJsonFile(material, type);
                        generateBaseBlockBlockstateJsonFile(material, type);
                        break;
                    case TextureDarker:
                        generateBaseBlockModelDarkerJsonFile(material, type);
                        generateBaseBlockItemModelJsonFile(material, type);
                        generateBaseBlockBlockstateJsonFile(material, type);
                        break;
                    default:
                        generateBaseBlockModelJsonFile(material, type);
                        generateBaseBlockItemModelJsonFile(material, type);
                        generateBaseBlockBlockstateJsonFile(material, type);
                        break;
                }
            }
        }
    }

    private static void generateBaseItemJsonFile(MaterialType material, ItemType type) {
        String filename = basePathItemModels + material.name().toLowerCase() + "_" + type.name().toLowerCase() + ".json";
        filename = filename.replace("\\", "/");
        File file = new File(filename);


        File parentDir = file.getParentFile();
        if (!parentDir.exists()) {
            parentDir.mkdirs();
        }

        String jsonContent = "{\n" +
                "    \"parent\": \"oreinamillion:item/base/" + type.name().toLowerCase() + "_base" + "\"\n" +
                "}";

        try (FileWriter writer = new FileWriter(file)) {
            writer.write(jsonContent);
            System.out.println("Generated: " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void generateBaseItemLighterJsonFile(MaterialType material, ItemType type) {
        String filename = basePathItemModels + material.name().toLowerCase() + "_" + type.name().toLowerCase() + ".json";
        filename = filename.replace("\\", "/");
        File file = new File(filename);


        File parentDir = file.getParentFile();
        if (!parentDir.exists()) {
            parentDir.mkdirs();
        }

        String jsonContent = "{\n" +
                "    \"parent\": \"oreinamillion:item/base/" + type.name().toLowerCase() + "_base_light" + "\"\n" +
                "}";

        try (FileWriter writer = new FileWriter(file)) {
            writer.write(jsonContent);
            System.out.println("Generated: " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void generateBaseItemDarkerJsonFile(MaterialType material, ItemType type) {
        String filename = basePathItemModels + material.name().toLowerCase() + "_" + type.name().toLowerCase() + ".json";
        filename = filename.replace("\\", "/");
        File file = new File(filename);


        File parentDir = file.getParentFile();
        if (!parentDir.exists()) {
            parentDir.mkdirs();
        }

        String jsonContent = "{\n" +
                "    \"parent\": \"oreinamillion:item/base/" + type.name().toLowerCase() + "_base_dark" + "\"\n" +
                "}";

        try (FileWriter writer = new FileWriter(file)) {
            writer.write(jsonContent);
            System.out.println("Generated: " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void generateBaseBlockModelJsonFile(MaterialType material, BlockType type) {
        String filename = basePathBlockModels + material.name().toLowerCase() + "_" + type.name().toLowerCase() + ".json";
        File file = new File(filename);

        File parentDir = file.getParentFile();
        if (!parentDir.exists()) {
            parentDir.mkdirs();
        }

        String jsonContent = "{\n" +
                "    \"parent\": \"oreinamillion:block/base/" + type.name().toLowerCase() + "_base" + "\"\n" +
                "}";

        try (FileWriter writer = new FileWriter(file)) {
            writer.write(jsonContent);
            System.out.println("Generated: " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void generateBaseBlockModelLighterJsonFile(MaterialType material, BlockType type) {
        String filename = basePathBlockModels + material.name().toLowerCase() + "_" + type.name().toLowerCase() + ".json";
        File file = new File(filename);

        File parentDir = file.getParentFile();
        if (!parentDir.exists()) {
            parentDir.mkdirs();
        }

        String jsonContent = "{\n" +
                "    \"parent\": \"oreinamillion:block/base/" + type.name().toLowerCase() + "_base_light" + "\"\n" +
                "}";

        try (FileWriter writer = new FileWriter(file)) {
            writer.write(jsonContent);
            System.out.println("Generated: " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void generateBaseBlockModelDarkerJsonFile(MaterialType material, BlockType type) {
        String filename = basePathBlockModels + material.name().toLowerCase() + "_" + type.name().toLowerCase() + ".json";
        File file = new File(filename);

        File parentDir = file.getParentFile();
        if (!parentDir.exists()) {
            parentDir.mkdirs();
        }

        String jsonContent = "{\n" +
                "    \"parent\": \"oreinamillion:block/base/" + type.name().toLowerCase() + "_base_dark" + "\"\n" +
                "}";

        try (FileWriter writer = new FileWriter(file)) {
            writer.write(jsonContent);
            System.out.println("Generated: " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void generateBaseBlockItemModelJsonFile(MaterialType material, BlockType type) {
        String filename = basePathItemModels + material.name().toLowerCase() + "_" + type.name().toLowerCase() + ".json";
        File file = new File(filename);

        File parentDir = file.getParentFile();
        if (!parentDir.exists()) {
            parentDir.mkdirs();
        }

        String jsonContent = "{\n" +
                "    \"parent\": \"oreinamillion:block/" + material.name().toLowerCase() + "_" + type.name().toLowerCase() + "\"\n" +
                "}";

        try (FileWriter writer = new FileWriter(file)) {
            writer.write(jsonContent);
            System.out.println("Generated: " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void generateBaseBlockBlockstateJsonFile(MaterialType material, BlockType type) {
        String filename = basePathBlockStates + material.name().toLowerCase() + "_" + type.name().toLowerCase() + ".json";
        File file = new File(filename);

        File parentDir = file.getParentFile();
        if (!parentDir.exists()) {
            parentDir.mkdirs();
        }

        String jsonContent = "{\n" +
                "    \"variants\": {\n" +
                "        \"normal\": { \"model\": \"oreinamillion:" + material.name().toLowerCase() + "_" + type.name().toLowerCase() + "\" }\n" +
                "    }\n" +
                "}";

        try (FileWriter writer = new FileWriter(file)) {
            writer.write(jsonContent);
            System.out.println("Generated: " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
