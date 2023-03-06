package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;

import java.util.LinkedList;
import java.util.List;

public class GeneralShapesListApplication {

    public static void main(String[] args) {
        List<Shape> shapes = new LinkedList<>();
        Shape square1 = new Square(3);
        shapes.add(square1);
        shapes.add(new Triangle(10, 20, 10));
        shapes.add(new Circle(8));

        Triangle triangle = new Triangle(10,20,10);
        shapes.remove(triangle);

        for (Shape variousShapes : shapes) {
            System.out.println(variousShapes.toString() + " " + "Area: " + variousShapes.getArea() + " " + "Perimeter: " + variousShapes.getPerimeter());
        }
    }
}
