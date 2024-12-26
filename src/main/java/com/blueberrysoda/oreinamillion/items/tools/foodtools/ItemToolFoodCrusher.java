package com.blueberrysoda.oreinamillion.items.tools.foodtools;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import com.blueberrysoda.oreinamillion.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;

public class ItemToolFoodCrusher extends ItemPickaxe {
    public ItemToolFoodCrusher(String name, ToolMaterial material) {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(OreInAMillion.MODID + "." + name);
        setCreativeTab(OreInAMillion.CREATIVE_TAB_TOOL);
    }

    @Override
    public EnumAction getItemUseAction(ItemStack stack) {
        return EnumAction.EAT;
    }


    @Override
    public int getMaxItemUseDuration (ItemStack stack) {
        return 32;
    }

    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving) {
        if (entityLiving instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) entityLiving;
            player.getFoodStats().addStats(76, 28F);
            return new ItemStack(Items.STICK);
        }
        return super.onItemUseFinish(stack, worldIn, entityLiving);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        ItemStack itemStack = playerIn.getHeldItem(handIn);

        if (playerIn.getFoodStats().getFoodLevel() < 20) {
            playerIn.setActiveHand(handIn);
            worldIn.playSound(null, playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.ENTITY_GENERIC_EAT, SoundCategory.PLAYERS, 1.0F, 1.0F);
            return new ActionResult<>(EnumActionResult.SUCCESS, itemStack);
        }
        else {
            return new ActionResult<>(EnumActionResult.FAIL, itemStack);
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
                    //aluminum
                    if (oreType.equals("oreAluminum")) {
                        ItemStack customDrop1 = new ItemStack(ModItems.dustAluminum);
                        ItemStack customDrop2 = new ItemStack(ModItems.dustAluminum);

                        Block.spawnAsEntity(worldIn, pos, customDrop1);
                        Block.spawnAsEntity(worldIn, pos, customDrop2);

                        state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                        worldIn.setBlockToAir(pos);
                    }
                    //chrome
                    else if (oreType.equals("oreChrome")) {
                        ItemStack customDrop1 = new ItemStack(ModItems.dustChrome);
                        ItemStack customDrop2 = new ItemStack(ModItems.dustChrome);

                        Block.spawnAsEntity(worldIn, pos, customDrop1);
                        Block.spawnAsEntity(worldIn, pos, customDrop2);

                        state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                        worldIn.setBlockToAir(pos);
                    }
                    //cobalt
                    else if (oreType.equals("oreCobalt")) {
                        ItemStack customDrop1 = new ItemStack(ModItems.dustCobalt);
                        ItemStack customDrop2 = new ItemStack(ModItems.dustCobalt);

                        Block.spawnAsEntity(worldIn, pos, customDrop1);
                        Block.spawnAsEntity(worldIn, pos, customDrop2);

                        state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                        worldIn.setBlockToAir(pos);
                    }
                    //copper
                    else if (oreType.equals("oreCopper")) {
                        ItemStack customDrop1 = new ItemStack(ModItems.dustCopper);
                        ItemStack customDrop2 = new ItemStack(ModItems.dustCopper);

                        Block.spawnAsEntity(worldIn, pos, customDrop1);
                        Block.spawnAsEntity(worldIn, pos, customDrop2);

                        state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                        worldIn.setBlockToAir(pos);
                    } else if (oreType.equals("oreEnder")) {
                        ItemStack customDrop1 = new ItemStack(ModItems.dustEnder);
                        ItemStack customDrop2 = new ItemStack(ModItems.dustEnder);

                        Block.spawnAsEntity(worldIn, pos, customDrop1);
                        Block.spawnAsEntity(worldIn, pos, customDrop2);

                        state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                        worldIn.setBlockToAir(pos);
                    } else if (oreType.equals("oreIridium")) {
                        ItemStack customDrop1 = new ItemStack(ModItems.dustIridium);
                        ItemStack customDrop2 = new ItemStack(ModItems.dustIridium);

                        Block.spawnAsEntity(worldIn, pos, customDrop1);
                        Block.spawnAsEntity(worldIn, pos, customDrop2);

                        state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                        worldIn.setBlockToAir(pos);
                    } else if (oreType.equals("oreLead")) {
                        ItemStack customDrop1 = new ItemStack(ModItems.dustLead);
                        ItemStack customDrop2 = new ItemStack(ModItems.dustLead);

                        Block.spawnAsEntity(worldIn, pos, customDrop1);
                        Block.spawnAsEntity(worldIn, pos, customDrop2);

                        state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                        worldIn.setBlockToAir(pos);
                    } else if (oreType.equals("oreMithril")) {
                        ItemStack customDrop1 = new ItemStack(ModItems.dustMithril);
                        ItemStack customDrop2 = new ItemStack(ModItems.dustMithril);

                        Block.spawnAsEntity(worldIn, pos, customDrop1);
                        Block.spawnAsEntity(worldIn, pos, customDrop2);

                        state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                        worldIn.setBlockToAir(pos);
                    } else if (oreType.equals("oreNickel")) {
                        ItemStack customDrop1 = new ItemStack(ModItems.dustNickel);
                        ItemStack customDrop2 = new ItemStack(ModItems.dustNickel);

                        Block.spawnAsEntity(worldIn, pos, customDrop1);
                        Block.spawnAsEntity(worldIn, pos, customDrop2);

                        state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                        worldIn.setBlockToAir(pos);
                    } else if (oreType.equals("oreOsmium")) {
                        ItemStack customDrop1 = new ItemStack(ModItems.dustOsmium);
                        ItemStack customDrop2 = new ItemStack(ModItems.dustOsmium);

                        Block.spawnAsEntity(worldIn, pos, customDrop1);
                        Block.spawnAsEntity(worldIn, pos, customDrop2);

                        state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                        worldIn.setBlockToAir(pos);
                    } else if (oreType.equals("orePlatinum")) {
                        ItemStack customDrop1 = new ItemStack(ModItems.dustPlatinum);
                        ItemStack customDrop2 = new ItemStack(ModItems.dustPlatinum);

                        Block.spawnAsEntity(worldIn, pos, customDrop1);
                        Block.spawnAsEntity(worldIn, pos, customDrop2);

                        state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                        worldIn.setBlockToAir(pos);
                    } else if (oreType.equals("oreSilver")) {
                        ItemStack customDrop1 = new ItemStack(ModItems.dustSilver);
                        ItemStack customDrop2 = new ItemStack(ModItems.dustSilver);

                        Block.spawnAsEntity(worldIn, pos, customDrop1);
                        Block.spawnAsEntity(worldIn, pos, customDrop2);

                        state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                        worldIn.setBlockToAir(pos);
                    } else if (oreType.equals("oreTin")) {
                        ItemStack customDrop1 = new ItemStack(ModItems.dustTin);
                        ItemStack customDrop2 = new ItemStack(ModItems.dustTin);

                        Block.spawnAsEntity(worldIn, pos, customDrop1);
                        Block.spawnAsEntity(worldIn, pos, customDrop2);

                        state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                        worldIn.setBlockToAir(pos);
                    } else if (oreType.equals("oreTitanium")) {
                        ItemStack customDrop1 = new ItemStack(ModItems.dustTitanium);
                        ItemStack customDrop2 = new ItemStack(ModItems.dustTitanium);

                        Block.spawnAsEntity(worldIn, pos, customDrop1);
                        Block.spawnAsEntity(worldIn, pos, customDrop2);

                        state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                        worldIn.setBlockToAir(pos);
                    } else if (oreType.equals("oreUranium")) {
                        ItemStack customDrop1 = new ItemStack(ModItems.dustUranium);
                        ItemStack customDrop2 = new ItemStack(ModItems.dustUranium);

                        Block.spawnAsEntity(worldIn, pos, customDrop1);
                        Block.spawnAsEntity(worldIn, pos, customDrop2);

                        state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                        worldIn.setBlockToAir(pos);
                    } else if (oreType.equals("oreZinc")) {
                        ItemStack customDrop1 = new ItemStack(ModItems.dustZinc);
                        ItemStack customDrop2 = new ItemStack(ModItems.dustZinc);

                        Block.spawnAsEntity(worldIn, pos, customDrop1);
                        Block.spawnAsEntity(worldIn, pos, customDrop2);

                        state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                        worldIn.setBlockToAir(pos);
                    } else if (oreType.equals("oreArdite")) {
                        ItemStack customDrop1 = new ItemStack(ModItems.dustArdite);
                        ItemStack customDrop2 = new ItemStack(ModItems.dustArdite);

                        Block.spawnAsEntity(worldIn, pos, customDrop1);
                        Block.spawnAsEntity(worldIn, pos, customDrop2);

                        state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                        worldIn.setBlockToAir(pos);
                    } else if (oreType.equals("oreAmethyst")) {
                        ItemStack customDrop1 = new ItemStack(ModItems.dustAmethyst);
                        ItemStack customDrop2 = new ItemStack(ModItems.dustAmethyst);

                        Block.spawnAsEntity(worldIn, pos, customDrop1);
                        Block.spawnAsEntity(worldIn, pos, customDrop2);

                        state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                        worldIn.setBlockToAir(pos);
                    } else if (oreType.equals("orePeridot")) {
                        ItemStack customDrop1 = new ItemStack(ModItems.dustPeridot);
                        ItemStack customDrop2 = new ItemStack(ModItems.dustPeridot);

                        Block.spawnAsEntity(worldIn, pos, customDrop1);
                        Block.spawnAsEntity(worldIn, pos, customDrop2);

                        state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                        worldIn.setBlockToAir(pos);
                    } else if (oreType.equals("oreRuby")) {
                        ItemStack customDrop1 = new ItemStack(ModItems.dustRuby);
                        ItemStack customDrop2 = new ItemStack(ModItems.dustRuby);

                        Block.spawnAsEntity(worldIn, pos, customDrop1);
                        Block.spawnAsEntity(worldIn, pos, customDrop2);

                        state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                        worldIn.setBlockToAir(pos);
                    } else if (oreType.equals("oreSapphire")) {
                        ItemStack customDrop1 = new ItemStack(ModItems.dustSapphire);
                        ItemStack customDrop2 = new ItemStack(ModItems.dustSapphire);

                        Block.spawnAsEntity(worldIn, pos, customDrop1);
                        Block.spawnAsEntity(worldIn, pos, customDrop2);

                        state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                        worldIn.setBlockToAir(pos);
                    } else if (oreType.equals("oreCinnabar")) {
                        ItemStack customDrop1 = new ItemStack(ModItems.dustCinnabar);
                        ItemStack customDrop2 = new ItemStack(ModItems.dustCinnabar);

                        Block.spawnAsEntity(worldIn, pos, customDrop1);
                        Block.spawnAsEntity(worldIn, pos, customDrop2);

                        state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                        worldIn.setBlockToAir(pos);
                    } else if (oreType.equals("oreIron")) {
                        ItemStack customDrop1 = new ItemStack(ModItems.dustIron);
                        ItemStack customDrop2 = new ItemStack(ModItems.dustIron);

                        Block.spawnAsEntity(worldIn, pos, customDrop1);
                        Block.spawnAsEntity(worldIn, pos, customDrop2);

                        state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                        worldIn.setBlockToAir(pos);
                    } else if (oreType.equals("oreGold")) {
                        ItemStack customDrop1 = new ItemStack(ModItems.dustGold);
                        ItemStack customDrop2 = new ItemStack(ModItems.dustGold);

                        Block.spawnAsEntity(worldIn, pos, customDrop1);
                        Block.spawnAsEntity(worldIn, pos, customDrop2);

                        state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                        worldIn.setBlockToAir(pos);
                    } else if (oreType.equals("oreDiamond")) {
                        ItemStack customDrop1 = new ItemStack(ModItems.dustDiamond);
                        ItemStack customDrop2 = new ItemStack(ModItems.dustDiamond);

                        Block.spawnAsEntity(worldIn, pos, customDrop1);
                        Block.spawnAsEntity(worldIn, pos, customDrop2);

                        state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                        worldIn.setBlockToAir(pos);
                    } else if (oreType.equals("oreEmerald")) {
                        ItemStack customDrop1 = new ItemStack(ModItems.dustEmerald);
                        ItemStack customDrop2 = new ItemStack(ModItems.dustEmerald);

                        Block.spawnAsEntity(worldIn, pos, customDrop1);
                        Block.spawnAsEntity(worldIn, pos, customDrop2);

                        state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                        worldIn.setBlockToAir(pos);
                    }
                }
            }
        }
        return super.onBlockDestroyed(stack, worldIn, state, pos, entityLiving);
    }
}
