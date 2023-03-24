package com.phonepe.Inventory.services;

import com.phonepe.Inventory.entities.Inventory;

import java.util.List;

public interface InventoryService {

    //create
    Inventory createInventory(Inventory inventory);

    // get single
    Inventory deleteInventoryById(String id);

    // get all
    List<Inventory> getAll();
}
