package com.blueberrysoda.oreinamillion.util.enumerations;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import com.blueberrysoda.oreinamillion.items.materials.MaterialTool;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import java.util.Locale;

public enum MaterialType {
    Adamantine(0xd3456a, 3, "adamantine", Categories.Base, Categories.TextureNormal, MaterialTool.toolAdamantine),
    Aluminum(0xe9e9e9, 1, "aluminum", Categories.Base, Categories.TextureLighter, MaterialTool.toolAluminum),
    Amethyst(0x9e5ad7, 2, "amethyst", Categories.Gem, Categories.TextureLighter, MaterialTool.toolAmethyst),
    Brass(0xB5a642, 1, "brass", Categories.Alloy, Categories.TextureNormal, MaterialTool.toolBrass),
    Bronze(0xCd7f32, 1, "bronze", Categories.Alloy, Categories.TextureNormal, MaterialTool.toolBronze),
    Charcoal(0x1e1b15, 0, "charcoal", Categories.VanillaTool, Categories.TextureNormal, MaterialTool.toolCharcoal),
    Chrome(0xDBE2E9, 2, "chrome", Categories.Base, Categories.TextureNormal, MaterialTool.toolChrome),
    Coal(0x161616, 0, "coal", Categories.VanillaTool, Categories.TextureNormal, MaterialTool.toolCoal),
    Cobalt(0x0047ab, 2, "cobalt", Categories.Base, Categories.TextureNormal, MaterialTool.toolCobalt),
    Constantan(0xECE2A5, 1, "constantan", Categories.Alloy, Categories.TextureNormal, MaterialTool.toolConstantan),
    Copper(0xb87333, 1, "copper", Categories.Base, Categories.TextureLighter, MaterialTool.toolCopper),
    Diamond(0x8cf4e2, 2, "diamond", Categories.VanillaTooless, Categories.TextureDarker, MaterialTool.toolDiamond),
    Electrum(0xDBCC78, 1, "electrum", Categories.Alloy, Categories.TextureNormal, MaterialTool.toolElectrum),
    Emerald(0x82f6ad, 2, "emerald", Categories.VanillaTool, Categories.TextureNormal, MaterialTool.toolEmerald),
    Ender(0x258474, 3, "ender", Categories.Base, Categories.TextureNormal, MaterialTool.toolEnder),
    Fairy(0xdc6ea5, 2, "fairy", Categories.Alloy, Categories.TextureDarker, MaterialTool.toolFairy),
    Garnet(0xFFFFFF, 2, "garnet", Categories.Gem, Categories.TextureDarker, MaterialTool.toolGarnet),
    Glowstone(0xd2d200, 0, "glowstone", Categories.VanillaTool, Categories.TextureLighter, MaterialTool.toolNull),
    Gold(0xFFD700, 1, "gold", Categories.VanillaTooless, Categories.TextureNormal, MaterialTool.toolGold),
    Invar(0x6B6766, 1, "invar", Categories.Alloy, Categories.TextureNormal, MaterialTool.toolInvar),
    Iridium(0xC0B38F, 1, "iridium", Categories.Base, Categories.TextureNormal, MaterialTool.toolIridium),
    Iron(0xD8D8D8, 1, "iron", Categories.VanillaTooless, Categories.TextureNormal, MaterialTool.toolIron),
    Lapis(0x5a82e2, 1, "lapis", Categories.Base, Categories.TextureDarker, MaterialTool.toolLapis),
    Lithium(0xFFFFFF, 0, "lithium", Categories.Element, Categories.TextureNormal, MaterialTool.toolNull),
    Lead(0x434343, 1, "lead", Categories.Base, Categories.TextureLighter, MaterialTool.toolLead),
    Mithril(0x2093cb, 3, "mithril", Categories.Base, Categories.TextureNormal, MaterialTool.toolMithril),
    Nickel(0x838383, 1, "nickel", Categories.Base, Categories.TextureNormal, MaterialTool.toolNickel),
    Obsidian(0x72357B, 3, "obsidian", Categories.Base, Categories.TextureNormal, MaterialTool.toolObsidian),
    Osmium(0x9496A2, 1, "osmium", Categories.Base, Categories.TextureNormal, MaterialTool.toolOsmium),
    Peridot(0xFFFFFF, 2, "peridot", Categories.Gem, Categories.TextureNormal, MaterialTool.toolPeridot),
    Platinum(0x95B1C1, 3, "platinum", Categories.Base, Categories.TextureLighter, MaterialTool.toolPlatinum),
    Redstone(0x720000, 2, "redstone", Categories.VanillaTool, Categories.TextureNormal, MaterialTool.toolRedstone),
    Ruby(0xFFFFFF, 2, "ruby", Categories.Gem, Categories.TextureNormal, MaterialTool.toolRuby),
    Sapphire(0xFFFFFFF, 2, "sapphire", Categories.Gem, Categories.TextureNormal, MaterialTool.toolSapphire),
    Silicon(0xFFFFFF, 0, "silicon", Categories.Element, Categories.TextureNormal, MaterialTool.toolNull),
    Silver(0xA4B2B6, 2, "silver", Categories.Base, Categories.TextureNormal, MaterialTool.toolSilver),
    Steel(0x6F7070, 2, "steel", Categories.Alloy, Categories.TextureNormal, MaterialTool.toolSteel),
    Stone(0x6E6E6E, 0, "stone", Categories.VanillaTooless, Categories.TextureNormal, MaterialTool.toolStone),
    Sulfur(0xFFFFFF, 0, "sulfur", Categories.Element, Categories.TextureNormal, MaterialTool.toolNull),
    Tin(0xE5E6E6, 1, "tin", Categories.Base, Categories.TextureLighter, MaterialTool.toolTin),
    Titanium(0xC6D1D5, 3, "titanium", Categories.Base, Categories.TextureLighter, MaterialTool.toolTitanium),
    Tungsten(0x9496A2, 2, "tungsten", Categories.Base, Categories.TextureNormal, MaterialTool.toolTungsten),
    Uranium(0x48da52, 3, "uranium", Categories.Base, Categories.TextureLighter, MaterialTool.toolUranium),
    Voidborn(0xcc00fa, 4, "voidborn", Categories.Alloy, Categories.TextureNormal, MaterialTool.toolVoidBorn),
    Wood(0x8B5A2B, 0, "wood", Categories.VanillaTooless, Categories.TextureNormal, MaterialTool.toolWood),
    Zinc(0x3E3E43, 1, "zinc", Categories.Base, Categories.TextureLighter, MaterialTool.toolZinc),
    ;

