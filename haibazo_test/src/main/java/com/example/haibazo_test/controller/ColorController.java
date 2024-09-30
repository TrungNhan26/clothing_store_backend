package com.example.haibazo_test.controller;

import com.example.haibazo_test.dto.ColorDTO;
import com.example.haibazo_test.service.IColorService;
import com.example.haibazo_test.util.JsonResponse;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.haibazo_test.dto.APIResponse;

import java.util.List;

@RestController
@RequestMapping("/api/colors")
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ColorController {
    IColorService colorService;
    @GetMapping
    public ResponseEntity<APIResponse<List<ColorDTO>>> getAll() {
        List<ColorDTO> colorDTOS = colorService.getAllColors();
        return JsonResponse.ok(colorDTOS);
    }
}