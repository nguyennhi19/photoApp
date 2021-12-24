
package com.codegym.flicker.repository;

import com.codegym.flicker.model.Category;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ICategoryRepository extends PagingAndSortingRepository<Category, Long> {
}
