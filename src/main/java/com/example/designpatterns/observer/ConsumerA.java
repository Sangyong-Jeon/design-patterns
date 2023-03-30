package com.example.designpatterns.observer;

public class ConsumerA implements Observer {
    private String dataA;
    private Producer producer;

    public ConsumerA(Producer producer) {
        this.producer = producer;
        producer.registerObserver(this);
    }

    @Override
    public void update() {
        dataA = producer.getDataA();
        System.out.println("ConsumerA가 수정됨 : " + dataA);
    }
}
