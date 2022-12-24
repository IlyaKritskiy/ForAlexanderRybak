package com.OOP.inter.thirdInter;

public class Trampeter implements Instrument{

    double diameter;

    public Trampeter( double diameter){
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Playing guitar with " + diameter + " diameter");
    }
}
