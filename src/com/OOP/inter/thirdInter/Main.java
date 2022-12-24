package com.OOP.inter.thirdInter;

public class Main {
    public static void main(String[] args) {

        Instrument[] instrument = new Instrument[5];

        instrument[0] = new Guitar(6);
        instrument[1] = new Guitar(5);
        instrument[2] = new Drum(4);
        instrument[3] = new Trampeter(10.5);
        instrument[4] = new Trampeter(11.25);

        for (int i = 0; i < instrument.length; i++){
            instrument[i].play();
        }

    }
}
