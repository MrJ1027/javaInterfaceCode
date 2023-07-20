package com.jtl.chapter10.interface_;

public class Phone implements Usb{
    @Override
    public void start() {
        System.out.println("Phone is working");
    }

    @Override
    public void end() {
        System.out.println("Phone is stopping");
    }
}
