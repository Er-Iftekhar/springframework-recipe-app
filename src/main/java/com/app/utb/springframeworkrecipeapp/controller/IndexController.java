package com.app.utb.springframeworkrecipeapp.controller;

import com.app.utb.springframeworkrecipeapp.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }


    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model){
        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }
}
