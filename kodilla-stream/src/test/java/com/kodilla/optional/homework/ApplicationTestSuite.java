package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.optional.homework.Application.checkTeacher;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ApplicationTestSuite {

    @Test
    void printUndefinedIfTeacherNull() {
        List<Student> testStudents = new ArrayList<>();
        testStudents.add(new Student("Harry", null));
        testStudents.add(new Student("Hagrid", null));

        String expectation = "uczeń: Harry, nauczyciel: <undefined>\n" + "uczeń: Hagrid, nauczyciel: <undefined>\n";

        assertEquals(expectation, checkTeacher(testStudents));
    }

    @Test
    void printTeacherIfPresent() {
        Teacher dumbledore = new Teacher("Dumbledore");
        Teacher mcgonagall = new Teacher("McGonagall");

        List<Student> testStudents = new ArrayList<>();
        testStudents.add(new Student("Harry", dumbledore));
        testStudents.add(new Student("Hagrid", mcgonagall));

        String expectation = "uczeń: Harry, nauczyciel: Dumbledore\n" + "uczeń: Hagrid, nauczyciel: McGonagall\n";

        assertEquals(expectation, checkTeacher(testStudents));
    }

    @Test
    void emptyStringIfEmptyList() {
        List<Student> testStudents = new ArrayList<>();

        String expectation = "";

        assertEquals(expectation, checkTeacher(testStudents));
    }

    @Test
    void emptyStudentName() {
        List<Student> testStudents = new ArrayList<>();
        testStudents.add(new Student(null, null));

        String expectation = "uczeń: null, nauczyciel: <undefined>\n";

        assertEquals(expectation, checkTeacher(testStudents));
    }
}