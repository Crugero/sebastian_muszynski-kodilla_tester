package com.kodilla.collections.interfaces.homework;

public class CarRace {

    public static void main(String[] args) {

        BMW bmw = new BMW();
        Toyota toyota = new Toyota();
        Mazda mazda = new Mazda();

        doRace(bmw);
        doRace(toyota);
        doRace(mazda);
    }

    public static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        System.out.println("Speed is: " + car.getSpeed());
    }
}