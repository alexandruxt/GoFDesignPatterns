package org.example.builder;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {
    private int id;
    private String brand;
    private String model;
    private String color;
    private int nbrDoors;
}
