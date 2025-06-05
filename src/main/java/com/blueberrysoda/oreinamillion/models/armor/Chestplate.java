package com.blueberrysoda.oreinamillion.models.armor;// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;

public class Chestplate extends ModelBiped {

	private final ModelRenderer chestplatemain;
	private final ModelRenderer rightshoulder;
	private final ModelRenderer leftshoulder;

	public Chestplate() {
		textureWidth = 64;
		textureHeight = 64;

		this.bipedBody.cubeList.clear();
		this.bipedRightArm.cubeList.clear();
		this.bipedLeftArm.cubeList.clear();

		chestplatemain = new ModelRenderer(this);
		chestplatemain.setRotationPoint(0.0F, 12.0F, 0.0F);
		chestplatemain.cubeList.add(new ModelBox(chestplatemain, 45, 33, -4.0F, -12.5F, 2.0F, 2, 1, 1, 0.0F, false));
		chestplatemain.cubeList.add(new ModelBox(chestplatemain, 45, 36, 2.0F, -12.5F, 2.0F, 2, 1, 1, 0.0F, false));
		chestplatemain.cubeList.add(new ModelBox(chestplatemain, 25, 0, -4.0F, -11.5F, 2.0F, 8, 9, 1, 0.0F, false));
		chestplatemain.cubeList.add(new ModelBox(chestplatemain, 30, 11, -4.0F, -10.5F, -3.0F, 8, 8, 1, 0.0F, false));
		chestplatemain.cubeList.add(new ModelBox(chestplatemain, 0, 42, -3.0F, -2.5F, 2.0F, 6, 1, 1, 0.0F, false));
		chestplatemain.cubeList.add(new ModelBox(chestplatemain, 44, 6, 2.0F, -12.5F, -3.0F, 2, 2, 1, 0.0F, false));
		chestplatemain.cubeList.add(new ModelBox(chestplatemain, 14, 45, -4.0F, -12.5F, -3.0F, 2, 2, 1, 0.0F, false));
		chestplatemain.cubeList.add(new ModelBox(chestplatemain, 25, 11, -2.0F, -11.5F, -3.0F, 1, 1, 1, 0.0F, false));
		chestplatemain.cubeList.add(new ModelBox(chestplatemain, 45, 39, 1.0F, -11.5F, -3.0F, 1, 1, 1, 0.0F, false));
		chestplatemain.cubeList.add(new ModelBox(chestplatemain, 15, 42, -3.0F, -2.5F, -3.0F, 6, 1, 1, 0.0F, false));
		chestplatemain.cubeList.add(new ModelBox(chestplatemain, 30, 43, -2.0F, -1.5F, -3.0F, 4, 1, 1, 0.0F, false));
		chestplatemain.cubeList.add(new ModelBox(chestplatemain, 0, 16, -5.0F, -12.5F, -3.0F, 1, 10, 6, 0.0F, false));
		chestplatemain.cubeList.add(new ModelBox(chestplatemain, 15, 16, 4.0F, -12.5F, -3.0F, 1, 10, 6, 0.0F, false));
		this.bipedBody.addChild(chestplatemain);

		rightshoulder = new ModelRenderer(this, 40, 16);
		rightshoulder.setRotationPoint(5.0F, 10.0F, 0.0F);
		rightshoulder.cubeList.add(new ModelBox(rightshoulder, 0, 0, -9.0F, -13.0F, -3.01F, 6, 1, 6, 0.0F, false));
		rightshoulder.cubeList.add(new ModelBox(rightshoulder, 0, 33, -4.0F, -12.0F, -3.01F, 1, 2, 6, 0.0F, false));
		rightshoulder.cubeList.add(new ModelBox(rightshoulder, 30, 21, -9.0F, -12.0F, -3.01F, 1, 4, 6, 0.0F, false));
		rightshoulder.cubeList.add(new ModelBox(rightshoulder, 41, 43, -8.0F, -12.0F, -3.01F, 2, 4, 1, 0.0F, false));
		rightshoulder.cubeList.add(new ModelBox(rightshoulder, 45, 25, -6.0F, -12.0F, -3.01F, 2, 2, 1, 0.0F, false));
		rightshoulder.cubeList.add(new ModelBox(rightshoulder, 45, 29, -6.0F, -12.0F, 1.99F, 2, 2, 1, 0.0F, false));
		rightshoulder.cubeList.add(new ModelBox(rightshoulder, 44, 0, -8.0F, -12.0F, 1.99F, 2, 4, 1, 0.0F, false));
		this.bipedRightArm.addChild(rightshoulder);

		leftshoulder = new ModelRenderer(this, 40, 16);
		leftshoulder.setRotationPoint(-5.0F, 10.0F, 0.0F);
		leftshoulder.cubeList.add(new ModelBox(leftshoulder, 0, 8, 3.0F, -13.0F, -3.01F, 6, 1, 6, 0.0F, false));
		leftshoulder.cubeList.add(new ModelBox(leftshoulder, 15, 33, 3.0F, -12.0F, -3.01F, 1, 2, 6, 0.0F, false));
		leftshoulder.cubeList.add(new ModelBox(leftshoulder, 30, 32, 8.0F, -12.0F, -3.01F, 1, 4, 6, 0.0F, false));
		leftshoulder.cubeList.add(new ModelBox(leftshoulder, 0, 45, 6.0F, -12.0F, 1.99F, 2, 4, 1, 0.0F, false));
		leftshoulder.cubeList.add(new ModelBox(leftshoulder, 7, 45, 6.0F, -12.0F, -3.01F, 2, 4, 1, 0.0F, false));
		leftshoulder.cubeList.add(new ModelBox(leftshoulder, 21, 45, 4.0F, -12.0F, -3.01F, 2, 2, 1, 0.0F, false));
		leftshoulder.cubeList.add(new ModelBox(leftshoulder, 45, 21, 4.0F, -12.0F, 1.99F, 2, 2, 1, 0.0F, false));
		this.bipedLeftArm.addChild(leftshoulder);
	}

	@Override
	public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		super.render(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		this.bipedHead.showModel = false;
		this.bipedHeadwear.showModel = false;
		this.bipedRightLeg.showModel = false;
		this.bipedLeftLeg.showModel = false;
		this.bipedLeftArm.showModel = true;
		this.bipedRightArm.showModel = true;
		this.bipedBody.showModel = true;
	}

	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
		if (entityIn instanceof EntityArmorStand) {
			this.bipedRightArm.rotateAngleX = 0.0F;
			this.bipedRightArm.rotateAngleY = 0.0F;
			this.bipedRightArm.rotateAngleZ = 0.0F;
			this.bipedLeftArm.rotateAngleX = 0.0F;
			this.bipedLeftArm.rotateAngleY = 0.0F;
			this.bipedLeftArm.rotateAngleZ = 0.0F;
		}
//		super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);
	}
}