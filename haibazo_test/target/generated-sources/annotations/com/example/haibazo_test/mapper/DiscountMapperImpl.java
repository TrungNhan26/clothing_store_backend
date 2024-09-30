package com.example.haibazo_test.mapper;

import com.example.haibazo_test.dto.DiscountDTO;
import com.example.haibazo_test.model.Discount;
import com.example.haibazo_test.model.Product;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-01T02:15:45+0700",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.40.0.v20240919-1711, environment: Java 17.0.12 (Eclipse Adoptium)"
)
@Component
public class DiscountMapperImpl implements DiscountMapper {

    @Override
    public DiscountDTO toDiscountDTO(Discount discount) {
        if ( discount == null ) {
            return null;
        }

        DiscountDTO discountDTO = new DiscountDTO();

        discountDTO.setDiscountedPrice( discount.getDiscountedPrice() );
        discountDTO.setExpiryDate( discount.getExpiryDate() );
        discountDTO.setProductId( discountProductProductId( discount ) );
        discountDTO.setDiscountId( discount.getDiscountId() );

        return discountDTO;
    }

    @Override
    public Discount toDiscount(DiscountDTO discountDTO) {
        if ( discountDTO == null ) {
            return null;
        }

        Discount discount = new Discount();

        discount.setDiscountId( discountDTO.getDiscountId() );
        discount.setDiscountedPrice( discountDTO.getDiscountedPrice() );
        discount.setExpiryDate( discountDTO.getExpiryDate() );

        return discount;
    }

    private Long discountProductProductId(Discount discount) {
        if ( discount == null ) {
            return null;
        }
        Product product = discount.getProduct();
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
