package com.example.haibazo_test.mapper;

import com.example.haibazo_test.dto.SizeDTO;
import com.example.haibazo_test.model.Size;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface SizeMapper {

    @Mapping(source = "sizeType", target = "sizeType")
    SizeDTO toSizeDTO(Size size);
    Size toSizeEntity(SizeDTO dto);
}
