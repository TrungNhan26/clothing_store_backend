package com.example.haibazo_test.mapper;

import com.example.haibazo_test.dto.SizeDTO;
import com.example.haibazo_test.model.Size;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-01T02:15:45+0700",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.40.0.v20240919-1711, environment: Java 17.0.12 (Eclipse Adoptium)"
)
@Component
public class SizeMapperImpl implements SizeMapper {

    @Override
    public SizeDTO toSizeDTO(Size size) {
        if ( size == null ) {
            return null;
        }

        SizeDTO sizeDTO = new SizeDTO();

        sizeDTO.setSizeType( size.getSizeType() );
        sizeDTO.setSizeId( size.getSizeId() );

        return sizeDTO;
    }

    @Override
    public Size toSizeEntity(SizeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Size size = new Size();

        size.setSizeId( dto.getSizeId() );
        size.setSizeType( dto.getSizeType() );

        return size;
    }
}
