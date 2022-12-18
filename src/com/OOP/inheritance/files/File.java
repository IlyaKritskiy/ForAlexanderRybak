package com.OOP.inheritance.files;

public class File extends Directory{
    @Override
    public void create() {
        System.out.println("file create");
    }

    @Override
    public void rename() {
        System.out.println("file rename");
    }

    @Override
    public void getData() {
        System.out.println("get data from file");
    }

    @Override
    public void addData() {
        System.out.println("add data into file");
    }

    @Override
    public void remove() {
        System.out.println("remove file");
    }
}
