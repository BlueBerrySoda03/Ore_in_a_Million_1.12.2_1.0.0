package com.blueberrysoda.oreinamillion.items.tools.customtools;

import com.blueberrysoda.oreinamillion.init.ModSounds;
import com.blueberrysoda.oreinamillion.util.enumerations.MaterialType;
import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.*;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;

import java.util.Map;
import java.util.Random;
import java.util.Set;

public class ItemHammerCustom extends ItemTool {

    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.ACTIVATOR_RAIL, Blocks.COAL_ORE, Blocks.COBBLESTONE, Blocks.DETECTOR_RAIL, Blocks.DIAMOND_BLOCK, Blocks.DIAMOND_ORE, Blocks.DOUBLE_STONE_SLAB, Blocks.GOLDEN_RAIL, Blocks.GOLD_BLOCK, Blocks.GOLD_ORE, Blocks.ICE, Blocks.IRON_BLOCK, Blocks.IRON_ORE, Blocks.LAPIS_BLOCK, Blocks.LAPIS_ORE, Blocks.LIT_REDSTONE_ORE, Blocks.MOSSY_COBBLESTONE, Blocks.NETHERRACK, Blocks.PACKED_ICE, Blocks.RAIL, Blocks.REDSTONE_ORE, Blocks.SANDSTONE, Blocks.RED_SANDSTONE, Blocks.STONE, Blocks.STONE_SLAB, Blocks.STONE_BUTTON, Blocks.STONE_PRESSURE_PLATE);

    protected ItemHammerCustom(ToolMaterial material)
    {
        super((material.getAttackDamage() * 2.4F) + 3.0F, -3.2F, material, EFFECTIVE_ON);
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        stack.damageItem(1, attacker);

        World worldIn = target.world;
        BlockPos pos = target.getPosition();
        Random random = new Random();
        float pitch = 0.9F + (random.nextFloat() * 0.2F);
        worldIn.playSound(null, pos, ModSounds.soundCrusherHit, SoundCategory.PLAYERS, 0.5F, pitch);

        return true;
    }

    public float getDestroySpeed(ItemStack stack, IBlockState state)
    {
        Material material = state.getMaterial();
        return material != Material.IRON && material != Material.ANVIL && material != Material.ROCK ? super.getDestroySpeed(stack, state) : this.efficiency;
    }

    @Override
    public int getItemEnchantability(ItemStack stack) {
        return this.toolMaterial.getEnchantability();
    }

    private boolean isEnchantmentValidForTool(Enchantment enchantment) {
        ItemStack diamondSword = new ItemStack(Items.DIAMOND_SWORD);
        ItemStack diamondPickaxe = new ItemStack(Items.DIAMOND_PICKAXE);

        return enchantment.canApply(diamondSword) || enchantment.canApply(diamondPickaxe);
    }

    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment) {
        return isEnchantmentValidForTool(enchantment);
    }

    @Override
    public boolean isBookEnchantable(ItemStack stack, ItemStack book) {
        Map<Enchantment, Integer> enchantments = EnchantmentHelper.getEnchantments(book);
        for (Enchantment enchantment : enchantments.keySet()) {
            if (isEnchantmentValidForTool(enchantment)) {
                return true;
            }
        }
        return false;
    }

    public boolean canHarvestBlock(IBlockState blockIn)
    {
        Block block = blockIn.getBlock();

        if (block == Blocks.OBSIDIAN)
        {
            return this.toolMaterial.getHarvestLevel() == 3;
        }
        else if (block != Blocks.DIAMOND_BLOCK && block != Blocks.DIAMOND_ORE)
        {
            if (block != Blocks.EMERALD_ORE && block != Blocks.EMERALD_BLOCK)
            {
                if (block != Blocks.GOLD_BLOCK && block != Blocks.GOLD_ORE)
                {
                    if (block != Blocks.IRON_BLOCK && block != Blocks.IRON_ORE)
                    {
                        if (block != Blocks.LAPIS_BLOCK && block != Blocks.LAPIS_ORE)
                        {
                            if (block != Blocks.REDSTONE_ORE && block != Blocks.LIT_REDSTONE_ORE)
                            {
                                Material material = blockIn.getMaterial();

                                if (material == Material.ROCK)
                                {
                                    return true;
                                }
                                else if (material == Material.IRON)
                                {
                                    return true;
                                }
                                else
                                {
                                    return material == Material.ANVIL;
                                }
                            }
                            else
                            {
                                return this.toolMaterial.getHarvestLevel() >= 2;
                            }
                        }
                        else
                        {
                            return this.toolMaterial.getHarvestLevel() >= 1;
                        }
                    }
                    else
                    {
                        return this.toolMaterial.getHarvestLevel() >= 1;
                    }
                }
                else
                {
                    return this.toolMaterial.getHarvestLevel() >= 2;
                }
            }
            else
            {
                return this.toolMaterial.getHarvestLevel() >= 2;
            }
        }
        else
        {
            return this.toolMaterial.getHarvestLevel() >= 2;
        }
    }

    @Override
    public boolean onBlockDestroyed(ItemStack stack, World worldIn, IBlockState state, BlockPos pos, EntityLivingBase player) {
        if (!worldIn.isRemote) {
            ItemStack blockStack = new ItemStack(state.getBlock());
            int[] oreIDs = OreDictionary.getOreIDs(blockStack);

            boolean foundOreDictMatch = false;

            for (int oreID : oreIDs) {
                String oreName = OreDictionary.getOreName(oreID);
                int harvestLevel = toolMaterial.getHarvestLevel();
                int requiredHarvestLevel = state.getBlock().getHarvestLevel(state);

                if (harvestLevel >= requiredHarvestLevel) {
                    for (MaterialType material : MaterialType.values()) {
                        String expectedOreName = "ore" + material.getMaterialNameUppercase();

                        if (oreName.equalsIgnoreCase(expectedOreName)) {
                            ItemStack dropStack = new ItemStack(material.getItem("dirty_dust"));
                            int dropCount = 2;
                            spawnCustomDrops(worldIn, pos, dropStack, dropCount);
                            foundOreDictMatch = true;
                            break;
                        }
                    }
                } else {
                    return false;
                }
            }

            if (!foundOreDictMatch) {
                state.getBlock().dropBlockAsItem(worldIn, pos, state, 0);
            }

            worldIn.setBlockToAir(pos);
            stack.damageItem(1, player);
        }

        return super.onBlockDestroyed(stack, worldIn, state, pos, player);
    }

    private String getOreDictName(IBlockState state) {
        ItemStack blockStack = new ItemStack(state.getBlock());
        int[] oreIDs = OreDictionary.getOreIDs(blockStack);

        if (oreIDs.length > 0) {
            return OreDictionary.getOreName(oreIDs[0]);
        }
        return "";
    }

    private void spawnCustomDrops(World world, BlockPos pos, ItemStack dropStack, int count) {
        for (int i = 0; i < count; i++) {
            Block.spawnAsEntity(world, pos, dropStack.copy());
        }
    }
}
