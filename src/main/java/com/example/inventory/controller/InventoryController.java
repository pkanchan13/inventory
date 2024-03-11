package com.example.inventory.controller;

import com.example.inventory.entity.InventoryEntity;
import com.example.inventory.model.Inventory;
import com.example.inventory.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/inventory")
public class InventoryController {
    @Autowired
    InventoryService inventoryService;
    @PostMapping(value="/api/addInventory")
    public InventoryEntity createInventory(@RequestBody Inventory inventory){
        return inventoryService.createInventory(inventory);
    }

    @GetMapping(value="/api/isInventoryAvailable/{itemId}")
    public Boolean checkInventory(@PathVariable("itemId") Long itemId){
        return inventoryService.checkInventory(itemId);
    }
}
