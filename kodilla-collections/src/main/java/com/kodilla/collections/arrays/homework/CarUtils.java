package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.BMW;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mazda;
import com.kodilla.collections.interfaces.homework.Toyota;

public class CarUtils {

    public static void describeCar(Car car) {
        System.out.println("------------------------------------------");
        System.out.println("The car brand is: " + getNameOfCar(car));
        System.out.println("The speed of this car is: " + car.getSpeed() + "km/h");
    }

    private static String getNameOfCar(Car car) {
        if (car instanceof Toyota)
            return "Toyota";
        else if (car instanceof Mazda)
            return "Mazda";
        else if (car instanceof BMW)
            return "BMW";
        else
            return "There is no car like that";
    }
}
