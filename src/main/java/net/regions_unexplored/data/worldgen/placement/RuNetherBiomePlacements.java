package net.regions_unexplored.data.worldgen.placement;

import com.google.common.io.CountingOutputStream;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.regions_unexplored.block.RegionsUnexploredBlocks;
import net.regions_unexplored.data.worldgen.features.RuFeatures;
import net.regions_unexplored.data.worldgen.features.RuTreeFeatures;
import net.regions_unexplored.data.worldgen.features.RuVegetationFeatures;
import net.regions_unexplored.util.worldgen.RuPlacementUtils;

import java.util.List;

public class RuNetherBiomePlacements {

    public static final ResourceKey<PlacedFeature> MYCOTOXIC_UNDERGROWTH_GRASS = RuPlacementUtils.createKey("mycotoxic_undergrowth_grass");
    public static final ResourceKey<PlacedFeature> MYCOTOXIC_UNDERGROWTH_DAISY = RuPlacementUtils.createKey("mycotoxic_undergrowth_daisy");
    public static final ResourceKey<PlacedFeature> MYCOTOXIC_UNDERGROWTH_BIOSHROOM = RuPlacementUtils.createKey("mycotoxic_undergrowth_bioshroom");
    public static final ResourceKey<PlacedFeature> MYCOTOXIC_UNDERGROWTH_TALL_BIOSHROOM = RuPlacementUtils.createKey("mycotoxic_undergrowth_tall_bioshroom");
    public static final ResourceKey<PlacedFeature> MYCOTOXIC_UNDERGROWTH_SMALL_MUSHROOM = RuPlacementUtils.createKey("mycotoxic_undergrowth_small_mushroom");
    public static final ResourceKey<PlacedFeature> MYCOTOXIC_UNDERGROWTH_MEDIUM_MUSHROOM = RuPlacementUtils.createKey("mycotoxic_undergrowth_medium_mushroom");
    public static final ResourceKey<PlacedFeature> MYCOTOXIC_UNDERGROWTH_BIG_MUSHROOM = RuPlacementUtils.createKey("mycotoxic_undergrowth_big_mushroom");

    public static final ResourceKey<PlacedFeature> GLISTERING_MEADOW_ROCK = RuPlacementUtils.createKey("glistering_meadow_rock");
    public static final ResourceKey<PlacedFeature> GLISTERING_MEADOW_IVY = RuPlacementUtils.createKey("glistering_meadow_ivy");
    public static final ResourceKey<PlacedFeature> GLISTERING_MEADOW_GRASS = RuPlacementUtils.createKey("glistering_meadow_grass");
    public static final ResourceKey<PlacedFeature> GLISTERING_MEADOW_SPIRE = RuPlacementUtils.createKey("glistering_meadow_spire");
    public static final ResourceKey<PlacedFeature> GLISTERING_MEADOW_BULB = RuPlacementUtils.createKey("glistering_meadow_bulb");

    public static final ResourceKey<PlacedFeature> HANGING_EARLIGHT = RuPlacementUtils.createKey("hanging_earlight");
    public static final ResourceKey<PlacedFeature> COBALT_ROOTS = RuPlacementUtils.createKey("cobalt_roots");
    public static final ResourceKey<PlacedFeature> COBALT_EARLIGHT = RuPlacementUtils.createKey("cobalt_earlight");
    public static final ResourceKey<PlacedFeature> BLACKSTONE_CLUSTER = RuPlacementUtils.createKey("blackstone_cluster");
    public static final ResourceKey<PlacedFeature> OBSIDIAN_SPIRE = RuPlacementUtils.createKey("obsidian_spire");

    public static final ResourceKey<PlacedFeature> NETHER_WILLOW = RuPlacementUtils.createKey("nether_willow");

    public static final ResourceKey<PlacedFeature> SCULK_SPROUT = RuPlacementUtils.createKey("sculk_sprout");
    public static final ResourceKey<PlacedFeature> SCULK_TENDRIL = RuPlacementUtils.createKey("sculk_tendril");
    ///---------------------------------------------------------------------------------------------------------------------------------------------------------------\\\
    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> featureGetter = context.lookup(Registries.CONFIGURED_FEATURE);


