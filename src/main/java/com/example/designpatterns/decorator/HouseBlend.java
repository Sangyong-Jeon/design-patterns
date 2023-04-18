package com.example.designpatterns.decorator;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "하우스 블렌드 커피";
    }

    @Override
    public int cost() {
        return 1500;
    }
}
