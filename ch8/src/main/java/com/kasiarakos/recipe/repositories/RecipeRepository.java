package com.kasiarakos.recipe.repositories;

import org.springframework.data.repository.CrudRepository;

import com.kasiarakos.recipe.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
