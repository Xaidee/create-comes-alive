package xaidee.cca.groups;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import xaidee.cca.CreateComesAlive;
import xaidee.cca.index.CCAItems;

public class ModGroup extends CreativeModeTab {
    public static ModGroup MAIN;

    public ModGroup(String name) {
        super(CreateComesAlive.MOD_ID+":"+name);
        MAIN = this;
    }

    @Override
    public @NotNull ItemStack makeIcon() {
        return new ItemStack(CCAItems.BRASS_ENGAGEMENT_RING.get());
    }
}
