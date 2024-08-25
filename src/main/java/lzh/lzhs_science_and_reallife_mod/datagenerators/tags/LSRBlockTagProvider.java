package lzh.lzhs_science_and_reallife_mod.datagenerators.tags;

import lzh.lzhs_science_and_reallife_mod.main.LSR_Main;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class LSRBlockTagProvider extends BlockTagsProvider {
    public LSRBlockTagProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, @Nullable ExistingFileHelper pExistingFileHelper) {
        super(pOutput, pLookupProvider, LSR_Main.MODID, pExistingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
    }
}
