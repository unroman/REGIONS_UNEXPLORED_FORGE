package net.regions_unexplored.data.tags;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.tags.TagKey;

public final class RegionsUnexploredTags {
   public static final TagKey<Block> SNOW_GRASS_CAN_SURVIVE_ON = create("snow_grass_can_survive_on");
   public static final TagKey<Block> SANDY_GRASS_CAN_SURVIVE_ON = create("sandy_grass_can_survive_on");
   public static final TagKey<Block> SCULK_PLANT_CAN_SURVIVE_ON = create("sculk_plant_can_survive_on");
   public static final TagKey<Block> STONE_GRASS_CAN_SURVIVE_ON = create("stone_grass_can_survive_on");
   public static final TagKey<Block> CATTAIL_CAN_SURVIVE_ON = create("cattail_can_survive_on");
   public static final TagKey<Block> BRANCHES_CAN_SURVIVE_ON = create("branches_can_survive_on");
   public static final TagKey<Block> REPLACEABLE_BLOCKS = create("replaceable_blocks");
   public static final TagKey<Block> SANDS = create("sands");
   public static final TagKey<Block> FLUIDS = create("fluids");
   public static final TagKey<Block> ASH = create("ash");
   public static final TagKey<Block> BRANCHES = create("branches");
   public static final TagKey<Block> BAMBOO_LOGS = create("bamboo_logs");
   public static final TagKey<Block> BAOBAB_LOGS = create("baobab_logs");
   public static final TagKey<Block> BLACKWOOD_LOGS = create("blackwood_logs");
   public static final TagKey<Block> CHERRY_LOGS = create("cherry_logs");
   public static final TagKey<Block> CYPRESS_LOGS = create("cypress_logs");
   public static final TagKey<Block> DEAD_LOGS = create("dead_logs");
   public static final TagKey<Block> EUCALYPTUS_LOGS = create("eucalyptus_logs");
   public static final TagKey<Block> JOSHUA_LOGS = create("joshua_logs");
   public static final TagKey<Block> LARCH_LOGS = create("larch_logs");
   public static final TagKey<Block> MAPLE_LOGS = create("maple_logs");
   public static final TagKey<Block> MAUVE_LOGS = create("mauve_logs");
   public static final TagKey<Block> PALM_LOGS = create("palm_logs");
   public static final TagKey<Block> PINE_LOGS = create("pine_logs");
   public static final TagKey<Block> REDWOOD_LOGS = create("redwood_logs");
   public static final TagKey<Block> SCULKWOOD_LOGS = create("sculkwood_logs");
   public static final TagKey<Block> WILLOW_LOGS = create("willow_logs");

   private RegionsUnexploredTags() {
   }

   private static TagKey<Block> create(String key) {
      return TagKey.create(Registries.BLOCK, new ResourceLocation("regions_unexplored", key));
   }

   public static TagKey<Block> create(ResourceLocation name) {
      return TagKey.create(Registries.BLOCK, name);
   }
}
