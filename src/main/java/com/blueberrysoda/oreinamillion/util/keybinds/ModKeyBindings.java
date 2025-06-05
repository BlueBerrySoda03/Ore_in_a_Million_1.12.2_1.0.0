package com.blueberrysoda.oreinamillion.util.keybinds;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import org.lwjgl.input.Keyboard;

public class ModKeyBindings {
    public static KeyBinding flyKey;
    public static KeyBinding descendKey;
    public static KeyBinding speedUpKey;
    public static KeyBinding speedDownKey;
    public static KeyBinding hoverKey;
    public static KeyBinding enableKey;

    public static void init() {
        String category = "key.categories.oreinamillion";

        flyKey = new KeyBinding("key.oreinamillion.jetpack.fly", Keyboard.KEY_SPACE, category);
        descendKey = new KeyBinding("key.oreinamillion.jetpack.descend", Keyboard.KEY_LSHIFT, category);
        speedUpKey = new KeyBinding("key.oreinamillion.jetpack.speed_up", Keyboard.KEY_EQUALS, category);
        speedDownKey = new KeyBinding("key.oreinamillion.jetpack.speed_down", Keyboard.KEY_MINUS, category);
        hoverKey = new KeyBinding("key.oreinamillion.jetpack.hover", Keyboard.KEY_H, category);
        enableKey = new KeyBinding("key.oreinamillion.jetpack.enable", Keyboard.KEY_PERIOD, category);

        ClientRegistry.registerKeyBinding(flyKey);
        ClientRegistry.registerKeyBinding(descendKey);
        ClientRegistry.registerKeyBinding(speedUpKey);
        ClientRegistry.registerKeyBinding(speedDownKey);
        ClientRegistry.registerKeyBinding(hoverKey);
        ClientRegistry.registerKeyBinding(enableKey);
    }
}
