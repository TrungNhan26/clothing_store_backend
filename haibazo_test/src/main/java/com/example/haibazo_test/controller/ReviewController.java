package com.example.haibazo_test.controller;

import com.example.haibazo_test.dto.APIResponse;
import com.example.haibazo_test.dto.ReviewDTO;
import com.example.haibazo_test.service.IReviewService;
import com.example.haibazo_test.util.JsonResponse;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ReviewController {
    IReviewService reviewService;

    @GetMapping("/reviews")
    public ResponseEntity<APIResponse<List<ReviewDTO>>> getAll() {
        List<ReviewDTO> reviewDTOS = reviewService.getAllReviews();
        return JsonResponse.ok(reviewDTOS);
    }

    @GetMapping("/reviews/{id}")
    public ResponseEntity<APIResponse<Optional<ReviewDTO>>> getById(@PathVariable("id") Long id) {
        Optional<ReviewDTO> reviewDTO = reviewService.findById(id);
        return JsonResponse.ok(reviewDTO);
    }

    @GetMapping("/{productId}/reviews")
    public ResponseEntity<APIResponse<List<ReviewDTO>>> getByProductId(@PathVariable("productId") Long id) {
        List<ReviewDTO> reviewServiceByProductIdDTO = reviewService.findByProductId(id);
        return JsonResponse.ok(reviewServiceByProductIdDTO);
    }

    @DeleteMapping("/reviews/{id}")
    public ResponseEntity<Void> deleteReview(@PathVariable("id") Long id) {
        reviewService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/{productId}/reviews")
    public ResponseEntity<?> createReview(@PathVariable Long productId, @RequestBody ReviewDTO reviewDTO) {
        reviewDTO.setProductId(productId);
        ReviewDTO createdReview = reviewService.saveReviewByProduct(reviewDTO);
        return  JsonResponse.create(createdReview);
    }

}
