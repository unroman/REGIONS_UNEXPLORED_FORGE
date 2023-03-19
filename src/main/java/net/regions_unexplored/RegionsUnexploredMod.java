package net.regions_unexplored;

import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.regions_unexplored.block.RegionsUnexploredBlocks;
import net.regions_unexplored.block.entity.RegionsUnexploredBlockEntities;
import net.regions_unexplored.world.level.block.state.properties.RuWoodTypes;
import net.regions_unexplored.data.worldgen.RuNetherSurfaceRuleData;
import net.regions_unexplored.data.worldgen.RuSurfaceRuleData;
import net.regions_unexplored.entity.RegionsUnexploredEntities;
import net.regions_unexplored.init.PottedPlantCompat;
import net.regions_unexplored.client.particle.RegionsUnexploredParticleTypes;
import net.regions_unexplored.config.RegionsUnexploredCommonConfigs;
import net.regions_unexplored.data.worldgen.biome.RuBiomeRegistry;
import net.regions_unexplored.data.worldgen.features.RuFeatureRegistry;
import net.regions_unexplored.init.BlockFeatureCompat;
import net.regions_unexplored.item.RegionsUnexploredItems;
import net.regions_unexplored.world.features.treedecorators.*;
import org.slf4j.Logger;
import terrablender.api.SurfaceRuleManager;

import java.util.List;

@Mod(RegionsUnexploredMod.MOD_ID)
public class RegionsUnexploredMod {
    public static final String MOD_ID = "regions_unexplored";
    public static final Logger LOGGER = LogUtils.getLogger();

    public static final DeferredRegister<Biome> BIOME_REGISTRY = DeferredRegister.create(Registries.BIOME, MOD_ID);
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURE_REGISTRY = DeferredRegister.create(Registries.CONFIGURED_FEATURE, MOD_ID);
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURE_REGISTRY = DeferredRegister.create(Registries.PLACED_FEATURE, MOD_ID);

