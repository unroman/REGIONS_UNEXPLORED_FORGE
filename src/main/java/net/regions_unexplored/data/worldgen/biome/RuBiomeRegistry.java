package net.regions_unexplored.data.worldgen.biome;

import net.minecraft.core.HolderGetter;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.npc.VillagerType;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.carver.ConfiguredWorldCarver;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.regions_unexplored.RegionsUnexploredMod;
import net.regions_unexplored.config.RegionsUnexploredCommonConfigs;
import net.regions_unexplored.data.worldgen.RuNetherSurfaceRuleData;
import net.regions_unexplored.data.worldgen.RuSurfaceRuleData;
import net.regions_unexplored.world.level.biome.*;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;

public class RuBiomeRegistry {

    public static void setup() {
        registerVillagerTypes();
    }

    public static void setupBiomePlacement() {
        Regions.register(new RuRegion1(RegionsUnexploredCommonConfigs.REGION_NORTHERN_LIKE_WEIGHT.get()));
        Regions.register(new RuRegion2(RegionsUnexploredCommonConfigs.REGION_TEMPERATE_LIKE_WEIGHT.get()));
        Regions.register(new RuRegion3(RegionsUnexploredCommonConfigs.REGION_OVERSEAS_LIKE_WEIGHT.get()));
        Regions.register(new RuRegionRare(RegionsUnexploredCommonConfigs.REGION_RARE_WEIGHT.get()));
        Regions.register(new RuRegionNether(RegionsUnexploredCommonConfigs.REGION_NETHER_WEIGHT.get()));
    }

