package com.example.haibazo_test.repository;

import com.example.haibazo_test.model.Color;
import com.example.haibazo_test.model.Discount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DiscountRepository extends JpaRepository<Discount, Long> {

    Optional<Discount> findById(Long id);

}
