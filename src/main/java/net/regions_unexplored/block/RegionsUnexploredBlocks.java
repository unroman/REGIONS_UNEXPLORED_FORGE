package net.regions_unexplored.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PlaceOnWaterBlockItem;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.RegistryObject;
import net.regions_unexplored.RegionsUnexploredMod;
import net.regions_unexplored.world.level.block.*;
import net.regions_unexplored.world.level.block.grass.*;
import net.regions_unexplored.world.level.block.grower.*;
import net.regions_unexplored.world.level.block.placer.DirtPlacementBlock;
import net.regions_unexplored.world.level.block.placer.GrassPlacementBlock;
import net.regions_unexplored.world.level.block.placer.MudPlacementBlock;
import net.regions_unexplored.world.level.block.placer.SandPlacementBlock;
import net.regions_unexplored.world.level.block.state.properties.RuBlockSetType;
import net.regions_unexplored.world.level.block.state.properties.RuWoodTypes;

import java.util.function.Supplier;

public class RegionsUnexploredBlocks {
    /*-----------------CAVE_BLOCKS-----------------*/
    //PRISMA_BLOCKS
    public static RegistryObject<Block> PRISMOSS;
    public static RegistryObject<Block> DEEPSLATE_PRISMOSS;
    public static RegistryObject<Block> HANGING_PRISMARITE;
    public static RegistryObject<Block> LARGE_PRISMARITE_CLUSTER;
    public static RegistryObject<Block> PRISMAGLASS;
    public static RegistryObject<Block> PRISMARITE_CLUSTER;
    public static RegistryObject<Block> PRISMOSS_SPROUT;
    //REDSTONE_BLOCKS
    public static RegistryObject<Block> POINTED_REDSTONE;
    public static RegistryObject<Block> RAW_REDSTONE_BLOCK;                        
    public static RegistryObject<Block> REDSTONE_BUD;                              
    public static RegistryObject<Block> REDSTONE_BULB;                             
    //OTHER_CAVE_BLOCKS
    public static RegistryObject<Block> STONE_GRASS_BLOCK;
    public static RegistryObject<Block> DEEPSLATE_GRASS_BLOCK;
    public static RegistryObject<Block> VIRIDESCENT_NYLIUM;
    public static RegistryObject<Block> DEEPSLATE_VIRIDESCENT_NYLIUM;                       
    
    /*-----------------PLANTS-----------------*/
    //GRASS_BLOCKS
    public static RegistryObject<Block> DEAD_STEPPE_SHRUB;
    public static RegistryObject<Block> FROZEN_GRASS;
    public static RegistryObject<Block> MEDIUM_GRASS;                              
    public static RegistryObject<Block> SANDY_GRASS;
    public static RegistryObject<Block> SEEDED_GRASS;                              
    public static RegistryObject<Block> SMALL_DESERT_SHRUB;
    public static RegistryObject<Block> STEPPE_GRASS;                              
    public static RegistryObject<Block> STEPPE_SHRUB;                              
    public static RegistryObject<Block> STONE_BUD;
    //TALL_GRASS_BLOCKS
    public static RegistryObject<Block> ELEPHANT_EAR;
    public static RegistryObject<Block> SANDY_TALL_GRASS;
    public static RegistryObject<Block> SEEDED_TALL_GRASS;                         
    public static RegistryObject<Block> TALL_STEPPE_GRASS;                         
    //FLOWERS
    public static RegistryObject<Block> ALPHA_DANDELION;
    public static RegistryObject<Block> ALPHA_ROSE;
    public static RegistryObject<Block> BLUE_LUPINE;
    public static RegistryObject<Block> DAISY;
    public static RegistryObject<Block> DORCEL;
    public static RegistryObject<Block> FELICIA_DAISY;
    public static RegistryObject<Block> FIREWEED;
    public static RegistryObject<Block> HYSSOP;
    public static RegistryObject<Block> PINK_LUPINE;
    public static RegistryObject<Block> POPPY_BUSH;
    public static RegistryObject<Block> PURPLE_LUPINE;
    public static RegistryObject<Block> RED_LUPINE;
    public static RegistryObject<Block> WARATAH;
    public static RegistryObject<Block> WHITE_TRILLIUM;
    public static RegistryObject<Block> WILTING_TRILLIUM;
    public static RegistryObject<Block> YELLOW_LUPINE;

    public static RegistryObject<Block> RED_CHERRY_FLOWERS;
    public static RegistryObject<Block> PINK_CHERRY_FLOWERS;
    public static RegistryObject<Block> WHITE_CHERRY_FLOWERS;
    //TALL_PLANTS
    public static RegistryObject<Block> BARLEY;
    public static RegistryObject<Block> CATTAIL;
    public static RegistryObject<Block> TASSEL;
    public static RegistryObject<Block> TSUBAKI;
    //SAPLINGS
    public static RegistryObject<Block> ALPHA_SAPLING;
    public static RegistryObject<Block> APPLE_OAK_SAPLING;
    public static RegistryObject<Block> BAMBOO_SAPLING;
    public static RegistryObject<Block> BAOBAB_SAPLING;
    public static RegistryObject<Block> BLACKWOOD_SAPLING;
    public static RegistryObject<Block> CACTUS_FLOWER;
    public static RegistryObject<Block> CHERRY_SAPLING;
    public static RegistryObject<Block> CYPRESS_SAPLING;
    public static RegistryObject<Block> DEAD_PINE_SAPLING;
    public static RegistryObject<Block> DEAD_SAPLING;
    public static RegistryObject<Block> EUCALYPTUS_SAPLING;
    public static RegistryObject<Block> FLOWERING_SAPLING;
    public static RegistryObject<Block> GOLDEN_LARCH_SAPLING;
    public static RegistryObject<Block> JOSHUA_SAPLING;
    public static RegistryObject<Block> LARCH_SAPLING;
    public static RegistryObject<Block> MAPLE_SAPLING;
    public static RegistryObject<Block> MAUVE_SAPLING;
    public static RegistryObject<Block> ORANGE_MAPLE_SAPLING;
    public static RegistryObject<Block> PALM_SAPLING;
    public static RegistryObject<Block> PINE_SAPLING;
    public static RegistryObject<Block> PINK_CHERRY_SAPLING;
    public static RegistryObject<Block> REDWOOD_SAPLING;
    public static RegistryObject<Block> RED_CHERRY_SAPLING;
    public static RegistryObject<Block> RED_MAPLE_SAPLING;
    public static RegistryObject<Block> BRIMWOOD_SAPLING;
    public static RegistryObject<Block> SILVER_BIRCH_SAPLING;
    public static RegistryObject<Block> WHITE_CHERRY_SAPLING;
    public static RegistryObject<Block> WILLOW_SAPLING;
    //TALL_SAPLINGS
    public static RegistryObject<Block> TALL_ACACIA_SAPLING;
    public static RegistryObject<Block> TALL_BAOBAB_SAPLING;
    public static RegistryObject<Block> TALL_BIRCH_SAPLING;
    public static RegistryObject<Block> TALL_BLACKWOOD_SAPLING;
    public static RegistryObject<Block> TALL_CHERRY_SAPLING;
    public static RegistryObject<Block> TALL_CYPRESS_SAPLING;
    public static RegistryObject<Block> TALL_DARK_OAK_SAPLING;
    public static RegistryObject<Block> TALL_DEAD_PINE_SAPLING;
    public static RegistryObject<Block> TALL_DEAD_SAPLING;
    public static RegistryObject<Block> TALL_EUCALYPTUS_SAPLING;
    public static RegistryObject<Block> TALL_FLOWERING_SAPLING;
    public static RegistryObject<Block> TALL_GOLDEN_LARCH_SAPLING;
    public static RegistryObject<Block> TALL_JOSHUA_SAPLING;
    public static RegistryObject<Block> TALL_JUNGLE_SAPLING;
    public static RegistryObject<Block> TALL_LARCH_SAPLING;
    public static RegistryObject<Block> TALL_MANGROVE_SAPLING;
    public static RegistryObject<Block> TALL_MAPLE_SAPLING;
    public static RegistryObject<Block> TALL_MAUVE_SAPLING;
    public static RegistryObject<Block> TALL_OAK_SAPLING;
    public static RegistryObject<Block> TALL_ORANGE_MAPLE_SAPLING;
    public static RegistryObject<Block> TALL_PALM_SAPLING;
    public static RegistryObject<Block> TALL_PINE_SAPLING;
    public static RegistryObject<Block> TALL_PINK_CHERRY_SAPLING;
    public static RegistryObject<Block> TALL_REDWOOD_SAPLING;
    public static RegistryObject<Block> TALL_RED_CHERRY_SAPLING;
    public static RegistryObject<Block> TALL_RED_MAPLE_SAPLING;
    public static RegistryObject<Block> TALL_SILVER_BIRCH_SAPLING;
    public static RegistryObject<Block> TALL_SPRUCE_SAPLING;
    public static RegistryObject<Block> TALL_WHITE_CHERRY_SAPLING;
    public static RegistryObject<Block> TALL_WILLOW_SAPLING;
    //MUSHROOMS
    public static RegistryObject<Block> BLUE_BIOSHROOM;
    public static RegistryObject<Block> GREEN_BIOSHROOM;
    public static RegistryObject<Block> PINK_BIOSHROOM;
    public static RegistryObject<Block> YELLOW_BIOSHROOM;
    public static RegistryObject<Block> TALL_BLUE_BIOSHROOM;
    public static RegistryObject<Block> TALL_GREEN_BIOSHROOM;
    public static RegistryObject<Block> TALL_PINK_BIOSHROOM;
    public static RegistryObject<Block> TALL_YELLOW_BIOSHROOM;
    //OTHER_PLANT_BLOCKS
    public static RegistryObject<Block> BARREL_CACTUS;
    public static RegistryObject<Block> CAVE_HYSSOP;
    public static RegistryObject<Block> DUCKWEED;
    public static RegistryObject<Block> SPANISH_MOSS;
    public static RegistryObject<Block> SPANISH_MOSS_PLANT;
    
    /*-----------------POTTED_PLANTS-----------------*/
    //POTTED_FLOWERS
    public static RegistryObject<Block> POTTED_ALPHA_DANDELION;
    public static RegistryObject<Block> POTTED_ALPHA_ROSE;
    public static RegistryObject<Block> POTTED_BLUE_LUPINE;
    public static RegistryObject<Block> POTTED_DAISY;
    public static RegistryObject<Block> POTTED_DORCEL;
    public static RegistryObject<Block> POTTED_FELICIA_DAISY;
    public static RegistryObject<Block> POTTED_FIREWEED;
    public static RegistryObject<Block> POTTED_HYSSOP;
    public static RegistryObject<Block> POTTED_PINK_LUPINE;
    public static RegistryObject<Block> POTTED_POPPY_BUSH;
    public static RegistryObject<Block> POTTED_PURPLE_LUPINE;
    public static RegistryObject<Block> POTTED_RED_LUPINE;
    public static RegistryObject<Block> POTTED_WARATAH;
    public static RegistryObject<Block> POTTED_WHITE_TRILLIUM;
    public static RegistryObject<Block> POTTED_WILTING_TRILLIUM;
    public static RegistryObject<Block> POTTED_YELLOW_LUPINE;
    //POTTED_SAPLINGS
    public static RegistryObject<Block> POTTED_ALPHA_SAPLING;
    public static RegistryObject<Block> POTTED_APPLE_OAK_SAPLING;
    public static RegistryObject<Block> POTTED_BAMBOO_SAPLING;
    public static RegistryObject<Block> POTTED_BAOBAB_SAPLING;
    public static RegistryObject<Block> POTTED_BLACKWOOD_SAPLING;
    public static RegistryObject<Block> POTTED_CACTUS_FLOWER;
    public static RegistryObject<Block> POTTED_CHERRY_SAPLING;
    public static RegistryObject<Block> POTTED_CYPRESS_SAPLING;
    public static RegistryObject<Block> POTTED_DEAD_PINE_SAPLING;
    public static RegistryObject<Block> POTTED_DEAD_SAPLING;
    public static RegistryObject<Block> POTTED_EUCALYPTUS_SAPLING;
    public static RegistryObject<Block> POTTED_FLOWERING_SAPLING;
    public static RegistryObject<Block> POTTED_GOLDEN_LARCH_SAPLING;
    public static RegistryObject<Block> POTTED_JOSHUA_SAPLING;
    public static RegistryObject<Block> POTTED_LARCH_SAPLING;
    public static RegistryObject<Block> POTTED_MAPLE_SAPLING;
    public static RegistryObject<Block> POTTED_MAUVE_SAPLING;
    public static RegistryObject<Block> POTTED_ORANGE_MAPLE_SAPLING;
    public static RegistryObject<Block> POTTED_PALM_SAPLING;
    public static RegistryObject<Block> POTTED_PINE_SAPLING;
    public static RegistryObject<Block> POTTED_PINK_CHERRY_SAPLING;
    public static RegistryObject<Block> POTTED_REDWOOD_SAPLING;
    public static RegistryObject<Block> POTTED_RED_CHERRY_SAPLING;
    public static RegistryObject<Block> POTTED_RED_MAPLE_SAPLING;
    public static RegistryObject<Block> POTTED_BRIMWOOD_SAPLING;
    public static RegistryObject<Block> POTTED_SILVER_BIRCH_SAPLING;
    public static RegistryObject<Block> POTTED_WHITE_CHERRY_SAPLING;
    public static RegistryObject<Block> POTTED_WILLOW_SAPLING;
    //POTTED_MUSHROOMS
    public static RegistryObject<Block> POTTED_BLUE_BIOSHROOM;
    public static RegistryObject<Block> POTTED_GREEN_BIOSHROOM;
    public static RegistryObject<Block> POTTED_PINK_BIOSHROOM;
    public static RegistryObject<Block> POTTED_YELLOW_BIOSHROOM;
    //OTHER_POTTED_PLANTS
    public static RegistryObject<Block> POTTED_BARREL_CACTUS;
    public static RegistryObject<Block> POTTED_CAVE_HYSSOP;
    
    /*-----------------PLANT_BLOCKS-----------------*/
    //MUSHROOMS
    public static RegistryObject<Block> BLUE_BIOSHROOM_BLOCK;
    public static RegistryObject<Block> GLOWING_BLUE_BIOSHROOM_BLOCK;
    public static RegistryObject<Block> GREEN_BIOSHROOM_BLOCK;
    public static RegistryObject<Block> GLOWING_GREEN_BIOSHROOM_BLOCK;
    public static RegistryObject<Block> PINK_BIOSHROOM_BLOCK;
    public static RegistryObject<Block> GLOWING_PINK_BIOSHROOM_BLOCK;
    public static RegistryObject<Block> YELLOW_BIOSHROOM_BLOCK;
    public static RegistryObject<Block> GLOWING_YELLOW_BIOSHROOM_BLOCK;
    //BAMBOO
    public static RegistryObject<Block> BAMBOO_LOG;
    public static RegistryObject<Block> STRIPPED_BAMBOO_LOG;
    @Deprecated
    public static RegistryObject<Block> BAMBOO_LOG_LEAVES;
    //CACTUS
    public static RegistryObject<Block> SAGUARO_CACTUS;
    @Deprecated
    public static RegistryObject<Block> SAGUARO_CACTUS_CORNER;
    
    /*-----------------LEAVES-----------------*/
    public static RegistryObject<Block> ALPHA_LEAVES;
    public static RegistryObject<Block> APPLE_OAK_LEAVES;
    public static RegistryObject<Block> BAMBOO_LEAVES;
    public static RegistryObject<Block> BAOBAB_LEAVES;
    public static RegistryObject<Block> BLACKWOOD_LEAVES;
    public static RegistryObject<Block> CHERRY_LEAVES;
    public static RegistryObject<Block> CYPRESS_LEAVES;
    public static RegistryObject<Block> DEAD_LEAVES;
    public static RegistryObject<Block> DEAD_PINE_LEAVES;
    public static RegistryObject<Block> EUCALYPTUS_LEAVES;
    public static RegistryObject<Block> FLOWERING_LEAVES;
    public static RegistryObject<Block> GOLDEN_LARCH_LEAVES;
    public static RegistryObject<Block> JOSHUA_LEAVES;
    public static RegistryObject<Block> LARCH_LEAVES;
    public static RegistryObject<Block> MAPLE_LEAVES;
    public static RegistryObject<Block> MAUVE_LEAVES;
    public static RegistryObject<Block> ORANGE_MAPLE_LEAVES;
    public static RegistryObject<Block> PALM_LEAVES;
    public static RegistryObject<Block> PINE_LEAVES;
    public static RegistryObject<Block> PINK_CHERRY_LEAVES;
    public static RegistryObject<Block> REDWOOD_LEAVES;
    public static RegistryObject<Block> RED_CHERRY_LEAVES;
    public static RegistryObject<Block> RED_MAPLE_LEAVES;
    public static RegistryObject<Block> BRIMWOOD_LEAVES;
    public static RegistryObject<Block> SILVER_BIRCH_LEAVES;
    public static RegistryObject<Block> WHITE_CHERRY_LEAVES;
    public static RegistryObject<Block> WILLOW_LEAVES;
    
    /*-----------------BRANCHES-----------------*/
    public static RegistryObject<Block> ACACIA_BRANCH;
    public static RegistryObject<Block> BAOBAB_BRANCH;
    public static RegistryObject<Block> BIRCH_BRANCH;
    public static RegistryObject<Block> BLACKWOOD_BRANCH;
    public static RegistryObject<Block> CHERRY_BRANCH;
    public static RegistryObject<Block> CYPRESS_BRANCH;
    public static RegistryObject<Block> DARK_OAK_BRANCH;
    public static RegistryObject<Block> DEAD_BRANCH;
    public static RegistryObject<Block> EUCALYPTUS_BRANCH;
    public static RegistryObject<Block> JOSHUA_BEARD;
    public static RegistryObject<Block> JUNGLE_BRANCH;
    public static RegistryObject<Block> LARCH_BRANCH;
    public static RegistryObject<Block> MANGROVE_BRANCH;
    public static RegistryObject<Block> MAPLE_BRANCH;
    public static RegistryObject<Block> MAUVE_BRANCH;
    public static RegistryObject<Block> OAK_BRANCH;
    public static RegistryObject<Block> PALM_BEARD;
    public static RegistryObject<Block> PINE_BRANCH;
    public static RegistryObject<Block> REDWOOD_BRANCH;
    public static RegistryObject<Block> SPRUCE_BRANCH;
    public static RegistryObject<Block> WILLOW_BRANCH;
    
