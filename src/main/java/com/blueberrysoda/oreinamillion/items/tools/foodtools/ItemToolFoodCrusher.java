package com.blueberrysoda.oreinamillion.items.tools.foodtools;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import com.blueberrysoda.oreinamillion.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
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
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

public class ItemToolFoodCrusher extends ItemPickaxe {

    private final int healAmount;
    private static boolean addTooltip;

    public ItemToolFoodCrusher(String name, ToolMaterial material, int amount, boolean addTooltip) {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(OreInAMillion.MODID + "." + name);
        setCreativeTab(OreInAMillion.CREATIVE_TAB_TOOL);
        this.healAmount = amount;
        ItemToolFoodCrusher.addTooltip = addTooltip;
    }

    public float saturation() {
        return (float) this.healAmount / 2;
    }

    @Override
    @Nonnull
    public EnumAction getItemUseAction(ItemStack stack) {
        return EnumAction.EAT;
    }


    @Override
    public int getMaxItemUseDuration (ItemStack stack) {
        return 32;
    }

    @Nonnull
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving) {
        if (entityLiving instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) entityLiving;
            worldIn.playSound(null, entityLiving.posX, entityLiving.posY, entityLiving.posZ, SoundEvents.ENTITY_PLAYER_BURP, SoundCategory.PLAYERS, 0.5F, worldIn.rand.nextFloat() * 0.1F + 0.9F);
            player.getFoodStats().addStats(healAmount, saturation());
            stack.shrink(1);

            ItemStack dropStack = new ItemStack(Items.STICK, 2);
            player.dropItem(dropStack, false);
        }
        return super.onItemUseFinish(stack, worldIn, entityLiving);
    }



    @Override
    @Nonnull
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

                //aluminum
                if (harvestLevel >= requiredHarvestLevel) {
                    switch (oreType) {
                        case "oreAluminum": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustAluminum);
                            int itemDrops = 2;

                            for (int i = 0; i < itemDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        //chrome
                        case "oreChrome": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustChrome);
                            int itemDrops = 2;

                            for (int i = 0; i < itemDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        //cobalt
                        case "oreCobalt": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustCobalt);
                            int itemDrops = 2;

                            for (int i = 0; i < itemDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        //copper
                        case "oreCopper": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustCopper);
                            int itemDrops = 2;

                            for (int i = 0; i < itemDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreEnder": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustEnder);
                            int itemDrops = 2;

                            for (int i = 0; i < itemDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreIridium": {
                            ItemStack crusherDrop = new ItemStack(ModItems.ingotIridium);
                            int itemDrops = 2;

                            for (int i = 0; i < itemDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreLead": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustLead);
                            int itemDrops = 2;

                            for (int i = 0; i < itemDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreMithril": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustMithril);
                            int itemDrops = 2;

                            for (int i = 0; i < itemDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreNickel": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustNickel);
                            int itemDrops = 2;

                            for (int i = 0; i < itemDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreOsmium": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustOsmium);
                            int itemDrops = 2;

                            for (int i = 0; i < itemDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "orePlatinum": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustPlatinum);
                            int itemDrops = 2;

                            for (int i = 0; i < itemDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreSilver": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustSilver);
                            int itemDrops = 2;

                            for (int i = 0; i < itemDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreTin": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustTin);
                            int itemDrops = 2;

                            for (int i = 0; i < itemDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreTitanium": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustTitanium);
                            int itemDrops = 2;

                            for (int i = 0; i < itemDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreUranium": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustUranium);
                            int itemDrops = 2;

                            for (int i = 0; i < itemDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreZinc": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustZinc);
                            int itemDrops = 2;

                            for (int i = 0; i < itemDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreArdite": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustArdite);
                            int itemDrops = 2;

                            for (int i = 0; i < itemDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreAmethyst": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustAmethyst);
                            int itemDrops = 2;

                            for (int i = 0; i < itemDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "orePeridot": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustPeridot);
                            int itemDrops = 2;

                            for (int i = 0; i < itemDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreRuby": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustRuby);
                            int itemDrops = 2;

                            for (int i = 0; i < itemDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreSapphire": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustSapphire);
                            int itemDrops = 2;

                            for (int i = 0; i < itemDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreCinnabar": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustCinnabar);
                            int itemDrops = 2;

                            for (int i = 0; i < itemDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreSulfur": {
                            ItemStack crusherDrop = new ItemStack(ModItems.elementSulfur);
                            int itemDrops = 4;

                            for (int i = 0; i < itemDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreIron": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustIron);
                            int itemDrops = 2;

                            for (int i = 0; i < itemDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreGold": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustGold);
                            int itemDrops = 2;

                            for (int i = 0; i < itemDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreDiamond": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustDiamond);
                            int itemDrops = 2;

                            for (int i = 0; i < itemDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreEmerald": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustEmerald);
                            int itemDrops = 2;

                            for (int i = 0; i < itemDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreCoal": {
                            ItemStack crusherDrop = new ItemStack(ModItems.dustCoal);
                            int itemDrops = 2;

                            for (int i = 0; i < itemDrops; i++) {
                                Block.spawnAsEntity(worldIn, pos, crusherDrop);
                            }

                            state.getBlock().dropXpOnBlockBreak(worldIn, pos, 0);
                            worldIn.setBlockToAir(pos);
                            break;
                        }
                        case "oreWeezer": {
                            ItemStack crusherDrop = new ItemStack(ModItems.weezerWeezer);
                            int itemDrops = 4;

                            for (int i = 0; i < itemDrops; i++) {
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

    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
        super.addInformation(stack,worldIn,tooltip,flagIn);
        if (ItemToolFoodCrusher.addTooltip) {
            String s = stack.getItem().getUnlocalizedName() + ".tooltip";
            String result = I18n.format(s);
            tooltip.add(result);
        }
    }
}
