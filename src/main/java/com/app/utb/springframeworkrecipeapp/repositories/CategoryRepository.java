package com.app.utb.springframeworkrecipeapp.repositories;


import com.app.utb.springframeworkrecipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
