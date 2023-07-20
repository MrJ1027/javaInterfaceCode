package com.jtl.chapter10.interface_;

public class Interface01 {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Computer computer = new Computer();
        computer.work(phone);
    }
}
