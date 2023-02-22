package com.kodilla.abstracts.homework;

public class Circle extends Shape{

    static final double PI = 3.1415927;

    public Circle(double height, double width) {
        super(height, width);
    }

    @Override
    public double countPerimeter() {
        double radius = 0.5 * getHeight();
        double perimeter = 0.0;
        if (checkForEqualParameters()) {
            perimeter = (radius * radius) * PI;
            System.out.println("Perimeter of the circle is: " + perimeter);
        }
        return perimeter;
    }

    @Override
    public double countField() {
        double field = 0.0;
        double radius = 0.5 * getHeight();
        if (checkForEqualParameters()) {
            field = 2 * PI * radius;
            System.out.println("Perimeter of the circle is: " + field);
        }
        return field;
    }
}