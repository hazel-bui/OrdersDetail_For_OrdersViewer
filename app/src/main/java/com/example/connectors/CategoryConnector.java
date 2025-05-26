package com.example.connectors;

import com.example.models.Category;
import com.example.models.ListCategory;

import java.util.ArrayList;

public class CategoryConnector {
    private final ListCategory listCategory;

    public CategoryConnector() {
        listCategory = new ListCategory();
        listCategory.generate_example_products_dataset();
    }

    public ArrayList<Category> getAllCategories() {
        return listCategory.getCategory();
    }

    public Category getCategoryById(int id) {
        for (Category category : listCategory.getCategory()) {
            if (category.getId() == id) {
                return category;
            }
        }
        return null;
    }
}