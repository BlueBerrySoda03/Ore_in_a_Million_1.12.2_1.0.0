package com.blueberrysoda.oreinamillion.items.armor;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import com.blueberrysoda.oreinamillion.models.armor.Chestplate;
import com.blueberrysoda.oreinamillion.models.armor.Helmet;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public class ItemArmorBase extends ItemArmor {

    private final boolean addTooltip;

    public ItemArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, boolean addTooltip) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        setRegistryName(name);
        setUnlocalizedName(OreInAMillion.MODID + "." + name);
        setCreativeTab(OreInAMillion.CREATIVE_TAB_ARMOR);
        this.addTooltip = addTooltip;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped defaultModel) {
        if (itemStack.getItem() instanceof ItemArmorBase) {
            if (itemStack != ItemStack.EMPTY) {
                if (armorSlot == EntityEquipmentSlot.HEAD) {
                    Helmet helmet = new Helmet();

                    helmet.bipedHead.rotateAngleX = defaultModel.bipedHead.rotateAngleX;
                    helmet.bipedHead.rotateAngleY = defaultModel.bipedHead.rotateAngleY;

                    helmet.bipedHead.showModel = armorSlot == EntityEquipmentSlot.HEAD;

                    helmet.isChild = defaultModel.isChild;
                    helmet.isRiding = defaultModel.isRiding;
                    helmet.isSneak = defaultModel.isSneak;
                    helmet.rightArmPose = defaultModel.rightArmPose;
                    helmet.leftArmPose = defaultModel.leftArmPose;

                    return helmet;
                }
                if (armorSlot == EntityEquipmentSlot.CHEST) {
                    Chestplate chestplate = new Chestplate();

                    chestplate.bipedBody.showModel = true;
                    chestplate.bipedRightArm.showModel = true;
                    chestplate.bipedLeftArm.showModel = true;

                    chestplate.rightArmPose = defaultModel.rightArmPose;
                    chestplate.leftArmPose = defaultModel.leftArmPose;

                    chestplate.bipedBody.rotateAngleX = defaultModel.bipedBody.rotateAngleX;
                    chestplate.bipedBody.rotateAngleY = defaultModel.bipedBody.rotateAngleY;
                    chestplate.bipedBody.rotateAngleZ = defaultModel.bipedBody.rotateAngleZ;

                    chestplate.bipedRightArm.rotateAngleX = defaultModel.bipedRightArm.rotateAngleX;
                    chestplate.bipedRightArm.rotateAngleY = defaultModel.bipedRightArm.rotateAngleY;
                    chestplate.bipedRightArm.rotateAngleZ = defaultModel.bipedRightArm.rotateAngleZ;

                    chestplate.bipedLeftArm.rotateAngleX = defaultModel.bipedLeftArm.rotateAngleX;
                    chestplate.bipedLeftArm.rotateAngleY = defaultModel.bipedLeftArm.rotateAngleY;
                    chestplate.bipedLeftArm.rotateAngleZ = defaultModel.bipedLeftArm.rotateAngleZ;

                    chestplate.isChild = defaultModel.isChild;
                    chestplate.isRiding = defaultModel.isRiding;
                    chestplate.isSneak = defaultModel.isSneak;
                    chestplate.rightArmPose = defaultModel.rightArmPose;
                    chestplate.leftArmPose = defaultModel.leftArmPose;

                    return chestplate;
                }
            }
        } else {
            return defaultModel;
        }
        return defaultModel;
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
        if (stack.getItem() instanceof ItemArmorBase) {
            if (slot == EntityEquipmentSlot.HEAD) {
                return "oreinamillion:textures/models/armor/custom/helmet.png";
            }
            if (slot == EntityEquipmentSlot.CHEST) {
                return "oreinamillion:textures/models/armor/custom/chestplate.png";
            }
            return "minecraft:textures/models/armor/iron_layer_1.png";
        } else {
            return "minecraft:textures/models/armor/iron_layer_1.png";
        }
    }

    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
        super.addInformation(stack,worldIn,tooltip,flagIn);
        if (this.addTooltip) {
            if (GuiScreen.isShiftKeyDown()) {
                String s = stack.getItem().getUnlocalizedName() + ".tooltip";
                String result = I18n.format(s);
                tooltip.add(result);
            } else {
                String s = "hold.shift.tooltip";
                String result = I18n.format(s);
                tooltip.add(result);
            }
        }
    }
}
