package lzh.lzhs_science_and_reallife_mod.Main.Common.registries.Block;

import lzh.lzhs_science_and_reallife_mod.LSRMain;
import lzh.lzhs_science_and_reallife_mod.Main.Common.blocks.Floodlight;
import lzh.lzhs_science_and_reallife_mod.Main.Common.blocks.ReagentCanner;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static lzh.lzhs_science_and_reallife_mod.Main.Common.registries.Block.Helper.registerBlock;

public class LSRBlocksRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, LSRMain.MODID);

    public static final Supplier<Block> blockReagentCanner = registerBlock("reagent_canner", ReagentCanner::new);
    public static final Supplier<Block> blockFloodlight = registerBlock("floodlight",()->new Floodlight(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(6f).requiresCorrectToolForDrops().lightLevel(state->state.getValue(Floodlight.LIT)?15:0)));

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
