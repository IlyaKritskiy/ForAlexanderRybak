package com.OOP.inheritance.files;

public class TextFile extends File {

    @Override
    public void create() {
        System.out.println("textFile create");
    }

    @Override
    public void rename() {
        System.out.println("textFile rename");
    }

    @Override
    public void getData() {
        System.out.println("get data from textFile");
    }

    @Override
    public void addData() {
        System.out.println("add data into textFile");
    }

    @Override
    public void remove() {
        System.out.println("remove textFile");
    }
}
