package com.example.haibazo_test.service;

import com.example.haibazo_test.dto.SizeDTO;
import com.example.haibazo_test.model.Size;

import java.util.List;
import java.util.Optional;

public interface ISizeService {
    List<SizeDTO> getAllSizes();
    Optional<SizeDTO> findById(Long id);
    Size save(Size size);
}
