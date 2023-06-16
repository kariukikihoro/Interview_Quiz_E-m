package com.example.inventory.service;

import com.example.inventory.entity.Inventory;
import org.springframework.stereotype.Service;

import java.util.List;

public interface InventoryService {
    Inventory saveInventory(Inventory inventory);//save ops.
    List<Inventory> getInventoryList();//read

    Inventory updateInventory(Inventory inventory, Long itemId);//update
    void deleteInventoryById(Long itemId);
}
