package com.rodrigo.coursemc.controllers;

import com.rodrigo.coursemc.entities.Category;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {

    @RequestMapping(method = RequestMethod.GET)
    public List<Category> listAllCategories() {
        Category cat1 = new Category(1, "Informatic");
        Category cat2 = new Category(2, "Office");

        return Arrays.asList(cat1, cat2);
    }
}









