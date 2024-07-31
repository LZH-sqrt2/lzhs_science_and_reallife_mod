package lzh.lzhs_science_and_realife_mod.datagenerators.tags;

import lzh.lzhs_science_and_realife_mod.main.LSR_Main;
import lzh.lzhs_science_and_realife_mod.main.registries.Item.LSRItemRegistry;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;

public class LSRItemTagProvider extends ItemTagsProvider {
    public LSRItemTagProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, CompletableFuture<TagLookup<Block>> pBlockTags, ExistingFileHelper pExistingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, LSR_Main.MODID, pExistingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.MUSIC_DISCS).add(LSRItemRegistry.itemMusicDisc_bo_na_pe_te_i_to_s.get());
    }
}
