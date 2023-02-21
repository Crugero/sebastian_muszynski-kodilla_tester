package com.kodilla.inheritance;

public class Doors extends OperatingSystem {

    public Doors(int premiereYear){
        super(premiereYear);
    }

    @Override
    public void turnOn(){
        System.out.println("System is opening the doors");
    }

    @Override
    public void turnOff(){
        System.out.println("System is closing all doors");
    }
}