package com.io.Exercise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) throws IOException {

        try(FileInputStream fileIn = new FileInputStream("file.txt");
            FileOutputStream fileOut = new FileOutputStream("text.txt", true)){

            int a;
            while((a = fileIn.read()) != -1){
                fileOut.write(a);
            }
        } catch (IOException e){
            System.out.println("Error input-output!");
        }
    }
}
