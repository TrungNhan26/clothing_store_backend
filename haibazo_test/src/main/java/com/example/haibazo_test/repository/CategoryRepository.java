package com.example.haibazo_test.repository;

import com.example.haibazo_test.dto.CategoryDTO;
import com.example.haibazo_test.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    Optional<Category> findById(Long id);
}
