package com.OOP.inheritance;

import java.util.Objects;

public class Circle extends Shape{

    private int x;
    private int y;

    public Circle(){}

    public Circle(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Circle(int x, int y, String color){
        super(color);
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    @Override
    public void draw() {
        System.out.println(x + " " + y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return x == circle.x && y == circle.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), x, y);
    }
}
