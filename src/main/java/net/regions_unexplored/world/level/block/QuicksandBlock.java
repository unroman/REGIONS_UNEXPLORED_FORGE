package net.regions_unexplored.world.level.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.phys.Vec3;

public class QuicksandBlock extends Block {
    public QuicksandBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    public boolean skipRendering(BlockState state, BlockState state1, Direction direction) {
        return state1.getBlock() == this ? true : super.skipRendering(state, state1, direction);
    }

    @Override
    public boolean shouldDisplayFluidOverlay(BlockState state, BlockAndTintGetter tintGetter, BlockPos pos, FluidState fluidState) {
        return true;
    }

    @Override
    public int getLightBlock(BlockState state, BlockGetter getter, BlockPos pos) {
        return 15;
    }

    @Override
    public void entityInside(BlockState state, Level level, BlockPos pos, Entity entity) {
        Vec3 Eyeheight = entity.getEyePosition();
        BlockPos EyePos = new BlockPos(Eyeheight.x, Eyeheight.y, Eyeheight.z);
        super.entityInside(state, level, pos, entity);
        if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMobType() == MobType.ARTHROPOD : false) == false) {
        entity.makeStuckInBlock(Blocks.AIR.defaultBlockState(), new Vec3(0.25, 0.05, 0.25));
        }
        if (EyePos.getX()== pos.getX()&&EyePos.getY()== pos.getY()&&EyePos.getZ()== pos.getZ()){
            if (entity == null)
                return;
            if (entity instanceof LivingEntity _entity)
                _entity.hurt(new DamageSource("quicksand").bypassArmor(), 1);
        }
    }
}

