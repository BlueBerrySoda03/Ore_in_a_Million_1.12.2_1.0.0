package com.blueberrysoda.oreinamillion.util.modularity;

import com.blueberrysoda.oreinamillion.util.enumerations.EquipmentType;
import com.blueberrysoda.oreinamillion.util.enumerations.ToolMaterials;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public class ModularItemTool extends ModularItemBase {

    protected float attackDamage;
    protected float miningSpeed;
    protected int harvestLevel;

    public ModularItemTool(String name, EquipmentType type, ToolMaterials first, ToolMaterials second, ToolMaterials third, ToolMaterials fourth) {
        super(name, type, first, second, third, fourth);

        this.attackDamage = (getDamage(first) + getDamage(second) + getDamage(third) + getDamage(fourth)) / type.getRequiredComponents();
        this.miningSpeed = (getMiningSpeed(first) + getMiningSpeed(second) + getMiningSpeed(third) + getMiningSpeed(fourth)) / type.getRequiredComponents();
        this.harvestLevel = second.getHarvestLevel();
    }

    private float getDamage(ToolMaterials material) {
        return material != null ? material.getDamage() : 0;
    }

    private float getMiningSpeed(ToolMaterials material) {
        return material != null ? material.getMiningSpeed() : 1;
    }


    @Override
    public boolean canHarvestBlock(IBlockState state) {
        return state.getBlock().getHarvestLevel(state) <= this.harvestLevel;
    }

    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);

        tooltip.add("Level: " + harvestLevel);
        tooltip.add("Damage: " + attackDamage);
        tooltip.add("Speed: " + miningSpeed);
        tooltip.add("Durability: " + getDurability());
    }
}
