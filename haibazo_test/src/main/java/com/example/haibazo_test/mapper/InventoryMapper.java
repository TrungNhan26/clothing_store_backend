package com.example.haibazo_test.mapper;

import com.example.haibazo_test.dto.InventoryDTO;
import com.example.haibazo_test.model.Inventory;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface InventoryMapper {

//    @Mapping(source = "id", target = "id")
    @Mapping(source = "stockQuantity", target = "stockQuantity")
    @Mapping(source = "product.productId", target = "productId")
    InventoryDTO toInventoryDTO(Inventory inventory);
    Inventory toInventory(InventoryDTO inventoryDTO);
}
