package com.io.Exercise;

import java.io.*;

public class Copy {
    public static void main(String[] args) {

        try(BufferedReader br = new BufferedReader(new FileReader("text.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("text2.txt"))){

            int i;
            do{
                i = br.read();
                if(i != -1){
                    bw.write(i);
                }
            }while(i != -1);

        } catch (IOException e){
            System.out.println("Error with input-output!");
        }
    }
}
