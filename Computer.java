package com.jtl.chapter10.interface_;

public class Computer {
    public void work(Usb usbInterface){
        usbInterface.start();
        usbInterface.end();
    }
}
