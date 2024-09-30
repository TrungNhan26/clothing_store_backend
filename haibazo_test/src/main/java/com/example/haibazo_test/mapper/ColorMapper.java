package com.example.haibazo_test.mapper;

import com.example.haibazo_test.dto.CategoryDTO;
import com.example.haibazo_test.dto.ColorDTO;
import com.example.haibazo_test.model.Category;
import com.example.haibazo_test.model.Color;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ColorMapper {

    //source là model target là dto
    @Mapping(source = "colorType", target = "colorType")
    ColorDTO toColorDTO(Color color);
    Color toColorEntity(ColorDTO colorDTO);
}
