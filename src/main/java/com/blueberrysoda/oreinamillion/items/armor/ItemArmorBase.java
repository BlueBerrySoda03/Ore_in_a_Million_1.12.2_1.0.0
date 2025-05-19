package com.blueberrysoda.oreinamillion.items.armor;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import com.blueberrysoda.oreinamillion.util.enumerations.MaterialType;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public class ItemArmorBase extends ItemArmor {

    private static CreativeTabs creativeTab;
    private final boolean addTooltip;

    private static final ItemArmor.ArmorMaterial baseMaterial = EnumHelper.addArmorMaterial("base", "base", 0, new int[]{0,0,0,0}, 0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

    public ItemArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, CreativeTabs creativeTabs, boolean addTooltip) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        setRegistryName(name);
        setUnlocalizedName(OreInAMillion.MODID + "." + name);
        setCreativeTab(OreInAMillion.CREATIVE_TAB_ARMOR);
        this.addTooltip = addTooltip;
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
        return "oreinamillion:textures/models/armor/base/base_layer_" + (slot == EntityEquipmentSlot.LEGS ? "2" : "1") + ".png";
    }

    @Override
    public int getColor(ItemStack stack) {
        MaterialType materialType = MaterialType.fromItemStack(stack);
        return materialType != null ? materialType.getColor() : 0xFFFFFF;
    }

    @Override
    public boolean hasColor(ItemStack stack) {
        return MaterialType.fromItemStack(stack) != null;
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
