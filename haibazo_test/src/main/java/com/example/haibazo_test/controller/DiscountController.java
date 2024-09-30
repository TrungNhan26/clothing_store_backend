package com.example.haibazo_test.controller;

import com.example.haibazo_test.dto.APIResponse;
import com.example.haibazo_test.dto.DiscountDTO;
import com.example.haibazo_test.service.IDiscountService;
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
@RequestMapping("/api/discounts")
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DiscountController {
    IDiscountService discountService;

    @GetMapping
    public ResponseEntity<APIResponse<List<DiscountDTO>>> getAll() {
        List<DiscountDTO> discountDTOS = discountService.getAllDiscounts();
        return JsonResponse.ok(discountDTOS);
    }
}
