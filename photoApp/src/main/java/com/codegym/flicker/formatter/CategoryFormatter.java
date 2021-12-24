
package com.codegym.flicker.formatter;

import com.codegym.flicker.model.Category;
import com.codegym.flicker.service.ICategoryService;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;

@Component
public class CategoryFormatter implements Formatter<Category> {
    private ICategoryService categoryService;

    public CategoryFormatter(ICategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @Override
    public Category parse(String text, Locale locale) throws ParseException {
        Long id = Long.parseLong(text);
        return categoryService.findById(id);
    }

    @Override
    public String print(Category object, Locale locale) {
        return object.getName();
    }
}
