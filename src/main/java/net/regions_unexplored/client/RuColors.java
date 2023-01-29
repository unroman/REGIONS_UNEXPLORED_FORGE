package net.regions_unexplored.client;

import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.GrassColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.regions_unexplored.block.RegionsUnexploredBlocks;

import java.awt.*;

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
                RegionsUnexploredBlocks.FOREST_FERN.get(),
                RegionsUnexploredBlocks.TALL_FOREST_FERN.get(),
                RegionsUnexploredBlocks.SEEDED_GRASS.get(),
                RegionsUnexploredBlocks.WILLOW_LEAVES.get()
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
                RegionsUnexploredBlocks.FOREST_FERN.get(),
                RegionsUnexploredBlocks.TALL_FOREST_FERN.get(),
                RegionsUnexploredBlocks.SEEDED_GRASS.get(),
                RegionsUnexploredBlocks.WILLOW_LEAVES.get()
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
                    RegionsUnexploredBlocks.TALL_PINE_SAPLING.get()
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
                    RegionsUnexploredBlocks.WILLOW_LEAVES.get()
        );
    }

    @SubscribeEvent
    public static void spruceBlockColorLoad(RegisterColorHandlersEvent.Block event) {
        event.getBlockColors().register((bs, world, pos, index) -> {
            return FoliageColor.getEvergreenColor();
        }, RegionsUnexploredBlocks.TALL_SPRUCE_SAPLING.get());
    }

    @SubscribeEvent
    public static void rainbowCrystalColorLoad(RegisterColorHandlersEvent.Block event) {
        event.getBlockColors().register((bs, world, pos, index) -> {
            return world != null && pos != null ? getRainbowColor(world, pos) : FoliageColor.getDefaultColor();
        },RegionsUnexploredBlocks.PRISMARITE_CLUSTER.get(), RegionsUnexploredBlocks.LARGE_PRISMARITE_CLUSTER.get(), RegionsUnexploredBlocks.PRISMOSS.get(),RegionsUnexploredBlocks.DEEPSLATE_PRISMOSS.get(),RegionsUnexploredBlocks.PRISMOSS_SPROUT.get());
    }

    @SubscribeEvent
    public static void rainbowCrystalYColorLoad(RegisterColorHandlersEvent.Block event) {
        event.getBlockColors().register((bs, world, pos, index) -> {
            return world != null && pos != null ? getRainbowColor(world, pos) : FoliageColor.getDefaultColor();
        },RegionsUnexploredBlocks.HANGING_PRISMARITE.get());
    }

    @SubscribeEvent
    public static void rainbowGlassColorLoad(RegisterColorHandlersEvent.Block event) {
        event.getBlockColors().register((bs, world, pos, index) -> {
            return world != null && pos != null ? getRainbowGlassColor(world, pos) : FoliageColor.getDefaultColor();
        },RegionsUnexploredBlocks.PRISMAGLASS.get());
    }

    public static int getRainbowColor(BlockAndTintGetter world, BlockPos pos) {
        Color rainbow = Color.getHSBColor(((float)pos.getX() + (float)pos.getZ()) / 50.0F, 1.0F, 1.0F);
        return rainbow.getRGB();
    }

    public static int getRainbowGlassColor(BlockAndTintGetter world, BlockPos pos) {
        Color rainbow = Color.getHSBColor(((float)pos.getX() + (float)pos.getY() + (float)pos.getZ()) / 35.0F, 1.0F, 1.0F);
        return rainbow.getRGB();
    }

}
