package net.regions_unexplored.util.worldgen;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.regions_unexplored.RegionsUnexploredMod;
import net.regions_unexplored.data.worldgen.placement.*;

public class RuPlacementUtils {
    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        RuPlacements.bootstrap(context);
        RuBiomePlacements.bootstrap(context);
        RuNetherBiomePlacements.bootstrap(context);
        RuVegetationPlacements.bootstrap(context);
    }

    public static ResourceKey<PlacedFeature> createKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(RegionsUnexploredMod.MOD_ID, name));
    }
}