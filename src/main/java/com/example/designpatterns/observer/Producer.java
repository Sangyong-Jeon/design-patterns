package com.example.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Producer implements Subject {
    private final List<Observer> observers;
    private String dataA;
    private String dataB;

    public Producer() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }

    public void setData(String dataA, String dataB) {
        this.dataA = dataA;
        this.dataB = dataB;
        notifyObservers();
    }

    public String getDataA() {
        return dataA;
    }

    public String getDataB() {
        return dataB;
    }
}
