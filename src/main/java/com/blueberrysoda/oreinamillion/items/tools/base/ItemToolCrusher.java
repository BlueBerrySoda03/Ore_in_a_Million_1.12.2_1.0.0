package com.blueberrysoda.oreinamillion.items.tools.base;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import com.blueberrysoda.oreinamillion.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;

public class ItemToolCrusher extends ItemPickaxe {
    public ItemToolCrusher(String name, ToolMaterial material) {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(OreInAMillion.MODID + "." + name);
        setCreativeTab(OreInAMillion.CREATIVE_TAB_TOOL);
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

                //aluminum
                if (harvestLevel >= requiredHarvestLevel) {
                    switch (oreType) {
                        case "oreAluminum": {
                            ItemStack customDrop1 = new ItemStack(ModItems.dustAluminum);
                            ItemStack customDrop2 = new ItemStack(ModItems.dustAluminum);

                            Block.spawnAsEntity(worldIn, pos, customDrop1);
                            Block.spawnAsEntity(worldIn, pos, customDrop2);

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        //chrome
                        case "oreChrome": {
                            ItemStack customDrop1 = new ItemStack(ModItems.dustChrome);
                            ItemStack customDrop2 = new ItemStack(ModItems.dustChrome);

                            Block.spawnAsEntity(worldIn, pos, customDrop1);
                            Block.spawnAsEntity(worldIn, pos, customDrop2);

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        //cobalt
                        case "oreCobalt": {
                            ItemStack customDrop1 = new ItemStack(ModItems.dustCobalt);
                            ItemStack customDrop2 = new ItemStack(ModItems.dustCobalt);

                            Block.spawnAsEntity(worldIn, pos, customDrop1);
                            Block.spawnAsEntity(worldIn, pos, customDrop2);

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        //copper
                        case "oreCopper": {
                            ItemStack customDrop1 = new ItemStack(ModItems.dustCopper);
                            ItemStack customDrop2 = new ItemStack(ModItems.dustCopper);

                            Block.spawnAsEntity(worldIn, pos, customDrop1);
                            Block.spawnAsEntity(worldIn, pos, customDrop2);

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreEnder": {
                            ItemStack customDrop1 = new ItemStack(ModItems.dustEnder);
                            ItemStack customDrop2 = new ItemStack(ModItems.dustEnder);

                            Block.spawnAsEntity(worldIn, pos, customDrop1);
                            Block.spawnAsEntity(worldIn, pos, customDrop2);

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreIridium": {
                            ItemStack customDrop1 = new ItemStack(ModItems.dustIridium);
                            ItemStack customDrop2 = new ItemStack(ModItems.dustIridium);

                            Block.spawnAsEntity(worldIn, pos, customDrop1);
                            Block.spawnAsEntity(worldIn, pos, customDrop2);

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreLead": {
                            ItemStack customDrop1 = new ItemStack(ModItems.dustLead);
                            ItemStack customDrop2 = new ItemStack(ModItems.dustLead);

                            Block.spawnAsEntity(worldIn, pos, customDrop1);
                            Block.spawnAsEntity(worldIn, pos, customDrop2);

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreMithril": {
                            ItemStack customDrop1 = new ItemStack(ModItems.dustMithril);
                            ItemStack customDrop2 = new ItemStack(ModItems.dustMithril);

                            Block.spawnAsEntity(worldIn, pos, customDrop1);
                            Block.spawnAsEntity(worldIn, pos, customDrop2);

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreNickel": {
                            ItemStack customDrop1 = new ItemStack(ModItems.dustNickel);
                            ItemStack customDrop2 = new ItemStack(ModItems.dustNickel);

                            Block.spawnAsEntity(worldIn, pos, customDrop1);
                            Block.spawnAsEntity(worldIn, pos, customDrop2);

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreOsmium": {
                            ItemStack customDrop1 = new ItemStack(ModItems.dustOsmium);
                            ItemStack customDrop2 = new ItemStack(ModItems.dustOsmium);

                            Block.spawnAsEntity(worldIn, pos, customDrop1);
                            Block.spawnAsEntity(worldIn, pos, customDrop2);

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "orePlatinum": {
                            ItemStack customDrop1 = new ItemStack(ModItems.dustPlatinum);
                            ItemStack customDrop2 = new ItemStack(ModItems.dustPlatinum);

                            Block.spawnAsEntity(worldIn, pos, customDrop1);
                            Block.spawnAsEntity(worldIn, pos, customDrop2);

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreSilver": {
                            ItemStack customDrop1 = new ItemStack(ModItems.dustSilver);
                            ItemStack customDrop2 = new ItemStack(ModItems.dustSilver);

                            Block.spawnAsEntity(worldIn, pos, customDrop1);
                            Block.spawnAsEntity(worldIn, pos, customDrop2);

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreTin": {
                            ItemStack customDrop1 = new ItemStack(ModItems.dustTin);
                            ItemStack customDrop2 = new ItemStack(ModItems.dustTin);

                            Block.spawnAsEntity(worldIn, pos, customDrop1);
                            Block.spawnAsEntity(worldIn, pos, customDrop2);

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreTitanium": {
                            ItemStack customDrop1 = new ItemStack(ModItems.dustTitanium);
                            ItemStack customDrop2 = new ItemStack(ModItems.dustTitanium);

                            Block.spawnAsEntity(worldIn, pos, customDrop1);
                            Block.spawnAsEntity(worldIn, pos, customDrop2);

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreUranium": {
                            ItemStack customDrop1 = new ItemStack(ModItems.dustUranium);
                            ItemStack customDrop2 = new ItemStack(ModItems.dustUranium);

                            Block.spawnAsEntity(worldIn, pos, customDrop1);
                            Block.spawnAsEntity(worldIn, pos, customDrop2);

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreZinc": {
                            ItemStack customDrop1 = new ItemStack(ModItems.dustZinc);
                            ItemStack customDrop2 = new ItemStack(ModItems.dustZinc);

                            Block.spawnAsEntity(worldIn, pos, customDrop1);
                            Block.spawnAsEntity(worldIn, pos, customDrop2);

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreArdite": {
                            ItemStack customDrop1 = new ItemStack(ModItems.dustArdite);
                            ItemStack customDrop2 = new ItemStack(ModItems.dustArdite);

                            Block.spawnAsEntity(worldIn, pos, customDrop1);
                            Block.spawnAsEntity(worldIn, pos, customDrop2);

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreAmethyst": {
                            ItemStack customDrop1 = new ItemStack(ModItems.dustAmethyst);
                            ItemStack customDrop2 = new ItemStack(ModItems.dustAmethyst);

                            Block.spawnAsEntity(worldIn, pos, customDrop1);
                            Block.spawnAsEntity(worldIn, pos, customDrop2);

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "orePeridot": {
                            ItemStack customDrop1 = new ItemStack(ModItems.dustPeridot);
                            ItemStack customDrop2 = new ItemStack(ModItems.dustPeridot);

                            Block.spawnAsEntity(worldIn, pos, customDrop1);
                            Block.spawnAsEntity(worldIn, pos, customDrop2);

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreRuby": {
                            ItemStack customDrop1 = new ItemStack(ModItems.dustRuby);
                            ItemStack customDrop2 = new ItemStack(ModItems.dustRuby);

                            Block.spawnAsEntity(worldIn, pos, customDrop1);
                            Block.spawnAsEntity(worldIn, pos, customDrop2);

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreSapphire": {
                            ItemStack customDrop1 = new ItemStack(ModItems.dustSapphire);
                            ItemStack customDrop2 = new ItemStack(ModItems.dustSapphire);

                            Block.spawnAsEntity(worldIn, pos, customDrop1);
                            Block.spawnAsEntity(worldIn, pos, customDrop2);

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreCinnabar": {
                            ItemStack customDrop1 = new ItemStack(ModItems.dustCinnabar);
                            ItemStack customDrop2 = new ItemStack(ModItems.dustCinnabar);

                            Block.spawnAsEntity(worldIn, pos, customDrop1);
                            Block.spawnAsEntity(worldIn, pos, customDrop2);

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreIron": {
                            ItemStack customDrop1 = new ItemStack(ModItems.dustIron);
                            ItemStack customDrop2 = new ItemStack(ModItems.dustIron);

                            Block.spawnAsEntity(worldIn, pos, customDrop1);
                            Block.spawnAsEntity(worldIn, pos, customDrop2);

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreGold": {
                            ItemStack customDrop1 = new ItemStack(ModItems.dustGold);
                            ItemStack customDrop2 = new ItemStack(ModItems.dustGold);

                            Block.spawnAsEntity(worldIn, pos, customDrop1);
                            Block.spawnAsEntity(worldIn, pos, customDrop2);

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreDiamond": {
                            ItemStack customDrop1 = new ItemStack(ModItems.dustDiamond);
                            ItemStack customDrop2 = new ItemStack(ModItems.dustDiamond);

                            Block.spawnAsEntity(worldIn, pos, customDrop1);
                            Block.spawnAsEntity(worldIn, pos, customDrop2);

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreEmerald": {
                            ItemStack customDrop1 = new ItemStack(ModItems.dustEmerald);
                            ItemStack customDrop2 = new ItemStack(ModItems.dustEmerald);

                            Block.spawnAsEntity(worldIn, pos, customDrop1);
                            Block.spawnAsEntity(worldIn, pos, customDrop2);

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreCoal": {
                            ItemStack customDrop1 = new ItemStack(ModItems.dustCoal);
                            ItemStack customDrop2 = new ItemStack(ModItems.dustCoal);

                            Block.spawnAsEntity(worldIn, pos, customDrop1);
                            Block.spawnAsEntity(worldIn, pos, customDrop2);

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreWeezer": {
                            ItemStack customDrop1 = new ItemStack(ModItems.weezerWeezer);
                            ItemStack customDrop2 = new ItemStack(ModItems.weezerWeezer);
                            ItemStack customDrop3 = new ItemStack(ModItems.weezerWeezer);
                            ItemStack customDrop4 = new ItemStack(ModItems.weezerWeezer);

                            Block.spawnAsEntity(worldIn, pos, customDrop1);
                            Block.spawnAsEntity(worldIn, pos, customDrop2);
                            Block.spawnAsEntity(worldIn, pos, customDrop3);
                            Block.spawnAsEntity(worldIn, pos, customDrop4);

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
