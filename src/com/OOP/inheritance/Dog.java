package com.OOP.inheritance;

public class Dog extends Animal{

    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    public void voice(){
        System.out.println("gav-gav");
    }

    public void jump(){
        System.out.println("jump");
    }

    public void run(){
        System.out.println("run");
    }

    public void bite(){
        System.out.println("bite");
    }
}
