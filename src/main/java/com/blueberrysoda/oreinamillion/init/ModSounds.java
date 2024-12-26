package com.blueberrysoda.oreinamillion.init;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;


public class ModSounds {
    public static final SoundEvent soundWeezer = new SoundEvent(new ResourceLocation(OreInAMillion.MODID, "weezer")).setRegistryName("weezer");

    public static void registerSounds(RegistryEvent.Register<SoundEvent> event){
        event.getRegistry().register(soundWeezer);
    }
}
