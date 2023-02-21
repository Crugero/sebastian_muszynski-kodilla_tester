package com.kodilla.inheritance;

public class Mirrors extends OperatingSystem {

    public Mirrors(int premiereYear){
        super(premiereYear);
    }

    @Override
    public void turnOn(){
        System.out.println("System is turning on lights so You can use mirrors");
    }

    @Override
    public void turnOff(){
        System.out.println("System is turning off lights so You won't see mirrors");
    }

}
