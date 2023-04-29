package net.regions_unexplored.world.level.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.ParticleUtils;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Fallable;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;
import net.regions_unexplored.block.RegionsUnexploredBlocks;
import net.regions_unexplored.client.particle.RegionsUnexploredParticleTypes;
import net.regions_unexplored.world.level.block.state.properties.RuBlockStateProperties;
import net.regions_unexplored.world.level.block.state.properties.TallHyacinthStockShape;
import org.apache.http.cookie.SM;

import javax.annotation.Nullable;

public class AshenDirtBlock extends Block {

    public static final BooleanProperty SMOULDERING = RuBlockStateProperties.SMOULDERING;

    public AshenDirtBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(SMOULDERING, false));
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> stateBuilder) {
        stateBuilder.add(SMOULDERING);
    }

    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (level.getBlockState(pos.above()).is(Blocks.FIRE)) {
            if (!level.isAreaLoaded(pos, 1)) return;
            level.setBlockAndUpdate(pos, RegionsUnexploredBlocks.ASHEN_DIRT.get().defaultBlockState().setValue(SMOULDERING, true));
        }
    }

    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
        if(state==RegionsUnexploredBlocks.ASHEN_DIRT.get().defaultBlockState().setValue(SMOULDERING, true)){
            super.animateTick(state, level, pos, random);
            if (random.nextInt(20) == 0) {
                level.addParticle(ParticleTypes.FLAME, (double)pos.getX() + random.nextDouble(), (double)pos.getY() + 1.1D, (double)pos.getZ() + random.nextDouble(), 0.0D, 0.0D, 0.0D);
                level.addParticle(ParticleTypes.SMOKE, (double)pos.getX() + random.nextDouble(), (double)pos.getY() + 1.1D, (double)pos.getZ() + random.nextDouble(), 0.0D, 0.0D, 0.0D);
            }
        }
    }

    public static boolean isSmouldering(BlockState state) {
        return state.getValue(SMOULDERING);
    }


    public BlockState getStateForPlacement(BlockPlaceContext context) {
                    return (this.defaultBlockState().setValue(SMOULDERING, false));
    }

    @Nullable
    public BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction action, boolean simulate) {

        if (ToolActions.SHOVEL_FLATTEN == action && context.getItemInHand().canPerformAction(ToolActions.SHOVEL_FLATTEN)) {
            if (state == RegionsUnexploredBlocks.ASHEN_DIRT.get().defaultBlockState().setValue(SMOULDERING, true)) {
                return RegionsUnexploredBlocks.ASHEN_DIRT.get().defaultBlockState().setValue(SMOULDERING, false);
            } else {
                return null;
            }

        }
        return null;
    }
}