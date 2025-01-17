package com.almostreliable.kubeio.recipe;

import com.almostreliable.kubeio.util.CommonRecipeKeys;
import com.almostreliable.kubeio.util.RecipeComponents;
import com.enderio.core.common.recipes.CountedIngredient;
import com.enderio.machines.common.recipe.EnchanterRecipe;
import com.enderio.machines.data.recipes.EnchanterRecipeProvider;
import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.NumberComponent;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;
import net.minecraft.world.item.enchantment.Enchantment;

/**
 * See {@link EnchanterRecipe.Serializer} and {@link EnchanterRecipeProvider}.
 */
public interface EnchanterRecipeSchema extends CommonRecipeKeys {

    RecipeKey<Enchantment> ENCHANTMENT = RecipeComponents.ENCHANTMENT.key("enchantment").noBuilders();
    RecipeKey<CountedIngredient> COUNTED_INPUT = RecipeComponents.COUNTED_INGREDIENT.key("input")
        .noBuilders();
    RecipeKey<Integer> COST_MULTIPLIER = NumberComponent.INT.key("cost_multiplier")
        .preferred("costMultiplier")
        .optional(1)
        .alwaysWrite();

    RecipeSchema SCHEMA = new RecipeSchema(
        ENCHANTMENT,
        COUNTED_INPUT,
        COST_MULTIPLIER
    );
}
