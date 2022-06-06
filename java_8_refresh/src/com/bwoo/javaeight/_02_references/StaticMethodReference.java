package com.bwoo.javaeight._02_references;

import org.junit.jupiter.api.Test;

import java.util.function.BiFunction;

public class StaticMethodReference {

    interface NoiseMaker {
        void noise();
    }

    // Static method can be used as a method reference
    static void makeNoise() {
        System.out.println("blah blah blah.... loud!");
    }

    @Test
    void testMethodReference() {
        // Instead of implementing the interface and method,
        // We can simply implement the noise() with a method
        // reference
        NoiseMaker noiseMaker = StaticMethodReference::makeNoise;
        noiseMaker.noise();
    }

    static int someMath(int a, int b) { return (a+b) * 10;}

    @Test
    void testBiFunction() {
        // BiFunction is a function that takes 2 input and a return type.
        // In this case, 2 integer args and interger to return.
        BiFunction<Integer, Integer, Integer> func = StaticMethodReference::someMath;
        Integer result = func.apply(1, 2);
        System.out.println("Result: " + result);
    }
}
