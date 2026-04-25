package me.nerbzzz.com.data;

import me.nerbzzz.com.common.index.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class BlockRecipes extends RecipeProvider {
    public BlockRecipes(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput output) {
        ModBlocks.BLOCKS.getEntries().forEach(entry -> {
            String blockName = entry.getId().getPath();

            stonecutterRecipe(output, RecipeCategory.BUILDING_BLOCKS,
                    Items.IRON_BLOCK, entry.get(), 4, blockName + "_from_stonecutting_iron_block");
        });
    }

    protected static void stonecutterRecipe(RecipeOutput output, RecipeCategory category, net.minecraft.world.level.ItemLike input, net.minecraft.world.level.ItemLike result, int count, String saveName) {
        net.minecraft.data.recipes.SingleItemRecipeBuilder.stonecutting(
                        net.minecraft.world.item.crafting.Ingredient.of(input), category, result, count)
                .unlockedBy(getHasName(input), has(input))
                .save(output, saveName);
    }
}
