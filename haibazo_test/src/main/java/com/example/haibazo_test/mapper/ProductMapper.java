package com.example.haibazo_test.mapper;

import com.example.haibazo_test.dto.ProductDTO;
import com.example.haibazo_test.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductMapper {

//    source là model target là dto
    @Mapping(target = "category", source = "category")
    @Mapping(target = "colors", source = "colors")
    @Mapping(target = "sizes", source = "sizes")
    @Mapping(target = "styles", source = "styles")
    ProductDTO toProductsDTO(Product product);
    Product toProductEntity(ProductDTO dto);

}
