package com.blueberrysoda.oreinamillion.init;

import com.blueberrysoda.oreinamillion.blocks.base.BlockBase;
import com.blueberrysoda.oreinamillion.blocks.base.BlockBaseFalling;
import com.blueberrysoda.oreinamillion.util.enumerations.*;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.*;

@Mod.EventBusSubscriber
public class ModBlocksExp {

    private static final Map<String, Block> BLOCKS = new LinkedHashMap<>();
    private static final Map<String, ItemBlock> BLOCK_ITEM = new LinkedHashMap<>();

    private static final Map<CategoryItem, Set<BlockType>> exclusionMap = new HashMap<>();

    static {
        exclusionMap.put(CategoryItem.Alloy, EnumSet.of(BlockType.Ore));
    }

    private static final Set<String> exclusionList = new HashSet<>(Arrays.asList(
            "iron_block", "gold_block", "diamond_block", "coal_block",
            "iron_ore", "gold_ore", "diamond_ore", "coal_ore", "redstone_ore", "lapis_ore",
            "wood_block", "wood_ore", "stone_block", "stone_ore", "lapis_block"
    ));

    public static void init() {
        for (MaterialType material : MaterialType.values()) {
            for (BlockType type : BlockType.values()) {
                String blockName = material.name().toLowerCase() + "_" + type.name().toLowerCase();

                if (exclusionMap.containsKey(material.getCategory()) && exclusionMap.get(material.getCategory()).contains(type)) {
                    System.err.println("Skipping item registration: " + blockName);
                    continue;
                }

                if (exclusionList.contains(blockName)) {
                    System.out.println("Skipping block registration: " + blockName);
                    continue;
                }

                Block block;

                switch (type.getCategory()) {
                    case Falling:
                        block = new BlockBaseFalling(blockName, type.getTool(), 0, type.getSoundType());
                        break;
                    default:
                        block = new BlockBase(blockName, type.getMaterial(), type.getTool(), material.getHarvestLevel(), type.getSoundType());
                        break;
                }

                block.setCreativeTab(type.getCreativeTab());
                BLOCKS.put(blockName, block);

                ItemBlock itemBlock = new ItemBlock(block);
                itemBlock.setRegistryName(blockName);
                BLOCK_ITEM.put(blockName, itemBlock);
            }
        }
    }

    @SubscribeEvent
    public static void registerBlockColors(ColorHandlerEvent.Block event) {
        BlockColors blockColors = event.getBlockColors();

        for (Map.Entry<String, Block> entry : BLOCKS.entrySet()) {
            String blockName = entry.getKey();
            Block block = entry.getValue();

            String materialName = blockName.split("_")[0];
            MaterialType materialType = getMaterialType(materialName);

            blockColors.registerBlockColorHandler((state, world, pos, tintIndex) -> {
                return tintIndex == 0 ? materialType.getColor() : -1;
            }, block);
        }
    }

    @SubscribeEvent
    public static void registerItemColors(ColorHandlerEvent.Item event) {
        ItemColors itemColors = event.getItemColors();
        BlockColors blockColors = event.getBlockColors();

        for (Map.Entry<String, Block> entry : BLOCKS.entrySet()) {
            String blockName = entry.getKey();
            Block block = entry.getValue();

            String materialName = blockName.split("_")[0];
            MaterialType materialType = getMaterialType(materialName);

            itemColors.registerItemColorHandler((stack, tintIndex) -> {
                return tintIndex == 0 ? materialType.getColor() : -1;
            }, Item.getItemFromBlock(block));
        }
    }

    public static MaterialType getMaterialType(String name) {
        for (MaterialType material : MaterialType.values()) {
            if (material.name().equalsIgnoreCase(name)) {
                return material;
            }
        }
        throw new IllegalArgumentException("Invalid material type: " + name);
    }

    @SubscribeEvent
    public static void registerBlock(RegistryEvent.Register<Block> event){
        for (Block block : BLOCKS.values()) {
            event.getRegistry().register(block);
        }
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void registerRenders(ModelRegistryEvent event){
        for (Block block : BLOCKS.values()) {
            registerRender(Item.getItemFromBlock(block));
        }
    }

    public static void registerRender(Item item)
    {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Objects.requireNonNull(item.getRegistryName()), "inventory"));
    }

    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
        for (ItemBlock item : BLOCK_ITEM.values()) {
            event.getRegistry().register(item);
        }
    }

    @SubscribeEvent
    public static void registerBlockModels(ModelRegistryEvent event) {
        for (Block block : BLOCKS.values()) {
            ModelLoader.setCustomModelResourceLocation(
                    Item.getItemFromBlock(block), 0, new ModelResourceLocation(
                            Objects.requireNonNull(block.getRegistryName()
                            ),
                            "inventory"
                    )
            );
        }
    }
}
