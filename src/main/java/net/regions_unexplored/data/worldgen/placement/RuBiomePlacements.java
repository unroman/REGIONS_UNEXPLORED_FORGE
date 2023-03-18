package net.regions_unexplored.data.worldgen.placement;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.features.NetherFeatures;
import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.data.worldgen.features.VegetationFeatures;
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

public class RuBiomePlacements {

    public static final ResourceKey<PlacedFeature> SCORCH_TREES = RuPlacementUtils.createKey("scorch_trees");

    public static final ResourceKey<PlacedFeature> LUSH_DELTA_GRASS = RuPlacementUtils.createKey("lush_delta_grass");
    public static final ResourceKey<PlacedFeature> LUSH_DELTA_TALL_GRASS = RuPlacementUtils.createKey("lush_delta_tall_grass");
    public static final ResourceKey<PlacedFeature> LUSH_DELTA_YELLOW_BIOSHROOM = RuPlacementUtils.createKey("lush_delta_yellow_bioshroom");
    public static final ResourceKey<PlacedFeature> LUSH_DELTA_PINK_BIOSHROOM = RuPlacementUtils.createKey("lush_delta_pink_bioshroom");
    public static final ResourceKey<PlacedFeature> LUSH_DELTA_TREES = RuPlacementUtils.createKey("lush_delta_trees");

    public static final ResourceKey<PlacedFeature> PRISMACHASM_SPROUT = RuPlacementUtils.createKey("prismachasm_sprout");
    public static final ResourceKey<PlacedFeature> PRISMACHASM_CRYSTAL = RuPlacementUtils.createKey("prismachasm_crystal");
    public static final ResourceKey<PlacedFeature> PRISMACHASM_HYSSOP = RuPlacementUtils.createKey("prismachasm_hyssop");
    public static final ResourceKey<PlacedFeature> PRISMACHASM_GREEN_BIOSHROOM = RuPlacementUtils.createKey("prismachasm_green_bioshroom");
    public static final ResourceKey<PlacedFeature> PRISMACHASM_BLUE_BIOSHROOM = RuPlacementUtils.createKey("prismachasm_blue_bioshroom");
    public static final ResourceKey<PlacedFeature> PRISMACHASM_PINK_BIOSHROOM = RuPlacementUtils.createKey("prismachasm_pink_bioshroom");
    public static final ResourceKey<PlacedFeature> PRISMACHASM_YELLOW_BIOSHROOM = RuPlacementUtils.createKey("prismachasm_yellow_bioshroom");

    public static final ResourceKey<PlacedFeature> BIOSHROOM_CAVES_GIANT_GREEN_BIOSHROOM = RuPlacementUtils.createKey("bioshroom_caves_giant_green_bioshroom");
    public static final ResourceKey<PlacedFeature> BIOSHROOM_CAVES_GIANT_BLUE_BIOSHROOM = RuPlacementUtils.createKey("bioshroom_caves_giant_blue_bioshroom");
    public static final ResourceKey<PlacedFeature> BIOSHROOM_CAVES_GRASS = RuPlacementUtils.createKey("bioshroom_caves_grass");
    public static final ResourceKey<PlacedFeature> BIOSHROOM_CAVES_TALL_GRASS = RuPlacementUtils.createKey("bioshroom_caves_tall_grass");
    public static final ResourceKey<PlacedFeature> BIOSHROOM_CAVES_HYSSOP = RuPlacementUtils.createKey("bioshroom_caves_hyssop");
    public static final ResourceKey<PlacedFeature> BIOSHROOM_CAVES_GREEN_BIOSHROOM = RuPlacementUtils.createKey("bioshroom_caves_green_bioshroom");
    public static final ResourceKey<PlacedFeature> BIOSHROOM_CAVES_BLUE_BIOSHROOM = RuPlacementUtils.createKey("bioshroom_caves_blue_bioshroom");
    public static final ResourceKey<PlacedFeature> BIOSHROOM_CAVES_PINK_BIOSHROOM = RuPlacementUtils.createKey("bioshroom_caves_pink_bioshroom");

    public static final ResourceKey<PlacedFeature> PINE_SLOPES_BUSH = RuPlacementUtils.createKey("pine_slopes_bush");
    public static final ResourceKey<PlacedFeature> PINE_SLOPES_OAK = RuPlacementUtils.createKey("pine_slopes_oak");
    public static final ResourceKey<PlacedFeature> PINE_SLOPES_PINE = RuPlacementUtils.createKey("pine_slopes_pine");

    public static final ResourceKey<PlacedFeature> MOUNTAINS_BUSH = RuPlacementUtils.createKey("mountains_bush");
    public static final ResourceKey<PlacedFeature> MOUNTAINS_OAK = RuPlacementUtils.createKey("mountains_oak");
    public static final ResourceKey<PlacedFeature> MOUNTAINS_PINE = RuPlacementUtils.createKey("mountains_pine");
    public static final ResourceKey<PlacedFeature> MOUNTAINS_GRASS = RuPlacementUtils.createKey("mountains_grass");

    public static final ResourceKey<PlacedFeature> LUSH_HILLS_BUSH = RuPlacementUtils.createKey("lush_hills_bush");
    public static final ResourceKey<PlacedFeature> LUSH_HILLS_GRASS = RuPlacementUtils.createKey("lush_hills_grass");

    public static final ResourceKey<PlacedFeature> MUDDY_RIVER_SHRUB = RuPlacementUtils.createKey("muddy_river_shrub");
    public static final ResourceKey<PlacedFeature> MUDDY_RIVER_GRASS = RuPlacementUtils.createKey("muddy_river_grass");

    public static final ResourceKey<PlacedFeature> GRASSY_BEACH_SANDY_GRASS = RuPlacementUtils.createKey("grassy_beach_sandy_grass");
    public static final ResourceKey<PlacedFeature> GRASSY_BEACH_SANDY_TALL_GRASS = RuPlacementUtils.createKey("grassy_beach_sandy_tall_grass");

    public static final ResourceKey<PlacedFeature> CANADIAN_FOREST_PINE = RuPlacementUtils.createKey("canadian_forest_pine");
    public static final ResourceKey<PlacedFeature> CANADIAN_FOREST_DEAD_SPRUCE = RuPlacementUtils.createKey("canadian_forest_dead_spruce");
    public static final ResourceKey<PlacedFeature> CANADIAN_FOREST_MAPLE = RuPlacementUtils.createKey("canadian_forest_maple");
    public static final ResourceKey<PlacedFeature> CANADIAN_FOREST_GRASS = RuPlacementUtils.createKey("canadian_forest_grass");
    public static final ResourceKey<PlacedFeature> CANADIAN_FOREST_TRILLIUM = RuPlacementUtils.createKey("canadian_forest_trillium");
    public static final ResourceKey<PlacedFeature> CANADIAN_FOREST_TALL_GRASS = RuPlacementUtils.createKey("canadian_forest_tall_grass");

    public static final ResourceKey<PlacedFeature> MAPLE_FOREST_MAPLE = RuPlacementUtils.createKey("maple_forest_maple");
    public static final ResourceKey<PlacedFeature> MAPLE_FOREST_RED_MAPLE = RuPlacementUtils.createKey("maple_forest_red_maple");
    public static final ResourceKey<PlacedFeature> MAPLE_FOREST_BIG_MAPLE = RuPlacementUtils.createKey("maple_forest_big_maple");
    public static final ResourceKey<PlacedFeature> MAPLE_FOREST_PINE = RuPlacementUtils.createKey("maple_forest_pine");
    public static final ResourceKey<PlacedFeature> MAPLE_FOREST_GRASS = RuPlacementUtils.createKey("maple_forest_grass");
    public static final ResourceKey<PlacedFeature> MAPLE_FOREST_STONE_BUD = RuPlacementUtils.createKey("maple_forest_stone_bud");
    public static final ResourceKey<PlacedFeature> MAPLE_FOREST_TRILLIUM = RuPlacementUtils.createKey("maple_forest_trillium");

    public static final ResourceKey<PlacedFeature> FEN_SHRUB = RuPlacementUtils.createKey("fen_shrub");
    public static final ResourceKey<PlacedFeature> FEN_BUSH = RuPlacementUtils.createKey("fen_bush");
    public static final ResourceKey<PlacedFeature> FEN_PINE = RuPlacementUtils.createKey("fen_pine");
    public static final ResourceKey<PlacedFeature> FEN_DEAD_PINE = RuPlacementUtils.createKey("fen_dead_pine");
    public static final ResourceKey<PlacedFeature> FEN_DEAD_OAK = RuPlacementUtils.createKey("fen_dead_oak");
    public static final ResourceKey<PlacedFeature> FEN_GRASS = RuPlacementUtils.createKey("fen_grass");
    public static final ResourceKey<PlacedFeature> FEN_CATTAILS = RuPlacementUtils.createKey("fen_cattails");

    public static final ResourceKey<PlacedFeature> BLACKWOOD_FOREST_TALL_BLACKWOOD = RuPlacementUtils.createKey("blackwood_forest_tall_blackwood");
    public static final ResourceKey<PlacedFeature> BLACKWOOD_FOREST_OAK = RuPlacementUtils.createKey("blackwood_forest_oak");
    public static final ResourceKey<PlacedFeature> BLACKWOOD_FOREST_BLACKWOOD = RuPlacementUtils.createKey("blackwood_forest_blackwood");
    public static final ResourceKey<PlacedFeature> BLACKWOOD_FOREST_MUSHROOM = RuPlacementUtils.createKey("blackwood_forest_mushroom");
    public static final ResourceKey<PlacedFeature> BLACKWOOD_FOREST_DARK_OAK = RuPlacementUtils.createKey("blackwood_forest_dark_oak");
    public static final ResourceKey<PlacedFeature> BLACKWOOD_FOREST_GRASS = RuPlacementUtils.createKey("blackwood_forest_grass");
    public static final ResourceKey<PlacedFeature> BLACKWOOD_FOREST_TALL_GRASS = RuPlacementUtils.createKey("blackwood_forest_tall_grass");
    public static final ResourceKey<PlacedFeature> BLACKWOOD_FOREST_PINK_BIOSHROOM = RuPlacementUtils.createKey("blackwood_forest_pink_bioshroom");
    public static final ResourceKey<PlacedFeature> BLACKWOOD_FOREST_BLUE_BIOSHROOM = RuPlacementUtils.createKey("blackwood_forest_blue_bioshroom");

    public static final ResourceKey<PlacedFeature> FLOWER_FIELD_GRASS = RuPlacementUtils.createKey("flower_field_grass");
    public static final ResourceKey<PlacedFeature> FLOWER_FIELD_YELLOW_LUPINE = RuPlacementUtils.createKey("flower_field_yellow_lupine");
    public static final ResourceKey<PlacedFeature> FLOWER_FIELD_RED_LUPINE = RuPlacementUtils.createKey("flower_field_red_lupine");
    public static final ResourceKey<PlacedFeature> FLOWER_FIELD_PINK_LUPINE = RuPlacementUtils.createKey("flower_field_pink_lupine");
    public static final ResourceKey<PlacedFeature> FLOWER_FIELD_PURPLE_LUPINE = RuPlacementUtils.createKey("flower_field_purple_lupine");
    public static final ResourceKey<PlacedFeature> FLOWER_FIELD_BLUE_LUPINE = RuPlacementUtils.createKey("flower_field_blue_lupine");
    public static final ResourceKey<PlacedFeature> FLOWER_FIELD_POPPY_PATCH = RuPlacementUtils.createKey("flower_field_poppy_patch");
    public static final ResourceKey<PlacedFeature> FLOWER_FIELD_HYSSOP = RuPlacementUtils.createKey("flower_field_hyssop");
    public static final ResourceKey<PlacedFeature> FLOWER_FIELD_WARATAH = RuPlacementUtils.createKey("flower_field_waratah");
    public static final ResourceKey<PlacedFeature> FLOWER_FIELD_TRILLIUM = RuPlacementUtils.createKey("flower_field_trillium");
    public static final ResourceKey<PlacedFeature> FLOWER_FIELD_TSUBAKI = RuPlacementUtils.createKey("flower_field_tsubaki");
    public static final ResourceKey<PlacedFeature> FLOWER_FIELD_FIREWEED = RuPlacementUtils.createKey("flower_field_fireweed");
    public static final ResourceKey<PlacedFeature> FLOWER_FIELD_DAISY = RuPlacementUtils.createKey("flower_field_daisy");
    public static final ResourceKey<PlacedFeature> FLOWER_FIELD_FELICIA_DAISY = RuPlacementUtils.createKey("flower_field_felicia_daisy");
    public static final ResourceKey<PlacedFeature> FLOWER_FIELD_TASSEL = RuPlacementUtils.createKey("flower_field_tassel");
    public static final ResourceKey<PlacedFeature> FLOWER_FIELD_POPPIES = RuPlacementUtils.createKey("flower_field_poppies");
    public static final ResourceKey<PlacedFeature> FLOWER_FIELD_BLUE_ORCHIDS = RuPlacementUtils.createKey("flower_field_blue_orchids");
    public static final ResourceKey<PlacedFeature> FLOWER_FIELD_ALLIUM = RuPlacementUtils.createKey("flower_field_allium");
    public static final ResourceKey<PlacedFeature> FLOWER_FIELD_RED_TULIP = RuPlacementUtils.createKey("flower_field_red_tulip");
    public static final ResourceKey<PlacedFeature> FLOWER_FIELD_ORANGE_TULIP = RuPlacementUtils.createKey("flower_field_orange_tulip");
    public static final ResourceKey<PlacedFeature> FLOWER_FIELD_PINK_TULIP = RuPlacementUtils.createKey("flower_field_pink_tulip");
    public static final ResourceKey<PlacedFeature> FLOWER_FIELD_WHITE_TULIP = RuPlacementUtils.createKey("flower_field_white_tulip");
    public static final ResourceKey<PlacedFeature> FLOWER_FIELD_OXEYE_DAISY = RuPlacementUtils.createKey("flower_field_oxeye_daisy");
    public static final ResourceKey<PlacedFeature> FLOWER_FIELD_CORNFLOWER = RuPlacementUtils.createKey("flower_field_cornflower");
    public static final ResourceKey<PlacedFeature> FLOWER_FIELD_LILLIES = RuPlacementUtils.createKey("flower_field_lillies");
    public static final ResourceKey<PlacedFeature> FLOWER_FIELD_SUNFLOWER = RuPlacementUtils.createKey("flower_field_sunflower");
    public static final ResourceKey<PlacedFeature> FLOWER_FIELD_GREEN_BIOSHROOM = RuPlacementUtils.createKey("flower_field_green_bioshroom");
    public static final ResourceKey<PlacedFeature> FLOWER_FIELD_BLUE_BIOSHROOM = RuPlacementUtils.createKey("flower_field_blue_bioshroom");

    public static final ResourceKey<PlacedFeature> GRASSLAND_SHRUB = RuPlacementUtils.createKey("grassland_shrub");
    public static final ResourceKey<PlacedFeature> GRASSLAND_GRASS = RuPlacementUtils.createKey("grassland_grass");

    public static final ResourceKey<PlacedFeature> BAOBAB_SAVANNA_SHRUB = RuPlacementUtils.createKey("baobab_savanna_shrub");
    public static final ResourceKey<PlacedFeature> BAOBAB_SAVANNA_BIG_BAOBAB = RuPlacementUtils.createKey("baobab_savanna_big_baobab");
    public static final ResourceKey<PlacedFeature> BAOBAB_SAVANNA_SMALL_BAOBAB = RuPlacementUtils.createKey("baobab_savanna_small_baobab");
    public static final ResourceKey<PlacedFeature> BAOBAB_SAVANNA_ACACIA = RuPlacementUtils.createKey("baobab_savanna_acacia");
    public static final ResourceKey<PlacedFeature> BAOBAB_SAVANNA_BUSH = RuPlacementUtils.createKey("baobab_savanna_bush");
    public static final ResourceKey<PlacedFeature> BAOBAB_SAVANNA_STONE_BUD = RuPlacementUtils.createKey("baobab_savanna_stone_bud");
    public static final ResourceKey<PlacedFeature> BAOBAB_SAVANNA_GRASS = RuPlacementUtils.createKey("baobab_savanna_grass");
    public static final ResourceKey<PlacedFeature> BAOBAB_SAVANNA_TALL_GRASS = RuPlacementUtils.createKey("baobab_savanna_tall_grass");

    public static final ResourceKey<PlacedFeature> SHRUBLAND_BUSH = RuPlacementUtils.createKey("shrubland_bush");
    public static final ResourceKey<PlacedFeature> SHRUBLAND_SHRUB = RuPlacementUtils.createKey("shrubland_shrub");
    public static final ResourceKey<PlacedFeature> SHRUBLAND_SPRUCE = RuPlacementUtils.createKey("shrubland_spruce");
    public static final ResourceKey<PlacedFeature> SHRUBLAND_OAK_SHRUB = RuPlacementUtils.createKey("shrubland_oak_shrub");
    public static final ResourceKey<PlacedFeature> SHRUBLAND_SPRUCE_SHRUB = RuPlacementUtils.createKey("shrubland_spruce_shrub");
    public static final ResourceKey<PlacedFeature> SHRUBLAND_GRASS = RuPlacementUtils.createKey("shrubland_grass");
    public static final ResourceKey<PlacedFeature> SHRUBLAND_YELLOW_LUPINE = RuPlacementUtils.createKey("shrubland_yellow_lupine");
    public static final ResourceKey<PlacedFeature> SHRUBLAND_RED_LUPINE = RuPlacementUtils.createKey("shrubland_red_lupine");

    public static final ResourceKey<PlacedFeature> ICY_HEIGHTS_PINE = RuPlacementUtils.createKey("icy_heights_pine");
    public static final ResourceKey<PlacedFeature> ICY_HEIGHTS_DEAD_PINE = RuPlacementUtils.createKey("icy_heights_dead_pine");
    public static final ResourceKey<PlacedFeature> ICY_HEIGHTS_SNOWY_GRASS = RuPlacementUtils.createKey("icy_heights_snowy_grass");

    public static final ResourceKey<PlacedFeature> OLD_GROWTH_RAINFOREST_PALM = RuPlacementUtils.createKey("old_growth_rainforest_palm");
    public static final ResourceKey<PlacedFeature> OLD_GROWTH_RAINFOREST_MANGROVE = RuPlacementUtils.createKey("old_growth_rainforest_mangrove");
    public static final ResourceKey<PlacedFeature> OLD_GROWTH_RAINFOREST_JUNGLE_TREE = RuPlacementUtils.createKey("old_growth_rainforest_jungle_tree");
    public static final ResourceKey<PlacedFeature> OLD_GROWTH_RAINFOREST_BIG_JUNGLE_TREE = RuPlacementUtils.createKey("old_growth_rainforest_big_jungle_tree");
    public static final ResourceKey<PlacedFeature> OLD_GROWTH_RAINFOREST_SHRUB = RuPlacementUtils.createKey("old_growth_rainforest_shrub");
    public static final ResourceKey<PlacedFeature> OLD_GROWTH_RAINFOREST_GRASS = RuPlacementUtils.createKey("old_growth_rainforest_grass");
    public static final ResourceKey<PlacedFeature> OLD_GROWTH_RAINFOREST_GREEN_BIOSHROOM = RuPlacementUtils.createKey("old_growth_rainforest_green_bioshroom");
    public static final ResourceKey<PlacedFeature> OLD_GROWTH_RAINFOREST_BLUE_BIOSHROOM = RuPlacementUtils.createKey("old_growth_rainforest_blue_bioshroom");
    public static final ResourceKey<PlacedFeature> OLD_GROWTH_RAINFOREST_ELEPHANT_EAR = RuPlacementUtils.createKey("old_growth_rainforest_elephant_ear");

    public static final ResourceKey<PlacedFeature> RAINFOREST_PALM = RuPlacementUtils.createKey("rainforest_palm");
    public static final ResourceKey<PlacedFeature> RAINFOREST_JUNGLE_TREE = RuPlacementUtils.createKey("rainforest_jungle_tree");
    public static final ResourceKey<PlacedFeature> RAINFOREST_BIG_JUNGLE_TREE = RuPlacementUtils.createKey("rainforest_big_jungle_tree");
    public static final ResourceKey<PlacedFeature> RAINFOREST_SHRUB = RuPlacementUtils.createKey("rainforest_shrub");
    public static final ResourceKey<PlacedFeature> RAINFOREST_GRASS = RuPlacementUtils.createKey("rainforest_grass");
    public static final ResourceKey<PlacedFeature> RAINFOREST_GREEN_BIOSHROOM = RuPlacementUtils.createKey("rainforest_green_bioshroom");
    public static final ResourceKey<PlacedFeature> RAINFOREST_PINK_BIOSHROOM = RuPlacementUtils.createKey("rainforest_pink_bioshroom");
    public static final ResourceKey<PlacedFeature> RAINFOREST_ELEPHANT_EAR = RuPlacementUtils.createKey("rainforest_elephant_ear");

    public static final ResourceKey<PlacedFeature> TROPICS_PALM = RuPlacementUtils.createKey("tropics_palm");
    public static final ResourceKey<PlacedFeature> TROPICS_JUNGLE_TREE = RuPlacementUtils.createKey("tropics_jungle_tree");
    public static final ResourceKey<PlacedFeature> TROPICS_BIG_JUNGLE_TREE = RuPlacementUtils.createKey("tropics_big_jungle_tree");
    public static final ResourceKey<PlacedFeature> TROPICS_SHRUB = RuPlacementUtils.createKey("tropics_shrub");
    public static final ResourceKey<PlacedFeature> TROPICS_GRASS = RuPlacementUtils.createKey("tropics_grass");
    public static final ResourceKey<PlacedFeature> TROPICS_PINK_BIOSHROOM = RuPlacementUtils.createKey("tropics_pink_bioshroom");
    public static final ResourceKey<PlacedFeature> TROPICS_RED_LUPINE = RuPlacementUtils.createKey("tropics_red_lupine");
    public static final ResourceKey<PlacedFeature> TROPICS_FELICIA_DAISY = RuPlacementUtils.createKey("tropics_felicia_daisy");
    public static final ResourceKey<PlacedFeature> TROPICS_ELEPHANT_EAR = RuPlacementUtils.createKey("tropics_elephant_ear");
    public static final ResourceKey<PlacedFeature> TROPICS_SANDY_GRASS = RuPlacementUtils.createKey("tropics_sandy_grass");
    public static final ResourceKey<PlacedFeature> TROPICS_SANDY_TALL_GRASS = RuPlacementUtils.createKey("tropics_sandy_tall_grass");

