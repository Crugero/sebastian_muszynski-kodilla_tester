package com.kodilla.abstracts.homework;

public class Application {

    public static void main(String[] args) {
        Shape squareBad = new Square(2,4);
        Shape rectangle = new Rectangle(3, 4);
        Shape squareGood = new Square(4,4);
        Shape circleBad = new Circle (1, 2);
        Shape circleGood = new Circle (4,4);

        squareBad.countField();
        rectangle.countPerimeter();
        squareGood.countField();
        squareGood.countPerimeter();
        circleBad.countField();
        circleBad.countPerimeter();
        circleGood.countField();
        circleBad.countPerimeter();
    }
}