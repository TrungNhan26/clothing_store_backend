package com.example.haibazo_test.controller;

import com.example.haibazo_test.dto.APIResponse;
import com.example.haibazo_test.dto.SizeDTO;
import com.example.haibazo_test.service.ISizeService;
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
@RequestMapping("/api/sizes")
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SizeController {
    ISizeService sizeService;
    @GetMapping
    public ResponseEntity<APIResponse<List<SizeDTO>>> getAll(){
        List<SizeDTO> sizeDTOS = sizeService.getAllSizes();
        return JsonResponse.ok(sizeDTOS);
    }
}
