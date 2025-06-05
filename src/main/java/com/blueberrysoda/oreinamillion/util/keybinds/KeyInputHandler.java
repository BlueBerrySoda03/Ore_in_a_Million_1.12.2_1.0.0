package com.blueberrysoda.oreinamillion.util.keybinds;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
@Mod.EventBusSubscriber(Side.CLIENT)
public class KeyInputHandler {

    @SubscribeEvent
    public static void onKeyInput(InputEvent.KeyInputEvent event) {
        EntityPlayerSP player = Minecraft.getMinecraft().player;
        if (player == null) return;

        boolean flyKeyDown = ModKeyBindings.flyKey.isKeyDown();
        boolean descendKeyDown = ModKeyBindings.descendKey.isKeyDown();
        boolean speedUpKeyDown = ModKeyBindings.speedUpKey.isKeyDown();
        boolean speedDownKeyDown = ModKeyBindings.speedDownKey.isKeyDown();
        if (ModKeyBindings.hoverKey.isPressed()) {
            KeyStateTracker.toggleHover();
            System.out.println("Hover Mode: " + (KeyStateTracker.hoverEnabled ? "Enabled" : "Disabled"));
            player.sendMessage(new TextComponentString("Hover Mode: " + (KeyStateTracker.hoverEnabled ? "Enabled" : "Disabled")));
        }
        if (ModKeyBindings.enableKey.isPressed()) {
            KeyStateTracker.toggleEnable();
            System.out.println("Enable Mode: " + (KeyStateTracker.enableEnabled ? "Enabled" : "Disabled"));
            player.sendMessage(new TextComponentString("Jetpack Mode: " + (KeyStateTracker.enableEnabled ? "Enabled" : "Disabled")));
        }

        NetworkHandler.INSTANCE.sendToServer(new PacketKeybindInput(flyKeyDown, descendKeyDown, speedUpKeyDown, speedDownKeyDown, KeyStateTracker.hoverEnabled, KeyStateTracker.enableEnabled));
    }
}
