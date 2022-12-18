package com.OOP.inheritance.birds;

public class Sparrow extends Bird {
    @Override
    public void fly() {
        System.out.println("Sparrow fly");
    }

    @Override
    public void sing() {
        System.out.println("Sparrow sing");
    }

    @Override
    public void curryEggs() {
        System.out.println("Sparrow curry eggs");
    }

    @Override
    public void hatchEggs() {
        System.out.println("Sparrow hatch eggs");
    }
}
