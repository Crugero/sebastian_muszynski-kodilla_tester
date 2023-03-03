package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.BMW;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mazda;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.Random;

import static com.kodilla.collections.arrays.homework.CarUtils.describeCar;

public class CarsApplication {

    public static void main(String[] args) {

        Random randomSize = new Random();
        int numberOfCars = randomSize.nextInt(15) + 1;
        Car[] cars = new Car[numberOfCars];
        int k;
        for (k = 0; k < cars.length; k++) {
            cars[k] = drawCar();
            describeCar(cars[k]);
        }
    }

    private static Car drawCar() {
        Random randomCar = new Random();
        int carBrand = randomCar.nextInt(3);
        int newSpeed = randomizeSpeed(randomCar);
        if (carBrand == 0)
            return new Toyota(newSpeed);
        else if (carBrand == 1)
            return new Mazda(newSpeed);
        else
            return new BMW(newSpeed);
    }

    private static int randomizeSpeed(Random random) {
        return random.nextInt(241);
    }
}