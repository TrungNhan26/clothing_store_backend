package com.example.haibazo_test.service;

import com.example.haibazo_test.dto.CategoryDTO;
import com.example.haibazo_test.dto.ColorDTO;
import com.example.haibazo_test.model.Category;
import com.example.haibazo_test.model.Color;

import java.util.List;
import java.util.Optional;

public interface IColorService {
    List<ColorDTO> getAllColors();
    Optional<ColorDTO> findById(Long id);
    Color save(Color color);
}
