package com.OOP.patient;

public class Patient {

    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String adress;
    private String phone;
    private int numberMedicalCard;
    private String diagnosis;

    public Patient(){}

    public Patient(int id, String surname, String name, String patronymic, String adress, String phone,
                   int numberMedicalCard, String diagnosis){
        this.id = id;
        this.surname= surname;
        this.name = name;
        this.patronymic = patronymic;
        this.adress = adress;
        this.phone = phone;
        this.numberMedicalCard = numberMedicalCard;
        this.diagnosis = diagnosis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getNumberMedicalCard() {
        return numberMedicalCard;
    }

    public void setNumberMedicalCard(int numberMedicalCard) {
        this.numberMedicalCard = numberMedicalCard;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", adress='" + adress + '\'' +
                ", phone='" + phone + '\'' +
                ", numberMedicalCard=" + numberMedicalCard +
                ", diagnosis='" + diagnosis + '\'' +
                '}';
    }
}
