package com.OOP.inheritance.shapes;

public abstract class SolidOfRevolution extends Shape {

    private double radius;

    public SolidOfRevolution(){

    }

    public SolidOfRevolution(double radius){
        this.radius = radius;
    }

    public SolidOfRevolution(double radius, double volume){
        super(volume);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
