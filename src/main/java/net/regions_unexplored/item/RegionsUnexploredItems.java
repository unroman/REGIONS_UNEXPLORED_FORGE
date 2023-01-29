package net.regions_unexplored.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.regions_unexplored.RegionsUnexploredMod;

public class RegionsUnexploredItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RegionsUnexploredMod.MOD_ID);

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
