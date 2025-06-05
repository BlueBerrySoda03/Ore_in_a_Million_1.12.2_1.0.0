package com.blueberrysoda.oreinamillion.util.keybinds;

import com.blueberrysoda.oreinamillion.util.enumerations.MaterialType;

public class KeyStateTracker {

    private final MaterialType material;

    public static boolean hoverEnabled = true;
    public static boolean enableEnabled = true;
    public static double maxSpeed;
    public static final double minSpeed = 0.001D;
    public static double jetpackSpeed = 0.10D;
    public static final double speedStep = (maxSpeed - minSpeed) * 0.01D;

    public KeyStateTracker(MaterialType material) {
        this.material = material;
        this.maxSpeed = material.getTier().getMaxSpeed();
    }

    public static void toggleHover() {
        hoverEnabled = !hoverEnabled;
    }

    public static void toggleEnable() {
        enableEnabled = !enableEnabled;
    }
}
