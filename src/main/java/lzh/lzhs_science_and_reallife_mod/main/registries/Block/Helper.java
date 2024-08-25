package lzh.lzhs_science_and_reallife_mod.main.registries.Block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

import static lzh.lzhs_science_and_reallife_mod.main.registries.Block.LSRBlockRegistry.BLOCKS;
import static lzh.lzhs_science_and_reallife_mod.main.registries.Item.LSRItemRegistry.ITEMS;

public class Helper {
    public static Supplier<Block> registerBlock(String name, Supplier<Block> block){
        Supplier<Block> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name,toReturn);
        return toReturn;
    }
    public static void registerBlockItem(String name, Supplier<Block> block){
        registerBlockItem(name, block, new Item.Properties());
    }
    public static void registerBlockItem(String name, Supplier<Block> block, Item.Properties properties){
        ITEMS.register(name, () -> new BlockItem(block.get(), properties));
    }
}
