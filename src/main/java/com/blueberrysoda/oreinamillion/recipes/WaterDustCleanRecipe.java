package com.blueberrysoda.oreinamillion.recipes;

import com.blueberrysoda.oreinamillion.util.enumerations.MaterialType;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.List;

@Mod.EventBusSubscriber
public class WaterDustCleanRecipe {

    @SubscribeEvent
    public static void onBlockRightClick(PlayerInteractEvent.RightClickBlock event) {
        World world = event.getWorld();
        BlockPos pos = event.getPos();
        ItemStack heldItem = event.getEntityPlayer().getHeldItem(event.getHand());

        if (world.getBlockState(pos).getBlock() == Blocks.WATER && heldItem.getItem() == Items.STICK) {
            List<EntityItem> items = world.getEntitiesWithinAABB(EntityItem.class, new AxisAlignedBB(pos).grow(4));

            for (EntityItem itemEntity : items) {
                ItemStack stack = itemEntity.getItem();
                String itemName = stack.getItem().getRegistryName().getResourcePath();

                if (itemName.endsWith("_dirty_dust")) {
                    Item cleanDustItem = MaterialType.valueOf(itemName.split("_")[0]).getItem("dust");

                    if (cleanDustItem != null) {
                        itemEntity.setItem(new ItemStack(cleanDustItem, stack.getCount()));

                        world.spawnParticle(EnumParticleTypes.WATER_SPLASH, itemEntity.posX, itemEntity.posY, itemEntity.posZ, 0, 0, 0);
                        world.playSound(null, pos, SoundEvents.BLOCK_WATER_AMBIENT, SoundCategory.BLOCKS, 1.0F, 1.0F);
                    }
                }
            }
        }
    }
}
