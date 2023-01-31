package net.regions_unexplored.data.worldgen.features.treefeature;

import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.MultifaceBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.regions_unexplored.block.RegionsUnexploredBlocks;
import net.regions_unexplored.data.tags.RegionsUnexploredTags;

import java.util.Random;

public class GiantSculkWillowFeature extends Feature<NoneFeatureConfiguration> {

    public GiantSculkWillowFeature(Codec<NoneFeatureConfiguration> codec) {
        super(codec);
    }

    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        BlockPos pos = context.origin();
        WorldGenLevel worldgenlevel = context.level();
        int height = context.random().nextInt(6)+22;

        if(worldgenlevel.getBlockState(pos.north()).getBlock() == RegionsUnexploredBlocks.SCULKWOOD_LOG_DARK.get()){
            return false;
        }
        if(worldgenlevel.getBlockState(pos.west()).getBlock() == RegionsUnexploredBlocks.SCULKWOOD_LOG_DARK.get()){
            return false;
        }
        if(worldgenlevel.getBlockState(pos.east()).getBlock() == RegionsUnexploredBlocks.SCULKWOOD_LOG_DARK.get()){
            return false;
        }
        if(worldgenlevel.getBlockState(pos.south()).getBlock() == RegionsUnexploredBlocks.SCULKWOOD_LOG_DARK.get()){
            return false;
        }
        if(worldgenlevel.getBlockState(pos.south().west()).getBlock() == RegionsUnexploredBlocks.SCULKWOOD_LOG_DARK.get()){
            return false;
        }
        if(worldgenlevel.getBlockState(pos.south().east()).getBlock() == RegionsUnexploredBlocks.SCULKWOOD_LOG_DARK.get()){
            return false;
        }
        if(worldgenlevel.getBlockState(pos.north().west()).getBlock() == RegionsUnexploredBlocks.SCULKWOOD_LOG_DARK.get()){
            return false;
        }
        if(worldgenlevel.getBlockState(pos.north().east()).getBlock() == RegionsUnexploredBlocks.SCULKWOOD_LOG_DARK.get()){
            return false;
        }
        if(worldgenlevel.getBlockState(pos.below()).getBlock()== RegionsUnexploredBlocks.SCULK_GRASS_BLOCK.get()||worldgenlevel.getBlockState(pos.below()).getBlock()== Blocks.SCULK||worldgenlevel.getBlockState(pos.below()).is(BlockTags.NYLIUM)||worldgenlevel.getBlockState(pos.below()).is(BlockTags.DIRT)){
        }
        else{
            return false;
        }

