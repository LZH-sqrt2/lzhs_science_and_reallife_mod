package lzh.lzhs_science_and_realife_mod.main.registries.CreativeTab;

import lzh.lzhs_science_and_realife_mod.main.LSR_Main;
import lzh.lzhs_science_and_realife_mod.main.registries.Block.LSRBlockRegistry;
import lzh.lzhs_science_and_realife_mod.main.registries.Item.LSRItemRegistry;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class LSRCreativeModeTabRegistry {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LSR_Main.MODID);

    public static final String LSR_Materials_TabName = "creative_tab.lzhs_science_and_reallife_mod.lsr_materials";
    public static final Supplier<CreativeModeTab> tabLSR_Materials  = CREATIVE_MODE_TABS.register("lsr_materials_tab",() -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .title(Component.translatable(LSR_Materials_TabName))
            .icon(()-> LSRItemRegistry.itemTinIngot.get().getDefaultInstance())
            .displayItems((pParameters, pOutput) -> {
                pOutput.accept(Items.IRON_INGOT);
                pOutput.accept(Items.GOLD_INGOT);
                pOutput.accept(Items.COPPER_INGOT);
                pOutput.accept(LSRItemRegistry.itemTinIngot.get());
                pOutput.accept(LSRItemRegistry.itemPlasticSheeting.get());
            })
            .build());

    public static final String LSR_Machines_TabName = "creative_tab.lzhs_science_and_reallife_mod.lsr_machines";
    public static final Supplier<CreativeModeTab> tabLSR_Machines  = CREATIVE_MODE_TABS.register("lsr_machines_tab",() -> CreativeModeTab.builder()
            .title(Component.translatable(LSR_Machines_TabName))
            .icon(()-> LSRBlockRegistry.blockReagentCanner.get().asItem().getDefaultInstance())
            .displayItems((pParameters, pOutput) -> {
                pOutput.accept(LSRBlockRegistry.blockReagentCanner.get());
            })
            .build());

    public static final String LSR_Lamps_TabName = "creative_tab.lzhs_science_and_reallife_mod.lsr_lamps";
    public static final Supplier<CreativeModeTab> tabLSR_Lamps  = CREATIVE_MODE_TABS.register("lsr_lamps_tab",() -> CreativeModeTab.builder()
            .title(Component.translatable(LSR_Lamps_TabName))
            .icon(()-> LSRBlockRegistry.blockFloodlight.get().asItem().getDefaultInstance())
            .displayItems((pParameters, pOutput) -> {
                pOutput.accept(LSRBlockRegistry.blockFloodlight.get());
            })
            .build());

    public static final String LSR_Musics_TabName = "creative_tab.lzhs_science_and_reallife_mod.lsr_musics";
    public static final Supplier<CreativeModeTab> tabLSR_Musics  = CREATIVE_MODE_TABS.register("lsr_musics_tab",() -> CreativeModeTab.builder()
            .title(Component.translatable(LSR_Musics_TabName))
            .icon(()-> LSRItemRegistry.itemMusicDisc_bo_na_pe_te_i_to_s.get().getDefaultInstance())
            .displayItems((pParameters, pOutput) -> {
                pOutput.accept(LSRItemRegistry.itemMusicDisc_bo_na_pe_te_i_to_s.get());
            })
            .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}