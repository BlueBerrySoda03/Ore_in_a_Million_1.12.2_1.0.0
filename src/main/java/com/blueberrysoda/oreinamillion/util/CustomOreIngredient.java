package com.blueberrysoda.oreinamillion.util;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class CustomOreIngredient extends Ingredient {
    private final List<ItemStack> matchingStacks;

    public CustomOreIngredient(String... oreNames) {
        super(0);
        this.matchingStacks = new ArrayList<>();
        for (String oreName : oreNames) {
            List<ItemStack> ores = OreDictionary.getOres(oreName);
            if (ores != null && !ores.isEmpty()) {
                matchingStacks.addAll(ores);
            } else {
                System.out.println("No ores found for oreName: " + oreName);
            }
        }
        System.out.println("matchingStacks size: " + matchingStacks.size());
    }

    @Nonnull
    @Override
    public ItemStack[] getMatchingStacks() {
        return matchingStacks.toArray(new ItemStack[0]);
    }

    @Override
    protected void invalidate() {

    }

    @Override
    public boolean apply(@Nullable ItemStack stack) {
        if (stack == null) return false;
        for (ItemStack matchingStack : matchingStacks) {
            if (OreDictionary.itemMatches(matchingStack, stack, false)) {
                return true;
            }
        }
        return false;
    }
}
