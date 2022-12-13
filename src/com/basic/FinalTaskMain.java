package com.basic;

import java.util.Arrays;
import java.util.Scanner;

public class FinalTaskMain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[20];
        int index = 0;
        boolean isWork = true;

        while (isWork) {

            char t;
            System.out.println("1 - Add number to array");
            System.out.println("2 - Delete number from array");
            System.out.println("3 - Check numbers in array");
            System.out.println("0 - Exit");
            System.out.print("Input number from menu: ");
            t = in.next().charAt(0);

            switch (t) {
                case '1':
                    if (index >= 20) {
                        System.out.println("\nArray is full! If you want add new number you should remove " +
                                "one of elements from array!\n");
                    } else {
                        System.out.print("Input number: ");
                        int number = in.nextInt();
                        for (int i = 0; true; i++ ) {
                            if (array[i] != number) {
                                array[index] = number;
                                break;
                            }
                            else {
                                System.out.println("\nYou should input unique number!\n");
                                index--;
                                break;
                            }
                        }
                        index++;
                    }
                    break;
                case '2':
                    System.out.print("Input number that you want remove: ");
                    int number = in.nextInt();
                    int flag1 = 0;
                    int flag2 = 0;
                    for (int i = 0; i < array.length; i++) {
                        if (array[i] == number){
                            array[i] = 0;
                        }
                        else if(array[i] == 0){
                            flag1++;
                            if(flag1 == 20) {
                                System.out.println("\nYou can't remove number becouse array is empty!\n");

                            }
                        }
                        else if(array[i] != number && array[i] != 0) {
                            flag2++;
                            if(flag2 == 20) {
                                System.out.println("\nArray haven't this number!\n");
                            }
                        }
                    }
                    break;
                case '3':
                    System.out.println(Arrays.toString(array));
                    break;

                case '0':
                    isWork = false;
                    break;

                default:
                    System.out.println("\nError! Input number from menu!\n");
            }
        }
    }
}
