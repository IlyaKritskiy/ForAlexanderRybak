package com.OOP.phone;

public class Main {

    public static void main(String[] args) {
        Phone firstPhone = new Phone("3647527364", "iPhone", 1.3);
        Phone secondPhone = new Phone("23546234", "Sumsung", 2.1);
        Phone thirdPhone = new Phone("23468736822", "Dir", 1.7);

        System.out.println(firstPhone);
        System.out.println(secondPhone);
        System.out.println(thirdPhone);

        PhoneService phoneService = new PhoneService();
        phoneService.receiveCall("erhbhj");
        phoneService.receiveCall("ereferuf", firstPhone);
        phoneService.sendMessage(firstPhone, secondPhone, thirdPhone);
    }
}
