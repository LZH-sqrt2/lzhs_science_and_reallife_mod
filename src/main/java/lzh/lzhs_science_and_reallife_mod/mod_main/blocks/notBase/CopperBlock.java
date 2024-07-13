package lzh.lzhs_science_and_reallife_mod.mod_main.blocks.notBase;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

public class CopperBlock extends Block {
    public CopperBlock() {
        super(Properties.of().mapColor(MapColor.COLOR_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(10.0f, 10.0f));
    }
}

