package com.example.haibazo_test.service;

import com.example.haibazo_test.dto.ColorDTO;
import com.example.haibazo_test.dto.DiscountDTO;
import com.example.haibazo_test.model.Color;
import com.example.haibazo_test.model.Discount;

import java.util.List;
import java.util.Optional;

public interface IDiscountService {
    List<DiscountDTO> getAllDiscounts();
    Optional<DiscountDTO> findById(Long id);
    Discount save(Discount discount);
}
