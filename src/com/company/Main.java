package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Sasha!");

        Multiplication function = new Multiplication();
        System.out.println(function.multiplication(4,5));
        System.out.println(function.multiplication(5,6));

        String1 string1 = new String1();
        System.out.println(string1.output());

        String2 string2 = new String2();
        System.out.println(string2.output());
    }
}
