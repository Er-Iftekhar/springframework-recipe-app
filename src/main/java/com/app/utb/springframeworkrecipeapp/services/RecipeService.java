package com.app.utb.springframeworkrecipeapp.services;

import com.app.utb.springframeworkrecipeapp.domain.Recipe;

import java.util.Set;
public interface RecipeService {
    Set<Recipe> getRecipes();
}
