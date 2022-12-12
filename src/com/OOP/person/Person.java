package com.OOP.person;

public class Person {
    String fullName;
    int age;

    public Person(){

    }

    public Person(String fullName, int age){
        this.age = age;
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String talk(){
        return getFullName() + " talk";
    }

}
