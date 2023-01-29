package net.regions_unexplored.data.worldgen.placement;

import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.features.CaveFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.ClampedNormalInt;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.BlockPredicateFilter;
import net.minecraft.world.level.levelgen.placement.SurfaceWaterDepthFilter;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraft.world.level.levelgen.placement.EnvironmentScanPlacement;
import net.minecraft.world.level.levelgen.placement.RandomOffsetPlacement;
import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.material.Fluids;
import net.regions_unexplored.data.worldgen.features.RuFeatures;
import net.regions_unexplored.data.worldgen.features.RuVegetationFeatures;
import net.minecraft.world.level.levelgen.placement.CountOnEveryLayerPlacement;
import net.regions_unexplored.util.worldgen.RuPlacementUtils;

import java.util.List;


public class RuPlacements {
    public static final ResourceKey<PlacedFeature> RU_CLAY = RuPlacementUtils.createKey("ru_clay");
    public static final ResourceKey<PlacedFeature>  RU_MUD = RuPlacementUtils.createKey("ru_mud");
    public static final ResourceKey<PlacedFeature>  RU_GRAVEL = RuPlacementUtils.createKey("ru_gravel");
    public static final ResourceKey<PlacedFeature>  RU_SAND = RuPlacementUtils.createKey("ru_sand");
    public static final ResourceKey<PlacedFeature>  RU_MUD_BIG = RuPlacementUtils.createKey("ru_mud_big");
    public static final ResourceKey<PlacedFeature>  MARSHES = RuPlacementUtils.createKey("marshes");
    public static final ResourceKey<PlacedFeature>  MEADOW_ROCKS = RuPlacementUtils.createKey("meadow_rocks_placed");
    public static final ResourceKey<PlacedFeature>  SPIRES = RuPlacementUtils.createKey("spires_placed");
    public static final ResourceKey<PlacedFeature>  NOISE_PUMPKINS = RuPlacementUtils.createKey("noise_pumpkins");
    public static final ResourceKey<PlacedFeature>  NOISE_MUD = RuPlacementUtils.createKey("noise_mud");
    public static final ResourceKey<PlacedFeature>  NOISE_ROCKS = RuPlacementUtils.createKey("noise_rocks");
    public static final ResourceKey<PlacedFeature>  NOISE_ROCKS_NETHER = RuPlacementUtils.createKey("noise_rocks_nether");
    public static final ResourceKey<PlacedFeature>  NOISE_BUSH = RuPlacementUtils.createKey("noise_bush");
    public static final ResourceKey<PlacedFeature>  NOISE_AUTUMN_BUSH = RuPlacementUtils.createKey("noise_autumn_bush");
    public static final ResourceKey<PlacedFeature>  MUDDY_MARSHES = RuPlacementUtils.createKey("muddy_marshes");
    public static final ResourceKey<PlacedFeature>  LAKE_WATER = RuPlacementUtils.createKey("lake_water");
    public static final ResourceKey<PlacedFeature>  QUICKSAND = RuPlacementUtils.createKey("quicksand");
    public static final ResourceKey<PlacedFeature>  HANGING_PRISMARITE_CLUSTER = RuPlacementUtils.createKey("hanging_prismarite_cluster");
    public static final ResourceKey<PlacedFeature>  LAVA_FALL = RuPlacementUtils.createKey("lava_fall");
    public static final ResourceKey<PlacedFeature>  OVERWORLD_LAVA_DELTA = RuPlacementUtils.createKey("overworld_lava_delta");
    public static final ResourceKey<PlacedFeature>  ASH_VENT = RuPlacementUtils.createKey("ash_vent");
    public static final ResourceKey<PlacedFeature>  ASH_VENT_SURFACE = RuPlacementUtils.createKey("ash_vent_surface");
    public static final ResourceKey<PlacedFeature>  BASALT_BLOB = RuPlacementUtils.createKey("basalt_blob");
    //REDSTONE
    public static final ResourceKey<PlacedFeature>  POINTED_REDSTONE = RuPlacementUtils.createKey("pointed_redstone");
    public static final ResourceKey<PlacedFeature>  LARGE_POINTED_REDSTONE = RuPlacementUtils.createKey("large_pointed_redstone");
    public static final ResourceKey<PlacedFeature>  POINTED_REDSTONE_CLUSTER = RuPlacementUtils.createKey("pointed_redstone_cluster");
    public static final ResourceKey<PlacedFeature>  ORE_REDSTONE_LARGE = RuPlacementUtils.createKey("ore_redstone_large");
    //OTHER
    public static final ResourceKey<PlacedFeature>  MAGMA_PATCH = RuPlacementUtils.createKey("magma_patch");
    public static final ResourceKey<PlacedFeature>  MINERAL_VEGETATION = RuPlacementUtils.createKey("mineral_vegetation");
    public static final ResourceKey<PlacedFeature>  MINERAL_POOL = RuPlacementUtils.createKey("mineral_pool");
    public static final ResourceKey<PlacedFeature>  TOP_DRIPSTONE = RuPlacementUtils.createKey("top_dripstone");
    public static final ResourceKey<PlacedFeature>  MINERAL_VINES = RuPlacementUtils.createKey("mineral_vines");
    public static final ResourceKey<PlacedFeature>  ROCK_PILLAR = RuPlacementUtils.createKey("rock_pillar");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> featureGetter = context.lookup(Registries.CONFIGURED_FEATURE);

