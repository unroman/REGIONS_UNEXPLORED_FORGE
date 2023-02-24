package net.regions_unexplored.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.ai.goal.EatBlockGoal;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.level.block.Block;
import net.regions_unexplored.block.RegionsUnexploredBlocks;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;


@Mixin(EatBlockGoal.class)
public abstract class EatBlockGoalMixin extends Goal {


    @Inject(at=@At("TAIL"), method = "tick()V")
    private void tick(CallbackInfo ci) {
        if (((EatBlockGoal)(Object)this).eatAnimationTick == this.adjustedTickDelay(4)) {
            BlockPos blockpos = ((EatBlockGoal)(Object)this).mob.blockPosition();
                BlockPos blockpos1 = blockpos.below();
                if (((EatBlockGoal)(Object)this).level.getBlockState(blockpos1).is(RegionsUnexploredBlocks.FOREST_GRASS_BLOCK.get())) {
                    if (net.minecraftforge.event.ForgeEventFactory.getMobGriefingEvent(((EatBlockGoal)(Object)this).level, ((EatBlockGoal)(Object)this).mob)) {
                        ((EatBlockGoal)(Object)this).level.levelEvent(2001, blockpos1, Block.getId(RegionsUnexploredBlocks.FOREST_GRASS_BLOCK.get().defaultBlockState()));
                        ((EatBlockGoal)(Object)this).level.setBlock(blockpos1, RegionsUnexploredBlocks.FOREST_DIRT.get().defaultBlockState(), 2);
                    }

                    ((EatBlockGoal)(Object)this).mob.ate();
                }
            }
        }
}
