package com.example.haibazo_test.mapper;

import com.example.haibazo_test.dto.RatingDTO;
import com.example.haibazo_test.model.Rating;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-28T22:38:58+0700",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
)
@Component
public class RatingMapperImpl implements RatingMapper {

    @Override
    public RatingDTO toRatingDTO(Rating rating) {
        if ( rating == null ) {
            return null;
        }

        RatingDTO ratingDTO = new RatingDTO();

        return ratingDTO;
    }

    @Override
    public Rating toRatingEntity(RatingDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Rating rating = new Rating();

        return rating;
    }
}
