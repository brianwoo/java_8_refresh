package com.bwoo.javaeight.dataobjs;

public class SpaceShip {
    private String model;
    private String captain;
    private int fuel;

    public SpaceShip(String model, String captain, int fuel) {
        this.model = model;
        this.captain = captain;
        this.fuel = fuel;
    }

    public SpaceShip() {
    }

    public void flyAway() {
        System.out.println("fly fly fly....");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCaptain() {
        return captain;
    }

    public void setCaptain(String captain) {
        this.captain = captain;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}
