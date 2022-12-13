package com.OOP.patient;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PatientServiceTest {

    Patient[] patients;

    @BeforeEach
    public void setUp(){
        patients[0] = new Patient(4, "Kritskiy", "Ilya", "Sergeevich",
                "Kurchatova 6", "234234", 2, "cashel");
    }

    @Test
    public void getPatientWithDiagnosisTest(){
        //String actual = getPatientWithDiagnosisTest();             //чет с проверить сервис у меня не получается
        String expected = patients[0].toString();

        //Assertions.assertEquals(expected, actual);
    }



}
