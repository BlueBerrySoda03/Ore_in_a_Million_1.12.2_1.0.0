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
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Enchantments;
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

    protected ItemCrusher(Item.ToolMaterial material)
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
    public boolean onBlockDestroyed(ItemStack stack, World worldIn, IBlockState state, BlockPos pos, EntityLivingBase entityLiving) {
        if (!worldIn.isRemote) {
            ItemStack blockStack = new ItemStack(state.getBlock());
            int[] oreIds = OreDictionary.getOreIDs(blockStack);

            boolean isOre = false;
            String oreType = "";

            for (int oreId : oreIds) {
                String oreName = OreDictionary.getOreName(oreId);
                if (oreName.startsWith("ore")){
                    isOre = true;
                    oreType = oreName;
                    break;
                }
            }

            if (isOre && entityLiving instanceof EntityPlayer) {
                EntityPlayer player = (EntityPlayer) entityLiving;

                int harvestLevel = toolMaterial.getHarvestLevel();
                int requiredHarvestLevel = state.getBlock().getHarvestLevel(state);

                if (harvestLevel >= requiredHarvestLevel) {
                    switch (oreType) {
                        case "oreAluminum": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustAluminum);
                            int baseDrops = 2;
                            int fortuneLevel = EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, stack);
                            double scalingFactor = 0.5;
                            int additionalDrops = (int) (fortuneLevel * scalingFactor);
                            int totalDrops = baseDrops + additionalDrops;

                            for (int i = 0; i < totalDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        //chrome
                        case "oreChrome": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustChrome);
                            int baseDrops = 2;
                            int fortuneLevel = EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, stack);
                            double scalingFactor = 0.5;
                            int additionalDrops = (int) (fortuneLevel * scalingFactor);
                            int totalDrops = baseDrops + additionalDrops;

                            for (int i = 0; i < totalDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        //cobalt
                        case "oreCobalt": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustCobalt);
                            int baseDrops = 2;
                            int fortuneLevel = EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, stack);
                            double scalingFactor = 0.5;
                            int additionalDrops = (int) (fortuneLevel * scalingFactor);
                            int totalDrops = baseDrops + additionalDrops;

                            for (int i = 0; i < totalDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        //copper
                        case "oreCopper": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustCopper);
                            int baseDrops = 2;
                            int fortuneLevel = EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, stack);
                            double scalingFactor = 0.5;
                            int additionalDrops = (int) (fortuneLevel * scalingFactor);
                            int totalDrops = baseDrops + additionalDrops;

                            for (int i = 0; i < totalDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreEnder": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustEnder);
                            int baseDrops = 2;
                            int fortuneLevel = EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, stack);
                            double scalingFactor = 0.5;
                            int additionalDrops = (int) (fortuneLevel * scalingFactor);
                            int totalDrops = baseDrops + additionalDrops;

                            for (int i = 0; i < totalDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreIridium": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustIridium);
                            int baseDrops = 2;
                            int fortuneLevel = EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, stack);
                            double scalingFactor = 0.5;
                            int additionalDrops = (int) (fortuneLevel * scalingFactor);
                            int totalDrops = baseDrops + additionalDrops;

                            for (int i = 0; i < totalDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreLead": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustLead);
                            int baseDrops = 2;
                            int fortuneLevel = EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, stack);
                            double scalingFactor = 0.5;
                            int additionalDrops = (int) (fortuneLevel * scalingFactor);
                            int totalDrops = baseDrops + additionalDrops;

                            for (int i = 0; i < totalDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreMithril": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustMithril);
                            int baseDrops = 2;
                            int fortuneLevel = EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, stack);
                            double scalingFactor = 0.5;
                            int additionalDrops = (int) (fortuneLevel * scalingFactor);
                            int totalDrops = baseDrops + additionalDrops;

                            for (int i = 0; i < totalDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreNickel": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustNickel);
                            int baseDrops = 2;
                            int fortuneLevel = EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, stack);
                            double scalingFactor = 0.5;
                            int additionalDrops = (int) (fortuneLevel * scalingFactor);
                            int totalDrops = baseDrops + additionalDrops;

                            for (int i = 0; i < totalDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreOsmium": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustOsmium);
                            int baseDrops = 2;
                            int fortuneLevel = EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, stack);
                            double scalingFactor = 0.5;
                            int additionalDrops = (int) (fortuneLevel * scalingFactor);
                            int totalDrops = baseDrops + additionalDrops;

                            for (int i = 0; i < totalDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "orePlatinum": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustPlatinum);
                            int baseDrops = 2;
                            int fortuneLevel = EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, stack);
                            double scalingFactor = 0.5;
                            int additionalDrops = (int) (fortuneLevel * scalingFactor);
                            int totalDrops = baseDrops + additionalDrops;

                            for (int i = 0; i < totalDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreSilver": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustSilver);
                            int baseDrops = 2;
                            int fortuneLevel = EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, stack);
                            double scalingFactor = 0.5;
                            int additionalDrops = (int) (fortuneLevel * scalingFactor);
                            int totalDrops = baseDrops + additionalDrops;

                            for (int i = 0; i < totalDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreTin": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustTin);
                            int baseDrops = 2;
                            int fortuneLevel = EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, stack);
                            double scalingFactor = 0.5;
                            int additionalDrops = (int) (fortuneLevel * scalingFactor);
                            int totalDrops = baseDrops + additionalDrops;

                            for (int i = 0; i < totalDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreTitanium": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustTitanium);
                            int baseDrops = 2;
                            int fortuneLevel = EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, stack);
                            double scalingFactor = 0.5;
                            int additionalDrops = (int) (fortuneLevel * scalingFactor);
                            int totalDrops = baseDrops + additionalDrops;

                            for (int i = 0; i < totalDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreUranium": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustUranium);
                            int baseDrops = 2;
                            int fortuneLevel = EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, stack);
                            double scalingFactor = 0.5;
                            int additionalDrops = (int) (fortuneLevel * scalingFactor);
                            int totalDrops = baseDrops + additionalDrops;

                            for (int i = 0; i < totalDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreZinc": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustZinc);
                            int baseDrops = 2;
                            int fortuneLevel = EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, stack);
                            double scalingFactor = 0.5;
                            int additionalDrops = (int) (fortuneLevel * scalingFactor);
                            int totalDrops = baseDrops + additionalDrops;

                            for (int i = 0; i < totalDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreArdite": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustArdite);
                            int baseDrops = 2;
                            int fortuneLevel = EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, stack);
                            double scalingFactor = 0.5;
                            int additionalDrops = (int) (fortuneLevel * scalingFactor);
                            int totalDrops = baseDrops + additionalDrops;

                            for (int i = 0; i < totalDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreAmethyst": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustAmethyst);
                            int baseDrops = 2;
                            int fortuneLevel = EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, stack);
                            double scalingFactor = 0.5;
                            int additionalDrops = (int) (fortuneLevel * scalingFactor);
                            int totalDrops = baseDrops + additionalDrops;

                            for (int i = 0; i < totalDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "orePeridot": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustPeridot);
                            int baseDrops = 2;
                            int fortuneLevel = EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, stack);
                            double scalingFactor = 0.5;
                            int additionalDrops = (int) (fortuneLevel * scalingFactor);
                            int totalDrops = baseDrops + additionalDrops;

                            for (int i = 0; i < totalDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreRuby": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustRuby);
                            int baseDrops = 2;
                            int fortuneLevel = EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, stack);
                            double scalingFactor = 0.5;
                            int additionalDrops = (int) (fortuneLevel * scalingFactor);
                            int totalDrops = baseDrops + additionalDrops;

                            for (int i = 0; i < totalDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreSapphire": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustSapphire);
                            int baseDrops = 2;
                            int fortuneLevel = EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, stack);
                            double scalingFactor = 0.5;
                            int additionalDrops = (int) (fortuneLevel * scalingFactor);
                            int totalDrops = baseDrops + additionalDrops;

                            for (int i = 0; i < totalDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreCinnabar": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustCinnabar);
                            int baseDrops = 2;
                            int fortuneLevel = EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, stack);
                            double scalingFactor = 0.5;
                            int additionalDrops = (int) (fortuneLevel * scalingFactor);
                            int totalDrops = baseDrops + additionalDrops;

                            for (int i = 0; i < totalDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreSulfur": {
                            ItemStack crusherDrop = new ItemStack(ModItems.elementSulfur);
                            int baseDrops = 4;
                            int fortuneLevel = EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, stack);
                            double scalingFactor = 0.5;
                            int additionalDrops = (int) (fortuneLevel * scalingFactor);
                            int totalDrops = baseDrops + additionalDrops;

                            for (int i = 0; i < totalDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreIron": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustIron);
                            int baseDrops = 2;
                            int fortuneLevel = EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, stack);
                            double scalingFactor = 0.5;
                            int additionalDrops = (int) (fortuneLevel * scalingFactor);
                            int totalDrops = baseDrops + additionalDrops;

                            for (int i = 0; i < totalDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreGold": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustGold);
                            int baseDrops = 2;
                            int fortuneLevel = EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, stack);
                            double scalingFactor = 0.5;
                            int additionalDrops = (int) (fortuneLevel * scalingFactor);
                            int totalDrops = baseDrops + additionalDrops;

                            for (int i = 0; i < totalDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreDiamond": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustDiamond);
                            int baseDrops = 2;
                            int fortuneLevel = EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, stack);
                            double scalingFactor = 0.5;
                            int additionalDrops = (int) (fortuneLevel * scalingFactor);
                            int totalDrops = baseDrops + additionalDrops;

                            for (int i = 0; i < totalDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreEmerald": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustEmerald);
                            int baseDrops = 2;
                            int fortuneLevel = EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, stack);
                            double scalingFactor = 0.5;
                            int additionalDrops = (int) (fortuneLevel * scalingFactor);
                            int totalDrops = baseDrops + additionalDrops;

                            for (int i = 0; i < totalDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreCoal": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustCoal);
                            int baseDrops = 2;
                            int fortuneLevel = EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, stack);
                            double scalingFactor = 0.5;
                            int additionalDrops = (int) (fortuneLevel * scalingFactor);
                            int totalDrops = baseDrops + additionalDrops;

                            for (int i = 0; i < totalDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreWeezer": {
                            ItemStack crusherDrop = new ItemStack(ModItems.weezerWeezer);
                            int baseDrops = 2;
                            int fortuneLevel = EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, stack);
                            double scalingFactor = 0.5;
                            int additionalDrops = (int) (fortuneLevel * scalingFactor);
                            int totalDrops = baseDrops + additionalDrops;

                            for (int i = 0; i < totalDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                    }
                }
            }
        }
        return super.onBlockDestroyed(stack, worldIn, state, pos, entityLiving);
    }
}
