package com.OOP.inter.firstInter;

import com.OOP.inter.firstInter.BaseConverter;

public class Main {

    public static void main(String[] args) {
        BaseConverter convert = new BaseConverter();

        System.out.println(convert.fromDegreesToFahrenheit(15.3));
        System.out.println(convert.fromDegreesToKelvins(26.5));
    }
}
