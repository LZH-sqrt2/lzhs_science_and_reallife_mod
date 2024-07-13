package lzh.lzhs_science_and_reallife_mod.mod_main.util.ways;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class getElementContent {
    public void getLookedBlockElementContent(Level level, Player player, ServerLevel serverLevel) {
        if (getBlockRegistryName.getBlockRegistryName(serverLevel, player) != null) {
            String onLookedBlockRegistryName = getBlockRegistryName.getBlockRegistryName(serverLevel, player);
        }
    }
}
