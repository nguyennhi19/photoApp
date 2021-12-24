
package com.codegym.flicker.service;

import com.codegym.flicker.model.Category;

public interface ICategoryService {

    Iterable<Category> findAll();

    Category findById(Long id);

    void save(Category category);

    void remove(Long id);
}
