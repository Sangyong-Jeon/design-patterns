package com.example.designpatterns.strategy;

import com.example.designpatterns.strategy.behavior.MoveWithWalk;
import com.example.designpatterns.strategy.behavior.SoundToy;

public class ToyDog extends Dog {

    public ToyDog() {
        setMoveBehavior(new MoveWithWalk());
        setSoundBehavior(new SoundToy());
    }

    @Override
    public void display() {
        System.out.println("저는 장난감 강아지입니다.");
    }
}
