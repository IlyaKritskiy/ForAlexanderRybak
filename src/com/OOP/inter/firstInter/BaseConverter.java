package com.OOP.inter.firstInter;

public class BaseConverter implements KelvinConverter, FahrenheitConverter {

    @Override
    public double fromDegreesToFahrenheit(double degrees) {
        return degrees * 1.8 + 32;
    }

    @Override
    public double fromDegreesToKelvins(double degrees) {
        return degrees + 273.15;
    }

    @Override
    public void getWord() {

    }

    @Override
    public void getName() {
        KelvinConverter.super.getName();
    }

}
