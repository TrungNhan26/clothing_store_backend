package com.example.haibazo_test.service.impl;

import com.example.haibazo_test.dto.CategoryDTO;
import com.example.haibazo_test.mapper.CategoryMapper;
import com.example.haibazo_test.model.Category;

import com.example.haibazo_test.repository.CategoryRepository;
import com.example.haibazo_test.service.ICategoryService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CategoryService implements ICategoryService {
    CategoryRepository categoryRepository;

    CategoryMapper categoryMapper;

    public List<CategoryDTO> getAllCategories() {
        List<Category> categories = categoryRepository.findAll();
        return categories.stream().map(categoryMapper::toCategoryDTO).toList();
    }

    public Optional<CategoryDTO> findById(Long id) {
        Optional<Category> categoryOptional = categoryRepository.findById(id);
        return categoryOptional.map(categoryMapper::toCategoryDTO);
    }

    public Category save(Category category){
        return categoryRepository.save(category);
    }

}

