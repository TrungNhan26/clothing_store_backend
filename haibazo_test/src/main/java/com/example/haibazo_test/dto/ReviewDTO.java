package com.example.haibazo_test.dto;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)

public class ReviewDTO {

    private Long ReviewId;
    private int rating;
    private String comment;
    private LocalDateTime createdAt;

    Long productId;

}
