package com.example.haibazo_test.controller;

import com.example.haibazo_test.dto.APIResponse;
import com.example.haibazo_test.dto.InventoryDTO;
import com.example.haibazo_test.service.IInventoryService;
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
@RequestMapping("/api/inventory")
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class InventoryController {
    IInventoryService inventoryService;

    @GetMapping
    public ResponseEntity<APIResponse<List<InventoryDTO>>> getAll() {
        List<InventoryDTO> inventoryDTOS = inventoryService.getAllInventories();
        return JsonResponse.ok(inventoryDTOS);
    }
}
