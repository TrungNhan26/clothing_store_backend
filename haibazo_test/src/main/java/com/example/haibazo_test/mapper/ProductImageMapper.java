package com.example.haibazo_test.mapper;

import com.example.haibazo_test.dto.ProductImageDTO;
import com.example.haibazo_test.model.ProductImage;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductImageMapper {

//    @Mapping(source = "isMainImage", target = "isMainImage")
    @Mapping(source = "imageUrl", target = "imageUrl")
    @Mapping(source = "product.productId", target = "productId")
    ProductImageDTO toProductImageDTO(ProductImage productImage);
    ProductImage toProductImage(ProductImageDTO productImageDTO);
}
