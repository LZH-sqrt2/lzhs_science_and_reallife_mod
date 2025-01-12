package lzh.lzhs_science_and_reallife_mod.Main.Common.items.itemBase;

import lzh.lzhs_science_and_reallife_mod.LSRMain;
import lzh.lzhs_science_and_reallife_mod.Main.Common.utils.HitUtil;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ProjectileUtil;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.AbstractCandleBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CampfireBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.Vec3;

import java.util.function.Predicate;

public abstract class AbstractFireExtinguisherItem extends Item {
    private final int maxUseTime;
    private static final Predicate<Entity> ALL_BUT_SPECTATOR = entity -> !entity.isSpectator();
    private static final double INTERACT_DISTANCE = 10;

    public AbstractFireExtinguisherItem(int maxUseTime) {
        super(new Properties().stacksTo(1).durability(maxUseTime));
        this.maxUseTime = maxUseTime;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand usedHand) {
        ItemStack stack = player.getItemInHand(usedHand);
        player.startUsingItem(usedHand);
        if (player.level().isClientSide) {
            fireExtinguishing(player);
            return InteractionResultHolder.consume(stack);
        }
        return InteractionResultHolder.fail(stack);
    }

    protected Entity interactBuffer = null;
    protected int interactCounter = 0;

    protected void interactInit() {
        interactBuffer = null;
        interactCounter = 0;
    }

    @Override
    public void onUseTick(Level level, LivingEntity player, ItemStack stack, int remainingUseDuration) {
        if (stack.isDamageableItem()) {
            stack.setDamageValue(stack.getDamageValue() + 1);
        }

        if (level.isClientSide) {
            shootParticle(player);
        } else {
            ServerPlayer serverPlayer = (ServerPlayer) player;
            Vec3 start = serverPlayer.getEyePosition();
            Vec3 extend = player.getViewVector(1).scale(9.5f);
            Vec3 end = start.add(extend);
            EntityHitResult entityHitResult = ProjectileUtil.getEntityHitResult(player, start, end,
                    player.getBoundingBox().expandTowards(extend).inflate(1.0D),
                    ALL_BUT_SPECTATOR, INTERACT_DISTANCE);
            if (entityHitResult == null) {
                interactInit();
            } else {
                Entity entity = entityHitResult.getEntity();
                // If the same entity with the same ID interacts twice, then there must be another entity interacting between them, so there is no need to count.
                if (interactBuffer == null || interactBuffer.getId() != entity.getId()) {
                    interactBuffer = entity;
                    interactCounter = 1;
                } else {
                    interactCounter++;
                }
                doInteract();
            }
        }
        super.onUseTick(level, player, stack, remainingUseDuration);
    }

    protected void doInteract() {
        if (interactCounter >= 5) {
        }
    }

    protected void fireExtinguishing(LivingEntity player) {
        Level level = player.level();
        shootParticle(player);
        BlockHitResult hitResult = HitUtil.getPlayerPOVHitResult(player.level(), (Player) player, 16f, true);
        BlockPos blockPos = hitResult.getBlockPos();
        BlockState blockState = level.getBlockState(blockPos);
//        if(property != null) {
//            level.setBlock(blockPos, blockState.setValue(property, Util.findNextInIterable(property.getPossibleValues(), blockState.getValue(property))), 1);
//        }
//        if (blockState.equals(FireBlock.getState(level, blockPos))){
////            level.removeBlock(blockPos, false);
//            level.setBlockAndUpdate(blockPos, blockState.setValue(FireBlock.AGE, Integer.valueOf(15)));
//        }
        if (blockState.is(Blocks.FIRE)) {
            level.setBlockAndUpdate(blockPos, Blocks.AIR.defaultBlockState());
        }
        if (blockState.is(BlockTags.FIRE)) {
            level.removeBlock(blockPos, false);
        } else if (blockState.getBlock() instanceof AbstractCandleBlock && AbstractCandleBlock.isLit(blockState)) {
            AbstractCandleBlock.extinguish((Player) player, blockState, level, blockPos);
        } else if (blockState.getBlock() instanceof CampfireBlock && CampfireBlock.isLitCampfire(blockState)) {
            LSRMain.LOGGER.debug("extinguishing campfire");
//            level.setBlockAndUpdate(blockPos, blockState.setValue(CampfireBlock.LIT, false));
//            level.setBlockAndUpdate(blockPos, blockState.setValue(CampfireBlock.LIT, Boolean.valueOf(false)));
            level.setBlock(blockPos, blockState.setValue(CampfireBlock.LIT, Boolean.valueOf(false)), 2);
        }
    }

    @Override
    public int getMaxDamage(ItemStack stack) {
        return maxUseTime;
    }

    public abstract void shootParticle(LivingEntity player);
}
