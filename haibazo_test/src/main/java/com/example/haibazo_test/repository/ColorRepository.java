package com.example.haibazo_test.repository;

import com.example.haibazo_test.model.Color;
import com.example.haibazo_test.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ColorRepository extends JpaRepository<Color, Long> {

    Optional<Color> findById(Long id);
}
