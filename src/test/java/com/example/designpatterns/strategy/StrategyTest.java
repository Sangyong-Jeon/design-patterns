package com.example.designpatterns.strategy;

import com.example.designpatterns.strategy.behavior.SoundToy;
import org.junit.jupiter.api.Test;

class StrategyTest {

    @Test
    void Bulldog() {
        Dog bulldog = new Bulldog();
        bulldog.move();
        bulldog.sound();
        // 장난감 소리로 변경하고 싶어요
        bulldog.setSoundBehavior(new SoundToy()); // 세터 메서드
        bulldog.sound();
    }
}