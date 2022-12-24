package com.OOP.inheritance.shapes;

public abstract class Shape {

    private double volume;

    public Shape(){

    }

    public Shape(double volume){
        this.volume = volume;
    }

    public void setVolume(double volume){
        this.volume = volume;
    }

    public double getVolume(){
        return volume;
    }
}
