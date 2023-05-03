package net.regions_unexplored.block.entity;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.RegistryObject;
import net.regions_unexplored.RegionsUnexploredMod;
import net.regions_unexplored.block.RegionsUnexploredBlocks;
import net.regions_unexplored.block.entity.custom.RuSignBlockEntity;

public class RegionsUnexploredBlockEntities {

    public static RegistryObject<BlockEntityType<RuSignBlockEntity>> SIGN_BLOCK_ENTITIES;

    public static void addBlockEntities() {
        //add signs
        SIGN_BLOCK_ENTITIES = RegionsUnexploredMod.BLOCK_ENTITIES.register("sign_block_entity", () ->
                BlockEntityType.Builder.of(RuSignBlockEntity::new,
                        RegionsUnexploredBlocks.BAOBAB_WALL_SIGN.get(), RegionsUnexploredBlocks.BAOBAB_SIGN.get(),
                        RegionsUnexploredBlocks.BLACKWOOD_WALL_SIGN.get(), RegionsUnexploredBlocks.BLACKWOOD_SIGN.get(),
                        RegionsUnexploredBlocks.CHERRY_WALL_SIGN.get(), RegionsUnexploredBlocks.CHERRY_SIGN.get(),
                        RegionsUnexploredBlocks.CYPRESS_WALL_SIGN.get(), RegionsUnexploredBlocks.CYPRESS_SIGN.get(),
                        RegionsUnexploredBlocks.DEAD_WALL_SIGN.get(), RegionsUnexploredBlocks.DEAD_SIGN.get(),
                        RegionsUnexploredBlocks.EUCALYPTUS_WALL_SIGN.get(), RegionsUnexploredBlocks.EUCALYPTUS_SIGN.get(),
                        RegionsUnexploredBlocks.JOSHUA_WALL_SIGN.get(), RegionsUnexploredBlocks.JOSHUA_SIGN.get(),
                        RegionsUnexploredBlocks.LARCH_WALL_SIGN.get(), RegionsUnexploredBlocks.LARCH_SIGN.get(),
                        RegionsUnexploredBlocks.MAPLE_WALL_SIGN.get(), RegionsUnexploredBlocks.MAPLE_SIGN.get(),
                        RegionsUnexploredBlocks.MAUVE_WALL_SIGN.get(), RegionsUnexploredBlocks.MAUVE_SIGN.get(),
                        RegionsUnexploredBlocks.PALM_WALL_SIGN.get(), RegionsUnexploredBlocks.PALM_SIGN.get(),
                        RegionsUnexploredBlocks.PINE_WALL_SIGN.get(), RegionsUnexploredBlocks.PINE_SIGN.get(),
                        RegionsUnexploredBlocks.REDWOOD_WALL_SIGN.get(), RegionsUnexploredBlocks.REDWOOD_SIGN.get(),
                        RegionsUnexploredBlocks.BRIMWOOD_WALL_SIGN.get(), RegionsUnexploredBlocks.BRIMWOOD_SIGN.get(),
                        RegionsUnexploredBlocks.WILLOW_WALL_SIGN.get(), RegionsUnexploredBlocks.WILLOW_SIGN.get()
                ).build(null));
    }
}
