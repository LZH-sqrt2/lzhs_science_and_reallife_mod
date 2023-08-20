package lzh.lzhs_science_and_reallife_mod.lib.com.forsteri.unlimitedfluidity.core.flowingGas;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.FluidState;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public class GasBlock extends LiquidBlock {
    // TODO: Debug GasBlock and change all 8 into FlowingGas.MAX_AMOUNT

    public static final IntegerProperty DENSITY = FlowingGas.DENSITY;

    public GasBlock(Supplier<? extends FlowingFluid> p_54694_, Properties p_54695_) {
        super(p_54694_, p_54695_);
        this.registerDefaultState(this.stateDefinition.any().setValue(DENSITY, 1));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.@NotNull Builder<Block, BlockState> p_54730_) {
        super.createBlockStateDefinition(p_54730_);
        p_54730_.add(DENSITY);
    }

    @Override
    public @NotNull FluidState getFluidState(BlockState pState) {
        int level = pState.getValue(DENSITY);
        return level == FlowingGas.MAX_DENSITY ? getFluid().getSource(false) : getFluid().getFlowing(level, false);
    }
}
