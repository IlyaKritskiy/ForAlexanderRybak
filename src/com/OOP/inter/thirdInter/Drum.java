package com.OOP.inter.thirdInter;

public class Drum implements Instrument{

    double size;

    public Drum( double size){
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Playing drum with " + size + " size");
    }
}
