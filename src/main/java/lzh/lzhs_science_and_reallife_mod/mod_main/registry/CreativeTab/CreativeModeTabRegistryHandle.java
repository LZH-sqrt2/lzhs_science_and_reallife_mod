package lzh.lzhs_science_and_reallife_mod.mod_main.registry.CreativeTab;

import lzh.lzhs_science_and_reallife_mod.mod_main.Main;
import lzh.lzhs_science_and_reallife_mod.mod_main.registry.Item.ItemRegistryHandle;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeModeTabRegistryHandle {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Main.MOD_ID);

    public static final RegistryObject<CreativeModeTab> tabLSR_materials= CREATIVE_MODE_TABS.register("lsr_materials", () -> CreativeModeTab
            .builder()
            .icon(() -> ItemRegistryHandle.itemCopperIngot.get().getDefaultInstance())
            .title(Component.translatable("itemGroup.lzhs_science_and_reallife_mod.lsr_materials"))
            .displayItems((parameters, output) -> {
                output.accept(ItemRegistryHandle.itemCopperIngot.get());
                output.accept(ItemRegistryHandle.itemPlasticSheeting.get());
                output.accept(ItemRegistryHandle.itemCopperBlock.get());
            })
            .build());

    public static final RegistryObject<CreativeModeTab> tabLSR_tools= CREATIVE_MODE_TABS.register("lsr_tools", () -> CreativeModeTab
            .builder()
            .icon(() -> ItemRegistryHandle.itemHandheldGasCompositionAnalyzer.get().getDefaultInstance())
            .title(Component.translatable("itemGroup.lzhs_science_and_reallife_mod.lsr_tools"))
            .displayItems((parameters, output) -> {
                output.accept(ItemRegistryHandle.itemHandheldElementAnalyzer.get());
                output.accept(ItemRegistryHandle.itemHandheldGasCompositionAnalyzer.get());
            })
            .build());

    public static final RegistryObject<CreativeModeTab> tabLSR_machines= CREATIVE_MODE_TABS.register("lsr_machines", () -> CreativeModeTab
            .builder()
            .icon(() -> ItemRegistryHandle.itemReagentCanner.get().getDefaultInstance())
            .title(Component.translatable("itemGroup.lzhs_science_and_reallife_mod.lsr_machines"))
            .displayItems((parameters, output) -> {
                output.accept(ItemRegistryHandle.itemReagentCanner.get());
            })
            .build());

    public static final RegistryObject<CreativeModeTab> tabLSR_chemicals= CREATIVE_MODE_TABS.register("lsr_chemicals", () -> CreativeModeTab
            .builder()
            .icon(() -> ItemRegistryHandle.itemC4H9Li__tert_Butyl_lithiuM.get().getDefaultInstance())
            .title(Component.translatable("itemGroup.lzhs_science_and_reallife_mod.lsr_chemicals"))
            .displayItems((parameters, output) -> {
                output.accept(ItemRegistryHandle.itemC4H9Li__tert_Butyl_lithiuM.get());
                output.accept(ItemRegistryHandle.itemSbF6__Antimony_pentafluoride.get());
                output.accept(ItemRegistryHandle.itemLiquidOxygenBucket.get());
            })
            .build());
}
