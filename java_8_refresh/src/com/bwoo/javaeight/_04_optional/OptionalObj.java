package com.bwoo.javaeight._04_optional;

import org.junit.jupiter.api.Test;

import java.util.Optional;

public class OptionalObj {

    @Test
    void testOptional() {
        Optional<String> msg = Optional.empty();
        System.out.println("is present: " + msg.isPresent());
        String result = msg.orElse("no message is present");
        System.out.println(result);

        msg = Optional.of("Hi there!");
        String result2 = msg.orElse("no message is present");
        System.out.println(result2);

        // NOTE: it's not a good practice to pass an Optional obj to
        // a method as a parameter.
        // https://rules.sonarsource.com/java/RSPEC-3553
    }
}
