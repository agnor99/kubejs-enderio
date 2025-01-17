package com.almostreliable.kubeio.util;

import com.enderio.base.common.init.EIORecipes;
import com.enderio.machines.common.init.MachineRecipes;
import dev.latvian.mods.kubejs.item.InputItem;
import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.ItemComponents;
import dev.latvian.mods.kubejs.recipe.component.NumberComponent;
import net.minecraft.world.item.Item;

/**
 * Commonly used RecipeKeys from {@link EIORecipes} and {@link MachineRecipes}.
 */
public interface CommonRecipeKeys {

    RecipeKey<InputItem> SINGLE_INPUT = ItemComponents.INPUT.key("input").noBuilders();
    RecipeKey<InputItem[]> MULTI_INPUT = ItemComponents.INPUT_ARRAY.key("inputs").noBuilders();
    RecipeKey<Item> ITEM_OUTPUT = RecipeComponents.ITEM.key("output").noBuilders();
    RecipeKey<Integer> ENERGY = NumberComponent.INT.key("energy").optional(2_000).alwaysWrite();
}
