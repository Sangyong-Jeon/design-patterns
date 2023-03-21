package com.example.designpatterns.strategy;

import com.example.designpatterns.strategy.behavior.MoveBehavior;
import com.example.designpatterns.strategy.behavior.SoundBehavior;

public abstract class Dog {
    // 행동 인터페이스 형식의 참조 변수 2개 선언
    // 모든 서브 클래스에서 이 변수를 상속받음
    private MoveBehavior moveBehavior;
    private SoundBehavior soundBehavior;

    public Dog() {
    }

    public abstract void display();

    // 행동 클래스에 위임
    public void move() {
        moveBehavior.move();
    }

    // 행동 클래스에 위임
    public void sound() {
        soundBehavior.sound();
    }

    public void stand() {
        System.out.println("모든 강아지는 서있습니다.");
    }

    public void setMoveBehavior(MoveBehavior moveBehavior) {
        this.moveBehavior = moveBehavior;
    }

    public void setSoundBehavior(SoundBehavior soundBehavior) {
        this.soundBehavior = soundBehavior;
    }
}
