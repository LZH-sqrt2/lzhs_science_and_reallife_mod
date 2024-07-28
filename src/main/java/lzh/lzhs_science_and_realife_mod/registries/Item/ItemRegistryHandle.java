package lzh.lzhs_science_and_realife_mod.registries.Item;

import lzh.lzhs_science_and_realife_mod.LSR_Main;
import lzh.lzhs_science_and_realife_mod.items.itemBase.IngotItem;
import lzh.lzhs_science_and_realife_mod.registries.Block.BlockRegistryHandle;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;


public class ItemRegistryHandle {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, LSR_Main.MODID);

    //Items
    public static final Supplier<Item> itemTinIngot = ITEMS.register("tin_ingot", () -> new IngotItem(new Item.Properties()));
    public static final Supplier<Item> itemPlasticSheeting = ITEMS.register("plastic_sheeting", () -> new IngotItem(new Item.Properties()));

    //BlockItems
    public static final Supplier<Item> item_blockReagentCanner = ITEMS.register("reagent_canner", () -> new BlockItem(BlockRegistryHandle.blockReagentCanner.get(), new Item.Properties()));

//    public static final RegistryObject<Item> itemCopperIngot = ITEMS.register("copper_ingot", IngotItem::new);
//    public static final RegistryObject<Item> itemPlasticSheeting = ITEMS.register("plastic_sheeting", IngotItem::new);
//    public static final RegistryObject<Item> itemC4H9Li__tert_Butyl_lithiuM = ITEMS.register("c4_h9_li", IngotItem::new);
//    public static final RegistryObject<Item> itemSbF6__Antimony_pentafluoride = ITEMS.register("sb_f5", IngotItem::new);
//    public static final RegistryObject<Item> itemHandheldElementAnalyzer = ITEMS.register("handheld_element_analyzer", HandheldElementAnalyzer::new);
//    public static final RegistryObject<Item> itemHandheldGasCompositionAnalyzer = ITEMS.register("handheld_gas_composition_analyzer", IngotItem::new);
//    public static final RegistryObject<Item> itemReagentCanner = ITEMS.register("reagent_canner", () -> new BlockItem(BlockRegistryHandle.blockReagentCanner.get(), new Item.Properties()));
//    public static final RegistryObject<Item> itemCopperBlock = ITEMS.register("copper_block", () -> new BlockItem(BlockRegistryHandle.blockCopperBlock.get(), new Item.Properties()));

//    public static RegistryObject<Item> itemLiquidOxygenBucket = ItemRegistryHandle.ITEMS.register("liquid_oxygen_bucket",
//            () -> new BucketItem(FluidRegistryHandle.LiquidOxygen, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
