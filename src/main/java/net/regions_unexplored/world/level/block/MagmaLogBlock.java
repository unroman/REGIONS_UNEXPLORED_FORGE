package net.regions_unexplored.world.level.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Fallable;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.Material;
import net.regions_unexplored.world.level.block.state.properties.RuBlockStateProperties;
import net.regions_unexplored.world.level.block.state.properties.TallHyacinthStockShape;

public class MagmaLogBlock extends Block {

    public static final BooleanProperty TRANSITION_BLOCK = RuBlockStateProperties.TRANSITION_BLOCK;

    public MagmaLogBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(TRANSITION_BLOCK, true));
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> stateBuilder) {
        stateBuilder.add(TRANSITION_BLOCK);
    }

    public BlockState updateShape(BlockState state, Direction direction, BlockState state1, LevelAccessor level, BlockPos pos, BlockPos pos1) {
        boolean isTransition = true;
        if(level.getBlockState(pos.above()).is(this)){
           isTransition = false;
        }
        return state.setValue(TRANSITION_BLOCK, isTransition);
    }

    public BlockState getStateForPlacement(BlockPlaceContext context) {
        boolean isTransition = true;
        if(context.getLevel().getBlockState(context.getClickedPos().above()).is(this)){
            isTransition = false;
        }
        return this.defaultBlockState().setValue(TRANSITION_BLOCK, isTransition);
    }
}