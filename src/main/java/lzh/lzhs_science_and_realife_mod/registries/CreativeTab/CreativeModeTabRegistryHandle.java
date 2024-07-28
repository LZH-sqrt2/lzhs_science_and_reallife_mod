package lzh.lzhs_science_and_realife_mod.registries.CreativeTab;

import lzh.lzhs_science_and_realife_mod.LSR_Main;
import lzh.lzhs_science_and_realife_mod.registries.Block.BlockRegistryHandle;
import lzh.lzhs_science_and_realife_mod.registries.Item.ItemRegistryHandle;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class CreativeModeTabRegistryHandle {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LSR_Main.MODID);

    public static final String LSR_Materials_TabName = "creative_tab.lzhs_science_and_reallife_mod.lsr_materials";
    public static final Supplier<CreativeModeTab> tabLSR_Materials  = CREATIVE_MODE_TABS.register("lsr_materials_tab",() -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .title(Component.translatable(LSR_Materials_TabName))
            .icon(()-> ItemRegistryHandle.itemTinIngot.get().getDefaultInstance())
            .displayItems((pParameters, pOutput) -> {
                pOutput.accept(Items.IRON_INGOT);
                pOutput.accept(Items.GOLD_INGOT);
                pOutput.accept(Items.COPPER_INGOT);
                pOutput.accept(ItemRegistryHandle.itemTinIngot.get());
                pOutput.accept(ItemRegistryHandle.itemPlasticSheeting.get());
            })
            .build());

    public static final String LSR_Machines_TabName = "creative_tab.lzhs_science_and_reallife_mod.lsr_machines";
    public static final Supplier<CreativeModeTab> tabLSR_Machines  = CREATIVE_MODE_TABS.register("lsr_machines_tab",() -> CreativeModeTab.builder()
            .title(Component.translatable(LSR_Machines_TabName))
            .icon(()-> BlockRegistryHandle.blockReagentCanner.get().asItem().getDefaultInstance())
            .displayItems((pParameters, pOutput) -> {
                pOutput.accept(BlockRegistryHandle.blockReagentCanner.get());
            })
            .build());

//    public static final String LSR_Lamps_TabName = "creative_tab.lzhs_science_and_reallife_mod.lsr_lamps";
//    public static final Supplier<CreativeModeTab> tabLSR_Lamps  = CREATIVE_MODE_TABS.register("lsr_lamps_tab",() -> CreativeModeTab.builder()
//            .title(Component.translatable(LSR_Lamps_TabName))
//            .icon(()-> BlockRegistryHandle.blockFloodlight.get().asItem().getDefaultInstance())
//            .displayItems((pParameters, pOutput) -> {
//                pOutput.accept(BlockRegistryHandle.blockFloodlight.get());
//            })
//            .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}