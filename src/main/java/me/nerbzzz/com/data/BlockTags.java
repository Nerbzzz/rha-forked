package me.nerbzzz.com.data;

import me.nerbzzz.com.RolledHomongenous;
import me.nerbzzz.com.common.index.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class BlockTags extends BlockTagsProvider {
    public BlockTags(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, RolledHomongenous.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        this.registerMineable();
    }

    protected void registerMineable() {
        var mineableWithPickaxe = tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE);
        var shovel = tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_SHOVEL);
        var needsIronTool = tag(net.minecraft.tags.BlockTags.NEEDS_IRON_TOOL);

        shovel.add(
            ModBlocks.SANDBAGGREEN.get(),
            ModBlocks.SANDBAGTAN.get()
        );

        ModBlocks.BLOCKS.getEntries().forEach(entry -> {
            var block = entry.get();
            if (block != ModBlocks.SANDBAGGREEN.get() && block != ModBlocks.SANDBAGTAN.get()) {
                mineableWithPickaxe.add(block);
                needsIronTool.add(block);
            }
        });
    }
}
