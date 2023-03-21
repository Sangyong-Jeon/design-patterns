package com.example.designpatterns.strategy.behavior;

public class SoundToy implements SoundBehavior {
    @Override
    public void sound() {
        System.out.println("삑");
    }
}
