package com.example.designpatterns.delegate;

import static com.example.designpatterns.delegate.AnimalKind.*;

public class Client {
    public static void main(String[] args) {
        AnimalDelegator delegator = new AnimalDelegator();
        delegator.makeSound(CAT); // "야옹" 출력
        delegator.makeSound(DOG); // "멍멍" 출력
    }
}
