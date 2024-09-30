package com.example.haibazo_test.repository;

import com.example.haibazo_test.model.Category;
import com.example.haibazo_test.model.Color;
import com.example.haibazo_test.model.Product;
import com.example.haibazo_test.model.Style;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Optional<Product> findById(Long id);

@Query("SELECT p FROM Product p " +
            "LEFT JOIN p.styles s " +
            "LEFT JOIN p.colors c " +
            "LEFT JOIN p.sizes sz " +
            "WHERE (:category IS NULL OR p.category.categoryType = :category) " +
            "AND (:color IS NULL OR c.colorType = :color) " +
            "AND (:size IS NULL OR sz.sizeType = :size) " +
            "AND (:style IS NULL OR s.styleType = :style)")
    List<Product> findByFilters(String category, String color, String size, String style);
}
