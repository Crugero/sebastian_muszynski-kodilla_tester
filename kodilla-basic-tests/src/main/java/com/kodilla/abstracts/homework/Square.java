package com.kodilla.abstracts.homework;

public class Square extends Shape {
    public Square(double height, double width) {
        super(height, width);
    }

    @Override
    public double countPerimeter() {
        double perimeter = (2 * getHeight()) + (2 * getWidth());
        System.out.println("Perimeter of square is: " + perimeter);
        return perimeter;
    }

    @Override
    public double countField() {
        double field = 0.0;
        if (checkForEqualParameters()){
            field = getHeight() * getWidth();
            System.out.println("Field of square is: " + field);
        }
        return field;
    }
}