package com.OOP.inter.fourthInter;

public class LovePeriod {

    String lovePeriod = "";

    public String getLovePeriod(Season period){
        switch (period){
            case Summer:
                lovePeriod = "I love summer";
                break;
            case Autumn:
                lovePeriod = "I love autumn";
                break;
            case Winter:
                lovePeriod = "I love winter";
                break;
            case Spring:
                lovePeriod = "I love spring";
                break;
        }
        return lovePeriod;
    }
}
