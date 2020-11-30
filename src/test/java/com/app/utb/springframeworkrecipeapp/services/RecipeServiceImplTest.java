package com.app.utb.springframeworkrecipeapp.services;

import com.app.utb.springframeworkrecipeapp.domain.Recipe;
import com.app.utb.springframeworkrecipeapp.repositories.RecipeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class RecipeServiceImplTest {

    RecipeService recipeService;
    @Mock
    RecipeRepository recipeRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        recipeService = new RecipeServiceImpl(recipeRepository);
    }

//    public Set<Recipe> getRecipes() {}
    @Test
    void getRecipes() {
        //given
        Recipe recipe = new Recipe();
        Set<Recipe> recipes = new HashSet<>();
        recipes.add(recipe);
        //when                            then
        when(recipeRepository.findAll()).thenReturn(recipes);

        assertEquals(recipes.size(), recipeService.getRecipes().size());
        verify(recipeRepository,times(1)).findAll();

    }
}