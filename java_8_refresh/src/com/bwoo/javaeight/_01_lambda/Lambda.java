package com.bwoo.javaeight._01_lambda;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Lambda {

    @Test
    public void testLambdaWithoutReturn() {
        // Because Runnable only has ONE method and declared as @FunctionalInterface,
        // we can use that as a lambda.
        Runnable r = () -> System.out.println("This is a runnable");
        r.run();
    }

    @Test
    public void testLambdaWithReturn() {
        // Because Runnable only has ONE method and declared as @FunctionalInterface,
        // ** ONE method in the interface is a FunctionalInterface **
        // we can use that as a lambda.
        Runnable r = () -> {
            return;
        };
        r.run();
    }

    interface CargoSpace {
        String content(int qty, String stuff);
    }

    @Test
    public void testLambdaWithArgs() {
        // One liner to return the string
        CargoSpace cargoSpace = (qty, stuff) -> "Qty: " + qty + " Stuff: " + stuff;
        // return in {}
        CargoSpace cargoSpace2 = (qty, stuff) -> {
            return "Qty2: " + qty + " Stuff2: " + stuff;
        };
        System.out.println(cargoSpace.content(1, "boat"));
        System.out.println(cargoSpace2.content(2, "bananas"));
    }

    @Test
    public void testLambdaListWithLoop() {
        List<String> langTypes = new ArrayList<>();
        langTypes.add("Java");
        langTypes.add("Kotlin");
        langTypes.add("GoLang");
        langTypes.add("Dart");

        // System.out::println - is called a method reference
        langTypes.forEach(System.out::println);
        langTypes.forEach(s -> {
            System.out.println("Lang is: " + s);
        });
    }
}
