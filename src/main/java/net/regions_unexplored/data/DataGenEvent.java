package net.regions_unexplored.data;

import com.google.gson.JsonElement;
import com.mojang.serialization.JsonOps;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.Registry;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.registries.VanillaRegistries;
import net.minecraft.resources.RegistryOps;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.synth.NormalNoise;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.JsonCodecProvider;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.regions_unexplored.RegionsUnexploredMod;
import net.regions_unexplored.data.worldgen.noise.RuNoises;
import net.regions_unexplored.data.worldgen.biome.RuBiomeRegistry;
import net.regions_unexplored.data.worldgen.biome.RuBiomes;
import net.regions_unexplored.data.worldgen.features.RuFeatures;
import net.regions_unexplored.data.worldgen.features.RuTreeFeatures;
import net.regions_unexplored.data.worldgen.features.RuVegetationFeatures;
import net.regions_unexplored.data.worldgen.placement.*;
import net.regions_unexplored.util.worldgen.RuFeatureUtils;
import net.regions_unexplored.util.worldgen.RuNoiseUtils;
import net.regions_unexplored.util.worldgen.RuPlacementUtils;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Mod.EventBusSubscriber(modid = RegionsUnexploredMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenEvent {
    @SubscribeEvent
    public static void onGatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        HolderLookup.Provider lookupProvider = new RegistrySetBuilder().add(Registries.NOISE, (RegistrySetBuilder.RegistryBootstrap) RuNoiseUtils::bootstrap).add(Registries.CONFIGURED_FEATURE, (RegistrySetBuilder.RegistryBootstrap) RuFeatureUtils::bootstrap).add(Registries.PLACED_FEATURE, (RegistrySetBuilder.RegistryBootstrap) RuPlacementUtils::bootstrap).add(Registries.BIOME, RuBiomeRegistry::bootstrapBiomes).buildPatch(RegistryAccess.fromRegistryOfRegistries(BuiltInRegistries.REGISTRY), VanillaRegistries.createLookup());

        RegistryOps<JsonElement> registryOps = RegistryOps.create(JsonOps.INSTANCE, lookupProvider);

        Map<ResourceLocation, NormalNoise.NoiseParameters> noiseMapping = createMappings(Registries.NOISE, lookupProvider, RuNoises.class);

        Map<ResourceLocation, ConfiguredFeature<?, ?>> featureConfigMapping = createMappings(Registries.CONFIGURED_FEATURE, lookupProvider, RuFeatures.class, RuVegetationFeatures.class, RuTreeFeatures.class);

        Map<ResourceLocation, PlacedFeature> featurePlacedMapping = createMappings(Registries.PLACED_FEATURE, lookupProvider, RuPlacements.class, RuBiomePlacements.class, RuNetherBiomePlacements.class, RuVegetationPlacements.class);

        Map<ResourceLocation, Biome> biomeMapping = createMappings(Registries.BIOME, lookupProvider, RuBiomes.class);

        generator.addProvider(event.includeServer(), JsonCodecProvider.forDatapackRegistry(generator, existingFileHelper, RegionsUnexploredMod.MOD_ID, registryOps, Registries.NOISE, noiseMapping));

        generator.addProvider(event.includeServer(), JsonCodecProvider.forDatapackRegistry(generator, existingFileHelper, RegionsUnexploredMod.MOD_ID, registryOps, Registries.CONFIGURED_FEATURE, featureConfigMapping));

        generator.addProvider(event.includeServer(), JsonCodecProvider.forDatapackRegistry(generator, existingFileHelper, RegionsUnexploredMod.MOD_ID, registryOps, Registries.PLACED_FEATURE, featurePlacedMapping));

        generator.addProvider(event.includeServer(), JsonCodecProvider.forDatapackRegistry(generator, existingFileHelper, RegionsUnexploredMod.MOD_ID, registryOps, Registries.BIOME, biomeMapping));
    }

    private static <T> Map<ResourceLocation, T> createMappings(ResourceKey<? extends Registry<? extends T>> registry, HolderLookup.Provider lookupProvider, Class... classProvider) {
        Map<ResourceLocation, T> map = new HashMap<>();
        List.of(classProvider).forEach(classes -> {
            for (Field field : classes.getFields()) {
                if (field.getType() != ResourceKey.class) continue;
                try {
                    ResourceKey<T> key = (ResourceKey)field.get(null);
                    HolderLookup.RegistryLookup<T> lookup = lookupProvider.lookupOrThrow(registry);
                    map.put(key.location(), lookup.getOrThrow(key).value());
                }

                catch (IllegalAccessException e) {
                    RegionsUnexploredMod.LOGGER.error(String.valueOf(e));
                }
            }
        });
        return map;
    }
}