    public RegionsUnexploredMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::registerMainTab);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::registerNatureTab);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::registerNetherTab);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, RegionsUnexploredCommonConfigs.SPEC, "regions_unexplored-common.toml");

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        //register decorators before anything
        ForgeRegistries.TREE_DECORATOR_TYPES.register("bamboo_leave_decorator", BambooLeaveDecorator.tdt);
        ForgeRegistries.TREE_DECORATOR_TYPES.register("cypress_trunk_decorator", CypressTrunkDecorator.tdt);
        ForgeRegistries.TREE_DECORATOR_TYPES.register("birch_stem_decorator", BirchStemDecorator.tdt);
        ForgeRegistries.TREE_DECORATOR_TYPES.register("blackwood_bioshroom", BlackwoodBioshroom.tdt);
        ForgeRegistries.TREE_DECORATOR_TYPES.register("blackwood_branch_decorator", BlackwoodBranchDecorator.tdt);
        ForgeRegistries.TREE_DECORATOR_TYPES.register("dead_branch_decorator", DeadBranchDecorator.tdt);
        ForgeRegistries.TREE_DECORATOR_TYPES.register("dead_pine_branch_decorator", DeadPineBranchDecorator.tdt);
        ForgeRegistries.TREE_DECORATOR_TYPES.register("dead_placer", DeadPlacer.tdt);
        ForgeRegistries.TREE_DECORATOR_TYPES.register("dead_stem_decorator", DeadStemDecorator.tdt);
        ForgeRegistries.TREE_DECORATOR_TYPES.register("eucalyptus_leave_decorator", EucalyptusLeaveDecorator.tdt);
        ForgeRegistries.TREE_DECORATOR_TYPES.register("eucalyptus_trunk_decorator", EucalyptusTrunkDecorator.tdt);
        ForgeRegistries.TREE_DECORATOR_TYPES.register("giant_cypress_leave_decorator", GiantCypressLeaveDecorator.tdt);
        ForgeRegistries.TREE_DECORATOR_TYPES.register("giant_cypress_trunk_decorator", GiantCypressTrunkDecorator.tdt);
        ForgeRegistries.TREE_DECORATOR_TYPES.register("giant_redwood_branch_decorator", GiantRedwoodBranchDecorator.tdt);
        ForgeRegistries.TREE_DECORATOR_TYPES.register("maple_placer", MaplePlacer.tdt);
        ForgeRegistries.TREE_DECORATOR_TYPES.register("oak_placer", OakPlacer.tdt);
        ForgeRegistries.TREE_DECORATOR_TYPES.register("palm_leaves_placer", PalmLeavesPlacer.tdt);
        ForgeRegistries.TREE_DECORATOR_TYPES.register("pine_branch_decorator", PineBranchDecorator.tdt);
        ForgeRegistries.TREE_DECORATOR_TYPES.register("pine_trunk_decorator", PineTrunkDecorator.tdt);
        ForgeRegistries.TREE_DECORATOR_TYPES.register("redwood_branch_decorator", RedwoodBranchDecorator.tdt);
        ForgeRegistries.TREE_DECORATOR_TYPES.register("redwood_leave_decorator", RedwoodLeaveDecorator.tdt);
        ForgeRegistries.TREE_DECORATOR_TYPES.register("redwood_trunk_decorator", RedwoodTrunkDecorator.tdt);
        ForgeRegistries.TREE_DECORATOR_TYPES.register("saguaro_cactus_limbs", SaguaroCactusLimbs.tdt);
        ForgeRegistries.TREE_DECORATOR_TYPES.register("silver_birch_placer", SilverBirchPlacer.tdt);
        ForgeRegistries.TREE_DECORATOR_TYPES.register("spanish_moss_decorator", SpanishMossDecorator.tdt);
        ForgeRegistries.TREE_DECORATOR_TYPES.register("silver_birch_trunk_decorator", SilverBirchTrunkDecorator.tdt);
        ForgeRegistries.TREE_DECORATOR_TYPES.register("small_yellow_bioshroom_caps", SmallYellowBioshroomCaps.tdt);
        ForgeRegistries.TREE_DECORATOR_TYPES.register("medium_yellow_bioshroom_caps", MediumYellowBioshroomCaps.tdt);
        ForgeRegistries.TREE_DECORATOR_TYPES.register("big_yellow_bioshroom_caps", BigYellowBioshroomCaps.tdt);
        ForgeRegistries.TREE_DECORATOR_TYPES.register("willow_palm_placer", WillowPalmPlacer.tdt);
        ForgeRegistries.TREE_DECORATOR_TYPES.register("willow_placer", WillowPlacer.tdt);
        ForgeRegistries.TREE_DECORATOR_TYPES.register("willow_trunk_decorator", WillowTrunkDecorator.tdt);

        BIOME_REGISTRY.register(bus);
        CONFIGURED_FEATURE_REGISTRY.register(bus);
        PLACED_FEATURE_REGISTRY.register(bus);
        RegionsUnexploredBlockEntities.BLOCK_ENTITIES.register(bus);
        RegionsUnexploredEntities.ENTITIES.register(bus);

        RegionsUnexploredItems.register(bus);
        RegionsUnexploredBlocks.register(bus);

        RuFeatureRegistry.REGISTRY.register(bus);
        RegionsUnexploredParticleTypes.REGISTRY.register(bus);


        MinecraftForge.EVENT_BUS.register(this);
        RuBiomeRegistry.setup();
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        WoodType.register(RuWoodTypes.BAOBAB);
        WoodType.register(RuWoodTypes.BLACKWOOD);
        WoodType.register(RuWoodTypes.CHERRY);
        WoodType.register(RuWoodTypes.CYPRESS);
        WoodType.register(RuWoodTypes.DEAD);
        WoodType.register(RuWoodTypes.EUCALYPTUS);
        WoodType.register(RuWoodTypes.JOSHUA);
        WoodType.register(RuWoodTypes.LARCH);
        WoodType.register(RuWoodTypes.MAPLE);
        WoodType.register(RuWoodTypes.MAUVE);
        WoodType.register(RuWoodTypes.PALM);
        WoodType.register(RuWoodTypes.PINE);
        WoodType.register(RuWoodTypes.REDWOOD);
        WoodType.register(RuWoodTypes.SCULKWOOD);
        WoodType.register(RuWoodTypes.WILLOW);
        BlockEntityRenderers.register(RegionsUnexploredBlockEntities.SIGN_BLOCK_ENTITIES.get(), SignRenderer::new);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            RuBiomeRegistry.setupBiomePlacement();
            SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, RegionsUnexploredMod.MOD_ID, RuSurfaceRuleData.makeRules());
            SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.NETHER, RegionsUnexploredMod.MOD_ID, RuNetherSurfaceRuleData.makeRules());
            BlockFeatureCompat.setup();
            PottedPlantCompat.setup();
            Sheets.addWoodType(RuWoodTypes.BAOBAB);
            Sheets.addWoodType(RuWoodTypes.BLACKWOOD);
            Sheets.addWoodType(RuWoodTypes.CHERRY);
            Sheets.addWoodType(RuWoodTypes.CYPRESS);
            Sheets.addWoodType(RuWoodTypes.DEAD);
            Sheets.addWoodType(RuWoodTypes.EUCALYPTUS);
            Sheets.addWoodType(RuWoodTypes.JOSHUA);
            Sheets.addWoodType(RuWoodTypes.LARCH);
            Sheets.addWoodType(RuWoodTypes.MAPLE);
            Sheets.addWoodType(RuWoodTypes.MAUVE);
            Sheets.addWoodType(RuWoodTypes.PALM);
            Sheets.addWoodType(RuWoodTypes.PINE);
            Sheets.addWoodType(RuWoodTypes.REDWOOD);
            Sheets.addWoodType(RuWoodTypes.SCULKWOOD);
            Sheets.addWoodType(RuWoodTypes.WILLOW);
        });
    }

    private void registerMainTab(CreativeModeTabEvent.Register event) {
        List<RegistryObject<Block>> buildingBlocks = List.of(
                RegionsUnexploredBlocks.CHALK,
                RegionsUnexploredBlocks.CHALK_STAIRS,
                RegionsUnexploredBlocks.CHALK_SLAB,
                RegionsUnexploredBlocks.POLISHED_CHALK,
                RegionsUnexploredBlocks.POLISHED_CHALK_STAIRS,
                RegionsUnexploredBlocks.POLISHED_CHALK_SLAB,
                RegionsUnexploredBlocks.CHALK_BRICKS,
                RegionsUnexploredBlocks.CHALK_BRICK_STAIRS,
                RegionsUnexploredBlocks.CHALK_BRICK_SLAB,
                RegionsUnexploredBlocks.CHALK_PILLAR,
                RegionsUnexploredBlocks.PRISMAGLASS,
                RegionsUnexploredBlocks.ALPHA_LOG,
                RegionsUnexploredBlocks.ALPHA_PLANKS,
                RegionsUnexploredBlocks.ALPHA_STAIRS,
                RegionsUnexploredBlocks.ALPHA_SLAB,
                RegionsUnexploredBlocks.BAMBOO_LOG,
                RegionsUnexploredBlocks.STRIPPED_BAMBOO_LOG,
                RegionsUnexploredBlocks.BAOBAB_LOG,
                RegionsUnexploredBlocks.BAOBAB_WOOD,
                RegionsUnexploredBlocks.STRIPPED_BAOBAB_LOG,
                RegionsUnexploredBlocks.STRIPPED_BAOBAB_WOOD,
                RegionsUnexploredBlocks.BAOBAB_PLANKS,
                RegionsUnexploredBlocks.BAOBAB_STAIRS,
                RegionsUnexploredBlocks.BAOBAB_SLAB,
                RegionsUnexploredBlocks.BAOBAB_FENCE,
                RegionsUnexploredBlocks.BAOBAB_FENCE_GATE,
                RegionsUnexploredBlocks.BAOBAB_DOOR,
                RegionsUnexploredBlocks.BAOBAB_TRAPDOOR,
                RegionsUnexploredBlocks.BAOBAB_SIGN,
                RegionsUnexploredBlocks.BAOBAB_PRESSURE_PLATE,
                RegionsUnexploredBlocks.BAOBAB_BUTTON,
                RegionsUnexploredBlocks.BLACKWOOD_LOG,
                RegionsUnexploredBlocks.BLACKWOOD_WOOD,
                RegionsUnexploredBlocks.STRIPPED_BLACKWOOD_LOG,
                RegionsUnexploredBlocks.STRIPPED_BLACKWOOD_WOOD,
                RegionsUnexploredBlocks.BLACKWOOD_PLANKS,
                RegionsUnexploredBlocks.BLACKWOOD_STAIRS,
                RegionsUnexploredBlocks.BLACKWOOD_SLAB,
                RegionsUnexploredBlocks.BLACKWOOD_FENCE,
                RegionsUnexploredBlocks.BLACKWOOD_FENCE_GATE,
                RegionsUnexploredBlocks.BLACKWOOD_DOOR,
                RegionsUnexploredBlocks.BLACKWOOD_TRAPDOOR,
                RegionsUnexploredBlocks.BLACKWOOD_SIGN,
                RegionsUnexploredBlocks.BLACKWOOD_PRESSURE_PLATE,
                RegionsUnexploredBlocks.BLACKWOOD_BUTTON,
                RegionsUnexploredBlocks.CHERRY_LOG,
                RegionsUnexploredBlocks.CHERRY_WOOD,
                RegionsUnexploredBlocks.STRIPPED_CHERRY_LOG,
                RegionsUnexploredBlocks.STRIPPED_CHERRY_WOOD,
                RegionsUnexploredBlocks.CHERRY_PLANKS,
                RegionsUnexploredBlocks.CHERRY_STAIRS,
                RegionsUnexploredBlocks.CHERRY_SLAB,
                RegionsUnexploredBlocks.CHERRY_FENCE,
                RegionsUnexploredBlocks.CHERRY_FENCE_GATE,
                RegionsUnexploredBlocks.CHERRY_DOOR,
                RegionsUnexploredBlocks.CHERRY_TRAPDOOR,
                RegionsUnexploredBlocks.CHERRY_SIGN,
                RegionsUnexploredBlocks.CHERRY_PRESSURE_PLATE,
                RegionsUnexploredBlocks.CHERRY_BUTTON,
                RegionsUnexploredBlocks.CYPRESS_LOG,
                RegionsUnexploredBlocks.CYPRESS_WOOD,
                RegionsUnexploredBlocks.STRIPPED_CYPRESS_LOG,
                RegionsUnexploredBlocks.STRIPPED_CYPRESS_WOOD,
                RegionsUnexploredBlocks.CYPRESS_PLANKS,
                RegionsUnexploredBlocks.CYPRESS_STAIRS,
                RegionsUnexploredBlocks.CYPRESS_SLAB,
                RegionsUnexploredBlocks.CYPRESS_FENCE,
                RegionsUnexploredBlocks.CYPRESS_FENCE_GATE,
                RegionsUnexploredBlocks.CYPRESS_DOOR,
                RegionsUnexploredBlocks.CYPRESS_TRAPDOOR,
                RegionsUnexploredBlocks.CYPRESS_SIGN,
                RegionsUnexploredBlocks.CYPRESS_PRESSURE_PLATE,
                RegionsUnexploredBlocks.CYPRESS_BUTTON,
                RegionsUnexploredBlocks.DEAD_LOG,
                RegionsUnexploredBlocks.DEAD_WOOD,
                RegionsUnexploredBlocks.STRIPPED_DEAD_LOG,
                RegionsUnexploredBlocks.STRIPPED_DEAD_WOOD,
                RegionsUnexploredBlocks.DEAD_PLANKS,
                RegionsUnexploredBlocks.DEAD_STAIRS,
                RegionsUnexploredBlocks.DEAD_SLAB,
                RegionsUnexploredBlocks.DEAD_FENCE,
                RegionsUnexploredBlocks.DEAD_FENCE_GATE,
                RegionsUnexploredBlocks.DEAD_DOOR,
                RegionsUnexploredBlocks.DEAD_TRAPDOOR,
                RegionsUnexploredBlocks.DEAD_SIGN,
                RegionsUnexploredBlocks.DEAD_PRESSURE_PLATE,
                RegionsUnexploredBlocks.DEAD_BUTTON,
                RegionsUnexploredBlocks.EUCALYPTUS_LOG,
                RegionsUnexploredBlocks.EUCALYPTUS_WOOD,
                RegionsUnexploredBlocks.STRIPPED_EUCALYPTUS_LOG,
                RegionsUnexploredBlocks.STRIPPED_EUCALYPTUS_WOOD,
                RegionsUnexploredBlocks.EUCALYPTUS_PLANKS,
                RegionsUnexploredBlocks.EUCALYPTUS_STAIRS,
                RegionsUnexploredBlocks.EUCALYPTUS_SLAB,
                RegionsUnexploredBlocks.EUCALYPTUS_FENCE,
                RegionsUnexploredBlocks.EUCALYPTUS_FENCE_GATE,
                RegionsUnexploredBlocks.EUCALYPTUS_DOOR,
                RegionsUnexploredBlocks.EUCALYPTUS_TRAPDOOR,
                RegionsUnexploredBlocks.EUCALYPTUS_SIGN,
                RegionsUnexploredBlocks.EUCALYPTUS_PRESSURE_PLATE,
                RegionsUnexploredBlocks.EUCALYPTUS_BUTTON,
                RegionsUnexploredBlocks.JOSHUA_LOG,
                RegionsUnexploredBlocks.JOSHUA_WOOD,
                RegionsUnexploredBlocks.STRIPPED_JOSHUA_LOG,
                RegionsUnexploredBlocks.STRIPPED_JOSHUA_WOOD,
                RegionsUnexploredBlocks.JOSHUA_PLANKS,
                RegionsUnexploredBlocks.JOSHUA_STAIRS,
                RegionsUnexploredBlocks.JOSHUA_SLAB,
                RegionsUnexploredBlocks.JOSHUA_FENCE,
                RegionsUnexploredBlocks.JOSHUA_FENCE_GATE,
                RegionsUnexploredBlocks.JOSHUA_DOOR,
                RegionsUnexploredBlocks.JOSHUA_TRAPDOOR,
                RegionsUnexploredBlocks.JOSHUA_SIGN,
                RegionsUnexploredBlocks.JOSHUA_PRESSURE_PLATE,
                RegionsUnexploredBlocks.JOSHUA_BUTTON,
                RegionsUnexploredBlocks.LARCH_LOG,
                RegionsUnexploredBlocks.LARCH_WOOD,
                RegionsUnexploredBlocks.STRIPPED_LARCH_LOG,
                RegionsUnexploredBlocks.STRIPPED_LARCH_WOOD,
                RegionsUnexploredBlocks.LARCH_PLANKS,
                RegionsUnexploredBlocks.LARCH_STAIRS,
                RegionsUnexploredBlocks.LARCH_SLAB,
                RegionsUnexploredBlocks.LARCH_FENCE,
                RegionsUnexploredBlocks.LARCH_FENCE_GATE,
                RegionsUnexploredBlocks.LARCH_DOOR,
                RegionsUnexploredBlocks.LARCH_TRAPDOOR,
                RegionsUnexploredBlocks.LARCH_SIGN,
                RegionsUnexploredBlocks.LARCH_PRESSURE_PLATE,
                RegionsUnexploredBlocks.LARCH_BUTTON,
                RegionsUnexploredBlocks.MAPLE_LOG,
                RegionsUnexploredBlocks.MAPLE_WOOD,
                RegionsUnexploredBlocks.STRIPPED_MAPLE_LOG,
                RegionsUnexploredBlocks.STRIPPED_MAPLE_WOOD,
                RegionsUnexploredBlocks.MAPLE_PLANKS,
                RegionsUnexploredBlocks.MAPLE_STAIRS,
                RegionsUnexploredBlocks.MAPLE_SLAB,
                RegionsUnexploredBlocks.MAPLE_FENCE,
                RegionsUnexploredBlocks.MAPLE_FENCE_GATE,
                RegionsUnexploredBlocks.MAPLE_DOOR,
                RegionsUnexploredBlocks.MAPLE_TRAPDOOR,
                RegionsUnexploredBlocks.MAPLE_SIGN,
                RegionsUnexploredBlocks.MAPLE_PRESSURE_PLATE,
                RegionsUnexploredBlocks.MAPLE_BUTTON,
                RegionsUnexploredBlocks.MAUVE_LOG,
                RegionsUnexploredBlocks.MAUVE_WOOD,
                RegionsUnexploredBlocks.STRIPPED_MAUVE_LOG,
                RegionsUnexploredBlocks.STRIPPED_MAUVE_WOOD,
                RegionsUnexploredBlocks.MAUVE_PLANKS,
                RegionsUnexploredBlocks.MAUVE_STAIRS,
                RegionsUnexploredBlocks.MAUVE_SLAB,
                RegionsUnexploredBlocks.MAUVE_FENCE,
                RegionsUnexploredBlocks.MAUVE_FENCE_GATE,
                RegionsUnexploredBlocks.MAUVE_DOOR,
                RegionsUnexploredBlocks.MAUVE_TRAPDOOR,
                RegionsUnexploredBlocks.MAUVE_SIGN,
                RegionsUnexploredBlocks.MAUVE_PRESSURE_PLATE,
                RegionsUnexploredBlocks.MAUVE_BUTTON,
                RegionsUnexploredBlocks.PALM_LOG,
                RegionsUnexploredBlocks.PALM_WOOD,
                RegionsUnexploredBlocks.STRIPPED_PALM_LOG,
                RegionsUnexploredBlocks.STRIPPED_PALM_WOOD,
                RegionsUnexploredBlocks.PALM_PLANKS,
                RegionsUnexploredBlocks.PALM_STAIRS,
                RegionsUnexploredBlocks.PALM_SLAB,
                RegionsUnexploredBlocks.PALM_FENCE,
                RegionsUnexploredBlocks.PALM_FENCE_GATE,
                RegionsUnexploredBlocks.PALM_DOOR,
                RegionsUnexploredBlocks.PALM_TRAPDOOR,
                RegionsUnexploredBlocks.PALM_SIGN,
                RegionsUnexploredBlocks.PALM_PRESSURE_PLATE,
                RegionsUnexploredBlocks.PALM_BUTTON,
                RegionsUnexploredBlocks.PINE_LOG,
                RegionsUnexploredBlocks.PINE_WOOD,
                RegionsUnexploredBlocks.STRIPPED_PINE_LOG,
                RegionsUnexploredBlocks.STRIPPED_PINE_WOOD,
                RegionsUnexploredBlocks.PINE_PLANKS,
                RegionsUnexploredBlocks.PINE_STAIRS,
                RegionsUnexploredBlocks.PINE_SLAB,
                RegionsUnexploredBlocks.PINE_FENCE,
                RegionsUnexploredBlocks.PINE_FENCE_GATE,
                RegionsUnexploredBlocks.PINE_DOOR,
                RegionsUnexploredBlocks.PINE_TRAPDOOR,
                RegionsUnexploredBlocks.PINE_SIGN,
                RegionsUnexploredBlocks.PINE_PRESSURE_PLATE,
                RegionsUnexploredBlocks.PINE_BUTTON,
                RegionsUnexploredBlocks.REDWOOD_LOG,
                RegionsUnexploredBlocks.REDWOOD_WOOD,
                RegionsUnexploredBlocks.STRIPPED_REDWOOD_LOG,
                RegionsUnexploredBlocks.STRIPPED_REDWOOD_WOOD,
                RegionsUnexploredBlocks.REDWOOD_PLANKS,
                RegionsUnexploredBlocks.REDWOOD_STAIRS,
                RegionsUnexploredBlocks.REDWOOD_SLAB,
                RegionsUnexploredBlocks.REDWOOD_FENCE,
                RegionsUnexploredBlocks.REDWOOD_FENCE_GATE,
                RegionsUnexploredBlocks.REDWOOD_DOOR,
                RegionsUnexploredBlocks.REDWOOD_TRAPDOOR,
                RegionsUnexploredBlocks.REDWOOD_SIGN,
                RegionsUnexploredBlocks.REDWOOD_PRESSURE_PLATE,
                RegionsUnexploredBlocks.REDWOOD_BUTTON,
                RegionsUnexploredBlocks.SCULKWOOD_LOG,
                RegionsUnexploredBlocks.SCULKWOOD_LOG_DARK,
                RegionsUnexploredBlocks.SCULKWOOD_LOG_TRANSITION,
                RegionsUnexploredBlocks.SCULKWOOD_PLANKS,
                RegionsUnexploredBlocks.SCULKWOOD_STAIRS,
                RegionsUnexploredBlocks.SCULKWOOD_SLAB,
                RegionsUnexploredBlocks.SCULKWOOD_FENCE,
                RegionsUnexploredBlocks.SCULKWOOD_FENCE_GATE,
                RegionsUnexploredBlocks.SCULKWOOD_DOOR,
                RegionsUnexploredBlocks.SCULKWOOD_TRAPDOOR,
                RegionsUnexploredBlocks.SCULKWOOD_SIGN,
                RegionsUnexploredBlocks.SCULKWOOD_PRESSURE_PLATE,
                RegionsUnexploredBlocks.SCULKWOOD_BUTTON,
                RegionsUnexploredBlocks.WILLOW_LOG,
                RegionsUnexploredBlocks.WILLOW_WOOD,
                RegionsUnexploredBlocks.STRIPPED_WILLOW_LOG,
                RegionsUnexploredBlocks.STRIPPED_WILLOW_WOOD,
                RegionsUnexploredBlocks.STRIPPED_WILLOW_WOOD,
                RegionsUnexploredBlocks.WILLOW_PLANKS,
                RegionsUnexploredBlocks.WILLOW_STAIRS,
                RegionsUnexploredBlocks.WILLOW_SLAB,
                RegionsUnexploredBlocks.WILLOW_FENCE,
                RegionsUnexploredBlocks.WILLOW_FENCE_GATE,
                RegionsUnexploredBlocks.WILLOW_DOOR,
                RegionsUnexploredBlocks.WILLOW_TRAPDOOR,
                RegionsUnexploredBlocks.WILLOW_SIGN,
                RegionsUnexploredBlocks.WILLOW_PRESSURE_PLATE,
                RegionsUnexploredBlocks.WILLOW_BUTTON,
                RegionsUnexploredBlocks.RED_PAINTED_PLANKS,
                RegionsUnexploredBlocks.RED_PAINTED_STAIRS,
                RegionsUnexploredBlocks.RED_PAINTED_SLAB,
                RegionsUnexploredBlocks.ORANGE_PAINTED_PLANKS,
                RegionsUnexploredBlocks.ORANGE_PAINTED_STAIRS,
                RegionsUnexploredBlocks.ORANGE_PAINTED_SLAB,
                RegionsUnexploredBlocks.YELLOW_PAINTED_PLANKS,
                RegionsUnexploredBlocks.YELLOW_PAINTED_STAIRS,
                RegionsUnexploredBlocks.YELLOW_PAINTED_SLAB,
                RegionsUnexploredBlocks.LIME_PAINTED_PLANKS,
                RegionsUnexploredBlocks.LIME_PAINTED_STAIRS,
                RegionsUnexploredBlocks.LIME_PAINTED_SLAB,
                RegionsUnexploredBlocks.GREEN_PAINTED_PLANKS,
                RegionsUnexploredBlocks.GREEN_PAINTED_STAIRS,
                RegionsUnexploredBlocks.GREEN_PAINTED_SLAB,
                RegionsUnexploredBlocks.CYAN_PAINTED_PLANKS,
                RegionsUnexploredBlocks.CYAN_PAINTED_STAIRS,
                RegionsUnexploredBlocks.CYAN_PAINTED_SLAB,
                RegionsUnexploredBlocks.LIGHT_BLUE_PAINTED_PLANKS,
                RegionsUnexploredBlocks.LIGHT_BLUE_PAINTED_STAIRS,
                RegionsUnexploredBlocks.LIGHT_BLUE_PAINTED_SLAB,
                RegionsUnexploredBlocks.BLUE_PAINTED_PLANKS,
                RegionsUnexploredBlocks.BLUE_PAINTED_STAIRS,
                RegionsUnexploredBlocks.BLUE_PAINTED_SLAB,
                RegionsUnexploredBlocks.PURPLE_PAINTED_PLANKS,
                RegionsUnexploredBlocks.PURPLE_PAINTED_STAIRS,
                RegionsUnexploredBlocks.PURPLE_PAINTED_SLAB,
                RegionsUnexploredBlocks.MAGENTA_PAINTED_PLANKS,
                RegionsUnexploredBlocks.MAGENTA_PAINTED_STAIRS,
                RegionsUnexploredBlocks.MAGENTA_PAINTED_SLAB,
                RegionsUnexploredBlocks.PINK_PAINTED_PLANKS,
                RegionsUnexploredBlocks.PINK_PAINTED_STAIRS,
                RegionsUnexploredBlocks.PINK_PAINTED_SLAB,
                RegionsUnexploredBlocks.BROWN_PAINTED_PLANKS,
                RegionsUnexploredBlocks.BROWN_PAINTED_STAIRS,
                RegionsUnexploredBlocks.BROWN_PAINTED_SLAB,
                RegionsUnexploredBlocks.WHITE_PAINTED_PLANKS,
                RegionsUnexploredBlocks.WHITE_PAINTED_STAIRS,
                RegionsUnexploredBlocks.WHITE_PAINTED_SLAB,
                RegionsUnexploredBlocks.LIGHT_GRAY_PAINTED_PLANKS,
                RegionsUnexploredBlocks.LIGHT_GRAY_PAINTED_STAIRS,
                RegionsUnexploredBlocks.LIGHT_GRAY_PAINTED_SLAB,
                RegionsUnexploredBlocks.GRAY_PAINTED_PLANKS,
                RegionsUnexploredBlocks.GRAY_PAINTED_STAIRS,
                RegionsUnexploredBlocks.GRAY_PAINTED_SLAB,
                RegionsUnexploredBlocks.BLACK_PAINTED_PLANKS,
                RegionsUnexploredBlocks.BLACK_PAINTED_STAIRS,
                RegionsUnexploredBlocks.BLACK_PAINTED_SLAB
        );

        List<RegistryObject<Item>> itemStacks = List.of(
                RegionsUnexploredItems.BAOBAB_BOAT,
                RegionsUnexploredItems.BAOBAB_CHEST_BOAT,
                RegionsUnexploredItems.BLACKWOOD_BOAT,
                RegionsUnexploredItems.BLACKWOOD_CHEST_BOAT,
                RegionsUnexploredItems.CHERRY_BOAT,
                RegionsUnexploredItems.CHERRY_CHEST_BOAT,
                RegionsUnexploredItems.CYPRESS_BOAT,
                RegionsUnexploredItems.CYPRESS_CHEST_BOAT,
                RegionsUnexploredItems.DEAD_BOAT,
                RegionsUnexploredItems.DEAD_CHEST_BOAT,
                RegionsUnexploredItems.EUCALYPTUS_BOAT,
                RegionsUnexploredItems.EUCALYPTUS_CHEST_BOAT,
                RegionsUnexploredItems.JOSHUA_BOAT,
                RegionsUnexploredItems.JOSHUA_CHEST_BOAT,
                RegionsUnexploredItems.LARCH_BOAT,
                RegionsUnexploredItems.LARCH_CHEST_BOAT,
                RegionsUnexploredItems.MAPLE_BOAT,
                RegionsUnexploredItems.MAPLE_CHEST_BOAT,
                RegionsUnexploredItems.MAUVE_BOAT,
                RegionsUnexploredItems.MAUVE_CHEST_BOAT,
                RegionsUnexploredItems.PALM_BOAT,
                RegionsUnexploredItems.PALM_CHEST_BOAT,
                RegionsUnexploredItems.PINE_BOAT,
                RegionsUnexploredItems.PINE_CHEST_BOAT,
                RegionsUnexploredItems.REDWOOD_BOAT,
                RegionsUnexploredItems.REDWOOD_CHEST_BOAT,
                RegionsUnexploredItems.SCULKWOOD_BOAT,
                RegionsUnexploredItems.SCULKWOOD_CHEST_BOAT,
                RegionsUnexploredItems.WILLOW_BOAT,
                RegionsUnexploredItems.WILLOW_CHEST_BOAT
        );

        event.registerCreativeModeTab(new ResourceLocation(RegionsUnexploredMod.MOD_ID, "main"), builder -> {
            builder.icon(() -> new ItemStack(RegionsUnexploredBlocks.RED_PAINTED_PLANKS.get())).title(Component.translatable("itemGroup.regions_unexplored_main")).displayItems((featureFlags, output) -> {

                output.accept(new ItemStack(RegionsUnexploredBlocks.CHALK.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.CHALK_STAIRS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.CHALK_SLAB.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.POLISHED_CHALK.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.POLISHED_CHALK_STAIRS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.POLISHED_CHALK_SLAB.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.CHALK_BRICKS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.CHALK_BRICK_STAIRS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.CHALK_BRICK_SLAB.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.CHALK_PILLAR.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.PRISMAGLASS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.ALPHA_LOG.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.ALPHA_PLANKS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.ALPHA_STAIRS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.ALPHA_SLAB.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.BAMBOO_LOG.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.STRIPPED_BAMBOO_LOG.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.BAOBAB_LOG.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.BAOBAB_WOOD.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.STRIPPED_BAOBAB_LOG.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.STRIPPED_BAOBAB_WOOD.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.BAOBAB_PLANKS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.BAOBAB_STAIRS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.BAOBAB_SLAB.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.BAOBAB_FENCE.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.BAOBAB_FENCE_GATE.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.BAOBAB_DOOR.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.BAOBAB_TRAPDOOR.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.BAOBAB_SIGN.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.BAOBAB_PRESSURE_PLATE.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.BAOBAB_BUTTON.get()));
                output.accept(new ItemStack(RegionsUnexploredItems.BAOBAB_BOAT.get()));
                output.accept(new ItemStack(RegionsUnexploredItems.BAOBAB_CHEST_BOAT.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.BLACKWOOD_LOG.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.BLACKWOOD_WOOD.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.STRIPPED_BLACKWOOD_LOG.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.STRIPPED_BLACKWOOD_WOOD.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.BLACKWOOD_PLANKS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.BLACKWOOD_STAIRS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.BLACKWOOD_SLAB.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.BLACKWOOD_FENCE.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.BLACKWOOD_FENCE_GATE.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.BLACKWOOD_DOOR.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.BLACKWOOD_TRAPDOOR.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.BLACKWOOD_SIGN.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.BLACKWOOD_PRESSURE_PLATE.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.BLACKWOOD_BUTTON.get()));
                output.accept(new ItemStack(RegionsUnexploredItems.BLACKWOOD_BOAT.get()));
                output.accept(new ItemStack(RegionsUnexploredItems.BLACKWOOD_CHEST_BOAT.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.CHERRY_LOG.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.CHERRY_WOOD.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.STRIPPED_CHERRY_LOG.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.STRIPPED_CHERRY_WOOD.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.CHERRY_PLANKS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.CHERRY_STAIRS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.CHERRY_SLAB.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.CHERRY_FENCE.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.CHERRY_FENCE_GATE.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.CHERRY_DOOR.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.CHERRY_TRAPDOOR.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.CHERRY_SIGN.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.CHERRY_PRESSURE_PLATE.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.CHERRY_BUTTON.get()));
                output.accept(new ItemStack(RegionsUnexploredItems.CHERRY_BOAT.get()));
                output.accept(new ItemStack(RegionsUnexploredItems.CHERRY_CHEST_BOAT.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.CYPRESS_LOG.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.CYPRESS_WOOD.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.STRIPPED_CYPRESS_LOG.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.STRIPPED_CYPRESS_WOOD.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.CYPRESS_PLANKS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.CYPRESS_STAIRS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.CYPRESS_SLAB.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.CYPRESS_FENCE.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.CYPRESS_FENCE_GATE.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.CYPRESS_DOOR.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.CYPRESS_TRAPDOOR.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.CYPRESS_SIGN.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.CYPRESS_PRESSURE_PLATE.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.CYPRESS_BUTTON.get()));
                output.accept(new ItemStack(RegionsUnexploredItems.CYPRESS_BOAT.get()));
                output.accept(new ItemStack(RegionsUnexploredItems.CYPRESS_CHEST_BOAT.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.DEAD_LOG.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.DEAD_WOOD.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.STRIPPED_DEAD_LOG.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.STRIPPED_DEAD_WOOD.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.DEAD_PLANKS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.DEAD_STAIRS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.DEAD_SLAB.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.DEAD_FENCE.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.DEAD_FENCE_GATE.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.DEAD_DOOR.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.DEAD_TRAPDOOR.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.DEAD_SIGN.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.DEAD_PRESSURE_PLATE.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.DEAD_BUTTON.get()));
                output.accept(new ItemStack(RegionsUnexploredItems.DEAD_BOAT.get()));
                output.accept(new ItemStack(RegionsUnexploredItems.DEAD_CHEST_BOAT.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.EUCALYPTUS_LOG.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.EUCALYPTUS_WOOD.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.STRIPPED_EUCALYPTUS_LOG.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.STRIPPED_EUCALYPTUS_WOOD.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.EUCALYPTUS_PLANKS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.EUCALYPTUS_STAIRS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.EUCALYPTUS_SLAB.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.EUCALYPTUS_FENCE.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.EUCALYPTUS_FENCE_GATE.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.EUCALYPTUS_DOOR.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.EUCALYPTUS_TRAPDOOR.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.EUCALYPTUS_SIGN.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.EUCALYPTUS_PRESSURE_PLATE.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.EUCALYPTUS_BUTTON.get()));
                output.accept(new ItemStack(RegionsUnexploredItems.EUCALYPTUS_BOAT.get()));
                output.accept(new ItemStack(RegionsUnexploredItems.EUCALYPTUS_CHEST_BOAT.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.JOSHUA_LOG.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.JOSHUA_WOOD.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.STRIPPED_JOSHUA_LOG.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.STRIPPED_JOSHUA_WOOD.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.JOSHUA_PLANKS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.JOSHUA_STAIRS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.JOSHUA_SLAB.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.JOSHUA_FENCE.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.JOSHUA_FENCE_GATE.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.JOSHUA_DOOR.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.JOSHUA_TRAPDOOR.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.JOSHUA_SIGN.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.JOSHUA_PRESSURE_PLATE.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.JOSHUA_BUTTON.get()));
                output.accept(new ItemStack(RegionsUnexploredItems.JOSHUA_BOAT.get()));
                output.accept(new ItemStack(RegionsUnexploredItems.JOSHUA_CHEST_BOAT.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.LARCH_LOG.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.LARCH_WOOD.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.STRIPPED_LARCH_LOG.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.STRIPPED_LARCH_WOOD.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.LARCH_PLANKS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.LARCH_STAIRS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.LARCH_SLAB.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.LARCH_FENCE.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.LARCH_FENCE_GATE.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.LARCH_DOOR.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.LARCH_TRAPDOOR.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.LARCH_SIGN.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.LARCH_PRESSURE_PLATE.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.LARCH_BUTTON.get()));
                output.accept(new ItemStack(RegionsUnexploredItems.LARCH_BOAT.get()));
                output.accept(new ItemStack(RegionsUnexploredItems.LARCH_CHEST_BOAT.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.MAPLE_LOG.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.MAPLE_WOOD.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.STRIPPED_MAPLE_LOG.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.STRIPPED_MAPLE_WOOD.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.MAPLE_PLANKS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.MAPLE_STAIRS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.MAPLE_SLAB.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.MAPLE_FENCE.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.MAPLE_FENCE_GATE.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.MAPLE_DOOR.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.MAPLE_TRAPDOOR.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.MAPLE_SIGN.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.MAPLE_PRESSURE_PLATE.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.MAPLE_BUTTON.get()));
                output.accept(new ItemStack(RegionsUnexploredItems.MAPLE_BOAT.get()));
                output.accept(new ItemStack(RegionsUnexploredItems.MAPLE_CHEST_BOAT.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.MAUVE_LOG.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.MAUVE_WOOD.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.STRIPPED_MAUVE_LOG.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.STRIPPED_MAUVE_WOOD.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.MAUVE_PLANKS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.MAUVE_STAIRS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.MAUVE_SLAB.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.MAUVE_FENCE.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.MAUVE_FENCE_GATE.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.MAUVE_DOOR.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.MAUVE_TRAPDOOR.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.MAUVE_SIGN.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.MAUVE_PRESSURE_PLATE.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.MAUVE_BUTTON.get()));
                output.accept(new ItemStack(RegionsUnexploredItems.MAUVE_BOAT.get()));
                output.accept(new ItemStack(RegionsUnexploredItems.MAUVE_CHEST_BOAT.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.PALM_LOG.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.PALM_WOOD.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.STRIPPED_PALM_LOG.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.STRIPPED_PALM_WOOD.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.PALM_PLANKS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.PALM_STAIRS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.PALM_SLAB.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.PALM_FENCE.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.PALM_FENCE_GATE.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.PALM_DOOR.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.PALM_TRAPDOOR.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.PALM_SIGN.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.PALM_PRESSURE_PLATE.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.PALM_BUTTON.get()));
                output.accept(new ItemStack(RegionsUnexploredItems.PALM_BOAT.get()));
                output.accept(new ItemStack(RegionsUnexploredItems.PALM_CHEST_BOAT.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.PINE_LOG.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.PINE_WOOD.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.STRIPPED_PINE_LOG.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.STRIPPED_PINE_WOOD.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.PINE_PLANKS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.PINE_STAIRS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.PINE_SLAB.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.PINE_FENCE.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.PINE_FENCE_GATE.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.PINE_DOOR.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.PINE_TRAPDOOR.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.PINE_SIGN.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.PINE_PRESSURE_PLATE.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.PINE_BUTTON.get()));
                output.accept(new ItemStack(RegionsUnexploredItems.PINE_BOAT.get()));
                output.accept(new ItemStack(RegionsUnexploredItems.PINE_CHEST_BOAT.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.REDWOOD_LOG.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.REDWOOD_WOOD.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.STRIPPED_REDWOOD_LOG.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.STRIPPED_REDWOOD_WOOD.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.REDWOOD_PLANKS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.REDWOOD_STAIRS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.REDWOOD_SLAB.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.REDWOOD_FENCE.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.REDWOOD_FENCE_GATE.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.REDWOOD_DOOR.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.REDWOOD_TRAPDOOR.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.REDWOOD_SIGN.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.REDWOOD_PRESSURE_PLATE.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.REDWOOD_BUTTON.get()));
                output.accept(new ItemStack(RegionsUnexploredItems.REDWOOD_BOAT.get()));
                output.accept(new ItemStack(RegionsUnexploredItems.REDWOOD_CHEST_BOAT.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.SCULKWOOD_LOG.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.SCULKWOOD_LOG_DARK.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.SCULKWOOD_LOG_TRANSITION.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.SCULKWOOD_PLANKS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.SCULKWOOD_STAIRS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.SCULKWOOD_SLAB.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.SCULKWOOD_FENCE.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.SCULKWOOD_FENCE_GATE.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.SCULKWOOD_DOOR.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.SCULKWOOD_TRAPDOOR.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.SCULKWOOD_SIGN.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.SCULKWOOD_PRESSURE_PLATE.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.SCULKWOOD_BUTTON.get()));
                output.accept(new ItemStack(RegionsUnexploredItems.SCULKWOOD_BOAT.get()));
                output.accept(new ItemStack(RegionsUnexploredItems.SCULKWOOD_CHEST_BOAT.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.WILLOW_LOG.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.WILLOW_WOOD.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.STRIPPED_WILLOW_LOG.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.STRIPPED_WILLOW_WOOD.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.WILLOW_PLANKS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.WILLOW_STAIRS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.WILLOW_SLAB.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.WILLOW_FENCE.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.WILLOW_FENCE_GATE.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.WILLOW_DOOR.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.WILLOW_TRAPDOOR.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.WILLOW_SIGN.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.WILLOW_PRESSURE_PLATE.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.WILLOW_BUTTON.get()));
                output.accept(new ItemStack(RegionsUnexploredItems.WILLOW_BOAT.get()));
                output.accept(new ItemStack(RegionsUnexploredItems.WILLOW_CHEST_BOAT.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.RED_PAINTED_PLANKS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.RED_PAINTED_STAIRS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.RED_PAINTED_SLAB.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.ORANGE_PAINTED_PLANKS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.ORANGE_PAINTED_STAIRS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.ORANGE_PAINTED_SLAB.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.YELLOW_PAINTED_PLANKS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.YELLOW_PAINTED_STAIRS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.YELLOW_PAINTED_SLAB.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.LIME_PAINTED_PLANKS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.LIME_PAINTED_STAIRS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.LIME_PAINTED_SLAB.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.GREEN_PAINTED_PLANKS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.GREEN_PAINTED_STAIRS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.GREEN_PAINTED_SLAB.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.CYAN_PAINTED_PLANKS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.CYAN_PAINTED_STAIRS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.CYAN_PAINTED_SLAB.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.LIGHT_BLUE_PAINTED_PLANKS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.LIGHT_BLUE_PAINTED_STAIRS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.LIGHT_BLUE_PAINTED_SLAB.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.BLUE_PAINTED_PLANKS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.BLUE_PAINTED_STAIRS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.BLUE_PAINTED_SLAB.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.PURPLE_PAINTED_PLANKS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.PURPLE_PAINTED_STAIRS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.PURPLE_PAINTED_SLAB.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.MAGENTA_PAINTED_PLANKS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.MAGENTA_PAINTED_STAIRS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.MAGENTA_PAINTED_SLAB.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.PINK_PAINTED_PLANKS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.PINK_PAINTED_STAIRS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.PINK_PAINTED_SLAB.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.BROWN_PAINTED_PLANKS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.BROWN_PAINTED_STAIRS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.BROWN_PAINTED_SLAB.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.WHITE_PAINTED_PLANKS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.WHITE_PAINTED_STAIRS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.WHITE_PAINTED_SLAB.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.LIGHT_GRAY_PAINTED_PLANKS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.LIGHT_GRAY_PAINTED_STAIRS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.LIGHT_GRAY_PAINTED_SLAB.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.GRAY_PAINTED_PLANKS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.GRAY_PAINTED_STAIRS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.GRAY_PAINTED_SLAB.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.BLACK_PAINTED_PLANKS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.BLACK_PAINTED_STAIRS.get()));
                output.accept(new ItemStack(RegionsUnexploredBlocks.BLACK_PAINTED_SLAB.get()));

            });
        });


    }

    private void registerNatureTab(CreativeModeTabEvent.Register event) {

        List<RegistryObject<Block>> naturalBlocks = List.of(
                RegionsUnexploredBlocks.FOREST_GRASS_BLOCK,
                RegionsUnexploredBlocks.FOREST_DIRT_PATH,
                RegionsUnexploredBlocks.FOREST_DIRT,
                RegionsUnexploredBlocks.FOREST_COARSE_DIRT,
                RegionsUnexploredBlocks.FOREST_FARMLAND,
                RegionsUnexploredBlocks.FOREST_MUD,
                RegionsUnexploredBlocks.PLAINS_GRASS_BLOCK,
                RegionsUnexploredBlocks.PLAINS_DIRT_PATH,
                RegionsUnexploredBlocks.PLAINS_DIRT,
                RegionsUnexploredBlocks.PLAINS_COARSE_DIRT,
                RegionsUnexploredBlocks.PLAINS_FARMLAND,
                RegionsUnexploredBlocks.PLAINS_MUD,
                RegionsUnexploredBlocks.ALPHA_GRASS_BLOCK,
                RegionsUnexploredBlocks.CHALK_GRASS_BLOCK,
                RegionsUnexploredBlocks.QUICKSAND,
                RegionsUnexploredBlocks.MOSSY_STONE,
                RegionsUnexploredBlocks.CHALK,
                RegionsUnexploredBlocks.ASH,
                RegionsUnexploredBlocks.ASH_VENT,
                RegionsUnexploredBlocks.VOLCANIC_ASH,
                RegionsUnexploredBlocks.RAW_REDSTONE_BLOCK,
                RegionsUnexploredBlocks.PRISMOSS,
                RegionsUnexploredBlocks.DEEPSLATE_PRISMOSS,
                RegionsUnexploredBlocks.VIRIDESCENT_NYLIUM,
                RegionsUnexploredBlocks.DEEPSLATE_VIRIDESCENT_NYLIUM,
                RegionsUnexploredBlocks.STONE_GRASS_BLOCK,
                RegionsUnexploredBlocks.DEEPSLATE_GRASS_BLOCK,
                RegionsUnexploredBlocks.PRISMARITE_CLUSTER,
                RegionsUnexploredBlocks.LARGE_PRISMARITE_CLUSTER,
                RegionsUnexploredBlocks.HANGING_PRISMARITE,
                RegionsUnexploredBlocks.PRISMOSS_SPROUT,
                RegionsUnexploredBlocks.POINTED_REDSTONE,
                RegionsUnexploredBlocks.REDSTONE_BUD,
                RegionsUnexploredBlocks.ACACIA_BRANCH,
                RegionsUnexploredBlocks.BAOBAB_BRANCH,
                RegionsUnexploredBlocks.BIRCH_BRANCH,
                RegionsUnexploredBlocks.BLACKWOOD_BRANCH,
                RegionsUnexploredBlocks.CHERRY_BRANCH,
                RegionsUnexploredBlocks.CYPRESS_BRANCH,
                RegionsUnexploredBlocks.DARK_OAK_BRANCH,
                RegionsUnexploredBlocks.DEAD_BRANCH,
                RegionsUnexploredBlocks.EUCALYPTUS_BRANCH,
                RegionsUnexploredBlocks.JOSHUA_BEARD,
                RegionsUnexploredBlocks.JUNGLE_BRANCH,
                RegionsUnexploredBlocks.LARCH_BRANCH,
                RegionsUnexploredBlocks.MANGROVE_BRANCH,
                RegionsUnexploredBlocks.MAPLE_BRANCH,
                RegionsUnexploredBlocks.MAUVE_BRANCH,
                RegionsUnexploredBlocks.OAK_BRANCH,
                RegionsUnexploredBlocks.PALM_BEARD,
                RegionsUnexploredBlocks.PINE_BRANCH,
                RegionsUnexploredBlocks.REDWOOD_BRANCH,
                RegionsUnexploredBlocks.SPRUCE_BRANCH,
                RegionsUnexploredBlocks.WILLOW_BRANCH,
                RegionsUnexploredBlocks.BAMBOO_LOG,
                RegionsUnexploredBlocks.ALPHA_LOG,
                RegionsUnexploredBlocks.BAOBAB_LOG,
                RegionsUnexploredBlocks.SILVER_BIRCH_LOG_BASE,
                RegionsUnexploredBlocks.BLACKWOOD_LOG,
                RegionsUnexploredBlocks.CHERRY_LOG,
                RegionsUnexploredBlocks.CYPRESS_LOG,
                RegionsUnexploredBlocks.DEAD_LOG,
                RegionsUnexploredBlocks.EUCALYPTUS_LOG,
                RegionsUnexploredBlocks.JOSHUA_LOG,
                RegionsUnexploredBlocks.LARCH_LOG,
                RegionsUnexploredBlocks.MAPLE_LOG,
                RegionsUnexploredBlocks.MAUVE_LOG,
                RegionsUnexploredBlocks.PALM_LOG,
                RegionsUnexploredBlocks.PINE_LOG,
                RegionsUnexploredBlocks.PINE_LOG_TRANSITION,
                RegionsUnexploredBlocks.REDWOOD_LOG,
                RegionsUnexploredBlocks.SCULKWOOD_LOG,
                RegionsUnexploredBlocks.SCULKWOOD_LOG_DARK,
                RegionsUnexploredBlocks.SCULKWOOD_LOG_TRANSITION,
                RegionsUnexploredBlocks.WILLOW_LOG,
                RegionsUnexploredBlocks.ALPHA_LEAVES,
                RegionsUnexploredBlocks.APPLE_OAK_LEAVES,
                RegionsUnexploredBlocks.BAMBOO_LEAVES,
                RegionsUnexploredBlocks.SILVER_BIRCH_LEAVES,
                RegionsUnexploredBlocks.BAOBAB_LEAVES,
                RegionsUnexploredBlocks.BLACKWOOD_LEAVES,
                RegionsUnexploredBlocks.CHERRY_LEAVES,
                RegionsUnexploredBlocks.RED_CHERRY_LEAVES,
                RegionsUnexploredBlocks.PINK_CHERRY_LEAVES,
                RegionsUnexploredBlocks.WHITE_CHERRY_LEAVES,
                RegionsUnexploredBlocks.CYPRESS_LEAVES,
                RegionsUnexploredBlocks.DEAD_LEAVES,
                RegionsUnexploredBlocks.DEAD_PINE_LEAVES,
                RegionsUnexploredBlocks.EUCALYPTUS_LEAVES,
                RegionsUnexploredBlocks.FLOWERING_LEAVES,
                RegionsUnexploredBlocks.JOSHUA_LEAVES,
                RegionsUnexploredBlocks.LARCH_LEAVES,
                RegionsUnexploredBlocks.GOLDEN_LARCH_LEAVES,
                RegionsUnexploredBlocks.MAPLE_LEAVES,
                RegionsUnexploredBlocks.RED_MAPLE_LEAVES,
                RegionsUnexploredBlocks.ORANGE_MAPLE_LEAVES,
                RegionsUnexploredBlocks.MAUVE_LEAVES,
                RegionsUnexploredBlocks.PALM_LEAVES,
                RegionsUnexploredBlocks.PINE_LEAVES,
                RegionsUnexploredBlocks.REDWOOD_LEAVES,
                RegionsUnexploredBlocks.SCULKWOOD_LEAVES,
                RegionsUnexploredBlocks.WILLOW_LEAVES,
                RegionsUnexploredBlocks.BLUE_BIOSHROOM_BLOCK,
                RegionsUnexploredBlocks.GLOWING_BLUE_BIOSHROOM_BLOCK,
                RegionsUnexploredBlocks.GREEN_BIOSHROOM_BLOCK,
                RegionsUnexploredBlocks.GLOWING_GREEN_BIOSHROOM_BLOCK,
                RegionsUnexploredBlocks.PINK_BIOSHROOM_BLOCK,
                RegionsUnexploredBlocks.GLOWING_PINK_BIOSHROOM_BLOCK,
                RegionsUnexploredBlocks.YELLOW_BIOSHROOM_BLOCK,
                RegionsUnexploredBlocks.GLOWING_YELLOW_BIOSHROOM_BLOCK,
                RegionsUnexploredBlocks.ALPHA_SAPLING,
                RegionsUnexploredBlocks.APPLE_OAK_SAPLING,
                RegionsUnexploredBlocks.BAMBOO_SAPLING,
                RegionsUnexploredBlocks.SILVER_BIRCH_SAPLING,
                RegionsUnexploredBlocks.BAOBAB_SAPLING,
                RegionsUnexploredBlocks.BLACKWOOD_SAPLING,
                RegionsUnexploredBlocks.CHERRY_SAPLING,
                RegionsUnexploredBlocks.RED_CHERRY_SAPLING,
                RegionsUnexploredBlocks.PINK_CHERRY_SAPLING,
                RegionsUnexploredBlocks.WHITE_CHERRY_SAPLING,
                RegionsUnexploredBlocks.CYPRESS_SAPLING,
                RegionsUnexploredBlocks.DEAD_SAPLING,
                RegionsUnexploredBlocks.DEAD_PINE_SAPLING,
                RegionsUnexploredBlocks.EUCALYPTUS_SAPLING,
                RegionsUnexploredBlocks.FLOWERING_SAPLING,
                RegionsUnexploredBlocks.JOSHUA_SAPLING,
                RegionsUnexploredBlocks.LARCH_SAPLING,
                RegionsUnexploredBlocks.GOLDEN_LARCH_SAPLING,
                RegionsUnexploredBlocks.MAPLE_SAPLING,
                RegionsUnexploredBlocks.RED_MAPLE_SAPLING,
                RegionsUnexploredBlocks.ORANGE_MAPLE_SAPLING,
                RegionsUnexploredBlocks.MAUVE_SAPLING,
                RegionsUnexploredBlocks.PALM_SAPLING,
                RegionsUnexploredBlocks.PINE_SAPLING,
                RegionsUnexploredBlocks.REDWOOD_SAPLING,
                RegionsUnexploredBlocks.SCULKWOOD_SAPLING,
                RegionsUnexploredBlocks.WILLOW_SAPLING,
                RegionsUnexploredBlocks.BLUE_BIOSHROOM,
                RegionsUnexploredBlocks.TALL_BLUE_BIOSHROOM,
                RegionsUnexploredBlocks.GREEN_BIOSHROOM,
                RegionsUnexploredBlocks.TALL_GREEN_BIOSHROOM,
                RegionsUnexploredBlocks.PINK_BIOSHROOM,
                RegionsUnexploredBlocks.TALL_PINK_BIOSHROOM,
                RegionsUnexploredBlocks.YELLOW_BIOSHROOM,
                RegionsUnexploredBlocks.TALL_YELLOW_BIOSHROOM,
                RegionsUnexploredBlocks.MEDIUM_GRASS,
                RegionsUnexploredBlocks.SEEDED_GRASS,
                RegionsUnexploredBlocks.STEPPE_GRASS,
                RegionsUnexploredBlocks.STEPPE_SHRUB,
                RegionsUnexploredBlocks.STONE_BUD,
                RegionsUnexploredBlocks.SANDY_GRASS,
                RegionsUnexploredBlocks.FROZEN_GRASS,
                RegionsUnexploredBlocks.DEAD_STEPPE_SHRUB,
                RegionsUnexploredBlocks.SMALL_DESERT_SHRUB,
                RegionsUnexploredBlocks.BLUE_LUPINE,
                RegionsUnexploredBlocks.PINK_LUPINE,
                RegionsUnexploredBlocks.PURPLE_LUPINE,
                RegionsUnexploredBlocks.RED_LUPINE,
                RegionsUnexploredBlocks.YELLOW_LUPINE,
                RegionsUnexploredBlocks.HYSSOP,
                RegionsUnexploredBlocks.CAVE_HYSSOP,
                RegionsUnexploredBlocks.FIREWEED,
                RegionsUnexploredBlocks.DAISY,
                RegionsUnexploredBlocks.FELICIA_DAISY,
                RegionsUnexploredBlocks.WARATAH,
                RegionsUnexploredBlocks.WHITE_TRILLIUM,
                RegionsUnexploredBlocks.WILTING_TRILLIUM,
                RegionsUnexploredBlocks.POPPY_BUSH,
                RegionsUnexploredBlocks.ALPHA_ROSE,
                RegionsUnexploredBlocks.ALPHA_DANDELION,
                RegionsUnexploredBlocks.CACTUS_FLOWER,
                RegionsUnexploredBlocks.SAGUARO_CACTUS,
                RegionsUnexploredBlocks.BARREL_CACTUS,
                RegionsUnexploredBlocks.DORCEL,
                RegionsUnexploredBlocks.SPANISH_MOSS,
                RegionsUnexploredBlocks.DUCKWEED,
                RegionsUnexploredBlocks.ELEPHANT_EAR,
                RegionsUnexploredBlocks.SEEDED_TALL_GRASS,
                RegionsUnexploredBlocks.TALL_STEPPE_GRASS,
                RegionsUnexploredBlocks.SANDY_TALL_GRASS,
                RegionsUnexploredBlocks.BARLEY,
                RegionsUnexploredBlocks.CATTAIL,
                RegionsUnexploredBlocks.TASSEL,
                RegionsUnexploredBlocks.TSUBAKI,
                RegionsUnexploredBlocks.TALL_ACACIA_SAPLING,
                RegionsUnexploredBlocks.TALL_BAOBAB_SAPLING,
                RegionsUnexploredBlocks.TALL_BIRCH_SAPLING,
                RegionsUnexploredBlocks.TALL_BLACKWOOD_SAPLING,
                RegionsUnexploredBlocks.TALL_CHERRY_SAPLING,
                RegionsUnexploredBlocks.TALL_RED_CHERRY_SAPLING,
                RegionsUnexploredBlocks.TALL_PINK_CHERRY_SAPLING,
                RegionsUnexploredBlocks.TALL_WHITE_CHERRY_SAPLING,
                RegionsUnexploredBlocks.TALL_CYPRESS_SAPLING,
                RegionsUnexploredBlocks.TALL_DARK_OAK_SAPLING,
                RegionsUnexploredBlocks.TALL_DEAD_SAPLING,
                RegionsUnexploredBlocks.TALL_DEAD_PINE_SAPLING,
                RegionsUnexploredBlocks.TALL_EUCALYPTUS_SAPLING,
                RegionsUnexploredBlocks.TALL_FLOWERING_SAPLING,
                RegionsUnexploredBlocks.TALL_JOSHUA_SAPLING,
                RegionsUnexploredBlocks.TALL_JUNGLE_SAPLING,
                RegionsUnexploredBlocks.TALL_GOLDEN_LARCH_SAPLING,
                RegionsUnexploredBlocks.TALL_LARCH_SAPLING,
                RegionsUnexploredBlocks.TALL_MANGROVE_SAPLING,
                RegionsUnexploredBlocks.TALL_MAPLE_SAPLING,
                RegionsUnexploredBlocks.TALL_ORANGE_MAPLE_SAPLING,
                RegionsUnexploredBlocks.TALL_RED_MAPLE_SAPLING,
                RegionsUnexploredBlocks.TALL_MAUVE_SAPLING,
                RegionsUnexploredBlocks.TALL_OAK_SAPLING,
                RegionsUnexploredBlocks.TALL_PALM_SAPLING,
                RegionsUnexploredBlocks.TALL_PINE_SAPLING,
                RegionsUnexploredBlocks.TALL_REDWOOD_SAPLING,
                RegionsUnexploredBlocks.TALL_SILVER_BIRCH_SAPLING,
                RegionsUnexploredBlocks.TALL_SPRUCE_SAPLING,
                RegionsUnexploredBlocks.TALL_WILLOW_SAPLING
        );
        event.registerCreativeModeTab(new ResourceLocation(RegionsUnexploredMod.MOD_ID, "natural"), builder -> {
            builder.icon(() -> new ItemStack(RegionsUnexploredBlocks.FOREST_GRASS_BLOCK.get())).title(Component.translatable("itemGroup.regions_unexplored_natural")).displayItems((featureFlags, output) -> {

                naturalBlocks.forEach((state) -> {
                    output.accept(new ItemStack(state.get()));
                });

            });
        });


    }

    private void registerNetherTab(CreativeModeTabEvent.Register event) {

        List<RegistryObject<Block>> netherBlocks = List.of(

                RegionsUnexploredBlocks.MARROWSTONE,
                RegionsUnexploredBlocks.COBALT_OBSIDIAN,
                RegionsUnexploredBlocks.BLACKSTONE_CLUSTER,
                RegionsUnexploredBlocks.MYCOTOXIC_NYLIUM,
                RegionsUnexploredBlocks.MYCOTOXIC_GRASS,
                RegionsUnexploredBlocks.MYCOTOXIC_DAISY,
                RegionsUnexploredBlocks.YELLOW_BIOSHROOM,
                RegionsUnexploredBlocks.TALL_YELLOW_BIOSHROOM,
                RegionsUnexploredBlocks.YELLOW_BIOSHROOM_BLOCK,
                RegionsUnexploredBlocks.GLOWING_YELLOW_BIOSHROOM_BLOCK,
                RegionsUnexploredBlocks.RAW_REDSTONE_BLOCK,
                RegionsUnexploredBlocks.POINTED_REDSTONE,
                RegionsUnexploredBlocks.REDSTONE_BUD,
                RegionsUnexploredBlocks.REDSTONE_BULB,
                RegionsUnexploredBlocks.GLISTERING_NYLIUM,
                RegionsUnexploredBlocks.GLISTERING_WART,
                RegionsUnexploredBlocks.GLISTERING_SPROUT,
                RegionsUnexploredBlocks.GLISTER_BULB,
                RegionsUnexploredBlocks.GLISTERING_IVY,
                RegionsUnexploredBlocks.GLISTER_SPIRE,
                RegionsUnexploredBlocks.COBALT_NYLIUM,
                RegionsUnexploredBlocks.COBALT_ROOTS,
                RegionsUnexploredBlocks.COBALT_EARLIGHT,
                RegionsUnexploredBlocks.HANGING_EARLIGHT,
                RegionsUnexploredBlocks.SCULK_GRASS_BLOCK,
                RegionsUnexploredBlocks.SCULKWOOD_LOG,
                RegionsUnexploredBlocks.SCULKWOOD_LOG_DARK,
                RegionsUnexploredBlocks.SCULKWOOD_LOG_TRANSITION,
                RegionsUnexploredBlocks.SCULKWOOD_LEAVES,
                RegionsUnexploredBlocks.SCULKWOOD_SAPLING,
                RegionsUnexploredBlocks.SCULKWOOD_PLANKS,
                RegionsUnexploredBlocks.SCULKWOOD_STAIRS,
                RegionsUnexploredBlocks.SCULKWOOD_SLAB,
                RegionsUnexploredBlocks.SCULKWOOD_FENCE,
                RegionsUnexploredBlocks.SCULKWOOD_FENCE_GATE,
                RegionsUnexploredBlocks.SCULKWOOD_DOOR,
                RegionsUnexploredBlocks.SCULKWOOD_TRAPDOOR,
                RegionsUnexploredBlocks.SCULKWOOD_PRESSURE_PLATE,
                RegionsUnexploredBlocks.SCULKWOOD_BUTTON,
                RegionsUnexploredBlocks.SCULK_SPROUT,
                RegionsUnexploredBlocks.SCULK_TENDRIL
        );

        event.registerCreativeModeTab(new ResourceLocation(RegionsUnexploredMod.MOD_ID, "nether"), builder -> {
            builder.icon(() -> new ItemStack(RegionsUnexploredBlocks.MYCOTOXIC_NYLIUM.get())).title(Component.translatable("itemGroup.regions_unexplored_nether")).displayItems((featureFlags, output) -> {

                netherBlocks.forEach((state) -> {
                    output.accept(new ItemStack(state.get()));
                });

            });
        });


    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        LOGGER.info("HELLO from server starting");
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
