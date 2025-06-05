package com.blueberrysoda.oreinamillion.fluids;

import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public class FluidMolten extends BlockFluidClassic {

    public FluidMolten(Fluid fluid) {
        super(fluid, Material.LAVA);
        setRegistryName(fluid.getName());
        setUnlocalizedName(fluid.getName());
    }
}
