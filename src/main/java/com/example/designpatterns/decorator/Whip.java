package com.example.designpatterns.decorator;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return beverage.cost() + 500;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 휘핑";
    }
}
