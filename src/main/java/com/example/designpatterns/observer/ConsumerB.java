package com.example.designpatterns.observer;

public class ConsumerB implements Observer {
    private String dataB;
    private Producer producer;

    public ConsumerB(Producer producer) {
        this.producer = producer;
        producer.registerObserver(this);
    }

    @Override
    public void update() {
        dataB = producer.getDataB();
        System.out.println("ConsumerB가 수정됨 : " + dataB);
    }
}
