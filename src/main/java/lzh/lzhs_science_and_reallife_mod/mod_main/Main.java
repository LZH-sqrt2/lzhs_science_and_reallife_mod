package lzh.lzhs_science_and_reallife_mod.mod_main;

import lzh.lzhs_science_and_reallife_mod.mod_main.registry.Block.BlockRegistryHandle;
import lzh.lzhs_science_and_reallife_mod.mod_main.registry.CreativeTab.CreativeModeTabRegistryHandle;
import lzh.lzhs_science_and_reallife_mod.mod_main.registry.Fluid.FluidRegistryHandle;
import lzh.lzhs_science_and_reallife_mod.mod_main.registry.Item.ItemRegistryHandle;
import lzh.lzhs_science_and_reallife_mod.mod_main.registry.Villager.VillageRegistryHandle;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Main.MOD_ID)
@Mod.EventBusSubscriber(modid = Main.MOD_ID)
public class Main
{
    public static final String MOD_ID = "lzhs_science_and_reallife_mod";
    public Main(){
        IEventBus ModEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        FluidRegistryHandle.FLUIDS.register(ModEventBus);
        FluidRegistryHandle.FLUID_TYPE.register(ModEventBus);
        ItemRegistryHandle.ITEMS.register(ModEventBus);
        BlockRegistryHandle.BLOCKS.register(ModEventBus);
        VillageRegistryHandle.POI_TYPES.register(ModEventBus);
        VillageRegistryHandle.VILLAGER_PROFESSIONS.register(ModEventBus);
        CreativeModeTabRegistryHandle.CREATIVE_MODE_TABS.register(ModEventBus);
        MinecraftForge.EVENT_BUS.register(this);
    }
}
