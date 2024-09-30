package com.example.haibazo_test.service.impl;

import java.util.List;
import java.util.Optional;

import com.example.haibazo_test.dto.InventoryDTO;
import com.example.haibazo_test.dto.ProductImageDTO;
import com.example.haibazo_test.mapper.InventoryMapper;
import com.example.haibazo_test.mapper.ProductImageMapper;
import com.example.haibazo_test.model.Inventory;
import com.example.haibazo_test.model.ProductImage;
import com.example.haibazo_test.repository.InventoryRepository;
import com.example.haibazo_test.repository.ProductImageRepository;
import com.example.haibazo_test.service.IProductImageService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductImageService implements IProductImageService {

    ProductImageRepository productImageRepository;

    ProductImageMapper productImageMapper;

    public List<ProductImageDTO> getAllProductImages() {
        List<ProductImage> productImages = productImageRepository.findAll();
        return productImages.stream().map(productImageMapper::toProductImageDTO).toList();
    }

    public Optional<ProductImageDTO> findById(Long id) {
        Optional<ProductImage> productImageOptional = productImageRepository.findById(id);
        return productImageOptional.map(productImageMapper::toProductImageDTO);
    }

    public ProductImage save(ProductImage productImage) {
        return productImageRepository.save(productImage);
    }

}
