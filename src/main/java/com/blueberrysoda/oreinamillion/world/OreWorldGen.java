package com.blueberrysoda.oreinamillion.world;

import com.blueberrysoda.oreinamillion.util.enumerations.MaterialType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class OreWorldGen implements IWorldGenerator {
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        //overworld
        if (world.provider.getDimension() == 0){
            generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);

            int x = (chunkX * 16) + random.nextInt(16);
            int z = (chunkZ * 16) + random.nextInt(16);
            BlockPos position = new BlockPos(x, random.nextInt(255), z);

            if (BiomeDictionary.hasType(world.getBiome(position), BiomeDictionary.Type.HOT)) {
                generateOverworldHot(world, position, random);
            }
            if (BiomeDictionary.hasType(world.getBiome(position), BiomeDictionary.Type.COLD)) {
                generateOverworldCold(world, position, random);
            }
            if (BiomeDictionary.hasType(world.getBiome(position), BiomeDictionary.Type.OCEAN)) {
                generateOverworldOcean(world, position, random);
            }
        }
        //nether
        if (world.provider.getDimension() == -1){
            generateNether(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
        }
        //end
        if (world.provider.getDimension() == 1){
            generateEnd(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
        }
    }

    private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        //adamantine
        if (MaterialType.Adamantine.getBlock("ore") != null) {
            IBlockState finalBlock = MaterialType.Adamantine.getBlock("ore").getDefaultState();

            if (MaterialType.Adamantine.getBlock("cluster") != null && random.nextFloat() < 0.03f) {
                finalBlock = MaterialType.Adamantine.getBlock("cluster").getDefaultState();
            }

            generateOre(finalBlock, world, random, chunkX * 16, chunkZ * 16, 0, 32, random.nextInt(4) + 1, 3);
        }

        //aluminum
        if (MaterialType.Aluminum.getBlock("ore") != null) {
            IBlockState finalBlock = MaterialType.Aluminum.getBlock("ore").getDefaultState();

            if (MaterialType.Aluminum.getBlock("cluster") != null && random.nextFloat() < 0.02f) {
                finalBlock = MaterialType.Aluminum.getBlock("cluster").getDefaultState();
            }

            generateOre(finalBlock, world, random, chunkX * 16, chunkZ * 16, 0, 64, random.nextInt(9) + 2, 7);
        }

        //amethyst
        if (MaterialType.Amethyst.getBlock("ore") != null) {
            IBlockState finalBlock = MaterialType.Amethyst.getBlock("ore").getDefaultState();

            if (MaterialType.Amethyst.getBlock("cluster") != null && random.nextFloat() < 0.03f) {
                finalBlock = MaterialType.Amethyst.getBlock("cluster").getDefaultState();
            }

            generateOre(finalBlock, world, random, chunkX * 16, chunkZ * 16, 0, 50, random.nextInt(7) + 2, 5);
        }

        //chrome
        if (MaterialType.Chrome.getBlock("ore") != null) {
            IBlockState finalBlock = MaterialType.Chrome.getBlock("ore").getDefaultState();

            if (MaterialType.Chrome.getBlock("cluster") != null && random.nextFloat() < 0.03f) {
                finalBlock = MaterialType.Chrome.getBlock("cluster").getDefaultState();
            }

            generateOre(finalBlock, world, random, chunkX * 16, chunkZ * 16, 10, 40, random.nextInt(5) + 2, 5);
        }

        //cobalt
        if (MaterialType.Cobalt.getBlock("ore") != null) {
            IBlockState finalBlock = MaterialType.Cobalt.getBlock("ore").getDefaultState();

            if (MaterialType.Cobalt.getBlock("cluster") != null && random.nextFloat() < 0.02f) {
                finalBlock = MaterialType.Cobalt.getBlock("cluster").getDefaultState();
            }

            generateOre(finalBlock, world, random, chunkX * 16, chunkZ * 16, 0, 42, random.nextInt(6) + 2, 5);
        }

        //copper
        if (MaterialType.Copper.getBlock("ore") != null) {
            IBlockState finalBlock = MaterialType.Copper.getBlock("ore").getDefaultState();

            if (MaterialType.Copper.getBlock("cluster") != null && random.nextFloat() < 0.02f) {
                finalBlock = MaterialType.Copper.getBlock("cluster").getDefaultState();
            }

            generateOre(finalBlock, world, random, chunkX * 16, chunkZ * 16, 0, 56, random.nextInt(9) + 2, 9);
        }

        //ender
        if (MaterialType.Ender.getBlock("ore") != null) {
            IBlockState finalBlock = MaterialType.Ender.getBlock("ore").getDefaultState();

            if (MaterialType.Ender.getBlock("cluster") != null && random.nextFloat() < 0.03f) {
                finalBlock = MaterialType.Ender.getBlock("cluster").getDefaultState();
            }

            generateOre(finalBlock, world, random, chunkX * 16, chunkZ * 16, 0, 20, random.nextInt(4) + 1, 3);
            generateOre(finalBlock, world, random, chunkX * 16, chunkZ * 16, 130, 255, random.nextInt(11) + 5, 1);
        }

        //iridium
        if (MaterialType.Iridium.getBlock("ore") != null) {
            IBlockState finalBlock = MaterialType.Iridium.getBlock("ore").getDefaultState();

            if (MaterialType.Iridium.getBlock("cluster") != null && random.nextFloat() < 0.02f) {
                finalBlock = MaterialType.Iridium.getBlock("cluster").getDefaultState();
            }

            generateOre(finalBlock, world, random, chunkX * 16, chunkZ * 16, 0, 35, random.nextInt(6) + 2, 5);
        }

        //lithium
        if (MaterialType.Lithium.getBlock("ore") != null) {
            IBlockState finalBlock = MaterialType.Lithium.getBlock("ore").getDefaultState();

            if (MaterialType.Lithium.getBlock("cluster") != null && random.nextFloat() < 0.02f) {
                finalBlock = MaterialType.Lithium.getBlock("cluster").getDefaultState();
            }

            generateOre(finalBlock, world, random, chunkX * 16, chunkZ * 16, 0, 32, random.nextInt(4) + 1, 3);
        }

        //lead
        if (MaterialType.Lead.getBlock("ore") != null) {
            IBlockState finalBlock = MaterialType.Lead.getBlock("ore").getDefaultState();

            if (MaterialType.Lead.getBlock("cluster") != null && random.nextFloat() < 0.02f) {
                finalBlock = MaterialType.Lead.getBlock("cluster").getDefaultState();
            }

            generateOre(finalBlock, world, random, chunkX * 16, chunkZ * 16, 18, 64, random.nextInt(6) + 2, 5);
        }

        //mithril
        if (MaterialType.Mithril.getBlock("ore") != null) {
            IBlockState finalBlock = MaterialType.Mithril.getBlock("ore").getDefaultState();

            if (MaterialType.Mithril.getBlock("cluster") != null && random.nextFloat() < 0.02f) {
                finalBlock = MaterialType.Mithril.getBlock("cluster").getDefaultState();
            }

            generateOre(finalBlock, world, random, chunkX * 16, chunkZ * 16, 0, 50, random.nextInt(4) + 1, 5);
        }

        //nickel
        if (MaterialType.Nickel.getBlock("ore") != null) {
            IBlockState finalBlock = MaterialType.Nickel.getBlock("ore").getDefaultState();

            if (MaterialType.Nickel.getBlock("cluster") != null && random.nextFloat() < 0.02f) {
                finalBlock = MaterialType.Nickel.getBlock("cluster").getDefaultState();
            }

            generateOre(finalBlock, world, random, chunkX * 16, chunkZ * 16, 0, 25, random.nextInt(6) + 2, 4);
        }

        //osmium
        if (MaterialType.Osmium.getBlock("ore") != null) {
            IBlockState finalBlock = MaterialType.Osmium.getBlock("ore").getDefaultState();

            if (MaterialType.Osmium.getBlock("cluster") != null && random.nextFloat() < 0.02f) {
                finalBlock = MaterialType.Osmium.getBlock("cluster").getDefaultState();
            }

            generateOre(finalBlock, world, random, chunkX * 16, chunkZ * 16, 0, 64, random.nextInt(9) + 2, 6);
        }

        //peridot
        if (MaterialType.Peridot.getBlock("ore") != null) {
            IBlockState finalBlock = MaterialType.Peridot.getBlock("ore").getDefaultState();

            if (MaterialType.Peridot.getBlock("cluster") != null && random.nextFloat() < 0.03f) {
                finalBlock = MaterialType.Peridot.getBlock("cluster").getDefaultState();
            }

            generateOre(finalBlock, world, random, chunkX * 16, chunkZ * 16, 32, 84, random.nextInt(6) + 2, 5);
        }

        //platinum
        if (MaterialType.Platinum.getBlock("ore") != null) {
            IBlockState finalBlock = MaterialType.Platinum.getBlock("ore").getDefaultState();

            if (MaterialType.Platinum.getBlock("cluster") != null && random.nextFloat() < 0.03f) {
                finalBlock = MaterialType.Platinum.getBlock("cluster").getDefaultState();
            }

            generateOre(finalBlock, world, random, chunkX * 16, chunkZ * 16, 0, 25, random.nextInt(7) + 2, 5);
        }

        //ruby
        if (MaterialType.Ruby.getBlock("ore") != null) {
            IBlockState finalBlock = MaterialType.Ruby.getBlock("ore").getDefaultState();

            if (MaterialType.Ruby.getBlock("cluster") != null && random.nextFloat() < 0.03f) {
                finalBlock = MaterialType.Ruby.getBlock("cluster").getDefaultState();
            }

            generateOre(finalBlock, world, random, chunkX * 16, chunkZ * 16, 0, 22, random.nextInt(8) + 2, 4);
        }

        //sapphire
        if (MaterialType.Sapphire.getBlock("ore") != null) {
            IBlockState finalBlock = MaterialType.Sapphire.getBlock("ore").getDefaultState();

            if (MaterialType.Sapphire.getBlock("cluster") != null && random.nextFloat() < 0.03f) {
                finalBlock = MaterialType.Sapphire.getBlock("cluster").getDefaultState();
            }

            generateOre(finalBlock, world, random, chunkX * 16, chunkZ * 16, 0, 22, random.nextInt(8) + 2, 4);
        }

        //silver
        if (MaterialType.Silver.getBlock("ore") != null) {
            IBlockState finalBlock = MaterialType.Silver.getBlock("ore").getDefaultState();

            if (MaterialType.Silver.getBlock("cluster") != null && random.nextFloat() < 0.02f) {
                finalBlock = MaterialType.Silver.getBlock("cluster").getDefaultState();
            }

            generateOre(finalBlock, world, random, chunkX * 16, chunkZ * 16, 0, 45, random.nextInt(7) + 3, 6);
        }

        //sulfur
        if (MaterialType.Sulfur.getBlock("ore") != null) {
            IBlockState finalBlock = MaterialType.Sulfur.getBlock("ore").getDefaultState();

            if (MaterialType.Sulfur.getBlock("cluster") != null && random.nextFloat() < 0.2f) {
                finalBlock = MaterialType.Sulfur.getBlock("cluster").getDefaultState();
            }

            generateOre(finalBlock, world, random, chunkX * 16, chunkZ * 16, 64, 255, random.nextInt(11) + 3, 8);
            generateOre(finalBlock, world, random, chunkX * 16, chunkZ * 16, 0, 64, random.nextInt(3) + 1, 4);
        }

        //tin
        if (MaterialType.Tin.getBlock("ore") != null) {
            IBlockState finalBlock = MaterialType.Tin.getBlock("ore").getDefaultState();

            if (MaterialType.Tin.getBlock("cluster") != null && random.nextFloat() < 0.02f) {
                finalBlock = MaterialType.Tin.getBlock("cluster").getDefaultState();
            }

            generateOre(finalBlock, world, random, chunkX * 16, chunkZ * 16, 0, 64, random.nextInt(9) + 2, 7);
        }

        //titanium
        if (MaterialType.Titanium.getBlock("ore") != null) {
            IBlockState finalBlock = MaterialType.Titanium.getBlock("ore").getDefaultState();

            if (MaterialType.Titanium.getBlock("cluster") != null && random.nextFloat() < 0.03f) {
                finalBlock = MaterialType.Titanium.getBlock("cluster").getDefaultState();
            }

            generateOre(finalBlock, world, random, chunkX * 16, chunkZ * 16, 0, 26, random.nextInt(6) + 3, 4);
        }

        //tungsten
        if (MaterialType.Tungsten.getBlock("ore") != null) {
            IBlockState finalBlock = MaterialType.Tungsten.getBlock("ore").getDefaultState();

            if (MaterialType.Tungsten.getBlock("cluster") != null && random.nextFloat() < 0.02f) {
                finalBlock = MaterialType.Tungsten.getBlock("cluster").getDefaultState();
            }

            generateOre(finalBlock, world, random, chunkX * 16, chunkZ * 16, 0, 44, random.nextInt(7) + 1, 5);
        }

        //uranium
        if (MaterialType.Uranium.getBlock("ore") != null) {
            IBlockState finalBlock = MaterialType.Uranium.getBlock("ore").getDefaultState();

            if (MaterialType.Uranium.getBlock("cluster") != null && random.nextFloat() < 0.03f) {
                finalBlock = MaterialType.Uranium.getBlock("cluster").getDefaultState();
            }

            generateOre(finalBlock, world, random, chunkX * 16, chunkZ * 16, 0, 16, random.nextInt(4) + 1, 4);
        }

        //zinc
        if (MaterialType.Zinc.getBlock("ore") != null) {
            IBlockState finalBlock = MaterialType.Zinc.getBlock("ore").getDefaultState();

            if (MaterialType.Zinc.getBlock("cluster") != null && random.nextFloat() < 0.02f) {
                finalBlock = MaterialType.Zinc.getBlock("cluster").getDefaultState();
            }

            generateOre(finalBlock, world, random, chunkX * 16, chunkZ * 16, 18, 64, random.nextInt(5) + 1, 5);
        }
//                //gems
//               if (GeneralConfig.isGemsEnabled) {
//                    //amethyst
//                    if (MineralsConfig.isAmethystEnabled) {
//                        generateOre(ModBlocks.oreAmethyst.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 50, random.nextInt(7) + 2, 5);
//                    }
//                    //peridot
//                    if (MineralsConfig.isPeridotEnabled) {
//                        generateOre(ModBlocks.orePeridot.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 32, 84, random.nextInt(6) + 2, 5);
//                    }
//                    //ruby
//                    if (MineralsConfig.isRubyEnabled) {
//                        generateOre(ModBlocks.oreRuby.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 22, random.nextInt(8) + 2, 4);
//                    }
//                    //sapphire
//                    if (MineralsConfig.isSapphireEnabled) {
//                        generateOre(ModBlocks.oreSapphire.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 22, random.nextInt(8) + 2, 4);
//                    }
//                }
//                //elements
//                if (GeneralConfig.isElementsEnabled){
//                    //cinnabar
//                    if (MineralsConfig.isCinnabarEnabled){
//                        generateOre(ModBlocks.oreCinnabar.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 64, 255, random.nextInt(1) + 1, 8);
//                    }
//                }
//                //silly stuffs
//                if (GeneralConfig.isSillyStuffEnabled) {
//                    generateOre(ModBlocks.oreWeezer.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 255, random.nextInt(1) + 1, 1);
//                }
//            }
//        }
    }

    private void generateOverworldHot(World world, BlockPos position, Random random) {

    }

    private void generateOverworldCold(World world, BlockPos position, Random random) {

    }

    private void generateOverworldOcean(World world, BlockPos position, Random random) {

    }

    private void generateNether(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider){

    }

    private void generateEnd(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider){

    }

    private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances){
        int deltaY = maxY - minY;

        for (int i = 0; i < chances; i++){
            BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));

            WorldGenMinable generator = new WorldGenMinable(ore, size);
            generator.generate(world, random, pos);
        }
    }
}
