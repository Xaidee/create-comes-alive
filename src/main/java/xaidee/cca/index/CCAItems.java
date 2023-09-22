package xaidee.cca.index;

import com.tterrag.registrate.util.entry.ItemEntry;
import forge.net.mca.item.EngagementRingItem;
import forge.net.mca.item.WeddingRingItem;
import xaidee.cca.CreateComesAlive;
import xaidee.cca.groups.ModGroup;

public class CCAItems {
    static { CreateComesAlive.REGISTRATE.creativeModeTab(() -> ModGroup.MAIN);}

    public static final ItemEntry<WeddingRingItem> BRASS_WEDDING_RING =
            CreateComesAlive.REGISTRATE.item("brass_wedding_ring", WeddingRingItem::new)
                    .properties(p -> p.stacksTo(1))
                    .register();
    public static final ItemEntry<EngagementRingItem> BRASS_ENGAGEMENT_RING =
            CreateComesAlive.REGISTRATE.item("brass_engagement_ring", EngagementRingItem::new)
                    .properties(p -> p.stacksTo(1))
                    .register();

    public static void register() {}
}
