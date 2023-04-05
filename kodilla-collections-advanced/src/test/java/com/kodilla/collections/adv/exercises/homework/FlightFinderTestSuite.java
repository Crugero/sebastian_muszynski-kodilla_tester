package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.List;

class FlightFinderTestSuite {

    private static FlightRepository flightRepository;
    private static FlightFinder flightFinder;

    @BeforeAll
    static void init() {
        flightRepository = new FlightRepository();
        flightFinder = new FlightFinder(flightRepository.getFlightsTable());
    }

    @Test
    void testGetFlightsTable() {
        List<Flight> flights = flightRepository.getFlightsTable();
        Assertions.assertEquals(6, flights.size());
        Assertions.assertTrue(flights.contains(new Flight("Warszawa", "Kraków")));
        Assertions.assertTrue(flights.contains(new Flight("Kraków", "Warszawa")));
        Assertions.assertTrue(flights.contains(new Flight("Kraków", "Gdańsk")));
        Assertions.assertTrue(flights.contains(new Flight("Gdańsk", "Warszawa")));
        Assertions.assertTrue(flights.contains(new Flight("Warszawa", "Londyn")));
        Assertions.assertTrue(flights.contains(new Flight("Londyn", "Nowy Jork")));
    }

    @Test
    void testFindFlightsFrom() {
        List<Flight> flightsFromWarszawa = flightFinder.findFlightsFrom("Warszawa");
        Assertions.assertEquals(2, flightsFromWarszawa.size());
        Assertions.assertTrue(flightsFromWarszawa.contains(new Flight("Warszawa", "Kraków")));
        Assertions.assertTrue(flightsFromWarszawa.contains(new Flight("Warszawa", "Londyn")));

        List<Flight> flightsFromKrakow = flightFinder.findFlightsFrom("Kraków");
        Assertions.assertEquals(2, flightsFromKrakow.size());
        Assertions.assertTrue(flightsFromKrakow.contains(new Flight("Kraków", "Gdańsk")));
        Assertions.assertTrue(flightsFromKrakow.contains(new Flight("Kraków", "Warszawa")));

        List<Flight> flightsFromGdansk = flightFinder.findFlightsFrom("Gdańsk");
        Assertions.assertEquals(1, flightsFromGdansk.size());
        Assertions.assertTrue(flightsFromGdansk.contains(new Flight("Gdańsk", "Warszawa")));
    }

    @Test
    void testFindFlightsTo() {
        List<Flight> flightsToWarszawa = flightFinder.findFlightsTo("Warszawa");
        Assertions.assertEquals(2, flightsToWarszawa.size());
        Assertions.assertTrue(flightsToWarszawa.contains(new Flight("Gdańsk", "Warszawa")));
        Assertions.assertTrue(flightsToWarszawa.contains(new Flight("Kraków", "Warszawa")));

        List<Flight> flightsToKrakow = flightFinder.findFlightsTo("Kraków");
        Assertions.assertEquals(1, flightsToKrakow.size());
        Assertions.assertTrue(flightsToKrakow.contains(new Flight("Warszawa", "Kraków")));

        List<Flight> flightsToGdansk = flightFinder.findFlightsTo("Gdańsk");
        Assertions.assertEquals(1, flightsToGdansk.size());
        Assertions.assertTrue(flightsToGdansk.contains(new Flight("Kraków", "Gdańsk")));
    }
}