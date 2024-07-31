package lzh.lzhs_science_and_realife_mod.main.items.notBase;

import lzh.lzhs_science_and_realife_mod.main.registries.Sound.LSRSoundEventRegistry;
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
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        if(pLevel.isClientSide){
            pLevel.playSound(pPlayer,pPlayer.blockPosition(), LSRSoundEventRegistry.soundBo_na_pe_te_i_to_s.get(), SoundSource.AMBIENT,10f,1f);
        }
        return super.use(pLevel, pPlayer, pUsedHand);
    }
}