    public static final ResourceKey<PlacedFeature> AUTUMNAL_FIELDS_RED_MAPLE = RuPlacementUtils.createKey("autumnal_fields_red_maple");
    public static final ResourceKey<PlacedFeature> AUTUMNAL_FIELDS_ORANGE_MAPLE = RuPlacementUtils.createKey("autumnal_fields_orange_maple");
    public static final ResourceKey<PlacedFeature> AUTUMNAL_FIELDS_DEAD_TREE = RuPlacementUtils.createKey("autumnal_fields_dead_tree");
    public static final ResourceKey<PlacedFeature> AUTUMNAL_FIELDS_SILVER_BIRCH = RuPlacementUtils.createKey("autumnal_fields_silver_birch");
    public static final ResourceKey<PlacedFeature> AUTUMNAL_FIELDS_BIG_RED_MAPLE = RuPlacementUtils.createKey("autumnal_fields_big_red_maple");
    public static final ResourceKey<PlacedFeature> AUTUMNAL_FIELDS_BIG_ORANGE_MAPLE = RuPlacementUtils.createKey("autumnal_fields_big_orange_maple");
    public static final ResourceKey<PlacedFeature> AUTUMNAL_FIELDS_LARCH = RuPlacementUtils.createKey("autumnal_fields_larch");
    public static final ResourceKey<PlacedFeature> AUTUMNAL_FIELDS_GRASS = RuPlacementUtils.createKey("autumnal_fields_grass");

    public static final ResourceKey<PlacedFeature> AUTUMNAL_MAPLE_FOREST_RED_MAPLE = RuPlacementUtils.createKey("autumnal_maple_forest_red_maple");
    public static final ResourceKey<PlacedFeature> AUTUMNAL_MAPLE_FOREST_ORANGE_MAPLE = RuPlacementUtils.createKey("autumnal_maple_forest_orange_maple");
    public static final ResourceKey<PlacedFeature> AUTUMNAL_MAPLE_FOREST_MAPLE_TREE = RuPlacementUtils.createKey("autumnal_maple_forest_maple_tree");
    public static final ResourceKey<PlacedFeature> AUTUMNAL_MAPLE_FOREST_SILVER_BIRCH = RuPlacementUtils.createKey("autumnal_maple_forest_silver_birch");
    public static final ResourceKey<PlacedFeature> AUTUMNAL_MAPLE_FOREST_BIG_RED_MAPLE = RuPlacementUtils.createKey("autumnal_maple_forest_big_red_maple");
    public static final ResourceKey<PlacedFeature> AUTUMNAL_MAPLE_FOREST_BIG_ORANGE_MAPLE = RuPlacementUtils.createKey("autumnal_maple_forest_big_orange_maple");
    public static final ResourceKey<PlacedFeature> AUTUMNAL_MAPLE_FOREST_GRASS = RuPlacementUtils.createKey("autumnal_maple_forest_grass");

    public static final ResourceKey<PlacedFeature> AUTUMNAL_MIXED_TAIGA_SILVER_BIRCH = RuPlacementUtils.createKey("autumnal_mixed_taiga_silver_birch");
    public static final ResourceKey<PlacedFeature> AUTUMNAL_MIXED_TAIGA_MAPLE = RuPlacementUtils.createKey("autumnal_mixed_taiga_maple");
    public static final ResourceKey<PlacedFeature> AUTUMNAL_MIXED_TAIGA_BIG_ORANGE_MAPLE = RuPlacementUtils.createKey("autumnal_mixed_taiga_big_orange_maple");
    public static final ResourceKey<PlacedFeature> AUTUMNAL_MIXED_TAIGA_RED_MAPLE = RuPlacementUtils.createKey("autumnal_mixed_taiga_red_maple");
    public static final ResourceKey<PlacedFeature> AUTUMNAL_MIXED_TAIGA_ORANGE_MAPLE = RuPlacementUtils.createKey("autumnal_mixed_taiga_orange_maple");
    public static final ResourceKey<PlacedFeature> AUTUMNAL_MIXED_TAIGA_LARCH = RuPlacementUtils.createKey("autumnal_mixed_taiga_larch");
    public static final ResourceKey<PlacedFeature> AUTUMNAL_MIXED_TAIGA_GOLDEN_LARCH = RuPlacementUtils.createKey("autumnal_mixed_taiga_golden_larch");
    public static final ResourceKey<PlacedFeature> AUTUMNAL_MIXED_TAIGA_GRASS = RuPlacementUtils.createKey("autumnal_mixed_taiga_grass");

    public static final ResourceKey<PlacedFeature> WILLOW_FOREST_OAK = RuPlacementUtils.createKey("willow_forest_oak");
    public static final ResourceKey<PlacedFeature> WILLOW_FOREST_WHITE_TREE = RuPlacementUtils.createKey("willow_forest_white_tree");
    public static final ResourceKey<PlacedFeature> WILLOW_FOREST_WILLOW = RuPlacementUtils.createKey("willow_forest_willow");
    public static final ResourceKey<PlacedFeature> WILLOW_FOREST_SPRUCE = RuPlacementUtils.createKey("willow_forest_spruce");
    public static final ResourceKey<PlacedFeature> WILLOW_FOREST_DEAD_SPRUCE = RuPlacementUtils.createKey("willow_forest_dead_spruce");
    public static final ResourceKey<PlacedFeature> WILLOW_FOREST_BIG_WILLOW = RuPlacementUtils.createKey("willow_forest_big_willow");
    public static final ResourceKey<PlacedFeature> WILLOW_FOREST_BUSH = RuPlacementUtils.createKey("willow_forest_bush");
    public static final ResourceKey<PlacedFeature> WILLOW_FOREST_GRASS = RuPlacementUtils.createKey("willow_forest_grass");

    public static final ResourceKey<PlacedFeature> BOREAL_LARCH = RuPlacementUtils.createKey("boreal_larch");
    public static final ResourceKey<PlacedFeature> BOREAL_GOLDEN_LARCH = RuPlacementUtils.createKey("boreal_golden_larch");
    public static final ResourceKey<PlacedFeature> BOREAL_BUSH = RuPlacementUtils.createKey("boreal_bush");
    public static final ResourceKey<PlacedFeature> BOREAL_BIRCH = RuPlacementUtils.createKey("boreal_birch");
    public static final ResourceKey<PlacedFeature> BOREAL_SMALL_LARCH = RuPlacementUtils.createKey("boreal_small_larch");
    public static final ResourceKey<PlacedFeature> BOREAL_FERN = RuPlacementUtils.createKey("boreal_fern");
    public static final ResourceKey<PlacedFeature> BOREAL_GRASS = RuPlacementUtils.createKey("boreal_grass");

    public static final ResourceKey<PlacedFeature> CHALK_CLIFFS_BUSH = RuPlacementUtils.createKey("chalk_cliffs_bush");
    public static final ResourceKey<PlacedFeature> CHALK_CLIFFS_GRASS = RuPlacementUtils.createKey("chalk_cliffs_grass");

    public static final ResourceKey<PlacedFeature> LUPINE_PLAINS_GRASS = RuPlacementUtils.createKey("lupine_plains_grass");
    public static final ResourceKey<PlacedFeature> LUPINE_PLAINS_YELLOW_LUPINE = RuPlacementUtils.createKey("lupine_plains_yellow_lupine");
    public static final ResourceKey<PlacedFeature> LUPINE_PLAINS_RED_LUPINE = RuPlacementUtils.createKey("lupine_plains_red_lupine");
    public static final ResourceKey<PlacedFeature> LUPINE_PLAINS_BLUE_LUPINE = RuPlacementUtils.createKey("lupine_plains_blue_lupine");
    public static final ResourceKey<PlacedFeature> LUPINE_PLAINS_PURPLE_LUPINE = RuPlacementUtils.createKey("lupine_plains_purple_lupine");
    public static final ResourceKey<PlacedFeature> LUPINE_PLAINS_PINK_LUPINE = RuPlacementUtils.createKey("lupine_plains_pink_lupine");
    public static final ResourceKey<PlacedFeature> LUPINE_PLAINS_STONE_BUD = RuPlacementUtils.createKey("lupine_plains_stone_bud");

    public static final ResourceKey<PlacedFeature> STEPPE_PLAINS_GRASS = RuPlacementUtils.createKey("steppe_plains_grass");
    public static final ResourceKey<PlacedFeature> STEPPE_PLAINS_SHRUB = RuPlacementUtils.createKey("steppe_plains_shrub");
    public static final ResourceKey<PlacedFeature> STEPPE_PLAINS_TALL_GRASS = RuPlacementUtils.createKey("steppe_plains_tall_grass");
    public static final ResourceKey<PlacedFeature> STEPPE_PLAINS_DEAD_SHRUB = RuPlacementUtils.createKey("steppe_plains_dead_shrub");
    public static final ResourceKey<PlacedFeature> STEPPE_PLAINS_DESERT_SHRUB = RuPlacementUtils.createKey("steppe_plains_desert_shrub");

    public static final ResourceKey<PlacedFeature> WOODED_STEPPE_BIG_OAK = RuPlacementUtils.createKey("wooded_steppe_big_oak");
    public static final ResourceKey<PlacedFeature> WOODED_STEPPE_ACACIA = RuPlacementUtils.createKey("wooded_steppe_acacia");
    public static final ResourceKey<PlacedFeature> WOODED_STEPPE_BUSH = RuPlacementUtils.createKey("wooded_steppe_bush");
    public static final ResourceKey<PlacedFeature> WOODED_STEPPE_GRASS = RuPlacementUtils.createKey("wooded_steppe_grass");
    public static final ResourceKey<PlacedFeature> WOODED_STEPPE_SHRUB = RuPlacementUtils.createKey("wooded_steppe_shrub");
    public static final ResourceKey<PlacedFeature> WOODED_STEPPE_DEAD_SHRUB = RuPlacementUtils.createKey("wooded_steppe_dead_shrub");

    public static final ResourceKey<PlacedFeature> ARID_MOUNTAINS_STONE_SHRUB = RuPlacementUtils.createKey("arid_mountains_stone_shrub");
    public static final ResourceKey<PlacedFeature> ARID_MOUNTAINS_SHRUB = RuPlacementUtils.createKey("arid_mountains_shrub");
    public static final ResourceKey<PlacedFeature> ARID_MOUNTAINS_ACACIA_SHRUB = RuPlacementUtils.createKey("arid_mountains_acacia_shrub");
    public static final ResourceKey<PlacedFeature> ARID_MOUNTAINS_BUSH = RuPlacementUtils.createKey("arid_mountains_bush");
    public static final ResourceKey<PlacedFeature> ARID_MOUNTAINS_ACACIA = RuPlacementUtils.createKey("arid_mountains_acacia");
    public static final ResourceKey<PlacedFeature> ARID_MOUNTAINS_STONE_BUD = RuPlacementUtils.createKey("arid_mountains_stone_bud");

    public static final ResourceKey<PlacedFeature> WOODED_ARID_MOUNTAINS_STONE_SHRUB = RuPlacementUtils.createKey("wooded_arid_mountains_stone_shrub");
    public static final ResourceKey<PlacedFeature> WOODED_ARID_MOUNTAINS_SHRUB = RuPlacementUtils.createKey("wooded_arid_mountains_shrub");
    public static final ResourceKey<PlacedFeature> WOODED_ARID_MOUNTAINS_ACACIA_SHRUB = RuPlacementUtils.createKey("wooded_arid_mountains_acacia_shrub");
    public static final ResourceKey<PlacedFeature> WOODED_ARID_MOUNTAINS_BUSH = RuPlacementUtils.createKey("wooded_arid_mountains_bush");
    public static final ResourceKey<PlacedFeature> WOODED_ARID_MOUNTAINS_ACACIA = RuPlacementUtils.createKey("wooded_arid_mountains_acacia");
    public static final ResourceKey<PlacedFeature> WOODED_ARID_MOUNTAINS_STONE_BUD = RuPlacementUtils.createKey("wooded_arid_mountains_stone_bud");

    public static final ResourceKey<PlacedFeature> JOSHUA_DESERT_LARGE_JOSHUA_TREE = RuPlacementUtils.createKey("joshua_desert_large_joshua_tree");
    public static final ResourceKey<PlacedFeature> JOSHUA_DESERT_MEDIUM_JOSHUA_TREE = RuPlacementUtils.createKey("joshua_desert_medium_joshua_tree");
    public static final ResourceKey<PlacedFeature> JOSHUA_DESERT_DEAD_STEPPE_SHRUB = RuPlacementUtils.createKey("joshua_desert_dead_steppe_shrub");
    public static final ResourceKey<PlacedFeature> JOSHUA_DESERT_DESERT_SHRUB = RuPlacementUtils.createKey("joshua_desert_desert_shrub");
    public static final ResourceKey<PlacedFeature> JOSHUA_DESERT_SANDY_GRASS = RuPlacementUtils.createKey("joshua_desert_sandy_grass");

    public static final ResourceKey<PlacedFeature> PRAIRIE_BIG_OAK = RuPlacementUtils.createKey("prairie_big_oak");
    public static final ResourceKey<PlacedFeature> PRAIRIE_GRASS = RuPlacementUtils.createKey("prairie_grass");
    public static final ResourceKey<PlacedFeature> PRAIRIE_BARLEY = RuPlacementUtils.createKey("prairie_barley");

    public static final ResourceKey<PlacedFeature> BARLEY_FIELDS_BARLEY = RuPlacementUtils.createKey("barley_fields_barley");
    public static final ResourceKey<PlacedFeature> BARLEY_FIELDS_GRASS = RuPlacementUtils.createKey("barley_fields_grass");

    public static final ResourceKey<PlacedFeature> OLD_GROWTH_BOREAL_LARCH = RuPlacementUtils.createKey("old_growth_boreal_larch");
    public static final ResourceKey<PlacedFeature> OLD_GROWTH_BOREAL_GOLDEN_LARCH = RuPlacementUtils.createKey("old_growth_boreal_golden_larch");
    public static final ResourceKey<PlacedFeature> OLD_GROWTH_BOREAL_BUSH = RuPlacementUtils.createKey("old_growth_boreal_bush");
    public static final ResourceKey<PlacedFeature> OLD_GROWTH_BOREAL_BIRCH = RuPlacementUtils.createKey("old_growth_boreal_birch");
    public static final ResourceKey<PlacedFeature> OLD_GROWTH_BOREAL_SMALL_LARCH = RuPlacementUtils.createKey("old_growth_boreal_small_larch");
    public static final ResourceKey<PlacedFeature> OLD_GROWTH_BOREAL_FERN = RuPlacementUtils.createKey("old_growth_boreal_fern");
    public static final ResourceKey<PlacedFeature> OLD_GROWTH_BOREAL_GRASS = RuPlacementUtils.createKey("old_growth_boreal_grass");
    public static final ResourceKey<PlacedFeature> OLD_GROWTH_BOREAL_TALL_GRASS = RuPlacementUtils.createKey("old_growth_boreal_tall_grass");

    public static final ResourceKey<PlacedFeature> GOLDEN_BOREAL_LARCH = RuPlacementUtils.createKey("golden_boreal_larch");
    public static final ResourceKey<PlacedFeature> GOLDEN_BOREAL_GOLDEN_LARCH = RuPlacementUtils.createKey("golden_boreal_golden_larch");
    public static final ResourceKey<PlacedFeature> GOLDEN_BOREAL_BUSH = RuPlacementUtils.createKey("golden_boreal_bush");
    public static final ResourceKey<PlacedFeature> GOLDEN_BOREAL_BIRCH = RuPlacementUtils.createKey("golden_boreal_birch");
    public static final ResourceKey<PlacedFeature> GOLDEN_BOREAL_SMALL_LARCH = RuPlacementUtils.createKey("golden_boreal_small_larch");
    public static final ResourceKey<PlacedFeature> GOLDEN_BOREAL_FERN = RuPlacementUtils.createKey("golden_boreal_fern");
    public static final ResourceKey<PlacedFeature> GOLDEN_BOREAL_GRASS = RuPlacementUtils.createKey("golden_boreal_grass");

    public static final ResourceKey<PlacedFeature> ALPHA_GROVE_TREE = RuPlacementUtils.createKey("alpha_grove_tree");
    public static final ResourceKey<PlacedFeature> ALPHA_GROVE_ROSE = RuPlacementUtils.createKey("alpha_grove_rose");
    public static final ResourceKey<PlacedFeature> ALPHA_GROVE_DANDELION = RuPlacementUtils.createKey("alpha_grove_dandelion");

    public static final ResourceKey<PlacedFeature> SILVER_BIRCH_FOREST_ASPEN = RuPlacementUtils.createKey("silver_birch_forest_aspen");
    public static final ResourceKey<PlacedFeature> SILVER_BIRCH_FOREST_SILVER_BIRCH = RuPlacementUtils.createKey("silver_birch_forest_silver_birch");
    public static final ResourceKey<PlacedFeature> SILVER_BIRCH_FOREST_BIRCH = RuPlacementUtils.createKey("silver_birch_forest_birch");
    public static final ResourceKey<PlacedFeature> SILVER_BIRCH_FOREST_GRASS = RuPlacementUtils.createKey("silver_birch_forest_grass");
    public static final ResourceKey<PlacedFeature> SILVER_BIRCH_FOREST_SEEDED_GRASS = RuPlacementUtils.createKey("silver_birch_forest_seeded_grass");
    public static final ResourceKey<PlacedFeature> SILVER_BIRCH_FOREST_TASSEL = RuPlacementUtils.createKey("silver_birch_forest_tassel");

    public static final ResourceKey<PlacedFeature> DECIDUOUS_FOREST_BUSH = RuPlacementUtils.createKey("deciduous_forest_bush");
    public static final ResourceKey<PlacedFeature> DECIDUOUS_FOREST_OAK = RuPlacementUtils.createKey("deciduous_forest_oak");
    public static final ResourceKey<PlacedFeature> DECIDUOUS_FOREST_BIG_OAK = RuPlacementUtils.createKey("deciduous_forest_big_oak");

    public static final ResourceKey<PlacedFeature> ORCHARD_APPLE_OAK = RuPlacementUtils.createKey("orchard_apple_oak");
    public static final ResourceKey<PlacedFeature> ORCHARD_BIG_APPLE_OAK = RuPlacementUtils.createKey("orchard_big_apple_oak");
    public static final ResourceKey<PlacedFeature> ORCHARD_BIG_OAK = RuPlacementUtils.createKey("orchard_big_oak");
    public static final ResourceKey<PlacedFeature> ORCHARD_TASSEL = RuPlacementUtils.createKey("orchard_tassel");
    public static final ResourceKey<PlacedFeature> ORCHARD_DAISY = RuPlacementUtils.createKey("orchard_daisy");
    public static final ResourceKey<PlacedFeature> ORCHARD_GRASS = RuPlacementUtils.createKey("orchard_grass");

    public static final ResourceKey<PlacedFeature> REDWOODS_GIANT_REDWOOD = RuPlacementUtils.createKey("redwoods_giant_redwood");
    public static final ResourceKey<PlacedFeature> REDWOODS_REDWOOD = RuPlacementUtils.createKey("redwoods_redwood");
    public static final ResourceKey<PlacedFeature> REDWOODS_BUSH = RuPlacementUtils.createKey("redwoods_bush");
    public static final ResourceKey<PlacedFeature> REDWOODS_GRASS = RuPlacementUtils.createKey("redwoods_grass");

    public static final ResourceKey<PlacedFeature> SPARSE_REDWOODS_REDWOOD = RuPlacementUtils.createKey("sparse_redwoods_redwood");
    public static final ResourceKey<PlacedFeature> SPARSE_REDWOODS_BUSH = RuPlacementUtils.createKey("sparse_redwoods_bush");
    public static final ResourceKey<PlacedFeature> SPARSE_REDWOODS_GRASS = RuPlacementUtils.createKey("sparse_redwoods_grass");

    public static final ResourceKey<PlacedFeature> GIANT_BAYOU_BIG_CYPRESS = RuPlacementUtils.createKey("giant_bayou_big_cypress");
    public static final ResourceKey<PlacedFeature> GIANT_BAYOU_BIG_CYPRESS_MOSS = RuPlacementUtils.createKey("giant_bayou_big_cypress_moss");
    public static final ResourceKey<PlacedFeature> GIANT_BAYOU_SHRUB = RuPlacementUtils.createKey("giant_bayou_shrub");
    public static final ResourceKey<PlacedFeature> GIANT_BAYOU_OAK_TREE = RuPlacementUtils.createKey("giant_bayou_oak_tree");
    public static final ResourceKey<PlacedFeature> GIANT_BAYOU_BIG_WILLOW = RuPlacementUtils.createKey("giant_bayou_big_willow");
    public static final ResourceKey<PlacedFeature> GIANT_BAYOU_BUSH = RuPlacementUtils.createKey("giant_bayou_bush");
    public static final ResourceKey<PlacedFeature> GIANT_BAYOU_GRASS = RuPlacementUtils.createKey("giant_bayou_grass");
    public static final ResourceKey<PlacedFeature> GIANT_BAYOU_TALL_GRASS = RuPlacementUtils.createKey("giant_bayou_tall_grass");
    public static final ResourceKey<PlacedFeature> GIANT_BAYOU_ELEPHANT_EAR = RuPlacementUtils.createKey("giant_bayou_elephant_ear");
    public static final ResourceKey<PlacedFeature> GIANT_BAYOU_FERN = RuPlacementUtils.createKey("giant_bayou_fern");

    public static final ResourceKey<PlacedFeature> BAYOU_WILLOW = RuPlacementUtils.createKey("bayou_willow");
    public static final ResourceKey<PlacedFeature> BAYOU_BUSH = RuPlacementUtils.createKey("bayou_bush");
    public static final ResourceKey<PlacedFeature> BAYOU_OAK = RuPlacementUtils.createKey("bayou_oak");
    public static final ResourceKey<PlacedFeature> BAYOU_MOSSY_CYPRESS = RuPlacementUtils.createKey("bayou_mossy_cypress");
    public static final ResourceKey<PlacedFeature> BAYOU_CYPRESS = RuPlacementUtils.createKey("bayou_cypress");
    public static final ResourceKey<PlacedFeature> BAYOU_BIG_CYPRESS = RuPlacementUtils.createKey("bayou_big_cypress");
    public static final ResourceKey<PlacedFeature> BAYOU_BIG_MOSSY_CYPRESS = RuPlacementUtils.createKey("bayou_big_mossy_cypress");
    public static final ResourceKey<PlacedFeature> BAYOU_GRASS = RuPlacementUtils.createKey("bayou_grass");
    public static final ResourceKey<PlacedFeature> BAYOU_ELEPHANT_EAR = RuPlacementUtils.createKey("bayou_elephant_ear");
    public static final ResourceKey<PlacedFeature> BAYOU_FERN = RuPlacementUtils.createKey("bayou_fern");

