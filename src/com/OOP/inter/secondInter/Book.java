package com.OOP.inter.secondInter;

public class Book implements Printable{

    String nameBook;

    public Book(String nameBook){
        this.nameBook = nameBook;
    }

    @Override
    public void print() {
        System.out.println(nameBook);
    }

    public static void printBooks(Printable[] printable){
        for(int i = 0; i < printable.length; i++) {
            if(printable[i] instanceof Book){
                printable[i].print();
            }
        }
    }
}
