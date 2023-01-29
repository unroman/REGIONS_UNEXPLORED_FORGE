package net.regions_unexplored.data.worldgen.structures;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.LakeFeature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockIgnoreProcessor;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.regions_unexplored.block.RegionsUnexploredBlocks;
import net.regions_unexplored.data.worldgen.features.RuFeatures;
import net.regions_unexplored.data.worldgen.structures.biomefix.MeadowRockFix;
import net.regions_unexplored.util.worldgen.RuFeatureUtils;
import net.regions_unexplored.util.worldgen.RuPlacementUtils;

import java.util.List;
import java.util.Random;
import java.util.Set;

public class MeadowRock extends Feature<NoneFeatureConfiguration> {
    //REMAKE INTO FEATURE
    private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);
    private final List<Block> base_blocks;
    private StructureTemplate template = null;

    public MeadowRock() {
        super(NoneFeatureConfiguration.CODEC);
        base_blocks = List.of(RegionsUnexploredBlocks.FOREST_GRASS_BLOCK.get(), RegionsUnexploredBlocks.PLAINS_GRASS_BLOCK.get(),
                Blocks.GRASS_BLOCK);
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        if (!generate_dimensions.contains(context.level().getLevel().dimension()))
            return false;
        boolean anyPlaced = false;
        if ((context.random().nextInt(1000000) + 1) <= 1000000) {
            int count = context.random().nextInt(1) + 1;
            for (int a = 0; a < count; a++) {

                Random random = new Random();
                String o1 = "null";
                int structure = random.nextInt(4);
                if(structure==0)o1="rock1";
                else if(structure==1)o1="rock2";
                else if(structure==2)o1="rock3";
                else if(structure==3)o1="rock4";

                template = context.level().getLevel().getStructureManager().getOrCreate(new ResourceLocation("regions_unexplored", o1));

                int i = context.origin().getX() + context.random().nextInt(16);
                int k = context.origin().getZ() + context.random().nextInt(16);
                int j = context.level().getHeight(Heightmap.Types.OCEAN_FLOOR_WG, i, k) - 1;
                if (!base_blocks.contains(context.level().getBlockState(new BlockPos(i, j, k)).getBlock()))
                    continue;
                BlockPos spawnTo = new BlockPos(i + 0, j + -2, k + 0);
                WorldGenLevel world = context.level();
                int x = spawnTo.getX();
                int y = spawnTo.getY();
                int z = spawnTo.getZ();
                if (!MeadowRockFix.execute(world, x, y, z))
                    continue;
                if (template.placeInWorld(
                        context.level(), spawnTo, spawnTo, new StructurePlaceSettings().setMirror(Mirror.NONE).setRotation(Rotation.NONE)
                                .setRandom(context.random()).addProcessor(BlockIgnoreProcessor.STRUCTURE_AND_AIR).setIgnoreEntities(false),
                        context.random(), 2)) {
                    anyPlaced = true;
                }
            }
        }
        return anyPlaced;
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> configuredFeatureKey, F feature, FC configuration) {
        context.register(configuredFeatureKey, new ConfiguredFeature<>(feature, configuration));
    }

    protected static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> placedFeatureKey, Holder<ConfiguredFeature<?, ?>> configuredFeature, PlacementModifier... modifiers) {
        register(context, placedFeatureKey, configuredFeature, List.of(modifiers));
    }

    protected static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> placedFeatureKey, Holder<ConfiguredFeature<?, ?>> configuredFeature, List<PlacementModifier> modifiers) {
        context.register(placedFeatureKey, new PlacedFeature(configuredFeature, modifiers));
    }
}




