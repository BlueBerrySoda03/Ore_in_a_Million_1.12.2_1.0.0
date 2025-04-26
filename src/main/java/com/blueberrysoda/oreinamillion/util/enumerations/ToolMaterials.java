package com.blueberrysoda.oreinamillion.util.enumerations;

public enum ToolMaterials {

    Wood(0, 59, 2.0F, 1.0F, 15, "wood", 0x8B5A2B),
    Stone(1, 131, 4.0F, 1.5F, 5, "stone", 0xA0A0A0),
    Iron(2, 250, 6.0F, 2.0F, 14, "iron", 0xD8D8D8),
    Gold(0, 32, 12.0F, 0.9F, 22, "gold", 0xFFD700),
    Diamond(3, 1561, 8.0F, 2.5F, 10, "diamond", 0x33FFE3),
    Emerald(3, 1561, 8.0F, 2.8F, 13, "emerald", 0x00A000);


    private final int HarvestLevel;
    private final int Durability;
    private final float MiningSpeed;
    private final float Damage;
    private final int Enchantability;
    private final String TextureName;
    private final int Color;


    ToolMaterials(int harvestLevel, int durability, float miningSpeed, float damage, int enchantability, String textureName, int color) {
        this.HarvestLevel = harvestLevel;
        this.Durability = durability;
        this.MiningSpeed = miningSpeed;
        this.Damage = damage;
        this.Enchantability = enchantability;
        this.TextureName = textureName;
        this.Color = color;
    }

    public float getDamage() {
        return this.Damage;
    }

    public int getDurability() {
        return this.Durability;
    }

    public int getEnchantability() {
        return this.Enchantability;
    }

    public float getMiningSpeed() {
        return this.MiningSpeed;
    }

    public int getHarvestLevel() {
        return this.HarvestLevel;
    }

    public String getTextureName() {
        return this.TextureName;
    }

    public int getColor() {
        return this.Color;
    }
}
