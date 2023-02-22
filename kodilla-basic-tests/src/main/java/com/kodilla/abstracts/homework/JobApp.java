package com.kodilla.abstracts.homework;

public class JobApp {

    public static void main(String[] args) {

        Lawyer lawyer = new Lawyer();
        Doctor doctor = new Doctor();
        Musician musician = new Musician();

        Person marcin = new Person("Marcin", 25, musician);
        Person rafal = new Person("Rafał", 30, doctor);
        Person tomek = new Person("Tomek", 34, lawyer);

        marcin.displayResponsibilities();
        rafal.displayResponsibilities();
        tomek.displayResponsibilities();
    }
}
