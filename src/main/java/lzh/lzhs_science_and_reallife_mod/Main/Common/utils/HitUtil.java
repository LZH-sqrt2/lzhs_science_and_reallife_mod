package lzh.lzhs_science_and_reallife_mod.Main.Common.utils;

import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;

public class HitUtil {
    public static String getBlockRegistryName(Player player) {
        //return Minecraft.getInstance().level.getBlockState(((BlockHitResult) player.pick(5.0, 0, true)).getBlockPos()).getBlock().builtInRegistryHolder().key().location().getPath();
        Level level = Minecraft.getInstance().level;
        return level.getBlockState(getPlayerPOVHitResult(level, player, 128f, true).getBlockPos()).getBlock().builtInRegistryHolder().key().location().getPath();
    }

    public static String getBlockNamespace(Player player) {
        //return Minecraft.getInstance().level.getBlockState(((BlockHitResult) player.pick(5.0, 0, true)).getBlockPos()).getBlock().builtInRegistryHolder().key().location().getNamespace();
        Level level = Minecraft.getInstance().level;
        return level.getBlockState(getPlayerPOVHitResult(level, player, 128f, true).getBlockPos()).getBlock().builtInRegistryHolder().key().location().getNamespace();
    }

    public static String getBlockAllName(Player player) {
        return getBlockNamespace(player) + ":" + getBlockRegistryName(player);
    }

    public static BlockHitResult getPlayerPOVHitResult(Level level, Player player, float hitDistance, boolean hitFluids) {
        Vec3 start = player.getEyePosition();
        Vec3 end = player.getLookAngle().normalize().scale(hitDistance).add(start);
        BlockHitResult blockHitResult = level.clip(new ClipContext(start, end, ClipContext.Block.OUTLINE, hitFluids ? ClipContext.Fluid.ANY : ClipContext.Fluid.NONE, player));
        return blockHitResult;
    }

    public static BlockHitResult getPlayerPOVHitResult(Level level, Player player, float hitDistance, boolean hitFluids, float partialTicks) {
        Vec3 start = player.getEyePosition(partialTicks);
        Vec3 end = player.getLookAngle().normalize().scale(hitDistance).add(start);
        BlockHitResult blockHitResult = level.clip(new ClipContext(start, end, ClipContext.Block.OUTLINE, hitFluids ? ClipContext.Fluid.ANY : ClipContext.Fluid.NONE, player));
        return blockHitResult;
    }

//    public static BlockHitResult getPlayerPOVHitResult(Level level, Player player, ClipContext.Fluid fluid) {
//        float f = player.getXRot();
//        float f1 = player.getYRot();
//        Vec3 vec3 = player.getEyePosition();
//        float f2 = Mth.cos(-f1 * ((float)Math.PI / 180F) - (float)Math.PI);
//        float f3 = Mth.sin(-f1 * ((float)Math.PI / 180F) - (float)Math.PI);
//        float f4 = -Mth.cos(-f * ((float)Math.PI / 180F));
//        float f5 = Mth.sin(-f * ((float)Math.PI / 180F));
//        float f6 = f3 * f4;
//        float f7 = f2 * f4;
//        double d0 = player.getBlockReach();
//        Vec3 vec31 = vec3.add((double)f6 * d0, (double)f5 * d0, (double)f7 * d0);
//        return level.clip(new ClipContext(vec3, vec31, ClipContext.Block.OUTLINE, fluid, player));
//    }
}
