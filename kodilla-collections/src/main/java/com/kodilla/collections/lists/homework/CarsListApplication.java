package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.BMW;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mazda;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.collections.arrays.homework.CarUtils.describeCar;

public class CarsListApplication {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Mazda(160));
        cars.add(new BMW(180));
        cars.add(new Toyota(140));
        Car mazda = new Mazda(120);
        cars.add(mazda);

        System.out.println("============== Przed usuwaniem ==============");
        for (Car variousCars : cars) {
            describeCar(variousCars);
        }

        cars.remove(1);
        cars.remove(mazda);

        System.out.println("============== Po usuwaniu ==============");
        System.out.println("List size: " + cars.size());
        for (Car variousCars : cars) {
            describeCar(variousCars);
        }
    }
}