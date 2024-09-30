package com.example.haibazo_test.mapper;

import com.example.haibazo_test.dto.InventoryDTO;
import com.example.haibazo_test.model.Inventory;
import com.example.haibazo_test.model.Product;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-01T02:15:45+0700",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.40.0.v20240919-1711, environment: Java 17.0.12 (Eclipse Adoptium)"
)
@Component
public class InventoryMapperImpl implements InventoryMapper {

    @Override
    public InventoryDTO toInventoryDTO(Inventory inventory) {
        if ( inventory == null ) {
            return null;
        }

        InventoryDTO inventoryDTO = new InventoryDTO();

        inventoryDTO.setStockQuantity( inventory.getStockQuantity() );
        inventoryDTO.setProductId( inventoryProductProductId( inventory ) );
        inventoryDTO.setInventoryId( inventory.getInventoryId() );

        return inventoryDTO;
    }

    @Override
    public Inventory toInventory(InventoryDTO inventoryDTO) {
        if ( inventoryDTO == null ) {
            return null;
        }

        Inventory inventory = new Inventory();

        inventory.setInventoryId( inventoryDTO.getInventoryId() );
        inventory.setStockQuantity( inventoryDTO.getStockQuantity() );

        return inventory;
    }

    private Long inventoryProductProductId(Inventory inventory) {
        if ( inventory == null ) {
            return null;
        }
        Product product = inventory.getProduct();
        if ( product == null ) {
            return null;
        }
        Long productId = product.getProductId();
        if ( productId == null ) {
            return null;
        }
        return productId;
    }
}