        final Holder<ConfiguredFeature<?, ?>> MYCOTOXIC_UNDERGROWTH_GRASS = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_MYCOTOXIC_GRASS);
        final Holder<ConfiguredFeature<?, ?>> MYCOTOXIC_UNDERGROWTH_DAISY = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_MYCOTOXIC_DAISY);
        final Holder<ConfiguredFeature<?, ?>> MYCOTOXIC_UNDERGROWTH_BIOSHROOM = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_YELLOW_BIOSHROOM);
        final Holder<ConfiguredFeature<?, ?>> MYCOTOXIC_UNDERGROWTH_TALL_BIOSHROOM = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_TALL_YELLOW_BIOSHROOM);
        final Holder<ConfiguredFeature<?, ?>> MYCOTOXIC_UNDERGROWTH_SMALL_MUSHROOM = featureGetter.getOrThrow(RuTreeFeatures.SMALL_YELLOW_MUSHROOM);
        final Holder<ConfiguredFeature<?, ?>> MYCOTOXIC_UNDERGROWTH_MEDIUM_MUSHROOM = featureGetter.getOrThrow(RuTreeFeatures.MEDIUM_YELLOW_MUSHROOM);
        final Holder<ConfiguredFeature<?, ?>> MYCOTOXIC_UNDERGROWTH_BIG_MUSHROOM = featureGetter.getOrThrow(RuTreeFeatures.BIG_YELLOW_MUSHROOM);

        final Holder<ConfiguredFeature<?, ?>> GLISTERING_MEADOW_ROCK = featureGetter.getOrThrow(RuFeatures.NETHER_ROCK);
        final Holder<ConfiguredFeature<?, ?>> GLISTERING_MEADOW_IVY = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_GLISTERING_IVY);
        final Holder<ConfiguredFeature<?, ?>> GLISTERING_MEADOW_GRASS = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_GLISTERING_SPROUT);
        final Holder<ConfiguredFeature<?, ?>> GLISTERING_MEADOW_SPIRE = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_GLISTER_SPIRE);
        final Holder<ConfiguredFeature<?, ?>> GLISTERING_MEADOW_BULB = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_GLISTER_BULB);

        final Holder<ConfiguredFeature<?, ?>> HANGING_EARLIGHT = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_HANGING_EARLIGHT);
        final Holder<ConfiguredFeature<?, ?>> COBALT_ROOTS = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_COBALT_ROOTS);
        final Holder<ConfiguredFeature<?, ?>> BLACKSTONE_CLUSTER = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_BLACKSTONE_CLUSTER);
        final Holder<ConfiguredFeature<?, ?>> COBALT_EARLIGHT = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_COBALT_EARLIGHT);
        final Holder<ConfiguredFeature<?, ?>> OBSIDIAN_SPIRE = featureGetter.getOrThrow(RuFeatures.OBSIDIAN_SPIRE);

        final Holder<ConfiguredFeature<?, ?>> NETHER_WILLOW = featureGetter.getOrThrow(RuVegetationFeatures.NETHER_WILLOW);

        final Holder<ConfiguredFeature<?, ?>> SCULK_SPROUT = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_SCULK_SPROUT);
        final Holder<ConfiguredFeature<?, ?>> SCULK_TENDRIL = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_SCULK_TENDRIL);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        register(context, RuNetherBiomePlacements.MYCOTOXIC_UNDERGROWTH_GRASS, MYCOTOXIC_UNDERGROWTH_GRASS, List.of(CountOnEveryLayerPlacement.of(30), BiomeFilter.biome()));
        register(context, RuNetherBiomePlacements.MYCOTOXIC_UNDERGROWTH_DAISY, MYCOTOXIC_UNDERGROWTH_DAISY, List.of(CountOnEveryLayerPlacement.of(5), BiomeFilter.biome()));
        register(context, RuNetherBiomePlacements.MYCOTOXIC_UNDERGROWTH_BIOSHROOM, MYCOTOXIC_UNDERGROWTH_BIOSHROOM, List.of(CountOnEveryLayerPlacement.of(6), BiomeFilter.biome()));
        register(context, RuNetherBiomePlacements.MYCOTOXIC_UNDERGROWTH_TALL_BIOSHROOM, MYCOTOXIC_UNDERGROWTH_TALL_BIOSHROOM, List.of(CountOnEveryLayerPlacement.of(2), BiomeFilter.biome()));
        register(context, RuNetherBiomePlacements.MYCOTOXIC_UNDERGROWTH_SMALL_MUSHROOM, MYCOTOXIC_UNDERGROWTH_SMALL_MUSHROOM, CountOnEveryLayerPlacement.of(2), PlacementUtils.filteredByBlockSurvival(Blocks.CRIMSON_ROOTS), BiomeFilter.biome());
        register(context, RuNetherBiomePlacements.MYCOTOXIC_UNDERGROWTH_MEDIUM_MUSHROOM, MYCOTOXIC_UNDERGROWTH_MEDIUM_MUSHROOM, CountOnEveryLayerPlacement.of(2), PlacementUtils.filteredByBlockSurvival(Blocks.CRIMSON_ROOTS), BiomeFilter.biome());
        register(context, RuNetherBiomePlacements.MYCOTOXIC_UNDERGROWTH_BIG_MUSHROOM, MYCOTOXIC_UNDERGROWTH_BIG_MUSHROOM, CountOnEveryLayerPlacement.of(3), PlacementUtils.filteredByBlockSurvival(Blocks.CRIMSON_ROOTS), BiomeFilter.biome());

        register(context, RuNetherBiomePlacements.GLISTERING_MEADOW_ROCK, GLISTERING_MEADOW_ROCK, CountOnEveryLayerPlacement.of(1), InSquarePlacement.spread(), BiomeFilter.biome());
        register(context, RuNetherBiomePlacements.GLISTERING_MEADOW_IVY, GLISTERING_MEADOW_IVY, CountPlacement.of(155), InSquarePlacement.spread(), PlacementUtils.FULL_RANGE, BiomeFilter.biome());
        register(context, RuNetherBiomePlacements.GLISTERING_MEADOW_GRASS, GLISTERING_MEADOW_GRASS, List.of(CountOnEveryLayerPlacement.of(40), BiomeFilter.biome()));
        register(context, RuNetherBiomePlacements.GLISTERING_MEADOW_SPIRE, GLISTERING_MEADOW_SPIRE, List.of(CountOnEveryLayerPlacement.of(4), BiomeFilter.biome()));
        register(context, RuNetherBiomePlacements.GLISTERING_MEADOW_BULB, GLISTERING_MEADOW_BULB, List.of(CountOnEveryLayerPlacement.of(3), BiomeFilter.biome()));


        register(context, RuNetherBiomePlacements.HANGING_EARLIGHT, HANGING_EARLIGHT, CountPlacement.of(225), InSquarePlacement.spread(), PlacementUtils.FULL_RANGE, BiomeFilter.biome());
        register(context, RuNetherBiomePlacements.COBALT_ROOTS, COBALT_ROOTS, List.of(CountOnEveryLayerPlacement.of(8), BiomeFilter.biome()));
        register(context, RuNetherBiomePlacements.BLACKSTONE_CLUSTER, BLACKSTONE_CLUSTER, List.of(CountOnEveryLayerPlacement.of(4), PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.STONE_BUD.get()), BiomeFilter.biome()));
        register(context, RuNetherBiomePlacements.COBALT_EARLIGHT, COBALT_EARLIGHT, List.of(CountOnEveryLayerPlacement.of(4), BiomeFilter.biome()));
        register(context, RuNetherBiomePlacements.OBSIDIAN_SPIRE, OBSIDIAN_SPIRE, CountPlacement.of(155), InSquarePlacement.spread(), PlacementUtils.FULL_RANGE, BiomeFilter.biome());

        register(context, RuNetherBiomePlacements.NETHER_WILLOW, NETHER_WILLOW, CountOnEveryLayerPlacement.of(155), PlacementUtils.FULL_RANGE, BiomeFilter.biome());
        register(context, RuNetherBiomePlacements.SCULK_SPROUT, SCULK_SPROUT, List.of(CountOnEveryLayerPlacement.of(30), BiomeFilter.biome()));
        register(context, RuNetherBiomePlacements.SCULK_TENDRIL, SCULK_TENDRIL, List.of(CountOnEveryLayerPlacement.of(5), BiomeFilter.biome()));
    }

    protected static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> feature, PlacementModifier... placement) {
        register(context, key, feature, List.of(placement));
    }

    protected static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> feature, List<PlacementModifier> placement) {
        context.register(key, new PlacedFeature(feature, placement));
    }
}
