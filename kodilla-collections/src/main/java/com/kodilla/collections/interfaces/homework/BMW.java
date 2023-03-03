package com.kodilla.collections.interfaces.homework;

public class BMW implements Car {

    private int speed;

    public BMW() {
        this.speed = 0;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 100;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 80;
    }
}
