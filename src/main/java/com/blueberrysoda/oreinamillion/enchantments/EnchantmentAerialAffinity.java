package com.blueberrysoda.oreinamillion.enchantments;

import baubles.api.BaublesApi;
import baubles.api.cap.IBaublesItemHandler;
import com.blueberrysoda.oreinamillion.OreInAMillion;
import com.blueberrysoda.oreinamillion.init.ModEnchantments;
import com.blueberrysoda.oreinamillion.items.baubles.ItemJetpackBauble;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class EnchantmentAerialAffinity extends Enchantment {

    public EnchantmentAerialAffinity() {
        super(Rarity.RARE, EnumEnchantmentType.ALL, new EntityEquipmentSlot[]{EntityEquipmentSlot.MAINHAND});
        this.setName(OreInAMillion.MODID + ".aerial_affinity");
        this.setRegistryName(new ResourceLocation(OreInAMillion.MODID, "aerial_affinity"));
    }

    @Override
    public int getMinEnchantability(int level) {
        return 15 * level;
    }

    @Override
    public int getMaxEnchantability(int level) {
        return this.getMinEnchantability(level) + 20;
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }

    @Override
    public boolean isAllowedOnBooks() {
        return true;
    }

    @Override
    public boolean canApply(ItemStack stack) {
        return stack.getItem() instanceof ItemJetpackBauble;
    }

    private static boolean hasEnchantment(ItemStack stack, Enchantment enchantment) {
        if (stack.isEmpty() || !stack.isItemEnchanted()) return false;

        for (int i = 0; i < stack.getEnchantmentTagList().tagCount(); i++) {
            int id = stack.getEnchantmentTagList().getCompoundTagAt(i).getShort("id");
            if (Enchantment.getEnchantmentByID(id) == enchantment) {
                return true;
            }
        }

        return false;
    }

    //        Enchantment enchantment = ModEnchantments.getEnchantmentByName("aerial_affinity");
    //        if (stack.isItemEnchanted() && stack.getEnchantmentTagList().toString().contains(enchantment.getRegistryName().toString())) {

    @SubscribeEvent
    public static void onBreakSpeed(PlayerEvent.BreakSpeed event) {
        EntityPlayer player = event.getEntityPlayer();
        Enchantment enchantment = ModEnchantments.aerialAffinity;

        if (enchantment == null) return;

        if (!player.onGround && !player.capabilities.isCreativeMode) {
            for (ItemStack stack : player.getEquipmentAndArmor()) {
                if (stack.getItem() instanceof ItemJetpackBauble && hasEnchantment(stack, enchantment)) {
                    event.setNewSpeed(event.getNewSpeed() * 5F);
                    return;
                }
            }

            IBaublesItemHandler baubles = BaublesApi.getBaublesHandler(player);
            for (int i = 0; i < baubles.getSlots(); i++) {
                ItemStack stack = baubles.getStackInSlot(i);
                if (!stack.isEmpty() && stack.getItem() instanceof ItemJetpackBauble && hasEnchantment(stack, enchantment)) {
                    event.setNewSpeed(event.getNewSpeed() * 5F);
                    return;
                }
            }
        }
    }
}
