package com.OOP.phone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneTest {


    Phone phone;

   @BeforeEach
    public void setUp(){
       phone = new Phone("2445435", "iphone", 1.5);
   }

   @Test
    public void getNumberTest(){
       String actual = phone.getNumber();
       String expected = "2445435";

       Assertions.assertEquals(expected, actual);
   }

   @Test
    public void getModelTest(){
       String actual = phone.getModel();
       String expected = "iphone";

       Assertions.assertEquals(expected, actual);
   }

   @Test
    public void getWeightTest(){
       double actual = phone.getWeight();
       double expected = 1.5;

       Assertions.assertEquals(expected, actual);
   }
}