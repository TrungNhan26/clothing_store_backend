package com.example.haibazo_test.repository;

import com.example.haibazo_test.model.Inventory;
import com.example.haibazo_test.model.ProductImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductImageRepository extends JpaRepository<ProductImage, Long> {

    Optional<ProductImage> findById(Long id);
}
