package com.OOP.bus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BusTest {

    Bus bus;

    @BeforeEach
    public void setUp(){
        bus = new Bus("jhbhjb", "vg3653465", 34, "yuyut", "2010", 1000 );
    }

    @Test
    public void getBusesByWayTest(){
        int actual = bus.getWayNumber();
        int expected = 34;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getBusesByYearTest(){
        String actual = bus.getYearStartUsing();
        String expected = "2010";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getBusesMoreDistanceTest(){
        int actual = bus.getDistance();
        int expected = 1000;

        Assertions.assertEquals(expected, actual);
    }
}