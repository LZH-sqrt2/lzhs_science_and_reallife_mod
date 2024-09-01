package lzh.lzhs_science_and_reallife_mod.Main.Common.registries.Sound;

import net.minecraft.sounds.SoundEvent;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.util.function.Supplier;

public class Helper {
    public static DeferredHolder<SoundEvent,SoundEvent> registerSoundEvent(String name, Supplier<SoundEvent> supplier){
        return LSRSoundEventsRegistry.SOUNDS.register(name, supplier);
    }
}
