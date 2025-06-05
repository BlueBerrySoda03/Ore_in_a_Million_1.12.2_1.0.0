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
    Adamantine(0xd3456a, 3, "adamantine", Categories.Base, Categories.TextureNormal, Tiers.Tier4, MaterialTool.toolAdamantine),
    Aluminum(0xe9e9e9, 1, "aluminum", Categories.Base, Categories.TextureLighter, Tiers.Tier1, MaterialTool.toolAluminum),
    Amethyst(0x9e5ad7, 2, "amethyst", Categories.Gem, Categories.TextureLighter, Tiers.Tier3, MaterialTool.toolAmethyst),
    Brass(0xB5a642, 1, "brass", Categories.Alloy, Categories.TextureNormal, Tiers.Tier2, MaterialTool.toolBrass),
    Bronze(0xCd7f32, 1, "bronze", Categories.Alloy, Categories.TextureNormal, Tiers.Tier2, MaterialTool.toolBronze),
    Charcoal(0x1e1b15, 0, "charcoal", Categories.VanillaTool, Categories.TextureNormal, Tiers.Tier1, MaterialTool.toolCharcoal),
    Chrome(0xDBE2E9, 2, "chrome", Categories.Base, Categories.TextureNormal, Tiers.Tier1, MaterialTool.toolChrome),
    Coal(0x161616, 0, "coal", Categories.VanillaTool, Categories.TextureNormal, Tiers.Tier1, MaterialTool.toolCoal),
    Cobalt(0x0047ab, 2, "cobalt", Categories.Base, Categories.TextureNormal, Tiers.Tier2, MaterialTool.toolCobalt),
    Constantan(0xECE2A5, 1, "constantan", Categories.Alloy, Categories.TextureNormal, Tiers.Tier2, MaterialTool.toolConstantan),
    Copper(0xb87333, 1, "copper", Categories.Base, Categories.TextureLighter, Tiers.Tier2,  MaterialTool.toolCopper),
    Diamond(0x33ebcb, 2, "diamond", Categories.VanillaTooless, Categories.TextureDarker, Tiers.Tier3, MaterialTool.toolDiamond),
    Electrum(0xDBCC78, 1, "electrum", Categories.Alloy, Categories.TextureNormal, Tiers.Tier2, MaterialTool.toolElectrum),
    Emerald(0x3cca61, 2, "emerald", Categories.VanillaTool, Categories.TextureNormal, Tiers.Tier3, MaterialTool.toolEmerald),
    Ender(0x258474, 3, "ender", Categories.Base, Categories.TextureNormal, Tiers.Tier2, MaterialTool.toolEnder),
    Fairy(0xdc6ea5, 2, "fairy", Categories.Alloy, Categories.TextureDarker, Tiers.Tier3, MaterialTool.toolFairy),
    Garnet(0x9a2629, 2, "garnet", Categories.Gem, Categories.TextureDarker, Tiers.Tier3, MaterialTool.toolGarnet),
    Glowstone(0xd2d200, 0, "glowstone", Categories.VanillaTool, Categories.TextureLighter, Tiers.Tier1, MaterialTool.toolNull),
    Gold(0xeaee57, 2, "gold", Categories.VanillaTooless, Categories.TextureNormal, Tiers.Tier1, MaterialTool.toolGold),
    Invar(0x6B6766, 1, "invar", Categories.Alloy, Categories.TextureNormal, Tiers.Tier2, MaterialTool.toolInvar),
    Iridium(0xC0B38F, 1, "iridium", Categories.Base, Categories.TextureNormal, Tiers.Tier2, MaterialTool.toolIridium),
    Iron(0xFFFFFF, 1, "iron", Categories.VanillaTooless, Categories.TextureNormal, Tiers.Tier2, MaterialTool.toolIron),
    Lapis(0x5a82e2, 1, "lapis", Categories.Base, Categories.TextureDarker, Tiers.Tier1, MaterialTool.toolLapis),
    Lithium(0xc8be8d, 0, "lithium", Categories.Element, Categories.TextureNormal, Tiers.TierNull, MaterialTool.toolNull),
    Lead(0x434343, 1, "lead", Categories.Base, Categories.TextureLighter, Tiers.Tier2, MaterialTool.toolLead),
    Mithril(0x2093cb, 3, "mithril", Categories.Base, Categories.TextureNormal, Tiers.Tier4, MaterialTool.toolMithril),
    Netherite(0x3c3232, 3, "netherite",Categories.Base, Categories.TextureNormal, Tiers.Tier4, MaterialTool.toolQuartz),
    Nickel(0x838383, 1, "nickel", Categories.Base, Categories.TextureNormal, Tiers.Tier1, MaterialTool.toolNickel),
    Obsidian(0x72357B, 3, "obsidian", Categories.Base, Categories.TextureNormal, Tiers.Tier3, MaterialTool.toolObsidian),
    Osmium(0x9496A2, 1, "osmium", Categories.Base, Categories.TextureNormal, Tiers.Tier2, MaterialTool.toolOsmium),
    Peridot(0x13981d, 2, "peridot", Categories.Gem, Categories.TextureNormal, Tiers.Tier3, MaterialTool.toolPeridot),
    Platinum(0x95B1C1, 3, "platinum", Categories.Base, Categories.TextureLighter, Tiers.Tier3, MaterialTool.toolPlatinum),
    Redstone(0x720000, 2, "redstone", Categories.VanillaTool, Categories.TextureNormal, Tiers.Tier1, MaterialTool.toolRedstone),
    Ruby(0xeb3036, 2, "ruby", Categories.Gem, Categories.TextureNormal, Tiers.Tier3, MaterialTool.toolRuby),
    Sapphire(0x311deb, 2, "sapphire", Categories.Gem, Categories.TextureNormal, Tiers.Tier3, MaterialTool.toolSapphire),
    Silicon(0xc2d9de, 0, "silicon", Categories.Element, Categories.TextureNormal, Tiers.TierNull, MaterialTool.toolNull),
    Silver(0xA4B2B6, 2, "silver", Categories.Base, Categories.TextureNormal, Tiers.Tier2, MaterialTool.toolSilver),
    Steel(0x6F7070, 2, "steel", Categories.Alloy, Categories.TextureNormal, Tiers.Tier3, MaterialTool.toolSteel),
    Stone(0x6E6E6E, 0, "stone", Categories.VanillaTooless, Categories.TextureNormal, Tiers.Tier1, MaterialTool.toolStone),
    Sulfur(0xc1bc45, 0, "sulfur", Categories.Element, Categories.TextureNormal, Tiers.TierNull, MaterialTool.toolNull),
    Tin(0xE5E6E6, 1, "tin", Categories.Base, Categories.TextureLighter, Tiers.Tier1, MaterialTool.toolTin),
    Titanium(0xC6D1D5, 3, "titanium", Categories.Base, Categories.TextureLighter, Tiers.Tier3, MaterialTool.toolTitanium),
    Tungsten(0x9496A2, 2, "tungsten", Categories.Base, Categories.TextureNormal, Tiers.Tier2, MaterialTool.toolTungsten),
    Uranium(0x48da52, 3, "uranium", Categories.Base, Categories.TextureLighter, Tiers.Tier3, MaterialTool.toolUranium),
    Voidborn(0xcc00fa, 4, "voidborn", Categories.Alloy, Categories.TextureNormal, Tiers.Tier5, MaterialTool.toolVoidBorn),
    Wood(0x8B5A2B, 0, "wood", Categories.VanillaTooless, Categories.TextureNormal, Tiers.Tier1, MaterialTool.toolWood),
    Zinc(0x3E3E43, 1, "zinc", Categories.Base, Categories.TextureLighter, Tiers.Tier1, MaterialTool.toolZinc),
    ;
    //old gold :FFD700

    private final int color;
    private final int harvestLevel;
    private final String materialName;
    private final Categories category;
    private final Categories textureTint;
    private final Item.ToolMaterial toolMaterial;
    private final Tiers tier;

    MaterialType(int color, int harvestLevel, String materialName, Categories category, Categories textureTint, Tiers tier, Item.ToolMaterial toolMaterial) {
        this.color = color;
        this.harvestLevel = harvestLevel;
        this.materialName = materialName;
        this.category = category;
        this.textureTint = textureTint;
        this.toolMaterial = toolMaterial;
        this.tier = tier;
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

    public Tiers getTier(){return tier;}

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