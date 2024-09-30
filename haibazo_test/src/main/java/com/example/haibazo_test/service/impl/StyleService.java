package com.example.haibazo_test.service.impl;

import com.example.haibazo_test.dto.StyleDTO;
import com.example.haibazo_test.mapper.StyleMapper;
import com.example.haibazo_test.model.Style;
import com.example.haibazo_test.repository.StyleRepository;
import com.example.haibazo_test.service.IStyleService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StyleService implements IStyleService {

    StyleRepository styleRepository;

    StyleMapper styleMapper;

    public List<StyleDTO> getAllStyles() {
        List<Style> styles = styleRepository.findAll();
        return styles.stream().map(styleMapper::toStyleDTO).toList();
    }

    public Optional<StyleDTO> findById(Long id) {
        Optional<Style> styleOptional = styleRepository.findById(id);
        return styleOptional.map(styleMapper::toStyleDTO);
    }

    public Style save(Style style) {
        return styleRepository.save(style);
    }
}
