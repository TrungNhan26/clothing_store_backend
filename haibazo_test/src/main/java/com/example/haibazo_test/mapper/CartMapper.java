package com.example.haibazo_test.mapper;

import com.example.haibazo_test.dto.CartDTO;
import com.example.haibazo_test.dto.CategoryDTO;
import com.example.haibazo_test.model.Cart;
import com.example.haibazo_test.model.Category;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CartMapper {

    CartDTO toCartDTO(Cart cart);

    @Mapping(source = "quantity", target = "quantity")
    Cart toCartEntity(CartDTO cartDTO);
}

