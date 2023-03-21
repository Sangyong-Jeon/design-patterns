package com.example.designpatterns.strategy;

import com.example.designpatterns.strategy.behavior.MoveWithWalk;
import com.example.designpatterns.strategy.behavior.SoundDog;

public class Bulldog extends Dog {

    public Bulldog() {
        setMoveBehavior(new MoveWithWalk());
        setSoundBehavior(new SoundDog());
    }

    @Override
    public void display() {
        System.out.println("저는 불독입니다.");
    }
}
