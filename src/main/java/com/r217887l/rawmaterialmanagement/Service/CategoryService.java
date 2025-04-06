package com.r217887l.rawmaterialmanagement.Service;

import com.r217887l.rawmaterialmanagement.Model.categories;
import com.r217887l.rawmaterialmanagement.Repo.CategoriesRepository;


public class CategoryService {

CategoriesRepository categoriesRepository = new CategoriesRepository();

public void saveCategory(categories category){

    categoriesRepository.saveCategory(category);
    
}

public void updateCategory(categories category){

    categoriesRepository.updateCategory(category);
}
public void deleteCategory(categories category){

    categoriesRepository.deleteCategory(category);
}

}
