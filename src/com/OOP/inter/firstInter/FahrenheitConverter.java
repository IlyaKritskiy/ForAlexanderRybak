package com.OOP.inter.firstInter;

public interface FahrenheitConverter {

    double fromDegreesToFahrenheit(double degrees);

    void getWord();

    default void getName(){
        System.out.println("Surname");
    }
}
