package com.example.designpatterns.delegate;

import org.junit.jupiter.api.Test;

import static com.example.designpatterns.delegate.AnimalKind.*;
import static org.junit.jupiter.api.Assertions.*;

class AnimalDelegatorTest {

    @Test
    void test() {
        AnimalDelegator delegator = new AnimalDelegator();
        delegator.makeSound(CAT); // "야옹" 출력
        delegator.makeSound(DOG); // "멍멍" 출력
    }
}