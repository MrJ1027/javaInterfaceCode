package com.jtl.chapter10.interface_;

public class InterfacePolyArr {
    public static void main(String[] args) {
        Usb02[] usb02s = new Usb02[2];
        usb02s[0] = new Phone_();
        usb02s[1] = new Camera_();
        for (int i = 0; i < usb02s.length; i++) {
            usb02s[i].work();
            if(usb02s[i] instanceof Phone_){//判断运行类型是不是Phone_
                ((Phone_) usb02s[0]).call();//向下转型
            }
        }

    }
}

interface Usb02{
    void work();
}

class Phone_ implements Usb02{
    @Override
    public void work() {
        System.out.println("Phone is working");
    }
    public void call(){
        System.out.println("Phone is calling");
    }
}

class Camera_ implements Usb02{
    @Override
    public void work() {
        System.out.println("Camera is working");
    }

}