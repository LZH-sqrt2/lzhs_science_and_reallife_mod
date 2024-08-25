package lzh.lzhs_science_and_reallife_mod.main.registries.Sound;

import lzh.lzhs_science_and_reallife_mod.main.LSR_Main;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static lzh.lzhs_science_and_reallife_mod.main.registries.Sound.Helper.registerSoundEvent;

public class LSRSoundEventRegistry {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(Registries.SOUND_EVENT, LSR_Main.MODID);

    public static final Supplier<SoundEvent> soundBo_na_pe_te_i_to_s = registerSoundEvent("bo_na_pe_te_i_to_s", () -> SoundEvent.createFixedRangeEvent(new ResourceLocation(LSR_Main.MODID, "bo_na_pe_te_i_to_s"),16));

    public static void register(IEventBus modBus){
        SOUNDS.register(modBus);
    }
}
