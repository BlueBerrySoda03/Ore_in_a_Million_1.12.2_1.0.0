//package com.blueberrysoda.oreinamillion.items.tools.toolevents;
//
//import com.blueberrysoda.oreinamillion.init.ModItems;
//import net.minecraft.entity.player.EntityPlayer;
//import net.minecraft.item.ItemStack;
//import net.minecraftforge.event.entity.living.LivingHurtEvent;
//import net.minecraftforge.event.world.BlockEvent;
//import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
//
//public class ToolPigIronEvent {
//    @SubscribeEvent
//    public void onPlayerAttack(LivingHurtEvent event) {
//        if (event.getSource().getTrueSource() instanceof EntityPlayer) {
//            EntityPlayer player = (EntityPlayer) event.getSource().getTrueSource();
//            healHungerBar(player);
//        }
//    }
//
//    @SubscribeEvent
//    public void onBlockBreak(BlockEvent.BreakEvent event) {
//        EntityPlayer player = event.getPlayer();
//        if (isHoldingTool(player)) {
//            healHungerBar(player);
//        }
//    }
//
//    private boolean isHoldingTool(EntityPlayer player) {
//        ItemStack item = player.getHeldItemMainhand();
//        return item != null &&
//                item.getItem() == ModItems.axePigIron ||
//                item.getItem() == ModItems.swordPigIron ||
//                item.getItem() == ModItems.pickaxePigIron ||
//                item.getItem() == ModItems.hoePigIron ||
//                item.getItem() == ModItems.crusherPigIron ||
//                item.getItem() == ModItems.shovelPigIron;
//    }
//
//    private void healHungerBar(EntityPlayer player) {
//        if (player.getRNG().nextFloat() < 0.10) {
//            if (player.getFoodStats().getFoodLevel() < 20) {
//                player.getFoodStats().addStats(1, 0.0F);
//            } else {
//                player.getFoodStats().addStats(1, 1.0F);
//            }
//        }
//    }
//}
