package net.regions_unexplored.data.worldgen.placement;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.regions_unexplored.data.worldgen.features.RuAquaticFeatures;
import net.regions_unexplored.data.worldgen.features.RuVegetationFeatures;
import net.regions_unexplored.util.worldgen.RuFeatureUtils;
import net.regions_unexplored.util.worldgen.RuPlacementUtils;

import java.util.List;

public class RuAquaticPlacements {

    //*****KEYS*****//
    /*-----------------------------RIVER_KEYS-----------------------------*/
    public static final ResourceKey<PlacedFeature> WATER_CATTAIL = RuPlacementUtils.createKey("water_cattail");
    /*-----------------------------OCEAN_KEYS-----------------------------*/
    //Hyacinth Deeps
    public static final ResourceKey<PlacedFeature> TALL_HYACINTH_STOCK = RuPlacementUtils.createKey("tall_hyacinth_stock");
    public static final ResourceKey<PlacedFeature> HYACINTH_PLANTS = RuPlacementUtils.createKey("hyacinth_plants");
    public static final ResourceKey<PlacedFeature> HYACINTH_FLOWERS = RuPlacementUtils.createKey("hyacinth_flowers");
    public static final ResourceKey<PlacedFeature> HYACINTH_ROCKS = RuPlacementUtils.createKey("hyacinth_rocks");

