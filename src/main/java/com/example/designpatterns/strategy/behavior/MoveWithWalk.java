package com.example.designpatterns.strategy.behavior;

public class MoveWithWalk implements MoveBehavior {
    @Override
    public void move() {
        System.out.println("걷고 있어요.");
    }
}
