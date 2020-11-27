package com.app.utb.springframeworkrecipeapp.controller;

import com.app.utb.springframeworkrecipeapp.domain.Category;
import com.app.utb.springframeworkrecipeapp.domain.UnitOfMeasure;
import com.app.utb.springframeworkrecipeapp.repositories.CategoryRepository;
import com.app.utb.springframeworkrecipeapp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private final CategoryRepository categoryRepository;
    private final UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository,
                           UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(){
        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Cat Id is "+ categoryOptional.get().getId());
        System.out.println("UOM Id is "+ unitOfMeasureOptional.get().getId());
        return "index";
    }
}
