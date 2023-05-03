package net.regions_unexplored.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.minecraftforge.registries.RegistryObject;
import net.regions_unexplored.RegionsUnexploredMod;
import net.regions_unexplored.block.RegionsUnexploredBlocks;
import net.regions_unexplored.entity.custom.RuBoat;

public class RegionsUnexploredItems {

    public static RegistryObject<Item> BAOBAB_SIGN;
    public static RegistryObject<Item> BLACKWOOD_SIGN;
    public static RegistryObject<Item> CHERRY_SIGN;
    public static RegistryObject<Item> CYPRESS_SIGN;
    public static RegistryObject<Item> DEAD_SIGN;
    public static RegistryObject<Item> EUCALYPTUS_SIGN;
    public static RegistryObject<Item> JOSHUA_SIGN;
    public static RegistryObject<Item> LARCH_SIGN;
    public static RegistryObject<Item> MAPLE_SIGN;
    public static RegistryObject<Item> MAUVE_SIGN;
    public static RegistryObject<Item> PALM_SIGN;
    public static RegistryObject<Item> PINE_SIGN;
    public static RegistryObject<Item> REDWOOD_SIGN;
    public static RegistryObject<Item> BRIMWOOD_SIGN;
    public static RegistryObject<Item> WILLOW_SIGN;

    public static RegistryObject<Item> BAOBAB_BOAT;
    public static RegistryObject<Item> BAOBAB_CHEST_BOAT;
    public static RegistryObject<Item> BLACKWOOD_BOAT;
    public static RegistryObject<Item> BLACKWOOD_CHEST_BOAT;
    public static RegistryObject<Item> CHERRY_BOAT;
    public static RegistryObject<Item> CHERRY_CHEST_BOAT;
    public static RegistryObject<Item> CYPRESS_BOAT;
    public static RegistryObject<Item> CYPRESS_CHEST_BOAT;
    public static RegistryObject<Item> DEAD_BOAT;
    public static RegistryObject<Item> DEAD_CHEST_BOAT;
    public static RegistryObject<Item> EUCALYPTUS_BOAT;
    public static RegistryObject<Item> EUCALYPTUS_CHEST_BOAT;
    public static RegistryObject<Item> JOSHUA_BOAT;
    public static RegistryObject<Item> JOSHUA_CHEST_BOAT;
    public static RegistryObject<Item> LARCH_BOAT;
    public static RegistryObject<Item> LARCH_CHEST_BOAT;
    public static RegistryObject<Item> MAPLE_BOAT;
    public static RegistryObject<Item> MAPLE_CHEST_BOAT;
    public static RegistryObject<Item> MAUVE_BOAT;
    public static RegistryObject<Item> MAUVE_CHEST_BOAT;
    public static RegistryObject<Item> PALM_BOAT;
    public static RegistryObject<Item> PALM_CHEST_BOAT;
    public static RegistryObject<Item> PINE_BOAT;
    public static RegistryObject<Item> PINE_CHEST_BOAT;
    public static RegistryObject<Item> REDWOOD_BOAT;
    public static RegistryObject<Item> REDWOOD_CHEST_BOAT;
    public static RegistryObject<Item> BRIMWOOD_BOAT;
    public static RegistryObject<Item> BRIMWOOD_CHEST_BOAT;
    public static RegistryObject<Item> WILLOW_BOAT;
    public static RegistryObject<Item> WILLOW_CHEST_BOAT;
    
