package com.blueberrysoda.oreinamillion.util;

import com.blueberrysoda.oreinamillion.init.ModItems;
import com.blueberrysoda.oreinamillion.init.ModSounds;
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

public class ItemCrusher extends ItemTool {

    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.ACTIVATOR_RAIL, Blocks.COAL_ORE, Blocks.COBBLESTONE, Blocks.DETECTOR_RAIL, Blocks.DIAMOND_BLOCK, Blocks.DIAMOND_ORE, Blocks.DOUBLE_STONE_SLAB, Blocks.GOLDEN_RAIL, Blocks.GOLD_BLOCK, Blocks.GOLD_ORE, Blocks.ICE, Blocks.IRON_BLOCK, Blocks.IRON_ORE, Blocks.LAPIS_BLOCK, Blocks.LAPIS_ORE, Blocks.LIT_REDSTONE_ORE, Blocks.MOSSY_COBBLESTONE, Blocks.NETHERRACK, Blocks.PACKED_ICE, Blocks.RAIL, Blocks.REDSTONE_ORE, Blocks.SANDSTONE, Blocks.RED_SANDSTONE, Blocks.STONE, Blocks.STONE_SLAB, Blocks.STONE_BUTTON, Blocks.STONE_PRESSURE_PLATE);

    protected ItemCrusher(ToolMaterial material)
    {
        super((material.getAttackDamage() * 2.3F) + 3.0F, -3.0F, material, EFFECTIVE_ON);
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

            for (int oreID : oreIDs) {
                String oreName = OreDictionary.getOreName(oreID);

                int harvestLevel = toolMaterial.getHarvestLevel();
                int requiredHarvestLevel = state.getBlock().getHarvestLevel(state);

                if (harvestLevel >= requiredHarvestLevel) {
                    switch (oreName) {
                        case "oreAdamantine":
                            spawnCustomDrops(worldIn, pos, new ItemStack(ModItems.dustAdamantine), 2);
                            break;
                        case "oreAluminum":
                            spawnCustomDrops(worldIn, pos, new ItemStack(ModItems.dustAluminum), 2);
                            break;
                        case "oreArdite":
                            spawnCustomDrops(worldIn, pos, new ItemStack(ModItems.dustArdite), 2);
                            break;
                        case "oreChrome":
                            spawnCustomDrops(worldIn, pos, new ItemStack(ModItems.dustChrome), 2);
                            break;
                        case "oreCobalt":
                            spawnCustomDrops(worldIn, pos, new ItemStack(ModItems.dustCobalt), 2);
                            break;
                        case "oreCopper":
                            spawnCustomDrops(worldIn, pos, new ItemStack(ModItems.dustCopper), 2);
                            break;
                        case "oreEnder":
                            spawnCustomDrops(worldIn, pos, new ItemStack(ModItems.dustEnder), 2);
                            break;
                        case "oreIridium":
                            spawnCustomDrops(worldIn, pos, new ItemStack(ModItems.dustIridium), 2);
                            break;
                        case "oreLead":
                            spawnCustomDrops(worldIn, pos, new ItemStack(ModItems.dustLead), 2);
                            break;
                        case "oreMithril":
                            spawnCustomDrops(worldIn, pos, new ItemStack(ModItems.dustMithril), 2);
                            break;
                        case "oreNickel":
                            spawnCustomDrops(worldIn, pos, new ItemStack(ModItems.dustNickel), 2);
                            break;
                        case "oreOsmium":
                            spawnCustomDrops(worldIn, pos, new ItemStack(ModItems.dustOsmium), 2);
                            break;
                        case "orePlatinum":
                            spawnCustomDrops(worldIn, pos, new ItemStack(ModItems.dustPlatinum), 2);
                            break;
                        case "oreSilver":
                            spawnCustomDrops(worldIn, pos, new ItemStack(ModItems.dustSilver), 2);
                            break;
                        case "oreTin":
                            spawnCustomDrops(worldIn, pos, new ItemStack(ModItems.dustTin), 2);
                            break;
                        case "oreTitanium":
                            spawnCustomDrops(worldIn, pos, new ItemStack(ModItems.dustTitanium), 2);
                            break;
                        case "oreTungsten":
                            spawnCustomDrops(worldIn, pos, new ItemStack(ModItems.dustTungsten), 2);
                            break;
                        case "oreUranium":
                            spawnCustomDrops(worldIn, pos, new ItemStack(ModItems.dustUranium), 2);
                            break;
                        case "oreZinc":
                            spawnCustomDrops(worldIn, pos, new ItemStack(ModItems.dustZinc), 2);
                            break;
                        case "oreAmethyst":
                            spawnCustomDrops(worldIn, pos, new ItemStack(ModItems.dustAmethyst), 2);
                            break;
                        case "orePearl":
                            spawnCustomDrops(worldIn, pos, new ItemStack(ModItems.dustPearl), 2);
                            break;
                        case "orePeridot":
                            spawnCustomDrops(worldIn, pos, new ItemStack(ModItems.dustPeridot), 2);
                            break;
                        case "oreRuby":
                            spawnCustomDrops(worldIn, pos, new ItemStack(ModItems.dustRuby), 2);
                            break;
                        case "oreSapphire":
                            spawnCustomDrops(worldIn, pos, new ItemStack(ModItems.dustSapphire), 2);
                            break;
                        case "oreCinnabar":
                            spawnCustomDrops(worldIn, pos, new ItemStack(ModItems.dustCinnabar), 2);
                            break;
                        case "oreSulfur":
                            spawnCustomDrops(worldIn, pos, new ItemStack(ModItems.dustSulfur), 4);
                            break;
                        case "oreDiamond":
                            spawnCustomDrops(worldIn, pos, new ItemStack(ModItems.dustDiamond), 2);
                            break;
                        case "oreEmerald":
                            spawnCustomDrops(worldIn, pos, new ItemStack(ModItems.dustEmerald), 2);
                            break;
                        case "oreGold":
                            spawnCustomDrops(worldIn, pos, new ItemStack(ModItems.dustGold), 2);
                            break;
                        case "oreIron":
                            spawnCustomDrops(worldIn, pos, new ItemStack(ModItems.dustIron), 2);
                            break;
                        case "oreLapis":
                            spawnCustomDrops(worldIn, pos, new ItemStack(ModItems.dustLapis), 10);
                            break;
                        case "oreQuartz":
                            spawnCustomDrops(worldIn, pos, new ItemStack(Items.QUARTZ), 8);
                            break;
                        case "oreRedstone":
                            spawnCustomDrops(worldIn, pos, new ItemStack(Items.REDSTONE), 12);
                            break;
                        default:
                            break;
                    }
                } else {
                    return false;
                }
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
