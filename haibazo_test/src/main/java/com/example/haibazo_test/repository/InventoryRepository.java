package com.example.haibazo_test.repository;

import com.example.haibazo_test.model.Color;
import com.example.haibazo_test.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {

    Optional<Inventory> findById(Long id);

}
