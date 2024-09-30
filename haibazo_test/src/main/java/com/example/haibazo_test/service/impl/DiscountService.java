package com.example.haibazo_test.service.impl;

import com.example.haibazo_test.dto.ColorDTO;
import com.example.haibazo_test.dto.DiscountDTO;
import com.example.haibazo_test.mapper.ColorMapper;
import com.example.haibazo_test.mapper.DiscountMapper;
import com.example.haibazo_test.model.Color;
import com.example.haibazo_test.model.Discount;
import com.example.haibazo_test.repository.ColorRepository;
import com.example.haibazo_test.repository.DiscountRepository;
import com.example.haibazo_test.service.IDiscountService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DiscountService implements IDiscountService {

    DiscountRepository discountRepository;

    DiscountMapper discountMapper;

    public List<DiscountDTO> getAllDiscounts() {
        List<Discount> discounts = discountRepository.findAll();
        return discounts.stream().map(discountMapper::toDiscountDTO).toList();
    }

    public Optional<DiscountDTO> findById(Long id) {
        Optional<Discount> discountOptional = discountRepository.findById(id);
        return discountOptional.map(discountMapper::toDiscountDTO);
    }

    public Discount save(Discount discount) {
        return discountRepository.save(discount);
    }
}
