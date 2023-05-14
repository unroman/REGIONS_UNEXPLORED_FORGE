package net.regions_unexplored.client;

import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.GrassColor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.levelgen.Noises;
import net.minecraft.world.level.levelgen.PositionalRandomFactory;
import net.minecraft.world.level.levelgen.synth.NoiseUtils;
import net.minecraft.world.level.levelgen.synth.PerlinNoise;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.regions_unexplored.block.RegionsUnexploredBlocks;
import net.regions_unexplored.config.RegionsUnexploredCommonConfigs;

import java.awt.*;
import java.util.Random;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RuColors {
    @SubscribeEvent
    public static void grassBlockColorLoad(RegisterColorHandlersEvent.Block event) {
        event.getBlockColors().register((bs, world, pos, index) -> {
            return world != null && pos != null ? BiomeColors.getAverageGrassColor(world, pos) : GrassColor.get(0.5D, 1.0D);
        },      RegionsUnexploredBlocks.FOREST_GRASS_BLOCK.get(),
                RegionsUnexploredBlocks.PLAINS_GRASS_BLOCK.get(),
                RegionsUnexploredBlocks.STONE_GRASS_BLOCK.get(),
                RegionsUnexploredBlocks.DEEPSLATE_GRASS_BLOCK.get(),
                RegionsUnexploredBlocks.CHALK_GRASS_BLOCK.get(),
                RegionsUnexploredBlocks.MEDIUM_GRASS.get(),
                RegionsUnexploredBlocks.STEPPE_GRASS.get(),
                RegionsUnexploredBlocks.STONE_BUD.get(),
                RegionsUnexploredBlocks.SEEDED_TALL_GRASS.get(),
                RegionsUnexploredBlocks.SEEDED_GRASS.get()
        );
    }
    @SubscribeEvent
    public static void grassItemColorLoad(RegisterColorHandlersEvent.Item event) {
        event.getItemColors().register((stack, index) -> {
            return GrassColor.get(0.5D, 1.0D);
        },      RegionsUnexploredBlocks.FOREST_GRASS_BLOCK.get(),
                RegionsUnexploredBlocks.PLAINS_GRASS_BLOCK.get(),
                RegionsUnexploredBlocks.STONE_GRASS_BLOCK.get(),
                RegionsUnexploredBlocks.DEEPSLATE_GRASS_BLOCK.get(),
                RegionsUnexploredBlocks.CHALK_GRASS_BLOCK.get(),
                RegionsUnexploredBlocks.MEDIUM_GRASS.get(),
                RegionsUnexploredBlocks.STEPPE_GRASS.get(),
                RegionsUnexploredBlocks.STONE_BUD.get(),
                RegionsUnexploredBlocks.SEEDED_TALL_GRASS.get(),
                RegionsUnexploredBlocks.SEEDED_GRASS.get()
        );
    }

    @SubscribeEvent
    public static void foliageBlockColorLoad(RegisterColorHandlersEvent.Block event) {
        event.getBlockColors().register((bs, world, pos, index) -> {
            return world != null && pos != null ? BiomeColors.getAverageFoliageColor(world, pos) : FoliageColor.get(0.5D, 1.0D);
        },          RegionsUnexploredBlocks.STEPPE_SHRUB.get(),
                    RegionsUnexploredBlocks.TALL_STEPPE_GRASS.get(),
                    RegionsUnexploredBlocks.ELEPHANT_EAR.get(),
                    RegionsUnexploredBlocks.BAOBAB_LEAVES.get(),
                    RegionsUnexploredBlocks.CHERRY_LEAVES.get(),
                    RegionsUnexploredBlocks.APPLE_OAK_LEAVES.get(),
                    RegionsUnexploredBlocks.FLOWERING_LEAVES.get(),
                    RegionsUnexploredBlocks.CYPRESS_LEAVES.get(),
                    RegionsUnexploredBlocks.EUCALYPTUS_LEAVES.get(),
                    RegionsUnexploredBlocks.PALM_LEAVES.get(),
                    RegionsUnexploredBlocks.JOSHUA_LEAVES.get(),
                    RegionsUnexploredBlocks.PINE_LEAVES.get(),
                    RegionsUnexploredBlocks.REDWOOD_LEAVES.get(),
                    RegionsUnexploredBlocks.WILLOW_LEAVES.get(),
                    RegionsUnexploredBlocks.TALL_REDWOOD_SAPLING.get(),
                    RegionsUnexploredBlocks.TALL_PINE_SAPLING.get(),
                    RegionsUnexploredBlocks.TALL_WILLOW_SAPLING.get(),
                    RegionsUnexploredBlocks.TALL_OAK_SAPLING.get(),
                    RegionsUnexploredBlocks.TALL_DARK_OAK_SAPLING.get(),
                    RegionsUnexploredBlocks.TALL_PALM_SAPLING.get(),
                    RegionsUnexploredBlocks.TALL_FLOWERING_SAPLING.get(),
                    RegionsUnexploredBlocks.TALL_JOSHUA_SAPLING.get(),
                    RegionsUnexploredBlocks.TALL_CHERRY_SAPLING.get(),
                    RegionsUnexploredBlocks.TALL_ACACIA_SAPLING.get(),
                    RegionsUnexploredBlocks.TALL_JUNGLE_SAPLING.get(),
                    RegionsUnexploredBlocks.TALL_EUCALYPTUS_SAPLING.get(),
                    RegionsUnexploredBlocks.TALL_MANGROVE_SAPLING.get(),
                    RegionsUnexploredBlocks.TALL_CYPRESS_SAPLING.get(),
                    RegionsUnexploredBlocks.TALL_BAOBAB_SAPLING.get(),
                    RegionsUnexploredBlocks.MAPLE_LEAVES.get(),
                    RegionsUnexploredBlocks.TALL_MAPLE_SAPLING.get()
        );
    }
    @SubscribeEvent
    public static void foliageItemColorLoad(RegisterColorHandlersEvent.Item event) {
        event.getItemColors().register((stack, index) -> {
                return FoliageColor.get(0.5D, 1.0D);
        },          RegionsUnexploredBlocks.STEPPE_SHRUB.get(),
                    RegionsUnexploredBlocks.TALL_STEPPE_GRASS.get(),
                    RegionsUnexploredBlocks.ELEPHANT_EAR.get(),
                    RegionsUnexploredBlocks.BAOBAB_LEAVES.get(),
                    RegionsUnexploredBlocks.CHERRY_LEAVES.get(),
                    RegionsUnexploredBlocks.APPLE_OAK_LEAVES.get(),
                    RegionsUnexploredBlocks.FLOWERING_LEAVES.get(),
                    RegionsUnexploredBlocks.JOSHUA_LEAVES.get(),
                    RegionsUnexploredBlocks.CYPRESS_LEAVES.get(),
                    RegionsUnexploredBlocks.EUCALYPTUS_LEAVES.get(),
                    RegionsUnexploredBlocks.PALM_LEAVES.get(),
                    RegionsUnexploredBlocks.PINE_LEAVES.get(),
                    RegionsUnexploredBlocks.REDWOOD_LEAVES.get(),
                    RegionsUnexploredBlocks.WILLOW_LEAVES.get(),
                    RegionsUnexploredBlocks.MAPLE_LEAVES.get()
        );
    }

    @SubscribeEvent
    public static void spruceBlockColorLoad(RegisterColorHandlersEvent.Block event) {
        event.getBlockColors().register((bs, world, pos, index) -> {
            return FoliageColor.getEvergreenColor();
        }, RegionsUnexploredBlocks.TALL_SPRUCE_SAPLING.get());
    }
    @SubscribeEvent
    public static void birchBlockColorLoad(RegisterColorHandlersEvent.Block event) {
        event.getBlockColors().register((bs, world, pos, index) -> {
            return FoliageColor.getBirchColor();
        }, RegionsUnexploredBlocks.TALL_BIRCH_SAPLING.get());
    }

    @SubscribeEvent
    public static void rainbowCrystalColorLoad(RegisterColorHandlersEvent.Block event) {
        event.getBlockColors().register((bs, world, pos, index) -> {
            return world != null && pos != null ? getRainbowColor(world, pos) : FoliageColor.getDefaultColor();
        },RegionsUnexploredBlocks.PRISMARITE_CLUSTER.get(), RegionsUnexploredBlocks.HANGING_PRISMARITE.get(), RegionsUnexploredBlocks.LARGE_PRISMARITE_CLUSTER.get(), RegionsUnexploredBlocks.PRISMOSS.get(),RegionsUnexploredBlocks.DEEPSLATE_PRISMOSS.get(),RegionsUnexploredBlocks.PRISMOSS_SPROUT.get());
    }
    @SubscribeEvent
    public static void rainbowGlassColorLoad(RegisterColorHandlersEvent.Block event) {
        event.getBlockColors().register((bs, world, pos, index) -> {
            return world != null && pos != null ? getRainbowGlassColor(world, pos) : FoliageColor.getDefaultColor();
        },RegionsUnexploredBlocks.PRISMAGLASS.get());
    }
    @SubscribeEvent
    public static void rainbowEucalyptusColorLoad(RegisterColorHandlersEvent.Block event) {
        event.getBlockColors().register((bs, world, pos, index) -> {
                    return world != null && pos != null ? getRainbowEucalyptusColor(world, pos) : FoliageColor.getDefaultColor();
                },      RegionsUnexploredBlocks.EUCALYPTUS_LOG.get(),
                RegionsUnexploredBlocks.EUCALYPTUS_WOOD.get()
        );
    }

    /*@SubscribeEvent
    public static void aspenColorLoad(RegisterColorHandlersEvent.Block event) {
        event.getBlockColors().register((bs, world, pos, index) -> {
            return world != null && pos != null ? getAspenColor(world, pos) : FoliageColor.getDefaultColor();
        }, RegionsUnexploredBlocks.SILVER_BIRCH_LEAVES.get());
    }
    @SubscribeEvent
    public static void aspenColorLoads(RegisterColorHandlersEvent.Block event) {
        event.getBlockColors().register((bs, world, pos, index) -> {
            return world != null && pos != null ? getAspenColor(world, pos) : FoliageColor.getDefaultColor();
        }, RegionsUnexploredBlocks.SILVER_BIRCH_LEAVES.get());
    }*/

    public static int getRainbowColor(BlockAndTintGetter world, BlockPos pos) {
        Color rainbow = Color.getHSBColor(((float)pos.getX() + (float)pos.getZ()) / 50.0F, 0.9F, 1.0F);
        return rainbow.getRGB();
    }
/*
    public static int getAspenColor(BlockAndTintGetter world, BlockPos pos) {
        float noise = ((Mth.cos(((float)pos.getZ()-25F)*25F)+Mth.sin(((float)pos.getX()-25F)*25F))/200F);
        Color aspen = Color.getHSBColor(((((Mth.cos((float)pos.getZ()*25F)+Mth.sin((float)pos.getX()*25F))+Mth.sin((float)pos.getX()/5+(float)pos.getZ()/4)) / 150.0F)+0.15F)-noise, 0.9F, 1.0F);
        return aspen.getRGB();
    }
    public static int getAspenColor2(BlockAndTintGetter world, BlockPos pos) {
        Color rainbow = Color.getHSBColor((((Mth.cos((float)pos.getZ()*25F)+Mth.sin((float)pos.getX()*25F)) / 150.0F)+0.15F), 0.9F, 1.0F);
        return rainbow.getRGB();
    }*/
    public static int getRainbowGlassColor(BlockAndTintGetter world, BlockPos pos) {
        Color rainbow = Color.getHSBColor(((float)pos.getX() + (float)pos.getY() + (float)pos.getZ()) / 35.0F, 1.0F, 1.0F);
        return rainbow.getRGB();
    }
    public static int getRainbowEucalyptusColor(BlockAndTintGetter world, BlockPos pos) {
        Color rainbow = Color.getHSBColor(((float)pos.getX() + (float)pos.getY() + (float)pos.getZ()) /
                RegionsUnexploredCommonConfigs.EUCALYPTUS_TRANSITION_SIZE.get().floatValue(),
                RegionsUnexploredCommonConfigs.EUCALYPTUS_SATURATION.get().floatValue(),
                RegionsUnexploredCommonConfigs.EUCALYPTUS_BRIGHTNESS.get().floatValue());
        return rainbow.getRGB();
    }

}
