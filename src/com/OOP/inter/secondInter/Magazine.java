package com.OOP.inter.secondInter;

public class Magazine implements Printable{

    String nameMagazine;

    public Magazine(String nameMagazine){
        this.nameMagazine = nameMagazine;
    }

    @Override
    public void print() {
        System.out.println(nameMagazine);
    }

    public static void printMagazines(Printable[] printable){
        for(int i = 0; i < printable.length; i++) {
            if(printable[i] instanceof Magazine){
                printable[i].print();
            }
        }
    }
}
