package com.OOP.inheritance;

public class Main {
    public static void main(String[] args) {
        Shape[] arrayShapes = new Shape[3];
        arrayShapes[0] = new Circle(1,2);
        arrayShapes[1] = new Rectangle(3,4);
        arrayShapes[2] = new Circle(5,6);

        for(int i = 0; i < arrayShapes.length; i++){
            arrayShapes[i].draw();
        }
    }
}
