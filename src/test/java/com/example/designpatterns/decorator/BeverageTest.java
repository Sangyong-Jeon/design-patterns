package com.example.designpatterns.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeverageTest {

    @Test
    void decoratorTest() {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " : " + espresso.cost());

        Beverage decaf = new Decaf();
        decaf = new Mocha(decaf);
        decaf = new Whip(decaf);
        System.out.println(decaf.getDescription() + " : " + decaf.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Milk(houseBlend);
        houseBlend = new Milk(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + " : " + houseBlend.cost());
    }

}