    public static final ResourceKey<PlacedFeature> MOSSY_SEA_ROCKS = RuPlacementUtils.createKey("mossy_sea_rocks");
    public static final ResourceKey<PlacedFeature> RED_CHERRY_FLOWERS_AQUATIC = RuPlacementUtils.createKey("red_cherry_flowers_aquatic");
    public static final ResourceKey<PlacedFeature> PINK_CHERRY_FLOWERS_AQUATIC = RuPlacementUtils.createKey("pink_cherry_flowers_aquatic");
    public static final ResourceKey<PlacedFeature> WHITE_CHERRY_FLOWERS_AQUATIC = RuPlacementUtils.createKey("white_cherry_flowers_aquatic");
    public static final ResourceKey<PlacedFeature> JUNGLE_TREE_AQUATIC = RuPlacementUtils.createKey("jungle_tree_aquatic");
    public static final ResourceKey<PlacedFeature> PALM_TREE_AQUATIC = RuPlacementUtils.createKey("palm_tree_aquatic");
    public static final ResourceKey<PlacedFeature> ELEPHANT_EAR_AQUATIC = RuPlacementUtils.createKey("elephant_ear_aquatic");
    public static final ResourceKey<PlacedFeature> PALM_SAPLING_AQUATIC = RuPlacementUtils.createKey("palm_sapling_aquatic");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {

        //*****FEATURES*****//
        HolderGetter<ConfiguredFeature<?, ?>> featureGetter = context.lookup(Registries.CONFIGURED_FEATURE);
        /*-----------------------------RIVER_FEATURES-----------------------------*/
        final Holder<ConfiguredFeature<?, ?>> WATER_CATTAIL = featureGetter.getOrThrow(RuAquaticFeatures.WATER_CATTAIL);
        /*-----------------------------OCEAN_FEATURES-----------------------------*/
        //Hyacinth Deeps
        final Holder<ConfiguredFeature<?, ?>> TALL_HYACINTH_STOCK = featureGetter.getOrThrow(RuAquaticFeatures.TALL_HYACINTH_STOCK);
        final Holder<ConfiguredFeature<?, ?>> HYACINTH_PLANTS = featureGetter.getOrThrow(RuAquaticFeatures.HYACINTH_PLANTS);
        final Holder<ConfiguredFeature<?, ?>> HYACINTH_FLOWERS = featureGetter.getOrThrow(RuAquaticFeatures.HYACINTH_FLOWERS);
        final Holder<ConfiguredFeature<?, ?>> HYACINTH_ROCKS = featureGetter.getOrThrow(RuAquaticFeatures.HYACINTH_ROCKS);

        final Holder<ConfiguredFeature<?, ?>> MOSSY_SEA_ROCKS = featureGetter.getOrThrow(RuAquaticFeatures.MOSSY_SEA_ROCKS);
        final Holder<ConfiguredFeature<?, ?>> RED_CHERRY_FLOWERS_AQUATIC = featureGetter.getOrThrow(RuAquaticFeatures.RED_CHERRY_FLOWERS_AQUATIC);
        final Holder<ConfiguredFeature<?, ?>> PINK_CHERRY_FLOWERS_AQUATIC = featureGetter.getOrThrow(RuAquaticFeatures.PINK_CHERRY_FLOWERS_AQUATIC);
        final Holder<ConfiguredFeature<?, ?>> WHITE_CHERRY_FLOWERS_AQUATIC = featureGetter.getOrThrow(RuAquaticFeatures.WHITE_CHERRY_FLOWERS_AQUATIC);
        final Holder<ConfiguredFeature<?, ?>> JUNGLE_TREE_AQUATIC = featureGetter.getOrThrow(RuAquaticFeatures.JUNGLE_TREE_AQUATIC);
        final Holder<ConfiguredFeature<?, ?>> PALM_TREE_AQUATIC = featureGetter.getOrThrow(RuAquaticFeatures.PALM_TREE_AQUATIC);
        final Holder<ConfiguredFeature<?, ?>> ELEPHANT_EAR_AQUATIC = featureGetter.getOrThrow(RuAquaticFeatures.ELEPHANT_EAR_AQUATIC);
        final Holder<ConfiguredFeature<?, ?>> PALM_SAPLING_AQUATIC = featureGetter.getOrThrow(RuVegetationFeatures.TALL_PALM_SAPLING);

        //*****PLACEMENTS*****//
        /*-----------------------------RIVER_PLACEMENTS-----------------------------*/
        register(context, RuAquaticPlacements.WATER_CATTAIL, WATER_CATTAIL, CountPlacement.of(10), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BiomeFilter.biome());
        /*-----------------------------OCEAN_PLACEMENTS-----------------------------*/
        //Hyacinth Deeps
        register(context, RuAquaticPlacements.TALL_HYACINTH_STOCK, TALL_HYACINTH_STOCK, NoiseBasedCountPlacement.of(20, 80.0D, 0.3D), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BiomeFilter.biome());
        register(context, RuAquaticPlacements.HYACINTH_PLANTS, HYACINTH_PLANTS, seagrassPlacement(80));
        register(context, RuAquaticPlacements.HYACINTH_FLOWERS, HYACINTH_FLOWERS, CountPlacement.of(15), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BiomeFilter.biome());
        register(context, RuAquaticPlacements.HYACINTH_ROCKS, HYACINTH_ROCKS, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BiomeFilter.biome());
        register(context, RuAquaticPlacements.MOSSY_SEA_ROCKS, MOSSY_SEA_ROCKS, NoiseBasedCountPlacement.of(1, 80.0D, 0.3D), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BiomeFilter.biome());

        register(context, RuAquaticPlacements.RED_CHERRY_FLOWERS_AQUATIC, RED_CHERRY_FLOWERS_AQUATIC, CountPlacement.of(35), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BiomeFilter.biome());
        register(context, RuAquaticPlacements.PINK_CHERRY_FLOWERS_AQUATIC, PINK_CHERRY_FLOWERS_AQUATIC, CountPlacement.of(35), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BiomeFilter.biome());
        register(context, RuAquaticPlacements.WHITE_CHERRY_FLOWERS_AQUATIC, WHITE_CHERRY_FLOWERS_AQUATIC, CountPlacement.of(35), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BiomeFilter.biome());
        register(context, RuAquaticPlacements.JUNGLE_TREE_AQUATIC, JUNGLE_TREE_AQUATIC, List.of(CountPlacement.of(24), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuAquaticPlacements.PALM_TREE_AQUATIC, PALM_TREE_AQUATIC, List.of(CountPlacement.of(15), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuAquaticPlacements.PALM_SAPLING_AQUATIC, PALM_SAPLING_AQUATIC, List.of(CountPlacement.of(5), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuAquaticPlacements.ELEPHANT_EAR_AQUATIC, ELEPHANT_EAR_AQUATIC, List.of(CountPlacement.of(8), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
    }

    private static List<PlacementModifier> seagrassPlacement(int count) {
        return List.of(InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_TOP_SOLID, CountPlacement.of(count), BiomeFilter.biome());
    }

    protected static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> feature, PlacementModifier... placement) {
        register(context, key, feature, List.of(placement));
    }

    protected static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> feature, List<PlacementModifier> placement) {
        context.register(key, new PlacedFeature(feature, placement));
    }
}
