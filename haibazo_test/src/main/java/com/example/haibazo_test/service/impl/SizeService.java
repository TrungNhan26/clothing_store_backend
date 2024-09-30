package com.example.haibazo_test.service.impl;

import com.example.haibazo_test.dto.SizeDTO;
import com.example.haibazo_test.mapper.SizeMapper;
import com.example.haibazo_test.model.Size;
import com.example.haibazo_test.repository.SizeRepository;
import com.example.haibazo_test.service.ISizeService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SizeService implements ISizeService {

    SizeRepository sizeRepository;

    SizeMapper sizeMapper;

    public List<SizeDTO> getAllSizes() {
        List<Size> sizes = sizeRepository.findAll();
        return sizes.stream().map(sizeMapper::toSizeDTO).toList();
    }

    public Optional<SizeDTO> findById(Long id) {
        Optional<Size> sizeOptional = sizeRepository.findById(id);
        return sizeOptional.map(sizeMapper::toSizeDTO);
    }

    public Size save(Size size) {
        return sizeRepository.save(size);
    }
}
