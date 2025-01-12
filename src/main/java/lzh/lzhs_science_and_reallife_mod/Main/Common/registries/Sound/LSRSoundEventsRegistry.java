package lzh.lzhs_science_and_reallife_mod.Main.Common.registries.Sound;

import lzh.lzhs_science_and_reallife_mod.LSRMain;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static lzh.lzhs_science_and_reallife_mod.Main.Common.registries.Sound.Helper.registerSoundEvent;

public class LSRSoundEventsRegistry {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(Registries.SOUND_EVENT, LSRMain.MODID);

    public static final Supplier<SoundEvent> soundBo_na_pe_te_i_to_s = registerSoundEvent("bo_na_pe_te_i_to_s", () -> SoundEvent.createFixedRangeEvent(new ResourceLocation(LSRMain.MODID, "bo_na_pe_te_i_to_s"), 16));

    public static void register(IEventBus modBus) {
        SOUNDS.register(modBus);
    }
}
