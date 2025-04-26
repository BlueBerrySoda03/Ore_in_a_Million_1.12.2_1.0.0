package com.blueberrysoda.oreinamillion.util;

import com.blueberrysoda.oreinamillion.util.enumerations.ItemType;
import com.blueberrysoda.oreinamillion.util.enumerations.MaterialType;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JsonGenerator {
    private static final String basePath = new File("z-itemjsons").getAbsolutePath() + "/";

    public static void main(String[] args) {
        for (MaterialType material : MaterialType.values()) {
            for (ItemType type : ItemType.values()) {
                generateJsonFile(material, type);
            }
        }
    }

    private static void generateJsonFile(MaterialType material, ItemType type) {
        String filename = basePath + material.name().toLowerCase() + "_" + type.name().toLowerCase() + ".json";
        filename = filename.replace("\\", "/");
        File file = new File(filename);


        File parentDir = file.getParentFile();
        if (!parentDir.exists()) {
            parentDir.mkdirs();
        }

        String jsonContent = "{\n" +
                "    \"parent\": \"oreinamillion:item/base/" + type.name().toLowerCase() + "_base" + "\",\n" +
                "    \"textures\": {\n" +
                "        \"layer0\": \"oreinamillion:items/base/" + type.name().toLowerCase() + "_base" + "\"\n" +
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
