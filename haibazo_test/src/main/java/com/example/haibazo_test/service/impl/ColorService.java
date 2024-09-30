package com.example.haibazo_test.service.impl;

import com.example.haibazo_test.dto.ColorDTO;
import com.example.haibazo_test.mapper.ColorMapper;
import com.example.haibazo_test.model.Color;

import com.example.haibazo_test.repository.ColorRepository;
import com.example.haibazo_test.service.IColorService;
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
public class ColorService implements IColorService {
    ColorRepository colorRepository;

    ColorMapper colorMapper;

    public List<ColorDTO> getAllColors() {
        List<Color> colors = colorRepository.findAll();
        return colors.stream().map(colorMapper::toColorDTO).toList();
    }

    public Optional<ColorDTO> findById(Long id) {
        Optional<Color> colorOptional = colorRepository.findById(id);
        return colorOptional.map(colorMapper::toColorDTO);
    }

    public Color save(Color color) {
        return colorRepository.save(color);
    }
}