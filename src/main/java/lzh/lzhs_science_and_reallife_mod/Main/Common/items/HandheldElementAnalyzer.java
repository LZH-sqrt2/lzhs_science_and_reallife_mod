package lzh.lzhs_science_and_reallife_mod.Main.Common.items;

import lzh.lzhs_science_and_reallife_mod.Main.Common.utility.Ways;
import net.minecraft.client.Minecraft;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class HandheldElementAnalyzer extends Item {
    public HandheldElementAnalyzer() {
        super(new Properties().stacksTo(1).fireResistant());
    }

    @Override
    public void inventoryTick(ItemStack itemStack, Level level, Entity entity, int i, boolean b) {
        if (!itemStack.hasTag()) {
            itemStack.setTag(new CompoundTag());
        }
        if (itemStack.getTag().isEmpty()) {
            itemStack.getTag().putString("Namespace", "none");
            itemStack.getTag().putString("RegistryName", "none");
        }
        super.inventoryTick(itemStack, level, entity, i, b);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        String onLookedNamespace = null;
        String onLookedRegistryName = null;
        if (Ways.getBlockAllName(player) != null) {
            onLookedNamespace = Ways.getBlockNamespace(player);
            onLookedRegistryName = Ways.getBlockRegistryName(player);
        }
        CompoundTag tag = player.getItemInHand(hand).getTag();
        tag.putString("Namespace", onLookedNamespace);
        tag.putString("RegistryName", onLookedRegistryName);
        Minecraft.getInstance().player.sendSystemMessage(Component.translatable(Component.translatable("block.").getString() + onLookedNamespace + "." +onLookedRegistryName));
        return super.use(level, player, hand);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> componentList, TooltipFlag flagIn) {
        CompoundTag nbtTag = itemStack.getTag();
        if (nbtTag != null && level != null) {
            if (!nbtTag.getString("Namespace").equals("none") && !nbtTag.getString("RegistryName").equals("none")) {
                componentList.add(Component.translatable(Component.translatable("block.").getString() + nbtTag.getString("Namespace") + "." + nbtTag.getString("RegistryName")));
            } else {
                componentList.add(Component.translatable("text.lzhs_science_and_reallife_mod.empty_in"));
            }
        }
        super.appendHoverText(itemStack, level, componentList, flagIn);
    }
}