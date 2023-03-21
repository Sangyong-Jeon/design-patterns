package com.example.designpatterns.strategy.behavior;

public class MoveNoWalk implements MoveBehavior{
    @Override
    public void move() {
        System.out.println("못걸어요.");
    }
}
