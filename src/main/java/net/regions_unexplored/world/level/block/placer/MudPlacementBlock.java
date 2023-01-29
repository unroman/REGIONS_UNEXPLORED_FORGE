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
public class MudPlacementBlock extends BushBlock {
    public MudPlacementBlock() {
        super(Properties.of(Material.PLANT).sound(SoundType.GRASS).instabreak().noCollission());
    }

    @Override
    public boolean mayPlaceOn(BlockState state, BlockGetter getter, BlockPos pos) {
        return state.is(RegionsUnexploredBlocks.FOREST_MUD.get()) || state.is(RegionsUnexploredBlocks.PLAINS_MUD.get())
                || state.is(Blocks.MUD);
    }
}

