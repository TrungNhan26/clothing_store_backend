package com.example.haibazo_test.service;

import com.example.haibazo_test.dto.CategoryDTO;
import com.example.haibazo_test.model.Category;

import java.util.List;
import java.util.Optional;

public interface ICategoryService {
     List<CategoryDTO> getAllCategories();
     Optional<CategoryDTO> findById(Long id);
     Category save(Category category);

}
