package com.example.inventory.service;

import com.example.inventory.entity.InventoryEntity;
import com.example.inventory.model.Inventory;

public interface InventoryService {
    InventoryEntity createInventory(Inventory inventory);

    Boolean checkInventory(Long itemId);
}
