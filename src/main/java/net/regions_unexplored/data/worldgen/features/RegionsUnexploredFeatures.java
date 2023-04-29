package net.regions_unexplored.data.worldgen.features;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.MultifaceGrowthFeature;
import net.minecraft.world.level.levelgen.feature.SeagrassFeature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraftforge.registries.RegistryObject;
import net.regions_unexplored.RegionsUnexploredMod;
import net.regions_unexplored.data.worldgen.features.feature.*;
import net.regions_unexplored.data.worldgen.features.feature.LavaDeltaFeature;
import net.regions_unexplored.data.worldgen.features.feature.bioshroom.GiantBioshroomConfiguration;
import net.regions_unexplored.data.worldgen.features.feature.bioshroom.GiantBlueBioshroomFeature;
import net.regions_unexplored.data.worldgen.features.feature.bioshroom.GiantGreenBioshroomFeature;
import net.regions_unexplored.data.worldgen.features.feature.bioshroom.PinkBioshroomFeature;
import net.regions_unexplored.data.worldgen.features.feature.configuration.HyacinthStockConfiguration;
import net.regions_unexplored.data.worldgen.features.feature.configuration.SeaRockConfiguration;
import net.regions_unexplored.data.worldgen.features.feature.redstonefeatures.*;
import net.regions_unexplored.data.worldgen.features.feature.tree.*;
import net.regions_unexplored.data.worldgen.features.feature.tree.config.RuTreeConfiguration;
import net.regions_unexplored.data.worldgen.features.feature.tree.config.TallSaplingConfiguration;
import net.regions_unexplored.data.worldgen.features.treefeature.GiantSculkWillowFeature;
import net.regions_unexplored.data.worldgen.features.treefeature.NetherWillowFeature;
import net.regions_unexplored.data.worldgen.features.treefeature.SculkWillowFeature;
import net.regions_unexplored.data.worldgen.structures.MeadowRock;
import net.regions_unexplored.data.worldgen.structures.Spires;
import org.apache.http.cookie.SM;

public class RegionsUnexploredFeatures {

    public static RegistryObject<Feature> SPIRE_FEATURE;
    public static RegistryObject<Feature> MEADOW_ROCKS_FEATURE;
    //1.19.4 stuff
    public static RegistryObject<Feature> GIANT_GREEN_BIOSHROOM;
    public static RegistryObject<Feature> GIANT_BLUE_BIOSHROOM;

    public static RegistryObject<Feature> MAPLE_TREE;
    public static RegistryObject<Feature> SAKURA_TREE;
    public static RegistryObject<Feature> ULTRA_REDWOOD_TREE;

    public static RegistryObject<Feature> TALL_SAPLING;
    //LEGACY
    public static RegistryObject<Feature> ROCK_PILLAR;
    public static RegistryObject<Feature> LARGE_JOSHUA_TREE;
    public static RegistryObject<Feature> MEDIUM_JOSHUA_TREE;
    public static RegistryObject<Feature> GIANT_PINK_BIOSHROOM;
    public static RegistryObject<Feature> SCULK_WILLOW;
    public static RegistryObject<Feature> GIANT_SCULK_WILLOW;
    public static RegistryObject<Feature> NETHER_MEADOW_ROCK;
    public static RegistryObject<Feature> GLISTERING_IVY;
    public static RegistryObject<Feature> HANGING_EARLIGHT;
    public static RegistryObject<Feature> OBSIDIAN_SPIRE;
    public static RegistryObject<Feature> NETHER_WILLOW;
    public static RegistryObject<Feature> HANGING_PRISMARITE;
    public static RegistryObject<Feature> BASALT_BLOB;
    public static RegistryObject<Feature> ASH_VENT;
    public static RegistryObject<Feature> LAVA_FALL;
    public static RegistryObject<Feature> OVERWORLD_LAVA_DELTA;
    public static RegistryObject<Feature> POINTED_REDSTONE;
    public static RegistryObject<Feature> LARGE_POINTED_REDSTONE;
    public static RegistryObject<Feature> POINTED_REDSTONE_CLUSTER;
    public static RegistryObject<Feature> AIR_MULTIFACE_GROWTH;
    //WATER_FEATURES
    public static RegistryObject<Feature> WATER_CATTAIL;
    public static RegistryObject<Feature> TALL_HYACINTH_STOCK;
    public static RegistryObject<Feature> HYACINTH_PLANTS;
    public static RegistryObject<Feature> OCEAN_ROCK;
    public static RegistryObject<Feature> SMOULDERING_DIRT;

