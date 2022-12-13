package com.basic;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        //task4();
        //System.out.println("-----");
        //task5();
        //task6();
        //task7();
        //task8();
        //task91();
        //task93();
        //task95();
        //task97();
        task10();
    }

    public static void task1() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("-----");
        int i = 10;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
    }

    public static void task2() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("6 * " + i + " = " + 6 * i);
        }
    }

    public static void task3() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = in.nextInt();
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void task4() {
        for (int i = 1; i <= 1000; i += 2) {
            System.out.print(" " + i);
        }
    }


    public static void task5() {
        for (int i = 0; i <= 100; i += 7) {
            System.out.print(" " + i);
        }
    }

    public static void task6() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void task7() throws IOException {
        InputStreamReader scanner = new InputStreamReader(System.in);  //я хз как нормально вводить символ
        System.out.println("Input symbols. If you input dot('.') then loop will break");
        char symbols = (char) scanner.read();
        int amount = 0;
        while (true) {
            if (symbols == ' ') {
                amount++;
            } else if (symbols == '.') {
                break;
            } else {
                System.out.print(" - " + symbols);
            }
        }
    }

    public static void task8() {
        Scanner in = new Scanner(System.in);
        String answer;
        for (int i = 1; i <= 3; i++) {
            System.out.println("Введите ответ: ");
            answer = in.nextLine();
            if (answer.equals("Троллейбус")) {
                System.out.println("Правильно!");
                break;
            } else if (answer.equals("Сдаюсь")) {
                System.out.println("Правильный ответ: троллейбус");
                break;
            } else {
                System.out.println("Подумай еще.");
            }
        }
    }

    public static void task91() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = in.nextInt();
        System.out.print("Input b: ");
        int b = in.nextInt();
        double x;
        if (a > b) {
            x = a * b + 1;
        } else if (a == b) {
            x = 25;
        } else {
            x = (a - 5) / b;
        }
        System.out.println(x);
    }

    public static void task93() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = in.nextInt();
        System.out.print("Input b: ");
        int b = in.nextInt();
        double x;
        if (a > b) {
            x = (a * a - b) / b;
        } else if (a == b) {
            x = -5;
        } else {
            x = a / b + 5;
        }
        System.out.println(x);
    }

    public static void task95() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = in.nextInt();
        System.out.print("Input b: ");
        int b = in.nextInt();
        double x;
        if (a > b) {
            x = a / b - 1;
        } else if (a == b) {
            x = -25;
        } else {
            x = (a * a * a - 5) / a;
        }
        System.out.println(x);
    }

    public static void task97() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = in.nextInt();
        System.out.print("Input b: ");
        int b = in.nextInt();
        double x;
        if (a > b) {
            x = 5 * a + b;
        } else if (a == b) {
            x = -125;
        } else {
            x = (a - 5) / b;
        }
        System.out.println(x);
    }

    //дальше тоже самое, поэтому я решил не тратить время и делать другое задание

    public static void task10() {
        Scanner in = new Scanner(System.in);
        System.out.print("Choose equation: ");
        int equationNumber = in.nextInt();
        System.out.print("Input a: ");
        int a = in.nextInt();
        System.out.print("Input c: ");
        int c = in.nextInt();
        System.out.print("Input d: ");
        int d = in.nextInt();
        double y;
        switch (equationNumber) {
            case 1:
                y = (-2 * c + 82 * d) / Math.tan(a / 4 - 1);
                System.out.println("Solution: " + y);
                break;
            case 2:
                y = (Math.log(2 * c) + d - 52) / (a / 4 + 1);
                System.out.println("Solution: " + y);
                break;
            case 3:
                y = (Math.atan(c/4) - 62*d)/a*a-1;
                System.out.println("Solution: " + y);
                break;
            case 4:
                y = (-2*c - Math.log(d) + 53)/(a/4 -1);
                System.out.println("Solution: " + y);
                break;
            case 5:
                y = (2*c - Math.log(d/4))/(a*a-1);
                System.out.println("Solution: " + y);
                break;
            case 6:
                y = (Math.tan(c) - 23*d)/(2*a-1);
                System.out.println("Solution: " + y);
                break;
            case 7:
                y = (2*c - d/23)/Math.log(1-a/4);
                System.out.println("Solution: " + y);
                break;
            case 8:
                y = (4*c+d-1)/c- Math.tan(a/2);
                System.out.println("Solution: " + y);
                break;
            default:
                System.out.println("Error!");
                break;
        }
    }
}

