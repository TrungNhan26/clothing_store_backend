package com.example.haibazo_test.service;

import com.example.haibazo_test.dto.ProductDTO;
import com.example.haibazo_test.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface IProductService {
     List<ProductDTO> getAllProducts();
     Optional<ProductDTO> findById(Long id);
     Product save(Product product);

     List<ProductDTO> filterProducts(String category_type, String color_type, String size_type , String style_stype);
}