    public static final ResourceKey<PlacedFeature> BAMBOO_FOREST_GIANT_BAMBOO = RuPlacementUtils.createKey("bamboo_forest_giant_bamboo");
    public static final ResourceKey<PlacedFeature> BAMBOO_FOREST_TSUBAKI = RuPlacementUtils.createKey("bamboo_forest_tsubaki");
    public static final ResourceKey<PlacedFeature> BAMBOO_FOREST_SHRUB = RuPlacementUtils.createKey("bamboo_forest_shrub");
    public static final ResourceKey<PlacedFeature> BAMBOO_FOREST_GRASS = RuPlacementUtils.createKey("bamboo_forest_grass");

    public static final ResourceKey<PlacedFeature> POPPY_FIELDS_POPPY_BUSH = RuPlacementUtils.createKey("poppy_fields_poppy_bush");
    public static final ResourceKey<PlacedFeature> POPPY_FIELDS_POPPY = RuPlacementUtils.createKey("poppy_fields_poppy");
    public static final ResourceKey<PlacedFeature> POPPY_FIELDS_GRASS = RuPlacementUtils.createKey("poppy_fields_grass");

    public static final ResourceKey<PlacedFeature> PINE_FOREST_PINE = RuPlacementUtils.createKey("pine_forest_pine");
    public static final ResourceKey<PlacedFeature> PINE_FOREST_TALL_PINE = RuPlacementUtils.createKey("pine_forest_tall_pine");
    public static final ResourceKey<PlacedFeature> PINE_FOREST_SHRUB = RuPlacementUtils.createKey("pine_forest_shrub");
    public static final ResourceKey<PlacedFeature> PINE_FOREST_GRASS = RuPlacementUtils.createKey("pine_forest_grass");
    public static final ResourceKey<PlacedFeature> PINE_FOREST_TALL_GRASS = RuPlacementUtils.createKey("pine_forest_tall_grass");

    public static final ResourceKey<PlacedFeature> CHERRY_HILLS_CHERRY_TREE = RuPlacementUtils.createKey("cherry_hills_cherry_tree");
    public static final ResourceKey<PlacedFeature> CHERRY_HILLS_BIG_CHERRY_TREE = RuPlacementUtils.createKey("cherry_hills_big_cherry_tree");
    public static final ResourceKey<PlacedFeature> CHERRY_HILLS_RED_CHERRY_TREE = RuPlacementUtils.createKey("cherry_hills_red_cherry_tree");
    public static final ResourceKey<PlacedFeature> CHERRY_HILLS_RED_BIG_CHERRY_TREE = RuPlacementUtils.createKey("cherry_hills_red_big_cherry_tree");
    public static final ResourceKey<PlacedFeature> CHERRY_HILLS_PINK_CHERRY_TREE = RuPlacementUtils.createKey("cherry_hills_pink_cherry_tree");
    public static final ResourceKey<PlacedFeature> CHERRY_HILLS_PINK_BIG_CHERRY_TREE = RuPlacementUtils.createKey("cherry_hills_pink_big_cherry_tree");
    public static final ResourceKey<PlacedFeature> CHERRY_HILLS_WHITE_CHERRY_TREE = RuPlacementUtils.createKey("cherry_hills_white_cherry_tree");
    public static final ResourceKey<PlacedFeature> CHERRY_HILLS_WHITE_BIG_CHERRY_TREE = RuPlacementUtils.createKey("cherry_hills_white_big_cherry_tree");
    public static final ResourceKey<PlacedFeature> CHERRY_HILLS_GRASS = RuPlacementUtils.createKey("cherry_hills_grass");
    public static final ResourceKey<PlacedFeature> CHERRY_HILLS_TSUBAKI = RuPlacementUtils.createKey("cherry_hills_tsubaki");

    public static final ResourceKey<PlacedFeature> TEMPERATE_GROVE_MAPLE_TREE = RuPlacementUtils.createKey("temperate_grove_maple_tree");
    public static final ResourceKey<PlacedFeature> TEMPERATE_GROVE_BIRCH_TREE = RuPlacementUtils.createKey("temperate_grove_birch_tree");
    public static final ResourceKey<PlacedFeature> TEMPERATE_GROVE_OAK_TREE = RuPlacementUtils.createKey("temperate_grove_oak_tree");
    public static final ResourceKey<PlacedFeature> TEMPERATE_GROVE_LARCH = RuPlacementUtils.createKey("temperate_grove_larch");
    public static final ResourceKey<PlacedFeature> TEMPERATE_GROVE_BUSH = RuPlacementUtils.createKey("temperate_grove_bush");
    public static final ResourceKey<PlacedFeature> TEMPERATE_GROVE_GRASS = RuPlacementUtils.createKey("temperate_grove_grass");
    public static final ResourceKey<PlacedFeature> TEMPERATE_GROVE_TASSEL = RuPlacementUtils.createKey("temperate_grove_tassel");
    public static final ResourceKey<PlacedFeature> TEMPERATE_GROVE_DAISY = RuPlacementUtils.createKey("temperate_grove_daisy");

    public static final ResourceKey<PlacedFeature> EUCALYPTUS_FOREST_EUCALYPTUS_TREE = RuPlacementUtils.createKey("eucalyptus_forest_eucalyptus_tree");
    public static final ResourceKey<PlacedFeature> EUCALYPTUS_FOREST_SHRUB = RuPlacementUtils.createKey("eucalyptus_forest_shrub");
    public static final ResourceKey<PlacedFeature> EUCALYPTUS_FOREST_GRASS = RuPlacementUtils.createKey("eucalyptus_forest_grass");
    public static final ResourceKey<PlacedFeature> EUCALYPTUS_FOREST_ELEPHANT_EAR = RuPlacementUtils.createKey("eucalyptus_forest_elephant_ear");
    public static final ResourceKey<PlacedFeature> EUCALYPTUS_FOREST_WARATAH = RuPlacementUtils.createKey("eucalyptus_forest_waratah");

    public static final ResourceKey<PlacedFeature> ROOFED_EUCALYPTUS_FOREST_EUCALYPTUS_TREE_CANOPY = RuPlacementUtils.createKey("roofed_eucalyptus_forest_eucalyptus_tree_canopy");
    public static final ResourceKey<PlacedFeature> ROOFED_EUCALYPTUS_FOREST_EUCALYPTUS_TREE = RuPlacementUtils.createKey("roofed_eucalyptus_forest_eucalyptus_tree");
    public static final ResourceKey<PlacedFeature> ROOFED_EUCALYPTUS_FOREST_SHRUB = RuPlacementUtils.createKey("roofed_eucalyptus_forest_shrub");
    public static final ResourceKey<PlacedFeature> ROOFED_EUCALYPTUS_FOREST_SAPLING = RuPlacementUtils.createKey("roofed_eucalyptus_forest_sapling");
    public static final ResourceKey<PlacedFeature> ROOFED_EUCALYPTUS_FOREST_GRASS = RuPlacementUtils.createKey("roofed_eucalyptus_forest_grass");
    public static final ResourceKey<PlacedFeature> ROOFED_EUCALYPTUS_FOREST_ELEPHANT_EAR = RuPlacementUtils.createKey("roofed_eucalyptus_forest_elephant_ear");
    public static final ResourceKey<PlacedFeature> ROOFED_EUCALYPTUS_FOREST_WARATAH = RuPlacementUtils.createKey("roofed_eucalyptus_forest_waratah");

    public static final ResourceKey<PlacedFeature> MAUVE_HILLS_MAUVE_OAK = RuPlacementUtils.createKey("mauve_hills_mauve_oak");
    public static final ResourceKey<PlacedFeature> MAUVE_HILLS_BIG_MAUVE_OAK = RuPlacementUtils.createKey("mauve_hills_big_mauve_oak");
    public static final ResourceKey<PlacedFeature> MAUVE_HILLS_OAK = RuPlacementUtils.createKey("mauve_hills_oak");
    public static final ResourceKey<PlacedFeature> MAUVE_HILLS_GRASS = RuPlacementUtils.createKey("mauve_hills_grass");
    public static final ResourceKey<PlacedFeature> MAUVE_HILLS_PURPLE_LUPINE = RuPlacementUtils.createKey("mauve_hills_purple_lupine");
    public static final ResourceKey<PlacedFeature> MAUVE_HILLS_PINK_LUPINE = RuPlacementUtils.createKey("mauve_hills_pink_lupine");
    public static final ResourceKey<PlacedFeature> MAUVE_HILLS_PINK_BIOSHROOM = RuPlacementUtils.createKey("mauve_hills_pink_bioshroom");

    public static final ResourceKey<PlacedFeature> TOWERING_CLIFFS_PINE = RuPlacementUtils.createKey("towering_cliffs_pine");
    public static final ResourceKey<PlacedFeature> TOWERING_CLIFFS_DEAD_PINE = RuPlacementUtils.createKey("towering_cliffs_dead_pine");
    public static final ResourceKey<PlacedFeature> TOWERING_CLIFFS_GRASS = RuPlacementUtils.createKey("towering_cliffs_grass");
    public static final ResourceKey<PlacedFeature> TOWERING_CLIFFS_HYSSOP = RuPlacementUtils.createKey("towering_cliffs_hyssop");
    public static final ResourceKey<PlacedFeature> TOWERING_CLIFFS_FERNS = RuPlacementUtils.createKey("towering_cliffs_ferns");

    public static final ResourceKey<PlacedFeature> FUNGAL_FEN_BROWN_MUSHROOM = RuPlacementUtils.createKey("fungal_fen_brown_mushroom");
    public static final ResourceKey<PlacedFeature> FUNGAL_FEN_RED_MUSHROOM = RuPlacementUtils.createKey("fungal_fen_red_mushroom");
    public static final ResourceKey<PlacedFeature> FUNGAL_FEN_PINE = RuPlacementUtils.createKey("fungal_fen_pine");
    public static final ResourceKey<PlacedFeature> FUNGAL_FEN_GRASS = RuPlacementUtils.createKey("fungal_fen_grass");
    public static final ResourceKey<PlacedFeature> FUNGAL_FEN_ELEPHANT_EAR = RuPlacementUtils.createKey("fungal_fen_elephant_ear");
    public static final ResourceKey<PlacedFeature> FUNGAL_FEN_FERN = RuPlacementUtils.createKey("fungal_fen_fern");
    public static final ResourceKey<PlacedFeature> FUNGAL_FEN_GREEN_BIOSHROOM = RuPlacementUtils.createKey("fungal_fen_green_bioshroom");
    public static final ResourceKey<PlacedFeature> FUNGAL_FEN_BLUE_BIOSHROOM = RuPlacementUtils.createKey("fungal_fen_blue_bioshroom");

    public static final ResourceKey<PlacedFeature> OUTBACK_SHRUB = RuPlacementUtils.createKey("outback_shrub");
    public static final ResourceKey<PlacedFeature> OUTBACK_SHRUB_DENSE = RuPlacementUtils.createKey("outback_shrub_dense");
    public static final ResourceKey<PlacedFeature> OUTBACK_GRASS = RuPlacementUtils.createKey("outback_grass");
    public static final ResourceKey<PlacedFeature> OUTBACK_DEAD_STEPPE_SHRUB = RuPlacementUtils.createKey("outback_dead_steppe_shrub");
    public static final ResourceKey<PlacedFeature> OUTBACK_DESERT_SHRUB = RuPlacementUtils.createKey("outback_desert_shrub");
    public static final ResourceKey<PlacedFeature> OUTBACK_STONE_BUD = RuPlacementUtils.createKey("outback_stone_bud");

    public static final ResourceKey<PlacedFeature> SAGUARO_DESERT_CACTUS = RuPlacementUtils.createKey("saguaro_desert_cactus");
    public static final ResourceKey<PlacedFeature> SAGUARO_DESERT_GRASS = RuPlacementUtils.createKey("saguaro_desert_grass");
    public static final ResourceKey<PlacedFeature> SAGUARO_DESERT_SANDY_GRASS = RuPlacementUtils.createKey("saguaro_desert_sandy_grass");
    public static final ResourceKey<PlacedFeature> SAGUARO_DESERT_BARREL_CACTUS = RuPlacementUtils.createKey("saguaro_desert_barrel_cactus");

    public static final ResourceKey<PlacedFeature> FROZEN_TUNDRA_SHRUB = RuPlacementUtils.createKey("frozen_tundra_shrub");
    public static final ResourceKey<PlacedFeature> FROZEN_TUNDRA_MAPLE_SHRUB = RuPlacementUtils.createKey("frozen_tundra_maple_shrub");
    public static final ResourceKey<PlacedFeature> FROZEN_TUNDRA_SHRUB_SNOW = RuPlacementUtils.createKey("frozen_tundra_shrub_snow");
    public static final ResourceKey<PlacedFeature> FROZEN_TUNDRA_MAPLE_SHRUB_SNOW = RuPlacementUtils.createKey("frozen_tundra_maple_shrub_snow");
    public static final ResourceKey<PlacedFeature> FROZEN_TUNDRA_SNOWY_GRASS = RuPlacementUtils.createKey("frozen_tundra_snowy_grass");
    public static final ResourceKey<PlacedFeature> FROZEN_TUNDRA_GRASS = RuPlacementUtils.createKey("frozen_tundra_grass");

    public static final ResourceKey<PlacedFeature> DRY_BRUSHLAND_ACACIA = RuPlacementUtils.createKey("dry_brushland_acacia");
    public static final ResourceKey<PlacedFeature> DRY_BRUSHLAND_SHRUB = RuPlacementUtils.createKey("dry_brushland_shrub");
    public static final ResourceKey<PlacedFeature> DRY_BRUSHLAND_JOSHUA_SHRUB = RuPlacementUtils.createKey("dry_brushland_joshua_shrub");
    public static final ResourceKey<PlacedFeature> DRY_BRUSHLAND_SHRUB_SAND = RuPlacementUtils.createKey("dry_brushland_shrub_sand");
    public static final ResourceKey<PlacedFeature> DRY_BRUSHLAND_JOSHUA_SHRUB_SAND = RuPlacementUtils.createKey("dry_brushland_joshua_shrub_sand");
    public static final ResourceKey<PlacedFeature> DRY_BRUSHLAND_SANDY_GRASS = RuPlacementUtils.createKey("dry_brushland_sandy_grass");
    public static final ResourceKey<PlacedFeature> DRY_BRUSHLAND_GRASS = RuPlacementUtils.createKey("dry_brushland_grass");
    public static final ResourceKey<PlacedFeature> DRY_BRUSHLAND_DESERT_GRASS = RuPlacementUtils.createKey("dry_brushland_desert_grass");
    public static final ResourceKey<PlacedFeature> DRY_BRUSHLAND_FIREWEED = RuPlacementUtils.createKey("dry_brushland_fireweed");

    public static final ResourceKey<PlacedFeature> COLD_DECIDUOUS_FOREST_BUSH = RuPlacementUtils.createKey("cold_deciduous_forest_bush");
    public static final ResourceKey<PlacedFeature> COLD_DECIDUOUS_FOREST_OAK = RuPlacementUtils.createKey("cold_deciduous_forest_oak");
    public static final ResourceKey<PlacedFeature> COLD_DECIDUOUS_FOREST_BIG_OAK = RuPlacementUtils.createKey("cold_deciduous_forest_big_oak");
    public static final ResourceKey<PlacedFeature> COLD_DECIDUOUS_FOREST_GRASS = RuPlacementUtils.createKey("cold_deciduous_forest_grass");

    public static final ResourceKey<PlacedFeature> ICY_DESERT_STONE_BUD = RuPlacementUtils.createKey("icy_desert_stone_bud");
    public static final ResourceKey<PlacedFeature> ICY_DESERT_SNOWY_GRASS = RuPlacementUtils.createKey("icy_desert_snowy_grass");

    public static final ResourceKey<PlacedFeature> SPIRES_SNOWY_GRASS = RuPlacementUtils.createKey("spires_snowy_grass");

    public static final ResourceKey<PlacedFeature> SMOULDERING_WOODLAND_OAK = RuPlacementUtils.createKey("smouldering_woodland_oak");
    public static final ResourceKey<PlacedFeature> SMOULDERING_WOODLAND_DEAD_PINE = RuPlacementUtils.createKey("smouldering_woodland_dead_pine");
    public static final ResourceKey<PlacedFeature> SMOULDERING_WOODLAND_PINE = RuPlacementUtils.createKey("smouldering_woodland_pine");
    public static final ResourceKey<PlacedFeature> SMOULDERING_WOODLAND_DORCEL = RuPlacementUtils.createKey("smouldering_woodland_dorcel");
    public static final ResourceKey<PlacedFeature> SMOULDERING_WOODLAND_TRILLIUM = RuPlacementUtils.createKey("smouldering_woodland_trillium");
    public static final ResourceKey<PlacedFeature> SMOULDERING_WOODLAND_DEAD_STEPPE_SHRUB = RuPlacementUtils.createKey("smouldering_woodland_dead_steppe_shrub");
    public static final ResourceKey<PlacedFeature> SMOULDERING_WOODLAND_DESERT_SHRUB = RuPlacementUtils.createKey("smouldering_woodland_desert_shrub");

    public static final ResourceKey<PlacedFeature> FROZEN_FOREST_PINE = RuPlacementUtils.createKey("frozen_forest_pine");
    public static final ResourceKey<PlacedFeature> FROZEN_FOREST_TALL_PINE = RuPlacementUtils.createKey("frozen_forest_tall_pine");
    public static final ResourceKey<PlacedFeature> FROZEN_FOREST_SNOWY_GRASS = RuPlacementUtils.createKey("frozen_forest_snowy_grass");

    public static final ResourceKey<PlacedFeature> MEADOW_MAUVE_OAK = RuPlacementUtils.createKey("meadow_mauve_oak_bee");
    public static final ResourceKey<PlacedFeature> MEADOW_MAUVE_OAK_BEE = RuPlacementUtils.createKey("meadow_mauve_oak");
    public static final ResourceKey<PlacedFeature> MEADOW_GRASS = RuPlacementUtils.createKey("meadow_grass");

    public static final ResourceKey<PlacedFeature> FLOODED_PLAINS_GRASS = RuPlacementUtils.createKey("flooded_plains_grass");
    public static final ResourceKey<PlacedFeature> FLOODED_PLAINS_TALL_GRASS = RuPlacementUtils.createKey("flooded_plains_tall_grass");

    public static final ResourceKey<PlacedFeature> LUSH_DELTA_AZALEA = RuPlacementUtils.createKey("lush_delta_azalea");

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> featureGetter = context.lookup(Registries.CONFIGURED_FEATURE);

        final Holder<ConfiguredFeature<?, ?>> SCORCH_TREES = featureGetter.getOrThrow(RuTreeFeatures.DEAD_OAK_BUSH);

