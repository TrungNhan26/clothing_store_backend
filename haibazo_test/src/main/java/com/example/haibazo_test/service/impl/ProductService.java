package com.example.haibazo_test.service.impl;

import com.example.haibazo_test.dto.ProductDTO;
import com.example.haibazo_test.mapper.ProductMapper;
import com.example.haibazo_test.model.Product;

import com.example.haibazo_test.repository.ProductRepository;
import com.example.haibazo_test.service.IProductService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductService implements IProductService {
    ProductRepository productRepository;

    ProductMapper productMapper;

    public List<ProductDTO> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return products.stream().map(productMapper::toProductsDTO).collect(Collectors.toList());
    }

    public Optional<ProductDTO> findById(Long id) {
        Optional<Product> productOptional = productRepository.findById(id);
        return productOptional.map(productMapper::toProductsDTO);
    }

    public Product save(Product product){

        return productRepository.save(product);
    }

    public List<ProductDTO> filterProducts(String category_type, String color_type, String size_type, String style_type) {
        return productRepository.findByFilters(category_type, color_type, size_type, style_type)
                .stream()
                .map(productMapper::toProductsDTO)
                .collect(Collectors.toList());
    }
}

