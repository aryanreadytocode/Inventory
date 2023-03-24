package com.phonepe.Inventory.impl;

import com.phonepe.Inventory.entities.Inventory;
import com.phonepe.Inventory.exception.ResourceNotFoundException;
import com.phonepe.Inventory.repositories.InventoryRepository;
import com.phonepe.Inventory.services.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class InventoryServiceImpl implements InventoryService {
    @Autowired
    private InventoryRepository repository;

    @Override
    public Inventory createInventory(Inventory inventory) {
       return repository.save(inventory);
    }

    @Override
    public Inventory deleteInventoryById(String id) {
        return repository.deleteById(id).orElseThrow(() -> new ResourceNotFoundException("inventory with given id not found"));
    }

    @Override
    public List<Inventory> getAll() {
       return repository.findAll();
    }
}
