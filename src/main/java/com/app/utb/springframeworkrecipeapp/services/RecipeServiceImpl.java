package com.app.utb.springframeworkrecipeapp.services;

import com.app.utb.springframeworkrecipeapp.domain.Recipe;
import com.app.utb.springframeworkrecipeapp.repositories.RecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Slf4j
public class RecipeServiceImpl implements RecipeService{
    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        log.debug("I am in the recipe service implementation");
        Set<Recipe> allRecipes = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(allRecipes::add);
        return allRecipes;
    }
}
