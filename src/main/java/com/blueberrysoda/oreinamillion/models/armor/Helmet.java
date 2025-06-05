package com.blueberrysoda.oreinamillion.models.armor;
// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Helmet extends ModelBiped {
	private final ModelRenderer helmet;

	public Helmet() {
		textureWidth = 64;
		textureHeight = 64;

		this.bipedHead.cubeList.clear();

		helmet = new ModelRenderer(this);
		helmet.setRotationPoint(0.0F, -5.01F, 0.0F);
		helmet.cubeList.add(new ModelBox(helmet, 0, 0, -5.0F, -3.0F, -5.0F, 10, 1, 10, 0.0F, false));
		helmet.cubeList.add(new ModelBox(helmet, 0, 23, 4.0F, -2.0F, -1.0F, 1, 4, 5, 0.0F, false));
		helmet.cubeList.add(new ModelBox(helmet, 24, 22, -5.0F, -0.0F, -5.0F, 1, 1, 4, 0.0F, false));
		helmet.cubeList.add(new ModelBox(helmet, 13, 29, -5.0F, -2.0F, -4.0F, 1, 2, 3, 0.0F, false));
		helmet.cubeList.add(new ModelBox(helmet, 23, 12, -5.0F, -2.0F, -1.0F, 1, 4, 5, 0.0F, false));
		helmet.cubeList.add(new ModelBox(helmet, 0, 12, -5.0F, -2.0F, 4.0F, 10, 5, 1, 0.0F, false));
		helmet.cubeList.add(new ModelBox(helmet, 0, 19, -5.0F, -2.0F, -5.0F, 10, 2, 1, 0.0F, false));
		helmet.cubeList.add(new ModelBox(helmet, 0, 33, -1.0F, -0.0F, -5.0F, 2, 2, 1, 0.0F, false));
		helmet.cubeList.add(new ModelBox(helmet, 13, 23, 4.0F, -0.0F, -5.0F, 1, 1, 4, 0.0F, false));
		helmet.cubeList.add(new ModelBox(helmet, 0, 37, -3.0F, 3.0F, 4.0F, 6, 1, 1, 0.0F, false));
		helmet.cubeList.add(new ModelBox(helmet, 24, 28, 4.0F, -2.0F, -4.0F, 1, 2, 3, 0.0F, false));

		this.bipedHead.addChild(helmet);
	}

	@Override
	public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		super.render(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}