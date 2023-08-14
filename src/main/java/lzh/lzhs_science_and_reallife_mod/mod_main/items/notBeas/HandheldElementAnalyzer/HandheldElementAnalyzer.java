package lzh.lzhs_science_and_reallife_mod.mod_main.items.notBeas.HandheldElementAnalyzer;

import lzh.lzhs_science_and_reallife_mod.mod_main.util.ways.getBlockRegistryName;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.ComponentContents;
import net.minecraft.network.chat.Style;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.FormattedCharSequence;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.List;

public class HandheldElementAnalyzer extends Item {
    public HandheldElementAnalyzer() {
        super(new Properties().stacksTo(1).fireResistant());
    }

    public static String onLooked = "";

    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand, ServerLevel serverLevel) {
        if (getBlockRegistryName.getBlockRegistryName(serverLevel, player) != null) {
            onLooked = getBlockRegistryName.getBlockRegistryName(serverLevel, player);

        }
        return super.use(level, player, hand);
    }


}