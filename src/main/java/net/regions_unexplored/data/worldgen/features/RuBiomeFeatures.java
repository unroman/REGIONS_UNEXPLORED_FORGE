package net.regions_unexplored.data.worldgen.features;

import com.google.common.collect.ImmutableList;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.regions_unexplored.data.worldgen.placement.RuTreePlacements;
import net.regions_unexplored.util.worldgen.RuFeatureUtils;

public class RuBiomeFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> GIANT_BIOSHROOMS = RuFeatureUtils.createKey("giant_bioshrooms");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GIANT_BIOSHROOMS_DEEPSLATE = RuFeatureUtils.createKey("giant_bioshrooms_deepslate");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        HolderGetter<PlacedFeature> placedFeatureGetter = context.lookup(Registries.PLACED_FEATURE);

        final Holder<PlacedFeature> GIANT_GREEN_BIOSHROOM_CHECKED = placedFeatureGetter.getOrThrow(RuTreePlacements.GIANT_GREEN_BIOSHROOM_CHECKED);
        final Holder<PlacedFeature> GIANT_BLUE_BIOSHROOM_CHECKED = placedFeatureGetter.getOrThrow(RuTreePlacements.GIANT_BLUE_BIOSHROOM_CHECKED);
        final Holder<PlacedFeature> GIANT_GREEN_BIOSHROOM_DEEPSLATE_CHECKED = placedFeatureGetter.getOrThrow(RuTreePlacements.GIANT_GREEN_BIOSHROOM_DEEPSLATE_CHECKED);
        final Holder<PlacedFeature> GIANT_BLUE_BIOSHROOM_DEEPSLATE_CHECKED = placedFeatureGetter.getOrThrow(RuTreePlacements.GIANT_BLUE_BIOSHROOM_DEEPSLATE_CHECKED);

        register(context, RuBiomeFeatures.GIANT_BIOSHROOMS, Feature.RANDOM_SELECTOR, new RandomFeatureConfiguration(ImmutableList.of(new WeightedPlacedFeature(GIANT_GREEN_BIOSHROOM_CHECKED, 0.5F)), GIANT_BLUE_BIOSHROOM_CHECKED));
        register(context, RuBiomeFeatures.GIANT_BIOSHROOMS_DEEPSLATE, Feature.RANDOM_SELECTOR, new RandomFeatureConfiguration(ImmutableList.of(new WeightedPlacedFeature(GIANT_GREEN_BIOSHROOM_DEEPSLATE_CHECKED, 0.5F)), GIANT_BLUE_BIOSHROOM_DEEPSLATE_CHECKED));
    }
    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC config) {
        context.register(key, new ConfiguredFeature<>(feature, config));
    }
}
