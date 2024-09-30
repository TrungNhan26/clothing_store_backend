package com.example.haibazo_test.repository;

import com.example.haibazo_test.model.ProductImage;
import com.example.haibazo_test.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
        Optional<Review> findById(Long id);

        @Query("SELECT r FROM Review r WHERE r.product.id = :productId")
        List<Review> findByProductId(@Param("productId") Long productId);
}