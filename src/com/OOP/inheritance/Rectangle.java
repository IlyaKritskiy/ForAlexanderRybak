package com.OOP.inheritance;

import java.util.Objects;

public class Rectangle extends Shape{

    private int x;
    private int y;

    public Rectangle(){}

    public Rectangle(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Rectangle(int x, int y, String color){
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
        Rectangle rectangle = (Rectangle) o;
        return x == rectangle.x && y == rectangle.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), x, y);
    }
}
