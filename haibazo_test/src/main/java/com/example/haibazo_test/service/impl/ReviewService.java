package com.example.haibazo_test.service.impl;

import com.example.haibazo_test.dto.ProductImageDTO;
import com.example.haibazo_test.dto.ReviewDTO;
import com.example.haibazo_test.mapper.ProductImageMapper;
import com.example.haibazo_test.mapper.ReviewMapper;
import com.example.haibazo_test.model.Product;
import com.example.haibazo_test.model.Review;
import com.example.haibazo_test.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

import com.example.haibazo_test.repository.ReviewRepository;
import com.example.haibazo_test.service.IReviewService;
import jakarta.persistence.EntityNotFoundException;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ReviewService implements IReviewService {

    ReviewRepository reviewRepository;
    ProductRepository productRepository;
    ReviewMapper reviewMapper;

    public List<ReviewDTO> getAllReviews() {
        List<Review> reviews = reviewRepository.findAll();
        return reviews.stream().map(reviewMapper::toReviewDTO).toList();
    }

    public Optional<ReviewDTO> findById(Long id) {
        Optional<Review> reviewOptional = reviewRepository.findById(id);
        return reviewOptional.map(reviewMapper::toReviewDTO);
    }

    public List<ReviewDTO> findByProductId(Long id) {
        List<Review> reviews_product = reviewRepository.findByProductId(id);
        return reviews_product.stream().map(reviewMapper::toReviewDTO).toList();
    }

    public void deleteById(Long reviewId) {
        if (!reviewRepository.existsById(reviewId)) {
            throw new EntityNotFoundException("Review not found with id: " + reviewId);
        }
        reviewRepository.deleteById(reviewId);
    }

    public Review save(Review review) {
        return reviewRepository.save(review);
    }

    public ReviewDTO saveReviewByProduct(ReviewDTO reviewDTO) {
        Product product = productRepository.findById(reviewDTO.getProductId())
                .orElseThrow(() -> new EntityNotFoundException("Product not found with id: " + reviewDTO.getProductId()));

        Review review = reviewMapper.toReview(reviewDTO);
        review.setProduct(product);
        Review savedReview = reviewRepository.save(review);
        return reviewMapper.toReviewDTO(savedReview);
    }
}
