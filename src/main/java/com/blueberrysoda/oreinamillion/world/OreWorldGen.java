package com.blueberrysoda.oreinamillion.world;

import com.blueberrysoda.oreinamillion.config.GeneralConfig;
import com.blueberrysoda.oreinamillion.config.MineralsConfig;
import com.blueberrysoda.oreinamillion.config.ModCompatConfig;
import com.blueberrysoda.oreinamillion.init.ModBlocks;
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
        if (GeneralConfig.isMineralsEnabled) {
            if (GeneralConfig.isOreGenerationEnabled) {
                if (GeneralConfig.isIngotsEnabled) {
                    //adamantine
                    if (MineralsConfig.isAdamantineEnabled) {
                        generateOre(ModBlocks.oreAdamantine.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 32, random.nextInt(4) + 1, 3);
                    }
                    //aluminum
                    if (MineralsConfig.isAluminumEnabled) {
                        generateOre(ModBlocks.oreAluminum.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 64, random.nextInt(9) + 2, 7);
                    }
                    //chrome
                    if (MineralsConfig.isChromeEnabled) {
                        generateOre(ModBlocks.oreChrome.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 10, 40, random.nextInt(5) + 2, 5);
                    }
                    //cobalt
                    if (MineralsConfig.isCobaltEnabled) {
                        generateOre(ModBlocks.oreCobalt.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 42, random.nextInt(6) + 2, 5);
                    }
                    //copper
                    if (MineralsConfig.isCopperEnabled) {
                        generateOre(ModBlocks.oreCopper.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 56, random.nextInt(9) + 2, 9);
                    }
                    if (MineralsConfig.isEnderEnabled){
                        generateOre(ModBlocks.oreEnder.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 20, random.nextInt(4) + 1, 3);
                        generateOre(ModBlocks.oreEnder.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 100, 255, random.nextInt(11) + 5, 1);
                    }
                    //iridium
                    if (MineralsConfig.isIridiumEnabled) {
                        generateOre(ModBlocks.oreIridium.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 35, random.nextInt(6) + 2, 5);
                    }
                    //lead
                    if (MineralsConfig.isLeadEnabled) {
                        generateOre(ModBlocks.oreLead.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 18, 64, random.nextInt(6) + 2, 5);
                    }
                    //mithril
                    if (MineralsConfig.isMithrilEnabled) {
                        generateOre(ModBlocks.oreMithril.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 50, random.nextInt(4) + 1, 5);
                    }
                    //nickel
                    if (MineralsConfig.isNickelEnabled) {
                        generateOre(ModBlocks.oreNickel.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 25, random.nextInt(6) + 2, 4);
                    }
                    //osmium
                    if (MineralsConfig.isOsmiumEnabled) {
                        generateOre(ModBlocks.oreOsmium.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 64, random.nextInt(9) + 2, 6);
                    }
                    //platinum
                    if (MineralsConfig.isPlatinumEnabled) {
                        generateOre(ModBlocks.orePlatinum.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 25, random.nextInt(7) + 2, 5);
                    }
                    //silver
                    if (MineralsConfig.isSilverEnabled) {
                        generateOre(ModBlocks.orePlatinum.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 45, random.nextInt(7) + 3, 6);
                    }
                    //tin
                    if (MineralsConfig.isTinEnabled) {
                        generateOre(ModBlocks.oreTin.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 64, random.nextInt(9) + 2, 7);
                    }
                    //titanium
                    if (MineralsConfig.isTitaniumEnabled) {
                        generateOre(ModBlocks.oreTitanium.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 26, random.nextInt(6) + 3, 4);
                    }
                    //tungsten
                    if (MineralsConfig.isTungstenEnabled) {
                        generateOre(ModBlocks.oreTungsten.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 44, random.nextInt(7) + 1, 5);
                    }
                    //uranium
                    if (MineralsConfig.isUraniumEnabled) {
                        generateOre(ModBlocks.oreUranium.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 16, random.nextInt(4) + 1, 4);
                    }
                    //zinc
                    if (MineralsConfig.isZincEnabled) {
                        generateOre(ModBlocks.oreZinc.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 18, 64, random.nextInt(5) + 1, 5);
                    }
                    //tinkers construct
                    if (ModCompatConfig.isTinkersEnabled) {
                        //ardite
                        if (MineralsConfig.isArditeEnabled) {
                            generateOre(ModBlocks.oreArdite.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 16, random.nextInt(4) + 2, 3);
                        }
                    }
                }
                //gems
                if (GeneralConfig.isGemsEnabled) {
                    //amethyst
                    if (MineralsConfig.isAmethystEnabled) {
                        generateOre(ModBlocks.oreAmethyst.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 50, random.nextInt(7) + 2, 5);
                    }
                    //peridot
                    if (MineralsConfig.isPeridotEnabled) {
                        generateOre(ModBlocks.orePeridot.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 32, 84, random.nextInt(6) + 2, 5);
                    }
                    //ruby
                    if (MineralsConfig.isRubyEnabled) {
                        generateOre(ModBlocks.oreRuby.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 22, random.nextInt(8) + 2, 4);
                    }
                    //sapphire
                    if (MineralsConfig.isSapphireEnabled) {
                        generateOre(ModBlocks.oreSapphire.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 22, random.nextInt(8) + 2, 4);
                    }
                }
                //elements
                if (GeneralConfig.isElementsEnabled){
                    //cinnabar
                    if (MineralsConfig.isCinnabarEnabled){
                        generateOre(ModBlocks.oreCinnabar.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 64, 255, random.nextInt(1) + 1, 8);
                    }
                    //sulphur
                    if (MineralsConfig.isSulfurEnabled){
                        generateOre(ModBlocks.oreSulfur.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 64, 255, random.nextInt(11) + 3, 8);
                        generateOre(ModBlocks.oreSulfur.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 64, random.nextInt(3) + 1, 4);
                    }
                }
                //silly stuffs
                if (GeneralConfig.isSillyStuffEnabled) {
                    generateOre(ModBlocks.oreWeezer.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 255, random.nextInt(1) + 1, 1);
                }
            }
        }
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
