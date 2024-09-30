package com.example.haibazo_test.mapper;

import com.example.haibazo_test.dto.ProductImageDTO;
import com.example.haibazo_test.model.Product;
import com.example.haibazo_test.model.ProductImage;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-01T02:15:45+0700",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.40.0.v20240919-1711, environment: Java 17.0.12 (Eclipse Adoptium)"
)
@Component
public class ProductImageMapperImpl implements ProductImageMapper {

    @Override
    public ProductImageDTO toProductImageDTO(ProductImage productImage) {
        if ( productImage == null ) {
            return null;
        }

        ProductImageDTO productImageDTO = new ProductImageDTO();

        productImageDTO.setImageUrl( productImage.getImageUrl() );
        productImageDTO.setProductId( productImageProductProductId( productImage ) );
        productImageDTO.setMainImage( productImage.isMainImage() );
        productImageDTO.setProductImageId( productImage.getProductImageId() );

        return productImageDTO;
    }

    @Override
    public ProductImage toProductImage(ProductImageDTO productImageDTO) {
        if ( productImageDTO == null ) {
            return null;
        }

        ProductImage productImage = new ProductImage();

        productImage.setImageUrl( productImageDTO.getImageUrl() );
        productImage.setMainImage( productImageDTO.isMainImage() );
        productImage.setProductImageId( productImageDTO.getProductImageId() );

        return productImage;
    }

    private Long productImageProductProductId(ProductImage productImage) {
        if ( productImage == null ) {
            return null;
        }
        Product product = productImage.getProduct();
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
