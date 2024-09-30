package com.example.haibazo_test.service;

import com.example.haibazo_test.dto.ReviewDTO;
import com.example.haibazo_test.model.Review;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IReviewService {
    List<ReviewDTO> getAllReviews();
    Optional<ReviewDTO> findById(Long id);
    Review save(Review review);
    List<ReviewDTO> findByProductId(Long id);
    void deleteById(Long id);
    ReviewDTO saveReviewByProduct(ReviewDTO reviewDTO);
}


