package com.example.haibazo_test.mapper;

import com.example.haibazo_test.dto.ColorDTO;
import com.example.haibazo_test.model.Color;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-01T02:15:45+0700",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.40.0.v20240919-1711, environment: Java 17.0.12 (Eclipse Adoptium)"
)
@Component
public class ColorMapperImpl implements ColorMapper {

    @Override
    public ColorDTO toColorDTO(Color color) {
        if ( color == null ) {
            return null;
        }

        ColorDTO colorDTO = new ColorDTO();

        colorDTO.setColorType( color.getColorType() );
        colorDTO.setColorId( color.getColorId() );

        return colorDTO;
    }

    @Override
    public Color toColorEntity(ColorDTO colorDTO) {
        if ( colorDTO == null ) {
            return null;
        }

        Color color = new Color();

        color.setColorId( colorDTO.getColorId() );
        color.setColorType( colorDTO.getColorType() );

        return color;
    }
}
