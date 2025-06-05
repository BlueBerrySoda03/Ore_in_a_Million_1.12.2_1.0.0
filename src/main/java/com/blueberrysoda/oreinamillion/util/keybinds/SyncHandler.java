package com.blueberrysoda.oreinamillion.util.keybinds;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

//Inspired from Simply Jetpacks 2
public class SyncHandler {

    public enum CustomKey {
        Fly,
        Descend,
        SpeedUp,
        SpeedDown,
        Hover,
        Enable
    }

    private static final Map<UUID, Boolean> flyKeyStates = new ConcurrentHashMap<>();
    private static final Map<UUID, Boolean> descendKeyStates = new ConcurrentHashMap<>();
    private static final Map<UUID, Boolean> speedUpKeyStates = new ConcurrentHashMap<>();
    private static final Map<UUID, Boolean> speedDownKeyStates = new ConcurrentHashMap<>();
    private static final Map<UUID, Boolean> hoverKeyStates = new ConcurrentHashMap<>();
    private static final Map<UUID, Boolean> enableKeyStates = new ConcurrentHashMap<>();

    public static void setKeyDown(EntityPlayerMP player, CustomKey key, boolean isDown) {
        switch (key) {
            case Fly:
                flyKeyStates.put(player.getUniqueID(), isDown);
                break;
            case Descend:
                descendKeyStates.put(player.getUniqueID(), isDown);
                break;
            case SpeedUp:
                speedUpKeyStates.put(player.getUniqueID(), isDown);
                break;
            case SpeedDown:
                speedDownKeyStates.put(player.getUniqueID(), isDown);
                break;
            case Hover:
                hoverKeyStates.put(player.getUniqueID(), isDown);
                break;
            case Enable:
                enableKeyStates.put(player.getUniqueID(), isDown);
                break;
        }
    }

    public static boolean isKeyDown(EntityPlayer player, CustomKey key) {
        switch (key) {
            case Fly:
                return flyKeyStates.getOrDefault(player.getUniqueID(), false);
            case Descend:
                return descendKeyStates.getOrDefault(player.getUniqueID(), false);
            case SpeedUp:
                return speedUpKeyStates.getOrDefault(player.getUniqueID(), false);
            case SpeedDown:
                return speedDownKeyStates.getOrDefault(player.getUniqueID(), false);
            case Hover:
                return hoverKeyStates.getOrDefault(player.getUniqueID(), false);
            case Enable:
                return enableKeyStates.getOrDefault(player.getUniqueID(), false);
        }
        return false;
    }
}