    /*-----------------DIRT_BLOCKS-----------------*/
    //FOREST_DIRT_BLOCKS
    public static RegistryObject<Block> FOREST_GRASS_BLOCK;
    public static RegistryObject<Block> FOREST_DIRT;
    public static RegistryObject<Block> FOREST_DIRT_PATH;
    public static RegistryObject<Block> FOREST_COARSE_DIRT;
    public static RegistryObject<Block> FOREST_MUD;
    public static RegistryObject<Block> FOREST_FARMLAND;
    //PLAINS_DIRT_BLOCKS
    public static RegistryObject<Block> PLAINS_GRASS_BLOCK;
    public static RegistryObject<Block> PLAINS_DIRT;
    public static RegistryObject<Block> PLAINS_DIRT_PATH;
    public static RegistryObject<Block> PLAINS_COARSE_DIRT;
    public static RegistryObject<Block> PLAINS_MUD;
    public static RegistryObject<Block> PLAINS_FARMLAND;
    //OTHER_DIRT_BLOCKS
    public static RegistryObject<Block> ALPHA_GRASS_BLOCK;

    /*-----------------STONE_BLOCKS-----------------*/
    //CHALKS
    public static RegistryObject<Block> CHALK;
    public static RegistryObject<Block> CHALK_GRASS_BLOCK;
    public static RegistryObject<Block> CHALK_BRICKS;
    public static RegistryObject<Block> CHALK_BRICK_SLAB;
    public static RegistryObject<Block> CHALK_BRICK_STAIRS;
    public static RegistryObject<Block> CHALK_PILLAR;
    public static RegistryObject<Block> CHALK_SLAB;
    public static RegistryObject<Block> CHALK_STAIRS;
    public static RegistryObject<Block> POLISHED_CHALK;
    public static RegistryObject<Block> POLISHED_CHALK_SLAB;
    public static RegistryObject<Block> POLISHED_CHALK_STAIRS;
    //MOSSY_STONES
    public static RegistryObject<Block> MOSSY_STONE;

    /*-----------------OTHER_BLOCKS-----------------*/
    public static RegistryObject<Block> ASH;
    public static RegistryObject<Block> VOLCANIC_ASH;
    public static RegistryObject<Block> ASH_VENT;
    public static RegistryObject<Block> QUICKSAND;
    
    /*-----------------WOOD_TYPES-----------------*/
    //SILVER_BIRCH
    public static RegistryObject<Block> SILVER_BIRCH_LOG_BASE;
    //ALPHA_BLOCKS
    public static RegistryObject<Block> ALPHA_LOG;
    public static RegistryObject<Block> ALPHA_PLANKS;
    public static RegistryObject<Block> ALPHA_STAIRS;
    public static RegistryObject<Block> ALPHA_SLAB;
    //BAOBAB_BLOCKS
    public static RegistryObject<Block> BAOBAB_LOG;
    public static RegistryObject<Block> STRIPPED_BAOBAB_LOG;
    public static RegistryObject<Block> BAOBAB_WOOD;
    public static RegistryObject<Block> STRIPPED_BAOBAB_WOOD;
    public static RegistryObject<Block> BAOBAB_PLANKS;
    public static RegistryObject<Block> BAOBAB_STAIRS;
    public static RegistryObject<Block> BAOBAB_SLAB;
    public static RegistryObject<Block> BAOBAB_FENCE;
    public static RegistryObject<Block> BAOBAB_DOOR;
    public static RegistryObject<Block> BAOBAB_FENCE_GATE;
    public static RegistryObject<Block> BAOBAB_TRAPDOOR;
    public static RegistryObject<Block> BAOBAB_PRESSURE_PLATE;
    public static RegistryObject<Block> BAOBAB_BUTTON;
    public static RegistryObject<Block> BAOBAB_SIGN;
    public static RegistryObject<Block> BAOBAB_WALL_SIGN;
    //BLACKWOOD_BLOCKS
    public static RegistryObject<Block> BLACKWOOD_LOG;
    public static RegistryObject<Block> STRIPPED_BLACKWOOD_LOG;
    public static RegistryObject<Block> BLACKWOOD_WOOD;
    public static RegistryObject<Block> STRIPPED_BLACKWOOD_WOOD;
    public static RegistryObject<Block> BLACKWOOD_PLANKS;
    public static RegistryObject<Block> BLACKWOOD_STAIRS;
    public static RegistryObject<Block> BLACKWOOD_SLAB;
    public static RegistryObject<Block> BLACKWOOD_FENCE;
    public static RegistryObject<Block> BLACKWOOD_DOOR;
    public static RegistryObject<Block> BLACKWOOD_FENCE_GATE;
    public static RegistryObject<Block> BLACKWOOD_TRAPDOOR;
    public static RegistryObject<Block> BLACKWOOD_PRESSURE_PLATE;
    public static RegistryObject<Block> BLACKWOOD_BUTTON;
    public static RegistryObject<Block> BLACKWOOD_SIGN;
    public static RegistryObject<Block> BLACKWOOD_WALL_SIGN;
    //CHERRY_BLOCKS
    public static RegistryObject<Block> CHERRY_LOG;
    public static RegistryObject<Block> STRIPPED_CHERRY_LOG;
    public static RegistryObject<Block> CHERRY_WOOD;
    public static RegistryObject<Block> STRIPPED_CHERRY_WOOD;
    public static RegistryObject<Block> CHERRY_PLANKS;
    public static RegistryObject<Block> CHERRY_STAIRS;
    public static RegistryObject<Block> CHERRY_SLAB;
    public static RegistryObject<Block> CHERRY_FENCE;
    public static RegistryObject<Block> CHERRY_DOOR;
    public static RegistryObject<Block> CHERRY_FENCE_GATE;
    public static RegistryObject<Block> CHERRY_TRAPDOOR;
    public static RegistryObject<Block> CHERRY_PRESSURE_PLATE;
    public static RegistryObject<Block> CHERRY_BUTTON;
    public static RegistryObject<Block> CHERRY_SIGN;
    public static RegistryObject<Block> CHERRY_WALL_SIGN;
    //CYPRESS_BLOCKS
    public static RegistryObject<Block> CYPRESS_LOG;
    public static RegistryObject<Block> STRIPPED_CYPRESS_LOG;
    public static RegistryObject<Block> CYPRESS_WOOD;
    public static RegistryObject<Block> STRIPPED_CYPRESS_WOOD;
    public static RegistryObject<Block> CYPRESS_PLANKS;
    public static RegistryObject<Block> CYPRESS_STAIRS;
    public static RegistryObject<Block> CYPRESS_SLAB;
    public static RegistryObject<Block> CYPRESS_FENCE;
    public static RegistryObject<Block> CYPRESS_DOOR;
    public static RegistryObject<Block> CYPRESS_FENCE_GATE;
    public static RegistryObject<Block> CYPRESS_TRAPDOOR;
    public static RegistryObject<Block> CYPRESS_PRESSURE_PLATE;
    public static RegistryObject<Block> CYPRESS_BUTTON;
    public static RegistryObject<Block> CYPRESS_SIGN;
    public static RegistryObject<Block> CYPRESS_WALL_SIGN;
    //DEAD_BLOCKS
    public static RegistryObject<Block> DEAD_LOG;
    public static RegistryObject<Block> STRIPPED_DEAD_LOG;
    public static RegistryObject<Block> DEAD_WOOD;
    public static RegistryObject<Block> STRIPPED_DEAD_WOOD;
    public static RegistryObject<Block> DEAD_PLANKS;
    public static RegistryObject<Block> DEAD_STAIRS;
    public static RegistryObject<Block> DEAD_SLAB;
    public static RegistryObject<Block> DEAD_FENCE;
    public static RegistryObject<Block> DEAD_DOOR;
    public static RegistryObject<Block> DEAD_FENCE_GATE;
    public static RegistryObject<Block> DEAD_TRAPDOOR;
    public static RegistryObject<Block> DEAD_PRESSURE_PLATE;
    public static RegistryObject<Block> DEAD_BUTTON;
    public static RegistryObject<Block> DEAD_SIGN;
    public static RegistryObject<Block> DEAD_WALL_SIGN;
    //EUCALYPTUS_BLOCKS
    public static RegistryObject<Block> EUCALYPTUS_LOG;
    public static RegistryObject<Block> STRIPPED_EUCALYPTUS_LOG;
    public static RegistryObject<Block> EUCALYPTUS_WOOD;
    public static RegistryObject<Block> STRIPPED_EUCALYPTUS_WOOD;
    public static RegistryObject<Block> EUCALYPTUS_PLANKS;
    public static RegistryObject<Block> EUCALYPTUS_STAIRS;
    public static RegistryObject<Block> EUCALYPTUS_SLAB;
    public static RegistryObject<Block> EUCALYPTUS_FENCE;
    public static RegistryObject<Block> EUCALYPTUS_DOOR;
    public static RegistryObject<Block> EUCALYPTUS_FENCE_GATE;
    public static RegistryObject<Block> EUCALYPTUS_TRAPDOOR;
    public static RegistryObject<Block> EUCALYPTUS_PRESSURE_PLATE;
    public static RegistryObject<Block> EUCALYPTUS_BUTTON;
    public static RegistryObject<Block> EUCALYPTUS_SIGN;
    public static RegistryObject<Block> EUCALYPTUS_WALL_SIGN;
    //JOSHUA_BLOCKS
    public static RegistryObject<Block> JOSHUA_LOG;
    public static RegistryObject<Block> STRIPPED_JOSHUA_LOG;
    public static RegistryObject<Block> JOSHUA_WOOD;
    public static RegistryObject<Block> STRIPPED_JOSHUA_WOOD;
    public static RegistryObject<Block> JOSHUA_PLANKS;
    public static RegistryObject<Block> JOSHUA_STAIRS;
    public static RegistryObject<Block> JOSHUA_SLAB;
    public static RegistryObject<Block> JOSHUA_FENCE;
    public static RegistryObject<Block> JOSHUA_DOOR;
    public static RegistryObject<Block> JOSHUA_FENCE_GATE;
    public static RegistryObject<Block> JOSHUA_TRAPDOOR;
    public static RegistryObject<Block> JOSHUA_PRESSURE_PLATE;
    public static RegistryObject<Block> JOSHUA_BUTTON;
    public static RegistryObject<Block> JOSHUA_SIGN;
    public static RegistryObject<Block> JOSHUA_WALL_SIGN;
    //LARCH_BLOCKS
    public static RegistryObject<Block> LARCH_LOG;
    public static RegistryObject<Block> STRIPPED_LARCH_LOG;
    public static RegistryObject<Block> LARCH_WOOD;
    public static RegistryObject<Block> STRIPPED_LARCH_WOOD;
    public static RegistryObject<Block> LARCH_PLANKS;
    public static RegistryObject<Block> LARCH_STAIRS;
    public static RegistryObject<Block> LARCH_SLAB;
    public static RegistryObject<Block> LARCH_FENCE;
    public static RegistryObject<Block> LARCH_DOOR;
    public static RegistryObject<Block> LARCH_FENCE_GATE;
    public static RegistryObject<Block> LARCH_TRAPDOOR;
    public static RegistryObject<Block> LARCH_PRESSURE_PLATE;
    public static RegistryObject<Block> LARCH_BUTTON;
    public static RegistryObject<Block> LARCH_SIGN;
    public static RegistryObject<Block> LARCH_WALL_SIGN;
    //MAPLE_BLOCKS
    public static RegistryObject<Block> MAPLE_LOG;
    public static RegistryObject<Block> STRIPPED_MAPLE_LOG;
    public static RegistryObject<Block> MAPLE_WOOD;
    public static RegistryObject<Block> STRIPPED_MAPLE_WOOD;
    public static RegistryObject<Block> MAPLE_PLANKS;
    public static RegistryObject<Block> MAPLE_STAIRS;
    public static RegistryObject<Block> MAPLE_SLAB;
    public static RegistryObject<Block> MAPLE_FENCE;
    public static RegistryObject<Block> MAPLE_DOOR;
    public static RegistryObject<Block> MAPLE_FENCE_GATE;
    public static RegistryObject<Block> MAPLE_TRAPDOOR;
    public static RegistryObject<Block> MAPLE_PRESSURE_PLATE;
    public static RegistryObject<Block> MAPLE_BUTTON;
    public static RegistryObject<Block> MAPLE_SIGN;
    public static RegistryObject<Block> MAPLE_WALL_SIGN;
    //MAUVE_BLOCKS
    public static RegistryObject<Block> MAUVE_LOG;
    public static RegistryObject<Block> STRIPPED_MAUVE_LOG;
    public static RegistryObject<Block> MAUVE_WOOD;
    public static RegistryObject<Block> STRIPPED_MAUVE_WOOD;
    public static RegistryObject<Block> MAUVE_PLANKS;
    public static RegistryObject<Block> MAUVE_STAIRS;
    public static RegistryObject<Block> MAUVE_SLAB;
    public static RegistryObject<Block> MAUVE_FENCE;
    public static RegistryObject<Block> MAUVE_DOOR;
    public static RegistryObject<Block> MAUVE_FENCE_GATE;
    public static RegistryObject<Block> MAUVE_TRAPDOOR;
    public static RegistryObject<Block> MAUVE_PRESSURE_PLATE;
    public static RegistryObject<Block> MAUVE_BUTTON;
    public static RegistryObject<Block> MAUVE_SIGN;
    public static RegistryObject<Block> MAUVE_WALL_SIGN;
    //PALM_BLOCKS
    public static RegistryObject<Block> PALM_LOG;
    public static RegistryObject<Block> STRIPPED_PALM_LOG;
    public static RegistryObject<Block> PALM_WOOD;
    public static RegistryObject<Block> STRIPPED_PALM_WOOD;
    public static RegistryObject<Block> PALM_PLANKS;
    public static RegistryObject<Block> PALM_STAIRS;
    public static RegistryObject<Block> PALM_SLAB;
    public static RegistryObject<Block> PALM_FENCE;
    public static RegistryObject<Block> PALM_DOOR;
    public static RegistryObject<Block> PALM_FENCE_GATE;
    public static RegistryObject<Block> PALM_TRAPDOOR;
    public static RegistryObject<Block> PALM_PRESSURE_PLATE;
    public static RegistryObject<Block> PALM_BUTTON;
    public static RegistryObject<Block> PALM_SIGN;
    public static RegistryObject<Block> PALM_WALL_SIGN;
    //PINE_BLOCKS
    public static RegistryObject<Block> PINE_LOG;
    public static RegistryObject<Block> PINE_LOG_TRANSITION;
    public static RegistryObject<Block> STRIPPED_PINE_LOG;
    public static RegistryObject<Block> PINE_WOOD;
    public static RegistryObject<Block> STRIPPED_PINE_WOOD;
    public static RegistryObject<Block> PINE_PLANKS;
    public static RegistryObject<Block> PINE_STAIRS;
    public static RegistryObject<Block> PINE_SLAB;
    public static RegistryObject<Block> PINE_FENCE;
    public static RegistryObject<Block> PINE_DOOR;
    public static RegistryObject<Block> PINE_FENCE_GATE;
    public static RegistryObject<Block> PINE_TRAPDOOR;
    public static RegistryObject<Block> PINE_PRESSURE_PLATE;
    public static RegistryObject<Block> PINE_BUTTON;
    public static RegistryObject<Block> PINE_SIGN;
    public static RegistryObject<Block> PINE_WALL_SIGN;
    //REDWOOD_BLOCKS
    public static RegistryObject<Block> REDWOOD_LOG;
    public static RegistryObject<Block> STRIPPED_REDWOOD_LOG;
    public static RegistryObject<Block> REDWOOD_WOOD;
    public static RegistryObject<Block> STRIPPED_REDWOOD_WOOD;
    public static RegistryObject<Block> REDWOOD_PLANKS;
    public static RegistryObject<Block> REDWOOD_STAIRS;
    public static RegistryObject<Block> REDWOOD_SLAB;
    public static RegistryObject<Block> REDWOOD_FENCE;
    public static RegistryObject<Block> REDWOOD_DOOR;
    public static RegistryObject<Block> REDWOOD_FENCE_GATE;
    public static RegistryObject<Block> REDWOOD_TRAPDOOR;
    public static RegistryObject<Block> REDWOOD_PRESSURE_PLATE;
    public static RegistryObject<Block> REDWOOD_BUTTON;
    public static RegistryObject<Block> REDWOOD_SIGN;
    public static RegistryObject<Block> REDWOOD_WALL_SIGN;
    //SCULKWOOD_BLOCKS
    public static RegistryObject<Block> BRIMWOOD_LOG;
    public static RegistryObject<Block> BRIMWOOD_LOG_MAGMA;
    public static RegistryObject<Block> BRIMWOOD_LOG_TRANSITION;
    public static RegistryObject<Block> BRIMWOOD_PLANKS;
    public static RegistryObject<Block> BRIMWOOD_STAIRS;
    public static RegistryObject<Block> BRIMWOOD_SLAB;
    public static RegistryObject<Block> BRIMWOOD_FENCE;
    public static RegistryObject<Block> BRIMWOOD_DOOR;
    public static RegistryObject<Block> BRIMWOOD_FENCE_GATE;
    public static RegistryObject<Block> BRIMWOOD_TRAPDOOR;
    public static RegistryObject<Block> BRIMWOOD_PRESSURE_PLATE;
    public static RegistryObject<Block> BRIMWOOD_BUTTON;
    public static RegistryObject<Block> BRIMWOOD_SIGN;
    public static RegistryObject<Block> BRIMWOOD_WALL_SIGN;
    //WILLOW_BLOCKS
    public static RegistryObject<Block> WILLOW_LOG;
    public static RegistryObject<Block> STRIPPED_WILLOW_LOG;
    public static RegistryObject<Block> WILLOW_WOOD;
    public static RegistryObject<Block> STRIPPED_WILLOW_WOOD;
    public static RegistryObject<Block> WILLOW_PLANKS;
    public static RegistryObject<Block> WILLOW_STAIRS;
    public static RegistryObject<Block> WILLOW_SLAB;
    public static RegistryObject<Block> WILLOW_FENCE;
    public static RegistryObject<Block> WILLOW_DOOR;
    public static RegistryObject<Block> WILLOW_FENCE_GATE;
    public static RegistryObject<Block> WILLOW_TRAPDOOR;
    public static RegistryObject<Block> WILLOW_PRESSURE_PLATE;
    public static RegistryObject<Block> WILLOW_BUTTON;
    public static RegistryObject<Block> WILLOW_SIGN;
    public static RegistryObject<Block> WILLOW_WALL_SIGN;

