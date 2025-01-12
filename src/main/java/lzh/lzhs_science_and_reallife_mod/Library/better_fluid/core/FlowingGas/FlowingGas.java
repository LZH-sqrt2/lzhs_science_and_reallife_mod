package lzh.lzhs_science_and_reallife_mod.Library.better_fluid.core.FlowingGas;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.FluidState;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;

public abstract class FlowingGas extends BaseFlowingFluid {
    public static final int MAX_DENSITY = 100;
    //密度
    public static final IntegerProperty DENSITY = IntegerProperty.create("density", 1, MAX_DENSITY);

    protected FlowingGas(Properties properties) {
        super(properties);
        //源头
        if (this.isSource(this.defaultFluidState())) {
            this.registerDefaultState(this.getStateDefinition().any()
                    .setValue(DENSITY, MAX_DENSITY));
        } else {
            this.registerDefaultState(this.getStateDefinition().any()
                    .setValue(DENSITY, MAX_DENSITY - 1)
                    //Flowing Level
                    .setValue(LEVEL, 7));
        }
    }

    @Override
    public void tick(Level pLevel, BlockPos pPos, FluidState pState) {
        this.spread(pLevel, pPos, pState);
    }

    protected void spreadTo(LevelAccessor pLevel, BlockPos pPos, BlockState pBlockState, Direction pDirection, FluidState pFluidState) {
        if (!pBlockState.isAir()) {
            this.beforeDestroyingBlock(pLevel, pPos, pBlockState);
        }
        pLevel.setBlock(pPos, pFluidState.createLegacyBlock(), 3);
    }
}
