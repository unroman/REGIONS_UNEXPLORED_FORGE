package net.regions_unexplored.data.worldgen.features.feature.bioshroom;

import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.regions_unexplored.block.RegionsUnexploredBlocks;
import net.regions_unexplored.data.tags.RegionsUnexploredTags;
import net.regions_unexplored.data.worldgen.features.feature.configuration.GiantBioshroomConfiguration;

import java.util.Random;

public class GiantBlueBioshroomFeature extends Feature<GiantBioshroomConfiguration> {

    public GiantBlueBioshroomFeature(Codec<GiantBioshroomConfiguration> codec) {
        super(codec);
    }

    public boolean place(FeaturePlaceContext<GiantBioshroomConfiguration> context) {
        GiantBioshroomConfiguration bioshroomConfiguration = context.config();
        BlockPos pos = context.origin();
        RandomSource randomSource = context.random();
        WorldGenLevel level = context.level();

        int limbDirection = context.random().nextInt(12);
        int height_main = context.random().nextInt(bioshroomConfiguration.sizeVariation) + bioshroomConfiguration.minimumSize;

        if(!level.getBlockState(pos).canBeReplaced()){
            return false;
        }

        int placeCheck = 0;
        BlockPos.MutableBlockPos placePos = pos.mutable();
        while (placeCheck <= height_main) {
            if(placeCheck == 0){
                placeBase(level, placePos, randomSource, bioshroomConfiguration);
            }
            if(placeCheck == height_main){
                placeCap(level, placePos, randomSource, bioshroomConfiguration);
            }
            if(placeCheck<height_main-2){
                if(placeCheck%2==0){
                    if(randomSource.nextInt(2)==0){
                        placeCapBlock(level,placePos.north(),randomSource,bioshroomConfiguration);
                    }
                    else{
                        placeCapBlock(level,placePos.east(),randomSource,bioshroomConfiguration);
                    }
                }
                else{
                    if(randomSource.nextInt(2)==0){
                        placeCapBlock(level,placePos.south(),randomSource,bioshroomConfiguration);
                    }
                    else{
                        placeCapBlock(level,placePos.west(),randomSource,bioshroomConfiguration);
                    }
                }
            }
            placeStemBlock(level, placePos, randomSource, bioshroomConfiguration);
            placePos.move(Direction.UP);
            placeCheck = placeCheck + 1;
        }
        return true;
    }

    public void placeBase(LevelAccessor level, BlockPos pos, RandomSource randomSource, GiantBioshroomConfiguration bioshroomConfiguration) {
        Random random = new Random();
        int n = random.nextInt(2);
        int s = random.nextInt(2);
        int e = random.nextInt(2);
        int w = random.nextInt(2);
        placeRoot(level,pos.north(),randomSource,bioshroomConfiguration);
        placeRoot(level,pos.south(),randomSource,bioshroomConfiguration);
        placeRoot(level,pos.east(),randomSource,bioshroomConfiguration);
        placeRoot(level,pos.west(),randomSource,bioshroomConfiguration);
        if(n==0){
            placeStemBlock(level,pos.north().above(),randomSource,bioshroomConfiguration);
        }
        if(s==0){
            placeStemBlock(level,pos.south().above(),randomSource,bioshroomConfiguration);
        }
        if(e==0){
            placeStemBlock(level,pos.east().above(),randomSource,bioshroomConfiguration);
        }
        if(w==0){
            placeStemBlock(level,pos.west().above(),randomSource,bioshroomConfiguration);
        }
    }

