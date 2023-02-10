package net.regions_unexplored.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.*;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.regions_unexplored.RegionsUnexploredMod;
import net.regions_unexplored.block.entity.RuWoodTypes;
import net.regions_unexplored.item.RegionsUnexploredItems;
import net.regions_unexplored.world.level.block.*;
import net.regions_unexplored.world.level.block.grass.*;
import net.regions_unexplored.world.level.block.grower.*;
import net.regions_unexplored.world.level.block.placer.DirtPlacementBlock;
import net.regions_unexplored.world.level.block.placer.GrassPlacementBlock;
import net.regions_unexplored.world.level.block.placer.MudPlacementBlock;
import net.regions_unexplored.world.level.block.placer.SandPlacementBlock;

import java.util.function.Supplier;

public class RegionsUnexploredBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, RegionsUnexploredMod.MOD_ID);
    //PRISMOSS_DONE
    public static final RegistryObject<Block> PRISMOSS = registerBlock("prismoss", () -> new PrismossBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_GREEN).sound(SoundType.STONE).randomTicks().strength(1.5f, 6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_PRISMOSS = registerBlock("deepslate_prismoss", () -> new PrismossBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_GREEN).sound(SoundType.DEEPSLATE).randomTicks().strength(3f, 6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PRISMARITE_CLUSTER = registerBlock("prismarite_cluster", () -> new PrismariteBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().sound(SoundType.AMETHYST).offsetType(BlockBehaviour.OffsetType.XZ).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 10)));
    public static final RegistryObject<Block> LARGE_PRISMARITE_CLUSTER = registerBlock("large_prismarite_cluster", () -> new PrismariteDoubleBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().sound(SoundType.AMETHYST).offsetType(BlockBehaviour.OffsetType.XYZ).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 10)));
    public static final RegistryObject<Block> HANGING_PRISMARITE = registerBlock("hanging_prismarite", () -> new HangingPrismariteBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().sound(SoundType.AMETHYST).offsetType(BlockBehaviour.OffsetType.XZ).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 10)));
    public static final RegistryObject<Block> PRISMOSS_SPROUT = registerBlock("prismoss_sprout", () -> new PrismossSproutBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ)));
    public static final RegistryObject<Block> PRISMAGLASS = registerBlock("prismaglass", () -> new GlassBlock(BlockBehaviour.Properties.of(Material.GLASS).strength(0.3F).sound(SoundType.GLASS).noOcclusion().isValidSpawn(RegionsUnexploredBlocks::never).isRedstoneConductor(RegionsUnexploredBlocks::never).isSuffocating(RegionsUnexploredBlocks::never).isViewBlocking(RegionsUnexploredBlocks::never)));

    //REDSTONE_DONE
    public static final RegistryObject<Block> RAW_REDSTONE_BLOCK = registerBlock("raw_redstone_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_RED).sound(SoundType.TUFF).strength(1.5f).requiresCorrectToolForDrops().isRedstoneConductor(RegionsUnexploredBlocks::always)));
    public static final RegistryObject<Block> REDSTONE_BUD = registerBlock("redstone_bud", () -> new RedstoneBudBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_FIREPROOF_PLANT, MaterialColor.COLOR_RED).noCollission().sound(SoundType.TUFF).offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final RegistryObject<Block> REDSTONE_BULB = registerBlock("redstone_bulb", () -> new RedstoneBulbBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().sound(SoundType.AMETHYST).offsetType(BlockBehaviour.OffsetType.XZ).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 12).isRedstoneConductor(RegionsUnexploredBlocks::never)));
    public static final RegistryObject<Block> POINTED_REDSTONE = registerBlock("pointed_redstone", () -> new PointedRedstoneBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_RED).noOcclusion().sound(SoundType.POINTED_DRIPSTONE).randomTicks().strength(1.5F, 3.0F).dynamicShape().offsetType(BlockBehaviour.OffsetType.XZ).lightLevel(s -> 1).isRedstoneConductor(RegionsUnexploredBlocks::always)));

    //OTHER_CAVE_DONE
    public static final RegistryObject<Block> VIRIDESCENT_NYLIUM = registerBlock("viridescent_nylium", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.GRASS).sound(SoundType.NYLIUM).strength(1.5f, 6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_VIRIDESCENT_NYLIUM = registerBlock("deepslate_viridescent_nylium", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.GRASS).sound(SoundType.NYLIUM).strength(3f, 6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CAVE_HYSSOP = registerBlock("cave_hyssop", () -> new CaveFlowerBlock(MobEffects.LUCK, 10, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final RegistryObject<Block> POTTED_CAVE_HYSSOP = BLOCKS.register("potted_cave_hyssop", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.CAVE_HYSSOP, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
    //GRASS_DONE
    public static final RegistryObject<Block> MEDIUM_GRASS = registerBlock("medium_grass", () -> new RuTallGrassBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ)));
    public static final RegistryObject<Block> SEEDED_GRASS = registerBlock("seeded_grass", () -> new RuTallGrassBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ)));
    public static final RegistryObject<Block> STEPPE_GRASS = registerBlock("steppe_grass", () -> new RuTallGrassBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final RegistryObject<Block> STEPPE_SHRUB = registerBlock("steppe_shrub", () -> new RuTallGrassBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final RegistryObject<Block> STONE_BUD = registerBlock("stone_bud", () -> new StoneBudBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ)));
    //TALL_GRASS_DONE
    public static final RegistryObject<Block> FOREST_FERN = registerBlock("forest_fern", () -> new RuTallGrassBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final RegistryObject<Block> TALL_FOREST_FERN = registerBlock("tall_forest_fern", () -> new RuTallGrassBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final RegistryObject<Block> SEEDED_TALL_GRASS = registerBlock("seeded_tall_grass", () -> new RuDoublePlantBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final RegistryObject<Block> TALL_STEPPE_GRASS = registerBlock("tall_steppe_grass", () -> new RuDoublePlantBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final RegistryObject<Block> ELEPHANT_EAR = registerBlock("elephant_ear", () -> new ElephantEarBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
    //DESERT_DONE
    public static final RegistryObject<Block> DEAD_STEPPE_SHRUB = registerBlock("dead_steppe_shrub", () -> new DeadShrubBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT, MaterialColor.WOOD).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final RegistryObject<Block> SMALL_DESERT_SHRUB = registerBlock("small_desert_shrub", () -> new DeadShrubBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT, MaterialColor.WOOD).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ)));
    public static final RegistryObject<Block> SANDY_GRASS = registerBlock("sandy_grass", () -> new SandyTallGrassBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ)));
    public static final RegistryObject<Block> SANDY_TALL_GRASS = registerBlock("sandy_tall_grass", () -> new SandyDoublePlantBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final RegistryObject<Block> BARREL_CACTUS = registerBlock("barrel_cactus", () -> new BarrelCactusBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final RegistryObject<Block> POTTED_BARREL_CACTUS = BLOCKS.register("potted_barrel_cactus", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.BARREL_CACTUS, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> CACTUS_FLOWER = registerBlock("cactus_flower", () -> new CactusSaplingBlock(new SaguaroCactusGrower()));
    public static final RegistryObject<Block> POTTED_CACTUS_FLOWER = BLOCKS.register("potted_cactus_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.CACTUS_FLOWER, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
    //SNOWY_DONE
    public static final RegistryObject<Block> FROZEN_GRASS = registerBlock("frozen_grass", () -> new SnowyTallGrassBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ)));
    //FOREST_BLOCKS_DONE
    public static final RegistryObject<Block> FOREST_GRASS_BLOCK = registerBlock("forest_grass_block", () -> new ForestGrassBlock(BlockBehaviour.Properties.of(Material.GRASS, MaterialColor.GRASS).randomTicks().strength(0.6F).sound(SoundType.GRASS)));
    public static final RegistryObject<Block> FOREST_DIRT = registerBlock("forest_dirt", () -> new TillableDirtBlock(BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.DIRT).strength(0.5F).sound(SoundType.GRAVEL).randomTicks()));
    public static final RegistryObject<Block> FOREST_DIRT_PATH = registerBlock("forest_dirt_path", () -> new ForestDirtPathBlock(BlockBehaviour.Properties.of(Material.DIRT).strength(0.65F).sound(SoundType.GRASS).isViewBlocking(RegionsUnexploredBlocks::always).isSuffocating(RegionsUnexploredBlocks::always)));
    public static final RegistryObject<Block> FOREST_COARSE_DIRT = registerBlock("forest_coarse_dirt", () -> new TillableDirtBlock(BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.DIRT).strength(0.5F).sound(SoundType.GRAVEL)));
    public static final RegistryObject<Block> FOREST_MUD = registerBlock("forest_mud", () -> new RuMudBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).color(MaterialColor.TERRACOTTA_BROWN).randomTicks().isValidSpawn(RegionsUnexploredBlocks::always).isRedstoneConductor(RegionsUnexploredBlocks::always).isViewBlocking(RegionsUnexploredBlocks::always).isSuffocating(RegionsUnexploredBlocks::always).sound(SoundType.MUD)));
    public static final RegistryObject<Block> FOREST_FARMLAND = registerBlock("forest_farmland", () -> new ForestFarmBlock(BlockBehaviour.Properties.of(Material.DIRT).randomTicks().strength(0.6F).sound(SoundType.GRAVEL).isViewBlocking(RegionsUnexploredBlocks::always).isSuffocating(RegionsUnexploredBlocks::always)));
    //PLAINS_BLOCK_DONE
    public static final RegistryObject<Block> PLAINS_GRASS_BLOCK = registerBlock("plains_grass_block", () -> new PlainsGrassBlock(BlockBehaviour.Properties.of(Material.GRASS, MaterialColor.GRASS).randomTicks().strength(0.6F).sound(SoundType.GRASS)));
    public static final RegistryObject<Block> PLAINS_DIRT = registerBlock("plains_dirt", () -> new TillableDirtBlock(BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.DIRT).strength(0.5F).sound(SoundType.GRAVEL).randomTicks()));
    public static final RegistryObject<Block> PLAINS_DIRT_PATH = registerBlock("plains_dirt_path", () -> new PlainsDirtPathBlock(BlockBehaviour.Properties.of(Material.DIRT).strength(0.65F).sound(SoundType.GRASS).isViewBlocking(RegionsUnexploredBlocks::always).isSuffocating(RegionsUnexploredBlocks::always)));
    public static final RegistryObject<Block> PLAINS_COARSE_DIRT = registerBlock("plains_coarse_dirt", () -> new TillableDirtBlock(BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.DIRT).strength(0.5F).sound(SoundType.GRAVEL)));
    public static final RegistryObject<Block> PLAINS_MUD = registerBlock("plains_mud", () -> new RuMudBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).color(MaterialColor.TERRACOTTA_YELLOW).randomTicks().isValidSpawn(RegionsUnexploredBlocks::always).isRedstoneConductor(RegionsUnexploredBlocks::always).isViewBlocking(RegionsUnexploredBlocks::always).isSuffocating(RegionsUnexploredBlocks::always).sound(SoundType.MUD)));
    public static final RegistryObject<Block> PLAINS_FARMLAND = registerBlock("plains_farmland", () -> new PlainsFarmBlock(BlockBehaviour.Properties.of(Material.DIRT).randomTicks().strength(0.6F).sound(SoundType.GRAVEL).isViewBlocking(RegionsUnexploredBlocks::always).isSuffocating(RegionsUnexploredBlocks::always)));
    //ALPHA_BLOCKS_DONE
    public static final RegistryObject<Block> ALPHA_GRASS_BLOCK = registerBlock("alpha_grass_block", () -> new AlphaGrassBlock(BlockBehaviour.Properties.of(Material.GRASS, MaterialColor.GRASS).randomTicks().strength(0.6F).sound(SoundType.GRAVEL)));
    //OTHER_GRASS_DONE
    public static final RegistryObject<Block> STONE_GRASS_BLOCK = registerBlock("stone_grass_block", () -> new StoneGrassBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.GRASS).sound(SoundType.STONE).randomTicks().strength(1.5f, 6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_GRASS_BLOCK = registerBlock("deepslate_grass_block", () -> new DeepslateGrassBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.GRASS).sound(SoundType.DEEPSLATE).randomTicks().strength(3f, 6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHALK_GRASS_BLOCK = registerBlock("chalk_grass_block", () -> new ChalkGrassBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.GRASS).sound(SoundType.TUFF).randomTicks().strength(0.6f).requiresCorrectToolForDrops()));
    //FLOWERS_DONE
    public static final RegistryObject<Block> BLUE_LUPINE = registerBlock("blue_lupine", () -> new RuFlowerBlock(MobEffects.SATURATION, 4, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final RegistryObject<Block> POTTED_BLUE_LUPINE = BLOCKS.register("potted_blue_lupine", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.BLUE_LUPINE, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
    public static final RegistryObject<Block> PINK_LUPINE = registerBlock("pink_lupine", () -> new RuFlowerBlock(MobEffects.SATURATION, 4, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final RegistryObject<Block> POTTED_PINK_LUPINE = BLOCKS.register("potted_pink_lupine", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.PINK_LUPINE, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
    public static final RegistryObject<Block> PURPLE_LUPINE = registerBlock("purple_lupine", () -> new RuFlowerBlock(MobEffects.SATURATION, 4, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final RegistryObject<Block> POTTED_PURPLE_LUPINE = BLOCKS.register("potted_purple_lupine", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.PURPLE_LUPINE, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_LUPINE = registerBlock("red_lupine", () -> new RuFlowerBlock(MobEffects.SATURATION, 4, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final RegistryObject<Block> POTTED_RED_LUPINE = BLOCKS.register("potted_red_lupine", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.RED_LUPINE, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
    public static final RegistryObject<Block> YELLOW_LUPINE = registerBlock("yellow_lupine", () -> new RuFlowerBlock(MobEffects.SATURATION, 4, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final RegistryObject<Block> POTTED_YELLOW_LUPINE = BLOCKS.register("potted_yellow_lupine", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.YELLOW_LUPINE, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
    public static final RegistryObject<Block> HYSSOP = registerBlock("hyssop", () -> new RuFlowerBlock(MobEffects.LUCK, 10, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final RegistryObject<Block> POTTED_HYSSOP = BLOCKS.register("potted_hyssop", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.HYSSOP, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
    public static final RegistryObject<Block> FIREWEED = registerBlock("fireweed", () -> new RuFlowerBlock(MobEffects.GLOWING, 2, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final RegistryObject<Block> POTTED_FIREWEED = BLOCKS.register("potted_fireweed", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.FIREWEED, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
    public static final RegistryObject<Block> DAISY = registerBlock("daisy", () -> new RuFlowerBlock(MobEffects.MOVEMENT_SPEED, 8, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final RegistryObject<Block> POTTED_DAISY = BLOCKS.register("potted_daisy", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.DAISY, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
    public static final RegistryObject<Block> FELICIA_DAISY = registerBlock("felicia_daisy", () -> new RuFlowerBlock(MobEffects.MOVEMENT_SPEED, 8, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final RegistryObject<Block> POTTED_FELICIA_DAISY = BLOCKS.register("potted_felicia_daisy", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.FELICIA_DAISY, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
    public static final RegistryObject<Block> WARATAH = registerBlock("waratah", () -> new RuFlowerBlock(MobEffects.JUMP, 5, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final RegistryObject<Block> POTTED_WARATAH = BLOCKS.register("potted_waratah", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.WARATAH, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
    public static final RegistryObject<Block> WHITE_TRILLIUM = registerBlock("white_trillium", () -> new RuFlowerBlock(MobEffects.DIG_SPEED, 7, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final RegistryObject<Block> POTTED_WHITE_TRILLIUM = BLOCKS.register("potted_white_trillium", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.WHITE_TRILLIUM, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
    public static final RegistryObject<Block> POPPY_BUSH = registerBlock("poppy_bush", () -> new RuFlowerBlock(MobEffects.WEAKNESS, 3, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ)));
    public static final RegistryObject<Block> POTTED_POPPY_BUSH = BLOCKS.register("potted_poppy_bush", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.POPPY_BUSH, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
    public static final RegistryObject<Block> ALPHA_ROSE = registerBlock("alpha_rose", () -> new RuFlowerBlock(MobEffects.JUMP, 5, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final RegistryObject<Block> POTTED_ALPHA_ROSE = BLOCKS.register("potted_alpha_rose", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.ALPHA_ROSE, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
    public static final RegistryObject<Block> ALPHA_DANDELION = registerBlock("alpha_dandelion", () -> new RuFlowerBlock(MobEffects.JUMP, 5, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final RegistryObject<Block> POTTED_ALPHA_DANDELION = BLOCKS.register("potted_alpha_dandelion", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.ALPHA_DANDELION, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
    public static final RegistryObject<Block> WILTING_TRILLIUM = registerBlock("wilting_trillium", () -> new RuFlowerBlock(MobEffects.DIG_SLOWDOWN, 4, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final RegistryObject<Block> POTTED_WILTING_TRILLIUM = BLOCKS.register("potted_wilting_trillium", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.WILTING_TRILLIUM, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
    public static final RegistryObject<Block> DORCEL = registerBlock("dorcel", () -> new DorcelPlantBlock(MobEffects.WITHER, 20, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final RegistryObject<Block> POTTED_DORCEL = BLOCKS.register("potted_dorcel", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.DORCEL, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
    public static final RegistryObject<Block> BLUE_BIOSHROOM = registerBlock("blue_bioshroom", () -> new BioshroomBlock(MobEffects.POISON, 10, BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_LIGHT_BLUE).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 10)));
    public static final RegistryObject<Block> POTTED_BLUE_BIOSHROOM = BLOCKS.register("potted_blue_bioshroom", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.BLUE_BIOSHROOM, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE).lightLevel(s -> 10)));
    public static final RegistryObject<Block> GREEN_BIOSHROOM = registerBlock("green_bioshroom", () -> new BioshroomBlock(MobEffects.POISON, 10, BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_LIGHT_GREEN).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 10)));
    public static final RegistryObject<Block> POTTED_GREEN_BIOSHROOM = BLOCKS.register("potted_green_bioshroom", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.GREEN_BIOSHROOM, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE).lightLevel(s -> 10)));
    public static final RegistryObject<Block> PINK_BIOSHROOM = registerBlock("pink_bioshroom", () -> new BioshroomBlock(MobEffects.POISON, 10, BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_PINK).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 10)));
    public static final RegistryObject<Block> POTTED_PINK_BIOSHROOM = BLOCKS.register("potted_pink_bioshroom", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.PINK_BIOSHROOM, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE).lightLevel(s -> 10)));
    public static final RegistryObject<Block> POTTED_YELLOW_BIOSHROOM = BLOCKS.register("potted_yellow_bioshroom", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.YELLOW_BIOSHROOM, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE).lightLevel(s -> 10)));
    public static final RegistryObject<Block> BLUE_BIOSHROOM_BLOCK = registerBlock("blue_bioshroom_block", () -> new Block(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_GREEN).sound(SoundType.WART_BLOCK).strength(0.6f)));
    public static final RegistryObject<Block> GREEN_BIOSHROOM_BLOCK = registerBlock("green_bioshroom_block", () -> new Block(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_GREEN).sound(SoundType.WART_BLOCK).strength(0.6f)));
    public static final RegistryObject<Block> PINK_BIOSHROOM_BLOCK = registerBlock("pink_bioshroom_block", () -> new Block(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_GREEN).sound(SoundType.WART_BLOCK).strength(0.6f)));
    //TALL_FLOWERS_DONE
    public static final RegistryObject<Block> BARLEY = registerBlock("barley", () -> new RuDoublePlantBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final RegistryObject<Block> TASSEL = registerBlock("tassel", () -> new RuDoubleFlowerBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final RegistryObject<Block> TSUBAKI = registerBlock("tsubaki", () -> new RuDoubleFlowerBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
    //OTHER_DONE
    public static final RegistryObject<Block> SPANISH_MOSS = registerBlock("spanish_moss", () ->  new SpanishMossBlock(BlockBehaviour.Properties.of(Material.PLANT).randomTicks().noCollission().instabreak().sound(SoundType.AZALEA_LEAVES)));
    public static final RegistryObject<Block> SPANISH_MOSS_PLANT = BLOCKS.register("spanish_moss_plant", () ->  new SpanishMossPlantBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.AZALEA_LEAVES)));
    public static final RegistryObject<Block> DUCKWEED = registerDuckweedBlock("duckweed", () -> new DuckweedBlock());
    public static final RegistryObject<Block> CATTAIL = registerBlock("cattail", () -> new CattailBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
    //BAMBOO_BLOCKS_DONE
    public static final RegistryObject<Block> BAMBOO_LOG = registerBlock("bamboo_log", () -> new BambooLogBlock());
    public static final RegistryObject<Block> STRIPPED_BAMBOO_LOG = registerBlock("stripped_bamboo_log", () -> new StrippedBambooLogBlock());
    public static final RegistryObject<Block> BAMBOO_LOG_LEAVES = registerBlock("bamboo_log_leaves", () -> new BambooLogBlock());
    //TALL_SAPLINGS
    //TODO add missing saplings
    public static final RegistryObject<Block> TALL_EUCALYPTUS_SAPLING = registerBlock("tall_eucalyptus_sapling", () -> new RuDoublePlantBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final RegistryObject<Block> TALL_JOSHUA_SAPLING = registerBlock("tall_joshua_sapling", () -> new RuDoublePlantBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final RegistryObject<Block> TALL_GOLDEN_LARCH_SAPLING = registerBlock("tall_golden_larch_sapling", () -> new TallSaplingBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final RegistryObject<Block> TALL_LARCH_SAPLING = registerBlock("tall_larch_sapling", () -> new TallSaplingBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final RegistryObject<Block> TALL_MAPLE_SAPLING = registerBlock("tall_maple_sapling", () -> new TallSaplingBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final RegistryObject<Block> TALL_ORANGE_MAPLE_SAPLING = registerBlock("tall_orange_maple_sapling", () -> new TallSaplingBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final RegistryObject<Block> TALL_RED_MAPLE_SAPLING = registerBlock("tall_red_maple_sapling", () -> new TallSaplingBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final RegistryObject<Block> TALL_MAUVE_SAPLING = registerBlock("tall_mauve_sapling", () -> new TallSaplingBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final RegistryObject<Block> TALL_PINE_SAPLING = registerBlock("tall_pine_sapling", () -> new TallSaplingBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final RegistryObject<Block> TALL_REDWOOD_SAPLING = registerBlock("tall_redwood_sapling", () -> new RuDoublePlantBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final RegistryObject<Block> TALL_SILVER_BIRCH_SAPLING = registerBlock("tall_silver_birch_sapling", () -> new TallSaplingBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final RegistryObject<Block> TALL_SPRUCE_SAPLING = registerBlock("tall_spruce_sapling", () -> new TallSaplingBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
    //BRANCHES_DONE
    public static final RegistryObject<Block> BAOBAB_BRANCH = registerBlock("baobab_branch", () -> new BranchBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().sound(SoundType.GRASS).strength(1.0F, 1.5F).dynamicShape()));
    public static final RegistryObject<Block> BIRCH_BRANCH = registerBlock("birch_branch", () -> new BranchBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().sound(SoundType.GRASS).strength(1.0F, 1.5F).dynamicShape()));
    public static final RegistryObject<Block> BLACKWOOD_BRANCH = registerBlock("blackwood_branch", () -> new BranchBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().sound(SoundType.GRASS).strength(1.0F, 1.5F).dynamicShape()));
    public static final RegistryObject<Block> CHERRY_BRANCH = registerBlock("cherry_branch", () -> new BranchBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().sound(SoundType.GRASS).strength(1.0F, 1.5F).dynamicShape()));
    public static final RegistryObject<Block> CYPRESS_BRANCH = registerBlock("cypress_branch", () -> new BranchBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().sound(SoundType.GRASS).strength(1.0F, 1.5F).dynamicShape()));
    public static final RegistryObject<Block> DEAD_BRANCH = registerBlock("dead_branch", () -> new BranchBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().sound(SoundType.GRASS).strength(1.0F, 1.5F).dynamicShape()));
    public static final RegistryObject<Block> EUCALYPTUS_BRANCH = registerBlock("eucalyptus_branch", () -> new BranchBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().sound(SoundType.GRASS).strength(1.0F, 1.5F).dynamicShape()));
    public static final RegistryObject<Block> JOSHUA_BEARD = registerBlock("joshua_beard", () -> new BranchBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().sound(SoundType.GRASS).strength(1.0F, 1.5F).dynamicShape()));
    public static final RegistryObject<Block> JUNGLE_BRANCH = registerBlock("jungle_branch", () -> new BranchBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().sound(SoundType.GRASS).strength(1.0F, 1.5F).dynamicShape()));
    public static final RegistryObject<Block> LARCH_BRANCH = registerBlock("larch_branch", () -> new BranchBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().sound(SoundType.GRASS).strength(1.0F, 1.5F).dynamicShape()));
    public static final RegistryObject<Block> MAPLE_BRANCH = registerBlock("maple_branch", () -> new BranchBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().sound(SoundType.GRASS).strength(1.0F, 1.5F).dynamicShape()));
    public static final RegistryObject<Block> MAUVE_BRANCH = registerBlock("mauve_branch", () -> new BranchBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().sound(SoundType.GRASS).strength(1.0F, 1.5F).dynamicShape()));
    public static final RegistryObject<Block> OAK_BRANCH = registerBlock("oak_branch", () -> new BranchBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().sound(SoundType.GRASS).strength(1.0F, 1.5F).dynamicShape()));
    public static final RegistryObject<Block> PALM_BEARD = registerBlock("palm_beard", () -> new BranchBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().sound(SoundType.GRASS).strength(1.0F, 1.5F).dynamicShape()));
    public static final RegistryObject<Block> PINE_BRANCH = registerBlock("pine_branch", () -> new BranchBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().sound(SoundType.GRASS).strength(1.0F, 1.5F).dynamicShape()));
    public static final RegistryObject<Block> REDWOOD_BRANCH = registerBlock("redwood_branch", () -> new BranchBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().sound(SoundType.GRASS).strength(1.0F, 1.5F).dynamicShape()));
    public static final RegistryObject<Block> SPRUCE_BRANCH = registerBlock("spruce_branch", () -> new BranchBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().sound(SoundType.GRASS).strength(1.0F, 1.5F).dynamicShape()));
    public static final RegistryObject<Block> WILLOW_BRANCH = registerBlock("willow_branch", () -> new BranchBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().sound(SoundType.GRASS).strength(1.0F, 1.5F).dynamicShape()));
    //SAPLINGS_DONE
    public static final RegistryObject<Block> SCULKWOOD_SAPLING = registerBlock("sculkwood_sapling", () -> new SculkSaplingBlock(new SculkwoodGrower()));
    public static final RegistryObject<Block> POTTED_SCULKWOOD_SAPLING = BLOCKS.register("potted_sculkwood_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.SCULKWOOD_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
    public static final RegistryObject<Block> ALPHA_SAPLING = registerBlock("alpha_sapling", () -> new RuSaplingBlock(new AlphaOakGrower()));
    public static final RegistryObject<Block> POTTED_ALPHA_SAPLING = BLOCKS.register("potted_alpha_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.ALPHA_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
    public static final RegistryObject<Block> APPLE_OAK_SAPLING = registerBlock("apple_oak_sapling", () -> new RuSaplingBlock(new AppleOakTreeGrower()));
    public static final RegistryObject<Block> POTTED_APPLE_OAK_SAPLING = BLOCKS.register("potted_apple_oak_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.APPLE_OAK_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
    public static final RegistryObject<Block> FLOWERING_SAPLING = registerBlock("flowering_sapling", () -> new RuSaplingBlock(new FloweringTreeGrower()));
    public static final RegistryObject<Block> POTTED_FLOWERING_SAPLING = BLOCKS.register("potted_flowering_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.FLOWERING_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
    public static final RegistryObject<Block> BAMBOO_SAPLING = registerBlock("bamboo_sapling", () -> new RuSaplingBlock(new GiantBambooGrower()));
    public static final RegistryObject<Block> POTTED_BAMBOO_SAPLING = BLOCKS.register("potted_bamboo_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.BAMBOO_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
    public static final RegistryObject<Block> SILVER_BIRCH_SAPLING = registerBlock("silver_birch_sapling", () -> new RuSaplingBlock(new SilverBirchTreeGrower()));
    public static final RegistryObject<Block> POTTED_SILVER_BIRCH_SAPLING = BLOCKS.register("potted_silver_birch_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.SILVER_BIRCH_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
    public static final RegistryObject<Block> BAOBAB_SAPLING = registerBlock("baobab_sapling", () -> new RuSaplingBlock(new BaobabTreeGrower()));
    public static final RegistryObject<Block> POTTED_BAOBAB_SAPLING = BLOCKS.register("potted_baobab_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.BAOBAB_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
    //TODO retexture blackwood_sapling
    public static final RegistryObject<Block> BLACKWOOD_SAPLING = registerBlock("blackwood_sapling", () -> new RuSaplingBlock(new BlackwoodTreeGrower()));
    public static final RegistryObject<Block> POTTED_BLACKWOOD_SAPLING = BLOCKS.register("potted_blackwood_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.BLACKWOOD_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERRY_SAPLING = registerBlock("cherry_sapling", () -> new RuSaplingBlock(new CherryTreeGrower()));
    public static final RegistryObject<Block> POTTED_CHERRY_SAPLING = BLOCKS.register("potted_cherry_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.CHERRY_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_CHERRY_SAPLING = registerBlock("red_cherry_sapling", () -> new RuSaplingBlock(new RedCherryTreeGrower()));
    public static final RegistryObject<Block> POTTED_RED_CHERRY_SAPLING = BLOCKS.register("potted_red_cherry_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.RED_CHERRY_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
    public static final RegistryObject<Block> PINK_CHERRY_SAPLING = registerBlock("pink_cherry_sapling", () -> new RuSaplingBlock(new PinkCherryTreeGrower()));
    public static final RegistryObject<Block> POTTED_PINK_CHERRY_SAPLING = BLOCKS.register("potted_pink_cherry_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.PINK_CHERRY_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
    public static final RegistryObject<Block> WHITE_CHERRY_SAPLING = registerBlock("white_cherry_sapling", () -> new RuSaplingBlock(new WhiteCherryTreeGrower()));
    public static final RegistryObject<Block> POTTED_WHITE_CHERRY_SAPLING = BLOCKS.register("potted_white_cherry_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.WHITE_CHERRY_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
    public static final RegistryObject<Block> CYPRESS_SAPLING = registerBlock("cypress_sapling", () -> new RuSaplingBlock(new CypressTreeGrower()));
    public static final RegistryObject<Block> POTTED_CYPRESS_SAPLING = BLOCKS.register("potted_cypress_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.CYPRESS_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
    public static final RegistryObject<Block> DEAD_SAPLING = registerBlock("dead_sapling", () -> new RuSaplingBlock(new DeadTreeGrower()));
    public static final RegistryObject<Block> POTTED_DEAD_SAPLING = BLOCKS.register("potted_dead_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.DEAD_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
    public static final RegistryObject<Block> DEAD_PINE_SAPLING = registerBlock("dead_pine_sapling", () -> new RuSaplingBlock(new DeadPineTreeGrower()));
    public static final RegistryObject<Block> POTTED_DEAD_PINE_SAPLING = BLOCKS.register("potted_dead_pine_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.DEAD_PINE_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
    public static final RegistryObject<Block> EUCALYPTUS_SAPLING = registerBlock("eucalyptus_sapling", () -> new RuSaplingBlock(new EucalyptusTreeGrower()));
    public static final RegistryObject<Block> POTTED_EUCALYPTUS_SAPLING = BLOCKS.register("potted_eucalyptus_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.EUCALYPTUS_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
    public static final RegistryObject<Block> JOSHUA_SAPLING = registerBlock("joshua_sapling", () -> new RuSaplingBlock(new JoshuaTreeGrower()));
    public static final RegistryObject<Block> POTTED_JOSHUA_SAPLING = BLOCKS.register("potted_joshua_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.JOSHUA_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
    public static final RegistryObject<Block> GOLDEN_LARCH_SAPLING = registerBlock("golden_larch_sapling", () -> new RuSaplingBlock(new GoldenLarchTreeGrower()));
    public static final RegistryObject<Block> POTTED_GOLDEN_LARCH_SAPLING = BLOCKS.register("potted_golden_larch_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.GOLDEN_LARCH_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
    public static final RegistryObject<Block> LARCH_SAPLING = registerBlock("larch_sapling", () -> new RuSaplingBlock(new LarchTreeGrower()));
    public static final RegistryObject<Block> POTTED_LARCH_SAPLING = BLOCKS.register("potted_larch_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.LARCH_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
    public static final RegistryObject<Block> MAPLE_SAPLING = registerBlock("maple_sapling", () -> new RuSaplingBlock(new MapleTreeGrower()));
    public static final RegistryObject<Block> POTTED_MAPLE_SAPLING = BLOCKS.register("potted_maple_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.MAPLE_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_MAPLE_SAPLING = registerBlock("red_maple_sapling", () -> new RuSaplingBlock(new RedMapleTreeGrower()));
    public static final RegistryObject<Block> POTTED_RED_MAPLE_SAPLING = BLOCKS.register("potted_red_maple_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.RED_MAPLE_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
    public static final RegistryObject<Block> ORANGE_MAPLE_SAPLING = registerBlock("orange_maple_sapling", () -> new RuSaplingBlock(new OrangeMapleTreeGrower()));
    public static final RegistryObject<Block> POTTED_ORANGE_MAPLE_SAPLING = BLOCKS.register("potted_orange_maple_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.ORANGE_MAPLE_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
    public static final RegistryObject<Block> MAUVE_SAPLING = registerBlock("mauve_sapling", () -> new RuSaplingBlock(new MauveOakGrower()));
    public static final RegistryObject<Block> POTTED_MAUVE_SAPLING = BLOCKS.register("potted_mauve_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.MAUVE_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
    public static final RegistryObject<Block> PALM_SAPLING = registerBlock("palm_sapling", () -> new RuSaplingBlock(new PalmTreeGrower()));
    public static final RegistryObject<Block> POTTED_PALM_SAPLING = BLOCKS.register("potted_palm_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.PALM_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
    public static final RegistryObject<Block> PINE_SAPLING = registerBlock("pine_sapling", () -> new RuSaplingBlock(new PineTreeGrower()));
    public static final RegistryObject<Block> POTTED_PINE_SAPLING = BLOCKS.register("potted_pine_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.PINE_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
    //TODO retexture redwood_sapling
    public static final RegistryObject<Block> REDWOOD_SAPLING = registerBlock("redwood_sapling", () -> new RuSaplingBlock(new RedwoodTreeGrower()));
    public static final RegistryObject<Block> POTTED_REDWOOD_SAPLING = BLOCKS.register("potted_redwood_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.REDWOOD_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
    public static final RegistryObject<Block> WILLOW_SAPLING = registerBlock("willow_sapling", () -> new RuSaplingBlock(new WillowTreeGrower()));
    public static final RegistryObject<Block> POTTED_WILLOW_SAPLING = BLOCKS.register("potted_willow_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RegionsUnexploredBlocks.WILLOW_SAPLING, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.STONE)));
    //SAGUARO_DONE
    public static final RegistryObject<Block> SAGUARO_CACTUS = registerBlock("saguaro_cactus", () -> new SaguaroCactusBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_LIGHT_GREEN).sound(SoundType.WOOL).strength(2f)));
    public static final RegistryObject<Block> SAGUARO_CACTUS_CORNER = registerBlock("saguaro_cactus_corner", () -> new CactusCornerBlock());
    //LEAVES_DONE
    public static final RegistryObject<Block> ALPHA_LEAVES = registerBlock("alpha_leaves", () ->  leaves(MaterialColor.COLOR_LIGHT_GREEN));
    public static final RegistryObject<Block> APPLE_OAK_LEAVES = registerBlock("apple_oak_leaves", () ->  appleLeaves(MaterialColor.PLANT));
    public static final RegistryObject<Block> FLOWERING_LEAVES = registerBlock("flowering_leaves", () ->  leaves(MaterialColor.PLANT));
    public static final RegistryObject<Block> SILVER_BIRCH_LEAVES = registerBlock("silver_birch_leaves", () ->  leaves(MaterialColor.COLOR_YELLOW));
    public static final RegistryObject<Block> BAMBOO_LEAVES = registerBlock("bamboo_leaves", () ->  leaves(MaterialColor.PLANT));
    public static final RegistryObject<Block> BAOBAB_LEAVES = registerBlock("baobab_leaves", () ->  leaves(MaterialColor.PLANT));
    public static final RegistryObject<Block> BLACKWOOD_LEAVES = registerBlock("blackwood_leaves", () ->  leaves(MaterialColor.TERRACOTTA_GREEN));
    public static final RegistryObject<Block> CHERRY_LEAVES = registerBlock("cherry_leaves", () ->  leaves(MaterialColor.PLANT));
    public static final RegistryObject<Block> RED_CHERRY_LEAVES = registerBlock("red_cherry_leaves", () ->  leaves(MaterialColor.COLOR_RED));
    public static final RegistryObject<Block> PINK_CHERRY_LEAVES = registerBlock("pink_cherry_leaves", () ->  leaves(MaterialColor.COLOR_PINK));
    public static final RegistryObject<Block> WHITE_CHERRY_LEAVES = registerBlock("white_cherry_leaves", () ->  leaves(MaterialColor.TERRACOTTA_WHITE));
    public static final RegistryObject<Block> CYPRESS_LEAVES = registerBlock("cypress_leaves", () ->  leaves(MaterialColor.PLANT));
    public static final RegistryObject<Block> DEAD_LEAVES = registerBlock("dead_leaves", () ->  leaves(MaterialColor.TERRACOTTA_GRAY));
    public static final RegistryObject<Block> DEAD_PINE_LEAVES = registerBlock("dead_pine_leaves", () ->  leaves(MaterialColor.TERRACOTTA_GRAY));
    public static final RegistryObject<Block> EUCALYPTUS_LEAVES = registerBlock("eucalyptus_leaves", () ->  leaves(MaterialColor.PLANT));
    public static final RegistryObject<Block> JOSHUA_LEAVES = registerBlock("joshua_leaves", () ->  joshuaLeaves(MaterialColor.PLANT));
    public static final RegistryObject<Block> GOLDEN_LARCH_LEAVES = registerBlock("golden_larch_leaves", () ->  leaves(MaterialColor.COLOR_YELLOW));
    public static final RegistryObject<Block> LARCH_LEAVES = registerBlock("larch_leaves", () ->  leaves(MaterialColor.PLANT));
    public static final RegistryObject<Block> MAPLE_LEAVES = registerBlock("maple_leaves", () ->  leaves(MaterialColor.PLANT));
    public static final RegistryObject<Block> RED_MAPLE_LEAVES = registerBlock("red_maple_leaves", () ->  leaves(MaterialColor.COLOR_RED));
    public static final RegistryObject<Block> ORANGE_MAPLE_LEAVES = registerBlock("orange_maple_leaves", () ->  leaves(MaterialColor.COLOR_ORANGE));
    public static final RegistryObject<Block> MAUVE_LEAVES = registerBlock("mauve_leaves", () ->  leaves(MaterialColor.COLOR_PURPLE));
    public static final RegistryObject<Block> PALM_LEAVES = registerBlock("palm_leaves", () ->  leaves(MaterialColor.PLANT));
    public static final RegistryObject<Block> PINE_LEAVES = registerBlock("pine_leaves", () ->  leaves(MaterialColor.PLANT));
    public static final RegistryObject<Block> REDWOOD_LEAVES = registerBlock("redwood_leaves", () ->  leaves(MaterialColor.PLANT));
    public static final RegistryObject<Block> WILLOW_LEAVES = registerBlock("willow_leaves", () ->  leaves(MaterialColor.PLANT));
    //CHALKS_DONE
    public static final RegistryObject<Block> CHALK = registerBlock("chalk", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE).sound(SoundType.TUFF).strength(0.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHALK_STAIRS = registerBlock("chalk_stairs", () -> new StairBlock(CHALK.get().defaultBlockState(), BlockBehaviour.Properties.copy(CHALK.get())));
    public static final RegistryObject<Block> CHALK_SLAB = registerBlock("chalk_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE).sound(SoundType.TUFF).strength(0.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> POLISHED_CHALK = registerBlock("polished_chalk", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE).sound(SoundType.TUFF).strength(0.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> POLISHED_CHALK_STAIRS = registerBlock("polished_chalk_stairs", () -> new StairBlock(CHALK.get().defaultBlockState(), BlockBehaviour.Properties.copy(POLISHED_CHALK.get())));
    public static final RegistryObject<Block> POLISHED_CHALK_SLAB = registerBlock("polished_chalk_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE).sound(SoundType.TUFF).strength(0.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHALK_BRICKS = registerBlock("chalk_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE).sound(SoundType.TUFF).strength(0.6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHALK_BRICK_STAIRS = registerBlock("chalk_brick_stairs", () -> new StairBlock(CHALK.get().defaultBlockState(), BlockBehaviour.Properties.copy(CHALK_BRICKS.get())));
    public static final RegistryObject<Block> CHALK_BRICK_SLAB = registerBlock("chalk_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE).sound(SoundType.TUFF).strength(0.6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHALK_PILLAR = registerBlock("chalk_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE).sound(SoundType.TUFF).strength(0.6f).requiresCorrectToolForDrops()));
    //MOSSY_STONES_DONE
    public static final RegistryObject<Block> MOSSY_STONE = registerBlock("mossy_stone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE).sound(SoundType.STONE).strength(1.5f, 6f).requiresCorrectToolForDrops()));
    //OTHER_DONE
    public static final RegistryObject<Block> ASH = registerBlock("ash", () -> new AshBlock(BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.COLOR_GRAY).strength(0.5F).sound(SoundType.GRAVEL).randomTicks().speedFactor(0.7f)));
    public static final RegistryObject<Block> VOLCANIC_ASH = registerBlock("volcanic_ash", () -> new AshBlock(BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.COLOR_BLACK).strength(0.5F).sound(SoundType.GRAVEL).randomTicks().speedFactor(0.7f)));
    public static final RegistryObject<Block> ASH_VENT = registerBlock("ash_vent", () -> new AshVentBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK).strength(1.6F).sound(SoundType.BASALT).randomTicks().requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> QUICKSAND = registerBlock("quicksand", () -> new QuicksandBlock(BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.SAND).strength(0.5F).sound(SoundType.GRAVEL).requiresCorrectToolForDrops().randomTicks().noCollission().isSuffocating(RegionsUnexploredBlocks::always).isViewBlocking(RegionsUnexploredBlocks::always).isValidSpawn(RegionsUnexploredBlocks::never)));
    //ALPHA_DONE
    public static final RegistryObject<Block> ALPHA_LOG = registerBlock("alpha_log", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ALPHA_PLANKS = registerBlock("alpha_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ALPHA_STAIRS = registerBlock("alpha_stairs", () -> woodStairs(MaterialColor.WOOD));
    public static final RegistryObject<Block> ALPHA_SLAB = registerBlock("alpha_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.WOOD).strength(1.5F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    //SILVER_BIRCH_DONE
    public static final RegistryObject<Block> SILVER_BIRCH_LOG_BASE = registerBlock("silver_birch_log_base", () -> log(MaterialColor.SAND, MaterialColor.QUARTZ));
    //BAOBAB_BLOCKS
    public static final RegistryObject<Block> BAOBAB_LOG = registerBlock("baobab_log", () -> log(MaterialColor.WOOD, MaterialColor.TERRACOTTA_LIGHT_GRAY));
    public static final RegistryObject<Block> STRIPPED_BAOBAB_LOG = registerBlock("stripped_baobab_log", () -> log(MaterialColor.WOOD, MaterialColor.WOOD));
    public static final RegistryObject<Block> BAOBAB_WOOD = registerBlock("baobab_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_LIGHT_GRAY).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_BAOBAB_WOOD = registerBlock("stripped_baobab_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BAOBAB_PLANKS = registerBlock("baobab_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BAOBAB_STAIRS = registerBlock("baobab_stairs", () -> woodStairs(MaterialColor.WOOD));
    public static final RegistryObject<Block> BAOBAB_SLAB = registerBlock("baobab_slab", () -> woodSlab(MaterialColor.WOOD));
    public static final RegistryObject<Block> BAOBAB_FENCE = registerBlock("baobab_fence", () -> woodFence(MaterialColor.WOOD));
    public static final RegistryObject<Block> BAOBAB_DOOR = registerBlock("baobab_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion(), SoundEvents.WOODEN_DOOR_CLOSE, SoundEvents.WOODEN_DOOR_OPEN));
    public static final RegistryObject<Block> BAOBAB_FENCE_GATE = registerBlock("baobab_fence_gate", () -> woodFenceGate(MaterialColor.WOOD));
    public static final RegistryObject<Block> BAOBAB_TRAPDOOR = registerBlock("baobab_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion().isValidSpawn(RegionsUnexploredBlocks::never), SoundEvents.WOODEN_TRAPDOOR_CLOSE, SoundEvents.WOODEN_TRAPDOOR_OPEN));
    public static final RegistryObject<Block> BAOBAB_PRESSURE_PLATE = registerBlock("baobab_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noCollission().strength(0.5F).sound(SoundType.WOOD), SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_ON));
    public static final RegistryObject<Block> BAOBAB_BUTTON = registerBlock("baobab_button", () -> new ButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD), 30, true, SoundEvents.WOODEN_BUTTON_CLICK_OFF, SoundEvents.WOODEN_BUTTON_CLICK_ON));
    public static final RegistryObject<Block> BAOBAB_SIGN = BLOCKS.register("baobab_sign", () -> new RuStandingSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD), RuWoodTypes.BAOBAB));
    public static final RegistryObject<Block> BAOBAB_WALL_SIGN = BLOCKS.register("baobab_wall_sign", () -> new RuWallSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD).dropsLike(BAOBAB_SIGN.get()), RuWoodTypes.BAOBAB));
    //BLACKWOOD_BLOCKS_DONE
    public static final RegistryObject<Block> BLACKWOOD_LOG = registerBlock("blackwood_log", () -> log(MaterialColor.TERRACOTTA_BLACK, MaterialColor.TERRACOTTA_BROWN));
    public static final RegistryObject<Block> STRIPPED_BLACKWOOD_LOG = registerBlock("stripped_blackwood_log", () -> log(MaterialColor.TERRACOTTA_BLACK, MaterialColor.TERRACOTTA_BLACK));
    public static final RegistryObject<Block> BLACKWOOD_WOOD = registerBlock("blackwood_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_BROWN).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_BLACKWOOD_WOOD = registerBlock("stripped_blackwood_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_BLACK).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BLACKWOOD_PLANKS = registerBlock("blackwood_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_BLACK).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BLACKWOOD_STAIRS = registerBlock("blackwood_stairs", () -> woodStairs(MaterialColor.TERRACOTTA_BLACK));
    public static final RegistryObject<Block> BLACKWOOD_SLAB = registerBlock("blackwood_slab", () -> woodSlab(MaterialColor.TERRACOTTA_BLACK));
    public static final RegistryObject<Block> BLACKWOOD_FENCE = registerBlock("blackwood_fence", () -> woodFence(MaterialColor.TERRACOTTA_BLACK));
    public static final RegistryObject<Block> BLACKWOOD_DOOR = registerBlock("blackwood_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_BLACK).strength(3.0F).sound(SoundType.WOOD).noOcclusion(), SoundEvents.WOODEN_DOOR_CLOSE, SoundEvents.WOODEN_DOOR_OPEN));
    public static final RegistryObject<Block> BLACKWOOD_FENCE_GATE = registerBlock("blackwood_fence_gate", () -> woodFenceGate(MaterialColor.TERRACOTTA_BLACK));
    public static final RegistryObject<Block> BLACKWOOD_TRAPDOOR = registerBlock("blackwood_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_BLACK).strength(3.0F).sound(SoundType.WOOD).noOcclusion().isValidSpawn(RegionsUnexploredBlocks::never), SoundEvents.WOODEN_TRAPDOOR_CLOSE, SoundEvents.WOODEN_TRAPDOOR_OPEN));
    public static final RegistryObject<Block> BLACKWOOD_PRESSURE_PLATE = registerBlock("blackwood_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_BLACK).noCollission().strength(0.5F).sound(SoundType.WOOD), SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_ON));
    public static final RegistryObject<Block> BLACKWOOD_BUTTON = registerBlock("blackwood_button", () -> new ButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD), 30, true, SoundEvents.WOODEN_BUTTON_CLICK_OFF, SoundEvents.WOODEN_BUTTON_CLICK_ON));
    public static final RegistryObject<Block> BLACKWOOD_SIGN = BLOCKS.register("blackwood_sign", () -> new RuStandingSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD), RuWoodTypes.BLACKWOOD));
    public static final RegistryObject<Block> BLACKWOOD_WALL_SIGN = BLOCKS.register("blackwood_wall_sign", () -> new RuWallSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD).dropsLike(BLACKWOOD_SIGN.get()), RuWoodTypes.BLACKWOOD));
    //CHERRY_BLOCKS_DONE
    public static final RegistryObject<Block> CHERRY_LOG = registerBlock("cherry_log", () -> log(MaterialColor.TERRACOTTA_PINK, MaterialColor.STONE));
    public static final RegistryObject<Block> STRIPPED_CHERRY_LOG = registerBlock("stripped_cherry_log", () -> log(MaterialColor.TERRACOTTA_PINK, MaterialColor.TERRACOTTA_PINK));
    public static final RegistryObject<Block> CHERRY_WOOD = registerBlock("cherry_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.STONE).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_CHERRY_WOOD = registerBlock("stripped_cherry_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_PINK).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CHERRY_PLANKS = registerBlock("cherry_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_PINK).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CHERRY_STAIRS = registerBlock("cherry_stairs", () -> woodStairs(MaterialColor.TERRACOTTA_PINK));
    public static final RegistryObject<Block> CHERRY_SLAB = registerBlock("cherry_slab", () -> woodSlab(MaterialColor.TERRACOTTA_PINK));
    public static final RegistryObject<Block> CHERRY_FENCE = registerBlock("cherry_fence", () -> woodFence(MaterialColor.TERRACOTTA_PINK));
    public static final RegistryObject<Block> CHERRY_DOOR = registerBlock("cherry_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_PINK).strength(3.0F).sound(SoundType.WOOD).noOcclusion(), SoundEvents.WOODEN_DOOR_CLOSE, SoundEvents.WOODEN_DOOR_OPEN));
    public static final RegistryObject<Block> CHERRY_FENCE_GATE = registerBlock("cherry_fence_gate", () -> woodFenceGate(MaterialColor.TERRACOTTA_PINK));
    public static final RegistryObject<Block> CHERRY_TRAPDOOR = registerBlock("cherry_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_PINK).strength(3.0F).sound(SoundType.WOOD).noOcclusion().isValidSpawn(RegionsUnexploredBlocks::never), SoundEvents.WOODEN_TRAPDOOR_CLOSE, SoundEvents.WOODEN_TRAPDOOR_OPEN));
    public static final RegistryObject<Block> CHERRY_PRESSURE_PLATE = registerBlock("cherry_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_PINK).noCollission().strength(0.5F).sound(SoundType.WOOD), SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_ON));
    public static final RegistryObject<Block> CHERRY_BUTTON = registerBlock("cherry_button", () -> new ButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD), 30, true, SoundEvents.WOODEN_BUTTON_CLICK_OFF, SoundEvents.WOODEN_BUTTON_CLICK_ON));
    public static final RegistryObject<Block> CHERRY_SIGN = BLOCKS.register("cherry_sign", () -> new RuStandingSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD), RuWoodTypes.CHERRY));
    public static final RegistryObject<Block> CHERRY_WALL_SIGN = BLOCKS.register("cherry_wall_sign", () -> new RuWallSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD).dropsLike(CHERRY_SIGN.get()), RuWoodTypes.CHERRY));
    //CYPRESS_BLOCKS_DONE
    public static final RegistryObject<Block> CYPRESS_LOG = registerBlock("cypress_log", () -> log(MaterialColor.WOOD, MaterialColor.WOOD));
    public static final RegistryObject<Block> STRIPPED_CYPRESS_LOG = registerBlock("stripped_cypress_log", () -> log(MaterialColor.WOOD, MaterialColor.WOOD));
    public static final RegistryObject<Block> CYPRESS_WOOD = registerBlock("cypress_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_CYPRESS_WOOD = registerBlock("stripped_cypress_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CYPRESS_PLANKS = registerBlock("cypress_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CYPRESS_STAIRS = registerBlock("cypress_stairs", () -> woodStairs(MaterialColor.WOOD));
    public static final RegistryObject<Block> CYPRESS_SLAB = registerBlock("cypress_slab", () -> woodSlab(MaterialColor.WOOD));
    public static final RegistryObject<Block> CYPRESS_FENCE = registerBlock("cypress_fence", () -> woodFence(MaterialColor.WOOD));
    public static final RegistryObject<Block> CYPRESS_DOOR = registerBlock("cypress_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion(), SoundEvents.WOODEN_DOOR_CLOSE, SoundEvents.WOODEN_DOOR_OPEN));
    public static final RegistryObject<Block> CYPRESS_FENCE_GATE = registerBlock("cypress_fence_gate", () -> woodFenceGate(MaterialColor.WOOD));
    public static final RegistryObject<Block> CYPRESS_TRAPDOOR = registerBlock("cypress_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion().isValidSpawn(RegionsUnexploredBlocks::never), SoundEvents.WOODEN_TRAPDOOR_CLOSE, SoundEvents.WOODEN_TRAPDOOR_OPEN));
    public static final RegistryObject<Block> CYPRESS_PRESSURE_PLATE = registerBlock("cypress_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noCollission().strength(0.5F).sound(SoundType.WOOD), SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_ON));
    public static final RegistryObject<Block> CYPRESS_BUTTON = registerBlock("cypress_button", () -> new ButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD), 30, true, SoundEvents.WOODEN_BUTTON_CLICK_OFF, SoundEvents.WOODEN_BUTTON_CLICK_ON));
    public static final RegistryObject<Block> CYPRESS_SIGN = BLOCKS.register("cypress_sign", () -> new RuStandingSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD), RuWoodTypes.CYPRESS));
    public static final RegistryObject<Block> CYPRESS_WALL_SIGN = BLOCKS.register("cypress_wall_sign", () -> new RuWallSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD).dropsLike(CYPRESS_SIGN.get()), RuWoodTypes.CYPRESS));
    //DEAD_BLOCKS_DONE
    public static final RegistryObject<Block> DEAD_LOG = registerBlock("dead_log", () -> log(MaterialColor.WOOD, MaterialColor.WOOD));
    public static final RegistryObject<Block> STRIPPED_DEAD_LOG = registerBlock("stripped_dead_log", () -> log(MaterialColor.WOOD, MaterialColor.WOOD));
    public static final RegistryObject<Block> DEAD_WOOD = registerBlock("dead_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_DEAD_WOOD = registerBlock("stripped_dead_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> DEAD_PLANKS = registerBlock("dead_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> DEAD_STAIRS = registerBlock("dead_stairs", () -> woodStairs(MaterialColor.WOOD));
    public static final RegistryObject<Block> DEAD_SLAB = registerBlock("dead_slab", () -> woodSlab(MaterialColor.WOOD));
    public static final RegistryObject<Block> DEAD_FENCE = registerBlock("dead_fence", () -> woodFence(MaterialColor.WOOD));
    public static final RegistryObject<Block> DEAD_DOOR = registerBlock("dead_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion(), SoundEvents.WOODEN_DOOR_CLOSE, SoundEvents.WOODEN_DOOR_OPEN));
    public static final RegistryObject<Block> DEAD_FENCE_GATE = registerBlock("dead_fence_gate", () -> woodFenceGate(MaterialColor.WOOD));
    public static final RegistryObject<Block> DEAD_TRAPDOOR = registerBlock("dead_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion().isValidSpawn(RegionsUnexploredBlocks::never), SoundEvents.WOODEN_TRAPDOOR_CLOSE, SoundEvents.WOODEN_TRAPDOOR_OPEN));
    public static final RegistryObject<Block> DEAD_PRESSURE_PLATE = registerBlock("dead_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noCollission().strength(0.5F).sound(SoundType.WOOD), SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_ON));
    public static final RegistryObject<Block> DEAD_BUTTON = registerBlock("dead_button", () -> new ButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD), 30, true, SoundEvents.WOODEN_BUTTON_CLICK_OFF, SoundEvents.WOODEN_BUTTON_CLICK_ON));
    public static final RegistryObject<Block> DEAD_SIGN = BLOCKS.register("dead_sign", () -> new RuStandingSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD), RuWoodTypes.DEAD));
    public static final RegistryObject<Block> DEAD_WALL_SIGN = BLOCKS.register("dead_wall_sign", () -> new RuWallSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD).dropsLike(DEAD_SIGN.get()), RuWoodTypes.DEAD));
    //EUCALYPTUS_BLOCKS_DONE
    public static final RegistryObject<Block> EUCALYPTUS_LOG = registerBlock("eucalyptus_log", () -> log(MaterialColor.WOOD, MaterialColor.WOOD));
    public static final RegistryObject<Block> STRIPPED_EUCALYPTUS_LOG = registerBlock("stripped_eucalyptus_log", () -> log(MaterialColor.WOOD, MaterialColor.WOOD));
    public static final RegistryObject<Block> EUCALYPTUS_WOOD = registerBlock("eucalyptus_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_EUCALYPTUS_WOOD = registerBlock("stripped_eucalyptus_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> EUCALYPTUS_PLANKS = registerBlock("eucalyptus_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> EUCALYPTUS_STAIRS = registerBlock("eucalyptus_stairs", () -> woodStairs(MaterialColor.WOOD));
    public static final RegistryObject<Block> EUCALYPTUS_SLAB = registerBlock("eucalyptus_slab", () -> woodSlab(MaterialColor.WOOD));
    public static final RegistryObject<Block> EUCALYPTUS_FENCE = registerBlock("eucalyptus_fence", () -> woodFence(MaterialColor.WOOD));
    public static final RegistryObject<Block> EUCALYPTUS_DOOR = registerBlock("eucalyptus_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion(), SoundEvents.WOODEN_DOOR_CLOSE, SoundEvents.WOODEN_DOOR_OPEN));
    public static final RegistryObject<Block> EUCALYPTUS_FENCE_GATE = registerBlock("eucalyptus_fence_gate", () -> woodFenceGate(MaterialColor.WOOD));
    public static final RegistryObject<Block> EUCALYPTUS_TRAPDOOR = registerBlock("eucalyptus_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion().isValidSpawn(RegionsUnexploredBlocks::never), SoundEvents.WOODEN_TRAPDOOR_CLOSE, SoundEvents.WOODEN_TRAPDOOR_OPEN));
    public static final RegistryObject<Block> EUCALYPTUS_PRESSURE_PLATE = registerBlock("eucalyptus_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noCollission().strength(0.5F).sound(SoundType.WOOD), SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_ON));
    public static final RegistryObject<Block> EUCALYPTUS_BUTTON = registerBlock("eucalyptus_button", () -> new ButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD), 30, true, SoundEvents.WOODEN_BUTTON_CLICK_OFF, SoundEvents.WOODEN_BUTTON_CLICK_ON));
    public static final RegistryObject<Block> EUCALYPTUS_SIGN = BLOCKS.register("eucalyptus_sign", () -> new RuStandingSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD), RuWoodTypes.EUCALYPTUS));
    public static final RegistryObject<Block> EUCALYPTUS_WALL_SIGN = BLOCKS.register("eucalyptus_wall_sign", () -> new RuWallSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD).dropsLike(EUCALYPTUS_SIGN.get()), RuWoodTypes.EUCALYPTUS));
    //JOSHUA_BLOCKS_DONE
    public static final RegistryObject<Block> JOSHUA_LOG = registerBlock("joshua_log", () -> log(MaterialColor.WOOD, MaterialColor.WOOD));
    public static final RegistryObject<Block> STRIPPED_JOSHUA_LOG = registerBlock("stripped_joshua_log", () -> log(MaterialColor.WOOD, MaterialColor.WOOD));
    public static final RegistryObject<Block> JOSHUA_WOOD = registerBlock("joshua_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_JOSHUA_WOOD = registerBlock("stripped_joshua_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> JOSHUA_PLANKS = registerBlock("joshua_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> JOSHUA_STAIRS = registerBlock("joshua_stairs", () -> woodStairs(MaterialColor.WOOD));
    public static final RegistryObject<Block> JOSHUA_SLAB = registerBlock("joshua_slab", () -> woodSlab(MaterialColor.WOOD));
    public static final RegistryObject<Block> JOSHUA_FENCE = registerBlock("joshua_fence", () -> woodFence(MaterialColor.WOOD));
    public static final RegistryObject<Block> JOSHUA_DOOR = registerBlock("joshua_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion(), SoundEvents.WOODEN_DOOR_CLOSE, SoundEvents.WOODEN_DOOR_OPEN));
    public static final RegistryObject<Block> JOSHUA_FENCE_GATE = registerBlock("joshua_fence_gate", () -> woodFenceGate(MaterialColor.WOOD));
    public static final RegistryObject<Block> JOSHUA_TRAPDOOR = registerBlock("joshua_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion().isValidSpawn(RegionsUnexploredBlocks::never), SoundEvents.WOODEN_TRAPDOOR_CLOSE, SoundEvents.WOODEN_TRAPDOOR_OPEN));
    public static final RegistryObject<Block> JOSHUA_PRESSURE_PLATE = registerBlock("joshua_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noCollission().strength(0.5F).sound(SoundType.WOOD), SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_ON));
    public static final RegistryObject<Block> JOSHUA_BUTTON = registerBlock("joshua_button", () -> new ButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD), 30, true, SoundEvents.WOODEN_BUTTON_CLICK_OFF, SoundEvents.WOODEN_BUTTON_CLICK_ON));
    public static final RegistryObject<Block> JOSHUA_SIGN = BLOCKS.register("joshua_sign", () -> new RuStandingSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD), RuWoodTypes.JOSHUA));
    public static final RegistryObject<Block> JOSHUA_WALL_SIGN = BLOCKS.register("joshua_wall_sign", () -> new RuWallSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD).dropsLike(JOSHUA_SIGN.get()), RuWoodTypes.JOSHUA));
    //LARCH_BLOCKS_DONE
    public static final RegistryObject<Block> LARCH_LOG = registerBlock("larch_log", () -> log(MaterialColor.WOOD, MaterialColor.WOOD));
    public static final RegistryObject<Block> STRIPPED_LARCH_LOG = registerBlock("stripped_larch_log", () -> log(MaterialColor.WOOD, MaterialColor.WOOD));
    public static final RegistryObject<Block> LARCH_WOOD = registerBlock("larch_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_LARCH_WOOD = registerBlock("stripped_larch_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LARCH_PLANKS = registerBlock("larch_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LARCH_STAIRS = registerBlock("larch_stairs", () -> woodStairs(MaterialColor.WOOD));
    public static final RegistryObject<Block> LARCH_SLAB = registerBlock("larch_slab", () -> woodSlab(MaterialColor.WOOD));
    public static final RegistryObject<Block> LARCH_FENCE = registerBlock("larch_fence", () -> woodFence(MaterialColor.WOOD));
    public static final RegistryObject<Block> LARCH_DOOR = registerBlock("larch_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion(), SoundEvents.WOODEN_DOOR_CLOSE, SoundEvents.WOODEN_DOOR_OPEN));
    public static final RegistryObject<Block> LARCH_FENCE_GATE = registerBlock("larch_fence_gate", () -> woodFenceGate(MaterialColor.WOOD));
    public static final RegistryObject<Block> LARCH_TRAPDOOR = registerBlock("larch_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion().isValidSpawn(RegionsUnexploredBlocks::never), SoundEvents.WOODEN_TRAPDOOR_CLOSE, SoundEvents.WOODEN_TRAPDOOR_OPEN));
    public static final RegistryObject<Block> LARCH_PRESSURE_PLATE = registerBlock("larch_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noCollission().strength(0.5F).sound(SoundType.WOOD), SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_ON));
    public static final RegistryObject<Block> LARCH_BUTTON = registerBlock("larch_button", () -> new ButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD), 30, true, SoundEvents.WOODEN_BUTTON_CLICK_OFF, SoundEvents.WOODEN_BUTTON_CLICK_ON));
    public static final RegistryObject<Block> LARCH_SIGN = BLOCKS.register("larch_sign", () -> new RuStandingSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD), RuWoodTypes.LARCH));
    public static final RegistryObject<Block> LARCH_WALL_SIGN = BLOCKS.register("larch_wall_sign", () -> new RuWallSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD).dropsLike(LARCH_SIGN.get()), RuWoodTypes.LARCH));
    //MAPLE_BLOCKS_DONE
    public static final RegistryObject<Block> MAPLE_LOG = registerBlock("maple_log", () -> log(MaterialColor.WOOD, MaterialColor.WOOD));
    public static final RegistryObject<Block> STRIPPED_MAPLE_LOG = registerBlock("stripped_maple_log", () -> log(MaterialColor.WOOD, MaterialColor.WOOD));
    public static final RegistryObject<Block> MAPLE_WOOD = registerBlock("maple_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_MAPLE_WOOD = registerBlock("stripped_maple_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> MAPLE_PLANKS = registerBlock("maple_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> MAPLE_STAIRS = registerBlock("maple_stairs", () -> woodStairs(MaterialColor.WOOD));
    public static final RegistryObject<Block> MAPLE_SLAB = registerBlock("maple_slab", () -> woodSlab(MaterialColor.WOOD));
    public static final RegistryObject<Block> MAPLE_FENCE = registerBlock("maple_fence", () -> woodFence(MaterialColor.WOOD));
    public static final RegistryObject<Block> MAPLE_DOOR = registerBlock("maple_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion(), SoundEvents.WOODEN_DOOR_CLOSE, SoundEvents.WOODEN_DOOR_OPEN));
    public static final RegistryObject<Block> MAPLE_FENCE_GATE = registerBlock("maple_fence_gate", () -> woodFenceGate(MaterialColor.WOOD));
    public static final RegistryObject<Block> MAPLE_TRAPDOOR = registerBlock("maple_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion().isValidSpawn(RegionsUnexploredBlocks::never), SoundEvents.WOODEN_TRAPDOOR_CLOSE, SoundEvents.WOODEN_TRAPDOOR_OPEN));
    public static final RegistryObject<Block> MAPLE_PRESSURE_PLATE = registerBlock("maple_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noCollission().strength(0.5F).sound(SoundType.WOOD), SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_ON));
    public static final RegistryObject<Block> MAPLE_BUTTON = registerBlock("maple_button", () -> new ButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD), 30, true, SoundEvents.WOODEN_BUTTON_CLICK_OFF, SoundEvents.WOODEN_BUTTON_CLICK_ON));
    public static final RegistryObject<Block> MAPLE_SIGN = BLOCKS.register("maple_sign", () -> new RuStandingSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD), RuWoodTypes.MAPLE));
    public static final RegistryObject<Block> MAPLE_WALL_SIGN = BLOCKS.register("maple_wall_sign", () -> new RuWallSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD).dropsLike(MAPLE_SIGN.get()), RuWoodTypes.MAPLE));
    //MAUVE_BLOCKS_DONE
    public static final RegistryObject<Block> MAUVE_LOG = registerBlock("mauve_log", () -> log(MaterialColor.TERRACOTTA_PURPLE, MaterialColor.PODZOL));
    public static final RegistryObject<Block> STRIPPED_MAUVE_LOG = registerBlock("stripped_mauve_log", () -> log(MaterialColor.TERRACOTTA_PURPLE, MaterialColor.TERRACOTTA_PURPLE));
    public static final RegistryObject<Block> MAUVE_WOOD = registerBlock("mauve_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.PODZOL).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_MAUVE_WOOD = registerBlock("stripped_mauve_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_PURPLE).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> MAUVE_PLANKS = registerBlock("mauve_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_PURPLE).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> MAUVE_STAIRS = registerBlock("mauve_stairs", () -> woodStairs(MaterialColor.TERRACOTTA_PURPLE));
    public static final RegistryObject<Block> MAUVE_SLAB = registerBlock("mauve_slab", () -> woodSlab(MaterialColor.TERRACOTTA_PURPLE));
    public static final RegistryObject<Block> MAUVE_FENCE = registerBlock("mauve_fence", () -> woodFence(MaterialColor.TERRACOTTA_PURPLE));
    public static final RegistryObject<Block> MAUVE_DOOR = registerBlock("mauve_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_PURPLE).strength(3.0F).sound(SoundType.WOOD).noOcclusion(), SoundEvents.WOODEN_DOOR_CLOSE, SoundEvents.WOODEN_DOOR_OPEN));
    public static final RegistryObject<Block> MAUVE_FENCE_GATE = registerBlock("mauve_fence_gate", () -> woodFenceGate(MaterialColor.TERRACOTTA_PURPLE));
    public static final RegistryObject<Block> MAUVE_TRAPDOOR = registerBlock("mauve_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_PURPLE).strength(3.0F).sound(SoundType.WOOD).noOcclusion().isValidSpawn(RegionsUnexploredBlocks::never), SoundEvents.WOODEN_TRAPDOOR_CLOSE, SoundEvents.WOODEN_TRAPDOOR_OPEN));
    public static final RegistryObject<Block> MAUVE_PRESSURE_PLATE = registerBlock("mauve_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_PURPLE).noCollission().strength(0.5F).sound(SoundType.WOOD), SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_ON));
    public static final RegistryObject<Block> MAUVE_BUTTON = registerBlock("mauve_button", () -> new ButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD), 30, true, SoundEvents.WOODEN_BUTTON_CLICK_OFF, SoundEvents.WOODEN_BUTTON_CLICK_ON));
    public static final RegistryObject<Block> MAUVE_SIGN = BLOCKS.register("mauve_sign", () -> new RuStandingSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD), RuWoodTypes.MAUVE));
    public static final RegistryObject<Block> MAUVE_WALL_SIGN = BLOCKS.register("mauve_wall_sign", () -> new RuWallSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD).dropsLike(MAUVE_SIGN.get()), RuWoodTypes.MAUVE));
    //PALM_BLOCKS_DONE
    public static final RegistryObject<Block> PALM_LOG = registerBlock("palm_log", () -> log(MaterialColor.WOOD, MaterialColor.WOOD));
    public static final RegistryObject<Block> STRIPPED_PALM_LOG = registerBlock("stripped_palm_log", () -> log(MaterialColor.WOOD, MaterialColor.WOOD));
    public static final RegistryObject<Block> PALM_WOOD = registerBlock("palm_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_PALM_WOOD = registerBlock("stripped_palm_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PALM_PLANKS = registerBlock("palm_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PALM_STAIRS = registerBlock("palm_stairs", () -> woodStairs(MaterialColor.WOOD));
    public static final RegistryObject<Block> PALM_SLAB = registerBlock("palm_slab", () -> woodSlab(MaterialColor.WOOD));
    public static final RegistryObject<Block> PALM_FENCE = registerBlock("palm_fence", () -> woodFence(MaterialColor.WOOD));
    public static final RegistryObject<Block> PALM_DOOR = registerBlock("palm_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion(), SoundEvents.WOODEN_DOOR_CLOSE, SoundEvents.WOODEN_DOOR_OPEN));
    public static final RegistryObject<Block> PALM_FENCE_GATE = registerBlock("palm_fence_gate", () -> woodFenceGate(MaterialColor.WOOD));
    public static final RegistryObject<Block> PALM_TRAPDOOR = registerBlock("palm_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion().isValidSpawn(RegionsUnexploredBlocks::never), SoundEvents.WOODEN_TRAPDOOR_CLOSE, SoundEvents.WOODEN_TRAPDOOR_OPEN));
    public static final RegistryObject<Block> PALM_PRESSURE_PLATE = registerBlock("palm_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noCollission().strength(0.5F).sound(SoundType.WOOD), SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_ON));
    public static final RegistryObject<Block> PALM_BUTTON = registerBlock("palm_button", () -> new ButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD), 30, true, SoundEvents.WOODEN_BUTTON_CLICK_OFF, SoundEvents.WOODEN_BUTTON_CLICK_ON));
    public static final RegistryObject<Block> PALM_SIGN = BLOCKS.register("palm_sign", () -> new RuStandingSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD), RuWoodTypes.PALM));
    public static final RegistryObject<Block> PALM_WALL_SIGN = BLOCKS.register("palm_wall_sign", () -> new RuWallSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD).dropsLike(PALM_SIGN.get()), RuWoodTypes.PALM));
    //PINE_BLOCKS_DONE
    public static final RegistryObject<Block> PINE_LOG = registerBlock("pine_log", () -> log(MaterialColor.WOOD, MaterialColor.WOOD));
    public static final RegistryObject<Block> PINE_LOG_TRANSITION = registerBlock("pine_log_transition", () -> log(MaterialColor.WOOD, MaterialColor.WOOD));
    public static final RegistryObject<Block> STRIPPED_PINE_LOG = registerBlock("stripped_pine_log", () -> log(MaterialColor.WOOD, MaterialColor.WOOD));
    public static final RegistryObject<Block> PINE_WOOD = registerBlock("pine_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_PINE_WOOD = registerBlock("stripped_pine_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PINE_PLANKS = registerBlock("pine_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PINE_STAIRS = registerBlock("pine_stairs", () -> woodStairs(MaterialColor.WOOD));
    public static final RegistryObject<Block> PINE_SLAB = registerBlock("pine_slab", () -> woodSlab(MaterialColor.WOOD));
    public static final RegistryObject<Block> PINE_FENCE = registerBlock("pine_fence", () -> woodFence(MaterialColor.WOOD));
    public static final RegistryObject<Block> PINE_DOOR = registerBlock("pine_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion(), SoundEvents.WOODEN_DOOR_CLOSE, SoundEvents.WOODEN_DOOR_OPEN));
    public static final RegistryObject<Block> PINE_FENCE_GATE = registerBlock("pine_fence_gate", () -> woodFenceGate(MaterialColor.WOOD));
    public static final RegistryObject<Block> PINE_TRAPDOOR = registerBlock("pine_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion().isValidSpawn(RegionsUnexploredBlocks::never), SoundEvents.WOODEN_TRAPDOOR_CLOSE, SoundEvents.WOODEN_TRAPDOOR_OPEN));
    public static final RegistryObject<Block> PINE_PRESSURE_PLATE = registerBlock("pine_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noCollission().strength(0.5F).sound(SoundType.WOOD), SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_ON));
    public static final RegistryObject<Block> PINE_BUTTON = registerBlock("pine_button", () -> new ButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD), 30, true, SoundEvents.WOODEN_BUTTON_CLICK_OFF, SoundEvents.WOODEN_BUTTON_CLICK_ON));
    public static final RegistryObject<Block> PINE_SIGN = BLOCKS.register("pine_sign", () -> new RuStandingSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD), RuWoodTypes.PINE));
    public static final RegistryObject<Block> PINE_WALL_SIGN = BLOCKS.register("pine_wall_sign", () -> new RuWallSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD).dropsLike(PINE_SIGN.get()), RuWoodTypes.PINE));
    //REDWOOD_BLOCKS
    public static final RegistryObject<Block> REDWOOD_LOG = registerBlock("redwood_log", () -> log(MaterialColor.WOOD, MaterialColor.WOOD));
    public static final RegistryObject<Block> STRIPPED_REDWOOD_LOG = registerBlock("stripped_redwood_log", () -> log(MaterialColor.WOOD, MaterialColor.WOOD));
    public static final RegistryObject<Block> REDWOOD_WOOD = registerBlock("redwood_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_REDWOOD_WOOD = registerBlock("stripped_redwood_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> REDWOOD_PLANKS = registerBlock("redwood_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> REDWOOD_STAIRS = registerBlock("redwood_stairs", () -> woodStairs(MaterialColor.WOOD));
    public static final RegistryObject<Block> REDWOOD_SLAB = registerBlock("redwood_slab", () -> woodSlab(MaterialColor.WOOD));
    public static final RegistryObject<Block> REDWOOD_FENCE = registerBlock("redwood_fence", () -> woodFence(MaterialColor.WOOD));
    public static final RegistryObject<Block> REDWOOD_DOOR = registerBlock("redwood_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion(), SoundEvents.WOODEN_DOOR_CLOSE, SoundEvents.WOODEN_DOOR_OPEN));
    public static final RegistryObject<Block> REDWOOD_FENCE_GATE = registerBlock("redwood_fence_gate", () -> woodFenceGate(MaterialColor.WOOD));
    public static final RegistryObject<Block> REDWOOD_TRAPDOOR = registerBlock("redwood_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion().isValidSpawn(RegionsUnexploredBlocks::never), SoundEvents.WOODEN_TRAPDOOR_CLOSE, SoundEvents.WOODEN_TRAPDOOR_OPEN));
    public static final RegistryObject<Block> REDWOOD_PRESSURE_PLATE = registerBlock("redwood_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noCollission().strength(0.5F).sound(SoundType.WOOD), SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_ON));
    public static final RegistryObject<Block> REDWOOD_BUTTON = registerBlock("redwood_button", () -> new ButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD), 30, true, SoundEvents.WOODEN_BUTTON_CLICK_OFF, SoundEvents.WOODEN_BUTTON_CLICK_ON));
    public static final RegistryObject<Block> REDWOOD_SIGN = BLOCKS.register("redwood_sign", () -> new RuStandingSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD), RuWoodTypes.REDWOOD));
    public static final RegistryObject<Block> REDWOOD_WALL_SIGN = BLOCKS.register("redwood_wall_sign", () -> new RuWallSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD).dropsLike(REDWOOD_SIGN.get()), RuWoodTypes.REDWOOD));
    //WILLOW_BLOCKS_DONE
    public static final RegistryObject<Block> WILLOW_LOG = registerBlock("willow_log", () -> log(MaterialColor.WOOD, MaterialColor.WOOD));
    public static final RegistryObject<Block> STRIPPED_WILLOW_LOG = registerBlock("stripped_willow_log", () -> log(MaterialColor.WOOD, MaterialColor.WOOD));
    public static final RegistryObject<Block> WILLOW_WOOD = registerBlock("willow_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_WILLOW_WOOD = registerBlock("stripped_willow_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> WILLOW_PLANKS = registerBlock("willow_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> WILLOW_STAIRS = registerBlock("willow_stairs", () -> woodStairs(MaterialColor.WOOD));
    public static final RegistryObject<Block> WILLOW_SLAB = registerBlock("willow_slab", () -> woodSlab(MaterialColor.WOOD));
    public static final RegistryObject<Block> WILLOW_FENCE = registerBlock("willow_fence", () -> woodFence(MaterialColor.WOOD));
    public static final RegistryObject<Block> WILLOW_DOOR = registerBlock("willow_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion(), SoundEvents.WOODEN_DOOR_CLOSE, SoundEvents.WOODEN_DOOR_OPEN));
    public static final RegistryObject<Block> WILLOW_FENCE_GATE = registerBlock("willow_fence_gate", () -> woodFenceGate(MaterialColor.WOOD));
    public static final RegistryObject<Block> WILLOW_TRAPDOOR = registerBlock("willow_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion().isValidSpawn(RegionsUnexploredBlocks::never), SoundEvents.WOODEN_TRAPDOOR_CLOSE, SoundEvents.WOODEN_TRAPDOOR_OPEN));
    public static final RegistryObject<Block> WILLOW_PRESSURE_PLATE = registerBlock("willow_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noCollission().strength(0.5F).sound(SoundType.WOOD), SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_ON));
    public static final RegistryObject<Block> WILLOW_BUTTON = registerBlock("willow_button", () -> new ButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD), 30, true, SoundEvents.WOODEN_BUTTON_CLICK_OFF, SoundEvents.WOODEN_BUTTON_CLICK_ON));
    public static final RegistryObject<Block> WILLOW_SIGN = BLOCKS.register("willow_sign", () -> new RuStandingSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD), RuWoodTypes.WILLOW));
    public static final RegistryObject<Block> WILLOW_WALL_SIGN = BLOCKS.register("willow_wall_sign", () -> new RuWallSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD).dropsLike(WILLOW_SIGN.get()), RuWoodTypes.WILLOW));

    //PAINTED PLANKS,STAIRS,SLAB_DONE
    public static final RegistryObject<Block> RED_PAINTED_PLANKS = registerBlock("red_painted_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_RED).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RED_PAINTED_STAIRS = registerBlock("red_painted_stairs", () -> woodStairs(MaterialColor.COLOR_RED));
    public static final RegistryObject<Block> RED_PAINTED_SLAB = registerBlock("red_painted_slab", () -> woodSlab(MaterialColor.COLOR_RED));
    public static final RegistryObject<Block> ORANGE_PAINTED_PLANKS = registerBlock("orange_painted_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_ORANGE).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ORANGE_PAINTED_STAIRS = registerBlock("orange_painted_stairs", () -> woodStairs(MaterialColor.COLOR_ORANGE));
    public static final RegistryObject<Block> ORANGE_PAINTED_SLAB = registerBlock("orange_painted_slab", () -> woodSlab(MaterialColor.COLOR_ORANGE));
    public static final RegistryObject<Block> YELLOW_PAINTED_PLANKS = registerBlock("yellow_painted_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_YELLOW).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> YELLOW_PAINTED_STAIRS = registerBlock("yellow_painted_stairs", () -> woodStairs(MaterialColor.COLOR_YELLOW));
    public static final RegistryObject<Block> YELLOW_PAINTED_SLAB = registerBlock("yellow_painted_slab", () -> woodSlab(MaterialColor.COLOR_YELLOW));
    public static final RegistryObject<Block> LIME_PAINTED_PLANKS = registerBlock("lime_painted_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_LIGHT_GREEN).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LIME_PAINTED_STAIRS = registerBlock("lime_painted_stairs", () -> woodStairs(MaterialColor.COLOR_LIGHT_GREEN));
    public static final RegistryObject<Block> LIME_PAINTED_SLAB = registerBlock("lime_painted_slab", () -> woodSlab(MaterialColor.COLOR_LIGHT_GREEN));
    public static final RegistryObject<Block> GREEN_PAINTED_PLANKS = registerBlock("green_painted_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_GREEN).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> GREEN_PAINTED_STAIRS = registerBlock("green_painted_stairs", () -> woodStairs(MaterialColor.COLOR_GREEN));
    public static final RegistryObject<Block> GREEN_PAINTED_SLAB = registerBlock("green_painted_slab", () -> woodSlab(MaterialColor.COLOR_GREEN));
    public static final RegistryObject<Block> CYAN_PAINTED_PLANKS = registerBlock("cyan_painted_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_CYAN).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CYAN_PAINTED_STAIRS = registerBlock("cyan_painted_stairs", () -> woodStairs(MaterialColor.COLOR_CYAN));
    public static final RegistryObject<Block> CYAN_PAINTED_SLAB = registerBlock("cyan_painted_slab", () -> woodSlab(MaterialColor.COLOR_CYAN));
    public static final RegistryObject<Block> LIGHT_BLUE_PAINTED_PLANKS = registerBlock("light_blue_painted_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_LIGHT_BLUE).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LIGHT_BLUE_PAINTED_STAIRS = registerBlock("light_blue_painted_stairs", () -> woodStairs(MaterialColor.COLOR_LIGHT_BLUE));
    public static final RegistryObject<Block> LIGHT_BLUE_PAINTED_SLAB = registerBlock("light_blue_painted_slab", () -> woodSlab(MaterialColor.COLOR_LIGHT_BLUE));
    public static final RegistryObject<Block> BLUE_PAINTED_PLANKS = registerBlock("blue_painted_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BLUE).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BLUE_PAINTED_STAIRS = registerBlock("blue_painted_stairs", () -> woodStairs(MaterialColor.COLOR_BLUE));
    public static final RegistryObject<Block> BLUE_PAINTED_SLAB = registerBlock("blue_painted_slab", () -> woodSlab(MaterialColor.COLOR_BLUE));
    public static final RegistryObject<Block> PURPLE_PAINTED_PLANKS = registerBlock("purple_painted_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_PURPLE).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PURPLE_PAINTED_STAIRS = registerBlock("purple_painted_stairs", () -> woodStairs(MaterialColor.COLOR_PURPLE));
    public static final RegistryObject<Block> PURPLE_PAINTED_SLAB = registerBlock("purple_painted_slab", () -> woodSlab(MaterialColor.COLOR_PURPLE));
    public static final RegistryObject<Block> MAGENTA_PAINTED_PLANKS = registerBlock("magenta_painted_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_MAGENTA).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> MAGENTA_PAINTED_STAIRS = registerBlock("magenta_painted_stairs", () -> woodStairs(MaterialColor.COLOR_MAGENTA));
    public static final RegistryObject<Block> MAGENTA_PAINTED_SLAB = registerBlock("magenta_painted_slab", () -> woodSlab(MaterialColor.COLOR_MAGENTA));
    public static final RegistryObject<Block> PINK_PAINTED_PLANKS = registerBlock("pink_painted_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_PINK).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PINK_PAINTED_STAIRS = registerBlock("pink_painted_stairs", () -> woodStairs(MaterialColor.COLOR_PINK));
    public static final RegistryObject<Block> PINK_PAINTED_SLAB = registerBlock("pink_painted_slab", () -> woodSlab(MaterialColor.COLOR_PINK));
    public static final RegistryObject<Block> BROWN_PAINTED_PLANKS = registerBlock("brown_painted_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BROWN_PAINTED_STAIRS = registerBlock("brown_painted_stairs", () -> woodStairs(MaterialColor.COLOR_BROWN));
    public static final RegistryObject<Block> BROWN_PAINTED_SLAB = registerBlock("brown_painted_slab", () -> woodSlab(MaterialColor.COLOR_BROWN));
    public static final RegistryObject<Block> WHITE_PAINTED_PLANKS = registerBlock("white_painted_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.SNOW).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> WHITE_PAINTED_STAIRS = registerBlock("white_painted_stairs", () -> woodStairs(MaterialColor.SNOW));
    public static final RegistryObject<Block> WHITE_PAINTED_SLAB = registerBlock("white_painted_slab", () -> woodSlab(MaterialColor.SNOW));
    public static final RegistryObject<Block> LIGHT_GRAY_PAINTED_PLANKS = registerBlock("light_gray_painted_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_LIGHT_GRAY).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LIGHT_GRAY_PAINTED_STAIRS = registerBlock("light_gray_painted_stairs", () -> woodStairs(MaterialColor.COLOR_LIGHT_GRAY));
    public static final RegistryObject<Block> LIGHT_GRAY_PAINTED_SLAB = registerBlock("light_gray_painted_slab", () -> woodSlab(MaterialColor.COLOR_LIGHT_GRAY));
    public static final RegistryObject<Block> GRAY_PAINTED_PLANKS = registerBlock("gray_painted_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_GRAY).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> GRAY_PAINTED_STAIRS = registerBlock("gray_painted_stairs", () -> woodStairs(MaterialColor.COLOR_GRAY));
    public static final RegistryObject<Block> GRAY_PAINTED_SLAB = registerBlock("gray_painted_slab", () -> woodSlab(MaterialColor.COLOR_GRAY));
    public static final RegistryObject<Block> BLACK_PAINTED_PLANKS = registerBlock("black_painted_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BLACK).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BLACK_PAINTED_STAIRS = registerBlock("black_painted_stairs", () -> woodStairs(MaterialColor.COLOR_BLACK));
    public static final RegistryObject<Block> BLACK_PAINTED_SLAB = registerBlock("black_painted_slab", () -> woodSlab(MaterialColor.COLOR_BLACK));



    //NETHER
    public static final RegistryObject<Block> MARROWSTONE = registerBlock("marrowstone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NETHER).requiresCorrectToolForDrops().strength(0.4F).sound(SoundType.NETHERRACK)));
    public static final RegistryObject<Block> MYCOTOXIC_NYLIUM = registerBlock("mycotoxic_moss", () -> new RuNyliumBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW).requiresCorrectToolForDrops().strength(0.4F).sound(SoundType.NYLIUM)));
    public static final RegistryObject<Block> MYCOTOXIC_GRASS = registerBlock("mycotoxic_grass", () -> new NetherGrassBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.NETHER_SPROUTS).offsetType(BlockBehaviour.OffsetType.XYZ)));
    public static final RegistryObject<Block> MYCOTOXIC_DAISY = registerBlock("mycotoxic_daisy", () -> new NetherDoubleGrassBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.NETHER_SPROUTS).offsetType(BlockBehaviour.OffsetType.XYZ).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 4)));
    public static final RegistryObject<Block> YELLOW_BIOSHROOM = registerBlock("yellow_bioshroom", () -> new BioshroomBlock(MobEffects.POISON, 10, BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_YELLOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 10)));
    public static final RegistryObject<Block> TALL_YELLOW_BIOSHROOM = registerBlock("tall_yellow_bioshroom", () -> new DoubleBioshroomBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 10)));
    public static final RegistryObject<Block> YELLOW_BIOSHROOM_BLOCK = registerBlock("yellow_bioshroom_block", () -> new Block(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_GREEN).sound(SoundType.WART_BLOCK).strength(0.6f)));

    public static final RegistryObject<Block> GLISTERING_WART = registerBlock("glistering_wart", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PINK).requiresCorrectToolForDrops().strength(0.4F).sound(SoundType.NYLIUM)));
    public static final RegistryObject<Block> GLISTERING_NYLIUM = registerBlock("glistering_nylium", () -> new RuNyliumBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PINK).requiresCorrectToolForDrops().strength(0.4F).sound(SoundType.NYLIUM)));
    public static final RegistryObject<Block> GLISTERING_SPROUT = registerBlock("glistering_sprout", () -> new NetherGrassBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.TWISTING_VINES).offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final RegistryObject<Block> GLISTER_BULB = registerBlock("glister_bulb", () -> new NetherDoubleGrassBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.NETHER_WART).offsetType(BlockBehaviour.OffsetType.XZ).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 13)));
    public static final RegistryObject<Block> GLISTERING_IVY = registerBlock("glistering_ivy", () ->  new GlisteringIvyBlock(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_LIGHT_BLUE).randomTicks().noCollission().instabreak().sound(SoundType.WEEPING_VINES).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 15)));
    public static final RegistryObject<Block> GLISTERING_IVY_PLANT = BLOCKS.register("glistering_ivy_plant", () ->  new GlisteringIvyPlantBlock(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_LIGHT_BLUE).noCollission().instabreak().sound(SoundType.WEEPING_VINES)));
    public static final RegistryObject<Block> GLISTER_SPIRE = registerBlock("glister_spire", () -> new NetherDoubleGrassBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.NETHER_SPROUTS).offsetType(BlockBehaviour.OffsetType.XZ).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 5)));

    public static final RegistryObject<Block> BLACKSTONE_CLUSTER = registerBlock("blackstone_cluster", () -> new RockPileBlock(BlockBehaviour.Properties.of(Material.STONE).strength(0.6F).sound(SoundType.NETHERRACK)));
    public static final RegistryObject<Block> COBALT_NYLIUM = registerBlock("cobalt_nylium", () -> new RuNyliumBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE).requiresCorrectToolForDrops().strength(0.4F).sound(SoundType.NYLIUM)));
    public static final RegistryObject<Block> COBALT_ROOTS = registerBlock("cobalt_roots", () -> new NetherGrassBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.NETHER_SPROUTS).offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final RegistryObject<Block> COBALT_OBSIDIAN = registerBlock("cobalt_obsidian", () -> new CobaltObsidianBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK).requiresCorrectToolForDrops().strength(50.0F, 1200.0F)));
    public static final RegistryObject<Block> COBALT_EARLIGHT = registerBlock("cobalt_earlight", () -> new NetherLargePlantBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 13)));
    public static final RegistryObject<Block> HANGING_EARLIGHT = registerBlock("hanging_earlight", () ->  new HangingEarlightBlock(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_BLUE).randomTicks().noCollission().instabreak().sound(SoundType.WEEPING_VINES).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 14)));
    public static final RegistryObject<Block> HANGING_EARLIGHT_PLANT = BLOCKS.register("hanging_earlight_plant", () ->  new HangingEarlightPlantBlock(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_BLUE).noCollission().instabreak().sound(SoundType.WEEPING_VINES)));

    public static final RegistryObject<Block> SCULKWOOD_LOG = registerBlock("sculkwood_log", () -> log(MaterialColor.SAND, MaterialColor.SAND));
    public static final RegistryObject<Block> SCULKWOOD_LOG_DARK = registerBlock("sculkwood_log_dark", () -> log(MaterialColor.COLOR_CYAN, MaterialColor.COLOR_CYAN));
    public static final RegistryObject<Block> SCULKWOOD_LOG_TRANSITION = registerBlock("sculkwood_log_transition", () -> log(MaterialColor.COLOR_CYAN, MaterialColor.SAND));
    public static final RegistryObject<Block> SCULKWOOD_LEAVES = registerBlock("sculkwood_leaves", () ->  sculkLeaves(MaterialColor.COLOR_BLUE));
    public static final RegistryObject<Block> SCULKWOOD_PLANKS = registerBlock("sculkwood_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.SAND).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SCULKWOOD_STAIRS = registerBlock("sculkwood_stairs", () -> woodStairs(MaterialColor.SAND));
    public static final RegistryObject<Block> SCULKWOOD_SLAB = registerBlock("sculkwood_slab", () -> woodSlab(MaterialColor.SAND));
    public static final RegistryObject<Block> SCULKWOOD_FENCE = registerBlock("sculkwood_fence", () -> woodFence(MaterialColor.SAND));
    public static final RegistryObject<Block> SCULKWOOD_DOOR = registerBlock("sculkwood_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.SAND).strength(3.0F).sound(SoundType.WOOD).noOcclusion(), SoundEvents.NETHER_WOOD_DOOR_CLOSE, SoundEvents.NETHER_WOOD_DOOR_OPEN));
    public static final RegistryObject<Block> SCULKWOOD_FENCE_GATE = registerBlock("sculkwood_fence_gate", () -> woodFenceGate(MaterialColor.SAND));
    public static final RegistryObject<Block> SCULKWOOD_TRAPDOOR = registerBlock("sculkwood_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.SAND).strength(3.0F).sound(SoundType.WOOD).noOcclusion().isValidSpawn(RegionsUnexploredBlocks::never), SoundEvents.NETHER_WOOD_TRAPDOOR_CLOSE, SoundEvents.NETHER_WOOD_TRAPDOOR_OPEN));
    public static final RegistryObject<Block> SCULKWOOD_PRESSURE_PLATE = registerBlock("sculkwood_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noCollission().strength(0.5F).sound(SoundType.WOOD), SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_ON));
    public static final RegistryObject<Block> SCULKWOOD_BUTTON = registerBlock("sculkwood_button", () -> new ButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD), 30, true, SoundEvents.WOODEN_BUTTON_CLICK_OFF, SoundEvents.WOODEN_BUTTON_CLICK_ON));
    public static final RegistryObject<Block> SCULKWOOD_SIGN = BLOCKS.register("sculkwood_sign", () -> new RuStandingSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD), RuWoodTypes.SCULKWOOD));
    public static final RegistryObject<Block> SCULKWOOD_WALL_SIGN = BLOCKS.register("sculkwood_wall_sign", () -> new RuWallSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD).dropsLike(SCULKWOOD_SIGN.get()), RuWoodTypes.SCULKWOOD));


    public static final RegistryObject<Block> SCULK_GRASS_BLOCK = registerBlock("sculk_grass_block", () -> new RuNyliumBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE).requiresCorrectToolForDrops().strength(0.4F).sound(SoundType.SCULK_SENSOR)));
    public static final RegistryObject<Block> SCULK_TENDRIL = registerBlock("sculk_tendril", () -> new SculkPlantBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.SCULK_SENSOR).offsetType(BlockBehaviour.OffsetType.XZ).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 13)));
    public static final RegistryObject<Block> SCULK_SPROUT = registerBlock("sculk_sprout", () -> new SculkPlantBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.SCULK).offsetType(BlockBehaviour.OffsetType.XYZ)));

    //DEPRECATED
    public static final RegistryObject<Block> TALL_AUTUMNAL_SAPLING = registerBlock("tall_autumnal_sapling", () -> new TallSaplingBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final RegistryObject<Block> ALPHA_DIRT = registerBlock("alpha_dirt", () -> new Block(BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.DIRT).strength(0.5F).sound(SoundType.GRAVEL).randomTicks()));
    public static final RegistryObject<Block> MOSSED_STONE = registerBlock("mossed_stone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE).sound(SoundType.STONE).strength(1.5f, 6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ALPHA_SAND = registerBlock("alpha_sand", () -> new SandBlock(11098145, BlockBehaviour.Properties.of(Material.SAND, MaterialColor.SAND).strength(0.5F).sound(SoundType.GRAVEL)));
    public static final RegistryObject<Block> ALPHA_GRAVEL = registerBlock("alpha_gravel", () -> new GravelBlock(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.STONE).strength(0.6F).sound(SoundType.GRAVEL)));
    public static final RegistryObject<Block> ALPHA_GLASS = registerBlock("alpha_glass", () -> new GlassBlock(BlockBehaviour.Properties.of(Material.GLASS).strength(0.3F).sound(SoundType.GLASS).noOcclusion().isValidSpawn(RegionsUnexploredBlocks::never).isRedstoneConductor(RegionsUnexploredBlocks::never).isSuffocating(RegionsUnexploredBlocks::never).isViewBlocking(RegionsUnexploredBlocks::never)));
    //PLACERS
    public static final RegistryObject<Block> DIRT_PLACEMENT = BLOCKS.register("dirt_placement", () -> new DirtPlacementBlock());
    public static final RegistryObject<Block> MUD_PLACEMENT = BLOCKS.register("mud_placement", () -> new MudPlacementBlock());
    public static final RegistryObject<Block> SAND_PLACEMENT = BLOCKS.register("sand_placement", () -> new SandPlacementBlock());
    public static final RegistryObject<Block> GRASS_PLACEMENT = BLOCKS.register("grass_placement", () -> new GrassPlacementBlock());

    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return RegionsUnexploredItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    private static <T extends Block> RegistryObject<T> registerDuckweedBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerDuckweedItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerDuckweedItem(String name, RegistryObject<T> block) {
        return RegionsUnexploredItems.ITEMS.register(name, () -> new PlaceOnWaterBlockItem(block.get(), new Item.Properties()));
    }

    public boolean canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction direction, IPlantable plantable) {
        return true;
    }

    private static Boolean never(BlockState state, BlockGetter getter, BlockPos pos, EntityType<?> type) {
        return (boolean)false;
    }

    private static Boolean always(BlockState state, BlockGetter getter, BlockPos pos, EntityType<?> type) {
        return (boolean)true;
    }

    private static Boolean ocelotOrParrot(BlockState state, BlockGetter getter, BlockPos pos, EntityType<?> type) {
        return (boolean)(type == EntityType.OCELOT || type == EntityType.PARROT);
    }

    private static RotatedPillarBlock log(MaterialColor colour, MaterialColor colour2) {
        return new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, (p_152624_) -> {
            return p_152624_.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? colour : colour2;
        }).strength(2.0F).sound(SoundType.WOOD));
    }
    
    private static StairBlock woodStairs(MaterialColor colour) {
        return new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD, colour).strength(2.0F, 3.0F).sound(SoundType.WOOD));
    }

    private static SlabBlock woodSlab(MaterialColor colour) {
        return new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD, colour).strength(2.0F, 3.0F).sound(SoundType.WOOD));
    }

    private static FenceBlock woodFence(MaterialColor colour) {
        return new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, colour).strength(2.0F, 3.0F).sound(SoundType.WOOD));
    }

    private static FenceGateBlock woodFenceGate(MaterialColor colour) {
        return new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD, colour).strength(2.0F, 3.0F).sound(SoundType.WOOD), SoundEvents.WOODEN_DOOR_CLOSE, SoundEvents.WOODEN_DOOR_OPEN);
    }

    private static boolean always(BlockState state, BlockGetter getter, BlockPos pos) {
        return true;
    }

    private static boolean never(BlockState state, BlockGetter getter, BlockPos pos) {
        return false;
    }

    private static LeavesBlock leaves(MaterialColor colour) {
        return new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES, colour).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().isValidSpawn(RegionsUnexploredBlocks::ocelotOrParrot).isSuffocating(RegionsUnexploredBlocks::never).isViewBlocking(RegionsUnexploredBlocks::never));
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

    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
    }

}
