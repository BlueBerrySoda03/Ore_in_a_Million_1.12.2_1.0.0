package com.blueberrysoda.oreinamillion.init;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;


public class ModSounds {
    public static SoundEvent soundWeezer;

    public static void init(){
        soundWeezer = registerSound("item.weezer");
    }

    private static SoundEvent registerSound(String name) {
        ResourceLocation location = new ResourceLocation(OreInAMillion.MODID, name);
        SoundEvent event = new SoundEvent(location);
        event.setRegistryName(name);
        ForgeRegistries.SOUND_EVENTS.register(event);
        return event;
    }
}
