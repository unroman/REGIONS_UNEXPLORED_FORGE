package net.regions_unexplored.entity;

import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.damagesource.DamageType;
import net.regions_unexplored.util.worldgen.RuDamageUtils;

public class RuDamageTypes {

    public static final ResourceKey<DamageType> QUICKSAND = RuDamageUtils.createKey("quicksand");
    public static final ResourceKey<DamageType> DORCEL = RuDamageUtils.createKey("dorcel");

    public static void bootstrap(BootstapContext<DamageType> context) {
        context.register(QUICKSAND, new DamageType("quicksand", 1.0F));
        context.register(DORCEL, new DamageType("dorcel", 1.0F));
    }
}
