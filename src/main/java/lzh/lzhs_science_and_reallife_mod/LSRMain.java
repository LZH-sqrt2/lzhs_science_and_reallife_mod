package lzh.lzhs_science_and_reallife_mod;

import com.mojang.logging.LogUtils;
import lzh.lzhs_science_and_reallife_mod.Main.Common.registries.Block.LSRBlocksRegistry;
import lzh.lzhs_science_and_reallife_mod.Main.Common.registries.CreativeModeTab.LSRCreativeModeTabsRegistry;
import lzh.lzhs_science_and_reallife_mod.Main.Common.registries.Item.LSRItemsRegistry;
import lzh.lzhs_science_and_reallife_mod.Main.Common.registries.Sound.LSRSoundEventsRegistry;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;

@Mod(LSRMain.MODID)
public class LSRMain {
    public static final String MODID = "lzhs_science_and_reallife_mod";
    public static final String MODVERSION = "0.0.2a";

    public static final Logger LOGGER = LogUtils.getLogger();

    public LSRMain(IEventBus modEventBus) {
        modEventBus.addListener(this::commonSetup);
        LSRBlocksRegistry.register(modEventBus);
        LSRCreativeModeTabsRegistry.register(modEventBus);
        LSRItemsRegistry.register(modEventBus);
        LSRSoundEventsRegistry.register(modEventBus);
        NeoForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }
}
