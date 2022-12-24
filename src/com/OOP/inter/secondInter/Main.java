package com.OOP.inter.secondInter;

public class Main {
    public static void main(String[] args) {
        Printable[] array = new Printable[5];
        array[0] =  new Magazine("BBC");
        array[1] = new Magazine("Maxim");
        array[2] = new Book("Tihiy Don");
        array[3] = new Book("Lydi na bolote");
        array[4] = new Magazine("Belarus");

        for(int i = 0; i < array.length; i++){
            array[i].print();

        }
        System.out.println("------");
        Magazine.printMagazines(array);
        System.out.println("-------");
        Book.printBooks(array);
    }
}