    /*-----------------PAINTED PLANKS-----------------*/
    //PLANKS
    public static RegistryObject<Block> RED_PAINTED_PLANKS;
    public static RegistryObject<Block> ORANGE_PAINTED_PLANKS;
    public static RegistryObject<Block> YELLOW_PAINTED_PLANKS;
    public static RegistryObject<Block> LIME_PAINTED_PLANKS;
    public static RegistryObject<Block> GREEN_PAINTED_PLANKS;
    public static RegistryObject<Block> CYAN_PAINTED_PLANKS;
    public static RegistryObject<Block> LIGHT_BLUE_PAINTED_PLANKS;
    public static RegistryObject<Block> BLUE_PAINTED_PLANKS;
    public static RegistryObject<Block> PURPLE_PAINTED_PLANKS;
    public static RegistryObject<Block> MAGENTA_PAINTED_PLANKS;
    public static RegistryObject<Block> PINK_PAINTED_PLANKS;
    public static RegistryObject<Block> BROWN_PAINTED_PLANKS;
    public static RegistryObject<Block> WHITE_PAINTED_PLANKS;
    public static RegistryObject<Block> LIGHT_GRAY_PAINTED_PLANKS;
    public static RegistryObject<Block> GRAY_PAINTED_PLANKS;
    public static RegistryObject<Block> BLACK_PAINTED_PLANKS;
    //STAIRS
    public static RegistryObject<Block> RED_PAINTED_STAIRS;
    public static RegistryObject<Block> ORANGE_PAINTED_STAIRS;
    public static RegistryObject<Block> YELLOW_PAINTED_STAIRS;
    public static RegistryObject<Block> LIME_PAINTED_STAIRS;
    public static RegistryObject<Block> GREEN_PAINTED_STAIRS;
    public static RegistryObject<Block> CYAN_PAINTED_STAIRS;
    public static RegistryObject<Block> LIGHT_BLUE_PAINTED_STAIRS;
    public static RegistryObject<Block> BLUE_PAINTED_STAIRS;
    public static RegistryObject<Block> PURPLE_PAINTED_STAIRS;
    public static RegistryObject<Block> MAGENTA_PAINTED_STAIRS;
    public static RegistryObject<Block> PINK_PAINTED_STAIRS;
    public static RegistryObject<Block> BROWN_PAINTED_STAIRS;
    public static RegistryObject<Block> WHITE_PAINTED_STAIRS;
    public static RegistryObject<Block> LIGHT_GRAY_PAINTED_STAIRS;
    public static RegistryObject<Block> GRAY_PAINTED_STAIRS;
    public static RegistryObject<Block> BLACK_PAINTED_STAIRS;
    //SLABS
    public static RegistryObject<Block> RED_PAINTED_SLAB;
    public static RegistryObject<Block> ORANGE_PAINTED_SLAB;
    public static RegistryObject<Block> YELLOW_PAINTED_SLAB;
    public static RegistryObject<Block> LIME_PAINTED_SLAB;
    public static RegistryObject<Block> GREEN_PAINTED_SLAB;
    public static RegistryObject<Block> CYAN_PAINTED_SLAB;
    public static RegistryObject<Block> LIGHT_BLUE_PAINTED_SLAB;
    public static RegistryObject<Block> BLUE_PAINTED_SLAB;
    public static RegistryObject<Block> PURPLE_PAINTED_SLAB;
    public static RegistryObject<Block> MAGENTA_PAINTED_SLAB;
    public static RegistryObject<Block> PINK_PAINTED_SLAB;
    public static RegistryObject<Block> BROWN_PAINTED_SLAB;
    public static RegistryObject<Block> WHITE_PAINTED_SLAB;
    public static RegistryObject<Block> LIGHT_GRAY_PAINTED_SLAB;
    public static RegistryObject<Block> GRAY_PAINTED_SLAB;
    public static RegistryObject<Block> BLACK_PAINTED_SLAB;

    /*-----------------NETHER_BLOCKS-----------------*/
    //NETHER_STONES
    public static RegistryObject<Block> BLACKSTONE_CLUSTER;
    public static RegistryObject<Block> MARROWSTONE;
    //MYCOTOXIC_BLOCKS
    public static RegistryObject<Block> MYCOTOXIC_DAISY;
    public static RegistryObject<Block> MYCOTOXIC_GRASS;
    public static RegistryObject<Block> MYCOTOXIC_NYLIUM;
    //GLISTERING_BLOCKS
    public static RegistryObject<Block> GLISTERING_IVY;
    public static RegistryObject<Block> GLISTERING_IVY_PLANT;
    public static RegistryObject<Block> GLISTERING_NYLIUM;
    public static RegistryObject<Block> GLISTERING_SPROUT;
    public static RegistryObject<Block> GLISTERING_WART;
    public static RegistryObject<Block> GLISTER_BULB;
    public static RegistryObject<Block> GLISTER_SPIRE;
    //COBALT_BLOCKS
    public static RegistryObject<Block> COBALT_EARLIGHT;
    public static RegistryObject<Block> COBALT_NYLIUM;
    public static RegistryObject<Block> COBALT_OBSIDIAN;
    public static RegistryObject<Block> COBALT_ROOTS;
    public static RegistryObject<Block> HANGING_EARLIGHT;
    public static RegistryObject<Block> HANGING_EARLIGHT_PLANT;
    //SCULK_BLOCKS
    public static RegistryObject<Block> BRIMSPROUT_NYLIUM;
    public static RegistryObject<Block> BRIMSPROUT;

    /*-----------------OCEAN_BLOCKS-----------------*/
    //HYACINTH_BLOCKS
    public static RegistryObject<Block> HYACINTH_BLOOM;
    public static RegistryObject<Block> HYACINTH_FLOWERS;
    public static RegistryObject<Block> HYACINTH_SEAGRASS;
    public static RegistryObject<Block> HYACINTH_STONE;
    public static RegistryObject<Block> TALL_HYACINTH_STOCK;
    //SMOULDERING_WOODLAND
    public static RegistryObject<Block> ASHEN_DIRT;
    public static RegistryObject<Block> ASHEN_SHRUB;
    public static RegistryObject<Block> ASHEN_LOG;
    public static RegistryObject<Block> ASHEN_LEAVES;
    public static RegistryObject<Block> ASHEN_GRASS;

    /*-----------------PLACERS-----------------*/
    public static RegistryObject<Block> DIRT_PLACEMENT;
    public static RegistryObject<Block> GRASS_PLACEMENT;
    public static RegistryObject<Block> MUD_PLACEMENT;
    public static RegistryObject<Block> SAND_PLACEMENT;
    
