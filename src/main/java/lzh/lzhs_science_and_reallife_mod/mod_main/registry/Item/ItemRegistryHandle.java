package lzh.lzhs_science_and_reallife_mod.mod_main.registry.Item;

import lzh.lzhs_science_and_reallife_mod.mod_main.Main;
import lzh.lzhs_science_and_reallife_mod.mod_main.items.itemBase.IngotItem;
import lzh.lzhs_science_and_reallife_mod.mod_main.items.notBeas.HandheldElementAnalyzer.HandheldElementAnalyzer;
import lzh.lzhs_science_and_reallife_mod.mod_main.registry.Block.BlockRegistryHandle;
import lzh.lzhs_science_and_reallife_mod.mod_main.registry.Fluid.FluidRegistryHandle;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistryHandle {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, Main.MOD_ID);

    public static final RegistryObject<Item> itemCopperIngot = ITEMS.register("copper_ingot", IngotItem::new);
    public static final RegistryObject<Item> itemPlasticSheeting = ITEMS.register("plastic_sheeting", IngotItem::new);
    public static final RegistryObject<Item> itemC4H9Li__tert_Butyl_lithiuM = ITEMS.register("c4_h9_li", IngotItem::new);
    public static final RegistryObject<Item> itemSbF6__Antimony_pentafluoride = ITEMS.register("sb_f5", IngotItem::new);
    public static final RegistryObject<Item> itemHandheldElementAnalyzer = ITEMS.register("handheld_element_analyzer", HandheldElementAnalyzer::new);
    public static final RegistryObject<Item> itemHandheldGasCompositionAnalyzer = ITEMS.register("handheld_gas_composition_analyzer", IngotItem::new);
    public static final RegistryObject<Item> itemReagentCanner = ITEMS.register("reagent_canner", () -> new BlockItem(BlockRegistryHandle.blockReagentCanner.get(), new Item.Properties()));

    public static RegistryObject<Item> itemLiquidOxygenBucket = ItemRegistryHandle.ITEMS.register("liquid_oxygen_bucket",
            () -> new BucketItem(FluidRegistryHandle.LiquidOxygen, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
}
