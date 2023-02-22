package com.kodilla.abstracts.homework;

public abstract class Shape {

    private double height;
    private double width;

    public Shape (double height, double width){
        this.height = height;
        this.width = width;
    }

    public double getHeight(){
        return height;
    }

    public double getWidth(){
        return width;
    }

    public boolean checkForEqualParameters(){
        if (getHeight() != getWidth()){
            System.out.println("Wrong parameters for the figure.");
            return false;
        } else {
            return true;
        }
    }

    public abstract double countPerimeter();

    public abstract double countField();
}