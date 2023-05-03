package net.regions_unexplored.world.level.biome;

import com.mojang.datafixers.util.Pair;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.Climate;
import net.regions_unexplored.config.RegionsUnexploredPrimaryRegionConfig;
import net.regions_unexplored.config.RegionsUnexploredSecondaryRegionConfig;
import net.regions_unexplored.util.worldgen.CheckBiomeConfig;
import net.regions_unexplored.util.worldgen.VanillaFallbackBiome;

import java.util.function.Consumer;

public class RegionSecondaryBiomeBuilder {

    private final Climate.Parameter[] temperatures = new Climate.Parameter[]{
            Climate.Parameter.span(-1.0F, -0.45F),
            Climate.Parameter.span(-0.45F, -0.15F),
            Climate.Parameter.span(-0.15F, 0.2F),
            Climate.Parameter.span(0.2F, 0.55F),
            Climate.Parameter.span(0.55F, 1.0F)
    };

    private final Climate.Parameter[] humidities = new Climate.Parameter[]{
            Climate.Parameter.span(-1.0F, -0.35F),
            Climate.Parameter.span(-0.35F, -0.1F),
            Climate.Parameter.span(-0.1F, 0.1F),
            Climate.Parameter.span(0.1F, 0.3F),
            Climate.Parameter.span(0.3F, 1.0F)
    };

    private final Climate.Parameter[] erosions = new Climate.Parameter[]{
            Climate.Parameter.span(-1.0F, -0.78F),
            Climate.Parameter.span(-0.78F, -0.375F),
            Climate.Parameter.span(-0.375F, -0.2225F),
            Climate.Parameter.span(-0.2225F, 0.05F),
            Climate.Parameter.span(0.05F, 0.45F),
            Climate.Parameter.span(0.45F, 0.55F),
            Climate.Parameter.span(0.55F, 1.0F)
    };

    private final Climate.Parameter FULL_RANGE = Climate.Parameter.span(-1.0F, 1.0F);
    private final Climate.Parameter FROZEN_RANGE = this.temperatures[0];
    private final Climate.Parameter UNFROZEN_RANGE = Climate.Parameter.span(this.temperatures[1], this.temperatures[4]);

    private final Climate.Parameter mushroomFieldsContinentalness = Climate.Parameter.span(-1.2F, -1.05F);
    private final Climate.Parameter deepOceanContinentalness = Climate.Parameter.span(-1.05F, -0.455F);
    private final Climate.Parameter oceanContinentalness = Climate.Parameter.span(-0.455F, -0.19F);
    private final Climate.Parameter coastContinentalness = Climate.Parameter.span(-0.19F, -0.11F);
    private final Climate.Parameter inlandContinentalness = Climate.Parameter.span(-0.11F, 0.55F);
    private final Climate.Parameter nearInlandContinentalness = Climate.Parameter.span(-0.11F, 0.03F);
    private final Climate.Parameter midInlandContinentalness = Climate.Parameter.span(0.03F, 0.3F);
    private final Climate.Parameter farInlandContinentalness = Climate.Parameter.span(0.3F, 1.0F);

    private final ResourceKey<Biome>[][] MIDDLE_BIOMES = new ResourceKey[][]{
            //-----------ARID,DRY,NEUTRAL,WET,HUMID
            /*ICY*/     {getBiome(RegionsUnexploredSecondaryRegionConfig.MID_ICY_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_ICY_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_ICY_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_ICY_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_ICY_HUMID.get())},
            /*COOL*/    {getBiome(RegionsUnexploredSecondaryRegionConfig.MID_COOL_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_COOL_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_COOL_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_COOL_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_COOL_HUMID.get())},
            /*NEUTRAL*/ {getBiome(RegionsUnexploredSecondaryRegionConfig.MID_NEUTRAL_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_NEUTRAL_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_NEUTRAL_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_NEUTRAL_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_NEUTRAL_HUMID.get())},
            /*WARM*/    {getBiome(RegionsUnexploredSecondaryRegionConfig.MID_WARM_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_WARM_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_WARM_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_WARM_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_WARM_HUMID.get())},
            /*HOT*/     {getBiome(RegionsUnexploredSecondaryRegionConfig.MID_HOT_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_HOT_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_HOT_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_HOT_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_HOT_HUMID.get())}};

    private final ResourceKey<Biome>[][] MIDDLE_BIOMES_VARIANT = new ResourceKey[][]{
            //-----------ARID,DRY,NEUTRAL,WET,HUMID
            /*ICY*/     {getBiome(RegionsUnexploredSecondaryRegionConfig.MID_VAR_ICY_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_VAR_ICY_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_VAR_ICY_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_VAR_ICY_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_VAR_ICY_HUMID.get())},
            /*COOL*/    {getBiome(RegionsUnexploredSecondaryRegionConfig.MID_VAR_COOL_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_VAR_COOL_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_VAR_COOL_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_VAR_COOL_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_VAR_COOL_HUMID.get())},
            /*NEUTRAL*/ {getBiome(RegionsUnexploredSecondaryRegionConfig.MID_VAR_NEUTRAL_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_VAR_NEUTRAL_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_VAR_NEUTRAL_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_VAR_NEUTRAL_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_VAR_NEUTRAL_HUMID.get())},
            /*WARM*/    {getBiome(RegionsUnexploredSecondaryRegionConfig.MID_VAR_WARM_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_VAR_WARM_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_VAR_WARM_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_VAR_WARM_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_VAR_WARM_HUMID.get())},
            /*HOT*/     {getBiome(RegionsUnexploredSecondaryRegionConfig.MID_VAR_HOT_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_VAR_HOT_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_VAR_HOT_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_VAR_HOT_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_VAR_HOT_HUMID.get())}};

