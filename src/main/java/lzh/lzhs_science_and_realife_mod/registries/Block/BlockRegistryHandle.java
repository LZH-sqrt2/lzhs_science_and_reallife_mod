package lzh.lzhs_science_and_realife_mod.registries.Block;

import lzh.lzhs_science_and_realife_mod.LSR_Main;
import lzh.lzhs_science_and_realife_mod.blocks.notBase.Floodlight;
import lzh.lzhs_science_and_realife_mod.blocks.notBase.ReagentCanner;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static lzh.lzhs_science_and_realife_mod.registries.Block.Helper.registerBlock;

public class BlockRegistryHandle {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, LSR_Main.MODID);

    public static final Supplier<Block> blockReagentCanner = BLOCKS.register("reagent_canner", ReagentCanner::new);
//    public static final Supplier<Block> blockFloodlight = BLOCKS.register("floodlight", new Floodlight(BlockBehaviour.Properties.of().lightLevel(litBlockEmission(15)).strength(0.3F).sound(SoundType.GLASS).isValidSpawn(Helper::always)));
//    public static final Supplier<Block> blockFloodlight = registerBlock("floodlight",()->new Floodlight(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP).strength(0.3f).sound(SoundType.GLASS).requiresCorrectToolForDrops().lightLevel(state->state.getValue(Floodlight.LIT)?15:0)));
    public static final Supplier<Block> blockFloodlight = registerBlock("floodlight",()->new Floodlight(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(6f).requiresCorrectToolForDrops().lightLevel(state->state.getValue(Floodlight.LIT)?15:0)));

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
