package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class School {

    private String name;
    private List<Integer> numberOfStudents = new ArrayList<>();

    public School(String name, List<Integer> numberOfStudents) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
    }

    public String getName() {
        return name;
    }

    public int countStudents() {    // [1]
        int sum = 0;            // [2]
        for (int students : numberOfStudents)  // [3]
            sum += students;
        return sum;
    }

        @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(name, school.name) && Objects.equals(numberOfStudents, school.numberOfStudents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numberOfStudents);
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", numberOfStudents=" + numberOfStudents +
                '}';
    }
}