    private final int color;
    private final int harvestLevel;
    private final String materialName;
    private final Categories category;
    private final Categories textureTint;
    private final Item.ToolMaterial toolMaterial;

    MaterialType(int color, int harvestLevel, String materialName, Categories category, Categories textureTint, Item.ToolMaterial toolMaterial) {
        this.color = color;
        this.harvestLevel = harvestLevel;
        this.materialName = materialName;
        this.category = category;
        this.textureTint = textureTint;
        this.toolMaterial = toolMaterial;
    }

    public int getColor() {
        return color;
    }

    public int getHarvestLevel() {
        return harvestLevel;
    }

    public Categories getCategory() {
        return category;
    }

    public Categories getTextureTint() {
        return textureTint;
    }

    public Item.ToolMaterial getToolMaterial() {
        return toolMaterial;
    }

    public String getMaterialName() {
        return materialName;
    }

    public String getMaterialNameUppercase() {
        return materialName.substring(0, 1).toUpperCase(Locale.ROOT) + materialName.substring(1).toLowerCase(Locale.ROOT);
    }

    public String getRegistryName(String type) {
        return materialName + "_" + type;
    }

    public Block getBlock(String type) {
        return ForgeRegistries.BLOCKS.getValue(new ResourceLocation(OreInAMillion.MODID, getRegistryName(type)));
    }

    public Item getItem(String type) {
        return ForgeRegistries.ITEMS.getValue(new ResourceLocation(OreInAMillion.MODID, getRegistryName(type)));
    }

    public static MaterialType fromItemStack(ItemStack stack) {
        if (stack == null || stack.isEmpty()) return null;

        ResourceLocation registryName = stack.getItem().getRegistryName();
        if (registryName == null) return null;

        String path = registryName.getResourcePath();
        String[] parts = path.split("_");

        if (parts.length < 2) return null;

        String materialName = parts[0].toLowerCase();

        for (MaterialType material : MaterialType.values()) {
            if (material.getMaterialName().equalsIgnoreCase(materialName)) {
                return material;
            }
        }
        return null;
    }
}