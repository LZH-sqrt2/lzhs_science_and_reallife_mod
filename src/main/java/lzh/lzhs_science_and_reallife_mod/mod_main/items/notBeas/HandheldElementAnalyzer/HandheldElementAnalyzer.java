package lzh.lzhs_science_and_reallife_mod.mod_main.items.notBeas.HandheldElementAnalyzer;

import lzh.lzhs_science_and_reallife_mod.mod_main.util.ways.getBlockRegistryName;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class HandheldElementAnalyzer extends Item {
    public HandheldElementAnalyzer() {
        super(new Properties().stacksTo(1).fireResistant());
    }

    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand, ServerLevel serverLevel) {
        if (getBlockRegistryName.getBlockRegistryName(serverLevel, player) != null) {
            String onLooked = getBlockRegistryName.getBlockRegistryName(serverLevel, player);
        }
        return super.use(level, player, hand);
    }


}