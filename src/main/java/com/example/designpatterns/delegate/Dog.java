package com.example.designpatterns.delegate;

import static com.example.designpatterns.delegate.AnimalKind.*;

public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("멍멍");
    }

    @Override
    public AnimalKind getKind() {
        return DOG;
    }

    @Override
    public boolean isSameKind(AnimalKind kind) {
        return DOG.equals(kind);
    }
}
