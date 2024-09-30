package com.example.haibazo_test.mapper;

import com.example.haibazo_test.dto.StyleDTO;
import com.example.haibazo_test.model.Style;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface StyleMapper {

    @Mapping(source = "styleType", target = "styleType")
    @Mapping(source = "description", target = "description")
    StyleDTO toStyleDTO(Style style);
    Style toStyleEntity(StyleDTO dto);

}
