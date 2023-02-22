package com.kodilla.abstracts.homework;

public class Rectangle extends Shape{
    public Rectangle(double height, double width) {
        super(height, width);
    }

    @Override
    public double countPerimeter() {
        double perimeter = (2 * getHeight()) + (2 * getWidth());
        System.out.println("Perimeter of the rectangle is: " + perimeter);
        return perimeter;
    }

    @Override
    public double countField() {
        double field = getHeight() * getWidth();
        System.out.println("Field of the rectangle is: " + field);
        return field;
    }
}