    public void placeStemBlock(LevelAccessor level, BlockPos pos, RandomSource randomSource, GiantBioshroomConfiguration bioshroomConfiguration) {

        if(level.isOutsideBuildHeight(pos)){
            return;
        }
        if(level.getBlockState(pos).is(RegionsUnexploredBlocks.FOREST_GRASS_BLOCK.get())){
            level.setBlock(pos, RegionsUnexploredBlocks.FOREST_DIRT.get().defaultBlockState(), 2);
        }
        else if(level.getBlockState(pos).is(RegionsUnexploredBlocks.PLAINS_GRASS_BLOCK.get())){
            level.setBlock(pos, RegionsUnexploredBlocks.PLAINS_DIRT.get().defaultBlockState(), 2);
        }
        else if(level.getBlockState(pos).is(RegionsUnexploredBlocks.ALPHA_GRASS_BLOCK.get())||level.getBlockState(pos).is(Blocks.GRASS_BLOCK)||level.getBlockState(pos).is(Blocks.MYCELIUM)){
            level.setBlock(pos, Blocks.DIRT.defaultBlockState(), 2);
        }
        else if(level.getBlockState(pos).is(RegionsUnexploredBlocks.MYCOTOXIC_NYLIUM.get())||level.getBlockState(pos).is(RegionsUnexploredBlocks.GLISTERING_NYLIUM.get())|| level.getBlockState(pos).is(Blocks.CRIMSON_NYLIUM)|| level.getBlockState(pos).is(Blocks.WARPED_NYLIUM)){
            level.setBlock(pos, Blocks.NETHERRACK.defaultBlockState(), 2);
        }
        else if(level.getBlockState(pos).is(RegionsUnexploredBlocks.COBALT_NYLIUM.get())){
            level.setBlock(pos, Blocks.BLACKSTONE.defaultBlockState(), 2);
        }
        else if(level.getBlockState(pos).is(RegionsUnexploredBlocks.PRISMOSS.get())|| level.getBlockState(pos).is(RegionsUnexploredBlocks.VIRIDESCENT_NYLIUM.get())|| level.getBlockState(pos).is(RegionsUnexploredBlocks.STONE_GRASS_BLOCK.get())){
            level.setBlock(pos, Blocks.STONE.defaultBlockState(), 2);
        }
        else if(level.getBlockState(pos).is(RegionsUnexploredBlocks.DEEPSLATE_PRISMOSS.get())||level.getBlockState(pos).is(RegionsUnexploredBlocks.DEEPSLATE_VIRIDESCENT_NYLIUM.get())||level.getBlockState(pos).is(RegionsUnexploredBlocks.DEEPSLATE_GRASS_BLOCK.get())){
            level.setBlock(pos, Blocks.DEEPSLATE.defaultBlockState(), 2);
        }
        else if(isReplaceable(level, pos)) {
            level.setBlock(pos, bioshroomConfiguration.stemProvider.getState(randomSource, pos), 2);
        }
        else{
            return;
        }

        if(level.getBlockState(pos.below()).is(RegionsUnexploredBlocks.FOREST_GRASS_BLOCK.get())){
            level.setBlock(pos.below(), RegionsUnexploredBlocks.FOREST_DIRT.get().defaultBlockState(), 2);
        }
        else if(level.getBlockState(pos.below()).is(RegionsUnexploredBlocks.PLAINS_GRASS_BLOCK.get())){
            level.setBlock(pos.below(), RegionsUnexploredBlocks.PLAINS_DIRT.get().defaultBlockState(), 2);
        }
        else if(level.getBlockState(pos.below()).is(RegionsUnexploredBlocks.ALPHA_GRASS_BLOCK.get())||level.getBlockState(pos.below()).is(Blocks.GRASS_BLOCK)||level.getBlockState(pos.below()).is(Blocks.MYCELIUM)){
            level.setBlock(pos.below(), Blocks.DIRT.defaultBlockState(), 2);
        }
        else if(level.getBlockState(pos.below()).is(RegionsUnexploredBlocks.MYCOTOXIC_NYLIUM.get())||level.getBlockState(pos.below()).is(RegionsUnexploredBlocks.GLISTERING_NYLIUM.get())|| level.getBlockState(pos.below()).is(Blocks.CRIMSON_NYLIUM)|| level.getBlockState(pos.below()).is(Blocks.WARPED_NYLIUM)){
            level.setBlock(pos.below(), Blocks.NETHERRACK.defaultBlockState(), 2);
        }
        else if(level.getBlockState(pos.below()).is(RegionsUnexploredBlocks.COBALT_NYLIUM.get())){
            level.setBlock(pos.below(), Blocks.BLACKSTONE.defaultBlockState(), 2);
        }
        else if(level.getBlockState(pos.below()).is(RegionsUnexploredBlocks.PRISMOSS.get())|| level.getBlockState(pos.below()).is(RegionsUnexploredBlocks.VIRIDESCENT_NYLIUM.get())|| level.getBlockState(pos.below()).is(RegionsUnexploredBlocks.STONE_GRASS_BLOCK.get())){
            level.setBlock(pos.below(), Blocks.STONE.defaultBlockState(), 2);
        }
        else if(level.getBlockState(pos.below()).is(RegionsUnexploredBlocks.DEEPSLATE_PRISMOSS.get())||level.getBlockState(pos.below()).is(RegionsUnexploredBlocks.DEEPSLATE_VIRIDESCENT_NYLIUM.get())||level.getBlockState(pos.below()).is(RegionsUnexploredBlocks.DEEPSLATE_GRASS_BLOCK.get())){
            level.setBlock(pos.below(), Blocks.DEEPSLATE.defaultBlockState(), 2);
        }
    }

