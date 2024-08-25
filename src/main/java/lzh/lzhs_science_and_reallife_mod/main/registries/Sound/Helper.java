package lzh.lzhs_science_and_reallife_mod.main.registries.Sound;

import net.minecraft.sounds.SoundEvent;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.util.function.Supplier;

public class Helper {
    public static DeferredHolder<SoundEvent,SoundEvent> registerSoundEvent(String name, Supplier<SoundEvent> supplier){
        return LSRSoundEventRegistry.SOUNDS.register(name, supplier);
    }
}