    public static void bootstrapBiomes(BootstapContext<Biome> context) {
        HolderGetter<ConfiguredWorldCarver<?>> carversGetter = context.lookup(Registries.CONFIGURED_CARVER);
        HolderGetter<PlacedFeature> featuresGetter = context.lookup(Registries.PLACED_FEATURE);

        register(context, RuBiomes.LUSH_DELTA, RuOverworldBiomes.lushDelta(featuresGetter, carversGetter));
        register(context, RuBiomes.SCORCHING_CAVES, RuOverworldBiomes.scorch(featuresGetter, carversGetter));
        register(context, RuBiomes.PRISMACHASM, RuOverworldBiomes.prismachasm(featuresGetter, carversGetter));
        register(context, RuBiomes.REDSTONE_CAVES, RuOverworldBiomes.redstoneCaves(featuresGetter, carversGetter));
        register(context, RuBiomes.BIOSHROOM_CAVES, RuOverworldBiomes.bioshroomCaves(featuresGetter, carversGetter));
        register(context, RuBiomes.TROPICS, RuOverworldBiomes.tropics(featuresGetter, carversGetter));
        register(context, RuBiomes.SMOULDERING_WOODLAND, RuOverworldBiomes.smoulderingWoodland(featuresGetter, carversGetter));
        register(context, RuBiomes.GRASSY_BEACH, RuOverworldBiomes.grassyBeach(featuresGetter, carversGetter));
        register(context, RuBiomes.DRY_BUSHLAND, RuOverworldBiomes.dryBushland(featuresGetter, carversGetter));
        register(context, RuBiomes.ORCHARD, RuOverworldBiomes.orchard(featuresGetter, carversGetter));
        register(context, RuBiomes.SPIRES, RuOverworldBiomes.spires(featuresGetter, carversGetter));
        register(context, RuBiomes.FROZEN_TUNDRA, RuOverworldBiomes.frozenTundra(featuresGetter, carversGetter));
        register(context, RuBiomes.BAMBOO_FOREST, RuOverworldBiomes.bambooForest(featuresGetter, carversGetter));
        register(context, RuBiomes.BAOBAB_SAVANNA, RuOverworldBiomes.baobabSavanna(featuresGetter, carversGetter));
        register(context, RuBiomes.LUPINE_PLAINS, RuOverworldBiomes.lupinePlains(featuresGetter, carversGetter));
        register(context, RuBiomes.LUSH_HILLS, RuOverworldBiomes.lushHills(featuresGetter, carversGetter));
        register(context, RuBiomes.FLOWER_FIELD, RuOverworldBiomes.flowerField(featuresGetter, carversGetter));
        register(context, RuBiomes.ALPHA_GROVE, RuOverworldBiomes.alphaGrove(featuresGetter, carversGetter));
        register(context, RuBiomes.ARID_MOUNTAINS, RuOverworldBiomes.aridMountains(featuresGetter, carversGetter));
        register(context, RuBiomes.WOODED_ARID_MOUNTAINS, RuOverworldBiomes.woodedAridMountains(featuresGetter, carversGetter));
        register(context, RuBiomes.JOSHUA_DESERT, RuOverworldBiomes.joshuaDesert(featuresGetter, carversGetter));
        register(context, RuBiomes.CANADIAN_FOREST, RuOverworldBiomes.canadianForest(featuresGetter, carversGetter));
        register(context, RuBiomes.MAPLE_FOREST, RuOverworldBiomes.mapleForest(featuresGetter, carversGetter));
        register(context, RuBiomes.CHERRY_HILLS, RuOverworldBiomes.cherryHills(featuresGetter, carversGetter));
        register(context, RuBiomes.CHALK_CLIFFS, RuOverworldBiomes.chalkCliffs(featuresGetter, carversGetter));
        register(context, RuBiomes.PUMPKIN_FIELDS, RuOverworldBiomes.pumpkinFields(featuresGetter, carversGetter));
        register(context, RuBiomes.AUTUMNAL_FIELDS, RuOverworldBiomes.autumnalFields(featuresGetter, carversGetter));
        register(context, RuBiomes.WILLOW_FOREST, RuOverworldBiomes.mixedForest(featuresGetter, carversGetter));
        register(context, RuBiomes.AUTUMNAL_MIXED_TAIGA, RuOverworldBiomes.autumnalMixedTaiga(featuresGetter, carversGetter));
        register(context, RuBiomes.RAINFOREST, RuOverworldBiomes.rainforest(featuresGetter, carversGetter));
        register(context, RuBiomes.OLD_GROWTH_RAINFOREST, RuOverworldBiomes.oldGrowthRainforest(featuresGetter, carversGetter));
        register(context, RuBiomes.FEN, RuOverworldBiomes.fen(featuresGetter, carversGetter));
        register(context, RuBiomes.FUNGAL_FEN, RuOverworldBiomes.fungalFen(featuresGetter, carversGetter));
        register(context, RuBiomes.SAGUARO_DESERT, RuOverworldBiomes.saguaroDesert(featuresGetter, carversGetter));
        register(context, RuBiomes.OUTBACK, RuOverworldBiomes.outback(featuresGetter, carversGetter));
        register(context, RuBiomes.MEADOW, RuOverworldBiomes.meadow(featuresGetter, carversGetter));
        register(context, RuBiomes.STEPPE, RuOverworldBiomes.steppe(featuresGetter, carversGetter));
        register(context, RuBiomes.WOODED_STEPPE, RuOverworldBiomes.woodedSteppe(featuresGetter, carversGetter));
        register(context, RuBiomes.ICY_HEIGHTS, RuOverworldBiomes.icyHeights(featuresGetter, carversGetter));
        register(context, RuBiomes.AUTUMNAL_MAPLE_FOREST, RuOverworldBiomes.autumnalMapleForest(featuresGetter, carversGetter));
        register(context, RuBiomes.FROZEN_FOREST, RuOverworldBiomes.frozenForest(featuresGetter, carversGetter));
        register(context, RuBiomes.ICY_DESERT, RuOverworldBiomes.icyDesert(featuresGetter, carversGetter));
        register(context, RuBiomes.TEMPERATE_GROVE, RuOverworldBiomes.temperateGrove(featuresGetter, carversGetter));
        register(context, RuBiomes.GRASSLAND, RuOverworldBiomes.grassland(featuresGetter, carversGetter));
        register(context, RuBiomes.BAYOU, RuOverworldBiomes.bayou(featuresGetter, carversGetter));
        register(context, RuBiomes.GIANT_BAYOU, RuOverworldBiomes.giantBayou(featuresGetter, carversGetter));
        register(context, RuBiomes.TOWERING_CLIFFS, RuOverworldBiomes.toweringCliffs(featuresGetter, carversGetter));
        register(context, RuBiomes.FLOODED_PLAINS, RuOverworldBiomes.floodedPlains(featuresGetter, carversGetter));
        register(context, RuBiomes.BLACKWOOD_FOREST, RuOverworldBiomes.blackwoodForest(featuresGetter, carversGetter));
        register(context, RuBiomes.PRAIRIE, RuOverworldBiomes.prairie(featuresGetter, carversGetter));
        register(context, RuBiomes.MUDDY_RIVER, RuOverworldBiomes.muddyRiver(featuresGetter, carversGetter));
        register(context, RuBiomes.COLD_RIVER, RuOverworldBiomes.coldRiver(featuresGetter, carversGetter));
        register(context, RuBiomes.BARLEY_FIELDS, RuOverworldBiomes.barleyFields(featuresGetter, carversGetter));
        register(context, RuBiomes.POPPY_FIELDS, RuOverworldBiomes.poppyFields(featuresGetter, carversGetter));
        register(context, RuBiomes.GRAVEL_BEACH, RuOverworldBiomes.gravelBeach(featuresGetter, carversGetter));
        register(context, RuBiomes.BOREAL_FOREST, RuOverworldBiomes.borealForest(featuresGetter, carversGetter));
        register(context, RuBiomes.SILVER_BIRCH_FOREST, RuOverworldBiomes.silverBirchForest(featuresGetter, carversGetter));
        register(context, RuBiomes.SHRUBLAND, RuOverworldBiomes.shrubland(featuresGetter, carversGetter));
        register(context, RuBiomes.PINE_SLOPES, RuOverworldBiomes.pineSlopes(featuresGetter, carversGetter));
        register(context, RuBiomes.MAUVE_HILLS, RuOverworldBiomes.mauveHills(featuresGetter, carversGetter));
        register(context, RuBiomes.MOUNTAINS, RuOverworldBiomes.mountains(featuresGetter, carversGetter));
        register(context, RuBiomes.PINE_FOREST, RuOverworldBiomes.pineForest(featuresGetter, carversGetter));
        register(context, RuBiomes.EUCALYPTUS_FOREST, RuOverworldBiomes.eucalyptusForest(featuresGetter, carversGetter));
        register(context, RuBiomes.ROOFED_EUCALYPTUS_FOREST, RuOverworldBiomes.roofedEucalyptusForest(featuresGetter, carversGetter));
        register(context, RuBiomes.REDWOODS, RuOverworldBiomes.redwoodForest(featuresGetter, carversGetter));
        register(context, RuBiomes.SPARSE_REDWOODS, RuOverworldBiomes.sparseRedwoods(featuresGetter, carversGetter));
        register(context, RuBiomes.HIGHLAND_FIELDS, RuOverworldBiomes.highlandFields(featuresGetter, carversGetter));
        register(context, RuBiomes.DECIDUOUS_FOREST, RuOverworldBiomes.deciduousForest(featuresGetter, carversGetter));
        register(context, RuBiomes.COLD_DECIDUOUS_FOREST, RuOverworldBiomes.coldDeciduousForest(featuresGetter, carversGetter));
        register(context, RuBiomes.COLD_BOREAL_FOREST, RuOverworldBiomes.coldBorealForest(featuresGetter, carversGetter));
        register(context, RuBiomes.GOLDEN_BOREAL_FOREST, RuOverworldBiomes.goldenBorealForest(featuresGetter, carversGetter));
        register(context, RuBiomes.OLD_GROWTH_BOREAL_FOREST, RuOverworldBiomes.oldGrowthBorealForest(featuresGetter, carversGetter));

        register(context, RuBiomes.MYCOTOXIC_UNDERGROWTH, RuNetherBiomes.mycotoxicUndergrowth(featuresGetter, carversGetter));
        register(context, RuBiomes.GLISTERING_MEADOW, RuNetherBiomes.glisteringMeadow(featuresGetter, carversGetter));
        register(context, RuBiomes.REDSTONE_HELL, RuNetherBiomes.redstoneHell(featuresGetter, carversGetter));
        register(context, RuBiomes.CORRUPTED_HOLT, RuNetherBiomes.corruptedHolt(featuresGetter, carversGetter));
        register(context, RuBiomes.BLACKSTONE_BASIN, RuNetherBiomes.blackstoneBasin(featuresGetter, carversGetter));
    }

