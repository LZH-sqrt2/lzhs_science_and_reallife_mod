package lzh.lzhs_science_and_reallife_mod.DataGenerator.languages;

import lzh.lzhs_science_and_reallife_mod.LSRMain;
import lzh.lzhs_science_and_reallife_mod.Main.Common.registries.Item.LSRItemsRegistry;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class LSRLanguageProvider extends LanguageProvider {
    public LSRLanguageProvider(PackOutput output, String locale) {
        super(output, LSRMain.MODID, locale);
    }

    //en_us
    @Override
    protected void addTranslations() {
        //items
        this.add(LSRItemsRegistry.itemAnthracite.get(), "Anthracite");
        this.add(LSRItemsRegistry.itemTEST.get(), "test");
        this.add(LSRItemsRegistry.itemMusicDisc_bo_na_pe_te_i_to_s.get(), "Music Disc");
        this.add(LSRItemsRegistry.itemTinIngot.get(), "Tin Ingot");
    }
}
