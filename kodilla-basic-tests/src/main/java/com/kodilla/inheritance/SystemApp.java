package com.kodilla.inheritance;

public class SystemApp {

    public static void main(String[] args){
        OperatingSystem operatingSystem = new OperatingSystem(2015);
        Doors doors = new Doors(2022);
        Mirrors mirrors = new Mirrors(2019);

        operatingSystem.turnOn();

        doors.turnOn();
        doors.turnOff();
        doors.whatYear();

        mirrors.turnOn();
        mirrors.whatYear();
    }
}