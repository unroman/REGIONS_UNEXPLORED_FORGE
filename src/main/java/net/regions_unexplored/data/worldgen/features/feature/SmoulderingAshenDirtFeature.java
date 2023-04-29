package net.regions_unexplored.data.worldgen.features.feature;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.regions_unexplored.block.RegionsUnexploredBlocks;
import net.regions_unexplored.world.level.block.AshenDirtBlock;

import java.util.Random;

public class SmoulderingAshenDirtFeature extends Feature<NoneFeatureConfiguration> {

    public SmoulderingAshenDirtFeature(Codec<NoneFeatureConfiguration> codec) {
        super(codec);
    }

    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        BlockPos pos = context.origin();
        WorldGenLevel level = context.level();


        if(level.getBlockState(pos).is(RegionsUnexploredBlocks.ASHEN_DIRT.get())&&level.getBlockState(pos.above()).isAir()){
            level.setBlock(pos, RegionsUnexploredBlocks.ASHEN_DIRT.get().defaultBlockState().setValue(AshenDirtBlock.SMOULDERING, true), 2);
            return true;
        }

        return false;
    }
}