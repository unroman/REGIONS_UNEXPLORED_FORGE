package net.regions_unexplored.world.level.block;

import com.google.common.collect.ImmutableMap;
import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.regions_unexplored.block.RegionsUnexploredBlocks;
import net.regions_unexplored.data.tags.RegionsUnexploredTags;

import javax.annotation.Nullable;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BranchBlock extends BushBlock {
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public BranchBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext context) {
        if(state.is(RegionsUnexploredBlocks.JOSHUA_BEARD.get())||state.is(RegionsUnexploredBlocks.PALM_BEARD.get())){
            return switch (state.getValue(FACING)) {
                default -> box(0, 0, 0, 16, 16, 3);
                case NORTH -> box(0, 0, 13, 16, 16, 16);
                case EAST -> box(0, 0, 0, 3, 16, 16);
                case WEST -> box(13, 0, 0, 16, 16, 16);
            };
        }
        else{
        return switch (state.getValue(FACING)) {
            default -> box(7, 3, 0, 9, 13, 16);
            case NORTH -> box(7, 3, 0, 9, 13, 16);
            case EAST -> box(0, 3, 7, 16, 13, 9);
            case WEST -> box(0, 3, 7, 16, 13, 9);
        };
        }
    }


    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        Direction direction = state.getValue(FACING);
        BlockPos blockposn = pos.north();
        BlockPos blockposs = pos.south();
        BlockPos blockpose = pos.east();
        BlockPos blockposw = pos.west();
        if (direction==Direction.SOUTH) {

            if(!state.is(RegionsUnexploredBlocks.JOSHUA_BEARD.get())&&!state.is(RegionsUnexploredBlocks.PALM_BEARD.get())){
            if(!level.getBlockState(blockposn).isFaceSturdy(level, blockposn, Direction.SOUTH)){
                return false;
            }
            }
            if(mayPlaceOn(level.getBlockState(blockposn), level, blockposn)){
                return true;
            }
            else{
                return false;
            }
        }

        if (direction==Direction.NORTH) {
            if(!state.is(RegionsUnexploredBlocks.JOSHUA_BEARD.get())&&!state.is(RegionsUnexploredBlocks.PALM_BEARD.get())){
            if(!level.getBlockState(blockposs).isFaceSturdy(level, blockposs, Direction.NORTH)){
                return false;
            }
            }
            if(mayPlaceOn(level.getBlockState(blockposs), level, blockposs)){
                return true;
            }
            else{
                return false;
            }
        }

        if (direction==Direction.WEST) {
            if(!state.is(RegionsUnexploredBlocks.JOSHUA_BEARD.get())&&!state.is(RegionsUnexploredBlocks.PALM_BEARD.get())){
            if(!level.getBlockState(blockpose).isFaceSturdy(level, blockpose, Direction.WEST)){
                return false;
            }
            }
            if(mayPlaceOn(level.getBlockState(blockpose), level, blockpose)){
                return true;
            }
            else{
                return false;
            }
        }

        if (direction==Direction.EAST) {
            if(!state.is(RegionsUnexploredBlocks.JOSHUA_BEARD.get())&&!state.is(RegionsUnexploredBlocks.PALM_BEARD.get())){
            if(!level.getBlockState(blockposw).isFaceSturdy(level, blockposw, Direction.EAST)){
                return false;
            }
            }
            if(mayPlaceOn(level.getBlockState(blockposw), level, blockposw)){
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean mayPlaceOn(BlockState state, BlockGetter getter, BlockPos pos) {
        return state.is(RegionsUnexploredTags.BRANCHES_CAN_SURVIVE_ON);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        if (context.getClickedFace().getAxis() == Direction.Axis.Y)
            return this.defaultBlockState().setValue(FACING, Direction.NORTH);
        return this.defaultBlockState().setValue(FACING, context.getClickedFace());
    }

    public BlockState rotate(BlockState state, Rotation rot) {
        return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
    }

    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
    }

    @Override
    public PushReaction getPistonPushReaction(BlockState state) {
        return PushReaction.DESTROY;
    }
}