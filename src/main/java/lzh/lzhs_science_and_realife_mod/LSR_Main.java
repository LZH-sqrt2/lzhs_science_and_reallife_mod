package lzh.lzhs_science_and_realife_mod;

import com.mojang.logging.LogUtils;
import lzh.lzhs_science_and_realife_mod.registries.Block.BlockRegistryHandle;
import lzh.lzhs_science_and_realife_mod.registries.CreativeTab.CreativeModeTabRegistryHandle;
import lzh.lzhs_science_and_realife_mod.registries.Item.ItemRegistryHandle;
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
        BlockRegistryHandle.register(modEventBus);
        CreativeModeTabRegistryHandle.register(modEventBus);
        ItemRegistryHandle.register(modEventBus);
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
