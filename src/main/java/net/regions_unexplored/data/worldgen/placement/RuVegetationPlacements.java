package net.regions_unexplored.data.worldgen.placement;

import com.google.common.collect.ImmutableList;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.features.VegetationFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.regions_unexplored.block.RegionsUnexploredBlocks;
import net.regions_unexplored.data.worldgen.features.RuTreeFeatures;
import net.regions_unexplored.data.worldgen.features.RuVegetationFeatures;
import net.regions_unexplored.util.worldgen.RuPlacementUtils;

public class RuVegetationPlacements {

    public static final ResourceKey<PlacedFeature> FOREST_BAMBOO = RuPlacementUtils.createKey("forest_bamboo");
    public static final ResourceKey<PlacedFeature> SEAGRASS = RuPlacementUtils.createKey("seagrass");
    public static final ResourceKey<PlacedFeature> PATCH_CACTUS_OUTBACK = RuPlacementUtils.createKey("patch_cactus_outback");
    public static final ResourceKey<PlacedFeature> RU_BAMBOO = RuPlacementUtils.createKey("ru_bamboo");
    //Grass
    public static final ResourceKey<PlacedFeature> PATCH_GRASS_3 = RuPlacementUtils.createKey("patch_grass_3");
    public static final ResourceKey<PlacedFeature> PATCH_MEDIUM_GRASS = RuPlacementUtils.createKey("medium_grass_placed");
    public static final ResourceKey<PlacedFeature> PATCH_SEEDED_GRASSES = RuPlacementUtils.createKey("patch_seeded_grasses");
    public static final ResourceKey<PlacedFeature> PATCH_FOREST_FERNS = RuPlacementUtils.createKey("patch_forest_ferns");
    public static final ResourceKey<PlacedFeature> PATCH_TALL_FOREST_FERNS = RuPlacementUtils.createKey("patch_tall_forest_ferns");
    public static final ResourceKey<PlacedFeature> GRASSLAND_STEPPE_GRASS = RuPlacementUtils.createKey("grassland_steppe_grass");
    public static final ResourceKey<PlacedFeature> PATCH_REDSTONE_BUD = RuPlacementUtils.createKey("redstone_bud_placed");
    public static final ResourceKey<PlacedFeature> PATCH_REDSTONE_BULB = RuPlacementUtils.createKey("redstone_bulb_placed");
    //Flowers
    public static final ResourceKey<PlacedFeature> RU_DEFAULT_FLOWERS = RuPlacementUtils.createKey("ru_default_flowers");
    public static final ResourceKey<PlacedFeature> RU_PINK_FLOWERS = RuPlacementUtils.createKey("ru_pink_flowers");
    public static final ResourceKey<PlacedFeature> RU_LILACS = RuPlacementUtils.createKey("ru_lilacs");
    public static final ResourceKey<PlacedFeature> ALPHA_ROSE_BONEMEAL = RuPlacementUtils.createKey("alpha_rose_bonemeal");
    public static final ResourceKey<PlacedFeature> ALPHA_DANDELION_BONEMEAL = RuPlacementUtils.createKey("alpha_dandelion_bonemeal");
    public static final ResourceKey<PlacedFeature> HYSSOP_MEADOW = RuPlacementUtils.createKey("hyssop_meadow");
    public static final ResourceKey<PlacedFeature> DAISY_MEADOW = RuPlacementUtils.createKey("daisy_meadow");
    public static final ResourceKey<PlacedFeature> FIREWEED_MEADOW = RuPlacementUtils.createKey("fireweed_meadow");
    public static final ResourceKey<PlacedFeature> PATCH_DAISIES = RuPlacementUtils.createKey("patch_daisies");
    //Trees
    public static final ResourceKey<PlacedFeature> PALM_TROPICS = RuPlacementUtils.createKey("palm_rainforest");
    //Other
    public static final ResourceKey<PlacedFeature> PATCH_DUCKWEED = RuPlacementUtils.createKey("patch_duckweed");
    public static final ResourceKey<PlacedFeature> PATCH_DUCKWEED_SPARSE = RuPlacementUtils.createKey("patch_duckweed_sparse");
    public static final ResourceKey<PlacedFeature> PATCH_LILY_SPARSE = RuPlacementUtils.createKey("patch_lily_sparse");

