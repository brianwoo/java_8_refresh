package com.bwoo.javaeight._03_default_methods;

import org.junit.jupiter.api.Test;

public class DefaultMethod {

    interface FlyingObject {

        // The number of Default Methods don't affect the
        // Functional Interface
        default void takeOff() {
            System.out.println("Take off");
        }

        // Default methods are like methods in abstract classes.
        // advantage of default methods is that we can implement multiple interfaces
        // but we can extends only ONE abstract class.
        default void land() {
            System.out.println("Land....");
        }

        // Functional Interface
        String getDestination();
    }

    @Test
    void testDefaultMethod() {
        FlyingObject flyingObject = () -> "LAX Airport";
        flyingObject.takeOff();
        flyingObject.land();
        System.out.println("Dest: " + flyingObject.getDestination());
    }


}
