package net.regions_unexplored.data.worldgen.features;

import com.google.common.collect.ImmutableList;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.MultifaceBlock;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FancyFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.regions_unexplored.block.RegionsUnexploredBlocks;
import net.regions_unexplored.data.worldgen.features.feature.configuration.HyacinthStockConfiguration;
import net.regions_unexplored.data.worldgen.features.feature.configuration.SeaRockConfiguration;
import net.regions_unexplored.data.worldgen.features.feature.configuration.RuTreeConfiguration;
import net.regions_unexplored.util.worldgen.RuFeatureUtils;
import net.regions_unexplored.world.features.treedecorators.PalmLeavesPlacer;

import java.util.OptionalInt;

public class RuAquaticFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> WATER_CATTAIL = RuFeatureUtils.createKey("water_cattail");

    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_HYACINTH_STOCK = RuFeatureUtils.createKey("tall_hyacinth_stock");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HYACINTH_PLANTS = RuFeatureUtils.createKey("hyacinth_plants");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HYACINTH_FLOWERS = RuFeatureUtils.createKey("hyacinth_flowers");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HYACINTH_ROCKS = RuFeatureUtils.createKey("hyacinth_rocks");

    public static final ResourceKey<ConfiguredFeature<?, ?>> MOSSY_SEA_ROCKS = RuFeatureUtils.createKey("mossy_sea_rocks");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_CHERRY_FLOWERS_AQUATIC = RuFeatureUtils.createKey("red_cherry_flowers_aquatic");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_CHERRY_FLOWERS_AQUATIC = RuFeatureUtils.createKey("pink_cherry_flowers_aquatic");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_CHERRY_FLOWERS_AQUATIC = RuFeatureUtils.createKey("white_cherry_flowers_aquatic");
    public static final ResourceKey<ConfiguredFeature<?, ?>> JUNGLE_TREE_AQUATIC = RuFeatureUtils.createKey("jungle_tree_aquatic");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PALM_TREE_AQUATIC = RuFeatureUtils.createKey("palm_tree_aquatic");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ELEPHANT_EAR_AQUATIC = RuFeatureUtils.createKey("elephant_ear_aquatic");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        HolderGetter<ConfiguredFeature<?, ?>> holderGetter = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, WATER_CATTAIL, RegionsUnexploredFeatures.WATER_CATTAIL.get(), FeatureConfiguration.NONE);
        //HYACINTH
        register(context, TALL_HYACINTH_STOCK, RegionsUnexploredFeatures.TALL_HYACINTH_STOCK.get(), new HyacinthStockConfiguration(BlockStateProvider.simple(RegionsUnexploredBlocks.TALL_HYACINTH_STOCK.get()), 1, 14));
        register(context, HYACINTH_PLANTS, RegionsUnexploredFeatures.HYACINTH_PLANTS.get(), new ProbabilityFeatureConfiguration(0.1F));
        register(context, HYACINTH_FLOWERS, Feature.MULTIFACE_GROWTH, new MultifaceGrowthConfiguration((MultifaceBlock)RegionsUnexploredBlocks.HYACINTH_FLOWERS.get(), 20, true, true, true, 1.0F, HolderSet.direct(Block::builtInRegistryHolder, Blocks.STONE, Blocks.PRISMARINE, Blocks.PRISMARINE_BRICKS, RegionsUnexploredBlocks.HYACINTH_STONE.get())));
        register(context, HYACINTH_ROCKS, RegionsUnexploredFeatures.OCEAN_ROCK.get(), new SeaRockConfiguration(Blocks.STONE.defaultBlockState(), RegionsUnexploredBlocks.HYACINTH_STONE.get().defaultBlockState()));
        //ROCKY_REEF
        register(context, MOSSY_SEA_ROCKS, RegionsUnexploredFeatures.ROCK_PILLAR.get(), FeatureConfiguration.NONE);
        register(context, RED_CHERRY_FLOWERS_AQUATIC, RegionsUnexploredFeatures.AIR_MULTIFACE_GROWTH.get(), new MultifaceGrowthConfiguration((MultifaceBlock)RegionsUnexploredBlocks.RED_CHERRY_FLOWERS.get(), 20, true, true, true, 1.0F, HolderSet.direct(Block::builtInRegistryHolder, Blocks.STONE, RegionsUnexploredBlocks.STONE_GRASS_BLOCK.get())));
        register(context, PINK_CHERRY_FLOWERS_AQUATIC, RegionsUnexploredFeatures.AIR_MULTIFACE_GROWTH.get(), new MultifaceGrowthConfiguration((MultifaceBlock)RegionsUnexploredBlocks.PINK_CHERRY_FLOWERS.get(), 20, true, true, true, 1.0F, HolderSet.direct(Block::builtInRegistryHolder, Blocks.STONE, RegionsUnexploredBlocks.STONE_GRASS_BLOCK.get())));
        register(context, WHITE_CHERRY_FLOWERS_AQUATIC, RegionsUnexploredFeatures.AIR_MULTIFACE_GROWTH.get(), new MultifaceGrowthConfiguration((MultifaceBlock)RegionsUnexploredBlocks.WHITE_CHERRY_FLOWERS.get(), 20, true, true, true, 1.0F, HolderSet.direct(Block::builtInRegistryHolder, Blocks.STONE, RegionsUnexploredBlocks.STONE_GRASS_BLOCK.get())));
        register(context, JUNGLE_TREE_AQUATIC, RegionsUnexploredFeatures.SAKURA_TREE.get(), new RuTreeConfiguration(BlockStateProvider.simple(Blocks.JUNGLE_LOG.defaultBlockState()), BlockStateProvider.simple(Blocks.JUNGLE_LEAVES.defaultBlockState()), BlockStateProvider.simple(RegionsUnexploredBlocks.JUNGLE_BRANCH.get().defaultBlockState()), 1, 4));
        register(context, PALM_TREE_AQUATIC, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(RegionsUnexploredBlocks.PALM_LOG.get().defaultBlockState()), new StraightTrunkPlacer(8, 5, 0),BlockStateProvider.simple(RegionsUnexploredBlocks.PALM_LEAVES.get().defaultBlockState()), new FancyFoliagePlacer(ConstantInt.of(1), ConstantInt.of(0), 2), new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).ignoreVines().decorators(ImmutableList.of(PalmLeavesPlacer.INSTANCE)).dirt(BlockStateProvider.simple(Blocks.STONE)).build());
        register(context, ELEPHANT_EAR_AQUATIC, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.ELEPHANT_EAR.get().defaultBlockState()), 32));
    }

    private static RandomPatchConfiguration grassPatch(BlockStateProvider stateProvider, int i) {
        return FeatureUtils.simpleRandomPatchConfiguration(i, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(stateProvider)));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC config) {
        context.register(key, new ConfiguredFeature<>(feature, config));
    }
}
