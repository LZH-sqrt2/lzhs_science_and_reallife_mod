package lzh.lzhs_science_and_reallife_mod.main;

import com.mojang.logging.LogUtils;
import lzh.lzhs_science_and_reallife_mod.main.registries.Block.LSRBlockRegistry;
import lzh.lzhs_science_and_reallife_mod.main.registries.CreativeTab.LSRCreativeModeTabRegistry;
import lzh.lzhs_science_and_reallife_mod.main.registries.Item.LSRItemRegistry;
import lzh.lzhs_science_and_reallife_mod.main.registries.Sound.LSRSoundEventRegistry;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;

@Mod(LSR_Main.MODID)
public class LSR_Main
{
    public static final String MODID = "lzhs_science_and_reallife_mod";

    public static final Logger LOGGER = LogUtils.getLogger();

    public LSR_Main(IEventBus modEventBus)
    {
        modEventBus.addListener(this::commonSetup);
        LSRBlockRegistry.register(modEventBus);
        LSRCreativeModeTabRegistry.register(modEventBus);
        LSRItemRegistry.register(modEventBus);
        LSRSoundEventRegistry.register(modEventBus);
        NeoForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
        // LOGGER.info("HELLO from server starting");
    }
}
