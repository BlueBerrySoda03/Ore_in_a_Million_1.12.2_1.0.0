package com.blueberrysoda.oreinamillion.init;

import com.blueberrysoda.oreinamillion.enchantments.EnchantmentAerialAffinity;
import net.minecraft.enchantment.Enchantment;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class ModEnchantments {

    public static Enchantment aerialAffinity;

    public static void init() {
    }

    @SubscribeEvent
    public static void registerEnchantments(RegistryEvent.Register<Enchantment> event) {
        aerialAffinity = new EnchantmentAerialAffinity();
        event.getRegistry().register(aerialAffinity);
    }

    public static Enchantment getEnchantmentByName(String name) {
        if ("aerial_affinity".equals(name)) return aerialAffinity;
        return null;
    }
}
