package com.phonepe.Inventory.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Inventory {
    private String Id;
    private String name;
    private int amount;
    private String about;
}
