package com.example.haibazo_test.repository;

import com.example.haibazo_test.model.Size;
import com.example.haibazo_test.model.Style;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StyleRepository extends JpaRepository<Style, Long> {

    Optional<Style> findById(Long id);
}
