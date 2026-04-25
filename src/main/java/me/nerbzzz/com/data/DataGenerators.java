package me.nerbzzz.com.data;

import me.nerbzzz.com.RolledHomongenous;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

@SuppressWarnings("unused")
@EventBusSubscriber(modid = RolledHomongenous.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        ExistingFileHelper helper = event.getExistingFileHelper();

        BlockTagsProvider blockTags = new BlockTags(output, lookupProvider, helper);

        generator.addProvider(event.includeServer(), blockTags);
        generator.addProvider(event.includeServer(), new LootTableProvider(
                output,
                Set.of(),
                List.of(new LootTableProvider.SubProviderEntry(BlockLootTables::new, LootContextParamSets.BLOCK)),
                event.getLookupProvider()
        ));
        generator.addProvider(event.includeServer(), new BlockRecipes(output, lookupProvider));
    }
}
