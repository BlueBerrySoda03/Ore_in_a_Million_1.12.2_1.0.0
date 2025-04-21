package com.blueberrysoda.oreinamillion.util.enumerations;

public enum MaterialType {
    Adamantine(0xDB5743),
    Copper(0xDB904F),
    Iron(0xD8D8D8),
    Gold(0xFFD700);

    private final int color;

    MaterialType(int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }
}
