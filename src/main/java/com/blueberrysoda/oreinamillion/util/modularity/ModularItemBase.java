package com.blueberrysoda.oreinamillion.util.modularity;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import com.blueberrysoda.oreinamillion.util.enumerations.EquipmentType;
import com.blueberrysoda.oreinamillion.util.enumerations.ToolMaterials;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public class ModularItemBase extends Item {

    protected String name;
    protected EquipmentType type;
    protected ToolMaterials firstMaterial;
    protected ToolMaterials secondMaterial;
    protected ToolMaterials thirdMaterial;
    protected ToolMaterials fourthMaterial;

   public ModularItemBase(String name, EquipmentType type, ToolMaterials first, ToolMaterials second, ToolMaterials third, ToolMaterials fourth) {
       setRegistryName(name);
       setUnlocalizedName(OreInAMillion.MODID + "." + name);
       setMaxStackSize(1);

       this.name = name;
       this.type = type;
//       this.firstMaterial = first;
//       this.secondMaterial = second;
//       this.thirdMaterial = third;
//       this.fourthMaterial = fourth;

       this.firstMaterial = first != null ? first : ToolMaterials.Diamond;
       this.secondMaterial = second != null ? second : ToolMaterials.Gold;
       this.thirdMaterial = third != null ? third : ToolMaterials.Emerald;
       this.fourthMaterial = fourth != null ? fourth : ToolMaterials.Iron;

       ItemStack stack = new ItemStack(this);
       itemNBT(stack, null, null);
   }

    public int getDurability() {
        int totalDurability = firstMaterial.getDurability() + secondMaterial.getDurability();

        if (thirdMaterial != null) totalDurability += thirdMaterial.getDurability();
        if (fourthMaterial != null) totalDurability += fourthMaterial.getDurability();

        return totalDurability / type.getRequiredComponents();
    }

    public int getEnchantability() {
        return (firstMaterial.getEnchantability() + secondMaterial.getEnchantability() + thirdMaterial.getEnchantability() + fourthMaterial.getEnchantability()) / 4;
    }

   public int getRequiredMaterials(){
       return type.getRequiredComponents();
   }

    public void setMaterials(ToolMaterials first, ToolMaterials second, ToolMaterials third, ToolMaterials fourth) {
        this.firstMaterial = first;
        this.secondMaterial = second;
        this.thirdMaterial = third;
        this.fourthMaterial = fourth;

        setMaxDamage(getDurability());
    }

    public void itemNBT(ItemStack stack, World world, EntityPlayer player) {
        if (!stack.hasTagCompound()) {
            stack.setTagCompound(new NBTTagCompound());
        }
        NBTTagCompound baseTags = stack.getTagCompound();
        assert baseTags != null;
        baseTags.setString("FirstMaterial", firstMaterial.name());
        baseTags.setString("SecondMaterial", secondMaterial.name());
        baseTags.setString("ThirdMaterial", thirdMaterial.name());
        baseTags.setString("FourthMaterial", fourthMaterial.name());
    }

    @Override
    public void onCreated(ItemStack stack, World world, EntityPlayer player) {
        itemNBT(stack, world, player);
    }

    @Override
    public void onUpdate(ItemStack stack, World world, Entity entity, int itemSlot, boolean isSelected) {
        if (!stack.hasTagCompound()) {
            itemNBT(stack, world, entity instanceof EntityPlayer ? (EntityPlayer) entity : null);
        }
    }

    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);

        if (stack.hasTagCompound()) {
            NBTTagCompound tag = stack.getTagCompound();

            tooltip.add("§6Materials Used:"); // Adds a heading in gold text
            tooltip.add("First: " + tag.getString("FirstMaterial"));
            tooltip.add("Second: " + tag.getString("SecondMaterial"));
            tooltip.add("Third: " + tag.getString("ThirdMaterial"));
            tooltip.add("Fourth: " + tag.getString("FourthMaterial"));
        }
    }
}