        final Holder<ConfiguredFeature<?, ?>> LUSH_DELTA_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_GRASS);
        final Holder<ConfiguredFeature<?, ?>> LUSH_DELTA_TALL_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_TALL_GRASS);
        final Holder<ConfiguredFeature<?, ?>> LUSH_DELTA_YELLOW_BIOSHROOM = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_YELLOW_BIOSHROOM);
        final Holder<ConfiguredFeature<?, ?>> LUSH_DELTA_PINK_BIOSHROOM = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_PINK_BIOSHROOM);
        final Holder<ConfiguredFeature<?, ?>> LUSH_DELTA_TREES = featureGetter.getOrThrow(TreeFeatures.AZALEA_TREE);

        final Holder<ConfiguredFeature<?, ?>> PRISMACHASM_SPROUT = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_PRISMOSS_SPROUT);
        final Holder<ConfiguredFeature<?, ?>> PRISMACHASM_CRYSTAL = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_PRISMARITE);
        final Holder<ConfiguredFeature<?, ?>> PRISMACHASM_HYSSOP = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_CAVE_HYSSOP);
        final Holder<ConfiguredFeature<?, ?>> PRISMACHASM_GREEN_BIOSHROOM = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_GREEN_BIOSHROOM);
        final Holder<ConfiguredFeature<?, ?>> PRISMACHASM_BLUE_BIOSHROOM = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_BLUE_BIOSHROOM);
        final Holder<ConfiguredFeature<?, ?>> PRISMACHASM_PINK_BIOSHROOM = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_PINK_BIOSHROOM);
        final Holder<ConfiguredFeature<?, ?>> PRISMACHASM_YELLOW_BIOSHROOM = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_YELLOW_BIOSHROOM);

        final Holder<ConfiguredFeature<?, ?>> BIOSHROOM_CAVES_GIANT_GREEN_BIOSHROOM = featureGetter.getOrThrow(RuVegetationFeatures.GIANT_GREEN_BIOSHROOM);
        final Holder<ConfiguredFeature<?, ?>> BIOSHROOM_CAVES_GIANT_BLUE_BIOSHROOM = featureGetter.getOrThrow(RuVegetationFeatures.GIANT_BLUE_BIOSHROOM);
        final Holder<ConfiguredFeature<?, ?>> BIOSHROOM_CAVES_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_GRASS);
        final Holder<ConfiguredFeature<?, ?>> BIOSHROOM_CAVES_TALL_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_TALL_GRASS);
        final Holder<ConfiguredFeature<?, ?>> BIOSHROOM_CAVES_HYSSOP = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_CAVE_HYSSOP);
        final Holder<ConfiguredFeature<?, ?>> BIOSHROOM_CAVES_GREEN_BIOSHROOM = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_GREEN_BIOSHROOM);
        final Holder<ConfiguredFeature<?, ?>> BIOSHROOM_CAVES_BLUE_BIOSHROOM = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_BLUE_BIOSHROOM);
        final Holder<ConfiguredFeature<?, ?>> BIOSHROOM_CAVES_PINK_BIOSHROOM = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_PINK_BIOSHROOM);

        final Holder<ConfiguredFeature<?, ?>> PINE_SLOPES_BUSH = featureGetter.getOrThrow(RuTreeFeatures.OAK_BUSH);
        final Holder<ConfiguredFeature<?, ?>> PINE_SLOPES_OAK = featureGetter.getOrThrow(TreeFeatures.OAK);
        final Holder<ConfiguredFeature<?, ?>> PINE_SLOPES_PINE = featureGetter.getOrThrow(RuTreeFeatures.SMALL_PINE);

        final Holder<ConfiguredFeature<?, ?>> MOUNTAINS_BUSH = featureGetter.getOrThrow(RuTreeFeatures.OAK_BUSH);
        final Holder<ConfiguredFeature<?, ?>> MOUNTAINS_OAK = featureGetter.getOrThrow(TreeFeatures.OAK);
        final Holder<ConfiguredFeature<?, ?>> MOUNTAINS_PINE = featureGetter.getOrThrow(RuTreeFeatures.SMALL_SCOTTS_PINE);
        final Holder<ConfiguredFeature<?, ?>> MOUNTAINS_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_GRASS);

        final Holder<ConfiguredFeature<?, ?>> LUSH_HILLS_BUSH = featureGetter.getOrThrow(RuTreeFeatures.OAK_BUSH);
        final Holder<ConfiguredFeature<?, ?>> LUSH_HILLS_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_GRASS);

        final Holder<ConfiguredFeature<?, ?>> MUDDY_RIVER_SHRUB = featureGetter.getOrThrow(RuTreeFeatures.OAK_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> MUDDY_RIVER_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_TALL_GRASS);

        final Holder<ConfiguredFeature<?, ?>> GRASSY_BEACH_SANDY_GRASS = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_SANDY_GRASS);
        final Holder<ConfiguredFeature<?, ?>> GRASSY_BEACH_SANDY_TALL_GRASS = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_SANDY_TALL_GRASS);

        final Holder<ConfiguredFeature<?, ?>> CANADIAN_FOREST_PINE = featureGetter.getOrThrow(RuTreeFeatures.PINE_TREE);
        final Holder<ConfiguredFeature<?, ?>> CANADIAN_FOREST_DEAD_SPRUCE = featureGetter.getOrThrow(RuTreeFeatures.DEAD_PINE_TREE);
        final Holder<ConfiguredFeature<?, ?>> CANADIAN_FOREST_MAPLE = featureGetter.getOrThrow(RuTreeFeatures.BIG_MAPLE_TREE);
        final Holder<ConfiguredFeature<?, ?>> CANADIAN_FOREST_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_GRASS);
        final Holder<ConfiguredFeature<?, ?>> CANADIAN_FOREST_TRILLIUM = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_WHITE_TRILLIUM);
        final Holder<ConfiguredFeature<?, ?>> CANADIAN_FOREST_TALL_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_TALL_GRASS);

        final Holder<ConfiguredFeature<?, ?>> MAPLE_FOREST_MAPLE = featureGetter.getOrThrow(RuTreeFeatures.MAPLE_TREE);
        final Holder<ConfiguredFeature<?, ?>> MAPLE_FOREST_RED_MAPLE = featureGetter.getOrThrow(RuTreeFeatures.RED_MAPLE_TREE);
        final Holder<ConfiguredFeature<?, ?>> MAPLE_FOREST_BIG_MAPLE = featureGetter.getOrThrow(RuTreeFeatures.BIG_MAPLE_TREE);
        final Holder<ConfiguredFeature<?, ?>> MAPLE_FOREST_PINE = featureGetter.getOrThrow(RuTreeFeatures.SPRUCE);
        final Holder<ConfiguredFeature<?, ?>> MAPLE_FOREST_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_GRASS);
        final Holder<ConfiguredFeature<?, ?>> MAPLE_FOREST_STONE_BUD = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_STONE_BUD);
        final Holder<ConfiguredFeature<?, ?>> MAPLE_FOREST_TRILLIUM = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_WHITE_TRILLIUM);

        final Holder<ConfiguredFeature<?, ?>> FEN_SHRUB = featureGetter.getOrThrow(RuTreeFeatures.OAK_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> FEN_BUSH = featureGetter.getOrThrow(RuTreeFeatures.OAK_BUSH);
        final Holder<ConfiguredFeature<?, ?>> FEN_PINE = featureGetter.getOrThrow(RuTreeFeatures.PINE_TREE);
        final Holder<ConfiguredFeature<?, ?>> FEN_DEAD_PINE = featureGetter.getOrThrow(RuTreeFeatures.DEAD_PINE_TREE);
        final Holder<ConfiguredFeature<?, ?>> FEN_DEAD_OAK = featureGetter.getOrThrow(RuTreeFeatures.DEAD_TRUNK);
        final Holder<ConfiguredFeature<?, ?>> FEN_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_GRASS);
        final Holder<ConfiguredFeature<?, ?>> FEN_CATTAILS = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_CATTAIL);

        final Holder<ConfiguredFeature<?, ?>> BLACKWOOD_FOREST_TALL_BLACKWOOD = featureGetter.getOrThrow(RuTreeFeatures.TALL_BLACKWOOD);
        final Holder<ConfiguredFeature<?, ?>> BLACKWOOD_FOREST_OAK = featureGetter.getOrThrow(RuTreeFeatures.BLACKWOOD_OAK);
        final Holder<ConfiguredFeature<?, ?>> BLACKWOOD_FOREST_BLACKWOOD = featureGetter.getOrThrow(RuTreeFeatures.SMALL_BLACKWOOD);
        final Holder<ConfiguredFeature<?, ?>> BLACKWOOD_FOREST_MUSHROOM = featureGetter.getOrThrow(RuTreeFeatures.BLACKWOOD_MUSHROOMS);
        final Holder<ConfiguredFeature<?, ?>> BLACKWOOD_FOREST_DARK_OAK = featureGetter.getOrThrow(RuTreeFeatures.BLACKWOOD_DARK_OAK);
        final Holder<ConfiguredFeature<?, ?>> BLACKWOOD_FOREST_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_GRASS);
        final Holder<ConfiguredFeature<?, ?>> BLACKWOOD_FOREST_TALL_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_TALL_GRASS);
        final Holder<ConfiguredFeature<?, ?>> BLACKWOOD_FOREST_PINK_BIOSHROOM = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_PINK_BIOSHROOM);
        final Holder<ConfiguredFeature<?, ?>> BLACKWOOD_FOREST_BLUE_BIOSHROOM = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_BLUE_BIOSHROOM);

        final Holder<ConfiguredFeature<?, ?>> FLOWER_FIELD_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_GRASS);
        final Holder<ConfiguredFeature<?, ?>> FLOWER_FIELD_YELLOW_LUPINE = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_YELLOW_LUPINE);
        final Holder<ConfiguredFeature<?, ?>> FLOWER_FIELD_RED_LUPINE = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_RED_LUPINE);
        final Holder<ConfiguredFeature<?, ?>> FLOWER_FIELD_PINK_LUPINE = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_PINK_LUPINE);
        final Holder<ConfiguredFeature<?, ?>> FLOWER_FIELD_PURPLE_LUPINE = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_PURPLE_LUPINE);
        final Holder<ConfiguredFeature<?, ?>> FLOWER_FIELD_BLUE_LUPINE = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_BLUE_LUPINE);
        final Holder<ConfiguredFeature<?, ?>> FLOWER_FIELD_POPPY_PATCH = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_POPPY_BUSH);
        final Holder<ConfiguredFeature<?, ?>> FLOWER_FIELD_HYSSOP = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_HYSSOP);
        final Holder<ConfiguredFeature<?, ?>> FLOWER_FIELD_WARATAH = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_WARATAH);
        final Holder<ConfiguredFeature<?, ?>> FLOWER_FIELD_TRILLIUM = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_WHITE_TRILLIUM);
        final Holder<ConfiguredFeature<?, ?>> FLOWER_FIELD_TSUBAKI = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_TSUBAKI);
        final Holder<ConfiguredFeature<?, ?>> FLOWER_FIELD_FIREWEED = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_FIREWEED);
        final Holder<ConfiguredFeature<?, ?>> FLOWER_FIELD_DAISY = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_DAISY);
        final Holder<ConfiguredFeature<?, ?>> FLOWER_FIELD_FELICIA_DAISY = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_FELICIA);
        final Holder<ConfiguredFeature<?, ?>> FLOWER_FIELD_TASSEL = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_TASSEL);
        final Holder<ConfiguredFeature<?, ?>> FLOWER_FIELD_POPPIES = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_POPPY);
        final Holder<ConfiguredFeature<?, ?>> FLOWER_FIELD_BLUE_ORCHIDS = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_BLUE_ORCHID);
        final Holder<ConfiguredFeature<?, ?>> FLOWER_FIELD_ALLIUM = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_ALLIUM);
        final Holder<ConfiguredFeature<?, ?>> FLOWER_FIELD_RED_TULIP = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_RED_TULIP);
        final Holder<ConfiguredFeature<?, ?>> FLOWER_FIELD_ORANGE_TULIP = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_ORANGE_TULIP);
        final Holder<ConfiguredFeature<?, ?>> FLOWER_FIELD_PINK_TULIP = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_PINK_TULIP);
        final Holder<ConfiguredFeature<?, ?>> FLOWER_FIELD_WHITE_TULIP = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_WHITE_TULIP);
        final Holder<ConfiguredFeature<?, ?>> FLOWER_FIELD_OXEYE_DAISY = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_OXEYE);
        final Holder<ConfiguredFeature<?, ?>> FLOWER_FIELD_CORNFLOWER = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_CORNFLOWER);
        final Holder<ConfiguredFeature<?, ?>> FLOWER_FIELD_LILLIES = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_LILLY);
        final Holder<ConfiguredFeature<?, ?>> FLOWER_FIELD_SUNFLOWER = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_SUNFLOWER);
        final Holder<ConfiguredFeature<?, ?>> FLOWER_FIELD_GREEN_BIOSHROOM = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_GREEN_BIOSHROOM);
        final Holder<ConfiguredFeature<?, ?>> FLOWER_FIELD_BLUE_BIOSHROOM = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_BLUE_BIOSHROOM);

        final Holder<ConfiguredFeature<?, ?>> GRASSLAND_SHRUB = featureGetter.getOrThrow(RuTreeFeatures.OAK_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> GRASSLAND_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_GRASS);

        final Holder<ConfiguredFeature<?, ?>> BAOBAB_SAVANNA_SHRUB = featureGetter.getOrThrow(RuTreeFeatures.OAK_SHRUB_TERRACOTTA);
        final Holder<ConfiguredFeature<?, ?>> BAOBAB_SAVANNA_BIG_BAOBAB = featureGetter.getOrThrow(RuTreeFeatures.BIG_BAOBAB_TREE);
        final Holder<ConfiguredFeature<?, ?>> BAOBAB_SAVANNA_SMALL_BAOBAB = featureGetter.getOrThrow(RuTreeFeatures.BAOBAB_TREE);
        final Holder<ConfiguredFeature<?, ?>> BAOBAB_SAVANNA_ACACIA = featureGetter.getOrThrow(RuTreeFeatures.ACACIA_OAK_TREE);
        final Holder<ConfiguredFeature<?, ?>> BAOBAB_SAVANNA_BUSH = featureGetter.getOrThrow(RuTreeFeatures.OAK_BUSH);
        final Holder<ConfiguredFeature<?, ?>> BAOBAB_SAVANNA_STONE_BUD = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_STONE_BUD);
        final Holder<ConfiguredFeature<?, ?>> BAOBAB_SAVANNA_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_GRASS);
        final Holder<ConfiguredFeature<?, ?>> BAOBAB_SAVANNA_TALL_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_TALL_GRASS);

        final Holder<ConfiguredFeature<?, ?>> SHRUBLAND_BUSH = featureGetter.getOrThrow(RuTreeFeatures.OAK_BUSH);
        final Holder<ConfiguredFeature<?, ?>> SHRUBLAND_SHRUB = featureGetter.getOrThrow(RuTreeFeatures.OAK_BUSH_BLOB);
        final Holder<ConfiguredFeature<?, ?>> SHRUBLAND_SPRUCE = featureGetter.getOrThrow(RuTreeFeatures.SPRUCE);
        final Holder<ConfiguredFeature<?, ?>> SHRUBLAND_OAK_SHRUB = featureGetter.getOrThrow(RuTreeFeatures.OAK_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> SHRUBLAND_SPRUCE_SHRUB = featureGetter.getOrThrow(RuTreeFeatures.SPRUCE_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> SHRUBLAND_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_GRASS);
        final Holder<ConfiguredFeature<?, ?>> SHRUBLAND_YELLOW_LUPINE = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_YELLOW_LUPINE);
        final Holder<ConfiguredFeature<?, ?>> SHRUBLAND_RED_LUPINE = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_RED_LUPINE);

        final Holder<ConfiguredFeature<?, ?>> ICY_HEIGHTS_PINE = featureGetter.getOrThrow(RuTreeFeatures.PINE_MOUNTAIN);
        final Holder<ConfiguredFeature<?, ?>> ICY_HEIGHTS_DEAD_PINE = featureGetter.getOrThrow(RuTreeFeatures.DEAD_PINE_MOUNTAIN);
        final Holder<ConfiguredFeature<?, ?>> ICY_HEIGHTS_SNOWY_GRASS = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_SNOWY_GRASS);

        final Holder<ConfiguredFeature<?, ?>> OLD_GROWTH_RAINFOREST_PALM = featureGetter.getOrThrow(RuTreeFeatures.OLD_GROWTH_RAINFOREST_PALM);
        final Holder<ConfiguredFeature<?, ?>> OLD_GROWTH_RAINFOREST_MANGROVE = featureGetter.getOrThrow(RuTreeFeatures.OLD_GROWTH_RAINFOREST_MANGROVE);
        final Holder<ConfiguredFeature<?, ?>> OLD_GROWTH_RAINFOREST_JUNGLE_TREE = featureGetter.getOrThrow(RuTreeFeatures.OLD_GROWTH_RAINFOREST_JUNGLE_TREE);
        final Holder<ConfiguredFeature<?, ?>> OLD_GROWTH_RAINFOREST_BIG_JUNGLE_TREE = featureGetter.getOrThrow(RuTreeFeatures.OLD_GROWTH_RAINFOREST_BIG_JUNGLE_TREE);
        final Holder<ConfiguredFeature<?, ?>> OLD_GROWTH_RAINFOREST_SHRUB = featureGetter.getOrThrow(RuTreeFeatures.OLD_GROWTH_RAINFOREST_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> OLD_GROWTH_RAINFOREST_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_GRASS);
        final Holder<ConfiguredFeature<?, ?>> OLD_GROWTH_RAINFOREST_GREEN_BIOSHROOM = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_GREEN_BIOSHROOM);
        final Holder<ConfiguredFeature<?, ?>> OLD_GROWTH_RAINFOREST_BLUE_BIOSHROOM = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_BLUE_BIOSHROOM);
        final Holder<ConfiguredFeature<?, ?>> OLD_GROWTH_RAINFOREST_ELEPHANT_EAR = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_ELEPHANT_EAR);

        final Holder<ConfiguredFeature<?, ?>> RAINFOREST_PALM = featureGetter.getOrThrow(RuTreeFeatures.RAINFOREST_PALM);
        final Holder<ConfiguredFeature<?, ?>> RAINFOREST_JUNGLE_TREE = featureGetter.getOrThrow(RuTreeFeatures.RAINFOREST_JUNGLE_TREE);
        final Holder<ConfiguredFeature<?, ?>> RAINFOREST_BIG_JUNGLE_TREE = featureGetter.getOrThrow(RuTreeFeatures.RAINFOREST_BIG_JUNGLE_TREE);
        final Holder<ConfiguredFeature<?, ?>> RAINFOREST_SHRUB = featureGetter.getOrThrow(RuTreeFeatures.RAINFOREST_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> RAINFOREST_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_GRASS);
        final Holder<ConfiguredFeature<?, ?>> RAINFOREST_GREEN_BIOSHROOM = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_GREEN_BIOSHROOM);
        final Holder<ConfiguredFeature<?, ?>> RAINFOREST_PINK_BIOSHROOM = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_PINK_BIOSHROOM);
        final Holder<ConfiguredFeature<?, ?>> RAINFOREST_ELEPHANT_EAR = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_ELEPHANT_EAR);

        final Holder<ConfiguredFeature<?, ?>> TROPICS_PALM = featureGetter.getOrThrow(RuTreeFeatures.RAINFOREST_PALM);
        final Holder<ConfiguredFeature<?, ?>> TROPICS_JUNGLE_TREE = featureGetter.getOrThrow(RuTreeFeatures.RAINFOREST_JUNGLE_TREE);
        final Holder<ConfiguredFeature<?, ?>> TROPICS_BIG_JUNGLE_TREE = featureGetter.getOrThrow(RuTreeFeatures.RAINFOREST_BIG_JUNGLE_TREE);
        final Holder<ConfiguredFeature<?, ?>> TROPICS_SHRUB = featureGetter.getOrThrow(RuTreeFeatures.RAINFOREST_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> TROPICS_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_GRASS);
        final Holder<ConfiguredFeature<?, ?>> TROPICS_PINK_BIOSHROOM = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_PINK_BIOSHROOM);
        final Holder<ConfiguredFeature<?, ?>> TROPICS_RED_LUPINE = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_RED_LUPINE);
        final Holder<ConfiguredFeature<?, ?>> TROPICS_FELICIA_DAISY = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_FELICIA);
        final Holder<ConfiguredFeature<?, ?>> TROPICS_ELEPHANT_EAR = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_ELEPHANT_EAR);
        final Holder<ConfiguredFeature<?, ?>> TROPICS_SANDY_GRASS = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_SANDY_GRASS);
        final Holder<ConfiguredFeature<?, ?>> TROPICS_SANDY_TALL_GRASS = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_SANDY_TALL_GRASS);

        final Holder<ConfiguredFeature<?, ?>> AUTUMNAL_FIELDS_RED_MAPLE = featureGetter.getOrThrow(RuTreeFeatures.RED_MAPLE_TREE);
        final Holder<ConfiguredFeature<?, ?>> AUTUMNAL_FIELDS_ORANGE_MAPLE = featureGetter.getOrThrow(RuTreeFeatures.ORANGE_MAPLE_TREE);
        final Holder<ConfiguredFeature<?, ?>> AUTUMNAL_FIELDS_DEAD_TREE = featureGetter.getOrThrow(RuTreeFeatures.DEAD_TREE);
        final Holder<ConfiguredFeature<?, ?>> AUTUMNAL_FIELDS_SILVER_BIRCH = featureGetter.getOrThrow(RuTreeFeatures.SILVER_BIRCH);
        final Holder<ConfiguredFeature<?, ?>> AUTUMNAL_FIELDS_BIG_RED_MAPLE = featureGetter.getOrThrow(RuTreeFeatures.BIG_RED_MAPLE_TREE);
        final Holder<ConfiguredFeature<?, ?>> AUTUMNAL_FIELDS_BIG_ORANGE_MAPLE = featureGetter.getOrThrow(RuTreeFeatures.BIG_ORANGE_MAPLE_TREE);
        final Holder<ConfiguredFeature<?, ?>> AUTUMNAL_FIELDS_LARCH = featureGetter.getOrThrow(RuTreeFeatures.LARCH_TREE);
        final Holder<ConfiguredFeature<?, ?>> AUTUMNAL_FIELDS_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_GRASS);

        final Holder<ConfiguredFeature<?, ?>> AUTUMNAL_MAPLE_FOREST_RED_MAPLE = featureGetter.getOrThrow(RuTreeFeatures.RED_MAPLE_TREE);
        final Holder<ConfiguredFeature<?, ?>> AUTUMNAL_MAPLE_FOREST_ORANGE_MAPLE = featureGetter.getOrThrow(RuTreeFeatures.ORANGE_MAPLE_TREE);
        final Holder<ConfiguredFeature<?, ?>> AUTUMNAL_MAPLE_FOREST_MAPLE_TREE = featureGetter.getOrThrow(RuTreeFeatures.MAPLE_TREE);
        final Holder<ConfiguredFeature<?, ?>> AUTUMNAL_MAPLE_FOREST_SILVER_BIRCH = featureGetter.getOrThrow(RuTreeFeatures.SILVER_BIRCH);
        final Holder<ConfiguredFeature<?, ?>> AUTUMNAL_MAPLE_FOREST_BIG_RED_MAPLE = featureGetter.getOrThrow(RuTreeFeatures.BIG_RED_MAPLE_TREE);
        final Holder<ConfiguredFeature<?, ?>> AUTUMNAL_MAPLE_FOREST_BIG_ORANGE_MAPLE = featureGetter.getOrThrow(RuTreeFeatures.BIG_ORANGE_MAPLE_TREE);
        final Holder<ConfiguredFeature<?, ?>> AUTUMNAL_MAPLE_FOREST_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_GRASS);

        final Holder<ConfiguredFeature<?, ?>> AUTUMNAL_MIXED_TAIGA_SILVER_BIRCH = featureGetter.getOrThrow(RuTreeFeatures.SILVER_BIRCH_ASPEN);
        final Holder<ConfiguredFeature<?, ?>> AUTUMNAL_MIXED_TAIGA_MAPLE = featureGetter.getOrThrow(RuTreeFeatures.MAPLE_TREE);
        final Holder<ConfiguredFeature<?, ?>> AUTUMNAL_MIXED_TAIGA_BIG_ORANGE_MAPLE = featureGetter.getOrThrow(RuTreeFeatures.BIG_ORANGE_MAPLE_TREE);
        final Holder<ConfiguredFeature<?, ?>> AUTUMNAL_MIXED_TAIGA_RED_MAPLE = featureGetter.getOrThrow(RuTreeFeatures.RED_MAPLE_TREE);
        final Holder<ConfiguredFeature<?, ?>> AUTUMNAL_MIXED_TAIGA_ORANGE_MAPLE = featureGetter.getOrThrow(RuTreeFeatures.ORANGE_MAPLE_TREE);
        final Holder<ConfiguredFeature<?, ?>> AUTUMNAL_MIXED_TAIGA_LARCH = featureGetter.getOrThrow(RuTreeFeatures.LARCH_TREE);
        final Holder<ConfiguredFeature<?, ?>> AUTUMNAL_MIXED_TAIGA_GOLDEN_LARCH = featureGetter.getOrThrow(RuTreeFeatures.GOLDEN_LARCH_TREE);
        final Holder<ConfiguredFeature<?, ?>> AUTUMNAL_MIXED_TAIGA_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_GRASS);

        final Holder<ConfiguredFeature<?, ?>> WILLOW_FOREST_OAK = featureGetter.getOrThrow(RuTreeFeatures.WILLOW_OAK);
        final Holder<ConfiguredFeature<?, ?>> WILLOW_FOREST_WHITE_TREE = featureGetter.getOrThrow(RuTreeFeatures.WHITE_OAK);
        final Holder<ConfiguredFeature<?, ?>> WILLOW_FOREST_WILLOW = featureGetter.getOrThrow(RuTreeFeatures.WILLOW);
        final Holder<ConfiguredFeature<?, ?>> WILLOW_FOREST_SPRUCE = featureGetter.getOrThrow(RuTreeFeatures.SPRUCE);
        final Holder<ConfiguredFeature<?, ?>> WILLOW_FOREST_DEAD_SPRUCE = featureGetter.getOrThrow(RuTreeFeatures.DEAD_SPRUCE);
        final Holder<ConfiguredFeature<?, ?>> WILLOW_FOREST_BIG_WILLOW = featureGetter.getOrThrow(RuTreeFeatures.BIG_WILLOW);
        final Holder<ConfiguredFeature<?, ?>> WILLOW_FOREST_BUSH = featureGetter.getOrThrow(RuTreeFeatures.OAK_BUSH);
        final Holder<ConfiguredFeature<?, ?>> WILLOW_FOREST_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_GRASS);

        final Holder<ConfiguredFeature<?, ?>> BOREAL_LARCH = featureGetter.getOrThrow(RuTreeFeatures.BIG_LARCH_TREE_FOREST);
        final Holder<ConfiguredFeature<?, ?>> BOREAL_GOLDEN_LARCH = featureGetter.getOrThrow(RuTreeFeatures.BIG_GOLDEN_LARCH_TREE_FOREST);
        final Holder<ConfiguredFeature<?, ?>> BOREAL_BUSH = featureGetter.getOrThrow(RuTreeFeatures.OAK_BUSH_FOREST);
        final Holder<ConfiguredFeature<?, ?>> BOREAL_BIRCH = featureGetter.getOrThrow(RuTreeFeatures.BIRCH_FOREST_D);
        final Holder<ConfiguredFeature<?, ?>> BOREAL_SMALL_LARCH = featureGetter.getOrThrow(RuTreeFeatures.LARCH_TREE_FOREST);
        final Holder<ConfiguredFeature<?, ?>> BOREAL_FERN = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_FOREST_FERN);
        final Holder<ConfiguredFeature<?, ?>> BOREAL_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_GRASS);

        final Holder<ConfiguredFeature<?, ?>> CHALK_CLIFFS_BUSH = featureGetter.getOrThrow(RuTreeFeatures.OAK_BUSH);
        final Holder<ConfiguredFeature<?, ?>> CHALK_CLIFFS_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_GRASS);

        final Holder<ConfiguredFeature<?, ?>> LUPINE_PLAINS_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_GRASS);
        final Holder<ConfiguredFeature<?, ?>> LUPINE_PLAINS_YELLOW_LUPINE = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_YELLOW_LUPINE_FIELD);
        final Holder<ConfiguredFeature<?, ?>> LUPINE_PLAINS_RED_LUPINE = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_RED_LUPINE_FIELD);
        final Holder<ConfiguredFeature<?, ?>> LUPINE_PLAINS_BLUE_LUPINE = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_BLUE_LUPINE_FIELD);
        final Holder<ConfiguredFeature<?, ?>> LUPINE_PLAINS_PURPLE_LUPINE = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_PURPLE_LUPINE_FIELD);
        final Holder<ConfiguredFeature<?, ?>> LUPINE_PLAINS_PINK_LUPINE = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_PINK_LUPINE_FIELD);
        final Holder<ConfiguredFeature<?, ?>> LUPINE_PLAINS_STONE_BUD = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_STONE_BUD);

        final Holder<ConfiguredFeature<?, ?>> STEPPE_PLAINS_GRASS = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_STEPPE_GRASS);
        final Holder<ConfiguredFeature<?, ?>> STEPPE_PLAINS_SHRUB = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_STEPPE_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> STEPPE_PLAINS_TALL_GRASS = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_TALL_STEPPE_GRASS);
        final Holder<ConfiguredFeature<?, ?>> STEPPE_PLAINS_DEAD_SHRUB = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_DEAD_STEPPE_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> STEPPE_PLAINS_DESERT_SHRUB = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_SMALL_DESERT_SHRUB);

        final Holder<ConfiguredFeature<?, ?>> WOODED_STEPPE_BIG_OAK = featureGetter.getOrThrow(RuTreeFeatures.WOODED_STEPPE_BIG_OAK);
        final Holder<ConfiguredFeature<?, ?>> WOODED_STEPPE_ACACIA = featureGetter.getOrThrow(RuTreeFeatures.WOODED_STEPPE_ACACIA);
        final Holder<ConfiguredFeature<?, ?>> WOODED_STEPPE_BUSH = featureGetter.getOrThrow(RuTreeFeatures.WOODED_STEPPE_BUSH);
        final Holder<ConfiguredFeature<?, ?>> WOODED_STEPPE_GRASS = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_STEPPE_GRASS);
        final Holder<ConfiguredFeature<?, ?>> WOODED_STEPPE_SHRUB = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_STEPPE_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> WOODED_STEPPE_DEAD_SHRUB = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_DEAD_STEPPE_SHRUB);

        final Holder<ConfiguredFeature<?, ?>> ARID_MOUNTAINS_STONE_SHRUB = featureGetter.getOrThrow(RuTreeFeatures.OAK_SHRUB_TERRACOTTA);
        final Holder<ConfiguredFeature<?, ?>> ARID_MOUNTAINS_SHRUB = featureGetter.getOrThrow(RuTreeFeatures.OAK_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> ARID_MOUNTAINS_ACACIA_SHRUB = featureGetter.getOrThrow(RuTreeFeatures.ACACIA_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> ARID_MOUNTAINS_BUSH = featureGetter.getOrThrow(RuTreeFeatures.OAK_BUSH);
        final Holder<ConfiguredFeature<?, ?>> ARID_MOUNTAINS_ACACIA = featureGetter.getOrThrow(TreeFeatures.ACACIA);
        final Holder<ConfiguredFeature<?, ?>> ARID_MOUNTAINS_STONE_BUD = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_STONE_BUD);

        final Holder<ConfiguredFeature<?, ?>> WOODED_ARID_MOUNTAINS_STONE_SHRUB = featureGetter.getOrThrow(RuTreeFeatures.OAK_SHRUB_TERRACOTTA);
        final Holder<ConfiguredFeature<?, ?>> WOODED_ARID_MOUNTAINS_SHRUB = featureGetter.getOrThrow(RuTreeFeatures.OAK_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> WOODED_ARID_MOUNTAINS_ACACIA_SHRUB = featureGetter.getOrThrow(RuTreeFeatures.ACACIA_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> WOODED_ARID_MOUNTAINS_BUSH = featureGetter.getOrThrow(RuTreeFeatures.OAK_BUSH);
        final Holder<ConfiguredFeature<?, ?>> WOODED_ARID_MOUNTAINS_ACACIA = featureGetter.getOrThrow(TreeFeatures.ACACIA);
        final Holder<ConfiguredFeature<?, ?>> WOODED_ARID_MOUNTAINS_STONE_BUD = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_STONE_BUD);

        final Holder<ConfiguredFeature<?, ?>> JOSHUA_DESERT_LARGE_JOSHUA_TREE = featureGetter.getOrThrow(RuTreeFeatures.LARGE_JOSHUA_TREE);
        final Holder<ConfiguredFeature<?, ?>> JOSHUA_DESERT_MEDIUM_JOSHUA_TREE = featureGetter.getOrThrow(RuTreeFeatures.MEDIUM_JOSHUA_TREE);
        final Holder<ConfiguredFeature<?, ?>> JOSHUA_DESERT_DEAD_STEPPE_SHRUB = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_DEAD_STEPPE_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> JOSHUA_DESERT_DESERT_SHRUB = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_SMALL_DESERT_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> JOSHUA_DESERT_SANDY_GRASS = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_SANDY_GRASS);

        final Holder<ConfiguredFeature<?, ?>> PRAIRIE_BIG_OAK = featureGetter.getOrThrow(RuTreeFeatures.BIG_OAK_TREE_PLAINS);
        final Holder<ConfiguredFeature<?, ?>> PRAIRIE_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_GRASS);
        final Holder<ConfiguredFeature<?, ?>> PRAIRIE_BARLEY = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_BARLEY);

        final Holder<ConfiguredFeature<?, ?>> BARLEY_FIELDS_BARLEY = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_BARLEY);
        final Holder<ConfiguredFeature<?, ?>> BARLEY_FIELDS_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_GRASS);

        final Holder<ConfiguredFeature<?, ?>> OLD_GROWTH_BOREAL_LARCH = featureGetter.getOrThrow(RuTreeFeatures.GIANT_LARCH_TREE_FOREST);
        final Holder<ConfiguredFeature<?, ?>> OLD_GROWTH_BOREAL_GOLDEN_LARCH = featureGetter.getOrThrow(RuTreeFeatures.GIANT_GOLDEN_LARCH_TREE_FOREST);
        final Holder<ConfiguredFeature<?, ?>> OLD_GROWTH_BOREAL_BUSH = featureGetter.getOrThrow(RuTreeFeatures.OAK_BUSH_FOREST);
        final Holder<ConfiguredFeature<?, ?>> OLD_GROWTH_BOREAL_BIRCH = featureGetter.getOrThrow(RuTreeFeatures.BIRCH_FOREST_D);
        final Holder<ConfiguredFeature<?, ?>> OLD_GROWTH_BOREAL_SMALL_LARCH = featureGetter.getOrThrow(RuTreeFeatures.LARCH_TREE_FOREST);
        final Holder<ConfiguredFeature<?, ?>> OLD_GROWTH_BOREAL_FERN = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_FOREST_FERN);
        final Holder<ConfiguredFeature<?, ?>> OLD_GROWTH_BOREAL_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_GRASS);
        final Holder<ConfiguredFeature<?, ?>> OLD_GROWTH_BOREAL_TALL_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_TALL_GRASS);

        final Holder<ConfiguredFeature<?, ?>> GOLDEN_BOREAL_LARCH = featureGetter.getOrThrow(RuTreeFeatures.BIG_GOLDEN_LARCH_TREE_FOREST);
        final Holder<ConfiguredFeature<?, ?>> GOLDEN_BOREAL_GOLDEN_LARCH = featureGetter.getOrThrow(RuTreeFeatures.BIG_GOLDEN_LARCH_TREE_FOREST);
        final Holder<ConfiguredFeature<?, ?>> GOLDEN_BOREAL_BUSH = featureGetter.getOrThrow(RuTreeFeatures.OAK_BUSH_FOREST);
        final Holder<ConfiguredFeature<?, ?>> GOLDEN_BOREAL_BIRCH = featureGetter.getOrThrow(RuTreeFeatures.BIRCH_FOREST_D);
        final Holder<ConfiguredFeature<?, ?>> GOLDEN_BOREAL_SMALL_LARCH = featureGetter.getOrThrow(RuTreeFeatures.GOLDEN_LARCH_TREE_FOREST);
        final Holder<ConfiguredFeature<?, ?>> GOLDEN_BOREAL_FERN = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_FOREST_FERN);
        final Holder<ConfiguredFeature<?, ?>> GOLDEN_BOREAL_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_GRASS);

        final Holder<ConfiguredFeature<?, ?>> ALPHA_GROVE_TREE = featureGetter.getOrThrow(RuTreeFeatures.ALPHA_OAK_TREE);
        final Holder<ConfiguredFeature<?, ?>> ALPHA_GROVE_ROSE = featureGetter.getOrThrow(RuVegetationFeatures.ALPHA_ROSE);
        final Holder<ConfiguredFeature<?, ?>> ALPHA_GROVE_DANDELION = featureGetter.getOrThrow(RuVegetationFeatures.ALPHA_DANDELION);

        final Holder<ConfiguredFeature<?, ?>> SILVER_BIRCH_FOREST_ASPEN = featureGetter.getOrThrow(RuTreeFeatures.SILVER_BIRCH_ASPEN);
        final Holder<ConfiguredFeature<?, ?>> SILVER_BIRCH_FOREST_SILVER_BIRCH = featureGetter.getOrThrow(RuTreeFeatures.SILVER_BIRCH);
        final Holder<ConfiguredFeature<?, ?>> SILVER_BIRCH_FOREST_BIRCH = featureGetter.getOrThrow(TreeFeatures.BIRCH);
        final Holder<ConfiguredFeature<?, ?>> SILVER_BIRCH_FOREST_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_GRASS);
        final Holder<ConfiguredFeature<?, ?>> SILVER_BIRCH_FOREST_SEEDED_GRASS = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_SEEDED_GRASS);
        final Holder<ConfiguredFeature<?, ?>> SILVER_BIRCH_FOREST_TASSEL = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_TASSEL);

        final Holder<ConfiguredFeature<?, ?>> DECIDUOUS_FOREST_BUSH = featureGetter.getOrThrow(RuTreeFeatures.OAK_BUSH);
        final Holder<ConfiguredFeature<?, ?>> DECIDUOUS_FOREST_OAK = featureGetter.getOrThrow(RuTreeFeatures.OAK_TREE);
        final Holder<ConfiguredFeature<?, ?>> DECIDUOUS_FOREST_BIG_OAK = featureGetter.getOrThrow(RuTreeFeatures.BIG_OAK_TREE);

        final Holder<ConfiguredFeature<?, ?>> ORCHARD_APPLE_OAK = featureGetter.getOrThrow(RuTreeFeatures.APPLE_OAK_TREE_PLAINS);
        final Holder<ConfiguredFeature<?, ?>> ORCHARD_BIG_APPLE_OAK = featureGetter.getOrThrow(RuTreeFeatures.BIG_APPLE_OAK_TREE_PLAINS);
        final Holder<ConfiguredFeature<?, ?>> ORCHARD_BIG_OAK = featureGetter.getOrThrow(RuTreeFeatures.BIG_OAK_TREE_PLAINS);
        final Holder<ConfiguredFeature<?, ?>> ORCHARD_TASSEL = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_TASSEL);
        final Holder<ConfiguredFeature<?, ?>> ORCHARD_DAISY = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_DAISY);
        final Holder<ConfiguredFeature<?, ?>> ORCHARD_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_GRASS);

        final Holder<ConfiguredFeature<?, ?>> REDWOODS_GIANT_REDWOOD = featureGetter.getOrThrow(RuTreeFeatures.REDWOODS_GIANT_REDWOOD);
        final Holder<ConfiguredFeature<?, ?>> REDWOODS_REDWOOD = featureGetter.getOrThrow(RuTreeFeatures.REDWOODS_REDWOOD);
        final Holder<ConfiguredFeature<?, ?>> REDWOODS_BUSH = featureGetter.getOrThrow(RuTreeFeatures.OAK_BUSH);
        final Holder<ConfiguredFeature<?, ?>> REDWOODS_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_GRASS);

        final Holder<ConfiguredFeature<?, ?>> SPARSE_REDWOODS_REDWOOD = featureGetter.getOrThrow(RuTreeFeatures.REDWOODS_REDWOOD);
        final Holder<ConfiguredFeature<?, ?>> SPARSE_REDWOODS_BUSH = featureGetter.getOrThrow(RuTreeFeatures.OAK_BUSH);
        final Holder<ConfiguredFeature<?, ?>> SPARSE_REDWOODS_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_GRASS);

        final Holder<ConfiguredFeature<?, ?>> GIANT_BAYOU_BIG_CYPRESS = featureGetter.getOrThrow(RuTreeFeatures.GIANT_CYPRESS);
        final Holder<ConfiguredFeature<?, ?>> GIANT_BAYOU_BIG_CYPRESS_MOSS = featureGetter.getOrThrow(RuTreeFeatures.GIANT_CYPRESS_MOSS);
        final Holder<ConfiguredFeature<?, ?>> GIANT_BAYOU_SHRUB = featureGetter.getOrThrow(RuTreeFeatures.WILLOW_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> GIANT_BAYOU_OAK_TREE = featureGetter.getOrThrow(RuTreeFeatures.WILLOW_OAK);
        final Holder<ConfiguredFeature<?, ?>> GIANT_BAYOU_BIG_WILLOW = featureGetter.getOrThrow(RuTreeFeatures.BIG_WILLOW);
        final Holder<ConfiguredFeature<?, ?>> GIANT_BAYOU_BUSH = featureGetter.getOrThrow(RuTreeFeatures.OAK_BUSH);
        final Holder<ConfiguredFeature<?, ?>> GIANT_BAYOU_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_GRASS);
        final Holder<ConfiguredFeature<?, ?>> GIANT_BAYOU_TALL_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_TALL_GRASS);
        final Holder<ConfiguredFeature<?, ?>> GIANT_BAYOU_ELEPHANT_EAR = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_ELEPHANT_EAR);
        final Holder<ConfiguredFeature<?, ?>> GIANT_BAYOU_FERN = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_FOREST_FERN);

        final Holder<ConfiguredFeature<?, ?>> BAYOU_WILLOW = featureGetter.getOrThrow(RuTreeFeatures.WILLOW_TREE);
        final Holder<ConfiguredFeature<?, ?>> BAYOU_BUSH = featureGetter.getOrThrow(RuTreeFeatures.OAK_BUSH);
        final Holder<ConfiguredFeature<?, ?>> BAYOU_OAK = featureGetter.getOrThrow(TreeFeatures.OAK);
        final Holder<ConfiguredFeature<?, ?>> BAYOU_MOSSY_CYPRESS = featureGetter.getOrThrow(RuTreeFeatures.CYPRESS_TREE_MOSS);
        final Holder<ConfiguredFeature<?, ?>> BAYOU_CYPRESS = featureGetter.getOrThrow(RuTreeFeatures.CYPRESS_TREE);
        final Holder<ConfiguredFeature<?, ?>> BAYOU_BIG_CYPRESS = featureGetter.getOrThrow(RuTreeFeatures.BIG_CYPRESS_TREE);
        final Holder<ConfiguredFeature<?, ?>> BAYOU_BIG_MOSSY_CYPRESS = featureGetter.getOrThrow(RuTreeFeatures.BIG_CYPRESS_TREE_MOSS);
        final Holder<ConfiguredFeature<?, ?>> BAYOU_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_GRASS);
        final Holder<ConfiguredFeature<?, ?>> BAYOU_ELEPHANT_EAR = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_ELEPHANT_EAR);
        final Holder<ConfiguredFeature<?, ?>> BAYOU_FERN = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_FOREST_FERN);

        final Holder<ConfiguredFeature<?, ?>> BAMBOO_FOREST_GIANT_BAMBOO = featureGetter.getOrThrow(RuTreeFeatures.BAMBOO_TREE);
        final Holder<ConfiguredFeature<?, ?>> BAMBOO_FOREST_TSUBAKI = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_TSUBAKI);
        final Holder<ConfiguredFeature<?, ?>> BAMBOO_FOREST_SHRUB = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_STEPPE_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> BAMBOO_FOREST_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_GRASS);

        final Holder<ConfiguredFeature<?, ?>> POPPY_FIELDS_POPPY_BUSH = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_POPPY_BUSH);
        final Holder<ConfiguredFeature<?, ?>> POPPY_FIELDS_POPPY = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_POPPY);
        final Holder<ConfiguredFeature<?, ?>> POPPY_FIELDS_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_GRASS);

        final Holder<ConfiguredFeature<?, ?>> PINE_FOREST_PINE = featureGetter.getOrThrow(RuTreeFeatures.SCOTTS_PINE_TREE);
        final Holder<ConfiguredFeature<?, ?>> PINE_FOREST_TALL_PINE = featureGetter.getOrThrow(RuTreeFeatures.SCOTTS_PINE_TREE_TALL);
        final Holder<ConfiguredFeature<?, ?>> PINE_FOREST_SHRUB = featureGetter.getOrThrow(RuTreeFeatures.PINE_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> PINE_FOREST_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_GRASS);
        final Holder<ConfiguredFeature<?, ?>> PINE_FOREST_TALL_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_TALL_GRASS);

        final Holder<ConfiguredFeature<?, ?>> CHERRY_HILLS_CHERRY_TREE = featureGetter.getOrThrow(RuTreeFeatures.CHERRY_TREE);
        final Holder<ConfiguredFeature<?, ?>> CHERRY_HILLS_BIG_CHERRY_TREE = featureGetter.getOrThrow(RuTreeFeatures.BIG_CHERRY_TREE);
        final Holder<ConfiguredFeature<?, ?>> CHERRY_HILLS_RED_CHERRY_TREE = featureGetter.getOrThrow(RuTreeFeatures.RED_CHERRY_TREE);
        final Holder<ConfiguredFeature<?, ?>> CHERRY_HILLS_RED_BIG_CHERRY_TREE = featureGetter.getOrThrow(RuTreeFeatures.RED_BIG_CHERRY_TREE);
        final Holder<ConfiguredFeature<?, ?>> CHERRY_HILLS_PINK_CHERRY_TREE = featureGetter.getOrThrow(RuTreeFeatures.PINK_CHERRY_TREE);
        final Holder<ConfiguredFeature<?, ?>> CHERRY_HILLS_PINK_BIG_CHERRY_TREE = featureGetter.getOrThrow(RuTreeFeatures.PINK_BIG_CHERRY_TREE);
        final Holder<ConfiguredFeature<?, ?>> CHERRY_HILLS_WHITE_CHERRY_TREE = featureGetter.getOrThrow(RuTreeFeatures.WHITE_CHERRY_TREE);
        final Holder<ConfiguredFeature<?, ?>> CHERRY_HILLS_WHITE_BIG_CHERRY_TREE = featureGetter.getOrThrow(RuTreeFeatures.WHITE_BIG_CHERRY_TREE);
        final Holder<ConfiguredFeature<?, ?>> CHERRY_HILLS_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_GRASS);
        final Holder<ConfiguredFeature<?, ?>> CHERRY_HILLS_TSUBAKI = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_TSUBAKI);

        final Holder<ConfiguredFeature<?, ?>> TEMPERATE_GROVE_MAPLE_TREE = featureGetter.getOrThrow(RuTreeFeatures.MAPLE_TREE);
        final Holder<ConfiguredFeature<?, ?>> TEMPERATE_GROVE_BIRCH_TREE = featureGetter.getOrThrow(TreeFeatures.BIRCH);
        final Holder<ConfiguredFeature<?, ?>> TEMPERATE_GROVE_OAK_TREE = featureGetter.getOrThrow(RuTreeFeatures.FLOWERING_OAK_TREE);
        final Holder<ConfiguredFeature<?, ?>> TEMPERATE_GROVE_LARCH = featureGetter.getOrThrow(RuTreeFeatures.SMALL_LARCH);
        final Holder<ConfiguredFeature<?, ?>> TEMPERATE_GROVE_BUSH = featureGetter.getOrThrow(RuTreeFeatures.OAK_BUSH);
        final Holder<ConfiguredFeature<?, ?>> TEMPERATE_GROVE_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_GRASS);
        final Holder<ConfiguredFeature<?, ?>> TEMPERATE_GROVE_TASSEL = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_TASSEL);
        final Holder<ConfiguredFeature<?, ?>> TEMPERATE_GROVE_DAISY = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_DAISY);

        final Holder<ConfiguredFeature<?, ?>> EUCALYPTUS_FOREST_EUCALYPTUS_TREE = featureGetter.getOrThrow(RuTreeFeatures.EUCALYPTUS_TREE);
        final Holder<ConfiguredFeature<?, ?>> EUCALYPTUS_FOREST_SHRUB = featureGetter.getOrThrow(RuTreeFeatures.EUCALYPTUS_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> EUCALYPTUS_FOREST_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_GRASS);
        final Holder<ConfiguredFeature<?, ?>> EUCALYPTUS_FOREST_ELEPHANT_EAR = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_ELEPHANT_EAR);
        final Holder<ConfiguredFeature<?, ?>> EUCALYPTUS_FOREST_WARATAH = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_WARATAH);

        final Holder<ConfiguredFeature<?, ?>> ROOFED_EUCALYPTUS_FOREST_EUCALYPTUS_TREE_CANOPY = featureGetter.getOrThrow(RuTreeFeatures.EUCALYPTUS_TREE_CANOPY);
        final Holder<ConfiguredFeature<?, ?>> ROOFED_EUCALYPTUS_FOREST_EUCALYPTUS_TREE = featureGetter.getOrThrow(RuTreeFeatures.EUCALYPTUS_TREE);
        final Holder<ConfiguredFeature<?, ?>> ROOFED_EUCALYPTUS_FOREST_SHRUB = featureGetter.getOrThrow(RuTreeFeatures.EUCALYPTUS_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> ROOFED_EUCALYPTUS_FOREST_SAPLING = featureGetter.getOrThrow(RuTreeFeatures.EUCALYPTUS_SAPLING);
        final Holder<ConfiguredFeature<?, ?>> ROOFED_EUCALYPTUS_FOREST_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_GRASS);
        final Holder<ConfiguredFeature<?, ?>> ROOFED_EUCALYPTUS_FOREST_ELEPHANT_EAR = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_ELEPHANT_EAR);
        final Holder<ConfiguredFeature<?, ?>> ROOFED_EUCALYPTUS_FOREST_WARATAH = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_WARATAH);

        final Holder<ConfiguredFeature<?, ?>> MAUVE_HILLS_MAUVE_OAK = featureGetter.getOrThrow(RuTreeFeatures.MAUVE_OAK);
        final Holder<ConfiguredFeature<?, ?>> MAUVE_HILLS_BIG_MAUVE_OAK = featureGetter.getOrThrow(RuTreeFeatures.BIG_MAUVE_OAK);
        final Holder<ConfiguredFeature<?, ?>> MAUVE_HILLS_OAK = featureGetter.getOrThrow(RuTreeFeatures.OAK_TREE);
        final Holder<ConfiguredFeature<?, ?>> MAUVE_HILLS_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_GRASS);
        final Holder<ConfiguredFeature<?, ?>> MAUVE_HILLS_PURPLE_LUPINE = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_PURPLE_LUPINE);
        final Holder<ConfiguredFeature<?, ?>> MAUVE_HILLS_PINK_LUPINE = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_PINK_LUPINE);
        final Holder<ConfiguredFeature<?, ?>> MAUVE_HILLS_PINK_BIOSHROOM = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_PINK_BIOSHROOM);

        final Holder<ConfiguredFeature<?, ?>> TOWERING_CLIFFS_PINE = featureGetter.getOrThrow(RuTreeFeatures.PINE_MOUNTAIN);
        final Holder<ConfiguredFeature<?, ?>> TOWERING_CLIFFS_DEAD_PINE = featureGetter.getOrThrow(RuTreeFeatures.DEAD_PINE_MOUNTAIN);
        final Holder<ConfiguredFeature<?, ?>> TOWERING_CLIFFS_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_GRASS);
        final Holder<ConfiguredFeature<?, ?>> TOWERING_CLIFFS_HYSSOP = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_HYSSOP);
        final Holder<ConfiguredFeature<?, ?>> TOWERING_CLIFFS_FERNS = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_FOREST_FERN_MIX);

        final Holder<ConfiguredFeature<?, ?>> FUNGAL_FEN_BROWN_MUSHROOM = featureGetter.getOrThrow(RuTreeFeatures.FUNGAL_FEN_BROWN_MUSHROOM);
        final Holder<ConfiguredFeature<?, ?>> FUNGAL_FEN_RED_MUSHROOM = featureGetter.getOrThrow(RuTreeFeatures.FUNGAL_FEN_RED_MUSHROOM);
        final Holder<ConfiguredFeature<?, ?>> FUNGAL_FEN_PINE = featureGetter.getOrThrow(RuTreeFeatures.PINE_MOSS);
        final Holder<ConfiguredFeature<?, ?>> FUNGAL_FEN_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_GRASS);
        final Holder<ConfiguredFeature<?, ?>> FUNGAL_FEN_ELEPHANT_EAR = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_ELEPHANT_EAR);
        final Holder<ConfiguredFeature<?, ?>> FUNGAL_FEN_FERN = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_FOREST_FERN);
        final Holder<ConfiguredFeature<?, ?>> FUNGAL_FEN_GREEN_BIOSHROOM = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_GREEN_BIOSHROOM);
        final Holder<ConfiguredFeature<?, ?>> FUNGAL_FEN_BLUE_BIOSHROOM = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_BLUE_BIOSHROOM);

        final Holder<ConfiguredFeature<?, ?>> OUTBACK_SHRUB = featureGetter.getOrThrow(RuTreeFeatures.OAK_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> OUTBACK_SHRUB_DENSE = featureGetter.getOrThrow(RuTreeFeatures.OAK_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> OUTBACK_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_GRASS);
        final Holder<ConfiguredFeature<?, ?>> OUTBACK_DEAD_STEPPE_SHRUB = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_DEAD_STEPPE_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> OUTBACK_DESERT_SHRUB = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_SMALL_DESERT_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> OUTBACK_STONE_BUD = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_STONE_BUD);

        final Holder<ConfiguredFeature<?, ?>> SAGUARO_DESERT_CACTUS = featureGetter.getOrThrow(RuTreeFeatures.SAGUARO_CACTUS);
        final Holder<ConfiguredFeature<?, ?>> SAGUARO_DESERT_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_GRASS);
        final Holder<ConfiguredFeature<?, ?>> SAGUARO_DESERT_SANDY_GRASS = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_SANDY_GRASS);
        final Holder<ConfiguredFeature<?, ?>> SAGUARO_DESERT_BARREL_CACTUS = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_BARREL_CACTUS);

        final Holder<ConfiguredFeature<?, ?>> FROZEN_TUNDRA_SHRUB = featureGetter.getOrThrow(RuTreeFeatures.OAK_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> FROZEN_TUNDRA_MAPLE_SHRUB = featureGetter.getOrThrow(RuTreeFeatures.RED_MAPLE_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> FROZEN_TUNDRA_SHRUB_SNOW = featureGetter.getOrThrow(RuTreeFeatures.OAK_SHRUB_1);
        final Holder<ConfiguredFeature<?, ?>> FROZEN_TUNDRA_MAPLE_SHRUB_SNOW = featureGetter.getOrThrow(RuTreeFeatures.RED_MAPLE_SHRUB_1);
        final Holder<ConfiguredFeature<?, ?>> FROZEN_TUNDRA_SNOWY_GRASS = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_SNOWY_GRASS);
        final Holder<ConfiguredFeature<?, ?>> FROZEN_TUNDRA_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_GRASS);

        final Holder<ConfiguredFeature<?, ?>> DRY_BRUSHLAND_ACACIA = featureGetter.getOrThrow(RuTreeFeatures.DRY_BRUSHLAND_ACACIA);
        final Holder<ConfiguredFeature<?, ?>> DRY_BRUSHLAND_SHRUB = featureGetter.getOrThrow(RuTreeFeatures.DRY_BRUSHLAND_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> DRY_BRUSHLAND_JOSHUA_SHRUB = featureGetter.getOrThrow(RuTreeFeatures.DRY_BRUSHLAND_JOSHUA_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> DRY_BRUSHLAND_SHRUB_SAND = featureGetter.getOrThrow(RuTreeFeatures.DRY_BRUSHLAND_SHRUB_SAND);
        final Holder<ConfiguredFeature<?, ?>> DRY_BRUSHLAND_JOSHUA_SHRUB_SAND = featureGetter.getOrThrow(RuTreeFeatures.DRY_BRUSHLAND_JOSHUA_SHRUB_SAND);
        final Holder<ConfiguredFeature<?, ?>> DRY_BRUSHLAND_SANDY_GRASS = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_SANDY_GRASS);
        final Holder<ConfiguredFeature<?, ?>> DRY_BRUSHLAND_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_GRASS);
        final Holder<ConfiguredFeature<?, ?>> DRY_BRUSHLAND_DESERT_GRASS = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_SMALL_DESERT_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> DRY_BRUSHLAND_FIREWEED = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_FIREWEED);

        final Holder<ConfiguredFeature<?, ?>> COLD_DECIDUOUS_FOREST_BUSH = featureGetter.getOrThrow(RuTreeFeatures.RED_MAPLE_BUSH);
        final Holder<ConfiguredFeature<?, ?>> COLD_DECIDUOUS_FOREST_OAK = featureGetter.getOrThrow(RuTreeFeatures.RED_MAPLE_TREE);
        final Holder<ConfiguredFeature<?, ?>> COLD_DECIDUOUS_FOREST_BIG_OAK = featureGetter.getOrThrow(RuTreeFeatures.BIG_RED_MAPLE_TREE);
        final Holder<ConfiguredFeature<?, ?>> COLD_DECIDUOUS_FOREST_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_GRASS);

        final Holder<ConfiguredFeature<?, ?>> ICY_DESERT_STONE_BUD = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_STONE_BUD);
        final Holder<ConfiguredFeature<?, ?>> ICY_DESERT_SNOWY_GRASS = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_SNOWY_GRASS);

        final Holder<ConfiguredFeature<?, ?>> SPIRES_SNOWY_GRASS = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_SNOWY_GRASS);

        final Holder<ConfiguredFeature<?, ?>> SMOULDERING_WOODLAND_BASALT = featureGetter.getOrThrow(NetherFeatures.SMALL_BASALT_COLUMNS);
        final Holder<ConfiguredFeature<?, ?>> SMOULDERING_WOODLAND_VENT = featureGetter.getOrThrow(RuFeatures.ASH_VENT_PATCH);
        final Holder<ConfiguredFeature<?, ?>> SMOULDERING_WOODLAND_OAK = featureGetter.getOrThrow(RuTreeFeatures.DEAD_TREE);
        final Holder<ConfiguredFeature<?, ?>> SMOULDERING_WOODLAND_DEAD_PINE = featureGetter.getOrThrow(RuTreeFeatures.DEAD_PINE_TREE);
        final Holder<ConfiguredFeature<?, ?>> SMOULDERING_WOODLAND_PINE = featureGetter.getOrThrow(RuTreeFeatures.PINE_TREE);
        final Holder<ConfiguredFeature<?, ?>> SMOULDERING_WOODLAND_DORCEL = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_DORCEL);
        final Holder<ConfiguredFeature<?, ?>> SMOULDERING_WOODLAND_TRILLIUM = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_WILTING_TRILLIUM);
        final Holder<ConfiguredFeature<?, ?>> SMOULDERING_WOODLAND_DEAD_STEPPE_SHRUB = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_DEAD_STEPPE_SHRUB);
        final Holder<ConfiguredFeature<?, ?>> SMOULDERING_WOODLAND_DESERT_SHRUB = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_SMALL_DESERT_SHRUB);

        final Holder<ConfiguredFeature<?, ?>> FROZEN_FOREST_PINE = featureGetter.getOrThrow(RuTreeFeatures.SCOTTS_PINE_TREE);
        final Holder<ConfiguredFeature<?, ?>> FROZEN_FOREST_TALL_PINE = featureGetter.getOrThrow(RuTreeFeatures.SCOTTS_PINE_TREE_TALL);
        final Holder<ConfiguredFeature<?, ?>> FROZEN_FOREST_SNOWY_GRASS = featureGetter.getOrThrow(RuVegetationFeatures.PATCH_SNOWY_GRASS);

        final Holder<ConfiguredFeature<?, ?>> MEADOW_MAUVE_OAK = featureGetter.getOrThrow(RuTreeFeatures.MAUVE_OAK_BEE);
        final Holder<ConfiguredFeature<?, ?>> MEADOW_MAUVE_OAK_BEE = featureGetter.getOrThrow(RuTreeFeatures.MAUVE_OAK);
        final Holder<ConfiguredFeature<?, ?>> MEADOW_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_GRASS);

        final Holder<ConfiguredFeature<?, ?>> FLOODED_PLAINS_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_GRASS);
        final Holder<ConfiguredFeature<?, ?>> FLOODED_PLAINS_TALL_GRASS = featureGetter.getOrThrow(VegetationFeatures.PATCH_TALL_GRASS);

        final Holder<ConfiguredFeature<?, ?>> LUSH_DELTA_AZALEA = featureGetter.getOrThrow(RuTreeFeatures.LUSH_DELTA_AZALEA);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        register(context, RuBiomePlacements.SCORCH_TREES, SCORCH_TREES, List.of(CountOnEveryLayerPlacement.of(1), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.GREEN_BIOSHROOM.get()), BiomeFilter.biome()));

        register(context, RuBiomePlacements.LUSH_DELTA_GRASS, LUSH_DELTA_GRASS, List.of(CountOnEveryLayerPlacement.of(32), BiomeFilter.biome()));
        register(context, RuBiomePlacements.LUSH_DELTA_TALL_GRASS, LUSH_DELTA_TALL_GRASS, List.of(CountOnEveryLayerPlacement.of(16), BiomeFilter.biome()));
        register(context, RuBiomePlacements.LUSH_DELTA_YELLOW_BIOSHROOM, LUSH_DELTA_YELLOW_BIOSHROOM, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 32), InSquarePlacement.spread(), PlacementUtils.FULL_RANGE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.LUSH_DELTA_PINK_BIOSHROOM, LUSH_DELTA_PINK_BIOSHROOM, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 32), InSquarePlacement.spread(), PlacementUtils.FULL_RANGE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.LUSH_DELTA_TREES, LUSH_DELTA_TREES, List.of(CountOnEveryLayerPlacement.of(64), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));

        register(context, RuBiomePlacements.PRISMACHASM_SPROUT, PRISMACHASM_SPROUT, List.of(CountOnEveryLayerPlacement.of(25), BiomeFilter.biome()));
        register(context, RuBiomePlacements.PRISMACHASM_CRYSTAL, PRISMACHASM_CRYSTAL, List.of(CountOnEveryLayerPlacement.of(8), BiomeFilter.biome()));
        register(context, RuBiomePlacements.PRISMACHASM_HYSSOP, PRISMACHASM_HYSSOP, List.of(CountOnEveryLayerPlacement.of(2), BiomeFilter.biome()));
        register(context, RuBiomePlacements.PRISMACHASM_GREEN_BIOSHROOM, PRISMACHASM_GREEN_BIOSHROOM, List.of(CountOnEveryLayerPlacement.of(2), InSquarePlacement.spread(), BiomeFilter.biome()));
        register(context, RuBiomePlacements.PRISMACHASM_BLUE_BIOSHROOM, PRISMACHASM_BLUE_BIOSHROOM, List.of(CountOnEveryLayerPlacement.of(2), InSquarePlacement.spread(), BiomeFilter.biome()));
        register(context, RuBiomePlacements.PRISMACHASM_PINK_BIOSHROOM, PRISMACHASM_PINK_BIOSHROOM, List.of(CountOnEveryLayerPlacement.of(2), InSquarePlacement.spread(), BiomeFilter.biome()));
        register(context, RuBiomePlacements.PRISMACHASM_YELLOW_BIOSHROOM, PRISMACHASM_YELLOW_BIOSHROOM, List.of(CountOnEveryLayerPlacement.of(2), InSquarePlacement.spread(), BiomeFilter.biome()));

        register(context, RuBiomePlacements.BIOSHROOM_CAVES_GIANT_BLUE_BIOSHROOM, BIOSHROOM_CAVES_GIANT_BLUE_BIOSHROOM, List.of(CountOnEveryLayerPlacement.of(3), PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.BIOSHROOM_CAVES_GIANT_GREEN_BIOSHROOM, BIOSHROOM_CAVES_GIANT_GREEN_BIOSHROOM, List.of(CountOnEveryLayerPlacement.of(3), PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.BIOSHROOM_CAVES_GRASS, BIOSHROOM_CAVES_GRASS, List.of(CountOnEveryLayerPlacement.of(70), BiomeFilter.biome()));
        register(context, RuBiomePlacements.BIOSHROOM_CAVES_TALL_GRASS, BIOSHROOM_CAVES_TALL_GRASS, List.of(CountOnEveryLayerPlacement.of(15), BiomeFilter.biome()));
        register(context, RuBiomePlacements.BIOSHROOM_CAVES_HYSSOP, BIOSHROOM_CAVES_HYSSOP, List.of(CountOnEveryLayerPlacement.of(10), BiomeFilter.biome()));
        register(context, RuBiomePlacements.BIOSHROOM_CAVES_GREEN_BIOSHROOM, BIOSHROOM_CAVES_GREEN_BIOSHROOM, List.of(CountOnEveryLayerPlacement.of(10), BiomeFilter.biome()));
        register(context, RuBiomePlacements.BIOSHROOM_CAVES_BLUE_BIOSHROOM, BIOSHROOM_CAVES_BLUE_BIOSHROOM, List.of(CountOnEveryLayerPlacement.of(10), BiomeFilter.biome()));
        register(context, RuBiomePlacements.BIOSHROOM_CAVES_PINK_BIOSHROOM, BIOSHROOM_CAVES_PINK_BIOSHROOM, List.of(CountOnEveryLayerPlacement.of(5), BiomeFilter.biome()));

        register(context, RuBiomePlacements.PINE_SLOPES_BUSH, PINE_SLOPES_BUSH, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.PINE_SLOPES_OAK, PINE_SLOPES_OAK, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.PINE_SLOPES_PINE, PINE_SLOPES_PINE, List.of(CountPlacement.of(7), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));

        register(context, RuBiomePlacements.MOUNTAINS_BUSH, MOUNTAINS_BUSH,   List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.MOUNTAINS_OAK, MOUNTAINS_OAK, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.MOUNTAINS_PINE, MOUNTAINS_PINE, List.of(CountPlacement.of(7), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.MOUNTAINS_GRASS, MOUNTAINS_GRASS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 4), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.DIRT_PLACEMENT.get()), BiomeFilter.biome()));

        register(context, RuBiomePlacements.LUSH_HILLS_BUSH, LUSH_HILLS_BUSH, List.of(CountPlacement.of(4), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.LUSH_HILLS_GRASS, LUSH_HILLS_GRASS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 12), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.DIRT_PLACEMENT.get()), BiomeFilter.biome()));

        register(context, RuBiomePlacements.MUDDY_RIVER_SHRUB, MUDDY_RIVER_SHRUB, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.MUDDY_RIVER_GRASS, MUDDY_RIVER_GRASS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 4), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, RuBiomePlacements.GRASSY_BEACH_SANDY_GRASS, GRASSY_BEACH_SANDY_GRASS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 9), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.SAND_PLACEMENT.get()), BiomeFilter.biome()));
        register(context, RuBiomePlacements.GRASSY_BEACH_SANDY_TALL_GRASS, GRASSY_BEACH_SANDY_TALL_GRASS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.SAND_PLACEMENT.get()), BiomeFilter.biome()));

        register(context, RuBiomePlacements.CANADIAN_FOREST_PINE, CANADIAN_FOREST_PINE, List.of(CountPlacement.of(8), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.CANADIAN_FOREST_DEAD_SPRUCE, CANADIAN_FOREST_DEAD_SPRUCE, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.CANADIAN_FOREST_MAPLE, CANADIAN_FOREST_MAPLE, List.of(CountPlacement.of(3), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.CANADIAN_FOREST_GRASS, CANADIAN_FOREST_GRASS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.CANADIAN_FOREST_TRILLIUM, CANADIAN_FOREST_TRILLIUM, List.of(RarityFilter.onAverageOnceEvery(2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, RuBiomePlacements.CANADIAN_FOREST_TALL_GRASS, CANADIAN_FOREST_TALL_GRASS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.DIRT_PLACEMENT.get()), BiomeFilter.biome()));

        register(context, RuBiomePlacements.MAPLE_FOREST_MAPLE, MAPLE_FOREST_MAPLE, List.of(CountPlacement.of(4), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.MAPLE_FOREST_RED_MAPLE, MAPLE_FOREST_RED_MAPLE, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.MAPLE_FOREST_BIG_MAPLE, MAPLE_FOREST_BIG_MAPLE, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.MAPLE_FOREST_PINE, MAPLE_FOREST_PINE, List.of(CountPlacement.of(4), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.MAPLE_FOREST_GRASS, MAPLE_FOREST_GRASS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 6), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.MAPLE_FOREST_STONE_BUD, MAPLE_FOREST_STONE_BUD, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 12), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.MAPLE_FOREST_TRILLIUM, MAPLE_FOREST_TRILLIUM, List.of(RarityFilter.onAverageOnceEvery(2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, RuBiomePlacements.FEN_SHRUB, FEN_SHRUB, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.FEN_BUSH, FEN_BUSH, List.of(CountPlacement.of(5), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.FEN_PINE, FEN_PINE, List.of(CountPlacement.of(3), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.FEN_DEAD_PINE, FEN_DEAD_PINE, List.of(CountPlacement.of(3), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.FEN_DEAD_OAK, FEN_DEAD_OAK, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(1), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.FEN_GRASS, FEN_GRASS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.FEN_CATTAILS, FEN_CATTAILS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 30), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, RuVegetationFeatures.WATERSIDE, BiomeFilter.biome()));

        register(context, RuBiomePlacements.BLACKWOOD_FOREST_TALL_BLACKWOOD, BLACKWOOD_FOREST_TALL_BLACKWOOD, List.of(CountPlacement.of(6), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.BLACKWOOD_FOREST_OAK, BLACKWOOD_FOREST_OAK, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.BLACKWOOD_FOREST_BLACKWOOD, BLACKWOOD_FOREST_BLACKWOOD, List.of(CountPlacement.of(8), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.BLACKWOOD_FOREST_MUSHROOM, BLACKWOOD_FOREST_MUSHROOM, List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.BLACKWOOD_FOREST_DARK_OAK, BLACKWOOD_FOREST_DARK_OAK, List.of(CountPlacement.of(7), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.BLACKWOOD_FOREST_GRASS, BLACKWOOD_FOREST_GRASS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.BLACKWOOD_FOREST_TALL_GRASS, BLACKWOOD_FOREST_TALL_GRASS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.BLACKWOOD_FOREST_PINK_BIOSHROOM, BLACKWOOD_FOREST_PINK_BIOSHROOM, List.of(NoiseThresholdCountPlacement.of(-0.9D, 5, 1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.BLACKWOOD_FOREST_BLUE_BIOSHROOM, BLACKWOOD_FOREST_BLUE_BIOSHROOM, List.of(NoiseThresholdCountPlacement.of(-0.9D, 5, 1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, RuBiomePlacements.FLOWER_FIELD_GRASS, FLOWER_FIELD_GRASS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 30), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.FLOWER_FIELD_YELLOW_LUPINE, FLOWER_FIELD_YELLOW_LUPINE, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.FLOWER_FIELD_RED_LUPINE, FLOWER_FIELD_RED_LUPINE, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.FLOWER_FIELD_PINK_LUPINE, FLOWER_FIELD_PINK_LUPINE, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.FLOWER_FIELD_PURPLE_LUPINE, FLOWER_FIELD_PURPLE_LUPINE, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.FLOWER_FIELD_BLUE_LUPINE, FLOWER_FIELD_BLUE_LUPINE, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.FLOWER_FIELD_POPPY_PATCH, FLOWER_FIELD_POPPY_PATCH, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.FLOWER_FIELD_HYSSOP, FLOWER_FIELD_HYSSOP, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 6), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.FLOWER_FIELD_WARATAH, FLOWER_FIELD_WARATAH, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 3), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.FLOWER_FIELD_TRILLIUM, FLOWER_FIELD_TRILLIUM, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.FLOWER_FIELD_TSUBAKI, FLOWER_FIELD_TSUBAKI, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.FLOWER_FIELD_FIREWEED, FLOWER_FIELD_FIREWEED, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.FLOWER_FIELD_DAISY, FLOWER_FIELD_DAISY, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.FLOWER_FIELD_FELICIA_DAISY, FLOWER_FIELD_FELICIA_DAISY, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.FLOWER_FIELD_TASSEL, FLOWER_FIELD_TASSEL, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.FLOWER_FIELD_POPPIES, FLOWER_FIELD_POPPIES, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.FLOWER_FIELD_BLUE_ORCHIDS, FLOWER_FIELD_BLUE_ORCHIDS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 3), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.FLOWER_FIELD_ALLIUM, FLOWER_FIELD_ALLIUM, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.FLOWER_FIELD_RED_TULIP, FLOWER_FIELD_RED_TULIP, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.FLOWER_FIELD_ORANGE_TULIP, FLOWER_FIELD_ORANGE_TULIP, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.FLOWER_FIELD_PINK_TULIP, FLOWER_FIELD_PINK_TULIP, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.FLOWER_FIELD_WHITE_TULIP, FLOWER_FIELD_WHITE_TULIP, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.FLOWER_FIELD_OXEYE_DAISY, FLOWER_FIELD_OXEYE_DAISY, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.FLOWER_FIELD_CORNFLOWER, FLOWER_FIELD_CORNFLOWER, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.FLOWER_FIELD_LILLIES, FLOWER_FIELD_LILLIES, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.FLOWER_FIELD_SUNFLOWER, FLOWER_FIELD_SUNFLOWER, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.FLOWER_FIELD_GREEN_BIOSHROOM, FLOWER_FIELD_GREEN_BIOSHROOM, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.FLOWER_FIELD_BLUE_BIOSHROOM, FLOWER_FIELD_BLUE_BIOSHROOM, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, RuBiomePlacements.GRASSLAND_SHRUB, GRASSLAND_SHRUB, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.GRASSLAND_GRASS, GRASSLAND_GRASS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, RuBiomePlacements.BAOBAB_SAVANNA_SHRUB, BAOBAB_SAVANNA_SHRUB, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.STONE_BUD.get()), BiomeFilter.biome()));
        register(context, RuBiomePlacements.BAOBAB_SAVANNA_BIG_BAOBAB, BAOBAB_SAVANNA_BIG_BAOBAB, List.of(CountPlacement.of(3), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.GRASS_PLACEMENT.get()), BiomeFilter.biome()));
        register(context, RuBiomePlacements.BAOBAB_SAVANNA_SMALL_BAOBAB, BAOBAB_SAVANNA_SMALL_BAOBAB, List.of(CountPlacement.of(3), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.DIRT_PLACEMENT.get()), BiomeFilter.biome()));
        register(context, RuBiomePlacements.BAOBAB_SAVANNA_ACACIA, BAOBAB_SAVANNA_ACACIA, List.of(CountPlacement.of(7), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.MEDIUM_GRASS.get()), BiomeFilter.biome()));
        register(context, RuBiomePlacements.BAOBAB_SAVANNA_BUSH, BAOBAB_SAVANNA_BUSH, List.of(CountPlacement.of(3), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.BAOBAB_SAVANNA_STONE_BUD, BAOBAB_SAVANNA_STONE_BUD, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.BAOBAB_SAVANNA_GRASS, BAOBAB_SAVANNA_GRASS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 8), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.BAOBAB_SAVANNA_TALL_GRASS, BAOBAB_SAVANNA_TALL_GRASS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, RuBiomePlacements.SHRUBLAND_BUSH, SHRUBLAND_BUSH, List.of(CountPlacement.of(3), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.SHRUBLAND_SHRUB, SHRUBLAND_SHRUB, List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.SHRUBLAND_SPRUCE, SHRUBLAND_SPRUCE, List.of(PlacementUtils.countExtra(0, 0.05F, 1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.SHRUBLAND_OAK_SHRUB, SHRUBLAND_OAK_SHRUB, List.of(CountPlacement.of(3), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.SHRUBLAND_SPRUCE_SHRUB, SHRUBLAND_SPRUCE_SHRUB, List.of(CountPlacement.of(3), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.SHRUBLAND_GRASS, SHRUBLAND_GRASS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.SHRUBLAND_YELLOW_LUPINE, SHRUBLAND_YELLOW_LUPINE, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.SHRUBLAND_RED_LUPINE, SHRUBLAND_RED_LUPINE, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, RuBiomePlacements.ICY_HEIGHTS_PINE, ICY_HEIGHTS_PINE, List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.FROZEN_GRASS.get()), BiomeFilter.biome()));
        register(context, RuBiomePlacements.ICY_HEIGHTS_DEAD_PINE, ICY_HEIGHTS_DEAD_PINE, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.FROZEN_GRASS.get()), BiomeFilter.biome()));
        register(context, RuBiomePlacements.ICY_HEIGHTS_SNOWY_GRASS, ICY_HEIGHTS_SNOWY_GRASS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, RuBiomePlacements.OLD_GROWTH_RAINFOREST_PALM, OLD_GROWTH_RAINFOREST_PALM, List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.OLD_GROWTH_RAINFOREST_MANGROVE, OLD_GROWTH_RAINFOREST_MANGROVE, List.of(CountPlacement.of(4), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.OLD_GROWTH_RAINFOREST_JUNGLE_TREE, OLD_GROWTH_RAINFOREST_JUNGLE_TREE, List.of(CountPlacement.of(44), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.OLD_GROWTH_RAINFOREST_BIG_JUNGLE_TREE, OLD_GROWTH_RAINFOREST_BIG_JUNGLE_TREE, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.OLD_GROWTH_RAINFOREST_SHRUB, OLD_GROWTH_RAINFOREST_SHRUB, List.of(CountPlacement.of(5), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.OLD_GROWTH_RAINFOREST_GRASS, OLD_GROWTH_RAINFOREST_GRASS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.OLD_GROWTH_RAINFOREST_GREEN_BIOSHROOM, OLD_GROWTH_RAINFOREST_GREEN_BIOSHROOM, List.of(NoiseThresholdCountPlacement.of(-0.95D, 5, 1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.OLD_GROWTH_RAINFOREST_BLUE_BIOSHROOM, OLD_GROWTH_RAINFOREST_BLUE_BIOSHROOM, List.of(NoiseThresholdCountPlacement.of(-0.95D, 5, 1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.OLD_GROWTH_RAINFOREST_ELEPHANT_EAR, OLD_GROWTH_RAINFOREST_ELEPHANT_EAR, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 4), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, RuBiomePlacements.RAINFOREST_PALM, RAINFOREST_PALM, List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.RAINFOREST_JUNGLE_TREE, RAINFOREST_JUNGLE_TREE, List.of(CountPlacement.of(44), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.RAINFOREST_BIG_JUNGLE_TREE, RAINFOREST_BIG_JUNGLE_TREE, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.RAINFOREST_SHRUB, RAINFOREST_SHRUB, List.of(CountPlacement.of(5), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.RAINFOREST_GRASS, RAINFOREST_GRASS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.RAINFOREST_GREEN_BIOSHROOM, RAINFOREST_GREEN_BIOSHROOM, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.RAINFOREST_PINK_BIOSHROOM, RAINFOREST_PINK_BIOSHROOM, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.RAINFOREST_ELEPHANT_EAR, RAINFOREST_ELEPHANT_EAR, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 3), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, RuBiomePlacements.TROPICS_PALM, TROPICS_PALM, List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.TROPICS_JUNGLE_TREE, TROPICS_JUNGLE_TREE, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.TROPICS_BIG_JUNGLE_TREE, TROPICS_BIG_JUNGLE_TREE, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.TROPICS_SHRUB, TROPICS_SHRUB, List.of(CountPlacement.of(5), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.TROPICS_GRASS, TROPICS_GRASS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.TROPICS_PINK_BIOSHROOM, TROPICS_PINK_BIOSHROOM, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.TROPICS_RED_LUPINE, TROPICS_RED_LUPINE, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.TROPICS_FELICIA_DAISY, TROPICS_FELICIA_DAISY, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.TROPICS_ELEPHANT_EAR, TROPICS_ELEPHANT_EAR, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.TROPICS_SANDY_GRASS, TROPICS_SANDY_GRASS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.SAND_PLACEMENT.get()), BiomeFilter.biome()));
        register(context, RuBiomePlacements.TROPICS_SANDY_TALL_GRASS, TROPICS_SANDY_TALL_GRASS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.SAND_PLACEMENT.get()), BiomeFilter.biome()));

        register(context, RuBiomePlacements.AUTUMNAL_FIELDS_RED_MAPLE, AUTUMNAL_FIELDS_RED_MAPLE, List.of(CountPlacement.of(3), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.DIRT_PLACEMENT.get()), BiomeFilter.biome()));
        register(context, RuBiomePlacements.AUTUMNAL_FIELDS_ORANGE_MAPLE, AUTUMNAL_FIELDS_ORANGE_MAPLE, List.of(CountPlacement.of(3), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.DIRT_PLACEMENT.get()), BiomeFilter.biome()));
        register(context, RuBiomePlacements.AUTUMNAL_FIELDS_DEAD_TREE, AUTUMNAL_FIELDS_DEAD_TREE, List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.DIRT_PLACEMENT.get()), BiomeFilter.biome()));
        register(context, RuBiomePlacements.AUTUMNAL_FIELDS_SILVER_BIRCH, AUTUMNAL_FIELDS_SILVER_BIRCH, List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.DIRT_PLACEMENT.get()), BiomeFilter.biome()));
        register(context, RuBiomePlacements.AUTUMNAL_FIELDS_BIG_RED_MAPLE, AUTUMNAL_FIELDS_BIG_RED_MAPLE, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.DIRT_PLACEMENT.get()), BiomeFilter.biome()));
        register(context, RuBiomePlacements.AUTUMNAL_FIELDS_BIG_ORANGE_MAPLE, AUTUMNAL_FIELDS_BIG_ORANGE_MAPLE, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.DIRT_PLACEMENT.get()), BiomeFilter.biome()));
        register(context, RuBiomePlacements.AUTUMNAL_FIELDS_LARCH, AUTUMNAL_FIELDS_LARCH, List.of(CountPlacement.of(3), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.DIRT_PLACEMENT.get()), BiomeFilter.biome()));
        register(context, RuBiomePlacements.AUTUMNAL_FIELDS_GRASS, AUTUMNAL_FIELDS_GRASS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, RuBiomePlacements.AUTUMNAL_MAPLE_FOREST_RED_MAPLE, AUTUMNAL_MAPLE_FOREST_RED_MAPLE, List.of(CountPlacement.of(3), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.AUTUMNAL_MAPLE_FOREST_ORANGE_MAPLE, AUTUMNAL_MAPLE_FOREST_ORANGE_MAPLE, List.of(CountPlacement.of(3), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.AUTUMNAL_MAPLE_FOREST_MAPLE_TREE, AUTUMNAL_MAPLE_FOREST_MAPLE_TREE, List.of(CountPlacement.of(3), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.AUTUMNAL_MAPLE_FOREST_SILVER_BIRCH, AUTUMNAL_MAPLE_FOREST_SILVER_BIRCH, List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.AUTUMNAL_MAPLE_FOREST_BIG_RED_MAPLE, AUTUMNAL_MAPLE_FOREST_BIG_RED_MAPLE, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.AUTUMNAL_MAPLE_FOREST_BIG_ORANGE_MAPLE, AUTUMNAL_MAPLE_FOREST_BIG_ORANGE_MAPLE, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.AUTUMNAL_MAPLE_FOREST_GRASS, AUTUMNAL_MAPLE_FOREST_GRASS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, RuBiomePlacements.AUTUMNAL_MIXED_TAIGA_SILVER_BIRCH, AUTUMNAL_MIXED_TAIGA_SILVER_BIRCH, List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.AUTUMNAL_MIXED_TAIGA_MAPLE, AUTUMNAL_MIXED_TAIGA_MAPLE, List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.AUTUMNAL_MIXED_TAIGA_BIG_ORANGE_MAPLE, AUTUMNAL_MIXED_TAIGA_BIG_ORANGE_MAPLE, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.AUTUMNAL_MIXED_TAIGA_RED_MAPLE, AUTUMNAL_MIXED_TAIGA_RED_MAPLE, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.AUTUMNAL_MIXED_TAIGA_ORANGE_MAPLE, AUTUMNAL_MIXED_TAIGA_ORANGE_MAPLE, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.AUTUMNAL_MIXED_TAIGA_LARCH, AUTUMNAL_MIXED_TAIGA_LARCH, List.of(CountPlacement.of(3), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.AUTUMNAL_MIXED_TAIGA_GOLDEN_LARCH, AUTUMNAL_MIXED_TAIGA_GOLDEN_LARCH, List.of(CountPlacement.of(3), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.AUTUMNAL_MIXED_TAIGA_GRASS, AUTUMNAL_MIXED_TAIGA_GRASS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, RuBiomePlacements.WILLOW_FOREST_OAK, WILLOW_FOREST_OAK, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.WILLOW_FOREST_WHITE_TREE, WILLOW_FOREST_WHITE_TREE, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.WILLOW_FOREST_WILLOW, WILLOW_FOREST_WILLOW, List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.WILLOW_FOREST_SPRUCE, WILLOW_FOREST_SPRUCE, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.WILLOW_FOREST_DEAD_SPRUCE, WILLOW_FOREST_DEAD_SPRUCE, List.of(PlacementUtils.countExtra(0, 0.05F, 1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.WILLOW_FOREST_BIG_WILLOW, WILLOW_FOREST_BIG_WILLOW, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.WILLOW_FOREST_BUSH, WILLOW_FOREST_BUSH, List.of(CountPlacement.of(4), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.WILLOW_FOREST_GRASS, WILLOW_FOREST_GRASS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, RuBiomePlacements.BOREAL_LARCH, BOREAL_LARCH, List.of(CountPlacement.of(10), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.BOREAL_GOLDEN_LARCH, BOREAL_GOLDEN_LARCH, List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.BOREAL_BUSH, BOREAL_BUSH, List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.BOREAL_BIRCH, BOREAL_BIRCH, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.BOREAL_SMALL_LARCH, BOREAL_SMALL_LARCH, List.of(CountPlacement.of(5), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.BOREAL_FERN, BOREAL_FERN, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.BOREAL_GRASS, BOREAL_GRASS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 4), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, RuBiomePlacements.CHALK_CLIFFS_BUSH, CHALK_CLIFFS_BUSH, List.of(CountPlacement.of(4), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.CHALK_CLIFFS_GRASS, CHALK_CLIFFS_GRASS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 12), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, RuBiomePlacements.LUPINE_PLAINS_GRASS, LUPINE_PLAINS_GRASS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.LUPINE_PLAINS_YELLOW_LUPINE, LUPINE_PLAINS_YELLOW_LUPINE, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.LUPINE_PLAINS_RED_LUPINE, LUPINE_PLAINS_RED_LUPINE, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.LUPINE_PLAINS_BLUE_LUPINE, LUPINE_PLAINS_BLUE_LUPINE, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 12), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.LUPINE_PLAINS_PURPLE_LUPINE, LUPINE_PLAINS_PURPLE_LUPINE, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 12), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.LUPINE_PLAINS_PINK_LUPINE, LUPINE_PLAINS_PINK_LUPINE, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 12), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.LUPINE_PLAINS_STONE_BUD, LUPINE_PLAINS_STONE_BUD, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 4), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, RuBiomePlacements.STEPPE_PLAINS_GRASS, STEPPE_PLAINS_GRASS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 12), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.STEPPE_PLAINS_SHRUB, STEPPE_PLAINS_SHRUB, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 12), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.STEPPE_PLAINS_TALL_GRASS, STEPPE_PLAINS_TALL_GRASS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 12), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.STEPPE_PLAINS_DEAD_SHRUB, STEPPE_PLAINS_DEAD_SHRUB, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 12), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.STEPPE_PLAINS_DESERT_SHRUB, STEPPE_PLAINS_DESERT_SHRUB, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 12), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, RuBiomePlacements.WOODED_STEPPE_BIG_OAK, WOODED_STEPPE_BIG_OAK, List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.WOODED_STEPPE_ACACIA, WOODED_STEPPE_ACACIA, List.of(CountPlacement.of(5), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.WOODED_STEPPE_BUSH, WOODED_STEPPE_BUSH, List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.WOODED_STEPPE_GRASS, WOODED_STEPPE_GRASS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 12), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.WOODED_STEPPE_SHRUB, WOODED_STEPPE_SHRUB, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 12), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.WOODED_STEPPE_DEAD_SHRUB, WOODED_STEPPE_DEAD_SHRUB, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 12), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, RuBiomePlacements.ARID_MOUNTAINS_STONE_SHRUB, ARID_MOUNTAINS_STONE_SHRUB, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.STONE_BUD.get()), BiomeFilter.biome()));
        register(context, RuBiomePlacements.ARID_MOUNTAINS_SHRUB, ARID_MOUNTAINS_SHRUB, List.of(CountPlacement.of(3), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.ARID_MOUNTAINS_ACACIA_SHRUB, ARID_MOUNTAINS_ACACIA_SHRUB, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.ARID_MOUNTAINS_BUSH, ARID_MOUNTAINS_BUSH, List.of(CountPlacement.of(3), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.ARID_MOUNTAINS_ACACIA, ARID_MOUNTAINS_ACACIA, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.ARID_MOUNTAINS_STONE_BUD, ARID_MOUNTAINS_STONE_BUD, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, RuBiomePlacements.WOODED_ARID_MOUNTAINS_STONE_SHRUB, WOODED_ARID_MOUNTAINS_STONE_SHRUB, List.of(CountPlacement.of(3), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.STONE_BUD.get()), BiomeFilter.biome()));
        register(context, RuBiomePlacements.WOODED_ARID_MOUNTAINS_SHRUB, WOODED_ARID_MOUNTAINS_SHRUB, List.of(CountPlacement.of(3), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.WOODED_ARID_MOUNTAINS_ACACIA_SHRUB, WOODED_ARID_MOUNTAINS_ACACIA_SHRUB, List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.WOODED_ARID_MOUNTAINS_BUSH, WOODED_ARID_MOUNTAINS_BUSH, List.of(CountPlacement.of(6), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.WOODED_ARID_MOUNTAINS_ACACIA, WOODED_ARID_MOUNTAINS_ACACIA, List.of(CountPlacement.of(5), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.WOODED_ARID_MOUNTAINS_STONE_BUD, WOODED_ARID_MOUNTAINS_STONE_BUD, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 3), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, RuBiomePlacements.JOSHUA_DESERT_LARGE_JOSHUA_TREE, JOSHUA_DESERT_LARGE_JOSHUA_TREE, List.of(PlacementUtils.countExtra(0, 0.1F, 3), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.JOSHUA_DESERT_MEDIUM_JOSHUA_TREE, JOSHUA_DESERT_MEDIUM_JOSHUA_TREE, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.JOSHUA_DESERT_DEAD_STEPPE_SHRUB, JOSHUA_DESERT_DEAD_STEPPE_SHRUB, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.GRASS_PLACEMENT.get()), BiomeFilter.biome()));
        register(context, RuBiomePlacements.JOSHUA_DESERT_DESERT_SHRUB, JOSHUA_DESERT_DESERT_SHRUB, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.JOSHUA_DESERT_SANDY_GRASS, JOSHUA_DESERT_SANDY_GRASS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 9), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.SAND_PLACEMENT.get()), BiomeFilter.biome()));

        register(context, RuBiomePlacements.PRAIRIE_BIG_OAK, PRAIRIE_BIG_OAK, List.of(PlacementUtils.countExtra(0, 0.05F, 1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.PRAIRIE_GRASS, PRAIRIE_GRASS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 15), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.PRAIRIE_BARLEY, PRAIRIE_BARLEY, List.of(RarityFilter.onAverageOnceEvery(4), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, RuBiomePlacements.BARLEY_FIELDS_BARLEY, BARLEY_FIELDS_BARLEY, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 15), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.BARLEY_FIELDS_GRASS, BARLEY_FIELDS_GRASS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 15), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, RuBiomePlacements.OLD_GROWTH_BOREAL_LARCH, OLD_GROWTH_BOREAL_LARCH, List.of(CountPlacement.of(8), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.OLD_GROWTH_BOREAL_GOLDEN_LARCH, OLD_GROWTH_BOREAL_GOLDEN_LARCH, List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.OLD_GROWTH_BOREAL_BUSH, OLD_GROWTH_BOREAL_BUSH, List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.OLD_GROWTH_BOREAL_BIRCH, OLD_GROWTH_BOREAL_BIRCH, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.OLD_GROWTH_BOREAL_SMALL_LARCH, OLD_GROWTH_BOREAL_SMALL_LARCH, List.of(CountPlacement.of(5), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.OLD_GROWTH_BOREAL_FERN, OLD_GROWTH_BOREAL_FERN, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 4), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.OLD_GROWTH_BOREAL_GRASS, OLD_GROWTH_BOREAL_GRASS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 4), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.OLD_GROWTH_BOREAL_TALL_GRASS, OLD_GROWTH_BOREAL_TALL_GRASS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, RuBiomePlacements.GOLDEN_BOREAL_LARCH, GOLDEN_BOREAL_LARCH, List.of(CountPlacement.of(8), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.GOLDEN_BOREAL_GOLDEN_LARCH, GOLDEN_BOREAL_GOLDEN_LARCH, List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.GOLDEN_BOREAL_BUSH, GOLDEN_BOREAL_BUSH, List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.GOLDEN_BOREAL_BIRCH, GOLDEN_BOREAL_BIRCH, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.GOLDEN_BOREAL_SMALL_LARCH, GOLDEN_BOREAL_SMALL_LARCH, List.of(CountPlacement.of(5), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.GOLDEN_BOREAL_FERN, GOLDEN_BOREAL_FERN, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 4), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.GOLDEN_BOREAL_GRASS, GOLDEN_BOREAL_GRASS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 4), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, RuBiomePlacements.ALPHA_GROVE_TREE, ALPHA_GROVE_TREE, List.of(CountPlacement.of(7), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.ALPHA_GROVE_ROSE, ALPHA_GROVE_ROSE, List.of(RarityFilter.onAverageOnceEvery(2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.DIRT_PLACEMENT.get()), BiomeFilter.biome()));
        register(context, RuBiomePlacements.ALPHA_GROVE_DANDELION, ALPHA_GROVE_DANDELION, List.of(RarityFilter.onAverageOnceEvery(2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.DIRT_PLACEMENT.get()), BiomeFilter.biome()));

        register(context, RuBiomePlacements.SILVER_BIRCH_FOREST_ASPEN, SILVER_BIRCH_FOREST_ASPEN, List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.SILVER_BIRCH_FOREST_SILVER_BIRCH, SILVER_BIRCH_FOREST_SILVER_BIRCH, List.of(CountPlacement.of(6), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.SILVER_BIRCH_FOREST_BIRCH, SILVER_BIRCH_FOREST_BIRCH, List.of(CountPlacement.of(3), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.SILVER_BIRCH_FOREST_GRASS, SILVER_BIRCH_FOREST_GRASS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.DIRT_PLACEMENT.get()), BiomeFilter.biome()));
        register(context, RuBiomePlacements.SILVER_BIRCH_FOREST_SEEDED_GRASS, SILVER_BIRCH_FOREST_SEEDED_GRASS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.SILVER_BIRCH_FOREST_TASSEL, SILVER_BIRCH_FOREST_TASSEL, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, RuBiomePlacements.DECIDUOUS_FOREST_BUSH, DECIDUOUS_FOREST_BUSH, List.of(CountPlacement.of(5), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.DECIDUOUS_FOREST_OAK, DECIDUOUS_FOREST_OAK, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.DECIDUOUS_FOREST_BIG_OAK, DECIDUOUS_FOREST_BIG_OAK, List.of(CountPlacement.of(5), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));

        register(context, RuBiomePlacements.ORCHARD_APPLE_OAK, ORCHARD_APPLE_OAK, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.ORCHARD_BIG_APPLE_OAK, ORCHARD_BIG_APPLE_OAK, List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.ORCHARD_BIG_OAK, ORCHARD_BIG_OAK, List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.ORCHARD_TASSEL, ORCHARD_TASSEL, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.ORCHARD_DAISY, ORCHARD_DAISY, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.ORCHARD_GRASS, ORCHARD_GRASS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, RuBiomePlacements.REDWOODS_GIANT_REDWOOD, REDWOODS_GIANT_REDWOOD, List.of(CountPlacement.of(12), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.REDWOODS_REDWOOD, REDWOODS_REDWOOD, List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.REDWOODS_BUSH, REDWOODS_BUSH, List.of(CountPlacement.of(8), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.REDWOODS_GRASS, REDWOODS_GRASS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 15), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, RuBiomePlacements.SPARSE_REDWOODS_REDWOOD, SPARSE_REDWOODS_REDWOOD, List.of(CountPlacement.of(4), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.SPARSE_REDWOODS_BUSH, SPARSE_REDWOODS_BUSH, List.of(CountPlacement.of(8), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.SPARSE_REDWOODS_GRASS, SPARSE_REDWOODS_GRASS, List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 15), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, RuBiomePlacements.GIANT_BAYOU_BIG_CYPRESS, GIANT_BAYOU_BIG_CYPRESS, List.of(CountPlacement.of(4), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(1), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.GIANT_BAYOU_BIG_CYPRESS_MOSS, GIANT_BAYOU_BIG_CYPRESS_MOSS,   List.of(CountPlacement.of(3), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(2), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.GIANT_BAYOU_SHRUB, GIANT_BAYOU_SHRUB,   List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.GIANT_BAYOU_OAK_TREE, GIANT_BAYOU_OAK_TREE,   List.of(CountPlacement.of(3), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.GIANT_BAYOU_BIG_WILLOW, GIANT_BAYOU_BIG_WILLOW,   List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.GIANT_BAYOU_BUSH, GIANT_BAYOU_BUSH,   List.of(CountPlacement.of(4), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.GIANT_BAYOU_GRASS, GIANT_BAYOU_GRASS,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.GIANT_BAYOU_TALL_GRASS, GIANT_BAYOU_TALL_GRASS,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.GIANT_BAYOU_ELEPHANT_EAR, GIANT_BAYOU_ELEPHANT_EAR,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.GIANT_BAYOU_FERN, GIANT_BAYOU_FERN,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 5), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, RuBiomePlacements.BAYOU_WILLOW, BAYOU_WILLOW,   List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(3), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.BAYOU_BUSH, BAYOU_BUSH,   List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.BAYOU_OAK, BAYOU_OAK,   List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.BAYOU_MOSSY_CYPRESS, BAYOU_MOSSY_CYPRESS,   List.of(CountPlacement.of(3), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.BAYOU_CYPRESS, BAYOU_CYPRESS,   List.of(CountPlacement.of(3), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.BAYOU_BIG_CYPRESS, BAYOU_BIG_CYPRESS,   List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.BAYOU_BIG_MOSSY_CYPRESS, BAYOU_BIG_MOSSY_CYPRESS,   List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.BAYOU_GRASS, BAYOU_GRASS,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.BAYOU_ELEPHANT_EAR, BAYOU_ELEPHANT_EAR,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.BAYOU_FERN, BAYOU_FERN,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 5), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, RuBiomePlacements.BAMBOO_FOREST_GIANT_BAMBOO, BAMBOO_FOREST_GIANT_BAMBOO,   List.of(CountPlacement.of(15), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.BAMBOO_FOREST_TSUBAKI, BAMBOO_FOREST_TSUBAKI,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.BAMBOO_FOREST_SHRUB, BAMBOO_FOREST_SHRUB,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.BAMBOO_FOREST_GRASS, BAMBOO_FOREST_GRASS,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, RuBiomePlacements.POPPY_FIELDS_POPPY_BUSH, POPPY_FIELDS_POPPY_BUSH,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.POPPY_FIELDS_POPPY, POPPY_FIELDS_POPPY,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.POPPY_FIELDS_GRASS, POPPY_FIELDS_GRASS,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, RuBiomePlacements.PINE_FOREST_PINE, PINE_FOREST_PINE,   List.of(CountPlacement.of(9), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.DIRT_PLACEMENT.get()), BiomeFilter.biome()));
        register(context, RuBiomePlacements.PINE_FOREST_TALL_PINE, PINE_FOREST_TALL_PINE,   List.of(CountPlacement.of(3), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.DIRT_PLACEMENT.get()), BiomeFilter.biome()));
        register(context, RuBiomePlacements.PINE_FOREST_SHRUB, PINE_FOREST_SHRUB,   List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.GRASS_PLACEMENT.get()), BiomeFilter.biome()));
        register(context, RuBiomePlacements.PINE_FOREST_GRASS, PINE_FOREST_GRASS,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.PINE_FOREST_TALL_GRASS, PINE_FOREST_TALL_GRASS,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.DIRT_PLACEMENT.get()), BiomeFilter.biome()));

        register(context, RuBiomePlacements.CHERRY_HILLS_CHERRY_TREE, CHERRY_HILLS_CHERRY_TREE,   List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.CHERRY_HILLS_BIG_CHERRY_TREE, CHERRY_HILLS_BIG_CHERRY_TREE,   List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.CHERRY_HILLS_RED_CHERRY_TREE, CHERRY_HILLS_RED_CHERRY_TREE,   List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.CHERRY_HILLS_RED_BIG_CHERRY_TREE, CHERRY_HILLS_RED_BIG_CHERRY_TREE,   List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.CHERRY_HILLS_PINK_CHERRY_TREE, CHERRY_HILLS_PINK_CHERRY_TREE,   List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.CHERRY_HILLS_PINK_BIG_CHERRY_TREE, CHERRY_HILLS_PINK_BIG_CHERRY_TREE,   List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.CHERRY_HILLS_WHITE_CHERRY_TREE, CHERRY_HILLS_WHITE_CHERRY_TREE,   List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.CHERRY_HILLS_WHITE_BIG_CHERRY_TREE, CHERRY_HILLS_WHITE_BIG_CHERRY_TREE,   List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.CHERRY_HILLS_GRASS, CHERRY_HILLS_GRASS,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.CHERRY_HILLS_TSUBAKI, CHERRY_HILLS_TSUBAKI,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, RuBiomePlacements.TEMPERATE_GROVE_MAPLE_TREE, TEMPERATE_GROVE_MAPLE_TREE,   List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.TEMPERATE_GROVE_BIRCH_TREE, TEMPERATE_GROVE_BIRCH_TREE,   List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.TEMPERATE_GROVE_OAK_TREE, TEMPERATE_GROVE_OAK_TREE,   List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.TEMPERATE_GROVE_LARCH, TEMPERATE_GROVE_LARCH,   List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.TEMPERATE_GROVE_BUSH, TEMPERATE_GROVE_BUSH,   List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.TEMPERATE_GROVE_GRASS, TEMPERATE_GROVE_GRASS,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 9), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.TEMPERATE_GROVE_TASSEL, TEMPERATE_GROVE_TASSEL,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.TEMPERATE_GROVE_DAISY, TEMPERATE_GROVE_DAISY,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, RuBiomePlacements.EUCALYPTUS_FOREST_EUCALYPTUS_TREE, EUCALYPTUS_FOREST_EUCALYPTUS_TREE,   List.of(CountPlacement.of(8), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.GRASS_PLACEMENT.get()), BiomeFilter.biome()));
        register(context, RuBiomePlacements.EUCALYPTUS_FOREST_SHRUB, EUCALYPTUS_FOREST_SHRUB,   List.of(CountPlacement.of(4), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.GRASS_PLACEMENT.get()), BiomeFilter.biome()));
        register(context, RuBiomePlacements.EUCALYPTUS_FOREST_GRASS, EUCALYPTUS_FOREST_GRASS,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.EUCALYPTUS_FOREST_ELEPHANT_EAR, EUCALYPTUS_FOREST_ELEPHANT_EAR,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.EUCALYPTUS_FOREST_WARATAH, EUCALYPTUS_FOREST_WARATAH,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, RuBiomePlacements.ROOFED_EUCALYPTUS_FOREST_EUCALYPTUS_TREE_CANOPY, ROOFED_EUCALYPTUS_FOREST_EUCALYPTUS_TREE_CANOPY,   List.of(CountPlacement.of(7), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.GRASS_PLACEMENT.get()), BiomeFilter.biome()));
        register(context, RuBiomePlacements.ROOFED_EUCALYPTUS_FOREST_EUCALYPTUS_TREE, ROOFED_EUCALYPTUS_FOREST_EUCALYPTUS_TREE,   List.of(CountPlacement.of(7), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.GRASS_PLACEMENT.get()), BiomeFilter.biome()));
        register(context, RuBiomePlacements.ROOFED_EUCALYPTUS_FOREST_SHRUB, ROOFED_EUCALYPTUS_FOREST_SHRUB,   List.of(CountPlacement.of(6), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.GRASS_PLACEMENT.get()), BiomeFilter.biome()));
        register(context, RuBiomePlacements.ROOFED_EUCALYPTUS_FOREST_SAPLING, ROOFED_EUCALYPTUS_FOREST_SAPLING,   List.of(CountPlacement.of(8), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.ROOFED_EUCALYPTUS_FOREST_GRASS, ROOFED_EUCALYPTUS_FOREST_GRASS,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.ROOFED_EUCALYPTUS_FOREST_ELEPHANT_EAR, ROOFED_EUCALYPTUS_FOREST_ELEPHANT_EAR,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.ROOFED_EUCALYPTUS_FOREST_WARATAH, ROOFED_EUCALYPTUS_FOREST_WARATAH,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, RuBiomePlacements.MAUVE_HILLS_MAUVE_OAK, MAUVE_HILLS_MAUVE_OAK,   List.of(CountPlacement.of(5), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.MAUVE_HILLS_BIG_MAUVE_OAK, MAUVE_HILLS_BIG_MAUVE_OAK,   List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.MAUVE_HILLS_OAK, MAUVE_HILLS_OAK,   List.of(CountPlacement.of(3), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.MAUVE_HILLS_GRASS, MAUVE_HILLS_GRASS,  List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.MAUVE_HILLS_PURPLE_LUPINE, MAUVE_HILLS_PURPLE_LUPINE,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.MAUVE_HILLS_PINK_LUPINE, MAUVE_HILLS_PINK_LUPINE,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.MAUVE_HILLS_PINK_BIOSHROOM, MAUVE_HILLS_PINK_BIOSHROOM,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, RuBiomePlacements.TOWERING_CLIFFS_PINE, TOWERING_CLIFFS_PINE,   List.of(PlacementUtils.countExtra(2, 0.1F, 1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.TOWERING_CLIFFS_DEAD_PINE, TOWERING_CLIFFS_DEAD_PINE,   List.of(PlacementUtils.countExtra(0, 0.1F, 1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.TOWERING_CLIFFS_GRASS, TOWERING_CLIFFS_GRASS,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.TOWERING_CLIFFS_HYSSOP, TOWERING_CLIFFS_HYSSOP,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.TOWERING_CLIFFS_FERNS, TOWERING_CLIFFS_FERNS,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, RuBiomePlacements.FUNGAL_FEN_BROWN_MUSHROOM, FUNGAL_FEN_BROWN_MUSHROOM,   List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.FUNGAL_FEN_RED_MUSHROOM, FUNGAL_FEN_RED_MUSHROOM,   List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.FUNGAL_FEN_PINE, FUNGAL_FEN_PINE,   List.of(CountPlacement.of(9), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.FUNGAL_FEN_GRASS, FUNGAL_FEN_GRASS,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.FUNGAL_FEN_ELEPHANT_EAR, FUNGAL_FEN_ELEPHANT_EAR,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.FUNGAL_FEN_FERN, FUNGAL_FEN_FERN,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 5), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.FUNGAL_FEN_GREEN_BIOSHROOM, FUNGAL_FEN_GREEN_BIOSHROOM,   List.of(NoiseThresholdCountPlacement.of(-0.9D, 5, 1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.FUNGAL_FEN_BLUE_BIOSHROOM, FUNGAL_FEN_BLUE_BIOSHROOM,   List.of(NoiseThresholdCountPlacement.of(-0.9D, 5, 1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, RuBiomePlacements.OUTBACK_SHRUB, OUTBACK_SHRUB,   List.of(CountPlacement.of(4), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.OUTBACK_SHRUB_DENSE, OUTBACK_SHRUB_DENSE,   List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.OUTBACK_GRASS, OUTBACK_GRASS,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 3), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.OUTBACK_DEAD_STEPPE_SHRUB, OUTBACK_DEAD_STEPPE_SHRUB,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 3), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.GRASS_PLACEMENT.get()), BiomeFilter.biome()));
        register(context, RuBiomePlacements.OUTBACK_DESERT_SHRUB, OUTBACK_DESERT_SHRUB,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 4), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.OUTBACK_STONE_BUD, OUTBACK_STONE_BUD,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, RuBiomePlacements.SAGUARO_DESERT_CACTUS, SAGUARO_DESERT_CACTUS,   List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.SAND_PLACEMENT.get()), BiomeFilter.biome()));
        register(context, RuBiomePlacements.SAGUARO_DESERT_GRASS, SAGUARO_DESERT_GRASS,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.SAGUARO_DESERT_SANDY_GRASS, SAGUARO_DESERT_SANDY_GRASS,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.SAND_PLACEMENT.get()), BiomeFilter.biome()));
        register(context, RuBiomePlacements.SAGUARO_DESERT_BARREL_CACTUS, SAGUARO_DESERT_BARREL_CACTUS,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.SAND_PLACEMENT.get()), BiomeFilter.biome()));

        register(context, RuBiomePlacements.FROZEN_TUNDRA_SHRUB, FROZEN_TUNDRA_SHRUB,   List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.FROZEN_TUNDRA_MAPLE_SHRUB, FROZEN_TUNDRA_MAPLE_SHRUB,   List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.FROZEN_TUNDRA_SHRUB_SNOW, FROZEN_TUNDRA_SHRUB_SNOW,   List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.FROZEN_GRASS.get()), BiomeFilter.biome()));
        register(context, RuBiomePlacements.FROZEN_TUNDRA_MAPLE_SHRUB_SNOW, FROZEN_TUNDRA_MAPLE_SHRUB_SNOW,   List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.FROZEN_GRASS.get()), BiomeFilter.biome()));
        register(context, RuBiomePlacements.FROZEN_TUNDRA_SNOWY_GRASS, FROZEN_TUNDRA_SNOWY_GRASS,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 3), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.FROZEN_TUNDRA_GRASS, FROZEN_TUNDRA_GRASS,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 3), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, RuBiomePlacements.DRY_BRUSHLAND_ACACIA, DRY_BRUSHLAND_ACACIA,   List.of(PlacementUtils.countExtra(1, 0.1F, 1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.DRY_BRUSHLAND_SHRUB, DRY_BRUSHLAND_SHRUB,   List.of(CountPlacement.of(3), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.GRASS_PLACEMENT.get()), BiomeFilter.biome()));
        register(context, RuBiomePlacements.DRY_BRUSHLAND_JOSHUA_SHRUB, DRY_BRUSHLAND_JOSHUA_SHRUB,   List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.GRASS_PLACEMENT.get()), BiomeFilter.biome()));
        register(context, RuBiomePlacements.DRY_BRUSHLAND_SHRUB_SAND, DRY_BRUSHLAND_SHRUB_SAND, List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.DIRT_PLACEMENT.get()), BiomeFilter.biome()));
        register(context, RuBiomePlacements.DRY_BRUSHLAND_JOSHUA_SHRUB_SAND, DRY_BRUSHLAND_JOSHUA_SHRUB_SAND,   List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.DIRT_PLACEMENT.get()), BiomeFilter.biome()));
        register(context, RuBiomePlacements.DRY_BRUSHLAND_SANDY_GRASS, DRY_BRUSHLAND_SANDY_GRASS,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.DRY_BRUSHLAND_GRASS, DRY_BRUSHLAND_GRASS,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 3), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.DRY_BRUSHLAND_DESERT_GRASS, DRY_BRUSHLAND_DESERT_GRASS,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.DRY_BRUSHLAND_FIREWEED, DRY_BRUSHLAND_FIREWEED,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, RuBiomePlacements.COLD_DECIDUOUS_FOREST_BUSH, COLD_DECIDUOUS_FOREST_BUSH,   List.of(CountPlacement.of(5), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.COLD_DECIDUOUS_FOREST_OAK, COLD_DECIDUOUS_FOREST_OAK,   List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.COLD_DECIDUOUS_FOREST_BIG_OAK, COLD_DECIDUOUS_FOREST_BIG_OAK,   List.of(CountPlacement.of(3), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.COLD_DECIDUOUS_FOREST_GRASS, COLD_DECIDUOUS_FOREST_GRASS,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 3), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, RuBiomePlacements.ICY_DESERT_STONE_BUD, ICY_DESERT_STONE_BUD,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.ICY_DESERT_SNOWY_GRASS, ICY_DESERT_SNOWY_GRASS,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, RuBiomePlacements.SPIRES_SNOWY_GRASS, SPIRES_SNOWY_GRASS,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 3), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, RuBiomePlacements.SMOULDERING_WOODLAND_OAK, SMOULDERING_WOODLAND_OAK,   List.of(CountPlacement.of(3), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.SMOULDERING_WOODLAND_DEAD_PINE, SMOULDERING_WOODLAND_DEAD_PINE, List.of(CountPlacement.of(16), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING),BiomeFilter.biome()));
        register(context, RuBiomePlacements.SMOULDERING_WOODLAND_PINE, SMOULDERING_WOODLAND_PINE,   List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.SMOULDERING_WOODLAND_DORCEL, SMOULDERING_WOODLAND_DORCEL,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.SMOULDERING_WOODLAND_TRILLIUM, SMOULDERING_WOODLAND_TRILLIUM,   List.of(RarityFilter.onAverageOnceEvery(2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, RuBiomePlacements.SMOULDERING_WOODLAND_DEAD_STEPPE_SHRUB, SMOULDERING_WOODLAND_DEAD_STEPPE_SHRUB,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.GRASS_PLACEMENT.get()), BiomeFilter.biome()));
        register(context, RuBiomePlacements.SMOULDERING_WOODLAND_DESERT_SHRUB, SMOULDERING_WOODLAND_DESERT_SHRUB,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, RuBiomePlacements.FROZEN_FOREST_PINE, FROZEN_FOREST_PINE,   List.of(CountPlacement.of(9), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.FROZEN_GRASS.get()), BiomeFilter.biome()));
        register(context, RuBiomePlacements.FROZEN_FOREST_TALL_PINE, FROZEN_FOREST_TALL_PINE,   List.of(CountPlacement.of(3), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(RegionsUnexploredBlocks.FROZEN_GRASS.get()), BiomeFilter.biome()));
        register(context, RuBiomePlacements.FROZEN_FOREST_SNOWY_GRASS, FROZEN_FOREST_SNOWY_GRASS,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, RuBiomePlacements.MEADOW_MAUVE_OAK, MEADOW_MAUVE_OAK,   List.of(PlacementUtils.countExtra(0, 0.1F, 1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.MEADOW_MAUVE_OAK_BEE, MEADOW_MAUVE_OAK_BEE,   List.of(PlacementUtils.countExtra(0, 0.1F, 1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
        register(context, RuBiomePlacements.MEADOW_GRASS, MEADOW_GRASS,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 15), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, RuBiomePlacements.FLOODED_PLAINS_GRASS, FLOODED_PLAINS_GRASS,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 15), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RuBiomePlacements.FLOODED_PLAINS_TALL_GRASS, FLOODED_PLAINS_TALL_GRASS,   List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, RuBiomePlacements.LUSH_DELTA_AZALEA, LUSH_DELTA_AZALEA, List.of(CountOnEveryLayerPlacement.of(64), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome()));
    }

    protected static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> feature, PlacementModifier... placement) {
        register(context, key, feature, List.of(placement));
    }

    protected static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> feature, List<PlacementModifier> placement) {
        context.register(key, new PlacedFeature(feature, placement));
    }
}
