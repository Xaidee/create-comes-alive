package xaidee.cca;

import com.simibubi.create.foundation.data.CreateRegistrate;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import xaidee.cca.groups.ModGroup;
import xaidee.cca.index.CCABlocks;
import xaidee.cca.index.CCAItems;


@Mod(CreateComesAlive.MOD_ID)
public class CreateComesAlive {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "cca";
    public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(MOD_ID);
    private static final String PROTOCOL = "1";

    public CreateComesAlive() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::clientSetup);
        modEventBus.addListener(this::loadComplete);

        MinecraftForge.EVENT_BUS.register(this);

        new ModGroup("main");
        REGISTRATE.registerEventListeners(modEventBus);
        CCAItems.register();
        CCABlocks.register();
    }

    public void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void clientSetup(final FMLClientSetupEvent event) {

    }

    public void loadComplete(final FMLLoadCompleteEvent event) {

    }

    public static ResourceLocation asResource(String path) {
        return new ResourceLocation(MOD_ID, path);
    }
}
