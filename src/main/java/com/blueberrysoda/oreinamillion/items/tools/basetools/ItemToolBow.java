package com.blueberrysoda.oreinamillion.items.tools.basetools;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class ItemToolBow extends ItemBow {

    private final ToolMaterial material;

    public ItemToolBow(String name, ToolMaterial material) {
        setRegistryName(name);
        setUnlocalizedName(OreInAMillion.MODID + "." + name);
        this.setMaxDamage(material.getMaxUses());

        this.material = material;
    }

    @Override
    public void onPlayerStoppedUsing(ItemStack stack, World worldIn, EntityLivingBase entityLiving, int timeLeft) {
        if (entityLiving instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) entityLiving;

            int charge = this.getMaxItemUseDuration(stack) - timeLeft;
            float velocity = (float) charge / 20.0F * (1.0F + material.getAttackDamage() / 10);

            if (velocity > 3.0F) velocity = 3.0F;

            float pitch = 1.0F + (material.getHarvestLevel() * 0.1F);
            worldIn.playSound(null, player.getPosition(), SoundEvents.ENTITY_ARROW_SHOOT, SoundCategory.PLAYERS, 1.0F, pitch);
        }
    }

}
