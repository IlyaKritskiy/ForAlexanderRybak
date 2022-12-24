package com.OOP.inter.thirdInter;

public class Guitar implements Instrument{

    int coutStrings;

    public Guitar(int coutStrings){
        this.coutStrings = coutStrings;
    }

    @Override
    public void play() {
        System.out.println("Playing guitar with " + coutStrings + " strings");
    }
}
