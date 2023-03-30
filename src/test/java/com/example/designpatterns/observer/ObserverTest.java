package com.example.designpatterns.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ObserverTest {

    @Test
    void start() {
        Producer producer = new Producer();
        ConsumerA consumerA = new ConsumerA(producer);
        ConsumerB consumerB = new ConsumerB(producer);

        producer.setData("AAA", "BBB");

        producer.removeObserver(consumerA); // consumerA 옵저버 제거

        producer.setData("CCC", "DDD");
    }
}