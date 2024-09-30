package com.example.haibazo_test.mapper;


import com.example.haibazo_test.dto.CategoryDTO;
import com.example.haibazo_test.model.Category;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

//    //source là model target là dto
    @Mapping(source = "categoryType", target = "categoryType")
    @Mapping(source = "description", target = "description")
    CategoryDTO toCategoryDTO(Category category);

    Category toCategoryEntity(CategoryDTO dto);
}
