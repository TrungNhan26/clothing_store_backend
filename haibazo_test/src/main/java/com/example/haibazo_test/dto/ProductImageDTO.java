package com.example.haibazo_test.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductImageDTO {

    private Long ProductImageId;
    private String imageUrl;
    private boolean isMainImage;

    Long productId;

}

