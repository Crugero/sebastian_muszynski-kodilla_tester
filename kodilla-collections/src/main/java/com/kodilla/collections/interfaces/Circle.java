package com.kodilla.collections.interfaces;

public class Circle implements Shape {

    private double radius;
    final static double PI = 3.14;

    public Circle (double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * PI * radius;
    }
}
