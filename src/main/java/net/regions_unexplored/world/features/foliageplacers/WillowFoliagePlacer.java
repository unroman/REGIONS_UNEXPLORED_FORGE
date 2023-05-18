package net.regions_unexplored.world.features.foliageplacers;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.levelgen.feature.TreeFeature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.minecraft.world.level.material.Fluids;

public class WillowFoliagePlacer extends FoliagePlacer {
    public static final Codec<WillowFoliagePlacer> CODEC = RecordCodecBuilder.create((placer) -> {
        return foliagePlacerParts(placer).and(placer.group(IntProvider.codec(4, 16).fieldOf("height").forGetter((height) -> {
            return height.height;
        }), Codec.floatRange(0.0F, 1.0F).fieldOf("flower_decoration_chance").forGetter((flowerChance) -> {
            return flowerChance.flowerDecorationChance;
        }))).apply(placer, WillowFoliagePlacer::new);
    });
    private final IntProvider height;
    private final float flowerDecorationChance;

    public WillowFoliagePlacer(IntProvider ip1, IntProvider ip2, IntProvider height, float flowerDecorationChance) {
        super(ip1, ip2);
        this.height = height;
        this.flowerDecorationChance = flowerDecorationChance;
    }

    public static FoliagePlacerType<?> fpt;
    static {
        fpt = new FoliagePlacerType<>(CODEC);
    }
    protected FoliagePlacerType<?> type() {
        return fpt;
    }

    protected void createFoliage(LevelSimulatedReader level, FoliagePlacer.FoliageSetter setter, RandomSource random, TreeConfiguration treeConfig, int p_272975_, FoliagePlacer.FoliageAttachment foliage, int p_273647_, int p_273700_, int height) {
        boolean flag = foliage.doubleTrunk();
        BlockPos blockpos = foliage.pos().above(height);
        int i = p_273700_ + foliage.radiusOffset() - 1;
        tryPlaceLeaf(level, setter, random, treeConfig, blockpos);
        tryPlaceLeaf(level, setter, random, treeConfig, blockpos.north());
        tryPlaceLeaf(level, setter, random, treeConfig, blockpos.south());
        tryPlaceLeaf(level, setter, random, treeConfig, blockpos.east());
        tryPlaceLeaf(level, setter, random, treeConfig, blockpos.west());
        tryPlaceLeaf(level, setter, random, treeConfig, blockpos.above());
    }

    public int foliageHeight(RandomSource p_273679_, int p_273336_, TreeConfiguration p_273643_) {
        return this.height.sample(p_273679_);
    }

    protected boolean shouldSkipLocation(RandomSource p_273294_, int p_273380_, int p_272865_, int p_272853_, int p_272631_, boolean p_273432_) {
        return false;
    }

    protected static boolean tryPlaceLeaf(LevelSimulatedReader level, FoliagePlacer.FoliageSetter setter, RandomSource random, TreeConfiguration treeConfiguration, BlockPos pos) {
        if (!TreeFeature.validTreePos(level, pos)) {
            return false;
        } else {
            BlockState blockstate = treeConfiguration.foliageProvider.getState(random, pos);
            if (blockstate.hasProperty(BlockStateProperties.WATERLOGGED)) {
                blockstate = blockstate.setValue(BlockStateProperties.WATERLOGGED, Boolean.valueOf(level.isFluidAtPosition(pos, (p_225638_) -> {
                    return p_225638_.isSourceOfType(Fluids.WATER);
                })));
            }

            setter.set(pos, blockstate);
            return true;
        }
    }
}
