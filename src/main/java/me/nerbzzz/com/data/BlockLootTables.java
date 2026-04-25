package me.nerbzzz.com.data;

import me.nerbzzz.com.common.index.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.Set;
import java.util.stream.Collectors;

public class BlockLootTables extends BlockLootSubProvider {
    public BlockLootTables(HolderLookup.Provider lookupProvider) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), lookupProvider);
    }

    @Override
    protected void generate() {
        ModBlocks.BLOCKS.getEntries().forEach(entry -> this.dropSelf(entry.get()));
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(entry -> (Block) entry.get()).collect(Collectors.toList());
    }
}
