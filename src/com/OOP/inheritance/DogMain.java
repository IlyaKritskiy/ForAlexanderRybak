package com.OOP.inheritance;

public class DogMain {
    public static void main(String[] args) {
        Animal puppy = new Puppy("Georg");

        puppy.getName();
        ((Puppy)puppy).voice();
        ((Puppy)puppy).run();
        ((Dog)puppy).jump();
        ((Dog)puppy).bite();

    }
}