        final Holder<ConfiguredFeature<?, ?>>  RU_CLAY = featureGetter.getOrThrow(RuFeatures.RU_DISK_CLAY);
        final Holder<ConfiguredFeature<?, ?>>  RU_MUD = featureGetter.getOrThrow(RuFeatures.RU_DISK_MUD);
        final Holder<ConfiguredFeature<?, ?>>  RU_GRAVEL = featureGetter.getOrThrow(RuFeatures.RU_DISK_GRAVEL);
        final Holder<ConfiguredFeature<?, ?>>  RU_SAND = featureGetter.getOrThrow(RuFeatures.RU_DISK_SAND);
        final Holder<ConfiguredFeature<?, ?>>  RU_MUD_BIG = featureGetter.getOrThrow(RuFeatures.RU_DISK_MUD_BIG);
        final Holder<ConfiguredFeature<?, ?>>  MARSHES = featureGetter.getOrThrow(RuFeatures.MARSH);
        final Holder<ConfiguredFeature<?, ?>>  NOISE_PUMPKINS = featureGetter.getOrThrow(RuFeatures.PUMPKINS);
        final Holder<ConfiguredFeature<?, ?>>  NOISE_MUD = featureGetter.getOrThrow(RuFeatures.MARSH_MUD);
        final Holder<ConfiguredFeature<?, ?>>  NOISE_ROCKS = featureGetter.getOrThrow(RuFeatures.STONES);
        final Holder<ConfiguredFeature<?, ?>>  NOISE_ROCKS_NETHER = featureGetter.getOrThrow(RuFeatures.NETHER_STONES);
        final Holder<ConfiguredFeature<?, ?>>  NOISE_BUSH = featureGetter.getOrThrow(RuFeatures.BUSH);
        final Holder<ConfiguredFeature<?, ?>>  MEADOW_ROCKS = featureGetter.getOrThrow(RuFeatures.MEADOW_ROCKS);
        final Holder<ConfiguredFeature<?, ?>>  SPIRES = featureGetter.getOrThrow(RuFeatures.SPIRES);
        final Holder<ConfiguredFeature<?, ?>>  NOISE_AUTUMN_BUSH = featureGetter.getOrThrow(RuFeatures.AUTUMN_BUSH);
        final Holder<ConfiguredFeature<?, ?>>  MUDDY_MARSHES = featureGetter.getOrThrow(RuFeatures.MARSH_MUDDY);
        final Holder<ConfiguredFeature<?, ?>>  LAKE_WATER = featureGetter.getOrThrow(RuFeatures.LAKE_WATER);
        final Holder<ConfiguredFeature<?, ?>>  QUICKSAND = featureGetter.getOrThrow(RuFeatures.QUICKSAND);
        final Holder<ConfiguredFeature<?, ?>>  HANGING_PRISMARITE_CLUSTER = featureGetter.getOrThrow(RuFeatures.HANGING_PRISMARITE_CLUSTER);
        final Holder<ConfiguredFeature<?, ?>>  LAVA_FALL = featureGetter.getOrThrow(RuFeatures.LAVA_FALL);
        final Holder<ConfiguredFeature<?, ?>>  OVERWORLD_LAVA_DELTA = featureGetter.getOrThrow(RuFeatures.OVERWORLD_LAVA_DELTA);
        final Holder<ConfiguredFeature<?, ?>>  ASH_VENT = featureGetter.getOrThrow(RuFeatures.ASH_VENT);
        final Holder<ConfiguredFeature<?, ?>>  BASALT_BLOB = featureGetter.getOrThrow(RuFeatures.BASALT_BLOB);
        //REDSTONE
        final Holder<ConfiguredFeature<?, ?>>  POINTED_REDSTONE = featureGetter.getOrThrow(RuFeatures.POINTED_REDSTONE);
        final Holder<ConfiguredFeature<?, ?>>  LARGE_POINTED_REDSTONE = featureGetter.getOrThrow(RuFeatures.LARGE_POINTED_REDSTONE);
        final Holder<ConfiguredFeature<?, ?>>  POINTED_REDSTONE_CLUSTER = featureGetter.getOrThrow(RuFeatures.POINTED_REDSTONE_CLUSTER);
        final Holder<ConfiguredFeature<?, ?>>  ORE_REDSTONE_LARGE = featureGetter.getOrThrow(RuFeatures.ORE_REDSTONE_LARGE);
        //OTHER
        final Holder<ConfiguredFeature<?, ?>>  MAGMA_PATCH = featureGetter.getOrThrow(RuFeatures.MAGMA_DELTA);
        final Holder<ConfiguredFeature<?, ?>>  MINERAL_VEGETATION = featureGetter.getOrThrow(RuFeatures.MINERAL_VEGETATION);
        final Holder<ConfiguredFeature<?, ?>>  MINERAL_POOL = featureGetter.getOrThrow(RuFeatures.MINERAL_POOL);
        final Holder<ConfiguredFeature<?, ?>>  TOP_DRIPSTONE = featureGetter.getOrThrow(RuFeatures.TOP_DRIPSTONE);
        final Holder<ConfiguredFeature<?, ?>>  MINERAL_VINES = featureGetter.getOrThrow(CaveFeatures.CAVE_VINE);
        final Holder<ConfiguredFeature<?, ?>>  ROCK_PILLAR = featureGetter.getOrThrow(RuFeatures.ROCK_PILLAR);


