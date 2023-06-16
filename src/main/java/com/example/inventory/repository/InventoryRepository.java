package com.example.inventory.repository;

import com.example.inventory.entity.Inventory;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends CrudRepository<Inventory, Long> {
}
