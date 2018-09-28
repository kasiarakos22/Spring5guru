package com.kasiarakos.recipe.controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kasiarakos.recipe.domain.Category;
import com.kasiarakos.recipe.domain.UnitOfMeasure;
import com.kasiarakos.recipe.repositories.CategoryRepository;
import com.kasiarakos.recipe.repositories.UnitOfMeasureRepository;

@Controller
public class IndexController {

    private final CategoryRepository categoryRepository;
    private final UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"/", "", "/index"})
    public String index(){
        Optional<Category> category = categoryRepository.findByDescription("Greek");
        Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findByDescription("Tea spoon");
        System.out.println("category is "+category.get());
        System.out.println("Unit of Measure is "+unitOfMeasure.get());

        return "index";
    }
}
