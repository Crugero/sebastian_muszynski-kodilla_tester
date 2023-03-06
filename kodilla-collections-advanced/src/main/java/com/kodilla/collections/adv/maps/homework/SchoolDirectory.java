package com.kodilla.collections.adv.maps.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {

    public static void main(String[] args) {

        Map<Principal, School> directory = new HashMap<>();

        Principal jerzyKryszak = new Principal("Jerzy", "Kryszak");
        Principal nergalDarski = new Principal("Nergal", "Darski");
        Principal philAnselmo = new Principal("Philip", "Anselmo");

        School siodemka = new School("Super Szkoła Czegos", Arrays.asList(25, 24, 24, 25, 25));
        School osemka = new School("Szkoła Czegos Innego", Arrays.asList(20, 19, 15, 10, 15));
        School dziewiatka = new School("Strasznie slaba szkola", Arrays.asList(10, 8, 6, 5, 6));

        directory.put(jerzyKryszak, osemka);
        directory.put(nergalDarski, dziewiatka);
        directory.put(philAnselmo, siodemka);


        for (Map.Entry<Principal, School> schoolPrincipal : directory.entrySet()) {
            System.out.println(schoolPrincipal.getKey().getName() + " " + schoolPrincipal.getKey().getSurname() + " is the principal of the " + schoolPrincipal.getValue().getName() + " which has " + schoolPrincipal.getValue().countStudents() + " students.");
        }
    }
}
