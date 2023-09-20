package org.example.composite;

import lombok.Data;

@Data
public abstract class Product implements Box{
    protected final String title;
    protected final double price;
}
