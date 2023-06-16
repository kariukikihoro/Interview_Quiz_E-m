package com.example.inventory.controller;

import com.example.inventory.entity.Inventory;
import com.example.inventory.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.awt.*;
@RestController
public class InventoryController {
    @Autowired
    private InventoryService inventoryService;

    // Save operation
    @PostMapping("/inventories")

    public Inventory saveInventory(
            @Validated @RequestBody Inventory inventory) {
        return inventoryService.saveInventory(inventory);
    }

    // Read operation
    @GetMapping("/inventories")

    public List <Inventory> getInventoryList() {
        return inventoryService.getInventoryList();
    }

    // Update operation
    @PostMapping("/inventories/{id}")

    public Inventory
    updateDepartment(@RequestBody Inventory inventory,
                     @PathVariable("id") Long itemId) {
        return inventoryService.updateInventory(inventory, itemId);
    }

    // Delete operation
    @DeleteMapping("/inventories/{id}")

    public String deleteInventoryById(@PathVariable("id")
                                      Long itemId) {
        inventoryService.deleteInventoryById(
                itemId);
        return "Deleted Successfully";
    }
}