    public static final ResourceKey<PlacedFeature> CATTAIL_VANILLA = RuPlacementUtils.createKey("cattail_vanilla");
    public static final ResourceKey<PlacedFeature> CATTAIL_RIVER = RuPlacementUtils.createKey("cattail_river");
    public static final ResourceKey<PlacedFeature> CATTAIL_14 = RuPlacementUtils.createKey("cattail_14");
    public static final ResourceKey<PlacedFeature> CATTAIL_30 = RuPlacementUtils.createKey("cattail_30");
    public static final ResourceKey<PlacedFeature> CATTAIL_BAYOU = RuPlacementUtils.createKey("cattail_bayou");

    public static final ResourceKey<PlacedFeature> OVERGROWN_VINES = RuPlacementUtils.createKey("overgrown_vines");

    public static final ResourceKey<PlacedFeature> SCULK_WILLOW = RuPlacementUtils.createKey("sculk_willow");
    public static final ResourceKey<PlacedFeature> GIANT_SCULK_WILLOW = RuPlacementUtils.createKey("giant_sculk_willow");

    private static final PlacementModifier TREE_THRESHOLD = SurfaceWaterDepthFilter.forMaxDepth(0);

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> featureGetter = context.lookup(Registries.CONFIGURED_FEATURE);

        final Holder<ConfiguredFeature<?, ?>> FOREST_BAMBOO = featureGetter.getOrThrow(VegetationFeatures.BAMBOO_SOME_PODZOL);
        final Holder<ConfiguredFeature<?, ?>> SEAGRASS = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_SEAGRASS);
        final Holder<ConfiguredFeature<?, ?>> PATCH_CACTUS_OUTBACK = featureGetter.getOrThrow(VegetationFeatures.PATCH_CACTUS);
        final Holder<ConfiguredFeature<?, ?>> RU_BAMBOO = featureGetter.getOrThrow(VegetationFeatures.BAMBOO_SOME_PODZOL);
        //Grass
        final Holder<ConfiguredFeature<?, ?>> PATCH_GRASS_3 = featureGetter.getOrThrow(VegetationFeatures.PATCH_GRASS);
        final Holder<ConfiguredFeature<?, ?>> PATCH_MEDIUM_GRASS = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_MEDIUM_GRASS);
        final Holder<ConfiguredFeature<?, ?>> PATCH_SEEDED_GRASSES = featureGetter.getOrThrow(RuVegetationFeatures.SEEDED_GRASS_MIX);
        final Holder<ConfiguredFeature<?, ?>> PATCH_FOREST_FERNS = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_FOREST_FERN);
        final Holder<ConfiguredFeature<?, ?>> PATCH_TALL_FOREST_FERNS = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_TALL_FOREST_FERN);
        final Holder<ConfiguredFeature<?, ?>> GRASSLAND_STEPPE_GRASS = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_TALL_STEPPE_GRASS);
        final Holder<ConfiguredFeature<?, ?>> PATCH_REDSTONE_BUD = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_REDSTONE_BUD);
        final Holder<ConfiguredFeature<?, ?>> PATCH_REDSTONE_BULB = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_REDSTONE_BULB);
        //Flowers
        final Holder<ConfiguredFeature<?, ?>> RU_DEFAULT_FLOWERS = featureGetter.getOrThrow(RuVegetationFeatures.RU_FLOWER_DEFAULT);
        final Holder<ConfiguredFeature<?, ?>> RU_PINK_FLOWERS = featureGetter.getOrThrow(RuVegetationFeatures.RU_FLOWER_PINK);
        final Holder<ConfiguredFeature<?, ?>> RU_LILACS = featureGetter.getOrThrow(RuVegetationFeatures.RU_LILAC);
        final Holder<ConfiguredFeature<?, ?>> ALPHA_ROSE_BONEMEAL = featureGetter.getOrThrow(RuVegetationFeatures.ALPHA_ROSE);
        final Holder<ConfiguredFeature<?, ?>> ALPHA_DANDELION_BONEMEAL = featureGetter.getOrThrow(RuVegetationFeatures.ALPHA_DANDELION);
        final Holder<ConfiguredFeature<?, ?>> HYSSOP_MEADOW = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_HYSSOP);
        final Holder<ConfiguredFeature<?, ?>> DAISY_MEADOW = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_DAISY);
        final Holder<ConfiguredFeature<?, ?>> FIREWEED_MEADOW = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_FIREWEED);
        final Holder<ConfiguredFeature<?, ?>> PATCH_DAISIES = featureGetter.getOrThrow(RuVegetationFeatures.DAISY_MIX);
        //Trees
        final Holder<ConfiguredFeature<?, ?>> PALM_TROPICS = featureGetter.getOrThrow(RuTreeFeatures.PALM_TREE);
        //Other
        final Holder<ConfiguredFeature<?, ?>> PATCH_DUCKWEED = featureGetter.getOrThrow(RuVegetationFeatures.DUCKWEED);
        final Holder<ConfiguredFeature<?, ?>> PATCH_DUCKWEED_SPARSE = featureGetter.getOrThrow(RuVegetationFeatures.DUCKWEED);
        final Holder<ConfiguredFeature<?, ?>> PATCH_LILY_SPARSE = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_LILY_PAD);

        final Holder<ConfiguredFeature<?, ?>> CATTAIL_VANILLA = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_CATTAIL);
        final Holder<ConfiguredFeature<?, ?>> CATTAIL_RIVER = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_CATTAIL);
        final Holder<ConfiguredFeature<?, ?>> CATTAIL_14 = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_CATTAIL);
        final Holder<ConfiguredFeature<?, ?>> CATTAIL_BAYOU = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_CATTAIL);
        final Holder<ConfiguredFeature<?, ?>> CATTAIL_30 = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_CATTAIL);

        final Holder<ConfiguredFeature<?, ?>> OVERGROWN_VINES = featureGetter.getOrThrow(RuVegetationFeatures.OVERGROWN_VINE);

        final Holder<ConfiguredFeature<?, ?>> SCULK_WILLOW = featureGetter.getOrThrow(RuVegetationFeatures.SCULK_WILLOW);
        final Holder<ConfiguredFeature<?, ?>> GIANT_SCULK_WILLOW = featureGetter.getOrThrow(RuVegetationFeatures.GIANT_SCULK_WILLOW);

        //Vanilla
        register(context, RuVegetationPlacements.FOREST_BAMBOO, FOREST_BAMBOO, NoiseBasedCountPlacement.of(30, -0.8D, 2.0D), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());
        register(context, RuVegetationPlacements.SEAGRASS, SEAGRASS, seagrassPlacement(64));
        register(context, RuVegetationPlacements.PATCH_CACTUS_OUTBACK, PATCH_CACTUS_OUTBACK, RarityFilter.onAverageOnceEvery(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
        register(context, RuVegetationPlacements.RU_BAMBOO, RU_BAMBOO, NoiseBasedCountPlacement.of(30, -0.8D, 2.0D), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());
        //Grass
        register(context, RuVegetationPlacements.PATCH_GRASS_3, PATCH_GRASS_3, NoiseThresholdCountPlacement.of(-0.8D, 5, 3), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());
        register(context, RuVegetationPlacements.PATCH_MEDIUM_GRASS, PATCH_MEDIUM_GRASS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuVegetationPlacements.PATCH_SEEDED_GRASSES, PATCH_SEEDED_GRASSES, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 9), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuVegetationPlacements.PATCH_FOREST_FERNS, PATCH_FOREST_FERNS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.DIRT_PLACEMENT.get()), BiomeFilter.biome()));
        register(context, RuVegetationPlacements.PATCH_TALL_FOREST_FERNS, PATCH_TALL_FOREST_FERNS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.DIRT_PLACEMENT.get()), BiomeFilter.biome()));
        register(context, RuVegetationPlacements.GRASSLAND_STEPPE_GRASS, GRASSLAND_STEPPE_GRASS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuVegetationPlacements.PATCH_REDSTONE_BUD, PATCH_REDSTONE_BUD, List.of(CountPlacement.of(255), InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT, BiomeFilter.biome()));
        register(context, RuVegetationPlacements.PATCH_REDSTONE_BULB, PATCH_REDSTONE_BULB, List.of(CountPlacement.of(64), InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT, BiomeFilter.biome()));
        //Flowers
        register(context, RuVegetationPlacements.RU_DEFAULT_FLOWERS, RU_DEFAULT_FLOWERS, RarityFilter.onAverageOnceEvery(8), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
        register(context, RuVegetationPlacements.RU_PINK_FLOWERS, RU_PINK_FLOWERS, RarityFilter.onAverageOnceEvery(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
        register(context, RuVegetationPlacements.RU_LILACS, RU_LILACS, RarityFilter.onAverageOnceEvery(4), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
        register(context, RuVegetationPlacements.ALPHA_ROSE_BONEMEAL, ALPHA_ROSE_BONEMEAL, PlacementUtils.isEmpty());
        register(context, RuVegetationPlacements.ALPHA_DANDELION_BONEMEAL, ALPHA_DANDELION_BONEMEAL, PlacementUtils.isEmpty());
        register(context, RuVegetationPlacements.HYSSOP_MEADOW, HYSSOP_MEADOW, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 4), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuVegetationPlacements.DAISY_MEADOW, DAISY_MEADOW, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 4), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuVegetationPlacements.FIREWEED_MEADOW, FIREWEED_MEADOW, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 4), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuVegetationPlacements.PATCH_DAISIES, PATCH_DAISIES, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 9), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        //Trees
        register(context, RuVegetationPlacements.PALM_TROPICS, PALM_TROPICS, List.of(CountPlacement.of(3), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        //Other
        register(context, RuVegetationPlacements.PATCH_DUCKWEED, PATCH_DUCKWEED, worldSurfaceSquaredWithCount(32));
        register(context, RuVegetationPlacements.PATCH_DUCKWEED_SPARSE, PATCH_DUCKWEED_SPARSE, worldSurfaceSquaredWithCount(16));
        register(context, RuVegetationPlacements.PATCH_LILY_SPARSE, PATCH_LILY_SPARSE, worldSurfaceSquaredWithCount(6));

        register(context, RuVegetationPlacements.CATTAIL_VANILLA, CATTAIL_VANILLA, List.of(RarityFilter.onAverageOnceEvery(3), SurfaceWaterDepthFilter.forMaxDepth(3), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, RuVegetationFeatures.WATERSIDE, BiomeFilter.biome()));
        register(context, RuVegetationPlacements.CATTAIL_RIVER, CATTAIL_RIVER, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 48), SurfaceWaterDepthFilter.forMaxDepth(3), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, RuVegetationFeatures.WATERSIDE, BiomeFilter.biome()));
        register(context, RuVegetationPlacements.CATTAIL_14, CATTAIL_14, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 14), SurfaceWaterDepthFilter.forMaxDepth(3), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, RuVegetationFeatures.WATERSIDE, BiomeFilter.biome()));
        register(context, RuVegetationPlacements.CATTAIL_BAYOU, CATTAIL_BAYOU, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 14), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(3), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, RuVegetationFeatures.WATERSIDE, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.MUD_PLACEMENT.get()), BiomeFilter.biome()));
        register(context, RuVegetationPlacements.CATTAIL_30, CATTAIL_30, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 30), SurfaceWaterDepthFilter.forMaxDepth(3), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, RuVegetationFeatures.WATERSIDE, BiomeFilter.biome()));

        register(context, RuVegetationPlacements.OVERGROWN_VINES, OVERGROWN_VINES, CountPlacement.of(200), InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT, EnvironmentScanPlacement.scanningFor(Direction.UP, BlockPredicate.hasSturdyFace(Direction.DOWN), BlockPredicate.ONLY_IN_AIR_PREDICATE, 12), RandomOffsetPlacement.vertical(ConstantInt.of(-1)), BiomeFilter.biome());

        register(context, RuVegetationPlacements.SCULK_WILLOW, SCULK_WILLOW, CountOnEveryLayerPlacement.of(2),  BiomeFilter.biome());
        register(context, RuVegetationPlacements.GIANT_SCULK_WILLOW, GIANT_SCULK_WILLOW, CountOnEveryLayerPlacement.of(2),  BiomeFilter.biome());
    }
    public static List<PlacementModifier> worldSurfaceSquaredWithCount(int count) {
        return List.of(CountPlacement.of(count), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());
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