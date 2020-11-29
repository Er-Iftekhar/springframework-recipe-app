package com.app.utb.springframeworkrecipeapp.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    @Lob
    private String directions;
    //todo add
    //private Difficulty difficulty
    @Lob
    private Byte[] image;

    @Enumerated(value = EnumType.STRING)
    private Difficulty difficulty;

    @OneToOne(cascade = CascadeType.ALL)
    private Notes notes;

    @ManyToMany
    @JoinTable(name="recipe_category",
               joinColumns = @JoinColumn(name = "recipe_id"),
               inverseJoinColumns = @JoinColumn(name = "category_id"))
    private Set<Category> categories = new HashSet<>();


    @OneToMany(
            mappedBy = "recipe",
            cascade = CascadeType.ALL
    )
    private Set<Ingredient> ingredients = new HashSet<>();


    public void setNotes(Notes notes) {

        this.notes = notes;
        notes.setRecipe(this);
    }
   public Recipe addIngredient(Ingredient ingredient){
        ingredient.setRecipe(this);
        this.ingredients.add(ingredient);
        return this;
    }

    public void setIngredients(Set<Ingredient> ingredients) {
       ingredients.forEach(ingredient -> ingredient.setRecipe(this));
        this.ingredients = ingredients;
    }
    public void setCategories(Set<Category> categories) {
        this.categories = categories;
        categories.forEach(category -> category.getRecipes().add(this));
    }
}
