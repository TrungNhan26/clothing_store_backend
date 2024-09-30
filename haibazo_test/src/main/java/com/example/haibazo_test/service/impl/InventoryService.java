package com.example.haibazo_test.service.impl;

import com.example.haibazo_test.dto.DiscountDTO;
import com.example.haibazo_test.dto.InventoryDTO;
import com.example.haibazo_test.mapper.DiscountMapper;
import com.example.haibazo_test.mapper.InventoryMapper;
import com.example.haibazo_test.model.Discount;
import com.example.haibazo_test.model.Inventory;
import com.example.haibazo_test.repository.DiscountRepository;

import java.util.List;
import java.util.Optional;

import com.example.haibazo_test.repository.InventoryRepository;
import com.example.haibazo_test.service.IInventoryService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class InventoryService implements IInventoryService {

    InventoryRepository inventoryRepository;

    InventoryMapper inventoryMapper;

    public List<InventoryDTO> getAllInventories() {
        List<Inventory> inventories = inventoryRepository.findAll();
        return inventories.stream().map(inventoryMapper::toInventoryDTO).toList();
    }

    public Optional<InventoryDTO> findById(Long id) {
        Optional<Inventory> inventoryOptional = inventoryRepository.findById(id);
        return inventoryOptional.map(inventoryMapper::toInventoryDTO);
    }

    public Inventory save(Inventory inventory) {
        return inventoryRepository.save(inventory);
    }
}
