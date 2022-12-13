package com.OOP.patient;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Patient[] patient = new Patient[3];

        patient[0] = new Patient(4, "Kritskiy", "Ilya", "Sergeevich",
                "Kurchatova 6", "234234", 2, "cashel");
        patient[1] = new Patient(5, "Kuzmich", "Kirill", "Victorovich",
                "Bobruyskaya 8", "345345", 4, "perelom");
        patient[2] = new Patient(6, "Popov", "Nikita", "Yrievich", "Frunze 10",
                "454564", 5, "hromaet");

        PatientService patientService = new PatientService();

        System.out.println(Arrays.toString(patientService.getPatientWithDiagnosis(patient, "perelom")));
        System.out.println("------------");
        System.out.println(Arrays.toString(patientService.getPatientCardInDiapazone(patient, 1, 3)));
    }
}
