package com.OOP.person;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person person;

    @BeforeEach
    public void setUp(){
        person = new Person("Kirill", 20);
    }

    @Test
    public void getFullName(){
        String actual = person.getFullName();
        String expected = "Kirill";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getAge(){
        int actual = person.getAge();
        int expected = 20;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void talk(){
        String actual = person.talk();
        String expected = "Kirill talk";

        Assertions.assertEquals(expected, actual);
    }

}