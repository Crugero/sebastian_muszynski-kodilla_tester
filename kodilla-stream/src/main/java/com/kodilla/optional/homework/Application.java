package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {

    public static void main(String[] args) {

        Teacher dumbledore = new Teacher("Dumbledore");
        Teacher mcgonagall = new Teacher("McGonagall");
        Teacher snape = new Teacher("Snape");

        List<Student> students = new ArrayList<>();

        students.add(new Student("Hermiona", dumbledore));
        students.add(new Student("Harry", null));
        students.add(new Student("Ron", mcgonagall));
        students.add(new Student("Draco", snape));
        students.add(new Student("Hagrid", null));

        System.out.println(checkTeacher(students));

    }

    public static String checkTeacher(List<Student> students) {
        String result = "";
        for (Student student : students) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            if (optionalTeacher.isPresent()) {
                result += "uczeń: " + student.getName() + ", " + "nauczyciel: " + optionalTeacher.get().getName() + "\n";
            } else {
                result += "uczeń: " + student.getName() + ", " + "nauczyciel: <undefined>\n";
            }
        }
        return result;
    }
}