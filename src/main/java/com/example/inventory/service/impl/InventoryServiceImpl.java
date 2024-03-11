package com.example.inventory.service.impl;

import com.example.inventory.entity.InventoryEntity;
import com.example.inventory.model.Inventory;
import com.example.inventory.repository.InventoryRepository;
import com.example.inventory.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InventoryServiceImpl implements InventoryService {
    @Autowired
    InventoryRepository inventoryRepository;

    @Override
    public InventoryEntity createInventory(Inventory inventory) {
        InventoryEntity inventoryEntity=buildInventory(inventory);
        return inventoryRepository.save(inventoryEntity);
    }

    private InventoryEntity buildInventory(Inventory inventory) {
        InventoryEntity inventoryEntity=new InventoryEntity();
        inventoryEntity.setCategory(inventory.getCategory());
        inventoryEntity.setAvailable(inventory.isAvailable());
        inventoryEntity.setItem(String.valueOf(inventory.getItem()));
        return inventoryEntity;
    }

    @Override
    public Boolean checkInventory(Long itemId) {
        boolean result=false;
        Optional <InventoryEntity> optional = inventoryRepository.findById(itemId);

        if (optional.isPresent()) {
            result=true;
        }
        return result;
    }
}
