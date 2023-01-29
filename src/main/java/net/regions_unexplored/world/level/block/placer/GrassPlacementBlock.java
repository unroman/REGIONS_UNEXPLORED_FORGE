package net.regions_unexplored.world.level.block.placer;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.regions_unexplored.block.RegionsUnexploredBlocks;
/*
 *
 * INTERNAL_FEATURE_PLACING_HELPER
 *
 * */
public class GrassPlacementBlock extends BushBlock {
    public GrassPlacementBlock() {
        super(Properties.of(Material.PLANT).sound(SoundType.GRASS).instabreak().noCollission());
    }

    @Override
    public boolean mayPlaceOn(BlockState state, BlockGetter getter, BlockPos pos) {
        return state.is(RegionsUnexploredBlocks.ALPHA_GRASS_BLOCK.get()) || state.is(RegionsUnexploredBlocks.VIRIDESCENT_NYLIUM.get())
                || state.is(RegionsUnexploredBlocks.FOREST_GRASS_BLOCK.get())
                || state.is(RegionsUnexploredBlocks.PLAINS_GRASS_BLOCK.get())
                || state.is(RegionsUnexploredBlocks.CHALK_GRASS_BLOCK.get()) || state.is(Blocks.GRASS_BLOCK) || state.is(Blocks.MOSS_BLOCK);
    }
}

