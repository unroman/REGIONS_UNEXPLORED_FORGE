package net.regions_unexplored.event;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class MudDry {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (world.getBlockState(new BlockPos(x, y - 1, z)).canOcclude()) {
            if ((world.getBlockState(new BlockPos(x, y - 2, z))).getBlock() == Blocks.POINTED_DRIPSTONE) {
                if (Math.random() < 0.05) {
                    world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
                    world.setBlock(new BlockPos(x, y, z), Blocks.CLAY.defaultBlockState(), 3);
                }
            }
        }
    }
}
