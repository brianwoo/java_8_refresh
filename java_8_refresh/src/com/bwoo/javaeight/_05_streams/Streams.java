package com.bwoo.javaeight._05_streams;

import com.bwoo.javaeight.dataobjs.SpaceShip;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

    List<SpaceShip> getSpaceShips() {
        List<SpaceShip> ships = new ArrayList<>();
        ships.add(new SpaceShip("Round", "Mike", 50));
        ships.add(new SpaceShip("Pyramid", "Susan", 150));
        ships.add(new SpaceShip("Cube", "Elon", 43));
        ships.add(new SpaceShip("Cone", "Bill", 64));
        ships.add(new SpaceShip("Stork", "Steve", 23));
        ships.add(new SpaceShip("Owl", "Larry", 67));
        return ships;
    }

    @Test
    void testStreams() {
        List<SpaceShip> ships = getSpaceShips();
        List<String> captains = ships.stream()
                .filter(spaceShip -> spaceShip.getFuel() >= 50)
                .map(spaceShip -> spaceShip.getCaptain())
                .sorted((captain1, captain2) -> captain1.compareTo(captain2))
                .collect(Collectors.toList());

        captains.forEach(System.out::println);
    }

    @Test
    void testParallelStreams() {
        List<SpaceShip> ships = getSpaceShips();
        List<String> captains = ships.parallelStream()
                .filter(spaceShip -> spaceShip.getFuel() >= 50)
                .map(spaceShip -> spaceShip.getCaptain())
                .sorted((captain1, captain2) -> captain1.compareTo(captain2))
                .collect(Collectors.toList());

        captains.forEach(System.out::println);
    }
}
