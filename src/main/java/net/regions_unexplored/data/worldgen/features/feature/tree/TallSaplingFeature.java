package net.regions_unexplored.data.worldgen.features.feature.tree;

import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.regions_unexplored.data.worldgen.features.feature.configuration.TallSaplingConfiguration;
import net.regions_unexplored.world.level.block.grass.DoubleTallSaplingBlock;

public class TallSaplingFeature extends Feature<TallSaplingConfiguration> {

    public TallSaplingFeature(Codec<TallSaplingConfiguration> codec) {
        super(codec);
    }

    public boolean place(FeaturePlaceContext<TallSaplingConfiguration> context) {
        TallSaplingConfiguration saplingConfiguration = context.config();
        BlockPos pos = context.origin();
        RandomSource randomSource = context.random();
        WorldGenLevel level = context.level();

        if(!level.isOutsideBuildHeight(pos.above())&&level.getBlockState(pos).canBeReplaced()&&level.getBlockState(pos.above()).canBeReplaced()) {
            level.setBlock(pos, saplingConfiguration.saplingProvider.getState(randomSource, pos).setValue(DoubleTallSaplingBlock.HALF, DoubleBlockHalf.LOWER), 2);
            level.setBlock(pos.above(), saplingConfiguration.saplingProvider.getState(randomSource, pos).setValue(DoubleTallSaplingBlock.HALF, DoubleBlockHalf.UPPER), 2);
            return true;
        }
        else{
            return false;
        }
    }
}