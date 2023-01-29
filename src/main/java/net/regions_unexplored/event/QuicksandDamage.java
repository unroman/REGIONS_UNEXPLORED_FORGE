package net.regions_unexplored.event;

import net.minecraft.core.BlockPos;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.Vec3;
import net.regions_unexplored.block.RegionsUnexploredBlocks;

public class QuicksandDamage {
    public static void execute(LevelAccessor world, double x, double z, Entity entity) {
        if (entity == null)
            return;
        if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMobType() == MobType.ARTHROPOD : false) == false) {
            if ((world.getBlockState(new BlockPos(x, entity.getY() + 1.5, z))).getBlock() == RegionsUnexploredBlocks.QUICKSAND.get()) {
                if (entity instanceof LivingEntity _entity)
                    _entity.hurt(new DamageSource("quicksand").bypassArmor(), 1);
            }
            entity.makeStuckInBlock(Blocks.AIR.defaultBlockState(), new Vec3(0.25, 0.05, 0.25));
        }
    }
}
