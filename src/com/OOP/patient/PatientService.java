package com.OOP.patient;

public class PatientService {

    public Patient[] getPatientWithDiagnosis(Patient[] patients, String diagnosis){
        Patient[] resPatient = new Patient[patients.length];
        int index = 0;
        for (Patient patient : patients){
            if (patient.getDiagnosis().equals(diagnosis)){
                resPatient[index] = patient;
                index++;
            }
        }
        return resPatient;
    }

    public Patient[] getPatientCardInDiapazone(Patient[] patients, int startDiapazone, int endDiapazone){
        Patient[] resPatients = new Patient[patients.length];
        int index = 0;
        for(int i = 0; i < patients.length; i++){
            if(patients[i].getNumberMedicalCard() >= startDiapazone && patients[i].getNumberMedicalCard() <= endDiapazone){
                resPatients[i] = patients[i];
            }
        }
        return resPatients;
    }
}
