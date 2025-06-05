package com.blueberrysoda.oreinamillion.util;

import com.blueberrysoda.oreinamillion.items.armor.ItemArmorBase;
import com.blueberrysoda.oreinamillion.models.armor.Chestplate3;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class LayerArmorChestplateCustom implements LayerRenderer<EntityLivingBase> {
    private final ModelBiped model = new Chestplate3();
    private final ResourceLocation TEXTURE = new ResourceLocation("oreinamillion:textures/models/armor/custom/chestplate.png");

    @Override
    public void doRenderLayer(EntityLivingBase entity, float limbSwing, float limbSwingAmount, float partialTicks,
                              float ageInTicks, float netHeadYaw, float headPitch, float scale) {

        ItemStack chestStack = entity.getItemStackFromSlot(EntityEquipmentSlot.CHEST);

        if (chestStack != null && chestStack.getItem() instanceof ItemArmorBase) {
            Minecraft.getMinecraft().getTextureManager().bindTexture(TEXTURE);
//            GlStateManager.pushMatrix();

            RenderLivingBase<?> renderer = (RenderLivingBase<?>) Minecraft.getMinecraft()
                    .getRenderManager().getEntityRenderObject(entity);

            ModelBiped entityModel = (ModelBiped) renderer.getMainModel();
            model.setModelAttributes(entityModel);
            model.setLivingAnimations(entity, limbSwing, limbSwingAmount, partialTicks);

            if (entity instanceof net.minecraft.entity.item.EntityArmorStand) {
                model.bipedHead.showModel = false;
                model.bipedHeadwear.showModel = false;

                model.isChild = entity.isChild();
                model.isRiding = entity.isRiding();
                model.isSneak = entity.isSneaking();

                net.minecraft.entity.item.EntityArmorStand stand = (net.minecraft.entity.item.EntityArmorStand) entity;

                model.bipedBody.rotateAngleX = (float) Math.toRadians(stand.getBodyRotation().getX());
                model.bipedBody.rotateAngleY = (float) Math.toRadians(stand.getBodyRotation().getY());
                model.bipedBody.rotateAngleZ = (float) Math.toRadians(stand.getBodyRotation().getZ());

                model.bipedRightArm.rotateAngleX = (float) Math.toRadians(stand.getRightArmRotation().getX());
                model.bipedRightArm.rotateAngleY = (float) Math.toRadians(stand.getRightArmRotation().getY());
                model.bipedRightArm.rotateAngleZ = (float) Math.toRadians(stand.getRightArmRotation().getZ());

                model.bipedLeftArm.rotateAngleX = (float) Math.toRadians(stand.getLeftArmRotation().getX());
                model.bipedLeftArm.rotateAngleY = (float) Math.toRadians(stand.getLeftArmRotation().getY());
                model.bipedLeftArm.rotateAngleZ = (float) Math.toRadians(stand.getLeftArmRotation().getZ());

                model.bipedRightLeg.rotateAngleX = (float) Math.toRadians(stand.getRightLegRotation().getX());
                model.bipedRightLeg.rotateAngleY = (float) Math.toRadians(stand.getRightLegRotation().getY());
                model.bipedRightLeg.rotateAngleZ = (float) Math.toRadians(stand.getRightLegRotation().getZ());

                model.bipedLeftLeg.rotateAngleX = (float) Math.toRadians(stand.getLeftLegRotation().getX());
                model.bipedLeftLeg.rotateAngleY = (float) Math.toRadians(stand.getLeftLegRotation().getY());
                model.bipedLeftLeg.rotateAngleZ = (float) Math.toRadians(stand.getLeftLegRotation().getZ());
            } else {
                model.bipedRightArm.rotateAngleX = entityModel.bipedRightArm.rotateAngleX;
                model.bipedRightArm.rotateAngleY = entityModel.bipedRightArm.rotateAngleY;
                model.bipedRightArm.rotateAngleZ = entityModel.bipedRightArm.rotateAngleZ;

                model.bipedLeftArm.rotateAngleX = entityModel.bipedLeftArm.rotateAngleX;
                model.bipedLeftArm.rotateAngleY = entityModel.bipedLeftArm.rotateAngleY;
                model.bipedLeftArm.rotateAngleZ = entityModel.bipedLeftArm.rotateAngleZ;

                model.bipedBody.rotateAngleX = entityModel.bipedBody.rotateAngleX;
                model.bipedBody.rotateAngleY = entityModel.bipedBody.rotateAngleY;
                model.bipedBody.rotateAngleZ = entityModel.bipedBody.rotateAngleZ;

                model.rightArmPose = entityModel.rightArmPose;
                model.leftArmPose = entityModel.leftArmPose;
            }
            model.render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
            GlStateManager.popMatrix();
        }
    }

    @Override
    public boolean shouldCombineTextures() {
        return false;
    }
}
