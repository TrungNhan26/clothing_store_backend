package com.example.haibazo_test.service;

import com.example.haibazo_test.dto.SizeDTO;
import com.example.haibazo_test.dto.StyleDTO;
import com.example.haibazo_test.model.Size;
import com.example.haibazo_test.model.Style;

import java.util.List;
import java.util.Optional;

public interface IStyleService {
    List<StyleDTO> getAllStyles();
    Optional<StyleDTO> findById(Long id);
    Style save(Style style);
}