    public static void addFeatures() {
        SPIRE_FEATURE = RegionsUnexploredMod.FEATURES.register("spire_feature", () -> new Spires());
        MEADOW_ROCKS_FEATURE = RegionsUnexploredMod.FEATURES.register("meadow_rocks_feature", () -> new MeadowRock());
        //1.19.4 stuff
        GIANT_GREEN_BIOSHROOM = RegionsUnexploredMod.FEATURES.register("giant_green_bioshroom", () -> new GiantGreenBioshroomFeature(GiantBioshroomConfiguration.CODEC));
        GIANT_BLUE_BIOSHROOM = RegionsUnexploredMod.FEATURES.register("giant_blue_bioshroom", () -> new GiantBlueBioshroomFeature(GiantBioshroomConfiguration.CODEC));

        MAPLE_TREE = RegionsUnexploredMod.FEATURES.register("maple_tree", () -> new MapleTreeFeature(RuTreeConfiguration.CODEC));
        SAKURA_TREE = RegionsUnexploredMod.FEATURES.register("sakura_tree", () -> new SakuraTreeFeature(RuTreeConfiguration.CODEC));
        ULTRA_REDWOOD_TREE = RegionsUnexploredMod.FEATURES.register("ultra_redwood_tree", () -> new UltraRedwoodTreeFeature(RuTreeConfiguration.CODEC));

        TALL_SAPLING = RegionsUnexploredMod.FEATURES.register("tall_sapling", () -> new TallSaplingFeature(TallSaplingConfiguration.CODEC));
        //LEGACY
        ROCK_PILLAR = RegionsUnexploredMod.FEATURES.register("rock_pillar", () -> new RockPillarFeature(NoneFeatureConfiguration.CODEC));
        LARGE_JOSHUA_TREE = RegionsUnexploredMod.FEATURES.register("large_joshua_tree", () -> new LargeJoshuaTreeFeature(NoneFeatureConfiguration.CODEC));
        MEDIUM_JOSHUA_TREE = RegionsUnexploredMod.FEATURES.register("medium_joshua_tree", () -> new MediumJoshuaTreeFeature(NoneFeatureConfiguration.CODEC));
        GIANT_PINK_BIOSHROOM = RegionsUnexploredMod.FEATURES.register("giant_pink_bioshroom", () -> new PinkBioshroomFeature(NoneFeatureConfiguration.CODEC));
        SCULK_WILLOW = RegionsUnexploredMod.FEATURES.register("sculk_willow", () -> new SculkWillowFeature(NoneFeatureConfiguration.CODEC));
        GIANT_SCULK_WILLOW = RegionsUnexploredMod.FEATURES.register("giant_sculk_willow", () -> new GiantSculkWillowFeature(NoneFeatureConfiguration.CODEC));
        NETHER_MEADOW_ROCK = RegionsUnexploredMod.FEATURES.register("nether_meadow_rock", () -> new NetherBlockBlobFeature(BlockStateConfiguration.CODEC));
        GLISTERING_IVY = RegionsUnexploredMod.FEATURES.register("glistering_ivy", () -> new GlisteringIvyFeature(NoneFeatureConfiguration.CODEC));
        HANGING_EARLIGHT = RegionsUnexploredMod.FEATURES.register("hanging_earlight", () -> new HangingEarlightFeature(NoneFeatureConfiguration.CODEC));
        OBSIDIAN_SPIRE = RegionsUnexploredMod.FEATURES.register("obsidian_spire", () -> new ObsidianSpireFeature(NoneFeatureConfiguration.CODEC));
        NETHER_WILLOW = RegionsUnexploredMod.FEATURES.register("nether_willow", () -> new NetherWillowFeature(NoneFeatureConfiguration.CODEC));
        HANGING_PRISMARITE = RegionsUnexploredMod.FEATURES.register("hanging_prismarite", () -> new HangingPrismariteFeature(NoneFeatureConfiguration.CODEC));
        BASALT_BLOB = RegionsUnexploredMod.FEATURES.register("basalt_blob", () -> new BasaltBlobFeature(ColumnFeatureConfiguration.CODEC));
        ASH_VENT = RegionsUnexploredMod.FEATURES.register("scorch_vent", () -> new AshVentFeature(NoneFeatureConfiguration.CODEC));
        LAVA_FALL = RegionsUnexploredMod.FEATURES.register("lava_fall", () -> new LavaFallFeature(NoneFeatureConfiguration.CODEC));
        OVERWORLD_LAVA_DELTA = RegionsUnexploredMod.FEATURES.register("overworld_lava_delta", () -> new LavaDeltaFeature(VegetationPatchConfiguration.CODEC));
        POINTED_REDSTONE = RegionsUnexploredMod.FEATURES.register("pointed_redstone", () -> new PointedRedstoneFeature(PointedRedstoneConfiguration.CODEC));
        LARGE_POINTED_REDSTONE = RegionsUnexploredMod.FEATURES.register("large_pointed_redstone", () -> new LargePointedRedstoneFeature(LargePointedRedstoneConfiguration.CODEC));
        POINTED_REDSTONE_CLUSTER = RegionsUnexploredMod.FEATURES.register("pointed_redstone_cluster", () -> new PointedRedstoneClusterFeature(PointedRedstoneClusterConfiguration.CODEC));
        AIR_MULTIFACE_GROWTH = RegionsUnexploredMod.FEATURES.register("air_multiface_growth", () -> new AirMultifaceGrowthFeature(MultifaceGrowthConfiguration.CODEC));
        //WATER_FEATURES
        WATER_CATTAIL = RegionsUnexploredMod.FEATURES.register("water_cattail", () -> new WaterCattailFeature(NoneFeatureConfiguration.CODEC));
        TALL_HYACINTH_STOCK = RegionsUnexploredMod.FEATURES.register("tall_hyacinth_stock", () -> new HyacinthStockFeature(HyacinthStockConfiguration.CODEC));
        HYACINTH_PLANTS = RegionsUnexploredMod.FEATURES.register("hyacinth_plants", () -> new HyacinthPlantsFeature(ProbabilityFeatureConfiguration.CODEC));
        OCEAN_ROCK = RegionsUnexploredMod.FEATURES.register("ocean_rock", () -> new SeaRockFeature(SeaRockConfiguration.CODEC));
        SMOULDERING_DIRT = RegionsUnexploredMod.FEATURES.register("smouldering_dirt", () -> new SmoulderingAshenDirtFeature(NoneFeatureConfiguration.CODEC));
    }
}