package com.example.designpatterns.decorator;

public class Decaf extends Beverage {

    public Decaf() {
        description = "디카페인";
    }

    @Override
    public int cost() {
        return 1500;
    }
}
