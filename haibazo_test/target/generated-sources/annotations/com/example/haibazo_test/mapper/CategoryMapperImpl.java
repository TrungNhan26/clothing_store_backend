package com.example.haibazo_test.mapper;

import com.example.haibazo_test.dto.CategoryDTO;
import com.example.haibazo_test.model.Category;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-01T02:15:45+0700",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.40.0.v20240919-1711, environment: Java 17.0.12 (Eclipse Adoptium)"
)
@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public CategoryDTO toCategoryDTO(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryDTO categoryDTO = new CategoryDTO();

        categoryDTO.setCategoryType( category.getCategoryType() );
        categoryDTO.setDescription( category.getDescription() );
        categoryDTO.setCategoryId( category.getCategoryId() );

        return categoryDTO;
    }

    @Override
    public Category toCategoryEntity(CategoryDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Category category = new Category();

        category.setCategoryId( dto.getCategoryId() );
        category.setCategoryType( dto.getCategoryType() );
        category.setDescription( dto.getDescription() );

        return category;
    }
}
