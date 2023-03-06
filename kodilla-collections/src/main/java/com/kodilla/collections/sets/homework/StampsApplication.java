package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {

    public static void main(String[] args) {

        Set<Stamp> stamps = new HashSet<>();

        stamps.add(new Stamp("Nergal", "3x4", true));
        stamps.add(new Stamp("Peter", "4x4", false));
        stamps.add(new Stamp("Orion", "3x4", true));
        stamps.add(new Stamp("Nergal", "3x4", true));
        stamps.add(new Stamp("Nergal", "3x4", true));
        stamps.add(new Stamp("Nergal", "3x4", true));

        System.out.println("Size of the stamps collection is: " + stamps.size());
        for (Stamp variousStamps : stamps) {
            System.out.println(variousStamps.toString());
        }
    }
}
