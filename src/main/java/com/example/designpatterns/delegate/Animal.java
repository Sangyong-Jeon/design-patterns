package com.example.designpatterns.delegate;

public interface Animal {
    void makeSound();

    AnimalKind getKind();

    boolean isSameKind(AnimalKind kind);
}
