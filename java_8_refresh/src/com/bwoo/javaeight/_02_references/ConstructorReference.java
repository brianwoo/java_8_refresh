package com.bwoo.javaeight._02_references;

import org.junit.jupiter.api.Test;

public class ConstructorReference {

    interface Engine {
        EngineSound getEngineSound(String engineSound);
    }

    class EngineSound {
        public EngineSound(String engineSound) {
            System.out.println(engineSound);
        }
    }

    @Test
    public void testEngineSound() {
        // The EngineSound constructor has to have the same type of arg
        // as the functional interface.
        // The return type of the functional interface method needs
        // to be the same as the class of the ::new
        Engine engine = EngineSound::new;
        engine.getEngineSound("wrooom wrooom");
    }
}
