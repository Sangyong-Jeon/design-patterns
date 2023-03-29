package com.example.designpatterns.delegate;

import static com.example.designpatterns.delegate.AnimalKind.*;

public class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("야옹");
    }

    @Override
    public AnimalKind getKind() {
        return CAT;
    }

    @Override
    public boolean isSameKind(AnimalKind kind) {
        return CAT.equals(kind);
    }
}