        if (worldgenlevel.isEmptyBlock(pos)) {
            BlockPos.MutableBlockPos placePos = pos.mutable();

            for(int i = 0; i<=height; i++){
                if(i==1){
                    placeRoots(worldgenlevel, placePos);
                }
                if(i==height-5){
                    placeBranchesGiant(worldgenlevel, placePos);
                }
                if(i==height-7){
                    placeSpine(worldgenlevel, placePos);
                }
                if(i==height-9){
                    placeSpine(worldgenlevel, placePos);
                }
                if(i==height-15){
                    placeBranches(worldgenlevel, placePos);
                }
                if(i==height-17){
                    placeSpine(worldgenlevel, placePos);
                }
                if(i==height-19){
                    placeSpine(worldgenlevel, placePos);
                }

                if(isReplaceable(worldgenlevel, placePos)){
                    if(i==3){
                        worldgenlevel.setBlock(placePos, RegionsUnexploredBlocks.SCULKWOOD_LOG_TRANSITION.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Y), 2);
                    }
                    else if(i<3){
                        worldgenlevel.setBlock(placePos, RegionsUnexploredBlocks.SCULKWOOD_LOG_DARK.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Y), 2);
                    }
                    else if(i>3){
                        worldgenlevel.setBlock(placePos, RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Y), 2);
                    }
                }
                if(i==height){
                    placeLeavesUpsideDownGiant(worldgenlevel, placePos);
                }
                placePos.move(Direction.UP);
            }

            return true;
        } else {
            return false;
        }
    }

    private void placeBranches(LevelAccessor level, BlockPos pos) {
        //NORTH
        if(isReplaceable(level, pos.north())){
            if(isReplaceable(level, pos.north())){
                level.setBlock(pos.north(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z), 2);
            }
            if(isReplaceable(level, pos.north().above().north())){
                level.setBlock(pos.north().above().north(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z), 2);
            }
            if(isReplaceable(level, pos.north().above().north().north())){
                level.setBlock(pos.north().above().north().north(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z), 2);
            }
            if(isReplaceable(level, pos.north().above().north().north().north())){
                level.setBlock(pos.north().above().north().north().north(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z), 2);
                placeLeavesUpsideDown(level, pos.north().above().north().north().north());
            }
        }
        //SOUTH
        if(isReplaceable(level, pos.south())){
            if(isReplaceable(level, pos.south())){
                level.setBlock(pos.south(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z), 2);
            }
            if(isReplaceable(level, pos.south().above().south())){
                level.setBlock(pos.south().above().south(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z), 2);
            }
            if(isReplaceable(level, pos.south().above().south().south())){
                level.setBlock(pos.south().above().south().south(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z), 2);
            }
            if(isReplaceable(level, pos.south().above().south().south().south())){
                level.setBlock(pos.south().above().south().south().south(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z), 2);
                placeLeavesUpsideDown(level, pos.south().above().south().south().south());
            }
        }
        //EAST
        if(isReplaceable(level, pos.east())){
            if(isReplaceable(level, pos.east())){
                level.setBlock(pos.east(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.X), 2);
            }
            if(isReplaceable(level, pos.east().above().east())){
                level.setBlock(pos.east().above().east(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.X), 2);
            }
            if(isReplaceable(level, pos.east().above().east().east())){
                level.setBlock(pos.east().above().east().east(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.X), 2);
            }
            if(isReplaceable(level, pos.east().above().east().east().east())){
                level.setBlock(pos.east().above().east().east().east(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.X), 2);
                placeLeavesUpsideDown(level, pos.east().above().east().east().east());
            }
        }
        //WEST
        if(isReplaceable(level, pos.west())){
            if(isReplaceable(level, pos.west())){
                level.setBlock(pos.west(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.X), 2);
            }
            if(isReplaceable(level, pos.west().above().west())){
                level.setBlock(pos.west().above().west(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.X), 2);
            }
            if(isReplaceable(level, pos.west().above().west().west())){
                level.setBlock(pos.west().above().west().west(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.X), 2);
            }
            if(isReplaceable(level, pos.west().above().west().west().west())){
                level.setBlock(pos.west().above().west().west().west(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.X), 2);
                placeLeavesUpsideDown(level, pos.west().above().west().west().west());
            }
        }
    }


    private void placeBranchesGiant(LevelAccessor level, BlockPos pos) {
        //NORTH
        if(isReplaceable(level, pos.north())){
            if(isReplaceable(level, pos.north())){
                level.setBlock(pos.north(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z), 2);
                if(isReplaceable(level, pos.north().north())){
                    level.setBlock(pos.north().north(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z), 2);
                    if(isReplaceable(level, pos.north().north().north().above())){
                        level.setBlock(pos.north().north().north().above(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z), 2);
                        if(isReplaceable(level, pos.north().north().north().north().above())){
                            level.setBlock(pos.north().north().north().north().above(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z), 2);
                            if(isReplaceable(level, pos.north().north().north().north().above().north().above())){
                                level.setBlock(pos.north().north().north().north().above().north().above(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z), 2);
                                placeLeavesUpsideDownGiant(level, pos.north().north().north().north().above().north().above());
                            }
                        }
                    }
                }
            }
        }
        //SOUTH
        if(isReplaceable(level, pos.south())){
            if(isReplaceable(level, pos.south())){
                level.setBlock(pos.south(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z), 2);
                if(isReplaceable(level, pos.south().south())){
                    level.setBlock(pos.south().south(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z), 2);
                    if(isReplaceable(level, pos.south().south().south().above())){
                        level.setBlock(pos.south().south().south().above(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z), 2);
                        if(isReplaceable(level, pos.south().south().south().south().above())){
                            level.setBlock(pos.south().south().south().south().above(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z), 2);
                            if(isReplaceable(level, pos.south().south().south().south().above().south().above())){
                                level.setBlock(pos.south().south().south().south().above().south().above(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z), 2);
                                placeLeavesUpsideDownGiant(level, pos.south().south().south().south().above().south().above());
                            }
                        }
                    }
                }
            }
        }
        //EAST
        if(isReplaceable(level, pos.east())){
            if(isReplaceable(level, pos.east())){
                level.setBlock(pos.east(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.X), 2);
                if(isReplaceable(level, pos.east().east())){
                    level.setBlock(pos.east().east(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.X), 2);
                    if(isReplaceable(level, pos.east().east().east().above())){
                        level.setBlock(pos.east().east().east().above(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.X), 2);
                        if(isReplaceable(level, pos.east().east().east().east().above())){
                            level.setBlock(pos.east().east().east().east().above(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.X), 2);
                            if(isReplaceable(level, pos.east().east().east().east().above().east().above())){
                                level.setBlock(pos.east().east().east().east().above().east().above(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.X), 2);
                                placeLeavesUpsideDownGiant(level, pos.east().east().east().east().above().east().above());
                            }
                        }
                    }
                }
            }
        }
        //WEST
        if(isReplaceable(level, pos.west())){
            if(isReplaceable(level, pos.west())){
                level.setBlock(pos.west(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.X), 2);
                if(isReplaceable(level, pos.west().west())){
                    level.setBlock(pos.west().west(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.X), 2);
                    if(isReplaceable(level, pos.west().west().west().above())){
                        level.setBlock(pos.west().west().west().above(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.X), 2);
                        if(isReplaceable(level, pos.west().west().west().west().above())){
                            level.setBlock(pos.west().west().west().west().above(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.X), 2);
                            if(isReplaceable(level, pos.west().west().west().west().above().west().above())){
                                level.setBlock(pos.west().west().west().west().above().west().above(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.X), 2);
                                placeLeavesUpsideDownGiant(level, pos.west().west().west().west().above().west().above());
                            }
                        }
                    }
                }
            }
        }
        //NORTH_WEST
        if(isReplaceable(level, pos.north().west())){
            level.setBlock(pos.north().west(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z), 2);
            if(isReplaceable(level, pos.north().west().north().west().above())){
                level.setBlock(pos.north().west().north().west().above(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z), 2);
                if(isReplaceable(level, pos.north().west().north().west().north().west().above())){
                    level.setBlock(pos.north().west().north().west().north().west().above(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z), 2);
                    if(isReplaceable(level, pos.north().west().north().west().north().west().above().north().west().above())){
                        level.setBlock(pos.north().west().north().west().north().west().above().north().west().above(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z), 2);
                        if(isReplaceable(level, pos.north().west().north().west().north().west().above().north().west().above().north().west())){
                            level.setBlock(pos.north().west().north().west().north().west().above().north().west().above().north().west(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z), 2);
                            if(isReplaceable(level, pos.north().west().north().west().north().west().above().north().west().above().north().west().above().north().west())){
                                level.setBlock(pos.north().west().north().west().north().west().above().north().west().above().north().west().above().north().west(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z), 2);
                                placeLeavesUpsideDownGiant(level, pos.north().west().north().west().north().west().above().north().west().above().north().west().above().north().west());
                            }
                        }
                    }
                }
            }
        }
        //SOUTH_WEST
        if(isReplaceable(level, pos.south().west())){
            level.setBlock(pos.south().west(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z), 2);
            if(isReplaceable(level, pos.south().west().south().west().above())){
                level.setBlock(pos.south().west().south().west().above(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z), 2);
                if(isReplaceable(level, pos.south().west().south().west().south().west().above())){
                    level.setBlock(pos.south().west().south().west().south().west().above(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z), 2);
                    if(isReplaceable(level, pos.south().west().south().west().south().west().above().south().west().above())){
                        level.setBlock(pos.south().west().south().west().south().west().above().south().west().above(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z), 2);
                        if(isReplaceable(level, pos.south().west().south().west().south().west().above().south().west().above().south().west())){
                            level.setBlock(pos.south().west().south().west().south().west().above().south().west().above().south().west(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z), 2);
                            if(isReplaceable(level, pos.south().west().south().west().south().west().above().south().west().above().south().west().above().south().west())){
                                level.setBlock(pos.south().west().south().west().south().west().above().south().west().above().south().west().above().south().west(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z), 2);
                                placeLeavesUpsideDownGiant(level, pos.south().west().south().west().south().west().above().south().west().above().south().west().above().south().west());
                            }
                        }
                    }
                }
            }
        }
        //NORTH_EAST
        if(isReplaceable(level, pos.north().east())){
            level.setBlock(pos.north().east(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z), 2);
            if(isReplaceable(level, pos.north().east().north().east().above())){
                level.setBlock(pos.north().east().north().east().above(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z), 2);
                if(isReplaceable(level, pos.north().east().north().east().north().east().above())){
                    level.setBlock(pos.north().east().north().east().north().east().above(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z), 2);
                    if(isReplaceable(level, pos.north().east().north().east().north().east().above().north().east().above())){
                        level.setBlock(pos.north().east().north().east().north().east().above().north().east().above(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z), 2);
                        if(isReplaceable(level, pos.north().east().north().east().north().east().above().north().east().above().north().east())){
                            level.setBlock(pos.north().east().north().east().north().east().above().north().east().above().north().east(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z), 2);
                            if(isReplaceable(level, pos.north().east().north().east().north().east().above().north().east().above().north().east().above().north().east())){
                                level.setBlock(pos.north().east().north().east().north().east().above().north().east().above().north().east().above().north().east(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z), 2);
                                placeLeavesUpsideDownGiant(level, pos.north().east().north().east().north().east().above().north().east().above().north().east().above().north().east());
                            }
                        }
                    }
                }
            }
        }
        //SOUTH_EAST
        if(isReplaceable(level, pos.south().east())){
            level.setBlock(pos.south().east(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z), 2);
            if(isReplaceable(level, pos.south().east().south().east().above())){
                level.setBlock(pos.south().east().south().east().above(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z), 2);
                if(isReplaceable(level, pos.south().east().south().east().south().east().above())){
                    level.setBlock(pos.south().east().south().east().south().east().above(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z), 2);
                    if(isReplaceable(level, pos.south().east().south().east().south().east().above().south().east().above())){
                        level.setBlock(pos.south().east().south().east().south().east().above().south().east().above(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z), 2);
                        if(isReplaceable(level, pos.south().east().south().east().south().east().above().south().east().above().south().east())){
                            level.setBlock(pos.south().east().south().east().south().east().above().south().east().above().south().east(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z), 2);
                            if(isReplaceable(level, pos.south().east().south().east().south().east().above().south().east().above().south().east().above().south().east())){
                                level.setBlock(pos.south().east().south().east().south().east().above().south().east().above().south().east().above().south().east(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z), 2);
                                placeLeavesUpsideDownGiant(level, pos.south().east().south().east().south().east().above().south().east().above().south().east().above().south().east());
                            }
                        }
                    }
                }
            }
        }
    }

    private void placeSpine(LevelAccessor level, BlockPos pos) {
        //NORTH
        if(isReplaceable(level, pos.north())){
                level.setBlock(pos.north(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z), 2);
        }
        //SOUTH
        if(isReplaceable(level, pos.south())){
                level.setBlock(pos.south(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z), 2);
        }
        //EAST
        if(isReplaceable(level, pos.east())){
                level.setBlock(pos.east(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.X), 2);
        }
        //WEST
        if(isReplaceable(level, pos.west())){
                level.setBlock(pos.west(), RegionsUnexploredBlocks.SCULKWOOD_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.X), 2);
        }
    }

    private void placeRoots(LevelAccessor level, BlockPos pos) {
        //NORTH
        if(level.isEmptyBlock(pos.north().below().north().below().below().below())){}
        else{
            if(isReplaceable(level, pos.north())){
                if(isReplaceable(level, pos.north().north().north())){
                    level.setBlock(pos.north().north().north(), RegionsUnexploredBlocks.SCULKWOOD_LOG_DARK.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z), 2);
                    if(isReplaceable(level, pos.north().north())){
                        level.setBlock(pos.north().north(), Blocks.SCULK_VEIN.defaultBlockState().setValue(MultifaceBlock.getFaceProperty(Direction.NORTH), true).setValue(MultifaceBlock.getFaceProperty(Direction.DOWN), true), 2);
                    }
                }
                if(isReplaceable(level, pos.north().below().north())){
                    level.setBlock(pos.north().below().north(), RegionsUnexploredBlocks.SCULKWOOD_LOG_DARK.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Y), 2);
                    if(isReplaceable(level, pos.north().below().north().below())){
                        level.setBlock(pos.north().below().north().below(), RegionsUnexploredBlocks.SCULKWOOD_LOG_DARK.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Y), 2);
                        if(isReplaceable(level, pos.north().below().north().below().below())){
                            level.setBlock(pos.north().below().north().below().below(), RegionsUnexploredBlocks.SCULKWOOD_LOG_DARK.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Y), 2);
                            if(isReplaceable(level, pos.north().below().north().below().below().below())){
                                level.setBlock(pos.north().below().north().below().below().below(), RegionsUnexploredBlocks.SCULKWOOD_LOG_DARK.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Y), 2);
                            }
                        }
                    }
                }
            }
        }
        //SOUTH
        if(level.isEmptyBlock(pos.south().below().south().below().below().below())){}
        else{
            if(isReplaceable(level, pos.south())){
                if(isReplaceable(level, pos.south().south().south())){
                    level.setBlock(pos.south().south().south(), RegionsUnexploredBlocks.SCULKWOOD_LOG_DARK.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z), 2);
                    if(isReplaceable(level, pos.south().south())){
                        level.setBlock(pos.south().south(), Blocks.SCULK_VEIN.defaultBlockState().setValue(MultifaceBlock.getFaceProperty(Direction.SOUTH), true).setValue(MultifaceBlock.getFaceProperty(Direction.DOWN), true), 2);
                    }
                }
                if(isReplaceable(level, pos.south().below().south())){
                    level.setBlock(pos.south().below().south(), RegionsUnexploredBlocks.SCULKWOOD_LOG_DARK.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Y), 2);
                    if(isReplaceable(level, pos.south().below().south().below())){
                        level.setBlock(pos.south().below().south().below(), RegionsUnexploredBlocks.SCULKWOOD_LOG_DARK.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Y), 2);
                        if(isReplaceable(level, pos.south().below().south().below().below())){
                            level.setBlock(pos.south().below().south().below().below(), RegionsUnexploredBlocks.SCULKWOOD_LOG_DARK.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Y), 2);
                            if(isReplaceable(level, pos.south().below().south().below().below().below())){
                                level.setBlock(pos.south().below().south().below().below().below(), RegionsUnexploredBlocks.SCULKWOOD_LOG_DARK.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Y), 2);
                            }
                        }
                    }
                }
            }
        }
        //EAST
        if(level.isEmptyBlock(pos.east().below().east().below().below().below())){}
        else{
            if(isReplaceable(level, pos.east())){
                if(isReplaceable(level, pos.east().east().east())){
                    level.setBlock(pos.east().east().east(), RegionsUnexploredBlocks.SCULKWOOD_LOG_DARK.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.X), 2);
                    if(isReplaceable(level, pos.east().east())){
                        level.setBlock(pos.east().east(), Blocks.SCULK_VEIN.defaultBlockState().setValue(MultifaceBlock.getFaceProperty(Direction.EAST), true).setValue(MultifaceBlock.getFaceProperty(Direction.DOWN), true), 2);
                    }
                }
                if(isReplaceable(level, pos.east().below().east())){
                    level.setBlock(pos.east().below().east(), RegionsUnexploredBlocks.SCULKWOOD_LOG_DARK.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Y), 2);
                    if(isReplaceable(level, pos.east().below().east().below())){
                        level.setBlock(pos.east().below().east().below(), RegionsUnexploredBlocks.SCULKWOOD_LOG_DARK.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Y), 2);
                        if(isReplaceable(level, pos.east().below().east().below().below())){
                            level.setBlock(pos.east().below().east().below().below(), RegionsUnexploredBlocks.SCULKWOOD_LOG_DARK.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Y), 2);
                            if(isReplaceable(level, pos.east().below().east().below().below().below())){
                                level.setBlock(pos.east().below().east().below().below().below(), RegionsUnexploredBlocks.SCULKWOOD_LOG_DARK.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Y), 2);
                            }
                        }
                    }
                }
            }
        }
        //WEST
        if(level.isEmptyBlock(pos.west().below().west().below().below().below())){}
        else{
            if(isReplaceable(level, pos.west())){
                if(isReplaceable(level, pos.west().west().west())){
                    level.setBlock(pos.west().west().west(), RegionsUnexploredBlocks.SCULKWOOD_LOG_DARK.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.X), 2);
                    if(isReplaceable(level, pos.west().west())){
                        level.setBlock(pos.west().west(), Blocks.SCULK_VEIN.defaultBlockState().setValue(MultifaceBlock.getFaceProperty(Direction.WEST), true).setValue(MultifaceBlock.getFaceProperty(Direction.DOWN), true), 2);
                    }
                }
                if(isReplaceable(level, pos.west().below().west())){
                    level.setBlock(pos.west().below().west(), RegionsUnexploredBlocks.SCULKWOOD_LOG_DARK.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Y), 2);
                    if(isReplaceable(level, pos.west().below().west().below())){
                        level.setBlock(pos.west().below().west().below(), RegionsUnexploredBlocks.SCULKWOOD_LOG_DARK.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Y), 2);
                        if(isReplaceable(level, pos.west().below().west().below().below())){
                            level.setBlock(pos.west().below().west().below().below(), RegionsUnexploredBlocks.SCULKWOOD_LOG_DARK.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Y), 2);
                            if(isReplaceable(level, pos.west().below().west().below().below().below())){
                                level.setBlock(pos.west().below().west().below().below().below(), RegionsUnexploredBlocks.SCULKWOOD_LOG_DARK.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Y), 2);
                            }
                        }
                    }
                }
            }
        }
    }

    private void placeLeavesUpsideDown(LevelAccessor level, BlockPos pos) {
        if (isReplaceable(level, pos)) {
            level.setBlock(pos, RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
        }
        //TOP
        if (isReplaceable(level, pos.above())) {
            level.setBlock(pos.above(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
        }
        if (isReplaceable(level, pos.above().north())) {
            level.setBlock(pos.above().north(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
        }
        if (isReplaceable(level, pos.above().north().east())) {
            level.setBlock(pos.above().north().east(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
        }
        if (isReplaceable(level, pos.above().north().west())) {
            level.setBlock(pos.above().north().west(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
        }
        if (isReplaceable(level, pos.above().south())) {
            level.setBlock(pos.above().south(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
        }
        if (isReplaceable(level, pos.above().south().east())) {
            level.setBlock(pos.above().south().east(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
        }
        if (isReplaceable(level, pos.above().south().west())) {
            level.setBlock(pos.above().south().west(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
        }
        if (isReplaceable(level, pos.above().east())) {
            level.setBlock(pos.above().east(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
        }
        if (isReplaceable(level, pos.above().west())) {
            level.setBlock(pos.above().west(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
        }
        //NORTH
        if (isReplaceable(level, pos.north())) {
            level.setBlock(pos.north(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
        }
        if (isReplaceable(level, pos.north().north().above())) {
            level.setBlock(pos.north().north().above(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
            addVine(level,pos.north().north().above());
        }
        //NORTH-WEST
        if (isReplaceable(level, pos.north().west())) {
            level.setBlock(pos.north().west(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
        }
        if (isReplaceable(level, pos.north().north().west().above())) {
            level.setBlock(pos.north().north().west().above(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
            addVine(level,pos.north().north().west().above());
        }
        if (isReplaceable(level, pos.north().west().west().above())) {
            level.setBlock(pos.north().west().west().above(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
            addVine(level,pos.north().west().west().above());
        }
        //WEST
        if (isReplaceable(level, pos.west())) {
            level.setBlock(pos.west(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
        }
        if (isReplaceable(level, pos.west().west().above())) {
            level.setBlock(pos.west().west().above(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
            addVine(level,pos.west().west().above());
        }
        //SOUTH-WEST
        if (isReplaceable(level, pos.south().west())) {
            level.setBlock(pos.south().west(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
        }
        if (isReplaceable(level, pos.south().south().west().above())) {
            level.setBlock(pos.south().south().west().above(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
            addVine(level,pos.south().south().west().above());
        }
        if (isReplaceable(level, pos.south().west().west().above())) {
            level.setBlock(pos.south().west().west().above(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
            addVine(level,pos.south().west().west().above());
        }
        //SOUTH
        if (isReplaceable(level, pos.south())) {
            level.setBlock(pos.south(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
        }
        if (isReplaceable(level, pos.south().south().above())) {
            level.setBlock(pos.south().south().above(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
            addVine(level,pos.south().south().above());
        }
        //SOUTH-EAST
        if (isReplaceable(level, pos.south().east())) {
            level.setBlock(pos.south().east(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
        }
        if (isReplaceable(level, pos.south().south().east().above())) {
            level.setBlock(pos.south().south().east().above(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
            addVine(level,pos.south().south().east().above());
        }
        if (isReplaceable(level, pos.south().east().east().above())) {
            level.setBlock(pos.south().east().east().above(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
            addVine(level,pos.south().east().east().above());
        }
        //EAST
        if (isReplaceable(level, pos.east())) {
            level.setBlock(pos.east(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
        }
        if (isReplaceable(level, pos.east().east().above())) {
            level.setBlock(pos.east().east().above(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
            addVine(level,pos.east().east().above());
        }
        //NORTH-EAST
        if (isReplaceable(level, pos.north().east())) {
            level.setBlock(pos.north().east(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
        }
        if (isReplaceable(level, pos.north().north().east().above())) {
            level.setBlock(pos.north().north().east().above(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
            addVine(level,pos.north().north().east().above());
        }
        if (isReplaceable(level, pos.north().east().east().above())) {
            level.setBlock(pos.north().east().east().above(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
            addVine(level,pos.north().east().east().above());
        }
    }

    private void placeLeavesUpsideDownGiant(LevelAccessor level, BlockPos pos) {
        BlockPos pos2 = pos.above();
        if (isReplaceable(level, pos)) {
            level.setBlock(pos, RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
        }

        //NORTH
        if (!level.isOutsideBuildHeight(pos)) {
            if (isReplaceable(level, pos.north())) {
                level.setBlock(pos.north(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
            }
            if (isReplaceable(level, pos.north().north())) {
                level.setBlock(pos.north().north(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
            }
            //NORTH-WEST
            if (isReplaceable(level, pos.north().west())) {
                level.setBlock(pos.north().west(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
            }
            if (isReplaceable(level, pos.north().north().west())) {
                level.setBlock(pos.north().north().west(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
            }
            if (isReplaceable(level, pos.north().west().west())) {
                level.setBlock(pos.north().west().west(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
            }
            //WEST
            if (isReplaceable(level, pos.west())) {
                level.setBlock(pos.west(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
            }
            if (isReplaceable(level, pos.west().west())) {
                level.setBlock(pos.west().west(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
            }
            //SOUTH-WEST
            if (isReplaceable(level, pos.south().west())) {
                level.setBlock(pos.south().west(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
            }
            if (isReplaceable(level, pos.south().south().west())) {
                level.setBlock(pos.south().south().west(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
            }
            if (isReplaceable(level, pos.south().west().west())) {
                level.setBlock(pos.south().west().west(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
            }
            //SOUTH
            if (isReplaceable(level, pos.south())) {
                level.setBlock(pos.south(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
            }
            if (isReplaceable(level, pos.south().south())) {
                level.setBlock(pos.south().south(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
            }
            //SOUTH-EAST
            if (isReplaceable(level, pos.south().east())) {
                level.setBlock(pos.south().east(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
            }
            if (isReplaceable(level, pos.south().south().east())) {
                level.setBlock(pos.south().south().east(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
            }
            if (isReplaceable(level, pos.south().east().east())) {
                level.setBlock(pos.south().east().east(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
            }
            //EAST
            if (isReplaceable(level, pos.east())) {
                level.setBlock(pos.east(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
            }
            if (isReplaceable(level, pos.east().east())) {
                level.setBlock(pos.east().east(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
            }
            //NORTH-EAST
            if (isReplaceable(level, pos.north().east())) {
                level.setBlock(pos.north().east(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
            }
            if (isReplaceable(level, pos.north().north().east())) {
                level.setBlock(pos.north().north().east(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
            }
            if (isReplaceable(level, pos.north().east().east())) {
                level.setBlock(pos.north().east().east(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
            }
        }


        if (!level.isOutsideBuildHeight(pos2)) {
            if (isReplaceable(level, pos2.north())) {
                level.setBlock(pos2.north(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
            }
            if (isReplaceable(level, pos2.north().north())) {
                level.setBlock(pos2.north().north(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
            }
            if (isReplaceable(level, pos2.north().north().north())) {
                level.setBlock(pos2.north().north().north(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
                addVineGiant(level, pos2.north().north().north());
            }
            if (isReplaceable(level, pos2.east().north().north().north())) {
                level.setBlock(pos2.east().north().north().north(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
                addVineGiant(level, pos2.east().north().north().north());
            }
            if (isReplaceable(level, pos2.east().east().north().north().north())) {
                level.setBlock(pos2.east().east().north().north().north(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
                addVineGiant(level, pos2.east().east().north().north().north());
            }
            if (isReplaceable(level, pos2.west().north().north().north())) {
                level.setBlock(pos2.west().north().north().north(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
                addVineGiant(level, pos2.west().north().north().north());
            }
            if (isReplaceable(level, pos2.west().west().north().north().north())) {
                level.setBlock(pos2.west().west().north().north().north(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
                addVineGiant(level, pos2.west().west().north().north().north());
            }
            //NORTH-WEST
            if (isReplaceable(level, pos2.north().west())) {
                level.setBlock(pos2.north().west(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
            }
            if (isReplaceable(level, pos2.north().north().west())) {
                level.setBlock(pos2.north().north().west(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
                addVineGiant(level, pos2.north().north().west());
            }
            if (isReplaceable(level, pos2.north().west().west())) {
                level.setBlock(pos2.north().west().west(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
                addVineGiant(level, pos2.north().west().west());
            }
            if (isReplaceable(level, pos2.north().north().west().west())) {
                level.setBlock(pos2.north().north().west().west(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
                addVineGiant(level, pos2.north().north().west().west());
            }
            //WEST
            if (isReplaceable(level, pos2.west())) {
                level.setBlock(pos2.west(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
            }
            if (isReplaceable(level, pos2.west().west())) {
                level.setBlock(pos2.west().west(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
            }
            if (isReplaceable(level, pos2.west().west().west())) {
                level.setBlock(pos2.west().west().west(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
                addVineGiant(level, pos2.west().west().west());
            }
            if (isReplaceable(level, pos2.south().west().west().west())) {
                level.setBlock(pos2.south().west().west().west(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
                addVineGiant(level, pos2.south().west().west().west());
            }
            if (isReplaceable(level, pos2.south().south().west().west().west())) {
                level.setBlock(pos2.south().south().west().west().west(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
                addVineGiant(level, pos2.south().south().west().west().west());
            }
            if (isReplaceable(level, pos2.north().west().west().west())) {
                level.setBlock(pos2.north().west().west().west(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
                addVineGiant(level, pos2.north().west().west().west());
            }
            if (isReplaceable(level, pos2.north().north().west().west().west())) {
                level.setBlock(pos2.north().north().west().west().west(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
                addVineGiant(level, pos2.north().north().west().west().west());
            }
            //SOUTH-WEST
            if (isReplaceable(level, pos2.south().west())) {
                level.setBlock(pos2.south().west(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
            }
            if (isReplaceable(level, pos2.south().south().west())) {
                level.setBlock(pos2.south().south().west(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
                addVineGiant(level, pos2.south().south().west());
            }
            if (isReplaceable(level, pos2.south().west().west())) {
                level.setBlock(pos2.south().west().west(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
                addVineGiant(level, pos2.south().west().west());
            }
            if (isReplaceable(level, pos2.south().south().west().west())) {
                level.setBlock(pos2.south().south().west().west(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
                addVineGiant(level, pos2.south().south().west().west());
            }
            //SOUTH
            if (isReplaceable(level, pos2.south())) {
                level.setBlock(pos2.south(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
            }
            if (isReplaceable(level, pos2.south().south())) {
                level.setBlock(pos2.south().south(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
            }
            if (isReplaceable(level, pos2.south().south().south())) {
                level.setBlock(pos2.south().south().south(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
                addVineGiant(level, pos2.south().south().south());
            }
            if (isReplaceable(level, pos2.east().south().south().south())) {
                level.setBlock(pos2.east().south().south().south(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
                addVineGiant(level, pos2.east().south().south().south());
            }
            if (isReplaceable(level, pos2.east().east().south().south().south())) {
                level.setBlock(pos2.east().east().south().south().south(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
                addVineGiant(level, pos2.east().east().south().south().south());
            }
            if (isReplaceable(level, pos2.west().south().south().south())) {
                level.setBlock(pos2.west().south().south().south(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
                addVineGiant(level, pos2.west().south().south().south());
            }
            if (isReplaceable(level, pos2.west().west().south().south().south())) {
                level.setBlock(pos2.west().west().south().south().south(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
                addVineGiant(level, pos2.west().west().south().south().south());
            }
            //SOUTH-EAST
            if (isReplaceable(level, pos2.south().east())) {
                level.setBlock(pos2.south().east(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
            }
            if (isReplaceable(level, pos2.south().south().east())) {
                level.setBlock(pos2.south().south().east(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
                addVineGiant(level, pos2.south().south().east());
            }
            if (isReplaceable(level, pos2.south().east().east())) {
                level.setBlock(pos2.south().east().east(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
                addVineGiant(level, pos2.south().east().east());
            }
            if (isReplaceable(level, pos2.south().south().east().east())) {
                level.setBlock(pos2.south().south().east().east(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
                addVineGiant(level, pos2.south().south().east().east());
            }
            //EAST
            if (isReplaceable(level, pos2.east())) {
                level.setBlock(pos2.east(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
            }
            if (isReplaceable(level, pos2.east().east())) {
                level.setBlock(pos2.east().east(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
            }
            if (isReplaceable(level, pos2.east().east().east())) {
                level.setBlock(pos2.east().east().east(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
                addVineGiant(level, pos2.east().east().east());
            }
            if (isReplaceable(level, pos2.south().east().east().east())) {
                level.setBlock(pos2.south().east().east().east(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
                addVineGiant(level, pos2.south().east().east().east());
            }
            if (isReplaceable(level, pos2.south().south().east().east().east())) {
                level.setBlock(pos2.south().south().east().east().east(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
                addVineGiant(level, pos2.south().south().east().east().east());
            }
            if (isReplaceable(level, pos2.north().east().east().east())) {
                level.setBlock(pos2.north().east().east().east(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
                addVineGiant(level, pos2.north().east().east().east());
            }
            if (isReplaceable(level, pos2.north().north().east().east().east())) {
                level.setBlock(pos2.north().north().east().east().east(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
                addVineGiant(level, pos2.north().north().east().east().east());
            }
            //NORTH-EAST
            if (isReplaceable(level, pos2.north().east())) {
                level.setBlock(pos2.north().east(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
            }
            if (isReplaceable(level, pos2.north().north().east())) {
                level.setBlock(pos2.north().north().east(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
                addVineGiant(level, pos2.north().north().east());
            }
            if (isReplaceable(level, pos2.north().east().east())) {
                level.setBlock(pos2.north().east().east(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
                addVineGiant(level, pos2.north().east().east());
            }
            if (isReplaceable(level, pos2.north().north().east().east())) {
                level.setBlock(pos2.north().north().east().east(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
                addVineGiant(level, pos2.north().north().east().east());
            }
        }
    }

    private void addVine(LevelAccessor level, BlockPos pos) {
        Random random = new Random();
        int size = random.nextInt(3);
        BlockPos place = pos.above();
        for(int i = 0; i<=size; i++){
            if(isAir(level, place)){
                if(i==size){
                    level.setBlock(place, RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
                }
                else {
                    level.setBlock(place, RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
                }
                place = place.above();
            }
            else{
                if(i!=0){
                    level.setBlock(place.below(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
                }
                break;
            }
        }
    }

    private void addVineGiant(LevelAccessor level, BlockPos pos) {
        Random random = new Random();
        int size = random.nextInt(4);
        BlockPos place = pos.above();
        for(int i = 0; i<=size; i++){
            if(isAir(level, place)){
                if(i==size){
                    level.setBlock(place, RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
                }
                else {
                    level.setBlock(place, RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
                }
                place = place.above();
            }
            else{
                if(i!=0){
                    level.setBlock(place.below(), RegionsUnexploredBlocks.SCULKWOOD_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT, true), 2);
                }
                break;
            }
        }
    }

    public static boolean isAirBlock(BlockState state) {
        return state.is(Blocks.AIR)||state.is(Blocks.CAVE_AIR)||state.is(Blocks.VOID_AIR);
    }

    public static boolean isAir(LevelSimulatedReader reader, BlockPos pos) {
        return reader.isStateAtPosition(pos, GiantSculkWillowFeature::isAirBlock);
    }

    public static boolean isReplaceableBlock(BlockState state) {
        return state.is(RegionsUnexploredTags.REPLACEABLE_BLOCKS);
    }

    public static boolean isReplaceable(LevelSimulatedReader reader, BlockPos pos) {
        return reader.isStateAtPosition(pos, GiantSculkWillowFeature::isReplaceableBlock);
    }
}