    public static void addBlocks() {
        /*-----------------CAVE_BLOCKS-----------------*/
        //PRISMA_BLOCKS
        PRISMOSS = registerDefaultBlock("prismoss", () -> new PrismossBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_GREEN).sound(SoundType.STONE).randomTicks().strength(1.5f, 6f).requiresCorrectToolForDrops()));
        DEEPSLATE_PRISMOSS = registerDefaultBlock("deepslate_prismoss", () -> new PrismossBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_GREEN).sound(SoundType.DEEPSLATE).randomTicks().strength(3f, 6f).requiresCorrectToolForDrops()));
        HANGING_PRISMARITE = registerDefaultBlock("hanging_prismarite", () -> new HangingPrismariteBlock(BlockBehaviour.Properties.of(Material.PLANT).sound(SoundType.AMETHYST).dynamicShape().offsetType(BlockBehaviour.OffsetType.XZ).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 10)));
        LARGE_PRISMARITE_CLUSTER = registerDefaultBlock("large_prismarite_cluster", () -> new PrismariteDoubleBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().sound(SoundType.AMETHYST).offsetType(BlockBehaviour.OffsetType.XYZ).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 10)));
        PRISMAGLASS = registerDefaultBlock("prismaglass", () -> new GlassBlock(BlockBehaviour.Properties.of(Material.GLASS).strength(0.3F).sound(SoundType.GLASS).noOcclusion().isValidSpawn(RegionsUnexploredBlocks::never).isRedstoneConductor(RegionsUnexploredBlocks::never).isSuffocating(RegionsUnexploredBlocks::never).isViewBlocking(RegionsUnexploredBlocks::never)));
        PRISMARITE_CLUSTER = registerDefaultBlock("prismarite_cluster", () -> new PrismariteBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().sound(SoundType.AMETHYST).offsetType(BlockBehaviour.OffsetType.XZ).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 10)));
        PRISMOSS_SPROUT = registerDefaultBlock("prismoss_sprout", () -> new PrismossSproutBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ)));
        //REDSTONE_BLOCKS
        POINTED_REDSTONE = registerDefaultBlock("pointed_redstone", () -> new PointedRedstoneBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_RED).noOcclusion().sound(SoundType.POINTED_DRIPSTONE).randomTicks().strength(1.5F, 3.0F).dynamicShape().offsetType(BlockBehaviour.OffsetType.XZ).lightLevel(s -> 1).isRedstoneConductor(RegionsUnexploredBlocks::always)));
        RAW_REDSTONE_BLOCK = registerDefaultBlock("raw_redstone_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_RED).sound(SoundType.TUFF).strength(1.5f).requiresCorrectToolForDrops().isRedstoneConductor(RegionsUnexploredBlocks::always)));
        REDSTONE_BUD = registerDefaultBlock("redstone_bud", () -> new RedstoneBudBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_FIREPROOF_PLANT, MaterialColor.COLOR_RED).noCollission().sound(SoundType.TUFF).offsetType(BlockBehaviour.OffsetType.XZ)));
        REDSTONE_BULB = registerDefaultBlock("redstone_bulb", () -> new RedstoneBulbBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().sound(SoundType.AMETHYST).offsetType(BlockBehaviour.OffsetType.XZ).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 12).isRedstoneConductor(RegionsUnexploredBlocks::never)));
        //OTHER_CAVE_BLOCKS
        STONE_GRASS_BLOCK = registerDefaultBlock("stone_grass_block", () -> new StoneGrassBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.GRASS).sound(SoundType.STONE).randomTicks().strength(1.5f, 6f).requiresCorrectToolForDrops()));
        DEEPSLATE_GRASS_BLOCK = registerDefaultBlock("deepslate_grass_block", () -> new DeepslateGrassBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.GRASS).sound(SoundType.DEEPSLATE).randomTicks().strength(3f, 6f).requiresCorrectToolForDrops()));
        VIRIDESCENT_NYLIUM = registerDefaultBlock("viridescent_nylium", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.GRASS).sound(SoundType.NYLIUM).strength(1.5f, 6f).requiresCorrectToolForDrops()));
        DEEPSLATE_VIRIDESCENT_NYLIUM = registerDefaultBlock("deepslate_viridescent_nylium", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.GRASS).sound(SoundType.NYLIUM).strength(3f, 6f).requiresCorrectToolForDrops()));

        /*-----------------PLANTS-----------------*/
        //GRASS_BLOCKS
        DEAD_STEPPE_SHRUB = registerDefaultBlock("dead_steppe_shrub", () -> new DeadShrubBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT, MaterialColor.WOOD).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        FROZEN_GRASS = registerDefaultBlock("frozen_grass", () -> new SnowyTallGrassBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ)));
        MEDIUM_GRASS = registerDefaultBlock("medium_grass", () -> new RuTallGrassBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ)));
        SANDY_GRASS = registerDefaultBlock("sandy_grass", () -> new SandyTallGrassBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ)));
        SEEDED_GRASS = registerDefaultBlock("seeded_grass", () -> new RuTallGrassBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ)));
        SMALL_DESERT_SHRUB = registerDefaultBlock("small_desert_shrub", () -> new DeadShrubBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT, MaterialColor.WOOD).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ)));
        STEPPE_GRASS = registerDefaultBlock("steppe_grass", () -> new RuTallGrassBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        STEPPE_SHRUB = registerDefaultBlock("steppe_shrub", () -> new RuTallGrassBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        STONE_BUD = registerDefaultBlock("stone_bud", () -> new StoneBudBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ)));
        //TALL_GRASS_BLOCKS
        ELEPHANT_EAR = registerDefaultBlock("elephant_ear", () -> new ElephantEarBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        SANDY_TALL_GRASS = registerDefaultBlock("sandy_tall_grass", () -> new SandyDoublePlantBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        SEEDED_TALL_GRASS = registerDefaultBlock("seeded_tall_grass", () -> new RuDoublePlantBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        TALL_STEPPE_GRASS = registerDefaultBlock("tall_steppe_grass", () -> new RuDoublePlantBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        //FLOWERS
        ALPHA_DANDELION = registerDefaultBlock("alpha_dandelion", () -> new RuFlowerBlock(MobEffects.JUMP, 5, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        ALPHA_ROSE = registerDefaultBlock("alpha_rose", () -> new RuFlowerBlock(MobEffects.JUMP, 5, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        BLUE_LUPINE = registerDefaultBlock("blue_lupine", () -> new RuFlowerBlock(MobEffects.SATURATION, 4, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        DAISY = registerDefaultBlock("daisy", () -> new RuFlowerBlock(MobEffects.MOVEMENT_SPEED, 8, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        DORCEL = registerDefaultBlock("dorcel", () -> new DorcelPlantBlock(MobEffects.WITHER, 20, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        FELICIA_DAISY = registerDefaultBlock("felicia_daisy", () -> new RuFlowerBlock(MobEffects.MOVEMENT_SPEED, 8, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        FIREWEED = registerDefaultBlock("fireweed", () -> new RuFlowerBlock(MobEffects.GLOWING, 2, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        HYSSOP = registerDefaultBlock("hyssop", () -> new RuFlowerBlock(MobEffects.LUCK, 10, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        PINK_LUPINE = registerDefaultBlock("pink_lupine", () -> new RuFlowerBlock(MobEffects.SATURATION, 4, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        POPPY_BUSH = registerDefaultBlock("poppy_bush", () -> new RuFlowerBlock(MobEffects.WEAKNESS, 3, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ)));
        PURPLE_LUPINE = registerDefaultBlock("purple_lupine", () -> new RuFlowerBlock(MobEffects.SATURATION, 4, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        RED_LUPINE = registerDefaultBlock("red_lupine", () -> new RuFlowerBlock(MobEffects.SATURATION, 4, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        WARATAH = registerDefaultBlock("waratah", () -> new RuFlowerBlock(MobEffects.JUMP, 5, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        WHITE_TRILLIUM = registerDefaultBlock("white_trillium", () -> new RuFlowerBlock(MobEffects.DIG_SPEED, 7, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        WILTING_TRILLIUM = registerDefaultBlock("wilting_trillium", () -> new RuFlowerBlock(MobEffects.DIG_SLOWDOWN, 4, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        YELLOW_LUPINE = registerDefaultBlock("yellow_lupine", () -> new RuFlowerBlock(MobEffects.SATURATION, 4, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));

        RED_CHERRY_FLOWERS = registerDefaultBlock("red_cherry_flowers", () -> new GlowLichenBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().strength(0.2F).sound(SoundType.GLOW_LICHEN)));
        PINK_CHERRY_FLOWERS = registerDefaultBlock("pink_cherry_flowers", () -> new GlowLichenBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().strength(0.2F).sound(SoundType.GLOW_LICHEN)));
        WHITE_CHERRY_FLOWERS = registerDefaultBlock("white_cherry_flowers", () -> new GlowLichenBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().strength(0.2F).sound(SoundType.GLOW_LICHEN)));
        //TALL_PLANTS
        BARLEY = registerDefaultBlock("barley", () -> new RuDoublePlantBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        CATTAIL = registerDefaultBlock("cattail", () -> new CattailBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        TASSEL = registerDefaultBlock("tassel", () -> new RuDoubleFlowerBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        TSUBAKI = registerDefaultBlock("tsubaki", () -> new RuDoubleFlowerBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        //SAPLINGS
        ALPHA_SAPLING = registerDefaultBlock("alpha_sapling", () -> new RuSaplingBlock(new AlphaOakGrower()));
        APPLE_OAK_SAPLING = registerDefaultBlock("apple_oak_sapling", () -> new RuSaplingBlock(new AppleOakTreeGrower()));
        BAMBOO_SAPLING = registerDefaultBlock("bamboo_sapling", () -> new RuSaplingBlock(new GiantBambooGrower()));
        BAOBAB_SAPLING = registerDefaultBlock("baobab_sapling", () -> new RuSaplingBlock(new BaobabTreeGrower()));
        BLACKWOOD_SAPLING = registerDefaultBlock("blackwood_sapling", () -> new RuSaplingBlock(new BlackwoodTreeGrower()));
        CACTUS_FLOWER = registerDefaultBlock("cactus_flower", () -> new CactusSaplingBlock(new SaguaroCactusGrower()));
        CHERRY_SAPLING = registerDefaultBlock("cherry_sapling", () -> new RuSaplingBlock(new CherryTreeGrower()));
        CYPRESS_SAPLING = registerDefaultBlock("cypress_sapling", () -> new RuSaplingBlock(new CypressTreeGrower()));
        DEAD_PINE_SAPLING = registerDefaultBlock("dead_pine_sapling", () -> new RuSaplingBlock(new DeadPineTreeGrower()));
        DEAD_SAPLING = registerDefaultBlock("dead_sapling", () -> new RuSaplingBlock(new DeadTreeGrower()));
        EUCALYPTUS_SAPLING = registerDefaultBlock("eucalyptus_sapling", () -> new RuSaplingBlock(new EucalyptusTreeGrower()));
        FLOWERING_SAPLING = registerDefaultBlock("flowering_sapling", () -> new RuSaplingBlock(new FloweringTreeGrower()));
        GOLDEN_LARCH_SAPLING = registerDefaultBlock("golden_larch_sapling", () -> new RuSaplingBlock(new GoldenLarchTreeGrower()));
        JOSHUA_SAPLING = registerDefaultBlock("joshua_sapling", () -> new RuSaplingBlock(new JoshuaTreeGrower()));
        LARCH_SAPLING = registerDefaultBlock("larch_sapling", () -> new RuSaplingBlock(new LarchTreeGrower()));
        MAPLE_SAPLING = registerDefaultBlock("maple_sapling", () -> new RuSaplingBlock(new MapleTreeGrower()));
        MAUVE_SAPLING = registerDefaultBlock("mauve_sapling", () -> new RuSaplingBlock(new MauveOakGrower()));
        ORANGE_MAPLE_SAPLING = registerDefaultBlock("orange_maple_sapling", () -> new RuSaplingBlock(new OrangeMapleTreeGrower()));
        PALM_SAPLING = registerDefaultBlock("palm_sapling", () -> new RuSaplingBlock(new PalmTreeGrower()));
        PINE_SAPLING = registerDefaultBlock("pine_sapling", () -> new RuSaplingBlock(new PineTreeGrower()));
        PINK_CHERRY_SAPLING = registerDefaultBlock("pink_cherry_sapling", () -> new RuSaplingBlock(new PinkCherryTreeGrower()));
        REDWOOD_SAPLING = registerDefaultBlock("redwood_sapling", () -> new RuSaplingBlock(new RedwoodTreeGrower()));
        RED_CHERRY_SAPLING = registerDefaultBlock("red_cherry_sapling", () -> new RuSaplingBlock(new RedCherryTreeGrower()));
        RED_MAPLE_SAPLING = registerDefaultBlock("red_maple_sapling", () -> new RuSaplingBlock(new RedMapleTreeGrower()));
        BRIMWOOD_SAPLING = registerDefaultBlock("brimwood_sapling", () -> new BrimSaplingBlock(new BrimwoodGrower()));
        SILVER_BIRCH_SAPLING = registerDefaultBlock("silver_birch_sapling", () -> new RuSaplingBlock(new SilverBirchTreeGrower()));
        WHITE_CHERRY_SAPLING = registerDefaultBlock("white_cherry_sapling", () -> new RuSaplingBlock(new WhiteCherryTreeGrower()));
        WILLOW_SAPLING = registerDefaultBlock("willow_sapling", () -> new RuSaplingBlock(new WillowTreeGrower()));
        //TALL_SAPLINGS
        TALL_ACACIA_SAPLING = registerDefaultBlock("tall_acacia_sapling", () -> new DoubleTallSaplingBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        TALL_BAOBAB_SAPLING = registerDefaultBlock("tall_baobab_sapling", () -> new DoubleTallSaplingBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        TALL_BIRCH_SAPLING = registerDefaultBlock("tall_birch_sapling", () -> new DoubleTallSaplingBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        TALL_BLACKWOOD_SAPLING = registerDefaultBlock("tall_blackwood_sapling", () -> new DoubleTallSaplingBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        TALL_CHERRY_SAPLING = registerDefaultBlock("tall_cherry_sapling", () -> new DoubleTallSaplingBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        TALL_CYPRESS_SAPLING = registerDefaultBlock("tall_cypress_sapling", () -> new DoubleTallSaplingBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        TALL_DARK_OAK_SAPLING = registerDefaultBlock("tall_dark_oak_sapling", () -> new DoubleTallSaplingBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        TALL_DEAD_PINE_SAPLING = registerDefaultBlock("tall_dead_pine_sapling", () -> new DoubleTallSaplingBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        TALL_DEAD_SAPLING = registerDefaultBlock("tall_dead_sapling", () -> new DoubleTallSaplingBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        TALL_EUCALYPTUS_SAPLING = registerDefaultBlock("tall_eucalyptus_sapling", () -> new DoubleTallSaplingBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        TALL_FLOWERING_SAPLING = registerDefaultBlock("tall_flowering_sapling", () -> new DoubleTallSaplingBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        TALL_GOLDEN_LARCH_SAPLING = registerDefaultBlock("tall_golden_larch_sapling", () -> new DoubleTallSaplingBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        TALL_JOSHUA_SAPLING = registerDefaultBlock("tall_joshua_sapling", () -> new DoubleTallSaplingBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        TALL_JUNGLE_SAPLING = registerDefaultBlock("tall_jungle_sapling", () -> new DoubleTallSaplingBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        TALL_LARCH_SAPLING = registerDefaultBlock("tall_larch_sapling", () -> new DoubleTallSaplingBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        TALL_MANGROVE_SAPLING = registerDefaultBlock("tall_mangrove_sapling", () -> new DoubleTallSaplingBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        TALL_MAPLE_SAPLING = registerDefaultBlock("tall_maple_sapling", () -> new DoubleTallSaplingBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        TALL_MAUVE_SAPLING = registerDefaultBlock("tall_mauve_sapling", () -> new DoubleTallSaplingBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        TALL_OAK_SAPLING = registerDefaultBlock("tall_oak_sapling", () -> new DoubleTallSaplingBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        TALL_ORANGE_MAPLE_SAPLING = registerDefaultBlock("tall_orange_maple_sapling", () -> new DoubleTallSaplingBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        TALL_PALM_SAPLING = registerDefaultBlock("tall_palm_sapling", () -> new DoubleTallSaplingBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        TALL_PINE_SAPLING = registerDefaultBlock("tall_pine_sapling", () -> new DoubleTallSaplingBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        TALL_PINK_CHERRY_SAPLING = registerDefaultBlock("tall_pink_cherry_sapling", () -> new DoubleTallSaplingBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        TALL_REDWOOD_SAPLING = registerDefaultBlock("tall_redwood_sapling", () -> new DoubleTallSaplingBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        TALL_RED_CHERRY_SAPLING = registerDefaultBlock("tall_red_cherry_sapling", () -> new DoubleTallSaplingBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        TALL_RED_MAPLE_SAPLING = registerDefaultBlock("tall_red_maple_sapling", () -> new DoubleTallSaplingBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        TALL_SILVER_BIRCH_SAPLING = registerDefaultBlock("tall_silver_birch_sapling", () -> new DoubleTallSaplingBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        TALL_SPRUCE_SAPLING = registerDefaultBlock("tall_spruce_sapling", () -> new DoubleTallSaplingBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        TALL_WHITE_CHERRY_SAPLING = registerDefaultBlock("tall_white_cherry_sapling", () -> new DoubleTallSaplingBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        TALL_WILLOW_SAPLING = registerDefaultBlock("tall_willow_sapling", () -> new DoubleTallSaplingBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        //MUSHROOMS
        BLUE_BIOSHROOM = registerDefaultBlock("blue_bioshroom", () -> new BioshroomBlock(new BlueBioshroomGrower(), MobEffects.POISON, 10, BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_LIGHT_BLUE).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 10)));
        GREEN_BIOSHROOM = registerDefaultBlock("green_bioshroom", () -> new BioshroomBlock(new GreenBioshroomGrower(), MobEffects.POISON, 10, BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_LIGHT_GREEN).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 10)));
        PINK_BIOSHROOM = registerDefaultBlock("pink_bioshroom", () -> new BioshroomBlock(new PinkBioshroomGrower(), MobEffects.POISON, 10, BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_PINK).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 10)));
        YELLOW_BIOSHROOM = registerDefaultBlock("yellow_bioshroom", () -> new BioshroomBlock(new YellowBioshroomGrower(), MobEffects.POISON, 10, BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_YELLOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 10)));
        TALL_BLUE_BIOSHROOM = registerDefaultBlock("tall_blue_bioshroom", () -> new DoubleBioshroomBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 10)));
        TALL_GREEN_BIOSHROOM = registerDefaultBlock("tall_green_bioshroom", () -> new DoubleBioshroomBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 10)));
        TALL_PINK_BIOSHROOM = registerDefaultBlock("tall_pink_bioshroom", () -> new DoubleBioshroomBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 10)));
        TALL_YELLOW_BIOSHROOM = registerDefaultBlock("tall_yellow_bioshroom", () -> new DoubleBioshroomBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 10)));
        //OTHER_PLANT_BLOCKS
        BARREL_CACTUS = registerDefaultBlock("barrel_cactus", () -> new BarrelCactusBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        CAVE_HYSSOP = registerDefaultBlock("cave_hyssop", () -> new CaveFlowerBlock(MobEffects.LUCK, 10, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
        DUCKWEED = registerDuckweedBlock("duckweed", () -> new DuckweedBlock());
        SPANISH_MOSS = registerDefaultBlock("spanish_moss", () -> new SpanishMossBlock(BlockBehaviour.Properties.of(Material.PLANT).randomTicks().noCollission().instabreak().sound(SoundType.AZALEA_LEAVES)));
        SPANISH_MOSS_PLANT = RegionsUnexploredMod.BLOCKS.register("spanish_moss_plant", () -> new SpanishMossPlantBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.AZALEA_LEAVES)));

        /*-----------------POTTED_PLANTS-----------------*/
        //POTTED_FLOWERS
        POTTED_ALPHA_DANDELION = RegionsUnexploredMod.BLOCKS.register("potted_alpha_dandelion", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.ALPHA_DANDELION, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
        POTTED_ALPHA_ROSE = RegionsUnexploredMod.BLOCKS.register("potted_alpha_rose", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.ALPHA_ROSE, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
        POTTED_BLUE_LUPINE = RegionsUnexploredMod.BLOCKS.register("potted_blue_lupine", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.BLUE_LUPINE, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
        POTTED_DAISY = RegionsUnexploredMod.BLOCKS.register("potted_daisy", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.DAISY, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
        POTTED_DORCEL = RegionsUnexploredMod.BLOCKS.register("potted_dorcel", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.DORCEL, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
        POTTED_FELICIA_DAISY = RegionsUnexploredMod.BLOCKS.register("potted_felicia_daisy", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.FELICIA_DAISY, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
        POTTED_FIREWEED = RegionsUnexploredMod.BLOCKS.register("potted_fireweed", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.FIREWEED, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
        POTTED_HYSSOP = RegionsUnexploredMod.BLOCKS.register("potted_hyssop", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.HYSSOP, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
        POTTED_PINK_LUPINE = RegionsUnexploredMod.BLOCKS.register("potted_pink_lupine", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.PINK_LUPINE, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
        POTTED_POPPY_BUSH = RegionsUnexploredMod.BLOCKS.register("potted_poppy_bush", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.POPPY_BUSH, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
        POTTED_PURPLE_LUPINE = RegionsUnexploredMod.BLOCKS.register("potted_purple_lupine", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.PURPLE_LUPINE, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
        POTTED_RED_LUPINE = RegionsUnexploredMod.BLOCKS.register("potted_red_lupine", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.RED_LUPINE, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
        POTTED_WARATAH = RegionsUnexploredMod.BLOCKS.register("potted_waratah", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.WARATAH, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
        POTTED_WHITE_TRILLIUM = RegionsUnexploredMod.BLOCKS.register("potted_white_trillium", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.WHITE_TRILLIUM, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
        POTTED_WILTING_TRILLIUM = RegionsUnexploredMod.BLOCKS.register("potted_wilting_trillium", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.WILTING_TRILLIUM, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
        POTTED_YELLOW_LUPINE = RegionsUnexploredMod.BLOCKS.register("potted_yellow_lupine", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.YELLOW_LUPINE, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
        //POTTED_SAPLINGS
        POTTED_ALPHA_SAPLING = RegionsUnexploredMod.BLOCKS.register("potted_alpha_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.ALPHA_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
        POTTED_APPLE_OAK_SAPLING = RegionsUnexploredMod.BLOCKS.register("potted_apple_oak_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.APPLE_OAK_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
        POTTED_BAMBOO_SAPLING = RegionsUnexploredMod.BLOCKS.register("potted_bamboo_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.BAMBOO_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
        POTTED_BAOBAB_SAPLING = RegionsUnexploredMod.BLOCKS.register("potted_baobab_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.BAOBAB_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
        POTTED_BLACKWOOD_SAPLING = RegionsUnexploredMod.BLOCKS.register("potted_blackwood_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.BLACKWOOD_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
        POTTED_CACTUS_FLOWER = RegionsUnexploredMod.BLOCKS.register("potted_cactus_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.CACTUS_FLOWER, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
        POTTED_CHERRY_SAPLING = RegionsUnexploredMod.BLOCKS.register("potted_cherry_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.CHERRY_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
        POTTED_CYPRESS_SAPLING = RegionsUnexploredMod.BLOCKS.register("potted_cypress_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.CYPRESS_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
        POTTED_DEAD_PINE_SAPLING = RegionsUnexploredMod.BLOCKS.register("potted_dead_pine_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.DEAD_PINE_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
        POTTED_DEAD_SAPLING = RegionsUnexploredMod.BLOCKS.register("potted_dead_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.DEAD_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
        POTTED_EUCALYPTUS_SAPLING = RegionsUnexploredMod.BLOCKS.register("potted_eucalyptus_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.EUCALYPTUS_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
        POTTED_FLOWERING_SAPLING = RegionsUnexploredMod.BLOCKS.register("potted_flowering_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.FLOWERING_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
        POTTED_GOLDEN_LARCH_SAPLING = RegionsUnexploredMod.BLOCKS.register("potted_golden_larch_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.GOLDEN_LARCH_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
        POTTED_JOSHUA_SAPLING = RegionsUnexploredMod.BLOCKS.register("potted_joshua_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.JOSHUA_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
        POTTED_LARCH_SAPLING = RegionsUnexploredMod.BLOCKS.register("potted_larch_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.LARCH_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
        POTTED_MAPLE_SAPLING = RegionsUnexploredMod.BLOCKS.register("potted_maple_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.MAPLE_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
        POTTED_MAUVE_SAPLING = RegionsUnexploredMod.BLOCKS.register("potted_mauve_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.MAUVE_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
        POTTED_ORANGE_MAPLE_SAPLING = RegionsUnexploredMod.BLOCKS.register("potted_orange_maple_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.ORANGE_MAPLE_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
        POTTED_PALM_SAPLING = RegionsUnexploredMod.BLOCKS.register("potted_palm_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.PALM_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
        POTTED_PINE_SAPLING = RegionsUnexploredMod.BLOCKS.register("potted_pine_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.PINE_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
        POTTED_PINK_CHERRY_SAPLING = RegionsUnexploredMod.BLOCKS.register("potted_pink_cherry_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.PINK_CHERRY_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
        POTTED_REDWOOD_SAPLING = RegionsUnexploredMod.BLOCKS.register("potted_redwood_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.REDWOOD_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
        POTTED_RED_CHERRY_SAPLING = RegionsUnexploredMod.BLOCKS.register("potted_red_cherry_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.RED_CHERRY_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
        POTTED_RED_MAPLE_SAPLING = RegionsUnexploredMod.BLOCKS.register("potted_red_maple_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.RED_MAPLE_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
        POTTED_BRIMWOOD_SAPLING = RegionsUnexploredMod.BLOCKS.register("potted_brimwood_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.BRIMWOOD_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
        POTTED_SILVER_BIRCH_SAPLING = RegionsUnexploredMod.BLOCKS.register("potted_silver_birch_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.SILVER_BIRCH_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
        POTTED_WHITE_CHERRY_SAPLING = RegionsUnexploredMod.BLOCKS.register("potted_white_cherry_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.WHITE_CHERRY_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
        POTTED_WILLOW_SAPLING = RegionsUnexploredMod.BLOCKS.register("potted_willow_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.WILLOW_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
        //POTTED_MUSHROOMS
        POTTED_BLUE_BIOSHROOM = RegionsUnexploredMod.BLOCKS.register("potted_blue_bioshroom", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.BLUE_BIOSHROOM, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE).lightLevel(s -> 10)));
        POTTED_GREEN_BIOSHROOM = RegionsUnexploredMod.BLOCKS.register("potted_green_bioshroom", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.GREEN_BIOSHROOM, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE).lightLevel(s -> 10)));
        POTTED_PINK_BIOSHROOM = RegionsUnexploredMod.BLOCKS.register("potted_pink_bioshroom", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.PINK_BIOSHROOM, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE).lightLevel(s -> 10)));
        POTTED_YELLOW_BIOSHROOM = RegionsUnexploredMod.BLOCKS.register("potted_yellow_bioshroom", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.YELLOW_BIOSHROOM, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE).lightLevel(s -> 10)));
        //OTHER_POTTED_PLANTS
        POTTED_BARREL_CACTUS = RegionsUnexploredMod.BLOCKS.register("potted_barrel_cactus", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.BARREL_CACTUS, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS)));
        POTTED_CAVE_HYSSOP = RegionsUnexploredMod.BLOCKS.register("potted_cave_hyssop", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.CAVE_HYSSOP, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));

        /*-----------------PLANT_BLOCKS-----------------*/
        //MUSHROOMS
        BLUE_BIOSHROOM_BLOCK = registerDefaultBlock("blue_bioshroom_block", () -> new Block(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_BLUE).sound(SoundType.WART_BLOCK).strength(0.6f)));
        GREEN_BIOSHROOM_BLOCK = registerDefaultBlock("green_bioshroom_block", () -> new Block(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_GREEN).sound(SoundType.WART_BLOCK).strength(0.6f)));
        PINK_BIOSHROOM_BLOCK = registerDefaultBlock("pink_bioshroom_block", () -> new Block(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_PINK).sound(SoundType.WART_BLOCK).strength(0.6f)));
        YELLOW_BIOSHROOM_BLOCK = registerDefaultBlock("yellow_bioshroom_block", () -> new Block(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_YELLOW).sound(SoundType.WART_BLOCK).strength(0.6f)));
        GLOWING_BLUE_BIOSHROOM_BLOCK = registerDefaultBlock("glowing_blue_bioshroom_block", () -> new Block(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_BLUE).sound(SoundType.WART_BLOCK).strength(0.6f).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 15)));
        GLOWING_GREEN_BIOSHROOM_BLOCK = registerDefaultBlock("glowing_green_bioshroom_block", () -> new Block(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_GREEN).sound(SoundType.WART_BLOCK).strength(0.6f).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 15)));
        GLOWING_PINK_BIOSHROOM_BLOCK = registerDefaultBlock("glowing_pink_bioshroom_block", () -> new Block(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_PINK).sound(SoundType.WART_BLOCK).strength(0.6f).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 15)));
        GLOWING_YELLOW_BIOSHROOM_BLOCK = registerDefaultBlock("glowing_yellow_bioshroom_block", () -> new Block(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_YELLOW).sound(SoundType.WART_BLOCK).strength(0.6f).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 15)));
        //BAMBOO
        BAMBOO_LOG = registerDefaultBlock("bamboo_log", BambooLogBlock::new);
        STRIPPED_BAMBOO_LOG = registerDefaultBlock("stripped_bamboo_log", StrippedBambooLogBlock::new);
        //TODO:REMOVE BELOW BLOCK
        BAMBOO_LOG_LEAVES = registerDefaultBlock("bamboo_log_leaves", BambooLogBlock::new);
        //CACTUS
        SAGUARO_CACTUS = registerDefaultBlock("saguaro_cactus", () -> new SaguaroCactusBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_LIGHT_GREEN).sound(SoundType.WOOL).strength(2f)));
        //TODO:REMOVE BELOW BLOCK
        SAGUARO_CACTUS_CORNER = registerDefaultBlock("saguaro_cactus_corner", () -> new CactusCornerBlock());

        /*-----------------LEAVES-----------------*/
        ALPHA_LEAVES = registerDefaultBlock("alpha_leaves", () -> leaves(MaterialColor.COLOR_LIGHT_GREEN));
        APPLE_OAK_LEAVES = registerDefaultBlock("apple_oak_leaves", () -> appleLeaves(MaterialColor.PLANT));
        BAMBOO_LEAVES = registerDefaultBlock("bamboo_leaves", () -> leaves(MaterialColor.PLANT));
        BAOBAB_LEAVES = registerDefaultBlock("baobab_leaves", () -> leaves(MaterialColor.PLANT));
        BLACKWOOD_LEAVES = registerDefaultBlock("blackwood_leaves", () -> leaves(MaterialColor.TERRACOTTA_GREEN));
        CHERRY_LEAVES = registerDefaultBlock("cherry_leaves", () -> leaves(MaterialColor.PLANT));
        CYPRESS_LEAVES = registerDefaultBlock("cypress_leaves", () -> leaves(MaterialColor.PLANT));
        DEAD_LEAVES = registerDefaultBlock("dead_leaves", () -> leaves(MaterialColor.TERRACOTTA_GRAY));
        DEAD_PINE_LEAVES = registerDefaultBlock("dead_pine_leaves", () -> leaves(MaterialColor.TERRACOTTA_GRAY));
        EUCALYPTUS_LEAVES = registerDefaultBlock("eucalyptus_leaves", () -> leaves(MaterialColor.PLANT));
        FLOWERING_LEAVES = registerDefaultBlock("flowering_leaves", () -> leaves(MaterialColor.PLANT));
        GOLDEN_LARCH_LEAVES = registerDefaultBlock("golden_larch_leaves", () -> leaves(MaterialColor.COLOR_YELLOW));
        JOSHUA_LEAVES = registerDefaultBlock("joshua_leaves", () -> joshuaLeaves(MaterialColor.PLANT));
        LARCH_LEAVES = registerDefaultBlock("larch_leaves", () -> leaves(MaterialColor.PLANT));
        MAPLE_LEAVES = registerDefaultBlock("maple_leaves", () -> leaves(MaterialColor.PLANT));
        MAUVE_LEAVES = registerDefaultBlock("mauve_leaves", () -> mauveLeaves(MaterialColor.COLOR_PURPLE));
        ORANGE_MAPLE_LEAVES = registerDefaultBlock("orange_maple_leaves", () -> leaves(MaterialColor.COLOR_ORANGE));
        PALM_LEAVES = registerDefaultBlock("palm_leaves", () -> leaves(MaterialColor.PLANT));
        PINE_LEAVES = registerDefaultBlock("pine_leaves", () -> leaves(MaterialColor.PLANT));
        PINK_CHERRY_LEAVES = registerDefaultBlock("pink_cherry_leaves", () -> cherryLeaves(MaterialColor.COLOR_PINK));
        REDWOOD_LEAVES = registerDefaultBlock("redwood_leaves", () -> leaves(MaterialColor.PLANT));
        RED_CHERRY_LEAVES = registerDefaultBlock("red_cherry_leaves", () -> cherryLeaves(MaterialColor.COLOR_RED));
        RED_MAPLE_LEAVES = registerDefaultBlock("red_maple_leaves", () -> leaves(MaterialColor.COLOR_RED));
        BRIMWOOD_LEAVES = registerDefaultBlock("brimwood_leaves", () -> sculkLeaves(MaterialColor.COLOR_BLUE));
        SILVER_BIRCH_LEAVES = registerDefaultBlock("silver_birch_leaves", () -> leaves(MaterialColor.COLOR_YELLOW));
        WHITE_CHERRY_LEAVES = registerDefaultBlock("white_cherry_leaves", () -> cherryLeaves(MaterialColor.TERRACOTTA_WHITE));
        WILLOW_LEAVES = registerDefaultBlock("willow_leaves", () -> leaves(MaterialColor.PLANT));

        /*-----------------BRANCHES-----------------*/
        ACACIA_BRANCH = registerDefaultBlock("acacia_branch", () -> new BranchBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().sound(SoundType.GRASS).strength(1.0F, 1.5F).dynamicShape()));
        BAOBAB_BRANCH = registerDefaultBlock("baobab_branch", () -> new BranchBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().sound(SoundType.GRASS).strength(1.0F, 1.5F).dynamicShape()));
        BIRCH_BRANCH = registerDefaultBlock("birch_branch", () -> new BranchBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().sound(SoundType.GRASS).strength(1.0F, 1.5F).dynamicShape()));
        BLACKWOOD_BRANCH = registerDefaultBlock("blackwood_branch", () -> new BranchBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().sound(SoundType.GRASS).strength(1.0F, 1.5F).dynamicShape()));
        CHERRY_BRANCH = registerDefaultBlock("cherry_branch", () -> new BranchBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().sound(SoundType.GRASS).strength(1.0F, 1.5F).dynamicShape()));
        CYPRESS_BRANCH = registerDefaultBlock("cypress_branch", () -> new BranchBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().sound(SoundType.GRASS).strength(1.0F, 1.5F).dynamicShape()));
        DARK_OAK_BRANCH = registerDefaultBlock("dark_oak_branch", () -> new BranchBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().sound(SoundType.GRASS).strength(1.0F, 1.5F).dynamicShape()));
        DEAD_BRANCH = registerDefaultBlock("dead_branch", () -> new BranchBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().sound(SoundType.GRASS).strength(1.0F, 1.5F).dynamicShape()));
        EUCALYPTUS_BRANCH = registerDefaultBlock("eucalyptus_branch", () -> new BranchBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().sound(SoundType.GRASS).strength(1.0F, 1.5F).dynamicShape()));
        JOSHUA_BEARD = registerDefaultBlock("joshua_beard", () -> new BranchBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().sound(SoundType.GRASS).strength(1.0F, 1.5F).dynamicShape()));
        JUNGLE_BRANCH = registerDefaultBlock("jungle_branch", () -> new BranchBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().sound(SoundType.GRASS).strength(1.0F, 1.5F).dynamicShape()));
        LARCH_BRANCH = registerDefaultBlock("larch_branch", () -> new BranchBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().sound(SoundType.GRASS).strength(1.0F, 1.5F).dynamicShape()));
        MANGROVE_BRANCH = registerDefaultBlock("mangrove_branch", () -> new BranchBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().sound(SoundType.GRASS).strength(1.0F, 1.5F).dynamicShape()));
        MAPLE_BRANCH = registerDefaultBlock("maple_branch", () -> new BranchBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().sound(SoundType.GRASS).strength(1.0F, 1.5F).dynamicShape()));
        MAUVE_BRANCH = registerDefaultBlock("mauve_branch", () -> new BranchBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().sound(SoundType.GRASS).strength(1.0F, 1.5F).dynamicShape()));
        OAK_BRANCH = registerDefaultBlock("oak_branch", () -> new BranchBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().sound(SoundType.GRASS).strength(1.0F, 1.5F).dynamicShape()));
        PALM_BEARD = registerDefaultBlock("palm_beard", () -> new BranchBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().sound(SoundType.GRASS).strength(1.0F, 1.5F).dynamicShape()));
        PINE_BRANCH = registerDefaultBlock("pine_branch", () -> new BranchBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().sound(SoundType.GRASS).strength(1.0F, 1.5F).dynamicShape()));
        REDWOOD_BRANCH = registerDefaultBlock("redwood_branch", () -> new BranchBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().sound(SoundType.GRASS).strength(1.0F, 1.5F).dynamicShape()));
        SPRUCE_BRANCH = registerDefaultBlock("spruce_branch", () -> new BranchBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().sound(SoundType.GRASS).strength(1.0F, 1.5F).dynamicShape()));
        WILLOW_BRANCH = registerDefaultBlock("willow_branch", () -> new BranchBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().sound(SoundType.GRASS).strength(1.0F, 1.5F).dynamicShape()));

        /*-----------------DIRT_BLOCKS-----------------*/
        //FOREST_DIRT_BLOCKS
        FOREST_GRASS_BLOCK = registerDefaultBlock("forest_grass_block", () -> new ForestGrassBlock(BlockBehaviour.Properties.of(Material.GRASS, MaterialColor.GRASS).randomTicks().strength(0.6F).sound(SoundType.GRASS)));
        FOREST_DIRT = registerDefaultBlock("forest_dirt", () -> new TillableDirtBlock(BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.DIRT).strength(0.5F).sound(SoundType.GRAVEL).randomTicks()));
        FOREST_DIRT_PATH = registerDefaultBlock("forest_dirt_path", () -> new ForestDirtPathBlock(BlockBehaviour.Properties.of(Material.DIRT).strength(0.65F).sound(SoundType.GRASS).isViewBlocking(RegionsUnexploredBlocks::always).isSuffocating(RegionsUnexploredBlocks::always)));
        FOREST_COARSE_DIRT = registerDefaultBlock("forest_coarse_dirt", () -> new TillableDirtBlock(BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.DIRT).strength(0.5F).sound(SoundType.GRAVEL)));
        FOREST_MUD = registerDefaultBlock("forest_mud", () -> new RuMudBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).color(MaterialColor.TERRACOTTA_BROWN).randomTicks().isValidSpawn(RegionsUnexploredBlocks::always).isRedstoneConductor(RegionsUnexploredBlocks::always).isViewBlocking(RegionsUnexploredBlocks::always).isSuffocating(RegionsUnexploredBlocks::always).sound(SoundType.MUD)));
        FOREST_FARMLAND = registerDefaultBlock("forest_farmland", () -> new ForestFarmBlock(BlockBehaviour.Properties.of(Material.DIRT).randomTicks().strength(0.6F).sound(SoundType.GRAVEL).isViewBlocking(RegionsUnexploredBlocks::always).isSuffocating(RegionsUnexploredBlocks::always)));
        //PLAINS_DIRT_BLOCKS
        PLAINS_GRASS_BLOCK = registerDefaultBlock("plains_grass_block", () -> new PlainsGrassBlock(BlockBehaviour.Properties.of(Material.GRASS, MaterialColor.GRASS).randomTicks().strength(0.6F).sound(SoundType.GRASS)));
        PLAINS_DIRT = registerDefaultBlock("plains_dirt", () -> new TillableDirtBlock(BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.DIRT).strength(0.5F).sound(SoundType.GRAVEL).randomTicks()));
        PLAINS_DIRT_PATH = registerDefaultBlock("plains_dirt_path", () -> new PlainsDirtPathBlock(BlockBehaviour.Properties.of(Material.DIRT).strength(0.65F).sound(SoundType.GRASS).isViewBlocking(RegionsUnexploredBlocks::always).isSuffocating(RegionsUnexploredBlocks::always)));
        PLAINS_COARSE_DIRT = registerDefaultBlock("plains_coarse_dirt", () -> new TillableDirtBlock(BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.DIRT).strength(0.5F).sound(SoundType.GRAVEL)));
        PLAINS_MUD = registerDefaultBlock("plains_mud", () -> new RuMudBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).color(MaterialColor.TERRACOTTA_YELLOW).randomTicks().isValidSpawn(RegionsUnexploredBlocks::always).isRedstoneConductor(RegionsUnexploredBlocks::always).isViewBlocking(RegionsUnexploredBlocks::always).isSuffocating(RegionsUnexploredBlocks::always).sound(SoundType.MUD)));
        PLAINS_FARMLAND = registerDefaultBlock("plains_farmland", () -> new PlainsFarmBlock(BlockBehaviour.Properties.of(Material.DIRT).randomTicks().strength(0.6F).sound(SoundType.GRAVEL).isViewBlocking(RegionsUnexploredBlocks::always).isSuffocating(RegionsUnexploredBlocks::always)));
        //OTHER_DIRT_BLOCKS
        ALPHA_GRASS_BLOCK = registerDefaultBlock("alpha_grass_block", () -> new AlphaGrassBlock(BlockBehaviour.Properties.of(Material.GRASS, MaterialColor.GRASS).randomTicks().strength(0.6F).sound(SoundType.GRAVEL)));

        /*-----------------STONE_BLOCKS-----------------*/
        //CHALKS
        CHALK = registerDefaultBlock("chalk", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE).sound(SoundType.TUFF).strength(0.5f).requiresCorrectToolForDrops()));
        CHALK_GRASS_BLOCK = registerDefaultBlock("chalk_grass_block", () -> new ChalkGrassBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.GRASS).sound(SoundType.TUFF).randomTicks().strength(0.6f).requiresCorrectToolForDrops()));
        CHALK_BRICKS = registerDefaultBlock("chalk_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE).sound(SoundType.TUFF).strength(0.6f).requiresCorrectToolForDrops()));
        CHALK_BRICK_SLAB = registerDefaultBlock("chalk_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE).sound(SoundType.TUFF).strength(0.6f).requiresCorrectToolForDrops()));
        CHALK_BRICK_STAIRS = registerDefaultBlock("chalk_brick_stairs", () -> new StairBlock(CHALK.get().defaultBlockState(), BlockBehaviour.Properties.copy(CHALK_BRICKS.get())));
        CHALK_PILLAR = registerDefaultBlock("chalk_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE).sound(SoundType.TUFF).strength(0.6f).requiresCorrectToolForDrops()));
        CHALK_SLAB = registerDefaultBlock("chalk_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE).sound(SoundType.TUFF).strength(0.5f).requiresCorrectToolForDrops()));
        CHALK_STAIRS = registerDefaultBlock("chalk_stairs", () -> new StairBlock(CHALK.get().defaultBlockState(), BlockBehaviour.Properties.copy(CHALK.get())));
        POLISHED_CHALK = registerDefaultBlock("polished_chalk", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE).sound(SoundType.TUFF).strength(0.5f).requiresCorrectToolForDrops()));
        POLISHED_CHALK_SLAB = registerDefaultBlock("polished_chalk_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE).sound(SoundType.TUFF).strength(0.5f).requiresCorrectToolForDrops()));
        POLISHED_CHALK_STAIRS = registerDefaultBlock("polished_chalk_stairs", () -> new StairBlock(CHALK.get().defaultBlockState(), BlockBehaviour.Properties.copy(POLISHED_CHALK.get())));
        //MOSSY_STONES
        MOSSY_STONE = registerDefaultBlock("mossy_stone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE).sound(SoundType.STONE).strength(1.5f, 6f).requiresCorrectToolForDrops()));

        /*-----------------OTHER_BLOCKS-----------------*/
        ASH = registerDefaultBlock("ash", () -> new AshBlock(BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.COLOR_GRAY).strength(0.5F).sound(SoundType.GRAVEL).randomTicks()));
        ASH_VENT = registerDefaultBlock("ash_vent", () -> new AshVentBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK).strength(1.6F).sound(SoundType.BASALT).randomTicks().requiresCorrectToolForDrops()));
        QUICKSAND = registerDefaultBlock("quicksand", () -> new QuicksandBlock(BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.SAND).strength(0.5F).sound(SoundType.GRAVEL).requiresCorrectToolForDrops().randomTicks().noCollission().isSuffocating(RegionsUnexploredBlocks::always).isViewBlocking(RegionsUnexploredBlocks::always).isValidSpawn(RegionsUnexploredBlocks::never)));
        VOLCANIC_ASH = registerDefaultBlock("volcanic_ash", () -> new AshBlock(BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.COLOR_BLACK).strength(0.5F).sound(SoundType.GRAVEL).randomTicks()));

        /*-----------------WOOD_TYPES-----------------*/
        //SILVER_BIRCH
        SILVER_BIRCH_LOG_BASE = registerDefaultBlock("silver_birch_log_base", () -> log(MaterialColor.SAND, MaterialColor.QUARTZ));
        //ALPHA_BLOCKS
        ALPHA_LOG = registerDefaultBlock("alpha_log", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD)));
        ALPHA_PLANKS = registerDefaultBlock("alpha_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
        ALPHA_STAIRS = registerDefaultBlock("alpha_stairs", () -> woodStairs(MaterialColor.WOOD));
        ALPHA_SLAB = registerDefaultBlock("alpha_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.WOOD).strength(1.5F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
        //BAOBAB_BLOCKS
        BAOBAB_LOG = registerDefaultBlock("baobab_log", () -> log(MaterialColor.WOOD, MaterialColor.TERRACOTTA_LIGHT_GRAY));
        STRIPPED_BAOBAB_LOG = registerDefaultBlock("stripped_baobab_log", () -> log(MaterialColor.WOOD, MaterialColor.WOOD));
        BAOBAB_WOOD = registerDefaultBlock("baobab_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_LIGHT_GRAY).strength(2.0F).sound(SoundType.WOOD)));
        STRIPPED_BAOBAB_WOOD = registerDefaultBlock("stripped_baobab_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD)));
        BAOBAB_PLANKS = registerDefaultBlock("baobab_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
        BAOBAB_STAIRS = registerDefaultBlock("baobab_stairs", () -> woodStairs(MaterialColor.WOOD));
        BAOBAB_SLAB = registerDefaultBlock("baobab_slab", () -> woodSlab(MaterialColor.WOOD));
        BAOBAB_FENCE = registerDefaultBlock("baobab_fence", () -> woodFence(MaterialColor.WOOD));
        BAOBAB_DOOR = registerDefaultBlock("baobab_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion(), BlockSetType.OAK));
        BAOBAB_FENCE_GATE = registerDefaultBlock("baobab_fence_gate", () -> woodFenceGate(MaterialColor.WOOD, RuWoodTypes.BAOBAB));
        BAOBAB_TRAPDOOR = registerDefaultBlock("baobab_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion().isValidSpawn(RegionsUnexploredBlocks::never), RuBlockSetType.BAOBAB));
        BAOBAB_PRESSURE_PLATE = registerDefaultBlock("baobab_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noCollission().strength(0.5F).sound(SoundType.WOOD), RuBlockSetType.BAOBAB));
        BAOBAB_BUTTON = registerDefaultBlock("baobab_button", () -> new ButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD), RuBlockSetType.BAOBAB, 30, true));
        BAOBAB_SIGN = RegionsUnexploredMod.BLOCKS.register("baobab_sign", () -> new RuStandingSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD), RuWoodTypes.BAOBAB));
        BAOBAB_WALL_SIGN = RegionsUnexploredMod.BLOCKS.register("baobab_wall_sign", () -> new RuWallSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD).dropsLike(BAOBAB_SIGN.get()), RuWoodTypes.BAOBAB));
        //BLACKWOOD_BLOCKS
        BLACKWOOD_LOG = registerDefaultBlock("blackwood_log", () -> log(MaterialColor.TERRACOTTA_BLACK, MaterialColor.TERRACOTTA_BROWN));
        STRIPPED_BLACKWOOD_LOG = registerDefaultBlock("stripped_blackwood_log", () -> log(MaterialColor.TERRACOTTA_BLACK, MaterialColor.TERRACOTTA_BLACK));
        BLACKWOOD_WOOD = registerDefaultBlock("blackwood_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_BROWN).strength(2.0F).sound(SoundType.WOOD)));
        STRIPPED_BLACKWOOD_WOOD = registerDefaultBlock("stripped_blackwood_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_BLACK).strength(2.0F).sound(SoundType.WOOD)));
        BLACKWOOD_PLANKS = registerDefaultBlock("blackwood_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_BLACK).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
        BLACKWOOD_STAIRS = registerDefaultBlock("blackwood_stairs", () -> woodStairs(MaterialColor.TERRACOTTA_BLACK));
        BLACKWOOD_SLAB = registerDefaultBlock("blackwood_slab", () -> woodSlab(MaterialColor.TERRACOTTA_BLACK));
        BLACKWOOD_FENCE = registerDefaultBlock("blackwood_fence", () -> woodFence(MaterialColor.TERRACOTTA_BLACK));
        BLACKWOOD_DOOR = registerDefaultBlock("blackwood_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_BLACK).strength(3.0F).sound(SoundType.WOOD).noOcclusion(), RuBlockSetType.BLACKWOOD));
        BLACKWOOD_FENCE_GATE = registerDefaultBlock("blackwood_fence_gate", () -> woodFenceGate(MaterialColor.TERRACOTTA_BLACK, RuWoodTypes.BLACKWOOD));
        BLACKWOOD_TRAPDOOR = registerDefaultBlock("blackwood_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_BLACK).strength(3.0F).sound(SoundType.WOOD).noOcclusion().isValidSpawn(RegionsUnexploredBlocks::never), RuBlockSetType.BLACKWOOD));
        BLACKWOOD_PRESSURE_PLATE = registerDefaultBlock("blackwood_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_BLACK).noCollission().strength(0.5F).sound(SoundType.WOOD), RuBlockSetType.BLACKWOOD));
        BLACKWOOD_BUTTON = registerDefaultBlock("blackwood_button", () -> new ButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD), RuBlockSetType.BLACKWOOD, 30, true));
        BLACKWOOD_SIGN = RegionsUnexploredMod.BLOCKS.register("blackwood_sign", () -> new RuStandingSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD), RuWoodTypes.BLACKWOOD));
        BLACKWOOD_WALL_SIGN = RegionsUnexploredMod.BLOCKS.register("blackwood_wall_sign", () -> new RuWallSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD).dropsLike(BLACKWOOD_SIGN.get()), RuWoodTypes.BLACKWOOD));
        //CHERRY_BLOCKS
        CHERRY_LOG = registerDefaultBlock("cherry_log", () -> log(MaterialColor.TERRACOTTA_PINK, MaterialColor.STONE));
        STRIPPED_CHERRY_LOG = registerDefaultBlock("stripped_cherry_log", () -> log(MaterialColor.TERRACOTTA_PINK, MaterialColor.TERRACOTTA_PINK));
        CHERRY_WOOD = registerDefaultBlock("cherry_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.STONE).strength(2.0F).sound(SoundType.WOOD)));
        STRIPPED_CHERRY_WOOD = registerDefaultBlock("stripped_cherry_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_PINK).strength(2.0F).sound(SoundType.WOOD)));
        CHERRY_PLANKS = registerDefaultBlock("cherry_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_PINK).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
        CHERRY_STAIRS = registerDefaultBlock("cherry_stairs", () -> woodStairs(MaterialColor.TERRACOTTA_PINK));
        CHERRY_SLAB = registerDefaultBlock("cherry_slab", () -> woodSlab(MaterialColor.TERRACOTTA_PINK));
        CHERRY_FENCE = registerDefaultBlock("cherry_fence", () -> woodFence(MaterialColor.TERRACOTTA_PINK));
        CHERRY_DOOR = registerDefaultBlock("cherry_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_PINK).strength(3.0F).sound(SoundType.WOOD).noOcclusion(), RuBlockSetType.CHERRY));
        CHERRY_FENCE_GATE = registerDefaultBlock("cherry_fence_gate", () -> woodFenceGate(MaterialColor.TERRACOTTA_PINK, RuWoodTypes.CHERRY));
        CHERRY_TRAPDOOR = registerDefaultBlock("cherry_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_PINK).strength(3.0F).sound(SoundType.WOOD).noOcclusion().isValidSpawn(RegionsUnexploredBlocks::never), RuBlockSetType.CHERRY));
        CHERRY_PRESSURE_PLATE = registerDefaultBlock("cherry_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_PINK).noCollission().strength(0.5F).sound(SoundType.WOOD), RuBlockSetType.CHERRY));
        CHERRY_BUTTON = registerDefaultBlock("cherry_button", () -> new ButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD), RuBlockSetType.CHERRY, 30, true));
        CHERRY_SIGN = RegionsUnexploredMod.BLOCKS.register("cherry_sign", () -> new RuStandingSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD), RuWoodTypes.CHERRY));
        CHERRY_WALL_SIGN = RegionsUnexploredMod.BLOCKS.register("cherry_wall_sign", () -> new RuWallSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD).dropsLike(CHERRY_SIGN.get()), RuWoodTypes.CHERRY));
        //CYPRESS_BLOCKS
        CYPRESS_LOG = registerDefaultBlock("cypress_log", () -> log(MaterialColor.WOOD, MaterialColor.WOOD));
        STRIPPED_CYPRESS_LOG = registerDefaultBlock("stripped_cypress_log", () -> log(MaterialColor.WOOD, MaterialColor.WOOD));
        CYPRESS_WOOD = registerDefaultBlock("cypress_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD)));
        STRIPPED_CYPRESS_WOOD = registerDefaultBlock("stripped_cypress_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD)));
        CYPRESS_PLANKS = registerDefaultBlock("cypress_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
        CYPRESS_STAIRS = registerDefaultBlock("cypress_stairs", () -> woodStairs(MaterialColor.WOOD));
        CYPRESS_SLAB = registerDefaultBlock("cypress_slab", () -> woodSlab(MaterialColor.WOOD));
        CYPRESS_FENCE = registerDefaultBlock("cypress_fence", () -> woodFence(MaterialColor.WOOD));
        CYPRESS_DOOR = registerDefaultBlock("cypress_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion(), RuBlockSetType.CYPRESS));
        CYPRESS_FENCE_GATE = registerDefaultBlock("cypress_fence_gate", () -> woodFenceGate(MaterialColor.WOOD, RuWoodTypes.CYPRESS));
        CYPRESS_TRAPDOOR = registerDefaultBlock("cypress_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion().isValidSpawn(RegionsUnexploredBlocks::never), RuBlockSetType.CYPRESS));
        CYPRESS_PRESSURE_PLATE = registerDefaultBlock("cypress_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noCollission().strength(0.5F).sound(SoundType.WOOD), RuBlockSetType.CYPRESS));
        CYPRESS_BUTTON = registerDefaultBlock("cypress_button", () -> new ButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD), RuBlockSetType.CYPRESS, 30, true));
        CYPRESS_SIGN = RegionsUnexploredMod.BLOCKS.register("cypress_sign", () -> new RuStandingSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD), RuWoodTypes.CYPRESS));
        CYPRESS_WALL_SIGN = RegionsUnexploredMod.BLOCKS.register("cypress_wall_sign", () -> new RuWallSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD).dropsLike(CYPRESS_SIGN.get()), RuWoodTypes.CYPRESS));
        //DEAD_BLOCKS
        DEAD_LOG = registerDefaultBlock("dead_log", () -> log(MaterialColor.WOOD, MaterialColor.WOOD));
        STRIPPED_DEAD_LOG = registerDefaultBlock("stripped_dead_log", () -> log(MaterialColor.WOOD, MaterialColor.WOOD));
        DEAD_WOOD = registerDefaultBlock("dead_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD)));
        STRIPPED_DEAD_WOOD = registerDefaultBlock("stripped_dead_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD)));
        DEAD_PLANKS = registerDefaultBlock("dead_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
        DEAD_STAIRS = registerDefaultBlock("dead_stairs", () -> woodStairs(MaterialColor.WOOD));
        DEAD_SLAB = registerDefaultBlock("dead_slab", () -> woodSlab(MaterialColor.WOOD));
        DEAD_FENCE = registerDefaultBlock("dead_fence", () -> woodFence(MaterialColor.WOOD));
        DEAD_DOOR = registerDefaultBlock("dead_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion(), RuBlockSetType.DEAD));
        DEAD_FENCE_GATE = registerDefaultBlock("dead_fence_gate", () -> woodFenceGate(MaterialColor.WOOD, RuWoodTypes.DEAD));
        DEAD_TRAPDOOR = registerDefaultBlock("dead_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion().isValidSpawn(RegionsUnexploredBlocks::never), RuBlockSetType.DEAD));
        DEAD_PRESSURE_PLATE = registerDefaultBlock("dead_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noCollission().strength(0.5F).sound(SoundType.WOOD), RuBlockSetType.DEAD));
        DEAD_BUTTON = registerDefaultBlock("dead_button", () -> new ButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD), RuBlockSetType.DEAD, 30, true));
        DEAD_SIGN = RegionsUnexploredMod.BLOCKS.register("dead_sign", () -> new RuStandingSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD), RuWoodTypes.DEAD));
        DEAD_WALL_SIGN = RegionsUnexploredMod.BLOCKS.register("dead_wall_sign", () -> new RuWallSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD).dropsLike(DEAD_SIGN.get()), RuWoodTypes.DEAD));
        //EUCALYPTUS_BLOCKS
        EUCALYPTUS_LOG = registerDefaultBlock("eucalyptus_log", () -> log(MaterialColor.WOOD, MaterialColor.WOOD));
        STRIPPED_EUCALYPTUS_LOG = registerDefaultBlock("stripped_eucalyptus_log", () -> log(MaterialColor.WOOD, MaterialColor.WOOD));
        EUCALYPTUS_WOOD = registerDefaultBlock("eucalyptus_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD)));
        STRIPPED_EUCALYPTUS_WOOD = registerDefaultBlock("stripped_eucalyptus_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD)));
        EUCALYPTUS_PLANKS = registerDefaultBlock("eucalyptus_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
        EUCALYPTUS_STAIRS = registerDefaultBlock("eucalyptus_stairs", () -> woodStairs(MaterialColor.WOOD));
        EUCALYPTUS_SLAB = registerDefaultBlock("eucalyptus_slab", () -> woodSlab(MaterialColor.WOOD));
        EUCALYPTUS_FENCE = registerDefaultBlock("eucalyptus_fence", () -> woodFence(MaterialColor.WOOD));
        EUCALYPTUS_DOOR = registerDefaultBlock("eucalyptus_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion(), RuBlockSetType.EUCALYPTUS));
        EUCALYPTUS_FENCE_GATE = registerDefaultBlock("eucalyptus_fence_gate", () -> woodFenceGate(MaterialColor.WOOD, RuWoodTypes.EUCALYPTUS));
        EUCALYPTUS_TRAPDOOR = registerDefaultBlock("eucalyptus_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion().isValidSpawn(RegionsUnexploredBlocks::never), RuBlockSetType.EUCALYPTUS));
        EUCALYPTUS_PRESSURE_PLATE = registerDefaultBlock("eucalyptus_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noCollission().strength(0.5F).sound(SoundType.WOOD), RuBlockSetType.EUCALYPTUS));
        EUCALYPTUS_BUTTON = registerDefaultBlock("eucalyptus_button", () -> new ButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD), RuBlockSetType.EUCALYPTUS, 30, true));
        EUCALYPTUS_SIGN = RegionsUnexploredMod.BLOCKS.register("eucalyptus_sign", () -> new RuStandingSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD), RuWoodTypes.EUCALYPTUS));
        EUCALYPTUS_WALL_SIGN = RegionsUnexploredMod.BLOCKS.register("eucalyptus_wall_sign", () -> new RuWallSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD).dropsLike(EUCALYPTUS_SIGN.get()), RuWoodTypes.EUCALYPTUS));
        //JOSHUA_BLOCKS
        JOSHUA_LOG = registerDefaultBlock("joshua_log", () -> log(MaterialColor.WOOD, MaterialColor.WOOD));
        STRIPPED_JOSHUA_LOG = registerDefaultBlock("stripped_joshua_log", () -> log(MaterialColor.WOOD, MaterialColor.WOOD));
        JOSHUA_WOOD = registerDefaultBlock("joshua_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD)));
        STRIPPED_JOSHUA_WOOD = registerDefaultBlock("stripped_joshua_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD)));
        JOSHUA_PLANKS = registerDefaultBlock("joshua_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
        JOSHUA_STAIRS = registerDefaultBlock("joshua_stairs", () -> woodStairs(MaterialColor.WOOD));
        JOSHUA_SLAB = registerDefaultBlock("joshua_slab", () -> woodSlab(MaterialColor.WOOD));
        JOSHUA_FENCE = registerDefaultBlock("joshua_fence", () -> woodFence(MaterialColor.WOOD));
        JOSHUA_DOOR = registerDefaultBlock("joshua_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion(), RuBlockSetType.JOSHUA));
        JOSHUA_FENCE_GATE = registerDefaultBlock("joshua_fence_gate", () -> woodFenceGate(MaterialColor.WOOD, RuWoodTypes.JOSHUA));
        JOSHUA_TRAPDOOR = registerDefaultBlock("joshua_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion().isValidSpawn(RegionsUnexploredBlocks::never), RuBlockSetType.JOSHUA));
        JOSHUA_PRESSURE_PLATE = registerDefaultBlock("joshua_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noCollission().strength(0.5F).sound(SoundType.WOOD), RuBlockSetType.JOSHUA));
        JOSHUA_BUTTON = registerDefaultBlock("joshua_button", () -> new ButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD), RuBlockSetType.JOSHUA, 30, true));
        JOSHUA_SIGN = RegionsUnexploredMod.BLOCKS.register("joshua_sign", () -> new RuStandingSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD), RuWoodTypes.JOSHUA));
        JOSHUA_WALL_SIGN = RegionsUnexploredMod.BLOCKS.register("joshua_wall_sign", () -> new RuWallSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD).dropsLike(JOSHUA_SIGN.get()), RuWoodTypes.JOSHUA));
        //LARCH_BLOCKS
        LARCH_LOG = registerDefaultBlock("larch_log", () -> log(MaterialColor.WOOD, MaterialColor.WOOD));
        STRIPPED_LARCH_LOG = registerDefaultBlock("stripped_larch_log", () -> log(MaterialColor.WOOD, MaterialColor.WOOD));
        LARCH_WOOD = registerDefaultBlock("larch_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD)));
        STRIPPED_LARCH_WOOD = registerDefaultBlock("stripped_larch_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD)));
        LARCH_PLANKS = registerDefaultBlock("larch_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
        LARCH_STAIRS = registerDefaultBlock("larch_stairs", () -> woodStairs(MaterialColor.WOOD));
        LARCH_SLAB = registerDefaultBlock("larch_slab", () -> woodSlab(MaterialColor.WOOD));
        LARCH_FENCE = registerDefaultBlock("larch_fence", () -> woodFence(MaterialColor.WOOD));
        LARCH_DOOR = registerDefaultBlock("larch_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion(), RuBlockSetType.LARCH));
        LARCH_FENCE_GATE = registerDefaultBlock("larch_fence_gate", () -> woodFenceGate(MaterialColor.WOOD, RuWoodTypes.LARCH));
        LARCH_TRAPDOOR = registerDefaultBlock("larch_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion().isValidSpawn(RegionsUnexploredBlocks::never), RuBlockSetType.LARCH));
        LARCH_PRESSURE_PLATE = registerDefaultBlock("larch_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noCollission().strength(0.5F).sound(SoundType.WOOD), RuBlockSetType.LARCH));
        LARCH_BUTTON = registerDefaultBlock("larch_button", () -> new ButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD), RuBlockSetType.LARCH, 30, true));
        LARCH_SIGN = RegionsUnexploredMod.BLOCKS.register("larch_sign", () -> new RuStandingSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD), RuWoodTypes.LARCH));
        LARCH_WALL_SIGN = RegionsUnexploredMod.BLOCKS.register("larch_wall_sign", () -> new RuWallSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD).dropsLike(LARCH_SIGN.get()), RuWoodTypes.LARCH));
        //MAPLE_BLOCKS
        MAPLE_LOG = registerDefaultBlock("maple_log", () -> log(MaterialColor.WOOD, MaterialColor.WOOD));
        STRIPPED_MAPLE_LOG = registerDefaultBlock("stripped_maple_log", () -> log(MaterialColor.WOOD, MaterialColor.WOOD));
        MAPLE_WOOD = registerDefaultBlock("maple_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD)));
        STRIPPED_MAPLE_WOOD = registerDefaultBlock("stripped_maple_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD)));
        MAPLE_PLANKS = registerDefaultBlock("maple_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
        MAPLE_STAIRS = registerDefaultBlock("maple_stairs", () -> woodStairs(MaterialColor.WOOD));
        MAPLE_SLAB = registerDefaultBlock("maple_slab", () -> woodSlab(MaterialColor.WOOD));
        MAPLE_FENCE = registerDefaultBlock("maple_fence", () -> woodFence(MaterialColor.WOOD));
        MAPLE_DOOR = registerDefaultBlock("maple_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion(), RuBlockSetType.MAPLE));
        MAPLE_FENCE_GATE = registerDefaultBlock("maple_fence_gate", () -> woodFenceGate(MaterialColor.WOOD, RuWoodTypes.MAPLE));
        MAPLE_TRAPDOOR = registerDefaultBlock("maple_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion().isValidSpawn(RegionsUnexploredBlocks::never), RuBlockSetType.MAPLE));
        MAPLE_PRESSURE_PLATE = registerDefaultBlock("maple_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noCollission().strength(0.5F).sound(SoundType.WOOD), RuBlockSetType.MAPLE));
        MAPLE_BUTTON = registerDefaultBlock("maple_button", () -> new ButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD), RuBlockSetType.MAPLE, 30, true));
        MAPLE_SIGN = RegionsUnexploredMod.BLOCKS.register("maple_sign", () -> new RuStandingSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD), RuWoodTypes.MAPLE));
        MAPLE_WALL_SIGN = RegionsUnexploredMod.BLOCKS.register("maple_wall_sign", () -> new RuWallSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD).dropsLike(MAPLE_SIGN.get()), RuWoodTypes.MAPLE));
        //MAUVE_BLOCKS
        MAUVE_LOG = registerDefaultBlock("mauve_log", () -> log(MaterialColor.TERRACOTTA_PURPLE, MaterialColor.PODZOL));
        STRIPPED_MAUVE_LOG = registerDefaultBlock("stripped_mauve_log", () -> log(MaterialColor.TERRACOTTA_PURPLE, MaterialColor.TERRACOTTA_PURPLE));
        MAUVE_WOOD = registerDefaultBlock("mauve_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.PODZOL).strength(2.0F).sound(SoundType.WOOD)));
        STRIPPED_MAUVE_WOOD = registerDefaultBlock("stripped_mauve_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_PURPLE).strength(2.0F).sound(SoundType.WOOD)));
        MAUVE_PLANKS = registerDefaultBlock("mauve_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_PURPLE).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
        MAUVE_STAIRS = registerDefaultBlock("mauve_stairs", () -> woodStairs(MaterialColor.TERRACOTTA_PURPLE));
        MAUVE_SLAB = registerDefaultBlock("mauve_slab", () -> woodSlab(MaterialColor.TERRACOTTA_PURPLE));
        MAUVE_FENCE = registerDefaultBlock("mauve_fence", () -> woodFence(MaterialColor.TERRACOTTA_PURPLE));
        MAUVE_DOOR = registerDefaultBlock("mauve_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_PURPLE).strength(3.0F).sound(SoundType.WOOD).noOcclusion(), RuBlockSetType.MAUVE));
        MAUVE_FENCE_GATE = registerDefaultBlock("mauve_fence_gate", () -> woodFenceGate(MaterialColor.TERRACOTTA_PURPLE, RuWoodTypes.MAUVE));
        MAUVE_TRAPDOOR = registerDefaultBlock("mauve_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_PURPLE).strength(3.0F).sound(SoundType.WOOD).noOcclusion().isValidSpawn(RegionsUnexploredBlocks::never), RuBlockSetType.MAUVE));
        MAUVE_PRESSURE_PLATE = registerDefaultBlock("mauve_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_PURPLE).noCollission().strength(0.5F).sound(SoundType.WOOD), RuBlockSetType.MAUVE));
        MAUVE_BUTTON = registerDefaultBlock("mauve_button", () -> new ButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD), RuBlockSetType.MAUVE, 30, true));
        MAUVE_SIGN = RegionsUnexploredMod.BLOCKS.register("mauve_sign", () -> new RuStandingSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD), RuWoodTypes.MAUVE));
        MAUVE_WALL_SIGN = RegionsUnexploredMod.BLOCKS.register("mauve_wall_sign", () -> new RuWallSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD).dropsLike(MAUVE_SIGN.get()), RuWoodTypes.MAUVE));
        //PALM_BLOCKS
        PALM_LOG = registerDefaultBlock("palm_log", () -> log(MaterialColor.WOOD, MaterialColor.WOOD));
        STRIPPED_PALM_LOG = registerDefaultBlock("stripped_palm_log", () -> log(MaterialColor.WOOD, MaterialColor.WOOD));
        PALM_WOOD = registerDefaultBlock("palm_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD)));
        STRIPPED_PALM_WOOD = registerDefaultBlock("stripped_palm_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD)));
        PALM_PLANKS = registerDefaultBlock("palm_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
        PALM_STAIRS = registerDefaultBlock("palm_stairs", () -> woodStairs(MaterialColor.WOOD));
        PALM_SLAB = registerDefaultBlock("palm_slab", () -> woodSlab(MaterialColor.WOOD));
        PALM_FENCE = registerDefaultBlock("palm_fence", () -> woodFence(MaterialColor.WOOD));
        PALM_DOOR = registerDefaultBlock("palm_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion(), RuBlockSetType.PALM));
        PALM_FENCE_GATE = registerDefaultBlock("palm_fence_gate", () -> woodFenceGate(MaterialColor.WOOD, RuWoodTypes.PALM));
        PALM_TRAPDOOR = registerDefaultBlock("palm_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion().isValidSpawn(RegionsUnexploredBlocks::never), RuBlockSetType.PALM));
        PALM_PRESSURE_PLATE = registerDefaultBlock("palm_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noCollission().strength(0.5F).sound(SoundType.WOOD), RuBlockSetType.PALM));
        PALM_BUTTON = registerDefaultBlock("palm_button", () -> new ButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD), RuBlockSetType.PALM, 30, true));
        PALM_SIGN = RegionsUnexploredMod.BLOCKS.register("palm_sign", () -> new RuStandingSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD), RuWoodTypes.PALM));
        PALM_WALL_SIGN = RegionsUnexploredMod.BLOCKS.register("palm_wall_sign", () -> new RuWallSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD).dropsLike(PALM_SIGN.get()), RuWoodTypes.PALM));
        //PINE_BLOCKS
        PINE_LOG = registerDefaultBlock("pine_log", () -> log(MaterialColor.WOOD, MaterialColor.WOOD));
        PINE_LOG_TRANSITION = registerDefaultBlock("pine_log_transition", () -> log(MaterialColor.WOOD, MaterialColor.WOOD));
        STRIPPED_PINE_LOG = registerDefaultBlock("stripped_pine_log", () -> log(MaterialColor.WOOD, MaterialColor.WOOD));
        PINE_WOOD = registerDefaultBlock("pine_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD)));
        STRIPPED_PINE_WOOD = registerDefaultBlock("stripped_pine_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD)));
        PINE_PLANKS = registerDefaultBlock("pine_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
        PINE_STAIRS = registerDefaultBlock("pine_stairs", () -> woodStairs(MaterialColor.WOOD));
        PINE_SLAB = registerDefaultBlock("pine_slab", () -> woodSlab(MaterialColor.WOOD));
        PINE_FENCE = registerDefaultBlock("pine_fence", () -> woodFence(MaterialColor.WOOD));
        PINE_DOOR = registerDefaultBlock("pine_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion(), RuBlockSetType.PINE));
        PINE_FENCE_GATE = registerDefaultBlock("pine_fence_gate", () -> woodFenceGate(MaterialColor.WOOD, RuWoodTypes.PINE));
        PINE_TRAPDOOR = registerDefaultBlock("pine_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion().isValidSpawn(RegionsUnexploredBlocks::never), RuBlockSetType.PINE));
        PINE_PRESSURE_PLATE = registerDefaultBlock("pine_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noCollission().strength(0.5F).sound(SoundType.WOOD), RuBlockSetType.PINE));
        PINE_BUTTON = registerDefaultBlock("pine_button", () -> new ButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD), RuBlockSetType.PINE, 30, true));
        PINE_SIGN = RegionsUnexploredMod.BLOCKS.register("pine_sign", () -> new RuStandingSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD), RuWoodTypes.PINE));
        PINE_WALL_SIGN = RegionsUnexploredMod.BLOCKS.register("pine_wall_sign", () -> new RuWallSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD).dropsLike(PINE_SIGN.get()), RuWoodTypes.PINE));
        //REDWOOD_BLOCKS
        REDWOOD_LOG = registerDefaultBlock("redwood_log", () -> log(MaterialColor.WOOD, MaterialColor.WOOD));
        STRIPPED_REDWOOD_LOG = registerDefaultBlock("stripped_redwood_log", () -> log(MaterialColor.WOOD, MaterialColor.WOOD));
        REDWOOD_WOOD = registerDefaultBlock("redwood_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD)));
        STRIPPED_REDWOOD_WOOD = registerDefaultBlock("stripped_redwood_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD)));
        REDWOOD_PLANKS = registerDefaultBlock("redwood_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
        REDWOOD_STAIRS = registerDefaultBlock("redwood_stairs", () -> woodStairs(MaterialColor.WOOD));
        REDWOOD_SLAB = registerDefaultBlock("redwood_slab", () -> woodSlab(MaterialColor.WOOD));
        REDWOOD_FENCE = registerDefaultBlock("redwood_fence", () -> woodFence(MaterialColor.WOOD));
        REDWOOD_DOOR = registerDefaultBlock("redwood_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion(), RuBlockSetType.REDWOOD));
        REDWOOD_FENCE_GATE = registerDefaultBlock("redwood_fence_gate", () -> woodFenceGate(MaterialColor.WOOD, RuWoodTypes.REDWOOD));
        REDWOOD_TRAPDOOR = registerDefaultBlock("redwood_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion().isValidSpawn(RegionsUnexploredBlocks::never), RuBlockSetType.REDWOOD));
        REDWOOD_PRESSURE_PLATE = registerDefaultBlock("redwood_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noCollission().strength(0.5F).sound(SoundType.WOOD), RuBlockSetType.REDWOOD));
        REDWOOD_BUTTON = registerDefaultBlock("redwood_button", () -> new ButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD), RuBlockSetType.REDWOOD, 30, true));
        REDWOOD_SIGN = RegionsUnexploredMod.BLOCKS.register("redwood_sign", () -> new RuStandingSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD), RuWoodTypes.REDWOOD));
        REDWOOD_WALL_SIGN = RegionsUnexploredMod.BLOCKS.register("redwood_wall_sign", () -> new RuWallSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD).dropsLike(REDWOOD_SIGN.get()), RuWoodTypes.REDWOOD));
        //BRIMWOOD_BLOCKS
        BRIMWOOD_LOG = registerDefaultBlock("brimwood_log", () -> log(MaterialColor.COLOR_BROWN, MaterialColor.COLOR_BROWN));
        BRIMWOOD_LOG_MAGMA = registerDefaultBlock("brimwood_log_magma", () -> new MagmaLogBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN).strength(2.0F).sound(SoundType.WOOD).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 12)));
        BRIMWOOD_PLANKS = registerDefaultBlock("brimwood_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_ORANGE).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
        BRIMWOOD_STAIRS = registerDefaultBlock("brimwood_stairs", () -> woodStairs(MaterialColor.COLOR_ORANGE));
        BRIMWOOD_SLAB = registerDefaultBlock("brimwood_slab", () -> woodSlab(MaterialColor.COLOR_ORANGE));
        BRIMWOOD_FENCE = registerDefaultBlock("brimwood_fence", () -> woodFence(MaterialColor.COLOR_ORANGE));
        BRIMWOOD_DOOR = registerDefaultBlock("brimwood_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_ORANGE).strength(3.0F).sound(SoundType.WOOD).noOcclusion(), RuBlockSetType.BRIMWOOD));
        BRIMWOOD_FENCE_GATE = registerDefaultBlock("brimwood_fence_gate", () -> woodFenceGate(MaterialColor.COLOR_ORANGE, RuWoodTypes.BRIMWOOD));
        BRIMWOOD_TRAPDOOR = registerDefaultBlock("brimwood_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_ORANGE).strength(3.0F).sound(SoundType.WOOD).noOcclusion().isValidSpawn(RegionsUnexploredBlocks::never), RuBlockSetType.BRIMWOOD));
        BRIMWOOD_PRESSURE_PLATE = registerDefaultBlock("brimwood_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_ORANGE).noCollission().strength(0.5F).sound(SoundType.WOOD), RuBlockSetType.BRIMWOOD));
        BRIMWOOD_BUTTON = registerDefaultBlock("brimwood_button", () -> new ButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD), RuBlockSetType.BRIMWOOD, 30, true));
        BRIMWOOD_SIGN = RegionsUnexploredMod.BLOCKS.register("brimwood_sign", () -> new RuStandingSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD), RuWoodTypes.BRIMWOOD));
        BRIMWOOD_WALL_SIGN = RegionsUnexploredMod.BLOCKS.register("brimwood_wall_sign", () -> new RuWallSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD).dropsLike(BRIMWOOD_SIGN.get()), RuWoodTypes.BRIMWOOD));
        //WILLOW_BLOCKS
        WILLOW_LOG = registerDefaultBlock("willow_log", () -> log(MaterialColor.WOOD, MaterialColor.WOOD));
        STRIPPED_WILLOW_LOG = registerDefaultBlock("stripped_willow_log", () -> log(MaterialColor.WOOD, MaterialColor.WOOD));
        WILLOW_WOOD = registerDefaultBlock("willow_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD)));
        STRIPPED_WILLOW_WOOD = registerDefaultBlock("stripped_willow_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD)));
        WILLOW_PLANKS = registerDefaultBlock("willow_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
        WILLOW_STAIRS = registerDefaultBlock("willow_stairs", () -> woodStairs(MaterialColor.WOOD));
        WILLOW_SLAB = registerDefaultBlock("willow_slab", () -> woodSlab(MaterialColor.WOOD));
        WILLOW_FENCE = registerDefaultBlock("willow_fence", () -> woodFence(MaterialColor.WOOD));
        WILLOW_DOOR = registerDefaultBlock("willow_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion(), RuBlockSetType.WILLOW));
        WILLOW_FENCE_GATE = registerDefaultBlock("willow_fence_gate", () -> woodFenceGate(MaterialColor.WOOD, RuWoodTypes.WILLOW));
        WILLOW_TRAPDOOR = registerDefaultBlock("willow_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion().isValidSpawn(RegionsUnexploredBlocks::never), RuBlockSetType.WILLOW));
        WILLOW_PRESSURE_PLATE = registerDefaultBlock("willow_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noCollission().strength(0.5F).sound(SoundType.WOOD), RuBlockSetType.WILLOW));
        WILLOW_BUTTON = registerDefaultBlock("willow_button", () -> new ButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD), RuBlockSetType.WILLOW, 30, true));
        WILLOW_SIGN = RegionsUnexploredMod.BLOCKS.register("willow_sign", () -> new RuStandingSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD), RuWoodTypes.WILLOW));
        WILLOW_WALL_SIGN = RegionsUnexploredMod.BLOCKS.register("willow_wall_sign", () -> new RuWallSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD).dropsLike(WILLOW_SIGN.get()), RuWoodTypes.WILLOW));

        /*-----------------PAINTED PLANKS-----------------*/
        //PLANKS
        RED_PAINTED_PLANKS = registerDefaultBlock("red_painted_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_RED).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
        ORANGE_PAINTED_PLANKS = registerDefaultBlock("orange_painted_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_ORANGE).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
        YELLOW_PAINTED_PLANKS = registerDefaultBlock("yellow_painted_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_YELLOW).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
        LIME_PAINTED_PLANKS = registerDefaultBlock("lime_painted_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_LIGHT_GREEN).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
        GREEN_PAINTED_PLANKS = registerDefaultBlock("green_painted_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_GREEN).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
        CYAN_PAINTED_PLANKS = registerDefaultBlock("cyan_painted_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_CYAN).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
        LIGHT_BLUE_PAINTED_PLANKS = registerDefaultBlock("light_blue_painted_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_LIGHT_BLUE).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
        BLUE_PAINTED_PLANKS = registerDefaultBlock("blue_painted_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BLUE).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
        PURPLE_PAINTED_PLANKS = registerDefaultBlock("purple_painted_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_PURPLE).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
        MAGENTA_PAINTED_PLANKS = registerDefaultBlock("magenta_painted_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_MAGENTA).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
        PINK_PAINTED_PLANKS = registerDefaultBlock("pink_painted_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_PINK).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
        BROWN_PAINTED_PLANKS = registerDefaultBlock("brown_painted_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
        WHITE_PAINTED_PLANKS = registerDefaultBlock("white_painted_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.SNOW).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
        LIGHT_GRAY_PAINTED_PLANKS = registerDefaultBlock("light_gray_painted_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_LIGHT_GRAY).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
        GRAY_PAINTED_PLANKS = registerDefaultBlock("gray_painted_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_GRAY).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
        BLACK_PAINTED_PLANKS = registerDefaultBlock("black_painted_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BLACK).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
        //STAIRS
        RED_PAINTED_STAIRS = registerDefaultBlock("red_painted_stairs", () -> woodStairs(MaterialColor.COLOR_RED));
        ORANGE_PAINTED_STAIRS = registerDefaultBlock("orange_painted_stairs", () -> woodStairs(MaterialColor.COLOR_ORANGE));
        YELLOW_PAINTED_STAIRS = registerDefaultBlock("yellow_painted_stairs", () -> woodStairs(MaterialColor.COLOR_YELLOW));
        LIME_PAINTED_STAIRS = registerDefaultBlock("lime_painted_stairs", () -> woodStairs(MaterialColor.COLOR_LIGHT_GREEN));
        GREEN_PAINTED_STAIRS = registerDefaultBlock("green_painted_stairs", () -> woodStairs(MaterialColor.COLOR_GREEN));
        CYAN_PAINTED_STAIRS = registerDefaultBlock("cyan_painted_stairs", () -> woodStairs(MaterialColor.COLOR_CYAN));
        LIGHT_BLUE_PAINTED_STAIRS = registerDefaultBlock("light_blue_painted_stairs", () -> woodStairs(MaterialColor.COLOR_LIGHT_BLUE));
        BLUE_PAINTED_STAIRS = registerDefaultBlock("blue_painted_stairs", () -> woodStairs(MaterialColor.COLOR_BLUE));
        PURPLE_PAINTED_STAIRS = registerDefaultBlock("purple_painted_stairs", () -> woodStairs(MaterialColor.COLOR_PURPLE));
        MAGENTA_PAINTED_STAIRS = registerDefaultBlock("magenta_painted_stairs", () -> woodStairs(MaterialColor.COLOR_MAGENTA));
        PINK_PAINTED_STAIRS = registerDefaultBlock("pink_painted_stairs", () -> woodStairs(MaterialColor.COLOR_PINK));
        BROWN_PAINTED_STAIRS = registerDefaultBlock("brown_painted_stairs", () -> woodStairs(MaterialColor.COLOR_BROWN));
        WHITE_PAINTED_STAIRS = registerDefaultBlock("white_painted_stairs", () -> woodStairs(MaterialColor.SNOW));
        LIGHT_GRAY_PAINTED_STAIRS = registerDefaultBlock("light_gray_painted_stairs", () -> woodStairs(MaterialColor.COLOR_LIGHT_GRAY));
        GRAY_PAINTED_STAIRS = registerDefaultBlock("gray_painted_stairs", () -> woodStairs(MaterialColor.COLOR_GRAY));
        BLACK_PAINTED_STAIRS = registerDefaultBlock("black_painted_stairs", () -> woodStairs(MaterialColor.COLOR_BLACK));
        //SLABS
        RED_PAINTED_SLAB = registerDefaultBlock("red_painted_slab", () -> woodSlab(MaterialColor.COLOR_RED));
        ORANGE_PAINTED_SLAB = registerDefaultBlock("orange_painted_slab", () -> woodSlab(MaterialColor.COLOR_ORANGE));
        YELLOW_PAINTED_SLAB = registerDefaultBlock("yellow_painted_slab", () -> woodSlab(MaterialColor.COLOR_YELLOW));
        LIME_PAINTED_SLAB = registerDefaultBlock("lime_painted_slab", () -> woodSlab(MaterialColor.COLOR_LIGHT_GREEN));
        GREEN_PAINTED_SLAB = registerDefaultBlock("green_painted_slab", () -> woodSlab(MaterialColor.COLOR_GREEN));
        CYAN_PAINTED_SLAB = registerDefaultBlock("cyan_painted_slab", () -> woodSlab(MaterialColor.COLOR_CYAN));
        LIGHT_BLUE_PAINTED_SLAB = registerDefaultBlock("light_blue_painted_slab", () -> woodSlab(MaterialColor.COLOR_LIGHT_BLUE));
        BLUE_PAINTED_SLAB = registerDefaultBlock("blue_painted_slab", () -> woodSlab(MaterialColor.COLOR_BLUE));
        PURPLE_PAINTED_SLAB = registerDefaultBlock("purple_painted_slab", () -> woodSlab(MaterialColor.COLOR_PURPLE));
        MAGENTA_PAINTED_SLAB = registerDefaultBlock("magenta_painted_slab", () -> woodSlab(MaterialColor.COLOR_MAGENTA));
        PINK_PAINTED_SLAB = registerDefaultBlock("pink_painted_slab", () -> woodSlab(MaterialColor.COLOR_PINK));
        BROWN_PAINTED_SLAB = registerDefaultBlock("brown_painted_slab", () -> woodSlab(MaterialColor.COLOR_BROWN));
        WHITE_PAINTED_SLAB = registerDefaultBlock("white_painted_slab", () -> woodSlab(MaterialColor.SNOW));
        LIGHT_GRAY_PAINTED_SLAB = registerDefaultBlock("light_gray_painted_slab", () -> woodSlab(MaterialColor.COLOR_LIGHT_GRAY));
        GRAY_PAINTED_SLAB = registerDefaultBlock("gray_painted_slab", () -> woodSlab(MaterialColor.COLOR_GRAY));
        BLACK_PAINTED_SLAB = registerDefaultBlock("black_painted_slab", () -> woodSlab(MaterialColor.COLOR_BLACK));

        /*-----------------NETHER_BLOCKS-----------------*/
        //NETHER_STONES
        BLACKSTONE_CLUSTER = registerDefaultBlock("blackstone_cluster", () -> new RockPileBlock(BlockBehaviour.Properties.of(Material.STONE).strength(0.6F).sound(SoundType.NETHERRACK)));
        MARROWSTONE = registerDefaultBlock("marrowstone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NETHER).requiresCorrectToolForDrops().strength(0.4F).sound(SoundType.NETHERRACK)));
        //MYCOTOXIC_BLOCKS
        MYCOTOXIC_DAISY = registerDefaultBlock("mycotoxic_daisy", () -> new NetherDoubleGrassBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.NETHER_SPROUTS).offsetType(BlockBehaviour.OffsetType.XYZ).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 4)));
        MYCOTOXIC_GRASS = registerDefaultBlock("mycotoxic_grass", () -> new NetherGrassBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.NETHER_SPROUTS).offsetType(BlockBehaviour.OffsetType.XYZ)));
        MYCOTOXIC_NYLIUM = registerDefaultBlock("mycotoxic_moss", () -> new RuNyliumBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW).requiresCorrectToolForDrops().strength(0.4F).sound(SoundType.NYLIUM)));
        //GLISTERING_BLOCKS
        GLISTERING_IVY = registerDefaultBlock("glistering_ivy", () -> new GlisteringIvyBlock(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_LIGHT_BLUE).randomTicks().noCollission().instabreak().sound(SoundType.WEEPING_VINES).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 15)));
        GLISTERING_IVY_PLANT = RegionsUnexploredMod.BLOCKS.register("glistering_ivy_plant", () -> new GlisteringIvyPlantBlock(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_LIGHT_BLUE).noCollission().instabreak().sound(SoundType.WEEPING_VINES)));
        GLISTERING_NYLIUM = registerDefaultBlock("glistering_nylium", () -> new RuNyliumBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PINK).requiresCorrectToolForDrops().strength(0.4F).sound(SoundType.NYLIUM)));
        GLISTERING_SPROUT = registerDefaultBlock("glistering_sprout", () -> new NetherGrassBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.TWISTING_VINES).offsetType(BlockBehaviour.OffsetType.XZ)));
        GLISTERING_WART = registerDefaultBlock("glistering_wart", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PINK).requiresCorrectToolForDrops().strength(0.4F).sound(SoundType.NYLIUM)));
        GLISTER_BULB = registerDefaultBlock("glister_bulb", () -> new NetherDoubleGrassBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.NETHER_WART).offsetType(BlockBehaviour.OffsetType.XZ).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 13)));
        GLISTER_SPIRE = registerDefaultBlock("glister_spire", () -> new NetherDoubleGrassBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.NETHER_SPROUTS).offsetType(BlockBehaviour.OffsetType.XZ).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 5)));
        //COBALT_BLOCKS
        COBALT_EARLIGHT = registerDefaultBlock("cobalt_earlight", () -> new NetherLargePlantBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 13)));
        COBALT_NYLIUM = registerDefaultBlock("cobalt_nylium", () -> new RuNyliumBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE).requiresCorrectToolForDrops().strength(0.4F).sound(SoundType.NYLIUM)));
        COBALT_OBSIDIAN = registerDefaultBlock("cobalt_obsidian", () -> new CobaltObsidianBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK).requiresCorrectToolForDrops().strength(50.0F, 1200.0F)));
        COBALT_ROOTS = registerDefaultBlock("cobalt_roots", () -> new NetherGrassBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.NETHER_SPROUTS).offsetType(BlockBehaviour.OffsetType.XZ)));
        HANGING_EARLIGHT = registerDefaultBlock("hanging_earlight", () -> new HangingEarlightBlock(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_BLUE).randomTicks().noCollission().instabreak().sound(SoundType.WEEPING_VINES).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 14)));
        HANGING_EARLIGHT_PLANT = RegionsUnexploredMod.BLOCKS.register("hanging_earlight_plant", () -> new HangingEarlightPlantBlock(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_BLUE).noCollission().instabreak().sound(SoundType.WEEPING_VINES)));
        //SCULK_BLOCKS
        BRIMSPROUT_NYLIUM = registerDefaultBlock("brimsprout_nylium", () -> new RuNyliumBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_RED).requiresCorrectToolForDrops().strength(0.4F).sound(SoundType.SCULK_SENSOR)));
        BRIMSPROUT = registerDefaultBlock("brimsprout", () -> new BrimPlantBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.SCULK).offsetType(BlockBehaviour.OffsetType.XYZ)));

        /*-----------------OCEAN_BLOCKS-----------------*/
        //HYACINTH_BLOCKS
        //TODO:Add Recipes, Loot Tables, and Tags to Hyacinth blocks
        HYACINTH_BLOOM = registerDefaultBlock("hyacinth_bloom", () -> new SeagrassBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_WATER_PLANT).noCollission().instabreak().sound(SoundType.WET_GRASS).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 9)));
        HYACINTH_FLOWERS = registerDefaultBlock("hyacinth_flowers", () -> new GlowLichenBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT, MaterialColor.GLOW_LICHEN).noCollission().strength(0.2F).sound(SoundType.GLOW_LICHEN).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 8)));
        HYACINTH_SEAGRASS = registerDefaultBlock("hyacinth_seagrass", () -> new SeagrassBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_WATER_PLANT).noCollission().instabreak().sound(SoundType.WET_GRASS)));
        HYACINTH_STONE = registerDefaultBlock("hyacinth_stone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE).sound(SoundType.STONE).strength(1.5f, 6f).requiresCorrectToolForDrops()));
        TALL_HYACINTH_STOCK = registerDefaultBlock("tall_hyacinth_stock", () -> new TallHyacinthStockBlock(BlockBehaviour.Properties.of(Material.WATER_PLANT).noCollission().instabreak().sound(SoundType.WET_GRASS).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 12)));
        //SMOULDERING_WOODLAND_BLOCKS
        ASHEN_DIRT = registerDefaultBlock("ashen_dirt", () -> new AshenDirtBlock(BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.COLOR_GRAY).strength(0.5F).sound(SoundType.GRAVEL).randomTicks().lightLevel((bs) -> AshenDirtBlock.isSmouldering(bs) ? 7 : 0)));
        ASHEN_SHRUB = registerDefaultBlock("ashen_shrub", () -> new AshenShrubBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.ROOTED_DIRT).offsetType(BlockBehaviour.OffsetType.XZ).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true)));
        ASHEN_LOG = registerDefaultBlock("ashen_log", () -> log(MaterialColor.COLOR_LIGHT_GRAY, MaterialColor.COLOR_GRAY));
        ASHEN_LEAVES = registerDefaultBlock("ashen_leaves", () -> appleLeaves(MaterialColor.COLOR_LIGHT_GRAY));
        ASHEN_GRASS = registerDefaultBlock("ashen_grass", () -> new AshenTallGrassBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).hasPostProcess((bs, br, bp) -> AshenTallGrassBlock.isSmouldering(bs) ? true : false).emissiveRendering((bs, br, bp) -> AshenTallGrassBlock.isSmouldering(bs) ? true : false).lightLevel((bs) -> AshenTallGrassBlock.isSmouldering(bs) ? 5 : 0)));

        /*-----------------PLACERS-----------------*/
        DIRT_PLACEMENT = RegionsUnexploredMod.BLOCKS.register("dirt_placement", () -> new DirtPlacementBlock());
        GRASS_PLACEMENT = RegionsUnexploredMod.BLOCKS.register("grass_placement", () -> new GrassPlacementBlock());
        MUD_PLACEMENT = RegionsUnexploredMod.BLOCKS.register("mud_placement", () -> new MudPlacementBlock());
        SAND_PLACEMENT = RegionsUnexploredMod.BLOCKS.register("sand_placement", () -> new SandPlacementBlock());
    }

    //Register default blocks and items
    public static <T extends Block> RegistryObject<T> registerDefaultBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = RegionsUnexploredMod.BLOCKS.register(name, block);
        registerDefaultBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerDefaultBlockItem(String name, RegistryObject<T> block) {
        return RegionsUnexploredMod.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    //Register Duckweed block and item
    private static <T extends Block> RegistryObject<T> registerDuckweedBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = RegionsUnexploredMod.BLOCKS.register(name, block);
        registerDuckweedItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerDuckweedItem(String name, RegistryObject<T> block) {
        return RegionsUnexploredMod.ITEMS.register(name, () -> new PlaceOnWaterBlockItem(block.get(), new Item.Properties()));
    }

    //Configure log block
    private static RotatedPillarBlock log(MaterialColor colour, MaterialColor colour2) {
        return new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, (p_152624_) -> {
            return p_152624_.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? colour : colour2;
        }).strength(2.0F).sound(SoundType.WOOD));
    }
    //Configure wooden stairs
    private static StairBlock woodStairs(MaterialColor colour) {
        return new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD, colour).strength(2.0F, 3.0F).sound(SoundType.WOOD));
    }
    //Configure wooden slab
    private static SlabBlock woodSlab(MaterialColor colour) {
        return new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD, colour).strength(2.0F, 3.0F).sound(SoundType.WOOD));
    }
    //Configure wooden fence
    private static FenceBlock woodFence(MaterialColor colour) {
        return new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, colour).strength(2.0F, 3.0F).sound(SoundType.WOOD));
    }
    //Configure wooden gate
    private static FenceGateBlock woodFenceGate(MaterialColor colour, WoodType type) {
        return new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD, colour).strength(2.0F, 3.0F).sound(SoundType.WOOD), type);
    }
    //Configure leaves blocks
    private static LeavesBlock leaves(MaterialColor colour) {
        return new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES, colour).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().isValidSpawn(RegionsUnexploredBlocks::ocelotOrParrot).isSuffocating(RegionsUnexploredBlocks::never).isViewBlocking(RegionsUnexploredBlocks::never));
    }
    private static MauveLeavesBlock mauveLeaves(MaterialColor colour) {
        return new MauveLeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES, colour).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().isValidSpawn(RegionsUnexploredBlocks::ocelotOrParrot).isSuffocating(RegionsUnexploredBlocks::never).isViewBlocking(RegionsUnexploredBlocks::never));
    }
    private static CherryLeavesBlock cherryLeaves(MaterialColor colour) {
        return new CherryLeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES, colour).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().isValidSpawn(RegionsUnexploredBlocks::ocelotOrParrot).isSuffocating(RegionsUnexploredBlocks::never).isViewBlocking(RegionsUnexploredBlocks::never));
    }
    private static JoshuaLeavesBlock joshuaLeaves(MaterialColor colour) {
        return new JoshuaLeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES, colour).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().noCollission());
    }
    private static LeavesBlock appleLeaves(MaterialColor colour) {
        return new AppleLeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES, colour).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().isValidSpawn(RegionsUnexploredBlocks::ocelotOrParrot).isSuffocating(RegionsUnexploredBlocks::never).isViewBlocking(RegionsUnexploredBlocks::never));
    }
    private static RuSculkLeavesBlock sculkLeaves(MaterialColor colour) {
        return new RuSculkLeavesBlock(colour);
    }


    //Boolean states
    private static Boolean always(BlockState state, BlockGetter getter, BlockPos pos, EntityType<?> type) {
        return (boolean)true;
    }
    private static boolean always(BlockState state, BlockGetter getter, BlockPos pos) {
        return true;
    }
    private static Boolean never(BlockState state, BlockGetter getter, BlockPos pos, EntityType<?> type) {
        return (boolean)false;
    }
    private static boolean never(BlockState state, BlockGetter getter, BlockPos pos) {
        return false;
    }
    private static Boolean ocelotOrParrot(BlockState state, BlockGetter getter, BlockPos pos, EntityType<?> type) {
        return (boolean)(type == EntityType.OCELOT || type == EntityType.PARROT);
    }
}
