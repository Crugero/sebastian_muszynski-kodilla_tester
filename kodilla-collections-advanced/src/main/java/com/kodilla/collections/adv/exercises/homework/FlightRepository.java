package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    private static List<Flight> flights = new ArrayList<>();

    static {
        flights.add(new Flight("Warszawa", "Kraków"));
        flights.add(new Flight("Kraków", "Warszawa"));
        flights.add(new Flight("Kraków", "Gdańsk"));
        flights.add(new Flight("Gdańsk", "Warszawa"));
        flights.add(new Flight("Warszawa", "Londyn"));
        flights.add(new Flight("Londyn", "Nowy Jork"));
    }

    public static List<Flight> getFlightsTable() {
        return flights;
    }
}