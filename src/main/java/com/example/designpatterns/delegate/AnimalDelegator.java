package com.example.designpatterns.delegate;

import java.util.ArrayList;
import java.util.List;

public class AnimalDelegator {
    private final List<Animal> animals;

    public AnimalDelegator() {
        animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Dog());
    }

    public void makeSound(AnimalKind kind) {
        animals.stream()
                .filter(animal -> animal.isSameKind(kind))
                .forEach(Animal::makeSound);
    }
}
