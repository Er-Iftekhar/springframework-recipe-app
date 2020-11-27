package com.app.utb.springframeworkrecipeapp.repositories;

import com.app.utb.springframeworkrecipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
