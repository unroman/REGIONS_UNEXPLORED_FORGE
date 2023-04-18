package net.regions_unexplored.data.worldgen.features;

import net.minecraft.core.Direction;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.features.CaveFeatures;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.util.valueproviders.ClampedNormalFloat;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformFloat;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CarvedPumpkinBlock;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.LakeFeature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.RuleBasedBlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.regions_unexplored.block.RegionsUnexploredBlocks;
import net.regions_unexplored.data.worldgen.features.feature.redstonefeatures.LargePointedRedstoneConfiguration;
import net.regions_unexplored.data.worldgen.features.feature.redstonefeatures.PointedRedstoneClusterConfiguration;
import net.regions_unexplored.data.worldgen.features.feature.redstonefeatures.PointedRedstoneConfiguration;
import net.regions_unexplored.data.tags.RegionsUnexploredTags;
import net.regions_unexplored.util.worldgen.RuFeatureUtils;
import net.regions_unexplored.world.level.block.AshBlock;

import java.util.List;


public class RuFeatures {
    public static final PlacementModifier STONE_RANGE = HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(256));
    public static final PlacementModifier DEEPSLATE_RANGE = HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(0));
    public static final PlacementModifier RANGE_BOTTOM_120 = HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(120));

    public static final ResourceKey<ConfiguredFeature<?, ?>> LAKE_WATER = RuFeatureUtils.createKey("lake_water");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MARSH_MUDDY = RuFeatureUtils.createKey("marsh_muddy");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RU_DISK_CLAY = RuFeatureUtils.createKey("ru_disk_clay");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RU_DISK_MUD = RuFeatureUtils.createKey("ru_disk_mud");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RU_DISK_GRAVEL = RuFeatureUtils.createKey("ru_disk_gravel");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RU_DISK_SAND = RuFeatureUtils.createKey("ru_disk_sand");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RU_DISK_MUD_BIG = RuFeatureUtils.createKey("ru_disk_mud_big");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SPIRES = RuFeatureUtils.createKey("spires");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_ROCK = RuFeatureUtils.createKey("nether_rock");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MEADOW_ROCKS = RuFeatureUtils.createKey("meadow_rocks");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MARSH = RuFeatureUtils.createKey("marsh");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ASH_VENT_PATCH = RuFeatureUtils.createKey("ash_vent_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MARSH_MUD = RuFeatureUtils.createKey("marsh_mud");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PUMPKINS = RuFeatureUtils.createKey("pumpkins");
    public static final ResourceKey<ConfiguredFeature<?, ?>> STONES = RuFeatureUtils.createKey("stones");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_STONES = RuFeatureUtils.createKey("nether_stones");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BUSH = RuFeatureUtils.createKey("bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> AUTUMN_BUSH = RuFeatureUtils.createKey("autumn_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> QUICKSAND = RuFeatureUtils.createKey("quicksand");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HANGING_PRISMARITE_CLUSTER = RuFeatureUtils.createKey("hanging_prismarite_cluster");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LAVA_FALL = RuFeatureUtils.createKey("lava_fall");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_LAVA_DELTA = RuFeatureUtils.createKey("overworld_lava_delta");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ASH_VENT = RuFeatureUtils.createKey("ash_vent");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BASALT_BLOB = RuFeatureUtils.createKey("basalt_blob");
    public static final ResourceKey<ConfiguredFeature<?, ?>> POINTED_REDSTONE = RuFeatureUtils.createKey("pointed_redstone");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LARGE_POINTED_REDSTONE = RuFeatureUtils.createKey("large_pointed_redstone");
    public static final ResourceKey<ConfiguredFeature<?, ?>> POINTED_REDSTONE_CLUSTER = RuFeatureUtils.createKey("pointed_redstone_cluster");
    public static final ResourceKey<ConfiguredFeature<?, ?>> POINTED_REDSTONE_NETHER = RuFeatureUtils.createKey("pointed_redstone_nether");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LARGE_POINTED_REDSTONE_NETHER = RuFeatureUtils.createKey("large_pointed_redstone_nether");
    public static final ResourceKey<ConfiguredFeature<?, ?>> POINTED_REDSTONE_CLUSTER_NETHER = RuFeatureUtils.createKey("pointed_redstone_cluster_nether");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_REDSTONE_LARGE = RuFeatureUtils.createKey("ore_redstone_large");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MINERAL_VEGETATION = RuFeatureUtils.createKey("mineral_vegetation");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MINERAL_VEGETATION_DEEPSLATE = RuFeatureUtils.createKey("mineral_vegetation_deepslate");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MINERAL_POOL = RuFeatureUtils.createKey("mineral_pool");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TOP_DRIPSTONE = RuFeatureUtils.createKey("top_dripstone");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MAGMA_DELTA = RuFeatureUtils.createKey("magma_delta");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OBSIDIAN_SPIRE = RuFeatureUtils.createKey("obsidian_spire");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ROCK_PILLAR = RuFeatureUtils.createKey("rock_pillar");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest sandTest = new TagMatchTest(RegionsUnexploredTags.SANDS);
        RuleTest baseStoneTest = new TagMatchTest(BlockTags.BASE_STONE_OVERWORLD);
        RuleTest stoneOreTest = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateOreTest = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        List<OreConfiguration.TargetBlockState> ORE_REDSTONE_TARGET_LIST = List.of(OreConfiguration.target(stoneOreTest, Blocks.REDSTONE_ORE.defaultBlockState()), OreConfiguration.target(deepslateOreTest, Blocks.DEEPSLATE_REDSTONE_ORE.defaultBlockState()));
        List<OreConfiguration.TargetBlockState> STONE_GRASS_TARGET_LIST = List.of(OreConfiguration.target(stoneOreTest, RegionsUnexploredBlocks.STONE_GRASS_BLOCK.get().defaultBlockState()), OreConfiguration.target(deepslateOreTest, RegionsUnexploredBlocks.DEEPSLATE_GRASS_BLOCK.get().defaultBlockState()));
        HolderGetter<ConfiguredFeature<?, ?>> holderGetter = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, LAKE_WATER, Feature.LAKE, new LakeFeature.Configuration(BlockStateProvider.simple(Blocks.WATER.defaultBlockState()), BlockStateProvider.simple(Blocks.MUD.defaultBlockState())));
        register(context, MARSH_MUDDY, Feature.WATERLOGGED_VEGETATION_PATCH, new VegetationPatchConfiguration(BlockTags.LUSH_GROUND_REPLACEABLE, BlockStateProvider.simple(Blocks.MUD), PlacementUtils.inlinePlaced(holderGetter.getOrThrow(CaveFeatures.POINTED_DRIPSTONE)), CaveSurface.FLOOR, ConstantInt.of(3), 0.8F, 5, 0.1F, UniformInt.of(4, 7), 0.7F));
        register(context, RU_DISK_CLAY, Feature.DISK, new DiskConfiguration(RuleBasedBlockStateProvider.simple(Blocks.CLAY), BlockPredicate.matchesBlocks(List.of(RegionsUnexploredBlocks.FOREST_MUD.get(), RegionsUnexploredBlocks.FOREST_DIRT.get(), RegionsUnexploredBlocks.PLAINS_DIRT.get(), Blocks.DIRT, Blocks.CLAY)), UniformInt.of(2, 3), 1));
        register(context, RU_DISK_MUD, Feature.DISK, new DiskConfiguration(RuleBasedBlockStateProvider.simple(Blocks.MUD), BlockPredicate.matchesBlocks(List.of(RegionsUnexploredBlocks.FOREST_MUD.get(), Blocks.MUD, RegionsUnexploredBlocks.FOREST_DIRT.get(), RegionsUnexploredBlocks.PLAINS_DIRT.get(), Blocks.DIRT, Blocks.CLAY)), UniformInt.of(2, 3), 1));
        register(context, RU_DISK_GRAVEL, Feature.DISK, new DiskConfiguration(RuleBasedBlockStateProvider.simple(Blocks.GRAVEL), BlockPredicate.matchesBlocks(List.of(RegionsUnexploredBlocks.FOREST_MUD.get(), RegionsUnexploredBlocks.FOREST_DIRT.get(), RegionsUnexploredBlocks.PLAINS_DIRT.get(), RegionsUnexploredBlocks.FOREST_GRASS_BLOCK.get(), RegionsUnexploredBlocks.PLAINS_GRASS_BLOCK.get(), Blocks.DIRT, Blocks.GRASS_BLOCK)), UniformInt.of(2, 5), 2));
        register(context, RU_DISK_SAND, Feature.DISK, new DiskConfiguration(RuleBasedBlockStateProvider.simple(Blocks.SAND), BlockPredicate.matchesBlocks(List.of(RegionsUnexploredBlocks.FOREST_MUD.get(), RegionsUnexploredBlocks.FOREST_DIRT.get(), RegionsUnexploredBlocks.PLAINS_DIRT.get(), RegionsUnexploredBlocks.FOREST_GRASS_BLOCK.get(), RegionsUnexploredBlocks.PLAINS_GRASS_BLOCK.get(), Blocks.DIRT, Blocks.GRASS_BLOCK)), UniformInt.of(2, 6), 2));
        register(context, RU_DISK_MUD_BIG, Feature.DISK, new DiskConfiguration(RuleBasedBlockStateProvider.simple(Blocks.MUD), BlockPredicate.matchesBlocks(List.of(RegionsUnexploredBlocks.FOREST_MUD.get(), Blocks.MUD, RegionsUnexploredBlocks.FOREST_DIRT.get(), RegionsUnexploredBlocks.PLAINS_DIRT.get(), RegionsUnexploredBlocks.FOREST_GRASS_BLOCK.get(), RegionsUnexploredBlocks.PLAINS_GRASS_BLOCK.get(), Blocks.DIRT, Blocks.GRASS_BLOCK, Blocks.SAND)), UniformInt.of(2, 6), 2));
        register(context, MARSH, Feature.WATERLOGGED_VEGETATION_PATCH, new VegetationPatchConfiguration(BlockTags.LUSH_GROUND_REPLACEABLE, BlockStateProvider.simple(Blocks.MOSS_BLOCK), PlacementUtils.inlinePlaced(holderGetter.getOrThrow(CaveFeatures.DRIPLEAF)), CaveSurface.FLOOR, ConstantInt.of(3), 0.8F, 5, 0.1F, UniformInt.of(4, 7), 0.7F));
        register(context, ASH_VENT_PATCH, Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RegionsUnexploredBlocks.ASH_VENT.get().defaultBlockState(), 3).add(Blocks.AIR.defaultBlockState(), 50))), List.of(Blocks.BASALT), 125));
        register(context, NETHER_ROCK, RegionsUnexploredFeatures.NETHER_MEADOW_ROCK.get(), new BlockStateConfiguration(RegionsUnexploredBlocks.MARROWSTONE.get().defaultBlockState()));
        register(context, MEADOW_ROCKS, RegionsUnexploredFeatures.MEADOW_ROCKS_FEATURE.get(), FeatureConfiguration.NONE);
        register(context, SPIRES, RegionsUnexploredFeatures.SPIRE_FEATURE.get(), FeatureConfiguration.NONE);
        register(context, MARSH_MUD, Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RegionsUnexploredBlocks.FOREST_MUD.get().defaultBlockState(), 1).add(Blocks.AIR.defaultBlockState(), 73))), List.of(Blocks.DIRT, RegionsUnexploredBlocks.FOREST_MUD.get()), 125));
        register(context, PUMPKINS, Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.PUMPKIN.defaultBlockState(), 4).add(Blocks.CARVED_PUMPKIN.defaultBlockState().setValue(CarvedPumpkinBlock.FACING, Direction.NORTH), 1).add(Blocks.CARVED_PUMPKIN.defaultBlockState().setValue(CarvedPumpkinBlock.FACING, Direction.SOUTH), 1).add(Blocks.CARVED_PUMPKIN.defaultBlockState().setValue(CarvedPumpkinBlock.FACING, Direction.EAST), 1).add(Blocks.CARVED_PUMPKIN.defaultBlockState().setValue(CarvedPumpkinBlock.FACING, Direction.WEST), 1).add(RegionsUnexploredBlocks.RED_MAPLE_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 1).add(RegionsUnexploredBlocks.ORANGE_MAPLE_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 1).add(Blocks.AIR.defaultBlockState(), 73))), List.of(Blocks.GRASS_BLOCK, Blocks.SNOW_BLOCK), 125));
        register(context, STONES, Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RegionsUnexploredBlocks.STONE_GRASS_BLOCK.get().defaultBlockState(), 1).add(RegionsUnexploredBlocks.MOSSY_STONE.get().defaultBlockState(), 1).add(Blocks.STONE.defaultBlockState(), 1).add(Blocks.COBBLESTONE.defaultBlockState(), 1).add(Blocks.AIR.defaultBlockState(), 75))), List.of(Blocks.GRASS_BLOCK, Blocks.SNOW_BLOCK), 125));
        register(context, NETHER_STONES, Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.NETHERRACK.defaultBlockState(), 1).add(Blocks.BLACKSTONE.defaultBlockState(), 1).add(Blocks.SMOOTH_BASALT.defaultBlockState(), 1).add(Blocks.AIR.defaultBlockState(), 100))), List.of(Blocks.NETHERRACK, RegionsUnexploredBlocks.GLISTERING_NYLIUM.get()), 125));
        register(context, BUSH, Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RegionsUnexploredBlocks.MAPLE_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2).add(Blocks.OAK_LEAVES.defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2).add(Blocks.AIR.defaultBlockState(), 75))), List.of(Blocks.GRASS_BLOCK, Blocks.SNOW_BLOCK), 125));
        register(context, AUTUMN_BUSH, Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RegionsUnexploredBlocks.RED_MAPLE_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 1).add(RegionsUnexploredBlocks.ORANGE_MAPLE_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 1).add(Blocks.OAK_LEAVES.defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2).add(Blocks.AIR.defaultBlockState(), 75))), List.of(Blocks.GRASS_BLOCK, Blocks.SNOW_BLOCK), 125));
        register(context, QUICKSAND, Feature.ORE, new OreConfiguration(sandTest, RegionsUnexploredBlocks.QUICKSAND.get().defaultBlockState(), 32));
        register(context, HANGING_PRISMARITE_CLUSTER, RegionsUnexploredFeatures.HANGING_PRISMARITE.get(), FeatureConfiguration.NONE);
        register(context, LAVA_FALL, RegionsUnexploredFeatures.LAVA_FALL.get(), FeatureConfiguration.NONE);
        register(context, OVERWORLD_LAVA_DELTA, RegionsUnexploredFeatures.OVERWORLD_LAVA_DELTA.get(), new VegetationPatchConfiguration(BlockTags.LUSH_GROUND_REPLACEABLE, BlockStateProvider.simple(RegionsUnexploredBlocks.VOLCANIC_ASH.get().defaultBlockState().setValue(AshBlock.HAS_GRAVITY, false)), PlacementUtils.inlinePlaced(holderGetter.getOrThrow(CaveFeatures.POINTED_DRIPSTONE)), CaveSurface.FLOOR, ConstantInt.of(3), 0.8F, 5, 0.1F, UniformInt.of(4, 7), 0.7F));
        register(context, ASH_VENT, RegionsUnexploredFeatures.ASH_VENT.get(), FeatureConfiguration.NONE);
        register(context, BASALT_BLOB, RegionsUnexploredFeatures.BASALT_BLOB.get(), new ColumnFeatureConfiguration(ConstantInt.of(1), UniformInt.of(1, 4)));
        register(context, POINTED_REDSTONE, Feature.SIMPLE_RANDOM_SELECTOR, new SimpleRandomFeatureConfiguration(HolderSet.direct(PlacementUtils.inlinePlaced(RegionsUnexploredFeatures.POINTED_REDSTONE.get(), new PointedRedstoneConfiguration(0.5F, 0.7F, 0.5F, 0.5F), EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.solid(), BlockPredicate.ONLY_IN_AIR_OR_WATER_PREDICATE, 12), RandomOffsetPlacement.vertical(ConstantInt.of(1))), PlacementUtils.inlinePlaced(RegionsUnexploredFeatures.POINTED_REDSTONE.get(), new PointedRedstoneConfiguration(0.5F, 0.7F, 0.5F, 0.5F), EnvironmentScanPlacement.scanningFor(Direction.UP, BlockPredicate.solid(), BlockPredicate.ONLY_IN_AIR_OR_WATER_PREDICATE, 12), RandomOffsetPlacement.vertical(ConstantInt.of(-1))))));
        register(context, LARGE_POINTED_REDSTONE, RegionsUnexploredFeatures.LARGE_POINTED_REDSTONE.get(), new LargePointedRedstoneConfiguration(30, UniformInt.of(1, 6), UniformFloat.of(0.4F, 2.0F), 0.33F, UniformFloat.of(0.3F, 0.9F), UniformFloat.of(0.4F, 1.0F), UniformFloat.of(0.0F, 0.3F), 4, 0.6F));
        register(context, POINTED_REDSTONE_CLUSTER, RegionsUnexploredFeatures.POINTED_REDSTONE_CLUSTER.get(), new PointedRedstoneClusterConfiguration(12, UniformInt.of(3, 6), UniformInt.of(2, 8), 1, 3, UniformInt.of(2, 4), UniformFloat.of(0.3F, 0.7F), ClampedNormalFloat.of(0.1F, 0.3F, 0.1F, 0.9F), 0.1F, 3, 8));

        register(context, POINTED_REDSTONE_NETHER, Feature.SIMPLE_RANDOM_SELECTOR, new SimpleRandomFeatureConfiguration(HolderSet.direct(PlacementUtils.inlinePlaced(RegionsUnexploredFeatures.POINTED_REDSTONE.get(), new PointedRedstoneConfiguration(0.5F, 0.7F, 0.5F, 0.5F), EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.solid(), BlockPredicate.ONLY_IN_AIR_PREDICATE, 12), RandomOffsetPlacement.vertical(ConstantInt.of(1))), PlacementUtils.inlinePlaced(RegionsUnexploredFeatures.POINTED_REDSTONE.get(), new PointedRedstoneConfiguration(0.5F, 0.7F, 0.5F, 0.5F), EnvironmentScanPlacement.scanningFor(Direction.UP, BlockPredicate.solid(), BlockPredicate.ONLY_IN_AIR_PREDICATE, 12), RandomOffsetPlacement.vertical(ConstantInt.of(-1))))));
        register(context, LARGE_POINTED_REDSTONE_NETHER, RegionsUnexploredFeatures.LARGE_POINTED_REDSTONE.get(), new LargePointedRedstoneConfiguration(30, UniformInt.of(1, 6), UniformFloat.of(0.4F, 2.0F), 0.33F, UniformFloat.of(0.3F, 0.9F), UniformFloat.of(0.4F, 1.0F), UniformFloat.of(0.0F, 0.3F), 4, 0.6F));
        register(context, POINTED_REDSTONE_CLUSTER_NETHER, RegionsUnexploredFeatures.POINTED_REDSTONE_CLUSTER.get(), new PointedRedstoneClusterConfiguration(12, UniformInt.of(3, 6), UniformInt.of(2, 8), 1, 3, UniformInt.of(2, 4), UniformFloat.of(0.3F, 0.7F), ClampedNormalFloat.of(0.0F, 0.0F, 0.0F, 0.0F), 0.1F, 3, 8));

        register(context, ORE_REDSTONE_LARGE, Feature.ORE, new OreConfiguration(ORE_REDSTONE_TARGET_LIST, 20));
        //TODO Turn to stone/deepslate grass
        register(context, MINERAL_VEGETATION, Feature.VEGETATION_PATCH, new VegetationPatchConfiguration(BlockTags.STONE_ORE_REPLACEABLES, BlockStateProvider.simple(RegionsUnexploredBlocks.STONE_GRASS_BLOCK.get()), PlacementUtils.inlinePlaced(holderGetter.getOrThrow(RuVegetationFeatures.UNDERGROUND_GRASS)), CaveSurface.FLOOR, ConstantInt.of(1), 0.0F, 5, 0.8F, UniformInt.of(4, 7), 0.3F));
        register(context, MINERAL_VEGETATION_DEEPSLATE, Feature.VEGETATION_PATCH, new VegetationPatchConfiguration(BlockTags.DEEPSLATE_ORE_REPLACEABLES, BlockStateProvider.simple(RegionsUnexploredBlocks.DEEPSLATE_GRASS_BLOCK.get()), PlacementUtils.inlinePlaced(holderGetter.getOrThrow(RuVegetationFeatures.UNDERGROUND_GRASS)), CaveSurface.FLOOR, ConstantInt.of(1), 0.0F, 5, 0.8F, UniformInt.of(4, 7), 0.3F));
        register(context, MINERAL_POOL, Feature.WATERLOGGED_VEGETATION_PATCH, new VegetationPatchConfiguration(BlockTags.LUSH_GROUND_REPLACEABLE, BlockStateProvider.simple(Blocks.CALCITE), PlacementUtils.inlinePlaced(holderGetter.getOrThrow(CaveFeatures.POINTED_DRIPSTONE)), CaveSurface.FLOOR, ConstantInt.of(3), 0.8F, 5, 0.1F, UniformInt.of(4, 7), 0.7F));
        register(context, TOP_DRIPSTONE, Feature.SIMPLE_RANDOM_SELECTOR, new SimpleRandomFeatureConfiguration(HolderSet.direct(PlacementUtils.inlinePlaced(Feature.POINTED_DRIPSTONE, new PointedDripstoneConfiguration(0.8F, 0.7F, 0.5F, 0.5F), EnvironmentScanPlacement.scanningFor(Direction.UP, BlockPredicate.solid(), BlockPredicate.ONLY_IN_AIR_OR_WATER_PREDICATE, 12), RandomOffsetPlacement.vertical(ConstantInt.of(-1))), PlacementUtils.inlinePlaced(Feature.POINTED_DRIPSTONE, new PointedDripstoneConfiguration(0.8F, 0.7F, 0.5F, 0.5F), EnvironmentScanPlacement.scanningFor(Direction.UP, BlockPredicate.solid(), BlockPredicate.ONLY_IN_AIR_OR_WATER_PREDICATE, 12), RandomOffsetPlacement.vertical(ConstantInt.of(-1))))));
        register(context, MAGMA_DELTA, Feature.DELTA_FEATURE, new DeltaFeatureConfiguration(Blocks.MAGMA_BLOCK.defaultBlockState(), Blocks.OBSIDIAN.defaultBlockState(), UniformInt.of(7, 8), UniformInt.of(0, 2)));
        register(context, OBSIDIAN_SPIRE, RegionsUnexploredFeatures.OBSIDIAN_SPIRE.get(), FeatureConfiguration.NONE);
        register(context, ROCK_PILLAR, RegionsUnexploredFeatures.ROCK_PILLAR.get(), FeatureConfiguration.NONE);
    }

    private static RandomPatchConfiguration grassPatch(BlockStateProvider stateProvider, int i) {
        return FeatureUtils.simpleRandomPatchConfiguration(i, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(stateProvider)));
    }

    public static boolean isNetherStone(BlockState state) {
        return state.is(BlockTags.BASE_STONE_NETHER);
    }

    public static boolean isNylium(BlockState state) {
        return state.is(BlockTags.NYLIUM);
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC config) {
        context.register(key, new ConfiguredFeature<>(feature, config));
    }
}
