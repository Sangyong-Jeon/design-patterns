package com.example.designpatterns.decorator;

public abstract class Beverage {

    String description;

    public String getDescription() {
        return description;
    }

    public abstract int cost();
}
