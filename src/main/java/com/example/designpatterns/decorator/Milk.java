package com.example.designpatterns.decorator;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return beverage.cost() + 500;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 우유";
    }
}
