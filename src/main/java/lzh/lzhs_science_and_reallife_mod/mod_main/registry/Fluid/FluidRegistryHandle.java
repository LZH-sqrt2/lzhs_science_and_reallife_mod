package lzh.lzhs_science_and_reallife_mod.mod_main.registry.Fluid;

import lzh.lzhs_science_and_reallife_mod.mod_main.Main;
import lzh.lzhs_science_and_reallife_mod.mod_main.registry.Block.BlockRegistryHandle;
import lzh.lzhs_science_and_reallife_mod.mod_main.registry.Item.ItemRegistryHandle;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.client.extensions.common.IClientFluidTypeExtensions;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Consumer;

public class FluidRegistryHandle {
    static final ResourceLocation liquid_oxygen = new ResourceLocation(Main.MOD_ID, "block/fluid/liquid_oxygen");

    static final ResourceLocation liquid_oxygen_flowing = new ResourceLocation(Main.MOD_ID, "block/fluid/liquid_oxygen_flowing");

    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, Main.MOD_ID);

    public static final DeferredRegister<FluidType> FLUID_TYPE = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, Main.MOD_ID);

    public static RegistryObject<FluidType> liquid_oxygenType = FLUID_TYPE.register(
            "liquid_oxygen",
            () -> new FluidType(FluidType.Properties.create()
                    .density(1141)
                    .temperature(-201)
                    .viscosity(0)
                    .canDrown(true)
                    .canSwim(true)
                    .descriptionId("fluid.lzhs_science_and_reallife_mod.liquid_oxygen")) {
                @Override
                public void initializeClient(Consumer<IClientFluidTypeExtensions> iClientFluidTypeExtensionsConsumer) {
                    iClientFluidTypeExtensionsConsumer.accept(new IClientFluidTypeExtensions() {
                        @Override
                        public ResourceLocation getStillTexture() {
                            return liquid_oxygen;
                        }

                        @Override
                        public ResourceLocation getFlowingTexture() {
                            return liquid_oxygen_flowing;
                        }
                    });
                }
            });

    public static RegistryObject<FlowingFluid> LiquidOxygen =
            FLUIDS.register("liquid_oxygen",()->new ForgeFlowingFluid.Source(liquid_oxygenBuilder()));
    public static RegistryObject<FlowingFluid> LiquidOxygenFlowing =
            FLUIDS.register("liquid_oxygen_flowing",()->new ForgeFlowingFluid.Flowing(liquid_oxygenBuilder()));

    private static ForgeFlowingFluid.Properties  liquid_oxygenBuilder() {
        return new ForgeFlowingFluid.Properties(liquid_oxygenType,LiquidOxygen,LiquidOxygenFlowing)
                .block(BlockRegistryHandle.liquid_blockLiquidOxygen).bucket(ItemRegistryHandle.itemLiquidOxygenBucket);
    }
}
