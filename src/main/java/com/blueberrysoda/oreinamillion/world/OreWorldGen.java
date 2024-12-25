package com.blueberrysoda.oreinamillion.world;

import com.blueberrysoda.oreinamillion.config.OreInAMillionConfig;
import com.blueberrysoda.oreinamillion.init.ModBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class OreWorldGen implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        if (world.provider.getDimension() == 0){
            generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
        }
        if (world.provider.getDimension() == -1){
            generateNether(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
        }
        if (world.provider.getDimension() == 1){
            generateEnd(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
        }
    }

    private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        if (OreInAMillionConfig.isMineralsEnabled) {
            if (OreInAMillionConfig.isOreGenerationEnabled) {
                if (OreInAMillionConfig.isIngotsEnabled) {
                    //aluminum
                    if (OreInAMillionConfig.isAluminumEnabled) {
                        generateOre(ModBlocks.oreAluminum.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 64, random.nextInt(6) + 3, 7);
                    }
                    //chrome
                    if (OreInAMillionConfig.isChromeEnabled) {
                        generateOre(ModBlocks.oreChrome.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 10, 40, random.nextInt(6) + 3, 5);
                    }
                    //cobalt
                    if (OreInAMillionConfig.isCobaltEnabled) {
                        generateOre(ModBlocks.oreCobalt.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 42, random.nextInt(5) + 3, 5);
                    }
                    //copper
                    if (OreInAMillionConfig.isCopperEnabled) {
                        generateOre(ModBlocks.oreCopper.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 64, random.nextInt(12) + 4, 9);
                    }
                    if (OreInAMillionConfig.isEnderEnabled){
                        generateOre(ModBlocks.oreEnder.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 20, random.nextInt(5) + 2, 3);
                        generateOre(ModBlocks.oreEnder.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 100, 255, random.nextInt(15) + 7, 1);
                    }
                    //iridium
                    if (OreInAMillionConfig.isIridiumEnabled) {
                        generateOre(ModBlocks.oreIridium.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 35, random.nextInt(8) + 3, 5);
                    }
                    //lead
                    if (OreInAMillionConfig.isLeadEnabled) {
                        generateOre(ModBlocks.oreLead.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 18, 64, random.nextInt(7) + 3, 5);
                    }
                    //mithril
                    if (OreInAMillionConfig.isMithrilEnabled) {
                        generateOre(ModBlocks.oreMithril.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 50, random.nextInt(4) + 1, 5);
                    }
                    //nickel
                    if (OreInAMillionConfig.isNickelEnabled) {
                        generateOre(ModBlocks.oreNickel.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 25, random.nextInt(5) + 2, 4);
                    }
                    //osmium
                    if (OreInAMillionConfig.isOsmiumEnabled) {
                        generateOre(ModBlocks.oreOsmium.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 64, random.nextInt(8) + 4, 6);
                    }
                    //platinum
                    if (OreInAMillionConfig.isPlatinumEnabled) {
                        generateOre(ModBlocks.orePlatinum.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 25, random.nextInt(4) + 2, 5);
                    }
                    //silver
                    if (OreInAMillionConfig.isSilverEnabled) {
                        generateOre(ModBlocks.orePlatinum.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 45, random.nextInt(6) + 3, 6);
                    }
                    //tin
                    if (OreInAMillionConfig.isTinEnabled) {
                        generateOre(ModBlocks.oreTin.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 64, random.nextInt(8) + 3, 7);
                    }
                    //titanium
                    if (OreInAMillionConfig.isTitaniumEnabled) {
                        generateOre(ModBlocks.oreTitanium.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 26, random.nextInt(5) + 2, 4);
                    }
                    //tungsten
                    if (OreInAMillionConfig.isTungstenEnabled) {
                        generateOre(ModBlocks.oreTungsten.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 44, random.nextInt(8) + 3, 5);
                    }
                    //uranium
                    if (OreInAMillionConfig.isUraniumEnabled) {
                        generateOre(ModBlocks.oreUranium.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 16, random.nextInt(5) + 1, 4);
                    }
                    //zinc
                    if (OreInAMillionConfig.isZincEnabled) {
                        generateOre(ModBlocks.oreZinc.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 18, 64, random.nextInt(6) + 2, 5);
                    }
                    //tinkers construct
                    if (OreInAMillionConfig.isTinkersIngotsEnabled) {
                        //ardite
                        if (OreInAMillionConfig.isArditeEnabled) {
                            generateOre(ModBlocks.oreArdite.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 16, random.nextInt(3) + 2, 4);
                        }
                    }
                }
                //gems
                if (OreInAMillionConfig.isGemsEnabled) {
                    //amethyst
                    if (OreInAMillionConfig.isAmethystEnabled) {
                        generateOre(ModBlocks.oreAmethyst.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 50, random.nextInt(5) + 2, 5);
                    }
                    //peridot
                    if (OreInAMillionConfig.isPeridotEnabled) {
                        generateOre(ModBlocks.orePeridot.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 32, 84, random.nextInt(5) + 2, 5);
                    }
                    //ruby
                    if (OreInAMillionConfig.isRubyEnabled) {
                        generateOre(ModBlocks.oreRuby.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 22, random.nextInt(8) + 2, 4);
                    }
                    //sapphire
                    if (OreInAMillionConfig.isSapphireEnabled) {
                        generateOre(ModBlocks.oreSapphire.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 22, random.nextInt(8) + 2, 4);
                    }
                }
                //elements
                if (OreInAMillionConfig.isElementsEnabled){
                    //cinnabar
                    if (OreInAMillionConfig.isCinnabarEnabled){
                        generateOre(ModBlocks.oreCinnabar.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 64, 255, random.nextInt(1) + 1, 8);
                    }
                    //sulphur
                    if (OreInAMillionConfig.isSulphurEnabled){
                        generateOre(ModBlocks.oreSulfur.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 64, 255, random.nextInt(10) + 3, 8);
                    }
                }
            }
        }
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
