package net.regions_unexplored.data.worldgen.features;

import java.util.List;

import net.minecraft.core.*;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.util.valueproviders.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.MultifaceBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.placement.*;
import net.regions_unexplored.block.RegionsUnexploredBlocks;
import net.regions_unexplored.data.worldgen.features.feature.bioshroom.GiantBioshroomConfiguration;
import net.regions_unexplored.data.worldgen.features.feature.tree.config.SmallBushConfiguration;
import net.regions_unexplored.data.worldgen.features.feature.tree.config.TallSaplingConfiguration;
import net.regions_unexplored.util.worldgen.RuFeatureUtils;
import net.regions_unexplored.world.level.block.grass.AshenTallGrassBlock;

public class RuVegetationFeatures {
    public static final PlacementModifier WATERSIDE = HeightRangePlacement.uniform(VerticalAnchor.absolute(59), VerticalAnchor.absolute(60));
    public static final PlacementModifier MARSH = HeightRangePlacement.uniform(VerticalAnchor.absolute(59), VerticalAnchor.absolute(59));
    //1.19.4 Features
    public static final ResourceKey<ConfiguredFeature<?, ?>> GIANT_BLUE_BIOSHROOM = RuFeatureUtils.createKey("giant_blue_bioshroom");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GIANT_GREEN_BIOSHROOM = RuFeatureUtils.createKey("giant_green_bioshroom");


    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_CHERRY_FLOWERS = RuFeatureUtils.createKey("red_cherry_flowers");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_CHERRY_FLOWERS = RuFeatureUtils.createKey("pink_cherry_flowers");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_CHERRY_FLOWERS = RuFeatureUtils.createKey("white_cherry_flowers");
    //TALL_SAPLINGS
    public static final ResourceKey<ConfiguredFeature<?, ?>> ASHEN_SHRUB = RuFeatureUtils.createKey("ashen_shrub");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_ACACIA_SAPLING = RuFeatureUtils.createKey("tall_acacia_sapling");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_BAOBAB_SAPLING = RuFeatureUtils.createKey("tall_baobab_sapling");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_BIRCH_SAPLING = RuFeatureUtils.createKey("tall_birch_sapling");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_BLACKWOOD_SAPLING = RuFeatureUtils.createKey("tall_blackwood_sapling");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_CHERRY_SAPLING = RuFeatureUtils.createKey("tall_cherry_sapling");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_RED_CHERRY_SAPLING = RuFeatureUtils.createKey("tall_red_cherry_sapling");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_PINK_CHERRY_SAPLING = RuFeatureUtils.createKey("tall_pink_cherry_sapling");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_WHITE_CHERRY_SAPLING = RuFeatureUtils.createKey("tall_white_cherry_sapling");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_CYPRESS_SAPLING = RuFeatureUtils.createKey("tall_cypress_sapling");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_DARK_OAK_SAPLING = RuFeatureUtils.createKey("tall_dark_oak_sapling");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_DEAD_SAPLING = RuFeatureUtils.createKey("tall_dead_sapling");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_DEAD_PINE_SAPLING = RuFeatureUtils.createKey("tall_dead_pine_sapling");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_EUCALYPTUS_SAPLING = RuFeatureUtils.createKey("tall_eucalyptus_sapling");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_FLOWERING_SAPLING = RuFeatureUtils.createKey("tall_flowering_sapling");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_JOSHUA_SAPLING = RuFeatureUtils.createKey("tall_joshua_sapling");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_JUNGLE_SAPLING = RuFeatureUtils.createKey("tall_jungle_sapling");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_LARCH_SAPLING = RuFeatureUtils.createKey("tall_larch_sapling");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_GOLDEN_LARCH_SAPLING = RuFeatureUtils.createKey("tall_golden_larch_sapling");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_MANGROVE_SAPLING = RuFeatureUtils.createKey("tall_mangrove_sapling");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_MAPLE_SAPLING = RuFeatureUtils.createKey("tall_maple_sapling");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_RED_MAPLE_SAPLING = RuFeatureUtils.createKey("tall_red_maple_sapling");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_ORANGE_MAPLE_SAPLING = RuFeatureUtils.createKey("tall_orange_maple_sapling");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_MAUVE_SAPLING = RuFeatureUtils.createKey("tall_mauve_sapling");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_OAK_SAPLING = RuFeatureUtils.createKey("tall_oak_sapling");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_PALM_SAPLING = RuFeatureUtils.createKey("tall_palm_sapling");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_PINE_SAPLING = RuFeatureUtils.createKey("tall_pine_sapling");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_REDWOOD_SAPLING = RuFeatureUtils.createKey("tall_redwood_sapling");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_SILVER_BIRCH_SAPLING = RuFeatureUtils.createKey("tall_silver_birch_sapling");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_SPRUCE_SAPLING = RuFeatureUtils.createKey("tall_spruce_sapling");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_WILLOW_SAPLING = RuFeatureUtils.createKey("tall_willow_sapling");
    //mixes
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_AUTUMNAL_SAPLING_MIX = RuFeatureUtils.createKey("tall_autumnal_sapling_mix");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_BIRCH_SAPLING_MIX = RuFeatureUtils.createKey("tall_birch_sapling_mix");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_BLACKWOOD_DARK_OAK_SAPLING_MIX = RuFeatureUtils.createKey("tall_blackwood_dark_oak_sapling_mix");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_CHERRY_SAPLING_MIX = RuFeatureUtils.createKey("tall_cherry_sapling_mix");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_DEAD_SAPLING_MIX = RuFeatureUtils.createKey("tall_dead_sapling_mix");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_LARCH_SAPLING_MIX = RuFeatureUtils.createKey("tall_larch_sapling_mix");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_GOLDEN_LARCH_SAPLING_MIX = RuFeatureUtils.createKey("tall_golden_larch_sapling_mix");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_MAPLE_SAPLING_MIX = RuFeatureUtils.createKey("tall_maple_sapling_mix");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_PALM_MANGROVE_SAPLING_MIX = RuFeatureUtils.createKey("tall_palm_mangrove_sapling_mix");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_PINE_SPRUCE_SAPLING_MIX = RuFeatureUtils.createKey("tall_pine_spruce_sapling_mix");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_PINE_DEAD_SAPLING_MIX = RuFeatureUtils.createKey("tall_pine_dead_sapling_mix");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_WILLOW_CYPRESS_SAPLING_MIX = RuFeatureUtils.createKey("tall_willow_cypress_sapling_mix");

