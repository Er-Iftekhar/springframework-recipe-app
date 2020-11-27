package com.app.utb.springframeworkrecipeapp.services;

import com.app.utb.springframeworkrecipeapp.domain.Recipe;
import com.app.utb.springframeworkrecipeapp.repositories.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class RecipeServiceImpl implements RecipeService{
    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        Set<Recipe> allRecipes = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(allRecipes::add);
        return allRecipes;
    }
}
