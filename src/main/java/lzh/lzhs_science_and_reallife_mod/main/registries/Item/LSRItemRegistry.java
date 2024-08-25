package lzh.lzhs_science_and_reallife_mod.main.registries.Item;

import lzh.lzhs_science_and_reallife_mod.main.LSR_Main;
import lzh.lzhs_science_and_reallife_mod.main.items.itemBase.IngotItem;
import lzh.lzhs_science_and_reallife_mod.main.items.notBase.ExampleSoundTestItem;
import lzh.lzhs_science_and_reallife_mod.main.registries.Sound.LSRSoundEventRegistry;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.RecordItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;


public class LSRItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, LSR_Main.MODID);

    //Items
    public static final Supplier<Item> itemTinIngot = ITEMS.register("tin_ingot", () -> new IngotItem(new Item.Properties()));
    public static final Supplier<Item> itemPlasticSheeting = ITEMS.register("plastic_sheeting", () -> new IngotItem(new Item.Properties()));
    public static final Supplier<Item> itemMusicDisc_bo_na_pe_te_i_to_s = ITEMS.register("music_disc_bo_na_pe_te_i_to_s", () -> new RecordItem(15, LSRSoundEventRegistry.soundBo_na_pe_te_i_to_s, new Item.Properties().stacksTo(1), 360));
    public static final Supplier<Item> itemTEST =ITEMS.register("test", ExampleSoundTestItem::new);

    //BlockItems
//    public static final Supplier<Item> item_blockReagentCanner = ITEMS.register("reagent_canner", () -> new BlockItem(LSRBlockRegistry.blockReagentCanner.get(), new Item.Properties()));

//    public static final RegistryObject<Item> itemCopperIngot = ITEMS.register("copper_ingot", IngotItem::new);
//    public static final RegistryObject<Item> itemPlasticSheeting = ITEMS.register("plastic_sheeting", IngotItem::new);
//    public static final RegistryObject<Item> itemC4H9Li__tert_Butyl_lithiuM = ITEMS.register("c4_h9_li", IngotItem::new);
//    public static final RegistryObject<Item> itemSbF6__Antimony_pentafluoride = ITEMS.register("sb_f5", IngotItem::new);
//    public static final RegistryObject<Item> itemHandheldElementAnalyzer = ITEMS.register("handheld_element_analyzer", HandheldElementAnalyzer::new);
//    public static final RegistryObject<Item> itemHandheldGasCompositionAnalyzer = ITEMS.register("handheld_gas_composition_analyzer", IngotItem::new);
//    public static final RegistryObject<Item> itemReagentCanner = ITEMS.register("reagent_canner", () -> new BlockItem(LSRBlockRegistry.blockReagentCanner.get(), new Item.Properties()));
//    public static final RegistryObject<Item> itemCopperBlock = ITEMS.register("copper_block", () -> new BlockItem(LSRBlockRegistry.blockCopperBlock.get(), new Item.Properties()));

//    public static RegistryObject<Item> itemLiquidOxygenBucket = LSRItemRegistry.ITEMS.register("liquid_oxygen_bucket",
//            () -> new BucketItem(FluidRegistryHandle.LiquidOxygen, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
