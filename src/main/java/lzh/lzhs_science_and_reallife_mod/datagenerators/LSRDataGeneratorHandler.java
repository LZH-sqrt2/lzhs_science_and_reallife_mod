package lzh.lzhs_science_and_reallife_mod.datagenerators;

import lzh.lzhs_science_and_reallife_mod.main.LSR_Main;
import lzh.lzhs_science_and_reallife_mod.datagenerators.tags.LSRBlockTagProvider;
import lzh.lzhs_science_and_reallife_mod.datagenerators.tags.LSRItemTagProvider;
import net.minecraft.data.DataGenerator;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@Mod.EventBusSubscriber(modid = LSR_Main.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class LSRDataGeneratorHandler {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        ExistingFileHelper EXHelper = event.getExistingFileHelper();
        DataGenerator gen = event.getGenerator();
        var output = gen.getPackOutput();
        var lookup = event.getLookupProvider();
        //BlockTagGen
        BlockTagsProvider LSRBlockTags = new LSRBlockTagProvider(output, lookup, event.getExistingFileHelper());
        gen.addProvider(event.includeServer(), LSRBlockTags);
        //ItemTagGen
        gen.addProvider(event.includeClient(), new LSRItemTagProvider(output, lookup, LSRBlockTags.contentsGetter(), EXHelper));
    }
}
