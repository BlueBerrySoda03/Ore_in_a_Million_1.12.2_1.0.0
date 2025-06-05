package com.blueberrysoda.oreinamillion.config.ConfigHelper;

import net.minecraftforge.common.config.Configuration;

public class OreWorldConfig {

    private final int size;
    private final int spawnChance;
    private final int minHeight;
    private final int maxHeight;

    public OreWorldConfig(Configuration configuration, String name, int size, int spawnChance, int minHeight, int maxHeight) {
        this.size = configuration.get(name, "size", size, "Amount of ore to generate").getInt();
        this.spawnChance = configuration.get(name, "spawnChance", spawnChance, "Number of chances for ore to generate (1 = disable)").getInt();
        this.minHeight = configuration.get(name, "minHeight", minHeight, "Minimum Y level").getInt();
        this.maxHeight = configuration.get(name, "maxHeight", maxHeight, "Maximum Y level").getInt();
    }

    public int getSize() {
        return size;
    }

    public int getSpawnChance() {
        return spawnChance;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }
}
