package com.example.haibazo_test.mapper;

import com.example.haibazo_test.dto.StyleDTO;
import com.example.haibazo_test.model.Style;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-01T02:15:45+0700",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.40.0.v20240919-1711, environment: Java 17.0.12 (Eclipse Adoptium)"
)
@Component
public class StyleMapperImpl implements StyleMapper {

    @Override
    public StyleDTO toStyleDTO(Style style) {
        if ( style == null ) {
            return null;
        }

        StyleDTO styleDTO = new StyleDTO();

        styleDTO.setStyleType( style.getStyleType() );
        styleDTO.setDescription( style.getDescription() );
        styleDTO.setStyleId( style.getStyleId() );

        return styleDTO;
    }

    @Override
    public Style toStyleEntity(StyleDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Style style = new Style();

        style.setDescription( dto.getDescription() );
        style.setStyleId( dto.getStyleId() );
        style.setStyleType( dto.getStyleType() );

        return style;
    }
}
