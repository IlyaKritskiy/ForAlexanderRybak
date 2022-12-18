package com.OOP.inheritance.birds;

public class MotherHen extends Bird{

    @Override
    public void fly() {
        System.out.println("motherHen fly");
    }

    @Override
    public void sing() {
        System.out.println("motherHen sing");
    }

    @Override
    public void curryEggs() {
        System.out.println("motherHen curryEggs");
    }

    @Override
    public void hatchEggs() {
        System.out.println("motherHen hatchEggs");
    }
}
