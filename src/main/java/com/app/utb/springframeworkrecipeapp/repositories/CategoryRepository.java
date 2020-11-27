package com.app.utb.springframeworkrecipeapp.repositories;


import com.app.utb.springframeworkrecipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {
    Optional<Category> findByDescription(String description);
}