    private static void registerVillagerTypes() {
        registerVillagers(RuBiomes.LUSH_DELTA, VillagerType.PLAINS);
        registerVillagers(RuBiomes.SCORCHING_CAVES, VillagerType.PLAINS);
        registerVillagers(RuBiomes.PRISMACHASM, VillagerType.PLAINS);
        registerVillagers(RuBiomes.REDSTONE_CAVES, VillagerType.PLAINS);
        registerVillagers(RuBiomes.BIOSHROOM_CAVES, VillagerType.PLAINS);
        registerVillagers(RuBiomes.TROPICS, VillagerType.JUNGLE);
        registerVillagers(RuBiomes.SMOULDERING_WOODLAND, VillagerType.PLAINS);
        registerVillagers(RuBiomes.GRASSY_BEACH, VillagerType.PLAINS);
        registerVillagers(RuBiomes.DRY_BUSHLAND, VillagerType.SAVANNA);
        registerVillagers(RuBiomes.ORCHARD, VillagerType.PLAINS);
        registerVillagers(RuBiomes.SPIRES, VillagerType.SNOW);
        registerVillagers(RuBiomes.FROZEN_TUNDRA, VillagerType.SNOW);
        registerVillagers(RuBiomes.BAMBOO_FOREST, VillagerType.JUNGLE);
        registerVillagers(RuBiomes.BAOBAB_SAVANNA, VillagerType.SAVANNA);
        registerVillagers(RuBiomes.LUPINE_PLAINS, VillagerType.PLAINS);
        registerVillagers(RuBiomes.LUSH_HILLS, VillagerType.PLAINS);
        registerVillagers(RuBiomes.FLOWER_FIELD, VillagerType.PLAINS);
        registerVillagers(RuBiomes.ALPHA_GROVE, VillagerType.PLAINS);
        registerVillagers(RuBiomes.ARID_MOUNTAINS, VillagerType.SAVANNA);
        registerVillagers(RuBiomes.WOODED_ARID_MOUNTAINS, VillagerType.SAVANNA);
        registerVillagers(RuBiomes.JOSHUA_DESERT, VillagerType.DESERT);
        registerVillagers(RuBiomes.CANADIAN_FOREST, VillagerType.PLAINS);
        registerVillagers(RuBiomes.MAPLE_FOREST, VillagerType.PLAINS);
        registerVillagers(RuBiomes.CHERRY_HILLS, VillagerType.PLAINS);
        registerVillagers(RuBiomes.CHALK_CLIFFS, VillagerType.PLAINS);
        registerVillagers(RuBiomes.PUMPKIN_FIELDS, VillagerType.PLAINS);
        registerVillagers(RuBiomes.AUTUMNAL_FIELDS, VillagerType.PLAINS);
        registerVillagers(RuBiomes.WILLOW_FOREST, VillagerType.TAIGA);
        registerVillagers(RuBiomes.AUTUMNAL_MIXED_TAIGA, VillagerType.TAIGA);
        registerVillagers(RuBiomes.RAINFOREST, VillagerType.JUNGLE);
        registerVillagers(RuBiomes.OLD_GROWTH_RAINFOREST, VillagerType.JUNGLE);
        registerVillagers(RuBiomes.FEN, VillagerType.SWAMP);
        registerVillagers(RuBiomes.FUNGAL_FEN, VillagerType.SWAMP);
        registerVillagers(RuBiomes.SAGUARO_DESERT, VillagerType.DESERT);
        registerVillagers(RuBiomes.OUTBACK, VillagerType.DESERT);
        registerVillagers(RuBiomes.MEADOW, VillagerType.PLAINS);
        registerVillagers(RuBiomes.STEPPE, VillagerType.SAVANNA);
        registerVillagers(RuBiomes.WOODED_STEPPE, VillagerType.SAVANNA);
        registerVillagers(RuBiomes.ICY_HEIGHTS, VillagerType.SNOW);
        registerVillagers(RuBiomes.AUTUMNAL_MAPLE_FOREST, VillagerType.PLAINS);
        registerVillagers(RuBiomes.FROZEN_FOREST, VillagerType.SNOW);
        registerVillagers(RuBiomes.ICY_DESERT, VillagerType.SNOW);
        registerVillagers(RuBiomes.TEMPERATE_GROVE, VillagerType.PLAINS);
        registerVillagers(RuBiomes.GRASSLAND, VillagerType.PLAINS);
        registerVillagers(RuBiomes.BAYOU, VillagerType.SWAMP);
        registerVillagers(RuBiomes.GIANT_BAYOU, VillagerType.SWAMP);
        registerVillagers(RuBiomes.TOWERING_CLIFFS, VillagerType.PLAINS);
        registerVillagers(RuBiomes.FLOODED_PLAINS, VillagerType.SWAMP);
        registerVillagers(RuBiomes.BLACKWOOD_FOREST, VillagerType.JUNGLE);
        registerVillagers(RuBiomes.PRAIRIE, VillagerType.PLAINS);
        registerVillagers(RuBiomes.MUDDY_RIVER, VillagerType.PLAINS);
        registerVillagers(RuBiomes.COLD_RIVER, VillagerType.PLAINS);
        registerVillagers(RuBiomes.BARLEY_FIELDS, VillagerType.PLAINS);
        registerVillagers(RuBiomes.POPPY_FIELDS, VillagerType.PLAINS);
        registerVillagers(RuBiomes.GRAVEL_BEACH, VillagerType.PLAINS);
        registerVillagers(RuBiomes.BOREAL_FOREST, VillagerType.TAIGA);
        registerVillagers(RuBiomes.SILVER_BIRCH_FOREST, VillagerType.PLAINS);
        registerVillagers(RuBiomes.SHRUBLAND, VillagerType.TAIGA);
        registerVillagers(RuBiomes.PINE_SLOPES, VillagerType.TAIGA);
        registerVillagers(RuBiomes.MAUVE_HILLS, VillagerType.PLAINS);
        registerVillagers(RuBiomes.MOUNTAINS, VillagerType.PLAINS);
        registerVillagers(RuBiomes.PINE_FOREST, VillagerType.TAIGA);
        registerVillagers(RuBiomes.EUCALYPTUS_FOREST, VillagerType.JUNGLE);
        registerVillagers(RuBiomes.ROOFED_EUCALYPTUS_FOREST, VillagerType.JUNGLE);
        registerVillagers(RuBiomes.REDWOODS, VillagerType.TAIGA);
        registerVillagers(RuBiomes.SPARSE_REDWOODS, VillagerType.TAIGA);
        registerVillagers(RuBiomes.HIGHLAND_FIELDS, VillagerType.PLAINS);
        registerVillagers(RuBiomes.DECIDUOUS_FOREST, VillagerType.PLAINS);
        registerVillagers(RuBiomes.COLD_DECIDUOUS_FOREST, VillagerType.SNOW);
        registerVillagers(RuBiomes.COLD_BOREAL_FOREST, VillagerType.SNOW);
        registerVillagers(RuBiomes.GOLDEN_BOREAL_FOREST, VillagerType.TAIGA);
        registerVillagers(RuBiomes.OLD_GROWTH_BOREAL_FOREST, VillagerType.TAIGA);
    }

    private static void register(BootstapContext<Biome> context, ResourceKey<Biome> key, Biome biome) {
        context.register(key, biome);
    }

    private static void registerVillagers(ResourceKey<Biome> key, VillagerType type) {
            VillagerType.BY_BIOME.put(key, type);
    }
}