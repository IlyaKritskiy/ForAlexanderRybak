package com.basic;

import java.util.Arrays;
import java.util.Scanner;

public class StringsAndArrays {
    public static void main(String[] args) {
        //maxNumber();
        //stringTask1();
        //test();
        //stringTask3();
        //stringTask4();
        //stringTask5();
        //stringTask6();
        //stringTask7();
        //stringTask8();
        //stringTask9();
        //stringTask10();
        //stringTask11();
        stringTask12();
    }

    public static void arrayTask1() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input amount numbers: ");
        int amount = in.nextInt();

        int[] arrayNumbers = new int[amount];
        for (int i = 0; i < amount; i++) {
            System.out.print("Input number: ");
            arrayNumbers[i] = in.nextInt();
        }

        int maxNumber = arrayNumbers[0];
        int count = 0;
        for (int i = 0; i < amount; i++) {
            if (arrayNumbers[i] > maxNumber) {
                maxNumber = arrayNumbers[i];
                count = 1;
            } else if (arrayNumbers[i] == maxNumber) {
                count++;
            }
        }
        System.out.println(maxNumber + " - " + count);
    }


    public static void stringTask1() {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        char[] arraySymbols = string.toCharArray();
        for (int i = 0; i < arraySymbols.length; i++) {
            arraySymbols[i] = (char) (arraySymbols[i] + 3);
        }
        String stringShifr = new String(arraySymbols);
        System.out.println(stringShifr);
    }

    /*
    public static void test(){
        int[] array = {1,2,3,4,5};
        for(int x: array){
            x = 10;
        }
        System.out.print(Arrays.toString(array) + " ");
    }

     */
    public static void stringTask3() {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        char[] arraySymbols = string.toCharArray();
        for (int i = 0; i < arraySymbols.length; i += 2) {
            if (i == arraySymbols.length - 1) {
                break;
            }
            char buffer = arraySymbols[i];
            arraySymbols[i] = arraySymbols[i + 1];
            arraySymbols[i + 1] = buffer;
        }
        String changeString = new String(arraySymbols);
        System.out.println(changeString);
    }

    public static void stringTask4() {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        //char[] arraySymbols = string.toCharArray();
        String[] arrayString = string.split(" ");
        for (int i = 0; i < arrayString.length; i++) {
            char[] arraySymbols = arrayString[i].toCharArray();
            char buffer = arraySymbols[0];
            arraySymbols[0] = arraySymbols[arraySymbols.length - 1];
            arraySymbols[arraySymbols.length - 1] = buffer;

            arrayString[i] = new String(arraySymbols);
        }
        String changeString = String.join(" ", arrayString);
        System.out.println(changeString);
    }

    public static void stringTask5() {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();

        System.out.print("Input index: ");
        int index = in.nextInt();

        System.out.print("Input symbol: ");
        char sybol = in.next().charAt(0);

        char[] arraySybols = string.toCharArray();
        arraySybols[index] = sybol;
        String changeString = new String(arraySybols);
        System.out.println(changeString);
    }

    public static void stringTask6() {
        Scanner in = new Scanner(System.in);
        System.out.println("input string: ");
        String string = in.nextLine();

        System.out.print("Input symbol: ");
        char sybol = in.next().charAt(0);
        int amount = 0;

        char[] arraySymbols = string.toCharArray();
        for (int i = 0; i < arraySymbols.length; i++) {
            if (arraySymbols[i] == sybol) {
                System.out.print(i+1 + " ");
                amount++;
            }
        }
        System.out.println("\namount =" + amount);
    }

    public static void stringTask7() {
        Scanner in = new Scanner(System.in);
        System.out.println("input string: ");
        String string = in.nextLine();

        String stringTrim = string.trim();
        String[] arrayString = stringTrim.split(" +");
        long result = Arrays.stream(arrayString).count();
        System.out.println(result);
    }

    public static void stringTask8() {
        Scanner in = new Scanner(System.in);
        System.out.println("input string: ");
        String string = in.nextLine();

        String stringTrim = string.trim();
        String[] arrayStrings = stringTrim.split(" +");
        String longWord = arrayStrings[0];
        int amountSymbols = 0;

        for (int i = 0; i < arrayStrings.length; i++){
            if(arrayStrings[i].length() > longWord.length()){
                longWord = arrayStrings[i];
                amountSymbols = arrayStrings[i].length();
            }
        }
        System.out.println(longWord + " - " + amountSymbols );
    }

    public static void stringTask9() {
        Scanner in = new Scanner(System.in);
        System.out.println("input string: ");
        String string = in.nextLine();

        String stringTrim = string.trim();
        String[] arrayStrings = stringTrim.split(" +");

        String bufffer = arrayStrings[0];
        arrayStrings[0] = arrayStrings[arrayStrings.length-1];
        arrayStrings[arrayStrings.length-1] = bufffer;

        String changeString = String.join(" ", arrayStrings);
        System.out.println(changeString);

    }

    public static void stringTask10() {
        Scanner in = new Scanner(System.in);
        System.out.println("input string: ");
        String string = in.nextLine();

        String stringTrim = string.trim();
        String[] arrayStrings = stringTrim.split(" +");
        String shortWord = arrayStrings[0];
        int amountSymbols = 0;
        int index = 0 ;

        for (int i = 0; i < arrayStrings.length; i++){
            if(arrayStrings[i].length() <= shortWord.length()){
                shortWord = arrayStrings[i];
                amountSymbols = arrayStrings[i].length();
                index = i + 1 ;
            }
        }
        System.out.println("ShortWord index: " + index + " - " + amountSymbols + " symbols" );
    }


    public static void stringTask11() {
        Scanner in = new Scanner(System.in);
        System.out.println("input string: ");
        String string = in.nextLine();

        String stringTrim = string.trim();
        String[] arrayStrings = stringTrim.split(" +");

        for (int i = 0; i < arrayStrings.length; i++){
            char[] arraySymbols = arrayStrings[i].toCharArray();
            arraySymbols[0] = (char)(arraySymbols[0] - 32);
            arrayStrings[i] = Arrays.toString(arraySymbols);
        }
        String changeString = String.join(" ", arrayStrings);
        System.out.println(changeString);               //хз как в строку перевести, все вроде попробовал - не выходит
    }

    public static void stringTask12() {
        Scanner in = new Scanner(System.in);
        System.out.println("input string: ");
        String string = in.nextLine();
        int amount = 0;

        char[] arraySymbols = string.toCharArray();

        for(int i = 0; i < arraySymbols.length; i++){
            for (int j = arraySymbols.length-1; j >= i; j--){
                if(arraySymbols[i] == arraySymbols[j]){
                    amount++;
                }
            }
            System.out.print(arraySymbols[i] + ": " + amount + "\t");
        }
    }
}
