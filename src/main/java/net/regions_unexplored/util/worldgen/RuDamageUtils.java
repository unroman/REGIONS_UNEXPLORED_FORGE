package net.regions_unexplored.util.worldgen;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageType;
import net.regions_unexplored.RegionsUnexploredMod;

public class RuDamageUtils {
    public static ResourceKey<DamageType> createKey(String key) {
        return ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation(RegionsUnexploredMod.MOD_ID, key));
    }
}
