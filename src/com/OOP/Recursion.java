package com.OOP;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input A: ");
        int a = in.nextInt();
        System.out.print("Input B: ");
        int b = in.nextInt();
        if(a<b){
            recursionInputAlessB(b, a);
        }else if (a>b){
            recursionInputAmoreB(b, a);
        } else {
            System.out.println("error!");
        }
    }

    public static void recursionInputAlessB(int b, int a){
        if(a!=b+1){
            System.out.print(a + " ");
            recursionInputAlessB(b, a+1);
        }
    }
    public static void recursionInputAmoreB(int b, int a){
        if(a!=b-1){
            System.out.print(a + " ");
            recursionInputAmoreB(b, a-1);
        }
    }
}
