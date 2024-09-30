package com.example.haibazo_test.mapper;

import com.example.haibazo_test.dto.ReviewDTO;
import com.example.haibazo_test.model.Review;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ReviewMapper {

    @Mapping(source = "rating", target = "rating")
    @Mapping(source = "comment", target = "comment")
    @Mapping(source = "createdAt", target = "createdAt")
    @Mapping(source = "product.productId", target = "productId")
    ReviewDTO toReviewDTO(Review review);

    Review toReview(ReviewDTO reviewDTO);
}
