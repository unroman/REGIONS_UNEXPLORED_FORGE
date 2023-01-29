package net.regions_unexplored.util.worldgen;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.regions_unexplored.RegionsUnexploredMod;
import net.regions_unexplored.data.worldgen.features.RuBiomeFeatures;
import net.regions_unexplored.data.worldgen.features.RuFeatures;
import net.regions_unexplored.data.worldgen.features.RuTreeFeatures;
import net.regions_unexplored.data.worldgen.features.RuVegetationFeatures;
import net.regions_unexplored.data.worldgen.structures.MeadowRock;
import net.regions_unexplored.data.worldgen.structures.Spires;

public class RuFeatureUtils {
    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuBiomeFeatures.bootstrap(context);
        RuFeatures.bootstrap(context);
        RuTreeFeatures.bootstrap(context);
        RuVegetationFeatures.bootstrap(context);
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> createKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(RegionsUnexploredMod.MOD_ID, name));
    }
}