    private final ResourceKey<Biome>[][] PLATEAU_BIOMES = new ResourceKey[][]{
            //-----------ARID,DRY,NEUTRAL,WET,HUMID
            /*ICY*/     {getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_ICY_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_ICY_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_ICY_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_ICY_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_ICY_HUMID.get())},
            /*COOL*/    {getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_COOL_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_COOL_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_COOL_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_COOL_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_COOL_HUMID.get())},
            /*NEUTRAL*/ {getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_NEUTRAL_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_NEUTRAL_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_NEUTRAL_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_NEUTRAL_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_NEUTRAL_HUMID.get())},
            /*WARM*/    {getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_WARM_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_WARM_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_WARM_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_WARM_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_WARM_HUMID.get())},
            /*HOT*/     {getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_HOT_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_HOT_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_HOT_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_HOT_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_HOT_HUMID.get())}};

    private final ResourceKey<Biome>[][] PLATEAU_BIOMES_VARIANT = new ResourceKey[][]{
            //-----------ARID,DRY,NEUTRAL,WET,HUMID
            /*ICY*/     {getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_VAR_ICY_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_VAR_ICY_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_VAR_ICY_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_VAR_ICY_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_VAR_ICY_HUMID.get())},
            /*COOL*/    {getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_VAR_COOL_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_VAR_COOL_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_VAR_COOL_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_VAR_COOL_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_VAR_COOL_HUMID.get())},
            /*NEUTRAL*/ {getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_VAR_NEUTRAL_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_VAR_NEUTRAL_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_VAR_NEUTRAL_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_VAR_NEUTRAL_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_VAR_NEUTRAL_HUMID.get())},
            /*WARM*/    {getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_VAR_WARM_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_VAR_WARM_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_VAR_WARM_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_VAR_WARM_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_VAR_WARM_HUMID.get())},
            /*HOT*/     {getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_VAR_HOT_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_VAR_HOT_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_VAR_HOT_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_VAR_HOT_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_VAR_HOT_HUMID.get())}};

    private final ResourceKey<Biome>[][] SHATTERED_BIOMES = new ResourceKey[][]{
            //-----------ARID,DRY,NEUTRAL,WET,HUMID
            /*ICY*/     {getBiome(RegionsUnexploredSecondaryRegionConfig.SHT_ICY_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SHT_ICY_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SHT_ICY_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SHT_ICY_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SHT_ICY_HUMID.get())},
            /*COOL*/    {getBiome(RegionsUnexploredSecondaryRegionConfig.SHT_COOL_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SHT_COOL_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SHT_COOL_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SHT_COOL_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SHT_COOL_HUMID.get())},
            /*NEUTRAL*/ {getBiome(RegionsUnexploredSecondaryRegionConfig.SHT_NEUTRAL_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SHT_NEUTRAL_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SHT_NEUTRAL_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SHT_NEUTRAL_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SHT_NEUTRAL_HUMID.get())},
            /*WARM*/    {getBiome(RegionsUnexploredSecondaryRegionConfig.SHT_WARM_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SHT_WARM_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SHT_WARM_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SHT_WARM_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SHT_WARM_HUMID.get())},
            /*HOT*/     {getBiome(RegionsUnexploredSecondaryRegionConfig.SHT_HOT_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SHT_HOT_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SHT_HOT_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SHT_HOT_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SHT_HOT_HUMID.get())}};

    private final ResourceKey<Biome>[][] RIVER_BIOMES = new ResourceKey[][]{
            //-----------ARID,DRY,NEUTRAL,WET,HUMID
            /*ICY*/     {getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_ICY_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_ICY_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_ICY_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_ICY_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_ICY_HUMID.get())},
            /*COOL*/    {getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_COOL_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_COOL_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_COOL_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_COOL_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_COOL_HUMID.get())},
            /*NEUTRAL*/ {getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_NEUTRAL_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_NEUTRAL_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_NEUTRAL_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_NEUTRAL_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_NEUTRAL_HUMID.get())},
            /*WARM*/    {getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_WARM_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_WARM_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_WARM_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_WARM_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_WARM_HUMID.get())},
            /*HOT*/     {getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_HOT_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_HOT_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_HOT_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_HOT_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_HOT_HUMID.get())}};

    private final ResourceKey<Biome>[][] RIVER_BIOMES_VARIANT = new ResourceKey[][]{
            //-----------ARID,DRY,NEUTRAL,WET,HUMID
            /*ICY*/     {getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_VAR_ICY_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_VAR_ICY_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_VAR_ICY_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_VAR_ICY_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_VAR_ICY_HUMID.get())},
            /*COOL*/    {getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_VAR_COOL_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_VAR_COOL_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_VAR_COOL_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_VAR_COOL_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_VAR_COOL_HUMID.get())},
            /*NEUTRAL*/ {getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_VAR_NEUTRAL_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_VAR_NEUTRAL_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_VAR_NEUTRAL_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_VAR_NEUTRAL_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_VAR_NEUTRAL_HUMID.get())},
            /*WARM*/    {getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_VAR_WARM_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_VAR_WARM_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_VAR_WARM_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_VAR_WARM_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_VAR_WARM_HUMID.get())},
            /*HOT*/     {getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_VAR_HOT_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_VAR_HOT_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_VAR_HOT_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_VAR_HOT_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_VAR_HOT_HUMID.get())}};

    private final ResourceKey<Biome>[][] SWAMP_BIOMES = new ResourceKey[][]{
            //-----------ARID,DRY,NEUTRAL,WET,HUMID
            /*ICY*/     {getBiome(RegionsUnexploredSecondaryRegionConfig.SMP_ICY_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SMP_ICY_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SMP_ICY_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SMP_ICY_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SMP_ICY_HUMID.get())},
            /*COOL*/    {getBiome(RegionsUnexploredSecondaryRegionConfig.SMP_COOL_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SMP_COOL_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SMP_COOL_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SMP_COOL_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SMP_COOL_HUMID.get())},
            /*NEUTRAL*/ {getBiome(RegionsUnexploredSecondaryRegionConfig.SMP_NEUTRAL_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SMP_NEUTRAL_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SMP_NEUTRAL_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SMP_NEUTRAL_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SMP_NEUTRAL_HUMID.get())},
            /*WARM*/    {getBiome(RegionsUnexploredSecondaryRegionConfig.SMP_WARM_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SMP_WARM_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SMP_WARM_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SMP_WARM_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SMP_WARM_HUMID.get())},
            /*HOT*/     {getBiome(RegionsUnexploredSecondaryRegionConfig.SMP_HOT_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SMP_HOT_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SMP_HOT_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SMP_HOT_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SMP_HOT_HUMID.get())}};

    private final ResourceKey<Biome>[][] OCEANS = new ResourceKey[][]{
            /*DEEP*/    {getBiome(RegionsUnexploredSecondaryRegionConfig.OCA_DEP_ICY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.OCA_DEP_COOL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.OCA_DEP_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.OCA_DEP_WARM.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.OCA_DEP_HOT.get())},
            /*NORM*/    {getBiome(RegionsUnexploredSecondaryRegionConfig.OCA_ICY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.OCA_COOL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.OCA_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.OCA_WARM.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.OCA_HOT.get())}};

    protected void addBiomes(Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> builder) {
        this.addOffCoastBiomes(builder);
        this.addInlandBiomes(builder);
        this.addUndergroundBiomes(builder);
    }

    private void addOffCoastBiomes(Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> builder) {
        this.addSurfaceBiome(builder, this.temperatures[0], this.FULL_RANGE, this.mushroomFieldsContinentalness, this.FULL_RANGE, this.FULL_RANGE, 0.0F, CheckBiomeConfig.isBiomeEnabled(getBiome(RegionsUnexploredPrimaryRegionConfig.ICY_ISLAND.get())) ? getBiome(RegionsUnexploredPrimaryRegionConfig.ICY_ISLAND.get()) :Biomes.MUSHROOM_FIELDS);
        this.addSurfaceBiome(builder, this.temperatures[1], this.FULL_RANGE, this.mushroomFieldsContinentalness, this.FULL_RANGE, this.FULL_RANGE, 0.0F, CheckBiomeConfig.isBiomeEnabled(getBiome(RegionsUnexploredPrimaryRegionConfig.COOL_ISLAND.get())) ? getBiome(RegionsUnexploredPrimaryRegionConfig.COOL_ISLAND.get()) :Biomes.MUSHROOM_FIELDS);
        this.addSurfaceBiome(builder, this.temperatures[2], this.FULL_RANGE, this.mushroomFieldsContinentalness, this.FULL_RANGE, this.FULL_RANGE, 0.0F, CheckBiomeConfig.isBiomeEnabled(getBiome(RegionsUnexploredPrimaryRegionConfig.NEUTRAL_ISLAND.get())) ? getBiome(RegionsUnexploredPrimaryRegionConfig.NEUTRAL_ISLAND.get()) :Biomes.MUSHROOM_FIELDS);
        this.addSurfaceBiome(builder, this.temperatures[3], this.FULL_RANGE, this.mushroomFieldsContinentalness, this.FULL_RANGE, this.FULL_RANGE, 0.0F, CheckBiomeConfig.isBiomeEnabled(getBiome(RegionsUnexploredPrimaryRegionConfig.WARM_ISLAND.get())) ? getBiome(RegionsUnexploredPrimaryRegionConfig.WARM_ISLAND.get()) :Biomes.MUSHROOM_FIELDS);
        this.addSurfaceBiome(builder, this.temperatures[4], this.FULL_RANGE, this.mushroomFieldsContinentalness, this.FULL_RANGE, this.FULL_RANGE, 0.0F, CheckBiomeConfig.isBiomeEnabled(getBiome(RegionsUnexploredPrimaryRegionConfig.HOT_ISLAND.get())) ? getBiome(RegionsUnexploredPrimaryRegionConfig.HOT_ISLAND.get()) :Biomes.MUSHROOM_FIELDS);

        for(int i = 0; i < this.temperatures.length; ++i) {
            Climate.Parameter climate$parameter = this.temperatures[i];
            this.addSurfaceBiome(builder, climate$parameter, this.FULL_RANGE, this.deepOceanContinentalness, this.FULL_RANGE, this.FULL_RANGE, 0.0F, CheckBiomeConfig.isBiomeEnabled(this.OCEANS[0][i]) ? this.OCEANS[0][i] : VanillaFallbackBiome.VANILLA_OCEANS[0][i]);
            this.addSurfaceBiome(builder, climate$parameter, this.FULL_RANGE, this.oceanContinentalness, this.FULL_RANGE, this.FULL_RANGE, 0.0F, CheckBiomeConfig.isBiomeEnabled(this.OCEANS[1][i]) ? this.OCEANS[1][i] : VanillaFallbackBiome.VANILLA_OCEANS[0][i]);
        }

    }

    private void addInlandBiomes(Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> builder) {
        this.addMidSlice(builder, Climate.Parameter.span(-1.0F, -0.93333334F));
        this.addHighSlice(builder, Climate.Parameter.span(-0.93333334F, -0.7666667F));
        this.addPeaks(builder, Climate.Parameter.span(-0.7666667F, -0.56666666F));
        this.addHighSlice(builder, Climate.Parameter.span(-0.56666666F, -0.4F));
        this.addMidSlice(builder, Climate.Parameter.span(-0.4F, -0.26666668F));
        this.addLowSlice(builder, Climate.Parameter.span(-0.26666668F, -0.05F));
        this.addValleys(builder, Climate.Parameter.span(-0.05F, 0.05F));
        this.addLowSlice(builder, Climate.Parameter.span(0.05F, 0.26666668F));
        this.addMidSlice(builder, Climate.Parameter.span(0.26666668F, 0.4F));
        this.addHighSlice(builder, Climate.Parameter.span(0.4F, 0.56666666F));
        this.addPeaks(builder, Climate.Parameter.span(0.56666666F, 0.7666667F));
        this.addHighSlice(builder, Climate.Parameter.span(0.7666667F, 0.93333334F));
        this.addMidSlice(builder, Climate.Parameter.span(0.93333334F, 1.0F));
    }

    private void addPeaks(Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> builder, Climate.Parameter weirdness) {
        for(int i = 0; i < this.temperatures.length; ++i) {
            Climate.Parameter temperature = this.temperatures[i];

            for(int j = 0; j < this.humidities.length; ++j) {
                Climate.Parameter humidity = this.humidities[j];
                ResourceKey<Biome> middleBiome = this.pickMiddleBiome(i, j, weirdness);
                ResourceKey<Biome> middleBiomeOrCold = this.pickMiddleBiomeOrSlopeIfCold(i, j, weirdness);
                ResourceKey<Biome> plateauBiome = this.pickPlateauBiome(i, j, weirdness);
                ResourceKey<Biome> shatteredBiome = this.pickShatteredBiome(i, j, weirdness);
                ResourceKey<Biome> maybePickToweringCliffs = this.maybePickToweringCliffsBiome(i, j, weirdness, shatteredBiome);
                ResourceKey<Biome> peakBiomes = this.pickPeakBiome(i, j, weirdness);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.coastContinentalness, this.farInlandContinentalness), this.erosions[0], weirdness, 0.0F, peakBiomes);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.coastContinentalness, this.nearInlandContinentalness), this.erosions[1], weirdness, 0.0F, middleBiomeOrCold);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.midInlandContinentalness, this.farInlandContinentalness), this.erosions[1], weirdness, 0.0F, peakBiomes);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.coastContinentalness, this.nearInlandContinentalness), Climate.Parameter.span(this.erosions[2], this.erosions[3]), weirdness, 0.0F, middleBiome);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.midInlandContinentalness, this.farInlandContinentalness), this.erosions[2], weirdness, 0.0F, plateauBiome);
                this.addSurfaceBiome(builder, temperature, humidity, this.midInlandContinentalness, this.erosions[3], weirdness, 0.0F, middleBiome);
                this.addSurfaceBiome(builder, temperature, humidity, this.farInlandContinentalness, this.erosions[3], weirdness, 0.0F, plateauBiome);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.coastContinentalness, this.farInlandContinentalness), this.erosions[4], weirdness, 0.0F, middleBiome);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.coastContinentalness, this.nearInlandContinentalness), this.erosions[5], weirdness, 0.0F, maybePickToweringCliffs);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.midInlandContinentalness, this.farInlandContinentalness), this.erosions[5], weirdness, 0.0F, shatteredBiome);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.coastContinentalness, this.farInlandContinentalness), this.erosions[6], weirdness, 0.0F, middleBiome);
            }
        }

    }

    private void addHighSlice(Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> builder, Climate.Parameter weirdness) {
        for(int i = 0; i < this.temperatures.length; ++i) {
            Climate.Parameter temperature = this.temperatures[i];

            for(int j = 0; j < this.humidities.length; ++j) {
                Climate.Parameter humidity = this.humidities[j];
                ResourceKey<Biome> middleBiome = this.pickMiddleBiome(i, j, weirdness);
                ResourceKey<Biome> middleBiomeOrCold = this.pickMiddleBiomeOrSlopeIfCold(i, j, weirdness);
                ResourceKey<Biome> plateauBiome = this.pickPlateauBiome(i, j, weirdness);
                ResourceKey<Biome> shatteredBiome = this.pickShatteredBiome(i, j, weirdness);
                ResourceKey<Biome> maybePickToweringCliffs = this.maybePickToweringCliffsBiome(i, j, weirdness, middleBiome);
                ResourceKey<Biome> slopeBiome = this.pickSlopeBiome(i, j, weirdness);
                ResourceKey<Biome> peakBiome = this.pickPeakBiome(i, j, weirdness);
                this.addSurfaceBiome(builder, temperature, humidity, this.coastContinentalness, Climate.Parameter.span(this.erosions[0], this.erosions[1]), weirdness, 0.0F, middleBiome);
                this.addSurfaceBiome(builder, temperature, humidity, this.nearInlandContinentalness, this.erosions[0], weirdness, 0.0F, slopeBiome);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.midInlandContinentalness, this.farInlandContinentalness), this.erosions[0], weirdness, 0.0F, peakBiome);
                this.addSurfaceBiome(builder, temperature, humidity, this.nearInlandContinentalness, this.erosions[1], weirdness, 0.0F, middleBiomeOrCold);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.midInlandContinentalness, this.farInlandContinentalness), this.erosions[1], weirdness, 0.0F, slopeBiome);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.coastContinentalness, this.nearInlandContinentalness), Climate.Parameter.span(this.erosions[2], this.erosions[3]), weirdness, 0.0F, middleBiome);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.midInlandContinentalness, this.farInlandContinentalness), this.erosions[2], weirdness, 0.0F, plateauBiome);
                this.addSurfaceBiome(builder, temperature, humidity, this.midInlandContinentalness, this.erosions[3], weirdness, 0.0F, middleBiome);
                this.addSurfaceBiome(builder, temperature, humidity, this.farInlandContinentalness, this.erosions[3], weirdness, 0.0F, plateauBiome);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.coastContinentalness, this.farInlandContinentalness), this.erosions[4], weirdness, 0.0F, middleBiome);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.coastContinentalness, this.nearInlandContinentalness), this.erosions[5], weirdness, 0.0F, maybePickToweringCliffs);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.midInlandContinentalness, this.farInlandContinentalness), this.erosions[5], weirdness, 0.0F, shatteredBiome);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.coastContinentalness, this.farInlandContinentalness), this.erosions[6], weirdness, 0.0F, middleBiome);
            }
        }

    }

    private void addMidSlice(Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> builder, Climate.Parameter weirdness) {
        ResourceKey<Biome> stoneBeachCold = CheckBiomeConfig.isBiomeEnabled(getBiome(RegionsUnexploredSecondaryRegionConfig.COLD_STONE_BEACH.get())) ? getBiome(RegionsUnexploredSecondaryRegionConfig.COLD_STONE_BEACH.get()) : Biomes.STONY_SHORE;
        ResourceKey<Biome> stoneBeachHot = CheckBiomeConfig.isBiomeEnabled(getBiome(RegionsUnexploredSecondaryRegionConfig.HOT_STONE_BEACH.get())) ? getBiome(RegionsUnexploredSecondaryRegionConfig.HOT_STONE_BEACH.get()) : Biomes.STONY_SHORE;
        this.addSurfaceBiome(builder, Climate.Parameter.span(this.temperatures[0], this.temperatures[2]), this.FULL_RANGE, this.coastContinentalness, Climate.Parameter.span(this.erosions[0], this.erosions[2]), weirdness, 0.0F, stoneBeachCold);
        this.addSurfaceBiome(builder, Climate.Parameter.span(this.temperatures[3], this.temperatures[4]), this.FULL_RANGE, this.coastContinentalness, Climate.Parameter.span(this.erosions[0], this.erosions[2]), weirdness, 0.0F, stoneBeachHot);

        for(int i = 0; i < this.temperatures.length; ++i) {
            Climate.Parameter temperature = this.temperatures[i];

            for(int j = 0; j < this.humidities.length; ++j) {
                Climate.Parameter humidity = this.humidities[j];
                ResourceKey<Biome> middleBiome = this.pickMiddleBiome(i, j, weirdness);
                ResourceKey<Biome> middleBiomeOrCold = this.pickMiddleBiomeOrSlopeIfCold(i, j, weirdness);
                ResourceKey<Biome> plateauBiome = this.pickPlateauBiome(i, j, weirdness);
                ResourceKey<Biome> shatteredBiome = this.pickShatteredBiome(i, j, weirdness);
                ResourceKey<Biome> swampBiome = this.pickSwampBiome(i, j);
                ResourceKey<Biome> beachBiome = this.pickBeachBiome(i);
                ResourceKey<Biome> maybePickToweringCliffs = this.maybePickToweringCliffsBiome(i, j, weirdness, middleBiome);
                ResourceKey<Biome> shatteredCoastBiome = this.pickShatteredCoastBiome(i, j, weirdness);
                ResourceKey<Biome> slopeBiome = this.pickSlopeBiome(i, j, weirdness);

                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.nearInlandContinentalness, this.farInlandContinentalness), this.erosions[0], weirdness, 0.0F, slopeBiome);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.nearInlandContinentalness, this.midInlandContinentalness), this.erosions[1], weirdness, 0.0F, middleBiomeOrCold);
                this.addSurfaceBiome(builder, temperature, humidity, this.farInlandContinentalness, this.erosions[1], weirdness, 0.0F, i == 0 ? slopeBiome : plateauBiome);
                this.addSurfaceBiome(builder, temperature, humidity, this.nearInlandContinentalness, this.erosions[2], weirdness, 0.0F, middleBiome);
                this.addSurfaceBiome(builder, temperature, humidity, this.midInlandContinentalness, this.erosions[2], weirdness, 0.0F, middleBiome);
                this.addSurfaceBiome(builder, temperature, humidity, this.farInlandContinentalness, this.erosions[2], weirdness, 0.0F, plateauBiome);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.coastContinentalness, this.nearInlandContinentalness), this.erosions[3], weirdness, 0.0F, middleBiome);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.midInlandContinentalness, this.farInlandContinentalness), this.erosions[3], weirdness, 0.0F, middleBiome);
                if (weirdness.max() < 0L) {
                    this.addSurfaceBiome(builder, temperature, humidity, this.coastContinentalness, this.erosions[4], weirdness, 0.0F, beachBiome);
                    this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.nearInlandContinentalness, this.farInlandContinentalness), this.erosions[4], weirdness, 0.0F, middleBiome);
                } else {
                    this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.coastContinentalness, this.farInlandContinentalness), this.erosions[4], weirdness, 0.0F, middleBiome);
                }
                this.addSurfaceBiome(builder, temperature, humidity, this.coastContinentalness, this.erosions[5], weirdness, 0.0F, shatteredCoastBiome);
                this.addSurfaceBiome(builder, temperature, humidity, this.nearInlandContinentalness, this.erosions[5], weirdness, 0.0F, maybePickToweringCliffs);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.midInlandContinentalness, this.farInlandContinentalness), this.erosions[5], weirdness, 0.0F, shatteredBiome);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.nearInlandContinentalness, this.farInlandContinentalness), this.erosions[6], weirdness, 0.0F, swampBiome);
                if (weirdness.max() < 0L) {
                    this.addSurfaceBiome(builder, temperature, humidity, this.coastContinentalness, this.erosions[6], weirdness, 0.0F, beachBiome);
                } else {
                    this.addSurfaceBiome(builder, temperature, humidity, this.coastContinentalness, this.erosions[6], weirdness, 0.0F, middleBiome);
                }
            }
        }

    }

    private void addLowSlice(Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> builder, Climate.Parameter weirdness) {
        ResourceKey<Biome> stoneBeachCold = CheckBiomeConfig.isBiomeEnabled(getBiome(RegionsUnexploredSecondaryRegionConfig.COLD_STONE_BEACH.get())) ? getBiome(RegionsUnexploredSecondaryRegionConfig.COLD_STONE_BEACH.get()) : Biomes.STONY_SHORE;
        ResourceKey<Biome> stoneBeachHot = CheckBiomeConfig.isBiomeEnabled(getBiome(RegionsUnexploredSecondaryRegionConfig.HOT_STONE_BEACH.get())) ? getBiome(RegionsUnexploredSecondaryRegionConfig.HOT_STONE_BEACH.get()) : Biomes.STONY_SHORE;
        this.addSurfaceBiome(builder, Climate.Parameter.span(this.temperatures[0], this.temperatures[2]), this.FULL_RANGE, this.coastContinentalness, Climate.Parameter.span(this.erosions[0], this.erosions[2]), weirdness, 0.0F, stoneBeachCold);
        this.addSurfaceBiome(builder, Climate.Parameter.span(this.temperatures[3], this.temperatures[4]), this.FULL_RANGE, this.coastContinentalness, Climate.Parameter.span(this.erosions[0], this.erosions[2]), weirdness, 0.0F, stoneBeachHot);
        for(int i = 0; i < this.temperatures.length; ++i) {
            Climate.Parameter temperature = this.temperatures[i];

            for(int j = 0; j < this.humidities.length; ++j) {
                Climate.Parameter humidity = this.humidities[j];
                ResourceKey<Biome> middleBiome = this.pickMiddleBiome(i, j, weirdness);
                ResourceKey<Biome> middleBiomeOrCold = this.pickMiddleBiomeOrSlopeIfCold(i, j, weirdness);
                ResourceKey<Biome> swampBiome = this.pickSwampBiome(i, j);
                ResourceKey<Biome> beachBiome = this.pickBeachBiome(i);
                ResourceKey<Biome> maybePickToweringCliffs = this.maybePickToweringCliffsBiome(i, j, weirdness, middleBiome);
                ResourceKey<Biome> shatteredCoastBiome = this.pickShatteredCoastBiome(i, j, weirdness);
                this.addSurfaceBiome(builder, temperature, humidity, this.nearInlandContinentalness, Climate.Parameter.span(this.erosions[0], this.erosions[1]), weirdness, 0.0F, middleBiome);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.midInlandContinentalness, this.farInlandContinentalness), Climate.Parameter.span(this.erosions[0], this.erosions[1]), weirdness, 0.0F, middleBiomeOrCold);
                this.addSurfaceBiome(builder, temperature, humidity, this.nearInlandContinentalness, Climate.Parameter.span(this.erosions[2], this.erosions[3]), weirdness, 0.0F, middleBiome);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.midInlandContinentalness, this.farInlandContinentalness), Climate.Parameter.span(this.erosions[2], this.erosions[3]), weirdness, 0.0F, middleBiome);
                this.addSurfaceBiome(builder, temperature, humidity, this.coastContinentalness, Climate.Parameter.span(this.erosions[3], this.erosions[4]), weirdness, 0.0F, beachBiome);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.nearInlandContinentalness, this.farInlandContinentalness), this.erosions[4], weirdness, 0.0F, middleBiome);
                this.addSurfaceBiome(builder, temperature, humidity, this.coastContinentalness, this.erosions[5], weirdness, 0.0F, shatteredCoastBiome);
                this.addSurfaceBiome(builder, temperature, humidity, this.nearInlandContinentalness, this.erosions[5], weirdness, 0.0F, maybePickToweringCliffs);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.midInlandContinentalness, this.farInlandContinentalness), this.erosions[5], weirdness, 0.0F, middleBiome);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.nearInlandContinentalness, this.farInlandContinentalness), this.erosions[6], weirdness, 0.0F, swampBiome);
                this.addSurfaceBiome(builder, temperature, humidity, this.coastContinentalness, this.erosions[6], weirdness, 0.0F, beachBiome);
            }
        }

    }

    private void addValleys(Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> builder, Climate.Parameter weirdness) {
        ResourceKey<Biome> stoneBeachCold = CheckBiomeConfig.isBiomeEnabled(getBiome(RegionsUnexploredSecondaryRegionConfig.COLD_STONE_BEACH.get())) ? getBiome(RegionsUnexploredSecondaryRegionConfig.COLD_STONE_BEACH.get()) : Biomes.STONY_SHORE;
        ResourceKey<Biome> stoneBeachHot = CheckBiomeConfig.isBiomeEnabled(getBiome(RegionsUnexploredSecondaryRegionConfig.HOT_STONE_BEACH.get())) ? getBiome(RegionsUnexploredSecondaryRegionConfig.HOT_STONE_BEACH.get()) : Biomes.STONY_SHORE;
        for(int i = 0; i < this.temperatures.length; ++i) {
            Climate.Parameter temperature = this.temperatures[i];

            for(int j = 0; j < this.humidities.length; ++j) {
                Climate.Parameter humidity = this.humidities[j];
                ResourceKey<Biome> middleBiome = this.pickMiddleBiome(i, j, weirdness);
                ResourceKey<Biome> swampBiome = this.pickSwampBiome(i, j);
                ResourceKey<Biome> riverBiome = this.pickRiverBiome(i, j, weirdness);
                ResourceKey<Biome> cliffBiome = this.temperatures[i].max() <= -0.45F ? stoneBeachCold: stoneBeachHot;
                ResourceKey<Biome> maybePickCliff = weirdness.max() < 0L ? cliffBiome : riverBiome;
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.midInlandContinentalness, this.farInlandContinentalness), Climate.Parameter.span(this.erosions[0], this.erosions[1]), weirdness, 0.0F, middleBiome);
                this.addSurfaceBiome(builder, temperature, humidity, this.coastContinentalness, Climate.Parameter.span(this.erosions[0], this.erosions[1]), weirdness, 0.0F, maybePickCliff);
                this.addSurfaceBiome(builder, temperature, humidity, this.nearInlandContinentalness, Climate.Parameter.span(this.erosions[0], this.erosions[1]), weirdness, 0.0F, riverBiome);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.coastContinentalness, this.farInlandContinentalness), Climate.Parameter.span(this.erosions[2], this.erosions[5]), weirdness, 0.0F, riverBiome);
                this.addSurfaceBiome(builder, temperature, humidity, Climate.Parameter.span(this.inlandContinentalness, this.farInlandContinentalness), this.erosions[6], weirdness, 0.0F, swampBiome);
                this.addSurfaceBiome(builder, temperature, humidity, this.coastContinentalness, this.erosions[6], weirdness, 0.0F, riverBiome);
            }
        }

    }

    private void addUndergroundBiomes(Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> builder) {
        this.addUndergroundBiome(builder, this.FULL_RANGE, this.FULL_RANGE, Climate.Parameter.span(-1.0F, -0.79F), this.FULL_RANGE, Climate.Parameter.span(-1.0F, 0.0F), 0.0F, CheckBiomeConfig.isBiomeEnabled(getBiome(RegionsUnexploredSecondaryRegionConfig.CAVE_2.get())) ? getBiome(RegionsUnexploredSecondaryRegionConfig.CAVE_2.get()) : Biomes.LUSH_CAVES);
        this.addUndergroundBiome(builder, this.FULL_RANGE, this.FULL_RANGE, Climate.Parameter.span(-1.0F, -0.79F), this.FULL_RANGE, Climate.Parameter.span(0.0F, 1.0F), 0.0F, CheckBiomeConfig.isBiomeEnabled(getBiome(RegionsUnexploredSecondaryRegionConfig.CAVE_7.get())) ? getBiome(RegionsUnexploredSecondaryRegionConfig.CAVE_7.get()) : Biomes.DRIPSTONE_CAVES);

        this.addUndergroundBiome(builder, this.FULL_RANGE, this.FULL_RANGE, Climate.Parameter.span(0.775F, 1.0F), this.FULL_RANGE, Climate.Parameter.span(-1.0F, 0.0F), 0.0F, CheckBiomeConfig.isBiomeEnabled(getBiome(RegionsUnexploredSecondaryRegionConfig.CAVE_6.get())) ? getBiome(RegionsUnexploredSecondaryRegionConfig.CAVE_6.get()) : Biomes.DRIPSTONE_CAVES);
        this.addUndergroundBiome(builder, this.FULL_RANGE, this.FULL_RANGE, Climate.Parameter.span(0.775F, 1.0F), this.FULL_RANGE, Climate.Parameter.span(0.0F, 1.0F), 0.0F, CheckBiomeConfig.isBiomeEnabled(getBiome(RegionsUnexploredSecondaryRegionConfig.CAVE_7.get())) ? getBiome(RegionsUnexploredSecondaryRegionConfig.CAVE_7.get()) : Biomes.DRIPSTONE_CAVES);

        this.addUndergroundBiome(builder, this.FULL_RANGE, Climate.Parameter.span(-1.0F, -0.69F), this.FULL_RANGE, this.FULL_RANGE, Climate.Parameter.span(-1.0F, 0.0F), 0.0F, CheckBiomeConfig.isBiomeEnabled(getBiome(RegionsUnexploredSecondaryRegionConfig.CAVE_1.get())) ? getBiome(RegionsUnexploredSecondaryRegionConfig.CAVE_1.get()) : Biomes.LUSH_CAVES);
        this.addUndergroundBiome(builder, this.FULL_RANGE, Climate.Parameter.span(-1.0F, -0.69F), this.FULL_RANGE, this.FULL_RANGE, Climate.Parameter.span(0.0F, 1.0F), 0.0F, CheckBiomeConfig.isBiomeEnabled(getBiome(RegionsUnexploredSecondaryRegionConfig.CAVE_5.get())) ? getBiome(RegionsUnexploredSecondaryRegionConfig.CAVE_5.get()) :  Biomes.LUSH_CAVES);

        this.addUndergroundBiome(builder, this.FULL_RANGE, Climate.Parameter.span(0.65F, 1.0F), this.FULL_RANGE, this.FULL_RANGE, Climate.Parameter.span(-1.0F, 0.0F), 0.0F, CheckBiomeConfig.isBiomeEnabled(getBiome(RegionsUnexploredSecondaryRegionConfig.CAVE_4.get())) ? getBiome(RegionsUnexploredSecondaryRegionConfig.CAVE_4.get()) : Biomes.LUSH_CAVES);
        this.addUndergroundBiome(builder, this.FULL_RANGE, Climate.Parameter.span(0.65F, 1.0F), this.FULL_RANGE, this.FULL_RANGE, Climate.Parameter.span(0.0F, 1.0F), 0.0F, CheckBiomeConfig.isBiomeEnabled(getBiome(RegionsUnexploredSecondaryRegionConfig.CAVE_5.get())) ? getBiome(RegionsUnexploredSecondaryRegionConfig.CAVE_5.get()) : Biomes.LUSH_CAVES);

        this.addBottomBiome(builder, this.FULL_RANGE, this.FULL_RANGE, this.FULL_RANGE, Climate.Parameter.span(this.erosions[0], this.erosions[1]), this.FULL_RANGE, 0.0F, CheckBiomeConfig.isBiomeEnabled(getBiome(RegionsUnexploredSecondaryRegionConfig.CAVE_3.get())) ? getBiome(RegionsUnexploredSecondaryRegionConfig.CAVE_3.get()) : Biomes.DEEP_DARK);
        this.addBottomBiome(builder, this.FULL_RANGE, this.FULL_RANGE, this.FULL_RANGE, Climate.Parameter.span(this.erosions[2], this.erosions[3]), this.FULL_RANGE, 0.0F, CheckBiomeConfig.isBiomeEnabled(getBiome(RegionsUnexploredSecondaryRegionConfig.CAVE_8.get())) ? getBiome(RegionsUnexploredSecondaryRegionConfig.CAVE_8.get()) : Biomes.DEEP_DARK);
    }

    private ResourceKey<Biome> pickMiddleBiome(int temperature, int humidity, Climate.Parameter weirdness) {
        if (weirdness.max() < 0L) {
            if(CheckBiomeConfig.isBiomeEnabled(this.MIDDLE_BIOMES[temperature][humidity])){
                return this.MIDDLE_BIOMES[temperature][humidity];
            }
            else{
                return VanillaFallbackBiome.VANILLA_MIDDLE_BIOMES[temperature][humidity];
            }
        } else {
            if(this.MIDDLE_BIOMES_VARIANT[temperature][humidity]==null){
                if(CheckBiomeConfig.isBiomeEnabled(this.MIDDLE_BIOMES[temperature][humidity])){
                    return this.MIDDLE_BIOMES[temperature][humidity];
                }
                else{
                    return VanillaFallbackBiome.VANILLA_MIDDLE_BIOMES[temperature][humidity];
                }
            }
            else{
                if(CheckBiomeConfig.isBiomeEnabled(this.MIDDLE_BIOMES_VARIANT[temperature][humidity])){
                    return this.MIDDLE_BIOMES_VARIANT[temperature][humidity];
                }
                else{
                    return VanillaFallbackBiome.VANILLA_MIDDLE_BIOMES_VARIANT[temperature][humidity];
                }
            }
        }
    }

    private ResourceKey<Biome> pickMiddleBiomeOrSlopeIfCold(int temperature, int humidity, Climate.Parameter weirdness) {
        return temperature == 0 ? this.pickSlopeBiome(temperature, humidity, weirdness) : this.pickMiddleBiome(temperature, humidity, weirdness);
    }

    private ResourceKey<Biome> maybePickToweringCliffsBiome(int temperature, int humidity, Climate.Parameter weirdness, ResourceKey<Biome> fallbackBiome) {
        ResourceKey<Biome> resourceKey = CheckBiomeConfig.isBiomeEnabled(getBiome(RegionsUnexploredSecondaryRegionConfig.SHA_CLI.get())) ? getBiome(RegionsUnexploredSecondaryRegionConfig.SHA_CLI.get()) : Biomes.WINDSWEPT_SAVANNA;
        return temperature > 1 && humidity < 4 && weirdness.max() >= 0L ? resourceKey : fallbackBiome;
    }

    private ResourceKey<Biome> pickShatteredCoastBiome(int temperature, int humidity, Climate.Parameter weirdness) {
        ResourceKey<Biome> resourceKey = weirdness.max() >= 0L ? this.pickMiddleBiome(temperature, humidity, weirdness) : this.pickBeachBiome(temperature);
        return this.maybePickToweringCliffsBiome(temperature, humidity, weirdness, resourceKey);
    }

    private ResourceKey<Biome> pickBeachBiome(int temperature) {
        if (temperature == 0) {
            return CheckBiomeConfig.isBiomeEnabled(getBiome(RegionsUnexploredSecondaryRegionConfig.ICY_BEACH.get())) ? getBiome(RegionsUnexploredSecondaryRegionConfig.ICY_BEACH.get()) : Biomes.SNOWY_BEACH;
        }
        else if (temperature == 1) {
            return CheckBiomeConfig.isBiomeEnabled(getBiome(RegionsUnexploredSecondaryRegionConfig.COOL_BEACH.get())) ? getBiome(RegionsUnexploredSecondaryRegionConfig.COOL_BEACH.get()) : Biomes.BEACH;
        }
        else if (temperature == 2) {
            return CheckBiomeConfig.isBiomeEnabled(getBiome(RegionsUnexploredSecondaryRegionConfig.NEUTRAL_BEACH.get())) ? getBiome(RegionsUnexploredSecondaryRegionConfig.NEUTRAL_BEACH.get()) : Biomes.BEACH;
        }
        else if (temperature == 3) {
            return CheckBiomeConfig.isBiomeEnabled(getBiome(RegionsUnexploredSecondaryRegionConfig.WARM_BEACH.get())) ? getBiome(RegionsUnexploredSecondaryRegionConfig.WARM_BEACH.get()) : Biomes.BEACH;
        }
        else{
            return CheckBiomeConfig.isBiomeEnabled(getBiome(RegionsUnexploredSecondaryRegionConfig.HOT_BEACH.get())) ? getBiome(RegionsUnexploredSecondaryRegionConfig.HOT_BEACH.get()) : Biomes.BEACH;
        }
    }

    private ResourceKey<Biome> pickPlateauBiome(int temperature, int humidity, Climate.Parameter weirdness) {
        if (weirdness.max() < 0L) {
            if(CheckBiomeConfig.isBiomeEnabled(this.PLATEAU_BIOMES[temperature][humidity])){
                return this.PLATEAU_BIOMES[temperature][humidity];
            }
            else{
                return VanillaFallbackBiome.VANILLA_PLATEAU_BIOMES[temperature][humidity];
            }
        } else {
            if(this.PLATEAU_BIOMES_VARIANT[temperature][humidity]==null){
                if(CheckBiomeConfig.isBiomeEnabled(this.PLATEAU_BIOMES[temperature][humidity])){
                    return this.PLATEAU_BIOMES[temperature][humidity];
                }
                else{
                    return VanillaFallbackBiome.VANILLA_PLATEAU_BIOMES[temperature][humidity];
                }
            }
            else{
                if(CheckBiomeConfig.isBiomeEnabled(this.PLATEAU_BIOMES_VARIANT[temperature][humidity])){
                    return this.PLATEAU_BIOMES_VARIANT[temperature][humidity];
                }
                else{
                    return VanillaFallbackBiome.VANILLA_PLATEAU_BIOMES_VARIANT[temperature][humidity];
                }
            }
        }
    }

    private ResourceKey<Biome> pickPeakBiome(int temperature, int humidity, Climate.Parameter weirdness) {
        if (temperature == 0) {
            if(weirdness.max() < 0L) {
                return CheckBiomeConfig.isBiomeEnabled(getBiome(RegionsUnexploredSecondaryRegionConfig.ICY_PEAK.get())) ? getBiome(RegionsUnexploredSecondaryRegionConfig.ICY_PEAK.get()) : Biomes.JAGGED_PEAKS;
            }
            else{
                return CheckBiomeConfig.isBiomeEnabled(getBiome(RegionsUnexploredSecondaryRegionConfig.ICY_PEAK_VAR.get())) ? getBiome(RegionsUnexploredSecondaryRegionConfig.ICY_PEAK_VAR.get()) : Biomes.FROZEN_PEAKS;
            }
        }
        else if (temperature == 1) {
            if(weirdness.max() < 0L) {
                return CheckBiomeConfig.isBiomeEnabled(getBiome(RegionsUnexploredSecondaryRegionConfig.COOL_PEAK.get())) ? getBiome(RegionsUnexploredSecondaryRegionConfig.COOL_PEAK.get()) : Biomes.JAGGED_PEAKS;
            }
            else{
                return CheckBiomeConfig.isBiomeEnabled(getBiome(RegionsUnexploredSecondaryRegionConfig.COOL_PEAK_VAR.get())) ? getBiome(RegionsUnexploredSecondaryRegionConfig.COOL_PEAK_VAR.get()) : Biomes.FROZEN_PEAKS;
            }
        }
        else if (temperature == 2) {
            if(weirdness.max() < 0L) {
                return CheckBiomeConfig.isBiomeEnabled(getBiome(RegionsUnexploredSecondaryRegionConfig.NEUTRAL_PEAK.get())) ? getBiome(RegionsUnexploredSecondaryRegionConfig.NEUTRAL_PEAK.get()) : Biomes.JAGGED_PEAKS;
            }
            else{
                return CheckBiomeConfig.isBiomeEnabled(getBiome(RegionsUnexploredSecondaryRegionConfig.NEUTRAL_PEAK_VAR.get())) ? getBiome(RegionsUnexploredSecondaryRegionConfig.NEUTRAL_PEAK_VAR.get()) : Biomes.FROZEN_PEAKS;
            }
        }
        else if (temperature == 3) {
            if(weirdness.max() < 0L) {
                return CheckBiomeConfig.isBiomeEnabled(getBiome(RegionsUnexploredSecondaryRegionConfig.WARM_PEAK.get())) ? getBiome(RegionsUnexploredSecondaryRegionConfig.WARM_PEAK.get()) : Biomes.STONY_PEAKS;
            }
            else{
                return CheckBiomeConfig.isBiomeEnabled(getBiome(RegionsUnexploredSecondaryRegionConfig.WARM_PEAK_VAR.get())) ? getBiome(RegionsUnexploredSecondaryRegionConfig.WARM_PEAK_VAR.get()) : Biomes.STONY_PEAKS;
            }
        }
        else{
            if(weirdness.max() < 0L) {
                return CheckBiomeConfig.isBiomeEnabled(getBiome(RegionsUnexploredSecondaryRegionConfig.HOT_PEAK.get())) ? getBiome(RegionsUnexploredSecondaryRegionConfig.HOT_PEAK.get()) : Biomes.BADLANDS;
            }
            else{
                return CheckBiomeConfig.isBiomeEnabled(getBiome(RegionsUnexploredSecondaryRegionConfig.HOT_PEAK_VAR.get())) ? getBiome(RegionsUnexploredSecondaryRegionConfig.HOT_PEAK_VAR.get()) : Biomes.WOODED_BADLANDS;
            }
        }
    }

    private ResourceKey<Biome> pickSlopeBiome(int temperature, int humidity, Climate.Parameter weirdness) {
        if (temperature == 0) {
            if(weirdness.max() < 0L) {
                return CheckBiomeConfig.isBiomeEnabled(getBiome(RegionsUnexploredSecondaryRegionConfig.ICY_SLOPE.get())) ? getBiome(RegionsUnexploredSecondaryRegionConfig.ICY_SLOPE.get()) : Biomes.SNOWY_SLOPES;
            }
            else{
                return CheckBiomeConfig.isBiomeEnabled(getBiome(RegionsUnexploredSecondaryRegionConfig.ICY_SLOPE_VAR.get())) ? getBiome(RegionsUnexploredSecondaryRegionConfig.ICY_SLOPE_VAR.get()) : Biomes.GROVE;
            }
        }
        else if (temperature == 1) {
            if(humidity<2){
                return pickPlateauBiome(temperature, humidity, weirdness);
            }
            if(weirdness.max() < 0L) {
                return CheckBiomeConfig.isBiomeEnabled(getBiome(RegionsUnexploredSecondaryRegionConfig.COOL_SLOPE.get())) ? getBiome(RegionsUnexploredSecondaryRegionConfig.COOL_SLOPE.get()) : Biomes.GROVE;
            }
            else{
                return CheckBiomeConfig.isBiomeEnabled(getBiome(RegionsUnexploredSecondaryRegionConfig.COOL_SLOPE_VAR.get())) ? getBiome(RegionsUnexploredSecondaryRegionConfig.COOL_SLOPE_VAR.get()) : Biomes.SNOWY_SLOPES;
            }
        }
        else if (temperature == 2) {
            if(weirdness.max() < 0L) {
                return CheckBiomeConfig.isBiomeEnabled(getBiome(RegionsUnexploredSecondaryRegionConfig.NEUTRAL_SLOPE.get())) ? getBiome(RegionsUnexploredSecondaryRegionConfig.NEUTRAL_SLOPE.get()) : Biomes.GROVE;
            }
            else{
                return CheckBiomeConfig.isBiomeEnabled(getBiome(RegionsUnexploredSecondaryRegionConfig.NEUTRAL_SLOPE_VAR.get())) ? getBiome(RegionsUnexploredSecondaryRegionConfig.NEUTRAL_SLOPE_VAR.get()) : Biomes.SNOWY_SLOPES;
            }
        }
        else if (temperature == 3) {
            if(humidity>2){
                return pickMiddleBiome(temperature, humidity, weirdness);
            }
            if(weirdness.max() < 0L) {
                return CheckBiomeConfig.isBiomeEnabled(getBiome(RegionsUnexploredSecondaryRegionConfig.WARM_SLOPE.get())) ? getBiome(RegionsUnexploredSecondaryRegionConfig.WARM_SLOPE.get()) : Biomes.STONY_PEAKS;
            }
            else{
                return CheckBiomeConfig.isBiomeEnabled(getBiome(RegionsUnexploredSecondaryRegionConfig.WARM_SLOPE_VAR.get())) ? getBiome(RegionsUnexploredSecondaryRegionConfig.WARM_SLOPE_VAR.get()) : Biomes.STONY_PEAKS;
            }
        }
        else{
            if(humidity<2){
                return pickPlateauBiome(temperature, humidity, weirdness);
            }
            if(weirdness.max() < 0L) {
                return CheckBiomeConfig.isBiomeEnabled(getBiome(RegionsUnexploredSecondaryRegionConfig.HOT_SLOPE.get())) ? getBiome(RegionsUnexploredSecondaryRegionConfig.HOT_SLOPE.get()) : Biomes.SAVANNA;
            }
            else{
                return CheckBiomeConfig.isBiomeEnabled(getBiome(RegionsUnexploredSecondaryRegionConfig.HOT_SLOPE_VAR.get())) ? getBiome(RegionsUnexploredSecondaryRegionConfig.HOT_SLOPE_VAR.get()) : Biomes.SAVANNA;
            }
        }
    }

    private ResourceKey<Biome> pickShatteredBiome(int temperature, int humidity, Climate.Parameter weirdness) {
        ResourceKey<Biome> resourceKey = CheckBiomeConfig.isBiomeEnabled(this.SHATTERED_BIOMES[temperature][humidity]) ? this.SHATTERED_BIOMES[temperature][humidity] : VanillaFallbackBiome.VANILLA_SHATTERED_BIOMES[temperature][humidity];
        return resourceKey == null ? this.pickMiddleBiome(temperature, humidity, weirdness) : resourceKey;
    }

    private ResourceKey<Biome> pickRiverBiome(int temperature, int humidity, Climate.Parameter weirdness) {
        if (weirdness.max() < 0L) {
            if(CheckBiomeConfig.isBiomeEnabled(this.RIVER_BIOMES[temperature][humidity])){
                return this.RIVER_BIOMES[temperature][humidity];
            }
            else{
                return VanillaFallbackBiome.VANILLA_RIVER_BIOMES[temperature][humidity];
            }
        } else {
            if(this.RIVER_BIOMES_VARIANT[temperature][humidity]==null){
                if(CheckBiomeConfig.isBiomeEnabled(this.RIVER_BIOMES[temperature][humidity])){
                    return this.RIVER_BIOMES[temperature][humidity];
                }
                else{
                    return VanillaFallbackBiome.VANILLA_RIVER_BIOMES[temperature][humidity];
                }
            }
            else{
                if(CheckBiomeConfig.isBiomeEnabled(this.RIVER_BIOMES_VARIANT[temperature][humidity])){
                    return this.RIVER_BIOMES_VARIANT[temperature][humidity];
                }
                else{
                    return VanillaFallbackBiome.VANILLA_RIVER_BIOMES_VARIANT[temperature][humidity];
                }
            }
        }
    }

    private ResourceKey<Biome> pickSwampBiome(int temperature, int humidity) {
        if(CheckBiomeConfig.isBiomeEnabled(this.SWAMP_BIOMES[temperature][humidity])){
            return this.SWAMP_BIOMES[temperature][humidity];
        }
        else{
            return VanillaFallbackBiome.VANILLA_SWAMP_BIOMES[temperature][humidity];
        }
    }

    private void addSurfaceBiome(Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> builder, Climate.Parameter temperature, Climate.Parameter humidity, Climate.Parameter continentalness, Climate.Parameter erosion, Climate.Parameter weirdness, float offset, ResourceKey<Biome> biome) {
        builder.accept(Pair.of(Climate.parameters(temperature, humidity, continentalness, erosion, Climate.Parameter.point(0.0F), weirdness, offset), biome));
        builder.accept(Pair.of(Climate.parameters(temperature, humidity, continentalness, erosion, Climate.Parameter.point(1.0F), weirdness, offset), biome));
    }

    private void addUndergroundBiome(Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> builder, Climate.Parameter temperature, Climate.Parameter humidity, Climate.Parameter continentalness, Climate.Parameter erosion, Climate.Parameter weirdness, float offset, ResourceKey<Biome> biome) {
        builder.accept(Pair.of(Climate.parameters(temperature, humidity, continentalness, erosion, Climate.Parameter.span(0.2F, 0.9F), weirdness, offset), biome));
    }

    private void addBottomBiome(Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> builder, Climate.Parameter temperature, Climate.Parameter humidity, Climate.Parameter continentalness, Climate.Parameter erosion, Climate.Parameter weirdness, float offset, ResourceKey<Biome> biome) {
        builder.accept(Pair.of(Climate.parameters(temperature, humidity, continentalness, erosion, Climate.Parameter.point(1.1F), weirdness, offset), biome));
    }

    public static ResourceKey<Biome> getBiome(String id){
        return ResourceKey.create(Registries.BIOME, new ResourceLocation(id));
    }
}