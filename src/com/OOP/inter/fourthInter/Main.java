package com.OOP.inter.fourthInter;

public class Main {
    public static void main(String[] args) {

        Season[] seasons = Season.values();

        for (Season period : seasons) {
            System.out.println(period + " - " + period.getDescription());
        }

        LovePeriod lovePeriod = new LovePeriod();
        System.out.println(lovePeriod.getLovePeriod(Season.Summer));
    }
}
