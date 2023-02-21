package com.kodilla.inheritance;

public class OperatingSystem {
    int premiereYear;

    public OperatingSystem(int premiereYear){
        this.premiereYear = premiereYear;
    }

    public void turnOn(){
        System.out.println("System is turning on");
    }

    public void turnOff(){
        System.out.println("System is turning off");
    }

    public int getPremiereYear(){
        return premiereYear;
    }

    public void whatYear(){
        System.out.println("Premiere was in: " + premiereYear);
    }
}