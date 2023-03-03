package com.kodilla.collections.interfaces.homework;

public class Mazda implements Car {

    private int speed;

    public Mazda() {
        this.speed = 0;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 120;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 70;
    }
}
