package net.regions_unexplored.world.level.biome;

import net.regions_unexplored.RegionsUnexploredMod;
import net.regions_unexplored.config.RegionsUnexploredCommonConfigs;
import net.regions_unexplored.data.worldgen.biome.RuBiomes;
import com.mojang.datafixers.util.Pair;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.Climate;
import terrablender.api.Region;
import terrablender.api.RegionType;

import java.util.List;
import java.util.function.Consumer;

import static terrablender.api.ParameterUtils.*;

public class RuRegion2 extends Region
{

    public static final ResourceLocation LOCATION = new ResourceLocation(RegionsUnexploredMod.MOD_ID, "temperate_like");

    public RuRegion2(int weight) {
        super(LOCATION, RegionType.OVERWORLD, weight);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper)
    {
        this.addModifiedVanillaOverworldBiomes(mapper, builder -> {
            if(RegionsUnexploredCommonConfigs.TOGGLE_GRAVEL_BEACH.get())
                builder.replaceBiome(Biomes.BEACH, RuBiomes.GRAVEL_BEACH);

            if(RegionsUnexploredCommonConfigs.TOGGLE_BOREAL_FOREST.get())
                builder.replaceBiome(Biomes.TAIGA, RuBiomes.BOREAL_FOREST);

            if(RegionsUnexploredCommonConfigs.TOGGLE_PRAIRIE.get())
                builder.replaceBiome(Biomes.PLAINS, RuBiomes.PRAIRIE);

            if(RegionsUnexploredCommonConfigs.TOGGLE_BAYOU.get())
                builder.replaceBiome(Biomes.SWAMP, RuBiomes.BAYOU);

            if(RegionsUnexploredCommonConfigs.TOGGLE_GIANT_BAYOU.get())
                builder.replaceBiome(Biomes.MANGROVE_SWAMP, RuBiomes.GIANT_BAYOU);

            if(RegionsUnexploredCommonConfigs.TOGGLE_DECIDUOUS_FOREST.get())
                builder.replaceBiome(Biomes.FOREST, RuBiomes.DECIDUOUS_FOREST);

            if(RegionsUnexploredCommonConfigs.TOGGLE_SILVER_BIRCH_FOREST.get()) {
                builder.replaceBiome(Biomes.BIRCH_FOREST, RuBiomes.SILVER_BIRCH_FOREST);
                builder.replaceBiome(Biomes.OLD_GROWTH_BIRCH_FOREST, RuBiomes.SILVER_BIRCH_FOREST);
            }

            if(RegionsUnexploredCommonConfigs.TOGGLE_MUDDY_RIVER.get())
                builder.replaceBiome(Biomes.RIVER, RuBiomes.MUDDY_RIVER);

            if(RegionsUnexploredCommonConfigs.TOGGLE_GOLDEN_BOREAL_FOREST.get())
                builder.replaceBiome(Biomes.OLD_GROWTH_PINE_TAIGA, RuBiomes.GOLDEN_BOREAL_FOREST);

            if(RegionsUnexploredCommonConfigs.TOGGLE_OLD_GROWTH_BOREAL_FOREST.get())
                builder.replaceBiome(Biomes.OLD_GROWTH_SPRUCE_TAIGA, RuBiomes.OLD_GROWTH_BOREAL_FOREST);

            if(RegionsUnexploredCommonConfigs.TOGGLE_HIGHLAND_FIELDS.get())
                builder.replaceBiome(Biomes.MEADOW, RuBiomes.HIGHLAND_FIELDS);

            if(RegionsUnexploredCommonConfigs.TOGGLE_REDWOODS.get())
                builder.replaceBiome(Biomes.JUNGLE, RuBiomes.REDWOODS);

            if(RegionsUnexploredCommonConfigs.TOGGLE_SPARSE_REDWOODS.get())
                builder.replaceBiome(Biomes.BAMBOO_JUNGLE, RuBiomes.SPARSE_REDWOODS);

            if(RegionsUnexploredCommonConfigs.TOGGLE_COLD_BOREAL_FOREST.get())
                builder.replaceBiome(Biomes.SNOWY_TAIGA, RuBiomes.COLD_BOREAL_FOREST);

            if(RegionsUnexploredCommonConfigs.TOGGLE_ORCHARD.get())
                builder.replaceBiome(Biomes.DARK_FOREST, RuBiomes.ORCHARD);

            if(RegionsUnexploredCommonConfigs.TOGGLE_ARID_MOUNTAINS.get()) {
                builder.replaceBiome(Biomes.BADLANDS, RuBiomes.ARID_MOUNTAINS);
                builder.replaceBiome(Biomes.ERODED_BADLANDS, RuBiomes.ARID_MOUNTAINS);
            }

            if(RegionsUnexploredCommonConfigs.TOGGLE_WOODED_ARID_MOUNTAINS.get())
                builder.replaceBiome(Biomes.WOODED_BADLANDS, RuBiomes.WOODED_ARID_MOUNTAINS);

            if(RegionsUnexploredCommonConfigs.TOGGLE_BAOBAB_SAVANNA.get()) {
                builder.replaceBiome(Biomes.SAVANNA, RuBiomes.BAOBAB_SAVANNA);
                builder.replaceBiome(Biomes.SAVANNA_PLATEAU, RuBiomes.BAOBAB_SAVANNA);
            }


            if(RegionsUnexploredCommonConfigs.TOGGLE_BARLEY_FIELDS.get()) {
                builder.replaceBiome(Biomes.SPARSE_JUNGLE, RuBiomes.BARLEY_FIELDS);
                builder.replaceBiome(Biomes.SUNFLOWER_PLAINS, RuBiomes.BARLEY_FIELDS);
            }

            if(RegionsUnexploredCommonConfigs.TOGGLE_DECIDUOUS_FOREST.get())
            builder.replaceBiome(Biomes.FLOWER_FOREST, RuBiomes.DECIDUOUS_FOREST);

            if(RegionsUnexploredCommonConfigs.TOGGLE_SAGUARO_DESERT.get())
            builder.replaceBiome(Biomes.DESERT, RuBiomes.SAGUARO_DESERT);

            if(RegionsUnexploredCommonConfigs.TOGGLE_FROZEN_TUNDRA.get())
            builder.replaceBiome(Biomes.SNOWY_PLAINS, RuBiomes.FROZEN_TUNDRA);

            if(RegionsUnexploredCommonConfigs.TOGGLE_SPIRES.get())
            builder.replaceBiome(Biomes.ICE_SPIKES, RuBiomes.SPIRES);

            if(RegionsUnexploredCommonConfigs.TOGGLE_REDSTONE_CAVES.get())
                builder.replaceBiome(Biomes.DRIPSTONE_CAVES, RuBiomes.REDSTONE_CAVES);

            if(RegionsUnexploredCommonConfigs.TOGGLE_LUSH_DELTA.get())
            builder.replaceBiome(Biomes.LUSH_CAVES, RuBiomes.LUSH_DELTA);

            List<Climate.ParameterPoint> frozenPeaksPoints = new ParameterPointListBuilder()
                    .temperature(Temperature.COOL, Temperature.NEUTRAL)
                    .humidity(Humidity.ARID, Humidity.DRY, Humidity.NEUTRAL, Humidity.WET, Humidity.HUMID)
                    .continentalness(Continentalness.span(Continentalness.COAST, Continentalness.FAR_INLAND), Continentalness.span(Continentalness.MID_INLAND, Continentalness.FAR_INLAND))
                    .erosion(Erosion.EROSION_0, Erosion.EROSION_1)
                    .depth(Depth.SURFACE, Depth.FLOOR)
                    .weirdness(Weirdness.HIGH_SLICE_VARIANT_ASCENDING, Weirdness.PEAK_VARIANT, Weirdness.HIGH_SLICE_VARIANT_DESCENDING,Weirdness.HIGH_SLICE_NORMAL_ASCENDING, Weirdness.PEAK_NORMAL, Weirdness.HIGH_SLICE_NORMAL_DESCENDING)
                    .build();

            List<Climate.ParameterPoint> groveHighPoints1 = new ParameterPointListBuilder()
                    .temperature(Temperature.COOL, Temperature.NEUTRAL)
                    .humidity(Humidity.ARID, Humidity.DRY, Humidity.NEUTRAL, Humidity.WET, Humidity.HUMID)
                    .continentalness(Continentalness.NEAR_INLAND)
                    .erosion(Erosion.EROSION_0)
                    .depth(Depth.SURFACE, Depth.FLOOR)
                    .weirdness(Weirdness.HIGH_SLICE_VARIANT_ASCENDING, Weirdness.HIGH_SLICE_VARIANT_DESCENDING, Weirdness.HIGH_SLICE_NORMAL_ASCENDING, Weirdness.HIGH_SLICE_NORMAL_DESCENDING)
                    .build();
            List<Climate.ParameterPoint> groveHighPoints2 = new ParameterPointListBuilder()
                    .temperature(Temperature.COOL, Temperature.NEUTRAL)
                    .humidity(Humidity.ARID, Humidity.DRY, Humidity.NEUTRAL, Humidity.WET, Humidity.HUMID)
                    .continentalness(Continentalness.span(Continentalness.MID_INLAND,Continentalness.FAR_INLAND))
                    .erosion(Erosion.EROSION_1)
                    .depth(Depth.SURFACE, Depth.FLOOR)
                    .weirdness(Weirdness.HIGH_SLICE_VARIANT_ASCENDING, Weirdness.HIGH_SLICE_VARIANT_DESCENDING, Weirdness.HIGH_SLICE_NORMAL_ASCENDING, Weirdness.HIGH_SLICE_NORMAL_DESCENDING)
                    .build();
            List<Climate.ParameterPoint> groveMidPoints1 = new ParameterPointListBuilder()
                    .temperature(Temperature.COOL, Temperature.NEUTRAL)
                    .humidity(Humidity.ARID, Humidity.DRY, Humidity.NEUTRAL, Humidity.WET, Humidity.HUMID)
                    .continentalness(Continentalness.FAR_INLAND)
                    .erosion(Erosion.EROSION_1)
                    .depth(Depth.SURFACE, Depth.FLOOR)
                    .weirdness(Weirdness.MID_SLICE_VARIANT_ASCENDING, Weirdness.MID_SLICE_VARIANT_DESCENDING, Weirdness.MID_SLICE_NORMAL_ASCENDING, Weirdness.MID_SLICE_NORMAL_DESCENDING)
                    .build();
            List<Climate.ParameterPoint> groveMidPoints2 = new ParameterPointListBuilder()
                    .temperature(Temperature.COOL, Temperature.NEUTRAL)
                    .humidity(Humidity.ARID, Humidity.DRY, Humidity.NEUTRAL, Humidity.WET, Humidity.HUMID)
                    .continentalness(Continentalness.span(Continentalness.NEAR_INLAND,Continentalness.FAR_INLAND))
                    .erosion(Erosion.EROSION_0)
                    .depth(Depth.SURFACE, Depth.FLOOR)
                    .weirdness(Weirdness.MID_SLICE_VARIANT_ASCENDING, Weirdness.MID_SLICE_VARIANT_DESCENDING, Weirdness.MID_SLICE_NORMAL_ASCENDING, Weirdness.MID_SLICE_NORMAL_DESCENDING)
                    .build();
            //MIXED TAIGA
            List<Climate.ParameterPoint> mixedTaigaMidSlice = new ParameterPointListBuilder()
                    .temperature(Temperature.ICY)
                    .humidity(Humidity.ARID, Humidity.DRY, Humidity.NEUTRAL, Humidity.WET, Humidity.HUMID)
                    .continentalness(Continentalness.span(Continentalness.NEAR_INLAND, Continentalness.FAR_INLAND), Continentalness.span(Continentalness.NEAR_INLAND, Continentalness.MID_INLAND), Continentalness.span(Continentalness.MID_INLAND, Continentalness.FAR_INLAND))
                    .erosion(Erosion.EROSION_0, Erosion.EROSION_1)
                    .depth(Depth.SURFACE, Depth.FLOOR)
                    .weirdness(Weirdness.HIGH_SLICE_VARIANT_ASCENDING, Weirdness.HIGH_SLICE_VARIANT_DESCENDING, Weirdness.HIGH_SLICE_NORMAL_ASCENDING, Weirdness.HIGH_SLICE_NORMAL_DESCENDING, Weirdness.MID_SLICE_VARIANT_ASCENDING, Weirdness.MID_SLICE_VARIANT_DESCENDING, Weirdness.LOW_SLICE_VARIANT_ASCENDING, Weirdness.LOW_SLICE_NORMAL_DESCENDING, Weirdness.MID_SLICE_NORMAL_ASCENDING, Weirdness.MID_SLICE_NORMAL_DESCENDING)
                    .build();
            List<Climate.ParameterPoint> mixedTaigaLowSlice = new ParameterPointListBuilder()
                    .temperature(Temperature.ICY)
                    .humidity(Humidity.ARID, Humidity.DRY, Humidity.NEUTRAL, Humidity.WET, Humidity.HUMID)
                    .continentalness(Continentalness.span(Continentalness.MID_INLAND, Continentalness.FAR_INLAND))
                    .erosion(Erosion.span(Erosion.EROSION_0, Erosion.EROSION_1))
                    .depth(Depth.SURFACE, Depth.FLOOR)
                    .weirdness(Weirdness.LOW_SLICE_VARIANT_ASCENDING, Weirdness.LOW_SLICE_NORMAL_DESCENDING)
                    .build();
            List<Climate.ParameterPoint> mixedTaigaHighSlice = new ParameterPointListBuilder()
                    .temperature(Temperature.ICY)
                    .humidity(Humidity.ARID, Humidity.DRY, Humidity.NEUTRAL, Humidity.WET, Humidity.HUMID)
                    .continentalness(Continentalness.NEAR_INLAND)
                    .erosion(Erosion.EROSION_1)
                    .depth(Depth.SURFACE, Depth.FLOOR)
                    .weirdness(Weirdness.HIGH_SLICE_VARIANT_ASCENDING, Weirdness.HIGH_SLICE_VARIANT_DESCENDING, Weirdness.HIGH_SLICE_NORMAL_ASCENDING, Weirdness.HIGH_SLICE_NORMAL_DESCENDING)
                    .build();
            List<Climate.ParameterPoint> mixedTaigaSlopes = new ParameterPointListBuilder()
                    .temperature(Temperature.ICY)
                    .humidity(Humidity.ARID, Humidity.DRY, Humidity.NEUTRAL, Humidity.WET, Humidity.HUMID)
                    .continentalness(Continentalness.FAR_INLAND)
                    .erosion(Erosion.EROSION_1)
                    .depth(Depth.SURFACE, Depth.FLOOR)
                    .weirdness(Weirdness.MID_SLICE_VARIANT_ASCENDING, Weirdness.MID_SLICE_VARIANT_DESCENDING, Weirdness.MID_SLICE_NORMAL_ASCENDING, Weirdness.MID_SLICE_NORMAL_DESCENDING)
                    .build();
            //LUSH_HILLS
            List<Climate.ParameterPoint> lushHillsPeaksT = new ParameterPointListBuilder()
                    .temperature(Temperature.COOL, Temperature.NEUTRAL)
                    .humidity(Humidity.ARID, Humidity.DRY, Humidity.NEUTRAL, Humidity.WET, Humidity.HUMID)
                    .continentalness(Continentalness.span(Continentalness.MID_INLAND, Continentalness.FAR_INLAND))
                    .erosion(Erosion.EROSION_5)
                    .depth(Depth.SURFACE, Depth.FLOOR)
                    .weirdness(Weirdness.PEAK_NORMAL, Weirdness.PEAK_VARIANT, Weirdness.HIGH_SLICE_VARIANT_ASCENDING, Weirdness.HIGH_SLICE_VARIANT_DESCENDING, Weirdness.HIGH_SLICE_NORMAL_ASCENDING, Weirdness.HIGH_SLICE_NORMAL_DESCENDING, Weirdness.MID_SLICE_VARIANT_ASCENDING, Weirdness.MID_SLICE_VARIANT_DESCENDING, Weirdness.MID_SLICE_NORMAL_ASCENDING, Weirdness.MID_SLICE_NORMAL_DESCENDING)
                    .build();
            List<Climate.ParameterPoint> lushHillsPeaksC = new ParameterPointListBuilder()
                    .temperature(Temperature.ICY)
                    .humidity(Humidity.ARID, Humidity.DRY, Humidity.NEUTRAL, Humidity.WET, Humidity.HUMID)
                    .continentalness(Continentalness.span(Continentalness.MID_INLAND, Continentalness.FAR_INLAND))
                    .erosion(Erosion.EROSION_5)
                    .depth(Depth.SURFACE, Depth.FLOOR)
                    .weirdness(Weirdness.PEAK_NORMAL, Weirdness.PEAK_VARIANT, Weirdness.HIGH_SLICE_VARIANT_ASCENDING, Weirdness.HIGH_SLICE_VARIANT_DESCENDING, Weirdness.HIGH_SLICE_NORMAL_ASCENDING, Weirdness.HIGH_SLICE_NORMAL_DESCENDING, Weirdness.MID_SLICE_VARIANT_ASCENDING, Weirdness.MID_SLICE_VARIANT_DESCENDING, Weirdness.MID_SLICE_NORMAL_ASCENDING, Weirdness.MID_SLICE_NORMAL_DESCENDING)
                    .build();
            List<Climate.ParameterPoint> lushHillsPeaksT2 = new ParameterPointListBuilder()
                    .temperature(Temperature.COOL, Temperature.NEUTRAL)
                    .humidity(Humidity.ARID, Humidity.DRY, Humidity.NEUTRAL, Humidity.WET, Humidity.HUMID)
                    .continentalness(Continentalness.span(Continentalness.COAST, Continentalness.NEAR_INLAND))
                    .erosion(Erosion.EROSION_5)
                    .depth(Depth.SURFACE, Depth.FLOOR)
                    .weirdness(Weirdness.PEAK_NORMAL, Weirdness.PEAK_VARIANT)
                    .build();
            List<Climate.ParameterPoint> lushHillsPeaksC2 = new ParameterPointListBuilder()
                    .temperature(Temperature.ICY)
                    .humidity(Humidity.ARID, Humidity.DRY, Humidity.NEUTRAL, Humidity.WET, Humidity.HUMID)
                    .continentalness(Continentalness.span(Continentalness.COAST, Continentalness.NEAR_INLAND))
                    .erosion(Erosion.EROSION_5)
                    .depth(Depth.SURFACE, Depth.FLOOR)
                    .weirdness(Weirdness.PEAK_NORMAL, Weirdness.PEAK_VARIANT)
                    .build();

            if(RegionsUnexploredCommonConfigs.TOGGLE_MOUNTAINS.get()) {
                frozenPeaksPoints.forEach(point -> builder.replaceBiome(point, RuBiomes.MOUNTAINS));
            }

            if(RegionsUnexploredCommonConfigs.TOGGLE_PINE_SLOPES.get()) {
                groveHighPoints1.forEach(point -> builder.replaceBiome(point, RuBiomes.PINE_SLOPES));
                groveHighPoints2.forEach(point -> builder.replaceBiome(point, RuBiomes.PINE_SLOPES));
                groveMidPoints1.forEach(point -> builder.replaceBiome(point, RuBiomes.PINE_SLOPES));
                groveMidPoints2.forEach(point -> builder.replaceBiome(point, RuBiomes.PINE_SLOPES));
            }

            if(RegionsUnexploredCommonConfigs.TOGGLE_COLD_DECIDUOUS_FOREST.get()) {
                mixedTaigaLowSlice.forEach(point -> builder.replaceBiome(point, RuBiomes.COLD_DECIDUOUS_FOREST));
                mixedTaigaMidSlice.forEach(point -> builder.replaceBiome(point, RuBiomes.COLD_DECIDUOUS_FOREST));
                mixedTaigaHighSlice.forEach(point -> builder.replaceBiome(point, RuBiomes.COLD_DECIDUOUS_FOREST));
            }

            if(RegionsUnexploredCommonConfigs.TOGGLE_COLD_BOREAL_FOREST.get()) {
                mixedTaigaSlopes.forEach(point -> builder.replaceBiome(point, RuBiomes.COLD_BOREAL_FOREST));
            }

            if(RegionsUnexploredCommonConfigs.TOGGLE_TOWERING_CLIFFS.get()) {
                lushHillsPeaksT.forEach(point -> builder.replaceBiome(point, RuBiomes.TOWERING_CLIFFS));
                lushHillsPeaksT2.forEach(point -> builder.replaceBiome(point, RuBiomes.TOWERING_CLIFFS));
            }

            if(RegionsUnexploredCommonConfigs.TOGGLE_ICY_HEIGHTS.get()) {
                lushHillsPeaksC.forEach(point -> builder.replaceBiome(point, RuBiomes.ICY_HEIGHTS));
                lushHillsPeaksC2.forEach(point -> builder.replaceBiome(point, RuBiomes.ICY_HEIGHTS));
            }

            if(RegionsUnexploredCommonConfigs.TOGGLE_TOWERING_CLIFFS.get())
            builder.replaceBiome(Biomes.WINDSWEPT_SAVANNA, RuBiomes.TOWERING_CLIFFS);
        });
    }
}