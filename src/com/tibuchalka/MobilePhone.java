package com.tibuchalka;

public class MobilePhone  implements ITelephone {

    private int myNumber;
    private boolean isRinging;
    private boolean is0n = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        is0n = true;
        System.out.println("Mobile phone powered up");

    }

    @Override
    public void dial(int phoneNumber) {
        if(is0n) {
            System.out.println("Now ringing " + phoneNumber + " on deskphone");
        } else {
            System.out.println("Phone is switched off");
        }
    }

    @Override
    public void answer() {
        System.out.println("Answering the mobile phone");
        isRinging = false;

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber && is0n) {
            isRinging = true;
            System.out.println("Melody ring");
        } else {
            isRinging = false;
            System.out.println("Mobile phone not on or number different");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}

