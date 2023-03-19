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
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.placement.*;
import net.regions_unexplored.block.RegionsUnexploredBlocks;
import net.regions_unexplored.data.worldgen.features.RuFeatureRegistry;
import net.regions_unexplored.data.worldgen.features.RuTreeFeatures;
import net.regions_unexplored.data.worldgen.features.RuVegetationFeatures;
import net.regions_unexplored.data.worldgen.features.feature.tree.config.TallSaplingConfiguration;
import net.regions_unexplored.util.worldgen.RuFeatureUtils;
import net.regions_unexplored.util.worldgen.RuPlacementUtils;

public class RuVegetationPlacements {
    //1.19.4 stuff
    public static final ResourceKey<PlacedFeature> WATER_CATTAIL = RuPlacementUtils.createKey("water_cattail");
    //TALL_SAPLINGS
    public static final ResourceKey<PlacedFeature> TALL_ACACIA_SAPLING = RuPlacementUtils.createKey("tall_acacia_sapling");
    public static final ResourceKey<PlacedFeature> TALL_BAOBAB_SAPLING = RuPlacementUtils.createKey("tall_baobab_sapling");
    public static final ResourceKey<PlacedFeature> TALL_BIRCH_SAPLING = RuPlacementUtils.createKey("tall_birch_sapling");
    public static final ResourceKey<PlacedFeature> TALL_BLACKWOOD_SAPLING = RuPlacementUtils.createKey("tall_blackwood_sapling");
    public static final ResourceKey<PlacedFeature> TALL_CHERRY_SAPLING = RuPlacementUtils.createKey("tall_cherry_sapling");
    public static final ResourceKey<PlacedFeature> TALL_RED_CHERRY_SAPLING = RuPlacementUtils.createKey("tall_red_cherry_sapling");
    public static final ResourceKey<PlacedFeature> TALL_PINK_CHERRY_SAPLING = RuPlacementUtils.createKey("tall_pink_cherry_sapling");
    public static final ResourceKey<PlacedFeature> TALL_WHITE_CHERRY_SAPLING = RuPlacementUtils.createKey("tall_white_cherry_sapling");
    public static final ResourceKey<PlacedFeature> TALL_CYPRESS_SAPLING = RuPlacementUtils.createKey("tall_cypress_sapling");
    public static final ResourceKey<PlacedFeature> TALL_DARK_OAK_SAPLING = RuPlacementUtils.createKey("tall_dark_oak_sapling");
    public static final ResourceKey<PlacedFeature> TALL_DEAD_SAPLING = RuPlacementUtils.createKey("tall_dead_sapling");
    public static final ResourceKey<PlacedFeature> TALL_DEAD_PINE_SAPLING = RuPlacementUtils.createKey("tall_dead_pine_sapling");
    public static final ResourceKey<PlacedFeature> TALL_EUCALYPTUS_SAPLING = RuPlacementUtils.createKey("tall_eucalyptus_sapling");
    public static final ResourceKey<PlacedFeature> TALL_FLOWERING_SAPLING = RuPlacementUtils.createKey("tall_flowering_sapling");
    public static final ResourceKey<PlacedFeature> TALL_JOSHUA_SAPLING = RuPlacementUtils.createKey("tall_joshua_sapling");
    public static final ResourceKey<PlacedFeature> TALL_JUNGLE_SAPLING = RuPlacementUtils.createKey("tall_jungle_sapling");
    public static final ResourceKey<PlacedFeature> TALL_LARCH_SAPLING = RuPlacementUtils.createKey("tall_larch_sapling");
    public static final ResourceKey<PlacedFeature> TALL_GOLDEN_LARCH_SAPLING = RuPlacementUtils.createKey("tall_golden_larch_sapling");
    public static final ResourceKey<PlacedFeature> TALL_MANGROVE_SAPLING = RuPlacementUtils.createKey("tall_mangrove_sapling");
    public static final ResourceKey<PlacedFeature> TALL_MAPLE_SAPLING = RuPlacementUtils.createKey("tall_maple_sapling");
    public static final ResourceKey<PlacedFeature> TALL_RED_MAPLE_SAPLING = RuPlacementUtils.createKey("tall_red_maple_sapling");
    public static final ResourceKey<PlacedFeature> TALL_ORANGE_MAPLE_SAPLING = RuPlacementUtils.createKey("tall_orange_maple_sapling");
    public static final ResourceKey<PlacedFeature> TALL_MAUVE_SAPLING = RuPlacementUtils.createKey("tall_mauve_sapling");
    public static final ResourceKey<PlacedFeature> TALL_OAK_SAPLING = RuPlacementUtils.createKey("tall_oak_sapling");
    public static final ResourceKey<PlacedFeature> TALL_PALM_SAPLING = RuPlacementUtils.createKey("tall_palm_sapling");
    public static final ResourceKey<PlacedFeature> TALL_PINE_SAPLING = RuPlacementUtils.createKey("tall_pine_sapling");
    public static final ResourceKey<PlacedFeature> TALL_REDWOOD_SAPLING = RuPlacementUtils.createKey("tall_redwood_sapling");
    public static final ResourceKey<PlacedFeature> TALL_SILVER_BIRCH_SAPLING = RuPlacementUtils.createKey("tall_silver_birch_sapling");
    public static final ResourceKey<PlacedFeature> TALL_SPRUCE_SAPLING = RuPlacementUtils.createKey("tall_spruce_sapling");
    public static final ResourceKey<PlacedFeature> TALL_WILLOW_SAPLING = RuPlacementUtils.createKey("tall_willow_sapling");
    //mixes
    public static final ResourceKey<PlacedFeature> TALL_AUTUMNAL_SAPLING_MIX = RuPlacementUtils.createKey("tall_autumnal_sapling_mix");
    public static final ResourceKey<PlacedFeature> TALL_BIRCH_SAPLING_MIX = RuPlacementUtils.createKey("tall_birch_sapling_mix");
    public static final ResourceKey<PlacedFeature> TALL_BLACKWOOD_DARK_OAK_SAPLING_MIX = RuPlacementUtils.createKey("tall_blackwood_dark_oak_sapling_mix");
    public static final ResourceKey<PlacedFeature> TALL_CHERRY_SAPLING_MIX = RuPlacementUtils.createKey("tall_cherry_sapling_mix");
    public static final ResourceKey<PlacedFeature> TALL_DEAD_SAPLING_MIX = RuPlacementUtils.createKey("tall_dead_sapling_mix");
    public static final ResourceKey<PlacedFeature> TALL_LARCH_SAPLING_MIX = RuPlacementUtils.createKey("tall_larch_sapling_mix");
    public static final ResourceKey<PlacedFeature> TALL_GOLDEN_LARCH_SAPLING_MIX = RuPlacementUtils.createKey("tall_golden_larch_sapling_mix");
    public static final ResourceKey<PlacedFeature> TALL_MAPLE_SAPLING_MIX = RuPlacementUtils.createKey("tall_maple_sapling_mix");
    public static final ResourceKey<PlacedFeature> TALL_PALM_MANGROVE_SAPLING_MIX = RuPlacementUtils.createKey("tall_palm_mangrove_sapling_mix");
    public static final ResourceKey<PlacedFeature> TALL_PINE_SPRUCE_SAPLING_MIX = RuPlacementUtils.createKey("tall_pine_spruce_sapling_mix");
    public static final ResourceKey<PlacedFeature> TALL_PINE_DEAD_SAPLING_MIX = RuPlacementUtils.createKey("tall_pine_dead_sapling_mix");
    public static final ResourceKey<PlacedFeature> TALL_WILLOW_CYPRESS_SAPLING_MIX = RuPlacementUtils.createKey("tall_willow_cypress_sapling_mix");
    
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
        //1.19.4 stuff
        final Holder<ConfiguredFeature<?, ?>> WATER_CATTAIL = featureGetter.getOrThrow(RuVegetationFeatures.WATER_CATTAIL);
        //TALL_SAPLINGS
        final Holder<ConfiguredFeature<?, ?>> TALL_ACACIA_SAPLING = featureGetter.getOrThrow(RuVegetationFeatures.TALL_ACACIA_SAPLING);
        final Holder<ConfiguredFeature<?, ?>> TALL_BAOBAB_SAPLING = featureGetter.getOrThrow(RuVegetationFeatures.TALL_BAOBAB_SAPLING);
        final Holder<ConfiguredFeature<?, ?>> TALL_BIRCH_SAPLING =  featureGetter.getOrThrow(RuVegetationFeatures.TALL_BIRCH_SAPLING);
        final Holder<ConfiguredFeature<?, ?>> TALL_BLACKWOOD_SAPLING = featureGetter.getOrThrow(RuVegetationFeatures.TALL_BLACKWOOD_SAPLING);
        final Holder<ConfiguredFeature<?, ?>> TALL_CHERRY_SAPLING = featureGetter.getOrThrow(RuVegetationFeatures.TALL_CHERRY_SAPLING);
        final Holder<ConfiguredFeature<?, ?>> TALL_RED_CHERRY_SAPLING = featureGetter.getOrThrow(RuVegetationFeatures.TALL_RED_CHERRY_SAPLING);
        final Holder<ConfiguredFeature<?, ?>> TALL_PINK_CHERRY_SAPLING = featureGetter.getOrThrow(RuVegetationFeatures.TALL_PINK_CHERRY_SAPLING);
        final Holder<ConfiguredFeature<?, ?>> TALL_WHITE_CHERRY_SAPLING = featureGetter.getOrThrow(RuVegetationFeatures.TALL_WHITE_CHERRY_SAPLING);
        final Holder<ConfiguredFeature<?, ?>> TALL_CYPRESS_SAPLING = featureGetter.getOrThrow(RuVegetationFeatures.TALL_CYPRESS_SAPLING);
        final Holder<ConfiguredFeature<?, ?>> TALL_DARK_OAK_SAPLING = featureGetter.getOrThrow(RuVegetationFeatures.TALL_DARK_OAK_SAPLING);
        final Holder<ConfiguredFeature<?, ?>> TALL_DEAD_SAPLING = featureGetter.getOrThrow(RuVegetationFeatures.TALL_DEAD_SAPLING);
        final Holder<ConfiguredFeature<?, ?>> TALL_DEAD_PINE_SAPLING = featureGetter.getOrThrow(RuVegetationFeatures.TALL_DEAD_PINE_SAPLING);
        final Holder<ConfiguredFeature<?, ?>> TALL_EUCALYPTUS_SAPLING = featureGetter.getOrThrow(RuVegetationFeatures.TALL_EUCALYPTUS_SAPLING);
        final Holder<ConfiguredFeature<?, ?>> TALL_FLOWERING_SAPLING = featureGetter.getOrThrow(RuVegetationFeatures.TALL_FLOWERING_SAPLING);
        final Holder<ConfiguredFeature<?, ?>> TALL_JOSHUA_SAPLING = featureGetter.getOrThrow(RuVegetationFeatures.TALL_JOSHUA_SAPLING);
        final Holder<ConfiguredFeature<?, ?>> TALL_JUNGLE_SAPLING = featureGetter.getOrThrow(RuVegetationFeatures.TALL_JUNGLE_SAPLING);
        final Holder<ConfiguredFeature<?, ?>> TALL_LARCH_SAPLING = featureGetter.getOrThrow(RuVegetationFeatures.TALL_LARCH_SAPLING);
        final Holder<ConfiguredFeature<?, ?>> TALL_GOLDEN_LARCH_SAPLING = featureGetter.getOrThrow(RuVegetationFeatures.TALL_GOLDEN_LARCH_SAPLING);
        final Holder<ConfiguredFeature<?, ?>> TALL_MANGROVE_SAPLING = featureGetter.getOrThrow(RuVegetationFeatures.TALL_MANGROVE_SAPLING);
        final Holder<ConfiguredFeature<?, ?>> TALL_MAPLE_SAPLING = featureGetter.getOrThrow(RuVegetationFeatures.TALL_MAPLE_SAPLING);
        final Holder<ConfiguredFeature<?, ?>> TALL_RED_MAPLE_SAPLING = featureGetter.getOrThrow(RuVegetationFeatures.TALL_RED_MAPLE_SAPLING);
        final Holder<ConfiguredFeature<?, ?>> TALL_ORANGE_MAPLE_SAPLING = featureGetter.getOrThrow(RuVegetationFeatures.TALL_ORANGE_MAPLE_SAPLING);
        final Holder<ConfiguredFeature<?, ?>> TALL_MAUVE_SAPLING = featureGetter.getOrThrow(RuVegetationFeatures.TALL_MAUVE_SAPLING);
        final Holder<ConfiguredFeature<?, ?>> TALL_OAK_SAPLING = featureGetter.getOrThrow(RuVegetationFeatures.TALL_OAK_SAPLING);
        final Holder<ConfiguredFeature<?, ?>> TALL_PALM_SAPLING = featureGetter.getOrThrow(RuVegetationFeatures.TALL_PALM_SAPLING);
        final Holder<ConfiguredFeature<?, ?>> TALL_PINE_SAPLING = featureGetter.getOrThrow(RuVegetationFeatures.TALL_PINE_SAPLING);
        final Holder<ConfiguredFeature<?, ?>> TALL_REDWOOD_SAPLING = featureGetter.getOrThrow(RuVegetationFeatures.TALL_REDWOOD_SAPLING);
        final Holder<ConfiguredFeature<?, ?>> TALL_SILVER_BIRCH_SAPLING = featureGetter.getOrThrow(RuVegetationFeatures.TALL_SILVER_BIRCH_SAPLING);
        final Holder<ConfiguredFeature<?, ?>> TALL_SPRUCE_SAPLING = featureGetter.getOrThrow(RuVegetationFeatures.TALL_SPRUCE_SAPLING);
        final Holder<ConfiguredFeature<?, ?>> TALL_WILLOW_SAPLING = featureGetter.getOrThrow(RuVegetationFeatures.TALL_WILLOW_SAPLING);
        //mixes
        final Holder<ConfiguredFeature<?, ?>> TALL_AUTUMNAL_SAPLING_MIX = featureGetter.getOrThrow(RuVegetationFeatures.TALL_AUTUMNAL_SAPLING_MIX);
        final Holder<ConfiguredFeature<?, ?>> TALL_BIRCH_SAPLING_MIX = featureGetter.getOrThrow(RuVegetationFeatures.TALL_BIRCH_SAPLING_MIX);
        final Holder<ConfiguredFeature<?, ?>> TALL_BLACKWOOD_DARK_OAK_SAPLING_MIX = featureGetter.getOrThrow(RuVegetationFeatures.TALL_BLACKWOOD_DARK_OAK_SAPLING_MIX);
        final Holder<ConfiguredFeature<?, ?>> TALL_CHERRY_SAPLING_MIX = featureGetter.getOrThrow(RuVegetationFeatures.TALL_CHERRY_SAPLING_MIX);
        final Holder<ConfiguredFeature<?, ?>> TALL_DEAD_SAPLING_MIX = featureGetter.getOrThrow(RuVegetationFeatures.TALL_DEAD_SAPLING_MIX);
        final Holder<ConfiguredFeature<?, ?>> TALL_LARCH_SAPLING_MIX = featureGetter.getOrThrow(RuVegetationFeatures.TALL_LARCH_SAPLING_MIX);
        final Holder<ConfiguredFeature<?, ?>> TALL_GOLDEN_LARCH_SAPLING_MIX = featureGetter.getOrThrow(RuVegetationFeatures.TALL_GOLDEN_LARCH_SAPLING_MIX);
        final Holder<ConfiguredFeature<?, ?>> TALL_MAPLE_SAPLING_MIX = featureGetter.getOrThrow(RuVegetationFeatures.TALL_MAPLE_SAPLING_MIX);
        final Holder<ConfiguredFeature<?, ?>> TALL_PALM_MANGROVE_SAPLING_MIX = featureGetter.getOrThrow(RuVegetationFeatures.TALL_PALM_MANGROVE_SAPLING_MIX);
        final Holder<ConfiguredFeature<?, ?>> TALL_PINE_SPRUCE_SAPLING_MIX = featureGetter.getOrThrow(RuVegetationFeatures.TALL_PINE_SPRUCE_SAPLING_MIX);
        final Holder<ConfiguredFeature<?, ?>> TALL_PINE_DEAD_SAPLING_MIX = featureGetter.getOrThrow(RuVegetationFeatures.TALL_PINE_SPRUCE_SAPLING_MIX);
        final Holder<ConfiguredFeature<?, ?>> TALL_WILLOW_CYPRESS_SAPLING_MIX = featureGetter.getOrThrow(RuVegetationFeatures.TALL_WILLOW_CYPRESS_SAPLING_MIX);

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

