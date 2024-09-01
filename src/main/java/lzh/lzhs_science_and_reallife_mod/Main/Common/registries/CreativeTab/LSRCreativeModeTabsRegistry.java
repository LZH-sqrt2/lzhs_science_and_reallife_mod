package lzh.lzhs_science_and_reallife_mod.Main.Common.registries.CreativeTab;

import lzh.lzhs_science_and_reallife_mod.LSRMain;
import lzh.lzhs_science_and_reallife_mod.Main.Common.registries.Block.LSRBlocksRegistry;
import lzh.lzhs_science_and_reallife_mod.Main.Common.registries.Item.LSRItemsRegistry;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class LSRCreativeModeTabsRegistry {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LSRMain.MODID);

    public static final String LSR_Materials_TabName = "creative_tab.lzhs_science_and_reallife_mod.lsr_materials";
    public static final Supplier<CreativeModeTab> tabLSR_Materials  = CREATIVE_MODE_TABS.register("lsr_materials_tab",() -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .title(Component.translatable(LSR_Materials_TabName))
            .icon(()-> LSRItemsRegistry.itemTinIngot.get().getDefaultInstance())
            .displayItems((pParameters, pOutput) -> {
                pOutput.accept(Items.IRON_INGOT);
                pOutput.accept(Items.GOLD_INGOT);
                pOutput.accept(Items.COPPER_INGOT);
                pOutput.accept(LSRItemsRegistry.itemTinIngot.get());
                pOutput.accept(LSRItemsRegistry.itemPlasticSheeting.get());
                pOutput.accept(LSRItemsRegistry.itemAnthracite.get());
            })
            .build());

    public static final String LSR_Machines_TabName = "creative_tab.lzhs_science_and_reallife_mod.lsr_machines";
    public static final Supplier<CreativeModeTab> tabLSR_Machines  = CREATIVE_MODE_TABS.register("lsr_machines_tab",() -> CreativeModeTab.builder()
            .title(Component.translatable(LSR_Machines_TabName))
            .icon(()-> LSRBlocksRegistry.blockReagentCanner.get().asItem().getDefaultInstance())
            .displayItems((pParameters, pOutput) -> {
                pOutput.accept(LSRBlocksRegistry.blockReagentCanner.get());
                pOutput.accept(LSRItemsRegistry.itemHandheldElementAnalyzer.get());
            })
            .build());

    public static final String LSR_Lamps_TabName = "creative_tab.lzhs_science_and_reallife_mod.lsr_lamps";
    public static final Supplier<CreativeModeTab> tabLSR_Lamps  = CREATIVE_MODE_TABS.register("lsr_lamps_tab",() -> CreativeModeTab.builder()
            .title(Component.translatable(LSR_Lamps_TabName))
            .icon(()-> LSRBlocksRegistry.blockFloodlight.get().asItem().getDefaultInstance())
            .displayItems((pParameters, pOutput) -> {
                pOutput.accept(LSRBlocksRegistry.blockFloodlight.get());
            })
            .build());

    public static final String LSR_Musics_TabName = "creative_tab.lzhs_science_and_reallife_mod.lsr_musics";
    public static final Supplier<CreativeModeTab> tabLSR_Musics  = CREATIVE_MODE_TABS.register("lsr_musics_tab",() -> CreativeModeTab.builder()
            .title(Component.translatable(LSR_Musics_TabName))
            .icon(()-> LSRItemsRegistry.itemMusicDisc_bo_na_pe_te_i_to_s.get().getDefaultInstance())
            .displayItems((pParameters, pOutput) -> {
                pOutput.accept(LSRItemsRegistry.itemMusicDisc_bo_na_pe_te_i_to_s.get());
            })
            .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}