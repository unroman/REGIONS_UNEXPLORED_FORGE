package net.regions_unexplored.client.particle;

import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.regions_unexplored.RegionsUnexploredMod;

public class RegionsUnexploredParticleTypes {
    public static RegistryObject<ParticleType<?>> MAUVE;
    public static RegistryObject<ParticleType<?>> MYCOTOXIC_SPORE;

    public static void addParticles() {
        MAUVE = RegionsUnexploredMod.PARTICLES.register("mauve", () -> new SimpleParticleType(false));
        MYCOTOXIC_SPORE = RegionsUnexploredMod.PARTICLES.register("mycotoxic_spore", () -> new SimpleParticleType(false));
    }
}