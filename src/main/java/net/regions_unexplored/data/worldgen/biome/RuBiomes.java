package net.regions_unexplored.data.worldgen.biome;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import net.minecraft.core.Registry;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.registries.ForgeRegistries;
import net.regions_unexplored.RegionsUnexploredMod;

import java.util.List;
import java.util.Set;

public class RuBiomes {
    public static List<ResourceKey<Biome>> overworldBiomes = Lists.newArrayList();
    public static List<ResourceKey<Biome>> allBiomes = Lists.newArrayList();

    public static final ResourceKey<Biome> REDSTONE_CAVES = registerOverworld("redstone_caves");
    public static final ResourceKey<Biome> BIOSHROOM_CAVES = registerOverworld("bioshroom_caves");
    public static final ResourceKey<Biome> PRISMACHASM = registerOverworld("prismachasm");
    public static final ResourceKey<Biome> LUSH_DELTA = registerOverworld("lush_delta");
    public static final ResourceKey<Biome> SCORCHING_CAVES = registerOverworld("scorching_caves");
    public static final ResourceKey<Biome> TROPICS = registerOverworld("tropics");
    public static final ResourceKey<Biome> SMOULDERING_WOODLAND = registerOverworld("smouldering_woodland");
    public static final ResourceKey<Biome> GRASSY_BEACH = registerOverworld("grassy_beach");
    public static final ResourceKey<Biome> DRY_BUSHLAND = registerOverworld("dry_bushland");
    public static final ResourceKey<Biome> ORCHARD = registerOverworld("orchard");
    public static final ResourceKey<Biome> SPIRES = registerOverworld("spires");
    public static final ResourceKey<Biome> FROZEN_TUNDRA = registerOverworld("frozen_tundra");
    public static final ResourceKey<Biome> BAMBOO_FOREST = registerOverworld("bamboo_forest");
    public static final ResourceKey<Biome> BAOBAB_SAVANNA = registerOverworld("baobab_savanna");
    public static final ResourceKey<Biome> LUPINE_PLAINS = registerOverworld("lupine_plains");
    public static final ResourceKey<Biome> LUSH_HILLS = registerOverworld("lush_hills");
    public static final ResourceKey<Biome> FLOWER_FIELD = registerOverworld("flower_field");
    public static final ResourceKey<Biome> ARID_MOUNTAINS = registerOverworld("arid_mountains");
    public static final ResourceKey<Biome> MAPLE_FOREST = registerOverworld("maple_forest");
    public static final ResourceKey<Biome> CHERRY_HILLS = registerOverworld("cherry_hills");
    public static final ResourceKey<Biome> CHALK_CLIFFS = registerOverworld("chalk_cliffs");
    public static final ResourceKey<Biome> PUMPKIN_FIELDS = registerOverworld("pumpkin_fields");
    public static final ResourceKey<Biome> WILLOW_FOREST = registerOverworld("willow_forest");
    public static final ResourceKey<Biome> RAINFOREST = registerOverworld("rainforest");
    public static final ResourceKey<Biome> OLD_GROWTH_RAINFOREST = registerOverworld("old_growth_rainforest");
    public static final ResourceKey<Biome> FEN = registerOverworld("fen");
    public static final ResourceKey<Biome> FUNGAL_FEN = registerOverworld("fungal_fen");
    public static final ResourceKey<Biome> SAGUARO_DESERT = registerOverworld("saguaro_desert");
    public static final ResourceKey<Biome> OUTBACK = registerOverworld("outback");
    public static final ResourceKey<Biome> MEADOW = registerOverworld("meadow");
    public static final ResourceKey<Biome> FLOODED_PLAINS = registerOverworld("flooded_plains");
    public static final ResourceKey<Biome> ALPHA_GROVE = registerOverworld("alpha_grove");
    public static final ResourceKey<Biome> JOSHUA_DESERT = registerOverworld("joshua_desert");
    public static final ResourceKey<Biome> STEPPE = registerOverworld("steppe");
    public static final ResourceKey<Biome> ICY_HEIGHTS = registerOverworld("icy_heights");
    public static final ResourceKey<Biome> MAUVE_HILLS = registerOverworld("mauve_hills");
    public static final ResourceKey<Biome> AUTUMNAL_MAPLE_FOREST = registerOverworld("autumnal_maple_forest");
    public static final ResourceKey<Biome> TEMPERATE_GROVE = registerOverworld("temperate_grove");
    public static final ResourceKey<Biome> GRASSLAND = registerOverworld("grassland");
    public static final ResourceKey<Biome> BAYOU = registerOverworld("bayou");
    public static final ResourceKey<Biome> GIANT_BAYOU = registerOverworld("giant_bayou");
    public static final ResourceKey<Biome> TOWERING_CLIFFS = registerOverworld("towering_cliffs");
    public static final ResourceKey<Biome> BLACKWOOD_FOREST = registerOverworld("blackwood_forest");
    public static final ResourceKey<Biome> PRAIRIE = registerOverworld("prairie");
    public static final ResourceKey<Biome> BARLEY_FIELDS = registerOverworld("barley_fields");
    public static final ResourceKey<Biome> POPPY_FIELDS = registerOverworld("poppy_fields");
    public static final ResourceKey<Biome> HIGHLAND_FIELDS = registerOverworld("highland_fields");
    public static final ResourceKey<Biome> GRAVEL_BEACH = registerOverworld("gravel_beach");
    public static final ResourceKey<Biome> BOREAL_FOREST = registerOverworld("boreal_forest");
    public static final ResourceKey<Biome> PINE_FOREST = registerOverworld("pine_forest");
    public static final ResourceKey<Biome> COLD_BOREAL_FOREST = registerOverworld("cold_boreal_forest");
    public static final ResourceKey<Biome> GOLDEN_BOREAL_FOREST = registerOverworld("golden_boreal_forest");
    public static final ResourceKey<Biome> SILVER_BIRCH_FOREST = registerOverworld("silver_birch_forest");
    public static final ResourceKey<Biome> DECIDUOUS_FOREST = registerOverworld("deciduous_forest");
    public static final ResourceKey<Biome> COLD_DECIDUOUS_FOREST = registerOverworld("cold_deciduous_forest");
    public static final ResourceKey<Biome> SHRUBLAND = registerOverworld("shrubland");
    public static final ResourceKey<Biome> PINE_SLOPES = registerOverworld("pine_slopes");
    public static final ResourceKey<Biome> MOUNTAINS = registerOverworld("mountains");
    public static final ResourceKey<Biome> MUDDY_RIVER = registerOverworld("muddy_river");
    public static final ResourceKey<Biome> COLD_RIVER = registerOverworld("cold_river");
    public static final ResourceKey<Biome> REDWOODS = registerOverworld("redwoods");
    public static final ResourceKey<Biome> SPARSE_REDWOODS = registerOverworld("sparse_redwoods");
    public static final ResourceKey<Biome> EUCALYPTUS_FOREST = registerOverworld("eucalyptus_forest");
    public static final ResourceKey<Biome> FROZEN_FOREST = registerOverworld("frozen_forest");
    public static final ResourceKey<Biome> ICY_DESERT = registerOverworld("icy_desert");

    public static final ResourceKey<Biome> MYCOTOXIC_UNDERGROWTH = register("mycotoxic_undergrowth");
    public static final ResourceKey<Biome> GLISTERING_MEADOW = register("glistering_meadow");
    public static final ResourceKey<Biome> REDSTONE_HELL = register("redstone_hell");
    public static final ResourceKey<Biome> CORRUPTED_HOLT = register("corrupted_holt");
    public static final ResourceKey<Biome> BLACKSTONE_BASIN = register("blackstone_basin");

    private static ResourceKey<Biome> registerOverworld(String name) {
        ResourceKey<Biome> key = ResourceKey.create(Registries.BIOME, new ResourceLocation(RegionsUnexploredMod.MOD_ID, name));
        overworldBiomes.add(key);
        allBiomes.add(key);
        return key;
    }

    private static ResourceKey<Biome> register(String name) {
        ResourceKey<Biome> key = ResourceKey.create(Registries.BIOME, new ResourceLocation(RegionsUnexploredMod.MOD_ID, name));
        allBiomes.add(key);
        return key;
    }
}