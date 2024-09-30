package com.example.haibazo_test.controller;

import com.example.haibazo_test.dto.APIResponse;
import com.example.haibazo_test.dto.StyleDTO;
import com.example.haibazo_test.service.IStyleService;
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
@RequestMapping("/api/styles")
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StyleController {
    IStyleService styleService;
    @GetMapping
    public ResponseEntity<APIResponse<List<StyleDTO>>> getAll() {
        List<StyleDTO> styleDTOS = styleService.getAllStyles();
        return JsonResponse.ok(styleDTOS);
    }
}
