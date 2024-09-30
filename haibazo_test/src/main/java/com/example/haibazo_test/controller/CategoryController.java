package com.example.haibazo_test.controller;

import com.example.haibazo_test.dto.APIResponse;
import com.example.haibazo_test.dto.CategoryDTO;
import com.example.haibazo_test.service.ICategoryService;
import com.example.haibazo_test.util.JsonResponse;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CategoryController {
    ICategoryService categoryService;
    @GetMapping
    public ResponseEntity<APIResponse<List<CategoryDTO>>> getAll() {
        List<CategoryDTO> categories = categoryService.getAllCategories();
        return JsonResponse.ok(categories);
    }

}
