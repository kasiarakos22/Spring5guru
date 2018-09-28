package com.kasiarakos.recipe.services;

import java.util.Set;

import com.kasiarakos.recipe.domain.Recipe;


public interface RecipeService {

    Set<Recipe> getRecipes();
}
