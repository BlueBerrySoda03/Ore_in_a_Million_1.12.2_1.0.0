package com.blueberrysoda.oreinamillion.util.enumerations;

public enum EquipmentType {

    Sword(3),
    Pickaxe(3),
    Axe(3),
    Shovel(2),
    Hoe(2),
    Crusher(4),
    Helmet(3),
    Chestplate(4),
    Leggings(3),
    Boots(2);

    private final int requiredComponents;

    EquipmentType(int requiredComponents) {
        this.requiredComponents = requiredComponents;
    }

    public int getRequiredComponents() {
        return requiredComponents;
    }
}
