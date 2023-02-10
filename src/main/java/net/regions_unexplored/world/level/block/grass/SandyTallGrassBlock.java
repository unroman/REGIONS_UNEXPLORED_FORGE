package net.regions_unexplored.world.level.block.grass;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.regions_unexplored.block.RegionsUnexploredBlocks;
import net.regions_unexplored.data.tags.RegionsUnexploredTags;

import static net.minecraft.world.level.block.DoublePlantBlock.copyWaterloggedFrom;

public class SandyTallGrassBlock extends BushBlock implements BonemealableBlock, net.minecraftforge.common.IForgeShearable {
    protected static final float AABB_OFFSET = 6.0F;
    protected static final VoxelShape SHAPE = Block.box(2.0D, 0.0D, 2.0D, 14.0D, 13.0D, 14.0D);

    public SandyTallGrassBlock(Properties properties) {
        super(properties);
    }

    public VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    public boolean isValidBonemealTarget(LevelReader level, BlockPos pos, BlockState state, boolean b) {
        return true;
    }

    public boolean isBonemealSuccess(Level level, RandomSource random, BlockPos pos, BlockState state) {
        return true;
    }

    public static void placeAt(LevelAccessor level, BlockState state, BlockPos pos, int i) {
        level.setBlock(pos, copyWaterloggedFrom(level, pos, state), i);
    }

    @Override
    public boolean mayPlaceOn(BlockState state, BlockGetter getter, BlockPos pos) {
        return state.is(RegionsUnexploredTags.SANDY_GRASS_CAN_SURVIVE_ON);
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        BlockPos blockpos = pos.below();

        return this.mayPlaceOn(level.getBlockState(blockpos), level, blockpos);
    }


    public void performBonemeal(ServerLevel level, RandomSource random, BlockPos pos, BlockState p_222581_) {
        if(p_222581_.is(RegionsUnexploredBlocks.SANDY_GRASS.get())){
            DoublePlantBlock sandyTallGrass = (DoublePlantBlock) RegionsUnexploredBlocks.SANDY_TALL_GRASS.get();
            if (sandyTallGrass.defaultBlockState().canSurvive(level, pos) && level.isEmptyBlock(pos.above())) {
                placeAt(level, sandyTallGrass.defaultBlockState(), pos, 2);
                placeAt(level, sandyTallGrass.defaultBlockState().setValue(SandyDoublePlantBlock.HALF, DoubleBlockHalf.UPPER), pos.above(), 2);
            }
        }

    }

    @Override
    public PushReaction getPistonPushReaction(BlockState state) {
        return PushReaction.DESTROY;
    }
}
