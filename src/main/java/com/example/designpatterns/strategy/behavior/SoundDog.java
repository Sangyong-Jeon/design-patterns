package com.example.designpatterns.strategy.behavior;

public class SoundDog implements SoundBehavior {
    @Override
    public void sound() {
        System.out.println("왈왈!!");
    }
}
