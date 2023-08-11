package lzh.lzhs_science_and_reallife_mod.mod_main.registry.Villager;

import com.google.common.collect.ImmutableSet;
import lzh.lzhs_science_and_reallife_mod.mod_main.Main;
import lzh.lzhs_science_and_reallife_mod.mod_main.registry.Block.BlockRegistryHandle;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class VillageRegistryHandle {
    public static final DeferredRegister<PoiType> POI_TYPES = DeferredRegister.create(ForgeRegistries.POI_TYPES, Main.MOD_ID);

    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS = DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, Main.MOD_ID);

    public static final RegistryObject<PoiType> poitypeReagentCanner = POI_TYPES.register("reagent_canner_poi",
            () -> new PoiType(ImmutableSet.copyOf(BlockRegistryHandle.blockReagentCanner.get().getStateDefinition().getPossibleStates()), 1, 1));

    public static final RegistryObject<VillagerProfession> villagerprofessionReagentMerchant = VILLAGER_PROFESSIONS.register("reagent_merchant",
            () -> new VillagerProfession("reagent_merchant", x -> x.get() == poitypeReagentCanner.get(), x -> x.get() == poitypeReagentCanner.get(), ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_ARMORER));
}
