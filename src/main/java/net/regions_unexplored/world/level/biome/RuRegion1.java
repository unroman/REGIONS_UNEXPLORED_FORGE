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

public class RuRegion1 extends Region
{
    public static final ResourceLocation LOCATION = new ResourceLocation(RegionsUnexploredMod.MOD_ID, "northern_like");

    public RuRegion1(int weight) {
        super(LOCATION, RegionType.OVERWORLD, weight);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper)
    {
        this.addModifiedVanillaOverworldBiomes(mapper, builder -> {

            if(RegionsUnexploredCommonConfigs.TOGGLE_GRASSY_BEACH.get())
            builder.replaceBiome(Biomes.BEACH, RuBiomes.GRASSY_BEACH);

            if(RegionsUnexploredCommonConfigs.TOGGLE_GRAVEL_BEACH.get())
            builder.replaceBiome(Biomes.SNOWY_BEACH, RuBiomes.GRAVEL_BEACH);

            if(RegionsUnexploredCommonConfigs.TOGGLE_SHRUBLAND.get())
            builder.replaceBiome(Biomes.PLAINS, RuBiomes.SHRUBLAND);

            if(RegionsUnexploredCommonConfigs.TOGGLE_GRASSLAND.get())
            builder.replaceBiome(Biomes.SPARSE_JUNGLE, RuBiomes.GRASSLAND);

            if(RegionsUnexploredCommonConfigs.TOGGLE_HIGHLAND_FIELDS.get())
            builder.replaceBiome(Biomes.MEADOW, RuBiomes.HIGHLAND_FIELDS);

            if(RegionsUnexploredCommonConfigs.TOGGLE_AUTUMNAL_FIELDS.get())
            builder.replaceBiome(Biomes.SNOWY_PLAINS, RuBiomes.AUTUMNAL_FIELDS);

            if(RegionsUnexploredCommonConfigs.TOGGLE_PUMPKIN_FIELDS.get())
            builder.replaceBiome(Biomes.ICE_SPIKES, RuBiomes.PUMPKIN_FIELDS);

            if(RegionsUnexploredCommonConfigs.TOGGLE_FEN.get())
            builder.replaceBiome(Biomes.SWAMP, RuBiomes.FEN);

            if(RegionsUnexploredCommonConfigs.TOGGLE_STEPPE.get())
            builder.replaceBiome(Biomes.SAVANNA, RuBiomes.STEPPE);

            if(RegionsUnexploredCommonConfigs.TOGGLE_WOODED_STEPPE.get())
            builder.replaceBiome(Biomes.SAVANNA_PLATEAU, RuBiomes.WOODED_STEPPE);

            if(RegionsUnexploredCommonConfigs.TOGGLE_JOSHUA_DESERT.get())
            builder.replaceBiome(Biomes.DESERT, RuBiomes.JOSHUA_DESERT);

            if(RegionsUnexploredCommonConfigs.TOGGLE_ARID_MOUNTAINS.get()) {
                builder.replaceBiome(Biomes.BADLANDS, RuBiomes.ARID_MOUNTAINS);
                builder.replaceBiome(Biomes.ERODED_BADLANDS, RuBiomes.ARID_MOUNTAINS);
            }

            if(RegionsUnexploredCommonConfigs.TOGGLE_WOODED_ARID_MOUNTAINS.get())
                builder.replaceBiome(Biomes.WOODED_BADLANDS, RuBiomes.WOODED_ARID_MOUNTAINS);

            if(RegionsUnexploredCommonConfigs.TOGGLE_MUDDY_RIVER.get())
                builder.replaceBiome(Biomes.RIVER, RuBiomes.MUDDY_RIVER);

            if(RegionsUnexploredCommonConfigs.TOGGLE_COLD_RIVER.get())
                builder.replaceBiome(Biomes.FROZEN_RIVER, RuBiomes.COLD_RIVER);

            if(RegionsUnexploredCommonConfigs.TOGGLE_MAPLE_FOREST.get()){
                builder.replaceBiome(Biomes.FOREST, RuBiomes.MAPLE_FOREST);
            builder.replaceBiome(Biomes.FLOWER_FOREST, RuBiomes.MAPLE_FOREST);
            }

            if(RegionsUnexploredCommonConfigs.TOGGLE_TEMPERATE_GROVE.get()) {
                builder.replaceBiome(Biomes.BIRCH_FOREST, RuBiomes.TEMPERATE_GROVE);
                builder.replaceBiome(Biomes.OLD_GROWTH_BIRCH_FOREST, RuBiomes.TEMPERATE_GROVE);
            }

            if(RegionsUnexploredCommonConfigs.TOGGLE_BLACKWOOD_FOREST.get())
                builder.replaceBiome(Biomes.DARK_FOREST, RuBiomes.BLACKWOOD_FOREST);

            if(RegionsUnexploredCommonConfigs.TOGGLE_SCORCHING_CAVES.get())
            if(RegionsUnexploredCommonConfigs.TOGGLE_SCORCHING_CAVES.get())
                builder.replaceBiome(Biomes.DRIPSTONE_CAVES, RuBiomes.SCORCHING_CAVES);

            if(RegionsUnexploredCommonConfigs.TOGGLE_LUSH_DELTA.get())
                builder.replaceBiome(Biomes.LUSH_CAVES, RuBiomes.LUSH_DELTA);


            if(RegionsUnexploredCommonConfigs.TOGGLE_CANADIAN_FOREST.get()){
                builder.replaceBiome(Biomes.OLD_GROWTH_PINE_TAIGA, RuBiomes.CANADIAN_FOREST);
                builder.replaceBiome(Biomes.OLD_GROWTH_SPRUCE_TAIGA, RuBiomes.CANADIAN_FOREST);
                builder.replaceBiome(Biomes.TAIGA, RuBiomes.CANADIAN_FOREST);
            }

            if(RegionsUnexploredCommonConfigs.TOGGLE_AUTUMNAL_MAPLE_FOREST.get())
                builder.replaceBiome(Biomes.SNOWY_TAIGA, RuBiomes.AUTUMNAL_MAPLE_FOREST);

            if(RegionsUnexploredCommonConfigs.TOGGLE_RAINFOREST.get())
                builder.replaceBiome(Biomes.JUNGLE, RuBiomes.RAINFOREST);

            if(RegionsUnexploredCommonConfigs.TOGGLE_OLD_GROWTH_RAINFOREST.get())
                builder.replaceBiome(Biomes.BAMBOO_JUNGLE, RuBiomes.OLD_GROWTH_RAINFOREST);

            if(RegionsUnexploredCommonConfigs.TOGGLE_POPPY_FIELDS.get())
                builder.replaceBiome(Biomes.SUNFLOWER_PLAINS, RuBiomes.POPPY_FIELDS);


            if(RegionsUnexploredCommonConfigs.TOGGLE_TROPICS.get())
                builder.replaceBiome(Biomes.MANGROVE_SWAMP, RuBiomes.TROPICS);

            //MOUNTAINS
            List<Climate.ParameterPoint> frozenPeaksPoints = new ParameterPointListBuilder()
                    .temperature(Temperature.COOL, Temperature.NEUTRAL)
                    .humidity(Humidity.ARID, Humidity.DRY, Humidity.NEUTRAL, Humidity.WET, Humidity.HUMID)
                    .continentalness(Continentalness.span(Continentalness.COAST, Continentalness.FAR_INLAND), Continentalness.span(Continentalness.MID_INLAND, Continentalness.FAR_INLAND))
                    .erosion(Erosion.EROSION_0, Erosion.EROSION_1)
                    .depth(Depth.SURFACE, Depth.FLOOR)
                    .weirdness(Weirdness.HIGH_SLICE_VARIANT_ASCENDING, Weirdness.PEAK_VARIANT, Weirdness.HIGH_SLICE_VARIANT_DESCENDING,Weirdness.HIGH_SLICE_NORMAL_ASCENDING, Weirdness.PEAK_NORMAL, Weirdness.HIGH_SLICE_NORMAL_DESCENDING)
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
            //PINE_SLOPES
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



            if(RegionsUnexploredCommonConfigs.TOGGLE_PINE_SLOPES.get()){
                groveHighPoints1.forEach(point -> builder.replaceBiome(point, RuBiomes.PINE_SLOPES));
                groveHighPoints2.forEach(point -> builder.replaceBiome(point, RuBiomes.PINE_SLOPES));
                groveMidPoints1.forEach(point -> builder.replaceBiome(point, RuBiomes.PINE_SLOPES));
                groveMidPoints2.forEach(point -> builder.replaceBiome(point, RuBiomes.PINE_SLOPES));
            }

            if(RegionsUnexploredCommonConfigs.TOGGLE_MOUNTAINS.get()){
            frozenPeaksPoints.forEach(point -> builder.replaceBiome(point, RuBiomes.MOUNTAINS));
            }

            if(RegionsUnexploredCommonConfigs.TOGGLE_AUTUMNAL_MIXED_TAIGA.get()) {
                mixedTaigaLowSlice.forEach(point -> builder.replaceBiome(point, RuBiomes.AUTUMNAL_MIXED_TAIGA));
                mixedTaigaMidSlice.forEach(point -> builder.replaceBiome(point, RuBiomes.AUTUMNAL_MIXED_TAIGA));
                mixedTaigaHighSlice.forEach(point -> builder.replaceBiome(point, RuBiomes.AUTUMNAL_MIXED_TAIGA));
                mixedTaigaSlopes.forEach(point -> builder.replaceBiome(point, RuBiomes.AUTUMNAL_MIXED_TAIGA));
            }

            if(RegionsUnexploredCommonConfigs.TOGGLE_LUSH_HILLS.get()) {
                lushHillsPeaksT.forEach(point -> builder.replaceBiome(point, RuBiomes.LUSH_HILLS));
                lushHillsPeaksT2.forEach(point -> builder.replaceBiome(point, RuBiomes.LUSH_HILLS));
                lushHillsPeaksC.forEach(point -> builder.replaceBiome(point, RuBiomes.LUSH_HILLS));
                lushHillsPeaksC2.forEach(point -> builder.replaceBiome(point, RuBiomes.LUSH_HILLS));
            }

            if(RegionsUnexploredCommonConfigs.TOGGLE_TOWERING_CLIFFS.get())
            builder.replaceBiome(Biomes.WINDSWEPT_SAVANNA, RuBiomes.TOWERING_CLIFFS);
        });
    }
}