package lzh.lzhs_science_and_reallife_mod.DataGenerator;

import lzh.lzhs_science_and_reallife_mod.DataGenerator.languages.LSRLanguageProvider;
import lzh.lzhs_science_and_reallife_mod.LSRMain;
import lzh.lzhs_science_and_reallife_mod.DataGenerator.tags.LSRBlockTagProvider;
import lzh.lzhs_science_and_reallife_mod.DataGenerator.tags.LSRItemTagProvider;
import net.minecraft.data.DataGenerator;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@Mod.EventBusSubscriber(modid = LSRMain.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
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
        //LanguageGen
        gen.addProvider(event.includeClient(), new LSRLanguageProvider(output, "en_us"));
    }
}