    public void placeRoot(LevelAccessor level, BlockPos pos, RandomSource randomSource, GiantBioshroomConfiguration bioshroomConfiguration) {
        int rd = 2;
        int i = 0;
        BlockPos.MutableBlockPos placePos = pos.mutable();
        while(i<=rd){
            if(i>0){
                if(!level.getBlockState(placePos.above()).is(bioshroomConfiguration.stemProvider.getState(randomSource, placePos.above()).getBlock())&&level.getBlockState(placePos).canBeReplaced()) {
                    return;
                }
            }
            placeStemBlock(level, placePos, randomSource, bioshroomConfiguration);
            placePos.move(Direction.DOWN);
            i++;
        }
    }

    public void placeCap(LevelAccessor level, BlockPos pos, RandomSource randomSource, GiantBioshroomConfiguration bioshroomConfiguration) {
        Random random = new Random();
        placeStemBlock(level,pos,randomSource,bioshroomConfiguration);
        placeStemBlock(level,pos.north(),randomSource,bioshroomConfiguration);
        placeStemBlock(level,pos.south(),randomSource,bioshroomConfiguration);
        placeStemBlock(level,pos.east(),randomSource,bioshroomConfiguration);
        placeStemBlock(level,pos.west(),randomSource,bioshroomConfiguration);
        placeStemBlock(level,pos.below(),randomSource,bioshroomConfiguration);
        placeStemBlock(level,pos.below().north(),randomSource,bioshroomConfiguration);
        placeStemBlock(level,pos.below().south(),randomSource,bioshroomConfiguration);
        placeStemBlock(level,pos.below().east(),randomSource,bioshroomConfiguration);
        placeStemBlock(level,pos.below().west(),randomSource,bioshroomConfiguration);
        placeStemBlock(level,pos.below().below(),randomSource,bioshroomConfiguration);
        placeStemBlock(level,pos.below().below().north(),randomSource,bioshroomConfiguration);
        placeStemBlock(level,pos.below().below().south(),randomSource,bioshroomConfiguration);
        placeStemBlock(level,pos.below().below().east(),randomSource,bioshroomConfiguration);
        placeStemBlock(level,pos.below().below().west(),randomSource,bioshroomConfiguration);
        //top
        placeCapBlock(level,pos.above(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.above().north(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.above().south(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.above().east(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.above().west(),randomSource,bioshroomConfiguration);
        //main level
        placeCapBlock(level,pos.north().north(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.north().north().east(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.north().north().west(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.north().north().north(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.north().north().north().east(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.north().north().north().west(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.south().south(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.south().south().east(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.south().south().west(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.south().south().south(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.south().south().south().east(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.south().south().south().west(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.east().east(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.east().east().north(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.east().east().south(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.east().east().east(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.east().east().east().north(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.east().east().east().south(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.west().west(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.west().west().north(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.west().west().south(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.west().west().west(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.west().west().west().north(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.west().west().west().south(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.north().east(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.north().west(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.south().east(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.south().west(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.north().north().east().east(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.north().north().west().west(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.south().south().east().east(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.south().south().west().west(),randomSource,bioshroomConfiguration);
        //lower
        placeCapBlock(level,pos.below().north().north().north(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.below().north().north().north().east(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.below().north().north().north().east().east(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.below().north().north().north().west(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.below().north().north().north().west().west(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.below().below().north().north().north().east().east(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.below().below().north().north().north().west().west(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.below().south().south().south(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.below().south().south().south().east(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.below().south().south().south().east().east(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.below().south().south().south().west(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.below().south().south().south().west().west(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.below().below().south().south().south().east().east(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.below().below().south().south().south().west().west(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.below().east().east().east(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.below().east().east().east().north(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.below().east().east().east().north().north(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.below().east().east().east().south(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.below().east().east().east().south().south(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.below().below().east().east().east().north().north(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.below().below().east().east().east().south().south(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.below().west().west().west(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.below().west().west().west().north(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.below().west().west().west().north().north(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.below().west().west().west().south(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.below().west().west().west().south().south(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.below().below().west().west().west().north().north(),randomSource,bioshroomConfiguration);
        placeCapBlock(level,pos.below().below().west().west().west().south().south(),randomSource,bioshroomConfiguration);
        //main level
        placeGlowingBlock(level,pos.below().north().north(),randomSource,bioshroomConfiguration);
        placeGlowingBlock(level,pos.below().north().north().east(),randomSource,bioshroomConfiguration);
        placeGlowingBlock(level,pos.below().north().north().west(),randomSource,bioshroomConfiguration);
        placeGlowingBlock(level,pos.below().south().south(),randomSource,bioshroomConfiguration);
        placeGlowingBlock(level,pos.below().south().south().east(),randomSource,bioshroomConfiguration);
        placeGlowingBlock(level,pos.below().south().south().west(),randomSource,bioshroomConfiguration);
        placeGlowingBlock(level,pos.below().east().east(),randomSource,bioshroomConfiguration);
        placeGlowingBlock(level,pos.below().east().east().north(),randomSource,bioshroomConfiguration);
        placeGlowingBlock(level,pos.below().east().east().south(),randomSource,bioshroomConfiguration);
        placeGlowingBlock(level,pos.below().west().west(),randomSource,bioshroomConfiguration);
        placeGlowingBlock(level,pos.below().west().west().north(),randomSource,bioshroomConfiguration);
        placeGlowingBlock(level,pos.below().west().west().south(),randomSource,bioshroomConfiguration);
        placeGlowingBlock(level,pos.below().north().east(),randomSource,bioshroomConfiguration);
        placeGlowingBlock(level,pos.below().north().west(),randomSource,bioshroomConfiguration);
        placeGlowingBlock(level,pos.below().south().east(),randomSource,bioshroomConfiguration);
        placeGlowingBlock(level,pos.below().south().west(),randomSource,bioshroomConfiguration);
        placeGlowingBlock(level,pos.below().north().north().east().east(),randomSource,bioshroomConfiguration);
        placeGlowingBlock(level,pos.below().north().north().west().west(),randomSource,bioshroomConfiguration);
        placeGlowingBlock(level,pos.below().south().south().east().east(),randomSource,bioshroomConfiguration);
        placeGlowingBlock(level,pos.below().south().south().west().west(),randomSource,bioshroomConfiguration);

        if(random.nextInt(3)==0){
            placeCapBlock(level,pos.above().north().north(),randomSource,bioshroomConfiguration);
            placeCapBlock(level,pos.above().south().south(),randomSource,bioshroomConfiguration);
            placeCapBlock(level,pos.above().east().east(),randomSource,bioshroomConfiguration);
            placeCapBlock(level,pos.above().west().west(),randomSource,bioshroomConfiguration);

            placeCapBlock(level,pos.above().north().east(),randomSource,bioshroomConfiguration);
            placeCapBlock(level,pos.above().north().west(),randomSource,bioshroomConfiguration);
            placeCapBlock(level,pos.above().south().east(),randomSource,bioshroomConfiguration);
            placeCapBlock(level,pos.above().south().west(),randomSource,bioshroomConfiguration);
        }

    }

    public void placeCapBlock(LevelAccessor level, BlockPos pos, RandomSource randomSource, GiantBioshroomConfiguration bioshroomConfiguration) {
        if(level.isOutsideBuildHeight(pos)){
            return;
        }
        else if(isReplaceable(level, pos)) {
            level.setBlock(pos, bioshroomConfiguration.capProvider.getState(randomSource, pos), 2);
        }
    }
    public void placeGlowingBlock(LevelAccessor level, BlockPos pos, RandomSource randomSource, GiantBioshroomConfiguration bioshroomConfiguration) {
        if(level.isOutsideBuildHeight(pos)){
            return;
        }
        else if(isReplaceable(level, pos)) {
            level.setBlock(pos, bioshroomConfiguration.glowBlockProvider.getState(randomSource, pos), 2);
        }
    }

    
    public static boolean isReplaceableDirtBlock(BlockState state) {
        return state.is(RegionsUnexploredTags.TREE_GRASS_REPLACEABLES);
    }

    public static boolean isReplaceableDirt(LevelSimulatedReader reader, BlockPos pos) {
        return reader.isStateAtPosition(pos, GiantBlueBioshroomFeature::isReplaceableDirtBlock);
    }

    public static boolean isReplaceableBlock(BlockState state) {
        return state.is(RegionsUnexploredTags.REPLACEABLE_BLOCKS);
    }

    public static boolean isReplaceable(LevelSimulatedReader reader, BlockPos pos) {
        return reader.isStateAtPosition(pos, GiantBlueBioshroomFeature::isReplaceableBlock);
    }
}