    public static void addItems(){
    BAOBAB_SIGN = RegionsUnexploredMod.ITEMS.register("baobab_sign", () -> new SignItem(new Item.Properties().stacksTo(16), RegionsUnexploredBlocks.BAOBAB_SIGN.get(), RegionsUnexploredBlocks.BAOBAB_WALL_SIGN.get()));
    BLACKWOOD_SIGN = RegionsUnexploredMod.ITEMS.register("blackwood_sign", () -> new SignItem(new Item.Properties().stacksTo(16), RegionsUnexploredBlocks.BLACKWOOD_SIGN.get(), RegionsUnexploredBlocks.BLACKWOOD_WALL_SIGN.get()));
    CHERRY_SIGN = RegionsUnexploredMod.ITEMS.register("cherry_sign", () -> new SignItem(new Item.Properties().stacksTo(16), RegionsUnexploredBlocks.CHERRY_SIGN.get(), RegionsUnexploredBlocks.CHERRY_WALL_SIGN.get()));
    CYPRESS_SIGN = RegionsUnexploredMod.ITEMS.register("cypress_sign", () -> new SignItem(new Item.Properties().stacksTo(16), RegionsUnexploredBlocks.CYPRESS_SIGN.get(), RegionsUnexploredBlocks.CYPRESS_WALL_SIGN.get()));
    DEAD_SIGN = RegionsUnexploredMod.ITEMS.register("dead_sign", () -> new SignItem(new Item.Properties().stacksTo(16), RegionsUnexploredBlocks.DEAD_SIGN.get(), RegionsUnexploredBlocks.DEAD_WALL_SIGN.get()));
    EUCALYPTUS_SIGN = RegionsUnexploredMod.ITEMS.register("eucalyptus_sign", () -> new SignItem(new Item.Properties().stacksTo(16), RegionsUnexploredBlocks.EUCALYPTUS_SIGN.get(), RegionsUnexploredBlocks.EUCALYPTUS_WALL_SIGN.get()));
    JOSHUA_SIGN = RegionsUnexploredMod.ITEMS.register("joshua_sign", () -> new SignItem(new Item.Properties().stacksTo(16), RegionsUnexploredBlocks.JOSHUA_SIGN.get(), RegionsUnexploredBlocks.JOSHUA_WALL_SIGN.get()));
    LARCH_SIGN = RegionsUnexploredMod.ITEMS.register("larch_sign", () -> new SignItem(new Item.Properties().stacksTo(16), RegionsUnexploredBlocks.LARCH_SIGN.get(), RegionsUnexploredBlocks.LARCH_WALL_SIGN.get()));
    MAPLE_SIGN = RegionsUnexploredMod.ITEMS.register("maple_sign", () -> new SignItem(new Item.Properties().stacksTo(16), RegionsUnexploredBlocks.MAPLE_SIGN.get(), RegionsUnexploredBlocks.MAPLE_WALL_SIGN.get()));
    MAUVE_SIGN = RegionsUnexploredMod.ITEMS.register("mauve_sign", () -> new SignItem(new Item.Properties().stacksTo(16), RegionsUnexploredBlocks.MAUVE_SIGN.get(), RegionsUnexploredBlocks.MAUVE_WALL_SIGN.get()));
    PALM_SIGN = RegionsUnexploredMod.ITEMS.register("palm_sign", () -> new SignItem(new Item.Properties().stacksTo(16), RegionsUnexploredBlocks.PALM_SIGN.get(), RegionsUnexploredBlocks.PALM_WALL_SIGN.get()));
    PINE_SIGN = RegionsUnexploredMod.ITEMS.register("pine_sign", () -> new SignItem(new Item.Properties().stacksTo(16), RegionsUnexploredBlocks.PINE_SIGN.get(), RegionsUnexploredBlocks.PINE_WALL_SIGN.get()));
    REDWOOD_SIGN = RegionsUnexploredMod.ITEMS.register("redwood_sign", () -> new SignItem(new Item.Properties().stacksTo(16), RegionsUnexploredBlocks.REDWOOD_SIGN.get(), RegionsUnexploredBlocks.REDWOOD_WALL_SIGN.get()));
    BRIMWOOD_SIGN = RegionsUnexploredMod.ITEMS.register("brimwood_sign", () -> new SignItem(new Item.Properties().stacksTo(16), RegionsUnexploredBlocks.BRIMWOOD_SIGN.get(), RegionsUnexploredBlocks.BRIMWOOD_WALL_SIGN.get()));
    WILLOW_SIGN = RegionsUnexploredMod.ITEMS.register("willow_sign", () -> new SignItem(new Item.Properties().stacksTo(16), RegionsUnexploredBlocks.WILLOW_SIGN.get(), RegionsUnexploredBlocks.WILLOW_WALL_SIGN.get()));

    BAOBAB_BOAT = RegionsUnexploredMod.ITEMS.register("baobab_boat", () -> new RuBoatItem(false, RuBoat.ModelType.BAOBAB, (new Item.Properties()).stacksTo(1)));
    BAOBAB_CHEST_BOAT = RegionsUnexploredMod.ITEMS.register("baobab_chest_boat", () -> new RuBoatItem(true, RuBoat.ModelType.BAOBAB, (new Item.Properties()).stacksTo(1)));
    BLACKWOOD_BOAT = RegionsUnexploredMod.ITEMS.register("blackwood_boat", () -> new RuBoatItem(false, RuBoat.ModelType.BLACKWOOD, (new Item.Properties()).stacksTo(1)));
    BLACKWOOD_CHEST_BOAT = RegionsUnexploredMod.ITEMS.register("blackwood_chest_boat", () -> new RuBoatItem(true, RuBoat.ModelType.BLACKWOOD, (new Item.Properties()).stacksTo(1)));
    CHERRY_BOAT = RegionsUnexploredMod.ITEMS.register("cherry_boat", () -> new RuBoatItem(false, RuBoat.ModelType.CHERRY, (new Item.Properties()).stacksTo(1)));
    CHERRY_CHEST_BOAT = RegionsUnexploredMod.ITEMS.register("cherry_chest_boat", () -> new RuBoatItem(true, RuBoat.ModelType.CHERRY, (new Item.Properties()).stacksTo(1)));
    CYPRESS_BOAT = RegionsUnexploredMod.ITEMS.register("cypress_boat", () -> new RuBoatItem(false, RuBoat.ModelType.CYPRESS, (new Item.Properties()).stacksTo(1)));
    CYPRESS_CHEST_BOAT = RegionsUnexploredMod.ITEMS.register("cypress_chest_boat", () -> new RuBoatItem(true, RuBoat.ModelType.CYPRESS, (new Item.Properties()).stacksTo(1)));
    DEAD_BOAT = RegionsUnexploredMod.ITEMS.register("dead_boat", () -> new RuBoatItem(false, RuBoat.ModelType.DEAD, (new Item.Properties()).stacksTo(1)));
    DEAD_CHEST_BOAT = RegionsUnexploredMod.ITEMS.register("dead_chest_boat", () -> new RuBoatItem(true, RuBoat.ModelType.DEAD, (new Item.Properties()).stacksTo(1)));
    EUCALYPTUS_BOAT = RegionsUnexploredMod.ITEMS.register("eucalyptus_boat", () -> new RuBoatItem(false, RuBoat.ModelType.EUCALYPTUS, (new Item.Properties()).stacksTo(1)));
    EUCALYPTUS_CHEST_BOAT = RegionsUnexploredMod.ITEMS.register("eucalyptus_chest_boat", () -> new RuBoatItem(true, RuBoat.ModelType.EUCALYPTUS, (new Item.Properties()).stacksTo(1)));
    JOSHUA_BOAT = RegionsUnexploredMod.ITEMS.register("joshua_boat", () -> new RuBoatItem(false, RuBoat.ModelType.JOSHUA, (new Item.Properties()).stacksTo(1)));
    JOSHUA_CHEST_BOAT = RegionsUnexploredMod.ITEMS.register("joshua_chest_boat", () -> new RuBoatItem(true, RuBoat.ModelType.JOSHUA, (new Item.Properties()).stacksTo(1)));
    LARCH_BOAT = RegionsUnexploredMod.ITEMS.register("larch_boat", () -> new RuBoatItem(false, RuBoat.ModelType.LARCH, (new Item.Properties()).stacksTo(1)));
    LARCH_CHEST_BOAT = RegionsUnexploredMod.ITEMS.register("larch_chest_boat", () -> new RuBoatItem(true, RuBoat.ModelType.LARCH, (new Item.Properties()).stacksTo(1)));
    MAPLE_BOAT = RegionsUnexploredMod.ITEMS.register("maple_boat", () -> new RuBoatItem(false, RuBoat.ModelType.MAPLE, (new Item.Properties()).stacksTo(1)));
    MAPLE_CHEST_BOAT = RegionsUnexploredMod.ITEMS.register("maple_chest_boat", () -> new RuBoatItem(true, RuBoat.ModelType.MAPLE, (new Item.Properties()).stacksTo(1)));
    MAUVE_BOAT = RegionsUnexploredMod.ITEMS.register("mauve_boat", () -> new RuBoatItem(false, RuBoat.ModelType.MAUVE, (new Item.Properties()).stacksTo(1)));
    MAUVE_CHEST_BOAT = RegionsUnexploredMod.ITEMS.register("mauve_chest_boat", () -> new RuBoatItem(true, RuBoat.ModelType.MAUVE, (new Item.Properties()).stacksTo(1)));
    PALM_BOAT = RegionsUnexploredMod.ITEMS.register("palm_boat", () -> new RuBoatItem(false, RuBoat.ModelType.PALM, (new Item.Properties()).stacksTo(1)));
    PALM_CHEST_BOAT = RegionsUnexploredMod.ITEMS.register("palm_chest_boat", () -> new RuBoatItem(true, RuBoat.ModelType.PALM, (new Item.Properties()).stacksTo(1)));
    PINE_BOAT = RegionsUnexploredMod.ITEMS.register("pine_boat", () -> new RuBoatItem(false, RuBoat.ModelType.PINE, (new Item.Properties()).stacksTo(1)));
    PINE_CHEST_BOAT = RegionsUnexploredMod.ITEMS.register("pine_chest_boat", () -> new RuBoatItem(true, RuBoat.ModelType.PINE, (new Item.Properties()).stacksTo(1)));
    REDWOOD_BOAT = RegionsUnexploredMod.ITEMS.register("redwood_boat", () -> new RuBoatItem(false, RuBoat.ModelType.REDWOOD, (new Item.Properties()).stacksTo(1)));
    REDWOOD_CHEST_BOAT = RegionsUnexploredMod.ITEMS.register("redwood_chest_boat", () -> new RuBoatItem(true, RuBoat.ModelType.REDWOOD, (new Item.Properties()).stacksTo(1)));
    BRIMWOOD_BOAT = RegionsUnexploredMod.ITEMS.register("brimwood_boat", () -> new RuBoatItem(false, RuBoat.ModelType.SCULKWOOD, (new Item.Properties()).stacksTo(1)));
    BRIMWOOD_CHEST_BOAT = RegionsUnexploredMod.ITEMS.register("brimwood_chest_boat", () -> new RuBoatItem(true, RuBoat.ModelType.SCULKWOOD, (new Item.Properties()).stacksTo(1)));
    WILLOW_BOAT = RegionsUnexploredMod.ITEMS.register("willow_boat", () -> new RuBoatItem(false, RuBoat.ModelType.WILLOW, (new Item.Properties()).stacksTo(1)));
    WILLOW_CHEST_BOAT = RegionsUnexploredMod.ITEMS.register("willow_chest_boat", () -> new RuBoatItem(true, RuBoat.ModelType.WILLOW, (new Item.Properties()).stacksTo(1)));
    }
}
