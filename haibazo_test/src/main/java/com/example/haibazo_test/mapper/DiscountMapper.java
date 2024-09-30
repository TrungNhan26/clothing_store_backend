package com.example.haibazo_test.mapper;

import com.example.haibazo_test.dto.DiscountDTO;
import com.example.haibazo_test.model.Discount;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface DiscountMapper {
//  source là model target là dto
    @Mapping(source = "discountedPrice", target = "discountedPrice")
    @Mapping(source = "expiryDate", target = "expiryDate")
    @Mapping(source = "product.productId", target = "productId")
    DiscountDTO toDiscountDTO(Discount discount);
    Discount toDiscount(DiscountDTO discountDTO);
}
