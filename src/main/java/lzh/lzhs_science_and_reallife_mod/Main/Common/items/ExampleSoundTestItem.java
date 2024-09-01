package lzh.lzhs_science_and_reallife_mod.Main.Common.items;

import lzh.lzhs_science_and_reallife_mod.Main.Common.registries.Sound.LSRSoundEventsRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ExampleSoundTestItem extends Item {
    public ExampleSoundTestItem() {
        super(new Item.Properties().stacksTo(1));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand usedHand) {
        if(level.isClientSide){
            level.playSound(player,player.blockPosition(), LSRSoundEventsRegistry.soundBo_na_pe_te_i_to_s.get(), SoundSource.AMBIENT,10f,1f);
            Minecraft.getInstance().player.sendSystemMessage(Component.translatable("text.lzhs_science_and_reallife_mod.playsound"));
        }
        return super.use(level, player, usedHand);
    }
}
