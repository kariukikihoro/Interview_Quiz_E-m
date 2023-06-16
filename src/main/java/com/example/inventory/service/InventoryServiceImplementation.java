package com.example.inventory.service;

import com.example.inventory.entity.Inventory;
import com.example.inventory.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class InventoryServiceImplementation implements InventoryService{

    @Autowired
    private InventoryRepository inventoryRepository;
    @Override
    public Inventory saveInventory(Inventory inventory) {
        return inventoryRepository.save(inventory);
    }

    @Override
    public List<Inventory> getInventoryList() {
        return (List<Inventory>)
                inventoryRepository.findAll();
    }

    @Override
    public Inventory updateInventory(Inventory inventory, Long itemId) {
        return null;
    }

//    @Override
//    public Inventory updateInventory(Inventory inventory, Long itemId) {
//        Inventory invDB
//                = inventoryRepository.findById(itemId).get();
//        if (Objects.nonNull(inventory.getInventoryName())
//                && !"".equalsIgnoreCase(
//                inventory.getInventoryName())) {
//            invDB.setInventoryName(
//                    inventory.getInventoryName());
//        }
//        if (Objects.nonNull(
//                inventory.getInventoryAddress())
//                && !"".equalsIgnoreCase(
//                department.getInventoryAddress())) {
//            invDB.setinventoryAddress(
//                    inventory.getInventoryAddress());
//        }
//
//        if (Objects.nonNull(inventory.getInventoryCode())
//                && !"".equalsIgnoreCase(
//                inventory.getInventoryCode())) {
//            invDB.setInventoryCode(
//                    inventory.getInventoryCode());
//        }
//
//        return inventoryRepository.save(invDB);
//    }
//    }

    @Override
    public void deleteInventoryById(Long itemId) {
        inventoryRepository.deleteById(itemId);
    }
}
