package com.blueberrysoda.oreinamillion.init;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import com.blueberrysoda.oreinamillion.fluids.FluidMolten;
import com.blueberrysoda.oreinamillion.util.enumerations.MaterialType;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;

import static com.blueberrysoda.oreinamillion.init.ModBlocks.getMaterialType;

@Mod.EventBusSubscriber
public class ModFluids {

    public static final List<Fluid> FLUIDS = new ArrayList<>();

    public static void init() {
        for (MaterialType material : MaterialType.values()) {
            String moltenFluidName = OreInAMillion.MODID + ".molten_" + material.getMaterialName();

            Fluid moltenFluid = new Fluid(moltenFluidName,
                    new ResourceLocation(OreInAMillion.MODID, "blocks/molten_base_flowing"),
                    new ResourceLocation(OreInAMillion.MODID, "blocks/molten_base_still"))
                    .setViscosity(6000)
                    .setDensity(3000)
                    .setTemperature(1300)
                    .setLuminosity(10);
            FluidRegistry.registerFluid(moltenFluid);
            FluidRegistry.addBucketForFluid(moltenFluid);
            FLUIDS.add(moltenFluid);

            FluidMolten fluidBlock = new FluidMolten(moltenFluid);
            ForgeRegistries.BLOCKS.register(fluidBlock);
        }
    }

    @SubscribeEvent
    public static void registerFluidColors(ColorHandlerEvent.Block event) {
        BlockColors blockColors = event.getBlockColors();

        for (Fluid fluid : FluidRegistry.getRegisteredFluids().values()) {
            String fluidName = fluid.getName();
            if (!fluidName.startsWith(OreInAMillion.MODID + ".molten_")) continue;

            String materialName = fluidName.replace(OreInAMillion.MODID + ".molten_", "");
            MaterialType materialType = getMaterialType(materialName);

            blockColors.registerBlockColorHandler((state, world, pos, tintIndex) -> {
                return tintIndex == 0 ? materialType.getColor() : -1;
            }, FluidRegistry.getFluid(fluidName).getBlock());
        }
    }

    @SubscribeEvent
    public static void registerBucketColors(ColorHandlerEvent.Item event) {
        ItemColors itemColors = event.getItemColors();

        for (Fluid fluid : FluidRegistry.getRegisteredFluids().values()) {
            String fluidName = fluid.getName();
            if (!fluidName.startsWith(OreInAMillion.MODID + ".molten_")) continue; // Only molten fluids

            String materialName = fluidName.replace(OreInAMillion.MODID + ".molten_", "");
            MaterialType materialType = getMaterialType(materialName);

            Item bucketItem = ForgeRegistries.ITEMS.getValue(new ResourceLocation(OreInAMillion.MODID, "molten_" + materialName + "_bucket"));

            if (bucketItem != null) {
                itemColors.registerItemColorHandler((stack, tintIndex) -> {
                    return tintIndex == 0 ? materialType.getColor() : -1;
                }, bucketItem);
            } else {
                System.err.println("Error: Bucket item for " + materialName + " not found!");
            }
        }
    }


}
