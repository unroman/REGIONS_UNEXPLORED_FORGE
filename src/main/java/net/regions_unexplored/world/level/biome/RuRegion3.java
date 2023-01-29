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

public class RuRegion3 extends Region
{

    public static final ResourceLocation LOCATION = new ResourceLocation(RegionsUnexploredMod.MOD_ID, "overseas_like");

    public RuRegion3(int weight) {
        super(LOCATION, RegionType.OVERWORLD, weight);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper)
    {
        this.addModifiedVanillaOverworldBiomes(mapper, builder -> {

            if(RegionsUnexploredCommonConfigs.TOGGLE_MEADOW.get())
            builder.replaceBiome(Biomes.PLAINS, RuBiomes.MEADOW);

            if(RegionsUnexploredCommonConfigs.TOGGLE_GRASSLAND.get())
            builder.replaceBiome(Biomes.SPARSE_JUNGLE, RuBiomes.GRASSLAND);

            if(RegionsUnexploredCommonConfigs.TOGGLE_HIGHLAND_FIELDS.get())
            builder.replaceBiome(Biomes.MEADOW, RuBiomes.HIGHLAND_FIELDS);

            if(RegionsUnexploredCommonConfigs.TOGGLE_MUDDY_RIVER.get())
            builder.replaceBiome(Biomes.RIVER, RuBiomes.MUDDY_RIVER);

            if(RegionsUnexploredCommonConfigs.TOGGLE_WILLOW_FOREST.get()) {
                builder.replaceBiome(Biomes.BIRCH_FOREST, RuBiomes.WILLOW_FOREST);
                builder.replaceBiome(Biomes.OLD_GROWTH_BIRCH_FOREST, RuBiomes.WILLOW_FOREST);
            }

            if(RegionsUnexploredCommonConfigs.TOGGLE_CHERRY_HILLS.get())
            builder.replaceBiome(Biomes.FOREST, RuBiomes.CHERRY_HILLS);

            if(RegionsUnexploredCommonConfigs.TOGGLE_PINE_FOREST.get()) {
                builder.replaceBiome(Biomes.OLD_GROWTH_PINE_TAIGA, RuBiomes.PINE_FOREST);
                builder.replaceBiome(Biomes.OLD_GROWTH_SPRUCE_TAIGA, RuBiomes.PINE_FOREST);
                builder.replaceBiome(Biomes.TAIGA, RuBiomes.PINE_FOREST);
            }

            if(RegionsUnexploredCommonConfigs.TOGGLE_CHALK_CLIFFS.get())
            builder.replaceBiome(Biomes.STONY_SHORE, RuBiomes.CHALK_CLIFFS);

            if(RegionsUnexploredCommonConfigs.TOGGLE_POPPY_FIELDS.get())
            builder.replaceBiome(Biomes.SUNFLOWER_PLAINS, RuBiomes.POPPY_FIELDS);

            if(RegionsUnexploredCommonConfigs.TOGGLE_BAMBOO_FOREST.get())
            builder.replaceBiome(Biomes.DARK_FOREST, RuBiomes.BAMBOO_FOREST);

            if(RegionsUnexploredCommonConfigs.TOGGLE_EUCALYPTUS_FOREST.get())
            builder.replaceBiome(Biomes.JUNGLE, RuBiomes.EUCALYPTUS_FOREST);

            if(RegionsUnexploredCommonConfigs.TOGGLE_ROOFED_EUCALYPTUS_FOREST.get())
            builder.replaceBiome(Biomes.BAMBOO_JUNGLE, RuBiomes.ROOFED_EUCALYPTUS_FOREST);

            if(RegionsUnexploredCommonConfigs.TOGGLE_CHERRY_HILLS.get())
            builder.replaceBiome(Biomes.FLOWER_FOREST, RuBiomes.CHERRY_HILLS);

            if(RegionsUnexploredCommonConfigs.TOGGLE_FLOODED_PLAINS.get())
            builder.replaceBiome(Biomes.SWAMP, RuBiomes.FLOODED_PLAINS);

            if(RegionsUnexploredCommonConfigs.TOGGLE_OUTBACK.get())
            builder.replaceBiome(Biomes.DESERT, RuBiomes.OUTBACK);

            if(RegionsUnexploredCommonConfigs.TOGGLE_FROZEN_FOREST.get())
            builder.replaceBiome(Biomes.SNOWY_TAIGA, RuBiomes.FROZEN_FOREST);

            if(RegionsUnexploredCommonConfigs.TOGGLE_ICY_DESERT.get())
            builder.replaceBiome(Biomes.SNOWY_PLAINS, RuBiomes.ICY_DESERT);

            if(RegionsUnexploredCommonConfigs.TOGGLE_DRY_BUSHLAND.get()) {
                builder.replaceBiome(Biomes.SAVANNA, RuBiomes.DRY_BUSHLAND);
                builder.replaceBiome(Biomes.SAVANNA_PLATEAU, RuBiomes.DRY_BUSHLAND);
            }

            if(RegionsUnexploredCommonConfigs.TOGGLE_SPIRES.get())
            builder.replaceBiome(Biomes.ICE_SPIKES, RuBiomes.SPIRES);

            if(RegionsUnexploredCommonConfigs.TOGGLE_PRISMACHASM.get())
                builder.replaceBiome(Biomes.DRIPSTONE_CAVES, RuBiomes.PRISMACHASM);

            if(RegionsUnexploredCommonConfigs.TOGGLE_BIOSHROOM_CAVES.get())
                builder.replaceBiome(Biomes.LUSH_CAVES, RuBiomes.BIOSHROOM_CAVES);

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

            //FROZEN_SLOPES
            List<Climate.ParameterPoint> frozenSlopesMidSlice = new ParameterPointListBuilder()
                    .temperature(Temperature.ICY)
                    .humidity(Humidity.ARID, Humidity.DRY, Humidity.NEUTRAL, Humidity.WET, Humidity.HUMID)
                    .continentalness(Continentalness.span(Continentalness.NEAR_INLAND, Continentalness.FAR_INLAND), Continentalness.span(Continentalness.NEAR_INLAND, Continentalness.MID_INLAND), Continentalness.span(Continentalness.MID_INLAND, Continentalness.FAR_INLAND))
                    .erosion(Erosion.EROSION_0, Erosion.EROSION_1)
                    .depth(Depth.SURFACE, Depth.FLOOR)
                    .weirdness(Weirdness.HIGH_SLICE_VARIANT_ASCENDING, Weirdness.HIGH_SLICE_VARIANT_DESCENDING, Weirdness.HIGH_SLICE_NORMAL_ASCENDING, Weirdness.HIGH_SLICE_NORMAL_DESCENDING, Weirdness.MID_SLICE_VARIANT_ASCENDING, Weirdness.MID_SLICE_VARIANT_DESCENDING, Weirdness.LOW_SLICE_VARIANT_ASCENDING, Weirdness.LOW_SLICE_NORMAL_DESCENDING, Weirdness.MID_SLICE_NORMAL_ASCENDING, Weirdness.MID_SLICE_NORMAL_DESCENDING)
                    .build();
            List<Climate.ParameterPoint> frozenSlopesLowSlice = new ParameterPointListBuilder()
                    .temperature(Temperature.ICY)
                    .humidity(Humidity.ARID, Humidity.DRY, Humidity.NEUTRAL, Humidity.WET, Humidity.HUMID)
                    .continentalness(Continentalness.span(Continentalness.MID_INLAND, Continentalness.FAR_INLAND))
                    .erosion(Erosion.span(Erosion.EROSION_0, Erosion.EROSION_1))
                    .depth(Depth.SURFACE, Depth.FLOOR)
                    .weirdness(Weirdness.LOW_SLICE_VARIANT_ASCENDING, Weirdness.LOW_SLICE_NORMAL_DESCENDING)
                    .build();
            List<Climate.ParameterPoint> frozenSlopesHighSlice = new ParameterPointListBuilder()
                    .temperature(Temperature.ICY)
                    .humidity(Humidity.ARID, Humidity.DRY, Humidity.NEUTRAL, Humidity.WET, Humidity.HUMID)
                    .continentalness(Continentalness.NEAR_INLAND)
                    .erosion(Erosion.EROSION_1)
                    .depth(Depth.SURFACE, Depth.FLOOR)
                    .weirdness(Weirdness.HIGH_SLICE_VARIANT_ASCENDING, Weirdness.HIGH_SLICE_VARIANT_DESCENDING, Weirdness.HIGH_SLICE_NORMAL_ASCENDING, Weirdness.HIGH_SLICE_NORMAL_DESCENDING)
                    .build();
            List<Climate.ParameterPoint> frozenSlopesSlopes = new ParameterPointListBuilder()
                    .temperature(Temperature.ICY)
                    .humidity(Humidity.ARID, Humidity.DRY, Humidity.NEUTRAL, Humidity.WET, Humidity.HUMID)
                    .continentalness(Continentalness.FAR_INLAND)
                    .erosion(Erosion.EROSION_1)
                    .depth(Depth.SURFACE, Depth.FLOOR)
                    .weirdness(Weirdness.MID_SLICE_VARIANT_ASCENDING, Weirdness.MID_SLICE_VARIANT_DESCENDING, Weirdness.MID_SLICE_NORMAL_ASCENDING, Weirdness.MID_SLICE_NORMAL_DESCENDING)
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

            if(RegionsUnexploredCommonConfigs.TOGGLE_LUSH_HILLS.get()) {
                lushHillsPeaksT.forEach(point -> builder.replaceBiome(point, RuBiomes.LUSH_HILLS));
                lushHillsPeaksT2.forEach(point -> builder.replaceBiome(point, RuBiomes.LUSH_HILLS));
            }

            if(RegionsUnexploredCommonConfigs.TOGGLE_ICY_HEIGHTS.get()) {
                lushHillsPeaksC.forEach(point -> builder.replaceBiome(point, RuBiomes.ICY_HEIGHTS));
                lushHillsPeaksC2.forEach(point -> builder.replaceBiome(point, RuBiomes.ICY_HEIGHTS));
            }

            if(RegionsUnexploredCommonConfigs.TOGGLE_FROZEN_FOREST.get()) {
                frozenSlopesLowSlice.forEach(point -> builder.replaceBiome(point, RuBiomes.FROZEN_FOREST));
                frozenSlopesMidSlice.forEach(point -> builder.replaceBiome(point, RuBiomes.FROZEN_FOREST));
                frozenSlopesHighSlice.forEach(point -> builder.replaceBiome(point, RuBiomes.FROZEN_FOREST));
                frozenSlopesSlopes.forEach(point -> builder.replaceBiome(point, RuBiomes.FROZEN_FOREST));
            }

            if(RegionsUnexploredCommonConfigs.TOGGLE_TOWERING_CLIFFS.get()) {
                builder.replaceBiome(Biomes.WINDSWEPT_SAVANNA, RuBiomes.TOWERING_CLIFFS);
            }
        });
    }
}
