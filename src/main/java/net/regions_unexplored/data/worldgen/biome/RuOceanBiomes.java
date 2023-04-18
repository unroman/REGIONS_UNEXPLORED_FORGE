package net.regions_unexplored.data.worldgen.biome;

import net.minecraft.core.HolderGetter;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.worldgen.placement.AquaticPlacements;
import net.minecraft.data.worldgen.placement.MiscOverworldPlacements;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.sounds.Musics;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.*;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.carver.ConfiguredWorldCarver;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.regions_unexplored.client.particle.RegionsUnexploredParticleTypes;
import net.regions_unexplored.data.worldgen.RuBiomeDefaultFeatures;
import net.regions_unexplored.data.worldgen.placement.RuAquaticPlacements;
import net.regions_unexplored.data.worldgen.placement.RuBiomePlacements;
import net.regions_unexplored.data.worldgen.placement.RuPlacements;
import net.regions_unexplored.data.worldgen.placement.RuVegetationPlacements;

public class RuOceanBiomes {

    protected static int calculateSkyColor(float color) {
        float $$1 = color / 3.0F;
        $$1 = Mth.clamp($$1, -1.0F, 1.0F);
        return Mth.hsvToRgb(0.62222224F - $$1 * 0.05F, 0.5F + $$1 * 0.1F, 1.0F);
    }

    private static void globalOverworldGeneration(BiomeGenerationSettings.Builder builder) {
        BiomeDefaultFeatures.addDefaultCarversAndLakes(builder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(builder);
        BiomeDefaultFeatures.addDefaultMonsterRoom(builder);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(builder);
        BiomeDefaultFeatures.addDefaultSprings(builder);
        BiomeDefaultFeatures.addSurfaceFreezing(builder);
    }

    private static BiomeGenerationSettings.Builder baseOceanGeneration(HolderGetter<PlacedFeature> p_256289_, HolderGetter<ConfiguredWorldCarver<?>> p_256514_) {
        BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder(p_256289_, p_256514_);
        globalOverworldGeneration(biomeBuilder);
        RuBiomeDefaultFeatures.mediumGrass(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
        BiomeDefaultFeatures.addDefaultSoftDisks(biomeBuilder);
        BiomeDefaultFeatures.addWaterTrees(biomeBuilder);
        BiomeDefaultFeatures.addDefaultFlowers(biomeBuilder);
        BiomeDefaultFeatures.addDefaultGrass(biomeBuilder);
        BiomeDefaultFeatures.addDefaultMushrooms(biomeBuilder);
        BiomeDefaultFeatures.addDefaultExtraVegetation(biomeBuilder);
        return biomeBuilder;
    }

    public static Biome hyacinthDeeps(HolderGetter<PlacedFeature> featureGetter, HolderGetter<ConfiguredWorldCarver<?>> carverGetter) {
        MobSpawnSettings.Builder spawnBuilder = (new MobSpawnSettings.Builder())
                .addSpawn(MobCategory.WATER_CREATURE, new MobSpawnSettings.SpawnerData(EntityType.GLOW_SQUID, 1, 1, 3))
                .addSpawn(MobCategory.WATER_AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.SALMON, 15, 1, 5))
                .addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.POLAR_BEAR, 1, 1, 2));

        BiomeDefaultFeatures.commonSpawns(spawnBuilder);
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.DROWNED, 5, 1, 1));

        BiomeGenerationSettings.Builder biomeBuilder = baseOceanGeneration(featureGetter, carverGetter);

        biomeBuilder.addFeature(GenerationStep.Decoration.LOCAL_MODIFICATIONS, RuAquaticPlacements.HYACINTH_ROCKS);

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, RuAquaticPlacements.TALL_HYACINTH_STOCK);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, RuAquaticPlacements.HYACINTH_PLANTS);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, RuAquaticPlacements.HYACINTH_FLOWERS);

        return (new Biome.BiomeBuilder()).temperature(0.5F).downfall(0.5F).specialEffects((
                new BiomeSpecialEffects.Builder()).waterColor(3770057).waterFogColor(336179).fogColor(12638463).skyColor(calculateSkyColor(0.0f)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnBuilder.build()).generationSettings(biomeBuilder.build()).build();
    }

    public static Biome rockyReef(HolderGetter<PlacedFeature> featureGetter, HolderGetter<ConfiguredWorldCarver<?>> carverGetter) {
        MobSpawnSettings.Builder spawnBuilder = (new MobSpawnSettings.Builder())
                .addSpawn(MobCategory.WATER_CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SQUID, 1, 1, 3))
                .addSpawn(MobCategory.WATER_AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.TROPICAL_FISH, 25, 8, 8))
                .addSpawn(MobCategory.WATER_CREATURE, new MobSpawnSettings.SpawnerData(EntityType.DOLPHIN, 2, 1, 2));

        BiomeDefaultFeatures.commonSpawns(spawnBuilder);
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.DROWNED, 5, 1, 1));

        BiomeGenerationSettings.Builder biomeBuilder = baseOceanGeneration(featureGetter, carverGetter);

        biomeBuilder.addFeature(GenerationStep.Decoration.LOCAL_MODIFICATIONS, RuAquaticPlacements.MOSSY_SEA_ROCKS);

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, RuAquaticPlacements.RED_CHERRY_FLOWERS_AQUATIC);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, RuAquaticPlacements.PINK_CHERRY_FLOWERS_AQUATIC);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, RuAquaticPlacements.WHITE_CHERRY_FLOWERS_AQUATIC);

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, RuAquaticPlacements.PALM_SAPLING_AQUATIC);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, RuAquaticPlacements.ELEPHANT_EAR_AQUATIC);

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, RuAquaticPlacements.JUNGLE_TREE_AQUATIC);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, RuAquaticPlacements.PALM_TREE_AQUATIC);

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, AquaticPlacements.SEAGRASS_NORMAL);
        BiomeDefaultFeatures.addDefaultSeagrass(biomeBuilder);
        BiomeDefaultFeatures.addLukeWarmKelp(biomeBuilder);

        return (new Biome.BiomeBuilder()).temperature(0.5F).downfall(0.5F).specialEffects((
                new BiomeSpecialEffects.Builder()).waterColor(-13255466).waterFogColor(-11171160).fogColor(12638463).skyColor(calculateSkyColor(0.0f)).foliageColorOverride(-11617740).grassColorOverride(-11225797).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnBuilder.build()).generationSettings(biomeBuilder.build()).build();
    }
}
