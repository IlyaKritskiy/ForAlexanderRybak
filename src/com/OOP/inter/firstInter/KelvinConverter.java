package com.OOP.inter.firstInter;

public interface KelvinConverter {

    double fromDegreesToKelvins(double degrees);

    void getWord();

    default void getName(){
        System.out.println("Name");
    }

}
