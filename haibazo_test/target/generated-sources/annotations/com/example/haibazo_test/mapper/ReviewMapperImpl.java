package com.example.haibazo_test.mapper;

import com.example.haibazo_test.dto.ReviewDTO;
import com.example.haibazo_test.model.Product;
import com.example.haibazo_test.model.Review;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-01T02:15:45+0700",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.40.0.v20240919-1711, environment: Java 17.0.12 (Eclipse Adoptium)"
)
@Component
public class ReviewMapperImpl implements ReviewMapper {

    @Override
    public ReviewDTO toReviewDTO(Review review) {
        if ( review == null ) {
            return null;
        }

        ReviewDTO reviewDTO = new ReviewDTO();

        reviewDTO.setRating( review.getRating() );
        reviewDTO.setComment( review.getComment() );
        reviewDTO.setCreatedAt( review.getCreatedAt() );
        reviewDTO.setProductId( reviewProductProductId( review ) );
        reviewDTO.setReviewId( review.getReviewId() );

        return reviewDTO;
    }

    @Override
    public Review toReview(ReviewDTO reviewDTO) {
        if ( reviewDTO == null ) {
            return null;
        }

        Review review = new Review();

        review.setComment( reviewDTO.getComment() );
        review.setCreatedAt( reviewDTO.getCreatedAt() );
        review.setRating( reviewDTO.getRating() );
        review.setReviewId( reviewDTO.getReviewId() );

        return review;
    }

    private Long reviewProductProductId(Review review) {
        if ( review == null ) {
            return null;
        }
        Product product = review.getProduct();
        if ( product == null ) {
            return null;
        }
        Long productId = product.getProductId();
        if ( productId == null ) {
            return null;
        }
        return productId;
    }
}
