package com.bwoo.javaeight._02_references;

import com.bwoo.javaeight.dataobjs.SpaceShip;
import org.junit.jupiter.api.Test;

public class InstanceMethodReference {

    interface DoSomething {
        void doStuff();
    }

    @Test
    void testInstanceMethodRef() {
        SpaceShip spaceShip = new SpaceShip();
        DoSomething doSomething = spaceShip::flyAway;
        doSomething.doStuff();
    }
}
