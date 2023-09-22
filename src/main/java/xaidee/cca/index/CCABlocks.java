package xaidee.cca.index;

import com.simibubi.create.foundation.data.SharedProperties;
import com.tterrag.registrate.util.entry.BlockEntry;
import forge.net.mca.block.TombstoneBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.phys.Vec3;
import xaidee.cca.CreateComesAlive;
import xaidee.cca.groups.ModGroup;

import static com.simibubi.create.foundation.data.ModelGen.customItemModel;

public class CCABlocks {

    static { CreateComesAlive.REGISTRATE.creativeModeTab(() -> ModGroup.MAIN); }

    public static final BlockEntry<TombstoneBlock> ANDESITE_UPRIGHT_HEADSTONE = CreateComesAlive.REGISTRATE.block("andesite_upright_headstone", p -> new TombstoneBlock(p, 70, 30, new Vec3(0, -30, -8),0.0f, true, TombstoneBlock.UPRIGHT_SHAPE))
            .initialProperties(SharedProperties::stone)
            .properties(BlockBehaviour.Properties::noOcclusion)
            .item()
            .transform(customItemModel())
            .register();
    public static final BlockEntry<TombstoneBlock> ANDESITE_SLANTED_HEADSTONE = CreateComesAlive.REGISTRATE.block("andesite_slanted_headstone", p -> new TombstoneBlock(p, 90, 15, new Vec3(0, -12, 22), -72.5f,true, TombstoneBlock.SLANTED_SHAPE))
            .initialProperties(SharedProperties::stone)
            .properties(BlockBehaviour.Properties::noOcclusion)
            .item()
            .transform(customItemModel())
            .register();

    public static void register() {

    }
}
