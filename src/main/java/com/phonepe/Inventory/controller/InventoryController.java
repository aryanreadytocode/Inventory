package com.phonepe.Inventory.controller;

import com.phonepe.Inventory.entities.Inventory;
import com.phonepe.Inventory.services.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/inventory")
public class InventoryController {
    @Autowired
    private InventoryService service;
    // create
    @PostMapping
    public ResponseEntity<Inventory> createInventory(@RequestBody Inventory inventory) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createInventory(inventory));
    }

    //get single
    @DeleteMapping("/{inventoryId}")
    public ResponseEntity<Inventory> deleteInventoryById(@PathVariable String inventoryId) {
        return ResponseEntity.status(HttpStatus.OK).body(service.deleteInventoryById(inventoryId));
    }

    //get all
    @GetMapping
    public ResponseEntity<List<Inventory>> getAllInventory(){
        return ResponseEntity.status(HttpStatus.OK).body(service.getAll());
    }
}
