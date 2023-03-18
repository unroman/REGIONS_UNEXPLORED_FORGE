package net.regions_unexplored.data;

import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.regions_unexplored.RegionsUnexploredMod;
import net.regions_unexplored.data.worldgen.biome.RuBiomeRegistry;
import net.regions_unexplored.data.worldgen.noise.RuNoises;
import net.regions_unexplored.entity.RuDamageTypes;
import net.regions_unexplored.util.worldgen.RuFeatureUtils;
import net.regions_unexplored.util.worldgen.RuPlacementUtils;

import java.util.Set;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = RegionsUnexploredMod.MOD_ID)
public class DataGenEvent {
    private static final RegistrySetBuilder REGISTER = new RegistrySetBuilder().add(Registries.DAMAGE_TYPE, RuDamageTypes::bootstrap).add(Registries.NOISE, RuNoises::bootstrap).add(Registries.CONFIGURED_FEATURE, RuFeatureUtils::bootstrap).add(Registries.PLACED_FEATURE, RuPlacementUtils::bootstrap).add(Registries.BIOME, RuBiomeRegistry::bootstrap);
    @SubscribeEvent
    public static void onGatherData(GatherDataEvent data) {
        DataGenerator generator = data.getGenerator();
        PackOutput pack = generator.getPackOutput();
        generator.addProvider(data.includeServer(), new DatapackBuiltinEntriesProvider(pack, data.getLookupProvider(), REGISTER, Set.of(RegionsUnexploredMod.MOD_ID)));
    }
}

