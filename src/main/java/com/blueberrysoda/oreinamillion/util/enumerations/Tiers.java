package com.blueberrysoda.oreinamillion.util.enumerations;

public enum Tiers {
    Tier1(0.10, 0.85, 0.02),
    Tier2(0.20, 0.60, 0.05),
    Tier3(0.35, 0.40, 0.10),
    Tier4(0.45, 0.25, 0.14),
    Tier5(0.60, 0.001, 0.20),
    TierCreative(1.0, 0.0, 1.0),
    TierNull(0.0, 0.0, 0.0),
    ;

    private final double flySpeed;
    private final double hoverSpeed;
    private final double maxSpeed;

    Tiers(double flySpeed, double hoverSpeed, double maxSpeed) {
        this.flySpeed = flySpeed;
        this.hoverSpeed = hoverSpeed;
        this.maxSpeed = maxSpeed;
    }

    public double getFlySpeed() {
        return flySpeed;
    }

    public double getHoverSpeed() {
        return hoverSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }
}