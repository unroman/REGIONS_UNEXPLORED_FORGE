package net.regions_unexplored.world.level.block.grower;

import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.regions_unexplored.data.worldgen.features.RuTreeFeatures;

public class SilverBirchTreeGrower extends AbstractTreeGrower {
   protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource random, boolean bool) {
      if (random.nextInt(6) == 0) {
         return RuTreeFeatures.SILVER_BIRCH_ASPEN;
      } else {
         return RuTreeFeatures.SILVER_BIRCH;
      }
   }
}
