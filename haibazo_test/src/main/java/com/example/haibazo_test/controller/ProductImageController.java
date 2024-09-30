package com.example.haibazo_test.controller;

import com.example.haibazo_test.dto.APIResponse;
import com.example.haibazo_test.dto.ProductImageDTO;
import com.example.haibazo_test.service.IProductImageService;
import com.example.haibazo_test.util.JsonResponse;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/product-images")
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductImageController {
    IProductImageService productImageService;

    @GetMapping
    public ResponseEntity<APIResponse<List<ProductImageDTO>>> getAll() {
        List<ProductImageDTO> productImageDTOS = productImageService.getAllProductImages();
        return JsonResponse.ok(productImageDTOS);
    }
}