    ///RESOURCE_KEYS///
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_SEAGRASS = RuFeatureUtils.createKey("patch_seagrass");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_LILY_PAD = RuFeatureUtils.createKey("patch_lily_pad");

    public static final ResourceKey<ConfiguredFeature<?, ?>> GIANT_PINK_BIOSHROOM = RuFeatureUtils.createKey("giant_pink_bioshroom");

    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_BARLEY = RuFeatureUtils.createKey("patch_barley");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_MEDIUM_GRASS = RuFeatureUtils.createKey("patch_medium_grass");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_STEPPE_GRASS = RuFeatureUtils.createKey("patch_steppe_grass");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_STEPPE_SHRUB = RuFeatureUtils.createKey("patch_steppe_shrub");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_TALL_STEPPE_GRASS = RuFeatureUtils.createKey("patch_tall_steppe_grass");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_DEAD_STEPPE_SHRUB = RuFeatureUtils.createKey("patch_dead_steppe_shrub");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_SMALL_DESERT_SHRUB = RuFeatureUtils.createKey("patch_small_desert_shrub");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_SEEDED_GRASS = RuFeatureUtils.createKey("patch_seeded_grass");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_SEEDED_TALL_GRASS = RuFeatureUtils.createKey("patch_seeded_tall_grass");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_SANDY_GRASS = RuFeatureUtils.createKey("patch_sandy_grass");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_BARREL_CACTUS = RuFeatureUtils.createKey("patch_barrel_cactus");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_SANDY_TALL_GRASS = RuFeatureUtils.createKey("patch_sandy_tall_grass");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_FOREST_FERN = RuFeatureUtils.createKey("patch_forest_ferns");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_TALL_FOREST_FERN = RuFeatureUtils.createKey("patch_tall_forest_ferns");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_FOREST_FERN_MIX = RuFeatureUtils.createKey("patch_forest_fern_mix");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_ELEPHANT_EAR = RuFeatureUtils.createKey("patch_elephant_ear");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_SNOWY_GRASS = RuFeatureUtils.createKey("patch_snowy_grass");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_STONE_BUD = RuFeatureUtils.createKey("patch_stone_bud");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_REDSTONE_BUD = RuFeatureUtils.createKey("patch_redstone_bud");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_REDSTONE_BULB = RuFeatureUtils.createKey("patch_redstone_bulb");
    public static final ResourceKey<ConfiguredFeature<?, ?>> UNDERGROUND_GRASS = RuFeatureUtils.createKey("underground_grass");
    //FLOWERS
    public static final ResourceKey<ConfiguredFeature<?, ?>> ALPHA_DANDELION = RuFeatureUtils.createKey("alpha_dandelion");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ALPHA_ROSE = RuFeatureUtils.createKey("alpha_rose");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RU_FLOWER_DEFAULT = RuFeatureUtils.createKey("ru_flower_default");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RU_FLOWER_PINK = RuFeatureUtils.createKey("ru_pink_flower");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RU_LILAC = RuFeatureUtils.createKey("ru_lilac");

    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_YELLOW_LUPINE_FIELD = RuFeatureUtils.createKey("patch_yellow_lupine_field");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_RED_LUPINE_FIELD = RuFeatureUtils.createKey("patch_red_lupine_field");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_BLUE_LUPINE_FIELD = RuFeatureUtils.createKey("patch_blue_lupine_field");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_PINK_LUPINE_FIELD = RuFeatureUtils.createKey("patch_pink_lupine_field");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_PURPLE_LUPINE_FIELD = RuFeatureUtils.createKey("patch_purple_lupine_field");

    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_PRISMOSS_SPROUT = RuFeatureUtils.createKey("patch_prismoss_sprout");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_PRISMARITE = RuFeatureUtils.createKey("patch_prismarite");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_YELLOW_LUPINE = RuFeatureUtils.createKey("patch_yellow_lupine");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_RED_LUPINE = RuFeatureUtils.createKey("patch_red_lupine");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_BLUE_LUPINE = RuFeatureUtils.createKey("patch_blue_lupine");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_PINK_LUPINE = RuFeatureUtils.createKey("patch_pink_lupine");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_PURPLE_LUPINE = RuFeatureUtils.createKey("patch_purple_lupine");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_YELLOW_BIOSHROOM = RuFeatureUtils.createKey("patch_yellow_bioshroom");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_PINK_BIOSHROOM = RuFeatureUtils.createKey("patch_pink_bioshroom");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_POPPY_BUSH = RuFeatureUtils.createKey("patch_poppy_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_CAVE_HYSSOP = RuFeatureUtils.createKey("patch_cave_hyssop");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_HYSSOP = RuFeatureUtils.createKey("patch_hyssop");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_WARATAH = RuFeatureUtils.createKey("patch_waratah");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_WHITE_TRILLIUM = RuFeatureUtils.createKey("patch_white_trillium");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_WILTING_TRILLIUM = RuFeatureUtils.createKey("patch_wilting_trillium");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_DORCEL = RuFeatureUtils.createKey("patch_dorcel");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_TSUBAKI = RuFeatureUtils.createKey("patch_tsubaki");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_FIREWEED = RuFeatureUtils.createKey("patch_fireweed");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_DAISY = RuFeatureUtils.createKey("patch_daisy");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_FELICIA = RuFeatureUtils.createKey("patch_felicia");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_TASSEL = RuFeatureUtils.createKey("patch_tassel");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_TASSEL_DENSE = RuFeatureUtils.createKey("patch_tassel_dense");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_POPPY = RuFeatureUtils.createKey("patch_poppy");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_BLUE_ORCHID = RuFeatureUtils.createKey("patch_blue_orchid");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_ALLIUM = RuFeatureUtils.createKey("patch_allium");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_RED_TULIP = RuFeatureUtils.createKey("patch_red_tulip");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_ORANGE_TULIP = RuFeatureUtils.createKey("patch_orange_tulip");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_PINK_TULIP = RuFeatureUtils.createKey("patch_pink_tulip");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_WHITE_TULIP = RuFeatureUtils.createKey("patch_white_tulip");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_OXEYE = RuFeatureUtils.createKey("patch_oxeye");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_CORNFLOWER = RuFeatureUtils.createKey("patch_cornflower");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_LILLY = RuFeatureUtils.createKey("patch_lilly");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_SUNFLOWER = RuFeatureUtils.createKey("patch_sunflower");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_GREEN_BIOSHROOM = RuFeatureUtils.createKey("patch_green_bioshroom");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_BLUE_BIOSHROOM = RuFeatureUtils.createKey("patch_blue_bioshroom");
    //OTHER
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_CATTAIL = RuFeatureUtils.createKey("cattails");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DUCKWEED = RuFeatureUtils.createKey("duckweed");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FOREST_FERN_MIX = RuFeatureUtils.createKey("forest_fern_mix");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SEEDED_GRASS_MIX = RuFeatureUtils.createKey("seeded_grass_mix");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DAISY_MIX = RuFeatureUtils.createKey("daisy_mix");


    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_MYCOTOXIC_GRASS = RuFeatureUtils.createKey("patch_mycotoxic_grass");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_MYCOTOXIC_DAISY = RuFeatureUtils.createKey("patch_mycotoxic_daisy");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_TALL_YELLOW_BIOSHROOM = RuFeatureUtils.createKey("patch_tall_yellow_bioshroom");

    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_GLISTERING_IVY = RuFeatureUtils.createKey("patch_glistering_ivy");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_GLISTERING_SPROUT = RuFeatureUtils.createKey("patch_glistering_sprout");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_GLISTER_SPIRE = RuFeatureUtils.createKey("patch_glister_spire");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_GLISTER_BULB = RuFeatureUtils.createKey("patch_glister_bulb");

    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_HANGING_EARLIGHT = RuFeatureUtils.createKey("patch_hanging_earlight");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_COBALT_EARLIGHT = RuFeatureUtils.createKey("patch_cobalt_earlight");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_BLACKSTONE_CLUSTER = RuFeatureUtils.createKey("patch_blackstone_cluster");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_COBALT_ROOTS = RuFeatureUtils.createKey("patch_cobalt_roots");

    public static final ResourceKey<ConfiguredFeature<?, ?>> MYCOTOXIC_NYLIUM_BONEMEAL = RuFeatureUtils.createKey("mycotoxic_nylium_bonemeal");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GLISTERING_NYLIUM_BONEMEAL = RuFeatureUtils.createKey("glistering_nylium_bonemeal");
    public static final ResourceKey<ConfiguredFeature<?, ?>> COBALT_NYLIUM_BONEMEAL = RuFeatureUtils.createKey("cobalt_nylium_bonemeal");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERGROWN_VINE = RuFeatureUtils.createKey("overgrown_vine");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_WILLOW = RuFeatureUtils.createKey("nether_willow");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BRIM_WILLOW = RuFeatureUtils.createKey("brim_willow");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_BRIM_WILLOW = RuFeatureUtils.createKey("tall_brim_willow");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_BRIMSPROUT = RuFeatureUtils.createKey("patch_brimsprout");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_BRIM_FLAMES = RuFeatureUtils.createKey("patch_brim_flames");

    public static final ResourceKey<ConfiguredFeature<?, ?>> ASHEN_GRASS = RuFeatureUtils.createKey("ashen_grass");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ASHEN_BUSH = RuFeatureUtils.createKey("ashen_bush");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        WeightedStateProvider leaveProvider = new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.AZALEA_LEAVES.defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 4).add(Blocks.FLOWERING_AZALEA_LEAVES.defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 1));
        //1.19.4 Features
        register(context, GIANT_BLUE_BIOSHROOM, RegionsUnexploredFeatures.GIANT_BLUE_BIOSHROOM.get(), new GiantBioshroomConfiguration(BlockStateProvider.simple(Blocks.MUSHROOM_STEM.defaultBlockState()), BlockStateProvider.simple(RegionsUnexploredBlocks.BLUE_BIOSHROOM_BLOCK.get().defaultBlockState()), BlockStateProvider.simple(RegionsUnexploredBlocks.GLOWING_BLUE_BIOSHROOM_BLOCK.get().defaultBlockState()), 7, 7));
        register(context, GIANT_GREEN_BIOSHROOM, RegionsUnexploredFeatures.GIANT_GREEN_BIOSHROOM.get(), new GiantBioshroomConfiguration(BlockStateProvider.simple(Blocks.MUSHROOM_STEM.defaultBlockState()), BlockStateProvider.simple(RegionsUnexploredBlocks.GREEN_BIOSHROOM_BLOCK.get().defaultBlockState()), BlockStateProvider.simple(RegionsUnexploredBlocks.GLOWING_GREEN_BIOSHROOM_BLOCK.get().defaultBlockState()), 8, 5));


        register(context, RED_CHERRY_FLOWERS, RegionsUnexploredFeatures.AIR_MULTIFACE_GROWTH.get(), new MultifaceGrowthConfiguration((MultifaceBlock)RegionsUnexploredBlocks.RED_CHERRY_FLOWERS.get(), 20, true, false, false, 1.0F, HolderSet.direct(Block::builtInRegistryHolder, Blocks.GRASS_BLOCK, RegionsUnexploredBlocks.FOREST_GRASS_BLOCK.get(), RegionsUnexploredBlocks.PLAINS_GRASS_BLOCK.get())));
        register(context, PINK_CHERRY_FLOWERS, RegionsUnexploredFeatures.AIR_MULTIFACE_GROWTH.get(), new MultifaceGrowthConfiguration((MultifaceBlock)RegionsUnexploredBlocks.PINK_CHERRY_FLOWERS.get(), 20, true, false, false, 1.0F, HolderSet.direct(Block::builtInRegistryHolder, Blocks.GRASS_BLOCK, RegionsUnexploredBlocks.FOREST_GRASS_BLOCK.get(), RegionsUnexploredBlocks.PLAINS_GRASS_BLOCK.get())));
        register(context, WHITE_CHERRY_FLOWERS, RegionsUnexploredFeatures.AIR_MULTIFACE_GROWTH.get(), new MultifaceGrowthConfiguration((MultifaceBlock)RegionsUnexploredBlocks.WHITE_CHERRY_FLOWERS.get(), 20, true, false, false, 1.0F, HolderSet.direct(Block::builtInRegistryHolder, Blocks.GRASS_BLOCK, RegionsUnexploredBlocks.FOREST_GRASS_BLOCK.get(), RegionsUnexploredBlocks.PLAINS_GRASS_BLOCK.get())));
        //TALL_SAPLINGS
        register(context, ASHEN_SHRUB, RegionsUnexploredFeatures.TALL_SAPLING.get(), new TallSaplingConfiguration(BlockStateProvider.simple(RegionsUnexploredBlocks.ASHEN_SHRUB.get().defaultBlockState())));
        register(context, TALL_ACACIA_SAPLING, RegionsUnexploredFeatures.TALL_SAPLING.get(), new TallSaplingConfiguration(BlockStateProvider.simple(RegionsUnexploredBlocks.TALL_ACACIA_SAPLING.get().defaultBlockState())));
        register(context, TALL_BAOBAB_SAPLING, RegionsUnexploredFeatures.TALL_SAPLING.get(), new TallSaplingConfiguration(BlockStateProvider.simple(RegionsUnexploredBlocks.TALL_BAOBAB_SAPLING.get().defaultBlockState())));
        register(context, TALL_BIRCH_SAPLING, RegionsUnexploredFeatures.TALL_SAPLING.get(), new TallSaplingConfiguration(BlockStateProvider.simple(RegionsUnexploredBlocks.TALL_BIRCH_SAPLING.get().defaultBlockState())));
        register(context, TALL_BLACKWOOD_SAPLING, RegionsUnexploredFeatures.TALL_SAPLING.get(), new TallSaplingConfiguration(BlockStateProvider.simple(RegionsUnexploredBlocks.TALL_BLACKWOOD_SAPLING.get().defaultBlockState())));
        register(context, TALL_CHERRY_SAPLING, RegionsUnexploredFeatures.TALL_SAPLING.get(), new TallSaplingConfiguration(BlockStateProvider.simple(RegionsUnexploredBlocks.TALL_CHERRY_SAPLING.get().defaultBlockState())));
        register(context, TALL_RED_CHERRY_SAPLING, RegionsUnexploredFeatures.TALL_SAPLING.get(), new TallSaplingConfiguration(BlockStateProvider.simple(RegionsUnexploredBlocks.TALL_RED_CHERRY_SAPLING.get().defaultBlockState())));
        register(context, TALL_PINK_CHERRY_SAPLING, RegionsUnexploredFeatures.TALL_SAPLING.get(), new TallSaplingConfiguration(BlockStateProvider.simple(RegionsUnexploredBlocks.TALL_PINK_CHERRY_SAPLING.get().defaultBlockState())));
        register(context, TALL_WHITE_CHERRY_SAPLING, RegionsUnexploredFeatures.TALL_SAPLING.get(), new TallSaplingConfiguration(BlockStateProvider.simple(RegionsUnexploredBlocks.TALL_WHITE_CHERRY_SAPLING.get().defaultBlockState())));
        register(context, TALL_CYPRESS_SAPLING, RegionsUnexploredFeatures.TALL_SAPLING.get(), new TallSaplingConfiguration(BlockStateProvider.simple(RegionsUnexploredBlocks.TALL_CYPRESS_SAPLING.get().defaultBlockState())));
        register(context, TALL_DARK_OAK_SAPLING, RegionsUnexploredFeatures.TALL_SAPLING.get(), new TallSaplingConfiguration(BlockStateProvider.simple(RegionsUnexploredBlocks.TALL_DARK_OAK_SAPLING.get().defaultBlockState())));
        register(context, TALL_DEAD_SAPLING, RegionsUnexploredFeatures.TALL_SAPLING.get(), new TallSaplingConfiguration(BlockStateProvider.simple(RegionsUnexploredBlocks.TALL_DEAD_SAPLING.get().defaultBlockState())));
        register(context, TALL_DEAD_PINE_SAPLING, RegionsUnexploredFeatures.TALL_SAPLING.get(), new TallSaplingConfiguration(BlockStateProvider.simple(RegionsUnexploredBlocks.TALL_DEAD_PINE_SAPLING.get().defaultBlockState())));
        register(context, TALL_EUCALYPTUS_SAPLING, RegionsUnexploredFeatures.TALL_SAPLING.get(), new TallSaplingConfiguration(BlockStateProvider.simple(RegionsUnexploredBlocks.TALL_EUCALYPTUS_SAPLING.get().defaultBlockState())));
        register(context, TALL_FLOWERING_SAPLING, RegionsUnexploredFeatures.TALL_SAPLING.get(), new TallSaplingConfiguration(BlockStateProvider.simple(RegionsUnexploredBlocks.TALL_FLOWERING_SAPLING.get().defaultBlockState())));
        register(context, TALL_JOSHUA_SAPLING, RegionsUnexploredFeatures.TALL_SAPLING.get(), new TallSaplingConfiguration(BlockStateProvider.simple(RegionsUnexploredBlocks.TALL_JOSHUA_SAPLING.get().defaultBlockState())));
        register(context, TALL_JUNGLE_SAPLING, RegionsUnexploredFeatures.TALL_SAPLING.get(), new TallSaplingConfiguration(BlockStateProvider.simple(RegionsUnexploredBlocks.TALL_JUNGLE_SAPLING.get().defaultBlockState())));
        register(context, TALL_LARCH_SAPLING, RegionsUnexploredFeatures.TALL_SAPLING.get(), new TallSaplingConfiguration(BlockStateProvider.simple(RegionsUnexploredBlocks.TALL_LARCH_SAPLING.get().defaultBlockState())));
        register(context, TALL_GOLDEN_LARCH_SAPLING, RegionsUnexploredFeatures.TALL_SAPLING.get(), new TallSaplingConfiguration(BlockStateProvider.simple(RegionsUnexploredBlocks.TALL_GOLDEN_LARCH_SAPLING.get().defaultBlockState())));
        register(context, TALL_MANGROVE_SAPLING, RegionsUnexploredFeatures.TALL_SAPLING.get(), new TallSaplingConfiguration(BlockStateProvider.simple(RegionsUnexploredBlocks.TALL_MANGROVE_SAPLING.get().defaultBlockState())));
        register(context, TALL_MAPLE_SAPLING, RegionsUnexploredFeatures.TALL_SAPLING.get(), new TallSaplingConfiguration(BlockStateProvider.simple(RegionsUnexploredBlocks.TALL_MAPLE_SAPLING.get().defaultBlockState())));
        register(context, TALL_RED_MAPLE_SAPLING, RegionsUnexploredFeatures.TALL_SAPLING.get(), new TallSaplingConfiguration(BlockStateProvider.simple(RegionsUnexploredBlocks.TALL_RED_MAPLE_SAPLING.get().defaultBlockState())));
        register(context, TALL_ORANGE_MAPLE_SAPLING, RegionsUnexploredFeatures.TALL_SAPLING.get(), new TallSaplingConfiguration(BlockStateProvider.simple(RegionsUnexploredBlocks.TALL_ORANGE_MAPLE_SAPLING.get().defaultBlockState())));
        register(context, TALL_MAUVE_SAPLING, RegionsUnexploredFeatures.TALL_SAPLING.get(), new TallSaplingConfiguration(BlockStateProvider.simple(RegionsUnexploredBlocks.TALL_MAUVE_SAPLING.get().defaultBlockState())));
        register(context, TALL_OAK_SAPLING, RegionsUnexploredFeatures.TALL_SAPLING.get(), new TallSaplingConfiguration(BlockStateProvider.simple(RegionsUnexploredBlocks.TALL_OAK_SAPLING.get().defaultBlockState())));
        register(context, TALL_PALM_SAPLING, RegionsUnexploredFeatures.TALL_SAPLING.get(), new TallSaplingConfiguration(BlockStateProvider.simple(RegionsUnexploredBlocks.TALL_PALM_SAPLING.get().defaultBlockState())));
        register(context, TALL_PINE_SAPLING, RegionsUnexploredFeatures.TALL_SAPLING.get(), new TallSaplingConfiguration(BlockStateProvider.simple(RegionsUnexploredBlocks.TALL_PINE_SAPLING.get().defaultBlockState())));
        register(context, TALL_REDWOOD_SAPLING, RegionsUnexploredFeatures.TALL_SAPLING.get(), new TallSaplingConfiguration(BlockStateProvider.simple(RegionsUnexploredBlocks.TALL_REDWOOD_SAPLING.get().defaultBlockState())));
        register(context, TALL_SILVER_BIRCH_SAPLING, RegionsUnexploredFeatures.TALL_SAPLING.get(), new TallSaplingConfiguration(BlockStateProvider.simple(RegionsUnexploredBlocks.TALL_SILVER_BIRCH_SAPLING.get().defaultBlockState())));
        register(context, TALL_SPRUCE_SAPLING, RegionsUnexploredFeatures.TALL_SAPLING.get(), new TallSaplingConfiguration(BlockStateProvider.simple(RegionsUnexploredBlocks.TALL_SPRUCE_SAPLING.get().defaultBlockState())));
        register(context, TALL_WILLOW_SAPLING, RegionsUnexploredFeatures.TALL_SAPLING.get(), new TallSaplingConfiguration(BlockStateProvider.simple(RegionsUnexploredBlocks.TALL_WILLOW_SAPLING.get().defaultBlockState())));
        //mixes
        register(context, TALL_AUTUMNAL_SAPLING_MIX, RegionsUnexploredFeatures.TALL_SAPLING.get(), new TallSaplingConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RegionsUnexploredBlocks.TALL_MAPLE_SAPLING.get().defaultBlockState(), 2).add(RegionsUnexploredBlocks.TALL_SILVER_BIRCH_SAPLING.get().defaultBlockState(), 4).add(RegionsUnexploredBlocks.TALL_RED_MAPLE_SAPLING.get().defaultBlockState(), 4).add(RegionsUnexploredBlocks.TALL_ORANGE_MAPLE_SAPLING.get().defaultBlockState(), 4).add(RegionsUnexploredBlocks.TALL_DEAD_SAPLING.get().defaultBlockState(), 1))));
        register(context, TALL_BIRCH_SAPLING_MIX, RegionsUnexploredFeatures.TALL_SAPLING.get(), new TallSaplingConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RegionsUnexploredBlocks.TALL_SILVER_BIRCH_SAPLING.get().defaultBlockState(), 3).add(RegionsUnexploredBlocks.TALL_BIRCH_SAPLING.get().defaultBlockState(), 1))));
        register(context, TALL_BLACKWOOD_DARK_OAK_SAPLING_MIX, RegionsUnexploredFeatures.TALL_SAPLING.get(), new TallSaplingConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RegionsUnexploredBlocks.TALL_BLACKWOOD_SAPLING.get().defaultBlockState(), 3).add(RegionsUnexploredBlocks.TALL_DARK_OAK_SAPLING.get().defaultBlockState(), 1))));
        register(context, TALL_CHERRY_SAPLING_MIX, RegionsUnexploredFeatures.TALL_SAPLING.get(), new TallSaplingConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RegionsUnexploredBlocks.TALL_CHERRY_SAPLING.get().defaultBlockState(), 1).add(RegionsUnexploredBlocks.TALL_RED_CHERRY_SAPLING.get().defaultBlockState(), 1).add(RegionsUnexploredBlocks.TALL_PINK_CHERRY_SAPLING.get().defaultBlockState(), 1).add(RegionsUnexploredBlocks.TALL_WHITE_CHERRY_SAPLING.get().defaultBlockState(), 1))));
        register(context, TALL_DEAD_SAPLING_MIX, RegionsUnexploredFeatures.TALL_SAPLING.get(), new TallSaplingConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RegionsUnexploredBlocks.TALL_DEAD_SAPLING.get().defaultBlockState(), 2).add(RegionsUnexploredBlocks.TALL_DEAD_PINE_SAPLING.get().defaultBlockState(), 1))));
        register(context, TALL_LARCH_SAPLING_MIX, RegionsUnexploredFeatures.TALL_SAPLING.get(), new TallSaplingConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RegionsUnexploredBlocks.TALL_LARCH_SAPLING.get().defaultBlockState(), 3).add(RegionsUnexploredBlocks.TALL_GOLDEN_LARCH_SAPLING.get().defaultBlockState(), 1))));
        register(context, TALL_GOLDEN_LARCH_SAPLING_MIX, RegionsUnexploredFeatures.TALL_SAPLING.get(), new TallSaplingConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RegionsUnexploredBlocks.TALL_LARCH_SAPLING.get().defaultBlockState(), 1).add(RegionsUnexploredBlocks.TALL_GOLDEN_LARCH_SAPLING.get().defaultBlockState(), 3))));
        register(context, TALL_MAPLE_SAPLING_MIX, RegionsUnexploredFeatures.TALL_SAPLING.get(), new TallSaplingConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RegionsUnexploredBlocks.TALL_MAPLE_SAPLING.get().defaultBlockState(), 4).add(RegionsUnexploredBlocks.TALL_RED_MAPLE_SAPLING.get().defaultBlockState(), 1))));
        register(context, TALL_PINE_SPRUCE_SAPLING_MIX, RegionsUnexploredFeatures.TALL_SAPLING.get(), new TallSaplingConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RegionsUnexploredBlocks.TALL_PINE_SAPLING.get().defaultBlockState(), 1).add(RegionsUnexploredBlocks.TALL_SPRUCE_SAPLING.get().defaultBlockState(), 1))));
        register(context, TALL_PINE_DEAD_SAPLING_MIX, RegionsUnexploredFeatures.TALL_SAPLING.get(), new TallSaplingConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RegionsUnexploredBlocks.TALL_PINE_SAPLING.get().defaultBlockState(), 2).add(RegionsUnexploredBlocks.TALL_DEAD_PINE_SAPLING.get().defaultBlockState(), 1))));
        register(context, TALL_PALM_MANGROVE_SAPLING_MIX, RegionsUnexploredFeatures.TALL_SAPLING.get(), new TallSaplingConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RegionsUnexploredBlocks.TALL_PALM_SAPLING.get().defaultBlockState(), 5).add(RegionsUnexploredBlocks.TALL_MANGROVE_SAPLING.get().defaultBlockState(), 1))));
        register(context, TALL_WILLOW_CYPRESS_SAPLING_MIX, RegionsUnexploredFeatures.TALL_SAPLING.get(), new TallSaplingConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RegionsUnexploredBlocks.TALL_WILLOW_SAPLING.get().defaultBlockState(), 2).add(RegionsUnexploredBlocks.TALL_CYPRESS_SAPLING.get().defaultBlockState(), 1))));

        //VANILLA
        register(context, PATCH_SEAGRASS, Feature.SEAGRASS, new ProbabilityFeatureConfiguration(0.6F));
        register(context, PATCH_LILY_PAD, Feature.RANDOM_PATCH, new RandomPatchConfiguration(10, 7, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.LILY_PAD)))));
        //BIOSHROOMS
        register(context, GIANT_PINK_BIOSHROOM, RegionsUnexploredFeatures.GIANT_PINK_BIOSHROOM.get(), FeatureConfiguration.NONE);
        //GRASSES
        register(context, PATCH_BARLEY , Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.BARLEY.get().defaultBlockState()), 32));
        register(context, PATCH_MEDIUM_GRASS, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.MEDIUM_GRASS.get().defaultBlockState()), 32));
        register(context, PATCH_STEPPE_GRASS, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.STEPPE_GRASS.get().defaultBlockState()), 32));
        register(context, PATCH_STEPPE_SHRUB, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.STEPPE_SHRUB.get().defaultBlockState()), 32));
        register(context, PATCH_TALL_STEPPE_GRASS, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.TALL_STEPPE_GRASS.get().defaultBlockState()), 32));
        register(context, PATCH_DEAD_STEPPE_SHRUB, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.DEAD_STEPPE_SHRUB.get().defaultBlockState()), 32));
        register(context, PATCH_SMALL_DESERT_SHRUB, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.SMALL_DESERT_SHRUB.get().defaultBlockState()), 32));
        register(context, PATCH_SEEDED_GRASS, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.SEEDED_GRASS.get().defaultBlockState()), 32));
        register(context, PATCH_SEEDED_TALL_GRASS, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.SEEDED_TALL_GRASS.get().defaultBlockState()), 32));
        register(context, PATCH_SANDY_GRASS, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.SANDY_GRASS.get().defaultBlockState()), 32));
        register(context, PATCH_BARREL_CACTUS, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.BARREL_CACTUS.get().defaultBlockState()), 8));
        register(context, PATCH_SANDY_TALL_GRASS, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.SANDY_TALL_GRASS.get().defaultBlockState()), 32));
        register(context, PATCH_FOREST_FERN, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(Blocks.FERN.defaultBlockState()), 32));
        register(context, PATCH_TALL_FOREST_FERN, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(Blocks.LARGE_FERN.defaultBlockState()), 32));
        register(context, PATCH_FOREST_FERN_MIX, Feature.FLOWER, grassPatch(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.LARGE_FERN.defaultBlockState(), 1).add(Blocks.FERN.defaultBlockState(), 2)), 32));
        register(context, PATCH_ELEPHANT_EAR, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.ELEPHANT_EAR.get().defaultBlockState()), 32));
        register(context, PATCH_SNOWY_GRASS, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.FROZEN_GRASS.get().defaultBlockState()), 32));
        register(context, PATCH_STONE_BUD, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.STONE_BUD.get().defaultBlockState()), 32));
        register(context, PATCH_REDSTONE_BUD, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.REDSTONE_BUD.get().defaultBlockState()), 128));
        register(context, PATCH_REDSTONE_BULB, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.REDSTONE_BULB.get().defaultBlockState()), 64));
        register(context, UNDERGROUND_GRASS, Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.GRASS.defaultBlockState(), 50).add(Blocks.TALL_GRASS.defaultBlockState(), 10))));
        //FLOWERS
        register(context, ALPHA_DANDELION, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.ALPHA_DANDELION.get().defaultBlockState()), 32));
        register(context, ALPHA_ROSE, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.ALPHA_ROSE.get().defaultBlockState()), 32));
        register(context, RU_FLOWER_DEFAULT, Feature.FLOWER, grassPatch(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RegionsUnexploredBlocks.FIREWEED.get().defaultBlockState(), 2).add(RegionsUnexploredBlocks.DAISY.get().defaultBlockState(), 2).add(RegionsUnexploredBlocks.HYSSOP.get().defaultBlockState(), 2).add(RegionsUnexploredBlocks.POPPY_BUSH.get().defaultBlockState(), 2).add(Blocks.DANDELION.defaultBlockState(), 2)), 64));
        register(context, RU_FLOWER_PINK, Feature.FLOWER, grassPatch(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RegionsUnexploredBlocks.FIREWEED.get().defaultBlockState(), 2).add(RegionsUnexploredBlocks.PINK_LUPINE.get().defaultBlockState(), 2).add(Blocks.PINK_TULIP.defaultBlockState(), 2)), 64));
        register(context, RU_LILAC, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(Blocks.LILAC.defaultBlockState()), 64));

        register(context, PATCH_YELLOW_LUPINE_FIELD, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.YELLOW_LUPINE.get().defaultBlockState()), 6));
        register(context, PATCH_RED_LUPINE_FIELD, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.RED_LUPINE.get().defaultBlockState()), 6));
        register(context, PATCH_BLUE_LUPINE_FIELD, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.BLUE_LUPINE.get().defaultBlockState()), 64));
        register(context, PATCH_PINK_LUPINE_FIELD, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.PINK_LUPINE.get().defaultBlockState()), 64));
        register(context, PATCH_PURPLE_LUPINE_FIELD, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.PURPLE_LUPINE.get().defaultBlockState()), 64));

        register(context, PATCH_PRISMOSS_SPROUT, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.PRISMOSS_SPROUT.get().defaultBlockState()), 32));
        register(context, PATCH_PRISMARITE, Feature.RANDOM_PATCH, grassPatch(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RegionsUnexploredBlocks.LARGE_PRISMARITE_CLUSTER.get().defaultBlockState(), 1).add(RegionsUnexploredBlocks.PRISMARITE_CLUSTER.get().defaultBlockState(), 5)), 32));
        register(context, PATCH_YELLOW_LUPINE, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.YELLOW_LUPINE.get().defaultBlockState()), 6));
        register(context, PATCH_RED_LUPINE, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.RED_LUPINE.get().defaultBlockState()), 6));
        register(context, PATCH_BLUE_LUPINE, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.BLUE_LUPINE.get().defaultBlockState()), 6));
        register(context, PATCH_PINK_LUPINE, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.PINK_LUPINE.get().defaultBlockState()), 6));
        register(context, PATCH_PURPLE_LUPINE, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.PURPLE_LUPINE.get().defaultBlockState()), 6));
        register(context, PATCH_YELLOW_BIOSHROOM, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.YELLOW_BIOSHROOM.get().defaultBlockState()), 6));
        register(context, PATCH_PINK_BIOSHROOM, Feature.RANDOM_PATCH, grassPatch(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RegionsUnexploredBlocks.TALL_PINK_BIOSHROOM.get().defaultBlockState(), 1).add(RegionsUnexploredBlocks.PINK_BIOSHROOM.get().defaultBlockState(), 10)), 6));
        register(context, PATCH_POPPY_BUSH, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.POPPY_BUSH.get().defaultBlockState()), 32));
        register(context, PATCH_CAVE_HYSSOP, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.CAVE_HYSSOP.get().defaultBlockState()), 32));
        register(context, PATCH_HYSSOP, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.HYSSOP.get().defaultBlockState()), 32));
        register(context, PATCH_WARATAH, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.WARATAH.get().defaultBlockState()), 32));
        register(context, PATCH_WHITE_TRILLIUM, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.WHITE_TRILLIUM.get().defaultBlockState()), 32));
        register(context, PATCH_WILTING_TRILLIUM, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.WILTING_TRILLIUM.get().defaultBlockState()), 32));
        register(context, PATCH_DORCEL, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.DORCEL.get().defaultBlockState()), 32));
        register(context, PATCH_TSUBAKI, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.TSUBAKI.get().defaultBlockState()), 8));
        register(context, PATCH_FIREWEED, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.FIREWEED.get().defaultBlockState()), 32));
        register(context, PATCH_DAISY, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.DAISY.get().defaultBlockState()), 16));
        register(context, PATCH_FELICIA, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.FELICIA_DAISY.get().defaultBlockState()), 32));
        register(context, PATCH_TASSEL, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.TASSEL.get().defaultBlockState()), 8));
        register(context, PATCH_TASSEL_DENSE, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.TASSEL.get().defaultBlockState()), 16));
        register(context, PATCH_POPPY, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(Blocks.POPPY.defaultBlockState()), 32));
        register(context, PATCH_BLUE_ORCHID, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(Blocks.BLUE_ORCHID.defaultBlockState()), 32));
        register(context, PATCH_ALLIUM, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(Blocks.ALLIUM.defaultBlockState()), 32));
        register(context, PATCH_RED_TULIP, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(Blocks.RED_TULIP.defaultBlockState()), 32));
        register(context, PATCH_ORANGE_TULIP, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(Blocks.ORANGE_TULIP.defaultBlockState()), 32));
        register(context, PATCH_PINK_TULIP, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(Blocks.PINK_TULIP.defaultBlockState()), 32));
        register(context, PATCH_WHITE_TULIP, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(Blocks.WHITE_TULIP.defaultBlockState()), 32));
        register(context, PATCH_OXEYE, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(Blocks.OXEYE_DAISY.defaultBlockState()), 32));
        register(context, PATCH_CORNFLOWER, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(Blocks.CORNFLOWER.defaultBlockState()), 32));
        register(context, PATCH_LILLY, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(Blocks.LILY_OF_THE_VALLEY.defaultBlockState()), 32));
        register(context, PATCH_SUNFLOWER, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(Blocks.SUNFLOWER.defaultBlockState()), 32));
        register(context, PATCH_GREEN_BIOSHROOM, Feature.RANDOM_PATCH, grassPatch(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RegionsUnexploredBlocks.TALL_GREEN_BIOSHROOM.get().defaultBlockState(), 1).add(RegionsUnexploredBlocks.GREEN_BIOSHROOM.get().defaultBlockState(), 10)), 16));
        register(context, PATCH_BLUE_BIOSHROOM, Feature.RANDOM_PATCH, grassPatch(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RegionsUnexploredBlocks.TALL_BLUE_BIOSHROOM.get().defaultBlockState(), 1).add(RegionsUnexploredBlocks.BLUE_BIOSHROOM.get().defaultBlockState(), 10)), 16));
        //OTHER
        register(context, PATCH_CATTAIL, Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(RegionsUnexploredBlocks.CATTAIL.get()))));
        register(context, DUCKWEED, Feature.RANDOM_PATCH, new RandomPatchConfiguration(10, 7, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(RegionsUnexploredBlocks.DUCKWEED.get())))));
        register(context, FOREST_FERN_MIX, Feature.FLOWER, grassPatch(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.LARGE_FERN.defaultBlockState(), 1).add(Blocks.FERN.defaultBlockState(), 2)), 32));
        register(context, SEEDED_GRASS_MIX, Feature.FLOWER, grassPatch(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RegionsUnexploredBlocks.SEEDED_TALL_GRASS.get().defaultBlockState(), 1).add(RegionsUnexploredBlocks.SEEDED_GRASS.get().defaultBlockState(), 2)), 32));
        register(context, DAISY_MIX, Feature.FLOWER, grassPatch(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RegionsUnexploredBlocks.DAISY.get().defaultBlockState(), 1).add(RegionsUnexploredBlocks.FELICIA_DAISY.get().defaultBlockState(), 1)), 32));

        register(context, OVERGROWN_VINE, Feature.BLOCK_COLUMN, new BlockColumnConfiguration(List.of(BlockColumnConfiguration.layer(new WeightedListInt(SimpleWeightedRandomList.<IntProvider>builder().add(UniformInt.of(0, 19), 2).add(UniformInt.of(0, 2), 3).add(UniformInt.of(0, 6), 10).build()), leaveProvider), BlockColumnConfiguration.layer(ConstantInt.of(1), leaveProvider)), Direction.DOWN, BlockPredicate.ONLY_IN_AIR_PREDICATE, true));

        register(context, PATCH_MYCOTOXIC_GRASS, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.MYCOTOXIC_GRASS.get().defaultBlockState()), 32));
        register(context, PATCH_MYCOTOXIC_DAISY, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.MYCOTOXIC_DAISY.get().defaultBlockState()), 16));
        register(context, PATCH_TALL_YELLOW_BIOSHROOM, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.TALL_YELLOW_BIOSHROOM.get().defaultBlockState()), 6));

        register(context, PATCH_GLISTERING_IVY, RegionsUnexploredFeatures.GLISTERING_IVY.get(), FeatureConfiguration.NONE);
        register(context, PATCH_GLISTERING_SPROUT, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.GLISTERING_SPROUT.get().defaultBlockState()), 32));
        register(context, PATCH_GLISTER_SPIRE, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.GLISTER_SPIRE.get().defaultBlockState()), 16));
        register(context, PATCH_GLISTER_BULB, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.GLISTER_BULB.get().defaultBlockState()), 6));


        register(context, PATCH_HANGING_EARLIGHT, RegionsUnexploredFeatures.HANGING_EARLIGHT.get(), FeatureConfiguration.NONE);
        register(context, PATCH_BLACKSTONE_CLUSTER, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.BLACKSTONE_CLUSTER.get().defaultBlockState()), 16));
        register(context, PATCH_COBALT_EARLIGHT, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.COBALT_EARLIGHT.get().defaultBlockState()), 6));
        register(context, PATCH_COBALT_ROOTS, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.COBALT_ROOTS.get().defaultBlockState()), 32));

        register(context, NETHER_WILLOW, RegionsUnexploredFeatures.NETHER_WILLOW.get(), FeatureConfiguration.NONE);
        register(context, BRIM_WILLOW, RegionsUnexploredFeatures.BRIM_WILLOW.get(), FeatureConfiguration.NONE);
        register(context, TALL_BRIM_WILLOW, RegionsUnexploredFeatures.TALL_BRIM_WILLOW.get(), FeatureConfiguration.NONE);

        register(context, PATCH_BRIMSPROUT, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(RegionsUnexploredBlocks.BRIMSPROUT.get().defaultBlockState()), 32));
        register(context, PATCH_BRIM_FLAMES, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(Blocks.FIRE.defaultBlockState()), 12));

        register(context, ASHEN_GRASS, Feature.RANDOM_PATCH, grassPatch(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RegionsUnexploredBlocks.ASHEN_GRASS.get().defaultBlockState(), 4).add(RegionsUnexploredBlocks.ASHEN_GRASS.get().defaultBlockState().setValue(AshenTallGrassBlock.SMOULDERING, true), 1)), 32));
        register(context, ASHEN_BUSH, RegionsUnexploredFeatures.SMALL_BUSH.get(), new SmallBushConfiguration(BlockStateProvider.simple(RegionsUnexploredBlocks.ASHEN_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true))));
        //BONEMEALS
        WeightedStateProvider mycotoxicWeights = new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RegionsUnexploredBlocks.MYCOTOXIC_GRASS.get().defaultBlockState(), 87).add(RegionsUnexploredBlocks.YELLOW_BIOSHROOM.get().defaultBlockState(), 11));
        WeightedStateProvider glisteringWeights = new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RegionsUnexploredBlocks.GLISTERING_SPROUT.get().defaultBlockState(), 100).add(RegionsUnexploredBlocks.PINK_BIOSHROOM.get().defaultBlockState(), 1));
        WeightedStateProvider cobaltWeights = new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(RegionsUnexploredBlocks.COBALT_ROOTS.get().defaultBlockState(), 100).add(RegionsUnexploredBlocks.COBALT_EARLIGHT.get().defaultBlockState(), 1));

        register(context, MYCOTOXIC_NYLIUM_BONEMEAL, Feature.NETHER_FOREST_VEGETATION, new NetherForestVegetationConfig(mycotoxicWeights, 3, 1));
        register(context, GLISTERING_NYLIUM_BONEMEAL, Feature.NETHER_FOREST_VEGETATION, new NetherForestVegetationConfig(glisteringWeights, 3, 1));
        register(context, COBALT_NYLIUM_BONEMEAL, Feature.NETHER_FOREST_VEGETATION, new NetherForestVegetationConfig(cobaltWeights, 3, 1));
    }

    private static RandomPatchConfiguration grassPatch(BlockStateProvider stateProvider, int i) {
        return FeatureUtils.simpleRandomPatchConfiguration(i, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(stateProvider)));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC config) {
        context.register(key, new ConfiguredFeature<>(feature, config));
    }
}
