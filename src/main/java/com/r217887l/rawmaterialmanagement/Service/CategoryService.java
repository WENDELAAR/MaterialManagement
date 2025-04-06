package com.r217887l.rawmaterialmanagement.Service;

import com.r217887l.rawmaterialmanagement.Model.categories;
import com.r217887l.rawmaterialmanagement.Repo.CategoriesRepository;
import java.util.List;


public class CategoryService {

CategoriesRepository categoriesRepository = new CategoriesRepository();

public void saveCategory(categories category){

    categoriesRepository.saveCategory(category);
    
}

public void updateCategory(categories category){

    categoriesRepository.updateCategory(category);
}
public void deleteCategory(int id){

    categoriesRepository.deleteCategory(id);
}
public List <categories> findAllCategories(categories category){
    
        return categoriesRepository.findAllCategories(category);
    }
}