        register(context, RuPlacements.RU_CLAY, RU_CLAY, InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_TOP_SOLID, BlockPredicateFilter.forPredicate(BlockPredicate.matchesFluids(Fluids.WATER)), BiomeFilter.biome());
        register(context, RuPlacements.RU_MUD, RU_MUD, InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_TOP_SOLID, BlockPredicateFilter.forPredicate(BlockPredicate.matchesFluids(Fluids.WATER)), BiomeFilter.biome());
        register(context, RuPlacements.RU_GRAVEL, RU_GRAVEL, InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_TOP_SOLID, BlockPredicateFilter.forPredicate(BlockPredicate.matchesFluids(Fluids.WATER)), BiomeFilter.biome());
        register(context, RuPlacements.RU_SAND, RU_SAND, CountPlacement.of(3), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_TOP_SOLID, BlockPredicateFilter.forPredicate(BlockPredicate.matchesFluids(Fluids.WATER)), BiomeFilter.biome());
        register(context, RuPlacements.RU_MUD_BIG, RU_MUD_BIG, CountPlacement.of(3), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_TOP_SOLID, BlockPredicateFilter.forPredicate(BlockPredicate.matchesFluids(Fluids.WATER)), BiomeFilter.biome());
        register(context, RuPlacements.MARSHES, MARSHES, CountPlacement.of(125), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_TOP_SOLID, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.solid(), BlockPredicate.ONLY_IN_AIR_PREDICATE, 12), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome());
        register(context, RuPlacements.NOISE_PUMPKINS, NOISE_PUMPKINS, List.of(CountPlacement.of(18), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, RuPlacements.NOISE_MUD, NOISE_MUD, List.of(CountPlacement.of(35), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(1), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, RuVegetationFeatures.MARSH, BiomeFilter.biome()));
        register(context, RuPlacements.NOISE_ROCKS, NOISE_ROCKS, List.of(CountPlacement.of(25), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, RuPlacements.NOISE_ROCKS_NETHER, NOISE_ROCKS_NETHER, List.of(CountOnEveryLayerPlacement.of(20), InSquarePlacement.spread(), BiomeFilter.biome()));
        register(context, RuPlacements.NOISE_BUSH, NOISE_BUSH, List.of(CountPlacement.of(25), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, RuPlacements.MEADOW_ROCKS, MEADOW_ROCKS, List.of(BiomeFilter.biome()));
        register(context, RuPlacements.SPIRES, SPIRES, List.of(BiomeFilter.biome()));
        register(context, RuPlacements.NOISE_AUTUMN_BUSH, NOISE_AUTUMN_BUSH, List.of(CountPlacement.of(25), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, RuPlacements.MUDDY_MARSHES, MUDDY_MARSHES, PlacementUtils.countExtra(0, 0.1F, 1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_TOP_SOLID, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.solid(), BlockPredicate.ONLY_IN_AIR_PREDICATE, 12), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome());
        register(context, RuPlacements.LAKE_WATER, LAKE_WATER, RarityFilter.onAverageOnceEvery(12), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());
        register(context, RuPlacements.QUICKSAND, QUICKSAND, commonOrePlacement(12, HeightRangePlacement.uniform(VerticalAnchor.absolute(50), VerticalAnchor.absolute(130))));
        register(context, RuPlacements.HANGING_PRISMARITE_CLUSTER, HANGING_PRISMARITE_CLUSTER, CountPlacement.of(UniformInt.of(78, 126)), InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT, BiomeFilter.biome());
        register(context, RuPlacements.LAVA_FALL, LAVA_FALL, List.of(CountOnEveryLayerPlacement.of(6), InSquarePlacement.spread(), BiomeFilter.biome()));
        register(context, RuPlacements.OVERWORLD_LAVA_DELTA, OVERWORLD_LAVA_DELTA, CountPlacement.of(115), InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.solid(), BlockPredicate.ONLY_IN_AIR_PREDICATE, 12), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome());
        register(context, RuPlacements.ASH_VENT, ASH_VENT, List.of(CountOnEveryLayerPlacement.of(7), BiomeFilter.biome()));
        register(context, RuPlacements.ASH_VENT_SURFACE, ASH_VENT, List.of(CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuPlacements.BASALT_BLOB, BASALT_BLOB, CountOnEveryLayerPlacement.of(4), BiomeFilter.biome());
        //REDSTONE
        register(context, RuPlacements.POINTED_REDSTONE, POINTED_REDSTONE, CountPlacement.of(UniformInt.of(192, 256)), InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT, CountPlacement.of(UniformInt.of(1, 5)), RandomOffsetPlacement.of(ClampedNormalInt.of(0.0F, 3.0F, -10, 10), ClampedNormalInt.of(0.0F, 0.6F, -2, 2)), BiomeFilter.biome());
        register(context, RuPlacements.LARGE_POINTED_REDSTONE, LARGE_POINTED_REDSTONE, CountPlacement.of(UniformInt.of(10, 48)), InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT, BiomeFilter.biome());
        register(context, RuPlacements.POINTED_REDSTONE_CLUSTER, POINTED_REDSTONE_CLUSTER, CountPlacement.of(UniformInt.of(78, 126)), InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT, BiomeFilter.biome());
        register(context, RuPlacements.ORE_REDSTONE_LARGE, ORE_REDSTONE_LARGE, commonOrePlacement(16, HeightRangePlacement.triangle(VerticalAnchor.bottom(), VerticalAnchor.absolute(112))));
        //OTHER
        register(context, RuPlacements.MAGMA_PATCH, MAGMA_PATCH, CountOnEveryLayerPlacement.of(40), BiomeFilter.biome());
        register(context, RuPlacements.MINERAL_VEGETATION, MINERAL_VEGETATION, CountPlacement.of(25), InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.solid(), BlockPredicate.ONLY_IN_AIR_PREDICATE, 12), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome());
        register(context, RuPlacements.MINERAL_POOL, MINERAL_POOL, CountPlacement.of(70), InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.solid(), BlockPredicate.ONLY_IN_AIR_PREDICATE, 12), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome());
        register(context, RuPlacements.TOP_DRIPSTONE, TOP_DRIPSTONE, CountPlacement.of(UniformInt.of(192, 256)), InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT, CountPlacement.of(UniformInt.of(1, 5)), RandomOffsetPlacement.of(ClampedNormalInt.of(0.0F, 3.0F, -10, 10), ClampedNormalInt.of(0.0F, 0.6F, -2, 2)), BiomeFilter.biome());
        register(context, RuPlacements.MINERAL_VINES, MINERAL_VINES, CountPlacement.of(155), InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT, EnvironmentScanPlacement.scanningFor(Direction.UP, BlockPredicate.hasSturdyFace(Direction.DOWN), BlockPredicate.ONLY_IN_AIR_PREDICATE, 12), RandomOffsetPlacement.vertical(ConstantInt.of(-1)), BiomeFilter.biome());

        register(context, RuPlacements.ROCK_PILLAR, ROCK_PILLAR, CountOnEveryLayerPlacement.of(1),  BiomeFilter.biome());
    }
    private static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    private static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    protected static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> feature, PlacementModifier... placement) {
        register(context, key, feature, List.of(placement));
    }

    protected static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> feature, List<PlacementModifier> placement) {
        context.register(key, new PlacedFeature(feature, placement));
    }
}
