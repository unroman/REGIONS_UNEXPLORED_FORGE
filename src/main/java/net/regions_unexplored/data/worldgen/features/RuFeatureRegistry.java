package net.regions_unexplored.data.worldgen.features;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.HugeFungusConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.BlockStateConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.ColumnFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.VegetationPatchConfiguration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.regions_unexplored.RegionsUnexploredMod;
import net.regions_unexplored.data.worldgen.features.feature.*;
import net.regions_unexplored.data.worldgen.features.feature.LavaDeltaFeature;
import net.regions_unexplored.data.worldgen.features.feature.bioshroom.GiantBioshroomFeature;
import net.regions_unexplored.data.worldgen.features.feature.bioshroom.PinkBioshroomFeature;
import net.regions_unexplored.data.worldgen.features.feature.redstonefeatures.*;
import net.regions_unexplored.data.worldgen.features.feature.tree.LargeJoshuaTreeFeature;
import net.regions_unexplored.data.worldgen.features.feature.tree.MediumJoshuaTreeFeature;
import net.regions_unexplored.data.worldgen.features.treefeature.GiantSculkWillowFeature;
import net.regions_unexplored.data.worldgen.features.treefeature.NetherWillowFeature;
import net.regions_unexplored.data.worldgen.features.treefeature.SculkWillowFeature;
import net.regions_unexplored.data.worldgen.structures.MeadowRock;
import net.regions_unexplored.data.worldgen.structures.Spires;

@Mod.EventBusSubscriber
public class RuFeatureRegistry {
    public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, RegionsUnexploredMod.MOD_ID);
    public static RegistryObject<Feature> SPIRE_FEATURE = REGISTRY.register("spire_feature", () -> new Spires());
    public static RegistryObject<Feature> MEADOW_ROCKS_FEATURE = REGISTRY.register("meadow_rocks_feature", () -> new MeadowRock());
    public static final RegistryObject<Feature> ROCK_PILLAR = REGISTRY.register("rock_pillar", () -> new RockPillarFeature(NoneFeatureConfiguration.CODEC));
    public static final RegistryObject<Feature> LARGE_JOSHUA_TREE = REGISTRY.register("large_joshua_tree", () -> new LargeJoshuaTreeFeature(NoneFeatureConfiguration.CODEC));
    public static final RegistryObject<Feature> MEDIUM_JOSHUA_TREE = REGISTRY.register("medium_joshua_tree", () -> new MediumJoshuaTreeFeature(NoneFeatureConfiguration.CODEC));
    public static final RegistryObject<Feature> GIANT_PINK_BIOSHROOM = REGISTRY.register("giant_pink_bioshroom", () -> new PinkBioshroomFeature(NoneFeatureConfiguration.CODEC));
    public static final RegistryObject<Feature> GIANT_BIOSHROOM = REGISTRY.register("giant_bioshroom", () -> new GiantBioshroomFeature(HugeFungusConfiguration.CODEC));
    public static final RegistryObject<Feature> SCULK_WILLOW = REGISTRY.register("sculk_willow", () -> new SculkWillowFeature(NoneFeatureConfiguration.CODEC));
    public static final RegistryObject<Feature> GIANT_SCULK_WILLOW = REGISTRY.register("giant_sculk_willow", () -> new GiantSculkWillowFeature(NoneFeatureConfiguration.CODEC));
    public static final RegistryObject<Feature> NETHER_MEADOW_ROCK = REGISTRY.register("nether_meadow_rock", () -> new NetherBlockBlobFeature(BlockStateConfiguration.CODEC));
    public static final RegistryObject<Feature> GLISTERING_IVY = REGISTRY.register("glistering_ivy", () -> new GlisteringIvyFeature(NoneFeatureConfiguration.CODEC));
    public static final RegistryObject<Feature> HANGING_EARLIGHT = REGISTRY.register("hanging_earlight", () -> new HangingEarlightFeature(NoneFeatureConfiguration.CODEC));
    public static final RegistryObject<Feature> OBSIDIAN_SPIRE = REGISTRY.register("obsidian_spire", () -> new ObsidianSpireFeature(NoneFeatureConfiguration.CODEC));
    public static final RegistryObject<Feature> NETHER_WILLOW = REGISTRY.register("nether_willow", () -> new NetherWillowFeature(NoneFeatureConfiguration.CODEC));
    public static final RegistryObject<Feature> HANGING_PRISMARITE = REGISTRY.register("hanging_prismarite", () -> new HangingPrismariteFeature(NoneFeatureConfiguration.CODEC));
    public static final RegistryObject<Feature> BASALT_BLOB = REGISTRY.register("basalt_blob", () -> new BasaltBlobFeature(ColumnFeatureConfiguration.CODEC));
    public static final RegistryObject<Feature> ASH_VENT = REGISTRY.register("scorch_vent", () -> new AshVentFeature(NoneFeatureConfiguration.CODEC));
    public static final RegistryObject<Feature> LAVA_FALL = REGISTRY.register("lava_fall", () -> new LavaFallFeature(NoneFeatureConfiguration.CODEC));
    public static final RegistryObject<Feature> OVERWORLD_LAVA_DELTA = REGISTRY.register("overworld_lava_delta", () -> new LavaDeltaFeature(VegetationPatchConfiguration.CODEC));
    public static final RegistryObject<Feature> POINTED_REDSTONE = REGISTRY.register("pointed_redstone", () -> new PointedRedstoneFeature(PointedRedstoneConfiguration.CODEC));
    public static final RegistryObject<Feature> LARGE_POINTED_REDSTONE = REGISTRY.register("large_pointed_redstone", () -> new LargePointedRedstoneFeature(LargePointedRedstoneConfiguration.CODEC));
    public static final RegistryObject<Feature> POINTED_REDSTONE_CLUSTER = REGISTRY.register("pointed_redstone_cluster", () -> new PointedRedstoneClusterFeature(PointedRedstoneClusterConfiguration.CODEC));

}