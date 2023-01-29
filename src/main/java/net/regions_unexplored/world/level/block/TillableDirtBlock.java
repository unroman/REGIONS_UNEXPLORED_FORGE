package net.regions_unexplored.world.level.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;
import net.regions_unexplored.block.RegionsUnexploredBlocks;

import javax.annotation.Nullable;

public class TillableDirtBlock extends Block {
    protected static final VoxelShape SHAPE = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);

    public TillableDirtBlock(Properties properties) {
        super(properties);
    }

    public VoxelShape getCollisionShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    @Override
    @Nullable
    public BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction action, boolean simulate) {

        if (ToolActions.HOE_TILL == action && context.getItemInHand().canPerformAction(ToolActions.HOE_TILL)) {
            // Logic copied from HoeItem#TILLABLES; needs to be kept in sync during updating
            Block block = state.getBlock();
            if (block == RegionsUnexploredBlocks.FOREST_COARSE_DIRT.get()) {
                return RegionsUnexploredBlocks.FOREST_DIRT.get().defaultBlockState();
            } else if (block == RegionsUnexploredBlocks.FOREST_DIRT.get()) {
                return RegionsUnexploredBlocks.FOREST_FARMLAND.get().defaultBlockState();
            } else if (block == RegionsUnexploredBlocks.PLAINS_COARSE_DIRT.get()) {
                return RegionsUnexploredBlocks.PLAINS_DIRT.get().defaultBlockState();
            } else if (block == RegionsUnexploredBlocks.PLAINS_DIRT.get()) {
                return RegionsUnexploredBlocks.PLAINS_FARMLAND.get().defaultBlockState();
            } else {
                return null;
            }

        }
        return null;
    }
}