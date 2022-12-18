package com.OOP.inheritance.shapes;

public class Ball extends SolidOfRevolution{

    public Ball(){}

    public Ball(double radius){
        super(radius, Math.PI*Math.pow(radius, 3));
    }

}
