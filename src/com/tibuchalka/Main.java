package com.tibuchalka;

public class Main {
    public static void main(String[] args) {
        ITelephone bettysPhone;
        bettysPhone = new DeskPhone(123456);
        bettysPhone.powerOn();
        bettysPhone.callPhone(123456);
        bettysPhone.answer();

        bettysPhone = new MobilePhone(24565);
        bettysPhone.callPhone(24565);
        bettysPhone.answer();
    }
}