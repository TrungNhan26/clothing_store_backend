package com.example.haibazo_test.service;

import com.example.haibazo_test.dto.InventoryDTO;
import com.example.haibazo_test.model.Inventory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IInventoryService {
    List<InventoryDTO> getAllInventories();
    Optional<InventoryDTO> findById(Long id);
    Inventory save(Inventory inventory);
}
