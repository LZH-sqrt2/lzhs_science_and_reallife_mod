package lzh.lzhs_science_and_reallife_mod.lib.com.forsteri.unlimitedfluidity.mixin;

import net.minecraft.world.level.block.SpongeBlock;
import lzh.lzhs_science_and_reallife_mod.lib.com.forsteri.unlimitedfluidity.core.Spongability;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

//debug

//@Mixin(SpongeBlock.class)
//public class MixinSponge {
//    @Redirect(method = "removeWaterBreadthFirstSearch", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/material/FluidState;is(Lnet/minecraft/tags/TagKey;)Z"))
//    public boolean removeCustomLiquidSponging(net.minecraft.world.level.material.FluidState fluidState, net.minecraft.tags.TagKey<net.minecraft.world.level.material.Fluid> tagKey) {
//        if (fluidState.getType() instanceof Spongability fluid && fluid.spongable()) {
//            return true;
//        }
//        return fluidState.is(tagKey);
//    }
//}