        //1.19.4 stuff
        register(context, RuVegetationPlacements.WATER_CATTAIL, WATER_CATTAIL, CountPlacement.of(10), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BiomeFilter.biome());
        //TALL_SAPLINGS
        register(context, RuVegetationPlacements.TALL_ACACIA_SAPLING, TALL_ACACIA_SAPLING, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.TALL_BAOBAB_SAPLING, TALL_BAOBAB_SAPLING, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.TALL_BIRCH_SAPLING, TALL_BIRCH_SAPLING, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.TALL_BLACKWOOD_SAPLING, TALL_BLACKWOOD_SAPLING, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.TALL_CHERRY_SAPLING, TALL_CHERRY_SAPLING, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.TALL_RED_CHERRY_SAPLING, TALL_RED_CHERRY_SAPLING, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.TALL_PINK_CHERRY_SAPLING, TALL_PINK_CHERRY_SAPLING, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.TALL_WHITE_CHERRY_SAPLING, TALL_WHITE_CHERRY_SAPLING, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.TALL_CYPRESS_SAPLING, TALL_CYPRESS_SAPLING, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.TALL_DARK_OAK_SAPLING, TALL_DARK_OAK_SAPLING, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.TALL_DEAD_SAPLING, TALL_DEAD_SAPLING, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.TALL_DEAD_PINE_SAPLING, TALL_DEAD_PINE_SAPLING, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.TALL_EUCALYPTUS_SAPLING, TALL_EUCALYPTUS_SAPLING, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.TALL_FLOWERING_SAPLING, TALL_FLOWERING_SAPLING, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.TALL_JOSHUA_SAPLING, TALL_JOSHUA_SAPLING, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.TALL_JUNGLE_SAPLING, TALL_JUNGLE_SAPLING, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.TALL_LARCH_SAPLING, TALL_LARCH_SAPLING, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.TALL_GOLDEN_LARCH_SAPLING, TALL_GOLDEN_LARCH_SAPLING, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.TALL_MANGROVE_SAPLING, TALL_MANGROVE_SAPLING, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.TALL_MAPLE_SAPLING, TALL_MAPLE_SAPLING, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.TALL_RED_MAPLE_SAPLING, TALL_RED_MAPLE_SAPLING, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.TALL_ORANGE_MAPLE_SAPLING, TALL_ORANGE_MAPLE_SAPLING, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.TALL_MAUVE_SAPLING, TALL_MAUVE_SAPLING, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.TALL_OAK_SAPLING, TALL_OAK_SAPLING, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.TALL_PALM_SAPLING, TALL_PALM_SAPLING, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.TALL_PINE_SAPLING, TALL_PINE_SAPLING, CountPlacement.of(2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.TALL_REDWOOD_SAPLING, TALL_REDWOOD_SAPLING, CountPlacement.of(2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.TALL_SILVER_BIRCH_SAPLING, TALL_SILVER_BIRCH_SAPLING, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.TALL_SPRUCE_SAPLING, TALL_SPRUCE_SAPLING, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.TALL_WILLOW_SAPLING, TALL_WILLOW_SAPLING, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        //mixes
        register(context, RuVegetationPlacements.TALL_AUTUMNAL_SAPLING_MIX, TALL_AUTUMNAL_SAPLING_MIX, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.TALL_BIRCH_SAPLING_MIX, TALL_BIRCH_SAPLING_MIX, CountPlacement.of(2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.TALL_BLACKWOOD_DARK_OAK_SAPLING_MIX, TALL_BLACKWOOD_DARK_OAK_SAPLING_MIX, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.TALL_CHERRY_SAPLING_MIX, TALL_CHERRY_SAPLING_MIX, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.TALL_DEAD_SAPLING_MIX, TALL_DEAD_SAPLING_MIX, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.TALL_LARCH_SAPLING_MIX, TALL_LARCH_SAPLING_MIX, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.TALL_GOLDEN_LARCH_SAPLING_MIX, TALL_GOLDEN_LARCH_SAPLING_MIX, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.TALL_MAPLE_SAPLING_MIX, TALL_MAPLE_SAPLING_MIX, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.TALL_PALM_MANGROVE_SAPLING_MIX, TALL_PALM_MANGROVE_SAPLING_MIX, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.TALL_PINE_SPRUCE_SAPLING_MIX, TALL_PINE_SPRUCE_SAPLING_MIX, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.TALL_PINE_DEAD_SAPLING_MIX, TALL_PINE_DEAD_SAPLING_MIX, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());
        register(context, RuVegetationPlacements.TALL_WILLOW_CYPRESS_SAPLING_MIX, TALL_WILLOW_CYPRESS_SAPLING_MIX, CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome());

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
        register(context, RuVegetationPlacements.CATTAIL_RIVER, CATTAIL_RIVER, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 32), SurfaceWaterDepthFilter.forMaxDepth(3), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, RuVegetationFeatures.WATERSIDE, BiomeFilter.biome()));
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