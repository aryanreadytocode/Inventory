package com.phonepe.Inventory.repositories;


import com.phonepe.Inventory.entities.Inventory;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class InventoryRepository  {
    HashMap<String, Inventory> inventoryHashMap = new HashMap<>();
    public Inventory save(Inventory inventory){
        if (inventoryHashMap.containsKey(inventory.getId())) {
            int amount = inventoryHashMap.get(inventory.getId()).getAmount();
            inventory.setAmount(amount+inventory.getAmount());
            inventoryHashMap.put(inventory.getId(), inventory);
        }else {
            inventoryHashMap.put(inventory.getId(), inventory);
        }
        return inventory;
    }

    public Optional<Inventory> deleteById(String id){
        Inventory inventory = inventoryHashMap.get(id);
        if (inventory!=null) {
            int amount = inventory.getAmount();
            // check if amount not less than 0
            if (amount > 0) {
                inventory.setAmount(amount - 1);
            }
        }
        return Optional.ofNullable(inventoryHashMap.put(id, inventory));
    }

    public List<Inventory> findAll(){
        return new ArrayList<>(inventoryHashMap.values());
    }
}
