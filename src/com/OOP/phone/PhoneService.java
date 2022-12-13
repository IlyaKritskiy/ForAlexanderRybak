package com.OOP.phone;

import java.util.Arrays;

public class PhoneService {

    public void receiveCall(String name){
        System.out.println("Call " + name);
    }

    public void receiveCall(String name, Phone phone){
        System.out.println("Call " + name + "to Phone " + phone.getNumber());
    }

    public void sendMessage(Phone... phones){
        for (Phone phone: phones) {
            System.out.println(phone.getNumber());
        }
    }
}
