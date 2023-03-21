package com.example.designpatterns.strategy.behavior;

public class SoundNo implements SoundBehavior {
    @Override
    public void sound() {
        System.out.println("소리가 없어요.");
    }
}
