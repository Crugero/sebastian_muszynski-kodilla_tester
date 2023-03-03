package com.kodilla.collections.interfaces;

public class Triangle implements Shape {

    private double width;
    private double height;
    private double hypotenuse;

    public Triangle(double v, double v1, double v2) {
        this.width = width;
        this.height = height;
        this.hypotenuse = hypotenuse;
    }
    @Override
    public double getArea() {
        return width + height + hypotenuse;
    }

    @Override
    public double getPerimeter() {
        return width * height / 2;
    }
}
