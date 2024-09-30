package com.example.haibazo_test.controller;

import com.example.haibazo_test.dto.ProductDTO;
import com.example.haibazo_test.model.Product;
import com.example.haibazo_test.dto.APIResponse;
import com.example.haibazo_test.exception.ApiException;
import com.example.haibazo_test.exception.ErrorCode;
import com.example.haibazo_test.service.IProductService;
import com.example.haibazo_test.util.JsonResponse;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductController {
   IProductService productService;
    @GetMapping
    public ResponseEntity<APIResponse<List<ProductDTO>>> getAll(){
        List<ProductDTO> products = productService.getAllProducts();
        return JsonResponse.ok(products);
    }
    @GetMapping("/{id}")
    public ResponseEntity<APIResponse<Optional<ProductDTO>>> getByID(@PathVariable("id") Long id) {
        Optional<ProductDTO> productDTO = productService.findById(id);
        return JsonResponse.ok(productDTO);
    }

    @GetMapping("/filter")
    public ResponseEntity<APIResponse<List<ProductDTO>>> filterProducts(
            @RequestParam(required = false) String category,
            @RequestParam(required = false) String color,
            @RequestParam(required = false) String size,
            @RequestParam(required = false) String style) {

        List<ProductDTO> filteredProducts = productService.filterProducts(category, color, size,style);
        return JsonResponse.ok(filteredProducts);
    }

//    @PostMapping
//    public ResponseEntity<APIResponse<Product>> create(@RequestBody Product product){
//        productService.save(product);
//        return JsonResponse.create(product);
//    }
}
