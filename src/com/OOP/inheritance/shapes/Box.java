package com.OOP.inheritance.shapes;

public class Box extends Shape{

    Shape[] arrayShapes = new Shape[3];

    public Box(double volume){
        super(volume);
    }

    public double add(Shape shape){
        return shape.getVolume();
    }


}
