package com.OOP.person;

public class Main {
    public static void main(String[] args) {
        Person firstPerson = new Person();
        Person secondPerson = new Person("Kirill", 20);

        firstPerson.talk();
        secondPerson.talk();
    }
}
