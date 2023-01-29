package net.regions_unexplored.data.worldgen.features.feature;

import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.regions_unexplored.block.RegionsUnexploredBlocks;

import java.util.Random;

public class AshVentFeature extends Feature<NoneFeatureConfiguration> {

    public AshVentFeature(Codec<NoneFeatureConfiguration> codec) {
        super(codec);
    }

    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        BlockPos pos = context.origin();
        WorldGenLevel level = context.level();


        if(level.getBlockState(pos.below()).isFaceSturdy(level, pos.below(), Direction.UP)){
            placeBlob(level, pos);
            return true;
        }

        return false;
    }
    public boolean placeBlob(LevelAccessor level, BlockPos pos) {
        Random random = new Random();

        if (pos.getY() <= level.getMinBuildHeight() + 3) {
            return false;
        } else {
            for(int l = 0; l < 3; ++l) {
                int i = random.nextInt(4)+2;
                int j = random.nextInt(4)+2;
                int k = random.nextInt(4)+2;
                float f = (float)(i + j + k) * 0.333F + 0.5F;

                for(BlockPos blockpos1 : BlockPos.betweenClosed(pos.offset(-i, -j, -k), pos.offset(i, j, k))) {
                    if (blockpos1.distSqr(pos) <= (double)(f * f)) {
                        if(level.getBlockState(blockpos1.below()).isFaceSturdy(level, pos.below(), Direction.DOWN)){
                            if(random.nextInt(5)== 0){
                            placePillar(level,blockpos1);
                            }
                        }
                    }
                }

                pos = pos.offset(-1 + random.nextInt(2), -random.nextInt(2), -1 + random.nextInt(2));
            }

            return true;
        }
    }

    public boolean placePillar(LevelAccessor level, BlockPos pos) {
        Random random = new Random();

        int size = random.nextInt(6);
        if (level.isEmptyBlock(pos) ) {
            if(level.getBlockState(pos.below()).isFaceSturdy(level, pos.below(), Direction.DOWN)
                    ||!level.getBlockState(pos.below()).is(RegionsUnexploredBlocks.ASH_VENT.get())) {

                BlockPos.MutableBlockPos placePos = pos.mutable();
                int count = 0;
                while (level.isEmptyBlock(placePos)) {
                    if(level.getBlockState(placePos.below()).is(RegionsUnexploredBlocks.ASH_VENT.get())) {
                        return true;
                    }
                    if(count==size){
                        return true;
                    }
                    if (level.isOutsideBuildHeight(placePos)) {
                        return true;
                    }
                    if(count==size-1){
                        if(random.nextInt(6)==0){
                            level.setBlock(placePos, RegionsUnexploredBlocks.ASH_VENT.get().defaultBlockState(), 2);
                        }
                        else{
                            level.setBlock(placePos, Blocks.BASALT.defaultBlockState(), 2);
                        }
                    }
                    else{
                        level.setBlock(placePos, Blocks.BASALT.defaultBlockState(), 2);
                    }
                    placePos.move(Direction.UP);
                    count=count+1;
                }

                return true;
            }
        }

        return true;
    }
}