package com.io.Exercise;

import java.io.*;

public class FileInputOutputDemo {
    public static void main(String[] args){

        char[] symbols = {'a', 'b', 'c', 'd', 'f'};
        try(OutputStream output = new FileOutputStream("a.txt", true);
            InputStream input = new FileInputStream("a.txt")){

            for(char symbol : symbols){
                output.write(symbol);
            }

            int size = input.available();

            for (int i = 0; i < size; i++){
                System.out.print((char) input.read() + " ");
            }
        } catch (IOException e){
            System.out.println("Error with input-output");
        }
    }
}
