package com.blueberrysoda.oreinamillion.init;

import com.blueberrysoda.oreinamillion.util.enumerations.MaterialType;

import mekanism.api.gas.Gas;
import mekanism.api.gas.GasRegistry;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

import java.util.ArrayList;
import java.util.List;

public class ModGases {
    public static final List<Gas> GASES = new ArrayList<>();

    public static void init() {
        for (MaterialType material : MaterialType.values()) {
            String fluidName = "molten_" + material.getMaterialName();
            Fluid baseFluid = FluidRegistry.getFluid(fluidName);

            if (baseFluid == null) {
                System.err.println("Skipping gas registration: No molten fluid found for " + material.getMaterialName());
                continue;
            }

            Gas slurry = new Gas(material.getMaterialName() + "_slurry", String.valueOf(baseFluid));
            Gas cleanSlurry = new Gas("clean_" + material.getMaterialName() + "_slurry", String.valueOf(baseFluid));

            GasRegistry.register(slurry);
            GasRegistry.register(cleanSlurry);

            GASES.add(slurry);
            GASES.add(cleanSlurry);
        }
    }

}
