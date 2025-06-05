package com.blueberrysoda.oreinamillion.items.baubles;

import baubles.api.BaubleType;
import baubles.api.BaublesApi;
import baubles.api.IBauble;
import baubles.api.cap.IBaublesItemHandler;
import baubles.api.render.IRenderBauble;
import com.blueberrysoda.oreinamillion.OreInAMillion;
import com.blueberrysoda.oreinamillion.init.ModEnchantments;
import com.blueberrysoda.oreinamillion.util.EnergyCapabilityProvider;
import com.blueberrysoda.oreinamillion.util.enumerations.MaterialType;
import com.blueberrysoda.oreinamillion.util.enumerations.Tiers;
import com.blueberrysoda.oreinamillion.util.keybinds.KeyStateTracker;
import com.blueberrysoda.oreinamillion.util.keybinds.SyncHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MovementInput;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public class ItemJetpackBauble extends Item implements IBauble, IRenderBauble {

    //THINGS I STILL NEED TO IMPLEMENT:
    //a charge handler, for both the inventory and baubles slot
    //models and textures
    //sounds and particles
    //a gui that's a mix of simple jetpacks and iron jetpacks
    //the emergency fall feature from simply jetpacks
    //

    private final int maxEnergy;
    private final int energyUse;
    private final double flySpeed;
    private final double hoverSpeed;
    private final int enchantability;

    public ItemJetpackBauble(String name, int maxEnergy, int energyUse, double flySpeed, double hoverSpeed, int enchantability) {
        setRegistryName(name);
        setUnlocalizedName(OreInAMillion.MODID + "." + name);
        this.setMaxStackSize(1);
        this.setCreativeTab(OreInAMillion.CREATIVE_TAB_MAIN);
        this.setMaxDamage(0);
        this.maxEnergy = maxEnergy * 130;
        this.energyUse = (energyUse == 0 ? 1 : energyUse) * 20;
        this.flySpeed = flySpeed;
        this.hoverSpeed = hoverSpeed;
        this.enchantability = enchantability;
    }

    @Override
    public BaubleType getBaubleType(ItemStack itemstack) {
        return BaubleType.BODY;
    }

    @Override
    public void onWornTick(ItemStack itemstack, EntityLivingBase entity) {

        if (!(entity instanceof EntityPlayer)) return;
        EntityPlayer player = (EntityPlayer) entity;

        if (!player.isCreative() && !player.isSpectator() && KeyStateTracker.enableEnabled) {

            EnergyCapabilityProvider provider = (EnergyCapabilityProvider) itemstack.getCapability(CapabilityEnergy.ENERGY, null);
            if (provider == null) return;

            if (player.isInWater()) return;
            if (player.isSneaking() && player.onGround) return;

            int energyPerTick = energyUse;
            int stored = provider.getEnergyStored();

            rechargeFromInventory(itemstack, player);

            boolean isFlying = SyncHandler.isKeyDown(player, SyncHandler.CustomKey.Fly);
            boolean isDescending = SyncHandler.isKeyDown(player, SyncHandler.CustomKey.Descend);
            boolean isHovering = !player.onGround && player.motionY < 0;
            boolean isUsingJetpack = isFlying || isDescending || isHovering;

            if (SyncHandler.isKeyDown(player, SyncHandler.CustomKey.SpeedUp)) {
                KeyStateTracker.jetpackSpeed = Math.min(KeyStateTracker.maxSpeed, KeyStateTracker.jetpackSpeed + KeyStateTracker.speedStep);

                if (!player.world.isRemote) {
                    int percent = (int) ((KeyStateTracker.jetpackSpeed - KeyStateTracker.minSpeed) / (KeyStateTracker.maxSpeed - KeyStateTracker.minSpeed) * 100);
                    player.sendMessage(new TextComponentString(TextFormatting.GREEN + "Jetpack Speed: " + percent + "%"));
                }
            }
            if (SyncHandler.isKeyDown(player, SyncHandler.CustomKey.SpeedDown)) {
                KeyStateTracker.jetpackSpeed = Math.max(KeyStateTracker.minSpeed, KeyStateTracker.jetpackSpeed - KeyStateTracker.speedStep);

                if (!player.world.isRemote) {
                    int percent = (int) ((KeyStateTracker.jetpackSpeed - KeyStateTracker.minSpeed) / (KeyStateTracker.maxSpeed - KeyStateTracker.minSpeed) * 100);
                    player.sendMessage(new TextComponentString(TextFormatting.RED + "Jetpack Speed: " + percent + "%"));
                }
            }

            if (stored >= energyPerTick) {
                player.fallDistance = 0;

                if (player.onGround && isFlying) {
                    player.motionY += flySpeed * 1.5;
                    player.motionY += 0.02;
                }

                if (isFlying) {
                    player.motionY = Math.max(player.motionY + flySpeed * 0.4, flySpeed);
                    player.fallDistance = 0;

                    if (!player.world.isRemote) {
                        player.velocityChanged = true;
                        provider.extractEnergy(energyPerTick, false);
                        provider.saveToStack();
                    }
                }
                if (!isFlying && !player.onGround){
                    if (player.motionY > 0) {
                        player.motionY *= 0.6;
                        if (!player.world.isRemote) {
                            player.velocityChanged = true;
                        }
                    }
                }

                if (isHovering && !isFlying && KeyStateTracker.hoverEnabled) {
                    player.motionY *= hoverSpeed;
                    player.motionY = Math.max(player.motionY, -hoverSpeed);
                    player.fallDistance = 0;

                    if (!player.world.isRemote) {
                        player.velocityChanged = true;
                        provider.extractEnergy(energyPerTick / 2, false);
                        provider.saveToStack();
                    }

                }

                if (isDescending && !isFlying && KeyStateTracker.hoverEnabled) {
                    player.motionY -= 0.8;
                    player.fallDistance = 0;

                    if (!player.world.isRemote) {
                        player.velocityChanged = true;
                    }
                }

                if (isFlying || isHovering || isDescending) {
                    EntityPlayerSP clientPlayer = Minecraft.getMinecraft().player;
                    if (clientPlayer != null) {

                        MovementInput input = clientPlayer.movementInput;

                        float forward = input.moveForward;
                        float strafe = input.moveStrafe;
                        float yaw = clientPlayer.rotationYaw * (float) Math.PI / 180F;

                        double motionX = (-forward * Math.sin(yaw) + strafe * Math.cos(yaw)) * KeyStateTracker.jetpackSpeed;
                        double motionZ = (forward * Math.cos(yaw) + strafe * Math.sin(yaw)) * KeyStateTracker.jetpackSpeed;

                        player.motionX += motionX;
                        player.motionZ += motionZ;

                        if (!player.world.isRemote) {
                            player.velocityChanged = true;
                        }
                    }
                    player.fallDistance = 0;
                }

                if (isUsingJetpack) {
                    player.fallDistance = 0;
                }
            }
        }
    }

    @Override
    public void onEquipped(ItemStack itemstack, EntityLivingBase player) {
    }

    @Override
    public void onUnequipped(ItemStack itemstack, EntityLivingBase player) {
    }

    @Override
    public boolean canEquip(ItemStack itemstack, EntityLivingBase player) {
        return true;
    }

    @Override
    public boolean canUnequip(ItemStack itemstack, EntityLivingBase player) {
        return true;
    }

    @Override
    public ICapabilityProvider initCapabilities(ItemStack stack, @Nullable NBTTagCompound nbt) {
        EnergyCapabilityProvider provider = new EnergyCapabilityProvider(stack, maxEnergy, 500);
        if (nbt != null) {
            provider.readFromNBT(nbt);
        }
        return provider;
    }

    private void rechargeFromInventory(ItemStack jetpackStack, EntityPlayer player) {
        EnergyCapabilityProvider jetpackProvider = (EnergyCapabilityProvider) jetpackStack.getCapability(CapabilityEnergy.ENERGY, null);
        if (jetpackProvider == null) return;

        int energyNeeded = jetpackProvider.getMaxEnergyStored() - jetpackProvider.getEnergyStored();
        if (energyNeeded <= 0) return;

        for (ItemStack invStack : player.inventory.mainInventory) {
            if (energyNeeded <= 0) break;
            if (invStack.isEmpty()) continue;

            if (invStack.hasCapability(CapabilityEnergy.ENERGY, null)) {
                int extracted = invStack.getCapability(CapabilityEnergy.ENERGY, null).extractEnergy(energyNeeded, true);
                if (extracted > 0) {
                    int extractedReal = invStack.getCapability(CapabilityEnergy.ENERGY, null).extractEnergy(energyNeeded, false);
                    jetpackProvider.receiveEnergy(extractedReal, false);
                    jetpackProvider.saveToStack();

                    energyNeeded -= extractedReal;
                }
            }
        }

        IBaublesItemHandler baubles = BaublesApi.getBaublesHandler(player);
        if (baubles != null) {
            for (int i = 0; i < baubles.getSlots(); i++) {
                if (energyNeeded <= 0) break;

                ItemStack baubleStack = baubles.getStackInSlot(i);
                if (baubleStack.isEmpty() || baubleStack == jetpackStack) continue; // don't extract from self

                if (baubleStack.hasCapability(CapabilityEnergy.ENERGY, null)) {
                    int extracted = baubleStack.getCapability(CapabilityEnergy.ENERGY, null).extractEnergy(energyNeeded, true);
                    if (extracted > 0) {
                        int extractedReal = baubleStack.getCapability(CapabilityEnergy.ENERGY, null).extractEnergy(energyNeeded, false);
                        jetpackProvider.receiveEnergy(extractedReal, false);
                        jetpackProvider.saveToStack();

                        energyNeeded -= extractedReal;
                    }
                }
            }
        }
    }


    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment) {
        assert enchantment.type != null;
        return enchantment == ModEnchantments.getEnchantmentByName("aerial_affinity");
    }

    @Override
    public int getItemEnchantability() {
        return enchantability;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        NBTTagCompound tag = stack.getTagCompound();
        if (tag != null && tag.hasKey("Energy")) {
            int stored = tag.getInteger("Energy");
            tooltip.add("Energy: " + stored + " / " + this.maxEnergy + "FE");
            tooltip.add("Energy Drain: " + this.energyUse);
            tooltip.add("Hover Mode: " + (KeyStateTracker.hoverEnabled ? "Enabled" : "Disabled"));
            tooltip.add("Enable Mode: " + (KeyStateTracker.enableEnabled ? "Enabled" : "Disabled"));
        }
    }

    @Override
    public void onPlayerBaubleRender(ItemStack itemStack, EntityPlayer entityPlayer, RenderType renderType, float v) {
        if (renderType != RenderType.BODY) return;

        GlStateManager.pushMatrix();

        GlStateManager.translate(0.0, 0.0, 0.125);
        GlStateManager.rotate(-entityPlayer.renderYawOffset, 0, 1, 0);

        Minecraft.getMinecraft().getRenderManager().renderEngine.bindTexture(new ResourceLocation(OreInAMillion.MODID, "textures/models/baubles/jetpack"));

        GlStateManager.popMatrix();
    }
}
