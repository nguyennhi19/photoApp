
package com.codegym.flicker.service.impl;

import com.codegym.flicker.model.Category;
import com.codegym.flicker.repository.ICategoryRepository;
import com.codegym.flicker.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;

public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    private ICategoryRepository categoryRepository;

    @Override
    public Iterable<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category findById(Long id) {
        return categoryRepository.findOne(id);
    }

    @Override
    public void save(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public void remove(Long id) {
        categoryRepository.delete(id);
    }
}
