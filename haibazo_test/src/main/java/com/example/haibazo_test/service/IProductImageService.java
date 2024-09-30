package com.example.haibazo_test.service;

import com.example.haibazo_test.dto.ProductImageDTO;
import com.example.haibazo_test.model.ProductImage;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IProductImageService {
    List<ProductImageDTO> getAllProductImages();
    Optional<ProductImageDTO> findById(Long id);
    ProductImage save(ProductImage productImage);
}
