package net.regions_unexplored.data.worldgen.placement;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.BlockPredicateFilter;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.regions_unexplored.block.RegionsUnexploredBlocks;
import net.regions_unexplored.data.worldgen.features.RuTreeFeatures;
import net.regions_unexplored.util.worldgen.RuPlacementUtils;

import java.util.List;

public class RuTreePlacements {
    public static final ResourceKey<PlacedFeature> GIANT_GREEN_BIOSHROOM_CHECKED = RuPlacementUtils.createKey("giant_green_bioshroom");
    public static final ResourceKey<PlacedFeature> GIANT_BLUE_BIOSHROOM_CHECKED = RuPlacementUtils.createKey("giant_blue_bioshroom");
    public static final ResourceKey<PlacedFeature> GIANT_GREEN_BIOSHROOM_DEEPSLATE_CHECKED = RuPlacementUtils.createKey("giant_green_bioshroom_deepslate");
    public static final ResourceKey<PlacedFeature> GIANT_BLUE_BIOSHROOM_DEEPSLATE_CHECKED = RuPlacementUtils.createKey("giant_blue_bioshroom_deepslate");

    public static final ResourceKey<PlacedFeature> SCORCH_BUSH_CHECKED = RuPlacementUtils.createKey("scorch_bush_checked");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> featureGetter = context.lookup(Registries.CONFIGURED_FEATURE);

        final Holder<ConfiguredFeature<?, ?>> GIANT_GREEN_BIOSHROOM = featureGetter.getOrThrow(RuTreeFeatures.GIANT_GREEN_BIOSHROOM);
        final Holder<ConfiguredFeature<?, ?>> GIANT_BLUE_BIOSHROOM = featureGetter.getOrThrow(RuTreeFeatures.GIANT_BLUE_BIOSHROOM);
        final Holder<ConfiguredFeature<?, ?>> GIANT_GREEN_BIOSHROOM_DEEPSLATE = featureGetter.getOrThrow(RuTreeFeatures.GIANT_GREEN_BIOSHROOM_DEEPSLATE);
        final Holder<ConfiguredFeature<?, ?>> GIANT_BLUE_BIOSHROOM_DEEPSLATE = featureGetter.getOrThrow(RuTreeFeatures.GIANT_BLUE_BIOSHROOM_DEEPSLATE);

        final Holder<ConfiguredFeature<?, ?>> SCORCH_BUSH = featureGetter.getOrThrow(RuTreeFeatures.DEAD_OAK_BUSH);

        register(context, GIANT_GREEN_BIOSHROOM_CHECKED, GIANT_GREEN_BIOSHROOM, List.of(BlockPredicateFilter.forPredicate(BlockPredicate.matchesBlocks(new BlockPos(0, -1, 0), RegionsUnexploredBlocks.VIRIDESCENT_NYLIUM.get()))));
        register(context, GIANT_BLUE_BIOSHROOM_CHECKED, GIANT_BLUE_BIOSHROOM, List.of(BlockPredicateFilter.forPredicate(BlockPredicate.matchesBlocks(new BlockPos(0, -1, 0), RegionsUnexploredBlocks.VIRIDESCENT_NYLIUM.get()))));
        register(context, GIANT_GREEN_BIOSHROOM_DEEPSLATE_CHECKED, GIANT_GREEN_BIOSHROOM_DEEPSLATE, List.of(BlockPredicateFilter.forPredicate(BlockPredicate.matchesBlocks(new BlockPos(0, -1, 0), RegionsUnexploredBlocks.DEEPSLATE_VIRIDESCENT_NYLIUM.get()))));
        register(context, GIANT_BLUE_BIOSHROOM_DEEPSLATE_CHECKED, GIANT_BLUE_BIOSHROOM_DEEPSLATE, List.of(BlockPredicateFilter.forPredicate(BlockPredicate.matchesBlocks(new BlockPos(0, -1, 0), RegionsUnexploredBlocks.DEEPSLATE_VIRIDESCENT_NYLIUM.get()))));

        register(context, SCORCH_BUSH_CHECKED, SCORCH_BUSH, List.of(PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING)));

    }

    protected static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> feature, PlacementModifier... placement) {
        register(context, key, feature, List.of(placement));
    }

    protected static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> feature, List<PlacementModifier> placement) {
        context.register(key, new PlacedFeature(feature, placement));
    }
}
