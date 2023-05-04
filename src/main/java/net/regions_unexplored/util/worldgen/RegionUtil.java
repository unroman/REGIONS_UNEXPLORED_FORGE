package net.regions_unexplored.util.worldgen;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.regions_unexplored.config.RegionsUnexploredCommonConfigs;
import net.regions_unexplored.config.RegionsUnexploredPrimaryRegionConfig;
import net.regions_unexplored.config.RegionsUnexploredSecondaryRegionConfig;
import net.regions_unexplored.data.worldgen.biome.RuBiomes;

public class RegionUtil {
    //PRIMARY_REGION
    public static ResourceKey<Biome>[][] getPrimaryMiddleBiome(){
        ResourceKey<Biome>[][] PRIMARY_MIDDLE_BIOMES_CUSTOM = new ResourceKey[][]{
            //-----------ARID,DRY,NEUTRAL,WET,HUMID
            /*ICY*/     {getBiome(RegionsUnexploredPrimaryRegionConfig.MID_ICY_ARID.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.MID_ICY_DRY.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.MID_ICY_NEUTRAL.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.MID_ICY_WET.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.MID_ICY_HUMID.get())},
            /*COOL*/    {getBiome(RegionsUnexploredPrimaryRegionConfig.MID_COOL_ARID.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.MID_COOL_DRY.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.MID_COOL_NEUTRAL.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.MID_COOL_WET.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.MID_COOL_HUMID.get())},
            /*NEUTRAL*/ {getBiome(RegionsUnexploredPrimaryRegionConfig.MID_NEUTRAL_ARID.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.MID_NEUTRAL_DRY.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.MID_NEUTRAL_NEUTRAL.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.MID_NEUTRAL_WET.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.MID_NEUTRAL_HUMID.get())},
            /*WARM*/    {getBiome(RegionsUnexploredPrimaryRegionConfig.MID_WARM_ARID.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.MID_WARM_DRY.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.MID_WARM_NEUTRAL.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.MID_WARM_WET.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.MID_WARM_HUMID.get())},
            /*HOT*/     {getBiome(RegionsUnexploredPrimaryRegionConfig.MID_HOT_ARID.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.MID_HOT_DRY.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.MID_HOT_NEUTRAL.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.MID_HOT_WET.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.MID_HOT_HUMID.get())}};

        ResourceKey<Biome>[][] PRIMARY_MIDDLE_BIOMES = new ResourceKey[][]{
                //-----------ARID,DRY,NEUTRAL,WET,HUMID
                /*ICY*/     {RuBiomes.ICY_DESERT, RuBiomes.FROZEN_TUNDRA, RuBiomes.FROZEN_FOREST, RuBiomes.COLD_BOREAL_FOREST, RuBiomes.COLD_BOREAL_FOREST},
                /*COOL*/    {RuBiomes.PUMPKIN_FIELDS, RuBiomes.AUTUMNAL_MAPLE_FOREST, RuBiomes.MAPLE_FOREST, RuBiomes.MAPLE_FOREST, RuBiomes.BOREAL_FOREST},
                /*NEUTRAL*/ {RuBiomes.ORCHARD, RuBiomes.SHRUBLAND, RuBiomes.TEMPERATE_GROVE, RuBiomes.PINE_FOREST, RuBiomes.BLACKWOOD_FOREST},
                /*WARM*/    {RuBiomes.DECIDUOUS_FOREST, RuBiomes.DECIDUOUS_FOREST, RuBiomes.BARLEY_FIELDS, RuBiomes.REDWOODS, RuBiomes.REDWOODS},
                /*HOT*/     {RuBiomes.BAOBAB_SAVANNA, RuBiomes.BAOBAB_SAVANNA, RuBiomes.SAGUARO_DESERT, RuBiomes.SAGUARO_DESERT, RuBiomes.OLD_GROWTH_RAINFOREST}};



        if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
            return PRIMARY_MIDDLE_BIOMES_CUSTOM;
        }
        else{
            return PRIMARY_MIDDLE_BIOMES;
        }
    }
    public static ResourceKey<Biome>[][] getPrimaryMiddleBiomeVariant(){
        ResourceKey<Biome>[][] PRIMARY_MIDDLE_BIOMES_VARIANT_CUSTOM = new ResourceKey[][]{
                //-----------ARID,DRY,NEUTRAL,WET,HUMID
                /*ICY*/     {getBiome(RegionsUnexploredPrimaryRegionConfig.MID_VAR_ICY_ARID.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.MID_VAR_ICY_DRY.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.MID_VAR_ICY_NEUTRAL.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.MID_VAR_ICY_WET.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.MID_VAR_ICY_HUMID.get())},
                /*COOL*/    {getBiome(RegionsUnexploredPrimaryRegionConfig.MID_VAR_COOL_ARID.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.MID_VAR_COOL_DRY.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.MID_VAR_COOL_NEUTRAL.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.MID_VAR_COOL_WET.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.MID_VAR_COOL_HUMID.get())},
                /*NEUTRAL*/ {getBiome(RegionsUnexploredPrimaryRegionConfig.MID_VAR_NEUTRAL_ARID.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.MID_VAR_NEUTRAL_DRY.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.MID_VAR_NEUTRAL_NEUTRAL.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.MID_VAR_NEUTRAL_WET.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.MID_VAR_NEUTRAL_HUMID.get())},
                /*WARM*/    {getBiome(RegionsUnexploredPrimaryRegionConfig.MID_VAR_WARM_ARID.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.MID_VAR_WARM_DRY.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.MID_VAR_WARM_NEUTRAL.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.MID_VAR_WARM_WET.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.MID_VAR_WARM_HUMID.get())},
                /*HOT*/     {getBiome(RegionsUnexploredPrimaryRegionConfig.MID_VAR_HOT_ARID.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.MID_VAR_HOT_DRY.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.MID_VAR_HOT_NEUTRAL.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.MID_VAR_HOT_WET.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.MID_VAR_HOT_HUMID.get())}};


        ResourceKey<Biome>[][] PRIMARY_MIDDLE_BIOMES_VARIANT = new ResourceKey[][]{
                //-----------ARID,DRY,NEUTRAL,WET,HUMID
                /*ICY*/     {RuBiomes.ICY_DESERT, RuBiomes.FROZEN_TUNDRA, RuBiomes.FROZEN_TUNDRA, RuBiomes.COLD_BOREAL_FOREST, RuBiomes.SPIRES},
                /*COOL*/    {RuBiomes.AUTUMNAL_MAPLE_FOREST, RuBiomes.SILVER_BIRCH_FOREST, RuBiomes.MAPLE_FOREST, RuBiomes.BOREAL_FOREST, RuBiomes.GOLDEN_BOREAL_FOREST},
                /*NEUTRAL*/ {RuBiomes.ORCHARD, RuBiomes.SHRUBLAND, RuBiomes.TEMPERATE_GROVE, RuBiomes.PINE_FOREST, RuBiomes.BLACKWOOD_FOREST},
                /*WARM*/    {RuBiomes.DECIDUOUS_FOREST, RuBiomes.DECIDUOUS_FOREST, RuBiomes.PRAIRIE, RuBiomes.REDWOODS, RuBiomes.SPARSE_REDWOODS},
                /*HOT*/     {RuBiomes.BAOBAB_SAVANNA, RuBiomes.BAOBAB_SAVANNA, RuBiomes.JOSHUA_DESERT, RuBiomes.JOSHUA_DESERT, RuBiomes.RAINFOREST}};



        if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
            return PRIMARY_MIDDLE_BIOMES_VARIANT_CUSTOM;
        }
        else{
            return PRIMARY_MIDDLE_BIOMES_VARIANT;
        }
    }
    public static ResourceKey<Biome>[][] getPrimaryPlateauBiome(){
        ResourceKey<Biome>[][] PRIMARY_PLATEAU_BIOMES_CUSTOM = new ResourceKey[][]{
                //-----------ARID,DRY,NEUTRAL,WET,HUMID
                /*ICY*/     {getBiome(RegionsUnexploredPrimaryRegionConfig.PLT_ICY_ARID.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.PLT_ICY_DRY.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.PLT_ICY_NEUTRAL.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.PLT_ICY_WET.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.PLT_ICY_HUMID.get())},
                /*COOL*/    {getBiome(RegionsUnexploredPrimaryRegionConfig.PLT_COOL_ARID.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.PLT_COOL_DRY.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.PLT_COOL_NEUTRAL.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.PLT_COOL_WET.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.PLT_COOL_HUMID.get())},
                /*NEUTRAL*/ {getBiome(RegionsUnexploredPrimaryRegionConfig.PLT_NEUTRAL_ARID.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.PLT_NEUTRAL_DRY.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.PLT_NEUTRAL_NEUTRAL.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.PLT_NEUTRAL_WET.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.PLT_NEUTRAL_HUMID.get())},
                /*WARM*/    {getBiome(RegionsUnexploredPrimaryRegionConfig.PLT_WARM_ARID.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.PLT_WARM_DRY.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.PLT_WARM_NEUTRAL.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.PLT_WARM_WET.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.PLT_WARM_HUMID.get())},
                /*HOT*/     {getBiome(RegionsUnexploredPrimaryRegionConfig.PLT_HOT_ARID.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.PLT_HOT_DRY.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.PLT_HOT_NEUTRAL.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.PLT_HOT_WET.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.PLT_HOT_HUMID.get())}};


        ResourceKey<Biome>[][] PRIMARY_PLATEAU_BIOMES = new ResourceKey[][]{
                //-----------ARID,DRY,NEUTRAL,WET,HUMID
                /*ICY*/     {RuBiomes.ICY_HEIGHTS, RuBiomes.ICY_HEIGHTS, RuBiomes.ICY_HEIGHTS, RuBiomes.ICY_HEIGHTS, RuBiomes.COLD_BOREAL_FOREST},
                /*COOL*/    {RuBiomes.AUTUMNAL_MAPLE_FOREST, RuBiomes.AUTUMNAL_MAPLE_FOREST, RuBiomes.MAPLE_FOREST, RuBiomes.BOREAL_FOREST, RuBiomes.BOREAL_FOREST},
                /*NEUTRAL*/ {RuBiomes.HIGHLAND_FIELDS, RuBiomes.HIGHLAND_FIELDS, RuBiomes.DECIDUOUS_FOREST, RuBiomes.HIGHLAND_FIELDS, RuBiomes.BLACKWOOD_FOREST},
                /*WARM*/    {RuBiomes.DECIDUOUS_FOREST, RuBiomes.DECIDUOUS_FOREST, RuBiomes.DECIDUOUS_FOREST, RuBiomes.REDWOODS, RuBiomes.REDWOODS},
                /*HOT*/     {RuBiomes.STEPPE, RuBiomes.STEPPE, RuBiomes.STEPPE, RuBiomes.RAINFOREST, RuBiomes.RAINFOREST}};



        if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
            return PRIMARY_PLATEAU_BIOMES_CUSTOM;
        }
        else{
            return PRIMARY_PLATEAU_BIOMES;
        }
    }
    public static ResourceKey<Biome>[][] getPrimaryPlateauBiomeVariant(){
        ResourceKey<Biome>[][] PRIMARY_PLATEAU_BIOMES_VARIANT_CUSTOM = new ResourceKey[][]{
                //-----------ARID,DRY,NEUTRAL,WET,HUMID
                /*ICY*/     {getBiome(RegionsUnexploredPrimaryRegionConfig.PLT_VAR_ICY_ARID.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.PLT_VAR_ICY_DRY.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.PLT_VAR_ICY_NEUTRAL.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.PLT_VAR_ICY_WET.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.PLT_VAR_ICY_HUMID.get())},
                /*COOL*/    {getBiome(RegionsUnexploredPrimaryRegionConfig.PLT_VAR_COOL_ARID.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.PLT_VAR_COOL_DRY.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.PLT_VAR_COOL_NEUTRAL.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.PLT_VAR_COOL_WET.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.PLT_VAR_COOL_HUMID.get())},
                /*NEUTRAL*/ {getBiome(RegionsUnexploredPrimaryRegionConfig.PLT_VAR_NEUTRAL_ARID.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.PLT_VAR_NEUTRAL_DRY.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.PLT_VAR_NEUTRAL_NEUTRAL.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.PLT_VAR_NEUTRAL_WET.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.PLT_VAR_NEUTRAL_HUMID.get())},
                /*WARM*/    {getBiome(RegionsUnexploredPrimaryRegionConfig.PLT_VAR_WARM_ARID.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.PLT_VAR_WARM_DRY.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.PLT_VAR_WARM_NEUTRAL.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.PLT_VAR_WARM_WET.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.PLT_VAR_WARM_HUMID.get())},
                /*HOT*/     {getBiome(RegionsUnexploredPrimaryRegionConfig.PLT_VAR_HOT_ARID.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.PLT_VAR_HOT_DRY.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.PLT_VAR_HOT_NEUTRAL.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.PLT_VAR_HOT_WET.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.PLT_VAR_HOT_HUMID.get())}};


        ResourceKey<Biome>[][] PRIMARY_PLATEAU_BIOMES_VARIANT = new ResourceKey[][]{
                //-----------ARID,DRY,NEUTRAL,WET,HUMID
                /*ICY*/     {RuBiomes.ICY_HEIGHTS, RuBiomes.ICY_HEIGHTS, RuBiomes.ICY_HEIGHTS, RuBiomes.ICY_HEIGHTS, RuBiomes.SPIRES},
                /*COOL*/    {RuBiomes.AUTUMNAL_MAPLE_FOREST, RuBiomes.SILVER_BIRCH_FOREST, RuBiomes.MAPLE_FOREST, RuBiomes.BOREAL_FOREST, RuBiomes.GOLDEN_BOREAL_FOREST},
                /*NEUTRAL*/ {RuBiomes.HIGHLAND_FIELDS, RuBiomes.HIGHLAND_FIELDS, RuBiomes.DECIDUOUS_FOREST, RuBiomes.PINE_FOREST, RuBiomes.BLACKWOOD_FOREST},
                /*WARM*/    {RuBiomes.DECIDUOUS_FOREST, RuBiomes.DECIDUOUS_FOREST, RuBiomes.DECIDUOUS_FOREST, RuBiomes.REDWOODS, RuBiomes.SPARSE_REDWOODS},
                /*HOT*/     {RuBiomes.STEPPE, RuBiomes.STEPPE, RuBiomes.STEPPE, RuBiomes.OLD_GROWTH_RAINFOREST, RuBiomes.RAINFOREST}};



        if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
            return PRIMARY_PLATEAU_BIOMES_VARIANT_CUSTOM;
        }
        else{
            return PRIMARY_PLATEAU_BIOMES_VARIANT;
        }
    }
    public static ResourceKey<Biome>[][] getPrimaryShatteredBiome(){
        ResourceKey<Biome>[][] PRIMARY_SHATTERED_BIOMES_CUSTOM = new ResourceKey[][]{
                //-----------ARID,DRY,NEUTRAL,WET,HUMID
                /*ICY*/     {getBiome(RegionsUnexploredPrimaryRegionConfig.SHT_ICY_ARID.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.SHT_ICY_DRY.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.SHT_ICY_NEUTRAL.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.SHT_ICY_WET.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.SHT_ICY_HUMID.get())},
                /*COOL*/    {getBiome(RegionsUnexploredPrimaryRegionConfig.SHT_COOL_ARID.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.SHT_COOL_DRY.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.SHT_COOL_NEUTRAL.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.SHT_COOL_WET.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.SHT_COOL_HUMID.get())},
                /*NEUTRAL*/ {getBiome(RegionsUnexploredPrimaryRegionConfig.SHT_NEUTRAL_ARID.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.SHT_NEUTRAL_DRY.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.SHT_NEUTRAL_NEUTRAL.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.SHT_NEUTRAL_WET.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.SHT_NEUTRAL_HUMID.get())},
                /*WARM*/    {getBiome(RegionsUnexploredPrimaryRegionConfig.SHT_WARM_ARID.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.SHT_WARM_DRY.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.SHT_WARM_NEUTRAL.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.SHT_WARM_WET.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.SHT_WARM_HUMID.get())},
                /*HOT*/     {getBiome(RegionsUnexploredPrimaryRegionConfig.SHT_HOT_ARID.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.SHT_HOT_DRY.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.SHT_HOT_NEUTRAL.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.SHT_HOT_WET.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.SHT_HOT_HUMID.get())}};


        ResourceKey<Biome>[][] PRIMARY_SHATTERED_BIOMES = new ResourceKey[][]{
                //-----------ARID,DRY,NEUTRAL,WET,HUMID
                /*ICY*/     {RuBiomes.ICY_HEIGHTS, RuBiomes.ICY_HEIGHTS, RuBiomes.ICY_HEIGHTS, RuBiomes.ICY_HEIGHTS, RuBiomes.ICY_HEIGHTS},
                /*COOL*/    {RuBiomes.TOWERING_CLIFFS, RuBiomes.TOWERING_CLIFFS, RuBiomes.TOWERING_CLIFFS, RuBiomes.TOWERING_CLIFFS, RuBiomes.TOWERING_CLIFFS},
                /*NEUTRAL*/ {RuBiomes.LUSH_HILLS, RuBiomes.LUSH_HILLS, RuBiomes.LUSH_HILLS, RuBiomes.LUSH_HILLS, RuBiomes.LUSH_HILLS},
                /*WARM*/    {RuBiomes.DECIDUOUS_FOREST, RuBiomes.DECIDUOUS_FOREST, RuBiomes.PRAIRIE, RuBiomes.SPARSE_REDWOODS, RuBiomes.SPARSE_REDWOODS},
                /*HOT*/     {RuBiomes.BAOBAB_SAVANNA, RuBiomes.BAOBAB_SAVANNA, RuBiomes.SAGUARO_DESERT, RuBiomes.SAGUARO_DESERT, RuBiomes.RAINFOREST}};



        if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
            return PRIMARY_SHATTERED_BIOMES_CUSTOM;
        }
        else{
            return PRIMARY_SHATTERED_BIOMES;
        }
    }
    public static ResourceKey<Biome>[][] getPrimaryRiverBiome(){
        ResourceKey<Biome>[][] PRIMARY_RIVER_BIOMES_CUSTOM = new ResourceKey[][]{
                //-----------ARID,DRY,NEUTRAL,WET,HUMID
                /*ICY*/     {getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_ICY_ARID.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_ICY_DRY.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_ICY_NEUTRAL.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_ICY_WET.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_ICY_HUMID.get())},
                /*COOL*/    {getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_COOL_ARID.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_COOL_DRY.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_COOL_NEUTRAL.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_COOL_WET.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_COOL_HUMID.get())},
                /*NEUTRAL*/ {getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_NEUTRAL_ARID.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_NEUTRAL_DRY.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_NEUTRAL_NEUTRAL.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_NEUTRAL_WET.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_NEUTRAL_HUMID.get())},
                /*WARM*/    {getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_WARM_ARID.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_WARM_DRY.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_WARM_NEUTRAL.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_WARM_WET.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_WARM_HUMID.get())},
                /*HOT*/     {getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_HOT_ARID.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_HOT_DRY.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_HOT_NEUTRAL.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_HOT_WET.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_HOT_HUMID.get())}};


        ResourceKey<Biome>[][] PRIMARY_RIVER_BIOMES = new ResourceKey[][]{
                //-----------ARID,DRY,NEUTRAL,WET,HUMID
                /*ICY*/     {Biomes.FROZEN_RIVER, Biomes.FROZEN_RIVER, Biomes.FROZEN_RIVER, Biomes.FROZEN_RIVER, Biomes.FROZEN_RIVER},
                /*COOL*/    {RuBiomes.COLD_RIVER, RuBiomes.COLD_RIVER, RuBiomes.COLD_RIVER, RuBiomes.COLD_RIVER, RuBiomes.COLD_RIVER},
                /*NEUTRAL*/ {RuBiomes.MUDDY_RIVER, RuBiomes.MUDDY_RIVER, RuBiomes.MUDDY_RIVER, RuBiomes.MUDDY_RIVER, RuBiomes.BLACKWOOD_FOREST},
                /*WARM*/    {RuBiomes.MUDDY_RIVER, RuBiomes.MUDDY_RIVER, RuBiomes.MUDDY_RIVER, RuBiomes.MUDDY_RIVER, RuBiomes.MUDDY_RIVER},
                /*HOT*/     {RuBiomes.MUDDY_RIVER, RuBiomes.MUDDY_RIVER, RuBiomes.MUDDY_RIVER, RuBiomes.MUDDY_RIVER, RuBiomes.MUDDY_RIVER}};



        if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
            return PRIMARY_RIVER_BIOMES_CUSTOM;
        }
        else{
            return PRIMARY_RIVER_BIOMES;
        }
    }
    public static ResourceKey<Biome>[][] getPrimaryRiverBiomeVariant(){
        ResourceKey<Biome>[][] PRIMARY_RIVER_BIOMES_VARIANT_CUSTOM = new ResourceKey[][]{
                //-----------ARID,DRY,NEUTRAL,WET,HUMID
                /*ICY*/     {getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_ICY_ARID.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_ICY_DRY.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_ICY_NEUTRAL.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_ICY_WET.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_ICY_HUMID.get())},
                /*COOL*/    {getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_COOL_ARID.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_COOL_DRY.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_COOL_NEUTRAL.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_COOL_WET.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_COOL_HUMID.get())},
                /*NEUTRAL*/ {getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_NEUTRAL_ARID.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_NEUTRAL_DRY.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_NEUTRAL_NEUTRAL.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_NEUTRAL_WET.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_NEUTRAL_HUMID.get())},
                /*WARM*/    {getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_WARM_ARID.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_WARM_DRY.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_WARM_NEUTRAL.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_WARM_WET.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_WARM_HUMID.get())},
                /*HOT*/     {getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_HOT_ARID.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_HOT_DRY.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_HOT_NEUTRAL.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_HOT_WET.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_HOT_HUMID.get())}};


        ResourceKey<Biome>[][] PRIMARY_RIVER_BIOMES_VARIANT = new ResourceKey[][]{
                //-----------ARID,DRY,NEUTRAL,WET,HUMID
                /*ICY*/     {Biomes.FROZEN_RIVER, Biomes.FROZEN_RIVER, Biomes.FROZEN_RIVER, Biomes.FROZEN_RIVER, Biomes.FROZEN_RIVER},
                /*COOL*/    {RuBiomes.COLD_RIVER, RuBiomes.COLD_RIVER, RuBiomes.COLD_RIVER, RuBiomes.COLD_RIVER, RuBiomes.COLD_RIVER},
                /*NEUTRAL*/ {RuBiomes.MUDDY_RIVER, RuBiomes.MUDDY_RIVER, RuBiomes.MUDDY_RIVER, RuBiomes.MUDDY_RIVER, RuBiomes.BLACKWOOD_FOREST},
                /*WARM*/    {RuBiomes.MUDDY_RIVER, RuBiomes.MUDDY_RIVER, RuBiomes.MUDDY_RIVER, RuBiomes.MUDDY_RIVER, RuBiomes.MUDDY_RIVER},
                /*HOT*/     {RuBiomes.MUDDY_RIVER, RuBiomes.MUDDY_RIVER, RuBiomes.MUDDY_RIVER, RuBiomes.MUDDY_RIVER, RuBiomes.MUDDY_RIVER}};



        if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
            return PRIMARY_RIVER_BIOMES_VARIANT_CUSTOM;
        }
        else{
            return PRIMARY_RIVER_BIOMES_VARIANT;
        }
    }
    public static ResourceKey<Biome>[][] getPrimarySwampBiome(){
        ResourceKey<Biome>[][] PRIMARY_SWAMP_BIOMES_CUSTOM = new ResourceKey[][]{
                //-----------ARID,DRY,NEUTRAL,WET,HUMID
                /*ICY*/     {getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_ICY_ARID.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_ICY_DRY.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_ICY_NEUTRAL.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_ICY_WET.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_ICY_HUMID.get())},
                /*COOL*/    {getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_COOL_ARID.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_COOL_DRY.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_COOL_NEUTRAL.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_COOL_WET.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_COOL_HUMID.get())},
                /*NEUTRAL*/ {getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_NEUTRAL_ARID.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_NEUTRAL_DRY.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_NEUTRAL_NEUTRAL.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_NEUTRAL_WET.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_NEUTRAL_HUMID.get())},
                /*WARM*/    {getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_WARM_ARID.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_WARM_DRY.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_WARM_NEUTRAL.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_WARM_WET.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_WARM_HUMID.get())},
                /*HOT*/     {getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_HOT_ARID.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_HOT_DRY.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_HOT_NEUTRAL.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_HOT_WET.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.RVR_HOT_HUMID.get())}};


        ResourceKey<Biome>[][] PRIMARY_SWAMP_BIOMES = new ResourceKey[][]{
                //-----------ARID,DRY,NEUTRAL,WET,HUMID
                /*ICY*/     {RuBiomes.SPIRES, RuBiomes.SPIRES, RuBiomes.SPIRES, RuBiomes.SPIRES, RuBiomes.SPIRES},
                /*COOL*/    {RuBiomes.FEN, RuBiomes.FEN, RuBiomes.FEN, RuBiomes.FEN, RuBiomes.FEN},
                /*NEUTRAL*/ {RuBiomes.BAYOU, RuBiomes.BAYOU, RuBiomes.BAYOU, RuBiomes.GIANT_BAYOU, RuBiomes.GIANT_BAYOU},
                /*WARM*/    {RuBiomes.FLOODED_PLAINS, RuBiomes.FLOODED_PLAINS, RuBiomes.FLOODED_PLAINS, RuBiomes.GIANT_BAYOU, RuBiomes.GIANT_BAYOU},
                /*HOT*/     {RuBiomes.FUNGAL_FEN, RuBiomes.FUNGAL_FEN, RuBiomes.FUNGAL_FEN, RuBiomes.FUNGAL_FEN, RuBiomes.FUNGAL_FEN}};



        if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
            return PRIMARY_SWAMP_BIOMES_CUSTOM;
        }
        else{
            return PRIMARY_SWAMP_BIOMES;
        }
    }
    public static ResourceKey<Biome>[][] getPrimaryOceanBiome(){
        ResourceKey<Biome>[][] PRIMARY_OCEAN_BIOMES_CUSTOM = new ResourceKey[][]{
                /*DEEP*/    {getBiome(RegionsUnexploredPrimaryRegionConfig.OCA_DEP_ICY.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.OCA_DEP_COOL.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.OCA_DEP_NEUTRAL.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.OCA_DEP_WARM.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.OCA_DEP_HOT.get())},
                /*NORM*/    {getBiome(RegionsUnexploredPrimaryRegionConfig.OCA_ICY.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.OCA_COOL.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.OCA_NEUTRAL.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.OCA_WARM.get()), getBiome(RegionsUnexploredPrimaryRegionConfig.OCA_HOT.get())}};


        ResourceKey<Biome>[][] PRIMARY_OCEAN_BIOMES = new ResourceKey[][]{
                //-----------ARID,DRY,NEUTRAL,WET,HUMID
                /*DEEP*/     {RuBiomes.HYACINTH_DEEPS, Biomes.DEEP_COLD_OCEAN, Biomes.DEEP_OCEAN, Biomes.DEEP_LUKEWARM_OCEAN, Biomes.WARM_OCEAN},
                /*NORM*/    {Biomes.FROZEN_OCEAN, Biomes.COLD_OCEAN, Biomes.OCEAN, Biomes.LUKEWARM_OCEAN, RuBiomes.ROCKY_REEF}};



        if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
            return PRIMARY_OCEAN_BIOMES_CUSTOM;
        }
        else{
            return PRIMARY_OCEAN_BIOMES;
        }
    }
    public static ResourceKey<Biome> getPrimaryIslandBiome(int temperature){
        if(temperature==0){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredPrimaryRegionConfig.ICY_ISLAND.get());
            }
            else{
                return RuBiomes.ALPHA_GROVE;
            }
        }
        else if(temperature==1){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredPrimaryRegionConfig.COOL_ISLAND.get());
            }
            else{
                return RuBiomes.SMOULDERING_WOODLAND;
            }
        }
        else if(temperature==2){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredPrimaryRegionConfig.NEUTRAL_ISLAND.get());
            }
            else{
                return RuBiomes.SMOULDERING_WOODLAND;
            }
        }
        else if(temperature==3){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredPrimaryRegionConfig.WARM_ISLAND.get());
            }
            else{
                return RuBiomes.TROPICS;
            }
        }
        else {
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredPrimaryRegionConfig.HOT_ISLAND.get());
            }
            else{
                return RuBiomes.TROPICS;
            }
        }
    }
    public static ResourceKey<Biome> getPrimaryBeachBiome(int temperature){
        if(temperature==0){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredPrimaryRegionConfig.ICY_BEACH.get());
            }
            else{
                return Biomes.SNOWY_BEACH;
            }
        }
        else if(temperature==1){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredPrimaryRegionConfig.COOL_BEACH.get());
            }
            else{
                return RuBiomes.GRAVEL_BEACH;
            }
        }
        else if(temperature==2){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredPrimaryRegionConfig.NEUTRAL_BEACH.get());
            }
            else{
                return RuBiomes.GRASSY_BEACH;
            }
        }
        else if(temperature==3){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredPrimaryRegionConfig.WARM_BEACH.get());
            }
            else{
                return RuBiomes.GRASSY_BEACH;
            }
        }
        else {
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredPrimaryRegionConfig.HOT_BEACH.get());
            }
            else{
                return Biomes.BEACH;
            }
        }
    }
    public static ResourceKey<Biome> getPrimaryStoneShoreBiome(boolean isCold){
        if(isCold){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredPrimaryRegionConfig.COLD_STONE_BEACH.get());
            }
            else{
                return Biomes.STONY_SHORE;
            }
        }
        else{
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredPrimaryRegionConfig.HOT_STONE_BEACH.get());
            }
            else{
                return RuBiomes.CHALK_CLIFFS;
            }
        }
    }
    public static ResourceKey<Biome> getPrimaryShatteredCliffBiome(){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredPrimaryRegionConfig.SHA_CLI.get());
            }
            else{
                return RuBiomes.TOWERING_CLIFFS;
            }
    }
    public static ResourceKey<Biome> getPrimaryCaveBiome(int type){
        if(type==1){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredPrimaryRegionConfig.CAVE_1.get());
            }
            else{
                return Biomes.LUSH_CAVES;
            }
        }
        else if(type==2){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredPrimaryRegionConfig.CAVE_2.get());
            }
            else{
                return Biomes.DRIPSTONE_CAVES;
            }
        }
        else if(type==3){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredPrimaryRegionConfig.CAVE_3.get());
            }
            else{
                return Biomes.DEEP_DARK;
            }
        }
        else if(type==4){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredPrimaryRegionConfig.CAVE_4.get());
            }
            else{
                return RuBiomes.BIOSHROOM_CAVES;
            }
        }
        else if(type==5){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredPrimaryRegionConfig.CAVE_5.get());
            }
            else{
                return RuBiomes.LUSH_DELTA;
            }
        }
        else if(type==6){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredPrimaryRegionConfig.CAVE_6.get());
            }
            else{
                return RuBiomes.PRISMACHASM;
            }
        }
        else if(type==7){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredPrimaryRegionConfig.CAVE_7.get());
            }
            else{
                return RuBiomes.REDSTONE_CAVES;
            }
        }
        else {
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredPrimaryRegionConfig.CAVE_8.get());
            }
            else{
                return RuBiomes.SCORCHING_CAVES;
            }
        }
    }
    public static ResourceKey<Biome> getPrimaryPeakBiome(int temperature){
        if(temperature==0){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredPrimaryRegionConfig.ICY_PEAK.get());
            }
            else{
                return Biomes.FROZEN_PEAKS;
            }
        }
        else if(temperature==1){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredPrimaryRegionConfig.COOL_PEAK.get());
            }
            else{
                return Biomes.JAGGED_PEAKS;
            }
        }
        else if(temperature==2){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredPrimaryRegionConfig.NEUTRAL_PEAK.get());
            }
            else{
                return RuBiomes.MOUNTAINS;
            }
        }
        else if(temperature==3){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredPrimaryRegionConfig.WARM_PEAK.get());
            }
            else{
                return Biomes.STONY_PEAKS;
            }
        }
        else {
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredPrimaryRegionConfig.HOT_PEAK.get());
            }
            else{
                return RuBiomes.ARID_MOUNTAINS;
            }
        }
    }
    public static ResourceKey<Biome> getPrimaryPeakBiomeVariant(int temperature){
        if(temperature==0){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredPrimaryRegionConfig.ICY_PEAK_VAR.get());
            }
            else{
                return Biomes.JAGGED_PEAKS;
            }
        }
        else if(temperature==1){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredPrimaryRegionConfig.COOL_PEAK_VAR.get());
            }
            else{
                return RuBiomes.MOUNTAINS;
            }
        }
        else if(temperature==2){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredPrimaryRegionConfig.NEUTRAL_PEAK_VAR.get());
            }
            else{
                return RuBiomes.MOUNTAINS;
            }
        }
        else if(temperature==3){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredPrimaryRegionConfig.WARM_PEAK_VAR.get());
            }
            else{
                return Biomes.STONY_PEAKS;
            }
        }
        else {
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredPrimaryRegionConfig.HOT_PEAK_VAR.get());
            }
            else{
                return RuBiomes.ARID_MOUNTAINS;
            }
        }
    }
    public static ResourceKey<Biome> getPrimarySlopeBiome(int temperature){
        if(temperature==0){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredPrimaryRegionConfig.ICY_SLOPE.get());
            }
            else{
                return Biomes.SNOWY_SLOPES;
            }
        }
        else if(temperature==1){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredPrimaryRegionConfig.COOL_SLOPE.get());
            }
            else{
                return RuBiomes.PINE_SLOPES;
            }
        }
        else if(temperature==2){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredPrimaryRegionConfig.NEUTRAL_SLOPE.get());
            }
            else{
                return RuBiomes.PINE_SLOPES;
            }
        }
        else if(temperature==3){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredPrimaryRegionConfig.WARM_SLOPE.get());
            }
            else{
                return RuBiomes.DECIDUOUS_FOREST;
            }
        }
        else {
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredPrimaryRegionConfig.HOT_SLOPE.get());
            }
            else{
                return RuBiomes.RAINFOREST;
            }
        }
    }
    public static ResourceKey<Biome> getPrimarySlopeBiomeVariant(int temperature){
        if(temperature==0){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredPrimaryRegionConfig.ICY_SLOPE_VAR.get());
            }
            else{
                return RuBiomes.COLD_DECIDUOUS_FOREST;
            }
        }
        else if(temperature==1){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredPrimaryRegionConfig.COOL_SLOPE_VAR.get());
            }
            else{
                return RuBiomes.PINE_SLOPES;
            }
        }
        else if(temperature==2){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredPrimaryRegionConfig.NEUTRAL_SLOPE_VAR.get());
            }
            else{
                return RuBiomes.PINE_SLOPES;
            }
        }
        else if(temperature==3){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredPrimaryRegionConfig.WARM_SLOPE_VAR.get());
            }
            else{
                return RuBiomes.DECIDUOUS_FOREST;
            }
        }
        else {
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredPrimaryRegionConfig.HOT_SLOPE_VAR.get());
            }
            else{
                return RuBiomes.RAINFOREST;
            }
        }
    }
    //SECONDARY_REGION
    public static ResourceKey<Biome>[][] getSecondaryMiddleBiome(){
        ResourceKey<Biome>[][] SECONDARY_MIDDLE_BIOMES_CUSTOM = new ResourceKey[][]{
                //-----------ARID,DRY,NEUTRAL,WET,HUMID
                /*ICY*/     {getBiome(RegionsUnexploredSecondaryRegionConfig.MID_ICY_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_ICY_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_ICY_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_ICY_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_ICY_HUMID.get())},
                /*COOL*/    {getBiome(RegionsUnexploredSecondaryRegionConfig.MID_COOL_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_COOL_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_COOL_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_COOL_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_COOL_HUMID.get())},
                /*NEUTRAL*/ {getBiome(RegionsUnexploredSecondaryRegionConfig.MID_NEUTRAL_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_NEUTRAL_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_NEUTRAL_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_NEUTRAL_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_NEUTRAL_HUMID.get())},
                /*WARM*/    {getBiome(RegionsUnexploredSecondaryRegionConfig.MID_WARM_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_WARM_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_WARM_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_WARM_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_WARM_HUMID.get())},
                /*HOT*/     {getBiome(RegionsUnexploredSecondaryRegionConfig.MID_HOT_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_HOT_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_HOT_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_HOT_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_HOT_HUMID.get())}};

        ResourceKey<Biome>[][] SECONDARY_MIDDLE_BIOMES = new ResourceKey[][]{
                //-----------ARID,DRY,NEUTRAL,WET,HUMID
                /*ICY*/     {RuBiomes.ICY_DESERT, RuBiomes.FROZEN_TUNDRA, RuBiomes.FROZEN_FOREST, RuBiomes.COLD_BOREAL_FOREST, RuBiomes.COLD_BOREAL_FOREST},
                /*COOL*/    {RuBiomes.POPPY_FIELDS, RuBiomes.AUTUMNAL_MAPLE_FOREST, RuBiomes.MAPLE_FOREST, RuBiomes.MAPLE_FOREST, RuBiomes.BOREAL_FOREST},
                /*NEUTRAL*/ {RuBiomes.MAUVE_HILLS, RuBiomes.MEADOW, RuBiomes.CHERRY_HILLS, RuBiomes.LUPINE_PLAINS, RuBiomes.BLACKWOOD_FOREST},
                /*WARM*/    {RuBiomes.WILLOW_FOREST, RuBiomes.MEADOW, RuBiomes.BAMBOO_FOREST, RuBiomes.REDWOODS, RuBiomes.REDWOODS},
                /*HOT*/     {RuBiomes.DRY_BUSHLAND, RuBiomes.DRY_BUSHLAND, RuBiomes.GRASSLAND, RuBiomes.OUTBACK, RuBiomes.EUCALYPTUS_FOREST}};



        if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
            return SECONDARY_MIDDLE_BIOMES_CUSTOM;
        }
        else{
            return SECONDARY_MIDDLE_BIOMES;
        }
    }
    public static ResourceKey<Biome>[][] getSecondaryMiddleBiomeVariant(){
        ResourceKey<Biome>[][] SECONDARY_MIDDLE_BIOMES_VARIANT_CUSTOM = new ResourceKey[][]{
                //-----------ARID,DRY,NEUTRAL,WET,HUMID
                /*ICY*/     {getBiome(RegionsUnexploredSecondaryRegionConfig.MID_VAR_ICY_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_VAR_ICY_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_VAR_ICY_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_VAR_ICY_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_VAR_ICY_HUMID.get())},
                /*COOL*/    {getBiome(RegionsUnexploredSecondaryRegionConfig.MID_VAR_COOL_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_VAR_COOL_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_VAR_COOL_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_VAR_COOL_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_VAR_COOL_HUMID.get())},
                /*NEUTRAL*/ {getBiome(RegionsUnexploredSecondaryRegionConfig.MID_VAR_NEUTRAL_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_VAR_NEUTRAL_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_VAR_NEUTRAL_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_VAR_NEUTRAL_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_VAR_NEUTRAL_HUMID.get())},
                /*WARM*/    {getBiome(RegionsUnexploredSecondaryRegionConfig.MID_VAR_WARM_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_VAR_WARM_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_VAR_WARM_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_VAR_WARM_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_VAR_WARM_HUMID.get())},
                /*HOT*/     {getBiome(RegionsUnexploredSecondaryRegionConfig.MID_VAR_HOT_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_VAR_HOT_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_VAR_HOT_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_VAR_HOT_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.MID_VAR_HOT_HUMID.get())}};


        ResourceKey<Biome>[][] SECONDARY_MIDDLE_BIOMES_VARIANT = new ResourceKey[][]{
                //-----------ARID,DRY,NEUTRAL,WET,HUMID
                /*ICY*/     {RuBiomes.ICY_DESERT, RuBiomes.FROZEN_TUNDRA, RuBiomes.FROZEN_TUNDRA, RuBiomes.COLD_BOREAL_FOREST, RuBiomes.SPIRES},
                /*COOL*/    {RuBiomes.AUTUMNAL_MAPLE_FOREST, RuBiomes.SILVER_BIRCH_FOREST, RuBiomes.MAPLE_FOREST, RuBiomes.BOREAL_FOREST, RuBiomes.GOLDEN_BOREAL_FOREST},
                /*NEUTRAL*/ {RuBiomes.MAUVE_HILLS, RuBiomes.MEADOW, RuBiomes.CHERRY_HILLS, RuBiomes.LUPINE_PLAINS, RuBiomes.BLACKWOOD_FOREST},
                /*WARM*/    {RuBiomes.WILLOW_FOREST, RuBiomes.MEADOW, RuBiomes.BAMBOO_FOREST, RuBiomes.FLOWER_FIELD, RuBiomes.SPARSE_REDWOODS},
                /*HOT*/     {RuBiomes.DRY_BUSHLAND, RuBiomes.DRY_BUSHLAND, RuBiomes.OUTBACK, RuBiomes.OUTBACK, RuBiomes.EUCALYPTUS_FOREST}};



        if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
            return SECONDARY_MIDDLE_BIOMES_VARIANT_CUSTOM;
        }
        else{
            return SECONDARY_MIDDLE_BIOMES_VARIANT;
        }
    }
    public static ResourceKey<Biome>[][] getSecondaryPlateauBiome(){
        ResourceKey<Biome>[][] SECONDARY_PLATEAU_BIOMES_CUSTOM = new ResourceKey[][]{
                //-----------ARID,DRY,NEUTRAL,WET,HUMID
                /*ICY*/     {getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_ICY_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_ICY_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_ICY_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_ICY_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_ICY_HUMID.get())},
                /*COOL*/    {getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_COOL_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_COOL_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_COOL_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_COOL_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_COOL_HUMID.get())},
                /*NEUTRAL*/ {getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_NEUTRAL_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_NEUTRAL_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_NEUTRAL_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_NEUTRAL_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_NEUTRAL_HUMID.get())},
                /*WARM*/    {getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_WARM_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_WARM_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_WARM_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_WARM_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_WARM_HUMID.get())},
                /*HOT*/     {getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_HOT_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_HOT_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_HOT_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_HOT_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_HOT_HUMID.get())}};


        ResourceKey<Biome>[][] SECONDARY_PLATEAU_BIOMES = new ResourceKey[][]{
                //-----------ARID,DRY,NEUTRAL,WET,HUMID
                /*ICY*/     {RuBiomes.ICY_HEIGHTS, RuBiomes.ICY_HEIGHTS, RuBiomes.ICY_HEIGHTS, RuBiomes.ICY_HEIGHTS, RuBiomes.COLD_BOREAL_FOREST},
                /*COOL*/    {RuBiomes.POPPY_FIELDS, RuBiomes.AUTUMNAL_MAPLE_FOREST, RuBiomes.MAPLE_FOREST, RuBiomes.BOREAL_FOREST, RuBiomes.BOREAL_FOREST},
                /*NEUTRAL*/ {RuBiomes.HIGHLAND_FIELDS, RuBiomes.HIGHLAND_FIELDS, RuBiomes.HIGHLAND_FIELDS, RuBiomes.HIGHLAND_FIELDS, RuBiomes.BLACKWOOD_FOREST},
                /*WARM*/    {RuBiomes.CHERRY_HILLS, RuBiomes.CHERRY_HILLS, RuBiomes.CHERRY_HILLS, RuBiomes.CHERRY_HILLS, RuBiomes.REDWOODS},
                /*HOT*/     {RuBiomes.STEPPE, RuBiomes.STEPPE, RuBiomes.STEPPE, RuBiomes.EUCALYPTUS_FOREST, RuBiomes.EUCALYPTUS_FOREST}};



        if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
            return SECONDARY_PLATEAU_BIOMES_CUSTOM;
        }
        else{
            return SECONDARY_PLATEAU_BIOMES;
        }
    }
    public static ResourceKey<Biome>[][] getSecondaryPlateauBiomeVariant(){
        ResourceKey<Biome>[][] SECONDARY_PLATEAU_BIOMES_VARIANT_CUSTOM = new ResourceKey[][]{
                //-----------ARID,DRY,NEUTRAL,WET,HUMID
                /*ICY*/     {getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_VAR_ICY_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_VAR_ICY_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_VAR_ICY_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_VAR_ICY_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_VAR_ICY_HUMID.get())},
                /*COOL*/    {getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_VAR_COOL_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_VAR_COOL_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_VAR_COOL_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_VAR_COOL_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_VAR_COOL_HUMID.get())},
                /*NEUTRAL*/ {getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_VAR_NEUTRAL_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_VAR_NEUTRAL_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_VAR_NEUTRAL_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_VAR_NEUTRAL_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_VAR_NEUTRAL_HUMID.get())},
                /*WARM*/    {getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_VAR_WARM_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_VAR_WARM_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_VAR_WARM_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_VAR_WARM_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_VAR_WARM_HUMID.get())},
                /*HOT*/     {getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_VAR_HOT_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_VAR_HOT_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_VAR_HOT_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_VAR_HOT_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.PLT_VAR_HOT_HUMID.get())}};


        ResourceKey<Biome>[][] SECONDARY_PLATEAU_BIOMES_VARIANT = new ResourceKey[][]{
                //-----------ARID,DRY,NEUTRAL,WET,HUMID
                /*ICY*/     {RuBiomes.ICY_HEIGHTS, RuBiomes.ICY_HEIGHTS, RuBiomes.ICY_HEIGHTS, RuBiomes.ICY_HEIGHTS, RuBiomes.SPIRES},
                /*COOL*/    {RuBiomes.AUTUMNAL_MAPLE_FOREST, RuBiomes.AUTUMNAL_MAPLE_FOREST, RuBiomes.MAPLE_FOREST, RuBiomes.BOREAL_FOREST, RuBiomes.GOLDEN_BOREAL_FOREST},
                /*NEUTRAL*/ {RuBiomes.HIGHLAND_FIELDS, RuBiomes.CHERRY_HILLS, RuBiomes.CHERRY_HILLS, RuBiomes.CHERRY_HILLS, RuBiomes.BLACKWOOD_FOREST},
                /*WARM*/    {RuBiomes.CHERRY_HILLS, RuBiomes.CHERRY_HILLS, RuBiomes.CHERRY_HILLS, RuBiomes.FLOWER_FIELD, RuBiomes.SPARSE_REDWOODS},
                /*HOT*/     {RuBiomes.STEPPE, RuBiomes.STEPPE, RuBiomes.STEPPE, RuBiomes.EUCALYPTUS_FOREST, RuBiomes.EUCALYPTUS_FOREST}};



        if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
            return SECONDARY_PLATEAU_BIOMES_VARIANT_CUSTOM;
        }
        else{
            return SECONDARY_PLATEAU_BIOMES_VARIANT;
        }
    }
    public static ResourceKey<Biome>[][] getSecondaryShatteredBiome(){
        ResourceKey<Biome>[][] SECONDARY_SHATTERED_BIOMES_CUSTOM = new ResourceKey[][]{
                //-----------ARID,DRY,NEUTRAL,WET,HUMID
                /*ICY*/     {getBiome(RegionsUnexploredSecondaryRegionConfig.SHT_ICY_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SHT_ICY_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SHT_ICY_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SHT_ICY_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SHT_ICY_HUMID.get())},
                /*COOL*/    {getBiome(RegionsUnexploredSecondaryRegionConfig.SHT_COOL_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SHT_COOL_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SHT_COOL_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SHT_COOL_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SHT_COOL_HUMID.get())},
                /*NEUTRAL*/ {getBiome(RegionsUnexploredSecondaryRegionConfig.SHT_NEUTRAL_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SHT_NEUTRAL_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SHT_NEUTRAL_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SHT_NEUTRAL_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SHT_NEUTRAL_HUMID.get())},
                /*WARM*/    {getBiome(RegionsUnexploredSecondaryRegionConfig.SHT_WARM_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SHT_WARM_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SHT_WARM_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SHT_WARM_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SHT_WARM_HUMID.get())},
                /*HOT*/     {getBiome(RegionsUnexploredSecondaryRegionConfig.SHT_HOT_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SHT_HOT_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SHT_HOT_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SHT_HOT_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.SHT_HOT_HUMID.get())}};


        ResourceKey<Biome>[][] SECONDARY_SHATTERED_BIOMES = new ResourceKey[][]{
                //-----------ARID,DRY,NEUTRAL,WET,HUMID
                /*ICY*/     {RuBiomes.ICY_HEIGHTS, RuBiomes.ICY_HEIGHTS, RuBiomes.ICY_HEIGHTS, RuBiomes.ICY_HEIGHTS, RuBiomes.ICY_HEIGHTS},
                /*COOL*/    {RuBiomes.TOWERING_CLIFFS, RuBiomes.TOWERING_CLIFFS, RuBiomes.TOWERING_CLIFFS, RuBiomes.TOWERING_CLIFFS, RuBiomes.TOWERING_CLIFFS},
                /*NEUTRAL*/ {RuBiomes.LUSH_HILLS, RuBiomes.LUSH_HILLS, RuBiomes.LUSH_HILLS, RuBiomes.LUSH_HILLS, RuBiomes.LUSH_HILLS},
                /*WARM*/    {RuBiomes.MEADOW, RuBiomes.MEADOW, RuBiomes.BAMBOO_FOREST, RuBiomes.SPARSE_REDWOODS, RuBiomes.SPARSE_REDWOODS},
                /*HOT*/     {RuBiomes.STEPPE, RuBiomes.STEPPE, RuBiomes.OUTBACK, RuBiomes.OUTBACK, RuBiomes.EUCALYPTUS_FOREST}};



        if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
            return SECONDARY_SHATTERED_BIOMES_CUSTOM;
        }
        else{
            return SECONDARY_SHATTERED_BIOMES;
        }
    }
    public static ResourceKey<Biome>[][] getSecondaryRiverBiome(){
        ResourceKey<Biome>[][] SECONDARY_RIVER_BIOMES_CUSTOM = new ResourceKey[][]{
                //-----------ARID,DRY,NEUTRAL,WET,HUMID
                /*ICY*/     {getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_ICY_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_ICY_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_ICY_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_ICY_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_ICY_HUMID.get())},
                /*COOL*/    {getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_COOL_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_COOL_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_COOL_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_COOL_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_COOL_HUMID.get())},
                /*NEUTRAL*/ {getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_NEUTRAL_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_NEUTRAL_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_NEUTRAL_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_NEUTRAL_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_NEUTRAL_HUMID.get())},
                /*WARM*/    {getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_WARM_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_WARM_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_WARM_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_WARM_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_WARM_HUMID.get())},
                /*HOT*/     {getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_HOT_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_HOT_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_HOT_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_HOT_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_HOT_HUMID.get())}};


        ResourceKey<Biome>[][] SECONDARY_RIVER_BIOMES = new ResourceKey[][]{
                //-----------ARID,DRY,NEUTRAL,WET,HUMID
                /*ICY*/     {Biomes.FROZEN_RIVER, Biomes.FROZEN_RIVER, Biomes.FROZEN_RIVER, Biomes.FROZEN_RIVER, Biomes.FROZEN_RIVER},
                /*COOL*/    {RuBiomes.COLD_RIVER, RuBiomes.COLD_RIVER, RuBiomes.COLD_RIVER, RuBiomes.COLD_RIVER, RuBiomes.COLD_RIVER},
                /*NEUTRAL*/ {RuBiomes.MUDDY_RIVER, RuBiomes.MUDDY_RIVER, RuBiomes.MUDDY_RIVER, RuBiomes.MUDDY_RIVER, RuBiomes.BLACKWOOD_FOREST},
                /*WARM*/    {RuBiomes.MUDDY_RIVER, RuBiomes.MUDDY_RIVER, RuBiomes.MUDDY_RIVER, RuBiomes.MUDDY_RIVER, RuBiomes.MUDDY_RIVER},
                /*HOT*/     {RuBiomes.MUDDY_RIVER, RuBiomes.MUDDY_RIVER, RuBiomes.MUDDY_RIVER, RuBiomes.MUDDY_RIVER, RuBiomes.MUDDY_RIVER}};



        if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
            return SECONDARY_RIVER_BIOMES_CUSTOM;
        }
        else{
            return SECONDARY_RIVER_BIOMES;
        }
    }
    public static ResourceKey<Biome>[][] getSecondaryRiverBiomeVariant(){
        ResourceKey<Biome>[][] SECONDARY_RIVER_BIOMES_VARIANT_CUSTOM = new ResourceKey[][]{
                //-----------ARID,DRY,NEUTRAL,WET,HUMID
                /*ICY*/     {getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_ICY_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_ICY_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_ICY_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_ICY_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_ICY_HUMID.get())},
                /*COOL*/    {getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_COOL_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_COOL_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_COOL_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_COOL_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_COOL_HUMID.get())},
                /*NEUTRAL*/ {getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_NEUTRAL_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_NEUTRAL_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_NEUTRAL_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_NEUTRAL_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_NEUTRAL_HUMID.get())},
                /*WARM*/    {getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_WARM_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_WARM_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_WARM_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_WARM_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_WARM_HUMID.get())},
                /*HOT*/     {getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_HOT_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_HOT_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_HOT_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_HOT_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_HOT_HUMID.get())}};


        ResourceKey<Biome>[][] SECONDARY_RIVER_BIOMES_VARIANT = new ResourceKey[][]{
                //-----------ARID,DRY,NEUTRAL,WET,HUMID
                /*ICY*/     {Biomes.FROZEN_RIVER, Biomes.FROZEN_RIVER, Biomes.FROZEN_RIVER, Biomes.FROZEN_RIVER, Biomes.FROZEN_RIVER},
                /*COOL*/    {RuBiomes.COLD_RIVER, RuBiomes.COLD_RIVER, RuBiomes.COLD_RIVER, RuBiomes.COLD_RIVER, RuBiomes.COLD_RIVER},
                /*NEUTRAL*/ {RuBiomes.MUDDY_RIVER, RuBiomes.MUDDY_RIVER, RuBiomes.MUDDY_RIVER, RuBiomes.MUDDY_RIVER, RuBiomes.BLACKWOOD_FOREST},
                /*WARM*/    {RuBiomes.MUDDY_RIVER, RuBiomes.MUDDY_RIVER, RuBiomes.MUDDY_RIVER, RuBiomes.MUDDY_RIVER, RuBiomes.MUDDY_RIVER},
                /*HOT*/     {RuBiomes.MUDDY_RIVER, RuBiomes.MUDDY_RIVER, RuBiomes.MUDDY_RIVER, RuBiomes.MUDDY_RIVER, RuBiomes.MUDDY_RIVER}};



        if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
            return SECONDARY_RIVER_BIOMES_VARIANT_CUSTOM;
        }
        else{
            return SECONDARY_RIVER_BIOMES_VARIANT;
        }
    }
    public static ResourceKey<Biome>[][] getSecondarySwampBiome(){
        ResourceKey<Biome>[][] SECONDARY_SWAMP_BIOMES_CUSTOM = new ResourceKey[][]{
                //-----------ARID,DRY,NEUTRAL,WET,HUMID
                /*ICY*/     {getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_ICY_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_ICY_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_ICY_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_ICY_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_ICY_HUMID.get())},
                /*COOL*/    {getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_COOL_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_COOL_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_COOL_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_COOL_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_COOL_HUMID.get())},
                /*NEUTRAL*/ {getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_NEUTRAL_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_NEUTRAL_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_NEUTRAL_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_NEUTRAL_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_NEUTRAL_HUMID.get())},
                /*WARM*/    {getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_WARM_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_WARM_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_WARM_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_WARM_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_WARM_HUMID.get())},
                /*HOT*/     {getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_HOT_ARID.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_HOT_DRY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_HOT_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_HOT_WET.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.RVR_HOT_HUMID.get())}};


        ResourceKey<Biome>[][] SECONDARY_SWAMP_BIOMES = new ResourceKey[][]{
                //-----------ARID,DRY,NEUTRAL,WET,HUMID
                /*ICY*/     {RuBiomes.SPIRES, RuBiomes.SPIRES, RuBiomes.SPIRES, RuBiomes.SPIRES, RuBiomes.SPIRES},
                /*COOL*/    {RuBiomes.FEN, RuBiomes.FEN, RuBiomes.FEN, RuBiomes.FEN, RuBiomes.FEN},
                /*NEUTRAL*/ {RuBiomes.BAYOU, RuBiomes.BAYOU, RuBiomes.BAYOU, RuBiomes.GIANT_BAYOU, RuBiomes.GIANT_BAYOU},
                /*WARM*/    {RuBiomes.FLOODED_PLAINS, RuBiomes.FLOODED_PLAINS, RuBiomes.FLOODED_PLAINS, RuBiomes.GIANT_BAYOU, RuBiomes.GIANT_BAYOU},
                /*HOT*/     {RuBiomes.FUNGAL_FEN, RuBiomes.FUNGAL_FEN, RuBiomes.FUNGAL_FEN, RuBiomes.FUNGAL_FEN, RuBiomes.FUNGAL_FEN}};



        if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
            return SECONDARY_SWAMP_BIOMES_CUSTOM;
        }
        else{
            return SECONDARY_SWAMP_BIOMES;
        }
    }
    public static ResourceKey<Biome>[][] getSecondaryOceanBiome(){
        ResourceKey<Biome>[][] SECONDARY_OCEAN_BIOMES_CUSTOM = new ResourceKey[][]{
                /*DEEP*/    {getBiome(RegionsUnexploredSecondaryRegionConfig.OCA_DEP_ICY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.OCA_DEP_COOL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.OCA_DEP_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.OCA_DEP_WARM.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.OCA_DEP_HOT.get())},
                /*NORM*/    {getBiome(RegionsUnexploredSecondaryRegionConfig.OCA_ICY.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.OCA_COOL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.OCA_NEUTRAL.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.OCA_WARM.get()), getBiome(RegionsUnexploredSecondaryRegionConfig.OCA_HOT.get())}};


        ResourceKey<Biome>[][] SECONDARY_OCEAN_BIOMES = new ResourceKey[][]{
                //-----------ARID,DRY,NEUTRAL,WET,HUMID
                /*DEEP*/     {RuBiomes.HYACINTH_DEEPS, Biomes.DEEP_COLD_OCEAN, Biomes.DEEP_OCEAN, Biomes.DEEP_LUKEWARM_OCEAN, Biomes.WARM_OCEAN},
                /*NORM*/    {Biomes.FROZEN_OCEAN, Biomes.COLD_OCEAN, Biomes.OCEAN, Biomes.LUKEWARM_OCEAN, RuBiomes.ROCKY_REEF}};



        if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
            return SECONDARY_OCEAN_BIOMES_CUSTOM;
        }
        else{
            return SECONDARY_OCEAN_BIOMES;
        }
    }
    public static ResourceKey<Biome> getSecondaryIslandBiome(int temperature){
        if(temperature==0){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredSecondaryRegionConfig.ICY_ISLAND.get());
            }
            else{
                return RuBiomes.ALPHA_GROVE;
            }
        }
        else if(temperature==1){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredSecondaryRegionConfig.COOL_ISLAND.get());
            }
            else{
                return RuBiomes.SMOULDERING_WOODLAND;
            }
        }
        else if(temperature==2){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredSecondaryRegionConfig.NEUTRAL_ISLAND.get());
            }
            else{
                return RuBiomes.SMOULDERING_WOODLAND;
            }
        }
        else if(temperature==3){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredSecondaryRegionConfig.WARM_ISLAND.get());
            }
            else{
                return RuBiomes.TROPICS;
            }
        }
        else {
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredSecondaryRegionConfig.HOT_ISLAND.get());
            }
            else{
                return RuBiomes.TROPICS;
            }
        }
    }
    public static ResourceKey<Biome> getSecondaryBeachBiome(int temperature){
        if(temperature==0){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredSecondaryRegionConfig.ICY_BEACH.get());
            }
            else{
                return Biomes.SNOWY_BEACH;
            }
        }
        else if(temperature==1){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredSecondaryRegionConfig.COOL_BEACH.get());
            }
            else{
                return RuBiomes.GRAVEL_BEACH;
            }
        }
        else if(temperature==2){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredSecondaryRegionConfig.NEUTRAL_BEACH.get());
            }
            else{
                return RuBiomes.GRASSY_BEACH;
            }
        }
        else if(temperature==3){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredSecondaryRegionConfig.WARM_BEACH.get());
            }
            else{
                return RuBiomes.GRASSY_BEACH;
            }
        }
        else {
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredSecondaryRegionConfig.HOT_BEACH.get());
            }
            else{
                return Biomes.BEACH;
            }
        }
    }
    public static ResourceKey<Biome> getSecondaryStoneShoreBiome(boolean isCold){
        if(isCold){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredSecondaryRegionConfig.COLD_STONE_BEACH.get());
            }
            else{
                return Biomes.STONY_SHORE;
            }
        }
        else{
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredSecondaryRegionConfig.HOT_STONE_BEACH.get());
            }
            else{
                return RuBiomes.CHALK_CLIFFS;
            }
        }
    }
    public static ResourceKey<Biome> getSecondaryShatteredCliffBiome(){
        if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
            return getBiome(RegionsUnexploredSecondaryRegionConfig.SHA_CLI.get());
        }
        else{
            return RuBiomes.TOWERING_CLIFFS;
        }
    }
    public static ResourceKey<Biome> getSecondaryCaveBiome(int type){
        if(type==1){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredSecondaryRegionConfig.CAVE_1.get());
            }
            else{
                return Biomes.LUSH_CAVES;
            }
        }
        else if(type==2){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredSecondaryRegionConfig.CAVE_2.get());
            }
            else{
                return Biomes.DRIPSTONE_CAVES;
            }
        }
        else if(type==3){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredSecondaryRegionConfig.CAVE_3.get());
            }
            else{
                return Biomes.DEEP_DARK;
            }
        }
        else if(type==4){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredSecondaryRegionConfig.CAVE_4.get());
            }
            else{
                return RuBiomes.BIOSHROOM_CAVES;
            }
        }
        else if(type==5){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredSecondaryRegionConfig.CAVE_5.get());
            }
            else{
                return RuBiomes.LUSH_DELTA;
            }
        }
        else if(type==6){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredSecondaryRegionConfig.CAVE_6.get());
            }
            else{
                return RuBiomes.PRISMACHASM;
            }
        }
        else if(type==7){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredSecondaryRegionConfig.CAVE_7.get());
            }
            else{
                return RuBiomes.REDSTONE_CAVES;
            }
        }
        else {
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredSecondaryRegionConfig.CAVE_8.get());
            }
            else{
                return RuBiomes.SCORCHING_CAVES;
            }
        }
    }
    public static ResourceKey<Biome> getSecondaryPeakBiome(int temperature){
        if(temperature==0){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredSecondaryRegionConfig.ICY_PEAK.get());
            }
            else{
                return Biomes.FROZEN_PEAKS;
            }
        }
        else if(temperature==1){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredSecondaryRegionConfig.COOL_PEAK.get());
            }
            else{
                return Biomes.JAGGED_PEAKS;
            }
        }
        else if(temperature==2){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredSecondaryRegionConfig.NEUTRAL_PEAK.get());
            }
            else{
                return RuBiomes.MOUNTAINS;
            }
        }
        else if(temperature==3){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredSecondaryRegionConfig.WARM_PEAK.get());
            }
            else{
                return Biomes.STONY_PEAKS;
            }
        }
        else {
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredSecondaryRegionConfig.HOT_PEAK.get());
            }
            else{
                return RuBiomes.ARID_MOUNTAINS;
            }
        }
    }
    public static ResourceKey<Biome> getSecondaryPeakBiomeVariant(int temperature){
        if(temperature==0){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredSecondaryRegionConfig.ICY_PEAK_VAR.get());
            }
            else{
                return Biomes.JAGGED_PEAKS;
            }
        }
        else if(temperature==1){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredSecondaryRegionConfig.COOL_PEAK_VAR.get());
            }
            else{
                return RuBiomes.MOUNTAINS;
            }
        }
        else if(temperature==2){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredSecondaryRegionConfig.NEUTRAL_PEAK_VAR.get());
            }
            else{
                return RuBiomes.MOUNTAINS;
            }
        }
        else if(temperature==3){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredSecondaryRegionConfig.WARM_PEAK_VAR.get());
            }
            else{
                return Biomes.STONY_PEAKS;
            }
        }
        else {
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredSecondaryRegionConfig.HOT_PEAK_VAR.get());
            }
            else{
                return RuBiomes.ARID_MOUNTAINS;
            }
        }
    }
    public static ResourceKey<Biome> getSecondarySlopeBiome(int temperature){
        if(temperature==0){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredSecondaryRegionConfig.ICY_SLOPE.get());
            }
            else{
                return Biomes.SNOWY_SLOPES;
            }
        }
        else if(temperature==1){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredSecondaryRegionConfig.COOL_SLOPE.get());
            }
            else{
                return RuBiomes.PINE_SLOPES;
            }
        }
        else if(temperature==2){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredSecondaryRegionConfig.NEUTRAL_SLOPE.get());
            }
            else{
                return RuBiomes.PINE_SLOPES;
            }
        }
        else if(temperature==3){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredSecondaryRegionConfig.WARM_SLOPE.get());
            }
            else{
                return RuBiomes.CHERRY_HILLS;
            }
        }
        else {
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredSecondaryRegionConfig.HOT_SLOPE.get());
            }
            else{
                return RuBiomes.EUCALYPTUS_FOREST;
            }
        }
    }
    public static ResourceKey<Biome> getSecondarySlopeBiomeVariant(int temperature){
        if(temperature==0){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredSecondaryRegionConfig.ICY_SLOPE_VAR.get());
            }
            else{
                return RuBiomes.COLD_DECIDUOUS_FOREST;
            }
        }
        else if(temperature==1){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredSecondaryRegionConfig.COOL_SLOPE_VAR.get());
            }
            else{
                return RuBiomes.PINE_SLOPES;
            }
        }
        else if(temperature==2){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredSecondaryRegionConfig.NEUTRAL_SLOPE_VAR.get());
            }
            else{
                return RuBiomes.PINE_SLOPES;
            }
        }
        else if(temperature==3){
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredSecondaryRegionConfig.WARM_SLOPE_VAR.get());
            }
            else{
                return RuBiomes.CHERRY_HILLS;
            }
        }
        else {
            if(RegionsUnexploredCommonConfigs.TOGGLE_CUSTOM_REGIONS.get()){
                return getBiome(RegionsUnexploredSecondaryRegionConfig.HOT_SLOPE_VAR.get());
            }
            else{
                return RuBiomes.EUCALYPTUS_FOREST;
            }
        }
    }

    public static boolean isBiomeEnabled(ResourceKey<Biome> biome){
        if(biome== RuBiomes.ALPHA_GROVE){
            return RegionsUnexploredCommonConfigs.TOGGLE_ALPHA_GROVE.get();
        }
        if(biome== RuBiomes.ARID_MOUNTAINS){
            return RegionsUnexploredCommonConfigs.TOGGLE_ARID_MOUNTAINS.get();
        }
        if(biome== RuBiomes.AUTUMNAL_MAPLE_FOREST){
            return RegionsUnexploredCommonConfigs.TOGGLE_AUTUMNAL_MAPLE_FOREST.get();
        }
        if(biome== RuBiomes.BAMBOO_FOREST){
            return RegionsUnexploredCommonConfigs.TOGGLE_BAMBOO_FOREST.get();
        }
        if(biome== RuBiomes.BAOBAB_SAVANNA){
            return RegionsUnexploredCommonConfigs.TOGGLE_BAOBAB_SAVANNA.get();
        }
        if(biome== RuBiomes.BARLEY_FIELDS){
            return RegionsUnexploredCommonConfigs.TOGGLE_BARLEY_FIELDS.get();
        }
        if(biome== RuBiomes.BAYOU){
            return RegionsUnexploredCommonConfigs.TOGGLE_BAYOU.get();
        }
        if(biome== RuBiomes.BIOSHROOM_CAVES){
            return RegionsUnexploredCommonConfigs.TOGGLE_BIOSHROOM_CAVES.get();
        }
        if(biome== RuBiomes.BLACKSTONE_BASIN){
            return RegionsUnexploredCommonConfigs.TOGGLE_BLACKSTONE_BASIN.get();
        }
        if(biome== RuBiomes.BLACKWOOD_FOREST){
            return RegionsUnexploredCommonConfigs.TOGGLE_BLACKWOOD_FOREST.get();
        }
        if(biome== RuBiomes.BOREAL_FOREST){
            return RegionsUnexploredCommonConfigs.TOGGLE_BOREAL_FOREST.get();
        }
        if(biome== RuBiomes.CHALK_CLIFFS){
            return RegionsUnexploredCommonConfigs.TOGGLE_CHALK_CLIFFS.get();
        }
        if(biome== RuBiomes.CHERRY_HILLS){
            return RegionsUnexploredCommonConfigs.TOGGLE_CHERRY_HILLS.get();
        }
        if(biome== RuBiomes.COLD_BOREAL_FOREST){
            return RegionsUnexploredCommonConfigs.TOGGLE_COLD_BOREAL_FOREST.get();
        }
        if(biome== RuBiomes.COLD_DECIDUOUS_FOREST){
            return RegionsUnexploredCommonConfigs.TOGGLE_COLD_DECIDUOUS_FOREST.get();
        }
        if(biome== RuBiomes.COLD_RIVER){
            return RegionsUnexploredCommonConfigs.TOGGLE_COLD_RIVER.get();
        }
        if(biome== RuBiomes.CORRUPTED_HOLT){
            return RegionsUnexploredCommonConfigs.TOGGLE_CORRUPTED_HOLT.get();
        }
        if(biome== RuBiomes.DECIDUOUS_FOREST){
            return RegionsUnexploredCommonConfigs.TOGGLE_DECIDUOUS_FOREST.get();
        }
        if(biome== RuBiomes.DRY_BUSHLAND){
            return RegionsUnexploredCommonConfigs.TOGGLE_DRY_BUSHLAND.get();
        }
        if(biome== RuBiomes.EUCALYPTUS_FOREST){
            return RegionsUnexploredCommonConfigs.TOGGLE_EUCALYPTUS_FOREST.get();
        }
        if(biome== RuBiomes.FEN){
            return RegionsUnexploredCommonConfigs.TOGGLE_FEN.get();
        }
        if(biome== RuBiomes.FLOODED_PLAINS){
            return RegionsUnexploredCommonConfigs.TOGGLE_FLOODED_PLAINS.get();
        }
        if(biome== RuBiomes.FLOWER_FIELD){
            return RegionsUnexploredCommonConfigs.TOGGLE_FLOWER_FIELD.get();
        }
        if(biome== RuBiomes.FROZEN_FOREST){
            return RegionsUnexploredCommonConfigs.TOGGLE_FROZEN_FOREST.get();
        }
        if(biome== RuBiomes.FROZEN_TUNDRA){
            return RegionsUnexploredCommonConfigs.TOGGLE_FROZEN_TUNDRA.get();
        }
        if(biome== RuBiomes.FUNGAL_FEN){
            return RegionsUnexploredCommonConfigs.TOGGLE_FUNGAL_FEN.get();
        }
        if(biome== RuBiomes.GIANT_BAYOU){
            return RegionsUnexploredCommonConfigs.TOGGLE_GIANT_BAYOU.get();
        }
        if(biome== RuBiomes.GLISTERING_MEADOW){
            return RegionsUnexploredCommonConfigs.TOGGLE_GLISTERING_MEADOW.get();
        }
        if(biome== RuBiomes.GOLDEN_BOREAL_FOREST){
            return RegionsUnexploredCommonConfigs.TOGGLE_GOLDEN_BOREAL_FOREST.get();
        }
        if(biome== RuBiomes.GRASSLAND){
            return RegionsUnexploredCommonConfigs.TOGGLE_GRASSLAND.get();
        }
        if(biome== RuBiomes.GRASSY_BEACH){
            return RegionsUnexploredCommonConfigs.TOGGLE_GRASSY_BEACH.get();
        }
        if(biome== RuBiomes.GRAVEL_BEACH){
            return RegionsUnexploredCommonConfigs.TOGGLE_GRAVEL_BEACH.get();
        }
        if(biome== RuBiomes.HIGHLAND_FIELDS){
            return RegionsUnexploredCommonConfigs.TOGGLE_HIGHLAND_FIELDS.get();
        }
        if(biome== RuBiomes.ICY_DESERT){
            return RegionsUnexploredCommonConfigs.TOGGLE_ICY_DESERT.get();
        }
        if(biome== RuBiomes.ICY_HEIGHTS){
            return RegionsUnexploredCommonConfigs.TOGGLE_ICY_HEIGHTS.get();
        }
        if(biome== RuBiomes.JOSHUA_DESERT){
            return RegionsUnexploredCommonConfigs.TOGGLE_JOSHUA_DESERT.get();
        }
        if(biome== RuBiomes.LUPINE_PLAINS){
            return RegionsUnexploredCommonConfigs.TOGGLE_LUPINE_PLAINS.get();
        }
        if(biome== RuBiomes.LUSH_DELTA){
            return RegionsUnexploredCommonConfigs.TOGGLE_LUSH_DELTA.get();
        }
        if(biome== RuBiomes.LUSH_HILLS){
            return RegionsUnexploredCommonConfigs.TOGGLE_LUSH_HILLS.get();
        }
        if(biome== RuBiomes.MAPLE_FOREST){
            return RegionsUnexploredCommonConfigs.TOGGLE_MAPLE_FOREST.get();
        }
        if(biome== RuBiomes.MAUVE_HILLS){
            return RegionsUnexploredCommonConfigs.TOGGLE_MAUVE_HILLS.get();
        }
        if(biome== RuBiomes.MEADOW){
            return RegionsUnexploredCommonConfigs.TOGGLE_MEADOW.get();
        }
        if(biome== RuBiomes.MOUNTAINS){
            return RegionsUnexploredCommonConfigs.TOGGLE_MOUNTAINS.get();
        }
        if(biome== RuBiomes.MUDDY_RIVER){
            return RegionsUnexploredCommonConfigs.TOGGLE_MUDDY_RIVER.get();
        }
        if(biome== RuBiomes.MYCOTOXIC_UNDERGROWTH){
            return RegionsUnexploredCommonConfigs.TOGGLE_MYCOTOXIC_UNDERGROWTH.get();
        }
        if(biome== RuBiomes.OLD_GROWTH_RAINFOREST){
            return RegionsUnexploredCommonConfigs.TOGGLE_OLD_GROWTH_RAINFOREST.get();
        }
        if(biome== RuBiomes.ORCHARD){
            return RegionsUnexploredCommonConfigs.TOGGLE_ORCHARD.get();
        }
        if(biome== RuBiomes.OUTBACK){
            return RegionsUnexploredCommonConfigs.TOGGLE_OUTBACK.get();
        }
        if(biome== RuBiomes.PINE_FOREST){
            return RegionsUnexploredCommonConfigs.TOGGLE_PINE_FOREST.get();
        }
        if(biome== RuBiomes.PINE_SLOPES){
            return RegionsUnexploredCommonConfigs.TOGGLE_PINE_SLOPES.get();
        }
        if(biome== RuBiomes.POPPY_FIELDS){
            return RegionsUnexploredCommonConfigs.TOGGLE_POPPY_FIELDS.get();
        }
        if(biome== RuBiomes.PRAIRIE){
            return RegionsUnexploredCommonConfigs.TOGGLE_PRAIRIE.get();
        }
        if(biome== RuBiomes.PRISMACHASM){
            return RegionsUnexploredCommonConfigs.TOGGLE_PRISMACHASM.get();
        }
        if(biome== RuBiomes.PUMPKIN_FIELDS){
            return RegionsUnexploredCommonConfigs.TOGGLE_PUMPKIN_FIELDS.get();
        }
        if(biome== RuBiomes.RAINFOREST){
            return RegionsUnexploredCommonConfigs.TOGGLE_RAINFOREST.get();
        }
        if(biome== RuBiomes.REDSTONE_CAVES){
            return RegionsUnexploredCommonConfigs.TOGGLE_REDSTONE_CAVES.get();
        }
        if(biome== RuBiomes.REDSTONE_HELL){
            return RegionsUnexploredCommonConfigs.TOGGLE_REDSTONE_HELL.get();
        }
        if(biome== RuBiomes.REDWOODS){
            return RegionsUnexploredCommonConfigs.TOGGLE_REDWOODS.get();
        }
        if(biome== RuBiomes.SAGUARO_DESERT){
            return RegionsUnexploredCommonConfigs.TOGGLE_SAGUARO_DESERT.get();
        }
        if(biome== RuBiomes.SCORCHING_CAVES){
            return RegionsUnexploredCommonConfigs.TOGGLE_SCORCHING_CAVES.get();
        }
        if(biome== RuBiomes.SHRUBLAND){
            return RegionsUnexploredCommonConfigs.TOGGLE_SHRUBLAND.get();
        }
        if(biome== RuBiomes.SILVER_BIRCH_FOREST){
            return RegionsUnexploredCommonConfigs.TOGGLE_SILVER_BIRCH_FOREST.get();
        }
        if(biome== RuBiomes.SMOULDERING_WOODLAND){
            return RegionsUnexploredCommonConfigs.TOGGLE_SMOULDERING_WOODLAND.get();
        }
        if(biome== RuBiomes.SPARSE_REDWOODS){
            return RegionsUnexploredCommonConfigs.TOGGLE_SPARSE_REDWOODS.get();
        }
        if(biome== RuBiomes.SPIRES){
            return RegionsUnexploredCommonConfigs.TOGGLE_SPIRES.get();
        }
        if(biome== RuBiomes.STEPPE){
            return RegionsUnexploredCommonConfigs.TOGGLE_STEPPE.get();
        }
        if(biome== RuBiomes.TEMPERATE_GROVE){
            return RegionsUnexploredCommonConfigs.TOGGLE_TEMPERATE_GROVE.get();
        }
        if(biome== RuBiomes.TOWERING_CLIFFS){
            return RegionsUnexploredCommonConfigs.TOGGLE_TOWERING_CLIFFS.get();
        }
        if(biome== RuBiomes.TROPICS){
            return RegionsUnexploredCommonConfigs.TOGGLE_TROPICS.get();
        }
        if(biome== RuBiomes.WILLOW_FOREST){
            return RegionsUnexploredCommonConfigs.TOGGLE_WILLOW_FOREST.get();
        }
        return true;
    }

    public static ResourceKey<Biome> getBiome(String id){
        return ResourceKey.create(Registries.BIOME, new ResourceLocation(id));
    }
}
