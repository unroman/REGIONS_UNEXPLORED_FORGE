package net.regions_unexplored.entity.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundAddEntityPacket;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.regions_unexplored.block.RegionsUnexploredBlocks;
import net.regions_unexplored.entity.RegionsUnexploredEntities;
import net.regions_unexplored.item.RegionsUnexploredItems;

import java.util.Arrays;

public class RuBoat extends Boat {
    public RuBoat(EntityType<? extends RuBoat> type, Level level) {
        super(type, level);
        this.blocksBuilding = true;
    }

    public RuBoat(Level level, double x, double y, double z) {
        this((EntityType<RuBoat>) RegionsUnexploredEntities.BOAT.get(), level);
        this.setPos(x, y, z);
        this.xo = x;
        this.yo = y;
        this.zo = z;
    }

    @Override
    public Packet<ClientGamePacketListener> getAddEntityPacket()
    {
        return new ClientboundAddEntityPacket(this);
    }

    @Override
    protected void addAdditionalSaveData(CompoundTag tag)
    {
        tag.putString("model", getModel().getName());
    }

    @Override
    protected void readAdditionalSaveData(CompoundTag tag) {
        if (tag.contains("model", Tag.TAG_STRING)) {
            this.entityData.set(DATA_ID_TYPE, ModelType.byName(tag.getString("model")).ordinal());
        }
    }

    @Override
    protected void checkFallDamage(double y, boolean bool, BlockState state, BlockPos pos) {
        this.lastYd = this.getDeltaMovement().y;
        if (!this.isPassenger())
        {
            if (bool)
            {
                if (this.fallDistance > 3.0F)
                {
                    if (this.status != Boat.Status.ON_LAND)
                    {
                        this.resetFallDistance();
                        return;
                    }

                    this.causeFallDamage(this.fallDistance, 1.0F, DamageSource.FALL);
                    if (!this.level.isClientSide && !this.isRemoved())
                    {
                        this.kill();
                        if (this.level.getGameRules().getBoolean(GameRules.RULE_DOENTITYDROPS))
                        {
                            for (int i = 0; i < 3; ++i)
                            {
                                this.spawnAtLocation(this.getModel().getPlanks());
                            }

                            for (int j = 0; j < 2; ++j)
                            {
                                this.spawnAtLocation(Items.STICK);
                            }
                        }
                    }
                }

                this.resetFallDistance();
            }
            else if (!this.level.getFluidState(this.blockPosition().below()).is(FluidTags.WATER) && y < 0.0D)
            {
                this.fallDistance -= (float)y;
            }
        }
    }

    @Override
    public Item getDropItem() {
        switch (ModelType.byId(this.entityData.get(DATA_ID_TYPE))) {
            case BAOBAB:
                return RegionsUnexploredItems.BAOBAB_BOAT.get();
            case BLACKWOOD:
                return RegionsUnexploredItems.BLACKWOOD_BOAT.get();
            case CHERRY:
                return RegionsUnexploredItems.CHERRY_BOAT.get();
            case CYPRESS:
                return RegionsUnexploredItems.CYPRESS_BOAT.get();
            case DEAD:
                return RegionsUnexploredItems.DEAD_BOAT.get();
            case EUCALYPTUS:
                return RegionsUnexploredItems.EUCALYPTUS_BOAT.get();
            case JOSHUA:
                return RegionsUnexploredItems.JOSHUA_BOAT.get();
            case LARCH:
                return RegionsUnexploredItems.LARCH_BOAT.get();
            case MAPLE:
                return RegionsUnexploredItems.MAPLE_BOAT.get();
            case MAUVE:
                return RegionsUnexploredItems.MAUVE_BOAT.get();
            case PALM:
                return RegionsUnexploredItems.PALM_BOAT.get();
            case PINE:
                return RegionsUnexploredItems.PINE_BOAT.get();
            case REDWOOD:
                return RegionsUnexploredItems.REDWOOD_BOAT.get();
            case SCULKWOOD:
                return RegionsUnexploredItems.SCULKWOOD_BOAT.get();
            case WILLOW:
                return RegionsUnexploredItems.WILLOW_BOAT.get();
        }
        return Items.OAK_BOAT;
    }

    public void setModel(ModelType type)
    {
        this.entityData.set(DATA_ID_TYPE, type.ordinal());
    }

    public ModelType getModel()
    {
        return ModelType.byId(this.entityData.get(DATA_ID_TYPE));
    }

    @Deprecated
    @Override
    public void setVariant(Type vanillaType) {}

    @Deprecated
    @Override
    public Type getVariant()
    {
        return Type.OAK;
    }

    public enum ModelType
    {
        BAOBAB("baobab", RegionsUnexploredBlocks.BAOBAB_PLANKS.get()),
        BLACKWOOD("blackwood", RegionsUnexploredBlocks.BLACKWOOD_PLANKS.get()),
        CHERRY("cherry", RegionsUnexploredBlocks.CHERRY_PLANKS.get()),
        CYPRESS("cypress", RegionsUnexploredBlocks.CYPRESS_PLANKS.get()),
        DEAD("dead", RegionsUnexploredBlocks.DEAD_PLANKS.get()),
        EUCALYPTUS("eucalyptus", RegionsUnexploredBlocks.EUCALYPTUS_PLANKS.get()),
        JOSHUA("joshua", RegionsUnexploredBlocks.JOSHUA_PLANKS.get()),
        LARCH("larch", RegionsUnexploredBlocks.LARCH_PLANKS.get()),
        MAPLE("maple", RegionsUnexploredBlocks.MAPLE_PLANKS.get()),
        MAUVE("mauve", RegionsUnexploredBlocks.MAUVE_PLANKS.get()),
        PALM("palm", RegionsUnexploredBlocks.PALM_PLANKS.get()),
        PINE("pine", RegionsUnexploredBlocks.PINE_PLANKS.get()),
        REDWOOD("redwood", RegionsUnexploredBlocks.REDWOOD_PLANKS.get()),
        SCULKWOOD("sculkwood", RegionsUnexploredBlocks.SCULKWOOD_PLANKS.get()),
        WILLOW("willow", RegionsUnexploredBlocks.WILLOW_PLANKS.get());

        private final String name;
        private final Block planks;

        ModelType(String name, Block planks)
        {
            this.name = name;
            this.planks = planks;
        }

        public String getName()
        {
            return this.name;
        }

        public Block getPlanks()
        {
            return this.planks;
        }

        public String toString() {
            return this.name;
        }

        public static ModelType byId(int id)
        {
            ModelType[] type = values();
            return type[id < 0 || id >= type.length ? 0 : id];
        }

        public static ModelType byName(String aName)
        {
            ModelType[] type = values();
            return Arrays.stream(type).filter(t -> t.getName().equals(aName)).findFirst().orElse(type[0]);
        }
    }
}