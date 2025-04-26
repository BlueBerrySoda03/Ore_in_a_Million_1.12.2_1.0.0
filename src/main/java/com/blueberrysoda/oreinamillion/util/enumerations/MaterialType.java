package com.blueberrysoda.oreinamillion.util.enumerations;

public enum MaterialType {
    Adamantine(0xDB5743),
    Aluminum(0xD4D4D2),
    Brass(0xDFA251),
    Bronze(0xCFA23F),
    Charcoal(0x2B2A2A),
    Chrome(0xF0E1C1),
    Coal(0x1D1D1D),
    Cobalt(0x3535F8),
    Constantan(0xECE2A5),
    Copper(0xDB904F),
    Diamond(0x48C9B0),
    Electrum(0xDBCC78),
    Ender(0x3E9690),
    Fairy(0xE0A8DA),
    Gold(0xFFD700),
    Invar(0x6B6766),
    Iridium(0xC0B38F),
    Iron(0xD8D8D8),
    Lead(0x434343),
    Mithril(0x3A3AD2),
    Nickel(0x838383),
    Osmium(0x9496A2),
    Platinum(0xBED2D2),
    Silver(0xA4B2B6),
    Steel(0x6F7070),
    Stone(0x6E6E6E),
    Tin(0xE5E6E6),
    Titanium(0xC6D1D5),
    Tungsten(0x9496A2),
    Uranium(0x9BE57C),
    Voidborn(0xA846DC),
    Wood(0x8B5A2B),
    Zinc(0x3E3E43);

    private final int color;

    MaterialType(int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }
}