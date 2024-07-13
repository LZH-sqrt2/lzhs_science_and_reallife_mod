package lzh.lzhs_science_and_reallife_mod.mod_main.registry.Block;

import lzh.lzhs_science_and_reallife_mod.mod_main.Main;
import lzh.lzhs_science_and_reallife_mod.mod_main.blocks.notBase.CopperBlock;
import lzh.lzhs_science_and_reallife_mod.mod_main.blocks.notBase.ReagentCanner;
import lzh.lzhs_science_and_reallife_mod.mod_main.registry.Fluid.FluidRegistryHandle;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class BlockRegistryHandle {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, Main.MOD_ID);

    public static final RegistryObject<Block> blockReagentCanner = BLOCKS.register("reagent_canner", ReagentCanner::new);
    public static final RegistryObject<Block> blockCopperBlock = BLOCKS.register("copper_block", CopperBlock::new);

    public static RegistryObject<LiquidBlock> liquid_blockLiquidOxygen = BLOCKS.register("liquid_oxygen",
            () -> new LiquidBlock(FluidRegistryHandle.LiquidOxygen, Block.Properties.of().liquid()
                    .noCollission().replaceable().noLootTable().strength(101.0F).sound(SoundType.EMPTY)));
}
