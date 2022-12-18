package com.OOP.inheritance.shapes;

public class Pyramid extends Shape {

    private double square;
    private double height;

    public Pyramid() {

    }

    public Pyramid(double square, double height) {
        super(0.33 * square * height);
        this.height = height;
        this.square = square;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
